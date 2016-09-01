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

//import com.bydan.erp.contabilidad.util.RetencionesPorPagarPorRetencionesConstantesFunciones;
import com.bydan.erp.contabilidad.util.report.RetencionesPorPagarPorRetencionesParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.report.RetencionesPorPagarPorRetencionesParameterGeneral;
//import com.bydan.erp.contabilidad.presentation.report.source.report.RetencionesPorPagarPorRetencionesBean;
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
public class RetencionesPorPagarPorRetencionesBeanSwingJInternalFrame extends RetencionesPorPagarPorRetencionesJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(RetencionesPorPagarPorRetencionesBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<RetencionesPorPagarPorRetenciones> retencionesporpagarporretencionesValidator = new ClassValidator<RetencionesPorPagarPorRetenciones>(RetencionesPorPagarPorRetenciones.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public RetencionesPorPagarPorRetenciones retencionesporpagarporretenciones;	
	public RetencionesPorPagarPorRetenciones retencionesporpagarporretencionesAux;
	public RetencionesPorPagarPorRetenciones retencionesporpagarporretencionesAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public RetencionesPorPagarPorRetenciones retencionesporpagarporretencionesTotales;
	public Long idRetencionesPorPagarPorRetencionesActual;
	public Long iIdNuevoRetencionesPorPagarPorRetenciones=0L;
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
	
	public Boolean isPermisoTodoRetencionesPorPagarPorRetenciones;
	public Boolean isPermisoNuevoRetencionesPorPagarPorRetenciones;
	public Boolean isPermisoActualizarRetencionesPorPagarPorRetenciones;
	public Boolean isPermisoActualizarOriginalRetencionesPorPagarPorRetenciones;
	public Boolean isPermisoEliminarRetencionesPorPagarPorRetenciones;
	public Boolean isPermisoGuardarCambiosRetencionesPorPagarPorRetenciones;
	public Boolean isPermisoConsultaRetencionesPorPagarPorRetenciones;
	public Boolean isPermisoBusquedaRetencionesPorPagarPorRetenciones;
	public Boolean isPermisoReporteRetencionesPorPagarPorRetenciones;
	public Boolean isPermisoPaginacionMedioRetencionesPorPagarPorRetenciones;
	public Boolean isPermisoPaginacionAltoRetencionesPorPagarPorRetenciones;
	public Boolean isPermisoPaginacionTodoRetencionesPorPagarPorRetenciones;
	public Boolean isPermisoCopiarRetencionesPorPagarPorRetenciones;
	public Boolean isPermisoVerFormRetencionesPorPagarPorRetenciones;
	public Boolean isPermisoDuplicarRetencionesPorPagarPorRetenciones;
	public Boolean isPermisoOrdenRetencionesPorPagarPorRetenciones;
	
	
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
	
	public RetencionesPorPagarPorRetencionesParameterReturnGeneral retencionesporpagarporretencionesReturnGeneral;
	public RetencionesPorPagarPorRetencionesParameterReturnGeneral retencionesporpagarporretencionesParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoRetencionesPorPagarPorRetenciones=false;
	public Boolean esParaAccionDesdeFormularioRetencionesPorPagarPorRetenciones=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected RetencionesPorPagarPorRetencionesSessionBeanAdditional retencionesporpagarporretencionesSessionBeanAdditional=null;
	
	public RetencionesPorPagarPorRetencionesSessionBeanAdditional getRetencionesPorPagarPorRetencionesSessionBeanAdditional() {
		return this.retencionesporpagarporretencionesSessionBeanAdditional;
	}
	
	public void setRetencionesPorPagarPorRetencionesSessionBeanAdditional(RetencionesPorPagarPorRetencionesSessionBeanAdditional retencionesporpagarporretencionesSessionBeanAdditional) {
		try {
			this.retencionesporpagarporretencionesSessionBeanAdditional=retencionesporpagarporretencionesSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected RetencionesPorPagarPorRetencionesBeanSwingJInternalFrameAdditional retencionesporpagarporretencionesBeanSwingJInternalFrameAdditional=null;
	//public class RetencionesPorPagarPorRetencionesBeanSwingJInternalFrame
	
	public RetencionesPorPagarPorRetencionesBeanSwingJInternalFrameAdditional getRetencionesPorPagarPorRetencionesBeanSwingJInternalFrameAdditional() {
		return this.retencionesporpagarporretencionesBeanSwingJInternalFrameAdditional;
	}
	
	public void setRetencionesPorPagarPorRetencionesBeanSwingJInternalFrameAdditional(RetencionesPorPagarPorRetencionesBeanSwingJInternalFrameAdditional retencionesporpagarporretencionesBeanSwingJInternalFrameAdditional) {
		try {
			this.retencionesporpagarporretencionesBeanSwingJInternalFrameAdditional=retencionesporpagarporretencionesBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public RetencionesPorPagarPorRetencionesLogic retencionesporpagarporretencionesLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public RetencionesPorPagarPorRetenciones retencionesporpagarporretencionesBean;
	public RetencionesPorPagarPorRetencionesConstantesFunciones retencionesporpagarporretencionesConstantesFunciones;
	//public RetencionesPorPagarPorRetencionesParameterReturnGeneral retencionesporpagarporretencionesReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public EjercicioLogic ejercicioLogic;
	public PeriodoLogic periodoLogic;
	
	//PARAMETROS
	
	
	//public List<RetencionesPorPagarPorRetenciones> retencionesporpagarporretencioness;	
	//public List<RetencionesPorPagarPorRetenciones> retencionesporpagarporretencionessEliminados;
	//public List<RetencionesPorPagarPorRetenciones> retencionesporpagarporretencionessAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoRetencionesPorPagarPorRetenciones=false;
	public Boolean isVisibilidadCeldaDuplicarRetencionesPorPagarPorRetenciones=true;
	public Boolean isVisibilidadCeldaCopiarRetencionesPorPagarPorRetenciones=true;
	public Boolean isVisibilidadCeldaVerFormRetencionesPorPagarPorRetenciones=true;
	public Boolean isVisibilidadCeldaOrdenRetencionesPorPagarPorRetenciones=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesRetencionesPorPagarPorRetenciones=false;
	public Boolean isVisibilidadCeldaModificarRetencionesPorPagarPorRetenciones=false;
	public Boolean isVisibilidadCeldaActualizarRetencionesPorPagarPorRetenciones=false;
	public Boolean isVisibilidadCeldaEliminarRetencionesPorPagarPorRetenciones=false;
	public Boolean isVisibilidadCeldaCancelarRetencionesPorPagarPorRetenciones=false;
	public Boolean isVisibilidadCeldaGuardarRetencionesPorPagarPorRetenciones=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosRetencionesPorPagarPorRetenciones=false;	
	
	
	public Boolean isVisibilidadBusquedaRetencionesPorPagarPorRetenciones=false;
	public Boolean isVisibilidadFK_IdEjercicio=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdPeriodo=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoRetencionesPorPagarPorRetenciones() {
		return this.iIdNuevoRetencionesPorPagarPorRetenciones;
	}

	public void setiIdNuevoRetencionesPorPagarPorRetenciones(Long iIdNuevoRetencionesPorPagarPorRetenciones) {
		this.iIdNuevoRetencionesPorPagarPorRetenciones = iIdNuevoRetencionesPorPagarPorRetenciones;
	}
	
	public Long getidRetencionesPorPagarPorRetencionesActual() {
		return this.idRetencionesPorPagarPorRetencionesActual;
	}

	public void setidRetencionesPorPagarPorRetencionesActual(Long idRetencionesPorPagarPorRetencionesActual) {
		this.idRetencionesPorPagarPorRetencionesActual = idRetencionesPorPagarPorRetencionesActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public RetencionesPorPagarPorRetenciones getretencionesporpagarporretenciones() {
		return this.retencionesporpagarporretenciones;
	}

	public void setretencionesporpagarporretenciones(RetencionesPorPagarPorRetenciones retencionesporpagarporretenciones) {
		this.retencionesporpagarporretenciones = retencionesporpagarporretenciones;
	}
	
	public RetencionesPorPagarPorRetenciones getretencionesporpagarporretencionesAux() {
		return this.retencionesporpagarporretencionesAux;
	}

	public void setretencionesporpagarporretencionesAux(RetencionesPorPagarPorRetenciones retencionesporpagarporretencionesAux) {
		this.retencionesporpagarporretencionesAux = retencionesporpagarporretencionesAux;
	}				
	
	public RetencionesPorPagarPorRetenciones getretencionesporpagarporretencionesAnterior() {
		return this.retencionesporpagarporretencionesAnterior;
	}

	public void setretencionesporpagarporretencionesAnterior(RetencionesPorPagarPorRetenciones retencionesporpagarporretencionesAnterior) {
		this.retencionesporpagarporretencionesAnterior = retencionesporpagarporretencionesAnterior;
	}	
	
	public RetencionesPorPagarPorRetenciones getretencionesporpagarporretencionesTotales() {
		return this.retencionesporpagarporretencionesTotales;
	}

	public void setretencionesporpagarporretencionesTotales(RetencionesPorPagarPorRetenciones retencionesporpagarporretencionesTotales) {
		this.retencionesporpagarporretencionesTotales = retencionesporpagarporretencionesTotales;
	}	
	
	public RetencionesPorPagarPorRetenciones getretencionesporpagarporretencionesBean() {
		return this.retencionesporpagarporretencionesBean;
	}

	public void setretencionesporpagarporretencionesBean(RetencionesPorPagarPorRetenciones retencionesporpagarporretencionesBean) {
		this.retencionesporpagarporretencionesBean = retencionesporpagarporretencionesBean;
	}	
	
	public RetencionesPorPagarPorRetencionesParameterReturnGeneral getretencionesporpagarporretencionesReturnGeneral() {
		return this.retencionesporpagarporretencionesReturnGeneral;
	}

	public void setretencionesporpagarporretencionesReturnGeneral(RetencionesPorPagarPorRetencionesParameterReturnGeneral retencionesporpagarporretencionesReturnGeneral) {
		this.retencionesporpagarporretencionesReturnGeneral = retencionesporpagarporretencionesReturnGeneral;
	}	
	
	
	public Long id_ejercicioBusquedaRetencionesPorPagarPorRetenciones=-1L;

	public Long getid_ejercicioBusquedaRetencionesPorPagarPorRetenciones() {
		return this.id_ejercicioBusquedaRetencionesPorPagarPorRetenciones;
	}

	public void setid_ejercicioBusquedaRetencionesPorPagarPorRetenciones(Long id_ejercicioBusquedaRetencionesPorPagarPorRetenciones) {
		this.id_ejercicioBusquedaRetencionesPorPagarPorRetenciones = id_ejercicioBusquedaRetencionesPorPagarPorRetenciones;
	}

;
	public Long id_periodoBusquedaRetencionesPorPagarPorRetenciones=-1L;

	public Long getid_periodoBusquedaRetencionesPorPagarPorRetenciones() {
		return this.id_periodoBusquedaRetencionesPorPagarPorRetenciones;
	}

	public void setid_periodoBusquedaRetencionesPorPagarPorRetenciones(Long id_periodoBusquedaRetencionesPorPagarPorRetenciones) {
		this.id_periodoBusquedaRetencionesPorPagarPorRetenciones = id_periodoBusquedaRetencionesPorPagarPorRetenciones;
	}

;
	public Boolean es_debitoBusquedaRetencionesPorPagarPorRetenciones=false;

	public Boolean getes_debitoBusquedaRetencionesPorPagarPorRetenciones() {
		return this.es_debitoBusquedaRetencionesPorPagarPorRetenciones;
	}

	public void setes_debitoBusquedaRetencionesPorPagarPorRetenciones(Boolean es_debitoBusquedaRetencionesPorPagarPorRetenciones) {
		this.es_debitoBusquedaRetencionesPorPagarPorRetenciones = es_debitoBusquedaRetencionesPorPagarPorRetenciones;
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

	public Long id_sucursalFK_IdSucursal=-1L;

	public Long getid_sucursalFK_IdSucursal() {
		return this.id_sucursalFK_IdSucursal;
	}

	public void setid_sucursalFK_IdSucursal(Long id_sucursalFK_IdSucursal) {
		this.id_sucursalFK_IdSucursal = id_sucursalFK_IdSucursal;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public RetencionesPorPagarPorRetencionesLogic getRetencionesPorPagarPorRetencionesLogic()	{		
		return retencionesporpagarporretencionesLogic;
	}

	public void setRetencionesPorPagarPorRetencionesLogic(RetencionesPorPagarPorRetencionesLogic retencionesporpagarporretencionesLogic) {
		this.retencionesporpagarporretencionesLogic = retencionesporpagarporretencionesLogic;
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
	
	public Boolean getIsEsNuevoRetencionesPorPagarPorRetenciones() {
		return isEsNuevoRetencionesPorPagarPorRetenciones;
	}

	public void setIsEsNuevoRetencionesPorPagarPorRetenciones(Boolean isEsNuevoRetencionesPorPagarPorRetenciones) {
		this.isEsNuevoRetencionesPorPagarPorRetenciones = isEsNuevoRetencionesPorPagarPorRetenciones;
	}

	public Boolean getEsParaAccionDesdeFormularioRetencionesPorPagarPorRetenciones() {
		return esParaAccionDesdeFormularioRetencionesPorPagarPorRetenciones;
	}
	
	public void setEsParaAccionDesdeFormularioRetencionesPorPagarPorRetenciones(Boolean esParaAccionDesdeFormularioRetencionesPorPagarPorRetenciones) {
		this.esParaAccionDesdeFormularioRetencionesPorPagarPorRetenciones = esParaAccionDesdeFormularioRetencionesPorPagarPorRetenciones;
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

			if(this.retencionesporpagarporretencionesSessionBean==null) {
				this.retencionesporpagarporretencionesSessionBean=new RetencionesPorPagarPorRetencionesSessionBean();
			}

			if(!this.retencionesporpagarporretencionesSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(retencionesporpagarporretencionesSessionBean.getlidEmpresaActual());
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

			if(this.retencionesporpagarporretencionesSessionBean==null) {
				this.retencionesporpagarporretencionesSessionBean=new RetencionesPorPagarPorRetencionesSessionBean();
			}

			if(!this.retencionesporpagarporretencionesSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(retencionesporpagarporretencionesSessionBean.getlidSucursalActual());
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

			if(this.retencionesporpagarporretencionesSessionBean==null) {
				this.retencionesporpagarporretencionesSessionBean=new RetencionesPorPagarPorRetencionesSessionBean();
			}

			if(!this.retencionesporpagarporretencionesSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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
					ejercicioLogic.getEntityWithConnection(retencionesporpagarporretencionesSessionBean.getlidEjercicioActual());
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

			if(this.retencionesporpagarporretencionesSessionBean==null) {
				this.retencionesporpagarporretencionesSessionBean=new RetencionesPorPagarPorRetencionesSessionBean();
			}

			if(!this.retencionesporpagarporretencionesSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
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
					periodoLogic.getEntityWithConnection(retencionesporpagarporretencionesSessionBean.getlidPeriodoActual());
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

					if(this.retencionesporpagarporretenciones!=null) {
						this.retencionesporpagarporretenciones.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones!=null) {
						this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jComboBoxid_empresaRetencionesPorPagarPorRetenciones.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaRetencionesPorPagarPorRetenciones.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones!=null) {
						if(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jComboBoxid_empresaRetencionesPorPagarPorRetenciones.getItemCount()>0) {
							this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jComboBoxid_empresaRetencionesPorPagarPorRetenciones.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaRetencionesPorPagarPorRetencionesGenerico)throws Exception
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
				jComboBoxid_empresaRetencionesPorPagarPorRetencionesGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaRetencionesPorPagarPorRetencionesGenerico!=null && jComboBoxid_empresaRetencionesPorPagarPorRetencionesGenerico.getItemCount()>0) {
					jComboBoxid_empresaRetencionesPorPagarPorRetencionesGenerico.setSelectedIndex(0);
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

					if(this.retencionesporpagarporretenciones!=null) {
						this.retencionesporpagarporretenciones.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones!=null) {
						this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jComboBoxid_sucursalRetencionesPorPagarPorRetenciones.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalRetencionesPorPagarPorRetenciones.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones!=null) {
						if(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jComboBoxid_sucursalRetencionesPorPagarPorRetenciones.getItemCount()>0) {
							this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jComboBoxid_sucursalRetencionesPorPagarPorRetenciones.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalRetencionesPorPagarPorRetencionesGenerico)throws Exception
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
				jComboBoxid_sucursalRetencionesPorPagarPorRetencionesGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalRetencionesPorPagarPorRetencionesGenerico!=null && jComboBoxid_sucursalRetencionesPorPagarPorRetencionesGenerico.getItemCount()>0) {
					jComboBoxid_sucursalRetencionesPorPagarPorRetencionesGenerico.setSelectedIndex(0);
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

					if(this.retencionesporpagarporretenciones!=null) {
						this.retencionesporpagarporretenciones.setEjercicio(ejercicioTemp);
					}

					if(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones!=null) {
						this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jComboBoxid_ejercicioRetencionesPorPagarPorRetenciones.setSelectedItem(ejercicioTemp);
					}
				} else {
					//jComboBoxid_ejercicioRetencionesPorPagarPorRetenciones.setSelectedItem(ejercicioTemp);
					if(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones!=null) {
						if(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jComboBoxid_ejercicioRetencionesPorPagarPorRetenciones.getItemCount()>0) {
							this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jComboBoxid_ejercicioRetencionesPorPagarPorRetenciones.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaRetencionesPorPagarPorRetenciones") || sFormularioTipoBusqueda.equals("Todos")){
					if(ejercicioTemp!=null && jComboBoxid_ejercicioBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones!=null) {
						jComboBoxid_ejercicioBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones.setSelectedItem(ejercicioTemp);
					} else {
						if(jComboBoxid_ejercicioBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones!=null) {
							//jComboBoxid_ejercicioBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones.setSelectedItem(ejercicioTemp);
							if(jComboBoxid_ejercicioBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones.getItemCount()>0) {
								jComboBoxid_ejercicioBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones.setSelectedIndex(0);
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
	public void setActualEjercicioForeignKeyGenerico(Long idEjercicioSeleccionado,JComboBox jComboBoxid_ejercicioRetencionesPorPagarPorRetencionesGenerico)throws Exception
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
				jComboBoxid_ejercicioRetencionesPorPagarPorRetencionesGenerico.setSelectedItem(ejercicioTemp);
			} else {
				if(jComboBoxid_ejercicioRetencionesPorPagarPorRetencionesGenerico!=null && jComboBoxid_ejercicioRetencionesPorPagarPorRetencionesGenerico.getItemCount()>0) {
					jComboBoxid_ejercicioRetencionesPorPagarPorRetencionesGenerico.setSelectedIndex(0);
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

					if(this.retencionesporpagarporretenciones!=null) {
						this.retencionesporpagarporretenciones.setPeriodo(periodoTemp);
					}

					if(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones!=null) {
						this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jComboBoxid_periodoRetencionesPorPagarPorRetenciones.setSelectedItem(periodoTemp);
					}
				} else {
					//jComboBoxid_periodoRetencionesPorPagarPorRetenciones.setSelectedItem(periodoTemp);
					if(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones!=null) {
						if(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jComboBoxid_periodoRetencionesPorPagarPorRetenciones.getItemCount()>0) {
							this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jComboBoxid_periodoRetencionesPorPagarPorRetenciones.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaRetencionesPorPagarPorRetenciones") || sFormularioTipoBusqueda.equals("Todos")){
					if(periodoTemp!=null && jComboBoxid_periodoBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones!=null) {
						jComboBoxid_periodoBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones.setSelectedItem(periodoTemp);
					} else {
						if(jComboBoxid_periodoBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones!=null) {
							//jComboBoxid_periodoBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones.setSelectedItem(periodoTemp);
							if(jComboBoxid_periodoBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones.getItemCount()>0) {
								jComboBoxid_periodoBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones.setSelectedIndex(0);
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
	public void setActualPeriodoForeignKeyGenerico(Long idPeriodoSeleccionado,JComboBox jComboBoxid_periodoRetencionesPorPagarPorRetencionesGenerico)throws Exception
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
				jComboBoxid_periodoRetencionesPorPagarPorRetencionesGenerico.setSelectedItem(periodoTemp);
			} else {
				if(jComboBoxid_periodoRetencionesPorPagarPorRetencionesGenerico!=null && jComboBoxid_periodoRetencionesPorPagarPorRetencionesGenerico.getItemCount()>0) {
					jComboBoxid_periodoRetencionesPorPagarPorRetencionesGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(RetencionesPorPagarPorRetenciones retencionesporpagarporretenciones,JComboBox jComboBoxid_empresaRetencionesPorPagarPorRetencionesGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaRetencionesPorPagarPorRetencionesGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jComboBoxid_empresaRetencionesPorPagarPorRetenciones.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaRetencionesPorPagarPorRetencionesGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				retencionesporpagarporretenciones.setid_empresa(empresaAux.getId());
				retencionesporpagarporretenciones.setempresa_descripcion(RetencionesPorPagarPorRetencionesConstantesFunciones.getEmpresaDescripcion(empresaAux));
				retencionesporpagarporretenciones.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(RetencionesPorPagarPorRetenciones retencionesporpagarporretenciones,JComboBox jComboBoxid_sucursalRetencionesPorPagarPorRetencionesGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalRetencionesPorPagarPorRetencionesGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jComboBoxid_sucursalRetencionesPorPagarPorRetenciones.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalRetencionesPorPagarPorRetencionesGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				retencionesporpagarporretenciones.setid_sucursal(sucursalAux.getId());
				retencionesporpagarporretenciones.setsucursal_descripcion(RetencionesPorPagarPorRetencionesConstantesFunciones.getSucursalDescripcion(sucursalAux));
				retencionesporpagarporretenciones.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEjercicioForeignKey(RetencionesPorPagarPorRetenciones retencionesporpagarporretenciones,JComboBox jComboBoxid_ejercicioRetencionesPorPagarPorRetencionesGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioAux=new Ejercicio();

			if(jComboBoxid_ejercicioRetencionesPorPagarPorRetencionesGenerico==null) {
				ejercicioAux=(Ejercicio)this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jComboBoxid_ejercicioRetencionesPorPagarPorRetenciones.getSelectedItem();
			} else {
				ejercicioAux=(Ejercicio)jComboBoxid_ejercicioRetencionesPorPagarPorRetencionesGenerico.getSelectedItem();
			}

			if(ejercicioAux!=null && ejercicioAux.getId()!=null) {
				retencionesporpagarporretenciones.setid_ejercicio(ejercicioAux.getId());
				retencionesporpagarporretenciones.setejercicio_descripcion(RetencionesPorPagarPorRetencionesConstantesFunciones.getEjercicioDescripcion(ejercicioAux));
				retencionesporpagarporretenciones.setEjercicio(ejercicioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPeriodoForeignKey(RetencionesPorPagarPorRetenciones retencionesporpagarporretenciones,JComboBox jComboBoxid_periodoRetencionesPorPagarPorRetencionesGenerico)throws Exception
	{
		try
		{
			Periodo  periodoAux=new Periodo();

			if(jComboBoxid_periodoRetencionesPorPagarPorRetencionesGenerico==null) {
				periodoAux=(Periodo)this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jComboBoxid_periodoRetencionesPorPagarPorRetenciones.getSelectedItem();
			} else {
				periodoAux=(Periodo)jComboBoxid_periodoRetencionesPorPagarPorRetencionesGenerico.getSelectedItem();
			}

			if(periodoAux!=null && periodoAux.getId()!=null) {
				retencionesporpagarporretenciones.setid_periodo(periodoAux.getId());
				retencionesporpagarporretenciones.setperiodo_descripcion(RetencionesPorPagarPorRetencionesConstantesFunciones.getPeriodoDescripcion(periodoAux));
				retencionesporpagarporretenciones.setPeriodo(periodoAux);			}
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

					if(!RetencionesPorPagarPorRetencionesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones!=null) { 
							this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jComboBoxid_empresaRetencionesPorPagarPorRetenciones.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jComboBoxid_empresaRetencionesPorPagarPorRetenciones.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones!=null) { 
					}

					if(!RetencionesPorPagarPorRetencionesJInternalFrame.ISBINDING_MANUAL) {
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

					if(!RetencionesPorPagarPorRetencionesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones!=null) { 
							this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jComboBoxid_sucursalRetencionesPorPagarPorRetenciones.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jComboBoxid_sucursalRetencionesPorPagarPorRetenciones.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones!=null) { 
					}

					if(!RetencionesPorPagarPorRetencionesJInternalFrame.ISBINDING_MANUAL) {
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

					if(!RetencionesPorPagarPorRetencionesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones!=null) { 
							this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jComboBoxid_ejercicioRetencionesPorPagarPorRetenciones.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jComboBoxid_ejercicioRetencionesPorPagarPorRetenciones.addItem(ejercicio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones!=null) { 
					}

					if(!RetencionesPorPagarPorRetencionesJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaRetencionesPorPagarPorRetenciones") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!RetencionesPorPagarPorRetencionesJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_ejercicioBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jComboBoxid_ejercicioBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones.addItem(ejercicio);
							}
						}

						if(!RetencionesPorPagarPorRetencionesJInternalFrame.ISBINDING_MANUAL) {
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

					if(!RetencionesPorPagarPorRetencionesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones!=null) { 
							this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jComboBoxid_periodoRetencionesPorPagarPorRetenciones.removeAllItems();

							for(Periodo periodo:this.periodosForeignKey) {
								this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jComboBoxid_periodoRetencionesPorPagarPorRetenciones.addItem(periodo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones!=null) { 
					}

					if(!RetencionesPorPagarPorRetencionesJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaRetencionesPorPagarPorRetenciones") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!RetencionesPorPagarPorRetencionesJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_periodoBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones.removeAllItems();

							for(Periodo periodo:this.periodosForeignKey) {
								this.jComboBoxid_periodoBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones.addItem(periodo);
							}
						}

						if(!RetencionesPorPagarPorRetencionesJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones!=null) {
							this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jComboBoxid_empresaRetencionesPorPagarPorRetenciones.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones!=null) {
							this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jComboBoxid_empresaRetencionesPorPagarPorRetenciones.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones!=null) {
							this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jComboBoxid_sucursalRetencionesPorPagarPorRetenciones.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones!=null) {
							this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jComboBoxid_sucursalRetencionesPorPagarPorRetenciones.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones!=null) {
							this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jComboBoxid_ejercicioRetencionesPorPagarPorRetenciones.setSelectedItem(ejercicio);
						}
					} else {
						if(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones!=null) {
							this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jComboBoxid_ejercicioRetencionesPorPagarPorRetenciones.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_ejercicioBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones.setSelectedItem(ejercicio);
						} else {
							this.jComboBoxid_ejercicioBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones!=null) {
							this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jComboBoxid_periodoRetencionesPorPagarPorRetenciones.setSelectedItem(periodo);
						}
					} else {
						if(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones!=null) {
							this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jComboBoxid_periodoRetencionesPorPagarPorRetenciones.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_periodoBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones.setSelectedItem(periodo);
						} else {
							this.jComboBoxid_periodoBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesRetencionesPorPagarPorRetenciones() throws Exception {
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
		
	public RetencionesPorPagarPorRetencionesParameterReturnGeneral getRetencionesPorPagarPorRetencionesParameterGeneral() {
		return this.retencionesporpagarporretencionesParameterGeneral;
	}
	
	public void setRetencionesPorPagarPorRetencionesParameterGeneral(RetencionesPorPagarPorRetencionesParameterReturnGeneral retencionesporpagarporretencionesParameterGeneral) {
		this.retencionesporpagarporretencionesParameterGeneral = retencionesporpagarporretencionesParameterGeneral;
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
	
	public Boolean getIsPermisoTodoRetencionesPorPagarPorRetenciones() {
		return isPermisoTodoRetencionesPorPagarPorRetenciones;
	}

	public void setIsPermisoTodoRetencionesPorPagarPorRetenciones(Boolean isPermisoTodoRetencionesPorPagarPorRetenciones) {
		this.isPermisoTodoRetencionesPorPagarPorRetenciones = isPermisoTodoRetencionesPorPagarPorRetenciones;
	}

	public Boolean getIsPermisoNuevoRetencionesPorPagarPorRetenciones() {
		return isPermisoNuevoRetencionesPorPagarPorRetenciones;
	}

	public void setIsPermisoNuevoRetencionesPorPagarPorRetenciones(Boolean isPermisoNuevoRetencionesPorPagarPorRetenciones) {
		this.isPermisoNuevoRetencionesPorPagarPorRetenciones = isPermisoNuevoRetencionesPorPagarPorRetenciones;
	}

	public Boolean getIsPermisoActualizarRetencionesPorPagarPorRetenciones() {
		return isPermisoActualizarRetencionesPorPagarPorRetenciones;
	}

	public void setIsPermisoActualizarRetencionesPorPagarPorRetenciones(Boolean isPermisoActualizarRetencionesPorPagarPorRetenciones) {
		this.isPermisoActualizarRetencionesPorPagarPorRetenciones = isPermisoActualizarRetencionesPorPagarPorRetenciones;
	}

	public Boolean getIsPermisoEliminarRetencionesPorPagarPorRetenciones() {
		return isPermisoEliminarRetencionesPorPagarPorRetenciones;
	}

	public void setIsPermisoEliminarRetencionesPorPagarPorRetenciones(Boolean isPermisoEliminarRetencionesPorPagarPorRetenciones) {
		this.isPermisoEliminarRetencionesPorPagarPorRetenciones = isPermisoEliminarRetencionesPorPagarPorRetenciones;
	}

	public Boolean getIsPermisoGuardarCambiosRetencionesPorPagarPorRetenciones() {
		return isPermisoGuardarCambiosRetencionesPorPagarPorRetenciones;
	}

	public void setIsPermisoGuardarCambiosRetencionesPorPagarPorRetenciones(Boolean isPermisoGuardarCambiosRetencionesPorPagarPorRetenciones) {
		this.isPermisoGuardarCambiosRetencionesPorPagarPorRetenciones = isPermisoGuardarCambiosRetencionesPorPagarPorRetenciones;
	}
	
	public Boolean getIsPermisoConsultaRetencionesPorPagarPorRetenciones() {
		return isPermisoConsultaRetencionesPorPagarPorRetenciones;
	}

	public void setIsPermisoConsultaRetencionesPorPagarPorRetenciones(Boolean isPermisoConsultaRetencionesPorPagarPorRetenciones) {
		this.isPermisoConsultaRetencionesPorPagarPorRetenciones = isPermisoConsultaRetencionesPorPagarPorRetenciones;
	}

	public Boolean getIsPermisoBusquedaRetencionesPorPagarPorRetenciones() {
		return isPermisoBusquedaRetencionesPorPagarPorRetenciones;
	}

	public void setIsPermisoBusquedaRetencionesPorPagarPorRetenciones(Boolean isPermisoBusquedaRetencionesPorPagarPorRetenciones) {
		this.isPermisoBusquedaRetencionesPorPagarPorRetenciones = isPermisoBusquedaRetencionesPorPagarPorRetenciones;
	}

	public Boolean getIsPermisoReporteRetencionesPorPagarPorRetenciones() {
		return isPermisoReporteRetencionesPorPagarPorRetenciones;
	}

	public void setIsPermisoReporteRetencionesPorPagarPorRetenciones(Boolean isPermisoReporteRetencionesPorPagarPorRetenciones) {
		this.isPermisoReporteRetencionesPorPagarPorRetenciones = isPermisoReporteRetencionesPorPagarPorRetenciones;
	}
	
	public Boolean getIsPermisoPaginacionMedioRetencionesPorPagarPorRetenciones() {
		return isPermisoPaginacionMedioRetencionesPorPagarPorRetenciones;
	}

	public void setIsPermisoPaginacionMedioRetencionesPorPagarPorRetenciones(Boolean isPermisoPaginacionMedioRetencionesPorPagarPorRetenciones) {
		this.isPermisoPaginacionMedioRetencionesPorPagarPorRetenciones = isPermisoPaginacionMedioRetencionesPorPagarPorRetenciones;
	}
	
	public Boolean getIsPermisoPaginacionTodoRetencionesPorPagarPorRetenciones() {
		return isPermisoPaginacionTodoRetencionesPorPagarPorRetenciones;
	}

	public void setIsPermisoPaginacionTodoRetencionesPorPagarPorRetenciones(Boolean isPermisoPaginacionTodoRetencionesPorPagarPorRetenciones) {
		this.isPermisoPaginacionTodoRetencionesPorPagarPorRetenciones = isPermisoPaginacionTodoRetencionesPorPagarPorRetenciones;
	}
	
	public Boolean getIsPermisoPaginacionAltoRetencionesPorPagarPorRetenciones() {
		return isPermisoPaginacionAltoRetencionesPorPagarPorRetenciones;
	}

	public void setIsPermisoPaginacionAltoRetencionesPorPagarPorRetenciones(Boolean isPermisoPaginacionAltoRetencionesPorPagarPorRetenciones) {
		this.isPermisoPaginacionAltoRetencionesPorPagarPorRetenciones = isPermisoPaginacionAltoRetencionesPorPagarPorRetenciones;
	}
	
	public Boolean getIsPermisoCopiarRetencionesPorPagarPorRetenciones() {
		return isPermisoCopiarRetencionesPorPagarPorRetenciones;
	}

	public void setIsPermisoCopiarRetencionesPorPagarPorRetenciones(Boolean isPermisoCopiarRetencionesPorPagarPorRetenciones) {
		this.isPermisoCopiarRetencionesPorPagarPorRetenciones = isPermisoCopiarRetencionesPorPagarPorRetenciones;
	}
	
	public Boolean getIsPermisoVerFormRetencionesPorPagarPorRetenciones() {
		return isPermisoVerFormRetencionesPorPagarPorRetenciones;
	}

	public void setIsPermisoVerFormRetencionesPorPagarPorRetenciones(Boolean isPermisoVerFormRetencionesPorPagarPorRetenciones) {
		this.isPermisoVerFormRetencionesPorPagarPorRetenciones = isPermisoVerFormRetencionesPorPagarPorRetenciones;
	}
	
	public Boolean getIsPermisoDuplicarRetencionesPorPagarPorRetenciones() {
		return isPermisoDuplicarRetencionesPorPagarPorRetenciones;
	}

	public void setIsPermisoDuplicarRetencionesPorPagarPorRetenciones(Boolean isPermisoDuplicarRetencionesPorPagarPorRetenciones) {
		this.isPermisoDuplicarRetencionesPorPagarPorRetenciones = isPermisoDuplicarRetencionesPorPagarPorRetenciones;
	}
	
	public Boolean getIsPermisoOrdenRetencionesPorPagarPorRetenciones() {
		return isPermisoOrdenRetencionesPorPagarPorRetenciones;
	}

	public void setIsPermisoOrdenRetencionesPorPagarPorRetenciones(Boolean isPermisoOrdenRetencionesPorPagarPorRetenciones) {
		this.isPermisoOrdenRetencionesPorPagarPorRetenciones = isPermisoOrdenRetencionesPorPagarPorRetenciones;
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
	
	public Boolean getIsVisibilidadCeldaNuevoRetencionesPorPagarPorRetenciones() {
		return isVisibilidadCeldaNuevoRetencionesPorPagarPorRetenciones;
	}

	public void setIsVisibilidadCeldaNuevoRetencionesPorPagarPorRetenciones(Boolean isVisibilidadCeldaNuevoRetencionesPorPagarPorRetenciones) {
		this.isVisibilidadCeldaNuevoRetencionesPorPagarPorRetenciones = isVisibilidadCeldaNuevoRetencionesPorPagarPorRetenciones;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarRetencionesPorPagarPorRetenciones() {
		return isVisibilidadCeldaDuplicarRetencionesPorPagarPorRetenciones;
	}

	public void setIsVisibilidadCeldaDuplicarRetencionesPorPagarPorRetenciones(Boolean isVisibilidadCeldaDuplicarRetencionesPorPagarPorRetenciones) {
		this.isVisibilidadCeldaDuplicarRetencionesPorPagarPorRetenciones = isVisibilidadCeldaDuplicarRetencionesPorPagarPorRetenciones;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarRetencionesPorPagarPorRetenciones() {
		return isVisibilidadCeldaCopiarRetencionesPorPagarPorRetenciones;
	}

	public void setIsVisibilidadCeldaCopiarRetencionesPorPagarPorRetenciones(Boolean isVisibilidadCeldaCopiarRetencionesPorPagarPorRetenciones) {
		this.isVisibilidadCeldaCopiarRetencionesPorPagarPorRetenciones = isVisibilidadCeldaCopiarRetencionesPorPagarPorRetenciones;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormRetencionesPorPagarPorRetenciones() {
		return isVisibilidadCeldaVerFormRetencionesPorPagarPorRetenciones;
	}

	public void setIsVisibilidadCeldaVerFormRetencionesPorPagarPorRetenciones(Boolean isVisibilidadCeldaVerFormRetencionesPorPagarPorRetenciones) {
		this.isVisibilidadCeldaVerFormRetencionesPorPagarPorRetenciones = isVisibilidadCeldaVerFormRetencionesPorPagarPorRetenciones;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenRetencionesPorPagarPorRetenciones() {
		return isVisibilidadCeldaOrdenRetencionesPorPagarPorRetenciones;
	}

	public void setIsVisibilidadCeldaOrdenRetencionesPorPagarPorRetenciones(Boolean isVisibilidadCeldaOrdenRetencionesPorPagarPorRetenciones) {
		this.isVisibilidadCeldaOrdenRetencionesPorPagarPorRetenciones = isVisibilidadCeldaOrdenRetencionesPorPagarPorRetenciones;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesRetencionesPorPagarPorRetenciones() {
		return isVisibilidadCeldaNuevoRelacionesRetencionesPorPagarPorRetenciones;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesRetencionesPorPagarPorRetenciones(Boolean isVisibilidadCeldaNuevoRelacionesRetencionesPorPagarPorRetenciones) {
		this.isVisibilidadCeldaNuevoRelacionesRetencionesPorPagarPorRetenciones = isVisibilidadCeldaNuevoRelacionesRetencionesPorPagarPorRetenciones;
	}
	
	public Boolean getIsVisibilidadCeldaModificarRetencionesPorPagarPorRetenciones() {
		return isVisibilidadCeldaModificarRetencionesPorPagarPorRetenciones;
	}

	public void setIsVisibilidadCeldaModificarRetencionesPorPagarPorRetenciones(Boolean isVisibilidadCeldaModificarRetencionesPorPagarPorRetenciones) {
		this.isVisibilidadCeldaModificarRetencionesPorPagarPorRetenciones = isVisibilidadCeldaModificarRetencionesPorPagarPorRetenciones;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarRetencionesPorPagarPorRetenciones() {
		return isVisibilidadCeldaActualizarRetencionesPorPagarPorRetenciones;
	}

	public void setIsVisibilidadCeldaActualizarRetencionesPorPagarPorRetenciones(Boolean isVisibilidadCeldaActualizarRetencionesPorPagarPorRetenciones) {
		this.isVisibilidadCeldaActualizarRetencionesPorPagarPorRetenciones = isVisibilidadCeldaActualizarRetencionesPorPagarPorRetenciones;
	}

	public Boolean getIsVisibilidadCeldaEliminarRetencionesPorPagarPorRetenciones() {
		return isVisibilidadCeldaEliminarRetencionesPorPagarPorRetenciones;
	}

	public void setIsVisibilidadCeldaEliminarRetencionesPorPagarPorRetenciones(Boolean isVisibilidadCeldaEliminarRetencionesPorPagarPorRetenciones) {
		this.isVisibilidadCeldaEliminarRetencionesPorPagarPorRetenciones = isVisibilidadCeldaEliminarRetencionesPorPagarPorRetenciones;
	}

	public Boolean getIsVisibilidadCeldaCancelarRetencionesPorPagarPorRetenciones() {
		return isVisibilidadCeldaCancelarRetencionesPorPagarPorRetenciones;
	}

	public void setIsVisibilidadCeldaCancelarRetencionesPorPagarPorRetenciones(Boolean isVisibilidadCeldaCancelarRetencionesPorPagarPorRetenciones) {
		this.isVisibilidadCeldaCancelarRetencionesPorPagarPorRetenciones = isVisibilidadCeldaCancelarRetencionesPorPagarPorRetenciones;
	}

	public Boolean getIsVisibilidadCeldaGuardarRetencionesPorPagarPorRetenciones() {
		return isVisibilidadCeldaGuardarRetencionesPorPagarPorRetenciones;
	}

	public void setIsVisibilidadCeldaGuardarRetencionesPorPagarPorRetenciones(Boolean isVisibilidadCeldaGuardarRetencionesPorPagarPorRetenciones) {
		this.isVisibilidadCeldaGuardarRetencionesPorPagarPorRetenciones = isVisibilidadCeldaGuardarRetencionesPorPagarPorRetenciones;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosRetencionesPorPagarPorRetenciones() {
		return isVisibilidadCeldaGuardarCambiosRetencionesPorPagarPorRetenciones;
	}

	public void setIsVisibilidadCeldaGuardarCambiosRetencionesPorPagarPorRetenciones(Boolean isVisibilidadCeldaGuardarCambiosRetencionesPorPagarPorRetenciones) {
		this.isVisibilidadCeldaGuardarCambiosRetencionesPorPagarPorRetenciones = isVisibilidadCeldaGuardarCambiosRetencionesPorPagarPorRetenciones;
	}
		
	public RetencionesPorPagarPorRetencionesSessionBean getretencionesporpagarporretencionesSessionBean() {
		return this.retencionesporpagarporretencionesSessionBean;
	}
	
	public void setretencionesporpagarporretencionesSessionBean(RetencionesPorPagarPorRetencionesSessionBean retencionesporpagarporretencionesSessionBean) {
		this.retencionesporpagarporretencionesSessionBean=retencionesporpagarporretencionesSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaRetencionesPorPagarPorRetenciones() {
		return this.isVisibilidadBusquedaRetencionesPorPagarPorRetenciones;
	}

	public void setisVisibilidadBusquedaRetencionesPorPagarPorRetenciones(Boolean isVisibilidadBusquedaRetencionesPorPagarPorRetenciones) {
		this.isVisibilidadBusquedaRetencionesPorPagarPorRetenciones=isVisibilidadBusquedaRetencionesPorPagarPorRetenciones;
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

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorRetenciones(RetencionesPorPagarPorRetenciones retencionesporpagarporretenciones)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(retencionesporpagarporretenciones,null);
				this.setActualParaGuardarSucursalForeignKey(retencionesporpagarporretenciones,null);
				this.setActualParaGuardarEjercicioForeignKey(retencionesporpagarporretenciones,null);
				this.setActualParaGuardarPeriodoForeignKey(retencionesporpagarporretenciones,null);
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
	
	public void bugActualizarReferenciaActual(RetencionesPorPagarPorRetenciones retencionesporpagarporretenciones,RetencionesPorPagarPorRetenciones retencionesporpagarporretencionesAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalRetencionesPorPagarPorRetenciones(retencionesporpagarporretenciones);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		retencionesporpagarporretencionesAux.setId(retencionesporpagarporretenciones.getId());
		retencionesporpagarporretencionesAux.setVersionRow(retencionesporpagarporretenciones.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(RetencionesPorPagarPorRetenciones retencionesporpagarporretencionesLocal) throws Exception {
		
		if(this.retencionesporpagarporretencionesSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(RetencionesPorPagarPorRetenciones retencionesporpagarporretencionesLocal) throws Exception {	
		if(this.retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				retencionesporpagarporretencionesLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				retencionesporpagarporretencionesLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EjercicioDetalleFormJInternalFrame.class)) {
				EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrameLocal=(EjercicioBeanSwingJInternalFrame) ((EjercicioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ejercicioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEjercicio(ejercicioBeanSwingJInternalFrameLocal.getejercicio(),true);
				ejercicioBeanSwingJInternalFrameLocal.actualizarLista(ejercicioBeanSwingJInternalFrameLocal.ejercicio,this.ejerciciosForeignKey);

				ejercicioBeanSwingJInternalFrameLocal.actualizarRelaciones(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				retencionesporpagarporretencionesLocal.setEjercicio(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				this.addItemDefectoCombosForeignKeyEjercicio();
				this.cargarCombosFrameEjerciciosForeignKey("Formulario");
				this.setActualEjercicioForeignKey(ejercicioBeanSwingJInternalFrameLocal.ejercicio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(PeriodoDetalleFormJInternalFrame.class)) {
				PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrameLocal=(PeriodoBeanSwingJInternalFrame) ((PeriodoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				periodoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPeriodo(periodoBeanSwingJInternalFrameLocal.getperiodo(),true);
				periodoBeanSwingJInternalFrameLocal.actualizarLista(periodoBeanSwingJInternalFrameLocal.periodo,this.periodosForeignKey);

				periodoBeanSwingJInternalFrameLocal.actualizarRelaciones(periodoBeanSwingJInternalFrameLocal.periodo);

				retencionesporpagarporretencionesLocal.setPeriodo(periodoBeanSwingJInternalFrameLocal.periodo);

				this.addItemDefectoCombosForeignKeyPeriodo();
				this.cargarCombosFramePeriodosForeignKey("Formulario");
				this.setActualPeriodoForeignKey(periodoBeanSwingJInternalFrameLocal.periodo.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarRetencionesPorPagarPorRetencionesActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosRetencionesPorPagarPorRetenciones.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.retencionesporpagarporretenciones =(RetencionesPorPagarPorRetenciones) this.retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness().toArray()[this.jTableDatosRetencionesPorPagarPorRetenciones.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.retencionesporpagarporretenciones =(RetencionesPorPagarPorRetenciones) this.retencionesporpagarporretencioness.toArray()[this.jTableDatosRetencionesPorPagarPorRetenciones.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = retencionesporpagarporretencionesValidator.getInvalidValues(this.retencionesporpagarporretenciones);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(RetencionesPorPagarPorRetenciones retencionesporpagarporretenciones,List<RetencionesPorPagarPorRetenciones> retencionesporpagarporretencioness) throws Exception {
	}		
	
	public void actualizarSelectedLista(RetencionesPorPagarPorRetenciones retencionesporpagarporretenciones,List<RetencionesPorPagarPorRetenciones> retencionesporpagarporretencioness) throws Exception {
		try	{			
			RetencionesPorPagarPorRetencionesConstantesFunciones.actualizarSelectedLista(retencionesporpagarporretenciones,retencionesporpagarporretencioness);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<RetencionesPorPagarPorRetenciones> retencionesporpagarporretencionessLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				retencionesporpagarporretencionessLocal=this.retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				retencionesporpagarporretencionessLocal=this.retencionesporpagarporretencioness;
			}
			//ARCHITECTURE
		
			for(RetencionesPorPagarPorRetenciones retencionesporpagarporretencionesLocal:retencionesporpagarporretencionessLocal) {
				if(this.permiteMantenimiento(retencionesporpagarporretencionesLocal) && retencionesporpagarporretencionesLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+RetencionesPorPagarPorRetencionesConstantesFunciones.getRetencionesPorPagarPorRetencionesLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(RetencionesPorPagarPorRetencionesConstantesFunciones.FECHAEMISION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jLabelfecha_emisionRetencionesPorPagarPorRetenciones,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RetencionesPorPagarPorRetencionesConstantesFunciones.NOMBRETIPOMOVIMIENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jLabelnombre_tipo_movimientoRetencionesPorPagarPorRetenciones,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RetencionesPorPagarPorRetencionesConstantesFunciones.NUMEROMAYOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jLabelnumero_mayorRetencionesPorPagarPorRetenciones,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RetencionesPorPagarPorRetencionesConstantesFunciones.NOMBRECUENTACONTABLERETENCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jLabelnombre_cuenta_contable_retencionRetencionesPorPagarPorRetenciones,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RetencionesPorPagarPorRetencionesConstantesFunciones.NUMEROPREIMPRESOFACTURA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jLabelnumero_pre_impreso_facturaRetencionesPorPagarPorRetenciones,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RetencionesPorPagarPorRetencionesConstantesFunciones.PORCENTAJE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jLabelporcentajeRetencionesPorPagarPorRetenciones,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RetencionesPorPagarPorRetencionesConstantesFunciones.BASEIMPONIBLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jLabelbase_imponibleRetencionesPorPagarPorRetenciones,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RetencionesPorPagarPorRetencionesConstantesFunciones.VALOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jLabelvalorRetencionesPorPagarPorRetenciones,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RetencionesPorPagarPorRetencionesConstantesFunciones.NUMERO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jLabelnumeroRetencionesPorPagarPorRetenciones,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RetencionesPorPagarPorRetencionesConstantesFunciones.NOMBREBENEF)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jLabelnombre_benefRetencionesPorPagarPorRetenciones,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RetencionesPorPagarPorRetencionesConstantesFunciones.RUCBENEF)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jLabelruc_benefRetencionesPorPagarPorRetenciones,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RetencionesPorPagarPorRetencionesConstantesFunciones.NOMBRECUENTACONTABLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jLabelnombre_cuenta_contableRetencionesPorPagarPorRetenciones,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RetencionesPorPagarPorRetencionesConstantesFunciones.NOMBRECUENTACONTABLECREDITO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jLabelnombre_cuenta_contable_creditoRetencionesPorPagarPorRetenciones,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RetencionesPorPagarPorRetencionesConstantesFunciones.ESDEBITODATO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jLabeles_debito_datoRetencionesPorPagarPorRetenciones,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jLabelfecha_emisionRetencionesPorPagarPorRetenciones,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jLabelnombre_tipo_movimientoRetencionesPorPagarPorRetenciones,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jLabelnumero_mayorRetencionesPorPagarPorRetenciones,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jLabelnombre_cuenta_contable_retencionRetencionesPorPagarPorRetenciones,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jLabelnumero_pre_impreso_facturaRetencionesPorPagarPorRetenciones,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jLabelporcentajeRetencionesPorPagarPorRetenciones,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jLabelbase_imponibleRetencionesPorPagarPorRetenciones,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jLabelvalorRetencionesPorPagarPorRetenciones,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jLabelnumeroRetencionesPorPagarPorRetenciones,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jLabelnombre_benefRetencionesPorPagarPorRetenciones,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jLabelruc_benefRetencionesPorPagarPorRetenciones,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jLabelnombre_cuenta_contableRetencionesPorPagarPorRetenciones,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jLabelnombre_cuenta_contable_creditoRetencionesPorPagarPorRetenciones,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jLabeles_debito_datoRetencionesPorPagarPorRetenciones,"");
		
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
		this.iIdNuevoRetencionesPorPagarPorRetenciones--;	
		
		
		this.retencionesporpagarporretencionesAux=new RetencionesPorPagarPorRetenciones();
		
		this.retencionesporpagarporretencionesAux.setId(this.iIdNuevoRetencionesPorPagarPorRetenciones);
		this.retencionesporpagarporretencionesAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness().add(this.retencionesporpagarporretencionesAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.retencionesporpagarporretencioness.add(this.retencionesporpagarporretencionesAux);
		}
		//ARCHITECTURE
		
		this.retencionesporpagarporretenciones=this.retencionesporpagarporretencionesAux;
		
		if(RetencionesPorPagarPorRetencionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretenciones);
			this.setVariablesObjetoActualToFormularioForeignKeyRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretenciones);
		}
				
		//this.setDefaultControlesRetencionesPorPagarPorRetenciones();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyRetencionesPorPagarPorRetenciones();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyRetencionesPorPagarPorRetenciones();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyRetencionesPorPagarPorRetenciones();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretencionesBean,this.retencionesporpagarporretenciones,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretenciones);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretencionesReturnGeneral,this.retencionesporpagarporretencionesBean,false);
		
		if(this.retencionesporpagarporretencionesReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretencionesReturnGeneral.getRetencionesPorPagarPorRetenciones());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretencionesReturnGeneral.getRetencionesPorPagarPorRetenciones());
		}
		
		if(this.retencionesporpagarporretencionesReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretencionesReturnGeneral.getRetencionesPorPagarPorRetenciones(),classes);//this.retencionesporpagarporretencionesBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretenciones,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyRetencionesPorPagarPorRetenciones();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyRetencionesPorPagarPorRetenciones();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			RetencionesPorPagarPorRetencionesBeanSwingJInternalFrameAdditional.RecargarFormRetencionesPorPagarPorRetenciones(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingRetencionesPorPagarPorRetenciones(false);
						
			if(retencionesporpagarporretencionesSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(RetencionesPorPagarPorRetencionesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualRetencionesPorPagarPorRetenciones();
			}
			
			this.actualizarVisualTableDatosRetencionesPorPagarPorRetenciones();
			
			this.jTableDatosRetencionesPorPagarPorRetenciones.setRowSelectionInterval(this.getIndiceNuevoRetencionesPorPagarPorRetenciones(), this.getIndiceNuevoRetencionesPorPagarPorRetenciones());
			
			this.seleccionarFilaTablaRetencionesPorPagarPorRetencionesActual();
						
			this.actualizarEstadoCeldasBotonesRetencionesPorPagarPorRetenciones("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesRetencionesPorPagarPorRetenciones(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jCheckBoxes_debitoRetencionesPorPagarPorRetenciones.setEnabled(isHabilitar && this.retencionesporpagarporretencionesConstantesFunciones.activares_debitoRetencionesPorPagarPorRetenciones);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jDateChooserfecha_emisionRetencionesPorPagarPorRetenciones.setEnabled(isHabilitar && this.retencionesporpagarporretencionesConstantesFunciones.activarfecha_emisionRetencionesPorPagarPorRetenciones);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextAreanombre_tipo_movimientoRetencionesPorPagarPorRetenciones.setEnabled(isHabilitar && this.retencionesporpagarporretencionesConstantesFunciones.activarnombre_tipo_movimientoRetencionesPorPagarPorRetenciones);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextAreanumero_mayorRetencionesPorPagarPorRetenciones.setEnabled(isHabilitar && this.retencionesporpagarporretencionesConstantesFunciones.activarnumero_mayorRetencionesPorPagarPorRetenciones);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextAreanombre_cuenta_contable_retencionRetencionesPorPagarPorRetenciones.setEnabled(isHabilitar && this.retencionesporpagarporretencionesConstantesFunciones.activarnombre_cuenta_contable_retencionRetencionesPorPagarPorRetenciones);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextFieldnumero_pre_impreso_facturaRetencionesPorPagarPorRetenciones.setEnabled(isHabilitar && this.retencionesporpagarporretencionesConstantesFunciones.activarnumero_pre_impreso_facturaRetencionesPorPagarPorRetenciones);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextFieldporcentajeRetencionesPorPagarPorRetenciones.setEnabled(isHabilitar && this.retencionesporpagarporretencionesConstantesFunciones.activarporcentajeRetencionesPorPagarPorRetenciones);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextFieldbase_imponibleRetencionesPorPagarPorRetenciones.setEnabled(isHabilitar && this.retencionesporpagarporretencionesConstantesFunciones.activarbase_imponibleRetencionesPorPagarPorRetenciones);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextFieldvalorRetencionesPorPagarPorRetenciones.setEnabled(isHabilitar && this.retencionesporpagarporretencionesConstantesFunciones.activarvalorRetencionesPorPagarPorRetenciones);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextFieldnumeroRetencionesPorPagarPorRetenciones.setEnabled(isHabilitar && this.retencionesporpagarporretencionesConstantesFunciones.activarnumeroRetencionesPorPagarPorRetenciones);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextAreanombre_benefRetencionesPorPagarPorRetenciones.setEnabled(isHabilitar && this.retencionesporpagarporretencionesConstantesFunciones.activarnombre_benefRetencionesPorPagarPorRetenciones);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextFieldruc_benefRetencionesPorPagarPorRetenciones.setEnabled(isHabilitar && this.retencionesporpagarporretencionesConstantesFunciones.activarruc_benefRetencionesPorPagarPorRetenciones);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextAreanombre_cuenta_contableRetencionesPorPagarPorRetenciones.setEnabled(isHabilitar && this.retencionesporpagarporretencionesConstantesFunciones.activarnombre_cuenta_contableRetencionesPorPagarPorRetenciones);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextAreanombre_cuenta_contable_creditoRetencionesPorPagarPorRetenciones.setEnabled(isHabilitar && this.retencionesporpagarporretencionesConstantesFunciones.activarnombre_cuenta_contable_creditoRetencionesPorPagarPorRetenciones);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jCheckBoxes_debito_datoRetencionesPorPagarPorRetenciones.setEnabled(isHabilitar && this.retencionesporpagarporretencionesConstantesFunciones.activares_debito_datoRetencionesPorPagarPorRetenciones);	
		//
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jComboBoxid_empresaRetencionesPorPagarPorRetenciones.setEnabled(isHabilitar && this.retencionesporpagarporretencionesConstantesFunciones.activarid_empresaRetencionesPorPagarPorRetenciones);//
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jComboBoxid_sucursalRetencionesPorPagarPorRetenciones.setEnabled(isHabilitar && this.retencionesporpagarporretencionesConstantesFunciones.activarid_sucursalRetencionesPorPagarPorRetenciones);//
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jComboBoxid_ejercicioRetencionesPorPagarPorRetenciones.setEnabled(isHabilitar && this.retencionesporpagarporretencionesConstantesFunciones.activarid_ejercicioRetencionesPorPagarPorRetenciones);//
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jComboBoxid_periodoRetencionesPorPagarPorRetenciones.setEnabled(isHabilitar && this.retencionesporpagarporretencionesConstantesFunciones.activarid_periodoRetencionesPorPagarPorRetenciones);
	};
	
	public void setDefaultControlesRetencionesPorPagarPorRetenciones() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoRetencionesPorPagarPorRetenciones(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.retencionesporpagarporretencionesSessionBean.setConGuardarRelaciones(true);			
			this.retencionesporpagarporretencionesSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTabbedPaneRelacionesRetencionesPorPagarPorRetenciones.setVisible(true);
			
					
		} else {
			//this.retencionesporpagarporretencionesSessionBean.setConGuardarRelaciones(false);			
			this.retencionesporpagarporretencionesSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTabbedPaneRelacionesRetencionesPorPagarPorRetenciones.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoRetencionesPorPagarPorRetenciones() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(RetencionesPorPagarPorRetenciones retencionesporpagarporretencionesAux:this.retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness()) {
				if(retencionesporpagarporretencionesAux.getId().equals(this.iIdNuevoRetencionesPorPagarPorRetenciones)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(RetencionesPorPagarPorRetenciones retencionesporpagarporretencionesAux:this.retencionesporpagarporretencioness) {
				if(retencionesporpagarporretencionesAux.getId().equals(this.iIdNuevoRetencionesPorPagarPorRetenciones)) {
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
	
	public int getIndiceActualRetencionesPorPagarPorRetenciones(RetencionesPorPagarPorRetenciones retencionesporpagarporretenciones,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(RetencionesPorPagarPorRetenciones retencionesporpagarporretencionesAux:this.retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness()) {
				if(retencionesporpagarporretencionesAux.getId().equals(retencionesporpagarporretenciones.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(RetencionesPorPagarPorRetenciones retencionesporpagarporretencionesAux:this.retencionesporpagarporretencioness) {
				if(retencionesporpagarporretencionesAux.getId().equals(retencionesporpagarporretenciones.getId())) {
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
	
	public void setCamposBaseDesdeOriginalRetencionesPorPagarPorRetenciones(RetencionesPorPagarPorRetenciones retencionesporpagarporretencionesOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(RetencionesPorPagarPorRetenciones retencionesporpagarporretencionesAux:this.retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness()) {
				if(retencionesporpagarporretencionesAux.getRetencionesPorPagarPorRetencionesOriginal().getId().equals(retencionesporpagarporretencionesOriginal.getId())) {
					existe=true;
					retencionesporpagarporretencionesOriginal.setId(retencionesporpagarporretencionesAux.getId());
					retencionesporpagarporretencionesOriginal.setVersionRow(retencionesporpagarporretencionesAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(RetencionesPorPagarPorRetenciones retencionesporpagarporretencionesAux:this.retencionesporpagarporretencioness) {
				if(retencionesporpagarporretencionesAux.getRetencionesPorPagarPorRetencionesOriginal().getId().equals(retencionesporpagarporretencionesOriginal.getId())) {
					existe=true;
					retencionesporpagarporretencionesOriginal.setId(retencionesporpagarporretencionesAux.getId());
					retencionesporpagarporretencionesOriginal.setVersionRow(retencionesporpagarporretencionesAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosRetencionesPorPagarPorRetenciones(Boolean esParaCancelar) throws Exception {
		retencionesporpagarporretencionessAux=new ArrayList<RetencionesPorPagarPorRetenciones>();
		retencionesporpagarporretencionesAux=new RetencionesPorPagarPorRetenciones();
		
		if(!this.retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(RetencionesPorPagarPorRetenciones retencionesporpagarporretencionesAux:this.retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness()) {
					if(retencionesporpagarporretencionesAux.getId()<0) {
						retencionesporpagarporretencionessAux.add(retencionesporpagarporretencionesAux);
					}		
				}
				this.iIdNuevoRetencionesPorPagarPorRetenciones=0L;
				this.retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness().removeAll(retencionesporpagarporretencionessAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(RetencionesPorPagarPorRetenciones retencionesporpagarporretencionesAux:this.retencionesporpagarporretencioness) {
					if(retencionesporpagarporretencionesAux.getId()<0) {
						retencionesporpagarporretencionessAux.add(retencionesporpagarporretencionesAux);
					}		
				}
				this.iIdNuevoRetencionesPorPagarPorRetenciones=0L;
				this.retencionesporpagarporretencioness.removeAll(retencionesporpagarporretencionessAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoRetencionesPorPagarPorRetenciones 
					&& this.retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness().size()>0
					) {
					retencionesporpagarporretencionesAux=this.retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness().get(this.retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness().size() - 1);
				
					if(retencionesporpagarporretencionesAux.getId()<0) {
						this.retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness().remove(retencionesporpagarporretencionesAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoRetencionesPorPagarPorRetenciones && this.retencionesporpagarporretencioness.size()>0) {
					retencionesporpagarporretencionesAux=this.retencionesporpagarporretencioness.get(this.retencionesporpagarporretencioness.size() - 1);
				
					if(retencionesporpagarporretencionesAux.getId()<0) {
						this.retencionesporpagarporretencioness.remove(retencionesporpagarporretencionesAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoRetencionesPorPagarPorRetenciones(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(retencionesporpagarporretenciones.getId()<0) {
				this.retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness().remove(this.retencionesporpagarporretenciones);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(retencionesporpagarporretenciones.getId()<0) {
				this.retencionesporpagarporretencioness.remove(this.retencionesporpagarporretenciones);
			}
		}			
	}
	
	public void setEstadosInicialesRetencionesPorPagarPorRetenciones(List<RetencionesPorPagarPorRetenciones> retencionesporpagarporretencionessAux) throws Exception {
		RetencionesPorPagarPorRetencionesConstantesFunciones.setEstadosInicialesRetencionesPorPagarPorRetenciones(retencionesporpagarporretencionessAux);
	}
	
	public void setEstadosInicialesRetencionesPorPagarPorRetenciones(RetencionesPorPagarPorRetenciones retencionesporpagarporretencionesAux) throws Exception {
		RetencionesPorPagarPorRetencionesConstantesFunciones.setEstadosInicialesRetencionesPorPagarPorRetenciones(retencionesporpagarporretencionesAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarRetencionesPorPagarPorRetencionesActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesRetencionesPorPagarPorRetenciones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarRetencionesPorPagarPorRetencionesActual()) {
				if(!this.isEsNuevoRetencionesPorPagarPorRetenciones) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesRetencionesPorPagarPorRetenciones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoRetencionesPorPagarPorRetenciones=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarRetencionesPorPagarPorRetencionesActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Retenciones Por Pagar Por Retenciones ?", "MANTENIMIENTO DE Retenciones Por Pagar Por Retenciones", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesRetencionesPorPagarPorRetenciones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(RetencionesPorPagarPorRetenciones retencionesporpagarporretenciones) throws Exception {
		RetencionesPorPagarPorRetencionesConstantesFunciones.seleccionarAsignar(this.retencionesporpagarporretenciones,retencionesporpagarporretenciones);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarRetencionesPorPagarPorRetenciones=this.isPermisoActualizarOriginalRetencionesPorPagarPorRetenciones;
			
			
			this.seleccionarAsignar(retencionesporpagarporretenciones);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesRetencionesPorPagarPorRetenciones("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.retencionesporpagarporretencionesSessionBean.setsFuncionBusquedaRapida(this.retencionesporpagarporretencionesSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoRetencionesPorPagarPorRetenciones) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosRetencionesPorPagarPorRetenciones(esParaCancelar);				
				this.cancelarNuevoRetencionesPorPagarPorRetenciones(esParaCancelar);								
			}
			
			this.retencionesporpagarporretenciones=new RetencionesPorPagarPorRetenciones();
			
			this.inicializarRetencionesPorPagarPorRetenciones();
			
			this.actualizarEstadoCeldasBotonesRetencionesPorPagarPorRetenciones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarRetencionesPorPagarPorRetenciones() throws Exception {
		try {
			RetencionesPorPagarPorRetencionesConstantesFunciones.inicializarRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretenciones);
			
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
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteRetencionesPorPagarPorRetencioness(String sAccionBusqueda,List<RetencionesPorPagarPorRetenciones> retencionesporpagarporretencionessParaReportes) throws Exception {
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
					sPathReporteFinal="RetencionesPorPagarPorRetenciones"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="RetencionesPorPagarPorRetencionesMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("RetencionesPorPagarPorRetencionesMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="RetencionesPorPagarPorRetenciones"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Retenciones Por Pagar Por Retencioneses");		
		parameters.put("busquedapor", RetencionesPorPagarPorRetencionesConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceRetencionesPorPagarPorRetenciones=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			RetencionesPorPagarPorRetencionesConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			RetencionesPorPagarPorRetencionesConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceRetencionesPorPagarPorRetenciones=new JRBeanArrayDataSource(RetencionesPorPagarPorRetencionesJInternalFrame.TraerRetencionesPorPagarPorRetencionesBeans(retencionesporpagarporretencionessParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceRetencionesPorPagarPorRetenciones);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+RetencionesPorPagarPorRetencionesConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(RetencionesPorPagarPorRetencionesBean.TraerRetencionesPorPagarPorRetencionesBeans(retencionesporpagarporretencionessParaReportes).toArray()));
							
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
				this.generarExcelReporteRetencionesPorPagarPorRetencioness(sAccionBusqueda,sTipoArchivoReporte,retencionesporpagarporretencionessParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalRetencionesPorPagarPorRetencioness(sAccionBusqueda,sTipoArchivoReporte,retencionesporpagarporretencionessParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoRetencionesPorPagarPorRetencionesActionPerformed(null);
					//this.generarExcelReporteRetencionesPorPagarPorRetencioness(sAccionBusqueda,sTipoArchivoReporte,retencionesporpagarporretencionessParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalRetencionesPorPagarPorRetencioness(sAccionBusqueda,sTipoArchivoReporte,retencionesporpagarporretencionessParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesRetencionesPorPagarPorRetencioness(sAccionBusqueda,sTipoArchivoReporte,retencionesporpagarporretencionessParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesRetencionesPorPagarPorRetencioness(sAccionBusqueda,sTipoArchivoReporte,retencionesporpagarporretencionessParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRetencionesPorPagarPorRetencioness(String sAccionBusqueda,String sTipoArchivoReporte,List<RetencionesPorPagarPorRetenciones> retencionesporpagarporretencionessParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"retencionesporpagarporretenciones";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("RetencionesPorPagarPorRetencioness");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderRetencionesPorPagarPorRetenciones("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(RetencionesPorPagarPorRetenciones retencionesporpagarporretenciones : retencionesporpagarporretencionessParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			RetencionesPorPagarPorRetencionesConstantesFunciones.generarExcelReporteDataRetencionesPorPagarPorRetenciones("NORMAL",row,workbook,retencionesporpagarporretenciones,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Retenciones Por Pagar Por Retenciones",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderRetencionesPorPagarPorRetenciones(String sTipo,Row row,Workbook workbook) {
		
		RetencionesPorPagarPorRetencionesConstantesFunciones.generarExcelReporteHeaderRetencionesPorPagarPorRetenciones(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalRetencionesPorPagarPorRetencioness(String sAccionBusqueda,String sTipoArchivoReporte,List<RetencionesPorPagarPorRetenciones> retencionesporpagarporretencionessParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"retencionesporpagarporretenciones_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("RetencionesPorPagarPorRetencioness");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(RetencionesPorPagarPorRetenciones retencionesporpagarporretenciones : retencionesporpagarporretencionessParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(RetencionesPorPagarPorRetencionesConstantesFunciones.getRetencionesPorPagarPorRetencionesDescripcion(retencionesporpagarporretenciones));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(retencionesporpagarporretenciones.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(retencionesporpagarporretenciones.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_IDEJERCICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_IDEJERCICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(retencionesporpagarporretenciones.getejercicio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_IDPERIODO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_IDPERIODO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(retencionesporpagarporretenciones.getperiodo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_ESDEBITO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_ESDEBITO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(retencionesporpagarporretenciones.getes_debito()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_FECHAEMISION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_FECHAEMISION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(retencionesporpagarporretenciones.getfecha_emision());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBRETIPOMOVIMIENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBRETIPOMOVIMIENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(retencionesporpagarporretenciones.getnombre_tipo_movimiento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NUMEROMAYOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NUMEROMAYOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(retencionesporpagarporretenciones.getnumero_mayor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBRECUENTACONTABLERETENCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBRECUENTACONTABLERETENCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(retencionesporpagarporretenciones.getnombre_cuenta_contable_retencion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(retencionesporpagarporretenciones.getnumero_pre_impreso_factura());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_PORCENTAJE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_PORCENTAJE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(retencionesporpagarporretenciones.getporcentaje());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_BASEIMPONIBLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_BASEIMPONIBLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(retencionesporpagarporretenciones.getbase_imponible());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_VALOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_VALOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(retencionesporpagarporretenciones.getvalor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NUMERO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NUMERO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(retencionesporpagarporretenciones.getnumero());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBREBENEF))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBREBENEF);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(retencionesporpagarporretenciones.getnombre_benef());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_RUCBENEF))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_RUCBENEF);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(retencionesporpagarporretenciones.getruc_benef());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBRECUENTACONTABLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBRECUENTACONTABLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(retencionesporpagarporretenciones.getnombre_cuenta_contable());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBRECUENTACONTABLECREDITO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBRECUENTACONTABLECREDITO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(retencionesporpagarporretenciones.getnombre_cuenta_contable_credito());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_ESDEBITODATO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_ESDEBITODATO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(retencionesporpagarporretenciones.getes_debito_dato()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Retenciones Por Pagar Por Retenciones",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesRetencionesPorPagarPorRetencioness(String sAccionBusqueda,String sTipoArchivoReporte,List<RetencionesPorPagarPorRetenciones> retencionesporpagarporretencionessParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<RetencionesPorPagarPorRetenciones> retencionesporpagarporretencionessRespaldo=null;
		
		classes=RetencionesPorPagarPorRetencionesConstantesFunciones.getClassesRelationshipsOfRetencionesPorPagarPorRetenciones(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.retencionesporpagarporretencionesLogic.setDatosCliente(this.datosCliente);
		this.retencionesporpagarporretencionesLogic.setDatosDeep(this.datosDeep);
		this.retencionesporpagarporretencionesLogic.setIsConDeep(true);
		
		retencionesporpagarporretencionessRespaldo=this.retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness();
		
		this.retencionesporpagarporretencionesLogic.setRetencionesPorPagarPorRetencioness(retencionesporpagarporretencionessParaReportes);	
		this.retencionesporpagarporretencionesLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		retencionesporpagarporretencionessParaReportes=this.retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness();
		this.retencionesporpagarporretencionesLogic.setRetencionesPorPagarPorRetencioness(retencionesporpagarporretencionessRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"retencionesporpagarporretenciones_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("RetencionesPorPagarPorRetencioness");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderRetencionesPorPagarPorRetenciones("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(RetencionesPorPagarPorRetenciones retencionesporpagarporretenciones : retencionesporpagarporretencionessParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderRetencionesPorPagarPorRetenciones("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			RetencionesPorPagarPorRetencionesConstantesFunciones.generarExcelReporteDataRetencionesPorPagarPorRetenciones("NORMAL",row,workbook,retencionesporpagarporretenciones,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(RetencionesPorPagarPorRetencionesConstantesFunciones.getRetencionesPorPagarPorRetencionesDescripcion(retencionesporpagarporretenciones));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Retenciones Por Pagar Por Retenciones",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoRetencionesPorPagarPorRetenciones.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoRetencionesPorPagarPorRetenciones.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoRetencionesPorPagarPorRetenciones.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoRetencionesPorPagarPorRetenciones.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessRetencionesPorPagarPorRetenciones() throws Exception {		
		this.startProcessRetencionesPorPagarPorRetenciones(true);
	}
	
	public void startProcessRetencionesPorPagarPorRetenciones(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasRetencionesPorPagarPorRetenciones ,this.jPanelParametrosReportesRetencionesPorPagarPorRetenciones, this.jScrollPanelDatosRetencionesPorPagarPorRetenciones,this.jPanelPaginacionRetencionesPorPagarPorRetenciones, this.jScrollPanelDatosEdicionRetencionesPorPagarPorRetenciones, this.jPanelAccionesRetencionesPorPagarPorRetenciones,this.jPanelAccionesFormularioRetencionesPorPagarPorRetenciones,this.jmenuBarRetencionesPorPagarPorRetenciones,this.jmenuBarDetalleRetencionesPorPagarPorRetenciones,this.jTtoolBarRetencionesPorPagarPorRetenciones,this.jTtoolBarDetalleRetencionesPorPagarPorRetenciones);		
		
		final JTabbedPane jTabbedPaneBusquedasRetencionesPorPagarPorRetenciones=this.jTabbedPaneBusquedasRetencionesPorPagarPorRetenciones; 
		
		final JPanel jPanelParametrosReportesRetencionesPorPagarPorRetenciones=this.jPanelParametrosReportesRetencionesPorPagarPorRetenciones;
		//final JScrollPane jScrollPanelDatosRetencionesPorPagarPorRetenciones=this.jScrollPanelDatosRetencionesPorPagarPorRetenciones;
		final JTable jTableDatosRetencionesPorPagarPorRetenciones=this.jTableDatosRetencionesPorPagarPorRetenciones;		
		final JPanel jPanelPaginacionRetencionesPorPagarPorRetenciones=this.jPanelPaginacionRetencionesPorPagarPorRetenciones;
		//final JScrollPane jScrollPanelDatosEdicionRetencionesPorPagarPorRetenciones=this.jScrollPanelDatosEdicionRetencionesPorPagarPorRetenciones;
		final JPanel jPanelAccionesRetencionesPorPagarPorRetenciones=this.jPanelAccionesRetencionesPorPagarPorRetenciones;
		
		JPanel jPanelCamposAuxiliarRetencionesPorPagarPorRetenciones=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarRetencionesPorPagarPorRetenciones=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones!=null) {
			jPanelCamposAuxiliarRetencionesPorPagarPorRetenciones=this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jPanelCamposRetencionesPorPagarPorRetenciones;
			jPanelAccionesFormularioAuxiliarRetencionesPorPagarPorRetenciones=this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jPanelAccionesFormularioRetencionesPorPagarPorRetenciones;
		}
		
		final JPanel jPanelCamposRetencionesPorPagarPorRetenciones=jPanelCamposAuxiliarRetencionesPorPagarPorRetenciones;
		final JPanel jPanelAccionesFormularioRetencionesPorPagarPorRetenciones=jPanelAccionesFormularioAuxiliarRetencionesPorPagarPorRetenciones;
		
		
		final JMenuBar jmenuBarRetencionesPorPagarPorRetenciones=this.jmenuBarRetencionesPorPagarPorRetenciones;
		final JToolBar jTtoolBarRetencionesPorPagarPorRetenciones=this.jTtoolBarRetencionesPorPagarPorRetenciones;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarRetencionesPorPagarPorRetenciones=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarRetencionesPorPagarPorRetenciones=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones!=null) {
			jmenuBarDetalleAuxiliarRetencionesPorPagarPorRetenciones=this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jmenuBarDetalleRetencionesPorPagarPorRetenciones;
			jTtoolBarDetalleAuxiliarRetencionesPorPagarPorRetenciones=this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTtoolBarDetalleRetencionesPorPagarPorRetenciones;
		}
		
		final JMenuBar jmenuBarDetalleRetencionesPorPagarPorRetenciones=jmenuBarDetalleAuxiliarRetencionesPorPagarPorRetenciones;
		final JToolBar jTtoolBarDetalleRetencionesPorPagarPorRetenciones=jTtoolBarDetalleAuxiliarRetencionesPorPagarPorRetenciones;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasRetencionesPorPagarPorRetenciones;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesRetencionesPorPagarPorRetenciones;
			processRunnable.jTableDatos=jTableDatosRetencionesPorPagarPorRetenciones;
			processRunnable.jPanelCampos=jPanelCamposRetencionesPorPagarPorRetenciones;
			processRunnable.jPanelPaginacion=jPanelPaginacionRetencionesPorPagarPorRetenciones;
			processRunnable.jPanelAcciones=jPanelAccionesRetencionesPorPagarPorRetenciones;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioRetencionesPorPagarPorRetenciones;
			
			
			processRunnable.jmenuBar=jmenuBarRetencionesPorPagarPorRetenciones;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleRetencionesPorPagarPorRetenciones;
			processRunnable.jTtoolBar=jTtoolBarRetencionesPorPagarPorRetenciones;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleRetencionesPorPagarPorRetenciones;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasRetencionesPorPagarPorRetenciones ,jPanelParametrosReportesRetencionesPorPagarPorRetenciones,jTableDatosRetencionesPorPagarPorRetenciones, /*jScrollPanelDatosRetencionesPorPagarPorRetenciones,*/jPanelCamposRetencionesPorPagarPorRetenciones,jPanelPaginacionRetencionesPorPagarPorRetenciones, /*jScrollPanelDatosEdicionRetencionesPorPagarPorRetenciones,*/ jPanelAccionesRetencionesPorPagarPorRetenciones,jPanelAccionesFormularioRetencionesPorPagarPorRetenciones,jmenuBarRetencionesPorPagarPorRetenciones,jmenuBarDetalleRetencionesPorPagarPorRetenciones,jTtoolBarRetencionesPorPagarPorRetenciones,jTtoolBarDetalleRetencionesPorPagarPorRetenciones);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasRetencionesPorPagarPorRetenciones ,jPanelParametrosReportesRetencionesPorPagarPorRetenciones, jScrollPanelDatosRetencionesPorPagarPorRetenciones,jPanelPaginacionRetencionesPorPagarPorRetenciones, jScrollPanelDatosEdicionRetencionesPorPagarPorRetenciones, jPanelAccionesRetencionesPorPagarPorRetenciones,jPanelAccionesFormularioRetencionesPorPagarPorRetenciones,jmenuBarRetencionesPorPagarPorRetenciones,jmenuBarDetalleRetencionesPorPagarPorRetenciones,jTtoolBarRetencionesPorPagarPorRetenciones,jTtoolBarDetalleRetencionesPorPagarPorRetenciones);
						
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
	
	public void finishProcessRetencionesPorPagarPorRetenciones() {// throws Exception 
		this.finishProcessRetencionesPorPagarPorRetenciones(true);
	}
	
	public void finishProcessRetencionesPorPagarPorRetenciones(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasRetencionesPorPagarPorRetenciones ,this.jPanelParametrosReportesRetencionesPorPagarPorRetenciones, this.jScrollPanelDatosRetencionesPorPagarPorRetenciones,this.jPanelPaginacionRetencionesPorPagarPorRetenciones, this.jScrollPanelDatosEdicionRetencionesPorPagarPorRetenciones, this.jPanelAccionesRetencionesPorPagarPorRetenciones,this.jPanelAccionesFormularioRetencionesPorPagarPorRetenciones,this.jmenuBarRetencionesPorPagarPorRetenciones,this.jmenuBarDetalleRetencionesPorPagarPorRetenciones,this.jTtoolBarRetencionesPorPagarPorRetenciones,this.jTtoolBarDetalleRetencionesPorPagarPorRetenciones);		
		
		final JTabbedPane jTabbedPaneBusquedasRetencionesPorPagarPorRetenciones=this.jTabbedPaneBusquedasRetencionesPorPagarPorRetenciones; 
		
		final JPanel jPanelParametrosReportesRetencionesPorPagarPorRetenciones=this.jPanelParametrosReportesRetencionesPorPagarPorRetenciones;
		//final JScrollPane jScrollPanelDatosRetencionesPorPagarPorRetenciones=this.jScrollPanelDatosRetencionesPorPagarPorRetenciones;
		final JTable jTableDatosRetencionesPorPagarPorRetenciones=this.jTableDatosRetencionesPorPagarPorRetenciones;		
		final JPanel jPanelPaginacionRetencionesPorPagarPorRetenciones=this.jPanelPaginacionRetencionesPorPagarPorRetenciones;
		//final JScrollPane jScrollPanelDatosEdicionRetencionesPorPagarPorRetenciones=this.jScrollPanelDatosEdicionRetencionesPorPagarPorRetenciones;
		final JPanel jPanelAccionesRetencionesPorPagarPorRetenciones=this.jPanelAccionesRetencionesPorPagarPorRetenciones;
		
		JPanel jPanelCamposAuxiliarRetencionesPorPagarPorRetenciones=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarRetencionesPorPagarPorRetenciones=new JPanel();
		
		if(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones!=null) {
			jPanelCamposAuxiliarRetencionesPorPagarPorRetenciones=this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jPanelCamposRetencionesPorPagarPorRetenciones;
			jPanelAccionesFormularioAuxiliarRetencionesPorPagarPorRetenciones=this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jPanelAccionesFormularioRetencionesPorPagarPorRetenciones;
		}
		
		final JPanel jPanelCamposRetencionesPorPagarPorRetenciones=jPanelCamposAuxiliarRetencionesPorPagarPorRetenciones;
		final JPanel jPanelAccionesFormularioRetencionesPorPagarPorRetenciones=jPanelAccionesFormularioAuxiliarRetencionesPorPagarPorRetenciones;
		
		
		final JMenuBar jmenuBarRetencionesPorPagarPorRetenciones=this.jmenuBarRetencionesPorPagarPorRetenciones;		
		final JToolBar jTtoolBarRetencionesPorPagarPorRetenciones=this.jTtoolBarRetencionesPorPagarPorRetenciones;
				
		JMenuBar jmenuBarDetalleAuxiliarRetencionesPorPagarPorRetenciones=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarRetencionesPorPagarPorRetenciones=new JToolBar();
		
		if(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones!=null) {
			jmenuBarDetalleAuxiliarRetencionesPorPagarPorRetenciones=this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jmenuBarDetalleRetencionesPorPagarPorRetenciones;
			jTtoolBarDetalleAuxiliarRetencionesPorPagarPorRetenciones=this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTtoolBarDetalleRetencionesPorPagarPorRetenciones;		
		}
		
		final JMenuBar jmenuBarDetalleRetencionesPorPagarPorRetenciones=jmenuBarDetalleAuxiliarRetencionesPorPagarPorRetenciones;
		final JToolBar jTtoolBarDetalleRetencionesPorPagarPorRetenciones=jTtoolBarDetalleAuxiliarRetencionesPorPagarPorRetenciones;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasRetencionesPorPagarPorRetenciones;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesRetencionesPorPagarPorRetenciones;
			processRunnable.jTableDatos=jTableDatosRetencionesPorPagarPorRetenciones;
			processRunnable.jPanelCampos=jPanelCamposRetencionesPorPagarPorRetenciones;
			processRunnable.jPanelPaginacion=jPanelPaginacionRetencionesPorPagarPorRetenciones;
			processRunnable.jPanelAcciones=jPanelAccionesRetencionesPorPagarPorRetenciones;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioRetencionesPorPagarPorRetenciones;
			
			
			processRunnable.jmenuBar=jmenuBarRetencionesPorPagarPorRetenciones;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleRetencionesPorPagarPorRetenciones;
			processRunnable.jTtoolBar=jTtoolBarRetencionesPorPagarPorRetenciones;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleRetencionesPorPagarPorRetenciones;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasRetencionesPorPagarPorRetenciones ,jPanelParametrosReportesRetencionesPorPagarPorRetenciones, jTableDatosRetencionesPorPagarPorRetenciones,/*jScrollPanelDatosRetencionesPorPagarPorRetenciones,*/jPanelCamposRetencionesPorPagarPorRetenciones,jPanelPaginacionRetencionesPorPagarPorRetenciones, /*jScrollPanelDatosEdicionRetencionesPorPagarPorRetenciones,*/ jPanelAccionesRetencionesPorPagarPorRetenciones,jPanelAccionesFormularioRetencionesPorPagarPorRetenciones,jmenuBarRetencionesPorPagarPorRetenciones,jmenuBarDetalleRetencionesPorPagarPorRetenciones,jTtoolBarRetencionesPorPagarPorRetenciones,jTtoolBarDetalleRetencionesPorPagarPorRetenciones));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesRetencionesPorPagarPorRetenciones(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarRetencionesPorPagarPorRetenciones(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuRetencionesPorPagarPorRetenciones(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarRetencionesPorPagarPorRetenciones(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarRetencionesPorPagarPorRetenciones,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleRetencionesPorPagarPorRetenciones,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuRetencionesPorPagarPorRetenciones(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarRetencionesPorPagarPorRetenciones,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleRetencionesPorPagarPorRetenciones,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.retencionesporpagarporretencionesConstantesFunciones.getsFinalQueryRetencionesPorPagarPorRetenciones();
		String  finalQueryPaginacionTodos=this.retencionesporpagarporretencionesConstantesFunciones.getsFinalQueryRetencionesPorPagarPorRetenciones();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=RetencionesPorPagarPorRetencionesConstantesFunciones.getArrayColumnasGlobalesNoRetencionesPorPagarPorRetenciones(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=RetencionesPorPagarPorRetencionesConstantesFunciones.getArrayColumnasGlobalesRetencionesPorPagarPorRetenciones(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,RetencionesPorPagarPorRetencionesConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.retencionesporpagarporretencionessEliminados= new ArrayList<RetencionesPorPagarPorRetenciones>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessRetencionesPorPagarPorRetenciones();
		
				///*RetencionesPorPagarPorRetencionesSessionBean*/this.retencionesporpagarporretencionesSessionBean=new RetencionesPorPagarPorRetencionesSessionBean();
			
			if(this.retencionesporpagarporretencionesSessionBean==null) {
				this.retencionesporpagarporretencionesSessionBean=new RetencionesPorPagarPorRetencionesSessionBean();
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
					this.iNumeroPaginacion=RetencionesPorPagarPorRetencionesConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=RetencionesPorPagarPorRetencionesConstantesFunciones.getClassesForeignKeysOfRetencionesPorPagarPorRetenciones(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/retencionesporpagarporretenciones."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			retencionesporpagarporretencionessAux= new ArrayList<RetencionesPorPagarPorRetenciones>();
			
				
			retencionesporpagarporretencionesLogic.setDatosCliente(this.datosCliente);
			retencionesporpagarporretencionesLogic.setDatosDeep(this.datosDeep);
			retencionesporpagarporretencionesLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaRetencionesPorPagarPorRetenciones")) {
				this.sDetalleReporte=RetencionesPorPagarPorRetencionesConstantesFunciones.getDetalleIndiceBusquedaRetencionesPorPagarPorRetenciones(id_ejercicioBusquedaRetencionesPorPagarPorRetenciones,id_periodoBusquedaRetencionesPorPagarPorRetenciones,es_debitoBusquedaRetencionesPorPagarPorRetenciones);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencionessBusquedaRetencionesPorPagarPorRetenciones(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_ejercicioBusquedaRetencionesPorPagarPorRetenciones,id_periodoBusquedaRetencionesPorPagarPorRetenciones,es_debitoBusquedaRetencionesPorPagarPorRetenciones);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RetencionesPorPagarPorRetencionesConstantesFunciones.getDetalleIndiceBusquedaRetencionesPorPagarPorRetenciones(id_ejercicioBusquedaRetencionesPorPagarPorRetenciones,id_periodoBusquedaRetencionesPorPagarPorRetenciones,es_debitoBusquedaRetencionesPorPagarPorRetenciones);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RetencionesPorPagarPorRetencionesConstantesFunciones.getDetalleIndiceBusquedaRetencionesPorPagarPorRetenciones(id_ejercicioBusquedaRetencionesPorPagarPorRetenciones,id_periodoBusquedaRetencionesPorPagarPorRetenciones,es_debitoBusquedaRetencionesPorPagarPorRetenciones);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness()==null||retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=retencionesporpagarporretencioness==null|| retencionesporpagarporretencioness.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						retencionesporpagarporretencionessAux=new ArrayList<RetencionesPorPagarPorRetenciones>();
						retencionesporpagarporretencionessAux.addAll(retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							retencionesporpagarporretencionessAux=new ArrayList<RetencionesPorPagarPorRetenciones>();
							retencionesporpagarporretencionessAux.addAll(retencionesporpagarporretencioness);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencionessBusquedaRetencionesPorPagarPorRetenciones(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_ejercicioBusquedaRetencionesPorPagarPorRetenciones,id_periodoBusquedaRetencionesPorPagarPorRetenciones,es_debitoBusquedaRetencionesPorPagarPorRetenciones);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RetencionesPorPagarPorRetencionesConstantesFunciones.getDetalleIndiceBusquedaRetencionesPorPagarPorRetenciones(id_ejercicioBusquedaRetencionesPorPagarPorRetenciones,id_periodoBusquedaRetencionesPorPagarPorRetenciones,es_debitoBusquedaRetencionesPorPagarPorRetenciones);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RetencionesPorPagarPorRetencionesConstantesFunciones.getDetalleIndiceBusquedaRetencionesPorPagarPorRetenciones(id_ejercicioBusquedaRetencionesPorPagarPorRetenciones,id_periodoBusquedaRetencionesPorPagarPorRetenciones,es_debitoBusquedaRetencionesPorPagarPorRetenciones);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteRetencionesPorPagarPorRetencioness("BusquedaRetencionesPorPagarPorRetenciones",retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteRetencionesPorPagarPorRetencioness("BusquedaRetencionesPorPagarPorRetenciones",retencionesporpagarporretencioness);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						retencionesporpagarporretencionesLogic.setRetencionesPorPagarPorRetencioness(new ArrayList<RetencionesPorPagarPorRetenciones>());
						retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness().addAll(retencionesporpagarporretencionessAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							retencionesporpagarporretencioness=new ArrayList<RetencionesPorPagarPorRetenciones>();
							retencionesporpagarporretencioness.addAll(retencionesporpagarporretencionessAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesRetencionesPorPagarPorRetenciones();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessRetencionesPorPagarPorRetenciones();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=retencionesporpagarporretencioness.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=retencionesporpagarporretencioness.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(RetencionesPorPagarPorRetenciones retencionesporpagarporretenciones) {
		Boolean permite=true;
		
		if(this.retencionesporpagarporretenciones.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=RetencionesPorPagarPorRetencionesConstantesFunciones.getOrderByListaRetencionesPorPagarPorRetenciones();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=RetencionesPorPagarPorRetencionesConstantesFunciones.getOrderByListaRetencionesPorPagarPorRetenciones();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(RetencionesPorPagarPorRetenciones retencionesporpagarporretenciones:retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness()) {
				if(retencionesporpagarporretenciones.getsType().equals(Constantes2.S_TOTALES)) {
					retencionesporpagarporretencionesTotales=retencionesporpagarporretenciones;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(RetencionesPorPagarPorRetenciones retencionesporpagarporretenciones:this.retencionesporpagarporretencioness) {
				if(retencionesporpagarporretenciones.getsType().equals(Constantes2.S_TOTALES)) {
					retencionesporpagarporretencionesTotales=retencionesporpagarporretenciones;
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
			this.retencionesporpagarporretencionesAux=new RetencionesPorPagarPorRetenciones();
			this.retencionesporpagarporretencionesAux.setsType(Constantes2.S_TOTALES);
			this.retencionesporpagarporretencionesAux.setIsNew(false);
			this.retencionesporpagarporretencionesAux.setIsChanged(false);
			this.retencionesporpagarporretencionesAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//RetencionesPorPagarPorRetencionesConstantesFunciones.TotalizarValoresFilaRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness(),this.retencionesporpagarporretencionesAux);
				
				//this.retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness().add(this.retencionesporpagarporretencionesAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				RetencionesPorPagarPorRetencionesConstantesFunciones.TotalizarValoresFilaRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretencioness,this.retencionesporpagarporretencionesAux);
				
				this.retencionesporpagarporretencioness.add(this.retencionesporpagarporretencionesAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		retencionesporpagarporretencionesTotales=new RetencionesPorPagarPorRetenciones();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness().remove(retencionesporpagarporretencionesTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.retencionesporpagarporretencioness.remove(retencionesporpagarporretencionesTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		retencionesporpagarporretencionesTotales=new RetencionesPorPagarPorRetenciones();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(RetencionesPorPagarPorRetenciones retencionesporpagarporretenciones:retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness()) {
				if(retencionesporpagarporretenciones.getsType().equals(Constantes2.S_TOTALES)) {
					retencionesporpagarporretencionesTotales=retencionesporpagarporretenciones;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				RetencionesPorPagarPorRetencionesConstantesFunciones.TotalizarValoresFilaRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness(),retencionesporpagarporretencionesTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(RetencionesPorPagarPorRetenciones retencionesporpagarporretenciones:this.retencionesporpagarporretencioness) {
				if(retencionesporpagarporretenciones.getsType().equals(Constantes2.S_TOTALES)) {
					retencionesporpagarporretencionesTotales=retencionesporpagarporretenciones;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				RetencionesPorPagarPorRetencionesConstantesFunciones.TotalizarValoresFilaRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretencioness,retencionesporpagarporretencionesTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getRetencionesPorPagarPorRetencionessBusquedaRetencionesPorPagarPorRetenciones()throws Exception {
		try {
			sAccionBusqueda="BusquedaRetencionesPorPagarPorRetenciones";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getRetencionesPorPagarPorRetencionessFK_IdEjercicio()throws Exception {
		try {
			sAccionBusqueda="FK_IdEjercicio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getRetencionesPorPagarPorRetencionessFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getRetencionesPorPagarPorRetencionessFK_IdPeriodo()throws Exception {
		try {
			sAccionBusqueda="FK_IdPeriodo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getRetencionesPorPagarPorRetencionessFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getRetencionesPorPagarPorRetencionessBusquedaRetencionesPorPagarPorRetenciones(String sFinalQuery,Long id_ejercicio,Long id_periodo,Boolean es_debito)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencionessBusquedaRetencionesPorPagarPorRetenciones(sFinalQuery,this.pagination,id_ejercicio,id_periodo,es_debito);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getRetencionesPorPagarPorRetencionessFK_IdEjercicio(String sFinalQuery,Long id_ejercicio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencionessFK_IdEjercicio(sFinalQuery,this.pagination,id_ejercicio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getRetencionesPorPagarPorRetencionessFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencionessFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getRetencionesPorPagarPorRetencionessFK_IdPeriodo(String sFinalQuery,Long id_periodo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencionessFK_IdPeriodo(sFinalQuery,this.pagination,id_periodo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getRetencionesPorPagarPorRetencionessFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencionessFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosRetencionesPorPagarPorRetenciones() {
		this.isPermisoTodoRetencionesPorPagarPorRetenciones=false;
		this.isPermisoNuevoRetencionesPorPagarPorRetenciones=false;
		this.isPermisoActualizarRetencionesPorPagarPorRetenciones=false;
		this.isPermisoActualizarOriginalRetencionesPorPagarPorRetenciones=false;
		this.isPermisoEliminarRetencionesPorPagarPorRetenciones=false;
		this.isPermisoGuardarCambiosRetencionesPorPagarPorRetenciones=false;
		this.isPermisoConsultaRetencionesPorPagarPorRetenciones=true;
		this.isPermisoBusquedaRetencionesPorPagarPorRetenciones=true;
		this.isPermisoReporteRetencionesPorPagarPorRetenciones=true;
		this.isPermisoOrdenRetencionesPorPagarPorRetenciones=false;		
		this.isPermisoPaginacionMedioRetencionesPorPagarPorRetenciones=false;		
		this.isPermisoPaginacionAltoRetencionesPorPagarPorRetenciones=false;		
		this.isPermisoPaginacionTodoRetencionesPorPagarPorRetenciones=false;		
		this.isPermisoCopiarRetencionesPorPagarPorRetenciones=false;		
		this.isPermisoVerFormRetencionesPorPagarPorRetenciones=false;		
		this.isPermisoDuplicarRetencionesPorPagarPorRetenciones=false;
		this.isPermisoOrdenRetencionesPorPagarPorRetenciones=false;
	}
	
	public void setPermisosUsuarioRetencionesPorPagarPorRetenciones(Boolean isPermiso) {
		this.isPermisoTodoRetencionesPorPagarPorRetenciones=isPermiso;
		this.isPermisoNuevoRetencionesPorPagarPorRetenciones=isPermiso;
		this.isPermisoActualizarRetencionesPorPagarPorRetenciones=isPermiso;
		this.isPermisoActualizarOriginalRetencionesPorPagarPorRetenciones=isPermiso;
		this.isPermisoEliminarRetencionesPorPagarPorRetenciones=isPermiso;
		this.isPermisoGuardarCambiosRetencionesPorPagarPorRetenciones=isPermiso;
		this.isPermisoConsultaRetencionesPorPagarPorRetenciones=isPermiso;
		this.isPermisoBusquedaRetencionesPorPagarPorRetenciones=isPermiso;
		this.isPermisoReporteRetencionesPorPagarPorRetenciones=isPermiso;
		this.isPermisoOrdenRetencionesPorPagarPorRetenciones=isPermiso;		
		this.isPermisoPaginacionMedioRetencionesPorPagarPorRetenciones=isPermiso;		
		this.isPermisoPaginacionAltoRetencionesPorPagarPorRetenciones=isPermiso;		
		this.isPermisoPaginacionTodoRetencionesPorPagarPorRetenciones=isPermiso;		
		this.isPermisoCopiarRetencionesPorPagarPorRetenciones=isPermiso;		
		this.isPermisoVerFormRetencionesPorPagarPorRetenciones=isPermiso;		
		this.isPermisoDuplicarRetencionesPorPagarPorRetenciones=isPermiso;
		this.isPermisoOrdenRetencionesPorPagarPorRetenciones=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioRetencionesPorPagarPorRetenciones(Boolean isPermiso) {
		//this.isPermisoTodoRetencionesPorPagarPorRetenciones=isPermiso;
		this.isPermisoNuevoRetencionesPorPagarPorRetenciones=isPermiso;
		this.isPermisoActualizarRetencionesPorPagarPorRetenciones=isPermiso;
		this.isPermisoActualizarOriginalRetencionesPorPagarPorRetenciones=isPermiso;
		this.isPermisoEliminarRetencionesPorPagarPorRetenciones=isPermiso;
		this.isPermisoGuardarCambiosRetencionesPorPagarPorRetenciones=isPermiso;
		//this.isPermisoConsultaRetencionesPorPagarPorRetenciones=isPermiso;
		//this.isPermisoBusquedaRetencionesPorPagarPorRetenciones=isPermiso;
		//this.isPermisoReporteRetencionesPorPagarPorRetenciones=isPermiso;
		//this.isPermisoOrdenRetencionesPorPagarPorRetenciones=isPermiso;		
		//this.isPermisoPaginacionMedioRetencionesPorPagarPorRetenciones=isPermiso;		
		//this.isPermisoPaginacionAltoRetencionesPorPagarPorRetenciones=isPermiso;		
		//this.isPermisoPaginacionTodoRetencionesPorPagarPorRetenciones=isPermiso;		
		//this.isPermisoCopiarRetencionesPorPagarPorRetenciones=isPermiso;		
		//this.isPermisoDuplicarRetencionesPorPagarPorRetenciones=isPermiso;
		//this.isPermisoOrdenRetencionesPorPagarPorRetenciones=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioRetencionesPorPagarPorRetencionesClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(RetencionesPorPagarPorRetencionesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebRetencionesPorPagarPorRetenciones(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioRetencionesPorPagarPorRetencionesClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioRetencionesPorPagarPorRetencionesClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionRetencionesPorPagarPorRetencionesClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioRetencionesPorPagarPorRetencionesClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioRetencionesPorPagarPorRetenciones() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(RetencionesPorPagarPorRetencionesJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, RetencionesPorPagarPorRetencionesConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoRetencionesPorPagarPorRetenciones=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarRetencionesPorPagarPorRetenciones=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalRetencionesPorPagarPorRetenciones=this.isPermisoActualizarRetencionesPorPagarPorRetenciones;
			this.isPermisoEliminarRetencionesPorPagarPorRetenciones=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosRetencionesPorPagarPorRetenciones=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaRetencionesPorPagarPorRetenciones=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaRetencionesPorPagarPorRetenciones=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoRetencionesPorPagarPorRetenciones=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteRetencionesPorPagarPorRetenciones=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenRetencionesPorPagarPorRetenciones=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioRetencionesPorPagarPorRetenciones=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoRetencionesPorPagarPorRetenciones=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoRetencionesPorPagarPorRetenciones=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarRetencionesPorPagarPorRetenciones=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormRetencionesPorPagarPorRetenciones=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarRetencionesPorPagarPorRetenciones=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenRetencionesPorPagarPorRetenciones=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosRetencionesPorPagarPorRetenciones.setToolTipText(this.jTableDatosRetencionesPorPagarPorRetenciones.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioRetencionesPorPagarPorRetenciones(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioRetencionesPorPagarPorRetenciones(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(RetencionesPorPagarPorRetencionesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(RetencionesPorPagarPorRetencionesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioRetencionesPorPagarPorRetenciones() throws Exception {
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
	public void inicializarCombosForeignKeyRetencionesPorPagarPorRetencionesListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.ejerciciosForeignKey=new ArrayList();
				this.periodosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyRetencionesPorPagarPorRetencionesListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(RetencionesPorPagarPorRetencionesJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEjercicioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyPeriodoListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	
	public void addItemDefectoCombosTodosForeignKeyRetencionesPorPagarPorRetenciones()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyEjercicio();
			this.addItemDefectoCombosForeignKeyPeriodo();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.retencionesporpagarporretencionesSessionBean==null) {
				this.retencionesporpagarporretencionesSessionBean=new RetencionesPorPagarPorRetencionesSessionBean();
			}

			if(!this.retencionesporpagarporretencionesSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.retencionesporpagarporretencionesSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

			if(!this.retencionesporpagarporretencionesSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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

			if(!this.retencionesporpagarporretencionesSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
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
	
	public void initActionsCombosTodosForeignKeyRetencionesPorPagarPorRetenciones()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyRetencionesPorPagarPorRetenciones(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyRetencionesPorPagarPorRetenciones()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyRetencionesPorPagarPorRetenciones();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyRetencionesPorPagarPorRetenciones(RetencionesPorPagarPorRetenciones retencionesporpagarporretenciones)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyRetencionesPorPagarPorRetenciones(RetencionesPorPagarPorRetenciones retencionesporpagarporretenciones,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyRetencionesPorPagarPorRetenciones()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyRetencionesPorPagarPorRetenciones()throws Exception {	
		try {
			

				if(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones!=null) {
					Ejercicio ejercicioActual=(Ejercicio)this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jComboBoxid_ejercicioRetencionesPorPagarPorRetenciones.getSelectedItem();
				}

				if(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones!=null) {
					Periodo periodoActual=(Periodo)this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jComboBoxid_periodoRetencionesPorPagarPorRetenciones.getSelectedItem();
				}
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyRetencionesPorPagarPorRetenciones()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyRetencionesPorPagarPorRetenciones()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroRetencionesPorPagarPorRetenciones()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyRetencionesPorPagarPorRetenciones()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameEjerciciosForeignKey("Todos");
			this.cargarCombosFramePeriodosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyRetencionesPorPagarPorRetenciones(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEjerciciosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFramePeriodosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyRetencionesPorPagarPorRetenciones()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jComboBoxid_empresaRetencionesPorPagarPorRetenciones!=null && this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jComboBoxid_empresaRetencionesPorPagarPorRetenciones.getItemCount()>0) {
				this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jComboBoxid_empresaRetencionesPorPagarPorRetenciones.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jComboBoxid_sucursalRetencionesPorPagarPorRetenciones!=null && this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jComboBoxid_sucursalRetencionesPorPagarPorRetenciones.getItemCount()>0) {
				this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jComboBoxid_sucursalRetencionesPorPagarPorRetenciones.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jComboBoxid_ejercicioRetencionesPorPagarPorRetenciones!=null && this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jComboBoxid_ejercicioRetencionesPorPagarPorRetenciones.getItemCount()>0) {
				this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jComboBoxid_ejercicioRetencionesPorPagarPorRetenciones.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jComboBoxid_periodoRetencionesPorPagarPorRetenciones!=null && this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jComboBoxid_periodoRetencionesPorPagarPorRetenciones.getItemCount()>0) {
				this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jComboBoxid_periodoRetencionesPorPagarPorRetenciones.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	








	
	

	public RetencionesPorPagarPorRetencionesBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public RetencionesPorPagarPorRetencionesBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public RetencionesPorPagarPorRetencionesBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.retencionesporpagarporretencionesSessionBean=new RetencionesPorPagarPorRetencionesSessionBean(); 
		this.retencionesporpagarporretencionesConstantesFunciones=new RetencionesPorPagarPorRetencionesConstantesFunciones(); 
		this.retencionesporpagarporretencionesBean=new RetencionesPorPagarPorRetenciones();//(this.retencionesporpagarporretencionesConstantesFunciones); 		
		this.retencionesporpagarporretencionesReturnGeneral=new RetencionesPorPagarPorRetencionesParameterReturnGeneral(); 
		
		this.retencionesporpagarporretencionesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.retencionesporpagarporretencionesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public RetencionesPorPagarPorRetencionesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public RetencionesPorPagarPorRetencionesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public RetencionesPorPagarPorRetencionesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessRetencionesPorPagarPorRetenciones(true);
			
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
			
			this.retencionesporpagarporretencionesConstantesFunciones=new RetencionesPorPagarPorRetencionesConstantesFunciones(); 
			this.retencionesporpagarporretencionesBean=new RetencionesPorPagarPorRetenciones();//this.retencionesporpagarporretencionesConstantesFunciones); 			
			this.retencionesporpagarporretencionesReturnGeneral=new RetencionesPorPagarPorRetencionesParameterReturnGeneral(); 
		
			RetencionesPorPagarPorRetencionesBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Retenciones Por Pagar Por Retenciones Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.retencionesporpagarporretenciones=new RetencionesPorPagarPorRetenciones();
			this.retencionesporpagarporretencioness = new ArrayList<RetencionesPorPagarPorRetenciones>();
			this.retencionesporpagarporretencionessAux = new ArrayList<RetencionesPorPagarPorRetenciones>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporretencionesLogic=new RetencionesPorPagarPorRetencionesLogic();
				this.retencionesporpagarporretencionesLogic.getNewConnexionToDeep("");
			}
			
			//this.retencionesporpagarporretencionesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.retencionesporpagarporretencionesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoRetencionesPorPagarPorRetenciones!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoRetencionesPorPagarPorRetenciones);	
					}
					
					if(this.jInternalFrameImportacionRetencionesPorPagarPorRetenciones!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionRetencionesPorPagarPorRetenciones);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByRetencionesPorPagarPorRetenciones!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByRetencionesPorPagarPorRetenciones);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones);
				this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.setVisible(false);
				this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoRetencionesPorPagarPorRetenciones!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoRetencionesPorPagarPorRetenciones);
					this.jInternalFrameReporteDinamicoRetencionesPorPagarPorRetenciones.setVisible(false);
					this.jInternalFrameReporteDinamicoRetencionesPorPagarPorRetenciones.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionRetencionesPorPagarPorRetenciones!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionRetencionesPorPagarPorRetenciones);
					this.jInternalFrameImportacionRetencionesPorPagarPorRetenciones.setVisible(false);
					this.jInternalFrameImportacionRetencionesPorPagarPorRetenciones.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByRetencionesPorPagarPorRetenciones!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByRetencionesPorPagarPorRetenciones);
					this.jInternalFrameOrderByRetencionesPorPagarPorRetenciones.setVisible(false);
					this.jInternalFrameOrderByRetencionesPorPagarPorRetenciones.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idRetencionesPorPagarPorRetencionesActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=RetencionesPorPagarPorRetencionesConstantesFunciones.INUMEROPAGINACION;
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
			
			this.retencionesporpagarporretencionesReturnGeneral=new RetencionesPorPagarPorRetencionesParameterReturnGeneral();
			
			this.retencionesporpagarporretencionesParameterGeneral=new RetencionesPorPagarPorRetencionesParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.retencionesporpagarporretencionesLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado()) {
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
			
			if(RetencionesPorPagarPorRetencionesJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,RetencionesPorPagarPorRetencionesConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado(),this.retencionesporpagarporretencionesSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,RetencionesPorPagarPorRetencionesConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado(),this.retencionesporpagarporretencionesSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoRetencionesPorPagarPorRetenciones=false;
			this.isVisibilidadCeldaDuplicarRetencionesPorPagarPorRetenciones=true;
			this.isVisibilidadCeldaCopiarRetencionesPorPagarPorRetenciones=true;
			this.isVisibilidadCeldaVerFormRetencionesPorPagarPorRetenciones=true;
			this.isVisibilidadCeldaOrdenRetencionesPorPagarPorRetenciones=true;
			this.isVisibilidadCeldaNuevoRelacionesRetencionesPorPagarPorRetenciones=false;
			this.isVisibilidadCeldaModificarRetencionesPorPagarPorRetenciones=false;
			this.isVisibilidadCeldaActualizarRetencionesPorPagarPorRetenciones=false;
			this.isVisibilidadCeldaEliminarRetencionesPorPagarPorRetenciones=false;
			this.isVisibilidadCeldaCancelarRetencionesPorPagarPorRetenciones=false;
			this.isVisibilidadCeldaGuardarRetencionesPorPagarPorRetenciones=false;
			this.isVisibilidadCeldaGuardarCambiosRetencionesPorPagarPorRetenciones=false;
			
			
			this.isVisibilidadBusquedaRetencionesPorPagarPorRetenciones=true;
			this.isVisibilidadFK_IdEjercicio=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdPeriodo=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesRetencionesPorPagarPorRetenciones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosRetencionesPorPagarPorRetenciones();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioRetencionesPorPagarPorRetenciones(false);
			
			this.setPermisosUsuarioRetencionesPorPagarPorRetenciones();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado() 
				|| (this.retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado() && this.retencionesporpagarporretencionesSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioRetencionesPorPagarPorRetencionesClasesRelacionadas();
			}
			
			if(this.retencionesporpagarporretencionesSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioRetencionesPorPagarPorRetencionesClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!RetencionesPorPagarPorRetencionesJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosRetencionesPorPagarPorRetenciones();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualRetencionesPorPagarPorRetenciones();
			}
			
			if(!this.isPermisoBusquedaRetencionesPorPagarPorRetenciones) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasRetencionesPorPagarPorRetenciones.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(RetencionesPorPagarPorRetencionesConstantesFunciones.getTiposSeleccionarRetencionesPorPagarPorRetenciones());
				
				this.tiposColumnasSelect=RetencionesPorPagarPorRetencionesConstantesFunciones.getTiposSeleccionarRetencionesPorPagarPorRetenciones(true);
				
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
			//if(!this.retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioRetencionesPorPagarPorRetenciones();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioRetencionesPorPagarPorRetenciones(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioRetencionesPorPagarPorRetenciones(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesRetencionesPorPagarPorRetenciones() ;
			
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
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				retencionesporpagarporretencionesImplementable= (RetencionesPorPagarPorRetencionesImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+RetencionesPorPagarPorRetencionesConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				retencionesporpagarporretencionesImplementableHome= (RetencionesPorPagarPorRetencionesImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+RetencionesPorPagarPorRetencionesConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.retencionesporpagarporretencioness= new ArrayList<RetencionesPorPagarPorRetenciones>();
			this.retencionesporpagarporretencionessEliminados= new ArrayList<RetencionesPorPagarPorRetenciones>();
						
			this.isEsNuevoRetencionesPorPagarPorRetenciones=false;
			this.esParaAccionDesdeFormularioRetencionesPorPagarPorRetenciones=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>() ;
			this.periodosForeignKey=new ArrayList<Periodo>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyRetencionesPorPagarPorRetenciones(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroRetencionesPorPagarPorRetenciones();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			RetencionesPorPagarPorRetencionesBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=RetencionesPorPagarPorRetencionesConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesRetencionesPorPagarPorRetenciones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingRetencionesPorPagarPorRetenciones(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioRetencionesPorPagarPorRetenciones();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioRetencionesPorPagarPorRetenciones();
			}
			
			RetencionesPorPagarPorRetencionesBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasRetencionesPorPagarPorRetenciones.getTabCount(); i++) {
					this.jTabbedPaneBusquedasRetencionesPorPagarPorRetenciones.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasRetencionesPorPagarPorRetenciones.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporretencionesLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessRetencionesPorPagarPorRetenciones(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga RetencionesPorPagarPorRetenciones: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporretencionesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporretencionesLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectRetencionesPorPagarPorRetenciones() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesRetencionesPorPagarPorRetenciones")) {
				iIndex=this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTabbedPaneRelacionesRetencionesPorPagarPorRetenciones.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTabbedPaneRelacionesRetencionesPorPagarPorRetenciones.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosRetencionesPorPagarPorRetenciones.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessRetencionesPorPagarPorRetenciones();	
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
	
	public void cargarCombosForeignKeyRetencionesPorPagarPorRetenciones(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyRetencionesPorPagarPorRetenciones(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyRetencionesPorPagarPorRetenciones(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyRetencionesPorPagarPorRetencionesListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyRetencionesPorPagarPorRetenciones();
		
		this.cargarCombosFrameForeignKeyRetencionesPorPagarPorRetenciones();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyRetencionesPorPagarPorRetenciones();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyRetencionesPorPagarPorRetenciones();
		}
	}
	
	
	
	public void jButtonNuevoRetencionesPorPagarPorRetencionesActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.retencionesporpagarporretencionesSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			RetencionesPorPagarPorRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.retencionesporpagarporretenciones,new Object(),this.retencionesporpagarporretencionesParameterGeneral,this.retencionesporpagarporretencionesReturnGeneral);
			
			
			if(jTableDatosRetencionesPorPagarPorRetenciones.getRowCount()>=1) {
				jTableDatosRetencionesPorPagarPorRetenciones.removeRowSelectionInterval(0, jTableDatosRetencionesPorPagarPorRetenciones.getRowCount()-1);						
			}
			
			this.isEsNuevoRetencionesPorPagarPorRetenciones=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoRetencionesPorPagarPorRetenciones(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesRetencionesPorPagarPorRetenciones(true);			
			//this.retencionesporpagarporretenciones=new RetencionesPorPagarPorRetenciones();
			//this.retencionesporpagarporretenciones.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesRetencionesPorPagarPorRetenciones(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualRetencionesPorPagarPorRetenciones() ;
			
			if(RetencionesPorPagarPorRetencionesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleRetencionesPorPagarPorRetenciones(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.retencionesporpagarporretenciones);	
			this.actualizarInformacion("INFO_PADRE",false,this.retencionesporpagarporretenciones);				
			
			RetencionesPorPagarPorRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.retencionesporpagarporretenciones,new Object(),this.retencionesporpagarporretencionesParameterGeneral,this.retencionesporpagarporretencionesReturnGeneral);
			
			if(this.retencionesporpagarporretencionesSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar RetencionesPorPagarPorRetenciones: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			RetencionesPorPagarPorRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.retencionesporpagarporretenciones,new Object(),this.retencionesporpagarporretencionesParameterGeneral,this.retencionesporpagarporretencionesReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarRetencionesPorPagarPorRetencionesActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<RetencionesPorPagarPorRetenciones> retencionesporpagarporretencionessSeleccionados=new ArrayList<RetencionesPorPagarPorRetenciones>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosRetencionesPorPagarPorRetenciones.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosRetencionesPorPagarPorRetenciones.getSelectedRows().length;			
			}
			
			retencionesporpagarporretencionessSeleccionados=this.getRetencionesPorPagarPorRetencionessSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoRetencionesPorPagarPorRetenciones--;			
				//RetencionesPorPagarPorRetenciones retencionesporpagarporretencionesAux= new RetencionesPorPagarPorRetenciones();			
				//retencionesporpagarporretencionesAux.setId(this.iIdNuevoRetencionesPorPagarPorRetenciones);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//RetencionesPorPagarPorRetenciones retencionesporpagarporretencionesOrigen=new RetencionesPorPagarPorRetenciones();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(RetencionesPorPagarPorRetenciones retencionesporpagarporretencionesOrigen : retencionesporpagarporretencionessSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosRetencionesPorPagarPorRetenciones.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							retencionesporpagarporretencionesOrigen =(RetencionesPorPagarPorRetenciones) this.retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness().toArray()[this.jTableDatosRetencionesPorPagarPorRetenciones.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							retencionesporpagarporretencionesOrigen =(RetencionesPorPagarPorRetenciones) this.retencionesporpagarporretencioness.toArray()[this.jTableDatosRetencionesPorPagarPorRetenciones.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaRetencionesPorPagarPorRetenciones();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.retencionesporpagarporretenciones.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosRetencionesPorPagarPorRetenciones(retencionesporpagarporretencionesOrigen,this.retencionesporpagarporretenciones,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretenciones);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness().add(this.retencionesporpagarporretencionesAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.retencionesporpagarporretencioness.add(this.retencionesporpagarporretencionesAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaRetencionesPorPagarPorRetenciones(false);
				
				this.jTableDatosRetencionesPorPagarPorRetenciones.setRowSelectionInterval(this.getIndiceNuevoRetencionesPorPagarPorRetenciones(), this.getIndiceNuevoRetencionesPorPagarPorRetenciones());
				
				int iLastRow =  this.jTableDatosRetencionesPorPagarPorRetenciones.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosRetencionesPorPagarPorRetenciones.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosRetencionesPorPagarPorRetenciones.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaRetencionesPorPagarPorRetenciones(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarRetencionesPorPagarPorRetencionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<RetencionesPorPagarPorRetenciones> retencionesporpagarporretencionessSeleccionados=new ArrayList<RetencionesPorPagarPorRetenciones>();									
		
			RetencionesPorPagarPorRetenciones retencionesporpagarporretencionesOrigen=new RetencionesPorPagarPorRetenciones();
			RetencionesPorPagarPorRetenciones retencionesporpagarporretencionesDestino=new RetencionesPorPagarPorRetenciones();
				
			retencionesporpagarporretencionessSeleccionados=this.getRetencionesPorPagarPorRetencionessSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosRetencionesPorPagarPorRetenciones.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || retencionesporpagarporretencionessSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosRetencionesPorPagarPorRetenciones.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						retencionesporpagarporretencionesOrigen =(RetencionesPorPagarPorRetenciones) this.retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness().toArray()[this.jTableDatosRetencionesPorPagarPorRetenciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						retencionesporpagarporretencionesOrigen =(RetencionesPorPagarPorRetenciones) this.retencionesporpagarporretencioness.toArray()[this.jTableDatosRetencionesPorPagarPorRetenciones.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						retencionesporpagarporretencionesDestino =(RetencionesPorPagarPorRetenciones) this.retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness().toArray()[this.jTableDatosRetencionesPorPagarPorRetenciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						retencionesporpagarporretencionesDestino =(RetencionesPorPagarPorRetenciones) this.retencionesporpagarporretencioness.toArray()[this.jTableDatosRetencionesPorPagarPorRetenciones.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				retencionesporpagarporretencionesOrigen =retencionesporpagarporretencionessSeleccionados.get(0);
				retencionesporpagarporretencionesDestino =retencionesporpagarporretencionessSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosRetencionesPorPagarPorRetenciones(retencionesporpagarporretencionesOrigen,retencionesporpagarporretencionesDestino,true,false);
				
				retencionesporpagarporretencionesDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(retencionesporpagarporretencionesDestino,retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(retencionesporpagarporretencionesDestino,retencionesporpagarporretencioness);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaRetencionesPorPagarPorRetenciones(false);
				
				//this.jTableDatosRetencionesPorPagarPorRetenciones.setRowSelectionInterval(this.getIndiceNuevoRetencionesPorPagarPorRetenciones(), this.getIndiceNuevoRetencionesPorPagarPorRetenciones());
				
				int iLastRow =  this.jTableDatosRetencionesPorPagarPorRetenciones.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosRetencionesPorPagarPorRetenciones.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosRetencionesPorPagarPorRetenciones.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaRetencionesPorPagarPorRetenciones(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormRetencionesPorPagarPorRetencionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarRetencionesPorPagarPorRetencionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesRetencionesPorPagarPorRetenciones.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasRetencionesPorPagarPorRetenciones.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesRetencionesPorPagarPorRetenciones.setVisible(!isVisible);
			this.jPanelPaginacionRetencionesPorPagarPorRetenciones.setVisible(!isVisible);
			this.jPanelAccionesRetencionesPorPagarPorRetenciones.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarRetencionesPorPagarPorRetencionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameRetencionesPorPagarPorRetenciones();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoRetencionesPorPagarPorRetencionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoRetencionesPorPagarPorRetenciones();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionRetencionesPorPagarPorRetencionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionRetencionesPorPagarPorRetenciones();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByRetencionesPorPagarPorRetencionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByRetencionesPorPagarPorRetenciones();
			
			this.abrirFrameOrderByRetencionesPorPagarPorRetenciones();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByRetencionesPorPagarPorRetencionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByRetencionesPorPagarPorRetenciones();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleRetencionesPorPagarPorRetenciones(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.isMaximum()) {
					this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.setSize(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.iWidthFormulario,this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.isMaximum()) {
						this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jContentPaneDetalleRetencionesPorPagarPorRetenciones.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTabbedPaneRelacionesRetencionesPorPagarPorRetenciones.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jContentPaneDetalleRetencionesPorPagarPorRetenciones.getWidth(),RetencionesPorPagarPorRetencionesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTabbedPaneRelacionesRetencionesPorPagarPorRetenciones.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jContentPaneDetalleRetencionesPorPagarPorRetenciones.getWidth(),RetencionesPorPagarPorRetencionesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTabbedPaneRelacionesRetencionesPorPagarPorRetenciones.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jContentPaneDetalleRetencionesPorPagarPorRetenciones.getWidth(),RetencionesPorPagarPorRetencionesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.setVisible(true);
	        this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByRetencionesPorPagarPorRetenciones() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByRetencionesPorPagarPorRetenciones==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByRetencionesPorPagarPorRetenciones=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRetencionesPorPagarPorRetenciones,false,this);
				} else {
					this.jInternalFrameOrderByRetencionesPorPagarPorRetenciones=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRetencionesPorPagarPorRetenciones,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByRetencionesPorPagarPorRetenciones);
				this.jInternalFrameOrderByRetencionesPorPagarPorRetenciones.setVisible(false);
				this.jInternalFrameOrderByRetencionesPorPagarPorRetenciones.setSelected(false);
				
				this.jInternalFrameOrderByRetencionesPorPagarPorRetenciones.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByRetencionesPorPagarPorRetenciones"));
				
				this.inicializarActualizarBindingTablaOrderByRetencionesPorPagarPorRetenciones();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionRetencionesPorPagarPorRetenciones() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionRetencionesPorPagarPorRetenciones==null) {
				
				this.jInternalFrameImportacionRetencionesPorPagarPorRetenciones=new ImportacionJInternalFrame(RetencionesPorPagarPorRetencionesConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionRetencionesPorPagarPorRetenciones);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionRetencionesPorPagarPorRetenciones);
				this.jInternalFrameImportacionRetencionesPorPagarPorRetenciones.setVisible(false);
				this.jInternalFrameImportacionRetencionesPorPagarPorRetenciones.setSelected(false);


				this.jInternalFrameImportacionRetencionesPorPagarPorRetenciones.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionRetencionesPorPagarPorRetenciones"));
				this.jInternalFrameImportacionRetencionesPorPagarPorRetenciones.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionRetencionesPorPagarPorRetenciones"));
				this.jInternalFrameImportacionRetencionesPorPagarPorRetenciones.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionRetencionesPorPagarPorRetenciones"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoRetencionesPorPagarPorRetenciones() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoRetencionesPorPagarPorRetenciones==null) {
				this.jInternalFrameReporteDinamicoRetencionesPorPagarPorRetenciones=new ReporteDinamicoJInternalFrame(RetencionesPorPagarPorRetencionesConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoRetencionesPorPagarPorRetenciones);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoRetencionesPorPagarPorRetenciones);
				this.jInternalFrameReporteDinamicoRetencionesPorPagarPorRetenciones.setVisible(false);
				this.jInternalFrameReporteDinamicoRetencionesPorPagarPorRetenciones.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoRetencionesPorPagarPorRetenciones.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoRetencionesPorPagarPorRetenciones"));
				this.jInternalFrameReporteDinamicoRetencionesPorPagarPorRetenciones.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoRetencionesPorPagarPorRetenciones"));
				this.jInternalFrameReporteDinamicoRetencionesPorPagarPorRetenciones.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoRetencionesPorPagarPorRetenciones"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualRetencionesPorPagarPorRetenciones();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleRetencionesPorPagarPorRetenciones() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones);
			
	       	this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.setVisible(false);
	        this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.setSelected(false);
			
			//this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.dispose();
			//this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoRetencionesPorPagarPorRetenciones() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoRetencionesPorPagarPorRetenciones.setVisible(true);
	        this.jInternalFrameReporteDinamicoRetencionesPorPagarPorRetenciones.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionRetencionesPorPagarPorRetenciones() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionRetencionesPorPagarPorRetenciones.setVisible(true);
	        this.jInternalFrameImportacionRetencionesPorPagarPorRetenciones.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByRetencionesPorPagarPorRetenciones() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByRetencionesPorPagarPorRetenciones.setVisible(true);
	        this.jInternalFrameOrderByRetencionesPorPagarPorRetenciones.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByRetencionesPorPagarPorRetenciones() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByRetencionesPorPagarPorRetenciones.setVisible(false);
	        this.jInternalFrameOrderByRetencionesPorPagarPorRetenciones.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoRetencionesPorPagarPorRetenciones() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoRetencionesPorPagarPorRetenciones.setVisible(false);
	        this.jInternalFrameReporteDinamicoRetencionesPorPagarPorRetenciones.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionRetencionesPorPagarPorRetenciones() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionRetencionesPorPagarPorRetenciones.setVisible(false);
	        this.jInternalFrameImportacionRetencionesPorPagarPorRetenciones.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarRetencionesPorPagarPorRetencionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarRetencionesPorPagarPorRetenciones(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarRetencionesPorPagarPorRetenciones(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosRetencionesPorPagarPorRetenciones.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesRetencionesPorPagarPorRetenciones(true);
			//this.isEsNuevoRetencionesPorPagarPorRetenciones=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporretenciones =(RetencionesPorPagarPorRetenciones) this.retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness().toArray()[this.jTableDatosRetencionesPorPagarPorRetenciones.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.retencionesporpagarporretenciones =(RetencionesPorPagarPorRetenciones) this.retencionesporpagarporretencioness.toArray()[this.jTableDatosRetencionesPorPagarPorRetenciones.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesRetencionesPorPagarPorRetenciones("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesRetencionesPorPagarPorRetenciones(false) ;
			
			if(retencionesporpagarporretencionesSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(RetencionesPorPagarPorRetencionesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleRetencionesPorPagarPorRetenciones(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualRetencionesPorPagarPorRetenciones(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaRetencionesPorPagarPorRetencionesActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosRetencionesPorPagarPorRetenciones.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretenciones =(RetencionesPorPagarPorRetenciones) this.retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness().toArray()[this.jTableDatosRetencionesPorPagarPorRetenciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.retencionesporpagarporretenciones =(RetencionesPorPagarPorRetenciones) this.retencionesporpagarporretencioness.toArray()[this.jTableDatosRetencionesPorPagarPorRetenciones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarRetencionesPorPagarPorRetenciones(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosRetencionesPorPagarPorRetenciones.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesRetencionesPorPagarPorRetenciones(true);
			//this.isEsNuevoRetencionesPorPagarPorRetenciones=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporretenciones =(RetencionesPorPagarPorRetenciones) this.retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness().toArray()[this.jTableDatosRetencionesPorPagarPorRetenciones.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.retencionesporpagarporretenciones =(RetencionesPorPagarPorRetenciones) this.retencionesporpagarporretencioness.toArray()[this.jTableDatosRetencionesPorPagarPorRetenciones.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.retencionesporpagarporretenciones.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesRetencionesPorPagarPorRetenciones("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesRetencionesPorPagarPorRetenciones(false) ;
			
			if(RetencionesPorPagarPorRetencionesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleRetencionesPorPagarPorRetenciones(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualRetencionesPorPagarPorRetenciones(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
					
	
	
	public void jButtonActualizarRetencionesPorPagarPorRetencionesActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporretencionesLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesRetencionesPorPagarPorRetenciones(false);
			
			//if(!this.isEsNuevoRetencionesPorPagarPorRetenciones) {								
				int intSelectedRow = this.jTableDatosRetencionesPorPagarPorRetenciones.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretenciones =(RetencionesPorPagarPorRetenciones) this.retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness().toArray()[this.jTableDatosRetencionesPorPagarPorRetenciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.retencionesporpagarporretenciones =(RetencionesPorPagarPorRetenciones) this.retencionesporpagarporretencioness.toArray()[this.jTableDatosRetencionesPorPagarPorRetenciones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(RetencionesPorPagarPorRetencionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretenciones,true);
				this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretenciones);
				
			}
			
			if(this.permiteMantenimiento(this.retencionesporpagarporretenciones)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoRetencionesPorPagarPorRetenciones=true;
					this.inicializarActualizarBindingTablaRetencionesPorPagarPorRetenciones(false);
					this.isEsNuevoRetencionesPorPagarPorRetenciones=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoRetencionesPorPagarPorRetenciones=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoRetencionesPorPagarPorRetenciones=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesRetencionesPorPagarPorRetenciones(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualRetencionesPorPagarPorRetenciones(false);
				
				this.habilitarDeshabilitarControlesRetencionesPorPagarPorRetenciones(false);
			
												
				
				if(RetencionesPorPagarPorRetencionesJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleRetencionesPorPagarPorRetenciones();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoRetencionesPorPagarPorRetencionesActionPerformed(evt,retencionesporpagarporretencionesSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretenciones,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosRetencionesPorPagarPorRetenciones.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,retencionesporpagarporretencionesSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporretencionesLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.retencionesporpagarporretenciones.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(RetencionesPorPagarPorRetenciones.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RetencionesPorPagarPorRetenciones.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporretencionesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporretencionesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarRetencionesPorPagarPorRetencionesActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporretencionesLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosRetencionesPorPagarPorRetenciones.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporretenciones =(RetencionesPorPagarPorRetenciones) this.retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness().toArray()[this.jTableDatosRetencionesPorPagarPorRetenciones.convertRowIndexToModel(intSelectedRow)];
				this.retencionesporpagarporretenciones.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.retencionesporpagarporretenciones =(RetencionesPorPagarPorRetenciones) this.retencionesporpagarporretencioness.toArray()[this.jTableDatosRetencionesPorPagarPorRetenciones.convertRowIndexToModel(intSelectedRow)];
				this.retencionesporpagarporretenciones.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.retencionesporpagarporretenciones)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((RetencionesPorPagarPorRetencionesModel) this.jTableDatosRetencionesPorPagarPorRetenciones.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoRetencionesPorPagarPorRetenciones=true;
				this.inicializarActualizarBindingTablaRetencionesPorPagarPorRetenciones(false);
				this.isEsNuevoRetencionesPorPagarPorRetenciones=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesRetencionesPorPagarPorRetenciones(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualRetencionesPorPagarPorRetenciones(false);
				
				this.habilitarDeshabilitarControlesRetencionesPorPagarPorRetenciones(false);
				
				
				
				if(RetencionesPorPagarPorRetencionesJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleRetencionesPorPagarPorRetenciones();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporretencionesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporretencionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporretencionesLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarRetencionesPorPagarPorRetencionesActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosRetencionesPorPagarPorRetenciones.getRowCount()>=1) {
				jTableDatosRetencionesPorPagarPorRetenciones.removeRowSelectionInterval(0, jTableDatosRetencionesPorPagarPorRetenciones.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesRetencionesPorPagarPorRetenciones(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaRetencionesPorPagarPorRetenciones(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesRetencionesPorPagarPorRetenciones(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualRetencionesPorPagarPorRetenciones(false) ;
			
			this.isEsNuevoRetencionesPorPagarPorRetenciones=false;
			
			if(RetencionesPorPagarPorRetencionesJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleRetencionesPorPagarPorRetenciones();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosRetencionesPorPagarPorRetencionesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporretencionesLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingRetencionesPorPagarPorRetenciones(false);
				
				//SI ES MANUAL
				if(RetencionesPorPagarPorRetencionesJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualRetencionesPorPagarPorRetenciones();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporretencionesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporretencionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporretencionesLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosRetencionesPorPagarPorRetencionesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoRetencionesPorPagarPorRetenciones--;			
			//RetencionesPorPagarPorRetenciones retencionesporpagarporretencionesAux= new RetencionesPorPagarPorRetenciones();			
			//retencionesporpagarporretencionesAux.setId(this.iIdNuevoRetencionesPorPagarPorRetenciones);
			
			if(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaRetencionesPorPagarPorRetenciones();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretenciones);
			
			this.retencionesporpagarporretenciones.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness().add(this.retencionesporpagarporretencionesAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.retencionesporpagarporretencioness.add(this.retencionesporpagarporretencionesAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaRetencionesPorPagarPorRetenciones(false);
			
			this.jTableDatosRetencionesPorPagarPorRetenciones.setRowSelectionInterval(this.getIndiceNuevoRetencionesPorPagarPorRetenciones(), this.getIndiceNuevoRetencionesPorPagarPorRetenciones());
			
			int iLastRow =  this.jTableDatosRetencionesPorPagarPorRetenciones.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosRetencionesPorPagarPorRetenciones.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosRetencionesPorPagarPorRetenciones.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaRetencionesPorPagarPorRetenciones(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionRetencionesPorPagarPorRetencionesActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporretencionesLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingRetencionesPorPagarPorRetenciones(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingRetencionesPorPagarPorRetenciones(false);
			
			//SI ES MANUAL
			if(RetencionesPorPagarPorRetencionesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualRetencionesPorPagarPorRetenciones();
			}
			
			//this.abrirFrameTreeRetencionesPorPagarPorRetenciones();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporretencionesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporretencionesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporretencionesLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionRetencionesPorPagarPorRetencionesActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionRetencionesPorPagarPorRetencionesActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionRetencionesPorPagarPorRetenciones.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionRetencionesPorPagarPorRetenciones.setFileImportacion(this.jInternalFrameImportacionRetencionesPorPagarPorRetenciones.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionRetencionesPorPagarPorRetenciones.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionRetencionesPorPagarPorRetenciones.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionRetencionesPorPagarPorRetenciones.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionRetencionesPorPagarPorRetenciones.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoRetencionesPorPagarPorRetencionesActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<RetencionesPorPagarPorRetenciones> retencionesporpagarporretencionessSeleccionados=new ArrayList<RetencionesPorPagarPorRetenciones>();		

		retencionesporpagarporretencionessSeleccionados=this.getRetencionesPorPagarPorRetencionessSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoRetencionesPorPagarPorRetenciones.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoRetencionesPorPagarPorRetenciones.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("RetencionesPorPagarPorRetencionesBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"RetencionesPorPagarPorRetencionesBaseDesign.jrxml";
			
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
			
			this.generarReporteRetencionesPorPagarPorRetencioness("Todos",retencionesporpagarporretencionessSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Retenciones Por Pagar Por Retenciones",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoRetencionesPorPagarPorRetenciones.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoRetencionesPorPagarPorRetenciones.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_FECHAEMISION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaEmision_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaEmision_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaEmision_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaEmision_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBRETIPOMOVIMIENTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreTipoMovimiento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreTipoMovimiento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreTipoMovimiento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreTipoMovimiento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NUMEROMAYOR:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroMayor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroMayor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroMayor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroMayor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBRECUENTACONTABLERETENCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCuentaContableRetencion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCuentaContableRetencion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCuentaContableRetencion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCuentaContableRetencion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroPreImpresoFactura_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroPreImpresoFactura_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroPreImpresoFactura_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroPreImpresoFactura_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_PORCENTAJE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rcentaje_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rcentaje_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rcentaje_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rcentaje_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_BASEIMPONIBLE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_seImponible_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_seImponible_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_seImponible_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_seImponible_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_VALOR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NUMERO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mero_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mero_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mero_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mero_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBREBENEF:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreBenef_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreBenef_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreBenef_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreBenef_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_RUCBENEF:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cBenef_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cBenef_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cBenef_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cBenef_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBRECUENTACONTABLE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCuentaContable_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCuentaContable_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCuentaContable_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCuentaContable_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBRECUENTACONTABLECREDITO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCuentaContableCredito_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCuentaContableCredito_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCuentaContableCredito_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCuentaContableCredito_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_ESDEBITODATO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_DebitoDato_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_DebitoDato_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_DebitoDato_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_DebitoDato_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoRetencionesPorPagarPorRetenciones.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoRetencionesPorPagarPorRetenciones.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoRetencionesPorPagarPorRetenciones.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoria="fecha_emision";
					break;

				case RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBRETIPOMOVIMIENTO:
					sNombreCampoCategoria="nombre_tipo_movimiento";
					break;

				case RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NUMEROMAYOR:
					sNombreCampoCategoria="numero_mayor";
					break;

				case RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBRECUENTACONTABLERETENCION:
					sNombreCampoCategoria="nombre_cuenta_contable_retencion";
					break;

				case RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA:
					sNombreCampoCategoria="numero_pre_impreso_factura";
					break;

				case RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoria="porcentaje";
					break;

				case RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_BASEIMPONIBLE:
					sNombreCampoCategoria="base_imponible";
					break;

				case RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoria="valor";
					break;

				case RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NUMERO:
					sNombreCampoCategoria="numero";
					break;

				case RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBREBENEF:
					sNombreCampoCategoria="nombre_benef";
					break;

				case RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_RUCBENEF:
					sNombreCampoCategoria="ruc_benef";
					break;

				case RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBRECUENTACONTABLE:
					sNombreCampoCategoria="nombre_cuenta_contable";
					break;

				case RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBRECUENTACONTABLECREDITO:
					sNombreCampoCategoria="nombre_cuenta_contable_credito";
					break;

				case RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_ESDEBITODATO:
					sNombreCampoCategoria="es_debito_dato";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoRetencionesPorPagarPorRetenciones.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoriaValor="fecha_emision";
					break;

				case RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBRETIPOMOVIMIENTO:
					sNombreCampoCategoriaValor="nombre_tipo_movimiento";
					break;

				case RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NUMEROMAYOR:
					sNombreCampoCategoriaValor="numero_mayor";
					break;

				case RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBRECUENTACONTABLERETENCION:
					sNombreCampoCategoriaValor="nombre_cuenta_contable_retencion";
					break;

				case RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA:
					sNombreCampoCategoriaValor="numero_pre_impreso_factura";
					break;

				case RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoriaValor="porcentaje";
					break;

				case RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_BASEIMPONIBLE:
					sNombreCampoCategoriaValor="base_imponible";
					break;

				case RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoriaValor="valor";
					break;

				case RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NUMERO:
					sNombreCampoCategoriaValor="numero";
					break;

				case RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBREBENEF:
					sNombreCampoCategoriaValor="nombre_benef";
					break;

				case RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_RUCBENEF:
					sNombreCampoCategoriaValor="ruc_benef";
					break;

				case RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBRECUENTACONTABLE:
					sNombreCampoCategoriaValor="nombre_cuenta_contable";
					break;

				case RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBRECUENTACONTABLECREDITO:
					sNombreCampoCategoriaValor="nombre_cuenta_contable_credito";
					break;

				case RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_ESDEBITODATO:
					sNombreCampoCategoriaValor="es_debito_dato";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoRetencionesPorPagarPorRetenciones.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoRetencionesPorPagarPorRetenciones.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_FECHAEMISION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Emision",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_emision");
					break;

				case RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBRETIPOMOVIMIENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Tipo Movimiento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_tipo_movimiento");
					break;

				case RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NUMEROMAYOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Mayor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_mayor");
					break;

				case RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBRECUENTACONTABLERETENCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Cuenta Contable Retencion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_cuenta_contable_retencion");
					break;

				case RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Pre Impreso Factura",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_pre_impreso_factura");
					break;

				case RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_PORCENTAJE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Porcentaje",sNombreCampoCategoria,sNombreCampoCategoriaValor,"porcentaje");
					break;

				case RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_BASEIMPONIBLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Base Imponible",sNombreCampoCategoria,sNombreCampoCategoriaValor,"base_imponible");
					break;

				case RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_VALOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor");
					break;

				case RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NUMERO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero");
					break;

				case RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBREBENEF:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Benef",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_benef");
					break;

				case RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_RUCBENEF:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ruc Benef",sNombreCampoCategoria,sNombreCampoCategoriaValor,"ruc_benef");
					break;

				case RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBRECUENTACONTABLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Cuenta Contable",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_cuenta_contable");
					break;

				case RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBRECUENTACONTABLECREDITO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Cuenta Contable Credito",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_cuenta_contable_credito");
					break;

				case RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_ESDEBITODATO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Es Debito Dato",sNombreCampoCategoria,sNombreCampoCategoriaValor,"es_debito_dato");
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
	
	public void jButtonGenerarExcelReporteDinamicoRetencionesPorPagarPorRetencionesActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<RetencionesPorPagarPorRetenciones> retencionesporpagarporretencionessSeleccionados=new ArrayList<RetencionesPorPagarPorRetenciones>();		
		
		retencionesporpagarporretencionessSeleccionados=this.getRetencionesPorPagarPorRetencionessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"retencionesporpagarporretenciones";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("RetencionesPorPagarPorRetencioness");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoRetencionesPorPagarPorRetenciones.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoRetencionesPorPagarPorRetenciones.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(RetencionesPorPagarPorRetenciones retencionesporpagarporretenciones:retencionesporpagarporretencionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(retencionesporpagarporretenciones.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(RetencionesPorPagarPorRetenciones retencionesporpagarporretenciones:retencionesporpagarporretencionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(retencionesporpagarporretenciones.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_IDEJERCICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_IDEJERCICIO);
					iRow++;

					for(RetencionesPorPagarPorRetenciones retencionesporpagarporretenciones:retencionesporpagarporretencionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(retencionesporpagarporretenciones.getejercicio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_IDPERIODO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_IDPERIODO);
					iRow++;

					for(RetencionesPorPagarPorRetenciones retencionesporpagarporretenciones:retencionesporpagarporretencionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(retencionesporpagarporretenciones.getperiodo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_ESDEBITO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_ESDEBITO);
					iRow++;

					for(RetencionesPorPagarPorRetenciones retencionesporpagarporretenciones:retencionesporpagarporretencionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(retencionesporpagarporretenciones.getes_debito());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_FECHAEMISION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_FECHAEMISION);
					iRow++;

					for(RetencionesPorPagarPorRetenciones retencionesporpagarporretenciones:retencionesporpagarporretencionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(retencionesporpagarporretenciones.getfecha_emision());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBRETIPOMOVIMIENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBRETIPOMOVIMIENTO);
					iRow++;

					for(RetencionesPorPagarPorRetenciones retencionesporpagarporretenciones:retencionesporpagarporretencionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(retencionesporpagarporretenciones.getnombre_tipo_movimiento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NUMEROMAYOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NUMEROMAYOR);
					iRow++;

					for(RetencionesPorPagarPorRetenciones retencionesporpagarporretenciones:retencionesporpagarporretencionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(retencionesporpagarporretenciones.getnumero_mayor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBRECUENTACONTABLERETENCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBRECUENTACONTABLERETENCION);
					iRow++;

					for(RetencionesPorPagarPorRetenciones retencionesporpagarporretenciones:retencionesporpagarporretencionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(retencionesporpagarporretenciones.getnombre_cuenta_contable_retencion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA);
					iRow++;

					for(RetencionesPorPagarPorRetenciones retencionesporpagarporretenciones:retencionesporpagarporretencionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(retencionesporpagarporretenciones.getnumero_pre_impreso_factura());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_PORCENTAJE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_PORCENTAJE);
					iRow++;

					for(RetencionesPorPagarPorRetenciones retencionesporpagarporretenciones:retencionesporpagarporretencionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(retencionesporpagarporretenciones.getporcentaje());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_BASEIMPONIBLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_BASEIMPONIBLE);
					iRow++;

					for(RetencionesPorPagarPorRetenciones retencionesporpagarporretenciones:retencionesporpagarporretencionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(retencionesporpagarporretenciones.getbase_imponible());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_VALOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_VALOR);
					iRow++;

					for(RetencionesPorPagarPorRetenciones retencionesporpagarporretenciones:retencionesporpagarporretencionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(retencionesporpagarporretenciones.getvalor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NUMERO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NUMERO);
					iRow++;

					for(RetencionesPorPagarPorRetenciones retencionesporpagarporretenciones:retencionesporpagarporretencionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(retencionesporpagarporretenciones.getnumero());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBREBENEF:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBREBENEF);
					iRow++;

					for(RetencionesPorPagarPorRetenciones retencionesporpagarporretenciones:retencionesporpagarporretencionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(retencionesporpagarporretenciones.getnombre_benef());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_RUCBENEF:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_RUCBENEF);
					iRow++;

					for(RetencionesPorPagarPorRetenciones retencionesporpagarporretenciones:retencionesporpagarporretencionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(retencionesporpagarporretenciones.getruc_benef());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBRECUENTACONTABLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBRECUENTACONTABLE);
					iRow++;

					for(RetencionesPorPagarPorRetenciones retencionesporpagarporretenciones:retencionesporpagarporretencionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(retencionesporpagarporretenciones.getnombre_cuenta_contable());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBRECUENTACONTABLECREDITO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBRECUENTACONTABLECREDITO);
					iRow++;

					for(RetencionesPorPagarPorRetenciones retencionesporpagarporretenciones:retencionesporpagarporretencionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(retencionesporpagarporretenciones.getnombre_cuenta_contable_credito());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_ESDEBITODATO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_ESDEBITODATO);
					iRow++;

					for(RetencionesPorPagarPorRetenciones retencionesporpagarporretenciones:retencionesporpagarporretencionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(retencionesporpagarporretenciones.getes_debito_dato());
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
			//	this.getFilaCabeceraExportarExcelRetencionesPorPagarPorRetenciones(row);				
			//	iRow++;
			//}				
			
			//for(RetencionesPorPagarPorRetenciones retencionesporpagarporretencionesAux:retencionesporpagarporretencionessSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelRetencionesPorPagarPorRetenciones(retencionesporpagarporretencionesAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Retenciones Por Pagar Por Retenciones",JOptionPane.INFORMATION_MESSAGE);
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
				this.retencionesporpagarporretencionesLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingRetencionesPorPagarPorRetenciones(false);
			
			//SI ES MANUAL
			if(RetencionesPorPagarPorRetencionesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualRetencionesPorPagarPorRetenciones();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporretencionesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporretencionesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporretencionesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresRetencionesPorPagarPorRetencionesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporretencionesLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingRetencionesPorPagarPorRetenciones(false);
			
			//SI ES MANUAL
			if(RetencionesPorPagarPorRetencionesJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualRetencionesPorPagarPorRetenciones();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporretencionesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporretencionesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporretencionesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesRetencionesPorPagarPorRetencionesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporretencionesLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingRetencionesPorPagarPorRetenciones(false);
			
			//SI ES MANUAL
			if(RetencionesPorPagarPorRetencionesJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualRetencionesPorPagarPorRetenciones();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporretencionesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporretencionesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporretencionesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaRetencionesPorPagarPorRetenciones() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosRetencionesPorPagarPorRetenciones.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosRetencionesPorPagarPorRetenciones.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosRetencionesPorPagarPorRetenciones.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosRetencionesPorPagarPorRetenciones.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosRetencionesPorPagarPorRetenciones.setMinimumSize(dimensionMinimum);
		this.jTableDatosRetencionesPorPagarPorRetenciones.setMaximumSize(dimensionMaximum);
		this.jTableDatosRetencionesPorPagarPorRetenciones.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingRetencionesPorPagarPorRetenciones(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingRetencionesPorPagarPorRetenciones(esInicializar,true);
	}
	
	public void inicializarActualizarBindingRetencionesPorPagarPorRetenciones(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaRetencionesPorPagarPorRetenciones(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesRetencionesPorPagarPorRetenciones(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasRetencionesPorPagarPorRetenciones(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesRetencionesPorPagarPorRetenciones(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesRetencionesPorPagarPorRetenciones(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !RetencionesPorPagarPorRetencionesJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!RetencionesPorPagarPorRetencionesJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualRetencionesPorPagarPorRetenciones() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaRetencionesPorPagarPorRetenciones();
		
		this.inicializarActualizarBindingBotonesManualRetencionesPorPagarPorRetenciones(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualRetencionesPorPagarPorRetenciones();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesRetencionesPorPagarPorRetenciones() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualRetencionesPorPagarPorRetenciones(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualRetencionesPorPagarPorRetenciones(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosRetencionesPorPagarPorRetenciones.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosRetencionesPorPagarPorRetenciones.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteRetencionesPorPagarPorRetenciones.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jCheckBoxPostAccionNuevoRetencionesPorPagarPorRetenciones.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jCheckBoxPostAccionSinCerrarRetencionesPorPagarPorRetenciones.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jCheckBoxPostAccionSinMensajeRetencionesPorPagarPorRetenciones.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosRetencionesPorPagarPorRetenciones.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosRetencionesPorPagarPorRetenciones.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteRetencionesPorPagarPorRetenciones.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones!=null) {
				this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jCheckBoxPostAccionNuevoRetencionesPorPagarPorRetenciones.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jCheckBoxPostAccionSinCerrarRetencionesPorPagarPorRetenciones.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jCheckBoxPostAccionSinMensajeRetencionesPorPagarPorRetenciones.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionRetencionesPorPagarPorRetenciones.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionRetencionesPorPagarPorRetenciones.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jComboBoxTiposAccionesFormularioRetencionesPorPagarPorRetenciones.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesRetencionesPorPagarPorRetenciones.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoRetencionesPorPagarPorRetenciones!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoRetencionesPorPagarPorRetenciones.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesRetencionesPorPagarPorRetenciones.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesRetencionesPorPagarPorRetenciones.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarRetencionesPorPagarPorRetenciones.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesRetencionesPorPagarPorRetenciones.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoRetencionesPorPagarPorRetenciones!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoRetencionesPorPagarPorRetenciones.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesRetencionesPorPagarPorRetenciones.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralRetencionesPorPagarPorRetenciones.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesRetencionesPorPagarPorRetenciones(Boolean esInicializar) throws Exception {
		try	{	
			if(RetencionesPorPagarPorRetencionesJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualRetencionesPorPagarPorRetenciones(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesRetencionesPorPagarPorRetenciones() throws Exception {
		try	{
			if(RetencionesPorPagarPorRetencionesJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualRetencionesPorPagarPorRetenciones();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleRetencionesPorPagarPorRetenciones() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jComboBoxTiposAccionesFormularioRetencionesPorPagarPorRetenciones.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jComboBoxTiposAccionesFormularioRetencionesPorPagarPorRetenciones.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualRetencionesPorPagarPorRetenciones() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesRetencionesPorPagarPorRetenciones.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesRetencionesPorPagarPorRetenciones.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesRetencionesPorPagarPorRetenciones.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesRetencionesPorPagarPorRetenciones.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesRetencionesPorPagarPorRetenciones.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesRetencionesPorPagarPorRetenciones.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionRetencionesPorPagarPorRetenciones.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionRetencionesPorPagarPorRetenciones.addItem(reporte);
			}
			
			
			if(!this.retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionRetencionesPorPagarPorRetenciones.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionRetencionesPorPagarPorRetenciones.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesRetencionesPorPagarPorRetenciones.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesRetencionesPorPagarPorRetenciones.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesRetencionesPorPagarPorRetenciones.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesRetencionesPorPagarPorRetenciones.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jComboBoxTiposAccionesFormularioRetencionesPorPagarPorRetenciones.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jComboBoxTiposAccionesFormularioRetencionesPorPagarPorRetenciones.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarRetencionesPorPagarPorRetenciones.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarRetencionesPorPagarPorRetenciones.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarRetencionesPorPagarPorRetenciones.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualRetencionesPorPagarPorRetenciones();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualRetencionesPorPagarPorRetenciones() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoRetencionesPorPagarPorRetenciones!=null) {
				this.jInternalFrameReporteDinamicoRetencionesPorPagarPorRetenciones.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoRetencionesPorPagarPorRetenciones.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoRetencionesPorPagarPorRetenciones!=null) {
				this.jInternalFrameReporteDinamicoRetencionesPorPagarPorRetenciones.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoRetencionesPorPagarPorRetenciones.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoRetencionesPorPagarPorRetenciones!=null) {
				
				if(this.jInternalFrameReporteDinamicoRetencionesPorPagarPorRetenciones.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoRetencionesPorPagarPorRetenciones.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoRetencionesPorPagarPorRetenciones.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoRetencionesPorPagarPorRetenciones.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoRetencionesPorPagarPorRetenciones.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoRetencionesPorPagarPorRetenciones.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoRetencionesPorPagarPorRetenciones.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoRetencionesPorPagarPorRetenciones.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=RetencionesPorPagarPorRetencionesConstantesFunciones.getTiposSeleccionarRetencionesPorPagarPorRetenciones(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoRetencionesPorPagarPorRetenciones.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoRetencionesPorPagarPorRetenciones.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoRetencionesPorPagarPorRetenciones.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=RetencionesPorPagarPorRetencionesConstantesFunciones.getTiposSeleccionarRetencionesPorPagarPorRetenciones(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoRetencionesPorPagarPorRetenciones.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoRetencionesPorPagarPorRetenciones.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoRetencionesPorPagarPorRetenciones.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=RetencionesPorPagarPorRetencionesConstantesFunciones.getTiposSeleccionarRetencionesPorPagarPorRetenciones(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoRetencionesPorPagarPorRetenciones.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoRetencionesPorPagarPorRetenciones.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoRetencionesPorPagarPorRetenciones.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoRetencionesPorPagarPorRetenciones.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualRetencionesPorPagarPorRetenciones()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_ejercicioBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones.getSelectedItem()!=null){this.id_ejercicioBusquedaRetencionesPorPagarPorRetenciones=((Ejercicio)this.jComboBoxid_ejercicioBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones.getSelectedItem()).getId();}
		if(this.jComboBoxid_periodoBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones.getSelectedItem()!=null){this.id_periodoBusquedaRetencionesPorPagarPorRetenciones=((Periodo)this.jComboBoxid_periodoBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones.getSelectedItem()).getId();}
		this.es_debitoBusquedaRetencionesPorPagarPorRetenciones=this.jCheckBoxes_debitoBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones.isSelected();
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasRetencionesPorPagarPorRetenciones(Boolean esInicializar) throws Exception {				
		if(RetencionesPorPagarPorRetencionesJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualRetencionesPorPagarPorRetenciones();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaRetencionesPorPagarPorRetenciones() throws Exception {
		this.inicializarActualizarBindingTablaRetencionesPorPagarPorRetenciones(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByRetencionesPorPagarPorRetenciones() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByRetencionesPorPagarPorRetenciones.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByRetencionesPorPagarPorRetenciones.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByRetencionesPorPagarPorRetenciones.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new RetencionesPorPagarPorRetencionesPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByRetencionesPorPagarPorRetenciones.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByRetencionesPorPagarPorRetenciones.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new RetencionesPorPagarPorRetencionesPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosRetencionesPorPagarPorRetencionesOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRetencionesPorPagarPorRetencionesOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new RetencionesPorPagarPorRetencionesPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByRetencionesPorPagarPorRetenciones.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByRetencionesPorPagarPorRetenciones.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new RetencionesPorPagarPorRetencionesPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByRetencionesPorPagarPorRetenciones.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaRetencionesPorPagarPorRetenciones(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=retencionesporpagarporretencioness.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(RetencionesPorPagarPorRetencionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosRetencionesPorPagarPorRetenciones.setModel(new RetencionesPorPagarPorRetencionesModel(this.retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosRetencionesPorPagarPorRetenciones.setModel(new RetencionesPorPagarPorRetencionesModel(this.retencionesporpagarporretencioness,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByRetencionesPorPagarPorRetenciones!=null && this.jInternalFrameOrderByRetencionesPorPagarPorRetenciones.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByRetencionesPorPagarPorRetenciones();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosRetencionesPorPagarPorRetenciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRetencionesPorPagarPorRetenciones,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new RetencionesPorPagarPorRetencionesPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+RetencionesPorPagarPorRetencionesConstantesFunciones.SCLASSWEBTITULO,retencionesporpagarporretencionesConstantesFunciones.resaltarSeleccionarRetencionesPorPagarPorRetenciones,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+RetencionesPorPagarPorRetencionesConstantesFunciones.SCLASSWEBTITULO,retencionesporpagarporretencionesConstantesFunciones.resaltarSeleccionarRetencionesPorPagarPorRetenciones,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosRetencionesPorPagarPorRetenciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRetencionesPorPagarPorRetenciones,RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_ID));

		if(this.retencionesporpagarporretencionesConstantesFunciones.mostraridRetencionesPorPagarPorRetenciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.retencionesporpagarporretencionesConstantesFunciones.resaltaridRetencionesPorPagarPorRetenciones,this.retencionesporpagarporretencionesConstantesFunciones.activaridRetencionesPorPagarPorRetenciones,iSizeTabla,this,true,"idRetencionesPorPagarPorRetenciones","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.retencionesporpagarporretencionesConstantesFunciones.resaltaridRetencionesPorPagarPorRetenciones,this.retencionesporpagarporretencionesConstantesFunciones.activaridRetencionesPorPagarPorRetenciones,this,true,"idRetencionesPorPagarPorRetenciones","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRetencionesPorPagarPorRetenciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRetencionesPorPagarPorRetenciones,RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_FECHAEMISION));

		if(this.retencionesporpagarporretencionesConstantesFunciones.mostrarfecha_emisionRetencionesPorPagarPorRetenciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_FECHAEMISION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.retencionesporpagarporretencionesConstantesFunciones.resaltarfecha_emisionRetencionesPorPagarPorRetenciones,this.retencionesporpagarporretencionesConstantesFunciones.activarfecha_emisionRetencionesPorPagarPorRetenciones,iSizeTabla,this,true,"fecha_emisionRetencionesPorPagarPorRetenciones","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.retencionesporpagarporretencionesConstantesFunciones.resaltarfecha_emisionRetencionesPorPagarPorRetenciones,this.retencionesporpagarporretencionesConstantesFunciones.activarfecha_emisionRetencionesPorPagarPorRetenciones,this,true,"fecha_emisionRetencionesPorPagarPorRetenciones","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new RetencionesPorPagarPorRetencionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRetencionesPorPagarPorRetenciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRetencionesPorPagarPorRetenciones,RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBRETIPOMOVIMIENTO));

		if(this.retencionesporpagarporretencionesConstantesFunciones.mostrarnombre_tipo_movimientoRetencionesPorPagarPorRetenciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBRETIPOMOVIMIENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.retencionesporpagarporretencionesConstantesFunciones.resaltarnombre_tipo_movimientoRetencionesPorPagarPorRetenciones,this.retencionesporpagarporretencionesConstantesFunciones.activarnombre_tipo_movimientoRetencionesPorPagarPorRetenciones,iSizeTabla,this,true,"nombre_tipo_movimientoRetencionesPorPagarPorRetenciones","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.retencionesporpagarporretencionesConstantesFunciones.resaltarnombre_tipo_movimientoRetencionesPorPagarPorRetenciones,this.retencionesporpagarporretencionesConstantesFunciones.activarnombre_tipo_movimientoRetencionesPorPagarPorRetenciones,this,true,"nombre_tipo_movimientoRetencionesPorPagarPorRetenciones","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RetencionesPorPagarPorRetencionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRetencionesPorPagarPorRetenciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRetencionesPorPagarPorRetenciones,RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NUMEROMAYOR));

		if(this.retencionesporpagarporretencionesConstantesFunciones.mostrarnumero_mayorRetencionesPorPagarPorRetenciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NUMEROMAYOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.retencionesporpagarporretencionesConstantesFunciones.resaltarnumero_mayorRetencionesPorPagarPorRetenciones,this.retencionesporpagarporretencionesConstantesFunciones.activarnumero_mayorRetencionesPorPagarPorRetenciones,iSizeTabla,this,true,"numero_mayorRetencionesPorPagarPorRetenciones","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.retencionesporpagarporretencionesConstantesFunciones.resaltarnumero_mayorRetencionesPorPagarPorRetenciones,this.retencionesporpagarporretencionesConstantesFunciones.activarnumero_mayorRetencionesPorPagarPorRetenciones,this,true,"numero_mayorRetencionesPorPagarPorRetenciones","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RetencionesPorPagarPorRetencionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRetencionesPorPagarPorRetenciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRetencionesPorPagarPorRetenciones,RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBRECUENTACONTABLERETENCION));

		if(this.retencionesporpagarporretencionesConstantesFunciones.mostrarnombre_cuenta_contable_retencionRetencionesPorPagarPorRetenciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBRECUENTACONTABLERETENCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.retencionesporpagarporretencionesConstantesFunciones.resaltarnombre_cuenta_contable_retencionRetencionesPorPagarPorRetenciones,this.retencionesporpagarporretencionesConstantesFunciones.activarnombre_cuenta_contable_retencionRetencionesPorPagarPorRetenciones,iSizeTabla,this,true,"nombre_cuenta_contable_retencionRetencionesPorPagarPorRetenciones","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.retencionesporpagarporretencionesConstantesFunciones.resaltarnombre_cuenta_contable_retencionRetencionesPorPagarPorRetenciones,this.retencionesporpagarporretencionesConstantesFunciones.activarnombre_cuenta_contable_retencionRetencionesPorPagarPorRetenciones,this,true,"nombre_cuenta_contable_retencionRetencionesPorPagarPorRetenciones","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RetencionesPorPagarPorRetencionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRetencionesPorPagarPorRetenciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRetencionesPorPagarPorRetenciones,RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA));

		if(this.retencionesporpagarporretencionesConstantesFunciones.mostrarnumero_pre_impreso_facturaRetencionesPorPagarPorRetenciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.retencionesporpagarporretencionesConstantesFunciones.resaltarnumero_pre_impreso_facturaRetencionesPorPagarPorRetenciones,this.retencionesporpagarporretencionesConstantesFunciones.activarnumero_pre_impreso_facturaRetencionesPorPagarPorRetenciones,iSizeTabla,this,true,"numero_pre_impreso_facturaRetencionesPorPagarPorRetenciones","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.retencionesporpagarporretencionesConstantesFunciones.resaltarnumero_pre_impreso_facturaRetencionesPorPagarPorRetenciones,this.retencionesporpagarporretencionesConstantesFunciones.activarnumero_pre_impreso_facturaRetencionesPorPagarPorRetenciones,this,true,"numero_pre_impreso_facturaRetencionesPorPagarPorRetenciones","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RetencionesPorPagarPorRetencionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRetencionesPorPagarPorRetenciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRetencionesPorPagarPorRetenciones,RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_PORCENTAJE));

		if(this.retencionesporpagarporretencionesConstantesFunciones.mostrarporcentajeRetencionesPorPagarPorRetenciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_PORCENTAJE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.retencionesporpagarporretencionesConstantesFunciones.resaltarporcentajeRetencionesPorPagarPorRetenciones,this.retencionesporpagarporretencionesConstantesFunciones.activarporcentajeRetencionesPorPagarPorRetenciones,iSizeTabla,this,true,"porcentajeRetencionesPorPagarPorRetenciones","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.retencionesporpagarporretencionesConstantesFunciones.resaltarporcentajeRetencionesPorPagarPorRetenciones,this.retencionesporpagarporretencionesConstantesFunciones.activarporcentajeRetencionesPorPagarPorRetenciones,this,true,"porcentajeRetencionesPorPagarPorRetenciones","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new RetencionesPorPagarPorRetencionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRetencionesPorPagarPorRetenciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRetencionesPorPagarPorRetenciones,RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_BASEIMPONIBLE));

		if(this.retencionesporpagarporretencionesConstantesFunciones.mostrarbase_imponibleRetencionesPorPagarPorRetenciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_BASEIMPONIBLE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.retencionesporpagarporretencionesConstantesFunciones.resaltarbase_imponibleRetencionesPorPagarPorRetenciones,this.retencionesporpagarporretencionesConstantesFunciones.activarbase_imponibleRetencionesPorPagarPorRetenciones,iSizeTabla,this,true,"base_imponibleRetencionesPorPagarPorRetenciones","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.retencionesporpagarporretencionesConstantesFunciones.resaltarbase_imponibleRetencionesPorPagarPorRetenciones,this.retencionesporpagarporretencionesConstantesFunciones.activarbase_imponibleRetencionesPorPagarPorRetenciones,this,true,"base_imponibleRetencionesPorPagarPorRetenciones","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new RetencionesPorPagarPorRetencionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRetencionesPorPagarPorRetenciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRetencionesPorPagarPorRetenciones,RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_VALOR));

		if(this.retencionesporpagarporretencionesConstantesFunciones.mostrarvalorRetencionesPorPagarPorRetenciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_VALOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.retencionesporpagarporretencionesConstantesFunciones.resaltarvalorRetencionesPorPagarPorRetenciones,this.retencionesporpagarporretencionesConstantesFunciones.activarvalorRetencionesPorPagarPorRetenciones,iSizeTabla,this,true,"valorRetencionesPorPagarPorRetenciones","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.retencionesporpagarporretencionesConstantesFunciones.resaltarvalorRetencionesPorPagarPorRetenciones,this.retencionesporpagarporretencionesConstantesFunciones.activarvalorRetencionesPorPagarPorRetenciones,this,true,"valorRetencionesPorPagarPorRetenciones","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new RetencionesPorPagarPorRetencionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRetencionesPorPagarPorRetenciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRetencionesPorPagarPorRetenciones,RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NUMERO));

		if(this.retencionesporpagarporretencionesConstantesFunciones.mostrarnumeroRetencionesPorPagarPorRetenciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NUMERO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.retencionesporpagarporretencionesConstantesFunciones.resaltarnumeroRetencionesPorPagarPorRetenciones,this.retencionesporpagarporretencionesConstantesFunciones.activarnumeroRetencionesPorPagarPorRetenciones,iSizeTabla,this,true,"numeroRetencionesPorPagarPorRetenciones","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.retencionesporpagarporretencionesConstantesFunciones.resaltarnumeroRetencionesPorPagarPorRetenciones,this.retencionesporpagarporretencionesConstantesFunciones.activarnumeroRetencionesPorPagarPorRetenciones,this,true,"numeroRetencionesPorPagarPorRetenciones","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RetencionesPorPagarPorRetencionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRetencionesPorPagarPorRetenciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRetencionesPorPagarPorRetenciones,RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBREBENEF));

		if(this.retencionesporpagarporretencionesConstantesFunciones.mostrarnombre_benefRetencionesPorPagarPorRetenciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBREBENEF,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.retencionesporpagarporretencionesConstantesFunciones.resaltarnombre_benefRetencionesPorPagarPorRetenciones,this.retencionesporpagarporretencionesConstantesFunciones.activarnombre_benefRetencionesPorPagarPorRetenciones,iSizeTabla,this,true,"nombre_benefRetencionesPorPagarPorRetenciones","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.retencionesporpagarporretencionesConstantesFunciones.resaltarnombre_benefRetencionesPorPagarPorRetenciones,this.retencionesporpagarporretencionesConstantesFunciones.activarnombre_benefRetencionesPorPagarPorRetenciones,this,true,"nombre_benefRetencionesPorPagarPorRetenciones","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RetencionesPorPagarPorRetencionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRetencionesPorPagarPorRetenciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRetencionesPorPagarPorRetenciones,RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_RUCBENEF));

		if(this.retencionesporpagarporretencionesConstantesFunciones.mostrarruc_benefRetencionesPorPagarPorRetenciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_RUCBENEF,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.retencionesporpagarporretencionesConstantesFunciones.resaltarruc_benefRetencionesPorPagarPorRetenciones,this.retencionesporpagarporretencionesConstantesFunciones.activarruc_benefRetencionesPorPagarPorRetenciones,iSizeTabla,this,true,"ruc_benefRetencionesPorPagarPorRetenciones","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.retencionesporpagarporretencionesConstantesFunciones.resaltarruc_benefRetencionesPorPagarPorRetenciones,this.retencionesporpagarporretencionesConstantesFunciones.activarruc_benefRetencionesPorPagarPorRetenciones,this,true,"ruc_benefRetencionesPorPagarPorRetenciones","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RetencionesPorPagarPorRetencionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRetencionesPorPagarPorRetenciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRetencionesPorPagarPorRetenciones,RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBRECUENTACONTABLE));

		if(this.retencionesporpagarporretencionesConstantesFunciones.mostrarnombre_cuenta_contableRetencionesPorPagarPorRetenciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBRECUENTACONTABLE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.retencionesporpagarporretencionesConstantesFunciones.resaltarnombre_cuenta_contableRetencionesPorPagarPorRetenciones,this.retencionesporpagarporretencionesConstantesFunciones.activarnombre_cuenta_contableRetencionesPorPagarPorRetenciones,iSizeTabla,this,true,"nombre_cuenta_contableRetencionesPorPagarPorRetenciones","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.retencionesporpagarporretencionesConstantesFunciones.resaltarnombre_cuenta_contableRetencionesPorPagarPorRetenciones,this.retencionesporpagarporretencionesConstantesFunciones.activarnombre_cuenta_contableRetencionesPorPagarPorRetenciones,this,true,"nombre_cuenta_contableRetencionesPorPagarPorRetenciones","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RetencionesPorPagarPorRetencionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRetencionesPorPagarPorRetenciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRetencionesPorPagarPorRetenciones,RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBRECUENTACONTABLECREDITO));

		if(this.retencionesporpagarporretencionesConstantesFunciones.mostrarnombre_cuenta_contable_creditoRetencionesPorPagarPorRetenciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBRECUENTACONTABLECREDITO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.retencionesporpagarporretencionesConstantesFunciones.resaltarnombre_cuenta_contable_creditoRetencionesPorPagarPorRetenciones,this.retencionesporpagarporretencionesConstantesFunciones.activarnombre_cuenta_contable_creditoRetencionesPorPagarPorRetenciones,iSizeTabla,this,true,"nombre_cuenta_contable_creditoRetencionesPorPagarPorRetenciones","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.retencionesporpagarporretencionesConstantesFunciones.resaltarnombre_cuenta_contable_creditoRetencionesPorPagarPorRetenciones,this.retencionesporpagarporretencionesConstantesFunciones.activarnombre_cuenta_contable_creditoRetencionesPorPagarPorRetenciones,this,true,"nombre_cuenta_contable_creditoRetencionesPorPagarPorRetenciones","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RetencionesPorPagarPorRetencionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRetencionesPorPagarPorRetenciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRetencionesPorPagarPorRetenciones,RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_ESDEBITODATO));

		if(this.retencionesporpagarporretencionesConstantesFunciones.mostrares_debito_datoRetencionesPorPagarPorRetenciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_ESDEBITODATO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.retencionesporpagarporretencionesConstantesFunciones.resaltares_debito_datoRetencionesPorPagarPorRetenciones,this.retencionesporpagarporretencionesConstantesFunciones.activares_debito_datoRetencionesPorPagarPorRetenciones,iSizeTabla));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.retencionesporpagarporretencionesConstantesFunciones.resaltares_debito_datoRetencionesPorPagarPorRetenciones,this.retencionesporpagarporretencionesConstantesFunciones.activares_debito_datoRetencionesPorPagarPorRetenciones,this,true,"es_debito_datoRetencionesPorPagarPorRetenciones","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new RetencionesPorPagarPorRetencionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosRetencionesPorPagarPorRetenciones.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosRetencionesPorPagarPorRetenciones.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarRetencionesPorPagarPorRetenciones && this.isPermisoGuardarCambiosRetencionesPorPagarPorRetenciones) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosRetencionesPorPagarPorRetenciones.addColumn(tableColumn);
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
			
			this.jTableDatosRetencionesPorPagarPorRetenciones.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarRetencionesPorPagarPorRetenciones && this.isPermisoGuardarCambiosRetencionesPorPagarPorRetenciones) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarRetencionesPorPagarPorRetenciones && this.isPermisoGuardarCambiosRetencionesPorPagarPorRetenciones) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosRetencionesPorPagarPorRetenciones.moveColumn(this.jTableDatosRetencionesPorPagarPorRetenciones.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosRetencionesPorPagarPorRetenciones.moveColumn(this.jTableDatosRetencionesPorPagarPorRetenciones.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosRetencionesPorPagarPorRetenciones.moveColumn(this.jTableDatosRetencionesPorPagarPorRetenciones.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosRetencionesPorPagarPorRetenciones.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosRetencionesPorPagarPorRetenciones.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosRetencionesPorPagarPorRetenciones,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!RetencionesPorPagarPorRetencionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosRetencionesPorPagarPorRetenciones.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosRetencionesPorPagarPorRetenciones.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!RetencionesPorPagarPorRetencionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!RetencionesPorPagarPorRetencionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosRetencionesPorPagarPorRetenciones.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosRetencionesPorPagarPorRetenciones.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosRetencionesPorPagarPorRetenciones.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=retencionesporpagarporretencioness.size()-1;
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
		//this.jTableDatosRetencionesPorPagarPorRetenciones.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosRetencionesPorPagarPorRetenciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosRetencionesPorPagarPorRetenciones();
			
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
				
				//this.isEsNuevoRetencionesPorPagarPorRetenciones=false;
					
				RetencionesPorPagarPorRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.retencionesporpagarporretenciones,new Object(),this.retencionesporpagarporretencionesParameterGeneral,this.retencionesporpagarporretencionesReturnGeneral);
			
				if(this.retencionesporpagarporretencionesSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosRetencionesPorPagarPorRetenciones.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosRetencionesPorPagarPorRetenciones.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretenciones =(RetencionesPorPagarPorRetenciones) this.retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness().toArray()[this.jTableDatosRetencionesPorPagarPorRetenciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.retencionesporpagarporretenciones =(RetencionesPorPagarPorRetenciones) this.retencionesporpagarporretencioness.toArray()[this.jTableDatosRetencionesPorPagarPorRetenciones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.retencionesporpagarporretenciones.getsType().equals("DUPLICADO")
				   || this.retencionesporpagarporretenciones.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoRetencionesPorPagarPorRetenciones=true;
				
				} else {
					this.isEsNuevoRetencionesPorPagarPorRetenciones=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado()) {
					if(this.retencionesporpagarporretenciones.getId()>=0 && !this.retencionesporpagarporretenciones.getIsNew()) {						
						this.isEsNuevoRetencionesPorPagarPorRetenciones=false;
						
					} else {
						this.isEsNuevoRetencionesPorPagarPorRetenciones=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoRetencionesPorPagarPorRetenciones(esRelaciones);						
				
				this.seleccionarRetencionesPorPagarPorRetenciones(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.retencionesporpagarporretenciones.getId()<0) {
					this.isEsNuevoRetencionesPorPagarPorRetenciones=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarRetencionesPorPagarPorRetenciones(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarRetencionesPorPagarPorRetenciones(evt,rowIndex);
				}	
				
				if(this.retencionesporpagarporretencionesSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion RetencionesPorPagarPorRetenciones: " + this.dDif); 
					}
				}								
				
				RetencionesPorPagarPorRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.retencionesporpagarporretenciones,new Object(),this.retencionesporpagarporretencionesParameterGeneral,this.retencionesporpagarporretencionesReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarRetencionesPorPagarPorRetenciones(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.retencionesporpagarporretenciones)) {
					if(this.retencionesporpagarporretenciones.getId()>0) {
						this.retencionesporpagarporretenciones.setIsDeleted(true);
						
						this.retencionesporpagarporretencionessEliminados.add(this.retencionesporpagarporretenciones);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness().remove(this.retencionesporpagarporretenciones);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.retencionesporpagarporretencioness.remove(this.retencionesporpagarporretenciones);				
					}
					
					
					((RetencionesPorPagarPorRetencionesModel) this.jTableDatosRetencionesPorPagarPorRetenciones.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaRetencionesPorPagarPorRetenciones(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarRetencionesPorPagarPorRetenciones(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoRetencionesPorPagarPorRetenciones) {
			
			if(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosRetencionesPorPagarPorRetenciones.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosRetencionesPorPagarPorRetenciones.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretenciones =(RetencionesPorPagarPorRetenciones) this.retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness().toArray()[this.jTableDatosRetencionesPorPagarPorRetenciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.retencionesporpagarporretenciones =(RetencionesPorPagarPorRetenciones) this.retencionesporpagarporretencioness.toArray()[this.jTableDatosRetencionesPorPagarPorRetenciones.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(RetencionesPorPagarPorRetencionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretenciones);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesRetencionesPorPagarPorRetenciones("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesRetencionesPorPagarPorRetenciones(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualRetencionesPorPagarPorRetenciones() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoRetencionesPorPagarPorRetenciones(RetencionesPorPagarPorRetenciones retencionesporpagarporretenciones) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoRetencionesPorPagarPorRetenciones(retencionesporpagarporretenciones,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoRetencionesPorPagarPorRetenciones(RetencionesPorPagarPorRetenciones retencionesporpagarporretenciones,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioRetencionesPorPagarPorRetenciones(retencionesporpagarporretenciones);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyRetencionesPorPagarPorRetenciones(retencionesporpagarporretenciones,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyRetencionesPorPagarPorRetenciones(retencionesporpagarporretenciones);
	}
	
	public void setVariablesObjetoActualToFormularioRetencionesPorPagarPorRetenciones(RetencionesPorPagarPorRetenciones retencionesporpagarporretenciones) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jLabelidRetencionesPorPagarPorRetenciones.setText(retencionesporpagarporretenciones.getId().toString());
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jDateChooserfecha_emisionRetencionesPorPagarPorRetenciones.setDate(retencionesporpagarporretenciones.getfecha_emision());
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextAreanombre_tipo_movimientoRetencionesPorPagarPorRetenciones.setText(retencionesporpagarporretenciones.getnombre_tipo_movimiento());
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextAreanumero_mayorRetencionesPorPagarPorRetenciones.setText(retencionesporpagarporretenciones.getnumero_mayor());
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextAreanombre_cuenta_contable_retencionRetencionesPorPagarPorRetenciones.setText(retencionesporpagarporretenciones.getnombre_cuenta_contable_retencion());
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextFieldnumero_pre_impreso_facturaRetencionesPorPagarPorRetenciones.setText(retencionesporpagarporretenciones.getnumero_pre_impreso_factura());
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextFieldporcentajeRetencionesPorPagarPorRetenciones.setText(retencionesporpagarporretenciones.getporcentaje().toString());
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextFieldbase_imponibleRetencionesPorPagarPorRetenciones.setText(retencionesporpagarporretenciones.getbase_imponible().toString());
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextFieldvalorRetencionesPorPagarPorRetenciones.setText(retencionesporpagarporretenciones.getvalor().toString());
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextFieldnumeroRetencionesPorPagarPorRetenciones.setText(retencionesporpagarporretenciones.getnumero());
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextAreanombre_benefRetencionesPorPagarPorRetenciones.setText(retencionesporpagarporretenciones.getnombre_benef());
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextFieldruc_benefRetencionesPorPagarPorRetenciones.setText(retencionesporpagarporretenciones.getruc_benef());
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextAreanombre_cuenta_contableRetencionesPorPagarPorRetenciones.setText(retencionesporpagarporretenciones.getnombre_cuenta_contable());
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextAreanombre_cuenta_contable_creditoRetencionesPorPagarPorRetenciones.setText(retencionesporpagarporretenciones.getnombre_cuenta_contable_credito());
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jCheckBoxes_debito_datoRetencionesPorPagarPorRetenciones.setSelected(retencionesporpagarporretenciones.getes_debito_dato());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,RetencionesPorPagarPorRetenciones retencionesporpagarporretencionesLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,retencionesporpagarporretencionesLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,RetencionesPorPagarPorRetenciones retencionesporpagarporretencionesLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				retencionesporpagarporretencionesLocal=this.retencionesporpagarporretenciones;
			} else {
				retencionesporpagarporretencionesLocal=this.retencionesporpagarporretencionesAnterior;
			}
		}
		
		if(this.permiteMantenimiento(retencionesporpagarporretencionesLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoRetencionesPorPagarPorRetenciones(retencionesporpagarporretencionesLocal,true);
					
					if(retencionesporpagarporretencionesSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(retencionesporpagarporretencionesLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(retencionesporpagarporretencionesLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoRetencionesPorPagarPorRetenciones(RetencionesPorPagarPorRetenciones retencionesporpagarporretenciones,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorRetenciones(retencionesporpagarporretenciones,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorRetenciones(retencionesporpagarporretenciones);
	}
	
	public void setVariablesFormularioToObjetoActualRetencionesPorPagarPorRetenciones(RetencionesPorPagarPorRetenciones retencionesporpagarporretenciones,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorRetenciones(retencionesporpagarporretenciones,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualRetencionesPorPagarPorRetenciones(RetencionesPorPagarPorRetenciones retencionesporpagarporretenciones,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jLabelidRetencionesPorPagarPorRetenciones.getText()==null || this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jLabelidRetencionesPorPagarPorRetenciones.getText()=="" || this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jLabelidRetencionesPorPagarPorRetenciones.getText()=="Id") {
				this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jLabelidRetencionesPorPagarPorRetenciones.setText("0");
			}

			if(conColumnasBase) {retencionesporpagarporretenciones.setId(Long.parseLong(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jLabelidRetencionesPorPagarPorRetenciones.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jLabelIdRetencionesPorPagarPorRetenciones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			retencionesporpagarporretenciones.setfecha_emision(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jDateChooserfecha_emisionRetencionesPorPagarPorRetenciones.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_FECHAEMISION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jLabelfecha_emisionRetencionesPorPagarPorRetenciones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			retencionesporpagarporretenciones.setnombre_tipo_movimiento(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextAreanombre_tipo_movimientoRetencionesPorPagarPorRetenciones.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBRETIPOMOVIMIENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jLabelnombre_tipo_movimientoRetencionesPorPagarPorRetenciones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			retencionesporpagarporretenciones.setnumero_mayor(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextAreanumero_mayorRetencionesPorPagarPorRetenciones.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NUMEROMAYOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jLabelnumero_mayorRetencionesPorPagarPorRetenciones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			retencionesporpagarporretenciones.setnombre_cuenta_contable_retencion(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextAreanombre_cuenta_contable_retencionRetencionesPorPagarPorRetenciones.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBRECUENTACONTABLERETENCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jLabelnombre_cuenta_contable_retencionRetencionesPorPagarPorRetenciones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			retencionesporpagarporretenciones.setnumero_pre_impreso_factura(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextFieldnumero_pre_impreso_facturaRetencionesPorPagarPorRetenciones.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jLabelnumero_pre_impreso_facturaRetencionesPorPagarPorRetenciones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			retencionesporpagarporretenciones.setporcentaje(Double.parseDouble(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextFieldporcentajeRetencionesPorPagarPorRetenciones.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_PORCENTAJE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jLabelporcentajeRetencionesPorPagarPorRetenciones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			retencionesporpagarporretenciones.setbase_imponible(Double.parseDouble(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextFieldbase_imponibleRetencionesPorPagarPorRetenciones.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_BASEIMPONIBLE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jLabelbase_imponibleRetencionesPorPagarPorRetenciones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			retencionesporpagarporretenciones.setvalor(Double.parseDouble(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextFieldvalorRetencionesPorPagarPorRetenciones.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_VALOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jLabelvalorRetencionesPorPagarPorRetenciones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			retencionesporpagarporretenciones.setnumero(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextFieldnumeroRetencionesPorPagarPorRetenciones.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NUMERO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jLabelnumeroRetencionesPorPagarPorRetenciones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			retencionesporpagarporretenciones.setnombre_benef(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextAreanombre_benefRetencionesPorPagarPorRetenciones.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBREBENEF+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jLabelnombre_benefRetencionesPorPagarPorRetenciones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			retencionesporpagarporretenciones.setruc_benef(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextFieldruc_benefRetencionesPorPagarPorRetenciones.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_RUCBENEF+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jLabelruc_benefRetencionesPorPagarPorRetenciones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			retencionesporpagarporretenciones.setnombre_cuenta_contable(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextAreanombre_cuenta_contableRetencionesPorPagarPorRetenciones.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBRECUENTACONTABLE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jLabelnombre_cuenta_contableRetencionesPorPagarPorRetenciones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			retencionesporpagarporretenciones.setnombre_cuenta_contable_credito(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextAreanombre_cuenta_contable_creditoRetencionesPorPagarPorRetenciones.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBRECUENTACONTABLECREDITO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jLabelnombre_cuenta_contable_creditoRetencionesPorPagarPorRetenciones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			retencionesporpagarporretenciones.setes_debito_dato(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jCheckBoxes_debito_datoRetencionesPorPagarPorRetenciones.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_ESDEBITODATO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jLabeles_debito_datoRetencionesPorPagarPorRetenciones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualRetencionesPorPagarPorRetenciones(RetencionesPorPagarPorRetenciones retencionesporpagarporretencionesBean,RetencionesPorPagarPorRetenciones retencionesporpagarporretenciones,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosRetencionesPorPagarPorRetenciones(RetencionesPorPagarPorRetenciones retencionesporpagarporretencionesOrigen,RetencionesPorPagarPorRetenciones retencionesporpagarporretenciones,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && retencionesporpagarporretencionesOrigen.getId()!=null && !retencionesporpagarporretencionesOrigen.getId().equals(0L))) {retencionesporpagarporretenciones.setId(retencionesporpagarporretencionesOrigen.getId());}}
			if(conDefault || (!conDefault && retencionesporpagarporretencionesOrigen.getes_debito()!=null && !retencionesporpagarporretencionesOrigen.getes_debito().equals(false))) {retencionesporpagarporretenciones.setes_debito(retencionesporpagarporretencionesOrigen.getes_debito());}
			if(conDefault || (!conDefault && retencionesporpagarporretencionesOrigen.getfecha_emision()!=null && !retencionesporpagarporretencionesOrigen.getfecha_emision().equals(new Date()))) {retencionesporpagarporretenciones.setfecha_emision(retencionesporpagarporretencionesOrigen.getfecha_emision());}
			if(conDefault || (!conDefault && retencionesporpagarporretencionesOrigen.getnombre_tipo_movimiento()!=null && !retencionesporpagarporretencionesOrigen.getnombre_tipo_movimiento().equals(""))) {retencionesporpagarporretenciones.setnombre_tipo_movimiento(retencionesporpagarporretencionesOrigen.getnombre_tipo_movimiento());}
			if(conDefault || (!conDefault && retencionesporpagarporretencionesOrigen.getnumero_mayor()!=null && !retencionesporpagarporretencionesOrigen.getnumero_mayor().equals(""))) {retencionesporpagarporretenciones.setnumero_mayor(retencionesporpagarporretencionesOrigen.getnumero_mayor());}
			if(conDefault || (!conDefault && retencionesporpagarporretencionesOrigen.getnombre_cuenta_contable_retencion()!=null && !retencionesporpagarporretencionesOrigen.getnombre_cuenta_contable_retencion().equals(""))) {retencionesporpagarporretenciones.setnombre_cuenta_contable_retencion(retencionesporpagarporretencionesOrigen.getnombre_cuenta_contable_retencion());}
			if(conDefault || (!conDefault && retencionesporpagarporretencionesOrigen.getnumero_pre_impreso_factura()!=null && !retencionesporpagarporretencionesOrigen.getnumero_pre_impreso_factura().equals(""))) {retencionesporpagarporretenciones.setnumero_pre_impreso_factura(retencionesporpagarporretencionesOrigen.getnumero_pre_impreso_factura());}
			if(conDefault || (!conDefault && retencionesporpagarporretencionesOrigen.getporcentaje()!=null && !retencionesporpagarporretencionesOrigen.getporcentaje().equals(0.0))) {retencionesporpagarporretenciones.setporcentaje(retencionesporpagarporretencionesOrigen.getporcentaje());}
			if(conDefault || (!conDefault && retencionesporpagarporretencionesOrigen.getbase_imponible()!=null && !retencionesporpagarporretencionesOrigen.getbase_imponible().equals(0.0))) {retencionesporpagarporretenciones.setbase_imponible(retencionesporpagarporretencionesOrigen.getbase_imponible());}
			if(conDefault || (!conDefault && retencionesporpagarporretencionesOrigen.getvalor()!=null && !retencionesporpagarporretencionesOrigen.getvalor().equals(0.0))) {retencionesporpagarporretenciones.setvalor(retencionesporpagarporretencionesOrigen.getvalor());}
			if(conDefault || (!conDefault && retencionesporpagarporretencionesOrigen.getnumero()!=null && !retencionesporpagarporretencionesOrigen.getnumero().equals(""))) {retencionesporpagarporretenciones.setnumero(retencionesporpagarporretencionesOrigen.getnumero());}
			if(conDefault || (!conDefault && retencionesporpagarporretencionesOrigen.getnombre_benef()!=null && !retencionesporpagarporretencionesOrigen.getnombre_benef().equals(""))) {retencionesporpagarporretenciones.setnombre_benef(retencionesporpagarporretencionesOrigen.getnombre_benef());}
			if(conDefault || (!conDefault && retencionesporpagarporretencionesOrigen.getruc_benef()!=null && !retencionesporpagarporretencionesOrigen.getruc_benef().equals(""))) {retencionesporpagarporretenciones.setruc_benef(retencionesporpagarporretencionesOrigen.getruc_benef());}
			if(conDefault || (!conDefault && retencionesporpagarporretencionesOrigen.getnombre_cuenta_contable()!=null && !retencionesporpagarporretencionesOrigen.getnombre_cuenta_contable().equals(""))) {retencionesporpagarporretenciones.setnombre_cuenta_contable(retencionesporpagarporretencionesOrigen.getnombre_cuenta_contable());}
			if(conDefault || (!conDefault && retencionesporpagarporretencionesOrigen.getnombre_cuenta_contable_credito()!=null && !retencionesporpagarporretencionesOrigen.getnombre_cuenta_contable_credito().equals(""))) {retencionesporpagarporretenciones.setnombre_cuenta_contable_credito(retencionesporpagarporretencionesOrigen.getnombre_cuenta_contable_credito());}
			if(conDefault || (!conDefault && retencionesporpagarporretencionesOrigen.getes_debito_dato()!=null && !retencionesporpagarporretencionesOrigen.getes_debito_dato().equals(false))) {retencionesporpagarporretenciones.setes_debito_dato(retencionesporpagarporretencionesOrigen.getes_debito_dato());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioRetencionesPorPagarPorRetenciones(RetencionesPorPagarPorRetenciones retencionesporpagarporretenciones) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jLabelidRetencionesPorPagarPorRetenciones.setText(retencionesporpagarporretenciones.getId().toString());
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jDateChooserfecha_emisionRetencionesPorPagarPorRetenciones.setDate(retencionesporpagarporretenciones.getfecha_emision());
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextAreanombre_tipo_movimientoRetencionesPorPagarPorRetenciones.setText(retencionesporpagarporretenciones.getnombre_tipo_movimiento());
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextAreanumero_mayorRetencionesPorPagarPorRetenciones.setText(retencionesporpagarporretenciones.getnumero_mayor());
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextAreanombre_cuenta_contable_retencionRetencionesPorPagarPorRetenciones.setText(retencionesporpagarporretenciones.getnombre_cuenta_contable_retencion());
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextFieldnumero_pre_impreso_facturaRetencionesPorPagarPorRetenciones.setText(retencionesporpagarporretenciones.getnumero_pre_impreso_factura());
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextFieldporcentajeRetencionesPorPagarPorRetenciones.setText(retencionesporpagarporretenciones.getporcentaje().toString());
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextFieldbase_imponibleRetencionesPorPagarPorRetenciones.setText(retencionesporpagarporretenciones.getbase_imponible().toString());
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextFieldvalorRetencionesPorPagarPorRetenciones.setText(retencionesporpagarporretenciones.getvalor().toString());
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextFieldnumeroRetencionesPorPagarPorRetenciones.setText(retencionesporpagarporretenciones.getnumero());
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextAreanombre_benefRetencionesPorPagarPorRetenciones.setText(retencionesporpagarporretenciones.getnombre_benef());
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextFieldruc_benefRetencionesPorPagarPorRetenciones.setText(retencionesporpagarporretenciones.getruc_benef());
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextAreanombre_cuenta_contableRetencionesPorPagarPorRetenciones.setText(retencionesporpagarporretenciones.getnombre_cuenta_contable());
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextAreanombre_cuenta_contable_creditoRetencionesPorPagarPorRetenciones.setText(retencionesporpagarporretenciones.getnombre_cuenta_contable_credito());
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jCheckBoxes_debito_datoRetencionesPorPagarPorRetenciones.setSelected(retencionesporpagarporretenciones.getes_debito_dato());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioRetencionesPorPagarPorRetenciones(RetencionesPorPagarPorRetencionesBean retencionesporpagarporretencionesBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jLabelidRetencionesPorPagarPorRetenciones.setText(retencionesporpagarporretencionesBean.getId().toString());
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jDateChooserfecha_emisionRetencionesPorPagarPorRetenciones.setDate(retencionesporpagarporretencionesBean.getfecha_emision());
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextAreanombre_tipo_movimientoRetencionesPorPagarPorRetenciones.setText(retencionesporpagarporretencionesBean.getnombre_tipo_movimiento());
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextAreanumero_mayorRetencionesPorPagarPorRetenciones.setText(retencionesporpagarporretencionesBean.getnumero_mayor());
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextAreanombre_cuenta_contable_retencionRetencionesPorPagarPorRetenciones.setText(retencionesporpagarporretencionesBean.getnombre_cuenta_contable_retencion());
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextFieldnumero_pre_impreso_facturaRetencionesPorPagarPorRetenciones.setText(retencionesporpagarporretencionesBean.getnumero_pre_impreso_factura());
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextFieldporcentajeRetencionesPorPagarPorRetenciones.setText(retencionesporpagarporretencionesBean.getporcentaje().toString());
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextFieldbase_imponibleRetencionesPorPagarPorRetenciones.setText(retencionesporpagarporretencionesBean.getbase_imponible().toString());
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextFieldvalorRetencionesPorPagarPorRetenciones.setText(retencionesporpagarporretencionesBean.getvalor().toString());
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextFieldnumeroRetencionesPorPagarPorRetenciones.setText(retencionesporpagarporretencionesBean.getnumero());
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextAreanombre_benefRetencionesPorPagarPorRetenciones.setText(retencionesporpagarporretencionesBean.getnombre_benef());
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextFieldruc_benefRetencionesPorPagarPorRetenciones.setText(retencionesporpagarporretencionesBean.getruc_benef());
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextAreanombre_cuenta_contableRetencionesPorPagarPorRetenciones.setText(retencionesporpagarporretencionesBean.getnombre_cuenta_contable());
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextAreanombre_cuenta_contable_creditoRetencionesPorPagarPorRetenciones.setText(retencionesporpagarporretencionesBean.getnombre_cuenta_contable_credito());
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jCheckBoxes_debito_datoRetencionesPorPagarPorRetenciones.setSelected(retencionesporpagarporretencionesBean.getes_debito_dato());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanRetencionesPorPagarPorRetenciones(RetencionesPorPagarPorRetencionesParameterReturnGeneral retencionesporpagarporretencionesReturnGeneral,RetencionesPorPagarPorRetencionesBean retencionesporpagarporretencionesBean,Boolean conDefault) throws Exception { 
		try {
			RetencionesPorPagarPorRetenciones retencionesporpagarporretencionesLocal=new RetencionesPorPagarPorRetenciones();
			
			retencionesporpagarporretencionesLocal=retencionesporpagarporretencionesReturnGeneral.getRetencionesPorPagarPorRetenciones();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && retencionesporpagarporretencionesLocal.getId()!=null && !retencionesporpagarporretencionesLocal.getId().equals(0L))) {retencionesporpagarporretencionesBean.setId(retencionesporpagarporretencionesLocal.getId());}}
			if(conDefault || (!conDefault && retencionesporpagarporretencionesLocal.getfecha_emision()!=null && !retencionesporpagarporretencionesLocal.getfecha_emision().equals(new Date()))) {retencionesporpagarporretencionesBean.setfecha_emision(retencionesporpagarporretencionesLocal.getfecha_emision());}
			if(conDefault || (!conDefault && retencionesporpagarporretencionesLocal.getnombre_tipo_movimiento()!=null && !retencionesporpagarporretencionesLocal.getnombre_tipo_movimiento().equals(""))) {retencionesporpagarporretencionesBean.setnombre_tipo_movimiento(retencionesporpagarporretencionesLocal.getnombre_tipo_movimiento());}
			if(conDefault || (!conDefault && retencionesporpagarporretencionesLocal.getnumero_mayor()!=null && !retencionesporpagarporretencionesLocal.getnumero_mayor().equals(""))) {retencionesporpagarporretencionesBean.setnumero_mayor(retencionesporpagarporretencionesLocal.getnumero_mayor());}
			if(conDefault || (!conDefault && retencionesporpagarporretencionesLocal.getnombre_cuenta_contable_retencion()!=null && !retencionesporpagarporretencionesLocal.getnombre_cuenta_contable_retencion().equals(""))) {retencionesporpagarporretencionesBean.setnombre_cuenta_contable_retencion(retencionesporpagarporretencionesLocal.getnombre_cuenta_contable_retencion());}
			if(conDefault || (!conDefault && retencionesporpagarporretencionesLocal.getnumero_pre_impreso_factura()!=null && !retencionesporpagarporretencionesLocal.getnumero_pre_impreso_factura().equals(""))) {retencionesporpagarporretencionesBean.setnumero_pre_impreso_factura(retencionesporpagarporretencionesLocal.getnumero_pre_impreso_factura());}
			if(conDefault || (!conDefault && retencionesporpagarporretencionesLocal.getporcentaje()!=null && !retencionesporpagarporretencionesLocal.getporcentaje().equals(0.0))) {retencionesporpagarporretencionesBean.setporcentaje(retencionesporpagarporretencionesLocal.getporcentaje());}
			if(conDefault || (!conDefault && retencionesporpagarporretencionesLocal.getbase_imponible()!=null && !retencionesporpagarporretencionesLocal.getbase_imponible().equals(0.0))) {retencionesporpagarporretencionesBean.setbase_imponible(retencionesporpagarporretencionesLocal.getbase_imponible());}
			if(conDefault || (!conDefault && retencionesporpagarporretencionesLocal.getvalor()!=null && !retencionesporpagarporretencionesLocal.getvalor().equals(0.0))) {retencionesporpagarporretencionesBean.setvalor(retencionesporpagarporretencionesLocal.getvalor());}
			if(conDefault || (!conDefault && retencionesporpagarporretencionesLocal.getnumero()!=null && !retencionesporpagarporretencionesLocal.getnumero().equals(""))) {retencionesporpagarporretencionesBean.setnumero(retencionesporpagarporretencionesLocal.getnumero());}
			if(conDefault || (!conDefault && retencionesporpagarporretencionesLocal.getnombre_benef()!=null && !retencionesporpagarporretencionesLocal.getnombre_benef().equals(""))) {retencionesporpagarporretencionesBean.setnombre_benef(retencionesporpagarporretencionesLocal.getnombre_benef());}
			if(conDefault || (!conDefault && retencionesporpagarporretencionesLocal.getruc_benef()!=null && !retencionesporpagarporretencionesLocal.getruc_benef().equals(""))) {retencionesporpagarporretencionesBean.setruc_benef(retencionesporpagarporretencionesLocal.getruc_benef());}
			if(conDefault || (!conDefault && retencionesporpagarporretencionesLocal.getnombre_cuenta_contable()!=null && !retencionesporpagarporretencionesLocal.getnombre_cuenta_contable().equals(""))) {retencionesporpagarporretencionesBean.setnombre_cuenta_contable(retencionesporpagarporretencionesLocal.getnombre_cuenta_contable());}
			if(conDefault || (!conDefault && retencionesporpagarporretencionesLocal.getnombre_cuenta_contable_credito()!=null && !retencionesporpagarporretencionesLocal.getnombre_cuenta_contable_credito().equals(""))) {retencionesporpagarporretencionesBean.setnombre_cuenta_contable_credito(retencionesporpagarporretencionesLocal.getnombre_cuenta_contable_credito());}
			if(conDefault || (!conDefault && retencionesporpagarporretencionesLocal.getes_debito_dato()!=null && !retencionesporpagarporretencionesLocal.getes_debito_dato().equals(false))) {retencionesporpagarporretencionesBean.setes_debito_dato(retencionesporpagarporretencionesLocal.getes_debito_dato());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxRetencionesPorPagarPorRetencionesGenerico(Long idRetencionesPorPagarPorRetencionesSeleccionado,JComboBox jComboBoxRetencionesPorPagarPorRetenciones,List<RetencionesPorPagarPorRetenciones> retencionesporpagarporretencionessLocal)throws Exception {
		try {
			RetencionesPorPagarPorRetenciones  retencionesporpagarporretencionesTemp=null;

			for(RetencionesPorPagarPorRetenciones retencionesporpagarporretencionesAux:retencionesporpagarporretencionessLocal) {
				if(retencionesporpagarporretencionesAux.getId()!=null && retencionesporpagarporretencionesAux.getId().equals(idRetencionesPorPagarPorRetencionesSeleccionado)) {
					retencionesporpagarporretencionesTemp=retencionesporpagarporretencionesAux;
					break;
				}
			}

			jComboBoxRetencionesPorPagarPorRetenciones.setSelectedItem(retencionesporpagarporretencionesTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxRetencionesPorPagarPorRetencionesGenerico(JComboBox jComboBoxRetencionesPorPagarPorRetenciones,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxRetencionesPorPagarPorRetenciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxRetencionesPorPagarPorRetenciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxRetencionesPorPagarPorRetenciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxRetencionesPorPagarPorRetenciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxRetencionesPorPagarPorRetenciones.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxRetencionesPorPagarPorRetenciones.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxRetencionesPorPagarPorRetenciones.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxRetencionesPorPagarPorRetenciones.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxRetencionesPorPagarPorRetenciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxRetencionesPorPagarPorRetenciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			retencionesporpagarporretenciones=(RetencionesPorPagarPorRetenciones) retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			retencionesporpagarporretenciones =(RetencionesPorPagarPorRetenciones) retencionesporpagarporretencioness.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!retencionesporpagarporretenciones.getIsNew() && !retencionesporpagarporretenciones.getIsChanged() && !retencionesporpagarporretenciones.getIsDeleted()) {
				sDescripcion=retencionesporpagarporretenciones.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=retencionesporpagarporretenciones.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!retencionesporpagarporretenciones.getIsNew() && !retencionesporpagarporretenciones.getIsChanged() && !retencionesporpagarporretenciones.getIsDeleted()) {
				sDescripcion=retencionesporpagarporretenciones.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=retencionesporpagarporretenciones.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Ejercicio")) {
			//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
			if(!retencionesporpagarporretenciones.getIsNew() && !retencionesporpagarporretenciones.getIsChanged() && !retencionesporpagarporretenciones.getIsDeleted()) {
				sDescripcion=retencionesporpagarporretenciones.getejercicio_descripcion();
			} else {
				//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
				sDescripcion=retencionesporpagarporretenciones.getejercicio_descripcion();
			}
		}

		if(sTipo.equals("Periodo")) {
			//sDescripcion=this.getActualPeriodoForeignKeyDescripcion((Long)value);
			if(!retencionesporpagarporretenciones.getIsNew() && !retencionesporpagarporretenciones.getIsChanged() && !retencionesporpagarporretenciones.getIsDeleted()) {
				sDescripcion=retencionesporpagarporretenciones.getperiodo_descripcion();
			} else {
				//sDescripcion=this.getActualPeriodoForeignKeyDescripcion((Long)value);
				sDescripcion=retencionesporpagarporretenciones.getperiodo_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		RetencionesPorPagarPorRetenciones retencionesporpagarporretencionesRow=new RetencionesPorPagarPorRetenciones();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			retencionesporpagarporretencionesRow=(RetencionesPorPagarPorRetenciones) retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			retencionesporpagarporretencionesRow=(RetencionesPorPagarPorRetenciones) retencionesporpagarporretencioness.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualRetencionesPorPagarPorRetenciones(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoRetencionesPorPagarPorRetenciones.setVisible((this.isVisibilidadCeldaNuevoRetencionesPorPagarPorRetenciones && this.isPermisoNuevoRetencionesPorPagarPorRetenciones));			
			this.jButtonDuplicarRetencionesPorPagarPorRetenciones.setVisible((this.isVisibilidadCeldaDuplicarRetencionesPorPagarPorRetenciones && this.isPermisoDuplicarRetencionesPorPagarPorRetenciones));			
			this.jButtonCopiarRetencionesPorPagarPorRetenciones.setVisible((this.isVisibilidadCeldaCopiarRetencionesPorPagarPorRetenciones && this.isPermisoCopiarRetencionesPorPagarPorRetenciones));
			this.jButtonVerFormRetencionesPorPagarPorRetenciones.setVisible((this.isVisibilidadCeldaVerFormRetencionesPorPagarPorRetenciones && this.isPermisoVerFormRetencionesPorPagarPorRetenciones));
			
			this.jButtonAbrirOrderByRetencionesPorPagarPorRetenciones.setVisible((this.isVisibilidadCeldaOrdenRetencionesPorPagarPorRetenciones && this.isPermisoOrdenRetencionesPorPagarPorRetenciones));			
			
			this.jButtonNuevoRelacionesRetencionesPorPagarPorRetenciones.setVisible((this.isVisibilidadCeldaNuevoRelacionesRetencionesPorPagarPorRetenciones && this.isPermisoNuevoRetencionesPorPagarPorRetenciones));			
			this.jButtonNuevoGuardarCambiosRetencionesPorPagarPorRetenciones.setVisible((this.isVisibilidadCeldaNuevoRetencionesPorPagarPorRetenciones && this.isPermisoNuevoRetencionesPorPagarPorRetenciones && this.isPermisoGuardarCambiosRetencionesPorPagarPorRetenciones));
			
			if(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones!=null) {
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonModificarRetencionesPorPagarPorRetenciones.setVisible((this.isVisibilidadCeldaModificarRetencionesPorPagarPorRetenciones && this.isPermisoActualizarRetencionesPorPagarPorRetenciones));	
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonActualizarRetencionesPorPagarPorRetenciones.setVisible((this.isVisibilidadCeldaActualizarRetencionesPorPagarPorRetenciones && this.isPermisoActualizarRetencionesPorPagarPorRetenciones));	
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonEliminarRetencionesPorPagarPorRetenciones.setVisible((this.isVisibilidadCeldaEliminarRetencionesPorPagarPorRetenciones && this.isPermisoEliminarRetencionesPorPagarPorRetenciones));
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonCancelarRetencionesPorPagarPorRetenciones.setVisible(this.isVisibilidadCeldaCancelarRetencionesPorPagarPorRetenciones);							
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonGuardarCambiosRetencionesPorPagarPorRetenciones.setVisible((this.isVisibilidadCeldaGuardarRetencionesPorPagarPorRetenciones && this.isPermisoGuardarCambiosRetencionesPorPagarPorRetenciones));			
			
			}
						
			this.jButtonGuardarCambiosTablaRetencionesPorPagarPorRetenciones.setVisible((this.isVisibilidadCeldaGuardarCambiosRetencionesPorPagarPorRetenciones && this.isPermisoGuardarCambiosRetencionesPorPagarPorRetenciones));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarRetencionesPorPagarPorRetenciones.setVisible((this.isVisibilidadCeldaNuevoRetencionesPorPagarPorRetenciones && this.isPermisoNuevoRetencionesPorPagarPorRetenciones));						
			this.jButtonDuplicarToolBarRetencionesPorPagarPorRetenciones.setVisible((this.isVisibilidadCeldaDuplicarRetencionesPorPagarPorRetenciones && this.isPermisoDuplicarRetencionesPorPagarPorRetenciones));						
			this.jButtonCopiarToolBarRetencionesPorPagarPorRetenciones.setVisible((this.isVisibilidadCeldaCopiarRetencionesPorPagarPorRetenciones && this.isPermisoCopiarRetencionesPorPagarPorRetenciones));			
			this.jButtonVerFormToolBarRetencionesPorPagarPorRetenciones.setVisible((this.isVisibilidadCeldaVerFormRetencionesPorPagarPorRetenciones && this.isPermisoVerFormRetencionesPorPagarPorRetenciones));			
			this.jButtonAbrirOrderByToolBarRetencionesPorPagarPorRetenciones.setVisible((this.isVisibilidadCeldaOrdenRetencionesPorPagarPorRetenciones && this.isPermisoOrdenRetencionesPorPagarPorRetenciones));
			this.jButtonNuevoRelacionesToolBarRetencionesPorPagarPorRetenciones.setVisible((this.isVisibilidadCeldaNuevoRelacionesRetencionesPorPagarPorRetenciones && this.isPermisoNuevoRetencionesPorPagarPorRetenciones));			
			this.jButtonNuevoGuardarCambiosToolBarRetencionesPorPagarPorRetenciones.setVisible((this.isVisibilidadCeldaNuevoRetencionesPorPagarPorRetenciones && this.isPermisoNuevoRetencionesPorPagarPorRetenciones && this.isPermisoGuardarCambiosRetencionesPorPagarPorRetenciones));			
			
			if(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones!=null) {
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonModificarToolBarRetencionesPorPagarPorRetenciones.setVisible((this.isVisibilidadCeldaModificarRetencionesPorPagarPorRetenciones && this.isPermisoActualizarRetencionesPorPagarPorRetenciones));	
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonActualizarToolBarRetencionesPorPagarPorRetenciones.setVisible((this.isVisibilidadCeldaActualizarRetencionesPorPagarPorRetenciones  && this.isPermisoActualizarRetencionesPorPagarPorRetenciones));	
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonEliminarToolBarRetencionesPorPagarPorRetenciones.setVisible((this.isVisibilidadCeldaEliminarRetencionesPorPagarPorRetenciones && this.isPermisoEliminarRetencionesPorPagarPorRetenciones));
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonCancelarToolBarRetencionesPorPagarPorRetenciones.setVisible(this.isVisibilidadCeldaCancelarRetencionesPorPagarPorRetenciones);				
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonGuardarCambiosToolBarRetencionesPorPagarPorRetenciones.setVisible((this.isVisibilidadCeldaGuardarRetencionesPorPagarPorRetenciones && this.isPermisoGuardarCambiosRetencionesPorPagarPorRetenciones));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarRetencionesPorPagarPorRetenciones.setVisible((this.isVisibilidadCeldaGuardarCambiosRetencionesPorPagarPorRetenciones && this.isPermisoGuardarCambiosRetencionesPorPagarPorRetenciones));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoRetencionesPorPagarPorRetenciones.setVisible((this.isVisibilidadCeldaNuevoRetencionesPorPagarPorRetenciones && this.isPermisoNuevoRetencionesPorPagarPorRetenciones));			
			this.jMenuItemDuplicarRetencionesPorPagarPorRetenciones.setVisible((this.isVisibilidadCeldaDuplicarRetencionesPorPagarPorRetenciones && this.isPermisoDuplicarRetencionesPorPagarPorRetenciones));			
			this.jMenuItemCopiarRetencionesPorPagarPorRetenciones.setVisible((this.isVisibilidadCeldaCopiarRetencionesPorPagarPorRetenciones && this.isPermisoCopiarRetencionesPorPagarPorRetenciones));			
			this.jMenuItemVerFormRetencionesPorPagarPorRetenciones.setVisible((this.isVisibilidadCeldaVerFormRetencionesPorPagarPorRetenciones && this.isPermisoVerFormRetencionesPorPagarPorRetenciones));			
			this.jMenuItemAbrirOrderByRetencionesPorPagarPorRetenciones.setVisible((this.isVisibilidadCeldaOrdenRetencionesPorPagarPorRetenciones && this.isPermisoOrdenRetencionesPorPagarPorRetenciones));			
			//this.jMenuItemMostrarOcultarRetencionesPorPagarPorRetenciones.setVisible((this.isVisibilidadCeldaOrdenRetencionesPorPagarPorRetenciones && this.isPermisoOrdenRetencionesPorPagarPorRetenciones));
			this.jMenuItemDetalleAbrirOrderByRetencionesPorPagarPorRetenciones.setVisible((this.isVisibilidadCeldaOrdenRetencionesPorPagarPorRetenciones && this.isPermisoOrdenRetencionesPorPagarPorRetenciones));			
			//this.jMenuItemDetalleMostrarOcultarRetencionesPorPagarPorRetenciones.setVisible((this.isVisibilidadCeldaOrdenRetencionesPorPagarPorRetenciones && this.isPermisoOrdenRetencionesPorPagarPorRetenciones));			
			this.jMenuItemNuevoRelacionesRetencionesPorPagarPorRetenciones.setVisible((this.isVisibilidadCeldaNuevoRelacionesRetencionesPorPagarPorRetenciones && this.isPermisoNuevoRetencionesPorPagarPorRetenciones));			
			this.jMenuItemNuevoGuardarCambiosRetencionesPorPagarPorRetenciones.setVisible((this.isVisibilidadCeldaNuevoRetencionesPorPagarPorRetenciones && this.isPermisoNuevoRetencionesPorPagarPorRetenciones && this.isPermisoGuardarCambiosRetencionesPorPagarPorRetenciones));									
			
			if(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones!=null) {
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jMenuItemModificarRetencionesPorPagarPorRetenciones.setVisible((this.isVisibilidadCeldaModificarRetencionesPorPagarPorRetenciones && this.isPermisoActualizarRetencionesPorPagarPorRetenciones));	
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jMenuItemActualizarRetencionesPorPagarPorRetenciones.setVisible((this.isVisibilidadCeldaActualizarRetencionesPorPagarPorRetenciones && this.isPermisoActualizarRetencionesPorPagarPorRetenciones));	
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jMenuItemEliminarRetencionesPorPagarPorRetenciones.setVisible((this.isVisibilidadCeldaEliminarRetencionesPorPagarPorRetenciones && this.isPermisoEliminarRetencionesPorPagarPorRetenciones));
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jMenuItemCancelarRetencionesPorPagarPorRetenciones.setVisible(this.isVisibilidadCeldaCancelarRetencionesPorPagarPorRetenciones);				
			}
			
			this.jMenuItemGuardarCambiosRetencionesPorPagarPorRetenciones.setVisible((this.isVisibilidadCeldaGuardarRetencionesPorPagarPorRetenciones && this.isPermisoGuardarCambiosRetencionesPorPagarPorRetenciones));						
			this.jMenuItemGuardarCambiosTablaRetencionesPorPagarPorRetenciones.setVisible((this.isVisibilidadCeldaGuardarCambiosRetencionesPorPagarPorRetenciones && this.isPermisoGuardarCambiosRetencionesPorPagarPorRetenciones));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoRetencionesPorPagarPorRetenciones=this.jButtonNuevoRetencionesPorPagarPorRetenciones.isVisible();
			this.isVisibilidadCeldaDuplicarRetencionesPorPagarPorRetenciones=this.jButtonDuplicarRetencionesPorPagarPorRetenciones.isVisible();
			this.isVisibilidadCeldaCopiarRetencionesPorPagarPorRetenciones=this.jButtonCopiarRetencionesPorPagarPorRetenciones.isVisible();
			this.isVisibilidadCeldaVerFormRetencionesPorPagarPorRetenciones=this.jButtonVerFormRetencionesPorPagarPorRetenciones.isVisible();
			
			this.isVisibilidadCeldaOrdenRetencionesPorPagarPorRetenciones=this.jButtonAbrirOrderByRetencionesPorPagarPorRetenciones.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesRetencionesPorPagarPorRetenciones=this.jButtonNuevoRelacionesRetencionesPorPagarPorRetenciones.isVisible();
			this.isVisibilidadCeldaModificarRetencionesPorPagarPorRetenciones=this.jButtonModificarRetencionesPorPagarPorRetenciones.isVisible();
			
			if(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones!=null) {
			this.isVisibilidadCeldaActualizarRetencionesPorPagarPorRetenciones=this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonActualizarRetencionesPorPagarPorRetenciones.isVisible();
			this.isVisibilidadCeldaEliminarRetencionesPorPagarPorRetenciones=this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonEliminarRetencionesPorPagarPorRetenciones.isVisible();
			this.isVisibilidadCeldaCancelarRetencionesPorPagarPorRetenciones=this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonCancelarRetencionesPorPagarPorRetenciones.isVisible();
			this.isVisibilidadCeldaGuardarRetencionesPorPagarPorRetenciones=this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonGuardarCambiosRetencionesPorPagarPorRetenciones.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosRetencionesPorPagarPorRetenciones=this.jButtonGuardarCambiosTablaRetencionesPorPagarPorRetenciones.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoRetencionesPorPagarPorRetenciones=this.jButtonNuevoToolBarRetencionesPorPagarPorRetenciones.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesRetencionesPorPagarPorRetenciones=this.jButtonNuevoRelacionesToolBarRetencionesPorPagarPorRetenciones.isVisible();
			
			if(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones!=null) {
			this.isVisibilidadCeldaModificarRetencionesPorPagarPorRetenciones=this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonModificarToolBarRetencionesPorPagarPorRetenciones.isVisible();
			this.isVisibilidadCeldaActualizarRetencionesPorPagarPorRetenciones=this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonActualizarToolBarRetencionesPorPagarPorRetenciones.isVisible();
			this.isVisibilidadCeldaEliminarRetencionesPorPagarPorRetenciones=this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonEliminarToolBarRetencionesPorPagarPorRetenciones.isVisible();
			this.isVisibilidadCeldaCancelarRetencionesPorPagarPorRetenciones=this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonCancelarToolBarRetencionesPorPagarPorRetenciones.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarRetencionesPorPagarPorRetenciones=this.jButtonGuardarCambiosToolBarRetencionesPorPagarPorRetenciones.isVisible();
			this.isVisibilidadCeldaGuardarCambiosRetencionesPorPagarPorRetenciones=this.jButtonGuardarCambiosTablaToolBarRetencionesPorPagarPorRetenciones.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoRetencionesPorPagarPorRetenciones=this.jMenuItemNuevoRetencionesPorPagarPorRetenciones.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesRetencionesPorPagarPorRetenciones=this.jMenuItemNuevoRelacionesRetencionesPorPagarPorRetenciones.isVisible();
			
			if(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones!=null) {
			this.isVisibilidadCeldaModificarRetencionesPorPagarPorRetenciones=this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jMenuItemModificarRetencionesPorPagarPorRetenciones.isVisible();
			this.isVisibilidadCeldaActualizarRetencionesPorPagarPorRetenciones=this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jMenuItemActualizarRetencionesPorPagarPorRetenciones.isVisible();
			this.isVisibilidadCeldaEliminarRetencionesPorPagarPorRetenciones=this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jMenuItemEliminarRetencionesPorPagarPorRetenciones.isVisible();
			this.isVisibilidadCeldaCancelarRetencionesPorPagarPorRetenciones=this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jMenuItemCancelarRetencionesPorPagarPorRetenciones.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarRetencionesPorPagarPorRetenciones=this.jMenuItemGuardarCambiosRetencionesPorPagarPorRetenciones.isVisible();
			this.isVisibilidadCeldaGuardarCambiosRetencionesPorPagarPorRetenciones=this.jMenuItemGuardarCambiosTablaRetencionesPorPagarPorRetenciones.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesRetencionesPorPagarPorRetenciones(Boolean esInicializar) {
		if(RetencionesPorPagarPorRetencionesJInternalFrame.ISBINDING_MANUAL) {			
			if(this.retencionesporpagarporretencionesSessionBean.getConGuardarRelaciones()) {
				//if(this.retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesRetencionesPorPagarPorRetenciones();
			}
			
			this.inicializarActualizarBindingBotonesManualRetencionesPorPagarPorRetenciones(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualRetencionesPorPagarPorRetenciones() {
		this.jButtonNuevoRetencionesPorPagarPorRetenciones.setVisible(this.isPermisoNuevoRetencionesPorPagarPorRetenciones);			
		this.jButtonDuplicarRetencionesPorPagarPorRetenciones.setVisible(this.isPermisoDuplicarRetencionesPorPagarPorRetenciones);			
		this.jButtonCopiarRetencionesPorPagarPorRetenciones.setVisible(this.isPermisoCopiarRetencionesPorPagarPorRetenciones);			
		this.jButtonVerFormRetencionesPorPagarPorRetenciones.setVisible(this.isPermisoVerFormRetencionesPorPagarPorRetenciones);			
		
		this.jButtonAbrirOrderByRetencionesPorPagarPorRetenciones.setVisible(this.isPermisoOrdenRetencionesPorPagarPorRetenciones);					
		
		this.jButtonNuevoRelacionesRetencionesPorPagarPorRetenciones.setVisible(this.isPermisoNuevoRetencionesPorPagarPorRetenciones);			
		
		if(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonModificarRetencionesPorPagarPorRetenciones.setVisible(this.isPermisoActualizarRetencionesPorPagarPorRetenciones);	
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonActualizarRetencionesPorPagarPorRetenciones.setVisible(this.isPermisoActualizarRetencionesPorPagarPorRetenciones);	
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonEliminarRetencionesPorPagarPorRetenciones.setVisible(this.isPermisoEliminarRetencionesPorPagarPorRetenciones);
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonCancelarRetencionesPorPagarPorRetenciones.setVisible(this.isVisibilidadCeldaCancelarRetencionesPorPagarPorRetenciones);						
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonGuardarCambiosRetencionesPorPagarPorRetenciones.setVisible(this.isPermisoGuardarCambiosRetencionesPorPagarPorRetenciones);							
		}
		
		this.jButtonGuardarCambiosTablaRetencionesPorPagarPorRetenciones.setVisible(this.isPermisoActualizarRetencionesPorPagarPorRetenciones);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleRetencionesPorPagarPorRetenciones() {
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonModificarRetencionesPorPagarPorRetenciones.setVisible(this.isPermisoActualizarRetencionesPorPagarPorRetenciones);	
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonActualizarRetencionesPorPagarPorRetenciones.setVisible(this.isPermisoActualizarRetencionesPorPagarPorRetenciones);	
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonEliminarRetencionesPorPagarPorRetenciones.setVisible(this.isPermisoEliminarRetencionesPorPagarPorRetenciones);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonCancelarRetencionesPorPagarPorRetenciones.setVisible(this.isVisibilidadCeldaCancelarRetencionesPorPagarPorRetenciones);							
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonGuardarCambiosRetencionesPorPagarPorRetenciones.setVisible((this.isVisibilidadCeldaGuardarRetencionesPorPagarPorRetenciones && this.isPermisoGuardarCambiosRetencionesPorPagarPorRetenciones));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosRetencionesPorPagarPorRetenciones() {
		if(RetencionesPorPagarPorRetencionesJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualRetencionesPorPagarPorRetenciones();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesRetencionesPorPagarPorRetenciones() {
	}
	
	public void jTableDatosRetencionesPorPagarPorRetencionesListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarRetencionesPorPagarPorRetenciones(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidRetencionesPorPagarPorRetencionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretencionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRetencionesPorPagarPorRetenciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorRetenciones(this.getretencionesporpagarporretenciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretenciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.retencionesporpagarporretenciones =(RetencionesPorPagarPorRetenciones) this.retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness().toArray()[this.jTableDatosRetencionesPorPagarPorRetenciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.retencionesporpagarporretenciones =(RetencionesPorPagarPorRetenciones) this.retencionesporpagarporretencioness.toArray()[this.jTableDatosRetencionesPorPagarPorRetenciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.retencionesporpagarporretenciones==null) {
						this.retencionesporpagarporretenciones = new RetencionesPorPagarPorRetenciones();
					}

					this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretenciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretenciones);
				}

				if(this.retencionesporpagarporretenciones.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.retencionesporpagarporretenciones.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRetencionesPorPagarPorRetenciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretencionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretencionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretencionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaRetencionesPorPagarPorRetencionesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporretencionesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebRetencionesPorPagarPorRetenciones(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRetencionesPorPagarPorRetenciones.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosRetencionesPorPagarPorRetenciones.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosRetencionesPorPagarPorRetenciones.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretenciones =(RetencionesPorPagarPorRetenciones) this.retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness().toArray()[this.jTableDatosRetencionesPorPagarPorRetenciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.retencionesporpagarporretenciones =(RetencionesPorPagarPorRetenciones) this.retencionesporpagarporretencioness.toArray()[this.jTableDatosRetencionesPorPagarPorRetenciones.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorRetenciones(this.getretencionesporpagarporretenciones(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretenciones);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.retencionesporpagarporretencionesLogic.getConnexion());

				if(this.retencionesporpagarporretenciones.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.retencionesporpagarporretenciones.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderRetencionesPorPagarPorRetenciones=(TitledBorder)this.jScrollPanelDatosRetencionesPorPagarPorRetenciones.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderRetencionesPorPagarPorRetenciones.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporretencionesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporretencionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporretencionesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaRetencionesPorPagarPorRetencionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretencionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRetencionesPorPagarPorRetenciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorRetenciones(this.getretencionesporpagarporretenciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretenciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.retencionesporpagarporretenciones =(RetencionesPorPagarPorRetenciones) this.retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness().toArray()[this.jTableDatosRetencionesPorPagarPorRetenciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.retencionesporpagarporretenciones =(RetencionesPorPagarPorRetenciones) this.retencionesporpagarporretencioness.toArray()[this.jTableDatosRetencionesPorPagarPorRetenciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.retencionesporpagarporretenciones==null) {
						this.retencionesporpagarporretenciones = new RetencionesPorPagarPorRetenciones();
					}

					this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretenciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretenciones);
				}

				if(this.retencionesporpagarporretenciones.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.retencionesporpagarporretenciones.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRetencionesPorPagarPorRetenciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretencionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretencionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretencionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalRetencionesPorPagarPorRetencionesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporretencionesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebRetencionesPorPagarPorRetenciones(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRetencionesPorPagarPorRetenciones.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosRetencionesPorPagarPorRetenciones.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosRetencionesPorPagarPorRetenciones.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretenciones =(RetencionesPorPagarPorRetenciones) this.retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness().toArray()[this.jTableDatosRetencionesPorPagarPorRetenciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.retencionesporpagarporretenciones =(RetencionesPorPagarPorRetenciones) this.retencionesporpagarporretencioness.toArray()[this.jTableDatosRetencionesPorPagarPorRetenciones.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorRetenciones(this.getretencionesporpagarporretenciones(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretenciones);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.retencionesporpagarporretencionesLogic.getConnexion());

				if(this.retencionesporpagarporretenciones.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.retencionesporpagarporretenciones.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderRetencionesPorPagarPorRetenciones=(TitledBorder)this.jScrollPanelDatosRetencionesPorPagarPorRetenciones.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderRetencionesPorPagarPorRetenciones.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporretencionesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporretencionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporretencionesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalRetencionesPorPagarPorRetencionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretencionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRetencionesPorPagarPorRetenciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorRetenciones(this.getretencionesporpagarporretenciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretenciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.retencionesporpagarporretenciones =(RetencionesPorPagarPorRetenciones) this.retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness().toArray()[this.jTableDatosRetencionesPorPagarPorRetenciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.retencionesporpagarporretenciones =(RetencionesPorPagarPorRetenciones) this.retencionesporpagarporretencioness.toArray()[this.jTableDatosRetencionesPorPagarPorRetenciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.retencionesporpagarporretenciones==null) {
						this.retencionesporpagarporretenciones = new RetencionesPorPagarPorRetenciones();
					}

					this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretenciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretenciones);
				}

				if(this.retencionesporpagarporretenciones.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.retencionesporpagarporretenciones.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRetencionesPorPagarPorRetenciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretencionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretencionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretencionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ejercicioRetencionesPorPagarPorRetencionesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporretencionesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoejercicio=true;

			idTienePermisoejercicio=this.tienePermisosUsuarioEnPaginaWebRetencionesPorPagarPorRetenciones(EjercicioConstantesFunciones.CLASSNAME);

			if(idTienePermisoejercicio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRetencionesPorPagarPorRetenciones.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosRetencionesPorPagarPorRetenciones.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosRetencionesPorPagarPorRetenciones.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretenciones =(RetencionesPorPagarPorRetenciones) this.retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness().toArray()[this.jTableDatosRetencionesPorPagarPorRetenciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.retencionesporpagarporretenciones =(RetencionesPorPagarPorRetenciones) this.retencionesporpagarporretencioness.toArray()[this.jTableDatosRetencionesPorPagarPorRetenciones.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorRetenciones(this.getretencionesporpagarporretenciones(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretenciones);

				this.ejercicioBeanSwingJInternalFrame=new EjercicioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ejercicioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ejercicioBeanSwingJInternalFrame.getEjercicioLogic().setConnexion(this.retencionesporpagarporretencionesLogic.getConnexion());

				if(this.retencionesporpagarporretenciones.getid_ejercicio()!=null) {
					this.ejercicioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ejercicioBeanSwingJInternalFrame.setIdActual(this.retencionesporpagarporretenciones.getid_ejercicio());
					this.ejercicioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.inicializarActualizarBindingTablaEjercicio();
				}

				JInternalFrameBase jinternalFrame =this.ejercicioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderRetencionesPorPagarPorRetenciones=(TitledBorder)this.jScrollPanelDatosRetencionesPorPagarPorRetenciones.getBorder();
				TitledBorder titledBorderejercicio=(TitledBorder)this.ejercicioBeanSwingJInternalFrame.jScrollPanelDatosEjercicio.getBorder();

				titledBorderejercicio.setTitle(titledBorderRetencionesPorPagarPorRetenciones.getTitle() + " -> Ejercicio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporretencionesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporretencionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporretencionesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ejercicioRetencionesPorPagarPorRetencionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretencionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRetencionesPorPagarPorRetenciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorRetenciones(this.getretencionesporpagarporretenciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretenciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.retencionesporpagarporretenciones =(RetencionesPorPagarPorRetenciones) this.retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness().toArray()[this.jTableDatosRetencionesPorPagarPorRetenciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.retencionesporpagarporretenciones =(RetencionesPorPagarPorRetenciones) this.retencionesporpagarporretencioness.toArray()[this.jTableDatosRetencionesPorPagarPorRetenciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.retencionesporpagarporretenciones==null) {
						this.retencionesporpagarporretenciones = new RetencionesPorPagarPorRetenciones();
					}

					this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretenciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretenciones);
				}

				if(this.retencionesporpagarporretenciones.getid_ejercicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ejercicio = "+this.retencionesporpagarporretenciones.getid_ejercicio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRetencionesPorPagarPorRetenciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretencionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretencionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretencionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_periodoRetencionesPorPagarPorRetencionesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporretencionesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoperiodo=true;

			idTienePermisoperiodo=this.tienePermisosUsuarioEnPaginaWebRetencionesPorPagarPorRetenciones(PeriodoConstantesFunciones.CLASSNAME);

			if(idTienePermisoperiodo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRetencionesPorPagarPorRetenciones.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosRetencionesPorPagarPorRetenciones.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosRetencionesPorPagarPorRetenciones.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretenciones =(RetencionesPorPagarPorRetenciones) this.retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness().toArray()[this.jTableDatosRetencionesPorPagarPorRetenciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.retencionesporpagarporretenciones =(RetencionesPorPagarPorRetenciones) this.retencionesporpagarporretencioness.toArray()[this.jTableDatosRetencionesPorPagarPorRetenciones.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorRetenciones(this.getretencionesporpagarporretenciones(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretenciones);

				this.periodoBeanSwingJInternalFrame=new PeriodoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.periodoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.periodoBeanSwingJInternalFrame.getPeriodoLogic().setConnexion(this.retencionesporpagarporretencionesLogic.getConnexion());

				if(this.retencionesporpagarporretenciones.getid_periodo()!=null) {
					this.periodoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.periodoBeanSwingJInternalFrame.setIdActual(this.retencionesporpagarporretenciones.getid_periodo());
					this.periodoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.inicializarActualizarBindingTablaPeriodo();
				}

				JInternalFrameBase jinternalFrame =this.periodoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderRetencionesPorPagarPorRetenciones=(TitledBorder)this.jScrollPanelDatosRetencionesPorPagarPorRetenciones.getBorder();
				TitledBorder titledBorderperiodo=(TitledBorder)this.periodoBeanSwingJInternalFrame.jScrollPanelDatosPeriodo.getBorder();

				titledBorderperiodo.setTitle(titledBorderRetencionesPorPagarPorRetenciones.getTitle() + " -> Periodo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporretencionesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporretencionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporretencionesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_periodoRetencionesPorPagarPorRetencionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretencionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRetencionesPorPagarPorRetenciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorRetenciones(this.getretencionesporpagarporretenciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretenciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.retencionesporpagarporretenciones =(RetencionesPorPagarPorRetenciones) this.retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness().toArray()[this.jTableDatosRetencionesPorPagarPorRetenciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.retencionesporpagarporretenciones =(RetencionesPorPagarPorRetenciones) this.retencionesporpagarporretencioness.toArray()[this.jTableDatosRetencionesPorPagarPorRetenciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.retencionesporpagarporretenciones==null) {
						this.retencionesporpagarporretenciones = new RetencionesPorPagarPorRetenciones();
					}

					this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretenciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretenciones);
				}

				if(this.retencionesporpagarporretenciones.getid_periodo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_periodo = "+this.retencionesporpagarporretenciones.getid_periodo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRetencionesPorPagarPorRetenciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretencionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretencionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretencionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtones_debitoRetencionesPorPagarPorRetencionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretencionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRetencionesPorPagarPorRetenciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorRetenciones(this.getretencionesporpagarporretenciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretenciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.retencionesporpagarporretenciones =(RetencionesPorPagarPorRetenciones) this.retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness().toArray()[this.jTableDatosRetencionesPorPagarPorRetenciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.retencionesporpagarporretenciones =(RetencionesPorPagarPorRetenciones) this.retencionesporpagarporretencioness.toArray()[this.jTableDatosRetencionesPorPagarPorRetenciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.retencionesporpagarporretenciones==null) {
						this.retencionesporpagarporretenciones = new RetencionesPorPagarPorRetenciones();
					}

					this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretenciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretenciones);
				}

				if(this.retencionesporpagarporretenciones.getes_debito()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where es_debito = "+this.retencionesporpagarporretenciones.getes_debito().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRetencionesPorPagarPorRetenciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretencionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretencionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretencionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emisionRetencionesPorPagarPorRetencionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretencionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRetencionesPorPagarPorRetenciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorRetenciones(this.getretencionesporpagarporretenciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretenciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.retencionesporpagarporretenciones =(RetencionesPorPagarPorRetenciones) this.retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness().toArray()[this.jTableDatosRetencionesPorPagarPorRetenciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.retencionesporpagarporretenciones =(RetencionesPorPagarPorRetenciones) this.retencionesporpagarporretencioness.toArray()[this.jTableDatosRetencionesPorPagarPorRetenciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.retencionesporpagarporretenciones==null) {
						this.retencionesporpagarporretenciones = new RetencionesPorPagarPorRetenciones();
					}

					this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretenciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretenciones);
				}

				if(this.retencionesporpagarporretenciones.getfecha_emision()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision = '"+Funciones2.getStringPostgresDate(this.retencionesporpagarporretenciones.getfecha_emision())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRetencionesPorPagarPorRetenciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretencionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretencionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretencionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_tipo_movimientoRetencionesPorPagarPorRetencionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretencionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRetencionesPorPagarPorRetenciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorRetenciones(this.getretencionesporpagarporretenciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretenciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.retencionesporpagarporretenciones =(RetencionesPorPagarPorRetenciones) this.retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness().toArray()[this.jTableDatosRetencionesPorPagarPorRetenciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.retencionesporpagarporretenciones =(RetencionesPorPagarPorRetenciones) this.retencionesporpagarporretencioness.toArray()[this.jTableDatosRetencionesPorPagarPorRetenciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.retencionesporpagarporretenciones==null) {
						this.retencionesporpagarporretenciones = new RetencionesPorPagarPorRetenciones();
					}

					this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretenciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretenciones);
				}

				if(this.retencionesporpagarporretenciones.getnombre_tipo_movimiento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_tipo_movimiento like '%"+this.retencionesporpagarporretenciones.getnombre_tipo_movimiento()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRetencionesPorPagarPorRetenciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretencionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretencionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretencionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_mayorRetencionesPorPagarPorRetencionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretencionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRetencionesPorPagarPorRetenciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorRetenciones(this.getretencionesporpagarporretenciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretenciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.retencionesporpagarporretenciones =(RetencionesPorPagarPorRetenciones) this.retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness().toArray()[this.jTableDatosRetencionesPorPagarPorRetenciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.retencionesporpagarporretenciones =(RetencionesPorPagarPorRetenciones) this.retencionesporpagarporretencioness.toArray()[this.jTableDatosRetencionesPorPagarPorRetenciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.retencionesporpagarporretenciones==null) {
						this.retencionesporpagarporretenciones = new RetencionesPorPagarPorRetenciones();
					}

					this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretenciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretenciones);
				}

				if(this.retencionesporpagarporretenciones.getnumero_mayor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_mayor like '%"+this.retencionesporpagarporretenciones.getnumero_mayor()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRetencionesPorPagarPorRetenciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretencionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretencionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretencionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_cuenta_contable_retencionRetencionesPorPagarPorRetencionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretencionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRetencionesPorPagarPorRetenciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorRetenciones(this.getretencionesporpagarporretenciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretenciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.retencionesporpagarporretenciones =(RetencionesPorPagarPorRetenciones) this.retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness().toArray()[this.jTableDatosRetencionesPorPagarPorRetenciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.retencionesporpagarporretenciones =(RetencionesPorPagarPorRetenciones) this.retencionesporpagarporretencioness.toArray()[this.jTableDatosRetencionesPorPagarPorRetenciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.retencionesporpagarporretenciones==null) {
						this.retencionesporpagarporretenciones = new RetencionesPorPagarPorRetenciones();
					}

					this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretenciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretenciones);
				}

				if(this.retencionesporpagarporretenciones.getnombre_cuenta_contable_retencion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_cuenta_contable_retencion like '%"+this.retencionesporpagarporretenciones.getnombre_cuenta_contable_retencion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRetencionesPorPagarPorRetenciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretencionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretencionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretencionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_pre_impreso_facturaRetencionesPorPagarPorRetencionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretencionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRetencionesPorPagarPorRetenciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorRetenciones(this.getretencionesporpagarporretenciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretenciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.retencionesporpagarporretenciones =(RetencionesPorPagarPorRetenciones) this.retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness().toArray()[this.jTableDatosRetencionesPorPagarPorRetenciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.retencionesporpagarporretenciones =(RetencionesPorPagarPorRetenciones) this.retencionesporpagarporretencioness.toArray()[this.jTableDatosRetencionesPorPagarPorRetenciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.retencionesporpagarporretenciones==null) {
						this.retencionesporpagarporretenciones = new RetencionesPorPagarPorRetenciones();
					}

					this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretenciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretenciones);
				}

				if(this.retencionesporpagarporretenciones.getnumero_pre_impreso_factura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_pre_impreso_factura like '%"+this.retencionesporpagarporretenciones.getnumero_pre_impreso_factura()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRetencionesPorPagarPorRetenciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretencionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretencionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretencionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonporcentajeRetencionesPorPagarPorRetencionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretencionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRetencionesPorPagarPorRetenciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorRetenciones(this.getretencionesporpagarporretenciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretenciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.retencionesporpagarporretenciones =(RetencionesPorPagarPorRetenciones) this.retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness().toArray()[this.jTableDatosRetencionesPorPagarPorRetenciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.retencionesporpagarporretenciones =(RetencionesPorPagarPorRetenciones) this.retencionesporpagarporretencioness.toArray()[this.jTableDatosRetencionesPorPagarPorRetenciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.retencionesporpagarporretenciones==null) {
						this.retencionesporpagarporretenciones = new RetencionesPorPagarPorRetenciones();
					}

					this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretenciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretenciones);
				}

				if(this.retencionesporpagarporretenciones.getporcentaje()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where porcentaje = "+this.retencionesporpagarporretenciones.getporcentaje().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRetencionesPorPagarPorRetenciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretencionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretencionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretencionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonbase_imponibleRetencionesPorPagarPorRetencionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretencionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRetencionesPorPagarPorRetenciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorRetenciones(this.getretencionesporpagarporretenciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretenciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.retencionesporpagarporretenciones =(RetencionesPorPagarPorRetenciones) this.retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness().toArray()[this.jTableDatosRetencionesPorPagarPorRetenciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.retencionesporpagarporretenciones =(RetencionesPorPagarPorRetenciones) this.retencionesporpagarporretencioness.toArray()[this.jTableDatosRetencionesPorPagarPorRetenciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.retencionesporpagarporretenciones==null) {
						this.retencionesporpagarporretenciones = new RetencionesPorPagarPorRetenciones();
					}

					this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretenciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretenciones);
				}

				if(this.retencionesporpagarporretenciones.getbase_imponible()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where base_imponible = "+this.retencionesporpagarporretenciones.getbase_imponible().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRetencionesPorPagarPorRetenciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretencionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretencionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretencionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalorRetencionesPorPagarPorRetencionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretencionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRetencionesPorPagarPorRetenciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorRetenciones(this.getretencionesporpagarporretenciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretenciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.retencionesporpagarporretenciones =(RetencionesPorPagarPorRetenciones) this.retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness().toArray()[this.jTableDatosRetencionesPorPagarPorRetenciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.retencionesporpagarporretenciones =(RetencionesPorPagarPorRetenciones) this.retencionesporpagarporretencioness.toArray()[this.jTableDatosRetencionesPorPagarPorRetenciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.retencionesporpagarporretenciones==null) {
						this.retencionesporpagarporretenciones = new RetencionesPorPagarPorRetenciones();
					}

					this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretenciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretenciones);
				}

				if(this.retencionesporpagarporretenciones.getvalor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor = "+this.retencionesporpagarporretenciones.getvalor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRetencionesPorPagarPorRetenciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretencionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretencionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretencionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumeroRetencionesPorPagarPorRetencionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretencionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRetencionesPorPagarPorRetenciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorRetenciones(this.getretencionesporpagarporretenciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretenciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.retencionesporpagarporretenciones =(RetencionesPorPagarPorRetenciones) this.retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness().toArray()[this.jTableDatosRetencionesPorPagarPorRetenciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.retencionesporpagarporretenciones =(RetencionesPorPagarPorRetenciones) this.retencionesporpagarporretencioness.toArray()[this.jTableDatosRetencionesPorPagarPorRetenciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.retencionesporpagarporretenciones==null) {
						this.retencionesporpagarporretenciones = new RetencionesPorPagarPorRetenciones();
					}

					this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretenciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretenciones);
				}

				if(this.retencionesporpagarporretenciones.getnumero()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero like '%"+this.retencionesporpagarporretenciones.getnumero()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRetencionesPorPagarPorRetenciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretencionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretencionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretencionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_benefRetencionesPorPagarPorRetencionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretencionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRetencionesPorPagarPorRetenciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorRetenciones(this.getretencionesporpagarporretenciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretenciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.retencionesporpagarporretenciones =(RetencionesPorPagarPorRetenciones) this.retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness().toArray()[this.jTableDatosRetencionesPorPagarPorRetenciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.retencionesporpagarporretenciones =(RetencionesPorPagarPorRetenciones) this.retencionesporpagarporretencioness.toArray()[this.jTableDatosRetencionesPorPagarPorRetenciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.retencionesporpagarporretenciones==null) {
						this.retencionesporpagarporretenciones = new RetencionesPorPagarPorRetenciones();
					}

					this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretenciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretenciones);
				}

				if(this.retencionesporpagarporretenciones.getnombre_benef()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_benef like '%"+this.retencionesporpagarporretenciones.getnombre_benef()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRetencionesPorPagarPorRetenciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretencionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretencionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretencionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonruc_benefRetencionesPorPagarPorRetencionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretencionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRetencionesPorPagarPorRetenciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorRetenciones(this.getretencionesporpagarporretenciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretenciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.retencionesporpagarporretenciones =(RetencionesPorPagarPorRetenciones) this.retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness().toArray()[this.jTableDatosRetencionesPorPagarPorRetenciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.retencionesporpagarporretenciones =(RetencionesPorPagarPorRetenciones) this.retencionesporpagarporretencioness.toArray()[this.jTableDatosRetencionesPorPagarPorRetenciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.retencionesporpagarporretenciones==null) {
						this.retencionesporpagarporretenciones = new RetencionesPorPagarPorRetenciones();
					}

					this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretenciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretenciones);
				}

				if(this.retencionesporpagarporretenciones.getruc_benef()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where ruc_benef like '%"+this.retencionesporpagarporretenciones.getruc_benef()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRetencionesPorPagarPorRetenciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretencionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretencionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretencionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_cuenta_contableRetencionesPorPagarPorRetencionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretencionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRetencionesPorPagarPorRetenciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorRetenciones(this.getretencionesporpagarporretenciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretenciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.retencionesporpagarporretenciones =(RetencionesPorPagarPorRetenciones) this.retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness().toArray()[this.jTableDatosRetencionesPorPagarPorRetenciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.retencionesporpagarporretenciones =(RetencionesPorPagarPorRetenciones) this.retencionesporpagarporretencioness.toArray()[this.jTableDatosRetencionesPorPagarPorRetenciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.retencionesporpagarporretenciones==null) {
						this.retencionesporpagarporretenciones = new RetencionesPorPagarPorRetenciones();
					}

					this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretenciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretenciones);
				}

				if(this.retencionesporpagarporretenciones.getnombre_cuenta_contable()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_cuenta_contable like '%"+this.retencionesporpagarporretenciones.getnombre_cuenta_contable()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRetencionesPorPagarPorRetenciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretencionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretencionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretencionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_cuenta_contable_creditoRetencionesPorPagarPorRetencionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretencionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRetencionesPorPagarPorRetenciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorRetenciones(this.getretencionesporpagarporretenciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretenciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.retencionesporpagarporretenciones =(RetencionesPorPagarPorRetenciones) this.retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness().toArray()[this.jTableDatosRetencionesPorPagarPorRetenciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.retencionesporpagarporretenciones =(RetencionesPorPagarPorRetenciones) this.retencionesporpagarporretencioness.toArray()[this.jTableDatosRetencionesPorPagarPorRetenciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.retencionesporpagarporretenciones==null) {
						this.retencionesporpagarporretenciones = new RetencionesPorPagarPorRetenciones();
					}

					this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretenciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretenciones);
				}

				if(this.retencionesporpagarporretenciones.getnombre_cuenta_contable_credito()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_cuenta_contable_credito like '%"+this.retencionesporpagarporretenciones.getnombre_cuenta_contable_credito()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRetencionesPorPagarPorRetenciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretencionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretencionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretencionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtones_debito_datoRetencionesPorPagarPorRetencionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretencionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRetencionesPorPagarPorRetenciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorRetenciones(this.getretencionesporpagarporretenciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretenciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.retencionesporpagarporretenciones =(RetencionesPorPagarPorRetenciones) this.retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness().toArray()[this.jTableDatosRetencionesPorPagarPorRetenciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.retencionesporpagarporretenciones =(RetencionesPorPagarPorRetenciones) this.retencionesporpagarporretencioness.toArray()[this.jTableDatosRetencionesPorPagarPorRetenciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.retencionesporpagarporretenciones==null) {
						this.retencionesporpagarporretenciones = new RetencionesPorPagarPorRetenciones();
					}

					this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretenciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretenciones);
				}

				if(this.retencionesporpagarporretenciones.getes_debito_dato()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where es_debito_dato = "+this.retencionesporpagarporretenciones.getes_debito_dato().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRetencionesPorPagarPorRetenciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretencionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretencionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretencionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetencionesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporretencionesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingRetencionesPorPagarPorRetenciones(false,false);

			this.getRetencionesPorPagarPorRetencionessBusquedaRetencionesPorPagarPorRetenciones();

			this.inicializarActualizarBindingRetencionesPorPagarPorRetenciones(false);

			//if(RetencionesPorPagarPorRetencionesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingRetencionesPorPagarPorRetenciones(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporretencionesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporretencionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporretencionesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEjercicioRetencionesPorPagarPorRetencionesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporretencionesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingRetencionesPorPagarPorRetenciones(false,false);

			this.getRetencionesPorPagarPorRetencionessFK_IdEjercicio();

			this.inicializarActualizarBindingRetencionesPorPagarPorRetenciones(false);

			//if(RetencionesPorPagarPorRetencionesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingRetencionesPorPagarPorRetenciones(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporretencionesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporretencionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporretencionesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaRetencionesPorPagarPorRetencionesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporretencionesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingRetencionesPorPagarPorRetenciones(false,false);

			this.getRetencionesPorPagarPorRetencionessFK_IdEmpresa();

			this.inicializarActualizarBindingRetencionesPorPagarPorRetenciones(false);

			//if(RetencionesPorPagarPorRetencionesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingRetencionesPorPagarPorRetenciones(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporretencionesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporretencionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporretencionesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPeriodoRetencionesPorPagarPorRetencionesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporretencionesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingRetencionesPorPagarPorRetenciones(false,false);

			this.getRetencionesPorPagarPorRetencionessFK_IdPeriodo();

			this.inicializarActualizarBindingRetencionesPorPagarPorRetenciones(false);

			//if(RetencionesPorPagarPorRetencionesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingRetencionesPorPagarPorRetenciones(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporretencionesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporretencionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporretencionesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalRetencionesPorPagarPorRetencionesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporretencionesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingRetencionesPorPagarPorRetenciones(false,false);

			this.getRetencionesPorPagarPorRetencionessFK_IdSucursal();

			this.inicializarActualizarBindingRetencionesPorPagarPorRetenciones(false);

			//if(RetencionesPorPagarPorRetencionesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingRetencionesPorPagarPorRetenciones(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporretencionesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporretencionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporretencionesLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameRetencionesPorPagarPorRetenciones() {
		if(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones!=null) {
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.setVisible(false);	    			
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.dispose();
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoRetencionesPorPagarPorRetenciones!=null) {
			this.jInternalFrameReporteDinamicoRetencionesPorPagarPorRetenciones.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoRetencionesPorPagarPorRetenciones.dispose();
			this.jInternalFrameReporteDinamicoRetencionesPorPagarPorRetenciones=null;
		}
		
		if(this.jInternalFrameImportacionRetencionesPorPagarPorRetenciones!=null) {
			this.jInternalFrameImportacionRetencionesPorPagarPorRetenciones.setVisible(false);	    			
			this.jInternalFrameImportacionRetencionesPorPagarPorRetenciones.dispose();
			this.jInternalFrameImportacionRetencionesPorPagarPorRetenciones=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessRetencionesPorPagarPorRetenciones();
			
			RetencionesPorPagarPorRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.retencionesporpagarporretenciones,new Object(),this.retencionesporpagarporretencionesParameterGeneral,this.retencionesporpagarporretencionesReturnGeneral);
			
			
			if(sTipo.equals("NuevoRetencionesPorPagarPorRetenciones")) {
				jButtonNuevoRetencionesPorPagarPorRetencionesActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarRetencionesPorPagarPorRetenciones")) {
				jButtonDuplicarRetencionesPorPagarPorRetencionesActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarRetencionesPorPagarPorRetenciones")) {
				jButtonCopiarRetencionesPorPagarPorRetencionesActionPerformed(evt);
			} else if(sTipo.equals("VerFormRetencionesPorPagarPorRetenciones")) {
				jButtonVerFormRetencionesPorPagarPorRetencionesActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarRetencionesPorPagarPorRetenciones")) {
				jButtonNuevoRetencionesPorPagarPorRetencionesActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarRetencionesPorPagarPorRetenciones")) {
				jButtonDuplicarRetencionesPorPagarPorRetencionesActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoRetencionesPorPagarPorRetenciones")) {
				jButtonNuevoRetencionesPorPagarPorRetencionesActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarRetencionesPorPagarPorRetenciones")) {
				jButtonDuplicarRetencionesPorPagarPorRetencionesActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesRetencionesPorPagarPorRetenciones")) {
				jButtonNuevoRetencionesPorPagarPorRetencionesActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarRetencionesPorPagarPorRetenciones")) {
				jButtonNuevoRetencionesPorPagarPorRetencionesActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesRetencionesPorPagarPorRetenciones")) {
				jButtonNuevoRetencionesPorPagarPorRetencionesActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarRetencionesPorPagarPorRetenciones")) {
				jButtonModificarRetencionesPorPagarPorRetencionesActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarRetencionesPorPagarPorRetenciones")) {
				jButtonModificarRetencionesPorPagarPorRetencionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarRetencionesPorPagarPorRetenciones")) {
				jButtonModificarRetencionesPorPagarPorRetencionesActionPerformed(evt);
			} else if(sTipo.equals("ActualizarRetencionesPorPagarPorRetenciones")) {
				jButtonActualizarRetencionesPorPagarPorRetencionesActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarRetencionesPorPagarPorRetenciones")) {
				jButtonActualizarRetencionesPorPagarPorRetencionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarRetencionesPorPagarPorRetenciones")) {
				jButtonActualizarRetencionesPorPagarPorRetencionesActionPerformed(evt);
			} else if(sTipo.equals("EliminarRetencionesPorPagarPorRetenciones")) {
				jButtonEliminarRetencionesPorPagarPorRetencionesActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarRetencionesPorPagarPorRetenciones")) {
				jButtonEliminarRetencionesPorPagarPorRetencionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarRetencionesPorPagarPorRetenciones")) {
				jButtonEliminarRetencionesPorPagarPorRetencionesActionPerformed(evt);
			} else if(sTipo.equals("CancelarRetencionesPorPagarPorRetenciones")) {
				jButtonCancelarRetencionesPorPagarPorRetencionesActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarRetencionesPorPagarPorRetenciones")) {
				jButtonCancelarRetencionesPorPagarPorRetencionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarRetencionesPorPagarPorRetenciones")) {
				jButtonCancelarRetencionesPorPagarPorRetencionesActionPerformed(evt);
			} else if(sTipo.equals("CerrarRetencionesPorPagarPorRetenciones")) {
				jButtonCerrarRetencionesPorPagarPorRetencionesActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarRetencionesPorPagarPorRetenciones")) {
				jButtonCerrarRetencionesPorPagarPorRetencionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarRetencionesPorPagarPorRetenciones")) {
				jButtonCerrarRetencionesPorPagarPorRetencionesActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarRetencionesPorPagarPorRetenciones")) {
				jButtonMostrarOcultarRetencionesPorPagarPorRetencionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarRetencionesPorPagarPorRetenciones")) {
				jButtonCancelarRetencionesPorPagarPorRetencionesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosRetencionesPorPagarPorRetenciones")) {
				jButtonGuardarCambiosRetencionesPorPagarPorRetencionesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarRetencionesPorPagarPorRetenciones")) {
				jButtonGuardarCambiosRetencionesPorPagarPorRetencionesActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarRetencionesPorPagarPorRetenciones")) {
				jButtonCopiarRetencionesPorPagarPorRetencionesActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarRetencionesPorPagarPorRetenciones")) {
				jButtonVerFormRetencionesPorPagarPorRetencionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosRetencionesPorPagarPorRetenciones")) {
				jButtonGuardarCambiosRetencionesPorPagarPorRetencionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarRetencionesPorPagarPorRetenciones")) {
				jButtonCopiarRetencionesPorPagarPorRetencionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormRetencionesPorPagarPorRetenciones")) {
				jButtonVerFormRetencionesPorPagarPorRetencionesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaRetencionesPorPagarPorRetenciones")) {
				jButtonGuardarCambiosRetencionesPorPagarPorRetencionesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarRetencionesPorPagarPorRetenciones")) {
				jButtonGuardarCambiosRetencionesPorPagarPorRetencionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaRetencionesPorPagarPorRetenciones")) {
				jButtonGuardarCambiosRetencionesPorPagarPorRetencionesActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionRetencionesPorPagarPorRetenciones")) {
				jButtonRecargarInformacionRetencionesPorPagarPorRetencionesActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarRetencionesPorPagarPorRetenciones")) {
				jButtonRecargarInformacionRetencionesPorPagarPorRetencionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionRetencionesPorPagarPorRetenciones")) {
				jButtonRecargarInformacionRetencionesPorPagarPorRetencionesActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresRetencionesPorPagarPorRetenciones")) {
				jButtonAnterioresRetencionesPorPagarPorRetencionesActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarRetencionesPorPagarPorRetenciones")) {
				jButtonAnterioresRetencionesPorPagarPorRetencionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreRetencionesPorPagarPorRetenciones")) {
				jButtonAnterioresRetencionesPorPagarPorRetencionesActionPerformed(evt);
			} else if(sTipo.equals("SiguientesRetencionesPorPagarPorRetenciones")) {
				jButtonSiguientesRetencionesPorPagarPorRetencionesActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarRetencionesPorPagarPorRetenciones")) {
				jButtonSiguientesRetencionesPorPagarPorRetencionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesRetencionesPorPagarPorRetenciones")) {
				jButtonSiguientesRetencionesPorPagarPorRetencionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByRetencionesPorPagarPorRetenciones") || sTipo.equals("MenuItemDetalleAbrirOrderByRetencionesPorPagarPorRetenciones")) {
				jButtonAbrirOrderByRetencionesPorPagarPorRetencionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarRetencionesPorPagarPorRetenciones") || sTipo.equals("MenuItemDetalleMostrarOcultarRetencionesPorPagarPorRetenciones")) {
				jButtonMostrarOcultarRetencionesPorPagarPorRetencionesActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosRetencionesPorPagarPorRetenciones")) {
				jButtonNuevoGuardarCambiosRetencionesPorPagarPorRetencionesActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarRetencionesPorPagarPorRetenciones")) {
				jButtonNuevoGuardarCambiosRetencionesPorPagarPorRetencionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosRetencionesPorPagarPorRetenciones")) {
				jButtonNuevoGuardarCambiosRetencionesPorPagarPorRetencionesActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoRetencionesPorPagarPorRetenciones")) {
				jButtonCerrarReporteDinamicoRetencionesPorPagarPorRetencionesActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoRetencionesPorPagarPorRetenciones")) {
				jButtonGenerarReporteDinamicoRetencionesPorPagarPorRetencionesActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoRetencionesPorPagarPorRetenciones")) {
				
				jButtonGenerarExcelReporteDinamicoRetencionesPorPagarPorRetencionesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionRetencionesPorPagarPorRetenciones")) {
				jButtonCerrarImportacionRetencionesPorPagarPorRetencionesActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionRetencionesPorPagarPorRetenciones")) {
				
				jButtonGenerarImportacionRetencionesPorPagarPorRetencionesActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionRetencionesPorPagarPorRetenciones")) {
				
				jButtonAbrirImportacionRetencionesPorPagarPorRetencionesActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesRetencionesPorPagarPorRetenciones")) {
				jComboBoxTiposAccionesRetencionesPorPagarPorRetencionesActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesRetencionesPorPagarPorRetenciones")) {
				jComboBoxTiposRelacionesRetencionesPorPagarPorRetencionesActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioRetencionesPorPagarPorRetenciones")) {
				jComboBoxTiposAccionesRetencionesPorPagarPorRetencionesActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarRetencionesPorPagarPorRetenciones")) {
				
				jComboBoxTiposSeleccionarRetencionesPorPagarPorRetencionesActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralRetencionesPorPagarPorRetenciones")) {
				jTextFieldValorCampoGeneralRetencionesPorPagarPorRetencionesActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByRetencionesPorPagarPorRetenciones")) {
				jButtonAbrirOrderByRetencionesPorPagarPorRetencionesActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarRetencionesPorPagarPorRetenciones")) {
				jButtonAbrirOrderByRetencionesPorPagarPorRetencionesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByRetencionesPorPagarPorRetenciones")) {
				jButtonCerrarOrderByRetencionesPorPagarPorRetencionesActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idRetencionesPorPagarPorRetencionesBusqueda")) {
				this.jButtonidRetencionesPorPagarPorRetencionesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaRetencionesPorPagarPorRetencionesUpdate")) {
				this.jButtonid_empresaRetencionesPorPagarPorRetencionesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaRetencionesPorPagarPorRetencionesBusqueda")) {
				this.jButtonid_empresaRetencionesPorPagarPorRetencionesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalRetencionesPorPagarPorRetencionesUpdate")) {
				this.jButtonid_sucursalRetencionesPorPagarPorRetencionesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalRetencionesPorPagarPorRetencionesBusqueda")) {
				this.jButtonid_sucursalRetencionesPorPagarPorRetencionesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioRetencionesPorPagarPorRetencionesUpdate")) {
				this.jButtonid_ejercicioRetencionesPorPagarPorRetencionesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioRetencionesPorPagarPorRetencionesBusqueda")) {
				this.jButtonid_ejercicioRetencionesPorPagarPorRetencionesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoRetencionesPorPagarPorRetencionesUpdate")) {
				this.jButtonid_periodoRetencionesPorPagarPorRetencionesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoRetencionesPorPagarPorRetencionesBusqueda")) {
				this.jButtonid_periodoRetencionesPorPagarPorRetencionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_debitoRetencionesPorPagarPorRetencionesBusqueda")) {
				this.jButtones_debitoRetencionesPorPagarPorRetencionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionRetencionesPorPagarPorRetencionesBusqueda")) {
				this.jButtonfecha_emisionRetencionesPorPagarPorRetencionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_tipo_movimientoRetencionesPorPagarPorRetencionesBusqueda")) {
				this.jButtonnombre_tipo_movimientoRetencionesPorPagarPorRetencionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_mayorRetencionesPorPagarPorRetencionesBusqueda")) {
				this.jButtonnumero_mayorRetencionesPorPagarPorRetencionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_cuenta_contable_retencionRetencionesPorPagarPorRetencionesBusqueda")) {
				this.jButtonnombre_cuenta_contable_retencionRetencionesPorPagarPorRetencionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_pre_impreso_facturaRetencionesPorPagarPorRetencionesBusqueda")) {
				this.jButtonnumero_pre_impreso_facturaRetencionesPorPagarPorRetencionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeRetencionesPorPagarPorRetencionesBusqueda")) {
				this.jButtonporcentajeRetencionesPorPagarPorRetencionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("base_imponibleRetencionesPorPagarPorRetencionesBusqueda")) {
				this.jButtonbase_imponibleRetencionesPorPagarPorRetencionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorRetencionesPorPagarPorRetencionesBusqueda")) {
				this.jButtonvalorRetencionesPorPagarPorRetencionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numeroRetencionesPorPagarPorRetencionesBusqueda")) {
				this.jButtonnumeroRetencionesPorPagarPorRetencionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_benefRetencionesPorPagarPorRetencionesBusqueda")) {
				this.jButtonnombre_benefRetencionesPorPagarPorRetencionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ruc_benefRetencionesPorPagarPorRetencionesBusqueda")) {
				this.jButtonruc_benefRetencionesPorPagarPorRetencionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_cuenta_contableRetencionesPorPagarPorRetencionesBusqueda")) {
				this.jButtonnombre_cuenta_contableRetencionesPorPagarPorRetencionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_cuenta_contable_creditoRetencionesPorPagarPorRetencionesBusqueda")) {
				this.jButtonnombre_cuenta_contable_creditoRetencionesPorPagarPorRetencionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_debito_datoRetencionesPorPagarPorRetencionesBusqueda")) {
				this.jButtones_debito_datoRetencionesPorPagarPorRetencionesBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones")) {
				this.jButtonBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetencionesActionPerformed(evt);
			}
			
			;
			
			
			RetencionesPorPagarPorRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.retencionesporpagarporretenciones,new Object(),this.retencionesporpagarporretencionesParameterGeneral,this.retencionesporpagarporretencionesReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessRetencionesPorPagarPorRetenciones();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRetencionesPorPagarPorRetencionesActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.retencionesporpagarporretenciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.retencionesporpagarporretenciones);
				
				RetencionesPorPagarPorRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.retencionesporpagarporretenciones,new Object(),this.retencionesporpagarporretencionesParameterGeneral,this.retencionesporpagarporretencionesReturnGeneral);
				
				


				
				RetencionesPorPagarPorRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.retencionesporpagarporretenciones,new Object(),this.retencionesporpagarporretencionesParameterGeneral,this.retencionesporpagarporretencionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RetencionesPorPagarPorRetenciones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RetencionesPorPagarPorRetenciones.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			RetencionesPorPagarPorRetenciones retencionesporpagarporretencionesLocal=null;
			
			if(!this.getEsControlTabla()) {
				retencionesporpagarporretencionesLocal=this.retencionesporpagarporretenciones;
			} else {
				retencionesporpagarporretencionesLocal=this.retencionesporpagarporretencionesAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.retencionesporpagarporretenciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.retencionesporpagarporretenciones);
				
				RetencionesPorPagarPorRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.retencionesporpagarporretenciones,new Object(),this.retencionesporpagarporretencionesParameterGeneral,this.retencionesporpagarporretencionesReturnGeneral);
							
				
				


				
				RetencionesPorPagarPorRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.retencionesporpagarporretenciones,new Object(),this.retencionesporpagarporretencionesParameterGeneral,this.retencionesporpagarporretencionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RetencionesPorPagarPorRetenciones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RetencionesPorPagarPorRetenciones.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRetencionesPorPagarPorRetencionesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRetencionesPorPagarPorRetenciones.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretencionesAnterior =(RetencionesPorPagarPorRetenciones) this.retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness().toArray()[this.jTableDatosRetencionesPorPagarPorRetenciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.retencionesporpagarporretencionesAnterior =(RetencionesPorPagarPorRetenciones) this.retencionesporpagarporretencioness.toArray()[this.jTableDatosRetencionesPorPagarPorRetenciones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
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
			
			RetencionesPorPagarPorRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.retencionesporpagarporretenciones,new Object(),this.retencionesporpagarporretencionesParameterGeneral,this.retencionesporpagarporretencionesReturnGeneral);
			
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
			
			


			
			RetencionesPorPagarPorRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.retencionesporpagarporretenciones,new Object(),this.retencionesporpagarporretencionesParameterGeneral,this.retencionesporpagarporretencionesReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRetencionesPorPagarPorRetencionesActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.retencionesporpagarporretenciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.retencionesporpagarporretenciones);
				
				RetencionesPorPagarPorRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.retencionesporpagarporretenciones,new Object(),this.retencionesporpagarporretencionesParameterGeneral,this.retencionesporpagarporretencionesReturnGeneral);
								
						
				


				
				RetencionesPorPagarPorRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.retencionesporpagarporretenciones,new Object(),this.retencionesporpagarporretencionesParameterGeneral,this.retencionesporpagarporretencionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RetencionesPorPagarPorRetenciones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RetencionesPorPagarPorRetenciones.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.retencionesporpagarporretenciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.retencionesporpagarporretenciones);
				
				RetencionesPorPagarPorRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.retencionesporpagarporretenciones,new Object(),this.retencionesporpagarporretencionesParameterGeneral,this.retencionesporpagarporretencionesReturnGeneral);
								
				
				


				
				RetencionesPorPagarPorRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.retencionesporpagarporretenciones,new Object(),this.retencionesporpagarporretencionesParameterGeneral,this.retencionesporpagarporretencionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RetencionesPorPagarPorRetenciones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RetencionesPorPagarPorRetenciones.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRetencionesPorPagarPorRetencionesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRetencionesPorPagarPorRetenciones.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretencionesAnterior =(RetencionesPorPagarPorRetenciones) this.retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness().toArray()[this.jTableDatosRetencionesPorPagarPorRetenciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.retencionesporpagarporretencionesAnterior =(RetencionesPorPagarPorRetenciones) this.retencionesporpagarporretencioness.toArray()[this.jTableDatosRetencionesPorPagarPorRetenciones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.retencionesporpagarporretenciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.retencionesporpagarporretenciones);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRetencionesPorPagarPorRetencionesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRetencionesPorPagarPorRetenciones.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretencionesAnterior =(RetencionesPorPagarPorRetenciones) this.retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness().toArray()[this.jTableDatosRetencionesPorPagarPorRetenciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.retencionesporpagarporretencionesAnterior =(RetencionesPorPagarPorRetenciones) this.retencionesporpagarporretencioness.toArray()[this.jTableDatosRetencionesPorPagarPorRetenciones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRetencionesPorPagarPorRetencionesActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.retencionesporpagarporretenciones);
			
			this.actualizarInformacion("INFO_PADRE",false,this.retencionesporpagarporretenciones);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.retencionesporpagarporretenciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.retencionesporpagarporretenciones);
				
				RetencionesPorPagarPorRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.retencionesporpagarporretenciones,new Object(),this.retencionesporpagarporretencionesParameterGeneral,this.retencionesporpagarporretencionesReturnGeneral);
							
				
				


				
				RetencionesPorPagarPorRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.retencionesporpagarporretenciones,new Object(),this.retencionesporpagarporretencionesParameterGeneral,this.retencionesporpagarporretencionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RetencionesPorPagarPorRetenciones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RetencionesPorPagarPorRetenciones.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRetencionesPorPagarPorRetencionesActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosRetencionesPorPagarPorRetenciones.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.retencionesporpagarporretencionesAnterior =(RetencionesPorPagarPorRetenciones) this.retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness().toArray()[this.jTableDatosRetencionesPorPagarPorRetenciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.retencionesporpagarporretencionesAnterior =(RetencionesPorPagarPorRetenciones) this.retencionesporpagarporretencioness.toArray()[this.jTableDatosRetencionesPorPagarPorRetenciones.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
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
			
			RetencionesPorPagarPorRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.retencionesporpagarporretenciones,new Object(),this.retencionesporpagarporretencionesParameterGeneral,this.retencionesporpagarporretencionesReturnGeneral);
			
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
			
			


			
			RetencionesPorPagarPorRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.retencionesporpagarporretenciones,new Object(),this.retencionesporpagarporretencionesParameterGeneral,this.retencionesporpagarporretencionesReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRetencionesPorPagarPorRetencionesActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.retencionesporpagarporretenciones);
			
			this.actualizarInformacion("INFO_PADRE",false,this.retencionesporpagarporretenciones);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.retencionesporpagarporretenciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.retencionesporpagarporretenciones);
				
				RetencionesPorPagarPorRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.retencionesporpagarporretenciones,new Object(),this.retencionesporpagarporretencionesParameterGeneral,this.retencionesporpagarporretencionesReturnGeneral);
								
				
				


				
				RetencionesPorPagarPorRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.retencionesporpagarporretenciones,new Object(),this.retencionesporpagarporretencionesParameterGeneral,this.retencionesporpagarporretencionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RetencionesPorPagarPorRetenciones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RetencionesPorPagarPorRetenciones.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRetencionesPorPagarPorRetencionesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRetencionesPorPagarPorRetenciones.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretencionesAnterior =(RetencionesPorPagarPorRetenciones) this.retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness().toArray()[this.jTableDatosRetencionesPorPagarPorRetenciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.retencionesporpagarporretencionesAnterior =(RetencionesPorPagarPorRetenciones) this.retencionesporpagarporretencioness.toArray()[this.jTableDatosRetencionesPorPagarPorRetenciones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRetencionesPorPagarPorRetencionesActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.retencionesporpagarporretenciones);
			
			this.actualizarInformacion("INFO_PADRE",false,this.retencionesporpagarporretenciones);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRetencionesPorPagarPorRetencionesActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.retencionesporpagarporretenciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.retencionesporpagarporretenciones);
				
				RetencionesPorPagarPorRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.retencionesporpagarporretenciones,new Object(),this.retencionesporpagarporretencionesParameterGeneral,this.retencionesporpagarporretencionesReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosRetencionesPorPagarPorRetenciones")) {
					jCheckBoxSeleccionarTodosRetencionesPorPagarPorRetencionesItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosRetencionesPorPagarPorRetenciones")) {
					jCheckBoxSeleccionadosRetencionesPorPagarPorRetencionesItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarRetencionesPorPagarPorRetenciones")) {
					
				}
				
				


				
				
				RetencionesPorPagarPorRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.retencionesporpagarporretenciones,new Object(),this.retencionesporpagarporretencionesParameterGeneral,this.retencionesporpagarporretencionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RetencionesPorPagarPorRetenciones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RetencionesPorPagarPorRetenciones.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.retencionesporpagarporretenciones);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.retencionesporpagarporretenciones);
				
				RetencionesPorPagarPorRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.retencionesporpagarporretenciones,new Object(),this.retencionesporpagarporretencionesParameterGeneral,this.retencionesporpagarporretencionesReturnGeneral);
												
				
				


				
				
				RetencionesPorPagarPorRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.retencionesporpagarporretenciones,new Object(),this.retencionesporpagarporretencionesParameterGeneral,this.retencionesporpagarporretencionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RetencionesPorPagarPorRetenciones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RetencionesPorPagarPorRetenciones.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRetencionesPorPagarPorRetencionesActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosRetencionesPorPagarPorRetenciones.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.retencionesporpagarporretencionesAnterior =(RetencionesPorPagarPorRetenciones) this.retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness().toArray()[this.jTableDatosRetencionesPorPagarPorRetenciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.retencionesporpagarporretencionesAnterior =(RetencionesPorPagarPorRetenciones) this.retencionesporpagarporretencioness.toArray()[this.jTableDatosRetencionesPorPagarPorRetenciones.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRetencionesPorPagarPorRetencionesActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.retencionesporpagarporretenciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.retencionesporpagarporretenciones);
				
				RetencionesPorPagarPorRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.retencionesporpagarporretenciones,new Object(),this.retencionesporpagarporretencionesParameterGeneral,this.retencionesporpagarporretencionesReturnGeneral);
				
				
				RetencionesPorPagarPorRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.retencionesporpagarporretenciones,new Object(),this.retencionesporpagarporretencionesParameterGeneral,this.retencionesporpagarporretencionesReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
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
			
			RetencionesPorPagarPorRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.retencionesporpagarporretenciones,new Object(),this.retencionesporpagarporretencionesParameterGeneral,this.retencionesporpagarporretencionesReturnGeneral);
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
			
			


			
			RetencionesPorPagarPorRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.retencionesporpagarporretenciones,new Object(),this.retencionesporpagarporretencionesParameterGeneral,this.retencionesporpagarporretencionesReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRetencionesPorPagarPorRetencionesActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.retencionesporpagarporretenciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.retencionesporpagarporretenciones);
				
				RetencionesPorPagarPorRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.retencionesporpagarporretenciones,new Object(),this.retencionesporpagarporretencionesParameterGeneral,this.retencionesporpagarporretencionesReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				RetencionesPorPagarPorRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.retencionesporpagarporretenciones,new Object(),this.retencionesporpagarporretencionesParameterGeneral,this.retencionesporpagarporretencionesReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RetencionesPorPagarPorRetenciones.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RetencionesPorPagarPorRetenciones.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.retencionesporpagarporretenciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.retencionesporpagarporretenciones);
				
				RetencionesPorPagarPorRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.retencionesporpagarporretenciones,new Object(),this.retencionesporpagarporretencionesParameterGeneral,this.retencionesporpagarporretencionesReturnGeneral);
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
				
				


				
				RetencionesPorPagarPorRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.retencionesporpagarporretenciones,new Object(),this.retencionesporpagarporretencionesParameterGeneral,this.retencionesporpagarporretencionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RetencionesPorPagarPorRetenciones.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RetencionesPorPagarPorRetenciones.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRetencionesPorPagarPorRetencionesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRetencionesPorPagarPorRetenciones.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporretencionesAnterior =(RetencionesPorPagarPorRetenciones) this.retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness().toArray()[this.jTableDatosRetencionesPorPagarPorRetenciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.retencionesporpagarporretencionesAnterior =(RetencionesPorPagarPorRetenciones) this.retencionesporpagarporretencioness.toArray()[this.jTableDatosRetencionesPorPagarPorRetenciones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				RetencionesPorPagarPorRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.retencionesporpagarporretenciones,new Object(),this.retencionesporpagarporretencionesParameterGeneral,this.retencionesporpagarporretencionesReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarRetencionesPorPagarPorRetenciones")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosRetencionesPorPagarPorRetencionesListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosRetencionesPorPagarPorRetenciones.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.retencionesporpagarporretenciones =(RetencionesPorPagarPorRetenciones) this.retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness().toArray()[this.jTableDatosRetencionesPorPagarPorRetenciones.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.retencionesporpagarporretenciones =(RetencionesPorPagarPorRetenciones) this.retencionesporpagarporretencioness.toArray()[this.jTableDatosRetencionesPorPagarPorRetenciones.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.retencionesporpagarporretenciones);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarRetencionesPorPagarPorRetenciones")) {
				
				}
				
				RetencionesPorPagarPorRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.retencionesporpagarporretenciones,new Object(),this.retencionesporpagarporretencionesParameterGeneral,this.retencionesporpagarporretencionesReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			RetencionesPorPagarPorRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.retencionesporpagarporretenciones,new Object(),this.retencionesporpagarporretencionesParameterGeneral,this.retencionesporpagarporretencionesReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarRetencionesPorPagarPorRetenciones")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosRetencionesPorPagarPorRetenciones.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarRetencionesPorPagarPorRetenciones")) {
			
			}
			
			RetencionesPorPagarPorRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.retencionesporpagarporretenciones,new Object(),this.retencionesporpagarporretencionesParameterGeneral,this.retencionesporpagarporretencionesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessRetencionesPorPagarPorRetenciones();
			
			RetencionesPorPagarPorRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.retencionesporpagarporretenciones,new Object(),this.retencionesporpagarporretencionesParameterGeneral,this.retencionesporpagarporretencionesReturnGeneral);
			
			if(sTipo.equals("NuevoRetencionesPorPagarPorRetenciones")) {
				jButtonNuevoRetencionesPorPagarPorRetencionesActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarRetencionesPorPagarPorRetenciones")) {
				jButtonDuplicarRetencionesPorPagarPorRetencionesActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarRetencionesPorPagarPorRetenciones")) {
				jButtonCopiarRetencionesPorPagarPorRetencionesActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormRetencionesPorPagarPorRetenciones")) {
				jButtonVerFormRetencionesPorPagarPorRetencionesActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesRetencionesPorPagarPorRetenciones")) {
				jButtonNuevoRetencionesPorPagarPorRetencionesActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarRetencionesPorPagarPorRetenciones")) {
				jButtonModificarRetencionesPorPagarPorRetencionesActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarRetencionesPorPagarPorRetenciones")) {
				jButtonActualizarRetencionesPorPagarPorRetencionesActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarRetencionesPorPagarPorRetenciones")) {
				jButtonEliminarRetencionesPorPagarPorRetencionesActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaRetencionesPorPagarPorRetenciones")) {
				jButtonGuardarCambiosRetencionesPorPagarPorRetencionesActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarRetencionesPorPagarPorRetenciones")) {
				jButtonCancelarRetencionesPorPagarPorRetencionesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarRetencionesPorPagarPorRetenciones")) {
				jButtonCerrarRetencionesPorPagarPorRetencionesActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosRetencionesPorPagarPorRetenciones")) {
				jButtonGuardarCambiosRetencionesPorPagarPorRetencionesActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosRetencionesPorPagarPorRetenciones")) {
				jButtonNuevoGuardarCambiosRetencionesPorPagarPorRetencionesActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByRetencionesPorPagarPorRetenciones")) {
				jButtonAbrirOrderByRetencionesPorPagarPorRetencionesActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionRetencionesPorPagarPorRetenciones")) {
				jButtonRecargarInformacionRetencionesPorPagarPorRetencionesActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresRetencionesPorPagarPorRetenciones")) {
				jButtonAnterioresRetencionesPorPagarPorRetencionesActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesRetencionesPorPagarPorRetenciones")) {
				jButtonSiguientesRetencionesPorPagarPorRetencionesActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idRetencionesPorPagarPorRetencionesBusqueda")) {
				this.jButtonidRetencionesPorPagarPorRetencionesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaRetencionesPorPagarPorRetencionesUpdate")) {
				this.jButtonid_empresaRetencionesPorPagarPorRetencionesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaRetencionesPorPagarPorRetencionesBusqueda")) {
				this.jButtonid_empresaRetencionesPorPagarPorRetencionesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalRetencionesPorPagarPorRetencionesUpdate")) {
				this.jButtonid_sucursalRetencionesPorPagarPorRetencionesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalRetencionesPorPagarPorRetencionesBusqueda")) {
				this.jButtonid_sucursalRetencionesPorPagarPorRetencionesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioRetencionesPorPagarPorRetencionesUpdate")) {
				this.jButtonid_ejercicioRetencionesPorPagarPorRetencionesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioRetencionesPorPagarPorRetencionesBusqueda")) {
				this.jButtonid_ejercicioRetencionesPorPagarPorRetencionesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoRetencionesPorPagarPorRetencionesUpdate")) {
				this.jButtonid_periodoRetencionesPorPagarPorRetencionesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoRetencionesPorPagarPorRetencionesBusqueda")) {
				this.jButtonid_periodoRetencionesPorPagarPorRetencionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_debitoRetencionesPorPagarPorRetencionesBusqueda")) {
				this.jButtones_debitoRetencionesPorPagarPorRetencionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionRetencionesPorPagarPorRetencionesBusqueda")) {
				this.jButtonfecha_emisionRetencionesPorPagarPorRetencionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_tipo_movimientoRetencionesPorPagarPorRetencionesBusqueda")) {
				this.jButtonnombre_tipo_movimientoRetencionesPorPagarPorRetencionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_mayorRetencionesPorPagarPorRetencionesBusqueda")) {
				this.jButtonnumero_mayorRetencionesPorPagarPorRetencionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_cuenta_contable_retencionRetencionesPorPagarPorRetencionesBusqueda")) {
				this.jButtonnombre_cuenta_contable_retencionRetencionesPorPagarPorRetencionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_pre_impreso_facturaRetencionesPorPagarPorRetencionesBusqueda")) {
				this.jButtonnumero_pre_impreso_facturaRetencionesPorPagarPorRetencionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeRetencionesPorPagarPorRetencionesBusqueda")) {
				this.jButtonporcentajeRetencionesPorPagarPorRetencionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("base_imponibleRetencionesPorPagarPorRetencionesBusqueda")) {
				this.jButtonbase_imponibleRetencionesPorPagarPorRetencionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorRetencionesPorPagarPorRetencionesBusqueda")) {
				this.jButtonvalorRetencionesPorPagarPorRetencionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numeroRetencionesPorPagarPorRetencionesBusqueda")) {
				this.jButtonnumeroRetencionesPorPagarPorRetencionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_benefRetencionesPorPagarPorRetencionesBusqueda")) {
				this.jButtonnombre_benefRetencionesPorPagarPorRetencionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ruc_benefRetencionesPorPagarPorRetencionesBusqueda")) {
				this.jButtonruc_benefRetencionesPorPagarPorRetencionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_cuenta_contableRetencionesPorPagarPorRetencionesBusqueda")) {
				this.jButtonnombre_cuenta_contableRetencionesPorPagarPorRetencionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_cuenta_contable_creditoRetencionesPorPagarPorRetencionesBusqueda")) {
				this.jButtonnombre_cuenta_contable_creditoRetencionesPorPagarPorRetencionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_debito_datoRetencionesPorPagarPorRetencionesBusqueda")) {
				this.jButtones_debito_datoRetencionesPorPagarPorRetencionesBusquedaActionPerformed(evt);
			}
			
			RetencionesPorPagarPorRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.retencionesporpagarporretenciones,new Object(),this.retencionesporpagarporretencionesParameterGeneral,this.retencionesporpagarporretencionesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessRetencionesPorPagarPorRetenciones();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			RetencionesPorPagarPorRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.retencionesporpagarporretenciones,new Object(),this.retencionesporpagarporretencionesParameterGeneral,this.retencionesporpagarporretencionesReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameRetencionesPorPagarPorRetenciones")) {
				closingInternalFrameRetencionesPorPagarPorRetenciones();
				
			} else if(sTipo.equals("jButtonCancelarRetencionesPorPagarPorRetenciones")) {
				JInternalFrameBase jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones = (JInternalFrameBase)evt.getSource();
	            	
	            RetencionesPorPagarPorRetencionesBeanSwingJInternalFrame jInternalFrameParent=(RetencionesPorPagarPorRetencionesBeanSwingJInternalFrame)jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarRetencionesPorPagarPorRetencionesActionPerformed(null);
			}
			
			RetencionesPorPagarPorRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.retencionesporpagarporretenciones,new Object(),this.retencionesporpagarporretencionesParameterGeneral,this.retencionesporpagarporretencionesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormRetencionesPorPagarPorRetenciones(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormRetencionesPorPagarPorRetenciones(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormRetencionesPorPagarPorRetenciones(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.retencionesporpagarporretenciones)) {
			if(!esControlTabla) {
				if(RetencionesPorPagarPorRetencionesJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretenciones,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretenciones);			
				}
				
				if(this.retencionesporpagarporretencionesSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretenciones,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretencionesReturnGeneral,this.retencionesporpagarporretencionesBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.retencionesporpagarporretencionesSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanRetencionesPorPagarPorRetenciones(classes,this.retencionesporpagarporretencionesReturnGeneral,this.retencionesporpagarporretencionesBean,false);
					}
						
					if(this.retencionesporpagarporretencionesReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretencionesReturnGeneral.getRetencionesPorPagarPorRetenciones());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretencionesReturnGeneral.getRetencionesPorPagarPorRetenciones());	
					}
						
					if(this.retencionesporpagarporretencionesReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretencionesReturnGeneral.getRetencionesPorPagarPorRetenciones(),classes);//this.retencionesporpagarporretencionesBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretenciones,classes);//this.retencionesporpagarporretencionesBean);									
				}
			
				if(RetencionesPorPagarPorRetencionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretenciones,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorRetenciones(this.retencionesporpagarporretenciones);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.retencionesporpagarporretencionesAnterior!=null) {
						this.retencionesporpagarporretenciones=this.retencionesporpagarporretencionesAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.retencionesporpagarporretencionesSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.retencionesporpagarporretencionesReturnGeneral.getRetencionesPorPagarPorRetenciones(),retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.retencionesporpagarporretencionesReturnGeneral.getRetencionesPorPagarPorRetenciones(),this.retencionesporpagarporretencioness);
				}
				//ARCHITECTURE
				
				//this.jTableDatosRetencionesPorPagarPorRetenciones.repaint();
				
				//((AbstractTableModel) this.jTableDatosRetencionesPorPagarPorRetenciones.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosRetencionesPorPagarPorRetenciones();
			}
		}
	}
	
	public void actualizarVisualTableDatosRetencionesPorPagarPorRetenciones() throws Exception {
		
		RetencionesPorPagarPorRetencionesModel retencionesporpagarporretencionesModel=(RetencionesPorPagarPorRetencionesModel)this.jTableDatosRetencionesPorPagarPorRetenciones.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			retencionesporpagarporretencionesModel.retencionesporpagarporretencioness=this.retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			retencionesporpagarporretencionesModel.retencionesporpagarporretencioness=this.retencionesporpagarporretencioness;
		}
		
		
		((RetencionesPorPagarPorRetencionesModel) this.jTableDatosRetencionesPorPagarPorRetenciones.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaRetencionesPorPagarPorRetenciones() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getretencionesporpagarporretencionesAnterior(),this.retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getretencionesporpagarporretencionesAnterior(),this.retencionesporpagarporretencioness);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosRetencionesPorPagarPorRetenciones();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioRetencionesPorPagarPorRetenciones(RetencionesPorPagarPorRetenciones retencionesporpagarporretenciones,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
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
										
				RetencionesPorPagarPorRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.retencionesporpagarporretenciones,new Object(),generalEntityParameterGeneral,this.retencionesporpagarporretencionesReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.retencionesporpagarporretencionesSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=RetencionesPorPagarPorRetencionesConstantesFunciones.getClassesRelationshipsOfRetencionesPorPagarPorRetenciones(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=RetencionesPorPagarPorRetencionesConstantesFunciones.getClassesRelationshipsFromStringsOfRetencionesPorPagarPorRetenciones(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormRetencionesPorPagarPorRetenciones(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				RetencionesPorPagarPorRetencionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.retencionesporpagarporretenciones,new Object(),generalEntityParameterGeneral,this.retencionesporpagarporretencionesReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioRetencionesPorPagarPorRetenciones(RetencionesPorPagarPorRetencionesBean retencionesporpagarporretencionesBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanRetencionesPorPagarPorRetenciones(ArrayList<Classe> classes,RetencionesPorPagarPorRetencionesReturnGeneral retencionesporpagarporretencionesReturnGeneral,RetencionesPorPagarPorRetencionesBean retencionesporpagarporretencionesBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualRetencionesPorPagarPorRetenciones(RetencionesPorPagarPorRetenciones retencionesporpagarporretenciones,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.retencionesporpagarporretenciones)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones = new RetencionesPorPagarPorRetencionesDetalleFormJInternalFrame(jDesktopPane,this.retencionesporpagarporretencionesSessionBean.getConGuardarRelaciones(),this.retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.setVisible(false);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.setSelected(false);						
		
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.retencionesporpagarporretencionesLogic=this.retencionesporpagarporretencionesLogic;
		
		this.cargarCombosFrameForeignKeyRetencionesPorPagarPorRetenciones("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleRetencionesPorPagarPorRetenciones();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleRetencionesPorPagarPorRetenciones();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyRetencionesPorPagarPorRetenciones("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyRetencionesPorPagarPorRetenciones();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarRetencionesPorPagarPorRetenciones"));
		
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonModificarRetencionesPorPagarPorRetenciones.addActionListener(new ButtonActionListener(this,"ModificarRetencionesPorPagarPorRetenciones"));

		
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonModificarToolBarRetencionesPorPagarPorRetenciones.addActionListener(new ButtonActionListener(this,"ModificarToolBarRetencionesPorPagarPorRetenciones"));
					
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jMenuItemModificarRetencionesPorPagarPorRetenciones.addActionListener(new ButtonActionListener(this,"MenuItemModificarRetencionesPorPagarPorRetenciones"));		
		
		
		
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonActualizarRetencionesPorPagarPorRetenciones.addActionListener (new ButtonActionListener(this,"ActualizarRetencionesPorPagarPorRetenciones"));
		
		
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonActualizarToolBarRetencionesPorPagarPorRetenciones.addActionListener(new ButtonActionListener(this,"ActualizarToolBarRetencionesPorPagarPorRetenciones"));
						
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jMenuItemActualizarRetencionesPorPagarPorRetenciones.addActionListener (new ButtonActionListener(this,"MenuItemActualizarRetencionesPorPagarPorRetenciones"));		
		
		
		
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonEliminarRetencionesPorPagarPorRetenciones.addActionListener (new ButtonActionListener(this,"EliminarRetencionesPorPagarPorRetenciones"));
		
		
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonEliminarToolBarRetencionesPorPagarPorRetenciones.addActionListener (new ButtonActionListener(this,"EliminarToolBarRetencionesPorPagarPorRetenciones"));
								
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jMenuItemEliminarRetencionesPorPagarPorRetenciones.addActionListener (new ButtonActionListener(this,"MenuItemEliminarRetencionesPorPagarPorRetenciones"));		
		
		
		
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonCancelarRetencionesPorPagarPorRetenciones.addActionListener (new ButtonActionListener(this,"CancelarRetencionesPorPagarPorRetenciones"));
		
		
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonCancelarToolBarRetencionesPorPagarPorRetenciones.addActionListener (new ButtonActionListener(this,"CancelarToolBarRetencionesPorPagarPorRetenciones"));
					
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jMenuItemCancelarRetencionesPorPagarPorRetenciones.addActionListener (new ButtonActionListener(this,"MenuItemCancelarRetencionesPorPagarPorRetenciones"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jMenuItemDetalleCerrarRetencionesPorPagarPorRetenciones.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarRetencionesPorPagarPorRetenciones"));		
		
		
		
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonGuardarCambiosToolBarRetencionesPorPagarPorRetenciones.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarRetencionesPorPagarPorRetenciones"));
		
		
		
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonGuardarCambiosToolBarRetencionesPorPagarPorRetenciones.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarRetencionesPorPagarPorRetenciones"));
		
		
		
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jComboBoxTiposAccionesFormularioRetencionesPorPagarPorRetenciones.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioRetencionesPorPagarPorRetenciones"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonidRetencionesPorPagarPorRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"idRetencionesPorPagarPorRetencionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonid_empresaRetencionesPorPagarPorRetencionesUpdate.addActionListener(new ButtonActionListener(this,"id_empresaRetencionesPorPagarPorRetencionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonid_empresaRetencionesPorPagarPorRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaRetencionesPorPagarPorRetencionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonid_sucursalRetencionesPorPagarPorRetencionesUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalRetencionesPorPagarPorRetencionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonid_sucursalRetencionesPorPagarPorRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalRetencionesPorPagarPorRetencionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonid_ejercicioRetencionesPorPagarPorRetencionesUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioRetencionesPorPagarPorRetencionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonid_ejercicioRetencionesPorPagarPorRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioRetencionesPorPagarPorRetencionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonid_periodoRetencionesPorPagarPorRetencionesUpdate.addActionListener(new ButtonActionListener(this,"id_periodoRetencionesPorPagarPorRetencionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonid_periodoRetencionesPorPagarPorRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoRetencionesPorPagarPorRetencionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtones_debitoRetencionesPorPagarPorRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"es_debitoRetencionesPorPagarPorRetencionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonfecha_emisionRetencionesPorPagarPorRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionRetencionesPorPagarPorRetencionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonnombre_tipo_movimientoRetencionesPorPagarPorRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_tipo_movimientoRetencionesPorPagarPorRetencionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonnumero_mayorRetencionesPorPagarPorRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"numero_mayorRetencionesPorPagarPorRetencionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonnombre_cuenta_contable_retencionRetencionesPorPagarPorRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_cuenta_contable_retencionRetencionesPorPagarPorRetencionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonnumero_pre_impreso_facturaRetencionesPorPagarPorRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"numero_pre_impreso_facturaRetencionesPorPagarPorRetencionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonporcentajeRetencionesPorPagarPorRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeRetencionesPorPagarPorRetencionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonbase_imponibleRetencionesPorPagarPorRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"base_imponibleRetencionesPorPagarPorRetencionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonvalorRetencionesPorPagarPorRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"valorRetencionesPorPagarPorRetencionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonnumeroRetencionesPorPagarPorRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"numeroRetencionesPorPagarPorRetencionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonnombre_benefRetencionesPorPagarPorRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_benefRetencionesPorPagarPorRetencionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonruc_benefRetencionesPorPagarPorRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"ruc_benefRetencionesPorPagarPorRetencionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonnombre_cuenta_contableRetencionesPorPagarPorRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_cuenta_contableRetencionesPorPagarPorRetencionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonnombre_cuenta_contable_creditoRetencionesPorPagarPorRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_cuenta_contable_creditoRetencionesPorPagarPorRetencionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtones_debito_datoRetencionesPorPagarPorRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"es_debito_datoRetencionesPorPagarPorRetencionesBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTabbedPaneRelacionesRetencionesPorPagarPorRetenciones.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesRetencionesPorPagarPorRetenciones"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameRetencionesPorPagarPorRetenciones"));
		
		if(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarRetencionesPorPagarPorRetenciones"));
		}
		
		this.jTableDatosRetencionesPorPagarPorRetenciones.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarRetencionesPorPagarPorRetenciones"));
		
		this.jTableDatosRetencionesPorPagarPorRetenciones.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarRetencionesPorPagarPorRetenciones"));
		
		this.jButtonNuevoRetencionesPorPagarPorRetenciones.addActionListener(new ButtonActionListener(this,"NuevoRetencionesPorPagarPorRetenciones"));
		
		this.jButtonDuplicarRetencionesPorPagarPorRetenciones.addActionListener(new ButtonActionListener(this,"DuplicarRetencionesPorPagarPorRetenciones"));
		
		this.jButtonCopiarRetencionesPorPagarPorRetenciones.addActionListener(new ButtonActionListener(this,"CopiarRetencionesPorPagarPorRetenciones"));
		
		this.jButtonVerFormRetencionesPorPagarPorRetenciones.addActionListener(new ButtonActionListener(this,"VerFormRetencionesPorPagarPorRetenciones"));
		
		
		this.jButtonNuevoToolBarRetencionesPorPagarPorRetenciones.addActionListener(new ButtonActionListener(this,"NuevoToolBarRetencionesPorPagarPorRetenciones"));
			
		this.jButtonDuplicarToolBarRetencionesPorPagarPorRetenciones.addActionListener(new ButtonActionListener(this,"DuplicarToolBarRetencionesPorPagarPorRetenciones"));
			
		this.jMenuItemNuevoRetencionesPorPagarPorRetenciones.addActionListener (new ButtonActionListener(this,"MenuItemNuevoRetencionesPorPagarPorRetenciones"));
			
		this.jMenuItemDuplicarRetencionesPorPagarPorRetenciones.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarRetencionesPorPagarPorRetenciones"));		
		
		
		this.jButtonNuevoRelacionesRetencionesPorPagarPorRetenciones.addActionListener (new ButtonActionListener(this,"NuevoRelacionesRetencionesPorPagarPorRetenciones"));
		
		
		this.jButtonNuevoRelacionesToolBarRetencionesPorPagarPorRetenciones.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarRetencionesPorPagarPorRetenciones"));
			
		this.jMenuItemNuevoRelacionesRetencionesPorPagarPorRetenciones.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesRetencionesPorPagarPorRetenciones"));		
		
		
		if(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonModificarRetencionesPorPagarPorRetenciones.addActionListener(new ButtonActionListener(this,"ModificarRetencionesPorPagarPorRetenciones"));
		}
		
		
		if(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonModificarToolBarRetencionesPorPagarPorRetenciones.addActionListener(new ButtonActionListener(this,"ModificarToolBarRetencionesPorPagarPorRetenciones"));
			
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jMenuItemModificarRetencionesPorPagarPorRetenciones.addActionListener(new ButtonActionListener(this,"MenuItemModificarRetencionesPorPagarPorRetenciones"));		
		}
		
		
		if(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonActualizarRetencionesPorPagarPorRetenciones.addActionListener (new ButtonActionListener(this,"ActualizarRetencionesPorPagarPorRetenciones"));
		}
		
		
		if(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonActualizarToolBarRetencionesPorPagarPorRetenciones.addActionListener(new ButtonActionListener(this,"ActualizarToolBarRetencionesPorPagarPorRetenciones"));
				
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jMenuItemActualizarRetencionesPorPagarPorRetenciones.addActionListener (new ButtonActionListener(this,"MenuItemActualizarRetencionesPorPagarPorRetenciones"));		
		}
		
		
		if(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonEliminarRetencionesPorPagarPorRetenciones.addActionListener (new ButtonActionListener(this,"EliminarRetencionesPorPagarPorRetenciones"));
		}
		
		
		if(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonEliminarToolBarRetencionesPorPagarPorRetenciones.addActionListener (new ButtonActionListener(this,"EliminarToolBarRetencionesPorPagarPorRetenciones"));
						
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jMenuItemEliminarRetencionesPorPagarPorRetenciones.addActionListener (new ButtonActionListener(this,"MenuItemEliminarRetencionesPorPagarPorRetenciones"));		
		}
		
		
		if(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonCancelarRetencionesPorPagarPorRetenciones.addActionListener (new ButtonActionListener(this,"CancelarRetencionesPorPagarPorRetenciones"));
		}
		
		
		if(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonCancelarToolBarRetencionesPorPagarPorRetenciones.addActionListener (new ButtonActionListener(this,"CancelarToolBarRetencionesPorPagarPorRetenciones"));
			
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jMenuItemCancelarRetencionesPorPagarPorRetenciones.addActionListener (new ButtonActionListener(this,"MenuItemCancelarRetencionesPorPagarPorRetenciones"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarRetencionesPorPagarPorRetenciones.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarRetencionesPorPagarPorRetenciones"));		
		
		
		this.jButtonCerrarRetencionesPorPagarPorRetenciones.addActionListener (new ButtonActionListener(this,"CerrarRetencionesPorPagarPorRetenciones"));
		
		
		this.jButtonCerrarToolBarRetencionesPorPagarPorRetenciones.addActionListener (new ButtonActionListener(this,"CerrarToolBarRetencionesPorPagarPorRetenciones"));
			
		this.jMenuItemCerrarRetencionesPorPagarPorRetenciones.addActionListener (new ButtonActionListener(this,"MenuItemCerrarRetencionesPorPagarPorRetenciones"));
			
		if(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jMenuItemDetalleCerrarRetencionesPorPagarPorRetenciones.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarRetencionesPorPagarPorRetenciones"));		
		}
		
		
		if(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonGuardarCambiosRetencionesPorPagarPorRetenciones.addActionListener (new ButtonActionListener(this,"GuardarCambiosRetencionesPorPagarPorRetenciones"));
		}
		
		
		if(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonGuardarCambiosToolBarRetencionesPorPagarPorRetenciones.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarRetencionesPorPagarPorRetenciones"));
		}
		
		this.jButtonCopiarToolBarRetencionesPorPagarPorRetenciones.addActionListener (new ButtonActionListener(this,"CopiarToolBarRetencionesPorPagarPorRetenciones"));
			
		this.jButtonVerFormToolBarRetencionesPorPagarPorRetenciones.addActionListener (new ButtonActionListener(this,"VerFormToolBarRetencionesPorPagarPorRetenciones"));
		
		this.jMenuItemGuardarCambiosRetencionesPorPagarPorRetenciones.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosRetencionesPorPagarPorRetenciones"));
			
		this.jMenuItemCopiarRetencionesPorPagarPorRetenciones.addActionListener (new ButtonActionListener(this,"MenuItemCopiarRetencionesPorPagarPorRetenciones"));		
		
		this.jMenuItemVerFormRetencionesPorPagarPorRetenciones.addActionListener (new ButtonActionListener(this,"MenuItemVerFormRetencionesPorPagarPorRetenciones"));		
		
		
		this.jButtonGuardarCambiosTablaRetencionesPorPagarPorRetenciones.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaRetencionesPorPagarPorRetenciones"));
		
		
		this.jButtonGuardarCambiosTablaToolBarRetencionesPorPagarPorRetenciones.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarRetencionesPorPagarPorRetenciones"));
			
		this.jMenuItemGuardarCambiosTablaRetencionesPorPagarPorRetenciones.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaRetencionesPorPagarPorRetenciones"));		
		
		
		
		this.jButtonRecargarInformacionRetencionesPorPagarPorRetenciones.addActionListener (new ButtonActionListener(this,"RecargarInformacionRetencionesPorPagarPorRetenciones"));
					
		this.jButtonRecargarInformacionToolBarRetencionesPorPagarPorRetenciones.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarRetencionesPorPagarPorRetenciones"));
		
		this.jMenuItemRecargarInformacionRetencionesPorPagarPorRetenciones.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionRetencionesPorPagarPorRetenciones"));		
		
		
		
		this.jButtonAnterioresRetencionesPorPagarPorRetenciones.addActionListener (new ButtonActionListener(this,"AnterioresRetencionesPorPagarPorRetenciones"));
		
		
		this.jButtonAnterioresToolBarRetencionesPorPagarPorRetenciones.addActionListener (new ButtonActionListener(this,"AnterioresToolBarRetencionesPorPagarPorRetenciones"));
		
		this.jMenuItemAnterioresRetencionesPorPagarPorRetenciones.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresRetencionesPorPagarPorRetenciones"));		
		
		
		this.jButtonSiguientesRetencionesPorPagarPorRetenciones.addActionListener (new ButtonActionListener(this,"SiguientesRetencionesPorPagarPorRetenciones"));
		
		
		this.jButtonSiguientesToolBarRetencionesPorPagarPorRetenciones.addActionListener (new ButtonActionListener(this,"SiguientesToolBarRetencionesPorPagarPorRetenciones"));
			
		this.jMenuItemSiguientesRetencionesPorPagarPorRetenciones.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesRetencionesPorPagarPorRetenciones"));
			
		this.jMenuItemAbrirOrderByRetencionesPorPagarPorRetenciones.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByRetencionesPorPagarPorRetenciones"));
			
		this.jMenuItemMostrarOcultarRetencionesPorPagarPorRetenciones.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarRetencionesPorPagarPorRetenciones"));
			
		this.jMenuItemDetalleAbrirOrderByRetencionesPorPagarPorRetenciones.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByRetencionesPorPagarPorRetenciones"));
			
		this.jMenuItemDetalleMostarOcultarRetencionesPorPagarPorRetenciones.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarRetencionesPorPagarPorRetenciones"));		
		
		
		this.jButtonNuevoGuardarCambiosRetencionesPorPagarPorRetenciones.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosRetencionesPorPagarPorRetenciones"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarRetencionesPorPagarPorRetenciones.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarRetencionesPorPagarPorRetenciones"));
			
		this.jMenuItemNuevoGuardarCambiosRetencionesPorPagarPorRetenciones.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosRetencionesPorPagarPorRetenciones"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosRetencionesPorPagarPorRetenciones.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosRetencionesPorPagarPorRetenciones"));

		this.jCheckBoxSeleccionadosRetencionesPorPagarPorRetenciones.addItemListener(new CheckBoxItemListener(this,"SeleccionadosRetencionesPorPagarPorRetenciones"));
		
		if(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jComboBoxTiposAccionesFormularioRetencionesPorPagarPorRetenciones.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioRetencionesPorPagarPorRetenciones"));
		}
		
		
		this.jComboBoxTiposRelacionesRetencionesPorPagarPorRetenciones.addActionListener (new ButtonActionListener(this,"TiposRelacionesRetencionesPorPagarPorRetenciones"));
			
		this.jComboBoxTiposAccionesRetencionesPorPagarPorRetenciones.addActionListener (new ButtonActionListener(this,"TiposAccionesRetencionesPorPagarPorRetenciones"));
					
		this.jComboBoxTiposSeleccionarRetencionesPorPagarPorRetenciones.addActionListener (new ButtonActionListener(this,"TiposSeleccionarRetencionesPorPagarPorRetenciones"));
			
		this.jTextFieldValorCampoGeneralRetencionesPorPagarPorRetenciones.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralRetencionesPorPagarPorRetenciones"));		
		
		
		if(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonidRetencionesPorPagarPorRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"idRetencionesPorPagarPorRetencionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonid_empresaRetencionesPorPagarPorRetencionesUpdate.addActionListener(new ButtonActionListener(this,"id_empresaRetencionesPorPagarPorRetencionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonid_empresaRetencionesPorPagarPorRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaRetencionesPorPagarPorRetencionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonid_sucursalRetencionesPorPagarPorRetencionesUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalRetencionesPorPagarPorRetencionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonid_sucursalRetencionesPorPagarPorRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalRetencionesPorPagarPorRetencionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonid_ejercicioRetencionesPorPagarPorRetencionesUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioRetencionesPorPagarPorRetencionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonid_ejercicioRetencionesPorPagarPorRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioRetencionesPorPagarPorRetencionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonid_periodoRetencionesPorPagarPorRetencionesUpdate.addActionListener(new ButtonActionListener(this,"id_periodoRetencionesPorPagarPorRetencionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonid_periodoRetencionesPorPagarPorRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoRetencionesPorPagarPorRetencionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtones_debitoRetencionesPorPagarPorRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"es_debitoRetencionesPorPagarPorRetencionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonfecha_emisionRetencionesPorPagarPorRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionRetencionesPorPagarPorRetencionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonnombre_tipo_movimientoRetencionesPorPagarPorRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_tipo_movimientoRetencionesPorPagarPorRetencionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonnumero_mayorRetencionesPorPagarPorRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"numero_mayorRetencionesPorPagarPorRetencionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonnombre_cuenta_contable_retencionRetencionesPorPagarPorRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_cuenta_contable_retencionRetencionesPorPagarPorRetencionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonnumero_pre_impreso_facturaRetencionesPorPagarPorRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"numero_pre_impreso_facturaRetencionesPorPagarPorRetencionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonporcentajeRetencionesPorPagarPorRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeRetencionesPorPagarPorRetencionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonbase_imponibleRetencionesPorPagarPorRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"base_imponibleRetencionesPorPagarPorRetencionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonvalorRetencionesPorPagarPorRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"valorRetencionesPorPagarPorRetencionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonnumeroRetencionesPorPagarPorRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"numeroRetencionesPorPagarPorRetencionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonnombre_benefRetencionesPorPagarPorRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_benefRetencionesPorPagarPorRetencionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonruc_benefRetencionesPorPagarPorRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"ruc_benefRetencionesPorPagarPorRetencionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonnombre_cuenta_contableRetencionesPorPagarPorRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_cuenta_contableRetencionesPorPagarPorRetencionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonnombre_cuenta_contable_creditoRetencionesPorPagarPorRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_cuenta_contable_creditoRetencionesPorPagarPorRetencionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtones_debito_datoRetencionesPorPagarPorRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"es_debito_datoRetencionesPorPagarPorRetencionesBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones.addActionListener(new ButtonActionListener(this,"BusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoRetencionesPorPagarPorRetenciones!=null) {
				this.jInternalFrameReporteDinamicoRetencionesPorPagarPorRetenciones.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoRetencionesPorPagarPorRetenciones"));
				this.jInternalFrameReporteDinamicoRetencionesPorPagarPorRetenciones.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoRetencionesPorPagarPorRetenciones"));
				this.jInternalFrameReporteDinamicoRetencionesPorPagarPorRetenciones.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoRetencionesPorPagarPorRetenciones"));
			}
			
			//this.jButtonCerrarReporteDinamicoRetencionesPorPagarPorRetenciones.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoRetencionesPorPagarPorRetenciones"));				
			//this.jButtonGenerarReporteDinamicoRetencionesPorPagarPorRetenciones.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoRetencionesPorPagarPorRetenciones"));
			//this.jButtonGenerarExcelReporteDinamicoRetencionesPorPagarPorRetenciones.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoRetencionesPorPagarPorRetenciones"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionRetencionesPorPagarPorRetenciones!=null) {
				this.jInternalFrameImportacionRetencionesPorPagarPorRetenciones.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionRetencionesPorPagarPorRetenciones"));
				this.jInternalFrameImportacionRetencionesPorPagarPorRetenciones.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionRetencionesPorPagarPorRetenciones"));
				this.jInternalFrameImportacionRetencionesPorPagarPorRetenciones.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionRetencionesPorPagarPorRetenciones"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByRetencionesPorPagarPorRetenciones.addActionListener (new ButtonActionListener(this,"AbrirOrderByRetencionesPorPagarPorRetenciones"));
			
			this.jButtonAbrirOrderByToolBarRetencionesPorPagarPorRetenciones.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarRetencionesPorPagarPorRetenciones"));			
			
			if(this.jInternalFrameOrderByRetencionesPorPagarPorRetenciones!=null) {
				this.jInternalFrameOrderByRetencionesPorPagarPorRetenciones.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByRetencionesPorPagarPorRetenciones"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTabbedPaneRelacionesRetencionesPorPagarPorRetenciones.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesRetencionesPorPagarPorRetenciones"));
		
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
            		closingInternalFrameRetencionesPorPagarPorRetenciones();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones = (JInternalFrameBase)event.getSource();
	            	
	            RetencionesPorPagarPorRetencionesBeanSwingJInternalFrame jInternalFrameParent=(RetencionesPorPagarPorRetencionesBeanSwingJInternalFrame)jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarRetencionesPorPagarPorRetencionesActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosRetencionesPorPagarPorRetenciones.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosRetencionesPorPagarPorRetencionesListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosRetencionesPorPagarPorRetenciones.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosRetencionesPorPagarPorRetenciones.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoRetencionesPorPagarPorRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRetencionesPorPagarPorRetencionesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarRetencionesPorPagarPorRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRetencionesPorPagarPorRetencionesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRetencionesPorPagarPorRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRetencionesPorPagarPorRetencionesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRetencionesPorPagarPorRetenciones";
		inputMap = this.jButtonNuevoRetencionesPorPagarPorRetenciones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRetencionesPorPagarPorRetenciones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoRetencionesPorPagarPorRetencionesActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesRetencionesPorPagarPorRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRetencionesPorPagarPorRetencionesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarRetencionesPorPagarPorRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRetencionesPorPagarPorRetencionesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesRetencionesPorPagarPorRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRetencionesPorPagarPorRetencionesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesRetencionesPorPagarPorRetenciones";
		inputMap = this.jButtonNuevoRelacionesRetencionesPorPagarPorRetenciones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesRetencionesPorPagarPorRetenciones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoRetencionesPorPagarPorRetencionesActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarRetencionesPorPagarPorRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarRetencionesPorPagarPorRetencionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarRetencionesPorPagarPorRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarRetencionesPorPagarPorRetencionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarRetencionesPorPagarPorRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarRetencionesPorPagarPorRetencionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarRetencionesPorPagarPorRetenciones";
		inputMap = this.jButtonModificarRetencionesPorPagarPorRetenciones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarRetencionesPorPagarPorRetenciones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarRetencionesPorPagarPorRetencionesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarRetencionesPorPagarPorRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarRetencionesPorPagarPorRetencionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarRetencionesPorPagarPorRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarRetencionesPorPagarPorRetencionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarRetencionesPorPagarPorRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarRetencionesPorPagarPorRetencionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarRetencionesPorPagarPorRetenciones";
		inputMap = this.jButtonActualizarRetencionesPorPagarPorRetenciones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarRetencionesPorPagarPorRetenciones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarRetencionesPorPagarPorRetencionesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarRetencionesPorPagarPorRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarRetencionesPorPagarPorRetencionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarRetencionesPorPagarPorRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarRetencionesPorPagarPorRetencionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarRetencionesPorPagarPorRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarRetencionesPorPagarPorRetencionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarRetencionesPorPagarPorRetenciones";
		inputMap = this.jButtonEliminarRetencionesPorPagarPorRetenciones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarRetencionesPorPagarPorRetenciones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarRetencionesPorPagarPorRetencionesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarRetencionesPorPagarPorRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarRetencionesPorPagarPorRetencionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarRetencionesPorPagarPorRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarRetencionesPorPagarPorRetencionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarRetencionesPorPagarPorRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarRetencionesPorPagarPorRetencionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarRetencionesPorPagarPorRetenciones";
		inputMap = this.jButtonCancelarRetencionesPorPagarPorRetenciones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarRetencionesPorPagarPorRetenciones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarRetencionesPorPagarPorRetencionesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarRetencionesPorPagarPorRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarRetencionesPorPagarPorRetencionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarRetencionesPorPagarPorRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarRetencionesPorPagarPorRetencionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarRetencionesPorPagarPorRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarRetencionesPorPagarPorRetencionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarRetencionesPorPagarPorRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarRetencionesPorPagarPorRetencionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarRetencionesPorPagarPorRetencionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarRetencionesPorPagarPorRetenciones";
		inputMap = this.jButtonCerrarRetencionesPorPagarPorRetenciones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarRetencionesPorPagarPorRetenciones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarRetencionesPorPagarPorRetencionesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonGuardarCambiosRetencionesPorPagarPorRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRetencionesPorPagarPorRetencionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarRetencionesPorPagarPorRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRetencionesPorPagarPorRetencionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosRetencionesPorPagarPorRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRetencionesPorPagarPorRetencionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaRetencionesPorPagarPorRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRetencionesPorPagarPorRetencionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarRetencionesPorPagarPorRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRetencionesPorPagarPorRetencionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaRetencionesPorPagarPorRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRetencionesPorPagarPorRetencionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosRetencionesPorPagarPorRetenciones";
		inputMap = this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonGuardarCambiosRetencionesPorPagarPorRetenciones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonGuardarCambiosRetencionesPorPagarPorRetenciones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosRetencionesPorPagarPorRetencionesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionRetencionesPorPagarPorRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionRetencionesPorPagarPorRetencionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarRetencionesPorPagarPorRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionRetencionesPorPagarPorRetencionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionRetencionesPorPagarPorRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionRetencionesPorPagarPorRetencionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresRetencionesPorPagarPorRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresRetencionesPorPagarPorRetencionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarRetencionesPorPagarPorRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresRetencionesPorPagarPorRetencionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresRetencionesPorPagarPorRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresRetencionesPorPagarPorRetencionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesRetencionesPorPagarPorRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesRetencionesPorPagarPorRetencionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarRetencionesPorPagarPorRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesRetencionesPorPagarPorRetencionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesRetencionesPorPagarPorRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesRetencionesPorPagarPorRetencionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosRetencionesPorPagarPorRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosRetencionesPorPagarPorRetencionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarRetencionesPorPagarPorRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosRetencionesPorPagarPorRetencionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosRetencionesPorPagarPorRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosRetencionesPorPagarPorRetencionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosRetencionesPorPagarPorRetenciones.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosRetencionesPorPagarPorRetencionesItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesRetencionesPorPagarPorRetenciones.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesRetencionesPorPagarPorRetencionesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarRetencionesPorPagarPorRetenciones.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarRetencionesPorPagarPorRetencionesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralRetencionesPorPagarPorRetenciones.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralRetencionesPorPagarPorRetencionesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonidRetencionesPorPagarPorRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"idRetencionesPorPagarPorRetencionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonid_empresaRetencionesPorPagarPorRetencionesUpdate.addActionListener(new ButtonActionListener(this,"id_empresaRetencionesPorPagarPorRetencionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonid_empresaRetencionesPorPagarPorRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaRetencionesPorPagarPorRetencionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonid_sucursalRetencionesPorPagarPorRetencionesUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalRetencionesPorPagarPorRetencionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonid_sucursalRetencionesPorPagarPorRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalRetencionesPorPagarPorRetencionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonid_ejercicioRetencionesPorPagarPorRetencionesUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioRetencionesPorPagarPorRetencionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonid_ejercicioRetencionesPorPagarPorRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioRetencionesPorPagarPorRetencionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonid_periodoRetencionesPorPagarPorRetencionesUpdate.addActionListener(new ButtonActionListener(this,"id_periodoRetencionesPorPagarPorRetencionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonid_periodoRetencionesPorPagarPorRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoRetencionesPorPagarPorRetencionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtones_debitoRetencionesPorPagarPorRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"es_debitoRetencionesPorPagarPorRetencionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonfecha_emisionRetencionesPorPagarPorRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionRetencionesPorPagarPorRetencionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonnombre_tipo_movimientoRetencionesPorPagarPorRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_tipo_movimientoRetencionesPorPagarPorRetencionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonnumero_mayorRetencionesPorPagarPorRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"numero_mayorRetencionesPorPagarPorRetencionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonnombre_cuenta_contable_retencionRetencionesPorPagarPorRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_cuenta_contable_retencionRetencionesPorPagarPorRetencionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonnumero_pre_impreso_facturaRetencionesPorPagarPorRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"numero_pre_impreso_facturaRetencionesPorPagarPorRetencionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonporcentajeRetencionesPorPagarPorRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeRetencionesPorPagarPorRetencionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonbase_imponibleRetencionesPorPagarPorRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"base_imponibleRetencionesPorPagarPorRetencionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonvalorRetencionesPorPagarPorRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"valorRetencionesPorPagarPorRetencionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonnumeroRetencionesPorPagarPorRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"numeroRetencionesPorPagarPorRetencionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonnombre_benefRetencionesPorPagarPorRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_benefRetencionesPorPagarPorRetencionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonruc_benefRetencionesPorPagarPorRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"ruc_benefRetencionesPorPagarPorRetencionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonnombre_cuenta_contableRetencionesPorPagarPorRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_cuenta_contableRetencionesPorPagarPorRetencionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtonnombre_cuenta_contable_creditoRetencionesPorPagarPorRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_cuenta_contable_creditoRetencionesPorPagarPorRetencionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jButtones_debito_datoRetencionesPorPagarPorRetencionesBusqueda.addActionListener(new ButtonActionListener(this,"es_debito_datoRetencionesPorPagarPorRetencionesBusqueda"));
		
		
		this.jButtonBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones.addActionListener(new ButtonActionListener(this,"BusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoRetencionesPorPagarPorRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoRetencionesPorPagarPorRetencionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoRetencionesPorPagarPorRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoRetencionesPorPagarPorRetencionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoRetencionesPorPagarPorRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoRetencionesPorPagarPorRetencionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionRetencionesPorPagarPorRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionRetencionesPorPagarPorRetencionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionRetencionesPorPagarPorRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionRetencionesPorPagarPorRetencionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionRetencionesPorPagarPorRetenciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionRetencionesPorPagarPorRetencionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarRetencionesPorPagarPorRetencionesActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarRetencionesPorPagarPorRetenciones.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosRetencionesPorPagarPorRetenciones(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(RetencionesPorPagarPorRetenciones retencionesporpagarporretencionesAux:this.retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness()) {
					retencionesporpagarporretencionesAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(RetencionesPorPagarPorRetenciones retencionesporpagarporretencionesAux:retencionesporpagarporretencioness) {
					retencionesporpagarporretencionesAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosRetencionesPorPagarPorRetencionesItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingRetencionesPorPagarPorRetenciones(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(RetencionesPorPagarPorRetenciones retencionesporpagarporretencionesAux:this.retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness()) {
						retencionesporpagarporretencionesAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(RetencionesPorPagarPorRetenciones retencionesporpagarporretencionesAux:retencionesporpagarporretencioness) {
						retencionesporpagarporretencionesAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(RetencionesPorPagarPorRetenciones retencionesporpagarporretencionesAux:this.retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness()) {
					
						if(sTipoSeleccionar.equals(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_ESDEBITO)) {
							existe=true;
							retencionesporpagarporretencionesAux.setes_debito(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_ESDEBITODATO)) {
							existe=true;
							retencionesporpagarporretencionesAux.setes_debito_dato(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(RetencionesPorPagarPorRetenciones retencionesporpagarporretencionesAux:retencionesporpagarporretencioness) {
						
						if(sTipoSeleccionar.equals(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_ESDEBITO)) {
							existe=true;
							retencionesporpagarporretencionesAux.setes_debito(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_ESDEBITODATO)) {
							existe=true;
							retencionesporpagarporretencionesAux.setes_debito_dato(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaRetencionesPorPagarPorRetenciones(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosRetencionesPorPagarPorRetenciones.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosRetencionesPorPagarPorRetenciones.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosRetencionesPorPagarPorRetenciones,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosRetencionesPorPagarPorRetencionesItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingRetencionesPorPagarPorRetenciones(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosRetencionesPorPagarPorRetenciones.getSelectedRows();
			
			RetencionesPorPagarPorRetenciones retencionesporpagarporretencionesLocal=new RetencionesPorPagarPorRetenciones();
			
			//this.seleccionarTodosRetencionesPorPagarPorRetenciones(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					retencionesporpagarporretencionesLocal =(RetencionesPorPagarPorRetenciones) this.retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness().toArray()[this.jTableDatosRetencionesPorPagarPorRetenciones.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					retencionesporpagarporretencionesLocal =(RetencionesPorPagarPorRetenciones) this.retencionesporpagarporretencioness.toArray()[this.jTableDatosRetencionesPorPagarPorRetenciones.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				retencionesporpagarporretencionesLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(RetencionesPorPagarPorRetenciones retencionesporpagarporretencionesAux:this.retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness()) {
						retencionesporpagarporretencionesAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(RetencionesPorPagarPorRetenciones retencionesporpagarporretencionesAux:retencionesporpagarporretencioness) {
						retencionesporpagarporretencionesAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaRetencionesPorPagarPorRetenciones(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosRetencionesPorPagarPorRetenciones.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosRetencionesPorPagarPorRetenciones.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosRetencionesPorPagarPorRetenciones,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualRetencionesPorPagarPorRetencionesItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarRetencionesPorPagarPorRetencionesParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralRetencionesPorPagarPorRetencionesActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingRetencionesPorPagarPorRetenciones(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralRetencionesPorPagarPorRetenciones.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(RetencionesPorPagarPorRetenciones retencionesporpagarporretencionesAux:this.retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness()) {
				
						if(sTipoSeleccionar.equals(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							retencionesporpagarporretencionesAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBRETIPOMOVIMIENTO)) {
							existe=true;
							retencionesporpagarporretencionesAux.setnombre_tipo_movimiento(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NUMEROMAYOR)) {
							existe=true;
							retencionesporpagarporretencionesAux.setnumero_mayor(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBRECUENTACONTABLERETENCION)) {
							existe=true;
							retencionesporpagarporretencionesAux.setnombre_cuenta_contable_retencion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA)) {
							existe=true;
							retencionesporpagarporretencionesAux.setnumero_pre_impreso_factura(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							retencionesporpagarporretencionesAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_BASEIMPONIBLE)) {
							existe=true;
							retencionesporpagarporretencionesAux.setbase_imponible(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							retencionesporpagarporretencionesAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NUMERO)) {
							existe=true;
							retencionesporpagarporretencionesAux.setnumero(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBREBENEF)) {
							existe=true;
							retencionesporpagarporretencionesAux.setnombre_benef(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_RUCBENEF)) {
							existe=true;
							retencionesporpagarporretencionesAux.setruc_benef(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBRECUENTACONTABLE)) {
							existe=true;
							retencionesporpagarporretencionesAux.setnombre_cuenta_contable(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBRECUENTACONTABLECREDITO)) {
							existe=true;
							retencionesporpagarporretencionesAux.setnombre_cuenta_contable_credito(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(RetencionesPorPagarPorRetenciones retencionesporpagarporretencionesAux:retencionesporpagarporretencioness) {
					
						if(sTipoSeleccionar.equals(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							retencionesporpagarporretencionesAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBRETIPOMOVIMIENTO)) {
							existe=true;
							retencionesporpagarporretencionesAux.setnombre_tipo_movimiento(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NUMEROMAYOR)) {
							existe=true;
							retencionesporpagarporretencionesAux.setnumero_mayor(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBRECUENTACONTABLERETENCION)) {
							existe=true;
							retencionesporpagarporretencionesAux.setnombre_cuenta_contable_retencion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA)) {
							existe=true;
							retencionesporpagarporretencionesAux.setnumero_pre_impreso_factura(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							retencionesporpagarporretencionesAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_BASEIMPONIBLE)) {
							existe=true;
							retencionesporpagarporretencionesAux.setbase_imponible(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							retencionesporpagarporretencionesAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NUMERO)) {
							existe=true;
							retencionesporpagarporretencionesAux.setnumero(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBREBENEF)) {
							existe=true;
							retencionesporpagarporretencionesAux.setnombre_benef(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_RUCBENEF)) {
							existe=true;
							retencionesporpagarporretencionesAux.setruc_benef(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBRECUENTACONTABLE)) {
							existe=true;
							retencionesporpagarporretencionesAux.setnombre_cuenta_contable(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBRECUENTACONTABLECREDITO)) {
							existe=true;
							retencionesporpagarporretencionesAux.setnombre_cuenta_contable_credito(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaRetencionesPorPagarPorRetenciones(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesRetencionesPorPagarPorRetencionesActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingRetencionesPorPagarPorRetenciones(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioRetencionesPorPagarPorRetenciones=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesRetencionesPorPagarPorRetenciones.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jComboBoxTiposAccionesFormularioRetencionesPorPagarPorRetenciones.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteRetencionesPorPagarPorRetenciones) {				
					conSplash=true;//false;										
					
					//this.startProcessRetencionesPorPagarPorRetenciones(conSplash);
				
					this.generarReporteRetencionesPorPagarPorRetencionessSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesRetencionesPorPagarPorRetenciones.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jComboBoxTiposAccionesFormularioRetencionesPorPagarPorRetenciones.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoRetencionesPorPagarPorRetencionessSeleccionados();
				//this.jComboBoxTiposAccionesRetencionesPorPagarPorRetenciones.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoRetencionesPorPagarPorRetencionessSeleccionados(false);
				//this.jComboBoxTiposAccionesRetencionesPorPagarPorRetenciones.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoRetencionesPorPagarPorRetencionessSeleccionados(true);
				//this.jComboBoxTiposAccionesRetencionesPorPagarPorRetenciones.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessRetencionesPorPagarPorRetenciones();
				
				this.exportarRetencionesPorPagarPorRetencionessSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesRetencionesPorPagarPorRetenciones.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jComboBoxTiposAccionesFormularioRetencionesPorPagarPorRetenciones.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionRetencionesPorPagarPorRetencioness();
				//this.importarRetencionesPorPagarPorRetencioness();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesRetencionesPorPagarPorRetenciones.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jComboBoxTiposAccionesFormularioRetencionesPorPagarPorRetenciones.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessRetencionesPorPagarPorRetenciones();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelRetencionesPorPagarPorRetencionessSeleccionados();
				//this.jComboBoxTiposAccionesRetencionesPorPagarPorRetenciones.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Retenciones Por Pagar Por Retenciones", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessRetencionesPorPagarPorRetenciones();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoRetencionesPorPagarPorRetenciones)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyRetencionesPorPagarPorRetenciones(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Retenciones Por Pagar Por Retenciones",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesRetencionesPorPagarPorRetenciones.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jComboBoxTiposAccionesFormularioRetencionesPorPagarPorRetenciones.setSelectedIndex(0);					
				}	
			} 			
			else if(RetencionesPorPagarPorRetencionesBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteRetencionesPorPagarPorRetenciones) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessRetencionesPorPagarPorRetenciones(conSplash);
					
						//this.actualizarParametrosGeneralRetencionesPorPagarPorRetenciones();
						
						this.generarReporteProcesoAccionRetencionesPorPagarPorRetencionessSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesRetencionesPorPagarPorRetenciones.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jComboBoxTiposAccionesFormularioRetencionesPorPagarPorRetenciones.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(RetencionesPorPagarPorRetencionesBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Retenciones Por Pagar Por RetencionesES SELECCIONADOS?", "MANTENIMIENTO DE Retenciones Por Pagar Por Retenciones", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessRetencionesPorPagarPorRetenciones();
				
						this.actualizarParametrosGeneralRetencionesPorPagarPorRetenciones();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.retencionesporpagarporretencionesReturnGeneral=retencionesporpagarporretencionesLogic.procesarAccionRetencionesPorPagarPorRetencionessWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness(),this.retencionesporpagarporretencionesParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarRetencionesPorPagarPorRetencionesReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesRetencionesPorPagarPorRetenciones.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jComboBoxTiposAccionesFormularioRetencionesPorPagarPorRetenciones.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralRetencionesPorPagarPorRetenciones();
					
					RetencionesPorPagarPorRetencionesBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarRetencionesPorPagarPorRetencionesReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesRetencionesPorPagarPorRetenciones.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jComboBoxTiposAccionesFormularioRetencionesPorPagarPorRetenciones.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessRetencionesPorPagarPorRetenciones(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesRetencionesPorPagarPorRetencionesActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessRetencionesPorPagarPorRetenciones();
			
			if(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<RetencionesPorPagarPorRetenciones> retencionesporpagarporretencionessSeleccionados=new ArrayList<RetencionesPorPagarPorRetenciones>();		
			RetencionesPorPagarPorRetenciones retencionesporpagarporretenciones=new RetencionesPorPagarPorRetenciones();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingRetencionesPorPagarPorRetenciones(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesRetencionesPorPagarPorRetenciones.getSelectedItem();
			
			
			
			
			retencionesporpagarporretencionessSeleccionados=this.getRetencionesPorPagarPorRetencionessSeleccionados(true);
			//this.sTipoAccion;
			
			if(retencionesporpagarporretencionessSeleccionados.size()==1) {
				for(RetencionesPorPagarPorRetenciones retencionesporpagarporretencionesAux:retencionesporpagarporretencionessSeleccionados) {
					retencionesporpagarporretenciones=retencionesporpagarporretencionesAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessRetencionesPorPagarPorRetenciones();
			
      		//this.finishProcessRetencionesPorPagarPorRetenciones(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarRetencionesPorPagarPorRetencionesReturnGeneral() throws Exception {
		if(this.retencionesporpagarporretencionesReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.retencionesporpagarporretencionesReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.retencionesporpagarporretencionesReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.retencionesporpagarporretencionesReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.retencionesporpagarporretencionesReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.retencionesporpagarporretencionesReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingRetencionesPorPagarPorRetenciones(false);
		}
		
		if(this.retencionesporpagarporretencionesReturnGeneral.getConRetornoLista() || this.retencionesporpagarporretencionesReturnGeneral.getConRetornoObjeto()) {
			if(this.retencionesporpagarporretencionesReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.retencionesporpagarporretencionesLogic.setRetencionesPorPagarPorRetencioness(this.retencionesporpagarporretencionesReturnGeneral.getRetencionesPorPagarPorRetencioness());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingRetencionesPorPagarPorRetenciones(false);
		}
	}
	
	public void actualizarParametrosGeneralRetencionesPorPagarPorRetenciones() throws Exception {
		
		
	}
	
	public ArrayList<RetencionesPorPagarPorRetenciones> getRetencionesPorPagarPorRetencionessSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<RetencionesPorPagarPorRetenciones> retencionesporpagarporretencionessSeleccionados=new ArrayList<RetencionesPorPagarPorRetenciones>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioRetencionesPorPagarPorRetenciones) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(RetencionesPorPagarPorRetenciones retencionesporpagarporretencionesAux:retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness()) {
					if(retencionesporpagarporretencionesAux.getIsSelected()) {
						retencionesporpagarporretencionessSeleccionados.add(retencionesporpagarporretencionesAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(RetencionesPorPagarPorRetenciones retencionesporpagarporretencionesAux:this.retencionesporpagarporretencioness) {
					if(retencionesporpagarporretencionesAux.getIsSelected()) {
						retencionesporpagarporretencionessSeleccionados.add(retencionesporpagarporretencionesAux);				
					}
				}
			}
			
			if(retencionesporpagarporretencionessSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						retencionesporpagarporretencionessSeleccionados.addAll(this.retencionesporpagarporretencionesLogic.getRetencionesPorPagarPorRetencioness());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						retencionesporpagarporretencionessSeleccionados.addAll(this.retencionesporpagarporretencioness);				
					}
				}
			}
		} else {
			retencionesporpagarporretencionessSeleccionados.add(this.retencionesporpagarporretenciones);
		}
		
		return retencionesporpagarporretencionessSeleccionados;
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
	
	public void generarReporteRetencionesPorPagarPorRetencionessSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalRetencionesPorPagarPorRetencionessSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoRetencionesPorPagarPorRetencionessSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoRetencionesPorPagarPorRetencionessSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoRetencionesPorPagarPorRetencionessSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Retenciones Por Pagar Por Retenciones",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesRetencionesPorPagarPorRetencionessSeleccionados() throws Exception {
		ArrayList<RetencionesPorPagarPorRetenciones> retencionesporpagarporretencionessSeleccionados=new ArrayList<RetencionesPorPagarPorRetenciones>();		
		
		retencionesporpagarporretencionessSeleccionados=this.getRetencionesPorPagarPorRetencionessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteRetencionesPorPagarPorRetencioness("Todos",retencionesporpagarporretencionessSeleccionados);
		
	}	
	
	public void generarReporteNormalRetencionesPorPagarPorRetencionessSeleccionados() throws Exception {
		ArrayList<RetencionesPorPagarPorRetenciones> retencionesporpagarporretencionessSeleccionados=new ArrayList<RetencionesPorPagarPorRetenciones>();		
		
		retencionesporpagarporretencionessSeleccionados=this.getRetencionesPorPagarPorRetencionessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteRetencionesPorPagarPorRetencioness("Todos",retencionesporpagarporretencionessSeleccionados);
	}		
	
	public void generarReporteProcesoAccionRetencionesPorPagarPorRetencionessSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<RetencionesPorPagarPorRetenciones> retencionesporpagarporretencionessSeleccionados=new ArrayList<RetencionesPorPagarPorRetenciones>();
		
		retencionesporpagarporretencionessSeleccionados=this.getRetencionesPorPagarPorRetencionessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteRetencionesPorPagarPorRetencioness("Todos",retencionesporpagarporretencionessSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoRetencionesPorPagarPorRetencionessSeleccionados() throws Exception {
		ArrayList<RetencionesPorPagarPorRetenciones> retencionesporpagarporretencionessSeleccionados=new ArrayList<RetencionesPorPagarPorRetenciones>();		
		
		
		this.abrirInicializarFrameReporteDinamicoRetencionesPorPagarPorRetenciones();
		
		
		retencionesporpagarporretencionessSeleccionados=this.getRetencionesPorPagarPorRetencionessSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoRetencionesPorPagarPorRetenciones();
		
		
		//this.generarReporteRetencionesPorPagarPorRetencioness("Todos",retencionesporpagarporretencionessSeleccionados ,retencionesporpagarporretencionesImplementable,retencionesporpagarporretencionesImplementableHome);
	}
	
	public void mostrarImportacionRetencionesPorPagarPorRetencioness() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionRetencionesPorPagarPorRetenciones();
		
		this.abrirFrameImportacionRetencionesPorPagarPorRetenciones();		
		
			
		//this.generarReporteRetencionesPorPagarPorRetencioness("Todos",retencionesporpagarporretencionessSeleccionados ,retencionesporpagarporretencionesImplementable,retencionesporpagarporretencionesImplementableHome);
	}
	
	public void importarRetencionesPorPagarPorRetencioness() throws Exception {		
	
	}
	
	public void exportarRetencionesPorPagarPorRetencionessSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelRetencionesPorPagarPorRetencionessSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoRetencionesPorPagarPorRetencionessSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlRetencionesPorPagarPorRetencionessSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Retenciones Por Pagar Por Retenciones",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoRetencionesPorPagarPorRetencionessSeleccionados() throws Exception {
		ArrayList<RetencionesPorPagarPorRetenciones> retencionesporpagarporretencionessSeleccionados=new ArrayList<RetencionesPorPagarPorRetenciones>();		
		
		retencionesporpagarporretencionessSeleccionados=this.getRetencionesPorPagarPorRetencionessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"retencionesporpagarporretenciones."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarRetencionesPorPagarPorRetenciones(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(RetencionesPorPagarPorRetenciones retencionesporpagarporretencionesAux:retencionesporpagarporretencionessSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarRetencionesPorPagarPorRetenciones(retencionesporpagarporretencionesAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//retencionesporpagarporretencionesAux.setsDetalleGeneralEntityReporte(retencionesporpagarporretencionesAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Retenciones Por Pagar Por Retenciones",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarRetencionesPorPagarPorRetenciones(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_IDEJERCICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_IDPERIODO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_ESDEBITO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_FECHAEMISION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBRETIPOMOVIMIENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NUMEROMAYOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBRECUENTACONTABLERETENCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_PORCENTAJE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_BASEIMPONIBLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_VALOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NUMERO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBREBENEF;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_RUCBENEF;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBRECUENTACONTABLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBRECUENTACONTABLECREDITO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_ESDEBITODATO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarRetencionesPorPagarPorRetenciones(RetencionesPorPagarPorRetenciones retencionesporpagarporretenciones,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=retencionesporpagarporretenciones.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=retencionesporpagarporretenciones.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=retencionesporpagarporretenciones.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=retencionesporpagarporretenciones.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=retencionesporpagarporretenciones.getejercicio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=retencionesporpagarporretenciones.getperiodo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=retencionesporpagarporretenciones.getes_debito().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=retencionesporpagarporretenciones.getfecha_emision().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=retencionesporpagarporretenciones.getnombre_tipo_movimiento();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=retencionesporpagarporretenciones.getnumero_mayor();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=retencionesporpagarporretenciones.getnombre_cuenta_contable_retencion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=retencionesporpagarporretenciones.getnumero_pre_impreso_factura();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=retencionesporpagarporretenciones.getporcentaje().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=retencionesporpagarporretenciones.getbase_imponible().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=retencionesporpagarporretenciones.getvalor().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=retencionesporpagarporretenciones.getnumero();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=retencionesporpagarporretenciones.getnombre_benef();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=retencionesporpagarporretenciones.getruc_benef();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=retencionesporpagarporretenciones.getnombre_cuenta_contable();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=retencionesporpagarporretenciones.getnombre_cuenta_contable_credito();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=retencionesporpagarporretenciones.getes_debito_dato().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelRetencionesPorPagarPorRetencionessSeleccionados() throws Exception {
		ArrayList<RetencionesPorPagarPorRetenciones> retencionesporpagarporretencionessSeleccionados=new ArrayList<RetencionesPorPagarPorRetenciones>();		
		
		retencionesporpagarporretencionessSeleccionados=this.getRetencionesPorPagarPorRetencionessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"retencionesporpagarporretenciones.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("RetencionesPorPagarPorRetencioness");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelRetencionesPorPagarPorRetenciones(row);				
				iRow++;
			}				
			
			for(RetencionesPorPagarPorRetenciones retencionesporpagarporretencionesAux:retencionesporpagarporretencionessSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelRetencionesPorPagarPorRetenciones(retencionesporpagarporretencionesAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Retenciones Por Pagar Por Retenciones",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlRetencionesPorPagarPorRetencionessSeleccionados() throws Exception {
		ArrayList<RetencionesPorPagarPorRetenciones> retencionesporpagarporretencionessSeleccionados=new ArrayList<RetencionesPorPagarPorRetenciones>();		
		
		retencionesporpagarporretencionessSeleccionados=this.getRetencionesPorPagarPorRetencionessSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"retencionesporpagarporretenciones.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("retencionesporpagarporretencioness");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("retencionesporpagarporretenciones");
			//elementRoot.appendChild(element);
		
			for(RetencionesPorPagarPorRetenciones retencionesporpagarporretencionesAux:retencionesporpagarporretencionessSeleccionados) {
				element = document.createElement("retencionesporpagarporretenciones");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlRetencionesPorPagarPorRetenciones(retencionesporpagarporretencionesAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Retenciones Por Pagar Por Retenciones",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelRetencionesPorPagarPorRetenciones(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_IDEJERCICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_IDPERIODO);
		cell = row.createCell(iColumn++);cell.setCellValue(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_ESDEBITO);
		cell = row.createCell(iColumn++);cell.setCellValue(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_FECHAEMISION);
		cell = row.createCell(iColumn++);cell.setCellValue(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBRETIPOMOVIMIENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NUMEROMAYOR);
		cell = row.createCell(iColumn++);cell.setCellValue(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBRECUENTACONTABLERETENCION);
		cell = row.createCell(iColumn++);cell.setCellValue(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA);
		cell = row.createCell(iColumn++);cell.setCellValue(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_PORCENTAJE);
		cell = row.createCell(iColumn++);cell.setCellValue(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_BASEIMPONIBLE);
		cell = row.createCell(iColumn++);cell.setCellValue(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_VALOR);
		cell = row.createCell(iColumn++);cell.setCellValue(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NUMERO);
		cell = row.createCell(iColumn++);cell.setCellValue(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBREBENEF);
		cell = row.createCell(iColumn++);cell.setCellValue(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_RUCBENEF);
		cell = row.createCell(iColumn++);cell.setCellValue(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBRECUENTACONTABLE);
		cell = row.createCell(iColumn++);cell.setCellValue(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBRECUENTACONTABLECREDITO);
		cell = row.createCell(iColumn++);cell.setCellValue(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_ESDEBITODATO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelRetencionesPorPagarPorRetenciones(RetencionesPorPagarPorRetenciones retencionesporpagarporretenciones,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(retencionesporpagarporretenciones.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(retencionesporpagarporretenciones.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(retencionesporpagarporretenciones.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(retencionesporpagarporretenciones.getejercicio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(retencionesporpagarporretenciones.getperiodo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(retencionesporpagarporretenciones.getes_debito());
		cell = row.createCell(iColumn++);cell.setCellValue(retencionesporpagarporretenciones.getfecha_emision());
		cell = row.createCell(iColumn++);cell.setCellValue(retencionesporpagarporretenciones.getnombre_tipo_movimiento());
		cell = row.createCell(iColumn++);cell.setCellValue(retencionesporpagarporretenciones.getnumero_mayor());
		cell = row.createCell(iColumn++);cell.setCellValue(retencionesporpagarporretenciones.getnombre_cuenta_contable_retencion());
		cell = row.createCell(iColumn++);cell.setCellValue(retencionesporpagarporretenciones.getnumero_pre_impreso_factura());
		cell = row.createCell(iColumn++);cell.setCellValue(retencionesporpagarporretenciones.getporcentaje());
		cell = row.createCell(iColumn++);cell.setCellValue(retencionesporpagarporretenciones.getbase_imponible());
		cell = row.createCell(iColumn++);cell.setCellValue(retencionesporpagarporretenciones.getvalor());
		cell = row.createCell(iColumn++);cell.setCellValue(retencionesporpagarporretenciones.getnumero());
		cell = row.createCell(iColumn++);cell.setCellValue(retencionesporpagarporretenciones.getnombre_benef());
		cell = row.createCell(iColumn++);cell.setCellValue(retencionesporpagarporretenciones.getruc_benef());
		cell = row.createCell(iColumn++);cell.setCellValue(retencionesporpagarporretenciones.getnombre_cuenta_contable());
		cell = row.createCell(iColumn++);cell.setCellValue(retencionesporpagarporretenciones.getnombre_cuenta_contable_credito());
		cell = row.createCell(iColumn++);cell.setCellValue(retencionesporpagarporretenciones.getes_debito_dato());				
	}
	
	public void setFilaDatosExportarXmlRetencionesPorPagarPorRetenciones(RetencionesPorPagarPorRetenciones retencionesporpagarporretenciones,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(RetencionesPorPagarPorRetencionesConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(retencionesporpagarporretenciones.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(RetencionesPorPagarPorRetencionesConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(retencionesporpagarporretenciones.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(RetencionesPorPagarPorRetencionesConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(retencionesporpagarporretenciones.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(RetencionesPorPagarPorRetencionesConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(retencionesporpagarporretenciones.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementejercicio_descripcion = document.createElement(RetencionesPorPagarPorRetencionesConstantesFunciones.IDEJERCICIO);
		elementejercicio_descripcion.appendChild(document.createTextNode(retencionesporpagarporretenciones.getejercicio_descripcion()));
		element.appendChild(elementejercicio_descripcion);

		Element elementperiodo_descripcion = document.createElement(RetencionesPorPagarPorRetencionesConstantesFunciones.IDPERIODO);
		elementperiodo_descripcion.appendChild(document.createTextNode(retencionesporpagarporretenciones.getperiodo_descripcion()));
		element.appendChild(elementperiodo_descripcion);

		Element elementes_debito = document.createElement(RetencionesPorPagarPorRetencionesConstantesFunciones.ESDEBITO);
		elementes_debito.appendChild(document.createTextNode(retencionesporpagarporretenciones.getes_debito().toString().trim()));
		element.appendChild(elementes_debito);

		Element elementfecha_emision = document.createElement(RetencionesPorPagarPorRetencionesConstantesFunciones.FECHAEMISION);
		elementfecha_emision.appendChild(document.createTextNode(retencionesporpagarporretenciones.getfecha_emision().toString().trim()));
		element.appendChild(elementfecha_emision);

		Element elementnombre_tipo_movimiento = document.createElement(RetencionesPorPagarPorRetencionesConstantesFunciones.NOMBRETIPOMOVIMIENTO);
		elementnombre_tipo_movimiento.appendChild(document.createTextNode(retencionesporpagarporretenciones.getnombre_tipo_movimiento().trim()));
		element.appendChild(elementnombre_tipo_movimiento);

		Element elementnumero_mayor = document.createElement(RetencionesPorPagarPorRetencionesConstantesFunciones.NUMEROMAYOR);
		elementnumero_mayor.appendChild(document.createTextNode(retencionesporpagarporretenciones.getnumero_mayor().trim()));
		element.appendChild(elementnumero_mayor);

		Element elementnombre_cuenta_contable_retencion = document.createElement(RetencionesPorPagarPorRetencionesConstantesFunciones.NOMBRECUENTACONTABLERETENCION);
		elementnombre_cuenta_contable_retencion.appendChild(document.createTextNode(retencionesporpagarporretenciones.getnombre_cuenta_contable_retencion().trim()));
		element.appendChild(elementnombre_cuenta_contable_retencion);

		Element elementnumero_pre_impreso_factura = document.createElement(RetencionesPorPagarPorRetencionesConstantesFunciones.NUMEROPREIMPRESOFACTURA);
		elementnumero_pre_impreso_factura.appendChild(document.createTextNode(retencionesporpagarporretenciones.getnumero_pre_impreso_factura().trim()));
		element.appendChild(elementnumero_pre_impreso_factura);

		Element elementporcentaje = document.createElement(RetencionesPorPagarPorRetencionesConstantesFunciones.PORCENTAJE);
		elementporcentaje.appendChild(document.createTextNode(retencionesporpagarporretenciones.getporcentaje().toString().trim()));
		element.appendChild(elementporcentaje);

		Element elementbase_imponible = document.createElement(RetencionesPorPagarPorRetencionesConstantesFunciones.BASEIMPONIBLE);
		elementbase_imponible.appendChild(document.createTextNode(retencionesporpagarporretenciones.getbase_imponible().toString().trim()));
		element.appendChild(elementbase_imponible);

		Element elementvalor = document.createElement(RetencionesPorPagarPorRetencionesConstantesFunciones.VALOR);
		elementvalor.appendChild(document.createTextNode(retencionesporpagarporretenciones.getvalor().toString().trim()));
		element.appendChild(elementvalor);

		Element elementnumero = document.createElement(RetencionesPorPagarPorRetencionesConstantesFunciones.NUMERO);
		elementnumero.appendChild(document.createTextNode(retencionesporpagarporretenciones.getnumero().trim()));
		element.appendChild(elementnumero);

		Element elementnombre_benef = document.createElement(RetencionesPorPagarPorRetencionesConstantesFunciones.NOMBREBENEF);
		elementnombre_benef.appendChild(document.createTextNode(retencionesporpagarporretenciones.getnombre_benef().trim()));
		element.appendChild(elementnombre_benef);

		Element elementruc_benef = document.createElement(RetencionesPorPagarPorRetencionesConstantesFunciones.RUCBENEF);
		elementruc_benef.appendChild(document.createTextNode(retencionesporpagarporretenciones.getruc_benef().trim()));
		element.appendChild(elementruc_benef);

		Element elementnombre_cuenta_contable = document.createElement(RetencionesPorPagarPorRetencionesConstantesFunciones.NOMBRECUENTACONTABLE);
		elementnombre_cuenta_contable.appendChild(document.createTextNode(retencionesporpagarporretenciones.getnombre_cuenta_contable().trim()));
		element.appendChild(elementnombre_cuenta_contable);

		Element elementnombre_cuenta_contable_credito = document.createElement(RetencionesPorPagarPorRetencionesConstantesFunciones.NOMBRECUENTACONTABLECREDITO);
		elementnombre_cuenta_contable_credito.appendChild(document.createTextNode(retencionesporpagarporretenciones.getnombre_cuenta_contable_credito().trim()));
		element.appendChild(elementnombre_cuenta_contable_credito);

		Element elementes_debito_dato = document.createElement(RetencionesPorPagarPorRetencionesConstantesFunciones.ESDEBITODATO);
		elementes_debito_dato.appendChild(document.createTextNode(retencionesporpagarporretenciones.getes_debito_dato().toString().trim()));
		element.appendChild(elementes_debito_dato);
	}
	
	public void generarReporteGroupGenericoRetencionesPorPagarPorRetencionessSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<RetencionesPorPagarPorRetenciones> retencionesporpagarporretencionessSeleccionados=new ArrayList<RetencionesPorPagarPorRetenciones>();
		
		retencionesporpagarporretencionessSeleccionados=this.getRetencionesPorPagarPorRetencionessSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoRetencionesPorPagarPorRetenciones(retencionesporpagarporretencionessSeleccionados);
		
		this.generarReporteRetencionesPorPagarPorRetencioness("Todos",retencionesporpagarporretencionessSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoRetencionesPorPagarPorRetenciones(ArrayList<RetencionesPorPagarPorRetenciones> retencionesporpagarporretencionessSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(RetencionesPorPagarPorRetenciones retencionesporpagarporretencionesAux:retencionesporpagarporretencionessSeleccionados) {
				retencionesporpagarporretencionesAux.setsDetalleGeneralEntityReporte(retencionesporpagarporretencionesAux.toString());
			
				if(sTipoSeleccionar.equals(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					retencionesporpagarporretencionesAux.setsDescripcionGeneralEntityReporte1(retencionesporpagarporretencionesAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					retencionesporpagarporretencionesAux.setsDescripcionGeneralEntityReporte1(retencionesporpagarporretencionesAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_IDEJERCICIO)) {
					existe=true;
					retencionesporpagarporretencionesAux.setsDescripcionGeneralEntityReporte1(retencionesporpagarporretencionesAux.getejercicio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_IDPERIODO)) {
					existe=true;
					retencionesporpagarporretencionesAux.setsDescripcionGeneralEntityReporte1(retencionesporpagarporretencionesAux.getperiodo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_ESDEBITO)) {
					existe=true;
					retencionesporpagarporretencionesAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(retencionesporpagarporretencionesAux.getes_debito()));
				}
				 else if(sTipoSeleccionar.equals(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_FECHAEMISION)) {
					existe=true;
					retencionesporpagarporretencionesAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(retencionesporpagarporretencionesAux.getfecha_emision()));
				}
				 else if(sTipoSeleccionar.equals(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBRETIPOMOVIMIENTO)) {
					existe=true;
					retencionesporpagarporretencionesAux.setsDescripcionGeneralEntityReporte1(retencionesporpagarporretencionesAux.getnombre_tipo_movimiento());
				}
				 else if(sTipoSeleccionar.equals(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NUMEROMAYOR)) {
					existe=true;
					retencionesporpagarporretencionesAux.setsDescripcionGeneralEntityReporte1(retencionesporpagarporretencionesAux.getnumero_mayor());
				}
				 else if(sTipoSeleccionar.equals(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBRECUENTACONTABLERETENCION)) {
					existe=true;
					retencionesporpagarporretencionesAux.setsDescripcionGeneralEntityReporte1(retencionesporpagarporretencionesAux.getnombre_cuenta_contable_retencion());
				}
				 else if(sTipoSeleccionar.equals(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA)) {
					existe=true;
					retencionesporpagarporretencionesAux.setsDescripcionGeneralEntityReporte1(retencionesporpagarporretencionesAux.getnumero_pre_impreso_factura());
				}
				 else if(sTipoSeleccionar.equals(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NUMERO)) {
					existe=true;
					retencionesporpagarporretencionesAux.setsDescripcionGeneralEntityReporte1(retencionesporpagarporretencionesAux.getnumero());
				}
				 else if(sTipoSeleccionar.equals(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBREBENEF)) {
					existe=true;
					retencionesporpagarporretencionesAux.setsDescripcionGeneralEntityReporte1(retencionesporpagarporretencionesAux.getnombre_benef());
				}
				 else if(sTipoSeleccionar.equals(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_RUCBENEF)) {
					existe=true;
					retencionesporpagarporretencionesAux.setsDescripcionGeneralEntityReporte1(retencionesporpagarporretencionesAux.getruc_benef());
				}
				 else if(sTipoSeleccionar.equals(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBRECUENTACONTABLE)) {
					existe=true;
					retencionesporpagarporretencionesAux.setsDescripcionGeneralEntityReporte1(retencionesporpagarporretencionesAux.getnombre_cuenta_contable());
				}
				 else if(sTipoSeleccionar.equals(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_NOMBRECUENTACONTABLECREDITO)) {
					existe=true;
					retencionesporpagarporretencionesAux.setsDescripcionGeneralEntityReporte1(retencionesporpagarporretencionesAux.getnombre_cuenta_contable_credito());
				}
				 else if(sTipoSeleccionar.equals(RetencionesPorPagarPorRetencionesConstantesFunciones.LABEL_ESDEBITODATO)) {
					existe=true;
					retencionesporpagarporretencionesAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(retencionesporpagarporretencionesAux.getes_debito_dato()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorRetencionesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesRetencionesPorPagarPorRetenciones(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoRetencionesPorPagarPorRetenciones=true;
				this.isVisibilidadCeldaNuevoRelacionesRetencionesPorPagarPorRetenciones=true;
				this.isVisibilidadCeldaGuardarCambiosRetencionesPorPagarPorRetenciones=true;
			}
			
			this.isVisibilidadCeldaModificarRetencionesPorPagarPorRetenciones=false;
			this.isVisibilidadCeldaActualizarRetencionesPorPagarPorRetenciones=false;
			this.isVisibilidadCeldaEliminarRetencionesPorPagarPorRetenciones=false;
			this.isVisibilidadCeldaCancelarRetencionesPorPagarPorRetenciones=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRetencionesPorPagarPorRetenciones=true;
				} else {
					this.isVisibilidadCeldaGuardarRetencionesPorPagarPorRetenciones=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoRetencionesPorPagarPorRetenciones=false;
			this.isVisibilidadCeldaNuevoRelacionesRetencionesPorPagarPorRetenciones=false;
			this.isVisibilidadCeldaGuardarCambiosRetencionesPorPagarPorRetenciones=false;
			this.isVisibilidadCeldaModificarRetencionesPorPagarPorRetenciones=false;
			this.isVisibilidadCeldaActualizarRetencionesPorPagarPorRetenciones=true;
			this.isVisibilidadCeldaEliminarRetencionesPorPagarPorRetenciones=false;
			this.isVisibilidadCeldaCancelarRetencionesPorPagarPorRetenciones=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRetencionesPorPagarPorRetenciones=true;
				} else {
					this.isVisibilidadCeldaGuardarRetencionesPorPagarPorRetenciones=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoRetencionesPorPagarPorRetenciones=false;
			this.isVisibilidadCeldaNuevoRelacionesRetencionesPorPagarPorRetenciones=false;
			this.isVisibilidadCeldaGuardarCambiosRetencionesPorPagarPorRetenciones=false;
			this.isVisibilidadCeldaModificarRetencionesPorPagarPorRetenciones=false;
			this.isVisibilidadCeldaActualizarRetencionesPorPagarPorRetenciones=true;
			this.isVisibilidadCeldaEliminarRetencionesPorPagarPorRetenciones=true;
			this.isVisibilidadCeldaCancelarRetencionesPorPagarPorRetenciones=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRetencionesPorPagarPorRetenciones=true;
				} else {
					this.isVisibilidadCeldaGuardarRetencionesPorPagarPorRetenciones=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoRetencionesPorPagarPorRetenciones=false;
			this.isVisibilidadCeldaNuevoRelacionesRetencionesPorPagarPorRetenciones=false;
			this.isVisibilidadCeldaGuardarCambiosRetencionesPorPagarPorRetenciones=false;
			this.isVisibilidadCeldaModificarRetencionesPorPagarPorRetenciones=false;
			this.isVisibilidadCeldaActualizarRetencionesPorPagarPorRetenciones=true;
			this.isVisibilidadCeldaEliminarRetencionesPorPagarPorRetenciones=false;
			this.isVisibilidadCeldaCancelarRetencionesPorPagarPorRetenciones=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRetencionesPorPagarPorRetenciones=false;
				} else {
					this.isVisibilidadCeldaGuardarRetencionesPorPagarPorRetenciones=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoRetencionesPorPagarPorRetenciones=true;
			this.isVisibilidadCeldaNuevoRelacionesRetencionesPorPagarPorRetenciones=true;
			this.isVisibilidadCeldaGuardarCambiosRetencionesPorPagarPorRetenciones=true;
			this.isVisibilidadCeldaModificarRetencionesPorPagarPorRetenciones=false;
			this.isVisibilidadCeldaActualizarRetencionesPorPagarPorRetenciones=false;
			this.isVisibilidadCeldaEliminarRetencionesPorPagarPorRetenciones=false;
			this.isVisibilidadCeldaCancelarRetencionesPorPagarPorRetenciones=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRetencionesPorPagarPorRetenciones=true;
				} else {
					this.isVisibilidadCeldaGuardarRetencionesPorPagarPorRetenciones=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoRetencionesPorPagarPorRetenciones=false;
			this.isVisibilidadCeldaNuevoRelacionesRetencionesPorPagarPorRetenciones=false;
			this.isVisibilidadCeldaGuardarCambiosRetencionesPorPagarPorRetenciones=false;
			this.isVisibilidadCeldaActualizarRetencionesPorPagarPorRetenciones=false;
			this.isVisibilidadCeldaEliminarRetencionesPorPagarPorRetenciones=false;
			this.isVisibilidadCeldaCancelarRetencionesPorPagarPorRetenciones=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRetencionesPorPagarPorRetenciones=false;
				} else {
					this.isVisibilidadCeldaGuardarRetencionesPorPagarPorRetenciones=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoRetencionesPorPagarPorRetenciones=false;
			this.isVisibilidadCeldaNuevoRelacionesRetencionesPorPagarPorRetenciones=false;
			this.isVisibilidadCeldaGuardarCambiosRetencionesPorPagarPorRetenciones=false;
			this.isVisibilidadCeldaModificarRetencionesPorPagarPorRetenciones=true;
			this.isVisibilidadCeldaActualizarRetencionesPorPagarPorRetenciones=false;
			this.isVisibilidadCeldaEliminarRetencionesPorPagarPorRetenciones=false;
			this.isVisibilidadCeldaCancelarRetencionesPorPagarPorRetenciones=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRetencionesPorPagarPorRetenciones=false;
				} else {
					this.isVisibilidadCeldaGuardarRetencionesPorPagarPorRetenciones=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(RetencionesPorPagarPorRetencionesJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoRetencionesPorPagarPorRetenciones=true;
			this.isVisibilidadCeldaNuevoRelacionesRetencionesPorPagarPorRetenciones=true;
			this.isVisibilidadCeldaGuardarCambiosRetencionesPorPagarPorRetenciones=true;
		} else {
			this.actualizarEstadoPanelsRetencionesPorPagarPorRetenciones(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarRetencionesPorPagarPorRetenciones=false;
			//this.isVisibilidadCeldaVerFormRetencionesPorPagarPorRetenciones=false;
			this.isVisibilidadCeldaDuplicarRetencionesPorPagarPorRetenciones=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!retencionesporpagarporretencionesSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesRetencionesPorPagarPorRetenciones=false;
		} else {
			this.isVisibilidadCeldaNuevoRetencionesPorPagarPorRetenciones=false;
			this.isVisibilidadCeldaGuardarCambiosRetencionesPorPagarPorRetenciones=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado()) {
			if(!retencionesporpagarporretencionesSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesRetencionesPorPagarPorRetenciones=false;												
			}
			
			this.jButtonCerrarRetencionesPorPagarPorRetenciones.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesRetencionesPorPagarPorRetenciones=false;
		}
		
		if(!this.permiteMantenimiento(this.retencionesporpagarporretenciones)) {
			this.isVisibilidadCeldaActualizarRetencionesPorPagarPorRetenciones=false;
			this.isVisibilidadCeldaEliminarRetencionesPorPagarPorRetenciones=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoRetencionesPorPagarPorRetenciones=false;
		this.isVisibilidadCeldaNuevoRelacionesRetencionesPorPagarPorRetenciones=false;
		this.isVisibilidadCeldaGuardarCambiosRetencionesPorPagarPorRetenciones=false;
		//this.isVisibilidadCeldaModificarRetencionesPorPagarPorRetenciones=true;
		this.isVisibilidadCeldaActualizarRetencionesPorPagarPorRetenciones=false;
		this.isVisibilidadCeldaEliminarRetencionesPorPagarPorRetenciones=false;
		//this.isVisibilidadCeldaCancelarRetencionesPorPagarPorRetenciones=true;			
		this.isVisibilidadCeldaGuardarRetencionesPorPagarPorRetenciones=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesRetencionesPorPagarPorRetenciones() {
	}
	
	public void actualizarEstadoPanelsRetencionesPorPagarPorRetenciones(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionRetencionesPorPagarPorRetenciones!=null) {
				this.jScrollPanelDatosEdicionRetencionesPorPagarPorRetenciones.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRetencionesPorPagarPorRetenciones!=null) {
				this.jTabbedPaneBusquedasRetencionesPorPagarPorRetenciones.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosRetencionesPorPagarPorRetenciones!=null) {
				this.jScrollPanelDatosRetencionesPorPagarPorRetenciones.setVisible(true);
			}
			
			if(this.jPanelPaginacionRetencionesPorPagarPorRetenciones!=null) {
				this.jPanelPaginacionRetencionesPorPagarPorRetenciones.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesRetencionesPorPagarPorRetenciones!=null) {
				this.jPanelParametrosReportesRetencionesPorPagarPorRetenciones.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionRetencionesPorPagarPorRetenciones!=null) {
				this.jScrollPanelDatosEdicionRetencionesPorPagarPorRetenciones.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRetencionesPorPagarPorRetenciones!=null) {
				this.jTabbedPaneBusquedasRetencionesPorPagarPorRetenciones.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosRetencionesPorPagarPorRetenciones!=null) {
				this.jScrollPanelDatosRetencionesPorPagarPorRetenciones.setVisible(false);
			}
			
			if(this.jPanelPaginacionRetencionesPorPagarPorRetenciones!=null) {
				this.jPanelPaginacionRetencionesPorPagarPorRetenciones.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesRetencionesPorPagarPorRetenciones!=null) {
				this.jPanelParametrosReportesRetencionesPorPagarPorRetenciones.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionRetencionesPorPagarPorRetenciones!=null) {
				this.jScrollPanelDatosEdicionRetencionesPorPagarPorRetenciones.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRetencionesPorPagarPorRetenciones!=null) {
				this.jTabbedPaneBusquedasRetencionesPorPagarPorRetenciones.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosRetencionesPorPagarPorRetenciones!=null) {
				this.jScrollPanelDatosRetencionesPorPagarPorRetenciones.setVisible(false);
			}
			
			if(this.jPanelPaginacionRetencionesPorPagarPorRetenciones!=null) {
				this.jPanelPaginacionRetencionesPorPagarPorRetenciones.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesRetencionesPorPagarPorRetenciones!=null) {
				this.jPanelParametrosReportesRetencionesPorPagarPorRetenciones.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionRetencionesPorPagarPorRetenciones!=null) {
				this.jScrollPanelDatosEdicionRetencionesPorPagarPorRetenciones.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRetencionesPorPagarPorRetenciones!=null) {
				this.jTabbedPaneBusquedasRetencionesPorPagarPorRetenciones.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosRetencionesPorPagarPorRetenciones!=null) {
				this.jScrollPanelDatosRetencionesPorPagarPorRetenciones.setVisible(false);
			}
			
			if(this.jPanelPaginacionRetencionesPorPagarPorRetenciones!=null) {
				this.jPanelPaginacionRetencionesPorPagarPorRetenciones.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesRetencionesPorPagarPorRetenciones!=null) {
				this.jPanelParametrosReportesRetencionesPorPagarPorRetenciones.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionRetencionesPorPagarPorRetenciones!=null) {
				this.jScrollPanelDatosEdicionRetencionesPorPagarPorRetenciones.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRetencionesPorPagarPorRetenciones!=null) {
				this.jTabbedPaneBusquedasRetencionesPorPagarPorRetenciones.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosRetencionesPorPagarPorRetenciones!=null) {
				this.jScrollPanelDatosRetencionesPorPagarPorRetenciones.setVisible(true);
			}
			
			if(this.jPanelPaginacionRetencionesPorPagarPorRetenciones!=null) {
				this.jPanelPaginacionRetencionesPorPagarPorRetenciones.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesRetencionesPorPagarPorRetenciones!=null) {
				this.jPanelParametrosReportesRetencionesPorPagarPorRetenciones.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionRetencionesPorPagarPorRetenciones!=null) {
				this.jScrollPanelDatosEdicionRetencionesPorPagarPorRetenciones.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRetencionesPorPagarPorRetenciones!=null) {
				this.jTabbedPaneBusquedasRetencionesPorPagarPorRetenciones.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosRetencionesPorPagarPorRetenciones!=null) {
				this.jScrollPanelDatosRetencionesPorPagarPorRetenciones.setVisible(true);
			}
			
			if(this.jPanelPaginacionRetencionesPorPagarPorRetenciones!=null) {
				this.jPanelPaginacionRetencionesPorPagarPorRetenciones.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesRetencionesPorPagarPorRetenciones!=null) {
				this.jPanelParametrosReportesRetencionesPorPagarPorRetenciones.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionRetencionesPorPagarPorRetenciones!=null) {
				this.jScrollPanelDatosEdicionRetencionesPorPagarPorRetenciones.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRetencionesPorPagarPorRetenciones!=null) {
				this.jTabbedPaneBusquedasRetencionesPorPagarPorRetenciones.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosRetencionesPorPagarPorRetenciones!=null) {
				this.jScrollPanelDatosRetencionesPorPagarPorRetenciones.setVisible(true);
			}
			
			if(this.jPanelPaginacionRetencionesPorPagarPorRetenciones!=null) {
				this.jPanelPaginacionRetencionesPorPagarPorRetenciones.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesRetencionesPorPagarPorRetenciones!=null) {
				this.jPanelParametrosReportesRetencionesPorPagarPorRetenciones.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasRetencionesPorPagarPorRetenciones!=null) {
					this.jTabbedPaneBusquedasRetencionesPorPagarPorRetenciones.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesRetencionesPorPagarPorRetenciones!=null) {
				this.jPanelParametrosReportesRetencionesPorPagarPorRetenciones.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.retencionesporpagarporretencionesSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRetencionesPorPagarPorRetenciones!=null) {
				this.jTabbedPaneBusquedasRetencionesPorPagarPorRetenciones.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesRetencionesPorPagarPorRetenciones!=null) {
				this.jPanelParametrosReportesRetencionesPorPagarPorRetenciones.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaRetencionesPorPagarPorRetenciones=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaRetencionesPorPagarPorRetenciones) {this.jTabbedPaneBusquedasRetencionesPorPagarPorRetenciones.remove(jPanelBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadBusquedaRetencionesPorPagarPorRetenciones=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaRetencionesPorPagarPorRetenciones) {this.jTabbedPaneBusquedasRetencionesPorPagarPorRetenciones.remove(jPanelBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones);}
		}
		
	}

	public void setVisibilidadBusquedasParaEjercicio(Boolean isParaEjercicio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEjercicioNegation=!isParaEjercicio;

			this.isVisibilidadBusquedaRetencionesPorPagarPorRetenciones=isParaEjercicio;
			if(!this.isVisibilidadBusquedaRetencionesPorPagarPorRetenciones) {this.jTabbedPaneBusquedasRetencionesPorPagarPorRetenciones.remove(jPanelBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones);}
		}
		
	}

	public void setVisibilidadBusquedasParaPeriodo(Boolean isParaPeriodo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPeriodoNegation=!isParaPeriodo;

			this.isVisibilidadBusquedaRetencionesPorPagarPorRetenciones=isParaPeriodo;
			if(!this.isVisibilidadBusquedaRetencionesPorPagarPorRetenciones) {this.jTabbedPaneBusquedasRetencionesPorPagarPorRetenciones.remove(jPanelBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones);}
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
			
			this.inicializarActualizarBindingTablaRetencionesPorPagarPorRetenciones(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioRetencionesPorPagarPorRetenciones() {
		this.updateBorderResaltarBusquedasFormularioRetencionesPorPagarPorRetenciones();
		this.updateVisibilidadBusquedasFormularioRetencionesPorPagarPorRetenciones();
		this.updateHabilitarBusquedasFormularioRetencionesPorPagarPorRetenciones();
	}
	
	public void updateBorderResaltarBusquedasFormularioRetencionesPorPagarPorRetenciones() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasRetencionesPorPagarPorRetenciones.getComponents().length>0) {
	

		if(this.retencionesporpagarporretencionesConstantesFunciones.resaltarBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones!=null) {
			index= this.jTabbedPaneBusquedasRetencionesPorPagarPorRetenciones.indexOfComponent(this.jPanelBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRetencionesPorPagarPorRetenciones.getComponent(index);
				jPanel.setBorder(this.retencionesporpagarporretencionesConstantesFunciones.resaltarBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioRetencionesPorPagarPorRetenciones() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasRetencionesPorPagarPorRetenciones.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasRetencionesPorPagarPorRetenciones.indexOfComponent(this.jPanelBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones);
			jPanel=(JPanel)this.jTabbedPaneBusquedasRetencionesPorPagarPorRetenciones.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.retencionesporpagarporretencionesConstantesFunciones.mostrarBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones);
			if(!this.retencionesporpagarporretencionesConstantesFunciones.mostrarBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones && index>-1) {
				this.jTabbedPaneBusquedasRetencionesPorPagarPorRetenciones.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioRetencionesPorPagarPorRetenciones() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasRetencionesPorPagarPorRetenciones.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasRetencionesPorPagarPorRetenciones.indexOfComponent(this.jPanelBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasRetencionesPorPagarPorRetenciones.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.retencionesporpagarporretencionesConstantesFunciones.activarBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones);
				this.jTabbedPaneBusquedasRetencionesPorPagarPorRetenciones.setEnabledAt(index,this.retencionesporpagarporretencionesConstantesFunciones.activarBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaRetencionesPorPagarPorRetenciones(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaRetencionesPorPagarPorRetenciones")) {
			index= this.jTabbedPaneBusquedasRetencionesPorPagarPorRetenciones.indexOfComponent(this.jPanelBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones);

			this.jTabbedPaneBusquedasRetencionesPorPagarPorRetenciones.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRetencionesPorPagarPorRetenciones.getComponent(index);

			this.retencionesporpagarporretencionesConstantesFunciones.setResaltarBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones(resaltar);

			jPanel.setBorder(this.retencionesporpagarporretencionesConstantesFunciones.resaltarBusquedaRetencionesPorPagarPorRetencionesRetencionesPorPagarPorRetenciones);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarRetencionesPorPagarPorRetenciones.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioRetencionesPorPagarPorRetenciones() throws Exception {

		if(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioRetencionesPorPagarPorRetenciones();
		this.updateVisibilidadResaltarControlesFormularioRetencionesPorPagarPorRetenciones();
		this.updateHabilitarResaltarControlesFormularioRetencionesPorPagarPorRetenciones();
		
	}
	
	public void updateBorderResaltarControlesFormularioRetencionesPorPagarPorRetenciones() throws Exception {
		if(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.retencionesporpagarporretencionesConstantesFunciones.resaltaridRetencionesPorPagarPorRetenciones!=null && this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones!=null) {this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jLabelidRetencionesPorPagarPorRetenciones.setBorder(this.retencionesporpagarporretencionesConstantesFunciones.resaltaridRetencionesPorPagarPorRetenciones);}
		if(this.retencionesporpagarporretencionesConstantesFunciones.resaltarid_empresaRetencionesPorPagarPorRetenciones!=null && this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones!=null) {this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jComboBoxid_empresaRetencionesPorPagarPorRetenciones.setBorder(this.retencionesporpagarporretencionesConstantesFunciones.resaltarid_empresaRetencionesPorPagarPorRetenciones);}
		if(this.retencionesporpagarporretencionesConstantesFunciones.resaltarid_sucursalRetencionesPorPagarPorRetenciones!=null && this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones!=null) {this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jComboBoxid_sucursalRetencionesPorPagarPorRetenciones.setBorder(this.retencionesporpagarporretencionesConstantesFunciones.resaltarid_sucursalRetencionesPorPagarPorRetenciones);}
		if(this.retencionesporpagarporretencionesConstantesFunciones.resaltarid_ejercicioRetencionesPorPagarPorRetenciones!=null && this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones!=null) {this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jComboBoxid_ejercicioRetencionesPorPagarPorRetenciones.setBorder(this.retencionesporpagarporretencionesConstantesFunciones.resaltarid_ejercicioRetencionesPorPagarPorRetenciones);}
		if(this.retencionesporpagarporretencionesConstantesFunciones.resaltarid_periodoRetencionesPorPagarPorRetenciones!=null && this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones!=null) {this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jComboBoxid_periodoRetencionesPorPagarPorRetenciones.setBorder(this.retencionesporpagarporretencionesConstantesFunciones.resaltarid_periodoRetencionesPorPagarPorRetenciones);}
		if(this.retencionesporpagarporretencionesConstantesFunciones.resaltares_debitoRetencionesPorPagarPorRetenciones!=null && this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones!=null) {this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jCheckBoxes_debitoRetencionesPorPagarPorRetenciones.setBorderPainted(true);this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jCheckBoxes_debitoRetencionesPorPagarPorRetenciones.setBorder(this.retencionesporpagarporretencionesConstantesFunciones.resaltares_debitoRetencionesPorPagarPorRetenciones);}
		if(this.retencionesporpagarporretencionesConstantesFunciones.resaltarfecha_emisionRetencionesPorPagarPorRetenciones!=null && this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones!=null) {this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jDateChooserfecha_emisionRetencionesPorPagarPorRetenciones.setBorder(this.retencionesporpagarporretencionesConstantesFunciones.resaltarfecha_emisionRetencionesPorPagarPorRetenciones);}
		if(this.retencionesporpagarporretencionesConstantesFunciones.resaltarnombre_tipo_movimientoRetencionesPorPagarPorRetenciones!=null && this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones!=null) {this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextAreanombre_tipo_movimientoRetencionesPorPagarPorRetenciones.setBorder(this.retencionesporpagarporretencionesConstantesFunciones.resaltarnombre_tipo_movimientoRetencionesPorPagarPorRetenciones);}
		if(this.retencionesporpagarporretencionesConstantesFunciones.resaltarnumero_mayorRetencionesPorPagarPorRetenciones!=null && this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones!=null) {this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextAreanumero_mayorRetencionesPorPagarPorRetenciones.setBorder(this.retencionesporpagarporretencionesConstantesFunciones.resaltarnumero_mayorRetencionesPorPagarPorRetenciones);}
		if(this.retencionesporpagarporretencionesConstantesFunciones.resaltarnombre_cuenta_contable_retencionRetencionesPorPagarPorRetenciones!=null && this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones!=null) {this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextAreanombre_cuenta_contable_retencionRetencionesPorPagarPorRetenciones.setBorder(this.retencionesporpagarporretencionesConstantesFunciones.resaltarnombre_cuenta_contable_retencionRetencionesPorPagarPorRetenciones);}
		if(this.retencionesporpagarporretencionesConstantesFunciones.resaltarnumero_pre_impreso_facturaRetencionesPorPagarPorRetenciones!=null && this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones!=null) {this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextFieldnumero_pre_impreso_facturaRetencionesPorPagarPorRetenciones.setBorder(this.retencionesporpagarporretencionesConstantesFunciones.resaltarnumero_pre_impreso_facturaRetencionesPorPagarPorRetenciones);}
		if(this.retencionesporpagarporretencionesConstantesFunciones.resaltarporcentajeRetencionesPorPagarPorRetenciones!=null && this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones!=null) {this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextFieldporcentajeRetencionesPorPagarPorRetenciones.setBorder(this.retencionesporpagarporretencionesConstantesFunciones.resaltarporcentajeRetencionesPorPagarPorRetenciones);}
		if(this.retencionesporpagarporretencionesConstantesFunciones.resaltarbase_imponibleRetencionesPorPagarPorRetenciones!=null && this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones!=null) {this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextFieldbase_imponibleRetencionesPorPagarPorRetenciones.setBorder(this.retencionesporpagarporretencionesConstantesFunciones.resaltarbase_imponibleRetencionesPorPagarPorRetenciones);}
		if(this.retencionesporpagarporretencionesConstantesFunciones.resaltarvalorRetencionesPorPagarPorRetenciones!=null && this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones!=null) {this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextFieldvalorRetencionesPorPagarPorRetenciones.setBorder(this.retencionesporpagarporretencionesConstantesFunciones.resaltarvalorRetencionesPorPagarPorRetenciones);}
		if(this.retencionesporpagarporretencionesConstantesFunciones.resaltarnumeroRetencionesPorPagarPorRetenciones!=null && this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones!=null) {this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextFieldnumeroRetencionesPorPagarPorRetenciones.setBorder(this.retencionesporpagarporretencionesConstantesFunciones.resaltarnumeroRetencionesPorPagarPorRetenciones);}
		if(this.retencionesporpagarporretencionesConstantesFunciones.resaltarnombre_benefRetencionesPorPagarPorRetenciones!=null && this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones!=null) {this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextAreanombre_benefRetencionesPorPagarPorRetenciones.setBorder(this.retencionesporpagarporretencionesConstantesFunciones.resaltarnombre_benefRetencionesPorPagarPorRetenciones);}
		if(this.retencionesporpagarporretencionesConstantesFunciones.resaltarruc_benefRetencionesPorPagarPorRetenciones!=null && this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones!=null) {this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextFieldruc_benefRetencionesPorPagarPorRetenciones.setBorder(this.retencionesporpagarporretencionesConstantesFunciones.resaltarruc_benefRetencionesPorPagarPorRetenciones);}
		if(this.retencionesporpagarporretencionesConstantesFunciones.resaltarnombre_cuenta_contableRetencionesPorPagarPorRetenciones!=null && this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones!=null) {this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextAreanombre_cuenta_contableRetencionesPorPagarPorRetenciones.setBorder(this.retencionesporpagarporretencionesConstantesFunciones.resaltarnombre_cuenta_contableRetencionesPorPagarPorRetenciones);}
		if(this.retencionesporpagarporretencionesConstantesFunciones.resaltarnombre_cuenta_contable_creditoRetencionesPorPagarPorRetenciones!=null && this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones!=null) {this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextAreanombre_cuenta_contable_creditoRetencionesPorPagarPorRetenciones.setBorder(this.retencionesporpagarporretencionesConstantesFunciones.resaltarnombre_cuenta_contable_creditoRetencionesPorPagarPorRetenciones);}
		if(this.retencionesporpagarporretencionesConstantesFunciones.resaltares_debito_datoRetencionesPorPagarPorRetenciones!=null && this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones!=null) {this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jCheckBoxes_debito_datoRetencionesPorPagarPorRetenciones.setBorderPainted(true);this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jCheckBoxes_debito_datoRetencionesPorPagarPorRetenciones.setBorder(this.retencionesporpagarporretencionesConstantesFunciones.resaltares_debito_datoRetencionesPorPagarPorRetenciones);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioRetencionesPorPagarPorRetenciones() throws Exception {		
		if(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones!=null) {
	
		//this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jLabelidRetencionesPorPagarPorRetenciones.setVisible(this.retencionesporpagarporretencionesConstantesFunciones.mostraridRetencionesPorPagarPorRetenciones);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jPanelidRetencionesPorPagarPorRetenciones.setVisible(this.retencionesporpagarporretencionesConstantesFunciones.mostraridRetencionesPorPagarPorRetenciones);
		//this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jComboBoxid_empresaRetencionesPorPagarPorRetenciones.setVisible(this.retencionesporpagarporretencionesConstantesFunciones.mostrarid_empresaRetencionesPorPagarPorRetenciones);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jPanelid_empresaRetencionesPorPagarPorRetenciones.setVisible(this.retencionesporpagarporretencionesConstantesFunciones.mostrarid_empresaRetencionesPorPagarPorRetenciones);
		//this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jComboBoxid_sucursalRetencionesPorPagarPorRetenciones.setVisible(this.retencionesporpagarporretencionesConstantesFunciones.mostrarid_sucursalRetencionesPorPagarPorRetenciones);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jPanelid_sucursalRetencionesPorPagarPorRetenciones.setVisible(this.retencionesporpagarporretencionesConstantesFunciones.mostrarid_sucursalRetencionesPorPagarPorRetenciones);
		//this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jComboBoxid_ejercicioRetencionesPorPagarPorRetenciones.setVisible(this.retencionesporpagarporretencionesConstantesFunciones.mostrarid_ejercicioRetencionesPorPagarPorRetenciones);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jPanelid_ejercicioRetencionesPorPagarPorRetenciones.setVisible(this.retencionesporpagarporretencionesConstantesFunciones.mostrarid_ejercicioRetencionesPorPagarPorRetenciones);
		//this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jComboBoxid_periodoRetencionesPorPagarPorRetenciones.setVisible(this.retencionesporpagarporretencionesConstantesFunciones.mostrarid_periodoRetencionesPorPagarPorRetenciones);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jPanelid_periodoRetencionesPorPagarPorRetenciones.setVisible(this.retencionesporpagarporretencionesConstantesFunciones.mostrarid_periodoRetencionesPorPagarPorRetenciones);
		//this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jCheckBoxes_debitoRetencionesPorPagarPorRetenciones.setVisible(this.retencionesporpagarporretencionesConstantesFunciones.mostrares_debitoRetencionesPorPagarPorRetenciones);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jPaneles_debitoRetencionesPorPagarPorRetenciones.setVisible(this.retencionesporpagarporretencionesConstantesFunciones.mostrares_debitoRetencionesPorPagarPorRetenciones);
		//this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jDateChooserfecha_emisionRetencionesPorPagarPorRetenciones.setVisible(this.retencionesporpagarporretencionesConstantesFunciones.mostrarfecha_emisionRetencionesPorPagarPorRetenciones);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jPanelfecha_emisionRetencionesPorPagarPorRetenciones.setVisible(this.retencionesporpagarporretencionesConstantesFunciones.mostrarfecha_emisionRetencionesPorPagarPorRetenciones);
		//this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextAreanombre_tipo_movimientoRetencionesPorPagarPorRetenciones.setVisible(this.retencionesporpagarporretencionesConstantesFunciones.mostrarnombre_tipo_movimientoRetencionesPorPagarPorRetenciones);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jPanelnombre_tipo_movimientoRetencionesPorPagarPorRetenciones.setVisible(this.retencionesporpagarporretencionesConstantesFunciones.mostrarnombre_tipo_movimientoRetencionesPorPagarPorRetenciones);
		//this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextAreanumero_mayorRetencionesPorPagarPorRetenciones.setVisible(this.retencionesporpagarporretencionesConstantesFunciones.mostrarnumero_mayorRetencionesPorPagarPorRetenciones);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jPanelnumero_mayorRetencionesPorPagarPorRetenciones.setVisible(this.retencionesporpagarporretencionesConstantesFunciones.mostrarnumero_mayorRetencionesPorPagarPorRetenciones);
		//this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextAreanombre_cuenta_contable_retencionRetencionesPorPagarPorRetenciones.setVisible(this.retencionesporpagarporretencionesConstantesFunciones.mostrarnombre_cuenta_contable_retencionRetencionesPorPagarPorRetenciones);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jPanelnombre_cuenta_contable_retencionRetencionesPorPagarPorRetenciones.setVisible(this.retencionesporpagarporretencionesConstantesFunciones.mostrarnombre_cuenta_contable_retencionRetencionesPorPagarPorRetenciones);
		//this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextFieldnumero_pre_impreso_facturaRetencionesPorPagarPorRetenciones.setVisible(this.retencionesporpagarporretencionesConstantesFunciones.mostrarnumero_pre_impreso_facturaRetencionesPorPagarPorRetenciones);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jPanelnumero_pre_impreso_facturaRetencionesPorPagarPorRetenciones.setVisible(this.retencionesporpagarporretencionesConstantesFunciones.mostrarnumero_pre_impreso_facturaRetencionesPorPagarPorRetenciones);
		//this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextFieldporcentajeRetencionesPorPagarPorRetenciones.setVisible(this.retencionesporpagarporretencionesConstantesFunciones.mostrarporcentajeRetencionesPorPagarPorRetenciones);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jPanelporcentajeRetencionesPorPagarPorRetenciones.setVisible(this.retencionesporpagarporretencionesConstantesFunciones.mostrarporcentajeRetencionesPorPagarPorRetenciones);
		//this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextFieldbase_imponibleRetencionesPorPagarPorRetenciones.setVisible(this.retencionesporpagarporretencionesConstantesFunciones.mostrarbase_imponibleRetencionesPorPagarPorRetenciones);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jPanelbase_imponibleRetencionesPorPagarPorRetenciones.setVisible(this.retencionesporpagarporretencionesConstantesFunciones.mostrarbase_imponibleRetencionesPorPagarPorRetenciones);
		//this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextFieldvalorRetencionesPorPagarPorRetenciones.setVisible(this.retencionesporpagarporretencionesConstantesFunciones.mostrarvalorRetencionesPorPagarPorRetenciones);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jPanelvalorRetencionesPorPagarPorRetenciones.setVisible(this.retencionesporpagarporretencionesConstantesFunciones.mostrarvalorRetencionesPorPagarPorRetenciones);
		//this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextFieldnumeroRetencionesPorPagarPorRetenciones.setVisible(this.retencionesporpagarporretencionesConstantesFunciones.mostrarnumeroRetencionesPorPagarPorRetenciones);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jPanelnumeroRetencionesPorPagarPorRetenciones.setVisible(this.retencionesporpagarporretencionesConstantesFunciones.mostrarnumeroRetencionesPorPagarPorRetenciones);
		//this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextAreanombre_benefRetencionesPorPagarPorRetenciones.setVisible(this.retencionesporpagarporretencionesConstantesFunciones.mostrarnombre_benefRetencionesPorPagarPorRetenciones);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jPanelnombre_benefRetencionesPorPagarPorRetenciones.setVisible(this.retencionesporpagarporretencionesConstantesFunciones.mostrarnombre_benefRetencionesPorPagarPorRetenciones);
		//this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextFieldruc_benefRetencionesPorPagarPorRetenciones.setVisible(this.retencionesporpagarporretencionesConstantesFunciones.mostrarruc_benefRetencionesPorPagarPorRetenciones);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jPanelruc_benefRetencionesPorPagarPorRetenciones.setVisible(this.retencionesporpagarporretencionesConstantesFunciones.mostrarruc_benefRetencionesPorPagarPorRetenciones);
		//this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextAreanombre_cuenta_contableRetencionesPorPagarPorRetenciones.setVisible(this.retencionesporpagarporretencionesConstantesFunciones.mostrarnombre_cuenta_contableRetencionesPorPagarPorRetenciones);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jPanelnombre_cuenta_contableRetencionesPorPagarPorRetenciones.setVisible(this.retencionesporpagarporretencionesConstantesFunciones.mostrarnombre_cuenta_contableRetencionesPorPagarPorRetenciones);
		//this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextAreanombre_cuenta_contable_creditoRetencionesPorPagarPorRetenciones.setVisible(this.retencionesporpagarporretencionesConstantesFunciones.mostrarnombre_cuenta_contable_creditoRetencionesPorPagarPorRetenciones);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jPanelnombre_cuenta_contable_creditoRetencionesPorPagarPorRetenciones.setVisible(this.retencionesporpagarporretencionesConstantesFunciones.mostrarnombre_cuenta_contable_creditoRetencionesPorPagarPorRetenciones);
		//this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jCheckBoxes_debito_datoRetencionesPorPagarPorRetenciones.setVisible(this.retencionesporpagarporretencionesConstantesFunciones.mostrares_debito_datoRetencionesPorPagarPorRetenciones);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jPaneles_debito_datoRetencionesPorPagarPorRetenciones.setVisible(this.retencionesporpagarporretencionesConstantesFunciones.mostrares_debito_datoRetencionesPorPagarPorRetenciones);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioRetencionesPorPagarPorRetenciones() throws Exception {
		if(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones!=null) {
	
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jLabelidRetencionesPorPagarPorRetenciones.setEnabled(this.retencionesporpagarporretencionesConstantesFunciones.activaridRetencionesPorPagarPorRetenciones);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jComboBoxid_empresaRetencionesPorPagarPorRetenciones.setEnabled(this.retencionesporpagarporretencionesConstantesFunciones.activarid_empresaRetencionesPorPagarPorRetenciones);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jComboBoxid_sucursalRetencionesPorPagarPorRetenciones.setEnabled(this.retencionesporpagarporretencionesConstantesFunciones.activarid_sucursalRetencionesPorPagarPorRetenciones);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jComboBoxid_ejercicioRetencionesPorPagarPorRetenciones.setEnabled(this.retencionesporpagarporretencionesConstantesFunciones.activarid_ejercicioRetencionesPorPagarPorRetenciones);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jComboBoxid_periodoRetencionesPorPagarPorRetenciones.setEnabled(this.retencionesporpagarporretencionesConstantesFunciones.activarid_periodoRetencionesPorPagarPorRetenciones);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jCheckBoxes_debitoRetencionesPorPagarPorRetenciones.setEnabled(this.retencionesporpagarporretencionesConstantesFunciones.activares_debitoRetencionesPorPagarPorRetenciones);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jDateChooserfecha_emisionRetencionesPorPagarPorRetenciones.setEnabled(this.retencionesporpagarporretencionesConstantesFunciones.activarfecha_emisionRetencionesPorPagarPorRetenciones);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextAreanombre_tipo_movimientoRetencionesPorPagarPorRetenciones.setEnabled(this.retencionesporpagarporretencionesConstantesFunciones.activarnombre_tipo_movimientoRetencionesPorPagarPorRetenciones);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextAreanumero_mayorRetencionesPorPagarPorRetenciones.setEnabled(this.retencionesporpagarporretencionesConstantesFunciones.activarnumero_mayorRetencionesPorPagarPorRetenciones);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextAreanombre_cuenta_contable_retencionRetencionesPorPagarPorRetenciones.setEnabled(this.retencionesporpagarporretencionesConstantesFunciones.activarnombre_cuenta_contable_retencionRetencionesPorPagarPorRetenciones);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextFieldnumero_pre_impreso_facturaRetencionesPorPagarPorRetenciones.setEnabled(this.retencionesporpagarporretencionesConstantesFunciones.activarnumero_pre_impreso_facturaRetencionesPorPagarPorRetenciones);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextFieldporcentajeRetencionesPorPagarPorRetenciones.setEnabled(this.retencionesporpagarporretencionesConstantesFunciones.activarporcentajeRetencionesPorPagarPorRetenciones);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextFieldbase_imponibleRetencionesPorPagarPorRetenciones.setEnabled(this.retencionesporpagarporretencionesConstantesFunciones.activarbase_imponibleRetencionesPorPagarPorRetenciones);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextFieldvalorRetencionesPorPagarPorRetenciones.setEnabled(this.retencionesporpagarporretencionesConstantesFunciones.activarvalorRetencionesPorPagarPorRetenciones);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextFieldnumeroRetencionesPorPagarPorRetenciones.setEnabled(this.retencionesporpagarporretencionesConstantesFunciones.activarnumeroRetencionesPorPagarPorRetenciones);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextAreanombre_benefRetencionesPorPagarPorRetenciones.setEnabled(this.retencionesporpagarporretencionesConstantesFunciones.activarnombre_benefRetencionesPorPagarPorRetenciones);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextFieldruc_benefRetencionesPorPagarPorRetenciones.setEnabled(this.retencionesporpagarporretencionesConstantesFunciones.activarruc_benefRetencionesPorPagarPorRetenciones);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextAreanombre_cuenta_contableRetencionesPorPagarPorRetenciones.setEnabled(this.retencionesporpagarporretencionesConstantesFunciones.activarnombre_cuenta_contableRetencionesPorPagarPorRetenciones);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jTextAreanombre_cuenta_contable_creditoRetencionesPorPagarPorRetenciones.setEnabled(this.retencionesporpagarporretencionesConstantesFunciones.activarnombre_cuenta_contable_creditoRetencionesPorPagarPorRetenciones);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorRetenciones.jCheckBoxes_debito_datoRetencionesPorPagarPorRetenciones.setEnabled(this.retencionesporpagarporretencionesConstantesFunciones.activares_debito_datoRetencionesPorPagarPorRetenciones);
		}
	}
	
		
}