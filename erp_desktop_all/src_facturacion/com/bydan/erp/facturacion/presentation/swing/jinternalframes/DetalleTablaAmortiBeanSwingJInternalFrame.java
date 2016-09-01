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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;




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

import com.bydan.erp.facturacion.util.DetalleTablaAmortiConstantesFunciones;
import com.bydan.erp.facturacion.util.DetalleTablaAmortiParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.DetalleTablaAmortiParameterGeneral;
//import com.bydan.erp.facturacion.presentation.report.source.DetalleTablaAmortiBean;
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

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.facturacion.resources.reportes.AuxiliarReportes;


import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.facturacion.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.facturacion.business.entity.*;
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


import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;

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
public class DetalleTablaAmortiBeanSwingJInternalFrame extends DetalleTablaAmortiJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(DetalleTablaAmortiBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<DetalleTablaAmorti> detalletablaamortiValidator = new ClassValidator<DetalleTablaAmorti>(DetalleTablaAmorti.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public DetalleTablaAmorti detalletablaamorti;	
	public DetalleTablaAmorti detalletablaamortiAux;
	public DetalleTablaAmorti detalletablaamortiAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public DetalleTablaAmorti detalletablaamortiTotales;
	public Long idDetalleTablaAmortiActual;
	public Long iIdNuevoDetalleTablaAmorti=0L;
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

	public String sFinalQueryComboTablaAmorti="";

	public List<TablaAmorti> tablaamortisForeignKey;

	public List<TablaAmorti> gettablaamortisForeignKey() {
		return tablaamortisForeignKey;
	}

	public void settablaamortisForeignKey(List<TablaAmorti> tablaamortisForeignKey) {
		this.tablaamortisForeignKey = tablaamortisForeignKey;
	}

	//OBJETO FK ACTUAL
	public TablaAmorti tablaamortiForeignKey;

	public TablaAmorti gettablaamortiForeignKey() {
		return tablaamortiForeignKey;
	}

	public void settablaamortiForeignKey(TablaAmorti tablaamortiForeignKey) {
		this.tablaamortiForeignKey = tablaamortiForeignKey;
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
	
	public Boolean isPermisoTodoDetalleTablaAmorti;
	public Boolean isPermisoNuevoDetalleTablaAmorti;
	public Boolean isPermisoActualizarDetalleTablaAmorti;
	public Boolean isPermisoActualizarOriginalDetalleTablaAmorti;
	public Boolean isPermisoEliminarDetalleTablaAmorti;
	public Boolean isPermisoGuardarCambiosDetalleTablaAmorti;
	public Boolean isPermisoConsultaDetalleTablaAmorti;
	public Boolean isPermisoBusquedaDetalleTablaAmorti;
	public Boolean isPermisoReporteDetalleTablaAmorti;
	public Boolean isPermisoPaginacionMedioDetalleTablaAmorti;
	public Boolean isPermisoPaginacionAltoDetalleTablaAmorti;
	public Boolean isPermisoPaginacionTodoDetalleTablaAmorti;
	public Boolean isPermisoCopiarDetalleTablaAmorti;
	public Boolean isPermisoVerFormDetalleTablaAmorti;
	public Boolean isPermisoDuplicarDetalleTablaAmorti;
	public Boolean isPermisoOrdenDetalleTablaAmorti;
	
	
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
	
	public DetalleTablaAmortiParameterReturnGeneral detalletablaamortiReturnGeneral;
	public DetalleTablaAmortiParameterReturnGeneral detalletablaamortiParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoDetalleTablaAmorti=false;
	public Boolean esParaAccionDesdeFormularioDetalleTablaAmorti=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected DetalleTablaAmortiSessionBeanAdditional detalletablaamortiSessionBeanAdditional=null;
	
	public DetalleTablaAmortiSessionBeanAdditional getDetalleTablaAmortiSessionBeanAdditional() {
		return this.detalletablaamortiSessionBeanAdditional;
	}
	
	public void setDetalleTablaAmortiSessionBeanAdditional(DetalleTablaAmortiSessionBeanAdditional detalletablaamortiSessionBeanAdditional) {
		try {
			this.detalletablaamortiSessionBeanAdditional=detalletablaamortiSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected DetalleTablaAmortiBeanSwingJInternalFrameAdditional detalletablaamortiBeanSwingJInternalFrameAdditional=null;
	//public class DetalleTablaAmortiBeanSwingJInternalFrame
	
	public DetalleTablaAmortiBeanSwingJInternalFrameAdditional getDetalleTablaAmortiBeanSwingJInternalFrameAdditional() {
		return this.detalletablaamortiBeanSwingJInternalFrameAdditional;
	}
	
	public void setDetalleTablaAmortiBeanSwingJInternalFrameAdditional(DetalleTablaAmortiBeanSwingJInternalFrameAdditional detalletablaamortiBeanSwingJInternalFrameAdditional) {
		try {
			this.detalletablaamortiBeanSwingJInternalFrameAdditional=detalletablaamortiBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public DetalleTablaAmortiLogic detalletablaamortiLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public DetalleTablaAmorti detalletablaamortiBean;
	public DetalleTablaAmortiConstantesFunciones detalletablaamortiConstantesFunciones;
	//public DetalleTablaAmortiParameterReturnGeneral detalletablaamortiReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public EjercicioLogic ejercicioLogic;
	public PeriodoLogic periodoLogic;
	public TablaAmortiLogic tablaamortiLogic;
	public AnioLogic anioLogic;
	public MesLogic mesLogic;
	
	//PARAMETROS
	
	
	//public List<DetalleTablaAmorti> detalletablaamortis;	
	//public List<DetalleTablaAmorti> detalletablaamortisEliminados;
	//public List<DetalleTablaAmorti> detalletablaamortisAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoDetalleTablaAmorti=false;
	public Boolean isVisibilidadCeldaDuplicarDetalleTablaAmorti=true;
	public Boolean isVisibilidadCeldaCopiarDetalleTablaAmorti=true;
	public Boolean isVisibilidadCeldaVerFormDetalleTablaAmorti=true;
	public Boolean isVisibilidadCeldaOrdenDetalleTablaAmorti=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesDetalleTablaAmorti=false;
	public Boolean isVisibilidadCeldaModificarDetalleTablaAmorti=false;
	public Boolean isVisibilidadCeldaActualizarDetalleTablaAmorti=false;
	public Boolean isVisibilidadCeldaEliminarDetalleTablaAmorti=false;
	public Boolean isVisibilidadCeldaCancelarDetalleTablaAmorti=false;
	public Boolean isVisibilidadCeldaGuardarDetalleTablaAmorti=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosDetalleTablaAmorti=false;	
	
	
	public Boolean isVisibilidadFK_IdAnio=false;
	public Boolean isVisibilidadFK_IdEjercicio=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdMes=false;
	public Boolean isVisibilidadFK_IdPeriodo=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdTablaAmorti=false;
	
	public Long getiIdNuevoDetalleTablaAmorti() {
		return this.iIdNuevoDetalleTablaAmorti;
	}

	public void setiIdNuevoDetalleTablaAmorti(Long iIdNuevoDetalleTablaAmorti) {
		this.iIdNuevoDetalleTablaAmorti = iIdNuevoDetalleTablaAmorti;
	}
	
	public Long getidDetalleTablaAmortiActual() {
		return this.idDetalleTablaAmortiActual;
	}

	public void setidDetalleTablaAmortiActual(Long idDetalleTablaAmortiActual) {
		this.idDetalleTablaAmortiActual = idDetalleTablaAmortiActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public DetalleTablaAmorti getdetalletablaamorti() {
		return this.detalletablaamorti;
	}

	public void setdetalletablaamorti(DetalleTablaAmorti detalletablaamorti) {
		this.detalletablaamorti = detalletablaamorti;
	}
	
	public DetalleTablaAmorti getdetalletablaamortiAux() {
		return this.detalletablaamortiAux;
	}

	public void setdetalletablaamortiAux(DetalleTablaAmorti detalletablaamortiAux) {
		this.detalletablaamortiAux = detalletablaamortiAux;
	}				
	
	public DetalleTablaAmorti getdetalletablaamortiAnterior() {
		return this.detalletablaamortiAnterior;
	}

	public void setdetalletablaamortiAnterior(DetalleTablaAmorti detalletablaamortiAnterior) {
		this.detalletablaamortiAnterior = detalletablaamortiAnterior;
	}	
	
	public DetalleTablaAmorti getdetalletablaamortiTotales() {
		return this.detalletablaamortiTotales;
	}

	public void setdetalletablaamortiTotales(DetalleTablaAmorti detalletablaamortiTotales) {
		this.detalletablaamortiTotales = detalletablaamortiTotales;
	}	
	
	public DetalleTablaAmorti getdetalletablaamortiBean() {
		return this.detalletablaamortiBean;
	}

	public void setdetalletablaamortiBean(DetalleTablaAmorti detalletablaamortiBean) {
		this.detalletablaamortiBean = detalletablaamortiBean;
	}	
	
	public DetalleTablaAmortiParameterReturnGeneral getdetalletablaamortiReturnGeneral() {
		return this.detalletablaamortiReturnGeneral;
	}

	public void setdetalletablaamortiReturnGeneral(DetalleTablaAmortiParameterReturnGeneral detalletablaamortiReturnGeneral) {
		this.detalletablaamortiReturnGeneral = detalletablaamortiReturnGeneral;
	}	
	
	
	public Long id_anioFK_IdAnio=null;

	public Long getid_anioFK_IdAnio() {
		return this.id_anioFK_IdAnio;
	}

	public void setid_anioFK_IdAnio(Long id_anioFK_IdAnio) {
		this.id_anioFK_IdAnio = id_anioFK_IdAnio;
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

	public Long id_mesFK_IdMes=null;

	public Long getid_mesFK_IdMes() {
		return this.id_mesFK_IdMes;
	}

	public void setid_mesFK_IdMes(Long id_mesFK_IdMes) {
		this.id_mesFK_IdMes = id_mesFK_IdMes;
	}

	public Long id_periodoFK_IdPeriodo=-1L;

	public Long getid_periodoFK_IdPeriodo() {
		return this.id_periodoFK_IdPeriodo;
	}

	public void setid_periodoFK_IdPeriodo(Long id_periodoFK_IdPeriodo) {
		this.id_periodoFK_IdPeriodo = id_periodoFK_IdPeriodo;
	}

	public Long id_sucursalFK_IdSucursal=-1L;

	public Long getid_sucursalFK_IdSucursal() {
		return this.id_sucursalFK_IdSucursal;
	}

	public void setid_sucursalFK_IdSucursal(Long id_sucursalFK_IdSucursal) {
		this.id_sucursalFK_IdSucursal = id_sucursalFK_IdSucursal;
	}

	public Long id_tabla_amortiFK_IdTablaAmorti=-1L;

	public Long getid_tabla_amortiFK_IdTablaAmorti() {
		return this.id_tabla_amortiFK_IdTablaAmorti;
	}

	public void setid_tabla_amortiFK_IdTablaAmorti(Long id_tabla_amortiFK_IdTablaAmorti) {
		this.id_tabla_amortiFK_IdTablaAmorti = id_tabla_amortiFK_IdTablaAmorti;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public DetalleTablaAmortiLogic getDetalleTablaAmortiLogic()	{		
		return detalletablaamortiLogic;
	}

	public void setDetalleTablaAmortiLogic(DetalleTablaAmortiLogic detalletablaamortiLogic) {
		this.detalletablaamortiLogic = detalletablaamortiLogic;
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
	
	public Boolean getIsEsNuevoDetalleTablaAmorti() {
		return isEsNuevoDetalleTablaAmorti;
	}

	public void setIsEsNuevoDetalleTablaAmorti(Boolean isEsNuevoDetalleTablaAmorti) {
		this.isEsNuevoDetalleTablaAmorti = isEsNuevoDetalleTablaAmorti;
	}

	public Boolean getEsParaAccionDesdeFormularioDetalleTablaAmorti() {
		return esParaAccionDesdeFormularioDetalleTablaAmorti;
	}
	
	public void setEsParaAccionDesdeFormularioDetalleTablaAmorti(Boolean esParaAccionDesdeFormularioDetalleTablaAmorti) {
		this.esParaAccionDesdeFormularioDetalleTablaAmorti = esParaAccionDesdeFormularioDetalleTablaAmorti;
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

			if(this.detalletablaamortiSessionBean==null) {
				this.detalletablaamortiSessionBean=new DetalleTablaAmortiSessionBean();
			}

			if(!this.detalletablaamortiSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(detalletablaamortiSessionBean.getlidEmpresaActual());
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

			if(this.detalletablaamortiSessionBean==null) {
				this.detalletablaamortiSessionBean=new DetalleTablaAmortiSessionBean();
			}

			if(!this.detalletablaamortiSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(detalletablaamortiSessionBean.getlidSucursalActual());
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

			if(this.detalletablaamortiSessionBean==null) {
				this.detalletablaamortiSessionBean=new DetalleTablaAmortiSessionBean();
			}

			if(!this.detalletablaamortiSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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
					ejercicioLogic.getEntityWithConnection(detalletablaamortiSessionBean.getlidEjercicioActual());
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

			if(this.detalletablaamortiSessionBean==null) {
				this.detalletablaamortiSessionBean=new DetalleTablaAmortiSessionBean();
			}

			if(!this.detalletablaamortiSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
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
					periodoLogic.getEntityWithConnection(detalletablaamortiSessionBean.getlidPeriodoActual());
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

	public void cargarCombosTablaAmortisForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tablaamortisForeignKey=new ArrayList<TablaAmorti>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TablaAmortiLogic tablaamortiLogic=new TablaAmortiLogic();

			//tablaamortiLogic.getTablaAmortiDataAccess().setIsForForeingKeyData(true);

			if(this.detalletablaamortiSessionBean==null) {
				this.detalletablaamortiSessionBean=new DetalleTablaAmortiSessionBean();
			}

			if(!this.detalletablaamortiSessionBean.getisBusquedaDesdeForeignKeySesionTablaAmorti()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tablaamortiLogic.getTablaAmortiDataAccess().setIsForForeingKeyData(true);

					tablaamortiLogic.getTodosTablaAmortisWithConnection(sFinalQuery,new Pagination());

					this.tablaamortisForeignKey=tablaamortiLogic.getTablaAmortis();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTablaAmorti(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tablaamortiLogic.getEntityWithConnection(detalletablaamortiSessionBean.getlidTablaAmortiActual());
					this.tablaamortisForeignKey.add(tablaamortiLogic.getTablaAmorti());
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

			if(this.detalletablaamortiSessionBean==null) {
				this.detalletablaamortiSessionBean=new DetalleTablaAmortiSessionBean();
			}

			if(!this.detalletablaamortiSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
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
					anioLogic.getEntityWithConnection(detalletablaamortiSessionBean.getlidAnioActual());
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

			//mesLogic.getMesDataAccess().setIsForForeingKeyData(true);

			if(this.detalletablaamortiSessionBean==null) {
				this.detalletablaamortiSessionBean=new DetalleTablaAmortiSessionBean();
			}

			if(!this.detalletablaamortiSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//mesLogic.getMesDataAccess().setIsForForeingKeyData(true);

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
					mesLogic.getEntityWithConnection(detalletablaamortiSessionBean.getlidMesActual());
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

					if(this.detalletablaamorti!=null) {
						this.detalletablaamorti.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) {
						this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_empresaDetalleTablaAmorti.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaDetalleTablaAmorti.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) {
						if(this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_empresaDetalleTablaAmorti.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_empresaDetalleTablaAmorti.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaDetalleTablaAmortiGenerico)throws Exception
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
				jComboBoxid_empresaDetalleTablaAmortiGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaDetalleTablaAmortiGenerico!=null && jComboBoxid_empresaDetalleTablaAmortiGenerico.getItemCount()>0) {
					jComboBoxid_empresaDetalleTablaAmortiGenerico.setSelectedIndex(0);
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

					if(this.detalletablaamorti!=null) {
						this.detalletablaamorti.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) {
						this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_sucursalDetalleTablaAmorti.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalDetalleTablaAmorti.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) {
						if(this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_sucursalDetalleTablaAmorti.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_sucursalDetalleTablaAmorti.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalDetalleTablaAmortiGenerico)throws Exception
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
				jComboBoxid_sucursalDetalleTablaAmortiGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalDetalleTablaAmortiGenerico!=null && jComboBoxid_sucursalDetalleTablaAmortiGenerico.getItemCount()>0) {
					jComboBoxid_sucursalDetalleTablaAmortiGenerico.setSelectedIndex(0);
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

					if(this.detalletablaamorti!=null) {
						this.detalletablaamorti.setEjercicio(ejercicioTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) {
						this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_ejercicioDetalleTablaAmorti.setSelectedItem(ejercicioTemp);
					}
				} else {
					//jComboBoxid_ejercicioDetalleTablaAmorti.setSelectedItem(ejercicioTemp);
					if(this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) {
						if(this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_ejercicioDetalleTablaAmorti.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_ejercicioDetalleTablaAmorti.setSelectedIndex(0);
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
	public void setActualEjercicioForeignKeyGenerico(Long idEjercicioSeleccionado,JComboBox jComboBoxid_ejercicioDetalleTablaAmortiGenerico)throws Exception
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
				jComboBoxid_ejercicioDetalleTablaAmortiGenerico.setSelectedItem(ejercicioTemp);
			} else {
				if(jComboBoxid_ejercicioDetalleTablaAmortiGenerico!=null && jComboBoxid_ejercicioDetalleTablaAmortiGenerico.getItemCount()>0) {
					jComboBoxid_ejercicioDetalleTablaAmortiGenerico.setSelectedIndex(0);
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

					if(this.detalletablaamorti!=null) {
						this.detalletablaamorti.setPeriodo(periodoTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) {
						this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_periodoDetalleTablaAmorti.setSelectedItem(periodoTemp);
					}
				} else {
					//jComboBoxid_periodoDetalleTablaAmorti.setSelectedItem(periodoTemp);
					if(this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) {
						if(this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_periodoDetalleTablaAmorti.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_periodoDetalleTablaAmorti.setSelectedIndex(0);
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
	public void setActualPeriodoForeignKeyGenerico(Long idPeriodoSeleccionado,JComboBox jComboBoxid_periodoDetalleTablaAmortiGenerico)throws Exception
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
				jComboBoxid_periodoDetalleTablaAmortiGenerico.setSelectedItem(periodoTemp);
			} else {
				if(jComboBoxid_periodoDetalleTablaAmortiGenerico!=null && jComboBoxid_periodoDetalleTablaAmortiGenerico.getItemCount()>0) {
					jComboBoxid_periodoDetalleTablaAmortiGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTablaAmortiForeignKey(Long idTablaAmortiSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TablaAmorti  tablaamortiTemp=null;

			for(TablaAmorti tablaamortiAux:tablaamortisForeignKey) {
				if(tablaamortiAux.getId()!=null && tablaamortiAux.getId().equals(idTablaAmortiSeleccionado)) {
					tablaamortiTemp=tablaamortiAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tablaamortiTemp!=null) {

					if(this.detalletablaamorti!=null) {
						this.detalletablaamorti.setTablaAmorti(tablaamortiTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) {
						this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_tabla_amortiDetalleTablaAmorti.setSelectedItem(tablaamortiTemp);
					}
				} else {
					//jComboBoxid_tabla_amortiDetalleTablaAmorti.setSelectedItem(tablaamortiTemp);
					if(this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) {
						if(this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_tabla_amortiDetalleTablaAmorti.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_tabla_amortiDetalleTablaAmorti.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTablaAmorti") || sFormularioTipoBusqueda.equals("Todos")){
					if(tablaamortiTemp!=null && jComboBoxid_tabla_amortiFK_IdTablaAmortiDetalleTablaAmorti!=null) {
						jComboBoxid_tabla_amortiFK_IdTablaAmortiDetalleTablaAmorti.setSelectedItem(tablaamortiTemp);
					} else {
						if(jComboBoxid_tabla_amortiFK_IdTablaAmortiDetalleTablaAmorti!=null) {
							//jComboBoxid_tabla_amortiFK_IdTablaAmortiDetalleTablaAmorti.setSelectedItem(tablaamortiTemp);
							if(jComboBoxid_tabla_amortiFK_IdTablaAmortiDetalleTablaAmorti.getItemCount()>0) {
								jComboBoxid_tabla_amortiFK_IdTablaAmortiDetalleTablaAmorti.setSelectedIndex(0);
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

	public String getActualTablaAmortiForeignKeyDescripcion(Long idTablaAmortiSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TablaAmorti  tablaamortiTemp=null;

			for(TablaAmorti tablaamortiAux:tablaamortisForeignKey) {
				if(tablaamortiAux.getId()!=null && tablaamortiAux.getId().equals(idTablaAmortiSeleccionado)) {
					tablaamortiTemp=tablaamortiAux;
					break;
				}
			}


			sDescripcion=TablaAmortiConstantesFunciones.getTablaAmortiDescripcion(tablaamortiTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTablaAmortiForeignKeyGenerico(Long idTablaAmortiSeleccionado,JComboBox jComboBoxid_tabla_amortiDetalleTablaAmortiGenerico)throws Exception
	{
		try
		{
			TablaAmorti  tablaamortiTemp=null;

			for(TablaAmorti tablaamortiAux:tablaamortisForeignKey) {
				if(tablaamortiAux.getId()!=null && tablaamortiAux.getId().equals(idTablaAmortiSeleccionado)) {
					tablaamortiTemp=tablaamortiAux;
					break;
				}
			}

			if(tablaamortiTemp!=null) {
				jComboBoxid_tabla_amortiDetalleTablaAmortiGenerico.setSelectedItem(tablaamortiTemp);
			} else {
				if(jComboBoxid_tabla_amortiDetalleTablaAmortiGenerico!=null && jComboBoxid_tabla_amortiDetalleTablaAmortiGenerico.getItemCount()>0) {
					jComboBoxid_tabla_amortiDetalleTablaAmortiGenerico.setSelectedIndex(0);
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

					if(this.detalletablaamorti!=null) {
						this.detalletablaamorti.setAnio(anioTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) {
						this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_anioDetalleTablaAmorti.setSelectedItem(anioTemp);
					}
				} else {
					//jComboBoxid_anioDetalleTablaAmorti.setSelectedItem(anioTemp);
					if(this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) {
						if(this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_anioDetalleTablaAmorti.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_anioDetalleTablaAmorti.setSelectedIndex(0);
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
	public void setActualAnioForeignKeyGenerico(Long idAnioSeleccionado,JComboBox jComboBoxid_anioDetalleTablaAmortiGenerico)throws Exception
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
				jComboBoxid_anioDetalleTablaAmortiGenerico.setSelectedItem(anioTemp);
			} else {
				if(jComboBoxid_anioDetalleTablaAmortiGenerico!=null && jComboBoxid_anioDetalleTablaAmortiGenerico.getItemCount()>0) {
					jComboBoxid_anioDetalleTablaAmortiGenerico.setSelectedIndex(0);
				}
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

					if(this.detalletablaamorti!=null) {
						this.detalletablaamorti.setMes(mesTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) {
						this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_mesDetalleTablaAmorti.setSelectedItem(mesTemp);
					}
				} else {
					//jComboBoxid_mesDetalleTablaAmorti.setSelectedItem(mesTemp);
					if(this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) {
						if(this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_mesDetalleTablaAmorti.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_mesDetalleTablaAmorti.setSelectedIndex(0);
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
	public void setActualMesForeignKeyGenerico(Long idMesSeleccionado,JComboBox jComboBoxid_mesDetalleTablaAmortiGenerico)throws Exception
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
				jComboBoxid_mesDetalleTablaAmortiGenerico.setSelectedItem(mesTemp);
			} else {
				if(jComboBoxid_mesDetalleTablaAmortiGenerico!=null && jComboBoxid_mesDetalleTablaAmortiGenerico.getItemCount()>0) {
					jComboBoxid_mesDetalleTablaAmortiGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(DetalleTablaAmorti detalletablaamorti,JComboBox jComboBoxid_empresaDetalleTablaAmortiGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaDetalleTablaAmortiGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_empresaDetalleTablaAmorti.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaDetalleTablaAmortiGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				detalletablaamorti.setid_empresa(empresaAux.getId());
				detalletablaamorti.setempresa_descripcion(DetalleTablaAmortiConstantesFunciones.getEmpresaDescripcion(empresaAux));
				detalletablaamorti.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(DetalleTablaAmorti detalletablaamorti,JComboBox jComboBoxid_sucursalDetalleTablaAmortiGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalDetalleTablaAmortiGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_sucursalDetalleTablaAmorti.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalDetalleTablaAmortiGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				detalletablaamorti.setid_sucursal(sucursalAux.getId());
				detalletablaamorti.setsucursal_descripcion(DetalleTablaAmortiConstantesFunciones.getSucursalDescripcion(sucursalAux));
				detalletablaamorti.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEjercicioForeignKey(DetalleTablaAmorti detalletablaamorti,JComboBox jComboBoxid_ejercicioDetalleTablaAmortiGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioAux=new Ejercicio();

			if(jComboBoxid_ejercicioDetalleTablaAmortiGenerico==null) {
				ejercicioAux=(Ejercicio)this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_ejercicioDetalleTablaAmorti.getSelectedItem();
			} else {
				ejercicioAux=(Ejercicio)jComboBoxid_ejercicioDetalleTablaAmortiGenerico.getSelectedItem();
			}

			if(ejercicioAux!=null && ejercicioAux.getId()!=null) {
				detalletablaamorti.setid_ejercicio(ejercicioAux.getId());
				detalletablaamorti.setejercicio_descripcion(DetalleTablaAmortiConstantesFunciones.getEjercicioDescripcion(ejercicioAux));
				detalletablaamorti.setEjercicio(ejercicioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPeriodoForeignKey(DetalleTablaAmorti detalletablaamorti,JComboBox jComboBoxid_periodoDetalleTablaAmortiGenerico)throws Exception
	{
		try
		{
			Periodo  periodoAux=new Periodo();

			if(jComboBoxid_periodoDetalleTablaAmortiGenerico==null) {
				periodoAux=(Periodo)this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_periodoDetalleTablaAmorti.getSelectedItem();
			} else {
				periodoAux=(Periodo)jComboBoxid_periodoDetalleTablaAmortiGenerico.getSelectedItem();
			}

			if(periodoAux!=null && periodoAux.getId()!=null) {
				if(periodoAux.getid_estado_periodo().equals(0L)) {
					throw new Exception("Periodo INACTIVO, NO PUEDE GUARDAR LA INFORMACION CONSULTE CON EL ADMINISTRADOR");
				}

				detalletablaamorti.setid_periodo(periodoAux.getId());
				detalletablaamorti.setperiodo_descripcion(DetalleTablaAmortiConstantesFunciones.getPeriodoDescripcion(periodoAux));
				detalletablaamorti.setPeriodo(periodoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTablaAmortiForeignKey(DetalleTablaAmorti detalletablaamorti,JComboBox jComboBoxid_tabla_amortiDetalleTablaAmortiGenerico)throws Exception
	{
		try
		{
			TablaAmorti  tablaamortiAux=new TablaAmorti();

			if(jComboBoxid_tabla_amortiDetalleTablaAmortiGenerico==null) {
				tablaamortiAux=(TablaAmorti)this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_tabla_amortiDetalleTablaAmorti.getSelectedItem();
			} else {
				tablaamortiAux=(TablaAmorti)jComboBoxid_tabla_amortiDetalleTablaAmortiGenerico.getSelectedItem();
			}

			if(tablaamortiAux!=null && tablaamortiAux.getId()!=null) {
				detalletablaamorti.setid_tabla_amorti(tablaamortiAux.getId());
				detalletablaamorti.settablaamorti_descripcion(DetalleTablaAmortiConstantesFunciones.getTablaAmortiDescripcion(tablaamortiAux));
				detalletablaamorti.setTablaAmorti(tablaamortiAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarAnioForeignKey(DetalleTablaAmorti detalletablaamorti,JComboBox jComboBoxid_anioDetalleTablaAmortiGenerico)throws Exception
	{
		try
		{
			Anio  anioAux=new Anio();

			if(jComboBoxid_anioDetalleTablaAmortiGenerico==null) {
				anioAux=(Anio)this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_anioDetalleTablaAmorti.getSelectedItem();
			} else {
				anioAux=(Anio)jComboBoxid_anioDetalleTablaAmortiGenerico.getSelectedItem();
			}

			if(anioAux!=null) {
				detalletablaamorti.setid_anio(anioAux.getId());
				detalletablaamorti.setanio_descripcion(DetalleTablaAmortiConstantesFunciones.getAnioDescripcion(anioAux));
				detalletablaamorti.setAnio(anioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarMesForeignKey(DetalleTablaAmorti detalletablaamorti,JComboBox jComboBoxid_mesDetalleTablaAmortiGenerico)throws Exception
	{
		try
		{
			Mes  mesAux=new Mes();

			if(jComboBoxid_mesDetalleTablaAmortiGenerico==null) {
				mesAux=(Mes)this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_mesDetalleTablaAmorti.getSelectedItem();
			} else {
				mesAux=(Mes)jComboBoxid_mesDetalleTablaAmortiGenerico.getSelectedItem();
			}

			if(mesAux!=null) {
				detalletablaamorti.setid_mes(mesAux.getId());
				detalletablaamorti.setmes_descripcion(DetalleTablaAmortiConstantesFunciones.getMesDescripcion(mesAux));
				detalletablaamorti.setMes(mesAux);			}
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

					if(!DetalleTablaAmortiJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) { 
							this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_empresaDetalleTablaAmorti.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_empresaDetalleTablaAmorti.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) { 
					}

					if(!DetalleTablaAmortiJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DetalleTablaAmortiJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) { 
							this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_sucursalDetalleTablaAmorti.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_sucursalDetalleTablaAmorti.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) { 
					}

					if(!DetalleTablaAmortiJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DetalleTablaAmortiJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) { 
							this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_ejercicioDetalleTablaAmorti.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_ejercicioDetalleTablaAmorti.addItem(ejercicio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) { 
					}

					if(!DetalleTablaAmortiJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


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

					if(!DetalleTablaAmortiJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) { 
							this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_periodoDetalleTablaAmorti.removeAllItems();

							for(Periodo periodo:this.periodosForeignKey) {
								this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_periodoDetalleTablaAmorti.addItem(periodo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) { 
					}

					if(!DetalleTablaAmortiJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTablaAmortisForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTablaAmorti=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DetalleTablaAmortiJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) { 
							this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_tabla_amortiDetalleTablaAmorti.removeAllItems();

							for(TablaAmorti tablaamorti:this.tablaamortisForeignKey) {
								this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_tabla_amortiDetalleTablaAmorti.addItem(tablaamorti);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) { 
					}

					if(!DetalleTablaAmortiJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTablaAmorti") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DetalleTablaAmortiJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tabla_amortiFK_IdTablaAmortiDetalleTablaAmorti.removeAllItems();

							for(TablaAmorti tablaamorti:this.tablaamortisForeignKey) {
								this.jComboBoxid_tabla_amortiFK_IdTablaAmortiDetalleTablaAmorti.addItem(tablaamorti);
							}
						}

						if(!DetalleTablaAmortiJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

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

					if(!DetalleTablaAmortiJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) { 
							this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_anioDetalleTablaAmorti.removeAllItems();

							for(Anio anio:this.aniosForeignKey) {
								this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_anioDetalleTablaAmorti.addItem(anio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) { 
					}

					if(!DetalleTablaAmortiJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameMessForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingMes=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DetalleTablaAmortiJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) { 
							this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_mesDetalleTablaAmorti.removeAllItems();

							for(Mes mes:this.messForeignKey) {
								this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_mesDetalleTablaAmorti.addItem(mes);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) { 
					}

					if(!DetalleTablaAmortiJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) {
							this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_empresaDetalleTablaAmorti.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) {
							this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_empresaDetalleTablaAmorti.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) {
							this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_sucursalDetalleTablaAmorti.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) {
							this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_sucursalDetalleTablaAmorti.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) {
							this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_ejercicioDetalleTablaAmorti.setSelectedItem(ejercicio);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) {
							this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_ejercicioDetalleTablaAmorti.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFramePeriodoForeignKey(Periodo periodo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) {
							this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_periodoDetalleTablaAmorti.setSelectedItem(periodo);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) {
							this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_periodoDetalleTablaAmorti.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameTablaAmortiForeignKey(TablaAmorti tablaamorti,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) {
							this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_tabla_amortiDetalleTablaAmorti.setSelectedItem(tablaamorti);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) {
							this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_tabla_amortiDetalleTablaAmorti.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tabla_amortiFK_IdTablaAmortiDetalleTablaAmorti.setSelectedItem(tablaamorti);
						} else {
							this.jComboBoxid_tabla_amortiFK_IdTablaAmortiDetalleTablaAmorti.setSelectedIndex(iIndexSelected);
						}

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
						if(this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) {
							this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_anioDetalleTablaAmorti.setSelectedItem(anio);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) {
							this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_anioDetalleTablaAmorti.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameMesForeignKey(Mes mes,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) {
							this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_mesDetalleTablaAmorti.setSelectedItem(mes);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) {
							this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_mesDetalleTablaAmorti.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesDetalleTablaAmorti() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			DetalleTablaAmortiConstantesFunciones.refrescarForeignKeysDescripcionesDetalleTablaAmorti(this.detalletablaamortiLogic.getDetalleTablaAmortis());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			DetalleTablaAmortiConstantesFunciones.refrescarForeignKeysDescripcionesDetalleTablaAmorti(this.detalletablaamortis);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Ejercicio.class));
		classes.add(new Classe(Periodo.class));
		classes.add(new Classe(TablaAmorti.class));
		classes.add(new Classe(Anio.class));
		classes.add(new Classe(Mes.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//detalletablaamortiLogic.setDetalleTablaAmortis(this.detalletablaamortis);
			detalletablaamortiLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public DetalleTablaAmortiParameterReturnGeneral getDetalleTablaAmortiParameterGeneral() {
		return this.detalletablaamortiParameterGeneral;
	}
	
	public void setDetalleTablaAmortiParameterGeneral(DetalleTablaAmortiParameterReturnGeneral detalletablaamortiParameterGeneral) {
		this.detalletablaamortiParameterGeneral = detalletablaamortiParameterGeneral;
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
	
	public Boolean getIsPermisoTodoDetalleTablaAmorti() {
		return isPermisoTodoDetalleTablaAmorti;
	}

	public void setIsPermisoTodoDetalleTablaAmorti(Boolean isPermisoTodoDetalleTablaAmorti) {
		this.isPermisoTodoDetalleTablaAmorti = isPermisoTodoDetalleTablaAmorti;
	}

	public Boolean getIsPermisoNuevoDetalleTablaAmorti() {
		return isPermisoNuevoDetalleTablaAmorti;
	}

	public void setIsPermisoNuevoDetalleTablaAmorti(Boolean isPermisoNuevoDetalleTablaAmorti) {
		this.isPermisoNuevoDetalleTablaAmorti = isPermisoNuevoDetalleTablaAmorti;
	}

	public Boolean getIsPermisoActualizarDetalleTablaAmorti() {
		return isPermisoActualizarDetalleTablaAmorti;
	}

	public void setIsPermisoActualizarDetalleTablaAmorti(Boolean isPermisoActualizarDetalleTablaAmorti) {
		this.isPermisoActualizarDetalleTablaAmorti = isPermisoActualizarDetalleTablaAmorti;
	}

	public Boolean getIsPermisoEliminarDetalleTablaAmorti() {
		return isPermisoEliminarDetalleTablaAmorti;
	}

	public void setIsPermisoEliminarDetalleTablaAmorti(Boolean isPermisoEliminarDetalleTablaAmorti) {
		this.isPermisoEliminarDetalleTablaAmorti = isPermisoEliminarDetalleTablaAmorti;
	}

	public Boolean getIsPermisoGuardarCambiosDetalleTablaAmorti() {
		return isPermisoGuardarCambiosDetalleTablaAmorti;
	}

	public void setIsPermisoGuardarCambiosDetalleTablaAmorti(Boolean isPermisoGuardarCambiosDetalleTablaAmorti) {
		this.isPermisoGuardarCambiosDetalleTablaAmorti = isPermisoGuardarCambiosDetalleTablaAmorti;
	}
	
	public Boolean getIsPermisoConsultaDetalleTablaAmorti() {
		return isPermisoConsultaDetalleTablaAmorti;
	}

	public void setIsPermisoConsultaDetalleTablaAmorti(Boolean isPermisoConsultaDetalleTablaAmorti) {
		this.isPermisoConsultaDetalleTablaAmorti = isPermisoConsultaDetalleTablaAmorti;
	}

	public Boolean getIsPermisoBusquedaDetalleTablaAmorti() {
		return isPermisoBusquedaDetalleTablaAmorti;
	}

	public void setIsPermisoBusquedaDetalleTablaAmorti(Boolean isPermisoBusquedaDetalleTablaAmorti) {
		this.isPermisoBusquedaDetalleTablaAmorti = isPermisoBusquedaDetalleTablaAmorti;
	}

	public Boolean getIsPermisoReporteDetalleTablaAmorti() {
		return isPermisoReporteDetalleTablaAmorti;
	}

	public void setIsPermisoReporteDetalleTablaAmorti(Boolean isPermisoReporteDetalleTablaAmorti) {
		this.isPermisoReporteDetalleTablaAmorti = isPermisoReporteDetalleTablaAmorti;
	}
	
	public Boolean getIsPermisoPaginacionMedioDetalleTablaAmorti() {
		return isPermisoPaginacionMedioDetalleTablaAmorti;
	}

	public void setIsPermisoPaginacionMedioDetalleTablaAmorti(Boolean isPermisoPaginacionMedioDetalleTablaAmorti) {
		this.isPermisoPaginacionMedioDetalleTablaAmorti = isPermisoPaginacionMedioDetalleTablaAmorti;
	}
	
	public Boolean getIsPermisoPaginacionTodoDetalleTablaAmorti() {
		return isPermisoPaginacionTodoDetalleTablaAmorti;
	}

	public void setIsPermisoPaginacionTodoDetalleTablaAmorti(Boolean isPermisoPaginacionTodoDetalleTablaAmorti) {
		this.isPermisoPaginacionTodoDetalleTablaAmorti = isPermisoPaginacionTodoDetalleTablaAmorti;
	}
	
	public Boolean getIsPermisoPaginacionAltoDetalleTablaAmorti() {
		return isPermisoPaginacionAltoDetalleTablaAmorti;
	}

	public void setIsPermisoPaginacionAltoDetalleTablaAmorti(Boolean isPermisoPaginacionAltoDetalleTablaAmorti) {
		this.isPermisoPaginacionAltoDetalleTablaAmorti = isPermisoPaginacionAltoDetalleTablaAmorti;
	}
	
	public Boolean getIsPermisoCopiarDetalleTablaAmorti() {
		return isPermisoCopiarDetalleTablaAmorti;
	}

	public void setIsPermisoCopiarDetalleTablaAmorti(Boolean isPermisoCopiarDetalleTablaAmorti) {
		this.isPermisoCopiarDetalleTablaAmorti = isPermisoCopiarDetalleTablaAmorti;
	}
	
	public Boolean getIsPermisoVerFormDetalleTablaAmorti() {
		return isPermisoVerFormDetalleTablaAmorti;
	}

	public void setIsPermisoVerFormDetalleTablaAmorti(Boolean isPermisoVerFormDetalleTablaAmorti) {
		this.isPermisoVerFormDetalleTablaAmorti = isPermisoVerFormDetalleTablaAmorti;
	}
	
	public Boolean getIsPermisoDuplicarDetalleTablaAmorti() {
		return isPermisoDuplicarDetalleTablaAmorti;
	}

	public void setIsPermisoDuplicarDetalleTablaAmorti(Boolean isPermisoDuplicarDetalleTablaAmorti) {
		this.isPermisoDuplicarDetalleTablaAmorti = isPermisoDuplicarDetalleTablaAmorti;
	}
	
	public Boolean getIsPermisoOrdenDetalleTablaAmorti() {
		return isPermisoOrdenDetalleTablaAmorti;
	}

	public void setIsPermisoOrdenDetalleTablaAmorti(Boolean isPermisoOrdenDetalleTablaAmorti) {
		this.isPermisoOrdenDetalleTablaAmorti = isPermisoOrdenDetalleTablaAmorti;
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
	
	public Boolean getIsVisibilidadCeldaNuevoDetalleTablaAmorti() {
		return isVisibilidadCeldaNuevoDetalleTablaAmorti;
	}

	public void setIsVisibilidadCeldaNuevoDetalleTablaAmorti(Boolean isVisibilidadCeldaNuevoDetalleTablaAmorti) {
		this.isVisibilidadCeldaNuevoDetalleTablaAmorti = isVisibilidadCeldaNuevoDetalleTablaAmorti;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarDetalleTablaAmorti() {
		return isVisibilidadCeldaDuplicarDetalleTablaAmorti;
	}

	public void setIsVisibilidadCeldaDuplicarDetalleTablaAmorti(Boolean isVisibilidadCeldaDuplicarDetalleTablaAmorti) {
		this.isVisibilidadCeldaDuplicarDetalleTablaAmorti = isVisibilidadCeldaDuplicarDetalleTablaAmorti;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarDetalleTablaAmorti() {
		return isVisibilidadCeldaCopiarDetalleTablaAmorti;
	}

	public void setIsVisibilidadCeldaCopiarDetalleTablaAmorti(Boolean isVisibilidadCeldaCopiarDetalleTablaAmorti) {
		this.isVisibilidadCeldaCopiarDetalleTablaAmorti = isVisibilidadCeldaCopiarDetalleTablaAmorti;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormDetalleTablaAmorti() {
		return isVisibilidadCeldaVerFormDetalleTablaAmorti;
	}

	public void setIsVisibilidadCeldaVerFormDetalleTablaAmorti(Boolean isVisibilidadCeldaVerFormDetalleTablaAmorti) {
		this.isVisibilidadCeldaVerFormDetalleTablaAmorti = isVisibilidadCeldaVerFormDetalleTablaAmorti;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenDetalleTablaAmorti() {
		return isVisibilidadCeldaOrdenDetalleTablaAmorti;
	}

	public void setIsVisibilidadCeldaOrdenDetalleTablaAmorti(Boolean isVisibilidadCeldaOrdenDetalleTablaAmorti) {
		this.isVisibilidadCeldaOrdenDetalleTablaAmorti = isVisibilidadCeldaOrdenDetalleTablaAmorti;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesDetalleTablaAmorti() {
		return isVisibilidadCeldaNuevoRelacionesDetalleTablaAmorti;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesDetalleTablaAmorti(Boolean isVisibilidadCeldaNuevoRelacionesDetalleTablaAmorti) {
		this.isVisibilidadCeldaNuevoRelacionesDetalleTablaAmorti = isVisibilidadCeldaNuevoRelacionesDetalleTablaAmorti;
	}
	
	public Boolean getIsVisibilidadCeldaModificarDetalleTablaAmorti() {
		return isVisibilidadCeldaModificarDetalleTablaAmorti;
	}

	public void setIsVisibilidadCeldaModificarDetalleTablaAmorti(Boolean isVisibilidadCeldaModificarDetalleTablaAmorti) {
		this.isVisibilidadCeldaModificarDetalleTablaAmorti = isVisibilidadCeldaModificarDetalleTablaAmorti;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarDetalleTablaAmorti() {
		return isVisibilidadCeldaActualizarDetalleTablaAmorti;
	}

	public void setIsVisibilidadCeldaActualizarDetalleTablaAmorti(Boolean isVisibilidadCeldaActualizarDetalleTablaAmorti) {
		this.isVisibilidadCeldaActualizarDetalleTablaAmorti = isVisibilidadCeldaActualizarDetalleTablaAmorti;
	}

	public Boolean getIsVisibilidadCeldaEliminarDetalleTablaAmorti() {
		return isVisibilidadCeldaEliminarDetalleTablaAmorti;
	}

	public void setIsVisibilidadCeldaEliminarDetalleTablaAmorti(Boolean isVisibilidadCeldaEliminarDetalleTablaAmorti) {
		this.isVisibilidadCeldaEliminarDetalleTablaAmorti = isVisibilidadCeldaEliminarDetalleTablaAmorti;
	}

	public Boolean getIsVisibilidadCeldaCancelarDetalleTablaAmorti() {
		return isVisibilidadCeldaCancelarDetalleTablaAmorti;
	}

	public void setIsVisibilidadCeldaCancelarDetalleTablaAmorti(Boolean isVisibilidadCeldaCancelarDetalleTablaAmorti) {
		this.isVisibilidadCeldaCancelarDetalleTablaAmorti = isVisibilidadCeldaCancelarDetalleTablaAmorti;
	}

	public Boolean getIsVisibilidadCeldaGuardarDetalleTablaAmorti() {
		return isVisibilidadCeldaGuardarDetalleTablaAmorti;
	}

	public void setIsVisibilidadCeldaGuardarDetalleTablaAmorti(Boolean isVisibilidadCeldaGuardarDetalleTablaAmorti) {
		this.isVisibilidadCeldaGuardarDetalleTablaAmorti = isVisibilidadCeldaGuardarDetalleTablaAmorti;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosDetalleTablaAmorti() {
		return isVisibilidadCeldaGuardarCambiosDetalleTablaAmorti;
	}

	public void setIsVisibilidadCeldaGuardarCambiosDetalleTablaAmorti(Boolean isVisibilidadCeldaGuardarCambiosDetalleTablaAmorti) {
		this.isVisibilidadCeldaGuardarCambiosDetalleTablaAmorti = isVisibilidadCeldaGuardarCambiosDetalleTablaAmorti;
	}
		
	public DetalleTablaAmortiSessionBean getdetalletablaamortiSessionBean() {
		return this.detalletablaamortiSessionBean;
	}
	
	public void setdetalletablaamortiSessionBean(DetalleTablaAmortiSessionBean detalletablaamortiSessionBean) {
		this.detalletablaamortiSessionBean=detalletablaamortiSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdAnio() {
		return this.isVisibilidadFK_IdAnio;
	}

	public void setisVisibilidadFK_IdAnio(Boolean isVisibilidadFK_IdAnio) {
		this.isVisibilidadFK_IdAnio=isVisibilidadFK_IdAnio;
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

	public Boolean getisVisibilidadFK_IdMes() {
		return this.isVisibilidadFK_IdMes;
	}

	public void setisVisibilidadFK_IdMes(Boolean isVisibilidadFK_IdMes) {
		this.isVisibilidadFK_IdMes=isVisibilidadFK_IdMes;
	}

	public Boolean getisVisibilidadFK_IdPeriodo() {
		return this.isVisibilidadFK_IdPeriodo;
	}

	public void setisVisibilidadFK_IdPeriodo(Boolean isVisibilidadFK_IdPeriodo) {
		this.isVisibilidadFK_IdPeriodo=isVisibilidadFK_IdPeriodo;
	}

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	public Boolean getisVisibilidadFK_IdTablaAmorti() {
		return this.isVisibilidadFK_IdTablaAmorti;
	}

	public void setisVisibilidadFK_IdTablaAmorti(Boolean isVisibilidadFK_IdTablaAmorti) {
		this.isVisibilidadFK_IdTablaAmorti=isVisibilidadFK_IdTablaAmorti;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysDetalleTablaAmorti(DetalleTablaAmorti detalletablaamorti)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(detalletablaamorti,null);
				this.setActualParaGuardarSucursalForeignKey(detalletablaamorti,null);
				this.setActualParaGuardarEjercicioForeignKey(detalletablaamorti,null);
				this.setActualParaGuardarPeriodoForeignKey(detalletablaamorti,null);
				this.setActualParaGuardarTablaAmortiForeignKey(detalletablaamorti,null);
				this.setActualParaGuardarAnioForeignKey(detalletablaamorti,null);
				this.setActualParaGuardarMesForeignKey(detalletablaamorti,null);
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
	
	public void bugActualizarReferenciaActual(DetalleTablaAmorti detalletablaamorti,DetalleTablaAmorti detalletablaamortiAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalDetalleTablaAmorti(detalletablaamorti);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		detalletablaamortiAux.setId(detalletablaamorti.getId());
		detalletablaamortiAux.setVersionRow(detalletablaamorti.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessDetalleTablaAmorti();
		
			int intSelectedRow = this.jTableDatosDetalleTablaAmorti.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalletablaamorti =(DetalleTablaAmorti) this.detalletablaamortiLogic.getDetalleTablaAmortis().toArray()[this.jTableDatosDetalleTablaAmorti.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.detalletablaamorti =(DetalleTablaAmorti) this.detalletablaamortis.toArray()[this.jTableDatosDetalleTablaAmorti.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(DetalleTablaAmortiJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualDetalleTablaAmorti(this.detalletablaamorti,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleTablaAmorti(this.detalletablaamorti);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = detalletablaamortiValidator.getInvalidValues(this.detalletablaamorti);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			detalletablaamortiLogic.setDatosCliente(datosCliente);
			detalletablaamortiLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				detalletablaamortiAux=new  DetalleTablaAmorti();
				
				detalletablaamortiAux.setIsNew(true);
				detalletablaamortiAux.setIsChanged(true);
				
				detalletablaamortiAux.setDetalleTablaAmortiOriginal(this.detalletablaamorti);
				
				detalletablaamortiAux.setId(this.detalletablaamorti.getId());	
				detalletablaamortiAux.setVersionRow(this.detalletablaamorti.getVersionRow());	
				detalletablaamortiAux.setid_empresa(this.detalletablaamorti.getid_empresa());	
				detalletablaamortiAux.setid_sucursal(this.detalletablaamorti.getid_sucursal());	
				detalletablaamortiAux.setid_ejercicio(this.detalletablaamorti.getid_ejercicio());	
				detalletablaamortiAux.setid_periodo(this.detalletablaamorti.getid_periodo());	
				detalletablaamortiAux.setid_tabla_amorti(this.detalletablaamorti.getid_tabla_amorti());	
				detalletablaamortiAux.setvalor(this.detalletablaamorti.getvalor());	
				detalletablaamortiAux.setinteres(this.detalletablaamorti.getinteres());	
				detalletablaamortiAux.setcapital(this.detalletablaamorti.getcapital());	
				detalletablaamortiAux.setfecha_inicio(this.detalletablaamorti.getfecha_inicio());	
				detalletablaamortiAux.setfecha_fin(this.detalletablaamorti.getfecha_fin());	
				detalletablaamortiAux.setdescripcion(this.detalletablaamorti.getdescripcion());	
				detalletablaamortiAux.setid_anio(this.detalletablaamorti.getid_anio());	
				detalletablaamortiAux.setid_mes(this.detalletablaamorti.getid_mes());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.detalletablaamortiSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.detalletablaamortiSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(detalletablaamortiAux,detalletablaamortiLogic.getDetalleTablaAmortis());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detalletablaamortiAux,detalletablaamortis);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.detalletablaamortiSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.detalletablaamortiSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detalletablaamortiLogic.saveDetalleTablaAmortis();//WithConnection
						//detalletablaamortiLogic.getSetVersionRowDetalleTablaAmortis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.detalletablaamorti,detalletablaamortiAux);
					
					this.refrescarForeignKeysDescripcionesDetalleTablaAmorti();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.detalletablaamortiSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.detalletablaamortiSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								detalletablaamortiLogic.saveDetalleTablaAmortiRelaciones(detalletablaamortiAux);//WithConnection
								//detalletablaamortiLogic.getSetVersionRowDetalleTablaAmortis();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.detalletablaamorti,detalletablaamortiAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.detalletablaamortiSessionBean.getEstaModoGuardarRelaciones() 
									|| this.detalletablaamortiSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(detalletablaamortiAux,detalletablaamortiLogic.getDetalleTablaAmortis());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(detalletablaamortiAux,detalletablaamortis);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.detalletablaamorti,detalletablaamortiAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				detalletablaamortiAux=new  DetalleTablaAmorti();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.detalletablaamortiSessionBean.getEsGuardarRelacionado() 
					|| (this.detalletablaamortiSessionBean.getEsGuardarRelacionado() && this.detalletablaamorti.getId()>=0)) {
						
					detalletablaamortiAux.setIsNew(false);
				}
				
				detalletablaamortiAux.setIsDeleted(false);
			
				detalletablaamortiAux.setId(this.detalletablaamorti.getId());	
				detalletablaamortiAux.setVersionRow(this.detalletablaamorti.getVersionRow());	
				detalletablaamortiAux.setid_empresa(this.detalletablaamorti.getid_empresa());	
				detalletablaamortiAux.setid_sucursal(this.detalletablaamorti.getid_sucursal());	
				detalletablaamortiAux.setid_ejercicio(this.detalletablaamorti.getid_ejercicio());	
				detalletablaamortiAux.setid_periodo(this.detalletablaamorti.getid_periodo());	
				detalletablaamortiAux.setid_tabla_amorti(this.detalletablaamorti.getid_tabla_amorti());	
				detalletablaamortiAux.setvalor(this.detalletablaamorti.getvalor());	
				detalletablaamortiAux.setinteres(this.detalletablaamorti.getinteres());	
				detalletablaamortiAux.setcapital(this.detalletablaamorti.getcapital());	
				detalletablaamortiAux.setfecha_inicio(this.detalletablaamorti.getfecha_inicio());	
				detalletablaamortiAux.setfecha_fin(this.detalletablaamorti.getfecha_fin());	
				detalletablaamortiAux.setdescripcion(this.detalletablaamorti.getdescripcion());	
				detalletablaamortiAux.setid_anio(this.detalletablaamorti.getid_anio());	
				detalletablaamortiAux.setid_mes(this.detalletablaamorti.getid_mes());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(detalletablaamortiAux,detalletablaamortiLogic.getDetalleTablaAmortis());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detalletablaamortiAux,detalletablaamortis);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.detalletablaamortiSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.detalletablaamortiSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detalletablaamortiLogic.saveDetalleTablaAmortis();//WithConnection
						//detalletablaamortiLogic.getSetVersionRowDetalleTablaAmortis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.detalletablaamorti,detalletablaamortiAux);
					
					this.refrescarForeignKeysDescripcionesDetalleTablaAmorti();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.detalletablaamortiSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.detalletablaamortiSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								detalletablaamortiLogic.saveDetalleTablaAmortiRelaciones(detalletablaamortiAux);//WithConnection
								//detalletablaamortiLogic.getSetVersionRowDetalleTablaAmortis();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.detalletablaamorti,detalletablaamortiAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.detalletablaamortiSessionBean.getEstaModoGuardarRelaciones() 
									|| this.detalletablaamortiSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(detalletablaamortiAux,detalletablaamortiLogic.getDetalleTablaAmortis());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(detalletablaamortiAux,detalletablaamortis);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.detalletablaamorti,detalletablaamortiAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				detalletablaamortiAux=new  DetalleTablaAmorti();
				
				detalletablaamortiAux.setIsNew(false);
				detalletablaamortiAux.setIsChanged(false);
				
				detalletablaamortiAux.setIsDeleted(true);
				
				detalletablaamortiAux.setId(this.detalletablaamorti.getId());	
				detalletablaamortiAux.setVersionRow(this.detalletablaamorti.getVersionRow());	
				detalletablaamortiAux.setid_empresa(this.detalletablaamorti.getid_empresa());	
				detalletablaamortiAux.setid_sucursal(this.detalletablaamorti.getid_sucursal());	
				detalletablaamortiAux.setid_ejercicio(this.detalletablaamorti.getid_ejercicio());	
				detalletablaamortiAux.setid_periodo(this.detalletablaamorti.getid_periodo());	
				detalletablaamortiAux.setid_tabla_amorti(this.detalletablaamorti.getid_tabla_amorti());	
				detalletablaamortiAux.setvalor(this.detalletablaamorti.getvalor());	
				detalletablaamortiAux.setinteres(this.detalletablaamorti.getinteres());	
				detalletablaamortiAux.setcapital(this.detalletablaamorti.getcapital());	
				detalletablaamortiAux.setfecha_inicio(this.detalletablaamorti.getfecha_inicio());	
				detalletablaamortiAux.setfecha_fin(this.detalletablaamorti.getfecha_fin());	
				detalletablaamortiAux.setdescripcion(this.detalletablaamorti.getdescripcion());	
				detalletablaamortiAux.setid_anio(this.detalletablaamorti.getid_anio());	
				detalletablaamortiAux.setid_mes(this.detalletablaamorti.getid_mes());	
				
				if(this.detalletablaamortiSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.detalletablaamortiAux.getId()>=0) {	
						this.detalletablaamortisEliminados.add(detalletablaamortiAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(detalletablaamortiAux,detalletablaamortiLogic.getDetalleTablaAmortis());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detalletablaamortiAux,detalletablaamortis);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.detalletablaamortiSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.detalletablaamortiSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detalletablaamortiLogic.saveDetalleTablaAmortis();//WithConnection
						//detalletablaamortiLogic.getSetVersionRowDetalleTablaAmortis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.detalletablaamortiSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.detalletablaamortiSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								detalletablaamortiLogic.saveDetalleTablaAmortiRelaciones(detalletablaamortiAux);//WithConnection
								//detalletablaamortiLogic.getSetVersionRowDetalleTablaAmortis();//WithConnection
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
							if(this.detalletablaamortiSessionBean.getEstaModoGuardarRelaciones() 
								|| this.detalletablaamortiSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(detalletablaamortiAux,detalletablaamortiLogic.getDetalleTablaAmortis());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(detalletablaamortiAux,detalletablaamortis);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalletablaamortiLogic.getDetalleTablaAmortis().addAll(this.detalletablaamortisEliminados);
					
					detalletablaamortiLogic.saveDetalleTablaAmortis();//WithConnection
					//detalletablaamortiLogic.getSetVersionRowDetalleTablaAmortis();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesDetalleTablaAmorti();
				
				this.detalletablaamortisEliminados= new ArrayList<DetalleTablaAmorti>();		
			}
			
			if(this.detalletablaamortiSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalletablaamortiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Detalle Tabla Amorti GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Detalle Tabla Amorti",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.detalletablaamorti=detalletablaamortiAux;
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
      		//this.finishProcessDetalleTablaAmorti();
      	}
		
	}	
	
	public void actualizarRelaciones(DetalleTablaAmorti detalletablaamortiLocal) throws Exception {
		
		if(this.detalletablaamortiSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(DetalleTablaAmorti detalletablaamortiLocal) throws Exception {	
		if(this.detalletablaamortiSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				detalletablaamortiLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				detalletablaamortiLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EjercicioDetalleFormJInternalFrame.class)) {
				EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrameLocal=(EjercicioBeanSwingJInternalFrame) ((EjercicioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ejercicioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEjercicio(ejercicioBeanSwingJInternalFrameLocal.getejercicio(),true);
				ejercicioBeanSwingJInternalFrameLocal.actualizarLista(ejercicioBeanSwingJInternalFrameLocal.ejercicio,this.ejerciciosForeignKey);

				ejercicioBeanSwingJInternalFrameLocal.actualizarRelaciones(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				detalletablaamortiLocal.setEjercicio(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				this.addItemDefectoCombosForeignKeyEjercicio();
				this.cargarCombosFrameEjerciciosForeignKey("Formulario");
				this.setActualEjercicioForeignKey(ejercicioBeanSwingJInternalFrameLocal.ejercicio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(PeriodoDetalleFormJInternalFrame.class)) {
				PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrameLocal=(PeriodoBeanSwingJInternalFrame) ((PeriodoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				periodoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPeriodo(periodoBeanSwingJInternalFrameLocal.getperiodo(),true);
				periodoBeanSwingJInternalFrameLocal.actualizarLista(periodoBeanSwingJInternalFrameLocal.periodo,this.periodosForeignKey);

				periodoBeanSwingJInternalFrameLocal.actualizarRelaciones(periodoBeanSwingJInternalFrameLocal.periodo);

				detalletablaamortiLocal.setPeriodo(periodoBeanSwingJInternalFrameLocal.periodo);

				this.addItemDefectoCombosForeignKeyPeriodo();
				this.cargarCombosFramePeriodosForeignKey("Formulario");
				this.setActualPeriodoForeignKey(periodoBeanSwingJInternalFrameLocal.periodo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TablaAmortiDetalleFormJInternalFrame.class)) {
				TablaAmortiBeanSwingJInternalFrame tablaamortiBeanSwingJInternalFrameLocal=(TablaAmortiBeanSwingJInternalFrame) ((TablaAmortiDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tablaamortiBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTablaAmorti(tablaamortiBeanSwingJInternalFrameLocal.gettablaamorti(),true);
				tablaamortiBeanSwingJInternalFrameLocal.actualizarLista(tablaamortiBeanSwingJInternalFrameLocal.tablaamorti,this.tablaamortisForeignKey);

				tablaamortiBeanSwingJInternalFrameLocal.actualizarRelaciones(tablaamortiBeanSwingJInternalFrameLocal.tablaamorti);

				detalletablaamortiLocal.setTablaAmorti(tablaamortiBeanSwingJInternalFrameLocal.tablaamorti);

				this.addItemDefectoCombosForeignKeyTablaAmorti();
				this.cargarCombosFrameTablaAmortisForeignKey("Formulario");
				this.setActualTablaAmortiForeignKey(tablaamortiBeanSwingJInternalFrameLocal.tablaamorti.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(AnioDetalleFormJInternalFrame.class)) {
				AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrameLocal=(AnioBeanSwingJInternalFrame) ((AnioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				anioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoAnio(anioBeanSwingJInternalFrameLocal.getanio(),true);
				anioBeanSwingJInternalFrameLocal.actualizarLista(anioBeanSwingJInternalFrameLocal.anio,this.aniosForeignKey);

				anioBeanSwingJInternalFrameLocal.actualizarRelaciones(anioBeanSwingJInternalFrameLocal.anio);

				detalletablaamortiLocal.setAnio(anioBeanSwingJInternalFrameLocal.anio);

				this.addItemDefectoCombosForeignKeyAnio();
				this.cargarCombosFrameAniosForeignKey("Formulario");
				this.setActualAnioForeignKey(anioBeanSwingJInternalFrameLocal.anio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(MesDetalleFormJInternalFrame.class)) {
				MesBeanSwingJInternalFrame mesBeanSwingJInternalFrameLocal=(MesBeanSwingJInternalFrame) ((MesDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				mesBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoMes(mesBeanSwingJInternalFrameLocal.getmes(),true);
				mesBeanSwingJInternalFrameLocal.actualizarLista(mesBeanSwingJInternalFrameLocal.mes,this.messForeignKey);

				mesBeanSwingJInternalFrameLocal.actualizarRelaciones(mesBeanSwingJInternalFrameLocal.mes);

				detalletablaamortiLocal.setMes(mesBeanSwingJInternalFrameLocal.mes);

				this.addItemDefectoCombosForeignKeyMes();
				this.cargarCombosFrameMessForeignKey("Formulario");
				this.setActualMesForeignKey(mesBeanSwingJInternalFrameLocal.mes.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarDetalleTablaAmortiActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosDetalleTablaAmorti.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.detalletablaamorti =(DetalleTablaAmorti) this.detalletablaamortiLogic.getDetalleTablaAmortis().toArray()[this.jTableDatosDetalleTablaAmorti.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.detalletablaamorti =(DetalleTablaAmorti) this.detalletablaamortis.toArray()[this.jTableDatosDetalleTablaAmorti.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = detalletablaamortiValidator.getInvalidValues(this.detalletablaamorti);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(DetalleTablaAmorti detalletablaamorti,List<DetalleTablaAmorti> detalletablaamortis) throws Exception {
		try	{		
			DetalleTablaAmortiConstantesFunciones.actualizarLista(detalletablaamorti,detalletablaamortis,this.detalletablaamortiSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(DetalleTablaAmorti detalletablaamorti,List<DetalleTablaAmorti> detalletablaamortis) throws Exception {
		try	{			
			DetalleTablaAmortiConstantesFunciones.actualizarSelectedLista(detalletablaamorti,detalletablaamortis);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<DetalleTablaAmorti> detalletablaamortisLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				detalletablaamortisLocal=this.detalletablaamortiLogic.getDetalleTablaAmortis();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				detalletablaamortisLocal=this.detalletablaamortis;
			}
			//ARCHITECTURE
		
			for(DetalleTablaAmorti detalletablaamortiLocal:detalletablaamortisLocal) {
				if(this.permiteMantenimiento(detalletablaamortiLocal) && detalletablaamortiLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+DetalleTablaAmortiConstantesFunciones.getDetalleTablaAmortiLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(DetalleTablaAmortiConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleTablaAmorti.jLabelid_empresaDetalleTablaAmorti,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleTablaAmortiConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleTablaAmorti.jLabelid_sucursalDetalleTablaAmorti,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleTablaAmortiConstantesFunciones.IDEJERCICIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleTablaAmorti.jLabelid_ejercicioDetalleTablaAmorti,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleTablaAmortiConstantesFunciones.IDPERIODO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleTablaAmorti.jLabelid_periodoDetalleTablaAmorti,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleTablaAmortiConstantesFunciones.IDTABLAAMORTI)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleTablaAmorti.jLabelid_tabla_amortiDetalleTablaAmorti,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleTablaAmortiConstantesFunciones.VALOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleTablaAmorti.jLabelvalorDetalleTablaAmorti,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleTablaAmortiConstantesFunciones.INTERES)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleTablaAmorti.jLabelinteresDetalleTablaAmorti,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleTablaAmortiConstantesFunciones.CAPITAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleTablaAmorti.jLabelcapitalDetalleTablaAmorti,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleTablaAmortiConstantesFunciones.FECHAINICIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleTablaAmorti.jLabelfecha_inicioDetalleTablaAmorti,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleTablaAmortiConstantesFunciones.FECHAFIN)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleTablaAmorti.jLabelfecha_finDetalleTablaAmorti,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleTablaAmortiConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleTablaAmorti.jLabeldescripcionDetalleTablaAmorti,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleTablaAmortiConstantesFunciones.IDANIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleTablaAmorti.jLabelid_anioDetalleTablaAmorti,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleTablaAmortiConstantesFunciones.IDMES)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleTablaAmorti.jLabelid_mesDetalleTablaAmorti,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleTablaAmorti.jLabelid_empresaDetalleTablaAmorti,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleTablaAmorti.jLabelid_sucursalDetalleTablaAmorti,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleTablaAmorti.jLabelid_ejercicioDetalleTablaAmorti,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleTablaAmorti.jLabelid_periodoDetalleTablaAmorti,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleTablaAmorti.jLabelid_tabla_amortiDetalleTablaAmorti,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleTablaAmorti.jLabelvalorDetalleTablaAmorti,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleTablaAmorti.jLabelinteresDetalleTablaAmorti,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleTablaAmorti.jLabelcapitalDetalleTablaAmorti,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleTablaAmorti.jLabelfecha_inicioDetalleTablaAmorti,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleTablaAmorti.jLabelfecha_finDetalleTablaAmorti,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleTablaAmorti.jLabeldescripcionDetalleTablaAmorti,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleTablaAmorti.jLabelid_anioDetalleTablaAmorti,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleTablaAmorti.jLabelid_mesDetalleTablaAmorti,"");
		
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
		this.iIdNuevoDetalleTablaAmorti--;	
		
		
		this.detalletablaamortiAux=new DetalleTablaAmorti();
		
		this.detalletablaamortiAux.setId(this.iIdNuevoDetalleTablaAmorti);
		this.detalletablaamortiAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.detalletablaamortiLogic.getDetalleTablaAmortis().add(this.detalletablaamortiAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.detalletablaamortis.add(this.detalletablaamortiAux);
		}
		//ARCHITECTURE
		
		this.detalletablaamorti=this.detalletablaamortiAux;
		
		if(DetalleTablaAmortiJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioDetalleTablaAmorti(this.detalletablaamorti);
			this.setVariablesObjetoActualToFormularioForeignKeyDetalleTablaAmorti(this.detalletablaamorti);
		}
				
		//this.setDefaultControlesDetalleTablaAmorti();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyDetalleTablaAmorti();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyDetalleTablaAmorti();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyDetalleTablaAmorti();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDetalleTablaAmorti(this.detalletablaamortiBean,this.detalletablaamorti,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysDetalleTablaAmorti(this.detalletablaamorti);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(DetalleTablaAmortiConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.detalletablaamortiSessionBean.getConGuardarRelaciones()) {
			classes=DetalleTablaAmortiConstantesFunciones.getClassesRelationshipsOfDetalleTablaAmorti(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.detalletablaamortiReturnGeneral=detalletablaamortiLogic.procesarEventosDetalleTablaAmortisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.detalletablaamortiLogic.getDetalleTablaAmortis(),this.detalletablaamorti,this.detalletablaamortiParameterGeneral,this.isEsNuevoDetalleTablaAmorti,classes);//this.detalletablaamortiLogic.getDetalleTablaAmorti()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanDetalleTablaAmorti(this.detalletablaamortiReturnGeneral,this.detalletablaamortiBean,false);
		
		if(this.detalletablaamortiReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyDetalleTablaAmorti(this.detalletablaamortiReturnGeneral.getDetalleTablaAmorti());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioDetalleTablaAmorti(this.detalletablaamortiReturnGeneral.getDetalleTablaAmorti());
		}
		
		if(this.detalletablaamortiReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioDetalleTablaAmorti(this.detalletablaamortiReturnGeneral.getDetalleTablaAmorti(),classes);//this.detalletablaamortiBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualDetalleTablaAmorti(this.detalletablaamorti,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyDetalleTablaAmorti();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyDetalleTablaAmorti();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			DetalleTablaAmortiBeanSwingJInternalFrameAdditional.RecargarFormDetalleTablaAmorti(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingDetalleTablaAmorti(false);
						
			if(detalletablaamortiSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(DetalleTablaAmortiJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDetalleTablaAmorti();
			}
			
			this.actualizarVisualTableDatosDetalleTablaAmorti();
			
			this.jTableDatosDetalleTablaAmorti.setRowSelectionInterval(this.getIndiceNuevoDetalleTablaAmorti(), this.getIndiceNuevoDetalleTablaAmorti());
			
			this.seleccionarFilaTablaDetalleTablaAmortiActual();
						
			this.actualizarEstadoCeldasBotonesDetalleTablaAmorti("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesDetalleTablaAmorti(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jTextFieldvalorDetalleTablaAmorti.setEnabled(isHabilitar && this.detalletablaamortiConstantesFunciones.activarvalorDetalleTablaAmorti);
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jTextFieldinteresDetalleTablaAmorti.setEnabled(isHabilitar && this.detalletablaamortiConstantesFunciones.activarinteresDetalleTablaAmorti);
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jTextFieldcapitalDetalleTablaAmorti.setEnabled(isHabilitar && this.detalletablaamortiConstantesFunciones.activarcapitalDetalleTablaAmorti);
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jDateChooserfecha_inicioDetalleTablaAmorti.setEnabled(isHabilitar && this.detalletablaamortiConstantesFunciones.activarfecha_inicioDetalleTablaAmorti);
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jDateChooserfecha_finDetalleTablaAmorti.setEnabled(isHabilitar && this.detalletablaamortiConstantesFunciones.activarfecha_finDetalleTablaAmorti);
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jTextFielddescripcionDetalleTablaAmorti.setEnabled(isHabilitar && this.detalletablaamortiConstantesFunciones.activardescripcionDetalleTablaAmorti);	
		//
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_empresaDetalleTablaAmorti.setEnabled(isHabilitar && this.detalletablaamortiConstantesFunciones.activarid_empresaDetalleTablaAmorti);//
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_sucursalDetalleTablaAmorti.setEnabled(isHabilitar && this.detalletablaamortiConstantesFunciones.activarid_sucursalDetalleTablaAmorti);//
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_ejercicioDetalleTablaAmorti.setEnabled(isHabilitar && this.detalletablaamortiConstantesFunciones.activarid_ejercicioDetalleTablaAmorti);//
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_periodoDetalleTablaAmorti.setEnabled(isHabilitar && this.detalletablaamortiConstantesFunciones.activarid_periodoDetalleTablaAmorti);
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_tabla_amortiDetalleTablaAmorti.setEnabled(isHabilitar && this.detalletablaamortiConstantesFunciones.activarid_tabla_amortiDetalleTablaAmorti);//
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_anioDetalleTablaAmorti.setEnabled(isHabilitar && this.detalletablaamortiConstantesFunciones.activarid_anioDetalleTablaAmorti);//
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_mesDetalleTablaAmorti.setEnabled(isHabilitar && this.detalletablaamortiConstantesFunciones.activarid_mesDetalleTablaAmorti);
	};
	
	public void setDefaultControlesDetalleTablaAmorti() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoDetalleTablaAmorti(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.detalletablaamortiSessionBean.setConGuardarRelaciones(true);			
			this.detalletablaamortiSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormDetalleTablaAmorti.jTabbedPaneRelacionesDetalleTablaAmorti.setVisible(true);
			
					
		} else {
			//this.detalletablaamortiSessionBean.setConGuardarRelaciones(false);			
			this.detalletablaamortiSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormDetalleTablaAmorti.jTabbedPaneRelacionesDetalleTablaAmorti.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoDetalleTablaAmorti() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleTablaAmorti detalletablaamortiAux:this.detalletablaamortiLogic.getDetalleTablaAmortis()) {
				if(detalletablaamortiAux.getId().equals(this.iIdNuevoDetalleTablaAmorti)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleTablaAmorti detalletablaamortiAux:this.detalletablaamortis) {
				if(detalletablaamortiAux.getId().equals(this.iIdNuevoDetalleTablaAmorti)) {
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
	
	public int getIndiceActualDetalleTablaAmorti(DetalleTablaAmorti detalletablaamorti,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleTablaAmorti detalletablaamortiAux:this.detalletablaamortiLogic.getDetalleTablaAmortis()) {
				if(detalletablaamortiAux.getId().equals(detalletablaamorti.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleTablaAmorti detalletablaamortiAux:this.detalletablaamortis) {
				if(detalletablaamortiAux.getId().equals(detalletablaamorti.getId())) {
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
	
	public void setCamposBaseDesdeOriginalDetalleTablaAmorti(DetalleTablaAmorti detalletablaamortiOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleTablaAmorti detalletablaamortiAux:this.detalletablaamortiLogic.getDetalleTablaAmortis()) {
				if(detalletablaamortiAux.getDetalleTablaAmortiOriginal().getId().equals(detalletablaamortiOriginal.getId())) {
					existe=true;
					detalletablaamortiOriginal.setId(detalletablaamortiAux.getId());
					detalletablaamortiOriginal.setVersionRow(detalletablaamortiAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleTablaAmorti detalletablaamortiAux:this.detalletablaamortis) {
				if(detalletablaamortiAux.getDetalleTablaAmortiOriginal().getId().equals(detalletablaamortiOriginal.getId())) {
					existe=true;
					detalletablaamortiOriginal.setId(detalletablaamortiAux.getId());
					detalletablaamortiOriginal.setVersionRow(detalletablaamortiAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosDetalleTablaAmorti(Boolean esParaCancelar) throws Exception {
		detalletablaamortisAux=new ArrayList<DetalleTablaAmorti>();
		detalletablaamortiAux=new DetalleTablaAmorti();
		
		if(!this.detalletablaamortiSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DetalleTablaAmorti detalletablaamortiAux:this.detalletablaamortiLogic.getDetalleTablaAmortis()) {
					if(detalletablaamortiAux.getId()<0) {
						detalletablaamortisAux.add(detalletablaamortiAux);
					}		
				}
				this.iIdNuevoDetalleTablaAmorti=0L;
				this.detalletablaamortiLogic.getDetalleTablaAmortis().removeAll(detalletablaamortisAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetalleTablaAmorti detalletablaamortiAux:this.detalletablaamortis) {
					if(detalletablaamortiAux.getId()<0) {
						detalletablaamortisAux.add(detalletablaamortiAux);
					}		
				}
				this.iIdNuevoDetalleTablaAmorti=0L;
				this.detalletablaamortis.removeAll(detalletablaamortisAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoDetalleTablaAmorti 
					&& this.detalletablaamortiLogic.getDetalleTablaAmortis().size()>0
					) {
					detalletablaamortiAux=this.detalletablaamortiLogic.getDetalleTablaAmortis().get(this.detalletablaamortiLogic.getDetalleTablaAmortis().size() - 1);
				
					if(detalletablaamortiAux.getId()<0) {
						this.detalletablaamortiLogic.getDetalleTablaAmortis().remove(detalletablaamortiAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoDetalleTablaAmorti && this.detalletablaamortis.size()>0) {
					detalletablaamortiAux=this.detalletablaamortis.get(this.detalletablaamortis.size() - 1);
				
					if(detalletablaamortiAux.getId()<0) {
						this.detalletablaamortis.remove(detalletablaamortiAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoDetalleTablaAmorti(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(detalletablaamorti.getId()<0) {
				this.detalletablaamortiLogic.getDetalleTablaAmortis().remove(this.detalletablaamorti);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(detalletablaamorti.getId()<0) {
				this.detalletablaamortis.remove(this.detalletablaamorti);
			}
		}			
	}
	
	public void setEstadosInicialesDetalleTablaAmorti(List<DetalleTablaAmorti> detalletablaamortisAux) throws Exception {
		DetalleTablaAmortiConstantesFunciones.setEstadosInicialesDetalleTablaAmorti(detalletablaamortisAux);
	}
	
	public void setEstadosInicialesDetalleTablaAmorti(DetalleTablaAmorti detalletablaamortiAux) throws Exception {
		DetalleTablaAmortiConstantesFunciones.setEstadosInicialesDetalleTablaAmorti(detalletablaamortiAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarDetalleTablaAmortiActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesDetalleTablaAmorti("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarDetalleTablaAmortiActual()) {
				if(!this.isEsNuevoDetalleTablaAmorti) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesDetalleTablaAmorti("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoDetalleTablaAmorti=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarDetalleTablaAmortiActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Detalle Tabla Amorti ?", "MANTENIMIENTO DE Detalle Tabla Amorti", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesDetalleTablaAmorti("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(DetalleTablaAmorti detalletablaamorti) throws Exception {
		DetalleTablaAmortiConstantesFunciones.seleccionarAsignar(this.detalletablaamorti,detalletablaamorti);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarDetalleTablaAmorti=this.isPermisoActualizarOriginalDetalleTablaAmorti;
			
			
			this.seleccionarAsignar(detalletablaamorti);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			DetalleTablaAmortiConstantesFunciones.quitarEspaciosDetalleTablaAmorti(this.detalletablaamorti,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesDetalleTablaAmorti("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.detalletablaamortiSessionBean.setsFuncionBusquedaRapida(this.detalletablaamortiSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoDetalleTablaAmorti) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosDetalleTablaAmorti(esParaCancelar);				
				this.cancelarNuevoDetalleTablaAmorti(esParaCancelar);								
			}
			
			this.detalletablaamorti=new DetalleTablaAmorti();
			
			this.inicializarDetalleTablaAmorti();
			
			this.actualizarEstadoCeldasBotonesDetalleTablaAmorti("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarDetalleTablaAmorti() throws Exception {
		try {
			DetalleTablaAmortiConstantesFunciones.inicializarDetalleTablaAmorti(this.detalletablaamorti);
			
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
			FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.detalletablaamortiLogic.getDetalleTablaAmortis().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteDetalleTablaAmortis(String sAccionBusqueda,List<DetalleTablaAmorti> detalletablaamortisParaReportes) throws Exception {
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
					sPathReporteFinal="DetalleTablaAmorti"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="DetalleTablaAmortiMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("DetalleTablaAmortiMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="DetalleTablaAmorti"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Detalle Tabla Amortis");		
		parameters.put("busquedapor", DetalleTablaAmortiConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceDetalleTablaAmorti=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			DetalleTablaAmortiConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			DetalleTablaAmortiConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceDetalleTablaAmorti=new JRBeanArrayDataSource(DetalleTablaAmortiJInternalFrame.TraerDetalleTablaAmortiBeans(detalletablaamortisParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceDetalleTablaAmorti);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+DetalleTablaAmortiConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+DetalleTablaAmortiConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(DetalleTablaAmortiBean.TraerDetalleTablaAmortiBeans(detalletablaamortisParaReportes).toArray()));
							
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
				this.generarExcelReporteDetalleTablaAmortis(sAccionBusqueda,sTipoArchivoReporte,detalletablaamortisParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalDetalleTablaAmortis(sAccionBusqueda,sTipoArchivoReporte,detalletablaamortisParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoDetalleTablaAmortiActionPerformed(null);
					//this.generarExcelReporteDetalleTablaAmortis(sAccionBusqueda,sTipoArchivoReporte,detalletablaamortisParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalDetalleTablaAmortis(sAccionBusqueda,sTipoArchivoReporte,detalletablaamortisParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesDetalleTablaAmortis(sAccionBusqueda,sTipoArchivoReporte,detalletablaamortisParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesDetalleTablaAmortis(sAccionBusqueda,sTipoArchivoReporte,detalletablaamortisParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteDetalleTablaAmortis(String sAccionBusqueda,String sTipoArchivoReporte,List<DetalleTablaAmorti> detalletablaamortisParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalletablaamorti";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DetalleTablaAmortis");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDetalleTablaAmorti("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(DetalleTablaAmorti detalletablaamorti : detalletablaamortisParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			DetalleTablaAmortiConstantesFunciones.generarExcelReporteDataDetalleTablaAmorti("NORMAL",row,workbook,detalletablaamorti,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalletablaamortiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Tabla Amorti",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderDetalleTablaAmorti(String sTipo,Row row,Workbook workbook) {
		
		DetalleTablaAmortiConstantesFunciones.generarExcelReporteHeaderDetalleTablaAmorti(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalDetalleTablaAmortis(String sAccionBusqueda,String sTipoArchivoReporte,List<DetalleTablaAmorti> detalletablaamortisParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalletablaamorti_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DetalleTablaAmortis");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(DetalleTablaAmorti detalletablaamorti : detalletablaamortisParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(DetalleTablaAmortiConstantesFunciones.getDetalleTablaAmortiDescripcion(detalletablaamorti));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleTablaAmortiConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleTablaAmortiConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalletablaamorti.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleTablaAmortiConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleTablaAmortiConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalletablaamorti.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleTablaAmortiConstantesFunciones.LABEL_IDEJERCICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleTablaAmortiConstantesFunciones.LABEL_IDEJERCICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalletablaamorti.getejercicio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleTablaAmortiConstantesFunciones.LABEL_IDPERIODO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleTablaAmortiConstantesFunciones.LABEL_IDPERIODO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalletablaamorti.getperiodo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleTablaAmortiConstantesFunciones.LABEL_IDTABLAAMORTI))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleTablaAmortiConstantesFunciones.LABEL_IDTABLAAMORTI);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalletablaamorti.gettablaamorti_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleTablaAmortiConstantesFunciones.LABEL_VALOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleTablaAmortiConstantesFunciones.LABEL_VALOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalletablaamorti.getvalor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleTablaAmortiConstantesFunciones.LABEL_INTERES))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleTablaAmortiConstantesFunciones.LABEL_INTERES);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalletablaamorti.getinteres());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleTablaAmortiConstantesFunciones.LABEL_CAPITAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleTablaAmortiConstantesFunciones.LABEL_CAPITAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalletablaamorti.getcapital());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleTablaAmortiConstantesFunciones.LABEL_FECHAINICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleTablaAmortiConstantesFunciones.LABEL_FECHAINICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalletablaamorti.getfecha_inicio());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleTablaAmortiConstantesFunciones.LABEL_FECHAFIN))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleTablaAmortiConstantesFunciones.LABEL_FECHAFIN);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalletablaamorti.getfecha_fin());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleTablaAmortiConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleTablaAmortiConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalletablaamorti.getdescripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleTablaAmortiConstantesFunciones.LABEL_IDANIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleTablaAmortiConstantesFunciones.LABEL_IDANIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalletablaamorti.getanio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleTablaAmortiConstantesFunciones.LABEL_IDMES))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleTablaAmortiConstantesFunciones.LABEL_IDMES);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalletablaamorti.getmes_descripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalletablaamortiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Tabla Amorti",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesDetalleTablaAmortis(String sAccionBusqueda,String sTipoArchivoReporte,List<DetalleTablaAmorti> detalletablaamortisParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<DetalleTablaAmorti> detalletablaamortisRespaldo=null;
		
		classes=DetalleTablaAmortiConstantesFunciones.getClassesRelationshipsOfDetalleTablaAmorti(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.detalletablaamortiLogic.setDatosCliente(this.datosCliente);
		this.detalletablaamortiLogic.setDatosDeep(this.datosDeep);
		this.detalletablaamortiLogic.setIsConDeep(true);
		
		detalletablaamortisRespaldo=this.detalletablaamortiLogic.getDetalleTablaAmortis();
		
		this.detalletablaamortiLogic.setDetalleTablaAmortis(detalletablaamortisParaReportes);	
		this.detalletablaamortiLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		detalletablaamortisParaReportes=this.detalletablaamortiLogic.getDetalleTablaAmortis();
		this.detalletablaamortiLogic.setDetalleTablaAmortis(detalletablaamortisRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalletablaamorti_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DetalleTablaAmortis");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDetalleTablaAmorti("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(DetalleTablaAmorti detalletablaamorti : detalletablaamortisParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderDetalleTablaAmorti("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			DetalleTablaAmortiConstantesFunciones.generarExcelReporteDataDetalleTablaAmorti("NORMAL",row,workbook,detalletablaamorti,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(DetalleTablaAmortiConstantesFunciones.getDetalleTablaAmortiDescripcion(detalletablaamorti));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalletablaamortiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Tabla Amorti",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoDetalleTablaAmorti.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleTablaAmorti.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoDetalleTablaAmorti.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleTablaAmorti.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessDetalleTablaAmorti() throws Exception {		
		this.startProcessDetalleTablaAmorti(true);
	}
	
	public void startProcessDetalleTablaAmorti(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasDetalleTablaAmorti ,this.jPanelParametrosReportesDetalleTablaAmorti, this.jScrollPanelDatosDetalleTablaAmorti,this.jPanelPaginacionDetalleTablaAmorti, this.jScrollPanelDatosEdicionDetalleTablaAmorti, this.jPanelAccionesDetalleTablaAmorti,this.jPanelAccionesFormularioDetalleTablaAmorti,this.jmenuBarDetalleTablaAmorti,this.jmenuBarDetalleDetalleTablaAmorti,this.jTtoolBarDetalleTablaAmorti,this.jTtoolBarDetalleDetalleTablaAmorti);		
		
		final JTabbedPane jTabbedPaneBusquedasDetalleTablaAmorti=this.jTabbedPaneBusquedasDetalleTablaAmorti; 
		
		final JPanel jPanelParametrosReportesDetalleTablaAmorti=this.jPanelParametrosReportesDetalleTablaAmorti;
		//final JScrollPane jScrollPanelDatosDetalleTablaAmorti=this.jScrollPanelDatosDetalleTablaAmorti;
		final JTable jTableDatosDetalleTablaAmorti=this.jTableDatosDetalleTablaAmorti;		
		final JPanel jPanelPaginacionDetalleTablaAmorti=this.jPanelPaginacionDetalleTablaAmorti;
		//final JScrollPane jScrollPanelDatosEdicionDetalleTablaAmorti=this.jScrollPanelDatosEdicionDetalleTablaAmorti;
		final JPanel jPanelAccionesDetalleTablaAmorti=this.jPanelAccionesDetalleTablaAmorti;
		
		JPanel jPanelCamposAuxiliarDetalleTablaAmorti=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarDetalleTablaAmorti=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) {
			jPanelCamposAuxiliarDetalleTablaAmorti=this.jInternalFrameDetalleFormDetalleTablaAmorti.jPanelCamposDetalleTablaAmorti;
			jPanelAccionesFormularioAuxiliarDetalleTablaAmorti=this.jInternalFrameDetalleFormDetalleTablaAmorti.jPanelAccionesFormularioDetalleTablaAmorti;
		}
		
		final JPanel jPanelCamposDetalleTablaAmorti=jPanelCamposAuxiliarDetalleTablaAmorti;
		final JPanel jPanelAccionesFormularioDetalleTablaAmorti=jPanelAccionesFormularioAuxiliarDetalleTablaAmorti;
		
		
		final JMenuBar jmenuBarDetalleTablaAmorti=this.jmenuBarDetalleTablaAmorti;
		final JToolBar jTtoolBarDetalleTablaAmorti=this.jTtoolBarDetalleTablaAmorti;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarDetalleTablaAmorti=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDetalleTablaAmorti=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) {
			jmenuBarDetalleAuxiliarDetalleTablaAmorti=this.jInternalFrameDetalleFormDetalleTablaAmorti.jmenuBarDetalleDetalleTablaAmorti;
			jTtoolBarDetalleAuxiliarDetalleTablaAmorti=this.jInternalFrameDetalleFormDetalleTablaAmorti.jTtoolBarDetalleDetalleTablaAmorti;
		}
		
		final JMenuBar jmenuBarDetalleDetalleTablaAmorti=jmenuBarDetalleAuxiliarDetalleTablaAmorti;
		final JToolBar jTtoolBarDetalleDetalleTablaAmorti=jTtoolBarDetalleAuxiliarDetalleTablaAmorti;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDetalleTablaAmorti;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDetalleTablaAmorti;
			processRunnable.jTableDatos=jTableDatosDetalleTablaAmorti;
			processRunnable.jPanelCampos=jPanelCamposDetalleTablaAmorti;
			processRunnable.jPanelPaginacion=jPanelPaginacionDetalleTablaAmorti;
			processRunnable.jPanelAcciones=jPanelAccionesDetalleTablaAmorti;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDetalleTablaAmorti;
			
			
			processRunnable.jmenuBar=jmenuBarDetalleTablaAmorti;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDetalleTablaAmorti;
			processRunnable.jTtoolBar=jTtoolBarDetalleTablaAmorti;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDetalleTablaAmorti;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDetalleTablaAmorti ,jPanelParametrosReportesDetalleTablaAmorti,jTableDatosDetalleTablaAmorti, /*jScrollPanelDatosDetalleTablaAmorti,*/jPanelCamposDetalleTablaAmorti,jPanelPaginacionDetalleTablaAmorti, /*jScrollPanelDatosEdicionDetalleTablaAmorti,*/ jPanelAccionesDetalleTablaAmorti,jPanelAccionesFormularioDetalleTablaAmorti,jmenuBarDetalleTablaAmorti,jmenuBarDetalleDetalleTablaAmorti,jTtoolBarDetalleTablaAmorti,jTtoolBarDetalleDetalleTablaAmorti);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDetalleTablaAmorti ,jPanelParametrosReportesDetalleTablaAmorti, jScrollPanelDatosDetalleTablaAmorti,jPanelPaginacionDetalleTablaAmorti, jScrollPanelDatosEdicionDetalleTablaAmorti, jPanelAccionesDetalleTablaAmorti,jPanelAccionesFormularioDetalleTablaAmorti,jmenuBarDetalleTablaAmorti,jmenuBarDetalleDetalleTablaAmorti,jTtoolBarDetalleTablaAmorti,jTtoolBarDetalleDetalleTablaAmorti);
						
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
	
	public void finishProcessDetalleTablaAmorti() {// throws Exception 
		this.finishProcessDetalleTablaAmorti(true);
	}
	
	public void finishProcessDetalleTablaAmorti(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasDetalleTablaAmorti ,this.jPanelParametrosReportesDetalleTablaAmorti, this.jScrollPanelDatosDetalleTablaAmorti,this.jPanelPaginacionDetalleTablaAmorti, this.jScrollPanelDatosEdicionDetalleTablaAmorti, this.jPanelAccionesDetalleTablaAmorti,this.jPanelAccionesFormularioDetalleTablaAmorti,this.jmenuBarDetalleTablaAmorti,this.jmenuBarDetalleDetalleTablaAmorti,this.jTtoolBarDetalleTablaAmorti,this.jTtoolBarDetalleDetalleTablaAmorti);		
		
		final JTabbedPane jTabbedPaneBusquedasDetalleTablaAmorti=this.jTabbedPaneBusquedasDetalleTablaAmorti; 
		
		final JPanel jPanelParametrosReportesDetalleTablaAmorti=this.jPanelParametrosReportesDetalleTablaAmorti;
		//final JScrollPane jScrollPanelDatosDetalleTablaAmorti=this.jScrollPanelDatosDetalleTablaAmorti;
		final JTable jTableDatosDetalleTablaAmorti=this.jTableDatosDetalleTablaAmorti;		
		final JPanel jPanelPaginacionDetalleTablaAmorti=this.jPanelPaginacionDetalleTablaAmorti;
		//final JScrollPane jScrollPanelDatosEdicionDetalleTablaAmorti=this.jScrollPanelDatosEdicionDetalleTablaAmorti;
		final JPanel jPanelAccionesDetalleTablaAmorti=this.jPanelAccionesDetalleTablaAmorti;
		
		JPanel jPanelCamposAuxiliarDetalleTablaAmorti=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarDetalleTablaAmorti=new JPanel();
		
		if(this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) {
			jPanelCamposAuxiliarDetalleTablaAmorti=this.jInternalFrameDetalleFormDetalleTablaAmorti.jPanelCamposDetalleTablaAmorti;
			jPanelAccionesFormularioAuxiliarDetalleTablaAmorti=this.jInternalFrameDetalleFormDetalleTablaAmorti.jPanelAccionesFormularioDetalleTablaAmorti;
		}
		
		final JPanel jPanelCamposDetalleTablaAmorti=jPanelCamposAuxiliarDetalleTablaAmorti;
		final JPanel jPanelAccionesFormularioDetalleTablaAmorti=jPanelAccionesFormularioAuxiliarDetalleTablaAmorti;
		
		
		final JMenuBar jmenuBarDetalleTablaAmorti=this.jmenuBarDetalleTablaAmorti;		
		final JToolBar jTtoolBarDetalleTablaAmorti=this.jTtoolBarDetalleTablaAmorti;
				
		JMenuBar jmenuBarDetalleAuxiliarDetalleTablaAmorti=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDetalleTablaAmorti=new JToolBar();
		
		if(this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) {
			jmenuBarDetalleAuxiliarDetalleTablaAmorti=this.jInternalFrameDetalleFormDetalleTablaAmorti.jmenuBarDetalleDetalleTablaAmorti;
			jTtoolBarDetalleAuxiliarDetalleTablaAmorti=this.jInternalFrameDetalleFormDetalleTablaAmorti.jTtoolBarDetalleDetalleTablaAmorti;		
		}
		
		final JMenuBar jmenuBarDetalleDetalleTablaAmorti=jmenuBarDetalleAuxiliarDetalleTablaAmorti;
		final JToolBar jTtoolBarDetalleDetalleTablaAmorti=jTtoolBarDetalleAuxiliarDetalleTablaAmorti;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDetalleTablaAmorti;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDetalleTablaAmorti;
			processRunnable.jTableDatos=jTableDatosDetalleTablaAmorti;
			processRunnable.jPanelCampos=jPanelCamposDetalleTablaAmorti;
			processRunnable.jPanelPaginacion=jPanelPaginacionDetalleTablaAmorti;
			processRunnable.jPanelAcciones=jPanelAccionesDetalleTablaAmorti;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDetalleTablaAmorti;
			
			
			processRunnable.jmenuBar=jmenuBarDetalleTablaAmorti;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDetalleTablaAmorti;
			processRunnable.jTtoolBar=jTtoolBarDetalleTablaAmorti;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDetalleTablaAmorti;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasDetalleTablaAmorti ,jPanelParametrosReportesDetalleTablaAmorti, jTableDatosDetalleTablaAmorti,/*jScrollPanelDatosDetalleTablaAmorti,*/jPanelCamposDetalleTablaAmorti,jPanelPaginacionDetalleTablaAmorti, /*jScrollPanelDatosEdicionDetalleTablaAmorti,*/ jPanelAccionesDetalleTablaAmorti,jPanelAccionesFormularioDetalleTablaAmorti,jmenuBarDetalleTablaAmorti,jmenuBarDetalleDetalleTablaAmorti,jTtoolBarDetalleTablaAmorti,jTtoolBarDetalleDetalleTablaAmorti));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesDetalleTablaAmorti(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarDetalleTablaAmorti(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuDetalleTablaAmorti(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarDetalleTablaAmorti(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTablaAmorti,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleDetalleTablaAmorti,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuDetalleTablaAmorti(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTablaAmorti,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleDetalleTablaAmorti,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.detalletablaamortiConstantesFunciones.getsFinalQueryDetalleTablaAmorti();
		String  finalQueryPaginacionTodos=this.detalletablaamortiConstantesFunciones.getsFinalQueryDetalleTablaAmorti();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=DetalleTablaAmortiConstantesFunciones.getArrayColumnasGlobalesNoDetalleTablaAmorti(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=DetalleTablaAmortiConstantesFunciones.getArrayColumnasGlobalesDetalleTablaAmorti(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,DetalleTablaAmortiConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.detalletablaamortisEliminados= new ArrayList<DetalleTablaAmorti>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessDetalleTablaAmorti();
		
				///*DetalleTablaAmortiSessionBean*/this.detalletablaamortiSessionBean=new DetalleTablaAmortiSessionBean();
			
			if(this.detalletablaamortiSessionBean==null) {
				this.detalletablaamortiSessionBean=new DetalleTablaAmortiSessionBean();
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
					this.iNumeroPaginacion=DetalleTablaAmortiConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=DetalleTablaAmortiConstantesFunciones.getClassesForeignKeysOfDetalleTablaAmorti(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/detalletablaamorti."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			detalletablaamortisAux= new ArrayList<DetalleTablaAmorti>();
			
				
			detalletablaamortiLogic.setDatosCliente(this.datosCliente);
			detalletablaamortiLogic.setDatosDeep(this.datosDeep);
			detalletablaamortiLogic.setIsConDeep(true);
			
			
			detalletablaamortiLogic.getDetalleTablaAmortiDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					detalletablaamortiLogic.getTodosDetalleTablaAmortis(finalQueryGlobal,pagination);
					
					//detalletablaamortiLogic.getTodosDetalleTablaAmortisWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(detalletablaamortiLogic.getDetalleTablaAmortis()==null|| detalletablaamortiLogic.getDetalleTablaAmortis().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							detalletablaamortisAux= new ArrayList<DetalleTablaAmorti>();
							detalletablaamortisAux.addAll(detalletablaamortiLogic.getDetalleTablaAmortis());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalletablaamortisAux= new ArrayList<DetalleTablaAmorti>();
							detalletablaamortisAux.addAll(detalletablaamortis);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							detalletablaamortiLogic.getTodosDetalleTablaAmortis(finalQueryGlobal+"",this.pagination);												
							
							//detalletablaamortiLogic.getTodosDetalleTablaAmortisWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteDetalleTablaAmortis("Todos",detalletablaamortiLogic.getDetalleTablaAmortis() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							detalletablaamortiLogic.setDetalleTablaAmortis(new ArrayList<DetalleTablaAmorti>());					
							detalletablaamortiLogic.getDetalleTablaAmortis().addAll(detalletablaamortisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalletablaamortis=new ArrayList<DetalleTablaAmorti>();
							detalletablaamortis.addAll(detalletablaamortisAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idDetalleTablaAmorti=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idDetalleTablaAmorti=this.idActual;
				
				} else if(this.idDetalleTablaAmortiActual!=null && this.idDetalleTablaAmortiActual!=0L) {
					idDetalleTablaAmorti=idDetalleTablaAmortiActual;
				}
				
					
				this.sDetalleReporte=DetalleTablaAmortiConstantesFunciones.getDetalleIndicePorId(idDetalleTablaAmorti);
				
				this.detalletablaamortis=new ArrayList<DetalleTablaAmorti>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					detalletablaamortiLogic.getEntity(idDetalleTablaAmorti);
					
					//detalletablaamortiLogic.getEntityWithConnection(idDetalleTablaAmorti);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalletablaamortiLogic.setDetalleTablaAmortis(new ArrayList<DetalleTablaAmorti>());
					detalletablaamortiLogic.getDetalleTablaAmortis().add(detalletablaamortiLogic.getDetalleTablaAmorti());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalletablaamortis=new ArrayList<DetalleTablaAmorti>();
					this.detalletablaamortis.add(detalletablaamorti);
				}
				
				if(detalletablaamortiLogic.getDetalleTablaAmorti()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEjercicio")) {
				this.sDetalleReporte=DetalleTablaAmortiConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detalletablaamortiLogic.getDetalleTablaAmortisFK_IdEjercicio(finalQueryGlobal,pagination,id_ejercicioFK_IdEjercicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleTablaAmortiConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleTablaAmortiConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detalletablaamortiLogic.getDetalleTablaAmortis()==null||detalletablaamortiLogic.getDetalleTablaAmortis().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detalletablaamortis==null|| detalletablaamortis.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detalletablaamortisAux=new ArrayList<DetalleTablaAmorti>();
						detalletablaamortisAux.addAll(detalletablaamortiLogic.getDetalleTablaAmortis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalletablaamortisAux=new ArrayList<DetalleTablaAmorti>();
							detalletablaamortisAux.addAll(detalletablaamortis);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detalletablaamortiLogic.getDetalleTablaAmortisFK_IdEjercicio(finalQueryGlobal,pagination,id_ejercicioFK_IdEjercicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleTablaAmortiConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleTablaAmortiConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleTablaAmortis("FK_IdEjercicio",detalletablaamortiLogic.getDetalleTablaAmortis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleTablaAmortis("FK_IdEjercicio",detalletablaamortis);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detalletablaamortiLogic.setDetalleTablaAmortis(new ArrayList<DetalleTablaAmorti>());
						detalletablaamortiLogic.getDetalleTablaAmortis().addAll(detalletablaamortisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalletablaamortis=new ArrayList<DetalleTablaAmorti>();
							detalletablaamortis.addAll(detalletablaamortisAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=DetalleTablaAmortiConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detalletablaamortiLogic.getDetalleTablaAmortisFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleTablaAmortiConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleTablaAmortiConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detalletablaamortiLogic.getDetalleTablaAmortis()==null||detalletablaamortiLogic.getDetalleTablaAmortis().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detalletablaamortis==null|| detalletablaamortis.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detalletablaamortisAux=new ArrayList<DetalleTablaAmorti>();
						detalletablaamortisAux.addAll(detalletablaamortiLogic.getDetalleTablaAmortis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalletablaamortisAux=new ArrayList<DetalleTablaAmorti>();
							detalletablaamortisAux.addAll(detalletablaamortis);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detalletablaamortiLogic.getDetalleTablaAmortisFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleTablaAmortiConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleTablaAmortiConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleTablaAmortis("FK_IdEmpresa",detalletablaamortiLogic.getDetalleTablaAmortis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleTablaAmortis("FK_IdEmpresa",detalletablaamortis);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detalletablaamortiLogic.setDetalleTablaAmortis(new ArrayList<DetalleTablaAmorti>());
						detalletablaamortiLogic.getDetalleTablaAmortis().addAll(detalletablaamortisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalletablaamortis=new ArrayList<DetalleTablaAmorti>();
							detalletablaamortis.addAll(detalletablaamortisAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdPeriodo")) {
				this.sDetalleReporte=DetalleTablaAmortiConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detalletablaamortiLogic.getDetalleTablaAmortisFK_IdPeriodo(finalQueryGlobal,pagination,id_periodoFK_IdPeriodo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleTablaAmortiConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleTablaAmortiConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detalletablaamortiLogic.getDetalleTablaAmortis()==null||detalletablaamortiLogic.getDetalleTablaAmortis().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detalletablaamortis==null|| detalletablaamortis.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detalletablaamortisAux=new ArrayList<DetalleTablaAmorti>();
						detalletablaamortisAux.addAll(detalletablaamortiLogic.getDetalleTablaAmortis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalletablaamortisAux=new ArrayList<DetalleTablaAmorti>();
							detalletablaamortisAux.addAll(detalletablaamortis);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detalletablaamortiLogic.getDetalleTablaAmortisFK_IdPeriodo(finalQueryGlobal,pagination,id_periodoFK_IdPeriodo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleTablaAmortiConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleTablaAmortiConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleTablaAmortis("FK_IdPeriodo",detalletablaamortiLogic.getDetalleTablaAmortis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleTablaAmortis("FK_IdPeriodo",detalletablaamortis);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detalletablaamortiLogic.setDetalleTablaAmortis(new ArrayList<DetalleTablaAmorti>());
						detalletablaamortiLogic.getDetalleTablaAmortis().addAll(detalletablaamortisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalletablaamortis=new ArrayList<DetalleTablaAmorti>();
							detalletablaamortis.addAll(detalletablaamortisAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=DetalleTablaAmortiConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detalletablaamortiLogic.getDetalleTablaAmortisFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleTablaAmortiConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleTablaAmortiConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detalletablaamortiLogic.getDetalleTablaAmortis()==null||detalletablaamortiLogic.getDetalleTablaAmortis().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detalletablaamortis==null|| detalletablaamortis.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detalletablaamortisAux=new ArrayList<DetalleTablaAmorti>();
						detalletablaamortisAux.addAll(detalletablaamortiLogic.getDetalleTablaAmortis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalletablaamortisAux=new ArrayList<DetalleTablaAmorti>();
							detalletablaamortisAux.addAll(detalletablaamortis);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detalletablaamortiLogic.getDetalleTablaAmortisFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleTablaAmortiConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleTablaAmortiConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleTablaAmortis("FK_IdSucursal",detalletablaamortiLogic.getDetalleTablaAmortis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleTablaAmortis("FK_IdSucursal",detalletablaamortis);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detalletablaamortiLogic.setDetalleTablaAmortis(new ArrayList<DetalleTablaAmorti>());
						detalletablaamortiLogic.getDetalleTablaAmortis().addAll(detalletablaamortisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalletablaamortis=new ArrayList<DetalleTablaAmorti>();
							detalletablaamortis.addAll(detalletablaamortisAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTablaAmorti")) {
				this.sDetalleReporte=DetalleTablaAmortiConstantesFunciones.getDetalleIndiceFK_IdTablaAmorti(id_tabla_amortiFK_IdTablaAmorti);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detalletablaamortiLogic.getDetalleTablaAmortisFK_IdTablaAmorti(finalQueryGlobal,pagination,id_tabla_amortiFK_IdTablaAmorti);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleTablaAmortiConstantesFunciones.getDetalleIndiceFK_IdTablaAmorti(id_tabla_amortiFK_IdTablaAmorti);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleTablaAmortiConstantesFunciones.getDetalleIndiceFK_IdTablaAmorti(id_tabla_amortiFK_IdTablaAmorti);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detalletablaamortiLogic.getDetalleTablaAmortis()==null||detalletablaamortiLogic.getDetalleTablaAmortis().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detalletablaamortis==null|| detalletablaamortis.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detalletablaamortisAux=new ArrayList<DetalleTablaAmorti>();
						detalletablaamortisAux.addAll(detalletablaamortiLogic.getDetalleTablaAmortis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalletablaamortisAux=new ArrayList<DetalleTablaAmorti>();
							detalletablaamortisAux.addAll(detalletablaamortis);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detalletablaamortiLogic.getDetalleTablaAmortisFK_IdTablaAmorti(finalQueryGlobal,pagination,id_tabla_amortiFK_IdTablaAmorti);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleTablaAmortiConstantesFunciones.getDetalleIndiceFK_IdTablaAmorti(id_tabla_amortiFK_IdTablaAmorti);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleTablaAmortiConstantesFunciones.getDetalleIndiceFK_IdTablaAmorti(id_tabla_amortiFK_IdTablaAmorti);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleTablaAmortis("FK_IdTablaAmorti",detalletablaamortiLogic.getDetalleTablaAmortis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleTablaAmortis("FK_IdTablaAmorti",detalletablaamortis);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detalletablaamortiLogic.setDetalleTablaAmortis(new ArrayList<DetalleTablaAmorti>());
						detalletablaamortiLogic.getDetalleTablaAmortis().addAll(detalletablaamortisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalletablaamortis=new ArrayList<DetalleTablaAmorti>();
							detalletablaamortis.addAll(detalletablaamortisAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesDetalleTablaAmorti();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessDetalleTablaAmorti();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=detalletablaamortiLogic.getDetalleTablaAmortis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detalletablaamortis.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=detalletablaamortiLogic.getDetalleTablaAmortis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detalletablaamortis.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(DetalleTablaAmorti detalletablaamorti) {
		Boolean permite=true;
		
		if(this.detalletablaamorti.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=DetalleTablaAmortiConstantesFunciones.getOrderByListaDetalleTablaAmorti();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=DetalleTablaAmortiConstantesFunciones.getOrderByListaDetalleTablaAmorti();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleTablaAmorti detalletablaamorti:detalletablaamortiLogic.getDetalleTablaAmortis()) {
				if(detalletablaamorti.getsType().equals(Constantes2.S_TOTALES)) {
					detalletablaamortiTotales=detalletablaamorti;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleTablaAmorti detalletablaamorti:this.detalletablaamortis) {
				if(detalletablaamorti.getsType().equals(Constantes2.S_TOTALES)) {
					detalletablaamortiTotales=detalletablaamorti;
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
			this.detalletablaamortiAux=new DetalleTablaAmorti();
			this.detalletablaamortiAux.setsType(Constantes2.S_TOTALES);
			this.detalletablaamortiAux.setIsNew(false);
			this.detalletablaamortiAux.setIsChanged(false);
			this.detalletablaamortiAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				DetalleTablaAmortiConstantesFunciones.TotalizarValoresFilaDetalleTablaAmorti(this.detalletablaamortiLogic.getDetalleTablaAmortis(),this.detalletablaamortiAux);
				
				this.detalletablaamortiLogic.getDetalleTablaAmortis().add(this.detalletablaamortiAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				DetalleTablaAmortiConstantesFunciones.TotalizarValoresFilaDetalleTablaAmorti(this.detalletablaamortis,this.detalletablaamortiAux);
				
				this.detalletablaamortis.add(this.detalletablaamortiAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		detalletablaamortiTotales=new DetalleTablaAmorti();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.detalletablaamortiLogic.getDetalleTablaAmortis().remove(detalletablaamortiTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.detalletablaamortis.remove(detalletablaamortiTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		detalletablaamortiTotales=new DetalleTablaAmorti();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleTablaAmorti detalletablaamorti:detalletablaamortiLogic.getDetalleTablaAmortis()) {
				if(detalletablaamorti.getsType().equals(Constantes2.S_TOTALES)) {
					detalletablaamortiTotales=detalletablaamorti;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DetalleTablaAmortiConstantesFunciones.TotalizarValoresFilaDetalleTablaAmorti(this.detalletablaamortiLogic.getDetalleTablaAmortis(),detalletablaamortiTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleTablaAmorti detalletablaamorti:this.detalletablaamortis) {
				if(detalletablaamorti.getsType().equals(Constantes2.S_TOTALES)) {
					detalletablaamortiTotales=detalletablaamorti;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DetalleTablaAmortiConstantesFunciones.TotalizarValoresFilaDetalleTablaAmorti(this.detalletablaamortis,detalletablaamortiTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getDetalleTablaAmortisFK_IdAnio()throws Exception {
		try {
			sAccionBusqueda="FK_IdAnio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetalleTablaAmortisFK_IdEjercicio()throws Exception {
		try {
			sAccionBusqueda="FK_IdEjercicio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetalleTablaAmortisFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetalleTablaAmortisFK_IdMes()throws Exception {
		try {
			sAccionBusqueda="FK_IdMes";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetalleTablaAmortisFK_IdPeriodo()throws Exception {
		try {
			sAccionBusqueda="FK_IdPeriodo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetalleTablaAmortisFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetalleTablaAmortisFK_IdTablaAmorti()throws Exception {
		try {
			sAccionBusqueda="FK_IdTablaAmorti";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getDetalleTablaAmortisFK_IdAnio(String sFinalQuery,Long id_anio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalletablaamortiLogic.getDetalleTablaAmortisFK_IdAnio(sFinalQuery,this.pagination,id_anio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetalleTablaAmortisFK_IdEjercicio(String sFinalQuery,Long id_ejercicio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalletablaamortiLogic.getDetalleTablaAmortisFK_IdEjercicio(sFinalQuery,this.pagination,id_ejercicio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetalleTablaAmortisFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalletablaamortiLogic.getDetalleTablaAmortisFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetalleTablaAmortisFK_IdMes(String sFinalQuery,Long id_mes)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalletablaamortiLogic.getDetalleTablaAmortisFK_IdMes(sFinalQuery,this.pagination,id_mes);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetalleTablaAmortisFK_IdPeriodo(String sFinalQuery,Long id_periodo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalletablaamortiLogic.getDetalleTablaAmortisFK_IdPeriodo(sFinalQuery,this.pagination,id_periodo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetalleTablaAmortisFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalletablaamortiLogic.getDetalleTablaAmortisFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetalleTablaAmortisFK_IdTablaAmorti(String sFinalQuery,Long id_tabla_amorti)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalletablaamortiLogic.getDetalleTablaAmortisFK_IdTablaAmorti(sFinalQuery,this.pagination,id_tabla_amorti);
				
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
	
	public void inicializarPermisosDetalleTablaAmorti() {
		this.isPermisoTodoDetalleTablaAmorti=false;
		this.isPermisoNuevoDetalleTablaAmorti=false;
		this.isPermisoActualizarDetalleTablaAmorti=false;
		this.isPermisoActualizarOriginalDetalleTablaAmorti=false;
		this.isPermisoEliminarDetalleTablaAmorti=false;
		this.isPermisoGuardarCambiosDetalleTablaAmorti=false;
		this.isPermisoConsultaDetalleTablaAmorti=false;
		this.isPermisoBusquedaDetalleTablaAmorti=false;
		this.isPermisoReporteDetalleTablaAmorti=false;		
		this.isPermisoOrdenDetalleTablaAmorti=false;		
		this.isPermisoPaginacionMedioDetalleTablaAmorti=false;		
		this.isPermisoPaginacionAltoDetalleTablaAmorti=false;
		this.isPermisoPaginacionTodoDetalleTablaAmorti=false;
		this.isPermisoCopiarDetalleTablaAmorti=false;		
		this.isPermisoVerFormDetalleTablaAmorti=false;		
		this.isPermisoDuplicarDetalleTablaAmorti=false;		
		this.isPermisoOrdenDetalleTablaAmorti=false;		
	}
	
	public void setPermisosUsuarioDetalleTablaAmorti(Boolean isPermiso) {
		this.isPermisoTodoDetalleTablaAmorti=isPermiso;
		this.isPermisoNuevoDetalleTablaAmorti=isPermiso;
		this.isPermisoActualizarDetalleTablaAmorti=isPermiso;
		this.isPermisoActualizarOriginalDetalleTablaAmorti=isPermiso;
		this.isPermisoEliminarDetalleTablaAmorti=isPermiso;
		this.isPermisoGuardarCambiosDetalleTablaAmorti=isPermiso;
		this.isPermisoConsultaDetalleTablaAmorti=isPermiso;
		this.isPermisoBusquedaDetalleTablaAmorti=isPermiso;
		this.isPermisoReporteDetalleTablaAmorti=isPermiso;
		this.isPermisoOrdenDetalleTablaAmorti=isPermiso;		
		this.isPermisoPaginacionMedioDetalleTablaAmorti=isPermiso;		
		this.isPermisoPaginacionAltoDetalleTablaAmorti=isPermiso;		
		this.isPermisoPaginacionTodoDetalleTablaAmorti=isPermiso;		
		this.isPermisoCopiarDetalleTablaAmorti=isPermiso;		
		this.isPermisoVerFormDetalleTablaAmorti=isPermiso;		
		this.isPermisoDuplicarDetalleTablaAmorti=isPermiso;
		this.isPermisoOrdenDetalleTablaAmorti=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioDetalleTablaAmorti(Boolean isPermiso) {
		//this.isPermisoTodoDetalleTablaAmorti=isPermiso;
		this.isPermisoNuevoDetalleTablaAmorti=isPermiso;
		this.isPermisoActualizarDetalleTablaAmorti=isPermiso;
		this.isPermisoActualizarOriginalDetalleTablaAmorti=isPermiso;
		this.isPermisoEliminarDetalleTablaAmorti=isPermiso;
		this.isPermisoGuardarCambiosDetalleTablaAmorti=isPermiso;
		//this.isPermisoConsultaDetalleTablaAmorti=isPermiso;
		//this.isPermisoBusquedaDetalleTablaAmorti=isPermiso;
		//this.isPermisoReporteDetalleTablaAmorti=isPermiso;
		//this.isPermisoOrdenDetalleTablaAmorti=isPermiso;		
		//this.isPermisoPaginacionMedioDetalleTablaAmorti=isPermiso;		
		//this.isPermisoPaginacionAltoDetalleTablaAmorti=isPermiso;		
		//this.isPermisoPaginacionTodoDetalleTablaAmorti=isPermiso;		
		//this.isPermisoCopiarDetalleTablaAmorti=isPermiso;		
		//this.isPermisoDuplicarDetalleTablaAmorti=isPermiso;
		//this.isPermisoOrdenDetalleTablaAmorti=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioDetalleTablaAmortiClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(DetalleTablaAmortiJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebDetalleTablaAmorti(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioDetalleTablaAmortiClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioDetalleTablaAmortiClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionDetalleTablaAmortiClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioDetalleTablaAmortiClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioDetalleTablaAmorti() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(DetalleTablaAmortiJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.detalletablaamortiSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, DetalleTablaAmortiConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoDetalleTablaAmorti=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarDetalleTablaAmorti=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalDetalleTablaAmorti=this.isPermisoActualizarDetalleTablaAmorti;
			this.isPermisoEliminarDetalleTablaAmorti=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosDetalleTablaAmorti=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaDetalleTablaAmorti=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaDetalleTablaAmorti=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoDetalleTablaAmorti=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteDetalleTablaAmorti=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDetalleTablaAmorti=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioDetalleTablaAmorti=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoDetalleTablaAmorti=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoDetalleTablaAmorti=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarDetalleTablaAmorti=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormDetalleTablaAmorti=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarDetalleTablaAmorti=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDetalleTablaAmorti=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.detalletablaamortiSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosDetalleTablaAmorti.setToolTipText(this.jTableDatosDetalleTablaAmorti.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioDetalleTablaAmorti(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioDetalleTablaAmorti(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(DetalleTablaAmortiJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(DetalleTablaAmortiJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioDetalleTablaAmorti() throws Exception {
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
	public void inicializarCombosForeignKeyDetalleTablaAmortiListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.ejerciciosForeignKey=new ArrayList();
				this.periodosForeignKey=new ArrayList();
				this.tablaamortisForeignKey=new ArrayList();
				this.aniosForeignKey=new ArrayList();
				this.messForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyDetalleTablaAmortiListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(DetalleTablaAmortiJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyDetalleTablaAmortiListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEjercicioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyPeriodoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTablaAmortiListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyAnioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyMesListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyTablaAmortiListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tablaamortisForeignKey==null||this.tablaamortisForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TablaAmortiConstantesFunciones.getArrayColumnasGlobalesTablaAmorti(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TablaAmortiConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TablaAmortiConstantesFunciones.SFINALQUERY;

				this.cargarCombosTablaAmortisForeignKeyLista(finalQueryGlobal);
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
	
	public void cargarCombosLoteForeignKeyDetalleTablaAmortiListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			DetalleTablaAmortiParameterReturnGeneral detalletablaamortiReturnGeneral=new DetalleTablaAmortiParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.detalletablaamortiConstantesFunciones.cargarid_empresaDetalleTablaAmorti)
					 || (this.esRecargarFks && this.detalletablaamortiConstantesFunciones.cargarid_empresaDetalleTablaAmorti)) {

					if(!this.detalletablaamortiSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+detalletablaamortiSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.detalletablaamortiConstantesFunciones.cargarid_sucursalDetalleTablaAmorti)
					 || (this.esRecargarFks && this.detalletablaamortiConstantesFunciones.cargarid_sucursalDetalleTablaAmorti)) {

					if(!this.detalletablaamortiSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+detalletablaamortiSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalEjercicio="";

				if(((this.ejerciciosForeignKey==null||this.ejerciciosForeignKey.size()<=0) && this.detalletablaamortiConstantesFunciones.cargarid_ejercicioDetalleTablaAmorti)
					 || (this.esRecargarFks && this.detalletablaamortiConstantesFunciones.cargarid_ejercicioDetalleTablaAmorti)) {

					if(!this.detalletablaamortiSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EjercicioConstantesFunciones.getArrayColumnasGlobalesEjercicio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEjercicio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EjercicioConstantesFunciones.TABLENAME);

						finalQueryGlobalEjercicio=Funciones.GetFinalQueryAppend(finalQueryGlobalEjercicio, "");
						finalQueryGlobalEjercicio+=EjercicioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEjerciciosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEjercicio=" WHERE " + ConstantesSql.ID + "="+detalletablaamortiSessionBean.getlidEjercicioActual();
					}
				} else {
					finalQueryGlobalEjercicio="NONE";
				}


				String finalQueryGlobalPeriodo="";

				if(((this.periodosForeignKey==null||this.periodosForeignKey.size()<=0) && this.detalletablaamortiConstantesFunciones.cargarid_periodoDetalleTablaAmorti)
					 || (this.esRecargarFks && this.detalletablaamortiConstantesFunciones.cargarid_periodoDetalleTablaAmorti)) {

					if(!this.detalletablaamortiSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PeriodoConstantesFunciones.getArrayColumnasGlobalesPeriodo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPeriodo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PeriodoConstantesFunciones.TABLENAME);

						finalQueryGlobalPeriodo=Funciones.GetFinalQueryAppend(finalQueryGlobalPeriodo, "");
						finalQueryGlobalPeriodo+=PeriodoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPeriodosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPeriodo=" WHERE " + ConstantesSql.ID + "="+detalletablaamortiSessionBean.getlidPeriodoActual();
					}
				} else {
					finalQueryGlobalPeriodo="NONE";
				}


				String finalQueryGlobalTablaAmorti="";

				if(((this.tablaamortisForeignKey==null||this.tablaamortisForeignKey.size()<=0) && this.detalletablaamortiConstantesFunciones.cargarid_tabla_amortiDetalleTablaAmorti)
					 || (this.esRecargarFks && this.detalletablaamortiConstantesFunciones.cargarid_tabla_amortiDetalleTablaAmorti)) {

					if(!this.detalletablaamortiSessionBean.getisBusquedaDesdeForeignKeySesionTablaAmorti()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TablaAmortiConstantesFunciones.getArrayColumnasGlobalesTablaAmorti(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTablaAmorti=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TablaAmortiConstantesFunciones.TABLENAME);

						finalQueryGlobalTablaAmorti=Funciones.GetFinalQueryAppend(finalQueryGlobalTablaAmorti, "");
						finalQueryGlobalTablaAmorti+=TablaAmortiConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTablaAmortisForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTablaAmorti=" WHERE " + ConstantesSql.ID + "="+detalletablaamortiSessionBean.getlidTablaAmortiActual();
					}
				} else {
					finalQueryGlobalTablaAmorti="NONE";
				}


				String finalQueryGlobalAnio="";

				if(((this.aniosForeignKey==null||this.aniosForeignKey.size()<=0) && this.detalletablaamortiConstantesFunciones.cargarid_anioDetalleTablaAmorti)
					 || (this.esRecargarFks && this.detalletablaamortiConstantesFunciones.cargarid_anioDetalleTablaAmorti)) {

					if(!this.detalletablaamortiSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=AnioConstantesFunciones.getArrayColumnasGlobalesAnio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalAnio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,AnioConstantesFunciones.TABLENAME);

						finalQueryGlobalAnio=Funciones.GetFinalQueryAppend(finalQueryGlobalAnio, "");
						finalQueryGlobalAnio+=AnioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosAniosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalAnio=" WHERE " + ConstantesSql.ID + "="+detalletablaamortiSessionBean.getlidAnioActual();
					}
				} else {
					finalQueryGlobalAnio="NONE";
				}


				String finalQueryGlobalMes="";

				if(((this.messForeignKey==null||this.messForeignKey.size()<=0) && this.detalletablaamortiConstantesFunciones.cargarid_mesDetalleTablaAmorti)
					 || (this.esRecargarFks && this.detalletablaamortiConstantesFunciones.cargarid_mesDetalleTablaAmorti)) {

					if(!this.detalletablaamortiSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=MesConstantesFunciones.getArrayColumnasGlobalesMes(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalMes=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,MesConstantesFunciones.TABLENAME);

						finalQueryGlobalMes=Funciones.GetFinalQueryAppend(finalQueryGlobalMes, "");
						finalQueryGlobalMes+=MesConstantesFunciones.SFINALQUERY;

						//this.cargarCombosMessForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalMes=" WHERE " + ConstantesSql.ID + "="+detalletablaamortiSessionBean.getlidMesActual();
					}
				} else {
					finalQueryGlobalMes="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				detalletablaamortiReturnGeneral=detalletablaamortiLogic.cargarCombosLoteForeignKeyDetalleTablaAmorti(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalEjercicio,finalQueryGlobalPeriodo,finalQueryGlobalTablaAmorti,finalQueryGlobalAnio,finalQueryGlobalMes);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=detalletablaamortiReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=detalletablaamortiReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalEjercicio.equals("NONE")) {
				this.ejerciciosForeignKey=detalletablaamortiReturnGeneral.getejerciciosForeignKey();
			}

			if(!finalQueryGlobalPeriodo.equals("NONE")) {
				this.periodosForeignKey=detalletablaamortiReturnGeneral.getperiodosForeignKey();
			}

			if(!finalQueryGlobalTablaAmorti.equals("NONE")) {
				this.tablaamortisForeignKey=detalletablaamortiReturnGeneral.gettablaamortisForeignKey();
			}

			if(!finalQueryGlobalAnio.equals("NONE")) {
				this.aniosForeignKey=detalletablaamortiReturnGeneral.getaniosForeignKey();
			}

			if(!finalQueryGlobalMes.equals("NONE")) {
				this.messForeignKey=detalletablaamortiReturnGeneral.getmessForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyDetalleTablaAmorti()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyEjercicio();
			this.addItemDefectoCombosForeignKeyPeriodo();
			this.addItemDefectoCombosForeignKeyTablaAmorti();
			this.addItemDefectoCombosForeignKeyAnio();
			this.addItemDefectoCombosForeignKeyMes();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.detalletablaamortiSessionBean==null) {
				this.detalletablaamortiSessionBean=new DetalleTablaAmortiSessionBean();
			}

			if(!this.detalletablaamortiSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.detalletablaamortiSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

	public void addItemDefectoCombosForeignKeyEjercicio()throws Exception {
		try {

			if(!this.detalletablaamortiSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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

			if(!this.detalletablaamortiSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
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

	public void addItemDefectoCombosForeignKeyTablaAmorti()throws Exception {
		try {

			if(!this.detalletablaamortiSessionBean.getisBusquedaDesdeForeignKeySesionTablaAmorti()) {
				TablaAmorti tablaamorti=new TablaAmorti();
				TablaAmortiConstantesFunciones.setTablaAmortiDescripcion(tablaamorti,Constantes.SMENSAJE_ESCOJA_OPCION);
				tablaamorti.setId(null);

				if(!TablaAmortiConstantesFunciones.ExisteEnLista(this.tablaamortisForeignKey,tablaamorti,true)) {

					this.tablaamortisForeignKey.add(0,tablaamorti);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyAnio()throws Exception {
		try {

			if(!this.detalletablaamortiSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
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

	public void addItemDefectoCombosForeignKeyMes()throws Exception {
		try {

			if(!this.detalletablaamortiSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
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
	
	public void initActionsCombosTodosForeignKeyDetalleTablaAmorti()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyDetalleTablaAmorti(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyDetalleTablaAmorti()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
				this.setActualEjercicioForeignKey(this.parametroGeneralUsuario.getid_ejercicio(),false,"Formulario");
				this.setActualPeriodoForeignKey(this.parametroGeneralUsuario.getid_periodo(),false,"Formulario");
			
			
				this.detalletablaamorti.setfecha_inicio(this.parametroGeneralUsuario.getfecha_sistema());
				this.detalletablaamorti.setfecha_fin(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyDetalleTablaAmorti();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyDetalleTablaAmorti(DetalleTablaAmorti detalletablaamorti)throws Exception {	
		try {
			
			this.setActualTablaAmortiForeignKey(detalletablaamorti.getid_tabla_amorti(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyDetalleTablaAmorti(DetalleTablaAmorti detalletablaamorti,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyDetalleTablaAmorti()throws Exception {	
		try {
			
			this.setActualTablaAmortiForeignKey(this.detalletablaamortiConstantesFunciones.getid_tabla_amorti(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyDetalleTablaAmorti()throws Exception {	
		try {
			

				if(this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) {
					Ejercicio ejercicioActual=(Ejercicio)this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_ejercicioDetalleTablaAmorti.getSelectedItem();
					this.setActualAnioForeignKey(ejercicioActual.getid_anio(),false,"Formulario");
				}

				if(this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) {
					Periodo periodoActual=(Periodo)this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_periodoDetalleTablaAmorti.getSelectedItem();
					this.setActualMesForeignKey(periodoActual.getid_mes(),false,"Formulario");
				}
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyDetalleTablaAmorti()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyDetalleTablaAmorti()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroDetalleTablaAmorti()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyDetalleTablaAmorti()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameEjerciciosForeignKey("Todos");
			this.cargarCombosFramePeriodosForeignKey("Todos");
			this.cargarCombosFrameTablaAmortisForeignKey("Todos");
			this.cargarCombosFrameAniosForeignKey("Todos");
			this.cargarCombosFrameMessForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyDetalleTablaAmorti(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEjerciciosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFramePeriodosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTablaAmortisForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameAniosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameMessForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyDetalleTablaAmorti()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_empresaDetalleTablaAmorti!=null && this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_empresaDetalleTablaAmorti.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_empresaDetalleTablaAmorti.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_sucursalDetalleTablaAmorti!=null && this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_sucursalDetalleTablaAmorti.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_sucursalDetalleTablaAmorti.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_ejercicioDetalleTablaAmorti!=null && this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_ejercicioDetalleTablaAmorti.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_ejercicioDetalleTablaAmorti.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_periodoDetalleTablaAmorti!=null && this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_periodoDetalleTablaAmorti.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_periodoDetalleTablaAmorti.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_tabla_amortiDetalleTablaAmorti!=null && this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_tabla_amortiDetalleTablaAmorti.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_tabla_amortiDetalleTablaAmorti.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_anioDetalleTablaAmorti!=null && this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_anioDetalleTablaAmorti.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_anioDetalleTablaAmorti.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_mesDetalleTablaAmorti!=null && this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_mesDetalleTablaAmorti.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_mesDetalleTablaAmorti.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	














	
	

	public DetalleTablaAmortiBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public DetalleTablaAmortiBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public DetalleTablaAmortiBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.detalletablaamortiSessionBean=new DetalleTablaAmortiSessionBean(); 
		this.detalletablaamortiConstantesFunciones=new DetalleTablaAmortiConstantesFunciones(); 
		this.detalletablaamortiBean=new DetalleTablaAmorti();//(this.detalletablaamortiConstantesFunciones); 		
		this.detalletablaamortiReturnGeneral=new DetalleTablaAmortiParameterReturnGeneral(); 
		
		this.detalletablaamortiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detalletablaamortiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public DetalleTablaAmortiBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public DetalleTablaAmortiBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public DetalleTablaAmortiBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessDetalleTablaAmorti(true);
			
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
			
			this.detalletablaamortiConstantesFunciones=new DetalleTablaAmortiConstantesFunciones(); 
			this.detalletablaamortiBean=new DetalleTablaAmorti();//this.detalletablaamortiConstantesFunciones); 			
			this.detalletablaamortiReturnGeneral=new DetalleTablaAmortiParameterReturnGeneral(); 
		
			DetalleTablaAmortiBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Detalle Tabla Amorti Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.detalletablaamorti=new DetalleTablaAmorti();
			this.detalletablaamortis = new ArrayList<DetalleTablaAmorti>();
			this.detalletablaamortisAux = new ArrayList<DetalleTablaAmorti>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamortiLogic=new DetalleTablaAmortiLogic();
				this.detalletablaamortiLogic.getNewConnexionToDeep("");
			}
			
			//this.detalletablaamortiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.detalletablaamortiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormDetalleTablaAmorti);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoDetalleTablaAmorti!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDetalleTablaAmorti);	
					}
					
					if(this.jInternalFrameImportacionDetalleTablaAmorti!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDetalleTablaAmorti);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByDetalleTablaAmorti!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByDetalleTablaAmorti);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormDetalleTablaAmorti);
				this.jInternalFrameDetalleFormDetalleTablaAmorti.setVisible(false);
				this.jInternalFrameDetalleFormDetalleTablaAmorti.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoDetalleTablaAmorti!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDetalleTablaAmorti);
					this.jInternalFrameReporteDinamicoDetalleTablaAmorti.setVisible(false);
					this.jInternalFrameReporteDinamicoDetalleTablaAmorti.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionDetalleTablaAmorti!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionDetalleTablaAmorti);
					this.jInternalFrameImportacionDetalleTablaAmorti.setVisible(false);
					this.jInternalFrameImportacionDetalleTablaAmorti.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByDetalleTablaAmorti!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByDetalleTablaAmorti);
					this.jInternalFrameOrderByDetalleTablaAmorti.setVisible(false);
					this.jInternalFrameOrderByDetalleTablaAmorti.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idDetalleTablaAmortiActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=DetalleTablaAmortiConstantesFunciones.INUMEROPAGINACION;
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
			
			this.detalletablaamortiReturnGeneral=new DetalleTablaAmortiParameterReturnGeneral();
			
			this.detalletablaamortiParameterGeneral=new DetalleTablaAmortiParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.detalletablaamortiLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.detalletablaamortiSessionBean.getEsGuardarRelacionado()) {
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
			
			if(DetalleTablaAmortiJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.detalletablaamortiSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DetalleTablaAmortiConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.detalletablaamortiSessionBean.getEsGuardarRelacionado(),this.detalletablaamortiSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DetalleTablaAmortiConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.detalletablaamortiSessionBean.getEsGuardarRelacionado(),this.detalletablaamortiSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoDetalleTablaAmorti=false;
			this.isVisibilidadCeldaDuplicarDetalleTablaAmorti=true;
			this.isVisibilidadCeldaCopiarDetalleTablaAmorti=true;
			this.isVisibilidadCeldaVerFormDetalleTablaAmorti=true;
			this.isVisibilidadCeldaOrdenDetalleTablaAmorti=true;
			this.isVisibilidadCeldaNuevoRelacionesDetalleTablaAmorti=false;
			this.isVisibilidadCeldaModificarDetalleTablaAmorti=false;
			this.isVisibilidadCeldaActualizarDetalleTablaAmorti=false;
			this.isVisibilidadCeldaEliminarDetalleTablaAmorti=false;
			this.isVisibilidadCeldaCancelarDetalleTablaAmorti=false;
			this.isVisibilidadCeldaGuardarDetalleTablaAmorti=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleTablaAmorti=false;
			
			
			this.isVisibilidadFK_IdAnio=true;
			this.isVisibilidadFK_IdEjercicio=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdMes=true;
			this.isVisibilidadFK_IdPeriodo=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdTablaAmorti=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesDetalleTablaAmorti("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosDetalleTablaAmorti();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioDetalleTablaAmorti(false);
			
			this.setPermisosUsuarioDetalleTablaAmorti();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.detalletablaamortiSessionBean.getEsGuardarRelacionado() 
				|| (this.detalletablaamortiSessionBean.getEsGuardarRelacionado() && this.detalletablaamortiSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioDetalleTablaAmortiClasesRelacionadas();
			}
			
			if(this.detalletablaamortiSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioDetalleTablaAmortiClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!DetalleTablaAmortiJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosDetalleTablaAmorti();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualDetalleTablaAmorti();
			}
			
			if(!this.isPermisoBusquedaDetalleTablaAmorti) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasDetalleTablaAmorti.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.detalletablaamortiSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioDetalleTablaAmorti,this.isPermisoPaginacionMedioDetalleTablaAmorti,this.isPermisoPaginacionTodoDetalleTablaAmorti);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(DetalleTablaAmortiConstantesFunciones.getTiposSeleccionarDetalleTablaAmorti());
				
				this.tiposColumnasSelect=DetalleTablaAmortiConstantesFunciones.getTiposSeleccionarDetalleTablaAmorti(true);
				
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
			//if(!this.detalletablaamortiSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioDetalleTablaAmorti();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioDetalleTablaAmorti(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioDetalleTablaAmorti(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesDetalleTablaAmorti() ;
			
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
			this.ejercicioLogic=new EjercicioLogic();
			this.periodoLogic=new PeriodoLogic();
			this.tablaamortiLogic=new TablaAmortiLogic();
			this.anioLogic=new AnioLogic();
			this.mesLogic=new MesLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				detalletablaamortiImplementable= (DetalleTablaAmortiImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DetalleTablaAmortiConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				detalletablaamortiImplementableHome= (DetalleTablaAmortiImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DetalleTablaAmortiConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.detalletablaamortis= new ArrayList<DetalleTablaAmorti>();
			this.detalletablaamortisEliminados= new ArrayList<DetalleTablaAmorti>();
						
			this.isEsNuevoDetalleTablaAmorti=false;
			this.esParaAccionDesdeFormularioDetalleTablaAmorti=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>() ;
			this.periodosForeignKey=new ArrayList<Periodo>() ;
			this.tablaamortisForeignKey=new ArrayList<TablaAmorti>() ;
			this.aniosForeignKey=new ArrayList<Anio>() ;
			this.messForeignKey=new ArrayList<Mes>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyDetalleTablaAmorti(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroDetalleTablaAmorti();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.detalletablaamortiSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			DetalleTablaAmortiBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=DetalleTablaAmortiConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesDetalleTablaAmorti("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingDetalleTablaAmorti(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioDetalleTablaAmorti();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioDetalleTablaAmorti();
			}
			
			DetalleTablaAmortiBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasDetalleTablaAmorti.getTabCount(); i++) {
					this.jTabbedPaneBusquedasDetalleTablaAmorti.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasDetalleTablaAmorti.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamortiLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessDetalleTablaAmorti(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga DetalleTablaAmorti: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamortiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamortiLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectDetalleTablaAmorti() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesDetalleTablaAmorti")) {
				iIndex=this.jInternalFrameDetalleFormDetalleTablaAmorti.jTabbedPaneRelacionesDetalleTablaAmorti.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormDetalleTablaAmorti.jTabbedPaneRelacionesDetalleTablaAmorti.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosDetalleTablaAmorti.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessDetalleTablaAmorti();	
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
	
	public void cargarCombosForeignKeyDetalleTablaAmorti(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyDetalleTablaAmorti(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyDetalleTablaAmorti(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyDetalleTablaAmortiListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyDetalleTablaAmorti();
		
		this.cargarCombosFrameForeignKeyDetalleTablaAmorti();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyDetalleTablaAmorti();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyDetalleTablaAmorti();
		}
	}
	
	

	public void cargarCombosForeignKeyTablaAmorti(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTablaAmortiListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTablaAmorti();
				this.cargarCombosFrameTablaAmortisForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTablaAmorti(this.tablaamortisForeignKey);

		} catch(Exception e) {
			throw e;
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
	
	public void jButtonNuevoDetalleTablaAmortiActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.detalletablaamortiSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormDetalleTablaAmorti==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			DetalleTablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.detalletablaamorti,new Object(),this.detalletablaamortiParameterGeneral,this.detalletablaamortiReturnGeneral);
			
			
			if(jTableDatosDetalleTablaAmorti.getRowCount()>=1) {
				jTableDatosDetalleTablaAmorti.removeRowSelectionInterval(0, jTableDatosDetalleTablaAmorti.getRowCount()-1);						
			}
			
			this.isEsNuevoDetalleTablaAmorti=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoDetalleTablaAmorti(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesDetalleTablaAmorti(true);			
			//this.detalletablaamorti=new DetalleTablaAmorti();
			//this.detalletablaamorti.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDetalleTablaAmorti(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetalleTablaAmorti() ;
			
			if(DetalleTablaAmortiJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDetalleTablaAmorti(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.detalletablaamorti);	
			this.actualizarInformacion("INFO_PADRE",false,this.detalletablaamorti);				
			
			DetalleTablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.detalletablaamorti,new Object(),this.detalletablaamortiParameterGeneral,this.detalletablaamortiReturnGeneral);
			
			if(this.detalletablaamortiSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar DetalleTablaAmorti: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			DetalleTablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.detalletablaamorti,new Object(),this.detalletablaamortiParameterGeneral,this.detalletablaamortiReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarDetalleTablaAmortiActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<DetalleTablaAmorti> detalletablaamortisSeleccionados=new ArrayList<DetalleTablaAmorti>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosDetalleTablaAmorti.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosDetalleTablaAmorti.getSelectedRows().length;			
			}
			
			detalletablaamortisSeleccionados=this.getDetalleTablaAmortisSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoDetalleTablaAmorti--;			
				//DetalleTablaAmorti detalletablaamortiAux= new DetalleTablaAmorti();			
				//detalletablaamortiAux.setId(this.iIdNuevoDetalleTablaAmorti);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//DetalleTablaAmorti detalletablaamortiOrigen=new DetalleTablaAmorti();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(DetalleTablaAmorti detalletablaamortiOrigen : detalletablaamortisSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosDetalleTablaAmorti.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							detalletablaamortiOrigen =(DetalleTablaAmorti) this.detalletablaamortiLogic.getDetalleTablaAmortis().toArray()[this.jTableDatosDetalleTablaAmorti.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalletablaamortiOrigen =(DetalleTablaAmorti) this.detalletablaamortis.toArray()[this.jTableDatosDetalleTablaAmorti.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaDetalleTablaAmorti();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.detalletablaamorti.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosDetalleTablaAmorti(detalletablaamortiOrigen,this.detalletablaamorti,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleTablaAmorti(this.detalletablaamorti);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.detalletablaamortiLogic.getDetalleTablaAmortis().add(this.detalletablaamortiAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.detalletablaamortis.add(this.detalletablaamortiAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaDetalleTablaAmorti(false);
				
				this.jTableDatosDetalleTablaAmorti.setRowSelectionInterval(this.getIndiceNuevoDetalleTablaAmorti(), this.getIndiceNuevoDetalleTablaAmorti());
				
				int iLastRow =  this.jTableDatosDetalleTablaAmorti.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDetalleTablaAmorti.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDetalleTablaAmorti.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDetalleTablaAmorti(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarDetalleTablaAmortiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<DetalleTablaAmorti> detalletablaamortisSeleccionados=new ArrayList<DetalleTablaAmorti>();									
		
			DetalleTablaAmorti detalletablaamortiOrigen=new DetalleTablaAmorti();
			DetalleTablaAmorti detalletablaamortiDestino=new DetalleTablaAmorti();
				
			detalletablaamortisSeleccionados=this.getDetalleTablaAmortisSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosDetalleTablaAmorti.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || detalletablaamortisSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosDetalleTablaAmorti.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detalletablaamortiOrigen =(DetalleTablaAmorti) this.detalletablaamortiLogic.getDetalleTablaAmortis().toArray()[this.jTableDatosDetalleTablaAmorti.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						detalletablaamortiOrigen =(DetalleTablaAmorti) this.detalletablaamortis.toArray()[this.jTableDatosDetalleTablaAmorti.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detalletablaamortiDestino =(DetalleTablaAmorti) this.detalletablaamortiLogic.getDetalleTablaAmortis().toArray()[this.jTableDatosDetalleTablaAmorti.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						detalletablaamortiDestino =(DetalleTablaAmorti) this.detalletablaamortis.toArray()[this.jTableDatosDetalleTablaAmorti.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				detalletablaamortiOrigen =detalletablaamortisSeleccionados.get(0);
				detalletablaamortiDestino =detalletablaamortisSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosDetalleTablaAmorti(detalletablaamortiOrigen,detalletablaamortiDestino,true,false);
				
				detalletablaamortiDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(detalletablaamortiDestino,detalletablaamortiLogic.getDetalleTablaAmortis());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detalletablaamortiDestino,detalletablaamortis);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaDetalleTablaAmorti(false);
				
				//this.jTableDatosDetalleTablaAmorti.setRowSelectionInterval(this.getIndiceNuevoDetalleTablaAmorti(), this.getIndiceNuevoDetalleTablaAmorti());
				
				int iLastRow =  this.jTableDatosDetalleTablaAmorti.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDetalleTablaAmorti.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDetalleTablaAmorti.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDetalleTablaAmorti(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormDetalleTablaAmortiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDetalleTablaAmorti==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormDetalleTablaAmorti.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarDetalleTablaAmortiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesDetalleTablaAmorti.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasDetalleTablaAmorti.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesDetalleTablaAmorti.setVisible(!isVisible);
			this.jPanelPaginacionDetalleTablaAmorti.setVisible(!isVisible);
			this.jPanelAccionesDetalleTablaAmorti.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarDetalleTablaAmortiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameDetalleTablaAmorti();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoDetalleTablaAmortiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoDetalleTablaAmorti();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionDetalleTablaAmortiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionDetalleTablaAmorti();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByDetalleTablaAmortiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByDetalleTablaAmorti();
			
			this.abrirFrameOrderByDetalleTablaAmorti();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByDetalleTablaAmortiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByDetalleTablaAmorti();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleDetalleTablaAmorti(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormDetalleTablaAmorti);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormDetalleTablaAmorti.isMaximum()) {
					this.jInternalFrameDetalleFormDetalleTablaAmorti.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormDetalleTablaAmorti.setSize(this.jInternalFrameDetalleFormDetalleTablaAmorti.iWidthFormulario,this.jInternalFrameDetalleFormDetalleTablaAmorti.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormDetalleTablaAmorti.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormDetalleTablaAmorti.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormDetalleTablaAmorti.isMaximum()) {
						this.jInternalFrameDetalleFormDetalleTablaAmorti.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormDetalleTablaAmorti.jContentPaneDetalleDetalleTablaAmorti.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormDetalleTablaAmorti.jTabbedPaneRelacionesDetalleTablaAmorti.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormDetalleTablaAmorti.jContentPaneDetalleDetalleTablaAmorti.getWidth(),DetalleTablaAmortiConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDetalleTablaAmorti.jTabbedPaneRelacionesDetalleTablaAmorti.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormDetalleTablaAmorti.jContentPaneDetalleDetalleTablaAmorti.getWidth(),DetalleTablaAmortiConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDetalleTablaAmorti.jTabbedPaneRelacionesDetalleTablaAmorti.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormDetalleTablaAmorti.jContentPaneDetalleDetalleTablaAmorti.getWidth(),DetalleTablaAmortiConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormDetalleTablaAmorti.setVisible(true);
	        this.jInternalFrameDetalleFormDetalleTablaAmorti.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByDetalleTablaAmorti() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByDetalleTablaAmorti==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByDetalleTablaAmorti=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleTablaAmorti,false,this);
				} else {
					this.jInternalFrameOrderByDetalleTablaAmorti=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleTablaAmorti,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByDetalleTablaAmorti);
				this.jInternalFrameOrderByDetalleTablaAmorti.setVisible(false);
				this.jInternalFrameOrderByDetalleTablaAmorti.setSelected(false);
				
				this.jInternalFrameOrderByDetalleTablaAmorti.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDetalleTablaAmorti"));
				
				this.inicializarActualizarBindingTablaOrderByDetalleTablaAmorti();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionDetalleTablaAmorti() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionDetalleTablaAmorti==null) {
				
				this.jInternalFrameImportacionDetalleTablaAmorti=new ImportacionJInternalFrame(DetalleTablaAmortiConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDetalleTablaAmorti);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionDetalleTablaAmorti);
				this.jInternalFrameImportacionDetalleTablaAmorti.setVisible(false);
				this.jInternalFrameImportacionDetalleTablaAmorti.setSelected(false);


				this.jInternalFrameImportacionDetalleTablaAmorti.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDetalleTablaAmorti"));
				this.jInternalFrameImportacionDetalleTablaAmorti.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDetalleTablaAmorti"));
				this.jInternalFrameImportacionDetalleTablaAmorti.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDetalleTablaAmorti"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoDetalleTablaAmorti() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoDetalleTablaAmorti==null) {
				this.jInternalFrameReporteDinamicoDetalleTablaAmorti=new ReporteDinamicoJInternalFrame(DetalleTablaAmortiConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDetalleTablaAmorti);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDetalleTablaAmorti);
				this.jInternalFrameReporteDinamicoDetalleTablaAmorti.setVisible(false);
				this.jInternalFrameReporteDinamicoDetalleTablaAmorti.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoDetalleTablaAmorti.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDetalleTablaAmorti"));
				this.jInternalFrameReporteDinamicoDetalleTablaAmorti.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDetalleTablaAmorti"));
				this.jInternalFrameReporteDinamicoDetalleTablaAmorti.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDetalleTablaAmorti"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDetalleTablaAmorti();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleDetalleTablaAmorti() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormDetalleTablaAmorti);
			
	       	this.jInternalFrameDetalleFormDetalleTablaAmorti.setVisible(false);
	        this.jInternalFrameDetalleFormDetalleTablaAmorti.setSelected(false);
			
			//this.jInternalFrameDetalleFormDetalleTablaAmorti.dispose();
			//this.jInternalFrameDetalleFormDetalleTablaAmorti=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoDetalleTablaAmorti() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoDetalleTablaAmorti.setVisible(true);
	        this.jInternalFrameReporteDinamicoDetalleTablaAmorti.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionDetalleTablaAmorti() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionDetalleTablaAmorti.setVisible(true);
	        this.jInternalFrameImportacionDetalleTablaAmorti.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByDetalleTablaAmorti() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByDetalleTablaAmorti.setVisible(true);
	        this.jInternalFrameOrderByDetalleTablaAmorti.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByDetalleTablaAmorti() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByDetalleTablaAmorti.setVisible(false);
	        this.jInternalFrameOrderByDetalleTablaAmorti.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoDetalleTablaAmorti() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoDetalleTablaAmorti.setVisible(false);
	        this.jInternalFrameReporteDinamicoDetalleTablaAmorti.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionDetalleTablaAmorti() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionDetalleTablaAmorti.setVisible(false);
	        this.jInternalFrameImportacionDetalleTablaAmorti.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarDetalleTablaAmortiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarDetalleTablaAmorti(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarDetalleTablaAmorti(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDetalleTablaAmorti.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesDetalleTablaAmorti(true);
			//this.isEsNuevoDetalleTablaAmorti=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamorti =(DetalleTablaAmorti) this.detalletablaamortiLogic.getDetalleTablaAmortis().toArray()[this.jTableDatosDetalleTablaAmorti.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.detalletablaamorti =(DetalleTablaAmorti) this.detalletablaamortis.toArray()[this.jTableDatosDetalleTablaAmorti.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesDetalleTablaAmorti("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDetalleTablaAmorti(false) ;
			
			if(detalletablaamortiSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(DetalleTablaAmortiJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDetalleTablaAmorti(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetalleTablaAmorti(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaDetalleTablaAmortiActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosDetalleTablaAmorti.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalletablaamorti =(DetalleTablaAmorti) this.detalletablaamortiLogic.getDetalleTablaAmortis().toArray()[this.jTableDatosDetalleTablaAmorti.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalletablaamorti =(DetalleTablaAmorti) this.detalletablaamortis.toArray()[this.jTableDatosDetalleTablaAmorti.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarDetalleTablaAmorti(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDetalleTablaAmorti==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDetalleTablaAmorti.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesDetalleTablaAmorti(true);
			//this.isEsNuevoDetalleTablaAmorti=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamorti =(DetalleTablaAmorti) this.detalletablaamortiLogic.getDetalleTablaAmortis().toArray()[this.jTableDatosDetalleTablaAmorti.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.detalletablaamorti =(DetalleTablaAmorti) this.detalletablaamortis.toArray()[this.jTableDatosDetalleTablaAmorti.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.detalletablaamorti.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesDetalleTablaAmorti("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesDetalleTablaAmorti(false) ;
			
			if(DetalleTablaAmortiJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDetalleTablaAmorti(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetalleTablaAmorti(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
					
	
	public void recargarComboTablaTablaAmorti(List<TablaAmorti> tablaamortisForeignKey)throws Exception{
		TableColumn tableColumnTablaAmorti=this.jTableDatosDetalleTablaAmorti.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleTablaAmorti,DetalleTablaAmortiConstantesFunciones.LABEL_IDTABLAAMORTI));
		TableCellEditor tableCellEditorTablaAmorti =tableColumnTablaAmorti.getCellEditor();

		TablaAmortiTableCell tablaamortiTableCellFk=(TablaAmortiTableCell)tableCellEditorTablaAmorti;

		if(tablaamortiTableCellFk!=null) {
			tablaamortiTableCellFk.settablaamortisForeignKey(tablaamortisForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDetalleTablaAmorti.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tablaamortiTableCellFk.setRowActual(intSelectedRow);
			//tablaamortiTableCellFk.settablaamortisForeignKeyActual(tablaamortisForeignKey);
		//}


		if(tablaamortiTableCellFk!=null) {
			tablaamortiTableCellFk.RecargarTablaAmortisForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaAnio(List<Anio> aniosForeignKey)throws Exception{
		TableColumn tableColumnAnio=this.jTableDatosDetalleTablaAmorti.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleTablaAmorti,DetalleTablaAmortiConstantesFunciones.LABEL_IDANIO));
		TableCellEditor tableCellEditorAnio =tableColumnAnio.getCellEditor();

		AnioTableCell anioTableCellFk=(AnioTableCell)tableCellEditorAnio;

		if(anioTableCellFk!=null) {
			anioTableCellFk.setaniosForeignKey(aniosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDetalleTablaAmorti.getSelectedRow();

		//if(intSelectedRow<=0) {
			//anioTableCellFk.setRowActual(intSelectedRow);
			//anioTableCellFk.setaniosForeignKeyActual(aniosForeignKey);
		//}


		if(anioTableCellFk!=null) {
			anioTableCellFk.RecargarAniosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaMes(List<Mes> messForeignKey)throws Exception{
		TableColumn tableColumnMes=this.jTableDatosDetalleTablaAmorti.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleTablaAmorti,DetalleTablaAmortiConstantesFunciones.LABEL_IDMES));
		TableCellEditor tableCellEditorMes =tableColumnMes.getCellEditor();

		MesTableCell mesTableCellFk=(MesTableCell)tableCellEditorMes;

		if(mesTableCellFk!=null) {
			mesTableCellFk.setmessForeignKey(messForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDetalleTablaAmorti.getSelectedRow();

		//if(intSelectedRow<=0) {
			//mesTableCellFk.setRowActual(intSelectedRow);
			//mesTableCellFk.setmessForeignKeyActual(messForeignKey);
		//}


		if(mesTableCellFk!=null) {
			mesTableCellFk.RecargarMessForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarDetalleTablaAmortiActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamortiLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesDetalleTablaAmorti(false);
			
			//if(!this.isEsNuevoDetalleTablaAmorti) {								
				int intSelectedRow = this.jTableDatosDetalleTablaAmorti.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalletablaamorti =(DetalleTablaAmorti) this.detalletablaamortiLogic.getDetalleTablaAmortis().toArray()[this.jTableDatosDetalleTablaAmorti.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalletablaamorti =(DetalleTablaAmorti) this.detalletablaamortis.toArray()[this.jTableDatosDetalleTablaAmorti.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(DetalleTablaAmortiJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualDetalleTablaAmorti(this.detalletablaamorti,true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleTablaAmorti(this.detalletablaamorti);
				
			}
			
			if(this.permiteMantenimiento(this.detalletablaamorti)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.detalletablaamortiSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoDetalleTablaAmorti=true;
					this.inicializarActualizarBindingTablaDetalleTablaAmorti(false);
					this.isEsNuevoDetalleTablaAmorti=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoDetalleTablaAmorti=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoDetalleTablaAmorti=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDetalleTablaAmorti(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDetalleTablaAmorti(false);
				
				this.habilitarDeshabilitarControlesDetalleTablaAmorti(false);
			
												
				
				if(DetalleTablaAmortiJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleDetalleTablaAmorti();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoDetalleTablaAmortiActionPerformed(evt,detalletablaamortiSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualDetalleTablaAmorti(this.detalletablaamorti,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosDetalleTablaAmorti.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,detalletablaamortiSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamortiLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.detalletablaamorti.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(DetalleTablaAmorti.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleTablaAmorti.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamortiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamortiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarDetalleTablaAmortiActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamortiLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosDetalleTablaAmorti.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamorti =(DetalleTablaAmorti) this.detalletablaamortiLogic.getDetalleTablaAmortis().toArray()[this.jTableDatosDetalleTablaAmorti.convertRowIndexToModel(intSelectedRow)];
				this.detalletablaamorti.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.detalletablaamorti =(DetalleTablaAmorti) this.detalletablaamortis.toArray()[this.jTableDatosDetalleTablaAmorti.convertRowIndexToModel(intSelectedRow)];
				this.detalletablaamorti.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.detalletablaamorti)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.detalletablaamortiSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((DetalleTablaAmortiModel) this.jTableDatosDetalleTablaAmorti.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoDetalleTablaAmorti=true;
				this.inicializarActualizarBindingTablaDetalleTablaAmorti(false);
				this.isEsNuevoDetalleTablaAmorti=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDetalleTablaAmorti(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDetalleTablaAmorti(false);
				
				this.habilitarDeshabilitarControlesDetalleTablaAmorti(false);
				
				
				
				if(DetalleTablaAmortiJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleDetalleTablaAmorti();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamortiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamortiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamortiLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarDetalleTablaAmortiActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosDetalleTablaAmorti.getRowCount()>=1) {
				jTableDatosDetalleTablaAmorti.removeRowSelectionInterval(0, jTableDatosDetalleTablaAmorti.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesDetalleTablaAmorti(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaDetalleTablaAmorti(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDetalleTablaAmorti(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetalleTablaAmorti(false) ;
			
			this.isEsNuevoDetalleTablaAmorti=false;
			
			if(DetalleTablaAmortiJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleDetalleTablaAmorti();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosDetalleTablaAmortiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamortiLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingDetalleTablaAmorti(false);
				
				//SI ES MANUAL
				if(DetalleTablaAmortiJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualDetalleTablaAmorti();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamortiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamortiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamortiLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosDetalleTablaAmortiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoDetalleTablaAmorti--;			
			//DetalleTablaAmorti detalletablaamortiAux= new DetalleTablaAmorti();			
			//detalletablaamortiAux.setId(this.iIdNuevoDetalleTablaAmorti);
			
			if(this.jInternalFrameDetalleFormDetalleTablaAmorti==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaDetalleTablaAmorti();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysDetalleTablaAmorti(this.detalletablaamorti);
			
			this.detalletablaamorti.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.detalletablaamortiLogic.getDetalleTablaAmortis().add(this.detalletablaamortiAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.detalletablaamortis.add(this.detalletablaamortiAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaDetalleTablaAmorti(false);
			
			this.jTableDatosDetalleTablaAmorti.setRowSelectionInterval(this.getIndiceNuevoDetalleTablaAmorti(), this.getIndiceNuevoDetalleTablaAmorti());
			
			int iLastRow =  this.jTableDatosDetalleTablaAmorti.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosDetalleTablaAmorti.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosDetalleTablaAmorti.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaDetalleTablaAmorti(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionDetalleTablaAmortiActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamortiLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingDetalleTablaAmorti(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetalleTablaAmorti(false);
			
			//SI ES MANUAL
			if(DetalleTablaAmortiJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDetalleTablaAmorti();
			}
			
			//this.abrirFrameTreeDetalleTablaAmorti();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamortiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamortiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamortiLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionDetalleTablaAmortiActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Detalle Tabla AmortiS ?", "MANTENIMIENTO DE Detalle Tabla Amorti", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionDetalleTablaAmorti.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralDetalleTablaAmorti();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.detalletablaamortiReturnGeneral=detalletablaamortiLogic.procesarImportacionDetalleTablaAmortisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.detalletablaamortiParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarDetalleTablaAmortiReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionDetalleTablaAmortiActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionDetalleTablaAmorti.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionDetalleTablaAmorti.setFileImportacion(this.jInternalFrameImportacionDetalleTablaAmorti.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionDetalleTablaAmorti.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionDetalleTablaAmorti.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionDetalleTablaAmorti.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionDetalleTablaAmorti.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoDetalleTablaAmortiActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<DetalleTablaAmorti> detalletablaamortisSeleccionados=new ArrayList<DetalleTablaAmorti>();		

		detalletablaamortisSeleccionados=this.getDetalleTablaAmortisSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetalleTablaAmorti.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetalleTablaAmorti.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("DetalleTablaAmortiBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"DetalleTablaAmortiBaseDesign.jrxml";
			
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
			
			this.generarReporteDetalleTablaAmortis("Todos",detalletablaamortisSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalletablaamortiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Tabla Amorti",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoDetalleTablaAmorti.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleTablaAmorti.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DetalleTablaAmortiConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleTablaAmortiConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleTablaAmortiConstantesFunciones.LABEL_IDEJERCICIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Ejercicio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Ejercicio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Ejercicio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Ejercicio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleTablaAmortiConstantesFunciones.LABEL_IDPERIODO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Periodo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Periodo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Periodo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Periodo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleTablaAmortiConstantesFunciones.LABEL_IDTABLAAMORTI:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TablaAmorti_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TablaAmorti_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TablaAmorti_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TablaAmorti_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleTablaAmortiConstantesFunciones.LABEL_VALOR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleTablaAmortiConstantesFunciones.LABEL_INTERES:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_teres_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_teres_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_teres_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_teres_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleTablaAmortiConstantesFunciones.LABEL_CAPITAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_pital_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_pital_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_pital_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_pital_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleTablaAmortiConstantesFunciones.LABEL_FECHAINICIO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaInicio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaInicio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaInicio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaInicio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleTablaAmortiConstantesFunciones.LABEL_FECHAFIN:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaFin_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaFin_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaFin_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaFin_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleTablaAmortiConstantesFunciones.LABEL_DESCRIPCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scripcion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scripcion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scripcion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scripcion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleTablaAmortiConstantesFunciones.LABEL_IDANIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Anio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Anio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Anio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Anio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleTablaAmortiConstantesFunciones.LABEL_IDMES:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Mes_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Mes_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Mes_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Mes_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoDetalleTablaAmorti.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoDetalleTablaAmorti.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoDetalleTablaAmorti.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case DetalleTablaAmortiConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case DetalleTablaAmortiConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case DetalleTablaAmortiConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoria="id_ejercicio";
					break;

				case DetalleTablaAmortiConstantesFunciones.LABEL_IDPERIODO:
					sNombreCampoCategoria="id_periodo";
					break;

				case DetalleTablaAmortiConstantesFunciones.LABEL_IDTABLAAMORTI:
					sNombreCampoCategoria="id_tabla_amorti";
					break;

				case DetalleTablaAmortiConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoria="valor";
					break;

				case DetalleTablaAmortiConstantesFunciones.LABEL_INTERES:
					sNombreCampoCategoria="interes";
					break;

				case DetalleTablaAmortiConstantesFunciones.LABEL_CAPITAL:
					sNombreCampoCategoria="capital";
					break;

				case DetalleTablaAmortiConstantesFunciones.LABEL_FECHAINICIO:
					sNombreCampoCategoria="fecha_inicio";
					break;

				case DetalleTablaAmortiConstantesFunciones.LABEL_FECHAFIN:
					sNombreCampoCategoria="fecha_fin";
					break;

				case DetalleTablaAmortiConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;

				case DetalleTablaAmortiConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoria="id_anio";
					break;

				case DetalleTablaAmortiConstantesFunciones.LABEL_IDMES:
					sNombreCampoCategoria="id_mes";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoDetalleTablaAmorti.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case DetalleTablaAmortiConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case DetalleTablaAmortiConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case DetalleTablaAmortiConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoriaValor="id_ejercicio";
					break;

				case DetalleTablaAmortiConstantesFunciones.LABEL_IDPERIODO:
					sNombreCampoCategoriaValor="id_periodo";
					break;

				case DetalleTablaAmortiConstantesFunciones.LABEL_IDTABLAAMORTI:
					sNombreCampoCategoriaValor="id_tabla_amorti";
					break;

				case DetalleTablaAmortiConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoriaValor="valor";
					break;

				case DetalleTablaAmortiConstantesFunciones.LABEL_INTERES:
					sNombreCampoCategoriaValor="interes";
					break;

				case DetalleTablaAmortiConstantesFunciones.LABEL_CAPITAL:
					sNombreCampoCategoriaValor="capital";
					break;

				case DetalleTablaAmortiConstantesFunciones.LABEL_FECHAINICIO:
					sNombreCampoCategoriaValor="fecha_inicio";
					break;

				case DetalleTablaAmortiConstantesFunciones.LABEL_FECHAFIN:
					sNombreCampoCategoriaValor="fecha_fin";
					break;

				case DetalleTablaAmortiConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;

				case DetalleTablaAmortiConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoriaValor="id_anio";
					break;

				case DetalleTablaAmortiConstantesFunciones.LABEL_IDMES:
					sNombreCampoCategoriaValor="id_mes";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoDetalleTablaAmorti.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleTablaAmorti.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DetalleTablaAmortiConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case DetalleTablaAmortiConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case DetalleTablaAmortiConstantesFunciones.LABEL_IDEJERCICIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ejercicio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_ejercicio");
					break;

				case DetalleTablaAmortiConstantesFunciones.LABEL_IDPERIODO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Periodo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_periodo");
					break;

				case DetalleTablaAmortiConstantesFunciones.LABEL_IDTABLAAMORTI:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tabla Amorti",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tabla_amorti");
					break;

				case DetalleTablaAmortiConstantesFunciones.LABEL_VALOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor");
					break;

				case DetalleTablaAmortiConstantesFunciones.LABEL_INTERES:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Interes",sNombreCampoCategoria,sNombreCampoCategoriaValor,"interes");
					break;

				case DetalleTablaAmortiConstantesFunciones.LABEL_CAPITAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Capital",sNombreCampoCategoria,sNombreCampoCategoriaValor,"capital");
					break;

				case DetalleTablaAmortiConstantesFunciones.LABEL_FECHAINICIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Inicio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_inicio");
					break;

				case DetalleTablaAmortiConstantesFunciones.LABEL_FECHAFIN:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Fin",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_fin");
					break;

				case DetalleTablaAmortiConstantesFunciones.LABEL_DESCRIPCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descripcion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descripcion");
					break;

				case DetalleTablaAmortiConstantesFunciones.LABEL_IDANIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Anio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_anio");
					break;

				case DetalleTablaAmortiConstantesFunciones.LABEL_IDMES:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Mes",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_mes");
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
	
	public void jButtonGenerarExcelReporteDinamicoDetalleTablaAmortiActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<DetalleTablaAmorti> detalletablaamortisSeleccionados=new ArrayList<DetalleTablaAmorti>();		
		
		detalletablaamortisSeleccionados=this.getDetalleTablaAmortisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalletablaamorti";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("DetalleTablaAmortis");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoDetalleTablaAmorti.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleTablaAmorti.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case DetalleTablaAmortiConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleTablaAmortiConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(DetalleTablaAmorti detalletablaamorti:detalletablaamortisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalletablaamorti.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleTablaAmortiConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleTablaAmortiConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(DetalleTablaAmorti detalletablaamorti:detalletablaamortisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalletablaamorti.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleTablaAmortiConstantesFunciones.LABEL_IDEJERCICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleTablaAmortiConstantesFunciones.LABEL_IDEJERCICIO);
					iRow++;

					for(DetalleTablaAmorti detalletablaamorti:detalletablaamortisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalletablaamorti.getejercicio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleTablaAmortiConstantesFunciones.LABEL_IDPERIODO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleTablaAmortiConstantesFunciones.LABEL_IDPERIODO);
					iRow++;

					for(DetalleTablaAmorti detalletablaamorti:detalletablaamortisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalletablaamorti.getperiodo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleTablaAmortiConstantesFunciones.LABEL_IDTABLAAMORTI:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleTablaAmortiConstantesFunciones.LABEL_IDTABLAAMORTI);
					iRow++;

					for(DetalleTablaAmorti detalletablaamorti:detalletablaamortisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalletablaamorti.gettablaamorti_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleTablaAmortiConstantesFunciones.LABEL_VALOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleTablaAmortiConstantesFunciones.LABEL_VALOR);
					iRow++;

					for(DetalleTablaAmorti detalletablaamorti:detalletablaamortisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalletablaamorti.getvalor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleTablaAmortiConstantesFunciones.LABEL_INTERES:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleTablaAmortiConstantesFunciones.LABEL_INTERES);
					iRow++;

					for(DetalleTablaAmorti detalletablaamorti:detalletablaamortisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalletablaamorti.getinteres());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleTablaAmortiConstantesFunciones.LABEL_CAPITAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleTablaAmortiConstantesFunciones.LABEL_CAPITAL);
					iRow++;

					for(DetalleTablaAmorti detalletablaamorti:detalletablaamortisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalletablaamorti.getcapital());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleTablaAmortiConstantesFunciones.LABEL_FECHAINICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleTablaAmortiConstantesFunciones.LABEL_FECHAINICIO);
					iRow++;

					for(DetalleTablaAmorti detalletablaamorti:detalletablaamortisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalletablaamorti.getfecha_inicio());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleTablaAmortiConstantesFunciones.LABEL_FECHAFIN:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleTablaAmortiConstantesFunciones.LABEL_FECHAFIN);
					iRow++;

					for(DetalleTablaAmorti detalletablaamorti:detalletablaamortisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalletablaamorti.getfecha_fin());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleTablaAmortiConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleTablaAmortiConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(DetalleTablaAmorti detalletablaamorti:detalletablaamortisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalletablaamorti.getdescripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleTablaAmortiConstantesFunciones.LABEL_IDANIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleTablaAmortiConstantesFunciones.LABEL_IDANIO);
					iRow++;

					for(DetalleTablaAmorti detalletablaamorti:detalletablaamortisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalletablaamorti.getanio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleTablaAmortiConstantesFunciones.LABEL_IDMES:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleTablaAmortiConstantesFunciones.LABEL_IDMES);
					iRow++;

					for(DetalleTablaAmorti detalletablaamorti:detalletablaamortisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalletablaamorti.getmes_descripcion());
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
			//	this.getFilaCabeceraExportarExcelDetalleTablaAmorti(row);				
			//	iRow++;
			//}				
			
			//for(DetalleTablaAmorti detalletablaamortiAux:detalletablaamortisSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelDetalleTablaAmorti(detalletablaamortiAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalletablaamortiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Tabla Amorti",JOptionPane.INFORMATION_MESSAGE);
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
				this.detalletablaamortiLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetalleTablaAmorti(false);
			
			//SI ES MANUAL
			if(DetalleTablaAmortiJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDetalleTablaAmorti();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamortiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamortiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamortiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresDetalleTablaAmortiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamortiLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetalleTablaAmorti(false);
			
			//SI ES MANUAL
			if(DetalleTablaAmortiJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDetalleTablaAmorti();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamortiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamortiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamortiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesDetalleTablaAmortiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamortiLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetalleTablaAmorti(false);
			
			//SI ES MANUAL
			if(DetalleTablaAmortiJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDetalleTablaAmorti();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamortiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamortiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamortiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaDetalleTablaAmorti() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosDetalleTablaAmorti.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosDetalleTablaAmorti.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosDetalleTablaAmorti.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosDetalleTablaAmorti.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosDetalleTablaAmorti.setMinimumSize(dimensionMinimum);
		this.jTableDatosDetalleTablaAmorti.setMaximumSize(dimensionMaximum);
		this.jTableDatosDetalleTablaAmorti.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingDetalleTablaAmorti(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingDetalleTablaAmorti(esInicializar,true);
	}
	
	public void inicializarActualizarBindingDetalleTablaAmorti(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaDetalleTablaAmorti(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesDetalleTablaAmorti(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.detalletablaamortiSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasDetalleTablaAmorti(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDetalleTablaAmorti(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesDetalleTablaAmorti(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !DetalleTablaAmortiJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!DetalleTablaAmortiJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualDetalleTablaAmorti() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaDetalleTablaAmorti();
		
		this.inicializarActualizarBindingBotonesManualDetalleTablaAmorti(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.detalletablaamortiSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualDetalleTablaAmorti();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDetalleTablaAmorti() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualDetalleTablaAmorti(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualDetalleTablaAmorti(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosDetalleTablaAmorti.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosDetalleTablaAmorti.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteDetalleTablaAmorti.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormDetalleTablaAmorti.jCheckBoxPostAccionNuevoDetalleTablaAmorti.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormDetalleTablaAmorti.jCheckBoxPostAccionSinCerrarDetalleTablaAmorti.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormDetalleTablaAmorti.jCheckBoxPostAccionSinMensajeDetalleTablaAmorti.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosDetalleTablaAmorti.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosDetalleTablaAmorti.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteDetalleTablaAmorti.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) {
				this.jInternalFrameDetalleFormDetalleTablaAmorti.jCheckBoxPostAccionNuevoDetalleTablaAmorti.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormDetalleTablaAmorti.jCheckBoxPostAccionSinCerrarDetalleTablaAmorti.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormDetalleTablaAmorti.jCheckBoxPostAccionSinMensajeDetalleTablaAmorti.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionDetalleTablaAmorti.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionDetalleTablaAmorti.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxTiposAccionesFormularioDetalleTablaAmorti.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesDetalleTablaAmorti.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoDetalleTablaAmorti!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetalleTablaAmorti.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesDetalleTablaAmorti.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesDetalleTablaAmorti.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarDetalleTablaAmorti.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesDetalleTablaAmorti.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoDetalleTablaAmorti!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetalleTablaAmorti.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesDetalleTablaAmorti.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralDetalleTablaAmorti.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesDetalleTablaAmorti(Boolean esInicializar) throws Exception {
		try	{	
			if(DetalleTablaAmortiJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualDetalleTablaAmorti(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesDetalleTablaAmorti() throws Exception {
		try	{
			if(DetalleTablaAmortiJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualDetalleTablaAmorti();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDetalleTablaAmorti() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxTiposAccionesFormularioDetalleTablaAmorti.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxTiposAccionesFormularioDetalleTablaAmorti.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualDetalleTablaAmorti() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesDetalleTablaAmorti.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesDetalleTablaAmorti.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesDetalleTablaAmorti.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesDetalleTablaAmorti.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesDetalleTablaAmorti.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesDetalleTablaAmorti.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionDetalleTablaAmorti.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionDetalleTablaAmorti.addItem(reporte);
			}
			
			
			if(!this.detalletablaamortiSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionDetalleTablaAmorti.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionDetalleTablaAmorti.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesDetalleTablaAmorti.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesDetalleTablaAmorti.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesDetalleTablaAmorti.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesDetalleTablaAmorti.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxTiposAccionesFormularioDetalleTablaAmorti.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxTiposAccionesFormularioDetalleTablaAmorti.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarDetalleTablaAmorti.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarDetalleTablaAmorti.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarDetalleTablaAmorti.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDetalleTablaAmorti();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDetalleTablaAmorti() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDetalleTablaAmorti!=null) {
				this.jInternalFrameReporteDinamicoDetalleTablaAmorti.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoDetalleTablaAmorti.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDetalleTablaAmorti!=null) {
				this.jInternalFrameReporteDinamicoDetalleTablaAmorti.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoDetalleTablaAmorti.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoDetalleTablaAmorti!=null) {
				
				if(this.jInternalFrameReporteDinamicoDetalleTablaAmorti.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDetalleTablaAmorti.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDetalleTablaAmorti.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoDetalleTablaAmorti.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDetalleTablaAmorti.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDetalleTablaAmorti.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoDetalleTablaAmorti.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoDetalleTablaAmorti.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=DetalleTablaAmortiConstantesFunciones.getTiposSeleccionarDetalleTablaAmorti(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoDetalleTablaAmorti.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoDetalleTablaAmorti.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoDetalleTablaAmorti.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=DetalleTablaAmortiConstantesFunciones.getTiposSeleccionarDetalleTablaAmorti(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoDetalleTablaAmorti.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoDetalleTablaAmorti.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoDetalleTablaAmorti.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=DetalleTablaAmortiConstantesFunciones.getTiposSeleccionarDetalleTablaAmorti(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDetalleTablaAmorti.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoDetalleTablaAmorti.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoDetalleTablaAmorti.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoDetalleTablaAmorti.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualDetalleTablaAmorti()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_tabla_amortiFK_IdTablaAmortiDetalleTablaAmorti.getSelectedItem()!=null){this.id_tabla_amortiFK_IdTablaAmorti=((TablaAmorti)this.jComboBoxid_tabla_amortiFK_IdTablaAmortiDetalleTablaAmorti.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasDetalleTablaAmorti(Boolean esInicializar) throws Exception {				
		if(DetalleTablaAmortiJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualDetalleTablaAmorti();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaDetalleTablaAmorti() throws Exception {
		this.inicializarActualizarBindingTablaDetalleTablaAmorti(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByDetalleTablaAmorti() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByDetalleTablaAmorti.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByDetalleTablaAmorti.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDetalleTablaAmorti.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new DetalleTablaAmortiPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByDetalleTablaAmorti.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDetalleTablaAmorti.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new DetalleTablaAmortiPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosDetalleTablaAmortiOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleTablaAmortiOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new DetalleTablaAmortiPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByDetalleTablaAmorti.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDetalleTablaAmorti.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new DetalleTablaAmortiPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByDetalleTablaAmorti.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaDetalleTablaAmorti(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=detalletablaamortiLogic.getDetalleTablaAmortis().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=detalletablaamortis.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(DetalleTablaAmortiJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosDetalleTablaAmorti.setModel(new DetalleTablaAmortiModel(this.detalletablaamortiLogic.getDetalleTablaAmortis(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosDetalleTablaAmorti.setModel(new DetalleTablaAmortiModel(this.detalletablaamortis,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByDetalleTablaAmorti!=null && this.jInternalFrameOrderByDetalleTablaAmorti.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByDetalleTablaAmorti();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosDetalleTablaAmorti.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleTablaAmorti,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new DetalleTablaAmortiPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+DetalleTablaAmortiConstantesFunciones.SCLASSWEBTITULO,detalletablaamortiConstantesFunciones.resaltarSeleccionarDetalleTablaAmorti,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+DetalleTablaAmortiConstantesFunciones.SCLASSWEBTITULO,detalletablaamortiConstantesFunciones.resaltarSeleccionarDetalleTablaAmorti,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosDetalleTablaAmorti.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleTablaAmorti,DetalleTablaAmortiConstantesFunciones.LABEL_ID));

		if(this.detalletablaamortiConstantesFunciones.mostraridDetalleTablaAmorti && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleTablaAmortiConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detalletablaamortiConstantesFunciones.resaltaridDetalleTablaAmorti,this.detalletablaamortiConstantesFunciones.activaridDetalleTablaAmorti,iSizeTabla,this,true,"idDetalleTablaAmorti","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detalletablaamortiConstantesFunciones.resaltaridDetalleTablaAmorti,this.detalletablaamortiConstantesFunciones.activaridDetalleTablaAmorti,this,true,"idDetalleTablaAmorti","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleTablaAmorti.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleTablaAmorti,DetalleTablaAmortiConstantesFunciones.LABEL_IDEMPRESA));

		if(this.detalletablaamortiConstantesFunciones.mostrarid_empresaDetalleTablaAmorti && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleTablaAmortiConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.detalletablaamortiConstantesFunciones.resaltarid_empresaDetalleTablaAmorti,this,this.detalletablaamortiConstantesFunciones.activarid_empresaDetalleTablaAmorti,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.detalletablaamortiConstantesFunciones.resaltarid_empresaDetalleTablaAmorti,this,this.detalletablaamortiConstantesFunciones.activarid_empresaDetalleTablaAmorti,false,"id_empresaDetalleTablaAmorti","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleTablaAmortiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleTablaAmorti.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleTablaAmorti,DetalleTablaAmortiConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.detalletablaamortiConstantesFunciones.mostrarid_sucursalDetalleTablaAmorti && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleTablaAmortiConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.detalletablaamortiConstantesFunciones.resaltarid_sucursalDetalleTablaAmorti,this,this.detalletablaamortiConstantesFunciones.activarid_sucursalDetalleTablaAmorti,iSizeTabla));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.detalletablaamortiConstantesFunciones.resaltarid_sucursalDetalleTablaAmorti,this,this.detalletablaamortiConstantesFunciones.activarid_sucursalDetalleTablaAmorti,false,"id_sucursalDetalleTablaAmorti","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleTablaAmortiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleTablaAmorti.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleTablaAmorti,DetalleTablaAmortiConstantesFunciones.LABEL_IDEJERCICIO));

		if(this.detalletablaamortiConstantesFunciones.mostrarid_ejercicioDetalleTablaAmorti && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleTablaAmortiConstantesFunciones.LABEL_IDEJERCICIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EjercicioTableCell(this.ejerciciosForeignKey,this.detalletablaamortiConstantesFunciones.resaltarid_ejercicioDetalleTablaAmorti,this,this.detalletablaamortiConstantesFunciones.activarid_ejercicioDetalleTablaAmorti,iSizeTabla));
			tableColumn.setCellEditor(new EjercicioTableCell(this.ejerciciosForeignKey,this.detalletablaamortiConstantesFunciones.resaltarid_ejercicioDetalleTablaAmorti,this,this.detalletablaamortiConstantesFunciones.activarid_ejercicioDetalleTablaAmorti,false,"id_ejercicioDetalleTablaAmorti","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleTablaAmortiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleTablaAmorti.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleTablaAmorti,DetalleTablaAmortiConstantesFunciones.LABEL_IDPERIODO));

		if(this.detalletablaamortiConstantesFunciones.mostrarid_periodoDetalleTablaAmorti && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleTablaAmortiConstantesFunciones.LABEL_IDPERIODO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new PeriodoTableCell(this.periodosForeignKey,this.detalletablaamortiConstantesFunciones.resaltarid_periodoDetalleTablaAmorti,this,this.detalletablaamortiConstantesFunciones.activarid_periodoDetalleTablaAmorti,iSizeTabla));
			tableColumn.setCellEditor(new PeriodoTableCell(this.periodosForeignKey,this.detalletablaamortiConstantesFunciones.resaltarid_periodoDetalleTablaAmorti,this,this.detalletablaamortiConstantesFunciones.activarid_periodoDetalleTablaAmorti,false,"id_periodoDetalleTablaAmorti","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleTablaAmortiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleTablaAmorti.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleTablaAmorti,DetalleTablaAmortiConstantesFunciones.LABEL_IDTABLAAMORTI));

		if(this.detalletablaamortiConstantesFunciones.mostrarid_tabla_amortiDetalleTablaAmorti && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleTablaAmortiConstantesFunciones.LABEL_IDTABLAAMORTI,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TablaAmortiTableCell(this.tablaamortisForeignKey,this.detalletablaamortiConstantesFunciones.resaltarid_tabla_amortiDetalleTablaAmorti,this,this.detalletablaamortiConstantesFunciones.activarid_tabla_amortiDetalleTablaAmorti,iSizeTabla));
			tableColumn.setCellEditor(new TablaAmortiTableCell(this.tablaamortisForeignKey,this.detalletablaamortiConstantesFunciones.resaltarid_tabla_amortiDetalleTablaAmorti,this,this.detalletablaamortiConstantesFunciones.activarid_tabla_amortiDetalleTablaAmorti,true,"id_tabla_amortiDetalleTablaAmorti","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleTablaAmortiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleTablaAmorti.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleTablaAmorti,DetalleTablaAmortiConstantesFunciones.LABEL_VALOR));

		if(this.detalletablaamortiConstantesFunciones.mostrarvalorDetalleTablaAmorti && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleTablaAmortiConstantesFunciones.LABEL_VALOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detalletablaamortiConstantesFunciones.resaltarvalorDetalleTablaAmorti,this.detalletablaamortiConstantesFunciones.activarvalorDetalleTablaAmorti,iSizeTabla,this,true,"valorDetalleTablaAmorti","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detalletablaamortiConstantesFunciones.resaltarvalorDetalleTablaAmorti,this.detalletablaamortiConstantesFunciones.activarvalorDetalleTablaAmorti,this,true,"valorDetalleTablaAmorti","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetalleTablaAmortiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleTablaAmorti.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleTablaAmorti,DetalleTablaAmortiConstantesFunciones.LABEL_INTERES));

		if(this.detalletablaamortiConstantesFunciones.mostrarinteresDetalleTablaAmorti && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleTablaAmortiConstantesFunciones.LABEL_INTERES,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detalletablaamortiConstantesFunciones.resaltarinteresDetalleTablaAmorti,this.detalletablaamortiConstantesFunciones.activarinteresDetalleTablaAmorti,iSizeTabla,this,true,"interesDetalleTablaAmorti","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detalletablaamortiConstantesFunciones.resaltarinteresDetalleTablaAmorti,this.detalletablaamortiConstantesFunciones.activarinteresDetalleTablaAmorti,this,true,"interesDetalleTablaAmorti","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetalleTablaAmortiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleTablaAmorti.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleTablaAmorti,DetalleTablaAmortiConstantesFunciones.LABEL_CAPITAL));

		if(this.detalletablaamortiConstantesFunciones.mostrarcapitalDetalleTablaAmorti && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleTablaAmortiConstantesFunciones.LABEL_CAPITAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detalletablaamortiConstantesFunciones.resaltarcapitalDetalleTablaAmorti,this.detalletablaamortiConstantesFunciones.activarcapitalDetalleTablaAmorti,iSizeTabla,this,true,"capitalDetalleTablaAmorti","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detalletablaamortiConstantesFunciones.resaltarcapitalDetalleTablaAmorti,this.detalletablaamortiConstantesFunciones.activarcapitalDetalleTablaAmorti,this,true,"capitalDetalleTablaAmorti","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetalleTablaAmortiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleTablaAmorti.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleTablaAmorti,DetalleTablaAmortiConstantesFunciones.LABEL_FECHAINICIO));

		if(this.detalletablaamortiConstantesFunciones.mostrarfecha_inicioDetalleTablaAmorti && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleTablaAmortiConstantesFunciones.LABEL_FECHAINICIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.detalletablaamortiConstantesFunciones.resaltarfecha_inicioDetalleTablaAmorti,this.detalletablaamortiConstantesFunciones.activarfecha_inicioDetalleTablaAmorti,iSizeTabla,this,true,"fecha_inicioDetalleTablaAmorti","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.detalletablaamortiConstantesFunciones.resaltarfecha_inicioDetalleTablaAmorti,this.detalletablaamortiConstantesFunciones.activarfecha_inicioDetalleTablaAmorti,this,true,"fecha_inicioDetalleTablaAmorti","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new DetalleTablaAmortiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleTablaAmorti.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleTablaAmorti,DetalleTablaAmortiConstantesFunciones.LABEL_FECHAFIN));

		if(this.detalletablaamortiConstantesFunciones.mostrarfecha_finDetalleTablaAmorti && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleTablaAmortiConstantesFunciones.LABEL_FECHAFIN,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.detalletablaamortiConstantesFunciones.resaltarfecha_finDetalleTablaAmorti,this.detalletablaamortiConstantesFunciones.activarfecha_finDetalleTablaAmorti,iSizeTabla,this,true,"fecha_finDetalleTablaAmorti","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.detalletablaamortiConstantesFunciones.resaltarfecha_finDetalleTablaAmorti,this.detalletablaamortiConstantesFunciones.activarfecha_finDetalleTablaAmorti,this,true,"fecha_finDetalleTablaAmorti","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new DetalleTablaAmortiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleTablaAmorti.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleTablaAmorti,DetalleTablaAmortiConstantesFunciones.LABEL_DESCRIPCION));

		if(this.detalletablaamortiConstantesFunciones.mostrardescripcionDetalleTablaAmorti && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleTablaAmortiConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.detalletablaamortiConstantesFunciones.resaltardescripcionDetalleTablaAmorti,this.detalletablaamortiConstantesFunciones.activardescripcionDetalleTablaAmorti,iSizeTabla,this,true,"descripcionDetalleTablaAmorti","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detalletablaamortiConstantesFunciones.resaltardescripcionDetalleTablaAmorti,this.detalletablaamortiConstantesFunciones.activardescripcionDetalleTablaAmorti,this,true,"descripcionDetalleTablaAmorti","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleTablaAmortiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleTablaAmorti.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleTablaAmorti,DetalleTablaAmortiConstantesFunciones.LABEL_IDANIO));

		if(this.detalletablaamortiConstantesFunciones.mostrarid_anioDetalleTablaAmorti && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleTablaAmortiConstantesFunciones.LABEL_IDANIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new AnioTableCell(this.aniosForeignKey,this.detalletablaamortiConstantesFunciones.resaltarid_anioDetalleTablaAmorti,this,this.detalletablaamortiConstantesFunciones.activarid_anioDetalleTablaAmorti,iSizeTabla));
			tableColumn.setCellEditor(new AnioTableCell(this.aniosForeignKey,this.detalletablaamortiConstantesFunciones.resaltarid_anioDetalleTablaAmorti,this,this.detalletablaamortiConstantesFunciones.activarid_anioDetalleTablaAmorti,true,"id_anioDetalleTablaAmorti","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleTablaAmortiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleTablaAmorti.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleTablaAmorti,DetalleTablaAmortiConstantesFunciones.LABEL_IDMES));

		if(this.detalletablaamortiConstantesFunciones.mostrarid_mesDetalleTablaAmorti && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleTablaAmortiConstantesFunciones.LABEL_IDMES,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new MesTableCell(this.messForeignKey,this.detalletablaamortiConstantesFunciones.resaltarid_mesDetalleTablaAmorti,this,this.detalletablaamortiConstantesFunciones.activarid_mesDetalleTablaAmorti,iSizeTabla));
			tableColumn.setCellEditor(new MesTableCell(this.messForeignKey,this.detalletablaamortiConstantesFunciones.resaltarid_mesDetalleTablaAmorti,this,this.detalletablaamortiConstantesFunciones.activarid_mesDetalleTablaAmorti,true,"id_mesDetalleTablaAmorti","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleTablaAmortiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.detalletablaamortiSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.detalletablaamortiSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.detalletablaamortiSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDetalleTablaAmorti.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.detalletablaamortiSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.detalletablaamortiSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDetalleTablaAmorti.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarDetalleTablaAmorti && this.isPermisoGuardarCambiosDetalleTablaAmorti) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.detalletablaamortiSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.detalletablaamortiSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosDetalleTablaAmorti.addColumn(tableColumn);
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
			
			this.jTableDatosDetalleTablaAmorti.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDetalleTablaAmorti && this.isPermisoGuardarCambiosDetalleTablaAmorti) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDetalleTablaAmorti && this.isPermisoGuardarCambiosDetalleTablaAmorti) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosDetalleTablaAmorti.moveColumn(this.jTableDatosDetalleTablaAmorti.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosDetalleTablaAmorti.moveColumn(this.jTableDatosDetalleTablaAmorti.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosDetalleTablaAmorti.moveColumn(this.jTableDatosDetalleTablaAmorti.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosDetalleTablaAmorti.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosDetalleTablaAmorti.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosDetalleTablaAmorti,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!DetalleTablaAmortiJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosDetalleTablaAmorti.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosDetalleTablaAmorti.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!DetalleTablaAmortiJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!DetalleTablaAmortiJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosDetalleTablaAmorti.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosDetalleTablaAmorti.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosDetalleTablaAmorti.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=detalletablaamortiLogic.getDetalleTablaAmortis().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=detalletablaamortis.size()-1;
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
		//this.jTableDatosDetalleTablaAmorti.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosDetalleTablaAmorti.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosDetalleTablaAmorti();
			
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
				
				//this.isEsNuevoDetalleTablaAmorti=false;
					
				DetalleTablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.detalletablaamorti,new Object(),this.detalletablaamortiParameterGeneral,this.detalletablaamortiReturnGeneral);
			
				if(this.detalletablaamortiSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormDetalleTablaAmorti==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDetalleTablaAmorti.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDetalleTablaAmorti.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalletablaamorti =(DetalleTablaAmorti) this.detalletablaamortiLogic.getDetalleTablaAmortis().toArray()[this.jTableDatosDetalleTablaAmorti.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalletablaamorti =(DetalleTablaAmorti) this.detalletablaamortis.toArray()[this.jTableDatosDetalleTablaAmorti.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.detalletablaamorti.getsType().equals("DUPLICADO")
				   || this.detalletablaamorti.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoDetalleTablaAmorti=true;
				
				} else {
					this.isEsNuevoDetalleTablaAmorti=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.detalletablaamortiSessionBean.getEsGuardarRelacionado()) {
					if(this.detalletablaamorti.getId()>=0 && !this.detalletablaamorti.getIsNew()) {						
						this.isEsNuevoDetalleTablaAmorti=false;
						
					} else {
						this.isEsNuevoDetalleTablaAmorti=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoDetalleTablaAmorti(esRelaciones);						
				
				this.seleccionarDetalleTablaAmorti(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.detalletablaamorti.getId()<0) {
					this.isEsNuevoDetalleTablaAmorti=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarDetalleTablaAmorti(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarDetalleTablaAmorti(evt,rowIndex);
				}	
				
				if(this.detalletablaamortiSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion DetalleTablaAmorti: " + this.dDif); 
					}
				}								
				
				DetalleTablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.detalletablaamorti,new Object(),this.detalletablaamortiParameterGeneral,this.detalletablaamortiReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarDetalleTablaAmorti(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.detalletablaamorti)) {
					if(this.detalletablaamorti.getId()>0) {
						this.detalletablaamorti.setIsDeleted(true);
						
						this.detalletablaamortisEliminados.add(this.detalletablaamorti);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.detalletablaamortiLogic.getDetalleTablaAmortis().remove(this.detalletablaamorti);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.detalletablaamortis.remove(this.detalletablaamorti);				
					}
					
					
					((DetalleTablaAmortiModel) this.jTableDatosDetalleTablaAmorti.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaDetalleTablaAmorti(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarDetalleTablaAmorti(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoDetalleTablaAmorti) {
			
			if(this.jInternalFrameDetalleFormDetalleTablaAmorti==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDetalleTablaAmorti.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDetalleTablaAmorti.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalletablaamorti =(DetalleTablaAmorti) this.detalletablaamortiLogic.getDetalleTablaAmortis().toArray()[this.jTableDatosDetalleTablaAmorti.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalletablaamorti =(DetalleTablaAmorti) this.detalletablaamortis.toArray()[this.jTableDatosDetalleTablaAmorti.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(DetalleTablaAmortiJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioDetalleTablaAmorti(this.detalletablaamorti);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.detalletablaamortiConstantesFunciones.cargarid_empresaDetalleTablaAmorti || this.detalletablaamortiConstantesFunciones.event_dependid_empresaDetalleTablaAmorti) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.detalletablaamorti.getid_empresa());
									//this.inicializarActualizarBindingDetalleTablaAmorti(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(detalletablaamorti.getEmpresa()!=null) {
							this.empresasForeignKey.add(detalletablaamorti.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.detalletablaamorti.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.detalletablaamortiConstantesFunciones.cargarid_sucursalDetalleTablaAmorti || this.detalletablaamortiConstantesFunciones.event_dependid_sucursalDetalleTablaAmorti) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.detalletablaamorti.getid_sucursal());
									//this.inicializarActualizarBindingDetalleTablaAmorti(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(detalletablaamorti.getSucursal()!=null) {
							this.sucursalsForeignKey.add(detalletablaamorti.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.detalletablaamorti.getid_sucursal(),false,"Formulario");

					//Ejercicio
					if(!this.detalletablaamortiConstantesFunciones.cargarid_ejercicioDetalleTablaAmorti || this.detalletablaamortiConstantesFunciones.event_dependid_ejercicioDetalleTablaAmorti) {
						//this.cargarCombosEjerciciosForeignKeyLista(" where id="+this.detalletablaamorti.getid_ejercicio());
									//this.inicializarActualizarBindingDetalleTablaAmorti(false,false);
						this.ejerciciosForeignKey=new ArrayList<Ejercicio>();

						if(detalletablaamorti.getEjercicio()!=null) {
							this.ejerciciosForeignKey.add(detalletablaamorti.getEjercicio());
						}

						this.addItemDefectoCombosForeignKeyEjercicio();
						this.cargarCombosFrameEjerciciosForeignKey("Todos");
					}
					this.setActualEjercicioForeignKey(this.detalletablaamorti.getid_ejercicio(),false,"Formulario");

					//Periodo
					if(!this.detalletablaamortiConstantesFunciones.cargarid_periodoDetalleTablaAmorti || this.detalletablaamortiConstantesFunciones.event_dependid_periodoDetalleTablaAmorti) {
						//this.cargarCombosPeriodosForeignKeyLista(" where id="+this.detalletablaamorti.getid_periodo());
									//this.inicializarActualizarBindingDetalleTablaAmorti(false,false);
						this.periodosForeignKey=new ArrayList<Periodo>();

						if(detalletablaamorti.getPeriodo()!=null) {
							this.periodosForeignKey.add(detalletablaamorti.getPeriodo());
						}

						this.addItemDefectoCombosForeignKeyPeriodo();
						this.cargarCombosFramePeriodosForeignKey("Todos");
					}
					this.setActualPeriodoForeignKey(this.detalletablaamorti.getid_periodo(),false,"Formulario");

					//TablaAmorti
					if(!this.detalletablaamortiConstantesFunciones.cargarid_tabla_amortiDetalleTablaAmorti || this.detalletablaamortiConstantesFunciones.event_dependid_tabla_amortiDetalleTablaAmorti) {
						//this.cargarCombosTablaAmortisForeignKeyLista(" where id="+this.detalletablaamorti.getid_tabla_amorti());
									//this.inicializarActualizarBindingDetalleTablaAmorti(false,false);
						this.tablaamortisForeignKey=new ArrayList<TablaAmorti>();

						if(detalletablaamorti.getTablaAmorti()!=null) {
							this.tablaamortisForeignKey.add(detalletablaamorti.getTablaAmorti());
						}

						this.addItemDefectoCombosForeignKeyTablaAmorti();
						this.cargarCombosFrameTablaAmortisForeignKey("Todos");
					}
					this.setActualTablaAmortiForeignKey(this.detalletablaamorti.getid_tabla_amorti(),false,"Formulario");

					//Anio
					if(!this.detalletablaamortiConstantesFunciones.cargarid_anioDetalleTablaAmorti || this.detalletablaamortiConstantesFunciones.event_dependid_anioDetalleTablaAmorti) {
						//this.cargarCombosAniosForeignKeyLista(" where id="+this.detalletablaamorti.getid_anio());
									//this.inicializarActualizarBindingDetalleTablaAmorti(false,false);
						this.aniosForeignKey=new ArrayList<Anio>();

						if(detalletablaamorti.getAnio()!=null) {
							this.aniosForeignKey.add(detalletablaamorti.getAnio());
						}

						this.addItemDefectoCombosForeignKeyAnio();
						this.cargarCombosFrameAniosForeignKey("Todos");
					}
					this.setActualAnioForeignKey(this.detalletablaamorti.getid_anio(),false,"Formulario");

					//Mes
					if(!this.detalletablaamortiConstantesFunciones.cargarid_mesDetalleTablaAmorti || this.detalletablaamortiConstantesFunciones.event_dependid_mesDetalleTablaAmorti) {
						//this.cargarCombosMessForeignKeyLista(" where id="+this.detalletablaamorti.getid_mes());
									//this.inicializarActualizarBindingDetalleTablaAmorti(false,false);
						this.messForeignKey=new ArrayList<Mes>();

						if(detalletablaamorti.getMes()!=null) {
							this.messForeignKey.add(detalletablaamorti.getMes());
						}

						this.addItemDefectoCombosForeignKeyMes();
						this.cargarCombosFrameMessForeignKey("Todos");
					}
					this.setActualMesForeignKey(this.detalletablaamorti.getid_mes(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesDetalleTablaAmorti("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesDetalleTablaAmorti(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDetalleTablaAmorti() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoDetalleTablaAmorti(DetalleTablaAmorti detalletablaamorti) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoDetalleTablaAmorti(detalletablaamorti,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoDetalleTablaAmorti(DetalleTablaAmorti detalletablaamorti,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioDetalleTablaAmorti(detalletablaamorti);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyDetalleTablaAmorti(detalletablaamorti,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyDetalleTablaAmorti(detalletablaamorti);
	}
	
	public void setVariablesObjetoActualToFormularioDetalleTablaAmorti(DetalleTablaAmorti detalletablaamorti) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormDetalleTablaAmorti==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormDetalleTablaAmorti.jLabelidDetalleTablaAmorti.setText(detalletablaamorti.getId().toString());
			this.jInternalFrameDetalleFormDetalleTablaAmorti.jTextFieldvalorDetalleTablaAmorti.setText(detalletablaamorti.getvalor().toString());
			this.jInternalFrameDetalleFormDetalleTablaAmorti.jTextFieldinteresDetalleTablaAmorti.setText(detalletablaamorti.getinteres().toString());
			this.jInternalFrameDetalleFormDetalleTablaAmorti.jTextFieldcapitalDetalleTablaAmorti.setText(detalletablaamorti.getcapital().toString());
			this.jInternalFrameDetalleFormDetalleTablaAmorti.jDateChooserfecha_inicioDetalleTablaAmorti.setDate(detalletablaamorti.getfecha_inicio());
			this.jInternalFrameDetalleFormDetalleTablaAmorti.jDateChooserfecha_finDetalleTablaAmorti.setDate(detalletablaamorti.getfecha_fin());
			this.jInternalFrameDetalleFormDetalleTablaAmorti.jTextFielddescripcionDetalleTablaAmorti.setText(detalletablaamorti.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,DetalleTablaAmorti detalletablaamortiLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,detalletablaamortiLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,DetalleTablaAmorti detalletablaamortiLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				detalletablaamortiLocal=this.detalletablaamorti;
			} else {
				detalletablaamortiLocal=this.detalletablaamortiAnterior;
			}
		}
		
		if(this.permiteMantenimiento(detalletablaamortiLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoDetalleTablaAmorti(detalletablaamortiLocal,true);
					
					if(detalletablaamortiSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(detalletablaamortiLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.detalletablaamortiSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(detalletablaamortiLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoDetalleTablaAmorti(DetalleTablaAmorti detalletablaamorti,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDetalleTablaAmorti(detalletablaamorti,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysDetalleTablaAmorti(detalletablaamorti);
	}
	
	public void setVariablesFormularioToObjetoActualDetalleTablaAmorti(DetalleTablaAmorti detalletablaamorti,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDetalleTablaAmorti(detalletablaamorti,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualDetalleTablaAmorti(DetalleTablaAmorti detalletablaamorti,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormDetalleTablaAmorti==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormDetalleTablaAmorti.jLabelidDetalleTablaAmorti.getText()==null || this.jInternalFrameDetalleFormDetalleTablaAmorti.jLabelidDetalleTablaAmorti.getText()=="" || this.jInternalFrameDetalleFormDetalleTablaAmorti.jLabelidDetalleTablaAmorti.getText()=="Id") {
				this.jInternalFrameDetalleFormDetalleTablaAmorti.jLabelidDetalleTablaAmorti.setText("0");
			}

			if(conColumnasBase) {detalletablaamorti.setId(Long.parseLong(this.jInternalFrameDetalleFormDetalleTablaAmorti.jLabelidDetalleTablaAmorti.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleTablaAmortiConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleTablaAmorti.jLabelIdDetalleTablaAmorti,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detalletablaamorti.setvalor(Double.parseDouble(this.jInternalFrameDetalleFormDetalleTablaAmorti.jTextFieldvalorDetalleTablaAmorti.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleTablaAmortiConstantesFunciones.LABEL_VALOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleTablaAmorti.jLabelvalorDetalleTablaAmorti,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detalletablaamorti.setinteres(Double.parseDouble(this.jInternalFrameDetalleFormDetalleTablaAmorti.jTextFieldinteresDetalleTablaAmorti.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleTablaAmortiConstantesFunciones.LABEL_INTERES+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleTablaAmorti.jLabelinteresDetalleTablaAmorti,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detalletablaamorti.setcapital(Double.parseDouble(this.jInternalFrameDetalleFormDetalleTablaAmorti.jTextFieldcapitalDetalleTablaAmorti.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleTablaAmortiConstantesFunciones.LABEL_CAPITAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleTablaAmorti.jLabelcapitalDetalleTablaAmorti,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detalletablaamorti.setfecha_inicio(this.jInternalFrameDetalleFormDetalleTablaAmorti.jDateChooserfecha_inicioDetalleTablaAmorti.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleTablaAmortiConstantesFunciones.LABEL_FECHAINICIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleTablaAmorti.jLabelfecha_inicioDetalleTablaAmorti,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detalletablaamorti.setfecha_fin(this.jInternalFrameDetalleFormDetalleTablaAmorti.jDateChooserfecha_finDetalleTablaAmorti.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleTablaAmortiConstantesFunciones.LABEL_FECHAFIN+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleTablaAmorti.jLabelfecha_finDetalleTablaAmorti,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detalletablaamorti.setdescripcion(this.jInternalFrameDetalleFormDetalleTablaAmorti.jTextFielddescripcionDetalleTablaAmorti.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleTablaAmortiConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleTablaAmorti.jLabeldescripcionDetalleTablaAmorti,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDetalleTablaAmorti(DetalleTablaAmorti detalletablaamortiBean,DetalleTablaAmorti detalletablaamorti,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosDetalleTablaAmorti(DetalleTablaAmorti detalletablaamortiOrigen,DetalleTablaAmorti detalletablaamorti,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && detalletablaamortiOrigen.getId()!=null && !detalletablaamortiOrigen.getId().equals(0L))) {detalletablaamorti.setId(detalletablaamortiOrigen.getId());}}
			if(conDefault || (!conDefault && detalletablaamortiOrigen.getvalor()!=null && !detalletablaamortiOrigen.getvalor().equals(0.0))) {detalletablaamorti.setvalor(detalletablaamortiOrigen.getvalor());}
			if(conDefault || (!conDefault && detalletablaamortiOrigen.getinteres()!=null && !detalletablaamortiOrigen.getinteres().equals(0.0))) {detalletablaamorti.setinteres(detalletablaamortiOrigen.getinteres());}
			if(conDefault || (!conDefault && detalletablaamortiOrigen.getcapital()!=null && !detalletablaamortiOrigen.getcapital().equals(0.0))) {detalletablaamorti.setcapital(detalletablaamortiOrigen.getcapital());}
			if(conDefault || (!conDefault && detalletablaamortiOrigen.getfecha_inicio()!=null && !detalletablaamortiOrigen.getfecha_inicio().equals(new Date()))) {detalletablaamorti.setfecha_inicio(detalletablaamortiOrigen.getfecha_inicio());}
			if(conDefault || (!conDefault && detalletablaamortiOrigen.getfecha_fin()!=null && !detalletablaamortiOrigen.getfecha_fin().equals(new Date()))) {detalletablaamorti.setfecha_fin(detalletablaamortiOrigen.getfecha_fin());}
			if(conDefault || (!conDefault && detalletablaamortiOrigen.getdescripcion()!=null && !detalletablaamortiOrigen.getdescripcion().equals(""))) {detalletablaamorti.setdescripcion(detalletablaamortiOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDetalleTablaAmorti(DetalleTablaAmorti detalletablaamorti) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDetalleTablaAmorti.jLabelidDetalleTablaAmorti.setText(detalletablaamorti.getId().toString());
			this.jInternalFrameDetalleFormDetalleTablaAmorti.jTextFieldvalorDetalleTablaAmorti.setText(detalletablaamorti.getvalor().toString());
			this.jInternalFrameDetalleFormDetalleTablaAmorti.jTextFieldinteresDetalleTablaAmorti.setText(detalletablaamorti.getinteres().toString());
			this.jInternalFrameDetalleFormDetalleTablaAmorti.jTextFieldcapitalDetalleTablaAmorti.setText(detalletablaamorti.getcapital().toString());
			this.jInternalFrameDetalleFormDetalleTablaAmorti.jDateChooserfecha_inicioDetalleTablaAmorti.setDate(detalletablaamorti.getfecha_inicio());
			this.jInternalFrameDetalleFormDetalleTablaAmorti.jDateChooserfecha_finDetalleTablaAmorti.setDate(detalletablaamorti.getfecha_fin());
			this.jInternalFrameDetalleFormDetalleTablaAmorti.jTextFielddescripcionDetalleTablaAmorti.setText(detalletablaamorti.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDetalleTablaAmorti(DetalleTablaAmortiBean detalletablaamortiBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDetalleTablaAmorti.jLabelidDetalleTablaAmorti.setText(detalletablaamortiBean.getId().toString());
			this.jInternalFrameDetalleFormDetalleTablaAmorti.jTextFieldvalorDetalleTablaAmorti.setText(detalletablaamortiBean.getvalor().toString());
			this.jInternalFrameDetalleFormDetalleTablaAmorti.jTextFieldinteresDetalleTablaAmorti.setText(detalletablaamortiBean.getinteres().toString());
			this.jInternalFrameDetalleFormDetalleTablaAmorti.jTextFieldcapitalDetalleTablaAmorti.setText(detalletablaamortiBean.getcapital().toString());
			this.jInternalFrameDetalleFormDetalleTablaAmorti.jDateChooserfecha_inicioDetalleTablaAmorti.setDate(detalletablaamortiBean.getfecha_inicio());
			this.jInternalFrameDetalleFormDetalleTablaAmorti.jDateChooserfecha_finDetalleTablaAmorti.setDate(detalletablaamortiBean.getfecha_fin());
			this.jInternalFrameDetalleFormDetalleTablaAmorti.jTextFielddescripcionDetalleTablaAmorti.setText(detalletablaamortiBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanDetalleTablaAmorti(DetalleTablaAmortiParameterReturnGeneral detalletablaamortiReturnGeneral,DetalleTablaAmortiBean detalletablaamortiBean,Boolean conDefault) throws Exception { 
		try {
			DetalleTablaAmorti detalletablaamortiLocal=new DetalleTablaAmorti();
			
			detalletablaamortiLocal=detalletablaamortiReturnGeneral.getDetalleTablaAmorti();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && detalletablaamortiLocal.getId()!=null && !detalletablaamortiLocal.getId().equals(0L))) {detalletablaamortiBean.setId(detalletablaamortiLocal.getId());}}
			if(conDefault || (!conDefault && detalletablaamortiLocal.getvalor()!=null && !detalletablaamortiLocal.getvalor().equals(0.0))) {detalletablaamortiBean.setvalor(detalletablaamortiLocal.getvalor());}
			if(conDefault || (!conDefault && detalletablaamortiLocal.getinteres()!=null && !detalletablaamortiLocal.getinteres().equals(0.0))) {detalletablaamortiBean.setinteres(detalletablaamortiLocal.getinteres());}
			if(conDefault || (!conDefault && detalletablaamortiLocal.getcapital()!=null && !detalletablaamortiLocal.getcapital().equals(0.0))) {detalletablaamortiBean.setcapital(detalletablaamortiLocal.getcapital());}
			if(conDefault || (!conDefault && detalletablaamortiLocal.getfecha_inicio()!=null && !detalletablaamortiLocal.getfecha_inicio().equals(new Date()))) {detalletablaamortiBean.setfecha_inicio(detalletablaamortiLocal.getfecha_inicio());}
			if(conDefault || (!conDefault && detalletablaamortiLocal.getfecha_fin()!=null && !detalletablaamortiLocal.getfecha_fin().equals(new Date()))) {detalletablaamortiBean.setfecha_fin(detalletablaamortiLocal.getfecha_fin());}
			if(conDefault || (!conDefault && detalletablaamortiLocal.getdescripcion()!=null && !detalletablaamortiLocal.getdescripcion().equals(""))) {detalletablaamortiBean.setdescripcion(detalletablaamortiLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxDetalleTablaAmortiGenerico(Long idDetalleTablaAmortiSeleccionado,JComboBox jComboBoxDetalleTablaAmorti,List<DetalleTablaAmorti> detalletablaamortisLocal)throws Exception {
		try {
			DetalleTablaAmorti  detalletablaamortiTemp=null;

			for(DetalleTablaAmorti detalletablaamortiAux:detalletablaamortisLocal) {
				if(detalletablaamortiAux.getId()!=null && detalletablaamortiAux.getId().equals(idDetalleTablaAmortiSeleccionado)) {
					detalletablaamortiTemp=detalletablaamortiAux;
					break;
				}
			}

			jComboBoxDetalleTablaAmorti.setSelectedItem(detalletablaamortiTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxDetalleTablaAmortiGenerico(JComboBox jComboBoxDetalleTablaAmorti,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxDetalleTablaAmorti.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDetalleTablaAmorti.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxDetalleTablaAmorti.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDetalleTablaAmorti.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDetalleTablaAmorti.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxDetalleTablaAmorti.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDetalleTablaAmorti.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxDetalleTablaAmorti.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxDetalleTablaAmorti.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxDetalleTablaAmorti.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			detalletablaamorti=(DetalleTablaAmorti) detalletablaamortiLogic.getDetalleTablaAmortis().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			detalletablaamorti =(DetalleTablaAmorti) detalletablaamortis.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!detalletablaamorti.getIsNew() && !detalletablaamorti.getIsChanged() && !detalletablaamorti.getIsDeleted()) {
				sDescripcion=detalletablaamorti.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=detalletablaamorti.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!detalletablaamorti.getIsNew() && !detalletablaamorti.getIsChanged() && !detalletablaamorti.getIsDeleted()) {
				sDescripcion=detalletablaamorti.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=detalletablaamorti.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Ejercicio")) {
			//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
			if(!detalletablaamorti.getIsNew() && !detalletablaamorti.getIsChanged() && !detalletablaamorti.getIsDeleted()) {
				sDescripcion=detalletablaamorti.getejercicio_descripcion();
			} else {
				//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
				sDescripcion=detalletablaamorti.getejercicio_descripcion();
			}
		}

		if(sTipo.equals("Periodo")) {
			//sDescripcion=this.getActualPeriodoForeignKeyDescripcion((Long)value);
			if(!detalletablaamorti.getIsNew() && !detalletablaamorti.getIsChanged() && !detalletablaamorti.getIsDeleted()) {
				sDescripcion=detalletablaamorti.getperiodo_descripcion();
			} else {
				//sDescripcion=this.getActualPeriodoForeignKeyDescripcion((Long)value);
				sDescripcion=detalletablaamorti.getperiodo_descripcion();
			}
		}

		if(sTipo.equals("TablaAmorti")) {
			//sDescripcion=this.getActualTablaAmortiForeignKeyDescripcion((Long)value);
			if(!detalletablaamorti.getIsNew() && !detalletablaamorti.getIsChanged() && !detalletablaamorti.getIsDeleted()) {
				sDescripcion=detalletablaamorti.gettablaamorti_descripcion();
			} else {
				//sDescripcion=this.getActualTablaAmortiForeignKeyDescripcion((Long)value);
				sDescripcion=detalletablaamorti.gettablaamorti_descripcion();
			}
		}

		if(sTipo.equals("Anio")) {
			//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
			if(!detalletablaamorti.getIsNew() && !detalletablaamorti.getIsChanged() && !detalletablaamorti.getIsDeleted()) {
				sDescripcion=detalletablaamorti.getanio_descripcion();
			} else {
				//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
				sDescripcion=detalletablaamorti.getanio_descripcion();
			}
		}

		if(sTipo.equals("Mes")) {
			//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
			if(!detalletablaamorti.getIsNew() && !detalletablaamorti.getIsChanged() && !detalletablaamorti.getIsDeleted()) {
				sDescripcion=detalletablaamorti.getmes_descripcion();
			} else {
				//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
				sDescripcion=detalletablaamorti.getmes_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		DetalleTablaAmorti detalletablaamortiRow=new DetalleTablaAmorti();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			detalletablaamortiRow=(DetalleTablaAmorti) detalletablaamortiLogic.getDetalleTablaAmortis().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			detalletablaamortiRow=(DetalleTablaAmorti) detalletablaamortis.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualDetalleTablaAmorti(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoDetalleTablaAmorti.setVisible((this.isVisibilidadCeldaNuevoDetalleTablaAmorti && this.isPermisoNuevoDetalleTablaAmorti));			
			this.jButtonDuplicarDetalleTablaAmorti.setVisible((this.isVisibilidadCeldaDuplicarDetalleTablaAmorti && this.isPermisoDuplicarDetalleTablaAmorti));			
			this.jButtonCopiarDetalleTablaAmorti.setVisible((this.isVisibilidadCeldaCopiarDetalleTablaAmorti && this.isPermisoCopiarDetalleTablaAmorti));
			this.jButtonVerFormDetalleTablaAmorti.setVisible((this.isVisibilidadCeldaVerFormDetalleTablaAmorti && this.isPermisoVerFormDetalleTablaAmorti));
			
			this.jButtonAbrirOrderByDetalleTablaAmorti.setVisible((this.isVisibilidadCeldaOrdenDetalleTablaAmorti && this.isPermisoOrdenDetalleTablaAmorti));			
			
			this.jButtonNuevoRelacionesDetalleTablaAmorti.setVisible((this.isVisibilidadCeldaNuevoRelacionesDetalleTablaAmorti && this.isPermisoNuevoDetalleTablaAmorti));			
			this.jButtonNuevoGuardarCambiosDetalleTablaAmorti.setVisible((this.isVisibilidadCeldaNuevoDetalleTablaAmorti && this.isPermisoNuevoDetalleTablaAmorti && this.isPermisoGuardarCambiosDetalleTablaAmorti));
			
			if(this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) {
			this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonModificarDetalleTablaAmorti.setVisible((this.isVisibilidadCeldaModificarDetalleTablaAmorti && this.isPermisoActualizarDetalleTablaAmorti));	
			this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonActualizarDetalleTablaAmorti.setVisible((this.isVisibilidadCeldaActualizarDetalleTablaAmorti && this.isPermisoActualizarDetalleTablaAmorti));	
			this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonEliminarDetalleTablaAmorti.setVisible((this.isVisibilidadCeldaEliminarDetalleTablaAmorti && this.isPermisoEliminarDetalleTablaAmorti));
			this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonCancelarDetalleTablaAmorti.setVisible(this.isVisibilidadCeldaCancelarDetalleTablaAmorti);							
			this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonGuardarCambiosDetalleTablaAmorti.setVisible((this.isVisibilidadCeldaGuardarDetalleTablaAmorti && this.isPermisoGuardarCambiosDetalleTablaAmorti));			
			
			}
						
			this.jButtonGuardarCambiosTablaDetalleTablaAmorti.setVisible((this.isVisibilidadCeldaGuardarCambiosDetalleTablaAmorti && this.isPermisoGuardarCambiosDetalleTablaAmorti));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarDetalleTablaAmorti.setVisible((this.isVisibilidadCeldaNuevoDetalleTablaAmorti && this.isPermisoNuevoDetalleTablaAmorti));						
			this.jButtonDuplicarToolBarDetalleTablaAmorti.setVisible((this.isVisibilidadCeldaDuplicarDetalleTablaAmorti && this.isPermisoDuplicarDetalleTablaAmorti));						
			this.jButtonCopiarToolBarDetalleTablaAmorti.setVisible((this.isVisibilidadCeldaCopiarDetalleTablaAmorti && this.isPermisoCopiarDetalleTablaAmorti));			
			this.jButtonVerFormToolBarDetalleTablaAmorti.setVisible((this.isVisibilidadCeldaVerFormDetalleTablaAmorti && this.isPermisoVerFormDetalleTablaAmorti));			
			this.jButtonAbrirOrderByToolBarDetalleTablaAmorti.setVisible((this.isVisibilidadCeldaOrdenDetalleTablaAmorti && this.isPermisoOrdenDetalleTablaAmorti));
			this.jButtonNuevoRelacionesToolBarDetalleTablaAmorti.setVisible((this.isVisibilidadCeldaNuevoRelacionesDetalleTablaAmorti && this.isPermisoNuevoDetalleTablaAmorti));			
			this.jButtonNuevoGuardarCambiosToolBarDetalleTablaAmorti.setVisible((this.isVisibilidadCeldaNuevoDetalleTablaAmorti && this.isPermisoNuevoDetalleTablaAmorti && this.isPermisoGuardarCambiosDetalleTablaAmorti));			
			
			if(this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) {
			this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonModificarToolBarDetalleTablaAmorti.setVisible((this.isVisibilidadCeldaModificarDetalleTablaAmorti && this.isPermisoActualizarDetalleTablaAmorti));	
			this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonActualizarToolBarDetalleTablaAmorti.setVisible((this.isVisibilidadCeldaActualizarDetalleTablaAmorti  && this.isPermisoActualizarDetalleTablaAmorti));	
			this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonEliminarToolBarDetalleTablaAmorti.setVisible((this.isVisibilidadCeldaEliminarDetalleTablaAmorti && this.isPermisoEliminarDetalleTablaAmorti));
			this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonCancelarToolBarDetalleTablaAmorti.setVisible(this.isVisibilidadCeldaCancelarDetalleTablaAmorti);				
			this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonGuardarCambiosToolBarDetalleTablaAmorti.setVisible((this.isVisibilidadCeldaGuardarDetalleTablaAmorti && this.isPermisoGuardarCambiosDetalleTablaAmorti));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarDetalleTablaAmorti.setVisible((this.isVisibilidadCeldaGuardarCambiosDetalleTablaAmorti && this.isPermisoGuardarCambiosDetalleTablaAmorti));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoDetalleTablaAmorti.setVisible((this.isVisibilidadCeldaNuevoDetalleTablaAmorti && this.isPermisoNuevoDetalleTablaAmorti));			
			this.jMenuItemDuplicarDetalleTablaAmorti.setVisible((this.isVisibilidadCeldaDuplicarDetalleTablaAmorti && this.isPermisoDuplicarDetalleTablaAmorti));			
			this.jMenuItemCopiarDetalleTablaAmorti.setVisible((this.isVisibilidadCeldaCopiarDetalleTablaAmorti && this.isPermisoCopiarDetalleTablaAmorti));			
			this.jMenuItemVerFormDetalleTablaAmorti.setVisible((this.isVisibilidadCeldaVerFormDetalleTablaAmorti && this.isPermisoVerFormDetalleTablaAmorti));			
			this.jMenuItemAbrirOrderByDetalleTablaAmorti.setVisible((this.isVisibilidadCeldaOrdenDetalleTablaAmorti && this.isPermisoOrdenDetalleTablaAmorti));			
			//this.jMenuItemMostrarOcultarDetalleTablaAmorti.setVisible((this.isVisibilidadCeldaOrdenDetalleTablaAmorti && this.isPermisoOrdenDetalleTablaAmorti));
			this.jMenuItemDetalleAbrirOrderByDetalleTablaAmorti.setVisible((this.isVisibilidadCeldaOrdenDetalleTablaAmorti && this.isPermisoOrdenDetalleTablaAmorti));			
			//this.jMenuItemDetalleMostrarOcultarDetalleTablaAmorti.setVisible((this.isVisibilidadCeldaOrdenDetalleTablaAmorti && this.isPermisoOrdenDetalleTablaAmorti));			
			this.jMenuItemNuevoRelacionesDetalleTablaAmorti.setVisible((this.isVisibilidadCeldaNuevoRelacionesDetalleTablaAmorti && this.isPermisoNuevoDetalleTablaAmorti));			
			this.jMenuItemNuevoGuardarCambiosDetalleTablaAmorti.setVisible((this.isVisibilidadCeldaNuevoDetalleTablaAmorti && this.isPermisoNuevoDetalleTablaAmorti && this.isPermisoGuardarCambiosDetalleTablaAmorti));									
			
			if(this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) {
			this.jInternalFrameDetalleFormDetalleTablaAmorti.jMenuItemModificarDetalleTablaAmorti.setVisible((this.isVisibilidadCeldaModificarDetalleTablaAmorti && this.isPermisoActualizarDetalleTablaAmorti));	
			this.jInternalFrameDetalleFormDetalleTablaAmorti.jMenuItemActualizarDetalleTablaAmorti.setVisible((this.isVisibilidadCeldaActualizarDetalleTablaAmorti && this.isPermisoActualizarDetalleTablaAmorti));	
			this.jInternalFrameDetalleFormDetalleTablaAmorti.jMenuItemEliminarDetalleTablaAmorti.setVisible((this.isVisibilidadCeldaEliminarDetalleTablaAmorti && this.isPermisoEliminarDetalleTablaAmorti));
			this.jInternalFrameDetalleFormDetalleTablaAmorti.jMenuItemCancelarDetalleTablaAmorti.setVisible(this.isVisibilidadCeldaCancelarDetalleTablaAmorti);				
			}
			
			this.jMenuItemGuardarCambiosDetalleTablaAmorti.setVisible((this.isVisibilidadCeldaGuardarDetalleTablaAmorti && this.isPermisoGuardarCambiosDetalleTablaAmorti));						
			this.jMenuItemGuardarCambiosTablaDetalleTablaAmorti.setVisible((this.isVisibilidadCeldaGuardarCambiosDetalleTablaAmorti && this.isPermisoGuardarCambiosDetalleTablaAmorti));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoDetalleTablaAmorti=this.jButtonNuevoDetalleTablaAmorti.isVisible();
			this.isVisibilidadCeldaDuplicarDetalleTablaAmorti=this.jButtonDuplicarDetalleTablaAmorti.isVisible();
			this.isVisibilidadCeldaCopiarDetalleTablaAmorti=this.jButtonCopiarDetalleTablaAmorti.isVisible();
			this.isVisibilidadCeldaVerFormDetalleTablaAmorti=this.jButtonVerFormDetalleTablaAmorti.isVisible();
			
			this.isVisibilidadCeldaOrdenDetalleTablaAmorti=this.jButtonAbrirOrderByDetalleTablaAmorti.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesDetalleTablaAmorti=this.jButtonNuevoRelacionesDetalleTablaAmorti.isVisible();
			this.isVisibilidadCeldaModificarDetalleTablaAmorti=this.jButtonModificarDetalleTablaAmorti.isVisible();
			
			if(this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) {
			this.isVisibilidadCeldaActualizarDetalleTablaAmorti=this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonActualizarDetalleTablaAmorti.isVisible();
			this.isVisibilidadCeldaEliminarDetalleTablaAmorti=this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonEliminarDetalleTablaAmorti.isVisible();
			this.isVisibilidadCeldaCancelarDetalleTablaAmorti=this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonCancelarDetalleTablaAmorti.isVisible();
			this.isVisibilidadCeldaGuardarDetalleTablaAmorti=this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonGuardarCambiosDetalleTablaAmorti.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosDetalleTablaAmorti=this.jButtonGuardarCambiosTablaDetalleTablaAmorti.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoDetalleTablaAmorti=this.jButtonNuevoToolBarDetalleTablaAmorti.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDetalleTablaAmorti=this.jButtonNuevoRelacionesToolBarDetalleTablaAmorti.isVisible();
			
			if(this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) {
			this.isVisibilidadCeldaModificarDetalleTablaAmorti=this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonModificarToolBarDetalleTablaAmorti.isVisible();
			this.isVisibilidadCeldaActualizarDetalleTablaAmorti=this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonActualizarToolBarDetalleTablaAmorti.isVisible();
			this.isVisibilidadCeldaEliminarDetalleTablaAmorti=this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonEliminarToolBarDetalleTablaAmorti.isVisible();
			this.isVisibilidadCeldaCancelarDetalleTablaAmorti=this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonCancelarToolBarDetalleTablaAmorti.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDetalleTablaAmorti=this.jButtonGuardarCambiosToolBarDetalleTablaAmorti.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDetalleTablaAmorti=this.jButtonGuardarCambiosTablaToolBarDetalleTablaAmorti.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoDetalleTablaAmorti=this.jMenuItemNuevoDetalleTablaAmorti.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDetalleTablaAmorti=this.jMenuItemNuevoRelacionesDetalleTablaAmorti.isVisible();
			
			if(this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) {
			this.isVisibilidadCeldaModificarDetalleTablaAmorti=this.jInternalFrameDetalleFormDetalleTablaAmorti.jMenuItemModificarDetalleTablaAmorti.isVisible();
			this.isVisibilidadCeldaActualizarDetalleTablaAmorti=this.jInternalFrameDetalleFormDetalleTablaAmorti.jMenuItemActualizarDetalleTablaAmorti.isVisible();
			this.isVisibilidadCeldaEliminarDetalleTablaAmorti=this.jInternalFrameDetalleFormDetalleTablaAmorti.jMenuItemEliminarDetalleTablaAmorti.isVisible();
			this.isVisibilidadCeldaCancelarDetalleTablaAmorti=this.jInternalFrameDetalleFormDetalleTablaAmorti.jMenuItemCancelarDetalleTablaAmorti.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDetalleTablaAmorti=this.jMenuItemGuardarCambiosDetalleTablaAmorti.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDetalleTablaAmorti=this.jMenuItemGuardarCambiosTablaDetalleTablaAmorti.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesDetalleTablaAmorti(Boolean esInicializar) {
		if(DetalleTablaAmortiJInternalFrame.ISBINDING_MANUAL) {			
			if(this.detalletablaamortiSessionBean.getConGuardarRelaciones()) {
				//if(this.detalletablaamortiSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesDetalleTablaAmorti();
			}
			
			this.inicializarActualizarBindingBotonesManualDetalleTablaAmorti(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualDetalleTablaAmorti() {
		this.jButtonNuevoDetalleTablaAmorti.setVisible(this.isPermisoNuevoDetalleTablaAmorti);			
		this.jButtonDuplicarDetalleTablaAmorti.setVisible(this.isPermisoDuplicarDetalleTablaAmorti);			
		this.jButtonCopiarDetalleTablaAmorti.setVisible(this.isPermisoCopiarDetalleTablaAmorti);			
		this.jButtonVerFormDetalleTablaAmorti.setVisible(this.isPermisoVerFormDetalleTablaAmorti);			
		
		this.jButtonAbrirOrderByDetalleTablaAmorti.setVisible(this.isPermisoOrdenDetalleTablaAmorti);					
		
		this.jButtonNuevoRelacionesDetalleTablaAmorti.setVisible(this.isPermisoNuevoDetalleTablaAmorti);			
		
		if(this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonModificarDetalleTablaAmorti.setVisible(this.isPermisoActualizarDetalleTablaAmorti);	
			this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonActualizarDetalleTablaAmorti.setVisible(this.isPermisoActualizarDetalleTablaAmorti);	
			this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonEliminarDetalleTablaAmorti.setVisible(this.isPermisoEliminarDetalleTablaAmorti);
			this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonCancelarDetalleTablaAmorti.setVisible(this.isVisibilidadCeldaCancelarDetalleTablaAmorti);						
			this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonGuardarCambiosDetalleTablaAmorti.setVisible(this.isPermisoGuardarCambiosDetalleTablaAmorti);							
		}
		
		this.jButtonGuardarCambiosTablaDetalleTablaAmorti.setVisible(this.isPermisoActualizarDetalleTablaAmorti);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleDetalleTablaAmorti() {
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonModificarDetalleTablaAmorti.setVisible(this.isPermisoActualizarDetalleTablaAmorti);	
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonActualizarDetalleTablaAmorti.setVisible(this.isPermisoActualizarDetalleTablaAmorti);	
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonEliminarDetalleTablaAmorti.setVisible(this.isPermisoEliminarDetalleTablaAmorti);
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonCancelarDetalleTablaAmorti.setVisible(this.isVisibilidadCeldaCancelarDetalleTablaAmorti);							
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonGuardarCambiosDetalleTablaAmorti.setVisible((this.isVisibilidadCeldaGuardarDetalleTablaAmorti && this.isPermisoGuardarCambiosDetalleTablaAmorti));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosDetalleTablaAmorti() {
		if(DetalleTablaAmortiJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualDetalleTablaAmorti();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesDetalleTablaAmorti() {
	}
	
	public void jTableDatosDetalleTablaAmortiListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarDetalleTablaAmorti(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidDetalleTablaAmortiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalletablaamortiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleTablaAmorti.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleTablaAmorti(this.getdetalletablaamorti(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleTablaAmorti(this.detalletablaamorti);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalletablaamorti =(DetalleTablaAmorti) this.detalletablaamortiLogic.getDetalleTablaAmortis().toArray()[this.jTableDatosDetalleTablaAmorti.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalletablaamorti =(DetalleTablaAmorti) this.detalletablaamortis.toArray()[this.jTableDatosDetalleTablaAmorti.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalletablaamorti==null) {
						this.detalletablaamorti = new DetalleTablaAmorti();
					}

					this.setVariablesFormularioToObjetoActualDetalleTablaAmorti(this.detalletablaamorti,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleTablaAmorti(this.detalletablaamorti);
				}

				if(this.detalletablaamorti.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.detalletablaamorti.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleTablaAmorti(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalletablaamortiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalletablaamortiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalletablaamortiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaDetalleTablaAmortiUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamortiLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebDetalleTablaAmorti(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleTablaAmorti.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleTablaAmorti.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleTablaAmorti.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalletablaamorti =(DetalleTablaAmorti) this.detalletablaamortiLogic.getDetalleTablaAmortis().toArray()[this.jTableDatosDetalleTablaAmorti.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalletablaamorti =(DetalleTablaAmorti) this.detalletablaamortis.toArray()[this.jTableDatosDetalleTablaAmorti.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleTablaAmorti(this.getdetalletablaamorti(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleTablaAmorti(this.detalletablaamorti);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.detalletablaamortiLogic.getConnexion());

				if(this.detalletablaamorti.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.detalletablaamorti.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleTablaAmorti=(TitledBorder)this.jScrollPanelDatosDetalleTablaAmorti.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderDetalleTablaAmorti.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamortiLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamortiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamortiLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaDetalleTablaAmortiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalletablaamortiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleTablaAmorti.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleTablaAmorti(this.getdetalletablaamorti(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleTablaAmorti(this.detalletablaamorti);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalletablaamorti =(DetalleTablaAmorti) this.detalletablaamortiLogic.getDetalleTablaAmortis().toArray()[this.jTableDatosDetalleTablaAmorti.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalletablaamorti =(DetalleTablaAmorti) this.detalletablaamortis.toArray()[this.jTableDatosDetalleTablaAmorti.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalletablaamorti==null) {
						this.detalletablaamorti = new DetalleTablaAmorti();
					}

					this.setVariablesFormularioToObjetoActualDetalleTablaAmorti(this.detalletablaamorti,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleTablaAmorti(this.detalletablaamorti);
				}

				if(this.detalletablaamorti.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.detalletablaamorti.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleTablaAmorti(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalletablaamortiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalletablaamortiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalletablaamortiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalDetalleTablaAmortiUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamortiLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebDetalleTablaAmorti(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleTablaAmorti.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleTablaAmorti.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleTablaAmorti.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalletablaamorti =(DetalleTablaAmorti) this.detalletablaamortiLogic.getDetalleTablaAmortis().toArray()[this.jTableDatosDetalleTablaAmorti.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalletablaamorti =(DetalleTablaAmorti) this.detalletablaamortis.toArray()[this.jTableDatosDetalleTablaAmorti.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleTablaAmorti(this.getdetalletablaamorti(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleTablaAmorti(this.detalletablaamorti);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.detalletablaamortiLogic.getConnexion());

				if(this.detalletablaamorti.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.detalletablaamorti.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleTablaAmorti=(TitledBorder)this.jScrollPanelDatosDetalleTablaAmorti.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderDetalleTablaAmorti.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamortiLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamortiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamortiLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalDetalleTablaAmortiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalletablaamortiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleTablaAmorti.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleTablaAmorti(this.getdetalletablaamorti(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleTablaAmorti(this.detalletablaamorti);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalletablaamorti =(DetalleTablaAmorti) this.detalletablaamortiLogic.getDetalleTablaAmortis().toArray()[this.jTableDatosDetalleTablaAmorti.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalletablaamorti =(DetalleTablaAmorti) this.detalletablaamortis.toArray()[this.jTableDatosDetalleTablaAmorti.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalletablaamorti==null) {
						this.detalletablaamorti = new DetalleTablaAmorti();
					}

					this.setVariablesFormularioToObjetoActualDetalleTablaAmorti(this.detalletablaamorti,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleTablaAmorti(this.detalletablaamorti);
				}

				if(this.detalletablaamorti.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.detalletablaamorti.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleTablaAmorti(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalletablaamortiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalletablaamortiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalletablaamortiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ejercicioDetalleTablaAmortiUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamortiLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoejercicio=true;

			idTienePermisoejercicio=this.tienePermisosUsuarioEnPaginaWebDetalleTablaAmorti(EjercicioConstantesFunciones.CLASSNAME);

			if(idTienePermisoejercicio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleTablaAmorti.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleTablaAmorti.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleTablaAmorti.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalletablaamorti =(DetalleTablaAmorti) this.detalletablaamortiLogic.getDetalleTablaAmortis().toArray()[this.jTableDatosDetalleTablaAmorti.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalletablaamorti =(DetalleTablaAmorti) this.detalletablaamortis.toArray()[this.jTableDatosDetalleTablaAmorti.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleTablaAmorti(this.getdetalletablaamorti(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleTablaAmorti(this.detalletablaamorti);

				this.ejercicioBeanSwingJInternalFrame=new EjercicioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ejercicioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ejercicioBeanSwingJInternalFrame.getEjercicioLogic().setConnexion(this.detalletablaamortiLogic.getConnexion());

				if(this.detalletablaamorti.getid_ejercicio()!=null) {
					this.ejercicioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ejercicioBeanSwingJInternalFrame.setIdActual(this.detalletablaamorti.getid_ejercicio());
					this.ejercicioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.inicializarActualizarBindingTablaEjercicio();
				}

				JInternalFrameBase jinternalFrame =this.ejercicioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleTablaAmorti=(TitledBorder)this.jScrollPanelDatosDetalleTablaAmorti.getBorder();
				TitledBorder titledBorderejercicio=(TitledBorder)this.ejercicioBeanSwingJInternalFrame.jScrollPanelDatosEjercicio.getBorder();

				titledBorderejercicio.setTitle(titledBorderDetalleTablaAmorti.getTitle() + " -> Ejercicio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamortiLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamortiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamortiLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ejercicioDetalleTablaAmortiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalletablaamortiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleTablaAmorti.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleTablaAmorti(this.getdetalletablaamorti(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleTablaAmorti(this.detalletablaamorti);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalletablaamorti =(DetalleTablaAmorti) this.detalletablaamortiLogic.getDetalleTablaAmortis().toArray()[this.jTableDatosDetalleTablaAmorti.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalletablaamorti =(DetalleTablaAmorti) this.detalletablaamortis.toArray()[this.jTableDatosDetalleTablaAmorti.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalletablaamorti==null) {
						this.detalletablaamorti = new DetalleTablaAmorti();
					}

					this.setVariablesFormularioToObjetoActualDetalleTablaAmorti(this.detalletablaamorti,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleTablaAmorti(this.detalletablaamorti);
				}

				if(this.detalletablaamorti.getid_ejercicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ejercicio = "+this.detalletablaamorti.getid_ejercicio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleTablaAmorti(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalletablaamortiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalletablaamortiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalletablaamortiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_periodoDetalleTablaAmortiUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamortiLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoperiodo=true;

			idTienePermisoperiodo=this.tienePermisosUsuarioEnPaginaWebDetalleTablaAmorti(PeriodoConstantesFunciones.CLASSNAME);

			if(idTienePermisoperiodo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleTablaAmorti.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleTablaAmorti.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleTablaAmorti.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalletablaamorti =(DetalleTablaAmorti) this.detalletablaamortiLogic.getDetalleTablaAmortis().toArray()[this.jTableDatosDetalleTablaAmorti.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalletablaamorti =(DetalleTablaAmorti) this.detalletablaamortis.toArray()[this.jTableDatosDetalleTablaAmorti.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleTablaAmorti(this.getdetalletablaamorti(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleTablaAmorti(this.detalletablaamorti);

				this.periodoBeanSwingJInternalFrame=new PeriodoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.periodoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.periodoBeanSwingJInternalFrame.getPeriodoLogic().setConnexion(this.detalletablaamortiLogic.getConnexion());

				if(this.detalletablaamorti.getid_periodo()!=null) {
					this.periodoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.periodoBeanSwingJInternalFrame.setIdActual(this.detalletablaamorti.getid_periodo());
					this.periodoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.inicializarActualizarBindingTablaPeriodo();
				}

				JInternalFrameBase jinternalFrame =this.periodoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleTablaAmorti=(TitledBorder)this.jScrollPanelDatosDetalleTablaAmorti.getBorder();
				TitledBorder titledBorderperiodo=(TitledBorder)this.periodoBeanSwingJInternalFrame.jScrollPanelDatosPeriodo.getBorder();

				titledBorderperiodo.setTitle(titledBorderDetalleTablaAmorti.getTitle() + " -> Periodo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamortiLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamortiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamortiLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_periodoDetalleTablaAmortiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalletablaamortiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleTablaAmorti.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleTablaAmorti(this.getdetalletablaamorti(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleTablaAmorti(this.detalletablaamorti);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalletablaamorti =(DetalleTablaAmorti) this.detalletablaamortiLogic.getDetalleTablaAmortis().toArray()[this.jTableDatosDetalleTablaAmorti.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalletablaamorti =(DetalleTablaAmorti) this.detalletablaamortis.toArray()[this.jTableDatosDetalleTablaAmorti.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalletablaamorti==null) {
						this.detalletablaamorti = new DetalleTablaAmorti();
					}

					this.setVariablesFormularioToObjetoActualDetalleTablaAmorti(this.detalletablaamorti,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleTablaAmorti(this.detalletablaamorti);
				}

				if(this.detalletablaamorti.getid_periodo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_periodo = "+this.detalletablaamorti.getid_periodo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleTablaAmorti(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalletablaamortiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalletablaamortiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalletablaamortiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tabla_amortiDetalleTablaAmortiUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamortiLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotablaamorti=true;

			idTienePermisotablaamorti=this.tienePermisosUsuarioEnPaginaWebDetalleTablaAmorti(TablaAmortiConstantesFunciones.CLASSNAME);

			if(idTienePermisotablaamorti) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleTablaAmorti.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleTablaAmorti.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleTablaAmorti.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalletablaamorti =(DetalleTablaAmorti) this.detalletablaamortiLogic.getDetalleTablaAmortis().toArray()[this.jTableDatosDetalleTablaAmorti.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalletablaamorti =(DetalleTablaAmorti) this.detalletablaamortis.toArray()[this.jTableDatosDetalleTablaAmorti.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleTablaAmorti(this.getdetalletablaamorti(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleTablaAmorti(this.detalletablaamorti);

				this.tablaamortiBeanSwingJInternalFrame=new TablaAmortiBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tablaamortiBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tablaamortiBeanSwingJInternalFrame.getTablaAmortiLogic().setConnexion(this.detalletablaamortiLogic.getConnexion());

				if(this.detalletablaamorti.getid_tabla_amorti()!=null) {
					this.tablaamortiBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tablaamortiBeanSwingJInternalFrame.setIdActual(this.detalletablaamorti.getid_tabla_amorti());
					this.tablaamortiBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tablaamortiBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tablaamortiBeanSwingJInternalFrame.inicializarActualizarBindingTablaTablaAmorti();
				}

				JInternalFrameBase jinternalFrame =this.tablaamortiBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleTablaAmorti=(TitledBorder)this.jScrollPanelDatosDetalleTablaAmorti.getBorder();
				TitledBorder titledBordertablaamorti=(TitledBorder)this.tablaamortiBeanSwingJInternalFrame.jScrollPanelDatosTablaAmorti.getBorder();

				titledBordertablaamorti.setTitle(titledBorderDetalleTablaAmorti.getTitle() + " -> Tabla Amorti");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamortiLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamortiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamortiLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tabla_amortiDetalleTablaAmortiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalletablaamortiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleTablaAmorti.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleTablaAmorti(this.getdetalletablaamorti(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleTablaAmorti(this.detalletablaamorti);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalletablaamorti =(DetalleTablaAmorti) this.detalletablaamortiLogic.getDetalleTablaAmortis().toArray()[this.jTableDatosDetalleTablaAmorti.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalletablaamorti =(DetalleTablaAmorti) this.detalletablaamortis.toArray()[this.jTableDatosDetalleTablaAmorti.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalletablaamorti==null) {
						this.detalletablaamorti = new DetalleTablaAmorti();
					}

					this.setVariablesFormularioToObjetoActualDetalleTablaAmorti(this.detalletablaamorti,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleTablaAmorti(this.detalletablaamorti);
				}

				if(this.detalletablaamorti.getid_tabla_amorti()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tabla_amorti = "+this.detalletablaamorti.getid_tabla_amorti().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleTablaAmorti(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalletablaamortiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalletablaamortiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalletablaamortiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalorDetalleTablaAmortiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalletablaamortiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleTablaAmorti.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleTablaAmorti(this.getdetalletablaamorti(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleTablaAmorti(this.detalletablaamorti);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalletablaamorti =(DetalleTablaAmorti) this.detalletablaamortiLogic.getDetalleTablaAmortis().toArray()[this.jTableDatosDetalleTablaAmorti.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalletablaamorti =(DetalleTablaAmorti) this.detalletablaamortis.toArray()[this.jTableDatosDetalleTablaAmorti.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalletablaamorti==null) {
						this.detalletablaamorti = new DetalleTablaAmorti();
					}

					this.setVariablesFormularioToObjetoActualDetalleTablaAmorti(this.detalletablaamorti,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleTablaAmorti(this.detalletablaamorti);
				}

				if(this.detalletablaamorti.getvalor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor = "+this.detalletablaamorti.getvalor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleTablaAmorti(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalletablaamortiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalletablaamortiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalletablaamortiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoninteresDetalleTablaAmortiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalletablaamortiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleTablaAmorti.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleTablaAmorti(this.getdetalletablaamorti(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleTablaAmorti(this.detalletablaamorti);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalletablaamorti =(DetalleTablaAmorti) this.detalletablaamortiLogic.getDetalleTablaAmortis().toArray()[this.jTableDatosDetalleTablaAmorti.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalletablaamorti =(DetalleTablaAmorti) this.detalletablaamortis.toArray()[this.jTableDatosDetalleTablaAmorti.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalletablaamorti==null) {
						this.detalletablaamorti = new DetalleTablaAmorti();
					}

					this.setVariablesFormularioToObjetoActualDetalleTablaAmorti(this.detalletablaamorti,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleTablaAmorti(this.detalletablaamorti);
				}

				if(this.detalletablaamorti.getinteres()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where interes = "+this.detalletablaamorti.getinteres().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleTablaAmorti(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalletablaamortiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalletablaamortiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalletablaamortiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncapitalDetalleTablaAmortiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalletablaamortiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleTablaAmorti.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleTablaAmorti(this.getdetalletablaamorti(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleTablaAmorti(this.detalletablaamorti);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalletablaamorti =(DetalleTablaAmorti) this.detalletablaamortiLogic.getDetalleTablaAmortis().toArray()[this.jTableDatosDetalleTablaAmorti.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalletablaamorti =(DetalleTablaAmorti) this.detalletablaamortis.toArray()[this.jTableDatosDetalleTablaAmorti.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalletablaamorti==null) {
						this.detalletablaamorti = new DetalleTablaAmorti();
					}

					this.setVariablesFormularioToObjetoActualDetalleTablaAmorti(this.detalletablaamorti,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleTablaAmorti(this.detalletablaamorti);
				}

				if(this.detalletablaamorti.getcapital()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where capital = "+this.detalletablaamorti.getcapital().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleTablaAmorti(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalletablaamortiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalletablaamortiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalletablaamortiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_inicioDetalleTablaAmortiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalletablaamortiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleTablaAmorti.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleTablaAmorti(this.getdetalletablaamorti(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleTablaAmorti(this.detalletablaamorti);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalletablaamorti =(DetalleTablaAmorti) this.detalletablaamortiLogic.getDetalleTablaAmortis().toArray()[this.jTableDatosDetalleTablaAmorti.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalletablaamorti =(DetalleTablaAmorti) this.detalletablaamortis.toArray()[this.jTableDatosDetalleTablaAmorti.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalletablaamorti==null) {
						this.detalletablaamorti = new DetalleTablaAmorti();
					}

					this.setVariablesFormularioToObjetoActualDetalleTablaAmorti(this.detalletablaamorti,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleTablaAmorti(this.detalletablaamorti);
				}

				if(this.detalletablaamorti.getfecha_inicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_inicio = '"+Funciones2.getStringPostgresDate(this.detalletablaamorti.getfecha_inicio())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleTablaAmorti(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalletablaamortiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalletablaamortiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalletablaamortiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_finDetalleTablaAmortiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalletablaamortiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleTablaAmorti.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleTablaAmorti(this.getdetalletablaamorti(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleTablaAmorti(this.detalletablaamorti);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalletablaamorti =(DetalleTablaAmorti) this.detalletablaamortiLogic.getDetalleTablaAmortis().toArray()[this.jTableDatosDetalleTablaAmorti.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalletablaamorti =(DetalleTablaAmorti) this.detalletablaamortis.toArray()[this.jTableDatosDetalleTablaAmorti.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalletablaamorti==null) {
						this.detalletablaamorti = new DetalleTablaAmorti();
					}

					this.setVariablesFormularioToObjetoActualDetalleTablaAmorti(this.detalletablaamorti,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleTablaAmorti(this.detalletablaamorti);
				}

				if(this.detalletablaamorti.getfecha_fin()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_fin = '"+Funciones2.getStringPostgresDate(this.detalletablaamorti.getfecha_fin())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleTablaAmorti(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalletablaamortiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalletablaamortiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalletablaamortiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionDetalleTablaAmortiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalletablaamortiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleTablaAmorti.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleTablaAmorti(this.getdetalletablaamorti(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleTablaAmorti(this.detalletablaamorti);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalletablaamorti =(DetalleTablaAmorti) this.detalletablaamortiLogic.getDetalleTablaAmortis().toArray()[this.jTableDatosDetalleTablaAmorti.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalletablaamorti =(DetalleTablaAmorti) this.detalletablaamortis.toArray()[this.jTableDatosDetalleTablaAmorti.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalletablaamorti==null) {
						this.detalletablaamorti = new DetalleTablaAmorti();
					}

					this.setVariablesFormularioToObjetoActualDetalleTablaAmorti(this.detalletablaamorti,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleTablaAmorti(this.detalletablaamorti);
				}

				if(this.detalletablaamorti.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.detalletablaamorti.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleTablaAmorti(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalletablaamortiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalletablaamortiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalletablaamortiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_anioDetalleTablaAmortiUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamortiLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoanio=true;

			idTienePermisoanio=this.tienePermisosUsuarioEnPaginaWebDetalleTablaAmorti(AnioConstantesFunciones.CLASSNAME);

			if(idTienePermisoanio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleTablaAmorti.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleTablaAmorti.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleTablaAmorti.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalletablaamorti =(DetalleTablaAmorti) this.detalletablaamortiLogic.getDetalleTablaAmortis().toArray()[this.jTableDatosDetalleTablaAmorti.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalletablaamorti =(DetalleTablaAmorti) this.detalletablaamortis.toArray()[this.jTableDatosDetalleTablaAmorti.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleTablaAmorti(this.getdetalletablaamorti(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleTablaAmorti(this.detalletablaamorti);

				this.anioBeanSwingJInternalFrame=new AnioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.anioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.anioBeanSwingJInternalFrame.getAnioLogic().setConnexion(this.detalletablaamortiLogic.getConnexion());

				if(this.detalletablaamorti.getid_anio()!=null) {
					this.anioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.anioBeanSwingJInternalFrame.setIdActual(this.detalletablaamorti.getid_anio());
					this.anioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.inicializarActualizarBindingTablaAnio();
				}

				JInternalFrameBase jinternalFrame =this.anioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleTablaAmorti=(TitledBorder)this.jScrollPanelDatosDetalleTablaAmorti.getBorder();
				TitledBorder titledBorderanio=(TitledBorder)this.anioBeanSwingJInternalFrame.jScrollPanelDatosAnio.getBorder();

				titledBorderanio.setTitle(titledBorderDetalleTablaAmorti.getTitle() + " -> Anio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamortiLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamortiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamortiLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_anioDetalleTablaAmortiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalletablaamortiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleTablaAmorti.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleTablaAmorti(this.getdetalletablaamorti(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleTablaAmorti(this.detalletablaamorti);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalletablaamorti =(DetalleTablaAmorti) this.detalletablaamortiLogic.getDetalleTablaAmortis().toArray()[this.jTableDatosDetalleTablaAmorti.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalletablaamorti =(DetalleTablaAmorti) this.detalletablaamortis.toArray()[this.jTableDatosDetalleTablaAmorti.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalletablaamorti==null) {
						this.detalletablaamorti = new DetalleTablaAmorti();
					}

					this.setVariablesFormularioToObjetoActualDetalleTablaAmorti(this.detalletablaamorti,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleTablaAmorti(this.detalletablaamorti);
				}

				if(this.detalletablaamorti.getid_anio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_anio = "+this.detalletablaamorti.getid_anio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleTablaAmorti(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalletablaamortiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalletablaamortiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalletablaamortiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_mesDetalleTablaAmortiUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamortiLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisomes=true;

			idTienePermisomes=this.tienePermisosUsuarioEnPaginaWebDetalleTablaAmorti(MesConstantesFunciones.CLASSNAME);

			if(idTienePermisomes) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleTablaAmorti.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleTablaAmorti.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleTablaAmorti.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalletablaamorti =(DetalleTablaAmorti) this.detalletablaamortiLogic.getDetalleTablaAmortis().toArray()[this.jTableDatosDetalleTablaAmorti.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalletablaamorti =(DetalleTablaAmorti) this.detalletablaamortis.toArray()[this.jTableDatosDetalleTablaAmorti.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleTablaAmorti(this.getdetalletablaamorti(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleTablaAmorti(this.detalletablaamorti);

				this.mesBeanSwingJInternalFrame=new MesBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.mesBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.mesBeanSwingJInternalFrame.getMesLogic().setConnexion(this.detalletablaamortiLogic.getConnexion());

				if(this.detalletablaamorti.getid_mes()!=null) {
					this.mesBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.mesBeanSwingJInternalFrame.setIdActual(this.detalletablaamorti.getid_mes());
					this.mesBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.inicializarActualizarBindingTablaMes();
				}

				JInternalFrameBase jinternalFrame =this.mesBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleTablaAmorti=(TitledBorder)this.jScrollPanelDatosDetalleTablaAmorti.getBorder();
				TitledBorder titledBordermes=(TitledBorder)this.mesBeanSwingJInternalFrame.jScrollPanelDatosMes.getBorder();

				titledBordermes.setTitle(titledBorderDetalleTablaAmorti.getTitle() + " -> Mes");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamortiLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamortiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamortiLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_mesDetalleTablaAmortiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalletablaamortiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleTablaAmorti.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleTablaAmorti(this.getdetalletablaamorti(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleTablaAmorti(this.detalletablaamorti);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalletablaamorti =(DetalleTablaAmorti) this.detalletablaamortiLogic.getDetalleTablaAmortis().toArray()[this.jTableDatosDetalleTablaAmorti.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalletablaamorti =(DetalleTablaAmorti) this.detalletablaamortis.toArray()[this.jTableDatosDetalleTablaAmorti.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalletablaamorti==null) {
						this.detalletablaamorti = new DetalleTablaAmorti();
					}

					this.setVariablesFormularioToObjetoActualDetalleTablaAmorti(this.detalletablaamorti,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleTablaAmorti(this.detalletablaamorti);
				}

				if(this.detalletablaamorti.getid_mes()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_mes = "+this.detalletablaamorti.getid_mes().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleTablaAmorti(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalletablaamortiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalletablaamortiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalletablaamortiLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdAnioDetalleTablaAmortiActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamortiLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleTablaAmorti(false,false);

			this.getDetalleTablaAmortisFK_IdAnio();

			this.inicializarActualizarBindingDetalleTablaAmorti(false);

			//if(DetalleTablaAmortiBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleTablaAmorti(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamortiLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamortiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamortiLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEjercicioDetalleTablaAmortiActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamortiLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleTablaAmorti(false,false);

			this.getDetalleTablaAmortisFK_IdEjercicio();

			this.inicializarActualizarBindingDetalleTablaAmorti(false);

			//if(DetalleTablaAmortiBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleTablaAmorti(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamortiLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamortiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamortiLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaDetalleTablaAmortiActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamortiLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleTablaAmorti(false,false);

			this.getDetalleTablaAmortisFK_IdEmpresa();

			this.inicializarActualizarBindingDetalleTablaAmorti(false);

			//if(DetalleTablaAmortiBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleTablaAmorti(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamortiLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamortiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamortiLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdMesDetalleTablaAmortiActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamortiLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleTablaAmorti(false,false);

			this.getDetalleTablaAmortisFK_IdMes();

			this.inicializarActualizarBindingDetalleTablaAmorti(false);

			//if(DetalleTablaAmortiBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleTablaAmorti(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamortiLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamortiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamortiLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPeriodoDetalleTablaAmortiActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamortiLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleTablaAmorti(false,false);

			this.getDetalleTablaAmortisFK_IdPeriodo();

			this.inicializarActualizarBindingDetalleTablaAmorti(false);

			//if(DetalleTablaAmortiBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleTablaAmorti(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamortiLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamortiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamortiLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalDetalleTablaAmortiActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamortiLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleTablaAmorti(false,false);

			this.getDetalleTablaAmortisFK_IdSucursal();

			this.inicializarActualizarBindingDetalleTablaAmorti(false);

			//if(DetalleTablaAmortiBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleTablaAmorti(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamortiLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamortiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamortiLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTablaAmortiDetalleTablaAmortiActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamortiLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleTablaAmorti(false,false);

			this.getDetalleTablaAmortisFK_IdTablaAmorti();

			this.inicializarActualizarBindingDetalleTablaAmorti(false);

			//if(DetalleTablaAmortiBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleTablaAmorti(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamortiLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamortiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalletablaamortiLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameDetalleTablaAmorti() {
		if(this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) {
			this.jInternalFrameDetalleFormDetalleTablaAmorti.setVisible(false);	    			
			this.jInternalFrameDetalleFormDetalleTablaAmorti.dispose();
			this.jInternalFrameDetalleFormDetalleTablaAmorti=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoDetalleTablaAmorti!=null) {
			this.jInternalFrameReporteDinamicoDetalleTablaAmorti.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoDetalleTablaAmorti.dispose();
			this.jInternalFrameReporteDinamicoDetalleTablaAmorti=null;
		}
		
		if(this.jInternalFrameImportacionDetalleTablaAmorti!=null) {
			this.jInternalFrameImportacionDetalleTablaAmorti.setVisible(false);	    			
			this.jInternalFrameImportacionDetalleTablaAmorti.dispose();
			this.jInternalFrameImportacionDetalleTablaAmorti=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessDetalleTablaAmorti();
			
			DetalleTablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalletablaamorti,new Object(),this.detalletablaamortiParameterGeneral,this.detalletablaamortiReturnGeneral);
			
			
			if(sTipo.equals("NuevoDetalleTablaAmorti")) {
				jButtonNuevoDetalleTablaAmortiActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarDetalleTablaAmorti")) {
				jButtonDuplicarDetalleTablaAmortiActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarDetalleTablaAmorti")) {
				jButtonCopiarDetalleTablaAmortiActionPerformed(evt);
			} else if(sTipo.equals("VerFormDetalleTablaAmorti")) {
				jButtonVerFormDetalleTablaAmortiActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarDetalleTablaAmorti")) {
				jButtonNuevoDetalleTablaAmortiActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarDetalleTablaAmorti")) {
				jButtonDuplicarDetalleTablaAmortiActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoDetalleTablaAmorti")) {
				jButtonNuevoDetalleTablaAmortiActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarDetalleTablaAmorti")) {
				jButtonDuplicarDetalleTablaAmortiActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesDetalleTablaAmorti")) {
				jButtonNuevoDetalleTablaAmortiActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarDetalleTablaAmorti")) {
				jButtonNuevoDetalleTablaAmortiActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesDetalleTablaAmorti")) {
				jButtonNuevoDetalleTablaAmortiActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarDetalleTablaAmorti")) {
				jButtonModificarDetalleTablaAmortiActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarDetalleTablaAmorti")) {
				jButtonModificarDetalleTablaAmortiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarDetalleTablaAmorti")) {
				jButtonModificarDetalleTablaAmortiActionPerformed(evt);
			} else if(sTipo.equals("ActualizarDetalleTablaAmorti")) {
				jButtonActualizarDetalleTablaAmortiActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarDetalleTablaAmorti")) {
				jButtonActualizarDetalleTablaAmortiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarDetalleTablaAmorti")) {
				jButtonActualizarDetalleTablaAmortiActionPerformed(evt);
			} else if(sTipo.equals("EliminarDetalleTablaAmorti")) {
				jButtonEliminarDetalleTablaAmortiActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarDetalleTablaAmorti")) {
				jButtonEliminarDetalleTablaAmortiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarDetalleTablaAmorti")) {
				jButtonEliminarDetalleTablaAmortiActionPerformed(evt);
			} else if(sTipo.equals("CancelarDetalleTablaAmorti")) {
				jButtonCancelarDetalleTablaAmortiActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarDetalleTablaAmorti")) {
				jButtonCancelarDetalleTablaAmortiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarDetalleTablaAmorti")) {
				jButtonCancelarDetalleTablaAmortiActionPerformed(evt);
			} else if(sTipo.equals("CerrarDetalleTablaAmorti")) {
				jButtonCerrarDetalleTablaAmortiActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarDetalleTablaAmorti")) {
				jButtonCerrarDetalleTablaAmortiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarDetalleTablaAmorti")) {
				jButtonCerrarDetalleTablaAmortiActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarDetalleTablaAmorti")) {
				jButtonMostrarOcultarDetalleTablaAmortiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarDetalleTablaAmorti")) {
				jButtonCancelarDetalleTablaAmortiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosDetalleTablaAmorti")) {
				jButtonGuardarCambiosDetalleTablaAmortiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarDetalleTablaAmorti")) {
				jButtonGuardarCambiosDetalleTablaAmortiActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarDetalleTablaAmorti")) {
				jButtonCopiarDetalleTablaAmortiActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarDetalleTablaAmorti")) {
				jButtonVerFormDetalleTablaAmortiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosDetalleTablaAmorti")) {
				jButtonGuardarCambiosDetalleTablaAmortiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarDetalleTablaAmorti")) {
				jButtonCopiarDetalleTablaAmortiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormDetalleTablaAmorti")) {
				jButtonVerFormDetalleTablaAmortiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaDetalleTablaAmorti")) {
				jButtonGuardarCambiosDetalleTablaAmortiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarDetalleTablaAmorti")) {
				jButtonGuardarCambiosDetalleTablaAmortiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaDetalleTablaAmorti")) {
				jButtonGuardarCambiosDetalleTablaAmortiActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionDetalleTablaAmorti")) {
				jButtonRecargarInformacionDetalleTablaAmortiActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarDetalleTablaAmorti")) {
				jButtonRecargarInformacionDetalleTablaAmortiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionDetalleTablaAmorti")) {
				jButtonRecargarInformacionDetalleTablaAmortiActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresDetalleTablaAmorti")) {
				jButtonAnterioresDetalleTablaAmortiActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarDetalleTablaAmorti")) {
				jButtonAnterioresDetalleTablaAmortiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreDetalleTablaAmorti")) {
				jButtonAnterioresDetalleTablaAmortiActionPerformed(evt);
			} else if(sTipo.equals("SiguientesDetalleTablaAmorti")) {
				jButtonSiguientesDetalleTablaAmortiActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarDetalleTablaAmorti")) {
				jButtonSiguientesDetalleTablaAmortiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesDetalleTablaAmorti")) {
				jButtonSiguientesDetalleTablaAmortiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByDetalleTablaAmorti") || sTipo.equals("MenuItemDetalleAbrirOrderByDetalleTablaAmorti")) {
				jButtonAbrirOrderByDetalleTablaAmortiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarDetalleTablaAmorti") || sTipo.equals("MenuItemDetalleMostrarOcultarDetalleTablaAmorti")) {
				jButtonMostrarOcultarDetalleTablaAmortiActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosDetalleTablaAmorti")) {
				jButtonNuevoGuardarCambiosDetalleTablaAmortiActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarDetalleTablaAmorti")) {
				jButtonNuevoGuardarCambiosDetalleTablaAmortiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosDetalleTablaAmorti")) {
				jButtonNuevoGuardarCambiosDetalleTablaAmortiActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoDetalleTablaAmorti")) {
				jButtonCerrarReporteDinamicoDetalleTablaAmortiActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoDetalleTablaAmorti")) {
				jButtonGenerarReporteDinamicoDetalleTablaAmortiActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoDetalleTablaAmorti")) {
				
				jButtonGenerarExcelReporteDinamicoDetalleTablaAmortiActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionDetalleTablaAmorti")) {
				jButtonCerrarImportacionDetalleTablaAmortiActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionDetalleTablaAmorti")) {
				
				jButtonGenerarImportacionDetalleTablaAmortiActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionDetalleTablaAmorti")) {
				
				jButtonAbrirImportacionDetalleTablaAmortiActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesDetalleTablaAmorti")) {
				jComboBoxTiposAccionesDetalleTablaAmortiActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesDetalleTablaAmorti")) {
				jComboBoxTiposRelacionesDetalleTablaAmortiActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioDetalleTablaAmorti")) {
				jComboBoxTiposAccionesDetalleTablaAmortiActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarDetalleTablaAmorti")) {
				
				jComboBoxTiposSeleccionarDetalleTablaAmortiActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralDetalleTablaAmorti")) {
				jTextFieldValorCampoGeneralDetalleTablaAmortiActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByDetalleTablaAmorti")) {
				jButtonAbrirOrderByDetalleTablaAmortiActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarDetalleTablaAmorti")) {
				jButtonAbrirOrderByDetalleTablaAmortiActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByDetalleTablaAmorti")) {
				jButtonCerrarOrderByDetalleTablaAmortiActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDetalleTablaAmortiBusqueda")) {
				this.jButtonidDetalleTablaAmortiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaDetalleTablaAmortiUpdate")) {
				this.jButtonid_empresaDetalleTablaAmortiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaDetalleTablaAmortiBusqueda")) {
				this.jButtonid_empresaDetalleTablaAmortiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalDetalleTablaAmortiUpdate")) {
				this.jButtonid_sucursalDetalleTablaAmortiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalDetalleTablaAmortiBusqueda")) {
				this.jButtonid_sucursalDetalleTablaAmortiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioDetalleTablaAmortiUpdate")) {
				this.jButtonid_ejercicioDetalleTablaAmortiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioDetalleTablaAmortiBusqueda")) {
				this.jButtonid_ejercicioDetalleTablaAmortiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoDetalleTablaAmortiUpdate")) {
				this.jButtonid_periodoDetalleTablaAmortiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoDetalleTablaAmortiBusqueda")) {
				this.jButtonid_periodoDetalleTablaAmortiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tabla_amortiDetalleTablaAmortiUpdate")) {
				this.jButtonid_tabla_amortiDetalleTablaAmortiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tabla_amortiDetalleTablaAmortiBusqueda")) {
				this.jButtonid_tabla_amortiDetalleTablaAmortiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorDetalleTablaAmortiBusqueda")) {
				this.jButtonvalorDetalleTablaAmortiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("interesDetalleTablaAmortiBusqueda")) {
				this.jButtoninteresDetalleTablaAmortiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("capitalDetalleTablaAmortiBusqueda")) {
				this.jButtoncapitalDetalleTablaAmortiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_inicioDetalleTablaAmortiBusqueda")) {
				this.jButtonfecha_inicioDetalleTablaAmortiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_finDetalleTablaAmortiBusqueda")) {
				this.jButtonfecha_finDetalleTablaAmortiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionDetalleTablaAmortiBusqueda")) {
				this.jButtondescripcionDetalleTablaAmortiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioDetalleTablaAmortiUpdate")) {
				this.jButtonid_anioDetalleTablaAmortiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioDetalleTablaAmortiBusqueda")) {
				this.jButtonid_anioDetalleTablaAmortiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesDetalleTablaAmortiUpdate")) {
				this.jButtonid_mesDetalleTablaAmortiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesDetalleTablaAmortiBusqueda")) {
				this.jButtonid_mesDetalleTablaAmortiBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdTablaAmortiDetalleTablaAmorti")) {
				this.jButtonFK_IdTablaAmortiDetalleTablaAmortiActionPerformed(evt);
			}
			
			;
			
			
			DetalleTablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalletablaamorti,new Object(),this.detalletablaamortiParameterGeneral,this.detalletablaamortiReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessDetalleTablaAmorti();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleTablaAmortiActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalletablaamorti);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalletablaamorti);
				
				DetalleTablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalletablaamorti,new Object(),this.detalletablaamortiParameterGeneral,this.detalletablaamortiReturnGeneral);
				
				


				
				DetalleTablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalletablaamorti,new Object(),this.detalletablaamortiParameterGeneral,this.detalletablaamortiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleTablaAmorti.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleTablaAmorti.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			DetalleTablaAmorti detalletablaamortiLocal=null;
			
			if(!this.getEsControlTabla()) {
				detalletablaamortiLocal=this.detalletablaamorti;
			} else {
				detalletablaamortiLocal=this.detalletablaamortiAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalletablaamorti);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalletablaamorti);
				
				DetalleTablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalletablaamorti,new Object(),this.detalletablaamortiParameterGeneral,this.detalletablaamortiReturnGeneral);
							
				
				


				
				DetalleTablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalletablaamorti,new Object(),this.detalletablaamortiParameterGeneral,this.detalletablaamortiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleTablaAmorti.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleTablaAmorti.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleTablaAmortiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleTablaAmorti.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalletablaamortiAnterior =(DetalleTablaAmorti) this.detalletablaamortiLogic.getDetalleTablaAmortis().toArray()[this.jTableDatosDetalleTablaAmorti.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalletablaamortiAnterior =(DetalleTablaAmorti) this.detalletablaamortis.toArray()[this.jTableDatosDetalleTablaAmorti.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
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
			
			DetalleTablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalletablaamorti,new Object(),this.detalletablaamortiParameterGeneral,this.detalletablaamortiReturnGeneral);
			
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
			
			


			
			DetalleTablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalletablaamorti,new Object(),this.detalletablaamortiParameterGeneral,this.detalletablaamortiReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleTablaAmortiActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalletablaamorti);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalletablaamorti);
				
				DetalleTablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalletablaamorti,new Object(),this.detalletablaamortiParameterGeneral,this.detalletablaamortiReturnGeneral);
								
						
				


				
				DetalleTablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalletablaamorti,new Object(),this.detalletablaamortiParameterGeneral,this.detalletablaamortiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleTablaAmorti.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleTablaAmorti.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalletablaamorti);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalletablaamorti);
				
				DetalleTablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalletablaamorti,new Object(),this.detalletablaamortiParameterGeneral,this.detalletablaamortiReturnGeneral);
								
				
				


				
				DetalleTablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalletablaamorti,new Object(),this.detalletablaamortiParameterGeneral,this.detalletablaamortiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleTablaAmorti.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleTablaAmorti.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleTablaAmortiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleTablaAmorti.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalletablaamortiAnterior =(DetalleTablaAmorti) this.detalletablaamortiLogic.getDetalleTablaAmortis().toArray()[this.jTableDatosDetalleTablaAmorti.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalletablaamortiAnterior =(DetalleTablaAmorti) this.detalletablaamortis.toArray()[this.jTableDatosDetalleTablaAmorti.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalletablaamorti);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalletablaamorti);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleTablaAmortiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleTablaAmorti.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalletablaamortiAnterior =(DetalleTablaAmorti) this.detalletablaamortiLogic.getDetalleTablaAmortis().toArray()[this.jTableDatosDetalleTablaAmorti.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalletablaamortiAnterior =(DetalleTablaAmorti) this.detalletablaamortis.toArray()[this.jTableDatosDetalleTablaAmorti.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleTablaAmortiActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.detalletablaamorti);
			
			this.actualizarInformacion("INFO_PADRE",false,this.detalletablaamorti);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalletablaamorti);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalletablaamorti);
				
				DetalleTablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalletablaamorti,new Object(),this.detalletablaamortiParameterGeneral,this.detalletablaamortiReturnGeneral);
							
				
				


				
				DetalleTablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalletablaamorti,new Object(),this.detalletablaamortiParameterGeneral,this.detalletablaamortiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleTablaAmorti.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleTablaAmorti.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleTablaAmortiActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDetalleTablaAmorti.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalletablaamortiAnterior =(DetalleTablaAmorti) this.detalletablaamortiLogic.getDetalleTablaAmortis().toArray()[this.jTableDatosDetalleTablaAmorti.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.detalletablaamortiAnterior =(DetalleTablaAmorti) this.detalletablaamortis.toArray()[this.jTableDatosDetalleTablaAmorti.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
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
			
			DetalleTablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalletablaamorti,new Object(),this.detalletablaamortiParameterGeneral,this.detalletablaamortiReturnGeneral);
			
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
			
			


			
			DetalleTablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalletablaamorti,new Object(),this.detalletablaamortiParameterGeneral,this.detalletablaamortiReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleTablaAmortiActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.detalletablaamorti);
			
			this.actualizarInformacion("INFO_PADRE",false,this.detalletablaamorti);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalletablaamorti);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalletablaamorti);
				
				DetalleTablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalletablaamorti,new Object(),this.detalletablaamortiParameterGeneral,this.detalletablaamortiReturnGeneral);
								
				
				


				
				DetalleTablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalletablaamorti,new Object(),this.detalletablaamortiParameterGeneral,this.detalletablaamortiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleTablaAmorti.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleTablaAmorti.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleTablaAmortiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleTablaAmorti.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalletablaamortiAnterior =(DetalleTablaAmorti) this.detalletablaamortiLogic.getDetalleTablaAmortis().toArray()[this.jTableDatosDetalleTablaAmorti.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalletablaamortiAnterior =(DetalleTablaAmorti) this.detalletablaamortis.toArray()[this.jTableDatosDetalleTablaAmorti.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleTablaAmortiActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.detalletablaamorti);
			
			this.actualizarInformacion("INFO_PADRE",false,this.detalletablaamorti);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleTablaAmortiActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalletablaamorti);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalletablaamorti);
				
				DetalleTablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalletablaamorti,new Object(),this.detalletablaamortiParameterGeneral,this.detalletablaamortiReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosDetalleTablaAmorti")) {
					jCheckBoxSeleccionarTodosDetalleTablaAmortiItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosDetalleTablaAmorti")) {
					jCheckBoxSeleccionadosDetalleTablaAmortiItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarDetalleTablaAmorti")) {
					
				}
				
				


				
				
				DetalleTablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalletablaamorti,new Object(),this.detalletablaamortiParameterGeneral,this.detalletablaamortiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleTablaAmorti.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleTablaAmorti.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.detalletablaamorti);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.detalletablaamorti);
				
				DetalleTablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalletablaamorti,new Object(),this.detalletablaamortiParameterGeneral,this.detalletablaamortiReturnGeneral);
												
				
				


				
				
				DetalleTablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalletablaamorti,new Object(),this.detalletablaamortiParameterGeneral,this.detalletablaamortiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleTablaAmorti.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleTablaAmorti.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleTablaAmortiActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDetalleTablaAmorti.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalletablaamortiAnterior =(DetalleTablaAmorti) this.detalletablaamortiLogic.getDetalleTablaAmortis().toArray()[this.jTableDatosDetalleTablaAmorti.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.detalletablaamortiAnterior =(DetalleTablaAmorti) this.detalletablaamortis.toArray()[this.jTableDatosDetalleTablaAmorti.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleTablaAmortiActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalletablaamorti);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalletablaamorti);
				
				DetalleTablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalletablaamorti,new Object(),this.detalletablaamortiParameterGeneral,this.detalletablaamortiReturnGeneral);
				
				
				DetalleTablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalletablaamorti,new Object(),this.detalletablaamortiParameterGeneral,this.detalletablaamortiReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
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
			
			DetalleTablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.detalletablaamorti,new Object(),this.detalletablaamortiParameterGeneral,this.detalletablaamortiReturnGeneral);
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
			
			


			
			DetalleTablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalletablaamorti,new Object(),this.detalletablaamortiParameterGeneral,this.detalletablaamortiReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleTablaAmortiActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalletablaamorti);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalletablaamorti);
				
				DetalleTablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.detalletablaamorti,new Object(),this.detalletablaamortiParameterGeneral,this.detalletablaamortiReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				DetalleTablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalletablaamorti,new Object(),this.detalletablaamortiParameterGeneral,this.detalletablaamortiReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleTablaAmorti.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleTablaAmorti.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalletablaamorti);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalletablaamorti);
				
				DetalleTablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.detalletablaamorti,new Object(),this.detalletablaamortiParameterGeneral,this.detalletablaamortiReturnGeneral);
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
				
				


				
				DetalleTablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalletablaamorti,new Object(),this.detalletablaamortiParameterGeneral,this.detalletablaamortiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleTablaAmorti.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleTablaAmorti.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleTablaAmortiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleTablaAmorti.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalletablaamortiAnterior =(DetalleTablaAmorti) this.detalletablaamortiLogic.getDetalleTablaAmortis().toArray()[this.jTableDatosDetalleTablaAmorti.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalletablaamortiAnterior =(DetalleTablaAmorti) this.detalletablaamortis.toArray()[this.jTableDatosDetalleTablaAmorti.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				DetalleTablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalletablaamorti,new Object(),this.detalletablaamortiParameterGeneral,this.detalletablaamortiReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarDetalleTablaAmorti")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosDetalleTablaAmortiListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosDetalleTablaAmorti.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.detalletablaamorti =(DetalleTablaAmorti) this.detalletablaamortiLogic.getDetalleTablaAmortis().toArray()[this.jTableDatosDetalleTablaAmorti.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.detalletablaamorti =(DetalleTablaAmorti) this.detalletablaamortis.toArray()[this.jTableDatosDetalleTablaAmorti.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.detalletablaamorti);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarDetalleTablaAmorti")) {
				
				}
				
				DetalleTablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalletablaamorti,new Object(),this.detalletablaamortiParameterGeneral,this.detalletablaamortiReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			DetalleTablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.detalletablaamorti,new Object(),this.detalletablaamortiParameterGeneral,this.detalletablaamortiReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarDetalleTablaAmorti")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosDetalleTablaAmorti.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarDetalleTablaAmorti")) {
			
			}
			
			DetalleTablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.detalletablaamorti,new Object(),this.detalletablaamortiParameterGeneral,this.detalletablaamortiReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessDetalleTablaAmorti();
			
			DetalleTablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalletablaamorti,new Object(),this.detalletablaamortiParameterGeneral,this.detalletablaamortiReturnGeneral);
			
			if(sTipo.equals("NuevoDetalleTablaAmorti")) {
				jButtonNuevoDetalleTablaAmortiActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarDetalleTablaAmorti")) {
				jButtonDuplicarDetalleTablaAmortiActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarDetalleTablaAmorti")) {
				jButtonCopiarDetalleTablaAmortiActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormDetalleTablaAmorti")) {
				jButtonVerFormDetalleTablaAmortiActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesDetalleTablaAmorti")) {
				jButtonNuevoDetalleTablaAmortiActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarDetalleTablaAmorti")) {
				jButtonModificarDetalleTablaAmortiActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarDetalleTablaAmorti")) {
				jButtonActualizarDetalleTablaAmortiActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarDetalleTablaAmorti")) {
				jButtonEliminarDetalleTablaAmortiActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaDetalleTablaAmorti")) {
				jButtonGuardarCambiosDetalleTablaAmortiActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarDetalleTablaAmorti")) {
				jButtonCancelarDetalleTablaAmortiActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarDetalleTablaAmorti")) {
				jButtonCerrarDetalleTablaAmortiActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosDetalleTablaAmorti")) {
				jButtonGuardarCambiosDetalleTablaAmortiActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosDetalleTablaAmorti")) {
				jButtonNuevoGuardarCambiosDetalleTablaAmortiActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByDetalleTablaAmorti")) {
				jButtonAbrirOrderByDetalleTablaAmortiActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionDetalleTablaAmorti")) {
				jButtonRecargarInformacionDetalleTablaAmortiActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresDetalleTablaAmorti")) {
				jButtonAnterioresDetalleTablaAmortiActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesDetalleTablaAmorti")) {
				jButtonSiguientesDetalleTablaAmortiActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDetalleTablaAmortiBusqueda")) {
				this.jButtonidDetalleTablaAmortiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaDetalleTablaAmortiUpdate")) {
				this.jButtonid_empresaDetalleTablaAmortiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaDetalleTablaAmortiBusqueda")) {
				this.jButtonid_empresaDetalleTablaAmortiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalDetalleTablaAmortiUpdate")) {
				this.jButtonid_sucursalDetalleTablaAmortiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalDetalleTablaAmortiBusqueda")) {
				this.jButtonid_sucursalDetalleTablaAmortiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioDetalleTablaAmortiUpdate")) {
				this.jButtonid_ejercicioDetalleTablaAmortiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioDetalleTablaAmortiBusqueda")) {
				this.jButtonid_ejercicioDetalleTablaAmortiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoDetalleTablaAmortiUpdate")) {
				this.jButtonid_periodoDetalleTablaAmortiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoDetalleTablaAmortiBusqueda")) {
				this.jButtonid_periodoDetalleTablaAmortiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tabla_amortiDetalleTablaAmortiUpdate")) {
				this.jButtonid_tabla_amortiDetalleTablaAmortiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tabla_amortiDetalleTablaAmortiBusqueda")) {
				this.jButtonid_tabla_amortiDetalleTablaAmortiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorDetalleTablaAmortiBusqueda")) {
				this.jButtonvalorDetalleTablaAmortiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("interesDetalleTablaAmortiBusqueda")) {
				this.jButtoninteresDetalleTablaAmortiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("capitalDetalleTablaAmortiBusqueda")) {
				this.jButtoncapitalDetalleTablaAmortiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_inicioDetalleTablaAmortiBusqueda")) {
				this.jButtonfecha_inicioDetalleTablaAmortiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_finDetalleTablaAmortiBusqueda")) {
				this.jButtonfecha_finDetalleTablaAmortiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionDetalleTablaAmortiBusqueda")) {
				this.jButtondescripcionDetalleTablaAmortiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioDetalleTablaAmortiUpdate")) {
				this.jButtonid_anioDetalleTablaAmortiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioDetalleTablaAmortiBusqueda")) {
				this.jButtonid_anioDetalleTablaAmortiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesDetalleTablaAmortiUpdate")) {
				this.jButtonid_mesDetalleTablaAmortiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesDetalleTablaAmortiBusqueda")) {
				this.jButtonid_mesDetalleTablaAmortiBusquedaActionPerformed(evt);
			}
			
			DetalleTablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalletablaamorti,new Object(),this.detalletablaamortiParameterGeneral,this.detalletablaamortiReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessDetalleTablaAmorti();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			DetalleTablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.detalletablaamorti,new Object(),this.detalletablaamortiParameterGeneral,this.detalletablaamortiReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameDetalleTablaAmorti")) {
				closingInternalFrameDetalleTablaAmorti();
				
			} else if(sTipo.equals("jButtonCancelarDetalleTablaAmorti")) {
				JInternalFrameBase jInternalFrameDetalleFormDetalleTablaAmorti = (JInternalFrameBase)evt.getSource();
	            	
	            DetalleTablaAmortiBeanSwingJInternalFrame jInternalFrameParent=(DetalleTablaAmortiBeanSwingJInternalFrame)jInternalFrameDetalleFormDetalleTablaAmorti.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarDetalleTablaAmortiActionPerformed(null);
			}
			
			DetalleTablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.detalletablaamorti,new Object(),this.detalletablaamortiParameterGeneral,this.detalletablaamortiReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormDetalleTablaAmorti(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormDetalleTablaAmorti(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormDetalleTablaAmorti(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.detalletablaamorti)) {
			if(!esControlTabla) {
				if(DetalleTablaAmortiJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualDetalleTablaAmorti(this.detalletablaamorti,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleTablaAmorti(this.detalletablaamorti);			
				}
				
				if(this.detalletablaamortiSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualDetalleTablaAmorti(this.detalletablaamorti,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.detalletablaamortiReturnGeneral=detalletablaamortiLogic.procesarEventosDetalleTablaAmortisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detalletablaamortiLogic.getDetalleTablaAmortis(),this.detalletablaamorti,this.detalletablaamortiParameterGeneral,this.isEsNuevoDetalleTablaAmorti,classes);//this.detalletablaamortiLogic.getDetalleTablaAmorti()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanDetalleTablaAmorti(this.detalletablaamortiReturnGeneral,this.detalletablaamortiBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.detalletablaamortiSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanDetalleTablaAmorti(classes,this.detalletablaamortiReturnGeneral,this.detalletablaamortiBean,false);
					}
						
					if(this.detalletablaamortiReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyDetalleTablaAmorti(this.detalletablaamortiReturnGeneral.getDetalleTablaAmorti());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioDetalleTablaAmorti(this.detalletablaamortiReturnGeneral.getDetalleTablaAmorti());	
					}
						
					if(this.detalletablaamortiReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioDetalleTablaAmorti(this.detalletablaamortiReturnGeneral.getDetalleTablaAmorti(),classes);//this.detalletablaamortiBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioDetalleTablaAmorti(this.detalletablaamorti,classes);//this.detalletablaamortiBean);									
				}
			
				if(DetalleTablaAmortiJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualDetalleTablaAmorti(this.detalletablaamorti,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleTablaAmorti(this.detalletablaamorti);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.detalletablaamortiAnterior!=null) {
						this.detalletablaamorti=this.detalletablaamortiAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.detalletablaamortiReturnGeneral=detalletablaamortiLogic.procesarEventosDetalleTablaAmortisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detalletablaamortiLogic.getDetalleTablaAmortis(),this.detalletablaamorti,this.detalletablaamortiParameterGeneral,this.isEsNuevoDetalleTablaAmorti,classes);//this.detalletablaamortiLogic.getDetalleTablaAmorti()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.detalletablaamortiSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.detalletablaamortiSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.detalletablaamortiReturnGeneral.getDetalleTablaAmorti(),detalletablaamortiLogic.getDetalleTablaAmortis());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.detalletablaamortiReturnGeneral.getDetalleTablaAmorti(),this.detalletablaamortis);
				}
				//ARCHITECTURE
				
				//this.jTableDatosDetalleTablaAmorti.repaint();
				
				//((AbstractTableModel) this.jTableDatosDetalleTablaAmorti.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosDetalleTablaAmorti();
			}
		}
	}
	
	public void actualizarVisualTableDatosDetalleTablaAmorti() throws Exception {
		
		DetalleTablaAmortiModel detalletablaamortiModel=(DetalleTablaAmortiModel)this.jTableDatosDetalleTablaAmorti.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			detalletablaamortiModel.detalletablaamortis=this.detalletablaamortiLogic.getDetalleTablaAmortis();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			detalletablaamortiModel.detalletablaamortis=this.detalletablaamortis;
		}
		
		
		((DetalleTablaAmortiModel) this.jTableDatosDetalleTablaAmorti.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaDetalleTablaAmorti() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getdetalletablaamortiAnterior(),this.detalletablaamortiLogic.getDetalleTablaAmortis());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getdetalletablaamortiAnterior(),this.detalletablaamortis);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosDetalleTablaAmorti();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioDetalleTablaAmorti(DetalleTablaAmorti detalletablaamorti,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
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
										
				DetalleTablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detalletablaamorti,new Object(),generalEntityParameterGeneral,this.detalletablaamortiReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.detalletablaamortiSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=DetalleTablaAmortiConstantesFunciones.getClassesRelationshipsOfDetalleTablaAmorti(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=DetalleTablaAmortiConstantesFunciones.getClassesRelationshipsFromStringsOfDetalleTablaAmorti(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormDetalleTablaAmorti(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				DetalleTablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detalletablaamorti,new Object(),generalEntityParameterGeneral,this.detalletablaamortiReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioDetalleTablaAmorti(DetalleTablaAmortiBean detalletablaamortiBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanDetalleTablaAmorti(ArrayList<Classe> classes,DetalleTablaAmortiReturnGeneral detalletablaamortiReturnGeneral,DetalleTablaAmortiBean detalletablaamortiBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualDetalleTablaAmorti(DetalleTablaAmorti detalletablaamorti,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.detalletablaamorti)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormDetalleTablaAmorti = new DetalleTablaAmortiDetalleFormJInternalFrame(jDesktopPane,this.detalletablaamortiSessionBean.getConGuardarRelaciones(),this.detalletablaamortiSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormDetalleTablaAmorti);
		this.jInternalFrameDetalleFormDetalleTablaAmorti.setVisible(false);
		this.jInternalFrameDetalleFormDetalleTablaAmorti.setSelected(false);						
		
		this.jInternalFrameDetalleFormDetalleTablaAmorti.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormDetalleTablaAmorti.detalletablaamortiLogic=this.detalletablaamortiLogic;
		
		this.cargarCombosFrameForeignKeyDetalleTablaAmorti("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleDetalleTablaAmorti();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDetalleTablaAmorti();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyDetalleTablaAmorti("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyDetalleTablaAmorti();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormDetalleTablaAmorti.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDetalleTablaAmorti"));
		
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonModificarDetalleTablaAmorti.addActionListener(new ButtonActionListener(this,"ModificarDetalleTablaAmorti"));

		
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonModificarToolBarDetalleTablaAmorti.addActionListener(new ButtonActionListener(this,"ModificarToolBarDetalleTablaAmorti"));
					
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jMenuItemModificarDetalleTablaAmorti.addActionListener(new ButtonActionListener(this,"MenuItemModificarDetalleTablaAmorti"));		
		
		
		
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonActualizarDetalleTablaAmorti.addActionListener (new ButtonActionListener(this,"ActualizarDetalleTablaAmorti"));
		
		
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonActualizarToolBarDetalleTablaAmorti.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDetalleTablaAmorti"));
						
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jMenuItemActualizarDetalleTablaAmorti.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDetalleTablaAmorti"));		
		
		
		
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonEliminarDetalleTablaAmorti.addActionListener (new ButtonActionListener(this,"EliminarDetalleTablaAmorti"));
		
		
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonEliminarToolBarDetalleTablaAmorti.addActionListener (new ButtonActionListener(this,"EliminarToolBarDetalleTablaAmorti"));
								
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jMenuItemEliminarDetalleTablaAmorti.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDetalleTablaAmorti"));		
		
		
		
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonCancelarDetalleTablaAmorti.addActionListener (new ButtonActionListener(this,"CancelarDetalleTablaAmorti"));
		
		
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonCancelarToolBarDetalleTablaAmorti.addActionListener (new ButtonActionListener(this,"CancelarToolBarDetalleTablaAmorti"));
					
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jMenuItemCancelarDetalleTablaAmorti.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDetalleTablaAmorti"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jMenuItemDetalleCerrarDetalleTablaAmorti.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDetalleTablaAmorti"));		
		
		
		
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonGuardarCambiosToolBarDetalleTablaAmorti.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDetalleTablaAmorti"));
		
		
		
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonGuardarCambiosToolBarDetalleTablaAmorti.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDetalleTablaAmorti"));
		
		
		
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxTiposAccionesFormularioDetalleTablaAmorti.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDetalleTablaAmorti"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonidDetalleTablaAmortiBusqueda.addActionListener(new ButtonActionListener(this,"idDetalleTablaAmortiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonid_empresaDetalleTablaAmortiUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDetalleTablaAmortiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonid_empresaDetalleTablaAmortiBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDetalleTablaAmortiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonid_sucursalDetalleTablaAmortiUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalDetalleTablaAmortiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonid_sucursalDetalleTablaAmortiBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalDetalleTablaAmortiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonid_ejercicioDetalleTablaAmortiUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioDetalleTablaAmortiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonid_ejercicioDetalleTablaAmortiBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioDetalleTablaAmortiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonid_periodoDetalleTablaAmortiUpdate.addActionListener(new ButtonActionListener(this,"id_periodoDetalleTablaAmortiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonid_periodoDetalleTablaAmortiBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoDetalleTablaAmortiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonid_tabla_amortiDetalleTablaAmortiUpdate.addActionListener(new ButtonActionListener(this,"id_tabla_amortiDetalleTablaAmortiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonid_tabla_amortiDetalleTablaAmortiBusqueda.addActionListener(new ButtonActionListener(this,"id_tabla_amortiDetalleTablaAmortiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonvalorDetalleTablaAmortiBusqueda.addActionListener(new ButtonActionListener(this,"valorDetalleTablaAmortiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtoninteresDetalleTablaAmortiBusqueda.addActionListener(new ButtonActionListener(this,"interesDetalleTablaAmortiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtoncapitalDetalleTablaAmortiBusqueda.addActionListener(new ButtonActionListener(this,"capitalDetalleTablaAmortiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonfecha_inicioDetalleTablaAmortiBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioDetalleTablaAmortiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonfecha_finDetalleTablaAmortiBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finDetalleTablaAmortiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtondescripcionDetalleTablaAmortiBusqueda.addActionListener(new ButtonActionListener(this,"descripcionDetalleTablaAmortiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonid_anioDetalleTablaAmortiUpdate.addActionListener(new ButtonActionListener(this,"id_anioDetalleTablaAmortiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonid_anioDetalleTablaAmortiBusqueda.addActionListener(new ButtonActionListener(this,"id_anioDetalleTablaAmortiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonid_mesDetalleTablaAmortiUpdate.addActionListener(new ButtonActionListener(this,"id_mesDetalleTablaAmortiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonid_mesDetalleTablaAmortiBusqueda.addActionListener(new ButtonActionListener(this,"id_mesDetalleTablaAmortiBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jTabbedPaneRelacionesDetalleTablaAmorti.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDetalleTablaAmorti"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameDetalleTablaAmorti"));
		
		if(this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleTablaAmorti.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDetalleTablaAmorti"));
		}
		
		this.jTableDatosDetalleTablaAmorti.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarDetalleTablaAmorti"));
		
		this.jTableDatosDetalleTablaAmorti.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarDetalleTablaAmorti"));
		
		this.jButtonNuevoDetalleTablaAmorti.addActionListener(new ButtonActionListener(this,"NuevoDetalleTablaAmorti"));
		
		this.jButtonDuplicarDetalleTablaAmorti.addActionListener(new ButtonActionListener(this,"DuplicarDetalleTablaAmorti"));
		
		this.jButtonCopiarDetalleTablaAmorti.addActionListener(new ButtonActionListener(this,"CopiarDetalleTablaAmorti"));
		
		this.jButtonVerFormDetalleTablaAmorti.addActionListener(new ButtonActionListener(this,"VerFormDetalleTablaAmorti"));
		
		
		this.jButtonNuevoToolBarDetalleTablaAmorti.addActionListener(new ButtonActionListener(this,"NuevoToolBarDetalleTablaAmorti"));
			
		this.jButtonDuplicarToolBarDetalleTablaAmorti.addActionListener(new ButtonActionListener(this,"DuplicarToolBarDetalleTablaAmorti"));
			
		this.jMenuItemNuevoDetalleTablaAmorti.addActionListener (new ButtonActionListener(this,"MenuItemNuevoDetalleTablaAmorti"));
			
		this.jMenuItemDuplicarDetalleTablaAmorti.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarDetalleTablaAmorti"));		
		
		
		this.jButtonNuevoRelacionesDetalleTablaAmorti.addActionListener (new ButtonActionListener(this,"NuevoRelacionesDetalleTablaAmorti"));
		
		
		this.jButtonNuevoRelacionesToolBarDetalleTablaAmorti.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarDetalleTablaAmorti"));
			
		this.jMenuItemNuevoRelacionesDetalleTablaAmorti.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesDetalleTablaAmorti"));		
		
		
		if(this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonModificarDetalleTablaAmorti.addActionListener(new ButtonActionListener(this,"ModificarDetalleTablaAmorti"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonModificarToolBarDetalleTablaAmorti.addActionListener(new ButtonActionListener(this,"ModificarToolBarDetalleTablaAmorti"));
			
			this.jInternalFrameDetalleFormDetalleTablaAmorti.jMenuItemModificarDetalleTablaAmorti.addActionListener(new ButtonActionListener(this,"MenuItemModificarDetalleTablaAmorti"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonActualizarDetalleTablaAmorti.addActionListener (new ButtonActionListener(this,"ActualizarDetalleTablaAmorti"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonActualizarToolBarDetalleTablaAmorti.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDetalleTablaAmorti"));
				
			this.jInternalFrameDetalleFormDetalleTablaAmorti.jMenuItemActualizarDetalleTablaAmorti.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDetalleTablaAmorti"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonEliminarDetalleTablaAmorti.addActionListener (new ButtonActionListener(this,"EliminarDetalleTablaAmorti"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonEliminarToolBarDetalleTablaAmorti.addActionListener (new ButtonActionListener(this,"EliminarToolBarDetalleTablaAmorti"));
						
			this.jInternalFrameDetalleFormDetalleTablaAmorti.jMenuItemEliminarDetalleTablaAmorti.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDetalleTablaAmorti"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonCancelarDetalleTablaAmorti.addActionListener (new ButtonActionListener(this,"CancelarDetalleTablaAmorti"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonCancelarToolBarDetalleTablaAmorti.addActionListener (new ButtonActionListener(this,"CancelarToolBarDetalleTablaAmorti"));
			
			this.jInternalFrameDetalleFormDetalleTablaAmorti.jMenuItemCancelarDetalleTablaAmorti.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDetalleTablaAmorti"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarDetalleTablaAmorti.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarDetalleTablaAmorti"));		
		
		
		this.jButtonCerrarDetalleTablaAmorti.addActionListener (new ButtonActionListener(this,"CerrarDetalleTablaAmorti"));
		
		
		this.jButtonCerrarToolBarDetalleTablaAmorti.addActionListener (new ButtonActionListener(this,"CerrarToolBarDetalleTablaAmorti"));
			
		this.jMenuItemCerrarDetalleTablaAmorti.addActionListener (new ButtonActionListener(this,"MenuItemCerrarDetalleTablaAmorti"));
			
		if(this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleTablaAmorti.jMenuItemDetalleCerrarDetalleTablaAmorti.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDetalleTablaAmorti"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonGuardarCambiosDetalleTablaAmorti.addActionListener (new ButtonActionListener(this,"GuardarCambiosDetalleTablaAmorti"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonGuardarCambiosToolBarDetalleTablaAmorti.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDetalleTablaAmorti"));
		}
		
		this.jButtonCopiarToolBarDetalleTablaAmorti.addActionListener (new ButtonActionListener(this,"CopiarToolBarDetalleTablaAmorti"));
			
		this.jButtonVerFormToolBarDetalleTablaAmorti.addActionListener (new ButtonActionListener(this,"VerFormToolBarDetalleTablaAmorti"));
		
		this.jMenuItemGuardarCambiosDetalleTablaAmorti.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosDetalleTablaAmorti"));
			
		this.jMenuItemCopiarDetalleTablaAmorti.addActionListener (new ButtonActionListener(this,"MenuItemCopiarDetalleTablaAmorti"));		
		
		this.jMenuItemVerFormDetalleTablaAmorti.addActionListener (new ButtonActionListener(this,"MenuItemVerFormDetalleTablaAmorti"));		
		
		
		this.jButtonGuardarCambiosTablaDetalleTablaAmorti.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDetalleTablaAmorti"));
		
		
		this.jButtonGuardarCambiosTablaToolBarDetalleTablaAmorti.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarDetalleTablaAmorti"));
			
		this.jMenuItemGuardarCambiosTablaDetalleTablaAmorti.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDetalleTablaAmorti"));		
		
		
		
		this.jButtonRecargarInformacionDetalleTablaAmorti.addActionListener (new ButtonActionListener(this,"RecargarInformacionDetalleTablaAmorti"));
					
		this.jButtonRecargarInformacionToolBarDetalleTablaAmorti.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarDetalleTablaAmorti"));
		
		this.jMenuItemRecargarInformacionDetalleTablaAmorti.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionDetalleTablaAmorti"));		
		
		
		
		this.jButtonAnterioresDetalleTablaAmorti.addActionListener (new ButtonActionListener(this,"AnterioresDetalleTablaAmorti"));
		
		
		this.jButtonAnterioresToolBarDetalleTablaAmorti.addActionListener (new ButtonActionListener(this,"AnterioresToolBarDetalleTablaAmorti"));
		
		this.jMenuItemAnterioresDetalleTablaAmorti.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresDetalleTablaAmorti"));		
		
		
		this.jButtonSiguientesDetalleTablaAmorti.addActionListener (new ButtonActionListener(this,"SiguientesDetalleTablaAmorti"));
		
		
		this.jButtonSiguientesToolBarDetalleTablaAmorti.addActionListener (new ButtonActionListener(this,"SiguientesToolBarDetalleTablaAmorti"));
			
		this.jMenuItemSiguientesDetalleTablaAmorti.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesDetalleTablaAmorti"));
			
		this.jMenuItemAbrirOrderByDetalleTablaAmorti.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByDetalleTablaAmorti"));
			
		this.jMenuItemMostrarOcultarDetalleTablaAmorti.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarDetalleTablaAmorti"));
			
		this.jMenuItemDetalleAbrirOrderByDetalleTablaAmorti.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByDetalleTablaAmorti"));
			
		this.jMenuItemDetalleMostarOcultarDetalleTablaAmorti.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarDetalleTablaAmorti"));		
		
		
		this.jButtonNuevoGuardarCambiosDetalleTablaAmorti.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosDetalleTablaAmorti"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarDetalleTablaAmorti.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarDetalleTablaAmorti"));
			
		this.jMenuItemNuevoGuardarCambiosDetalleTablaAmorti.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosDetalleTablaAmorti"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosDetalleTablaAmorti.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosDetalleTablaAmorti"));

		this.jCheckBoxSeleccionadosDetalleTablaAmorti.addItemListener(new CheckBoxItemListener(this,"SeleccionadosDetalleTablaAmorti"));
		
		if(this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxTiposAccionesFormularioDetalleTablaAmorti.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDetalleTablaAmorti"));
		}
		
		
		this.jComboBoxTiposRelacionesDetalleTablaAmorti.addActionListener (new ButtonActionListener(this,"TiposRelacionesDetalleTablaAmorti"));
			
		this.jComboBoxTiposAccionesDetalleTablaAmorti.addActionListener (new ButtonActionListener(this,"TiposAccionesDetalleTablaAmorti"));
					
		this.jComboBoxTiposSeleccionarDetalleTablaAmorti.addActionListener (new ButtonActionListener(this,"TiposSeleccionarDetalleTablaAmorti"));
			
		this.jTextFieldValorCampoGeneralDetalleTablaAmorti.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralDetalleTablaAmorti"));		
		
		
		if(this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonidDetalleTablaAmortiBusqueda.addActionListener(new ButtonActionListener(this,"idDetalleTablaAmortiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonid_empresaDetalleTablaAmortiUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDetalleTablaAmortiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonid_empresaDetalleTablaAmortiBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDetalleTablaAmortiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonid_sucursalDetalleTablaAmortiUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalDetalleTablaAmortiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonid_sucursalDetalleTablaAmortiBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalDetalleTablaAmortiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonid_ejercicioDetalleTablaAmortiUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioDetalleTablaAmortiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonid_ejercicioDetalleTablaAmortiBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioDetalleTablaAmortiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonid_periodoDetalleTablaAmortiUpdate.addActionListener(new ButtonActionListener(this,"id_periodoDetalleTablaAmortiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonid_periodoDetalleTablaAmortiBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoDetalleTablaAmortiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonid_tabla_amortiDetalleTablaAmortiUpdate.addActionListener(new ButtonActionListener(this,"id_tabla_amortiDetalleTablaAmortiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonid_tabla_amortiDetalleTablaAmortiBusqueda.addActionListener(new ButtonActionListener(this,"id_tabla_amortiDetalleTablaAmortiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonvalorDetalleTablaAmortiBusqueda.addActionListener(new ButtonActionListener(this,"valorDetalleTablaAmortiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtoninteresDetalleTablaAmortiBusqueda.addActionListener(new ButtonActionListener(this,"interesDetalleTablaAmortiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtoncapitalDetalleTablaAmortiBusqueda.addActionListener(new ButtonActionListener(this,"capitalDetalleTablaAmortiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonfecha_inicioDetalleTablaAmortiBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioDetalleTablaAmortiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonfecha_finDetalleTablaAmortiBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finDetalleTablaAmortiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtondescripcionDetalleTablaAmortiBusqueda.addActionListener(new ButtonActionListener(this,"descripcionDetalleTablaAmortiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonid_anioDetalleTablaAmortiUpdate.addActionListener(new ButtonActionListener(this,"id_anioDetalleTablaAmortiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonid_anioDetalleTablaAmortiBusqueda.addActionListener(new ButtonActionListener(this,"id_anioDetalleTablaAmortiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonid_mesDetalleTablaAmortiUpdate.addActionListener(new ButtonActionListener(this,"id_mesDetalleTablaAmortiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonid_mesDetalleTablaAmortiBusqueda.addActionListener(new ButtonActionListener(this,"id_mesDetalleTablaAmortiBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdTablaAmortiDetalleTablaAmorti.addActionListener(new ButtonActionListener(this,"FK_IdTablaAmortiDetalleTablaAmorti"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoDetalleTablaAmorti!=null) {
				this.jInternalFrameReporteDinamicoDetalleTablaAmorti.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDetalleTablaAmorti"));
				this.jInternalFrameReporteDinamicoDetalleTablaAmorti.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDetalleTablaAmorti"));
				this.jInternalFrameReporteDinamicoDetalleTablaAmorti.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDetalleTablaAmorti"));
			}
			
			//this.jButtonCerrarReporteDinamicoDetalleTablaAmorti.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDetalleTablaAmorti"));				
			//this.jButtonGenerarReporteDinamicoDetalleTablaAmorti.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDetalleTablaAmorti"));
			//this.jButtonGenerarExcelReporteDinamicoDetalleTablaAmorti.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDetalleTablaAmorti"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionDetalleTablaAmorti!=null) {
				this.jInternalFrameImportacionDetalleTablaAmorti.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDetalleTablaAmorti"));
				this.jInternalFrameImportacionDetalleTablaAmorti.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDetalleTablaAmorti"));
				this.jInternalFrameImportacionDetalleTablaAmorti.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDetalleTablaAmorti"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByDetalleTablaAmorti.addActionListener (new ButtonActionListener(this,"AbrirOrderByDetalleTablaAmorti"));
			
			this.jButtonAbrirOrderByToolBarDetalleTablaAmorti.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarDetalleTablaAmorti"));			
			
			if(this.jInternalFrameOrderByDetalleTablaAmorti!=null) {
				this.jInternalFrameOrderByDetalleTablaAmorti.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDetalleTablaAmorti"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleTablaAmorti.jTabbedPaneRelacionesDetalleTablaAmorti.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDetalleTablaAmorti"));
		
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
            		closingInternalFrameDetalleTablaAmorti();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormDetalleTablaAmorti.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormDetalleTablaAmorti = (JInternalFrameBase)event.getSource();
	            	
	            DetalleTablaAmortiBeanSwingJInternalFrame jInternalFrameParent=(DetalleTablaAmortiBeanSwingJInternalFrame)jInternalFrameDetalleFormDetalleTablaAmorti.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarDetalleTablaAmortiActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosDetalleTablaAmorti.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosDetalleTablaAmortiListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosDetalleTablaAmorti.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosDetalleTablaAmorti.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoDetalleTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleTablaAmortiActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarDetalleTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleTablaAmortiActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoDetalleTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleTablaAmortiActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoDetalleTablaAmorti";
		inputMap = this.jButtonNuevoDetalleTablaAmorti.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoDetalleTablaAmorti.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDetalleTablaAmortiActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesDetalleTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleTablaAmortiActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarDetalleTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleTablaAmortiActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesDetalleTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleTablaAmortiActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesDetalleTablaAmorti";
		inputMap = this.jButtonNuevoRelacionesDetalleTablaAmorti.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesDetalleTablaAmorti.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDetalleTablaAmortiActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarDetalleTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDetalleTablaAmortiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarDetalleTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDetalleTablaAmortiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarDetalleTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDetalleTablaAmortiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarDetalleTablaAmorti";
		inputMap = this.jButtonModificarDetalleTablaAmorti.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarDetalleTablaAmorti.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarDetalleTablaAmortiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarDetalleTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDetalleTablaAmortiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarDetalleTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDetalleTablaAmortiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarDetalleTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDetalleTablaAmortiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarDetalleTablaAmorti";
		inputMap = this.jButtonActualizarDetalleTablaAmorti.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarDetalleTablaAmorti.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarDetalleTablaAmortiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarDetalleTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDetalleTablaAmortiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarDetalleTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDetalleTablaAmortiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarDetalleTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDetalleTablaAmortiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarDetalleTablaAmorti";
		inputMap = this.jButtonEliminarDetalleTablaAmorti.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarDetalleTablaAmorti.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarDetalleTablaAmortiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarDetalleTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDetalleTablaAmortiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarDetalleTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDetalleTablaAmortiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarDetalleTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDetalleTablaAmortiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarDetalleTablaAmorti";
		inputMap = this.jButtonCancelarDetalleTablaAmorti.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarDetalleTablaAmorti.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarDetalleTablaAmortiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarDetalleTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDetalleTablaAmortiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarDetalleTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDetalleTablaAmortiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarDetalleTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDetalleTablaAmortiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarDetalleTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarDetalleTablaAmortiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarDetalleTablaAmortiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarDetalleTablaAmorti";
		inputMap = this.jButtonCerrarDetalleTablaAmorti.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarDetalleTablaAmorti.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarDetalleTablaAmortiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonGuardarCambiosDetalleTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleTablaAmortiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarDetalleTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleTablaAmortiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosDetalleTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleTablaAmortiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaDetalleTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleTablaAmortiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarDetalleTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleTablaAmortiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaDetalleTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleTablaAmortiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosDetalleTablaAmorti";
		inputMap = this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonGuardarCambiosDetalleTablaAmorti.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonGuardarCambiosDetalleTablaAmorti.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosDetalleTablaAmortiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionDetalleTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDetalleTablaAmortiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarDetalleTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDetalleTablaAmortiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionDetalleTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDetalleTablaAmortiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresDetalleTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDetalleTablaAmortiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarDetalleTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDetalleTablaAmortiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresDetalleTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDetalleTablaAmortiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesDetalleTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDetalleTablaAmortiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarDetalleTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDetalleTablaAmortiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesDetalleTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDetalleTablaAmortiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosDetalleTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDetalleTablaAmortiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarDetalleTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDetalleTablaAmortiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosDetalleTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDetalleTablaAmortiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosDetalleTablaAmorti.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosDetalleTablaAmortiItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesDetalleTablaAmorti.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesDetalleTablaAmortiActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarDetalleTablaAmorti.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarDetalleTablaAmortiActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralDetalleTablaAmorti.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralDetalleTablaAmortiActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonidDetalleTablaAmortiBusqueda.addActionListener(new ButtonActionListener(this,"idDetalleTablaAmortiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonid_empresaDetalleTablaAmortiUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDetalleTablaAmortiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonid_empresaDetalleTablaAmortiBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDetalleTablaAmortiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonid_sucursalDetalleTablaAmortiUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalDetalleTablaAmortiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonid_sucursalDetalleTablaAmortiBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalDetalleTablaAmortiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonid_ejercicioDetalleTablaAmortiUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioDetalleTablaAmortiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonid_ejercicioDetalleTablaAmortiBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioDetalleTablaAmortiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonid_periodoDetalleTablaAmortiUpdate.addActionListener(new ButtonActionListener(this,"id_periodoDetalleTablaAmortiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonid_periodoDetalleTablaAmortiBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoDetalleTablaAmortiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonid_tabla_amortiDetalleTablaAmortiUpdate.addActionListener(new ButtonActionListener(this,"id_tabla_amortiDetalleTablaAmortiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonid_tabla_amortiDetalleTablaAmortiBusqueda.addActionListener(new ButtonActionListener(this,"id_tabla_amortiDetalleTablaAmortiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonvalorDetalleTablaAmortiBusqueda.addActionListener(new ButtonActionListener(this,"valorDetalleTablaAmortiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtoninteresDetalleTablaAmortiBusqueda.addActionListener(new ButtonActionListener(this,"interesDetalleTablaAmortiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtoncapitalDetalleTablaAmortiBusqueda.addActionListener(new ButtonActionListener(this,"capitalDetalleTablaAmortiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonfecha_inicioDetalleTablaAmortiBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioDetalleTablaAmortiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonfecha_finDetalleTablaAmortiBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finDetalleTablaAmortiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtondescripcionDetalleTablaAmortiBusqueda.addActionListener(new ButtonActionListener(this,"descripcionDetalleTablaAmortiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonid_anioDetalleTablaAmortiUpdate.addActionListener(new ButtonActionListener(this,"id_anioDetalleTablaAmortiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonid_anioDetalleTablaAmortiBusqueda.addActionListener(new ButtonActionListener(this,"id_anioDetalleTablaAmortiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonid_mesDetalleTablaAmortiUpdate.addActionListener(new ButtonActionListener(this,"id_mesDetalleTablaAmortiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jButtonid_mesDetalleTablaAmortiBusqueda.addActionListener(new ButtonActionListener(this,"id_mesDetalleTablaAmortiBusqueda"));
		
		
		this.jButtonFK_IdTablaAmortiDetalleTablaAmorti.addActionListener(new ButtonActionListener(this,"FK_IdTablaAmortiDetalleTablaAmorti"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoDetalleTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoDetalleTablaAmortiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoDetalleTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoDetalleTablaAmortiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoDetalleTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoDetalleTablaAmortiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionDetalleTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionDetalleTablaAmortiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionDetalleTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionDetalleTablaAmortiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionDetalleTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionDetalleTablaAmortiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarDetalleTablaAmortiActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarDetalleTablaAmorti.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosDetalleTablaAmorti(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(DetalleTablaAmorti detalletablaamortiAux:this.detalletablaamortiLogic.getDetalleTablaAmortis()) {
					detalletablaamortiAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetalleTablaAmorti detalletablaamortiAux:detalletablaamortis) {
					detalletablaamortiAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosDetalleTablaAmortiItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDetalleTablaAmorti(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DetalleTablaAmorti detalletablaamortiAux:this.detalletablaamortiLogic.getDetalleTablaAmortis()) {
						detalletablaamortiAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DetalleTablaAmorti detalletablaamortiAux:detalletablaamortis) {
						detalletablaamortiAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(DetalleTablaAmorti detalletablaamortiAux:this.detalletablaamortiLogic.getDetalleTablaAmortis()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DetalleTablaAmorti detalletablaamortiAux:detalletablaamortis) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaDetalleTablaAmorti(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDetalleTablaAmorti.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDetalleTablaAmorti.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDetalleTablaAmorti,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosDetalleTablaAmortiItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDetalleTablaAmorti(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosDetalleTablaAmorti.getSelectedRows();
			
			DetalleTablaAmorti detalletablaamortiLocal=new DetalleTablaAmorti();
			
			//this.seleccionarTodosDetalleTablaAmorti(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalletablaamortiLocal =(DetalleTablaAmorti) this.detalletablaamortiLogic.getDetalleTablaAmortis().toArray()[this.jTableDatosDetalleTablaAmorti.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					detalletablaamortiLocal =(DetalleTablaAmorti) this.detalletablaamortis.toArray()[this.jTableDatosDetalleTablaAmorti.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				detalletablaamortiLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DetalleTablaAmorti detalletablaamortiAux:this.detalletablaamortiLogic.getDetalleTablaAmortis()) {
						detalletablaamortiAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DetalleTablaAmorti detalletablaamortiAux:detalletablaamortis) {
						detalletablaamortiAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaDetalleTablaAmorti(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDetalleTablaAmorti.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDetalleTablaAmorti.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDetalleTablaAmorti,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualDetalleTablaAmortiItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarDetalleTablaAmortiParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralDetalleTablaAmortiActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingDetalleTablaAmorti(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralDetalleTablaAmorti.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DetalleTablaAmorti detalletablaamortiAux:this.detalletablaamortiLogic.getDetalleTablaAmortis()) {
				
						if(sTipoSeleccionar.equals(DetalleTablaAmortiConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							detalletablaamortiAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleTablaAmortiConstantesFunciones.LABEL_INTERES)) {
							existe=true;
							detalletablaamortiAux.setinteres(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleTablaAmortiConstantesFunciones.LABEL_CAPITAL)) {
							existe=true;
							detalletablaamortiAux.setcapital(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleTablaAmortiConstantesFunciones.LABEL_FECHAINICIO)) {
							existe=true;
							detalletablaamortiAux.setfecha_inicio(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleTablaAmortiConstantesFunciones.LABEL_FECHAFIN)) {
							existe=true;
							detalletablaamortiAux.setfecha_fin(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleTablaAmortiConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							detalletablaamortiAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetalleTablaAmorti detalletablaamortiAux:detalletablaamortis) {
					
						if(sTipoSeleccionar.equals(DetalleTablaAmortiConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							detalletablaamortiAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleTablaAmortiConstantesFunciones.LABEL_INTERES)) {
							existe=true;
							detalletablaamortiAux.setinteres(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleTablaAmortiConstantesFunciones.LABEL_CAPITAL)) {
							existe=true;
							detalletablaamortiAux.setcapital(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleTablaAmortiConstantesFunciones.LABEL_FECHAINICIO)) {
							existe=true;
							detalletablaamortiAux.setfecha_inicio(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleTablaAmortiConstantesFunciones.LABEL_FECHAFIN)) {
							existe=true;
							detalletablaamortiAux.setfecha_fin(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleTablaAmortiConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							detalletablaamortiAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaDetalleTablaAmorti(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesDetalleTablaAmortiActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingDetalleTablaAmorti(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioDetalleTablaAmorti=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesDetalleTablaAmorti.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxTiposAccionesFormularioDetalleTablaAmorti.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteDetalleTablaAmorti) {				
					conSplash=true;//false;										
					
					//this.startProcessDetalleTablaAmorti(conSplash);
				
					this.generarReporteDetalleTablaAmortisSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetalleTablaAmorti.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxTiposAccionesFormularioDetalleTablaAmorti.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoDetalleTablaAmortisSeleccionados();
				//this.jComboBoxTiposAccionesDetalleTablaAmorti.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDetalleTablaAmortisSeleccionados(false);
				//this.jComboBoxTiposAccionesDetalleTablaAmorti.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDetalleTablaAmortisSeleccionados(true);
				//this.jComboBoxTiposAccionesDetalleTablaAmorti.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDetalleTablaAmorti();
				
				this.exportarDetalleTablaAmortisSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetalleTablaAmorti.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxTiposAccionesFormularioDetalleTablaAmorti.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionDetalleTablaAmortis();
				//this.importarDetalleTablaAmortis();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetalleTablaAmorti.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxTiposAccionesFormularioDetalleTablaAmorti.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDetalleTablaAmorti();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelDetalleTablaAmortisSeleccionados();
				//this.jComboBoxTiposAccionesDetalleTablaAmorti.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Detalle Tabla Amorti", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessDetalleTablaAmorti();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoDetalleTablaAmorti)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyDetalleTablaAmorti(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Detalle Tabla Amorti",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetalleTablaAmorti.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxTiposAccionesFormularioDetalleTablaAmorti.setSelectedIndex(0);					
				}	
			} 			
			else if(DetalleTablaAmortiBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteDetalleTablaAmorti) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessDetalleTablaAmorti(conSplash);
					
						//this.actualizarParametrosGeneralDetalleTablaAmorti();
						
						this.generarReporteProcesoAccionDetalleTablaAmortisSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesDetalleTablaAmorti.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxTiposAccionesFormularioDetalleTablaAmorti.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(DetalleTablaAmortiBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Detalle Tabla AmortiS SELECCIONADOS?", "MANTENIMIENTO DE Detalle Tabla Amorti", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessDetalleTablaAmorti();
				
						this.actualizarParametrosGeneralDetalleTablaAmorti();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.detalletablaamortiReturnGeneral=detalletablaamortiLogic.procesarAccionDetalleTablaAmortisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.detalletablaamortiLogic.getDetalleTablaAmortis(),this.detalletablaamortiParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarDetalleTablaAmortiReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDetalleTablaAmorti.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxTiposAccionesFormularioDetalleTablaAmorti.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralDetalleTablaAmorti();
					
					DetalleTablaAmortiBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarDetalleTablaAmortiReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDetalleTablaAmorti.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxTiposAccionesFormularioDetalleTablaAmorti.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessDetalleTablaAmorti(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesDetalleTablaAmortiActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessDetalleTablaAmorti();
			
			if(this.jInternalFrameDetalleFormDetalleTablaAmorti==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<DetalleTablaAmorti> detalletablaamortisSeleccionados=new ArrayList<DetalleTablaAmorti>();		
			DetalleTablaAmorti detalletablaamorti=new DetalleTablaAmorti();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingDetalleTablaAmorti(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesDetalleTablaAmorti.getSelectedItem();
			
			
			
			
			detalletablaamortisSeleccionados=this.getDetalleTablaAmortisSeleccionados(true);
			//this.sTipoAccion;
			
			if(detalletablaamortisSeleccionados.size()==1) {
				for(DetalleTablaAmorti detalletablaamortiAux:detalletablaamortisSeleccionados) {
					detalletablaamorti=detalletablaamortiAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessDetalleTablaAmorti();
			
      		//this.finishProcessDetalleTablaAmorti(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarDetalleTablaAmortiReturnGeneral() throws Exception {
		if(this.detalletablaamortiReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.detalletablaamortiReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.detalletablaamortiReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.detalletablaamortiReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.detalletablaamortiReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.detalletablaamortiReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingDetalleTablaAmorti(false);
		}
		
		if(this.detalletablaamortiReturnGeneral.getConRetornoLista() || this.detalletablaamortiReturnGeneral.getConRetornoObjeto()) {
			if(this.detalletablaamortiReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.detalletablaamortiLogic.setDetalleTablaAmortis(this.detalletablaamortiReturnGeneral.getDetalleTablaAmortis());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.detalletablaamortiReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.detalletablaamortiLogic.setDetalleTablaAmorti(this.detalletablaamortiReturnGeneral.getDetalleTablaAmorti());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingDetalleTablaAmorti(false);
		}
	}
	
	public void actualizarParametrosGeneralDetalleTablaAmorti() throws Exception {
		
		
	}
	
	public ArrayList<DetalleTablaAmorti> getDetalleTablaAmortisSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<DetalleTablaAmorti> detalletablaamortisSeleccionados=new ArrayList<DetalleTablaAmorti>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioDetalleTablaAmorti) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(DetalleTablaAmorti detalletablaamortiAux:detalletablaamortiLogic.getDetalleTablaAmortis()) {
					if(detalletablaamortiAux.getIsSelected()) {
						detalletablaamortisSeleccionados.add(detalletablaamortiAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetalleTablaAmorti detalletablaamortiAux:this.detalletablaamortis) {
					if(detalletablaamortiAux.getIsSelected()) {
						detalletablaamortisSeleccionados.add(detalletablaamortiAux);				
					}
				}
			}
			
			if(detalletablaamortisSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						detalletablaamortisSeleccionados.addAll(this.detalletablaamortiLogic.getDetalleTablaAmortis());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						detalletablaamortisSeleccionados.addAll(this.detalletablaamortis);				
					}
				}
			}
		} else {
			detalletablaamortisSeleccionados.add(this.detalletablaamorti);
		}
		
		return detalletablaamortisSeleccionados;
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
	
	public void generarReporteDetalleTablaAmortisSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalDetalleTablaAmortisSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoDetalleTablaAmortisSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDetalleTablaAmortisSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDetalleTablaAmortisSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Detalle Tabla Amorti",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesDetalleTablaAmortisSeleccionados() throws Exception {
		ArrayList<DetalleTablaAmorti> detalletablaamortisSeleccionados=new ArrayList<DetalleTablaAmorti>();		
		
		detalletablaamortisSeleccionados=this.getDetalleTablaAmortisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteDetalleTablaAmortis("Todos",detalletablaamortisSeleccionados);
		
	}	
	
	public void generarReporteNormalDetalleTablaAmortisSeleccionados() throws Exception {
		ArrayList<DetalleTablaAmorti> detalletablaamortisSeleccionados=new ArrayList<DetalleTablaAmorti>();		
		
		detalletablaamortisSeleccionados=this.getDetalleTablaAmortisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteDetalleTablaAmortis("Todos",detalletablaamortisSeleccionados);
	}		
	
	public void generarReporteProcesoAccionDetalleTablaAmortisSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<DetalleTablaAmorti> detalletablaamortisSeleccionados=new ArrayList<DetalleTablaAmorti>();
		
		detalletablaamortisSeleccionados=this.getDetalleTablaAmortisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteDetalleTablaAmortis("Todos",detalletablaamortisSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoDetalleTablaAmortisSeleccionados() throws Exception {
		ArrayList<DetalleTablaAmorti> detalletablaamortisSeleccionados=new ArrayList<DetalleTablaAmorti>();		
		
		
		this.abrirInicializarFrameReporteDinamicoDetalleTablaAmorti();
		
		
		detalletablaamortisSeleccionados=this.getDetalleTablaAmortisSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoDetalleTablaAmorti();
		
		
		//this.generarReporteDetalleTablaAmortis("Todos",detalletablaamortisSeleccionados ,detalletablaamortiImplementable,detalletablaamortiImplementableHome);
	}
	
	public void mostrarImportacionDetalleTablaAmortis() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionDetalleTablaAmorti();
		
		this.abrirFrameImportacionDetalleTablaAmorti();		
		
			
		//this.generarReporteDetalleTablaAmortis("Todos",detalletablaamortisSeleccionados ,detalletablaamortiImplementable,detalletablaamortiImplementableHome);
	}
	
	public void importarDetalleTablaAmortis() throws Exception {		
	
	}
	
	public void exportarDetalleTablaAmortisSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelDetalleTablaAmortisSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoDetalleTablaAmortisSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlDetalleTablaAmortisSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Detalle Tabla Amorti",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoDetalleTablaAmortisSeleccionados() throws Exception {
		ArrayList<DetalleTablaAmorti> detalletablaamortisSeleccionados=new ArrayList<DetalleTablaAmorti>();		
		
		detalletablaamortisSeleccionados=this.getDetalleTablaAmortisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalletablaamorti."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarDetalleTablaAmorti(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(DetalleTablaAmorti detalletablaamortiAux:detalletablaamortisSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarDetalleTablaAmorti(detalletablaamortiAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//detalletablaamortiAux.setsDetalleGeneralEntityReporte(detalletablaamortiAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalletablaamortiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Tabla Amorti",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarDetalleTablaAmorti(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=DetalleTablaAmortiConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleTablaAmortiConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleTablaAmortiConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleTablaAmortiConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleTablaAmortiConstantesFunciones.LABEL_IDEJERCICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleTablaAmortiConstantesFunciones.LABEL_IDPERIODO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleTablaAmortiConstantesFunciones.LABEL_IDTABLAAMORTI;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleTablaAmortiConstantesFunciones.LABEL_VALOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleTablaAmortiConstantesFunciones.LABEL_INTERES;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleTablaAmortiConstantesFunciones.LABEL_CAPITAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleTablaAmortiConstantesFunciones.LABEL_FECHAINICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleTablaAmortiConstantesFunciones.LABEL_FECHAFIN;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleTablaAmortiConstantesFunciones.LABEL_DESCRIPCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleTablaAmortiConstantesFunciones.LABEL_IDANIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleTablaAmortiConstantesFunciones.LABEL_IDMES;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarDetalleTablaAmorti(DetalleTablaAmorti detalletablaamorti,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=detalletablaamorti.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=detalletablaamorti.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalletablaamorti.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalletablaamorti.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalletablaamorti.getejercicio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalletablaamorti.getperiodo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalletablaamorti.gettablaamorti_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalletablaamorti.getvalor().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalletablaamorti.getinteres().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalletablaamorti.getcapital().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalletablaamorti.getfecha_inicio().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalletablaamorti.getfecha_fin().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalletablaamorti.getdescripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalletablaamorti.getanio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalletablaamorti.getmes_descripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelDetalleTablaAmortisSeleccionados() throws Exception {
		ArrayList<DetalleTablaAmorti> detalletablaamortisSeleccionados=new ArrayList<DetalleTablaAmorti>();		
		
		detalletablaamortisSeleccionados=this.getDetalleTablaAmortisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalletablaamorti.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("DetalleTablaAmortis");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelDetalleTablaAmorti(row);				
				iRow++;
			}				
			
			for(DetalleTablaAmorti detalletablaamortiAux:detalletablaamortisSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelDetalleTablaAmorti(detalletablaamortiAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalletablaamortiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Tabla Amorti",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlDetalleTablaAmortisSeleccionados() throws Exception {
		ArrayList<DetalleTablaAmorti> detalletablaamortisSeleccionados=new ArrayList<DetalleTablaAmorti>();		
		
		detalletablaamortisSeleccionados=this.getDetalleTablaAmortisSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalletablaamorti.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("detalletablaamortis");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("detalletablaamorti");
			//elementRoot.appendChild(element);
		
			for(DetalleTablaAmorti detalletablaamortiAux:detalletablaamortisSeleccionados) {
				element = document.createElement("detalletablaamorti");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlDetalleTablaAmorti(detalletablaamortiAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalletablaamortiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Tabla Amorti",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelDetalleTablaAmorti(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleTablaAmortiConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleTablaAmortiConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(DetalleTablaAmortiConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleTablaAmortiConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleTablaAmortiConstantesFunciones.LABEL_IDEJERCICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleTablaAmortiConstantesFunciones.LABEL_IDPERIODO);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleTablaAmortiConstantesFunciones.LABEL_IDTABLAAMORTI);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleTablaAmortiConstantesFunciones.LABEL_VALOR);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleTablaAmortiConstantesFunciones.LABEL_INTERES);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleTablaAmortiConstantesFunciones.LABEL_CAPITAL);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleTablaAmortiConstantesFunciones.LABEL_FECHAINICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleTablaAmortiConstantesFunciones.LABEL_FECHAFIN);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleTablaAmortiConstantesFunciones.LABEL_DESCRIPCION);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleTablaAmortiConstantesFunciones.LABEL_IDANIO);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleTablaAmortiConstantesFunciones.LABEL_IDMES);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelDetalleTablaAmorti(DetalleTablaAmorti detalletablaamorti,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(detalletablaamorti.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(detalletablaamorti.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detalletablaamorti.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detalletablaamorti.getejercicio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detalletablaamorti.getperiodo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detalletablaamorti.gettablaamorti_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detalletablaamorti.getvalor());
		cell = row.createCell(iColumn++);cell.setCellValue(detalletablaamorti.getinteres());
		cell = row.createCell(iColumn++);cell.setCellValue(detalletablaamorti.getcapital());
		cell = row.createCell(iColumn++);cell.setCellValue(detalletablaamorti.getfecha_inicio());
		cell = row.createCell(iColumn++);cell.setCellValue(detalletablaamorti.getfecha_fin());
		cell = row.createCell(iColumn++);cell.setCellValue(detalletablaamorti.getdescripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detalletablaamorti.getanio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detalletablaamorti.getmes_descripcion());				
	}
	
	public void setFilaDatosExportarXmlDetalleTablaAmorti(DetalleTablaAmorti detalletablaamorti,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(DetalleTablaAmortiConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(detalletablaamorti.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(DetalleTablaAmortiConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(detalletablaamorti.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(DetalleTablaAmortiConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(detalletablaamorti.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(DetalleTablaAmortiConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(detalletablaamorti.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementejercicio_descripcion = document.createElement(DetalleTablaAmortiConstantesFunciones.IDEJERCICIO);
		elementejercicio_descripcion.appendChild(document.createTextNode(detalletablaamorti.getejercicio_descripcion()));
		element.appendChild(elementejercicio_descripcion);

		Element elementperiodo_descripcion = document.createElement(DetalleTablaAmortiConstantesFunciones.IDPERIODO);
		elementperiodo_descripcion.appendChild(document.createTextNode(detalletablaamorti.getperiodo_descripcion()));
		element.appendChild(elementperiodo_descripcion);

		Element elementtablaamorti_descripcion = document.createElement(DetalleTablaAmortiConstantesFunciones.IDTABLAAMORTI);
		elementtablaamorti_descripcion.appendChild(document.createTextNode(detalletablaamorti.gettablaamorti_descripcion()));
		element.appendChild(elementtablaamorti_descripcion);

		Element elementvalor = document.createElement(DetalleTablaAmortiConstantesFunciones.VALOR);
		elementvalor.appendChild(document.createTextNode(detalletablaamorti.getvalor().toString().trim()));
		element.appendChild(elementvalor);

		Element elementinteres = document.createElement(DetalleTablaAmortiConstantesFunciones.INTERES);
		elementinteres.appendChild(document.createTextNode(detalletablaamorti.getinteres().toString().trim()));
		element.appendChild(elementinteres);

		Element elementcapital = document.createElement(DetalleTablaAmortiConstantesFunciones.CAPITAL);
		elementcapital.appendChild(document.createTextNode(detalletablaamorti.getcapital().toString().trim()));
		element.appendChild(elementcapital);

		Element elementfecha_inicio = document.createElement(DetalleTablaAmortiConstantesFunciones.FECHAINICIO);
		elementfecha_inicio.appendChild(document.createTextNode(detalletablaamorti.getfecha_inicio().toString().trim()));
		element.appendChild(elementfecha_inicio);

		Element elementfecha_fin = document.createElement(DetalleTablaAmortiConstantesFunciones.FECHAFIN);
		elementfecha_fin.appendChild(document.createTextNode(detalletablaamorti.getfecha_fin().toString().trim()));
		element.appendChild(elementfecha_fin);

		Element elementdescripcion = document.createElement(DetalleTablaAmortiConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(detalletablaamorti.getdescripcion().trim()));
		element.appendChild(elementdescripcion);

		Element elementanio_descripcion = document.createElement(DetalleTablaAmortiConstantesFunciones.IDANIO);
		elementanio_descripcion.appendChild(document.createTextNode(detalletablaamorti.getanio_descripcion()));
		element.appendChild(elementanio_descripcion);

		Element elementmes_descripcion = document.createElement(DetalleTablaAmortiConstantesFunciones.IDMES);
		elementmes_descripcion.appendChild(document.createTextNode(detalletablaamorti.getmes_descripcion()));
		element.appendChild(elementmes_descripcion);
	}
	
	public void generarReporteGroupGenericoDetalleTablaAmortisSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<DetalleTablaAmorti> detalletablaamortisSeleccionados=new ArrayList<DetalleTablaAmorti>();
		
		detalletablaamortisSeleccionados=this.getDetalleTablaAmortisSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoDetalleTablaAmorti(detalletablaamortisSeleccionados);
		
		this.generarReporteDetalleTablaAmortis("Todos",detalletablaamortisSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoDetalleTablaAmorti(ArrayList<DetalleTablaAmorti> detalletablaamortisSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(DetalleTablaAmorti detalletablaamortiAux:detalletablaamortisSeleccionados) {
				detalletablaamortiAux.setsDetalleGeneralEntityReporte(detalletablaamortiAux.toString());
			
				if(sTipoSeleccionar.equals(DetalleTablaAmortiConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					detalletablaamortiAux.setsDescripcionGeneralEntityReporte1(detalletablaamortiAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleTablaAmortiConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					detalletablaamortiAux.setsDescripcionGeneralEntityReporte1(detalletablaamortiAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleTablaAmortiConstantesFunciones.LABEL_IDEJERCICIO)) {
					existe=true;
					detalletablaamortiAux.setsDescripcionGeneralEntityReporte1(detalletablaamortiAux.getejercicio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleTablaAmortiConstantesFunciones.LABEL_IDPERIODO)) {
					existe=true;
					detalletablaamortiAux.setsDescripcionGeneralEntityReporte1(detalletablaamortiAux.getperiodo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleTablaAmortiConstantesFunciones.LABEL_IDTABLAAMORTI)) {
					existe=true;
					detalletablaamortiAux.setsDescripcionGeneralEntityReporte1(detalletablaamortiAux.gettablaamorti_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleTablaAmortiConstantesFunciones.LABEL_FECHAINICIO)) {
					existe=true;
					detalletablaamortiAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(detalletablaamortiAux.getfecha_inicio()));
				}
				 else if(sTipoSeleccionar.equals(DetalleTablaAmortiConstantesFunciones.LABEL_FECHAFIN)) {
					existe=true;
					detalletablaamortiAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(detalletablaamortiAux.getfecha_fin()));
				}
				 else if(sTipoSeleccionar.equals(DetalleTablaAmortiConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					detalletablaamortiAux.setsDescripcionGeneralEntityReporte1(detalletablaamortiAux.getdescripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleTablaAmortiConstantesFunciones.LABEL_IDANIO)) {
					existe=true;
					detalletablaamortiAux.setsDescripcionGeneralEntityReporte1(detalletablaamortiAux.getanio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleTablaAmortiConstantesFunciones.LABEL_IDMES)) {
					existe=true;
					detalletablaamortiAux.setsDescripcionGeneralEntityReporte1(detalletablaamortiAux.getmes_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleTablaAmortiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesDetalleTablaAmorti(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoDetalleTablaAmorti=true;
				this.isVisibilidadCeldaNuevoRelacionesDetalleTablaAmorti=true;
				this.isVisibilidadCeldaGuardarCambiosDetalleTablaAmorti=true;
			}
			
			this.isVisibilidadCeldaModificarDetalleTablaAmorti=false;
			this.isVisibilidadCeldaActualizarDetalleTablaAmorti=false;
			this.isVisibilidadCeldaEliminarDetalleTablaAmorti=false;
			this.isVisibilidadCeldaCancelarDetalleTablaAmorti=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleTablaAmorti=true;
				} else {
					this.isVisibilidadCeldaGuardarDetalleTablaAmorti=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoDetalleTablaAmorti=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleTablaAmorti=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleTablaAmorti=false;
			this.isVisibilidadCeldaModificarDetalleTablaAmorti=false;
			this.isVisibilidadCeldaActualizarDetalleTablaAmorti=true;
			this.isVisibilidadCeldaEliminarDetalleTablaAmorti=false;
			this.isVisibilidadCeldaCancelarDetalleTablaAmorti=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleTablaAmorti=true;
				} else {
					this.isVisibilidadCeldaGuardarDetalleTablaAmorti=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoDetalleTablaAmorti=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleTablaAmorti=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleTablaAmorti=false;
			this.isVisibilidadCeldaModificarDetalleTablaAmorti=false;
			this.isVisibilidadCeldaActualizarDetalleTablaAmorti=true;
			this.isVisibilidadCeldaEliminarDetalleTablaAmorti=true;
			this.isVisibilidadCeldaCancelarDetalleTablaAmorti=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleTablaAmorti=true;
				} else {
					this.isVisibilidadCeldaGuardarDetalleTablaAmorti=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoDetalleTablaAmorti=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleTablaAmorti=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleTablaAmorti=false;
			this.isVisibilidadCeldaModificarDetalleTablaAmorti=false;
			this.isVisibilidadCeldaActualizarDetalleTablaAmorti=true;
			this.isVisibilidadCeldaEliminarDetalleTablaAmorti=false;
			this.isVisibilidadCeldaCancelarDetalleTablaAmorti=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleTablaAmorti=false;
				} else {
					this.isVisibilidadCeldaGuardarDetalleTablaAmorti=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoDetalleTablaAmorti=true;
			this.isVisibilidadCeldaNuevoRelacionesDetalleTablaAmorti=true;
			this.isVisibilidadCeldaGuardarCambiosDetalleTablaAmorti=true;
			this.isVisibilidadCeldaModificarDetalleTablaAmorti=false;
			this.isVisibilidadCeldaActualizarDetalleTablaAmorti=false;
			this.isVisibilidadCeldaEliminarDetalleTablaAmorti=false;
			this.isVisibilidadCeldaCancelarDetalleTablaAmorti=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleTablaAmorti=true;
				} else {
					this.isVisibilidadCeldaGuardarDetalleTablaAmorti=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoDetalleTablaAmorti=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleTablaAmorti=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleTablaAmorti=false;
			this.isVisibilidadCeldaActualizarDetalleTablaAmorti=false;
			this.isVisibilidadCeldaEliminarDetalleTablaAmorti=false;
			this.isVisibilidadCeldaCancelarDetalleTablaAmorti=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleTablaAmorti=false;
				} else {
					this.isVisibilidadCeldaGuardarDetalleTablaAmorti=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoDetalleTablaAmorti=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleTablaAmorti=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleTablaAmorti=false;
			this.isVisibilidadCeldaModificarDetalleTablaAmorti=true;
			this.isVisibilidadCeldaActualizarDetalleTablaAmorti=false;
			this.isVisibilidadCeldaEliminarDetalleTablaAmorti=false;
			this.isVisibilidadCeldaCancelarDetalleTablaAmorti=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleTablaAmorti=false;
				} else {
					this.isVisibilidadCeldaGuardarDetalleTablaAmorti=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(DetalleTablaAmortiJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoDetalleTablaAmorti=true;
			this.isVisibilidadCeldaNuevoRelacionesDetalleTablaAmorti=true;
			this.isVisibilidadCeldaGuardarCambiosDetalleTablaAmorti=true;
		} else {
			this.actualizarEstadoPanelsDetalleTablaAmorti(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarDetalleTablaAmorti=false;
			//this.isVisibilidadCeldaVerFormDetalleTablaAmorti=false;
			this.isVisibilidadCeldaDuplicarDetalleTablaAmorti=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!detalletablaamortiSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesDetalleTablaAmorti=false;
		} else {
			this.isVisibilidadCeldaNuevoDetalleTablaAmorti=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleTablaAmorti=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(detalletablaamortiSessionBean.getEsGuardarRelacionado()) {
			if(!detalletablaamortiSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesDetalleTablaAmorti=false;												
			}
			
			this.jButtonCerrarDetalleTablaAmorti.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesDetalleTablaAmorti=false;
		}
		
		if(!this.permiteMantenimiento(this.detalletablaamorti)) {
			this.isVisibilidadCeldaActualizarDetalleTablaAmorti=false;
			this.isVisibilidadCeldaEliminarDetalleTablaAmorti=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesDetalleTablaAmorti() {
	}
	
	public void actualizarEstadoPanelsDetalleTablaAmorti(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionDetalleTablaAmorti!=null) {
				this.jScrollPanelDatosEdicionDetalleTablaAmorti.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleTablaAmorti!=null) {
				this.jTabbedPaneBusquedasDetalleTablaAmorti.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetalleTablaAmorti!=null) {
				this.jScrollPanelDatosDetalleTablaAmorti.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetalleTablaAmorti!=null) {
				this.jPanelPaginacionDetalleTablaAmorti.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetalleTablaAmorti!=null) {
				this.jPanelParametrosReportesDetalleTablaAmorti.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionDetalleTablaAmorti!=null) {
				this.jScrollPanelDatosEdicionDetalleTablaAmorti.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleTablaAmorti!=null) {
				this.jTabbedPaneBusquedasDetalleTablaAmorti.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosDetalleTablaAmorti!=null) {
				this.jScrollPanelDatosDetalleTablaAmorti.setVisible(false);
			}
			
			if(this.jPanelPaginacionDetalleTablaAmorti!=null) {
				this.jPanelPaginacionDetalleTablaAmorti.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDetalleTablaAmorti!=null) {
				this.jPanelParametrosReportesDetalleTablaAmorti.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionDetalleTablaAmorti!=null) {
				this.jScrollPanelDatosEdicionDetalleTablaAmorti.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleTablaAmorti!=null) {
				this.jTabbedPaneBusquedasDetalleTablaAmorti.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDetalleTablaAmorti!=null) {
				this.jScrollPanelDatosDetalleTablaAmorti.setVisible(false);
			}
			
			if(this.jPanelPaginacionDetalleTablaAmorti!=null) {
				this.jPanelPaginacionDetalleTablaAmorti.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDetalleTablaAmorti!=null) {
				this.jPanelParametrosReportesDetalleTablaAmorti.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionDetalleTablaAmorti!=null) {
				this.jScrollPanelDatosEdicionDetalleTablaAmorti.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleTablaAmorti!=null) {
				this.jTabbedPaneBusquedasDetalleTablaAmorti.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDetalleTablaAmorti!=null) {
				this.jScrollPanelDatosDetalleTablaAmorti.setVisible(false);
			}
			
			if(this.jPanelPaginacionDetalleTablaAmorti!=null) {
				this.jPanelPaginacionDetalleTablaAmorti.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDetalleTablaAmorti!=null) {
				this.jPanelParametrosReportesDetalleTablaAmorti.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionDetalleTablaAmorti!=null) {
				this.jScrollPanelDatosEdicionDetalleTablaAmorti.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleTablaAmorti!=null) {
				this.jTabbedPaneBusquedasDetalleTablaAmorti.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetalleTablaAmorti!=null) {
				this.jScrollPanelDatosDetalleTablaAmorti.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetalleTablaAmorti!=null) {
				this.jPanelPaginacionDetalleTablaAmorti.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetalleTablaAmorti!=null) {
				this.jPanelParametrosReportesDetalleTablaAmorti.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionDetalleTablaAmorti!=null) {
				this.jScrollPanelDatosEdicionDetalleTablaAmorti.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleTablaAmorti!=null) {
				this.jTabbedPaneBusquedasDetalleTablaAmorti.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetalleTablaAmorti!=null) {
				this.jScrollPanelDatosDetalleTablaAmorti.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetalleTablaAmorti!=null) {
				this.jPanelPaginacionDetalleTablaAmorti.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetalleTablaAmorti!=null) {
				this.jPanelParametrosReportesDetalleTablaAmorti.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionDetalleTablaAmorti!=null) {
				this.jScrollPanelDatosEdicionDetalleTablaAmorti.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleTablaAmorti!=null) {
				this.jTabbedPaneBusquedasDetalleTablaAmorti.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetalleTablaAmorti!=null) {
				this.jScrollPanelDatosDetalleTablaAmorti.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetalleTablaAmorti!=null) {
				this.jPanelPaginacionDetalleTablaAmorti.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetalleTablaAmorti!=null) {
				this.jPanelParametrosReportesDetalleTablaAmorti.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.detalletablaamortiSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasDetalleTablaAmorti!=null) {
					this.jTabbedPaneBusquedasDetalleTablaAmorti.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesDetalleTablaAmorti!=null) {
				this.jPanelParametrosReportesDetalleTablaAmorti.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.detalletablaamortiSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleTablaAmorti!=null) {
				this.jTabbedPaneBusquedasDetalleTablaAmorti.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesDetalleTablaAmorti!=null) {
				this.jPanelParametrosReportesDetalleTablaAmorti.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdTablaAmorti=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTablaAmorti) {this.jTabbedPaneBusquedasDetalleTablaAmorti.remove(jPanelFK_IdTablaAmortiDetalleTablaAmorti);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdTablaAmorti=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdTablaAmorti) {this.jTabbedPaneBusquedasDetalleTablaAmorti.remove(jPanelFK_IdTablaAmortiDetalleTablaAmorti);}
		}
		
	}

	public void setVisibilidadBusquedasParaEjercicio(Boolean isParaEjercicio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEjercicioNegation=!isParaEjercicio;

			this.isVisibilidadFK_IdTablaAmorti=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdTablaAmorti) {this.jTabbedPaneBusquedasDetalleTablaAmorti.remove(jPanelFK_IdTablaAmortiDetalleTablaAmorti);}
		}
		
	}

	public void setVisibilidadBusquedasParaPeriodo(Boolean isParaPeriodo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPeriodoNegation=!isParaPeriodo;

			this.isVisibilidadFK_IdTablaAmorti=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdTablaAmorti) {this.jTabbedPaneBusquedasDetalleTablaAmorti.remove(jPanelFK_IdTablaAmortiDetalleTablaAmorti);}
		}
		
	}

	public void setVisibilidadBusquedasParaTablaAmorti(Boolean isParaTablaAmorti){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTablaAmortiNegation=!isParaTablaAmorti;

			this.isVisibilidadFK_IdTablaAmorti=isParaTablaAmorti;
			if(!this.isVisibilidadFK_IdTablaAmorti) {this.jTabbedPaneBusquedasDetalleTablaAmorti.remove(jPanelFK_IdTablaAmortiDetalleTablaAmorti);}
		}
		
	}

	public void setVisibilidadBusquedasParaAnio(Boolean isParaAnio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaAnioNegation=!isParaAnio;

			this.isVisibilidadFK_IdTablaAmorti=isParaAnioNegation;
			if(!this.isVisibilidadFK_IdTablaAmorti) {this.jTabbedPaneBusquedasDetalleTablaAmorti.remove(jPanelFK_IdTablaAmortiDetalleTablaAmorti);}
		}
		
	}

	public void setVisibilidadBusquedasParaMes(Boolean isParaMes){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaMesNegation=!isParaMes;

			this.isVisibilidadFK_IdTablaAmorti=isParaMesNegation;
			if(!this.isVisibilidadFK_IdTablaAmorti) {this.jTabbedPaneBusquedasDetalleTablaAmorti.remove(jPanelFK_IdTablaAmortiDetalleTablaAmorti);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//DetalleTablaAmortiSessionBean detalletablaamortiSessionBean=new DetalleTablaAmortiSessionBean();
		
		if(this.detalletablaamortiSessionBean==null) {
			this.detalletablaamortiSessionBean=new DetalleTablaAmortiSessionBean();
		}
		
		this.detalletablaamortiSessionBean.setsUltimaBusquedaDetalleTablaAmorti(this.getsAccionBusqueda());
		this.detalletablaamortiSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.detalletablaamortiSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEjercicio")) {
			detalletablaamortiSessionBean.setid_ejercicio(this.getid_ejercicioFK_IdEjercicio());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			detalletablaamortiSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdPeriodo")) {
			detalletablaamortiSessionBean.setid_periodo(this.getid_periodoFK_IdPeriodo());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			detalletablaamortiSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTablaAmorti")) {
			detalletablaamortiSessionBean.setid_tabla_amorti(this.getid_tabla_amortiFK_IdTablaAmorti());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//DetalleTablaAmortiSessionBean detalletablaamortiSessionBean=new DetalleTablaAmortiSessionBean();
		
		if(this.detalletablaamortiSessionBean==null) {
			this.detalletablaamortiSessionBean=new DetalleTablaAmortiSessionBean();
		}
		
		if(this.detalletablaamortiSessionBean.getsUltimaBusquedaDetalleTablaAmorti()!=null&&!this.detalletablaamortiSessionBean.getsUltimaBusquedaDetalleTablaAmorti().equals("")) {
			this.setsAccionBusqueda(detalletablaamortiSessionBean.getsUltimaBusquedaDetalleTablaAmorti());
			this.setiNumeroPaginacion(detalletablaamortiSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(detalletablaamortiSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEjercicio")) {
				this.setid_ejercicioFK_IdEjercicio(detalletablaamortiSessionBean.getid_ejercicio());
				detalletablaamortiSessionBean.setid_ejercicio(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(detalletablaamortiSessionBean.getid_empresa());
				detalletablaamortiSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdPeriodo")) {
				this.setid_periodoFK_IdPeriodo(detalletablaamortiSessionBean.getid_periodo());
				detalletablaamortiSessionBean.setid_periodo(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(detalletablaamortiSessionBean.getid_sucursal());
				detalletablaamortiSessionBean.setid_sucursal(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTablaAmorti")) {
				this.setid_tabla_amortiFK_IdTablaAmorti(detalletablaamortiSessionBean.getid_tabla_amorti());
				detalletablaamortiSessionBean.setid_tabla_amorti(-1L);
			}
		}
		
		this.detalletablaamortiSessionBean.setsUltimaBusquedaDetalleTablaAmorti("");
		this.detalletablaamortiSessionBean.setiNumeroPaginacion(DetalleTablaAmortiConstantesFunciones.INUMEROPAGINACION);
		this.detalletablaamortiSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaDetalleTablaAmorti(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioDetalleTablaAmorti() {
		this.updateBorderResaltarBusquedasFormularioDetalleTablaAmorti();
		this.updateVisibilidadBusquedasFormularioDetalleTablaAmorti();
		this.updateHabilitarBusquedasFormularioDetalleTablaAmorti();
	}
	
	public void updateBorderResaltarBusquedasFormularioDetalleTablaAmorti() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasDetalleTablaAmorti.getComponents().length>0) {
	

		if(this.detalletablaamortiConstantesFunciones.resaltarFK_IdTablaAmortiDetalleTablaAmorti!=null) {
			index= this.jTabbedPaneBusquedasDetalleTablaAmorti.indexOfComponent(this.jPanelFK_IdTablaAmortiDetalleTablaAmorti);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleTablaAmorti.getComponent(index);
				jPanel.setBorder(this.detalletablaamortiConstantesFunciones.resaltarFK_IdTablaAmortiDetalleTablaAmorti);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioDetalleTablaAmorti() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasDetalleTablaAmorti.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDetalleTablaAmorti.indexOfComponent(this.jPanelFK_IdTablaAmortiDetalleTablaAmorti);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleTablaAmorti.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.detalletablaamortiConstantesFunciones.mostrarFK_IdTablaAmortiDetalleTablaAmorti);
			if(!this.detalletablaamortiConstantesFunciones.mostrarFK_IdTablaAmortiDetalleTablaAmorti && index>-1) {
				this.jTabbedPaneBusquedasDetalleTablaAmorti.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioDetalleTablaAmorti() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasDetalleTablaAmorti.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDetalleTablaAmorti.indexOfComponent(this.jPanelFK_IdTablaAmortiDetalleTablaAmorti);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleTablaAmorti.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.detalletablaamortiConstantesFunciones.activarFK_IdTablaAmortiDetalleTablaAmorti);
				this.jTabbedPaneBusquedasDetalleTablaAmorti.setEnabledAt(index,this.detalletablaamortiConstantesFunciones.activarFK_IdTablaAmortiDetalleTablaAmorti);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaDetalleTablaAmorti(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdTablaAmorti")) {
			index= this.jTabbedPaneBusquedasDetalleTablaAmorti.indexOfComponent(this.jPanelFK_IdTablaAmortiDetalleTablaAmorti);

			this.jTabbedPaneBusquedasDetalleTablaAmorti.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleTablaAmorti.getComponent(index);

			this.detalletablaamortiConstantesFunciones.setResaltarFK_IdTablaAmortiDetalleTablaAmorti(resaltar);

			jPanel.setBorder(this.detalletablaamortiConstantesFunciones.resaltarFK_IdTablaAmortiDetalleTablaAmorti);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarDetalleTablaAmorti.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioDetalleTablaAmorti() throws Exception {

		if(this.jInternalFrameDetalleFormDetalleTablaAmorti==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioDetalleTablaAmorti();
		this.updateVisibilidadResaltarControlesFormularioDetalleTablaAmorti();
		this.updateHabilitarResaltarControlesFormularioDetalleTablaAmorti();
		
	}
	
	public void updateBorderResaltarControlesFormularioDetalleTablaAmorti() throws Exception {
		if(this.jInternalFrameDetalleFormDetalleTablaAmorti==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.detalletablaamortiConstantesFunciones.resaltaridDetalleTablaAmorti!=null && this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) {this.jInternalFrameDetalleFormDetalleTablaAmorti.jLabelidDetalleTablaAmorti.setBorder(this.detalletablaamortiConstantesFunciones.resaltaridDetalleTablaAmorti);}
		if(this.detalletablaamortiConstantesFunciones.resaltarid_empresaDetalleTablaAmorti!=null && this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) {this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_empresaDetalleTablaAmorti.setBorder(this.detalletablaamortiConstantesFunciones.resaltarid_empresaDetalleTablaAmorti);}
		if(this.detalletablaamortiConstantesFunciones.resaltarid_sucursalDetalleTablaAmorti!=null && this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) {this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_sucursalDetalleTablaAmorti.setBorder(this.detalletablaamortiConstantesFunciones.resaltarid_sucursalDetalleTablaAmorti);}
		if(this.detalletablaamortiConstantesFunciones.resaltarid_ejercicioDetalleTablaAmorti!=null && this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) {this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_ejercicioDetalleTablaAmorti.setBorder(this.detalletablaamortiConstantesFunciones.resaltarid_ejercicioDetalleTablaAmorti);}
		if(this.detalletablaamortiConstantesFunciones.resaltarid_periodoDetalleTablaAmorti!=null && this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) {this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_periodoDetalleTablaAmorti.setBorder(this.detalletablaamortiConstantesFunciones.resaltarid_periodoDetalleTablaAmorti);}
		if(this.detalletablaamortiConstantesFunciones.resaltarid_tabla_amortiDetalleTablaAmorti!=null && this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) {this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_tabla_amortiDetalleTablaAmorti.setBorder(this.detalletablaamortiConstantesFunciones.resaltarid_tabla_amortiDetalleTablaAmorti);}
		if(this.detalletablaamortiConstantesFunciones.resaltarvalorDetalleTablaAmorti!=null && this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) {this.jInternalFrameDetalleFormDetalleTablaAmorti.jTextFieldvalorDetalleTablaAmorti.setBorder(this.detalletablaamortiConstantesFunciones.resaltarvalorDetalleTablaAmorti);}
		if(this.detalletablaamortiConstantesFunciones.resaltarinteresDetalleTablaAmorti!=null && this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) {this.jInternalFrameDetalleFormDetalleTablaAmorti.jTextFieldinteresDetalleTablaAmorti.setBorder(this.detalletablaamortiConstantesFunciones.resaltarinteresDetalleTablaAmorti);}
		if(this.detalletablaamortiConstantesFunciones.resaltarcapitalDetalleTablaAmorti!=null && this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) {this.jInternalFrameDetalleFormDetalleTablaAmorti.jTextFieldcapitalDetalleTablaAmorti.setBorder(this.detalletablaamortiConstantesFunciones.resaltarcapitalDetalleTablaAmorti);}
		if(this.detalletablaamortiConstantesFunciones.resaltarfecha_inicioDetalleTablaAmorti!=null && this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) {this.jInternalFrameDetalleFormDetalleTablaAmorti.jDateChooserfecha_inicioDetalleTablaAmorti.setBorder(this.detalletablaamortiConstantesFunciones.resaltarfecha_inicioDetalleTablaAmorti);}
		if(this.detalletablaamortiConstantesFunciones.resaltarfecha_finDetalleTablaAmorti!=null && this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) {this.jInternalFrameDetalleFormDetalleTablaAmorti.jDateChooserfecha_finDetalleTablaAmorti.setBorder(this.detalletablaamortiConstantesFunciones.resaltarfecha_finDetalleTablaAmorti);}
		if(this.detalletablaamortiConstantesFunciones.resaltardescripcionDetalleTablaAmorti!=null && this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) {this.jInternalFrameDetalleFormDetalleTablaAmorti.jTextFielddescripcionDetalleTablaAmorti.setBorder(this.detalletablaamortiConstantesFunciones.resaltardescripcionDetalleTablaAmorti);}
		if(this.detalletablaamortiConstantesFunciones.resaltarid_anioDetalleTablaAmorti!=null && this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) {this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_anioDetalleTablaAmorti.setBorder(this.detalletablaamortiConstantesFunciones.resaltarid_anioDetalleTablaAmorti);}
		if(this.detalletablaamortiConstantesFunciones.resaltarid_mesDetalleTablaAmorti!=null && this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) {this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_mesDetalleTablaAmorti.setBorder(this.detalletablaamortiConstantesFunciones.resaltarid_mesDetalleTablaAmorti);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioDetalleTablaAmorti() throws Exception {		
		if(this.jInternalFrameDetalleFormDetalleTablaAmorti==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) {
	
		//this.jInternalFrameDetalleFormDetalleTablaAmorti.jLabelidDetalleTablaAmorti.setVisible(this.detalletablaamortiConstantesFunciones.mostraridDetalleTablaAmorti);
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jPanelidDetalleTablaAmorti.setVisible(this.detalletablaamortiConstantesFunciones.mostraridDetalleTablaAmorti);
		//this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_empresaDetalleTablaAmorti.setVisible(this.detalletablaamortiConstantesFunciones.mostrarid_empresaDetalleTablaAmorti);
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jPanelid_empresaDetalleTablaAmorti.setVisible(this.detalletablaamortiConstantesFunciones.mostrarid_empresaDetalleTablaAmorti);
		//this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_sucursalDetalleTablaAmorti.setVisible(this.detalletablaamortiConstantesFunciones.mostrarid_sucursalDetalleTablaAmorti);
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jPanelid_sucursalDetalleTablaAmorti.setVisible(this.detalletablaamortiConstantesFunciones.mostrarid_sucursalDetalleTablaAmorti);
		//this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_ejercicioDetalleTablaAmorti.setVisible(this.detalletablaamortiConstantesFunciones.mostrarid_ejercicioDetalleTablaAmorti);
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jPanelid_ejercicioDetalleTablaAmorti.setVisible(this.detalletablaamortiConstantesFunciones.mostrarid_ejercicioDetalleTablaAmorti);
		//this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_periodoDetalleTablaAmorti.setVisible(this.detalletablaamortiConstantesFunciones.mostrarid_periodoDetalleTablaAmorti);
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jPanelid_periodoDetalleTablaAmorti.setVisible(this.detalletablaamortiConstantesFunciones.mostrarid_periodoDetalleTablaAmorti);
		//this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_tabla_amortiDetalleTablaAmorti.setVisible(this.detalletablaamortiConstantesFunciones.mostrarid_tabla_amortiDetalleTablaAmorti);
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jPanelid_tabla_amortiDetalleTablaAmorti.setVisible(this.detalletablaamortiConstantesFunciones.mostrarid_tabla_amortiDetalleTablaAmorti);
		//this.jInternalFrameDetalleFormDetalleTablaAmorti.jTextFieldvalorDetalleTablaAmorti.setVisible(this.detalletablaamortiConstantesFunciones.mostrarvalorDetalleTablaAmorti);
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jPanelvalorDetalleTablaAmorti.setVisible(this.detalletablaamortiConstantesFunciones.mostrarvalorDetalleTablaAmorti);
		//this.jInternalFrameDetalleFormDetalleTablaAmorti.jTextFieldinteresDetalleTablaAmorti.setVisible(this.detalletablaamortiConstantesFunciones.mostrarinteresDetalleTablaAmorti);
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jPanelinteresDetalleTablaAmorti.setVisible(this.detalletablaamortiConstantesFunciones.mostrarinteresDetalleTablaAmorti);
		//this.jInternalFrameDetalleFormDetalleTablaAmorti.jTextFieldcapitalDetalleTablaAmorti.setVisible(this.detalletablaamortiConstantesFunciones.mostrarcapitalDetalleTablaAmorti);
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jPanelcapitalDetalleTablaAmorti.setVisible(this.detalletablaamortiConstantesFunciones.mostrarcapitalDetalleTablaAmorti);
		//this.jInternalFrameDetalleFormDetalleTablaAmorti.jDateChooserfecha_inicioDetalleTablaAmorti.setVisible(this.detalletablaamortiConstantesFunciones.mostrarfecha_inicioDetalleTablaAmorti);
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jPanelfecha_inicioDetalleTablaAmorti.setVisible(this.detalletablaamortiConstantesFunciones.mostrarfecha_inicioDetalleTablaAmorti);
		//this.jInternalFrameDetalleFormDetalleTablaAmorti.jDateChooserfecha_finDetalleTablaAmorti.setVisible(this.detalletablaamortiConstantesFunciones.mostrarfecha_finDetalleTablaAmorti);
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jPanelfecha_finDetalleTablaAmorti.setVisible(this.detalletablaamortiConstantesFunciones.mostrarfecha_finDetalleTablaAmorti);
		//this.jInternalFrameDetalleFormDetalleTablaAmorti.jTextFielddescripcionDetalleTablaAmorti.setVisible(this.detalletablaamortiConstantesFunciones.mostrardescripcionDetalleTablaAmorti);
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jPaneldescripcionDetalleTablaAmorti.setVisible(this.detalletablaamortiConstantesFunciones.mostrardescripcionDetalleTablaAmorti);
		//this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_anioDetalleTablaAmorti.setVisible(this.detalletablaamortiConstantesFunciones.mostrarid_anioDetalleTablaAmorti);
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jPanelid_anioDetalleTablaAmorti.setVisible(this.detalletablaamortiConstantesFunciones.mostrarid_anioDetalleTablaAmorti);
		//this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_mesDetalleTablaAmorti.setVisible(this.detalletablaamortiConstantesFunciones.mostrarid_mesDetalleTablaAmorti);
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jPanelid_mesDetalleTablaAmorti.setVisible(this.detalletablaamortiConstantesFunciones.mostrarid_mesDetalleTablaAmorti);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioDetalleTablaAmorti() throws Exception {
		if(this.jInternalFrameDetalleFormDetalleTablaAmorti==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDetalleTablaAmorti!=null) {
	
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jLabelidDetalleTablaAmorti.setEnabled(this.detalletablaamortiConstantesFunciones.activaridDetalleTablaAmorti);
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_empresaDetalleTablaAmorti.setEnabled(this.detalletablaamortiConstantesFunciones.activarid_empresaDetalleTablaAmorti);
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_sucursalDetalleTablaAmorti.setEnabled(this.detalletablaamortiConstantesFunciones.activarid_sucursalDetalleTablaAmorti);
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_ejercicioDetalleTablaAmorti.setEnabled(this.detalletablaamortiConstantesFunciones.activarid_ejercicioDetalleTablaAmorti);
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_periodoDetalleTablaAmorti.setEnabled(this.detalletablaamortiConstantesFunciones.activarid_periodoDetalleTablaAmorti);
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_tabla_amortiDetalleTablaAmorti.setEnabled(this.detalletablaamortiConstantesFunciones.activarid_tabla_amortiDetalleTablaAmorti);
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jTextFieldvalorDetalleTablaAmorti.setEnabled(this.detalletablaamortiConstantesFunciones.activarvalorDetalleTablaAmorti);
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jTextFieldinteresDetalleTablaAmorti.setEnabled(this.detalletablaamortiConstantesFunciones.activarinteresDetalleTablaAmorti);
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jTextFieldcapitalDetalleTablaAmorti.setEnabled(this.detalletablaamortiConstantesFunciones.activarcapitalDetalleTablaAmorti);
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jDateChooserfecha_inicioDetalleTablaAmorti.setEnabled(this.detalletablaamortiConstantesFunciones.activarfecha_inicioDetalleTablaAmorti);
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jDateChooserfecha_finDetalleTablaAmorti.setEnabled(this.detalletablaamortiConstantesFunciones.activarfecha_finDetalleTablaAmorti);
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jTextFielddescripcionDetalleTablaAmorti.setEnabled(this.detalletablaamortiConstantesFunciones.activardescripcionDetalleTablaAmorti);
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_anioDetalleTablaAmorti.setEnabled(this.detalletablaamortiConstantesFunciones.activarid_anioDetalleTablaAmorti);
		this.jInternalFrameDetalleFormDetalleTablaAmorti.jComboBoxid_mesDetalleTablaAmorti.setEnabled(this.detalletablaamortiConstantesFunciones.activarid_mesDetalleTablaAmorti);
		}
	}
	
		
}