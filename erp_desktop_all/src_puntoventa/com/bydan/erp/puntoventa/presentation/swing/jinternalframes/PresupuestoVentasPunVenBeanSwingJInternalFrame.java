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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes;




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

import com.bydan.erp.puntoventa.util.PresupuestoVentasPunVenConstantesFunciones;
import com.bydan.erp.puntoventa.util.PresupuestoVentasPunVenParameterReturnGeneral;
//import com.bydan.erp.puntoventa.util.PresupuestoVentasPunVenParameterGeneral;
//import com.bydan.erp.puntoventa.presentation.report.source.PresupuestoVentasPunVenBean;
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

import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.puntoventa.resources.reportes.AuxiliarReportes;


import com.bydan.erp.puntoventa.util.*;
import com.bydan.erp.puntoventa.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.puntoventa.business.entity.*;
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


import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;

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
public class PresupuestoVentasPunVenBeanSwingJInternalFrame extends PresupuestoVentasPunVenJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(PresupuestoVentasPunVenBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<PresupuestoVentasPunVen> presupuestoventaspunvenValidator = new ClassValidator<PresupuestoVentasPunVen>(PresupuestoVentasPunVen.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public PresupuestoVentasPunVen presupuestoventaspunven;	
	public PresupuestoVentasPunVen presupuestoventaspunvenAux;
	public PresupuestoVentasPunVen presupuestoventaspunvenAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public PresupuestoVentasPunVen presupuestoventaspunvenTotales;
	public Long idPresupuestoVentasPunVenActual;
	public Long iIdNuevoPresupuestoVentasPunVen=0L;
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

	public String sFinalQueryComboCaja="";

	public List<Caja> cajasForeignKey;

	public List<Caja> getcajasForeignKey() {
		return cajasForeignKey;
	}

	public void setcajasForeignKey(List<Caja> cajasForeignKey) {
		this.cajasForeignKey = cajasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Caja cajaForeignKey;

	public Caja getcajaForeignKey() {
		return cajaForeignKey;
	}

	public void setcajaForeignKey(Caja cajaForeignKey) {
		this.cajaForeignKey = cajaForeignKey;
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
	
	public Boolean isPermisoTodoPresupuestoVentasPunVen;
	public Boolean isPermisoNuevoPresupuestoVentasPunVen;
	public Boolean isPermisoActualizarPresupuestoVentasPunVen;
	public Boolean isPermisoActualizarOriginalPresupuestoVentasPunVen;
	public Boolean isPermisoEliminarPresupuestoVentasPunVen;
	public Boolean isPermisoGuardarCambiosPresupuestoVentasPunVen;
	public Boolean isPermisoConsultaPresupuestoVentasPunVen;
	public Boolean isPermisoBusquedaPresupuestoVentasPunVen;
	public Boolean isPermisoReportePresupuestoVentasPunVen;
	public Boolean isPermisoPaginacionMedioPresupuestoVentasPunVen;
	public Boolean isPermisoPaginacionAltoPresupuestoVentasPunVen;
	public Boolean isPermisoPaginacionTodoPresupuestoVentasPunVen;
	public Boolean isPermisoCopiarPresupuestoVentasPunVen;
	public Boolean isPermisoVerFormPresupuestoVentasPunVen;
	public Boolean isPermisoDuplicarPresupuestoVentasPunVen;
	public Boolean isPermisoOrdenPresupuestoVentasPunVen;
	
	
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
	
	public PresupuestoVentasPunVenParameterReturnGeneral presupuestoventaspunvenReturnGeneral;
	public PresupuestoVentasPunVenParameterReturnGeneral presupuestoventaspunvenParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoPresupuestoVentasPunVen=false;
	public Boolean esParaAccionDesdeFormularioPresupuestoVentasPunVen=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected PresupuestoVentasPunVenSessionBeanAdditional presupuestoventaspunvenSessionBeanAdditional=null;
	
	public PresupuestoVentasPunVenSessionBeanAdditional getPresupuestoVentasPunVenSessionBeanAdditional() {
		return this.presupuestoventaspunvenSessionBeanAdditional;
	}
	
	public void setPresupuestoVentasPunVenSessionBeanAdditional(PresupuestoVentasPunVenSessionBeanAdditional presupuestoventaspunvenSessionBeanAdditional) {
		try {
			this.presupuestoventaspunvenSessionBeanAdditional=presupuestoventaspunvenSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected PresupuestoVentasPunVenBeanSwingJInternalFrameAdditional presupuestoventaspunvenBeanSwingJInternalFrameAdditional=null;
	//public class PresupuestoVentasPunVenBeanSwingJInternalFrame
	
	public PresupuestoVentasPunVenBeanSwingJInternalFrameAdditional getPresupuestoVentasPunVenBeanSwingJInternalFrameAdditional() {
		return this.presupuestoventaspunvenBeanSwingJInternalFrameAdditional;
	}
	
	public void setPresupuestoVentasPunVenBeanSwingJInternalFrameAdditional(PresupuestoVentasPunVenBeanSwingJInternalFrameAdditional presupuestoventaspunvenBeanSwingJInternalFrameAdditional) {
		try {
			this.presupuestoventaspunvenBeanSwingJInternalFrameAdditional=presupuestoventaspunvenBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public PresupuestoVentasPunVenLogic presupuestoventaspunvenLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public PresupuestoVentasPunVen presupuestoventaspunvenBean;
	public PresupuestoVentasPunVenConstantesFunciones presupuestoventaspunvenConstantesFunciones;
	//public PresupuestoVentasPunVenParameterReturnGeneral presupuestoventaspunvenReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public EjercicioLogic ejercicioLogic;
	public PeriodoLogic periodoLogic;
	public CajaLogic cajaLogic;
	
	//PARAMETROS
	
	
	//public List<PresupuestoVentasPunVen> presupuestoventaspunvens;	
	//public List<PresupuestoVentasPunVen> presupuestoventaspunvensEliminados;
	//public List<PresupuestoVentasPunVen> presupuestoventaspunvensAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoPresupuestoVentasPunVen=false;
	public Boolean isVisibilidadCeldaDuplicarPresupuestoVentasPunVen=true;
	public Boolean isVisibilidadCeldaCopiarPresupuestoVentasPunVen=true;
	public Boolean isVisibilidadCeldaVerFormPresupuestoVentasPunVen=true;
	public Boolean isVisibilidadCeldaOrdenPresupuestoVentasPunVen=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesPresupuestoVentasPunVen=false;
	public Boolean isVisibilidadCeldaModificarPresupuestoVentasPunVen=false;
	public Boolean isVisibilidadCeldaActualizarPresupuestoVentasPunVen=false;
	public Boolean isVisibilidadCeldaEliminarPresupuestoVentasPunVen=false;
	public Boolean isVisibilidadCeldaCancelarPresupuestoVentasPunVen=false;
	public Boolean isVisibilidadCeldaGuardarPresupuestoVentasPunVen=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosPresupuestoVentasPunVen=false;	
	
	
	public Boolean isVisibilidadFK_IdCaja=false;
	public Boolean isVisibilidadFK_IdEjercicio=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdPeriodo=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoPresupuestoVentasPunVen() {
		return this.iIdNuevoPresupuestoVentasPunVen;
	}

	public void setiIdNuevoPresupuestoVentasPunVen(Long iIdNuevoPresupuestoVentasPunVen) {
		this.iIdNuevoPresupuestoVentasPunVen = iIdNuevoPresupuestoVentasPunVen;
	}
	
	public Long getidPresupuestoVentasPunVenActual() {
		return this.idPresupuestoVentasPunVenActual;
	}

	public void setidPresupuestoVentasPunVenActual(Long idPresupuestoVentasPunVenActual) {
		this.idPresupuestoVentasPunVenActual = idPresupuestoVentasPunVenActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public PresupuestoVentasPunVen getpresupuestoventaspunven() {
		return this.presupuestoventaspunven;
	}

	public void setpresupuestoventaspunven(PresupuestoVentasPunVen presupuestoventaspunven) {
		this.presupuestoventaspunven = presupuestoventaspunven;
	}
	
	public PresupuestoVentasPunVen getpresupuestoventaspunvenAux() {
		return this.presupuestoventaspunvenAux;
	}

	public void setpresupuestoventaspunvenAux(PresupuestoVentasPunVen presupuestoventaspunvenAux) {
		this.presupuestoventaspunvenAux = presupuestoventaspunvenAux;
	}				
	
	public PresupuestoVentasPunVen getpresupuestoventaspunvenAnterior() {
		return this.presupuestoventaspunvenAnterior;
	}

	public void setpresupuestoventaspunvenAnterior(PresupuestoVentasPunVen presupuestoventaspunvenAnterior) {
		this.presupuestoventaspunvenAnterior = presupuestoventaspunvenAnterior;
	}	
	
	public PresupuestoVentasPunVen getpresupuestoventaspunvenTotales() {
		return this.presupuestoventaspunvenTotales;
	}

	public void setpresupuestoventaspunvenTotales(PresupuestoVentasPunVen presupuestoventaspunvenTotales) {
		this.presupuestoventaspunvenTotales = presupuestoventaspunvenTotales;
	}	
	
	public PresupuestoVentasPunVen getpresupuestoventaspunvenBean() {
		return this.presupuestoventaspunvenBean;
	}

	public void setpresupuestoventaspunvenBean(PresupuestoVentasPunVen presupuestoventaspunvenBean) {
		this.presupuestoventaspunvenBean = presupuestoventaspunvenBean;
	}	
	
	public PresupuestoVentasPunVenParameterReturnGeneral getpresupuestoventaspunvenReturnGeneral() {
		return this.presupuestoventaspunvenReturnGeneral;
	}

	public void setpresupuestoventaspunvenReturnGeneral(PresupuestoVentasPunVenParameterReturnGeneral presupuestoventaspunvenReturnGeneral) {
		this.presupuestoventaspunvenReturnGeneral = presupuestoventaspunvenReturnGeneral;
	}	
	
	
	public Long id_cajaFK_IdCaja=-1L;

	public Long getid_cajaFK_IdCaja() {
		return this.id_cajaFK_IdCaja;
	}

	public void setid_cajaFK_IdCaja(Long id_cajaFK_IdCaja) {
		this.id_cajaFK_IdCaja = id_cajaFK_IdCaja;
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
	
	
	public PresupuestoVentasPunVenLogic getPresupuestoVentasPunVenLogic()	{		
		return presupuestoventaspunvenLogic;
	}

	public void setPresupuestoVentasPunVenLogic(PresupuestoVentasPunVenLogic presupuestoventaspunvenLogic) {
		this.presupuestoventaspunvenLogic = presupuestoventaspunvenLogic;
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
	
	public Boolean getIsEsNuevoPresupuestoVentasPunVen() {
		return isEsNuevoPresupuestoVentasPunVen;
	}

	public void setIsEsNuevoPresupuestoVentasPunVen(Boolean isEsNuevoPresupuestoVentasPunVen) {
		this.isEsNuevoPresupuestoVentasPunVen = isEsNuevoPresupuestoVentasPunVen;
	}

	public Boolean getEsParaAccionDesdeFormularioPresupuestoVentasPunVen() {
		return esParaAccionDesdeFormularioPresupuestoVentasPunVen;
	}
	
	public void setEsParaAccionDesdeFormularioPresupuestoVentasPunVen(Boolean esParaAccionDesdeFormularioPresupuestoVentasPunVen) {
		this.esParaAccionDesdeFormularioPresupuestoVentasPunVen = esParaAccionDesdeFormularioPresupuestoVentasPunVen;
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

			if(this.presupuestoventaspunvenSessionBean==null) {
				this.presupuestoventaspunvenSessionBean=new PresupuestoVentasPunVenSessionBean();
			}

			if(!this.presupuestoventaspunvenSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(presupuestoventaspunvenSessionBean.getlidEmpresaActual());
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

			if(this.presupuestoventaspunvenSessionBean==null) {
				this.presupuestoventaspunvenSessionBean=new PresupuestoVentasPunVenSessionBean();
			}

			if(!this.presupuestoventaspunvenSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(presupuestoventaspunvenSessionBean.getlidSucursalActual());
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

			if(this.presupuestoventaspunvenSessionBean==null) {
				this.presupuestoventaspunvenSessionBean=new PresupuestoVentasPunVenSessionBean();
			}

			if(!this.presupuestoventaspunvenSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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
					ejercicioLogic.getEntityWithConnection(presupuestoventaspunvenSessionBean.getlidEjercicioActual());
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

			if(this.presupuestoventaspunvenSessionBean==null) {
				this.presupuestoventaspunvenSessionBean=new PresupuestoVentasPunVenSessionBean();
			}

			if(!this.presupuestoventaspunvenSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
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
					periodoLogic.getEntityWithConnection(presupuestoventaspunvenSessionBean.getlidPeriodoActual());
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

	public void cargarCombosCajasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.cajasForeignKey=new ArrayList<Caja>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			CajaLogic cajaLogic=new CajaLogic();

			//cajaLogic.getCajaDataAccess().setIsForForeingKeyData(true);

			if(this.presupuestoventaspunvenSessionBean==null) {
				this.presupuestoventaspunvenSessionBean=new PresupuestoVentasPunVenSessionBean();
			}

			if(!this.presupuestoventaspunvenSessionBean.getisBusquedaDesdeForeignKeySesionCaja()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cajaLogic.getCajaDataAccess().setIsForForeingKeyData(true);

					cajaLogic.getTodosCajasWithConnection(sFinalQuery,new Pagination());

					this.cajasForeignKey=cajaLogic.getCajas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCaja(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					cajaLogic.getEntityWithConnection(presupuestoventaspunvenSessionBean.getlidCajaActual());
					this.cajasForeignKey.add(cajaLogic.getCaja());
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

					if(this.presupuestoventaspunven!=null) {
						this.presupuestoventaspunven.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen!=null) {
						this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxid_empresaPresupuestoVentasPunVen.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaPresupuestoVentasPunVen.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen!=null) {
						if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxid_empresaPresupuestoVentasPunVen.getItemCount()>0) {
							this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxid_empresaPresupuestoVentasPunVen.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaPresupuestoVentasPunVenGenerico)throws Exception
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
				jComboBoxid_empresaPresupuestoVentasPunVenGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaPresupuestoVentasPunVenGenerico!=null && jComboBoxid_empresaPresupuestoVentasPunVenGenerico.getItemCount()>0) {
					jComboBoxid_empresaPresupuestoVentasPunVenGenerico.setSelectedIndex(0);
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

					if(this.presupuestoventaspunven!=null) {
						this.presupuestoventaspunven.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen!=null) {
						this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxid_sucursalPresupuestoVentasPunVen.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalPresupuestoVentasPunVen.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen!=null) {
						if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxid_sucursalPresupuestoVentasPunVen.getItemCount()>0) {
							this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxid_sucursalPresupuestoVentasPunVen.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalPresupuestoVentasPunVenGenerico)throws Exception
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
				jComboBoxid_sucursalPresupuestoVentasPunVenGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalPresupuestoVentasPunVenGenerico!=null && jComboBoxid_sucursalPresupuestoVentasPunVenGenerico.getItemCount()>0) {
					jComboBoxid_sucursalPresupuestoVentasPunVenGenerico.setSelectedIndex(0);
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

					if(this.presupuestoventaspunven!=null) {
						this.presupuestoventaspunven.setEjercicio(ejercicioTemp);
					}

					if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen!=null) {
						this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxid_ejercicioPresupuestoVentasPunVen.setSelectedItem(ejercicioTemp);
					}
				} else {
					//jComboBoxid_ejercicioPresupuestoVentasPunVen.setSelectedItem(ejercicioTemp);
					if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen!=null) {
						if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxid_ejercicioPresupuestoVentasPunVen.getItemCount()>0) {
							this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxid_ejercicioPresupuestoVentasPunVen.setSelectedIndex(0);
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
	public void setActualEjercicioForeignKeyGenerico(Long idEjercicioSeleccionado,JComboBox jComboBoxid_ejercicioPresupuestoVentasPunVenGenerico)throws Exception
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
				jComboBoxid_ejercicioPresupuestoVentasPunVenGenerico.setSelectedItem(ejercicioTemp);
			} else {
				if(jComboBoxid_ejercicioPresupuestoVentasPunVenGenerico!=null && jComboBoxid_ejercicioPresupuestoVentasPunVenGenerico.getItemCount()>0) {
					jComboBoxid_ejercicioPresupuestoVentasPunVenGenerico.setSelectedIndex(0);
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

					if(this.presupuestoventaspunven!=null) {
						this.presupuestoventaspunven.setPeriodo(periodoTemp);
					}

					if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen!=null) {
						this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxid_periodoPresupuestoVentasPunVen.setSelectedItem(periodoTemp);
					}
				} else {
					//jComboBoxid_periodoPresupuestoVentasPunVen.setSelectedItem(periodoTemp);
					if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen!=null) {
						if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxid_periodoPresupuestoVentasPunVen.getItemCount()>0) {
							this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxid_periodoPresupuestoVentasPunVen.setSelectedIndex(0);
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
	public void setActualPeriodoForeignKeyGenerico(Long idPeriodoSeleccionado,JComboBox jComboBoxid_periodoPresupuestoVentasPunVenGenerico)throws Exception
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
				jComboBoxid_periodoPresupuestoVentasPunVenGenerico.setSelectedItem(periodoTemp);
			} else {
				if(jComboBoxid_periodoPresupuestoVentasPunVenGenerico!=null && jComboBoxid_periodoPresupuestoVentasPunVenGenerico.getItemCount()>0) {
					jComboBoxid_periodoPresupuestoVentasPunVenGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualCajaForeignKey(Long idCajaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Caja  cajaTemp=null;

			for(Caja cajaAux:cajasForeignKey) {
				if(cajaAux.getId()!=null && cajaAux.getId().equals(idCajaSeleccionado)) {
					cajaTemp=cajaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(cajaTemp!=null) {

					if(this.presupuestoventaspunven!=null) {
						this.presupuestoventaspunven.setCaja(cajaTemp);
					}

					if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen!=null) {
						this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxid_cajaPresupuestoVentasPunVen.setSelectedItem(cajaTemp);
					}
				} else {
					//jComboBoxid_cajaPresupuestoVentasPunVen.setSelectedItem(cajaTemp);
					if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen!=null) {
						if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxid_cajaPresupuestoVentasPunVen.getItemCount()>0) {
							this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxid_cajaPresupuestoVentasPunVen.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCaja") || sFormularioTipoBusqueda.equals("Todos")){
					if(cajaTemp!=null && jComboBoxid_cajaFK_IdCajaPresupuestoVentasPunVen!=null) {
						jComboBoxid_cajaFK_IdCajaPresupuestoVentasPunVen.setSelectedItem(cajaTemp);
					} else {
						if(jComboBoxid_cajaFK_IdCajaPresupuestoVentasPunVen!=null) {
							//jComboBoxid_cajaFK_IdCajaPresupuestoVentasPunVen.setSelectedItem(cajaTemp);
							if(jComboBoxid_cajaFK_IdCajaPresupuestoVentasPunVen.getItemCount()>0) {
								jComboBoxid_cajaFK_IdCajaPresupuestoVentasPunVen.setSelectedIndex(0);
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

	public String getActualCajaForeignKeyDescripcion(Long idCajaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Caja  cajaTemp=null;

			for(Caja cajaAux:cajasForeignKey) {
				if(cajaAux.getId()!=null && cajaAux.getId().equals(idCajaSeleccionado)) {
					cajaTemp=cajaAux;
					break;
				}
			}


			sDescripcion=CajaConstantesFunciones.getCajaDescripcion(cajaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualCajaForeignKeyGenerico(Long idCajaSeleccionado,JComboBox jComboBoxid_cajaPresupuestoVentasPunVenGenerico)throws Exception
	{
		try
		{
			Caja  cajaTemp=null;

			for(Caja cajaAux:cajasForeignKey) {
				if(cajaAux.getId()!=null && cajaAux.getId().equals(idCajaSeleccionado)) {
					cajaTemp=cajaAux;
					break;
				}
			}

			if(cajaTemp!=null) {
				jComboBoxid_cajaPresupuestoVentasPunVenGenerico.setSelectedItem(cajaTemp);
			} else {
				if(jComboBoxid_cajaPresupuestoVentasPunVenGenerico!=null && jComboBoxid_cajaPresupuestoVentasPunVenGenerico.getItemCount()>0) {
					jComboBoxid_cajaPresupuestoVentasPunVenGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(PresupuestoVentasPunVen presupuestoventaspunven,JComboBox jComboBoxid_empresaPresupuestoVentasPunVenGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaPresupuestoVentasPunVenGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxid_empresaPresupuestoVentasPunVen.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaPresupuestoVentasPunVenGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				presupuestoventaspunven.setid_empresa(empresaAux.getId());
				presupuestoventaspunven.setempresa_descripcion(PresupuestoVentasPunVenConstantesFunciones.getEmpresaDescripcion(empresaAux));
				presupuestoventaspunven.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(PresupuestoVentasPunVen presupuestoventaspunven,JComboBox jComboBoxid_sucursalPresupuestoVentasPunVenGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalPresupuestoVentasPunVenGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxid_sucursalPresupuestoVentasPunVen.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalPresupuestoVentasPunVenGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				presupuestoventaspunven.setid_sucursal(sucursalAux.getId());
				presupuestoventaspunven.setsucursal_descripcion(PresupuestoVentasPunVenConstantesFunciones.getSucursalDescripcion(sucursalAux));
				presupuestoventaspunven.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEjercicioForeignKey(PresupuestoVentasPunVen presupuestoventaspunven,JComboBox jComboBoxid_ejercicioPresupuestoVentasPunVenGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioAux=new Ejercicio();

			if(jComboBoxid_ejercicioPresupuestoVentasPunVenGenerico==null) {
				ejercicioAux=(Ejercicio)this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxid_ejercicioPresupuestoVentasPunVen.getSelectedItem();
			} else {
				ejercicioAux=(Ejercicio)jComboBoxid_ejercicioPresupuestoVentasPunVenGenerico.getSelectedItem();
			}

			if(ejercicioAux!=null && ejercicioAux.getId()!=null) {
				presupuestoventaspunven.setid_ejercicio(ejercicioAux.getId());
				presupuestoventaspunven.setejercicio_descripcion(PresupuestoVentasPunVenConstantesFunciones.getEjercicioDescripcion(ejercicioAux));
				presupuestoventaspunven.setEjercicio(ejercicioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPeriodoForeignKey(PresupuestoVentasPunVen presupuestoventaspunven,JComboBox jComboBoxid_periodoPresupuestoVentasPunVenGenerico)throws Exception
	{
		try
		{
			Periodo  periodoAux=new Periodo();

			if(jComboBoxid_periodoPresupuestoVentasPunVenGenerico==null) {
				periodoAux=(Periodo)this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxid_periodoPresupuestoVentasPunVen.getSelectedItem();
			} else {
				periodoAux=(Periodo)jComboBoxid_periodoPresupuestoVentasPunVenGenerico.getSelectedItem();
			}

			if(periodoAux!=null && periodoAux.getId()!=null) {
				if(periodoAux.getid_estado_periodo().equals(0L)) {
					throw new Exception("Periodo INACTIVO, NO PUEDE GUARDAR LA INFORMACION CONSULTE CON EL ADMINISTRADOR");
				}

				presupuestoventaspunven.setid_periodo(periodoAux.getId());
				presupuestoventaspunven.setperiodo_descripcion(PresupuestoVentasPunVenConstantesFunciones.getPeriodoDescripcion(periodoAux));
				presupuestoventaspunven.setPeriodo(periodoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCajaForeignKey(PresupuestoVentasPunVen presupuestoventaspunven,JComboBox jComboBoxid_cajaPresupuestoVentasPunVenGenerico)throws Exception
	{
		try
		{
			Caja  cajaAux=new Caja();

			if(jComboBoxid_cajaPresupuestoVentasPunVenGenerico==null) {
				cajaAux=(Caja)this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxid_cajaPresupuestoVentasPunVen.getSelectedItem();
			} else {
				cajaAux=(Caja)jComboBoxid_cajaPresupuestoVentasPunVenGenerico.getSelectedItem();
			}

			if(cajaAux!=null && cajaAux.getId()!=null) {
				presupuestoventaspunven.setid_caja(cajaAux.getId());
				presupuestoventaspunven.setcaja_descripcion(PresupuestoVentasPunVenConstantesFunciones.getCajaDescripcion(cajaAux));
				presupuestoventaspunven.setCaja(cajaAux);			}
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

					if(!PresupuestoVentasPunVenJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen!=null) { 
							this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxid_empresaPresupuestoVentasPunVen.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxid_empresaPresupuestoVentasPunVen.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen!=null) { 
					}

					if(!PresupuestoVentasPunVenJInternalFrame.ISBINDING_MANUAL) {
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

					if(!PresupuestoVentasPunVenJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen!=null) { 
							this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxid_sucursalPresupuestoVentasPunVen.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxid_sucursalPresupuestoVentasPunVen.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen!=null) { 
					}

					if(!PresupuestoVentasPunVenJInternalFrame.ISBINDING_MANUAL) {
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

					if(!PresupuestoVentasPunVenJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen!=null) { 
							this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxid_ejercicioPresupuestoVentasPunVen.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxid_ejercicioPresupuestoVentasPunVen.addItem(ejercicio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen!=null) { 
					}

					if(!PresupuestoVentasPunVenJInternalFrame.ISBINDING_MANUAL) {
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

					if(!PresupuestoVentasPunVenJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen!=null) { 
							this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxid_periodoPresupuestoVentasPunVen.removeAllItems();

							for(Periodo periodo:this.periodosForeignKey) {
								this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxid_periodoPresupuestoVentasPunVen.addItem(periodo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen!=null) { 
					}

					if(!PresupuestoVentasPunVenJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameCajasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCaja=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!PresupuestoVentasPunVenJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen!=null) { 
							this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxid_cajaPresupuestoVentasPunVen.removeAllItems();

							for(Caja caja:this.cajasForeignKey) {
								this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxid_cajaPresupuestoVentasPunVen.addItem(caja);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen!=null) { 
					}

					if(!PresupuestoVentasPunVenJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCaja") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PresupuestoVentasPunVenJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_cajaFK_IdCajaPresupuestoVentasPunVen.removeAllItems();

							for(Caja caja:this.cajasForeignKey) {
								this.jComboBoxid_cajaFK_IdCajaPresupuestoVentasPunVen.addItem(caja);
							}
						}

						if(!PresupuestoVentasPunVenJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen!=null) {
							this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxid_empresaPresupuestoVentasPunVen.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen!=null) {
							this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxid_empresaPresupuestoVentasPunVen.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen!=null) {
							this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxid_sucursalPresupuestoVentasPunVen.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen!=null) {
							this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxid_sucursalPresupuestoVentasPunVen.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen!=null) {
							this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxid_ejercicioPresupuestoVentasPunVen.setSelectedItem(ejercicio);
						}
					} else {
						if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen!=null) {
							this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxid_ejercicioPresupuestoVentasPunVen.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen!=null) {
							this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxid_periodoPresupuestoVentasPunVen.setSelectedItem(periodo);
						}
					} else {
						if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen!=null) {
							this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxid_periodoPresupuestoVentasPunVen.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameCajaForeignKey(Caja caja,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen!=null) {
							this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxid_cajaPresupuestoVentasPunVen.setSelectedItem(caja);
						}
					} else {
						if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen!=null) {
							this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxid_cajaPresupuestoVentasPunVen.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_cajaFK_IdCajaPresupuestoVentasPunVen.setSelectedItem(caja);
						} else {
							this.jComboBoxid_cajaFK_IdCajaPresupuestoVentasPunVen.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesPresupuestoVentasPunVen() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			PresupuestoVentasPunVenConstantesFunciones.refrescarForeignKeysDescripcionesPresupuestoVentasPunVen(this.presupuestoventaspunvenLogic.getPresupuestoVentasPunVens());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			PresupuestoVentasPunVenConstantesFunciones.refrescarForeignKeysDescripcionesPresupuestoVentasPunVen(this.presupuestoventaspunvens);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Ejercicio.class));
		classes.add(new Classe(Periodo.class));
		classes.add(new Classe(Caja.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//presupuestoventaspunvenLogic.setPresupuestoVentasPunVens(this.presupuestoventaspunvens);
			presupuestoventaspunvenLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public PresupuestoVentasPunVenParameterReturnGeneral getPresupuestoVentasPunVenParameterGeneral() {
		return this.presupuestoventaspunvenParameterGeneral;
	}
	
	public void setPresupuestoVentasPunVenParameterGeneral(PresupuestoVentasPunVenParameterReturnGeneral presupuestoventaspunvenParameterGeneral) {
		this.presupuestoventaspunvenParameterGeneral = presupuestoventaspunvenParameterGeneral;
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
	
	public Boolean getIsPermisoTodoPresupuestoVentasPunVen() {
		return isPermisoTodoPresupuestoVentasPunVen;
	}

	public void setIsPermisoTodoPresupuestoVentasPunVen(Boolean isPermisoTodoPresupuestoVentasPunVen) {
		this.isPermisoTodoPresupuestoVentasPunVen = isPermisoTodoPresupuestoVentasPunVen;
	}

	public Boolean getIsPermisoNuevoPresupuestoVentasPunVen() {
		return isPermisoNuevoPresupuestoVentasPunVen;
	}

	public void setIsPermisoNuevoPresupuestoVentasPunVen(Boolean isPermisoNuevoPresupuestoVentasPunVen) {
		this.isPermisoNuevoPresupuestoVentasPunVen = isPermisoNuevoPresupuestoVentasPunVen;
	}

	public Boolean getIsPermisoActualizarPresupuestoVentasPunVen() {
		return isPermisoActualizarPresupuestoVentasPunVen;
	}

	public void setIsPermisoActualizarPresupuestoVentasPunVen(Boolean isPermisoActualizarPresupuestoVentasPunVen) {
		this.isPermisoActualizarPresupuestoVentasPunVen = isPermisoActualizarPresupuestoVentasPunVen;
	}

	public Boolean getIsPermisoEliminarPresupuestoVentasPunVen() {
		return isPermisoEliminarPresupuestoVentasPunVen;
	}

	public void setIsPermisoEliminarPresupuestoVentasPunVen(Boolean isPermisoEliminarPresupuestoVentasPunVen) {
		this.isPermisoEliminarPresupuestoVentasPunVen = isPermisoEliminarPresupuestoVentasPunVen;
	}

	public Boolean getIsPermisoGuardarCambiosPresupuestoVentasPunVen() {
		return isPermisoGuardarCambiosPresupuestoVentasPunVen;
	}

	public void setIsPermisoGuardarCambiosPresupuestoVentasPunVen(Boolean isPermisoGuardarCambiosPresupuestoVentasPunVen) {
		this.isPermisoGuardarCambiosPresupuestoVentasPunVen = isPermisoGuardarCambiosPresupuestoVentasPunVen;
	}
	
	public Boolean getIsPermisoConsultaPresupuestoVentasPunVen() {
		return isPermisoConsultaPresupuestoVentasPunVen;
	}

	public void setIsPermisoConsultaPresupuestoVentasPunVen(Boolean isPermisoConsultaPresupuestoVentasPunVen) {
		this.isPermisoConsultaPresupuestoVentasPunVen = isPermisoConsultaPresupuestoVentasPunVen;
	}

	public Boolean getIsPermisoBusquedaPresupuestoVentasPunVen() {
		return isPermisoBusquedaPresupuestoVentasPunVen;
	}

	public void setIsPermisoBusquedaPresupuestoVentasPunVen(Boolean isPermisoBusquedaPresupuestoVentasPunVen) {
		this.isPermisoBusquedaPresupuestoVentasPunVen = isPermisoBusquedaPresupuestoVentasPunVen;
	}

	public Boolean getIsPermisoReportePresupuestoVentasPunVen() {
		return isPermisoReportePresupuestoVentasPunVen;
	}

	public void setIsPermisoReportePresupuestoVentasPunVen(Boolean isPermisoReportePresupuestoVentasPunVen) {
		this.isPermisoReportePresupuestoVentasPunVen = isPermisoReportePresupuestoVentasPunVen;
	}
	
	public Boolean getIsPermisoPaginacionMedioPresupuestoVentasPunVen() {
		return isPermisoPaginacionMedioPresupuestoVentasPunVen;
	}

	public void setIsPermisoPaginacionMedioPresupuestoVentasPunVen(Boolean isPermisoPaginacionMedioPresupuestoVentasPunVen) {
		this.isPermisoPaginacionMedioPresupuestoVentasPunVen = isPermisoPaginacionMedioPresupuestoVentasPunVen;
	}
	
	public Boolean getIsPermisoPaginacionTodoPresupuestoVentasPunVen() {
		return isPermisoPaginacionTodoPresupuestoVentasPunVen;
	}

	public void setIsPermisoPaginacionTodoPresupuestoVentasPunVen(Boolean isPermisoPaginacionTodoPresupuestoVentasPunVen) {
		this.isPermisoPaginacionTodoPresupuestoVentasPunVen = isPermisoPaginacionTodoPresupuestoVentasPunVen;
	}
	
	public Boolean getIsPermisoPaginacionAltoPresupuestoVentasPunVen() {
		return isPermisoPaginacionAltoPresupuestoVentasPunVen;
	}

	public void setIsPermisoPaginacionAltoPresupuestoVentasPunVen(Boolean isPermisoPaginacionAltoPresupuestoVentasPunVen) {
		this.isPermisoPaginacionAltoPresupuestoVentasPunVen = isPermisoPaginacionAltoPresupuestoVentasPunVen;
	}
	
	public Boolean getIsPermisoCopiarPresupuestoVentasPunVen() {
		return isPermisoCopiarPresupuestoVentasPunVen;
	}

	public void setIsPermisoCopiarPresupuestoVentasPunVen(Boolean isPermisoCopiarPresupuestoVentasPunVen) {
		this.isPermisoCopiarPresupuestoVentasPunVen = isPermisoCopiarPresupuestoVentasPunVen;
	}
	
	public Boolean getIsPermisoVerFormPresupuestoVentasPunVen() {
		return isPermisoVerFormPresupuestoVentasPunVen;
	}

	public void setIsPermisoVerFormPresupuestoVentasPunVen(Boolean isPermisoVerFormPresupuestoVentasPunVen) {
		this.isPermisoVerFormPresupuestoVentasPunVen = isPermisoVerFormPresupuestoVentasPunVen;
	}
	
	public Boolean getIsPermisoDuplicarPresupuestoVentasPunVen() {
		return isPermisoDuplicarPresupuestoVentasPunVen;
	}

	public void setIsPermisoDuplicarPresupuestoVentasPunVen(Boolean isPermisoDuplicarPresupuestoVentasPunVen) {
		this.isPermisoDuplicarPresupuestoVentasPunVen = isPermisoDuplicarPresupuestoVentasPunVen;
	}
	
	public Boolean getIsPermisoOrdenPresupuestoVentasPunVen() {
		return isPermisoOrdenPresupuestoVentasPunVen;
	}

	public void setIsPermisoOrdenPresupuestoVentasPunVen(Boolean isPermisoOrdenPresupuestoVentasPunVen) {
		this.isPermisoOrdenPresupuestoVentasPunVen = isPermisoOrdenPresupuestoVentasPunVen;
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
	
	public Boolean getIsVisibilidadCeldaNuevoPresupuestoVentasPunVen() {
		return isVisibilidadCeldaNuevoPresupuestoVentasPunVen;
	}

	public void setIsVisibilidadCeldaNuevoPresupuestoVentasPunVen(Boolean isVisibilidadCeldaNuevoPresupuestoVentasPunVen) {
		this.isVisibilidadCeldaNuevoPresupuestoVentasPunVen = isVisibilidadCeldaNuevoPresupuestoVentasPunVen;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarPresupuestoVentasPunVen() {
		return isVisibilidadCeldaDuplicarPresupuestoVentasPunVen;
	}

	public void setIsVisibilidadCeldaDuplicarPresupuestoVentasPunVen(Boolean isVisibilidadCeldaDuplicarPresupuestoVentasPunVen) {
		this.isVisibilidadCeldaDuplicarPresupuestoVentasPunVen = isVisibilidadCeldaDuplicarPresupuestoVentasPunVen;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarPresupuestoVentasPunVen() {
		return isVisibilidadCeldaCopiarPresupuestoVentasPunVen;
	}

	public void setIsVisibilidadCeldaCopiarPresupuestoVentasPunVen(Boolean isVisibilidadCeldaCopiarPresupuestoVentasPunVen) {
		this.isVisibilidadCeldaCopiarPresupuestoVentasPunVen = isVisibilidadCeldaCopiarPresupuestoVentasPunVen;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormPresupuestoVentasPunVen() {
		return isVisibilidadCeldaVerFormPresupuestoVentasPunVen;
	}

	public void setIsVisibilidadCeldaVerFormPresupuestoVentasPunVen(Boolean isVisibilidadCeldaVerFormPresupuestoVentasPunVen) {
		this.isVisibilidadCeldaVerFormPresupuestoVentasPunVen = isVisibilidadCeldaVerFormPresupuestoVentasPunVen;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenPresupuestoVentasPunVen() {
		return isVisibilidadCeldaOrdenPresupuestoVentasPunVen;
	}

	public void setIsVisibilidadCeldaOrdenPresupuestoVentasPunVen(Boolean isVisibilidadCeldaOrdenPresupuestoVentasPunVen) {
		this.isVisibilidadCeldaOrdenPresupuestoVentasPunVen = isVisibilidadCeldaOrdenPresupuestoVentasPunVen;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesPresupuestoVentasPunVen() {
		return isVisibilidadCeldaNuevoRelacionesPresupuestoVentasPunVen;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesPresupuestoVentasPunVen(Boolean isVisibilidadCeldaNuevoRelacionesPresupuestoVentasPunVen) {
		this.isVisibilidadCeldaNuevoRelacionesPresupuestoVentasPunVen = isVisibilidadCeldaNuevoRelacionesPresupuestoVentasPunVen;
	}
	
	public Boolean getIsVisibilidadCeldaModificarPresupuestoVentasPunVen() {
		return isVisibilidadCeldaModificarPresupuestoVentasPunVen;
	}

	public void setIsVisibilidadCeldaModificarPresupuestoVentasPunVen(Boolean isVisibilidadCeldaModificarPresupuestoVentasPunVen) {
		this.isVisibilidadCeldaModificarPresupuestoVentasPunVen = isVisibilidadCeldaModificarPresupuestoVentasPunVen;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarPresupuestoVentasPunVen() {
		return isVisibilidadCeldaActualizarPresupuestoVentasPunVen;
	}

	public void setIsVisibilidadCeldaActualizarPresupuestoVentasPunVen(Boolean isVisibilidadCeldaActualizarPresupuestoVentasPunVen) {
		this.isVisibilidadCeldaActualizarPresupuestoVentasPunVen = isVisibilidadCeldaActualizarPresupuestoVentasPunVen;
	}

	public Boolean getIsVisibilidadCeldaEliminarPresupuestoVentasPunVen() {
		return isVisibilidadCeldaEliminarPresupuestoVentasPunVen;
	}

	public void setIsVisibilidadCeldaEliminarPresupuestoVentasPunVen(Boolean isVisibilidadCeldaEliminarPresupuestoVentasPunVen) {
		this.isVisibilidadCeldaEliminarPresupuestoVentasPunVen = isVisibilidadCeldaEliminarPresupuestoVentasPunVen;
	}

	public Boolean getIsVisibilidadCeldaCancelarPresupuestoVentasPunVen() {
		return isVisibilidadCeldaCancelarPresupuestoVentasPunVen;
	}

	public void setIsVisibilidadCeldaCancelarPresupuestoVentasPunVen(Boolean isVisibilidadCeldaCancelarPresupuestoVentasPunVen) {
		this.isVisibilidadCeldaCancelarPresupuestoVentasPunVen = isVisibilidadCeldaCancelarPresupuestoVentasPunVen;
	}

	public Boolean getIsVisibilidadCeldaGuardarPresupuestoVentasPunVen() {
		return isVisibilidadCeldaGuardarPresupuestoVentasPunVen;
	}

	public void setIsVisibilidadCeldaGuardarPresupuestoVentasPunVen(Boolean isVisibilidadCeldaGuardarPresupuestoVentasPunVen) {
		this.isVisibilidadCeldaGuardarPresupuestoVentasPunVen = isVisibilidadCeldaGuardarPresupuestoVentasPunVen;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosPresupuestoVentasPunVen() {
		return isVisibilidadCeldaGuardarCambiosPresupuestoVentasPunVen;
	}

	public void setIsVisibilidadCeldaGuardarCambiosPresupuestoVentasPunVen(Boolean isVisibilidadCeldaGuardarCambiosPresupuestoVentasPunVen) {
		this.isVisibilidadCeldaGuardarCambiosPresupuestoVentasPunVen = isVisibilidadCeldaGuardarCambiosPresupuestoVentasPunVen;
	}
		
	public PresupuestoVentasPunVenSessionBean getpresupuestoventaspunvenSessionBean() {
		return this.presupuestoventaspunvenSessionBean;
	}
	
	public void setpresupuestoventaspunvenSessionBean(PresupuestoVentasPunVenSessionBean presupuestoventaspunvenSessionBean) {
		this.presupuestoventaspunvenSessionBean=presupuestoventaspunvenSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdCaja() {
		return this.isVisibilidadFK_IdCaja;
	}

	public void setisVisibilidadFK_IdCaja(Boolean isVisibilidadFK_IdCaja) {
		this.isVisibilidadFK_IdCaja=isVisibilidadFK_IdCaja;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysPresupuestoVentasPunVen(PresupuestoVentasPunVen presupuestoventaspunven)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(presupuestoventaspunven,null);
				this.setActualParaGuardarSucursalForeignKey(presupuestoventaspunven,null);
				this.setActualParaGuardarEjercicioForeignKey(presupuestoventaspunven,null);
				this.setActualParaGuardarPeriodoForeignKey(presupuestoventaspunven,null);
				this.setActualParaGuardarCajaForeignKey(presupuestoventaspunven,null);
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
	
	public void bugActualizarReferenciaActual(PresupuestoVentasPunVen presupuestoventaspunven,PresupuestoVentasPunVen presupuestoventaspunvenAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalPresupuestoVentasPunVen(presupuestoventaspunven);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		presupuestoventaspunvenAux.setId(presupuestoventaspunven.getId());
		presupuestoventaspunvenAux.setVersionRow(presupuestoventaspunven.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessPresupuestoVentasPunVen();
		
			int intSelectedRow = this.jTableDatosPresupuestoVentasPunVen.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventaspunven =(PresupuestoVentasPunVen) this.presupuestoventaspunvenLogic.getPresupuestoVentasPunVens().toArray()[this.jTableDatosPresupuestoVentasPunVen.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.presupuestoventaspunven =(PresupuestoVentasPunVen) this.presupuestoventaspunvens.toArray()[this.jTableDatosPresupuestoVentasPunVen.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(PresupuestoVentasPunVenJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualPresupuestoVentasPunVen(this.presupuestoventaspunven,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoVentasPunVen(this.presupuestoventaspunven);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = presupuestoventaspunvenValidator.getInvalidValues(this.presupuestoventaspunven);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			presupuestoventaspunvenLogic.setDatosCliente(datosCliente);
			presupuestoventaspunvenLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				presupuestoventaspunvenAux=new  PresupuestoVentasPunVen();
				
				presupuestoventaspunvenAux.setIsNew(true);
				presupuestoventaspunvenAux.setIsChanged(true);
				
				presupuestoventaspunvenAux.setPresupuestoVentasPunVenOriginal(this.presupuestoventaspunven);
				
				presupuestoventaspunvenAux.setId(this.presupuestoventaspunven.getId());	
				presupuestoventaspunvenAux.setVersionRow(this.presupuestoventaspunven.getVersionRow());	
				presupuestoventaspunvenAux.setid_empresa(this.presupuestoventaspunven.getid_empresa());	
				presupuestoventaspunvenAux.setid_sucursal(this.presupuestoventaspunven.getid_sucursal());	
				presupuestoventaspunvenAux.setid_ejercicio(this.presupuestoventaspunven.getid_ejercicio());	
				presupuestoventaspunvenAux.setid_periodo(this.presupuestoventaspunven.getid_periodo());	
				presupuestoventaspunvenAux.setid_caja(this.presupuestoventaspunven.getid_caja());	
				presupuestoventaspunvenAux.setvalor(this.presupuestoventaspunven.getvalor());	
				presupuestoventaspunvenAux.setcantidad(this.presupuestoventaspunven.getcantidad());	
				presupuestoventaspunvenAux.setporcentaje(this.presupuestoventaspunven.getporcentaje());	
				presupuestoventaspunvenAux.setcantidad_total(this.presupuestoventaspunven.getcantidad_total());	
				presupuestoventaspunvenAux.setvalor_total(this.presupuestoventaspunven.getvalor_total());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.presupuestoventaspunvenSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(presupuestoventaspunvenAux,presupuestoventaspunvenLogic.getPresupuestoVentasPunVens());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(presupuestoventaspunvenAux,presupuestoventaspunvens);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.presupuestoventaspunvenSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						presupuestoventaspunvenLogic.savePresupuestoVentasPunVens();//WithConnection
						//presupuestoventaspunvenLogic.getSetVersionRowPresupuestoVentasPunVens();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.presupuestoventaspunven,presupuestoventaspunvenAux);
					
					this.refrescarForeignKeysDescripcionesPresupuestoVentasPunVen();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.presupuestoventaspunvenSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								presupuestoventaspunvenLogic.savePresupuestoVentasPunVenRelaciones(presupuestoventaspunvenAux);//WithConnection
								//presupuestoventaspunvenLogic.getSetVersionRowPresupuestoVentasPunVens();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.presupuestoventaspunven,presupuestoventaspunvenAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.presupuestoventaspunvenSessionBean.getEstaModoGuardarRelaciones() 
									|| this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(presupuestoventaspunvenAux,presupuestoventaspunvenLogic.getPresupuestoVentasPunVens());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(presupuestoventaspunvenAux,presupuestoventaspunvens);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.presupuestoventaspunven,presupuestoventaspunvenAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				presupuestoventaspunvenAux=new  PresupuestoVentasPunVen();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado() 
					|| (this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado() && this.presupuestoventaspunven.getId()>=0)) {
						
					presupuestoventaspunvenAux.setIsNew(false);
				}
				
				presupuestoventaspunvenAux.setIsDeleted(false);
			
				presupuestoventaspunvenAux.setId(this.presupuestoventaspunven.getId());	
				presupuestoventaspunvenAux.setVersionRow(this.presupuestoventaspunven.getVersionRow());	
				presupuestoventaspunvenAux.setid_empresa(this.presupuestoventaspunven.getid_empresa());	
				presupuestoventaspunvenAux.setid_sucursal(this.presupuestoventaspunven.getid_sucursal());	
				presupuestoventaspunvenAux.setid_ejercicio(this.presupuestoventaspunven.getid_ejercicio());	
				presupuestoventaspunvenAux.setid_periodo(this.presupuestoventaspunven.getid_periodo());	
				presupuestoventaspunvenAux.setid_caja(this.presupuestoventaspunven.getid_caja());	
				presupuestoventaspunvenAux.setvalor(this.presupuestoventaspunven.getvalor());	
				presupuestoventaspunvenAux.setcantidad(this.presupuestoventaspunven.getcantidad());	
				presupuestoventaspunvenAux.setporcentaje(this.presupuestoventaspunven.getporcentaje());	
				presupuestoventaspunvenAux.setcantidad_total(this.presupuestoventaspunven.getcantidad_total());	
				presupuestoventaspunvenAux.setvalor_total(this.presupuestoventaspunven.getvalor_total());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(presupuestoventaspunvenAux,presupuestoventaspunvenLogic.getPresupuestoVentasPunVens());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(presupuestoventaspunvenAux,presupuestoventaspunvens);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.presupuestoventaspunvenSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						presupuestoventaspunvenLogic.savePresupuestoVentasPunVens();//WithConnection
						//presupuestoventaspunvenLogic.getSetVersionRowPresupuestoVentasPunVens();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.presupuestoventaspunven,presupuestoventaspunvenAux);
					
					this.refrescarForeignKeysDescripcionesPresupuestoVentasPunVen();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.presupuestoventaspunvenSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								presupuestoventaspunvenLogic.savePresupuestoVentasPunVenRelaciones(presupuestoventaspunvenAux);//WithConnection
								//presupuestoventaspunvenLogic.getSetVersionRowPresupuestoVentasPunVens();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.presupuestoventaspunven,presupuestoventaspunvenAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.presupuestoventaspunvenSessionBean.getEstaModoGuardarRelaciones() 
									|| this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(presupuestoventaspunvenAux,presupuestoventaspunvenLogic.getPresupuestoVentasPunVens());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(presupuestoventaspunvenAux,presupuestoventaspunvens);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.presupuestoventaspunven,presupuestoventaspunvenAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				presupuestoventaspunvenAux=new  PresupuestoVentasPunVen();
				
				presupuestoventaspunvenAux.setIsNew(false);
				presupuestoventaspunvenAux.setIsChanged(false);
				
				presupuestoventaspunvenAux.setIsDeleted(true);
				
				presupuestoventaspunvenAux.setId(this.presupuestoventaspunven.getId());	
				presupuestoventaspunvenAux.setVersionRow(this.presupuestoventaspunven.getVersionRow());	
				presupuestoventaspunvenAux.setid_empresa(this.presupuestoventaspunven.getid_empresa());	
				presupuestoventaspunvenAux.setid_sucursal(this.presupuestoventaspunven.getid_sucursal());	
				presupuestoventaspunvenAux.setid_ejercicio(this.presupuestoventaspunven.getid_ejercicio());	
				presupuestoventaspunvenAux.setid_periodo(this.presupuestoventaspunven.getid_periodo());	
				presupuestoventaspunvenAux.setid_caja(this.presupuestoventaspunven.getid_caja());	
				presupuestoventaspunvenAux.setvalor(this.presupuestoventaspunven.getvalor());	
				presupuestoventaspunvenAux.setcantidad(this.presupuestoventaspunven.getcantidad());	
				presupuestoventaspunvenAux.setporcentaje(this.presupuestoventaspunven.getporcentaje());	
				presupuestoventaspunvenAux.setcantidad_total(this.presupuestoventaspunven.getcantidad_total());	
				presupuestoventaspunvenAux.setvalor_total(this.presupuestoventaspunven.getvalor_total());	
				
				if(this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.presupuestoventaspunvenAux.getId()>=0) {	
						this.presupuestoventaspunvensEliminados.add(presupuestoventaspunvenAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(presupuestoventaspunvenAux,presupuestoventaspunvenLogic.getPresupuestoVentasPunVens());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(presupuestoventaspunvenAux,presupuestoventaspunvens);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.presupuestoventaspunvenSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						presupuestoventaspunvenLogic.savePresupuestoVentasPunVens();//WithConnection
						//presupuestoventaspunvenLogic.getSetVersionRowPresupuestoVentasPunVens();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.presupuestoventaspunvenSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								presupuestoventaspunvenLogic.savePresupuestoVentasPunVenRelaciones(presupuestoventaspunvenAux);//WithConnection
								//presupuestoventaspunvenLogic.getSetVersionRowPresupuestoVentasPunVens();//WithConnection
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
							if(this.presupuestoventaspunvenSessionBean.getEstaModoGuardarRelaciones() 
								|| this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(presupuestoventaspunvenAux,presupuestoventaspunvenLogic.getPresupuestoVentasPunVens());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(presupuestoventaspunvenAux,presupuestoventaspunvens);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventaspunvenLogic.getPresupuestoVentasPunVens().addAll(this.presupuestoventaspunvensEliminados);
					
					presupuestoventaspunvenLogic.savePresupuestoVentasPunVens();//WithConnection
					//presupuestoventaspunvenLogic.getSetVersionRowPresupuestoVentasPunVens();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesPresupuestoVentasPunVen();
				
				this.presupuestoventaspunvensEliminados= new ArrayList<PresupuestoVentasPunVen>();		
			}
			
			if(this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Presupuesto Ventas GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Presupuesto Ventas",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.presupuestoventaspunven=presupuestoventaspunvenAux;
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
      		//this.finishProcessPresupuestoVentasPunVen();
      	}
		
	}	
	
	public void actualizarRelaciones(PresupuestoVentasPunVen presupuestoventaspunvenLocal) throws Exception {
		
		if(this.presupuestoventaspunvenSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(PresupuestoVentasPunVen presupuestoventaspunvenLocal) throws Exception {	
		if(this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				presupuestoventaspunvenLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				presupuestoventaspunvenLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EjercicioDetalleFormJInternalFrame.class)) {
				EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrameLocal=(EjercicioBeanSwingJInternalFrame) ((EjercicioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ejercicioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEjercicio(ejercicioBeanSwingJInternalFrameLocal.getejercicio(),true);
				ejercicioBeanSwingJInternalFrameLocal.actualizarLista(ejercicioBeanSwingJInternalFrameLocal.ejercicio,this.ejerciciosForeignKey);

				ejercicioBeanSwingJInternalFrameLocal.actualizarRelaciones(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				presupuestoventaspunvenLocal.setEjercicio(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				this.addItemDefectoCombosForeignKeyEjercicio();
				this.cargarCombosFrameEjerciciosForeignKey("Formulario");
				this.setActualEjercicioForeignKey(ejercicioBeanSwingJInternalFrameLocal.ejercicio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(PeriodoDetalleFormJInternalFrame.class)) {
				PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrameLocal=(PeriodoBeanSwingJInternalFrame) ((PeriodoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				periodoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPeriodo(periodoBeanSwingJInternalFrameLocal.getperiodo(),true);
				periodoBeanSwingJInternalFrameLocal.actualizarLista(periodoBeanSwingJInternalFrameLocal.periodo,this.periodosForeignKey);

				periodoBeanSwingJInternalFrameLocal.actualizarRelaciones(periodoBeanSwingJInternalFrameLocal.periodo);

				presupuestoventaspunvenLocal.setPeriodo(periodoBeanSwingJInternalFrameLocal.periodo);

				this.addItemDefectoCombosForeignKeyPeriodo();
				this.cargarCombosFramePeriodosForeignKey("Formulario");
				this.setActualPeriodoForeignKey(periodoBeanSwingJInternalFrameLocal.periodo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CajaDetalleFormJInternalFrame.class)) {
				CajaBeanSwingJInternalFrame cajaBeanSwingJInternalFrameLocal=(CajaBeanSwingJInternalFrame) ((CajaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				cajaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCaja(cajaBeanSwingJInternalFrameLocal.getcaja(),true);
				cajaBeanSwingJInternalFrameLocal.actualizarLista(cajaBeanSwingJInternalFrameLocal.caja,this.cajasForeignKey);

				cajaBeanSwingJInternalFrameLocal.actualizarRelaciones(cajaBeanSwingJInternalFrameLocal.caja);

				presupuestoventaspunvenLocal.setCaja(cajaBeanSwingJInternalFrameLocal.caja);

				this.addItemDefectoCombosForeignKeyCaja();
				this.cargarCombosFrameCajasForeignKey("Formulario");
				this.setActualCajaForeignKey(cajaBeanSwingJInternalFrameLocal.caja.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarPresupuestoVentasPunVenActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosPresupuestoVentasPunVen.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.presupuestoventaspunven =(PresupuestoVentasPunVen) this.presupuestoventaspunvenLogic.getPresupuestoVentasPunVens().toArray()[this.jTableDatosPresupuestoVentasPunVen.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.presupuestoventaspunven =(PresupuestoVentasPunVen) this.presupuestoventaspunvens.toArray()[this.jTableDatosPresupuestoVentasPunVen.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = presupuestoventaspunvenValidator.getInvalidValues(this.presupuestoventaspunven);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(PresupuestoVentasPunVen presupuestoventaspunven,List<PresupuestoVentasPunVen> presupuestoventaspunvens) throws Exception {
		try	{		
			PresupuestoVentasPunVenConstantesFunciones.actualizarLista(presupuestoventaspunven,presupuestoventaspunvens,this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(PresupuestoVentasPunVen presupuestoventaspunven,List<PresupuestoVentasPunVen> presupuestoventaspunvens) throws Exception {
		try	{			
			PresupuestoVentasPunVenConstantesFunciones.actualizarSelectedLista(presupuestoventaspunven,presupuestoventaspunvens);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<PresupuestoVentasPunVen> presupuestoventaspunvensLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				presupuestoventaspunvensLocal=this.presupuestoventaspunvenLogic.getPresupuestoVentasPunVens();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				presupuestoventaspunvensLocal=this.presupuestoventaspunvens;
			}
			//ARCHITECTURE
		
			for(PresupuestoVentasPunVen presupuestoventaspunvenLocal:presupuestoventaspunvensLocal) {
				if(this.permiteMantenimiento(presupuestoventaspunvenLocal) && presupuestoventaspunvenLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+PresupuestoVentasPunVenConstantesFunciones.getPresupuestoVentasPunVenLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(PresupuestoVentasPunVenConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jLabelid_empresaPresupuestoVentasPunVen,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresupuestoVentasPunVenConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jLabelid_sucursalPresupuestoVentasPunVen,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresupuestoVentasPunVenConstantesFunciones.IDEJERCICIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jLabelid_ejercicioPresupuestoVentasPunVen,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresupuestoVentasPunVenConstantesFunciones.IDPERIODO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jLabelid_periodoPresupuestoVentasPunVen,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresupuestoVentasPunVenConstantesFunciones.IDCAJA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jLabelid_cajaPresupuestoVentasPunVen,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresupuestoVentasPunVenConstantesFunciones.VALOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jLabelvalorPresupuestoVentasPunVen,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresupuestoVentasPunVenConstantesFunciones.CANTIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jLabelcantidadPresupuestoVentasPunVen,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresupuestoVentasPunVenConstantesFunciones.PORCENTAJE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jLabelporcentajePresupuestoVentasPunVen,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresupuestoVentasPunVenConstantesFunciones.CANTIDADTOTAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jLabelcantidad_totalPresupuestoVentasPunVen,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresupuestoVentasPunVenConstantesFunciones.VALORTOTAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jLabelvalor_totalPresupuestoVentasPunVen,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jLabelid_empresaPresupuestoVentasPunVen,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jLabelid_sucursalPresupuestoVentasPunVen,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jLabelid_ejercicioPresupuestoVentasPunVen,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jLabelid_periodoPresupuestoVentasPunVen,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jLabelid_cajaPresupuestoVentasPunVen,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jLabelvalorPresupuestoVentasPunVen,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jLabelcantidadPresupuestoVentasPunVen,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jLabelporcentajePresupuestoVentasPunVen,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jLabelcantidad_totalPresupuestoVentasPunVen,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jLabelvalor_totalPresupuestoVentasPunVen,"");
		
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
		this.iIdNuevoPresupuestoVentasPunVen--;	
		
		
		this.presupuestoventaspunvenAux=new PresupuestoVentasPunVen();
		
		this.presupuestoventaspunvenAux.setId(this.iIdNuevoPresupuestoVentasPunVen);
		this.presupuestoventaspunvenAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.presupuestoventaspunvenLogic.getPresupuestoVentasPunVens().add(this.presupuestoventaspunvenAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.presupuestoventaspunvens.add(this.presupuestoventaspunvenAux);
		}
		//ARCHITECTURE
		
		this.presupuestoventaspunven=this.presupuestoventaspunvenAux;
		
		if(PresupuestoVentasPunVenJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioPresupuestoVentasPunVen(this.presupuestoventaspunven);
			this.setVariablesObjetoActualToFormularioForeignKeyPresupuestoVentasPunVen(this.presupuestoventaspunven);
		}
				
		//this.setDefaultControlesPresupuestoVentasPunVen();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyPresupuestoVentasPunVen();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyPresupuestoVentasPunVen();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyPresupuestoVentasPunVen();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPresupuestoVentasPunVen(this.presupuestoventaspunvenBean,this.presupuestoventaspunven,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoVentasPunVen(this.presupuestoventaspunven);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.presupuestoventaspunvenSessionBean.getConGuardarRelaciones()) {
			classes=PresupuestoVentasPunVenConstantesFunciones.getClassesRelationshipsOfPresupuestoVentasPunVen(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.presupuestoventaspunvenReturnGeneral=presupuestoventaspunvenLogic.procesarEventosPresupuestoVentasPunVensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.presupuestoventaspunvenLogic.getPresupuestoVentasPunVens(),this.presupuestoventaspunven,this.presupuestoventaspunvenParameterGeneral,this.isEsNuevoPresupuestoVentasPunVen,classes);//this.presupuestoventaspunvenLogic.getPresupuestoVentasPunVen()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanPresupuestoVentasPunVen(this.presupuestoventaspunvenReturnGeneral,this.presupuestoventaspunvenBean,false);
		
		if(this.presupuestoventaspunvenReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyPresupuestoVentasPunVen(this.presupuestoventaspunvenReturnGeneral.getPresupuestoVentasPunVen());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioPresupuestoVentasPunVen(this.presupuestoventaspunvenReturnGeneral.getPresupuestoVentasPunVen());
		}
		
		if(this.presupuestoventaspunvenReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioPresupuestoVentasPunVen(this.presupuestoventaspunvenReturnGeneral.getPresupuestoVentasPunVen(),classes);//this.presupuestoventaspunvenBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualPresupuestoVentasPunVen(this.presupuestoventaspunven,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyPresupuestoVentasPunVen();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyPresupuestoVentasPunVen();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PresupuestoVentasPunVenBeanSwingJInternalFrameAdditional.RecargarFormPresupuestoVentasPunVen(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingPresupuestoVentasPunVen(false);
						
			if(presupuestoventaspunvenSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(PresupuestoVentasPunVenJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPresupuestoVentasPunVen();
			}
			
			this.actualizarVisualTableDatosPresupuestoVentasPunVen();
			
			this.jTableDatosPresupuestoVentasPunVen.setRowSelectionInterval(this.getIndiceNuevoPresupuestoVentasPunVen(), this.getIndiceNuevoPresupuestoVentasPunVen());
			
			this.seleccionarFilaTablaPresupuestoVentasPunVenActual();
						
			this.actualizarEstadoCeldasBotonesPresupuestoVentasPunVen("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesPresupuestoVentasPunVen(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jTextFieldvalorPresupuestoVentasPunVen.setEnabled(isHabilitar && this.presupuestoventaspunvenConstantesFunciones.activarvalorPresupuestoVentasPunVen);
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jTextFieldcantidadPresupuestoVentasPunVen.setEnabled(isHabilitar && this.presupuestoventaspunvenConstantesFunciones.activarcantidadPresupuestoVentasPunVen);
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jTextFieldporcentajePresupuestoVentasPunVen.setEnabled(isHabilitar && this.presupuestoventaspunvenConstantesFunciones.activarporcentajePresupuestoVentasPunVen);
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jTextFieldcantidad_totalPresupuestoVentasPunVen.setEnabled(isHabilitar && this.presupuestoventaspunvenConstantesFunciones.activarcantidad_totalPresupuestoVentasPunVen);
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jTextFieldvalor_totalPresupuestoVentasPunVen.setEnabled(isHabilitar && this.presupuestoventaspunvenConstantesFunciones.activarvalor_totalPresupuestoVentasPunVen);	
		//
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxid_empresaPresupuestoVentasPunVen.setEnabled(isHabilitar && this.presupuestoventaspunvenConstantesFunciones.activarid_empresaPresupuestoVentasPunVen);//
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxid_sucursalPresupuestoVentasPunVen.setEnabled(isHabilitar && this.presupuestoventaspunvenConstantesFunciones.activarid_sucursalPresupuestoVentasPunVen);//
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxid_ejercicioPresupuestoVentasPunVen.setEnabled(isHabilitar && this.presupuestoventaspunvenConstantesFunciones.activarid_ejercicioPresupuestoVentasPunVen);//
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxid_periodoPresupuestoVentasPunVen.setEnabled(isHabilitar && this.presupuestoventaspunvenConstantesFunciones.activarid_periodoPresupuestoVentasPunVen);
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxid_cajaPresupuestoVentasPunVen.setEnabled(isHabilitar && this.presupuestoventaspunvenConstantesFunciones.activarid_cajaPresupuestoVentasPunVen);
	};
	
	public void setDefaultControlesPresupuestoVentasPunVen() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoPresupuestoVentasPunVen(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.presupuestoventaspunvenSessionBean.setConGuardarRelaciones(true);			
			this.presupuestoventaspunvenSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jTabbedPaneRelacionesPresupuestoVentasPunVen.setVisible(true);
			
					
		} else {
			//this.presupuestoventaspunvenSessionBean.setConGuardarRelaciones(false);			
			this.presupuestoventaspunvenSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jTabbedPaneRelacionesPresupuestoVentasPunVen.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoPresupuestoVentasPunVen() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PresupuestoVentasPunVen presupuestoventaspunvenAux:this.presupuestoventaspunvenLogic.getPresupuestoVentasPunVens()) {
				if(presupuestoventaspunvenAux.getId().equals(this.iIdNuevoPresupuestoVentasPunVen)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PresupuestoVentasPunVen presupuestoventaspunvenAux:this.presupuestoventaspunvens) {
				if(presupuestoventaspunvenAux.getId().equals(this.iIdNuevoPresupuestoVentasPunVen)) {
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
	
	public int getIndiceActualPresupuestoVentasPunVen(PresupuestoVentasPunVen presupuestoventaspunven,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PresupuestoVentasPunVen presupuestoventaspunvenAux:this.presupuestoventaspunvenLogic.getPresupuestoVentasPunVens()) {
				if(presupuestoventaspunvenAux.getId().equals(presupuestoventaspunven.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PresupuestoVentasPunVen presupuestoventaspunvenAux:this.presupuestoventaspunvens) {
				if(presupuestoventaspunvenAux.getId().equals(presupuestoventaspunven.getId())) {
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
	
	public void setCamposBaseDesdeOriginalPresupuestoVentasPunVen(PresupuestoVentasPunVen presupuestoventaspunvenOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PresupuestoVentasPunVen presupuestoventaspunvenAux:this.presupuestoventaspunvenLogic.getPresupuestoVentasPunVens()) {
				if(presupuestoventaspunvenAux.getPresupuestoVentasPunVenOriginal().getId().equals(presupuestoventaspunvenOriginal.getId())) {
					existe=true;
					presupuestoventaspunvenOriginal.setId(presupuestoventaspunvenAux.getId());
					presupuestoventaspunvenOriginal.setVersionRow(presupuestoventaspunvenAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PresupuestoVentasPunVen presupuestoventaspunvenAux:this.presupuestoventaspunvens) {
				if(presupuestoventaspunvenAux.getPresupuestoVentasPunVenOriginal().getId().equals(presupuestoventaspunvenOriginal.getId())) {
					existe=true;
					presupuestoventaspunvenOriginal.setId(presupuestoventaspunvenAux.getId());
					presupuestoventaspunvenOriginal.setVersionRow(presupuestoventaspunvenAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosPresupuestoVentasPunVen(Boolean esParaCancelar) throws Exception {
		presupuestoventaspunvensAux=new ArrayList<PresupuestoVentasPunVen>();
		presupuestoventaspunvenAux=new PresupuestoVentasPunVen();
		
		if(!this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(PresupuestoVentasPunVen presupuestoventaspunvenAux:this.presupuestoventaspunvenLogic.getPresupuestoVentasPunVens()) {
					if(presupuestoventaspunvenAux.getId()<0) {
						presupuestoventaspunvensAux.add(presupuestoventaspunvenAux);
					}		
				}
				this.iIdNuevoPresupuestoVentasPunVen=0L;
				this.presupuestoventaspunvenLogic.getPresupuestoVentasPunVens().removeAll(presupuestoventaspunvensAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PresupuestoVentasPunVen presupuestoventaspunvenAux:this.presupuestoventaspunvens) {
					if(presupuestoventaspunvenAux.getId()<0) {
						presupuestoventaspunvensAux.add(presupuestoventaspunvenAux);
					}		
				}
				this.iIdNuevoPresupuestoVentasPunVen=0L;
				this.presupuestoventaspunvens.removeAll(presupuestoventaspunvensAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoPresupuestoVentasPunVen 
					&& this.presupuestoventaspunvenLogic.getPresupuestoVentasPunVens().size()>0
					) {
					presupuestoventaspunvenAux=this.presupuestoventaspunvenLogic.getPresupuestoVentasPunVens().get(this.presupuestoventaspunvenLogic.getPresupuestoVentasPunVens().size() - 1);
				
					if(presupuestoventaspunvenAux.getId()<0) {
						this.presupuestoventaspunvenLogic.getPresupuestoVentasPunVens().remove(presupuestoventaspunvenAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoPresupuestoVentasPunVen && this.presupuestoventaspunvens.size()>0) {
					presupuestoventaspunvenAux=this.presupuestoventaspunvens.get(this.presupuestoventaspunvens.size() - 1);
				
					if(presupuestoventaspunvenAux.getId()<0) {
						this.presupuestoventaspunvens.remove(presupuestoventaspunvenAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoPresupuestoVentasPunVen(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(presupuestoventaspunven.getId()<0) {
				this.presupuestoventaspunvenLogic.getPresupuestoVentasPunVens().remove(this.presupuestoventaspunven);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(presupuestoventaspunven.getId()<0) {
				this.presupuestoventaspunvens.remove(this.presupuestoventaspunven);
			}
		}			
	}
	
	public void setEstadosInicialesPresupuestoVentasPunVen(List<PresupuestoVentasPunVen> presupuestoventaspunvensAux) throws Exception {
		PresupuestoVentasPunVenConstantesFunciones.setEstadosInicialesPresupuestoVentasPunVen(presupuestoventaspunvensAux);
	}
	
	public void setEstadosInicialesPresupuestoVentasPunVen(PresupuestoVentasPunVen presupuestoventaspunvenAux) throws Exception {
		PresupuestoVentasPunVenConstantesFunciones.setEstadosInicialesPresupuestoVentasPunVen(presupuestoventaspunvenAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarPresupuestoVentasPunVenActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesPresupuestoVentasPunVen("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarPresupuestoVentasPunVenActual()) {
				if(!this.isEsNuevoPresupuestoVentasPunVen) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesPresupuestoVentasPunVen("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoPresupuestoVentasPunVen=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarPresupuestoVentasPunVenActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Presupuesto Ventas ?", "MANTENIMIENTO DE Presupuesto Ventas", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesPresupuestoVentasPunVen("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(PresupuestoVentasPunVen presupuestoventaspunven) throws Exception {
		PresupuestoVentasPunVenConstantesFunciones.seleccionarAsignar(this.presupuestoventaspunven,presupuestoventaspunven);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarPresupuestoVentasPunVen=this.isPermisoActualizarOriginalPresupuestoVentasPunVen;
			
			
			this.seleccionarAsignar(presupuestoventaspunven);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PresupuestoVentasPunVenConstantesFunciones.quitarEspaciosPresupuestoVentasPunVen(this.presupuestoventaspunven,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesPresupuestoVentasPunVen("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.presupuestoventaspunvenSessionBean.setsFuncionBusquedaRapida(this.presupuestoventaspunvenSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoPresupuestoVentasPunVen) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosPresupuestoVentasPunVen(esParaCancelar);				
				this.cancelarNuevoPresupuestoVentasPunVen(esParaCancelar);								
			}
			
			this.presupuestoventaspunven=new PresupuestoVentasPunVen();
			
			this.inicializarPresupuestoVentasPunVen();
			
			this.actualizarEstadoCeldasBotonesPresupuestoVentasPunVen("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarPresupuestoVentasPunVen() throws Exception {
		try {
			PresupuestoVentasPunVenConstantesFunciones.inicializarPresupuestoVentasPunVen(this.presupuestoventaspunven);
			
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
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.presupuestoventaspunvenLogic.getPresupuestoVentasPunVens().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReportePresupuestoVentasPunVens(String sAccionBusqueda,List<PresupuestoVentasPunVen> presupuestoventaspunvensParaReportes) throws Exception {
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
					sPathReporteFinal="PresupuestoVentasPunVen"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="PresupuestoVentasPunVenMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("PresupuestoVentasPunVenMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="PresupuestoVentasPunVen"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Presupuesto Ventases");		
		parameters.put("busquedapor", PresupuestoVentasPunVenConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourcePresupuestoVentasPunVen=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			PresupuestoVentasPunVenConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			PresupuestoVentasPunVenConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourcePresupuestoVentasPunVen=new JRBeanArrayDataSource(PresupuestoVentasPunVenJInternalFrame.TraerPresupuestoVentasPunVenBeans(presupuestoventaspunvensParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourcePresupuestoVentasPunVen);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+PresupuestoVentasPunVenConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+PresupuestoVentasPunVenConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(PresupuestoVentasPunVenBean.TraerPresupuestoVentasPunVenBeans(presupuestoventaspunvensParaReportes).toArray()));
							
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
				this.generarExcelReportePresupuestoVentasPunVens(sAccionBusqueda,sTipoArchivoReporte,presupuestoventaspunvensParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalPresupuestoVentasPunVens(sAccionBusqueda,sTipoArchivoReporte,presupuestoventaspunvensParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoPresupuestoVentasPunVenActionPerformed(null);
					//this.generarExcelReportePresupuestoVentasPunVens(sAccionBusqueda,sTipoArchivoReporte,presupuestoventaspunvensParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalPresupuestoVentasPunVens(sAccionBusqueda,sTipoArchivoReporte,presupuestoventaspunvensParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesPresupuestoVentasPunVens(sAccionBusqueda,sTipoArchivoReporte,presupuestoventaspunvensParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesPresupuestoVentasPunVens(sAccionBusqueda,sTipoArchivoReporte,presupuestoventaspunvensParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReportePresupuestoVentasPunVens(String sAccionBusqueda,String sTipoArchivoReporte,List<PresupuestoVentasPunVen> presupuestoventaspunvensParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presupuestoventaspunven";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PresupuestoVentasPunVens");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPresupuestoVentasPunVen("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(PresupuestoVentasPunVen presupuestoventaspunven : presupuestoventaspunvensParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			PresupuestoVentasPunVenConstantesFunciones.generarExcelReporteDataPresupuestoVentasPunVen("NORMAL",row,workbook,presupuestoventaspunven,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Presupuesto Ventas",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderPresupuestoVentasPunVen(String sTipo,Row row,Workbook workbook) {
		
		PresupuestoVentasPunVenConstantesFunciones.generarExcelReporteHeaderPresupuestoVentasPunVen(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalPresupuestoVentasPunVens(String sAccionBusqueda,String sTipoArchivoReporte,List<PresupuestoVentasPunVen> presupuestoventaspunvensParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presupuestoventaspunven_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PresupuestoVentasPunVens");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(PresupuestoVentasPunVen presupuestoventaspunven : presupuestoventaspunvensParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(PresupuestoVentasPunVenConstantesFunciones.getPresupuestoVentasPunVenDescripcion(presupuestoventaspunven));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresupuestoVentasPunVenConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresupuestoVentasPunVenConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presupuestoventaspunven.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresupuestoVentasPunVenConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresupuestoVentasPunVenConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presupuestoventaspunven.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresupuestoVentasPunVenConstantesFunciones.LABEL_IDEJERCICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresupuestoVentasPunVenConstantesFunciones.LABEL_IDEJERCICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presupuestoventaspunven.getejercicio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresupuestoVentasPunVenConstantesFunciones.LABEL_IDPERIODO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresupuestoVentasPunVenConstantesFunciones.LABEL_IDPERIODO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presupuestoventaspunven.getperiodo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresupuestoVentasPunVenConstantesFunciones.LABEL_IDCAJA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresupuestoVentasPunVenConstantesFunciones.LABEL_IDCAJA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presupuestoventaspunven.getcaja_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresupuestoVentasPunVenConstantesFunciones.LABEL_VALOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresupuestoVentasPunVenConstantesFunciones.LABEL_VALOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presupuestoventaspunven.getvalor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresupuestoVentasPunVenConstantesFunciones.LABEL_CANTIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresupuestoVentasPunVenConstantesFunciones.LABEL_CANTIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presupuestoventaspunven.getcantidad());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresupuestoVentasPunVenConstantesFunciones.LABEL_PORCENTAJE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresupuestoVentasPunVenConstantesFunciones.LABEL_PORCENTAJE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presupuestoventaspunven.getporcentaje());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresupuestoVentasPunVenConstantesFunciones.LABEL_CANTIDADTOTAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresupuestoVentasPunVenConstantesFunciones.LABEL_CANTIDADTOTAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presupuestoventaspunven.getcantidad_total());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresupuestoVentasPunVenConstantesFunciones.LABEL_VALORTOTAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresupuestoVentasPunVenConstantesFunciones.LABEL_VALORTOTAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presupuestoventaspunven.getvalor_total());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Presupuesto Ventas",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesPresupuestoVentasPunVens(String sAccionBusqueda,String sTipoArchivoReporte,List<PresupuestoVentasPunVen> presupuestoventaspunvensParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<PresupuestoVentasPunVen> presupuestoventaspunvensRespaldo=null;
		
		classes=PresupuestoVentasPunVenConstantesFunciones.getClassesRelationshipsOfPresupuestoVentasPunVen(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.presupuestoventaspunvenLogic.setDatosCliente(this.datosCliente);
		this.presupuestoventaspunvenLogic.setDatosDeep(this.datosDeep);
		this.presupuestoventaspunvenLogic.setIsConDeep(true);
		
		presupuestoventaspunvensRespaldo=this.presupuestoventaspunvenLogic.getPresupuestoVentasPunVens();
		
		this.presupuestoventaspunvenLogic.setPresupuestoVentasPunVens(presupuestoventaspunvensParaReportes);	
		this.presupuestoventaspunvenLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		presupuestoventaspunvensParaReportes=this.presupuestoventaspunvenLogic.getPresupuestoVentasPunVens();
		this.presupuestoventaspunvenLogic.setPresupuestoVentasPunVens(presupuestoventaspunvensRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presupuestoventaspunven_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PresupuestoVentasPunVens");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPresupuestoVentasPunVen("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(PresupuestoVentasPunVen presupuestoventaspunven : presupuestoventaspunvensParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderPresupuestoVentasPunVen("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			PresupuestoVentasPunVenConstantesFunciones.generarExcelReporteDataPresupuestoVentasPunVen("NORMAL",row,workbook,presupuestoventaspunven,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(PresupuestoVentasPunVenConstantesFunciones.getPresupuestoVentasPunVenDescripcion(presupuestoventaspunven));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Presupuesto Ventas",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoPresupuestoVentasPunVen.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPresupuestoVentasPunVen.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoPresupuestoVentasPunVen.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPresupuestoVentasPunVen.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessPresupuestoVentasPunVen() throws Exception {		
		this.startProcessPresupuestoVentasPunVen(true);
	}
	
	public void startProcessPresupuestoVentasPunVen(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasPresupuestoVentasPunVen ,this.jPanelParametrosReportesPresupuestoVentasPunVen, this.jScrollPanelDatosPresupuestoVentasPunVen,this.jPanelPaginacionPresupuestoVentasPunVen, this.jScrollPanelDatosEdicionPresupuestoVentasPunVen, this.jPanelAccionesPresupuestoVentasPunVen,this.jPanelAccionesFormularioPresupuestoVentasPunVen,this.jmenuBarPresupuestoVentasPunVen,this.jmenuBarDetallePresupuestoVentasPunVen,this.jTtoolBarPresupuestoVentasPunVen,this.jTtoolBarDetallePresupuestoVentasPunVen);		
		
		final JTabbedPane jTabbedPaneBusquedasPresupuestoVentasPunVen=this.jTabbedPaneBusquedasPresupuestoVentasPunVen; 
		
		final JPanel jPanelParametrosReportesPresupuestoVentasPunVen=this.jPanelParametrosReportesPresupuestoVentasPunVen;
		//final JScrollPane jScrollPanelDatosPresupuestoVentasPunVen=this.jScrollPanelDatosPresupuestoVentasPunVen;
		final JTable jTableDatosPresupuestoVentasPunVen=this.jTableDatosPresupuestoVentasPunVen;		
		final JPanel jPanelPaginacionPresupuestoVentasPunVen=this.jPanelPaginacionPresupuestoVentasPunVen;
		//final JScrollPane jScrollPanelDatosEdicionPresupuestoVentasPunVen=this.jScrollPanelDatosEdicionPresupuestoVentasPunVen;
		final JPanel jPanelAccionesPresupuestoVentasPunVen=this.jPanelAccionesPresupuestoVentasPunVen;
		
		JPanel jPanelCamposAuxiliarPresupuestoVentasPunVen=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarPresupuestoVentasPunVen=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen!=null) {
			jPanelCamposAuxiliarPresupuestoVentasPunVen=this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jPanelCamposPresupuestoVentasPunVen;
			jPanelAccionesFormularioAuxiliarPresupuestoVentasPunVen=this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jPanelAccionesFormularioPresupuestoVentasPunVen;
		}
		
		final JPanel jPanelCamposPresupuestoVentasPunVen=jPanelCamposAuxiliarPresupuestoVentasPunVen;
		final JPanel jPanelAccionesFormularioPresupuestoVentasPunVen=jPanelAccionesFormularioAuxiliarPresupuestoVentasPunVen;
		
		
		final JMenuBar jmenuBarPresupuestoVentasPunVen=this.jmenuBarPresupuestoVentasPunVen;
		final JToolBar jTtoolBarPresupuestoVentasPunVen=this.jTtoolBarPresupuestoVentasPunVen;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarPresupuestoVentasPunVen=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPresupuestoVentasPunVen=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen!=null) {
			jmenuBarDetalleAuxiliarPresupuestoVentasPunVen=this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jmenuBarDetallePresupuestoVentasPunVen;
			jTtoolBarDetalleAuxiliarPresupuestoVentasPunVen=this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jTtoolBarDetallePresupuestoVentasPunVen;
		}
		
		final JMenuBar jmenuBarDetallePresupuestoVentasPunVen=jmenuBarDetalleAuxiliarPresupuestoVentasPunVen;
		final JToolBar jTtoolBarDetallePresupuestoVentasPunVen=jTtoolBarDetalleAuxiliarPresupuestoVentasPunVen;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPresupuestoVentasPunVen;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPresupuestoVentasPunVen;
			processRunnable.jTableDatos=jTableDatosPresupuestoVentasPunVen;
			processRunnable.jPanelCampos=jPanelCamposPresupuestoVentasPunVen;
			processRunnable.jPanelPaginacion=jPanelPaginacionPresupuestoVentasPunVen;
			processRunnable.jPanelAcciones=jPanelAccionesPresupuestoVentasPunVen;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPresupuestoVentasPunVen;
			
			
			processRunnable.jmenuBar=jmenuBarPresupuestoVentasPunVen;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePresupuestoVentasPunVen;
			processRunnable.jTtoolBar=jTtoolBarPresupuestoVentasPunVen;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePresupuestoVentasPunVen;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPresupuestoVentasPunVen ,jPanelParametrosReportesPresupuestoVentasPunVen,jTableDatosPresupuestoVentasPunVen, /*jScrollPanelDatosPresupuestoVentasPunVen,*/jPanelCamposPresupuestoVentasPunVen,jPanelPaginacionPresupuestoVentasPunVen, /*jScrollPanelDatosEdicionPresupuestoVentasPunVen,*/ jPanelAccionesPresupuestoVentasPunVen,jPanelAccionesFormularioPresupuestoVentasPunVen,jmenuBarPresupuestoVentasPunVen,jmenuBarDetallePresupuestoVentasPunVen,jTtoolBarPresupuestoVentasPunVen,jTtoolBarDetallePresupuestoVentasPunVen);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPresupuestoVentasPunVen ,jPanelParametrosReportesPresupuestoVentasPunVen, jScrollPanelDatosPresupuestoVentasPunVen,jPanelPaginacionPresupuestoVentasPunVen, jScrollPanelDatosEdicionPresupuestoVentasPunVen, jPanelAccionesPresupuestoVentasPunVen,jPanelAccionesFormularioPresupuestoVentasPunVen,jmenuBarPresupuestoVentasPunVen,jmenuBarDetallePresupuestoVentasPunVen,jTtoolBarPresupuestoVentasPunVen,jTtoolBarDetallePresupuestoVentasPunVen);
						
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
	
	public void finishProcessPresupuestoVentasPunVen() {// throws Exception 
		this.finishProcessPresupuestoVentasPunVen(true);
	}
	
	public void finishProcessPresupuestoVentasPunVen(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasPresupuestoVentasPunVen ,this.jPanelParametrosReportesPresupuestoVentasPunVen, this.jScrollPanelDatosPresupuestoVentasPunVen,this.jPanelPaginacionPresupuestoVentasPunVen, this.jScrollPanelDatosEdicionPresupuestoVentasPunVen, this.jPanelAccionesPresupuestoVentasPunVen,this.jPanelAccionesFormularioPresupuestoVentasPunVen,this.jmenuBarPresupuestoVentasPunVen,this.jmenuBarDetallePresupuestoVentasPunVen,this.jTtoolBarPresupuestoVentasPunVen,this.jTtoolBarDetallePresupuestoVentasPunVen);		
		
		final JTabbedPane jTabbedPaneBusquedasPresupuestoVentasPunVen=this.jTabbedPaneBusquedasPresupuestoVentasPunVen; 
		
		final JPanel jPanelParametrosReportesPresupuestoVentasPunVen=this.jPanelParametrosReportesPresupuestoVentasPunVen;
		//final JScrollPane jScrollPanelDatosPresupuestoVentasPunVen=this.jScrollPanelDatosPresupuestoVentasPunVen;
		final JTable jTableDatosPresupuestoVentasPunVen=this.jTableDatosPresupuestoVentasPunVen;		
		final JPanel jPanelPaginacionPresupuestoVentasPunVen=this.jPanelPaginacionPresupuestoVentasPunVen;
		//final JScrollPane jScrollPanelDatosEdicionPresupuestoVentasPunVen=this.jScrollPanelDatosEdicionPresupuestoVentasPunVen;
		final JPanel jPanelAccionesPresupuestoVentasPunVen=this.jPanelAccionesPresupuestoVentasPunVen;
		
		JPanel jPanelCamposAuxiliarPresupuestoVentasPunVen=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarPresupuestoVentasPunVen=new JPanel();
		
		if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen!=null) {
			jPanelCamposAuxiliarPresupuestoVentasPunVen=this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jPanelCamposPresupuestoVentasPunVen;
			jPanelAccionesFormularioAuxiliarPresupuestoVentasPunVen=this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jPanelAccionesFormularioPresupuestoVentasPunVen;
		}
		
		final JPanel jPanelCamposPresupuestoVentasPunVen=jPanelCamposAuxiliarPresupuestoVentasPunVen;
		final JPanel jPanelAccionesFormularioPresupuestoVentasPunVen=jPanelAccionesFormularioAuxiliarPresupuestoVentasPunVen;
		
		
		final JMenuBar jmenuBarPresupuestoVentasPunVen=this.jmenuBarPresupuestoVentasPunVen;		
		final JToolBar jTtoolBarPresupuestoVentasPunVen=this.jTtoolBarPresupuestoVentasPunVen;
				
		JMenuBar jmenuBarDetalleAuxiliarPresupuestoVentasPunVen=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPresupuestoVentasPunVen=new JToolBar();
		
		if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen!=null) {
			jmenuBarDetalleAuxiliarPresupuestoVentasPunVen=this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jmenuBarDetallePresupuestoVentasPunVen;
			jTtoolBarDetalleAuxiliarPresupuestoVentasPunVen=this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jTtoolBarDetallePresupuestoVentasPunVen;		
		}
		
		final JMenuBar jmenuBarDetallePresupuestoVentasPunVen=jmenuBarDetalleAuxiliarPresupuestoVentasPunVen;
		final JToolBar jTtoolBarDetallePresupuestoVentasPunVen=jTtoolBarDetalleAuxiliarPresupuestoVentasPunVen;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPresupuestoVentasPunVen;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPresupuestoVentasPunVen;
			processRunnable.jTableDatos=jTableDatosPresupuestoVentasPunVen;
			processRunnable.jPanelCampos=jPanelCamposPresupuestoVentasPunVen;
			processRunnable.jPanelPaginacion=jPanelPaginacionPresupuestoVentasPunVen;
			processRunnable.jPanelAcciones=jPanelAccionesPresupuestoVentasPunVen;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPresupuestoVentasPunVen;
			
			
			processRunnable.jmenuBar=jmenuBarPresupuestoVentasPunVen;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePresupuestoVentasPunVen;
			processRunnable.jTtoolBar=jTtoolBarPresupuestoVentasPunVen;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePresupuestoVentasPunVen;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasPresupuestoVentasPunVen ,jPanelParametrosReportesPresupuestoVentasPunVen, jTableDatosPresupuestoVentasPunVen,/*jScrollPanelDatosPresupuestoVentasPunVen,*/jPanelCamposPresupuestoVentasPunVen,jPanelPaginacionPresupuestoVentasPunVen, /*jScrollPanelDatosEdicionPresupuestoVentasPunVen,*/ jPanelAccionesPresupuestoVentasPunVen,jPanelAccionesFormularioPresupuestoVentasPunVen,jmenuBarPresupuestoVentasPunVen,jmenuBarDetallePresupuestoVentasPunVen,jTtoolBarPresupuestoVentasPunVen,jTtoolBarDetallePresupuestoVentasPunVen));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesPresupuestoVentasPunVen(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarPresupuestoVentasPunVen(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuPresupuestoVentasPunVen(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarPresupuestoVentasPunVen(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarPresupuestoVentasPunVen,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetallePresupuestoVentasPunVen,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuPresupuestoVentasPunVen(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarPresupuestoVentasPunVen,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetallePresupuestoVentasPunVen,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.presupuestoventaspunvenConstantesFunciones.getsFinalQueryPresupuestoVentasPunVen();
		String  finalQueryPaginacionTodos=this.presupuestoventaspunvenConstantesFunciones.getsFinalQueryPresupuestoVentasPunVen();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=PresupuestoVentasPunVenConstantesFunciones.getArrayColumnasGlobalesNoPresupuestoVentasPunVen(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=PresupuestoVentasPunVenConstantesFunciones.getArrayColumnasGlobalesPresupuestoVentasPunVen(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,PresupuestoVentasPunVenConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.presupuestoventaspunvensEliminados= new ArrayList<PresupuestoVentasPunVen>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessPresupuestoVentasPunVen();
		
				///*PresupuestoVentasPunVenSessionBean*/this.presupuestoventaspunvenSessionBean=new PresupuestoVentasPunVenSessionBean();
			
			if(this.presupuestoventaspunvenSessionBean==null) {
				this.presupuestoventaspunvenSessionBean=new PresupuestoVentasPunVenSessionBean();
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
					this.iNumeroPaginacion=PresupuestoVentasPunVenConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=PresupuestoVentasPunVenConstantesFunciones.getClassesForeignKeysOfPresupuestoVentasPunVen(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/presupuestoventaspunven."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			presupuestoventaspunvensAux= new ArrayList<PresupuestoVentasPunVen>();
			
				
			presupuestoventaspunvenLogic.setDatosCliente(this.datosCliente);
			presupuestoventaspunvenLogic.setDatosDeep(this.datosDeep);
			presupuestoventaspunvenLogic.setIsConDeep(true);
			
			
			presupuestoventaspunvenLogic.getPresupuestoVentasPunVenDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					presupuestoventaspunvenLogic.getTodosPresupuestoVentasPunVens(finalQueryGlobal,pagination);
					
					//presupuestoventaspunvenLogic.getTodosPresupuestoVentasPunVensWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(presupuestoventaspunvenLogic.getPresupuestoVentasPunVens()==null|| presupuestoventaspunvenLogic.getPresupuestoVentasPunVens().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							presupuestoventaspunvensAux= new ArrayList<PresupuestoVentasPunVen>();
							presupuestoventaspunvensAux.addAll(presupuestoventaspunvenLogic.getPresupuestoVentasPunVens());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presupuestoventaspunvensAux= new ArrayList<PresupuestoVentasPunVen>();
							presupuestoventaspunvensAux.addAll(presupuestoventaspunvens);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							presupuestoventaspunvenLogic.getTodosPresupuestoVentasPunVens(finalQueryGlobal+"",this.pagination);												
							
							//presupuestoventaspunvenLogic.getTodosPresupuestoVentasPunVensWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReportePresupuestoVentasPunVens("Todos",presupuestoventaspunvenLogic.getPresupuestoVentasPunVens() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							presupuestoventaspunvenLogic.setPresupuestoVentasPunVens(new ArrayList<PresupuestoVentasPunVen>());					
							presupuestoventaspunvenLogic.getPresupuestoVentasPunVens().addAll(presupuestoventaspunvensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presupuestoventaspunvens=new ArrayList<PresupuestoVentasPunVen>();
							presupuestoventaspunvens.addAll(presupuestoventaspunvensAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idPresupuestoVentasPunVen=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idPresupuestoVentasPunVen=this.idActual;
				
				} else if(this.idPresupuestoVentasPunVenActual!=null && this.idPresupuestoVentasPunVenActual!=0L) {
					idPresupuestoVentasPunVen=idPresupuestoVentasPunVenActual;
				}
				
					
				this.sDetalleReporte=PresupuestoVentasPunVenConstantesFunciones.getDetalleIndicePorId(idPresupuestoVentasPunVen);
				
				this.presupuestoventaspunvens=new ArrayList<PresupuestoVentasPunVen>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					presupuestoventaspunvenLogic.getEntity(idPresupuestoVentasPunVen);
					
					//presupuestoventaspunvenLogic.getEntityWithConnection(idPresupuestoVentasPunVen);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					presupuestoventaspunvenLogic.setPresupuestoVentasPunVens(new ArrayList<PresupuestoVentasPunVen>());
					presupuestoventaspunvenLogic.getPresupuestoVentasPunVens().add(presupuestoventaspunvenLogic.getPresupuestoVentasPunVen());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.presupuestoventaspunvens=new ArrayList<PresupuestoVentasPunVen>();
					this.presupuestoventaspunvens.add(presupuestoventaspunven);
				}
				
				if(presupuestoventaspunvenLogic.getPresupuestoVentasPunVen()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdCaja")) {
				this.sDetalleReporte=PresupuestoVentasPunVenConstantesFunciones.getDetalleIndiceFK_IdCaja(id_cajaFK_IdCaja);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					presupuestoventaspunvenLogic.getPresupuestoVentasPunVensFK_IdCaja(finalQueryGlobal,pagination,id_cajaFK_IdCaja);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresupuestoVentasPunVenConstantesFunciones.getDetalleIndiceFK_IdCaja(id_cajaFK_IdCaja);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresupuestoVentasPunVenConstantesFunciones.getDetalleIndiceFK_IdCaja(id_cajaFK_IdCaja);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=presupuestoventaspunvenLogic.getPresupuestoVentasPunVens()==null||presupuestoventaspunvenLogic.getPresupuestoVentasPunVens().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=presupuestoventaspunvens==null|| presupuestoventaspunvens.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						presupuestoventaspunvensAux=new ArrayList<PresupuestoVentasPunVen>();
						presupuestoventaspunvensAux.addAll(presupuestoventaspunvenLogic.getPresupuestoVentasPunVens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presupuestoventaspunvensAux=new ArrayList<PresupuestoVentasPunVen>();
							presupuestoventaspunvensAux.addAll(presupuestoventaspunvens);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							presupuestoventaspunvenLogic.getPresupuestoVentasPunVensFK_IdCaja(finalQueryGlobal,pagination,id_cajaFK_IdCaja);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresupuestoVentasPunVenConstantesFunciones.getDetalleIndiceFK_IdCaja(id_cajaFK_IdCaja);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresupuestoVentasPunVenConstantesFunciones.getDetalleIndiceFK_IdCaja(id_cajaFK_IdCaja);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePresupuestoVentasPunVens("FK_IdCaja",presupuestoventaspunvenLogic.getPresupuestoVentasPunVens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePresupuestoVentasPunVens("FK_IdCaja",presupuestoventaspunvens);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						presupuestoventaspunvenLogic.setPresupuestoVentasPunVens(new ArrayList<PresupuestoVentasPunVen>());
						presupuestoventaspunvenLogic.getPresupuestoVentasPunVens().addAll(presupuestoventaspunvensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presupuestoventaspunvens=new ArrayList<PresupuestoVentasPunVen>();
							presupuestoventaspunvens.addAll(presupuestoventaspunvensAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEjercicio")) {
				this.sDetalleReporte=PresupuestoVentasPunVenConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					presupuestoventaspunvenLogic.getPresupuestoVentasPunVensFK_IdEjercicio(finalQueryGlobal,pagination,id_ejercicioFK_IdEjercicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresupuestoVentasPunVenConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresupuestoVentasPunVenConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=presupuestoventaspunvenLogic.getPresupuestoVentasPunVens()==null||presupuestoventaspunvenLogic.getPresupuestoVentasPunVens().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=presupuestoventaspunvens==null|| presupuestoventaspunvens.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						presupuestoventaspunvensAux=new ArrayList<PresupuestoVentasPunVen>();
						presupuestoventaspunvensAux.addAll(presupuestoventaspunvenLogic.getPresupuestoVentasPunVens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presupuestoventaspunvensAux=new ArrayList<PresupuestoVentasPunVen>();
							presupuestoventaspunvensAux.addAll(presupuestoventaspunvens);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							presupuestoventaspunvenLogic.getPresupuestoVentasPunVensFK_IdEjercicio(finalQueryGlobal,pagination,id_ejercicioFK_IdEjercicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresupuestoVentasPunVenConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresupuestoVentasPunVenConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePresupuestoVentasPunVens("FK_IdEjercicio",presupuestoventaspunvenLogic.getPresupuestoVentasPunVens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePresupuestoVentasPunVens("FK_IdEjercicio",presupuestoventaspunvens);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						presupuestoventaspunvenLogic.setPresupuestoVentasPunVens(new ArrayList<PresupuestoVentasPunVen>());
						presupuestoventaspunvenLogic.getPresupuestoVentasPunVens().addAll(presupuestoventaspunvensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presupuestoventaspunvens=new ArrayList<PresupuestoVentasPunVen>();
							presupuestoventaspunvens.addAll(presupuestoventaspunvensAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=PresupuestoVentasPunVenConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					presupuestoventaspunvenLogic.getPresupuestoVentasPunVensFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresupuestoVentasPunVenConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresupuestoVentasPunVenConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=presupuestoventaspunvenLogic.getPresupuestoVentasPunVens()==null||presupuestoventaspunvenLogic.getPresupuestoVentasPunVens().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=presupuestoventaspunvens==null|| presupuestoventaspunvens.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						presupuestoventaspunvensAux=new ArrayList<PresupuestoVentasPunVen>();
						presupuestoventaspunvensAux.addAll(presupuestoventaspunvenLogic.getPresupuestoVentasPunVens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presupuestoventaspunvensAux=new ArrayList<PresupuestoVentasPunVen>();
							presupuestoventaspunvensAux.addAll(presupuestoventaspunvens);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							presupuestoventaspunvenLogic.getPresupuestoVentasPunVensFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresupuestoVentasPunVenConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresupuestoVentasPunVenConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePresupuestoVentasPunVens("FK_IdEmpresa",presupuestoventaspunvenLogic.getPresupuestoVentasPunVens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePresupuestoVentasPunVens("FK_IdEmpresa",presupuestoventaspunvens);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						presupuestoventaspunvenLogic.setPresupuestoVentasPunVens(new ArrayList<PresupuestoVentasPunVen>());
						presupuestoventaspunvenLogic.getPresupuestoVentasPunVens().addAll(presupuestoventaspunvensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presupuestoventaspunvens=new ArrayList<PresupuestoVentasPunVen>();
							presupuestoventaspunvens.addAll(presupuestoventaspunvensAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdPeriodo")) {
				this.sDetalleReporte=PresupuestoVentasPunVenConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					presupuestoventaspunvenLogic.getPresupuestoVentasPunVensFK_IdPeriodo(finalQueryGlobal,pagination,id_periodoFK_IdPeriodo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresupuestoVentasPunVenConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresupuestoVentasPunVenConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=presupuestoventaspunvenLogic.getPresupuestoVentasPunVens()==null||presupuestoventaspunvenLogic.getPresupuestoVentasPunVens().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=presupuestoventaspunvens==null|| presupuestoventaspunvens.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						presupuestoventaspunvensAux=new ArrayList<PresupuestoVentasPunVen>();
						presupuestoventaspunvensAux.addAll(presupuestoventaspunvenLogic.getPresupuestoVentasPunVens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presupuestoventaspunvensAux=new ArrayList<PresupuestoVentasPunVen>();
							presupuestoventaspunvensAux.addAll(presupuestoventaspunvens);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							presupuestoventaspunvenLogic.getPresupuestoVentasPunVensFK_IdPeriodo(finalQueryGlobal,pagination,id_periodoFK_IdPeriodo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresupuestoVentasPunVenConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresupuestoVentasPunVenConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePresupuestoVentasPunVens("FK_IdPeriodo",presupuestoventaspunvenLogic.getPresupuestoVentasPunVens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePresupuestoVentasPunVens("FK_IdPeriodo",presupuestoventaspunvens);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						presupuestoventaspunvenLogic.setPresupuestoVentasPunVens(new ArrayList<PresupuestoVentasPunVen>());
						presupuestoventaspunvenLogic.getPresupuestoVentasPunVens().addAll(presupuestoventaspunvensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presupuestoventaspunvens=new ArrayList<PresupuestoVentasPunVen>();
							presupuestoventaspunvens.addAll(presupuestoventaspunvensAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=PresupuestoVentasPunVenConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					presupuestoventaspunvenLogic.getPresupuestoVentasPunVensFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresupuestoVentasPunVenConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresupuestoVentasPunVenConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=presupuestoventaspunvenLogic.getPresupuestoVentasPunVens()==null||presupuestoventaspunvenLogic.getPresupuestoVentasPunVens().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=presupuestoventaspunvens==null|| presupuestoventaspunvens.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						presupuestoventaspunvensAux=new ArrayList<PresupuestoVentasPunVen>();
						presupuestoventaspunvensAux.addAll(presupuestoventaspunvenLogic.getPresupuestoVentasPunVens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presupuestoventaspunvensAux=new ArrayList<PresupuestoVentasPunVen>();
							presupuestoventaspunvensAux.addAll(presupuestoventaspunvens);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							presupuestoventaspunvenLogic.getPresupuestoVentasPunVensFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresupuestoVentasPunVenConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresupuestoVentasPunVenConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePresupuestoVentasPunVens("FK_IdSucursal",presupuestoventaspunvenLogic.getPresupuestoVentasPunVens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePresupuestoVentasPunVens("FK_IdSucursal",presupuestoventaspunvens);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						presupuestoventaspunvenLogic.setPresupuestoVentasPunVens(new ArrayList<PresupuestoVentasPunVen>());
						presupuestoventaspunvenLogic.getPresupuestoVentasPunVens().addAll(presupuestoventaspunvensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presupuestoventaspunvens=new ArrayList<PresupuestoVentasPunVen>();
							presupuestoventaspunvens.addAll(presupuestoventaspunvensAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesPresupuestoVentasPunVen();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessPresupuestoVentasPunVen();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=presupuestoventaspunvenLogic.getPresupuestoVentasPunVens().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=presupuestoventaspunvens.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=presupuestoventaspunvenLogic.getPresupuestoVentasPunVens().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=presupuestoventaspunvens.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(PresupuestoVentasPunVen presupuestoventaspunven) {
		Boolean permite=true;
		
		if(this.presupuestoventaspunven.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=PresupuestoVentasPunVenConstantesFunciones.getOrderByListaPresupuestoVentasPunVen();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=PresupuestoVentasPunVenConstantesFunciones.getOrderByListaPresupuestoVentasPunVen();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PresupuestoVentasPunVen presupuestoventaspunven:presupuestoventaspunvenLogic.getPresupuestoVentasPunVens()) {
				if(presupuestoventaspunven.getsType().equals(Constantes2.S_TOTALES)) {
					presupuestoventaspunvenTotales=presupuestoventaspunven;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PresupuestoVentasPunVen presupuestoventaspunven:this.presupuestoventaspunvens) {
				if(presupuestoventaspunven.getsType().equals(Constantes2.S_TOTALES)) {
					presupuestoventaspunvenTotales=presupuestoventaspunven;
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
			this.presupuestoventaspunvenAux=new PresupuestoVentasPunVen();
			this.presupuestoventaspunvenAux.setsType(Constantes2.S_TOTALES);
			this.presupuestoventaspunvenAux.setIsNew(false);
			this.presupuestoventaspunvenAux.setIsChanged(false);
			this.presupuestoventaspunvenAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				PresupuestoVentasPunVenConstantesFunciones.TotalizarValoresFilaPresupuestoVentasPunVen(this.presupuestoventaspunvenLogic.getPresupuestoVentasPunVens(),this.presupuestoventaspunvenAux);
				
				this.presupuestoventaspunvenLogic.getPresupuestoVentasPunVens().add(this.presupuestoventaspunvenAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				PresupuestoVentasPunVenConstantesFunciones.TotalizarValoresFilaPresupuestoVentasPunVen(this.presupuestoventaspunvens,this.presupuestoventaspunvenAux);
				
				this.presupuestoventaspunvens.add(this.presupuestoventaspunvenAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		presupuestoventaspunvenTotales=new PresupuestoVentasPunVen();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.presupuestoventaspunvenLogic.getPresupuestoVentasPunVens().remove(presupuestoventaspunvenTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.presupuestoventaspunvens.remove(presupuestoventaspunvenTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		presupuestoventaspunvenTotales=new PresupuestoVentasPunVen();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PresupuestoVentasPunVen presupuestoventaspunven:presupuestoventaspunvenLogic.getPresupuestoVentasPunVens()) {
				if(presupuestoventaspunven.getsType().equals(Constantes2.S_TOTALES)) {
					presupuestoventaspunvenTotales=presupuestoventaspunven;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PresupuestoVentasPunVenConstantesFunciones.TotalizarValoresFilaPresupuestoVentasPunVen(this.presupuestoventaspunvenLogic.getPresupuestoVentasPunVens(),presupuestoventaspunvenTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PresupuestoVentasPunVen presupuestoventaspunven:this.presupuestoventaspunvens) {
				if(presupuestoventaspunven.getsType().equals(Constantes2.S_TOTALES)) {
					presupuestoventaspunvenTotales=presupuestoventaspunven;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PresupuestoVentasPunVenConstantesFunciones.TotalizarValoresFilaPresupuestoVentasPunVen(this.presupuestoventaspunvens,presupuestoventaspunvenTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getPresupuestoVentasPunVensFK_IdCaja()throws Exception {
		try {
			sAccionBusqueda="FK_IdCaja";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPresupuestoVentasPunVensFK_IdEjercicio()throws Exception {
		try {
			sAccionBusqueda="FK_IdEjercicio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPresupuestoVentasPunVensFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPresupuestoVentasPunVensFK_IdPeriodo()throws Exception {
		try {
			sAccionBusqueda="FK_IdPeriodo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPresupuestoVentasPunVensFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getPresupuestoVentasPunVensFK_IdCaja(String sFinalQuery,Long id_caja)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					presupuestoventaspunvenLogic.getPresupuestoVentasPunVensFK_IdCaja(sFinalQuery,this.pagination,id_caja);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPresupuestoVentasPunVensFK_IdEjercicio(String sFinalQuery,Long id_ejercicio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					presupuestoventaspunvenLogic.getPresupuestoVentasPunVensFK_IdEjercicio(sFinalQuery,this.pagination,id_ejercicio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPresupuestoVentasPunVensFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					presupuestoventaspunvenLogic.getPresupuestoVentasPunVensFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPresupuestoVentasPunVensFK_IdPeriodo(String sFinalQuery,Long id_periodo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					presupuestoventaspunvenLogic.getPresupuestoVentasPunVensFK_IdPeriodo(sFinalQuery,this.pagination,id_periodo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPresupuestoVentasPunVensFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					presupuestoventaspunvenLogic.getPresupuestoVentasPunVensFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosPresupuestoVentasPunVen() {
		this.isPermisoTodoPresupuestoVentasPunVen=false;
		this.isPermisoNuevoPresupuestoVentasPunVen=false;
		this.isPermisoActualizarPresupuestoVentasPunVen=false;
		this.isPermisoActualizarOriginalPresupuestoVentasPunVen=false;
		this.isPermisoEliminarPresupuestoVentasPunVen=false;
		this.isPermisoGuardarCambiosPresupuestoVentasPunVen=false;
		this.isPermisoConsultaPresupuestoVentasPunVen=false;
		this.isPermisoBusquedaPresupuestoVentasPunVen=false;
		this.isPermisoReportePresupuestoVentasPunVen=false;		
		this.isPermisoOrdenPresupuestoVentasPunVen=false;		
		this.isPermisoPaginacionMedioPresupuestoVentasPunVen=false;		
		this.isPermisoPaginacionAltoPresupuestoVentasPunVen=false;
		this.isPermisoPaginacionTodoPresupuestoVentasPunVen=false;
		this.isPermisoCopiarPresupuestoVentasPunVen=false;		
		this.isPermisoVerFormPresupuestoVentasPunVen=false;		
		this.isPermisoDuplicarPresupuestoVentasPunVen=false;		
		this.isPermisoOrdenPresupuestoVentasPunVen=false;		
	}
	
	public void setPermisosUsuarioPresupuestoVentasPunVen(Boolean isPermiso) {
		this.isPermisoTodoPresupuestoVentasPunVen=isPermiso;
		this.isPermisoNuevoPresupuestoVentasPunVen=isPermiso;
		this.isPermisoActualizarPresupuestoVentasPunVen=isPermiso;
		this.isPermisoActualizarOriginalPresupuestoVentasPunVen=isPermiso;
		this.isPermisoEliminarPresupuestoVentasPunVen=isPermiso;
		this.isPermisoGuardarCambiosPresupuestoVentasPunVen=isPermiso;
		this.isPermisoConsultaPresupuestoVentasPunVen=isPermiso;
		this.isPermisoBusquedaPresupuestoVentasPunVen=isPermiso;
		this.isPermisoReportePresupuestoVentasPunVen=isPermiso;
		this.isPermisoOrdenPresupuestoVentasPunVen=isPermiso;		
		this.isPermisoPaginacionMedioPresupuestoVentasPunVen=isPermiso;		
		this.isPermisoPaginacionAltoPresupuestoVentasPunVen=isPermiso;		
		this.isPermisoPaginacionTodoPresupuestoVentasPunVen=isPermiso;		
		this.isPermisoCopiarPresupuestoVentasPunVen=isPermiso;		
		this.isPermisoVerFormPresupuestoVentasPunVen=isPermiso;		
		this.isPermisoDuplicarPresupuestoVentasPunVen=isPermiso;
		this.isPermisoOrdenPresupuestoVentasPunVen=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioPresupuestoVentasPunVen(Boolean isPermiso) {
		//this.isPermisoTodoPresupuestoVentasPunVen=isPermiso;
		this.isPermisoNuevoPresupuestoVentasPunVen=isPermiso;
		this.isPermisoActualizarPresupuestoVentasPunVen=isPermiso;
		this.isPermisoActualizarOriginalPresupuestoVentasPunVen=isPermiso;
		this.isPermisoEliminarPresupuestoVentasPunVen=isPermiso;
		this.isPermisoGuardarCambiosPresupuestoVentasPunVen=isPermiso;
		//this.isPermisoConsultaPresupuestoVentasPunVen=isPermiso;
		//this.isPermisoBusquedaPresupuestoVentasPunVen=isPermiso;
		//this.isPermisoReportePresupuestoVentasPunVen=isPermiso;
		//this.isPermisoOrdenPresupuestoVentasPunVen=isPermiso;		
		//this.isPermisoPaginacionMedioPresupuestoVentasPunVen=isPermiso;		
		//this.isPermisoPaginacionAltoPresupuestoVentasPunVen=isPermiso;		
		//this.isPermisoPaginacionTodoPresupuestoVentasPunVen=isPermiso;		
		//this.isPermisoCopiarPresupuestoVentasPunVen=isPermiso;		
		//this.isPermisoDuplicarPresupuestoVentasPunVen=isPermiso;
		//this.isPermisoOrdenPresupuestoVentasPunVen=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioPresupuestoVentasPunVenClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(PresupuestoVentasPunVenJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebPresupuestoVentasPunVen(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioPresupuestoVentasPunVenClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioPresupuestoVentasPunVenClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionPresupuestoVentasPunVenClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioPresupuestoVentasPunVenClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioPresupuestoVentasPunVen() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(PresupuestoVentasPunVenJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, PresupuestoVentasPunVenConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoPresupuestoVentasPunVen=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarPresupuestoVentasPunVen=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalPresupuestoVentasPunVen=this.isPermisoActualizarPresupuestoVentasPunVen;
			this.isPermisoEliminarPresupuestoVentasPunVen=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosPresupuestoVentasPunVen=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaPresupuestoVentasPunVen=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaPresupuestoVentasPunVen=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoPresupuestoVentasPunVen=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReportePresupuestoVentasPunVen=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPresupuestoVentasPunVen=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioPresupuestoVentasPunVen=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoPresupuestoVentasPunVen=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoPresupuestoVentasPunVen=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarPresupuestoVentasPunVen=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormPresupuestoVentasPunVen=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarPresupuestoVentasPunVen=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPresupuestoVentasPunVen=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosPresupuestoVentasPunVen.setToolTipText(this.jTableDatosPresupuestoVentasPunVen.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioPresupuestoVentasPunVen(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioPresupuestoVentasPunVen(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(PresupuestoVentasPunVenJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(PresupuestoVentasPunVenJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioPresupuestoVentasPunVen() throws Exception {
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
	public void inicializarCombosForeignKeyPresupuestoVentasPunVenListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.ejerciciosForeignKey=new ArrayList();
				this.periodosForeignKey=new ArrayList();
				this.cajasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyPresupuestoVentasPunVenListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(PresupuestoVentasPunVenJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyPresupuestoVentasPunVenListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEjercicioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyPeriodoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCajaListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyCajaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.cajasForeignKey==null||this.cajasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=CajaConstantesFunciones.getArrayColumnasGlobalesCaja(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CajaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=CajaConstantesFunciones.SFINALQUERY;

				this.cargarCombosCajasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyPresupuestoVentasPunVenListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			PresupuestoVentasPunVenParameterReturnGeneral presupuestoventaspunvenReturnGeneral=new PresupuestoVentasPunVenParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.presupuestoventaspunvenConstantesFunciones.cargarid_empresaPresupuestoVentasPunVen)
					 || (this.esRecargarFks && this.presupuestoventaspunvenConstantesFunciones.cargarid_empresaPresupuestoVentasPunVen)) {

					if(!this.presupuestoventaspunvenSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+presupuestoventaspunvenSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.presupuestoventaspunvenConstantesFunciones.cargarid_sucursalPresupuestoVentasPunVen)
					 || (this.esRecargarFks && this.presupuestoventaspunvenConstantesFunciones.cargarid_sucursalPresupuestoVentasPunVen)) {

					if(!this.presupuestoventaspunvenSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+presupuestoventaspunvenSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalEjercicio="";

				if(((this.ejerciciosForeignKey==null||this.ejerciciosForeignKey.size()<=0) && this.presupuestoventaspunvenConstantesFunciones.cargarid_ejercicioPresupuestoVentasPunVen)
					 || (this.esRecargarFks && this.presupuestoventaspunvenConstantesFunciones.cargarid_ejercicioPresupuestoVentasPunVen)) {

					if(!this.presupuestoventaspunvenSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EjercicioConstantesFunciones.getArrayColumnasGlobalesEjercicio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEjercicio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EjercicioConstantesFunciones.TABLENAME);

						finalQueryGlobalEjercicio=Funciones.GetFinalQueryAppend(finalQueryGlobalEjercicio, "");
						finalQueryGlobalEjercicio+=EjercicioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEjerciciosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEjercicio=" WHERE " + ConstantesSql.ID + "="+presupuestoventaspunvenSessionBean.getlidEjercicioActual();
					}
				} else {
					finalQueryGlobalEjercicio="NONE";
				}


				String finalQueryGlobalPeriodo="";

				if(((this.periodosForeignKey==null||this.periodosForeignKey.size()<=0) && this.presupuestoventaspunvenConstantesFunciones.cargarid_periodoPresupuestoVentasPunVen)
					 || (this.esRecargarFks && this.presupuestoventaspunvenConstantesFunciones.cargarid_periodoPresupuestoVentasPunVen)) {

					if(!this.presupuestoventaspunvenSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PeriodoConstantesFunciones.getArrayColumnasGlobalesPeriodo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPeriodo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PeriodoConstantesFunciones.TABLENAME);

						finalQueryGlobalPeriodo=Funciones.GetFinalQueryAppend(finalQueryGlobalPeriodo, "");
						finalQueryGlobalPeriodo+=PeriodoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPeriodosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPeriodo=" WHERE " + ConstantesSql.ID + "="+presupuestoventaspunvenSessionBean.getlidPeriodoActual();
					}
				} else {
					finalQueryGlobalPeriodo="NONE";
				}


				String finalQueryGlobalCaja="";

				if(((this.cajasForeignKey==null||this.cajasForeignKey.size()<=0) && this.presupuestoventaspunvenConstantesFunciones.cargarid_cajaPresupuestoVentasPunVen)
					 || (this.esRecargarFks && this.presupuestoventaspunvenConstantesFunciones.cargarid_cajaPresupuestoVentasPunVen)) {

					if(!this.presupuestoventaspunvenSessionBean.getisBusquedaDesdeForeignKeySesionCaja()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=CajaConstantesFunciones.getArrayColumnasGlobalesCaja(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCaja=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CajaConstantesFunciones.TABLENAME);

						finalQueryGlobalCaja=Funciones.GetFinalQueryAppend(finalQueryGlobalCaja, "");
						finalQueryGlobalCaja+=CajaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCajasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCaja=" WHERE " + ConstantesSql.ID + "="+presupuestoventaspunvenSessionBean.getlidCajaActual();
					}
				} else {
					finalQueryGlobalCaja="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				presupuestoventaspunvenReturnGeneral=presupuestoventaspunvenLogic.cargarCombosLoteForeignKeyPresupuestoVentasPunVen(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalEjercicio,finalQueryGlobalPeriodo,finalQueryGlobalCaja);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=presupuestoventaspunvenReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=presupuestoventaspunvenReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalEjercicio.equals("NONE")) {
				this.ejerciciosForeignKey=presupuestoventaspunvenReturnGeneral.getejerciciosForeignKey();
			}

			if(!finalQueryGlobalPeriodo.equals("NONE")) {
				this.periodosForeignKey=presupuestoventaspunvenReturnGeneral.getperiodosForeignKey();
			}

			if(!finalQueryGlobalCaja.equals("NONE")) {
				this.cajasForeignKey=presupuestoventaspunvenReturnGeneral.getcajasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyPresupuestoVentasPunVen()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyEjercicio();
			this.addItemDefectoCombosForeignKeyPeriodo();
			this.addItemDefectoCombosForeignKeyCaja();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.presupuestoventaspunvenSessionBean==null) {
				this.presupuestoventaspunvenSessionBean=new PresupuestoVentasPunVenSessionBean();
			}

			if(!this.presupuestoventaspunvenSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.presupuestoventaspunvenSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

			if(!this.presupuestoventaspunvenSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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

			if(!this.presupuestoventaspunvenSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
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

	public void addItemDefectoCombosForeignKeyCaja()throws Exception {
		try {

			if(!this.presupuestoventaspunvenSessionBean.getisBusquedaDesdeForeignKeySesionCaja()) {
				Caja caja=new Caja();
				CajaConstantesFunciones.setCajaDescripcion(caja,Constantes.SMENSAJE_ESCOJA_OPCION);
				caja.setId(null);

				if(!CajaConstantesFunciones.ExisteEnLista(this.cajasForeignKey,caja,true)) {

					this.cajasForeignKey.add(0,caja);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyPresupuestoVentasPunVen()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyPresupuestoVentasPunVen(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyPresupuestoVentasPunVen()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
				this.setActualEjercicioForeignKey(this.parametroGeneralUsuario.getid_ejercicio(),false,"Formulario");
				this.setActualPeriodoForeignKey(this.parametroGeneralUsuario.getid_periodo(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyPresupuestoVentasPunVen();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyPresupuestoVentasPunVen(PresupuestoVentasPunVen presupuestoventaspunven)throws Exception {	
		try {
			
			this.setActualCajaForeignKey(presupuestoventaspunven.getid_caja(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyPresupuestoVentasPunVen(PresupuestoVentasPunVen presupuestoventaspunven,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyPresupuestoVentasPunVen()throws Exception {	
		try {
			
			this.setActualCajaForeignKey(this.presupuestoventaspunvenConstantesFunciones.getid_caja(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyPresupuestoVentasPunVen()throws Exception {	
		try {
			

				if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen!=null) {
					Ejercicio ejercicioActual=(Ejercicio)this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxid_ejercicioPresupuestoVentasPunVen.getSelectedItem();
				}

				if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen!=null) {
					Periodo periodoActual=(Periodo)this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxid_periodoPresupuestoVentasPunVen.getSelectedItem();
				}
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyPresupuestoVentasPunVen()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyPresupuestoVentasPunVen()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroPresupuestoVentasPunVen()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyPresupuestoVentasPunVen()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameEjerciciosForeignKey("Todos");
			this.cargarCombosFramePeriodosForeignKey("Todos");
			this.cargarCombosFrameCajasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyPresupuestoVentasPunVen(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEjerciciosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFramePeriodosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCajasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyPresupuestoVentasPunVen()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxid_empresaPresupuestoVentasPunVen!=null && this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxid_empresaPresupuestoVentasPunVen.getItemCount()>0) {
				this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxid_empresaPresupuestoVentasPunVen.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxid_sucursalPresupuestoVentasPunVen!=null && this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxid_sucursalPresupuestoVentasPunVen.getItemCount()>0) {
				this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxid_sucursalPresupuestoVentasPunVen.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxid_ejercicioPresupuestoVentasPunVen!=null && this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxid_ejercicioPresupuestoVentasPunVen.getItemCount()>0) {
				this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxid_ejercicioPresupuestoVentasPunVen.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxid_periodoPresupuestoVentasPunVen!=null && this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxid_periodoPresupuestoVentasPunVen.getItemCount()>0) {
				this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxid_periodoPresupuestoVentasPunVen.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxid_cajaPresupuestoVentasPunVen!=null && this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxid_cajaPresupuestoVentasPunVen.getItemCount()>0) {
				this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxid_cajaPresupuestoVentasPunVen.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	










	
	

	public PresupuestoVentasPunVenBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public PresupuestoVentasPunVenBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public PresupuestoVentasPunVenBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.presupuestoventaspunvenSessionBean=new PresupuestoVentasPunVenSessionBean(); 
		this.presupuestoventaspunvenConstantesFunciones=new PresupuestoVentasPunVenConstantesFunciones(); 
		this.presupuestoventaspunvenBean=new PresupuestoVentasPunVen();//(this.presupuestoventaspunvenConstantesFunciones); 		
		this.presupuestoventaspunvenReturnGeneral=new PresupuestoVentasPunVenParameterReturnGeneral(); 
		
		this.presupuestoventaspunvenSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.presupuestoventaspunvenSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public PresupuestoVentasPunVenBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public PresupuestoVentasPunVenBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public PresupuestoVentasPunVenBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessPresupuestoVentasPunVen(true);
			
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
			
			this.presupuestoventaspunvenConstantesFunciones=new PresupuestoVentasPunVenConstantesFunciones(); 
			this.presupuestoventaspunvenBean=new PresupuestoVentasPunVen();//this.presupuestoventaspunvenConstantesFunciones); 			
			this.presupuestoventaspunvenReturnGeneral=new PresupuestoVentasPunVenParameterReturnGeneral(); 
		
			PresupuestoVentasPunVenBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Presupuesto Ventas Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.presupuestoventaspunven=new PresupuestoVentasPunVen();
			this.presupuestoventaspunvens = new ArrayList<PresupuestoVentasPunVen>();
			this.presupuestoventaspunvensAux = new ArrayList<PresupuestoVentasPunVen>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventaspunvenLogic=new PresupuestoVentasPunVenLogic();
				this.presupuestoventaspunvenLogic.getNewConnexionToDeep("");
			}
			
			//this.presupuestoventaspunvenSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.presupuestoventaspunvenSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormPresupuestoVentasPunVen);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoPresupuestoVentasPunVen!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPresupuestoVentasPunVen);	
					}
					
					if(this.jInternalFrameImportacionPresupuestoVentasPunVen!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPresupuestoVentasPunVen);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByPresupuestoVentasPunVen!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByPresupuestoVentasPunVen);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormPresupuestoVentasPunVen);
				this.jInternalFrameDetalleFormPresupuestoVentasPunVen.setVisible(false);
				this.jInternalFrameDetalleFormPresupuestoVentasPunVen.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoPresupuestoVentasPunVen!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPresupuestoVentasPunVen);
					this.jInternalFrameReporteDinamicoPresupuestoVentasPunVen.setVisible(false);
					this.jInternalFrameReporteDinamicoPresupuestoVentasPunVen.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionPresupuestoVentasPunVen!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionPresupuestoVentasPunVen);
					this.jInternalFrameImportacionPresupuestoVentasPunVen.setVisible(false);
					this.jInternalFrameImportacionPresupuestoVentasPunVen.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByPresupuestoVentasPunVen!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByPresupuestoVentasPunVen);
					this.jInternalFrameOrderByPresupuestoVentasPunVen.setVisible(false);
					this.jInternalFrameOrderByPresupuestoVentasPunVen.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idPresupuestoVentasPunVenActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=PresupuestoVentasPunVenConstantesFunciones.INUMEROPAGINACION;
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
			
			this.presupuestoventaspunvenReturnGeneral=new PresupuestoVentasPunVenParameterReturnGeneral();
			
			this.presupuestoventaspunvenParameterGeneral=new PresupuestoVentasPunVenParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.presupuestoventaspunvenLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado()) {
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
			
			if(PresupuestoVentasPunVenJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PresupuestoVentasPunVenConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado(),this.presupuestoventaspunvenSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PresupuestoVentasPunVenConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado(),this.presupuestoventaspunvenSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoPresupuestoVentasPunVen=false;
			this.isVisibilidadCeldaDuplicarPresupuestoVentasPunVen=true;
			this.isVisibilidadCeldaCopiarPresupuestoVentasPunVen=true;
			this.isVisibilidadCeldaVerFormPresupuestoVentasPunVen=true;
			this.isVisibilidadCeldaOrdenPresupuestoVentasPunVen=true;
			this.isVisibilidadCeldaNuevoRelacionesPresupuestoVentasPunVen=false;
			this.isVisibilidadCeldaModificarPresupuestoVentasPunVen=false;
			this.isVisibilidadCeldaActualizarPresupuestoVentasPunVen=false;
			this.isVisibilidadCeldaEliminarPresupuestoVentasPunVen=false;
			this.isVisibilidadCeldaCancelarPresupuestoVentasPunVen=false;
			this.isVisibilidadCeldaGuardarPresupuestoVentasPunVen=false;
			this.isVisibilidadCeldaGuardarCambiosPresupuestoVentasPunVen=false;
			
			
			this.isVisibilidadFK_IdCaja=true;
			this.isVisibilidadFK_IdEjercicio=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdPeriodo=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesPresupuestoVentasPunVen("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosPresupuestoVentasPunVen();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioPresupuestoVentasPunVen(false);
			
			this.setPermisosUsuarioPresupuestoVentasPunVen();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado() 
				|| (this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado() && this.presupuestoventaspunvenSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioPresupuestoVentasPunVenClasesRelacionadas();
			}
			
			if(this.presupuestoventaspunvenSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioPresupuestoVentasPunVenClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!PresupuestoVentasPunVenJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosPresupuestoVentasPunVen();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualPresupuestoVentasPunVen();
			}
			
			if(!this.isPermisoBusquedaPresupuestoVentasPunVen) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasPresupuestoVentasPunVen.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioPresupuestoVentasPunVen,this.isPermisoPaginacionMedioPresupuestoVentasPunVen,this.isPermisoPaginacionTodoPresupuestoVentasPunVen);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(PresupuestoVentasPunVenConstantesFunciones.getTiposSeleccionarPresupuestoVentasPunVen());
				
				this.tiposColumnasSelect=PresupuestoVentasPunVenConstantesFunciones.getTiposSeleccionarPresupuestoVentasPunVen(true);
				
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
			//if(!this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioPresupuestoVentasPunVen();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioPresupuestoVentasPunVen(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioPresupuestoVentasPunVen(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesPresupuestoVentasPunVen() ;
			
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
			this.cajaLogic=new CajaLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				presupuestoventaspunvenImplementable= (PresupuestoVentasPunVenImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PresupuestoVentasPunVenConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				presupuestoventaspunvenImplementableHome= (PresupuestoVentasPunVenImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PresupuestoVentasPunVenConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.presupuestoventaspunvens= new ArrayList<PresupuestoVentasPunVen>();
			this.presupuestoventaspunvensEliminados= new ArrayList<PresupuestoVentasPunVen>();
						
			this.isEsNuevoPresupuestoVentasPunVen=false;
			this.esParaAccionDesdeFormularioPresupuestoVentasPunVen=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>() ;
			this.periodosForeignKey=new ArrayList<Periodo>() ;
			this.cajasForeignKey=new ArrayList<Caja>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyPresupuestoVentasPunVen(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroPresupuestoVentasPunVen();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			PresupuestoVentasPunVenBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=PresupuestoVentasPunVenConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesPresupuestoVentasPunVen("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingPresupuestoVentasPunVen(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioPresupuestoVentasPunVen();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioPresupuestoVentasPunVen();
			}
			
			PresupuestoVentasPunVenBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasPresupuestoVentasPunVen.getTabCount(); i++) {
					this.jTabbedPaneBusquedasPresupuestoVentasPunVen.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasPresupuestoVentasPunVen.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventaspunvenLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessPresupuestoVentasPunVen(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga PresupuestoVentasPunVen: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventaspunvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventaspunvenLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectPresupuestoVentasPunVen() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesPresupuestoVentasPunVen")) {
				iIndex=this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jTabbedPaneRelacionesPresupuestoVentasPunVen.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jTabbedPaneRelacionesPresupuestoVentasPunVen.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosPresupuestoVentasPunVen.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessPresupuestoVentasPunVen();	
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
	
	public void cargarCombosForeignKeyPresupuestoVentasPunVen(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyPresupuestoVentasPunVen(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyPresupuestoVentasPunVen(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyPresupuestoVentasPunVenListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyPresupuestoVentasPunVen();
		
		this.cargarCombosFrameForeignKeyPresupuestoVentasPunVen();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyPresupuestoVentasPunVen();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyPresupuestoVentasPunVen();
		}
	}
	
	

	public void cargarCombosForeignKeyCaja(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyCajaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCaja();
				this.cargarCombosFrameCajasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCaja(this.cajasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoPresupuestoVentasPunVenActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.presupuestoventaspunvenSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			PresupuestoVentasPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.presupuestoventaspunven,new Object(),this.presupuestoventaspunvenParameterGeneral,this.presupuestoventaspunvenReturnGeneral);
			
			
			if(jTableDatosPresupuestoVentasPunVen.getRowCount()>=1) {
				jTableDatosPresupuestoVentasPunVen.removeRowSelectionInterval(0, jTableDatosPresupuestoVentasPunVen.getRowCount()-1);						
			}
			
			this.isEsNuevoPresupuestoVentasPunVen=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoPresupuestoVentasPunVen(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesPresupuestoVentasPunVen(true);			
			//this.presupuestoventaspunven=new PresupuestoVentasPunVen();
			//this.presupuestoventaspunven.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPresupuestoVentasPunVen(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPresupuestoVentasPunVen() ;
			
			if(PresupuestoVentasPunVenJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePresupuestoVentasPunVen(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.presupuestoventaspunven);	
			this.actualizarInformacion("INFO_PADRE",false,this.presupuestoventaspunven);				
			
			PresupuestoVentasPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.presupuestoventaspunven,new Object(),this.presupuestoventaspunvenParameterGeneral,this.presupuestoventaspunvenReturnGeneral);
			
			if(this.presupuestoventaspunvenSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar PresupuestoVentasPunVen: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			PresupuestoVentasPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.presupuestoventaspunven,new Object(),this.presupuestoventaspunvenParameterGeneral,this.presupuestoventaspunvenReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarPresupuestoVentasPunVenActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<PresupuestoVentasPunVen> presupuestoventaspunvensSeleccionados=new ArrayList<PresupuestoVentasPunVen>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosPresupuestoVentasPunVen.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosPresupuestoVentasPunVen.getSelectedRows().length;			
			}
			
			presupuestoventaspunvensSeleccionados=this.getPresupuestoVentasPunVensSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoPresupuestoVentasPunVen--;			
				//PresupuestoVentasPunVen presupuestoventaspunvenAux= new PresupuestoVentasPunVen();			
				//presupuestoventaspunvenAux.setId(this.iIdNuevoPresupuestoVentasPunVen);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//PresupuestoVentasPunVen presupuestoventaspunvenOrigen=new PresupuestoVentasPunVen();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(PresupuestoVentasPunVen presupuestoventaspunvenOrigen : presupuestoventaspunvensSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosPresupuestoVentasPunVen.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							presupuestoventaspunvenOrigen =(PresupuestoVentasPunVen) this.presupuestoventaspunvenLogic.getPresupuestoVentasPunVens().toArray()[this.jTableDatosPresupuestoVentasPunVen.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presupuestoventaspunvenOrigen =(PresupuestoVentasPunVen) this.presupuestoventaspunvens.toArray()[this.jTableDatosPresupuestoVentasPunVen.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaPresupuestoVentasPunVen();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.presupuestoventaspunven.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosPresupuestoVentasPunVen(presupuestoventaspunvenOrigen,this.presupuestoventaspunven,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoVentasPunVen(this.presupuestoventaspunven);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.presupuestoventaspunvenLogic.getPresupuestoVentasPunVens().add(this.presupuestoventaspunvenAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.presupuestoventaspunvens.add(this.presupuestoventaspunvenAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaPresupuestoVentasPunVen(false);
				
				this.jTableDatosPresupuestoVentasPunVen.setRowSelectionInterval(this.getIndiceNuevoPresupuestoVentasPunVen(), this.getIndiceNuevoPresupuestoVentasPunVen());
				
				int iLastRow =  this.jTableDatosPresupuestoVentasPunVen.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPresupuestoVentasPunVen.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPresupuestoVentasPunVen.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPresupuestoVentasPunVen(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarPresupuestoVentasPunVenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<PresupuestoVentasPunVen> presupuestoventaspunvensSeleccionados=new ArrayList<PresupuestoVentasPunVen>();									
		
			PresupuestoVentasPunVen presupuestoventaspunvenOrigen=new PresupuestoVentasPunVen();
			PresupuestoVentasPunVen presupuestoventaspunvenDestino=new PresupuestoVentasPunVen();
				
			presupuestoventaspunvensSeleccionados=this.getPresupuestoVentasPunVensSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosPresupuestoVentasPunVen.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || presupuestoventaspunvensSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosPresupuestoVentasPunVen.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						presupuestoventaspunvenOrigen =(PresupuestoVentasPunVen) this.presupuestoventaspunvenLogic.getPresupuestoVentasPunVens().toArray()[this.jTableDatosPresupuestoVentasPunVen.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						presupuestoventaspunvenOrigen =(PresupuestoVentasPunVen) this.presupuestoventaspunvens.toArray()[this.jTableDatosPresupuestoVentasPunVen.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						presupuestoventaspunvenDestino =(PresupuestoVentasPunVen) this.presupuestoventaspunvenLogic.getPresupuestoVentasPunVens().toArray()[this.jTableDatosPresupuestoVentasPunVen.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						presupuestoventaspunvenDestino =(PresupuestoVentasPunVen) this.presupuestoventaspunvens.toArray()[this.jTableDatosPresupuestoVentasPunVen.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				presupuestoventaspunvenOrigen =presupuestoventaspunvensSeleccionados.get(0);
				presupuestoventaspunvenDestino =presupuestoventaspunvensSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosPresupuestoVentasPunVen(presupuestoventaspunvenOrigen,presupuestoventaspunvenDestino,true,false);
				
				presupuestoventaspunvenDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(presupuestoventaspunvenDestino,presupuestoventaspunvenLogic.getPresupuestoVentasPunVens());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(presupuestoventaspunvenDestino,presupuestoventaspunvens);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaPresupuestoVentasPunVen(false);
				
				//this.jTableDatosPresupuestoVentasPunVen.setRowSelectionInterval(this.getIndiceNuevoPresupuestoVentasPunVen(), this.getIndiceNuevoPresupuestoVentasPunVen());
				
				int iLastRow =  this.jTableDatosPresupuestoVentasPunVen.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPresupuestoVentasPunVen.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPresupuestoVentasPunVen.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPresupuestoVentasPunVen(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormPresupuestoVentasPunVenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormPresupuestoVentasPunVen.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarPresupuestoVentasPunVenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesPresupuestoVentasPunVen.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasPresupuestoVentasPunVen.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesPresupuestoVentasPunVen.setVisible(!isVisible);
			this.jPanelPaginacionPresupuestoVentasPunVen.setVisible(!isVisible);
			this.jPanelAccionesPresupuestoVentasPunVen.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarPresupuestoVentasPunVenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFramePresupuestoVentasPunVen();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoPresupuestoVentasPunVenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoPresupuestoVentasPunVen();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionPresupuestoVentasPunVenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionPresupuestoVentasPunVen();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByPresupuestoVentasPunVenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByPresupuestoVentasPunVen();
			
			this.abrirFrameOrderByPresupuestoVentasPunVen();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByPresupuestoVentasPunVenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByPresupuestoVentasPunVen();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetallePresupuestoVentasPunVen(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormPresupuestoVentasPunVen);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen.isMaximum()) {
					this.jInternalFrameDetalleFormPresupuestoVentasPunVen.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.setSize(this.jInternalFrameDetalleFormPresupuestoVentasPunVen.iWidthFormulario,this.jInternalFrameDetalleFormPresupuestoVentasPunVen.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormPresupuestoVentasPunVen.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormPresupuestoVentasPunVen.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormPresupuestoVentasPunVen.isMaximum()) {
						this.jInternalFrameDetalleFormPresupuestoVentasPunVen.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jContentPaneDetallePresupuestoVentasPunVen.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jTabbedPaneRelacionesPresupuestoVentasPunVen.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jContentPaneDetallePresupuestoVentasPunVen.getWidth(),PresupuestoVentasPunVenConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jTabbedPaneRelacionesPresupuestoVentasPunVen.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jContentPaneDetallePresupuestoVentasPunVen.getWidth(),PresupuestoVentasPunVenConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jTabbedPaneRelacionesPresupuestoVentasPunVen.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jContentPaneDetallePresupuestoVentasPunVen.getWidth(),PresupuestoVentasPunVenConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormPresupuestoVentasPunVen.setVisible(true);
	        this.jInternalFrameDetalleFormPresupuestoVentasPunVen.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByPresupuestoVentasPunVen() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByPresupuestoVentasPunVen==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByPresupuestoVentasPunVen=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPresupuestoVentasPunVen,false,this);
				} else {
					this.jInternalFrameOrderByPresupuestoVentasPunVen=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPresupuestoVentasPunVen,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByPresupuestoVentasPunVen);
				this.jInternalFrameOrderByPresupuestoVentasPunVen.setVisible(false);
				this.jInternalFrameOrderByPresupuestoVentasPunVen.setSelected(false);
				
				this.jInternalFrameOrderByPresupuestoVentasPunVen.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPresupuestoVentasPunVen"));
				
				this.inicializarActualizarBindingTablaOrderByPresupuestoVentasPunVen();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionPresupuestoVentasPunVen() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionPresupuestoVentasPunVen==null) {
				
				this.jInternalFrameImportacionPresupuestoVentasPunVen=new ImportacionJInternalFrame(PresupuestoVentasPunVenConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPresupuestoVentasPunVen);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionPresupuestoVentasPunVen);
				this.jInternalFrameImportacionPresupuestoVentasPunVen.setVisible(false);
				this.jInternalFrameImportacionPresupuestoVentasPunVen.setSelected(false);


				this.jInternalFrameImportacionPresupuestoVentasPunVen.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPresupuestoVentasPunVen"));
				this.jInternalFrameImportacionPresupuestoVentasPunVen.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPresupuestoVentasPunVen"));
				this.jInternalFrameImportacionPresupuestoVentasPunVen.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPresupuestoVentasPunVen"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoPresupuestoVentasPunVen() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoPresupuestoVentasPunVen==null) {
				this.jInternalFrameReporteDinamicoPresupuestoVentasPunVen=new ReporteDinamicoJInternalFrame(PresupuestoVentasPunVenConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPresupuestoVentasPunVen);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPresupuestoVentasPunVen);
				this.jInternalFrameReporteDinamicoPresupuestoVentasPunVen.setVisible(false);
				this.jInternalFrameReporteDinamicoPresupuestoVentasPunVen.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoPresupuestoVentasPunVen.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPresupuestoVentasPunVen"));
				this.jInternalFrameReporteDinamicoPresupuestoVentasPunVen.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPresupuestoVentasPunVen"));
				this.jInternalFrameReporteDinamicoPresupuestoVentasPunVen.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPresupuestoVentasPunVen"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPresupuestoVentasPunVen();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetallePresupuestoVentasPunVen() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormPresupuestoVentasPunVen);
			
	       	this.jInternalFrameDetalleFormPresupuestoVentasPunVen.setVisible(false);
	        this.jInternalFrameDetalleFormPresupuestoVentasPunVen.setSelected(false);
			
			//this.jInternalFrameDetalleFormPresupuestoVentasPunVen.dispose();
			//this.jInternalFrameDetalleFormPresupuestoVentasPunVen=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoPresupuestoVentasPunVen() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoPresupuestoVentasPunVen.setVisible(true);
	        this.jInternalFrameReporteDinamicoPresupuestoVentasPunVen.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionPresupuestoVentasPunVen() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionPresupuestoVentasPunVen.setVisible(true);
	        this.jInternalFrameImportacionPresupuestoVentasPunVen.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByPresupuestoVentasPunVen() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByPresupuestoVentasPunVen.setVisible(true);
	        this.jInternalFrameOrderByPresupuestoVentasPunVen.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByPresupuestoVentasPunVen() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByPresupuestoVentasPunVen.setVisible(false);
	        this.jInternalFrameOrderByPresupuestoVentasPunVen.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoPresupuestoVentasPunVen() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoPresupuestoVentasPunVen.setVisible(false);
	        this.jInternalFrameReporteDinamicoPresupuestoVentasPunVen.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionPresupuestoVentasPunVen() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionPresupuestoVentasPunVen.setVisible(false);
	        this.jInternalFrameImportacionPresupuestoVentasPunVen.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarPresupuestoVentasPunVenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarPresupuestoVentasPunVen(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarPresupuestoVentasPunVen(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPresupuestoVentasPunVen.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesPresupuestoVentasPunVen(true);
			//this.isEsNuevoPresupuestoVentasPunVen=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventaspunven =(PresupuestoVentasPunVen) this.presupuestoventaspunvenLogic.getPresupuestoVentasPunVens().toArray()[this.jTableDatosPresupuestoVentasPunVen.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.presupuestoventaspunven =(PresupuestoVentasPunVen) this.presupuestoventaspunvens.toArray()[this.jTableDatosPresupuestoVentasPunVen.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesPresupuestoVentasPunVen("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPresupuestoVentasPunVen(false) ;
			
			if(presupuestoventaspunvenSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(PresupuestoVentasPunVenJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePresupuestoVentasPunVen(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPresupuestoVentasPunVen(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaPresupuestoVentasPunVenActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosPresupuestoVentasPunVen.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventaspunven =(PresupuestoVentasPunVen) this.presupuestoventaspunvenLogic.getPresupuestoVentasPunVens().toArray()[this.jTableDatosPresupuestoVentasPunVen.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presupuestoventaspunven =(PresupuestoVentasPunVen) this.presupuestoventaspunvens.toArray()[this.jTableDatosPresupuestoVentasPunVen.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarPresupuestoVentasPunVen(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPresupuestoVentasPunVen.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesPresupuestoVentasPunVen(true);
			//this.isEsNuevoPresupuestoVentasPunVen=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventaspunven =(PresupuestoVentasPunVen) this.presupuestoventaspunvenLogic.getPresupuestoVentasPunVens().toArray()[this.jTableDatosPresupuestoVentasPunVen.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.presupuestoventaspunven =(PresupuestoVentasPunVen) this.presupuestoventaspunvens.toArray()[this.jTableDatosPresupuestoVentasPunVen.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.presupuestoventaspunven.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesPresupuestoVentasPunVen("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesPresupuestoVentasPunVen(false) ;
			
			if(PresupuestoVentasPunVenJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePresupuestoVentasPunVen(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPresupuestoVentasPunVen(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
					
	
	public void recargarComboTablaCaja(List<Caja> cajasForeignKey)throws Exception{
		TableColumn tableColumnCaja=this.jTableDatosPresupuestoVentasPunVen.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoVentasPunVen,PresupuestoVentasPunVenConstantesFunciones.LABEL_IDCAJA));
		TableCellEditor tableCellEditorCaja =tableColumnCaja.getCellEditor();

		CajaTableCell cajaTableCellFk=(CajaTableCell)tableCellEditorCaja;

		if(cajaTableCellFk!=null) {
			cajaTableCellFk.setcajasForeignKey(cajasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPresupuestoVentasPunVen.getSelectedRow();

		//if(intSelectedRow<=0) {
			//cajaTableCellFk.setRowActual(intSelectedRow);
			//cajaTableCellFk.setcajasForeignKeyActual(cajasForeignKey);
		//}


		if(cajaTableCellFk!=null) {
			cajaTableCellFk.RecargarCajasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarPresupuestoVentasPunVenActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventaspunvenLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesPresupuestoVentasPunVen(false);
			
			//if(!this.isEsNuevoPresupuestoVentasPunVen) {								
				int intSelectedRow = this.jTableDatosPresupuestoVentasPunVen.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventaspunven =(PresupuestoVentasPunVen) this.presupuestoventaspunvenLogic.getPresupuestoVentasPunVens().toArray()[this.jTableDatosPresupuestoVentasPunVen.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.presupuestoventaspunven =(PresupuestoVentasPunVen) this.presupuestoventaspunvens.toArray()[this.jTableDatosPresupuestoVentasPunVen.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(PresupuestoVentasPunVenJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualPresupuestoVentasPunVen(this.presupuestoventaspunven,true);
				this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoVentasPunVen(this.presupuestoventaspunven);
				
			}
			
			if(this.permiteMantenimiento(this.presupuestoventaspunven)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoPresupuestoVentasPunVen=true;
					this.inicializarActualizarBindingTablaPresupuestoVentasPunVen(false);
					this.isEsNuevoPresupuestoVentasPunVen=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoPresupuestoVentasPunVen=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoPresupuestoVentasPunVen=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPresupuestoVentasPunVen(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPresupuestoVentasPunVen(false);
				
				this.habilitarDeshabilitarControlesPresupuestoVentasPunVen(false);
			
												
				
				if(PresupuestoVentasPunVenJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetallePresupuestoVentasPunVen();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoPresupuestoVentasPunVenActionPerformed(evt,presupuestoventaspunvenSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualPresupuestoVentasPunVen(this.presupuestoventaspunven,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosPresupuestoVentasPunVen.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,presupuestoventaspunvenSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventaspunvenLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.presupuestoventaspunven.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(PresupuestoVentasPunVen.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresupuestoVentasPunVen.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventaspunvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventaspunvenLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarPresupuestoVentasPunVenActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventaspunvenLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosPresupuestoVentasPunVen.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventaspunven =(PresupuestoVentasPunVen) this.presupuestoventaspunvenLogic.getPresupuestoVentasPunVens().toArray()[this.jTableDatosPresupuestoVentasPunVen.convertRowIndexToModel(intSelectedRow)];
				this.presupuestoventaspunven.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.presupuestoventaspunven =(PresupuestoVentasPunVen) this.presupuestoventaspunvens.toArray()[this.jTableDatosPresupuestoVentasPunVen.convertRowIndexToModel(intSelectedRow)];
				this.presupuestoventaspunven.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.presupuestoventaspunven)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((PresupuestoVentasPunVenModel) this.jTableDatosPresupuestoVentasPunVen.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoPresupuestoVentasPunVen=true;
				this.inicializarActualizarBindingTablaPresupuestoVentasPunVen(false);
				this.isEsNuevoPresupuestoVentasPunVen=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPresupuestoVentasPunVen(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPresupuestoVentasPunVen(false);
				
				this.habilitarDeshabilitarControlesPresupuestoVentasPunVen(false);
				
				
				
				if(PresupuestoVentasPunVenJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetallePresupuestoVentasPunVen();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventaspunvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventaspunvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventaspunvenLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarPresupuestoVentasPunVenActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosPresupuestoVentasPunVen.getRowCount()>=1) {
				jTableDatosPresupuestoVentasPunVen.removeRowSelectionInterval(0, jTableDatosPresupuestoVentasPunVen.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesPresupuestoVentasPunVen(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaPresupuestoVentasPunVen(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPresupuestoVentasPunVen(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPresupuestoVentasPunVen(false) ;
			
			this.isEsNuevoPresupuestoVentasPunVen=false;
			
			if(PresupuestoVentasPunVenJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetallePresupuestoVentasPunVen();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosPresupuestoVentasPunVenActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventaspunvenLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingPresupuestoVentasPunVen(false);
				
				//SI ES MANUAL
				if(PresupuestoVentasPunVenJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualPresupuestoVentasPunVen();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventaspunvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventaspunvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventaspunvenLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosPresupuestoVentasPunVenActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoPresupuestoVentasPunVen--;			
			//PresupuestoVentasPunVen presupuestoventaspunvenAux= new PresupuestoVentasPunVen();			
			//presupuestoventaspunvenAux.setId(this.iIdNuevoPresupuestoVentasPunVen);
			
			if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaPresupuestoVentasPunVen();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoVentasPunVen(this.presupuestoventaspunven);
			
			this.presupuestoventaspunven.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.presupuestoventaspunvenLogic.getPresupuestoVentasPunVens().add(this.presupuestoventaspunvenAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.presupuestoventaspunvens.add(this.presupuestoventaspunvenAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaPresupuestoVentasPunVen(false);
			
			this.jTableDatosPresupuestoVentasPunVen.setRowSelectionInterval(this.getIndiceNuevoPresupuestoVentasPunVen(), this.getIndiceNuevoPresupuestoVentasPunVen());
			
			int iLastRow =  this.jTableDatosPresupuestoVentasPunVen.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosPresupuestoVentasPunVen.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosPresupuestoVentasPunVen.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaPresupuestoVentasPunVen(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionPresupuestoVentasPunVenActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventaspunvenLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingPresupuestoVentasPunVen(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPresupuestoVentasPunVen(false);
			
			//SI ES MANUAL
			if(PresupuestoVentasPunVenJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPresupuestoVentasPunVen();
			}
			
			//this.abrirFrameTreePresupuestoVentasPunVen();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventaspunvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventaspunvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventaspunvenLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionPresupuestoVentasPunVenActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Presupuesto VentasES ?", "MANTENIMIENTO DE Presupuesto Ventas", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionPresupuestoVentasPunVen.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralPresupuestoVentasPunVen();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.presupuestoventaspunvenReturnGeneral=presupuestoventaspunvenLogic.procesarImportacionPresupuestoVentasPunVensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.presupuestoventaspunvenParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarPresupuestoVentasPunVenReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionPresupuestoVentasPunVenActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionPresupuestoVentasPunVen.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionPresupuestoVentasPunVen.setFileImportacion(this.jInternalFrameImportacionPresupuestoVentasPunVen.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionPresupuestoVentasPunVen.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionPresupuestoVentasPunVen.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionPresupuestoVentasPunVen.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionPresupuestoVentasPunVen.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoPresupuestoVentasPunVenActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<PresupuestoVentasPunVen> presupuestoventaspunvensSeleccionados=new ArrayList<PresupuestoVentasPunVen>();		

		presupuestoventaspunvensSeleccionados=this.getPresupuestoVentasPunVensSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPresupuestoVentasPunVen.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPresupuestoVentasPunVen.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("PresupuestoVentasPunVenBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"PresupuestoVentasPunVenBaseDesign.jrxml";
			
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
			
			this.generarReportePresupuestoVentasPunVens("Todos",presupuestoventaspunvensSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Presupuesto Ventas",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoPresupuestoVentasPunVen.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPresupuestoVentasPunVen.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PresupuestoVentasPunVenConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresupuestoVentasPunVenConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresupuestoVentasPunVenConstantesFunciones.LABEL_IDEJERCICIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Ejercicio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Ejercicio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Ejercicio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Ejercicio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresupuestoVentasPunVenConstantesFunciones.LABEL_IDPERIODO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Periodo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Periodo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Periodo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Periodo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresupuestoVentasPunVenConstantesFunciones.LABEL_IDCAJA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Caja_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Caja_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Caja_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Caja_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresupuestoVentasPunVenConstantesFunciones.LABEL_VALOR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresupuestoVentasPunVenConstantesFunciones.LABEL_CANTIDAD:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresupuestoVentasPunVenConstantesFunciones.LABEL_PORCENTAJE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rcentaje_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rcentaje_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rcentaje_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rcentaje_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresupuestoVentasPunVenConstantesFunciones.LABEL_CANTIDADTOTAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntidadTotal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntidadTotal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntidadTotal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntidadTotal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresupuestoVentasPunVenConstantesFunciones.LABEL_VALORTOTAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lorTotal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lorTotal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lorTotal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lorTotal_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoPresupuestoVentasPunVen.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoPresupuestoVentasPunVen.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoPresupuestoVentasPunVen.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case PresupuestoVentasPunVenConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case PresupuestoVentasPunVenConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case PresupuestoVentasPunVenConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoria="id_ejercicio";
					break;

				case PresupuestoVentasPunVenConstantesFunciones.LABEL_IDPERIODO:
					sNombreCampoCategoria="id_periodo";
					break;

				case PresupuestoVentasPunVenConstantesFunciones.LABEL_IDCAJA:
					sNombreCampoCategoria="id_caja";
					break;

				case PresupuestoVentasPunVenConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoria="valor";
					break;

				case PresupuestoVentasPunVenConstantesFunciones.LABEL_CANTIDAD:
					sNombreCampoCategoria="cantidad";
					break;

				case PresupuestoVentasPunVenConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoria="porcentaje";
					break;

				case PresupuestoVentasPunVenConstantesFunciones.LABEL_CANTIDADTOTAL:
					sNombreCampoCategoria="cantidad_total";
					break;

				case PresupuestoVentasPunVenConstantesFunciones.LABEL_VALORTOTAL:
					sNombreCampoCategoria="valor_total";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoPresupuestoVentasPunVen.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case PresupuestoVentasPunVenConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case PresupuestoVentasPunVenConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case PresupuestoVentasPunVenConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoriaValor="id_ejercicio";
					break;

				case PresupuestoVentasPunVenConstantesFunciones.LABEL_IDPERIODO:
					sNombreCampoCategoriaValor="id_periodo";
					break;

				case PresupuestoVentasPunVenConstantesFunciones.LABEL_IDCAJA:
					sNombreCampoCategoriaValor="id_caja";
					break;

				case PresupuestoVentasPunVenConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoriaValor="valor";
					break;

				case PresupuestoVentasPunVenConstantesFunciones.LABEL_CANTIDAD:
					sNombreCampoCategoriaValor="cantidad";
					break;

				case PresupuestoVentasPunVenConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoriaValor="porcentaje";
					break;

				case PresupuestoVentasPunVenConstantesFunciones.LABEL_CANTIDADTOTAL:
					sNombreCampoCategoriaValor="cantidad_total";
					break;

				case PresupuestoVentasPunVenConstantesFunciones.LABEL_VALORTOTAL:
					sNombreCampoCategoriaValor="valor_total";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoPresupuestoVentasPunVen.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPresupuestoVentasPunVen.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PresupuestoVentasPunVenConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case PresupuestoVentasPunVenConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case PresupuestoVentasPunVenConstantesFunciones.LABEL_IDEJERCICIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ejercicio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_ejercicio");
					break;

				case PresupuestoVentasPunVenConstantesFunciones.LABEL_IDPERIODO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Periodo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_periodo");
					break;

				case PresupuestoVentasPunVenConstantesFunciones.LABEL_IDCAJA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Caja",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_caja");
					break;

				case PresupuestoVentasPunVenConstantesFunciones.LABEL_VALOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor");
					break;

				case PresupuestoVentasPunVenConstantesFunciones.LABEL_CANTIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cantad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"cantidad");
					break;

				case PresupuestoVentasPunVenConstantesFunciones.LABEL_PORCENTAJE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Porcentaje",sNombreCampoCategoria,sNombreCampoCategoriaValor,"porcentaje");
					break;

				case PresupuestoVentasPunVenConstantesFunciones.LABEL_CANTIDADTOTAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cantad Total",sNombreCampoCategoria,sNombreCampoCategoriaValor,"cantidad_total");
					break;

				case PresupuestoVentasPunVenConstantesFunciones.LABEL_VALORTOTAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor Total",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor_total");
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
	
	public void jButtonGenerarExcelReporteDinamicoPresupuestoVentasPunVenActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<PresupuestoVentasPunVen> presupuestoventaspunvensSeleccionados=new ArrayList<PresupuestoVentasPunVen>();		
		
		presupuestoventaspunvensSeleccionados=this.getPresupuestoVentasPunVensSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presupuestoventaspunven";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("PresupuestoVentasPunVens");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoPresupuestoVentasPunVen.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoPresupuestoVentasPunVen.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case PresupuestoVentasPunVenConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresupuestoVentasPunVenConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(PresupuestoVentasPunVen presupuestoventaspunven:presupuestoventaspunvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presupuestoventaspunven.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresupuestoVentasPunVenConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresupuestoVentasPunVenConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(PresupuestoVentasPunVen presupuestoventaspunven:presupuestoventaspunvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presupuestoventaspunven.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresupuestoVentasPunVenConstantesFunciones.LABEL_IDEJERCICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresupuestoVentasPunVenConstantesFunciones.LABEL_IDEJERCICIO);
					iRow++;

					for(PresupuestoVentasPunVen presupuestoventaspunven:presupuestoventaspunvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presupuestoventaspunven.getejercicio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresupuestoVentasPunVenConstantesFunciones.LABEL_IDPERIODO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresupuestoVentasPunVenConstantesFunciones.LABEL_IDPERIODO);
					iRow++;

					for(PresupuestoVentasPunVen presupuestoventaspunven:presupuestoventaspunvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presupuestoventaspunven.getperiodo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresupuestoVentasPunVenConstantesFunciones.LABEL_IDCAJA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresupuestoVentasPunVenConstantesFunciones.LABEL_IDCAJA);
					iRow++;

					for(PresupuestoVentasPunVen presupuestoventaspunven:presupuestoventaspunvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presupuestoventaspunven.getcaja_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresupuestoVentasPunVenConstantesFunciones.LABEL_VALOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresupuestoVentasPunVenConstantesFunciones.LABEL_VALOR);
					iRow++;

					for(PresupuestoVentasPunVen presupuestoventaspunven:presupuestoventaspunvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presupuestoventaspunven.getvalor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresupuestoVentasPunVenConstantesFunciones.LABEL_CANTIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresupuestoVentasPunVenConstantesFunciones.LABEL_CANTIDAD);
					iRow++;

					for(PresupuestoVentasPunVen presupuestoventaspunven:presupuestoventaspunvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presupuestoventaspunven.getcantidad());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresupuestoVentasPunVenConstantesFunciones.LABEL_PORCENTAJE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresupuestoVentasPunVenConstantesFunciones.LABEL_PORCENTAJE);
					iRow++;

					for(PresupuestoVentasPunVen presupuestoventaspunven:presupuestoventaspunvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presupuestoventaspunven.getporcentaje());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresupuestoVentasPunVenConstantesFunciones.LABEL_CANTIDADTOTAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresupuestoVentasPunVenConstantesFunciones.LABEL_CANTIDADTOTAL);
					iRow++;

					for(PresupuestoVentasPunVen presupuestoventaspunven:presupuestoventaspunvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presupuestoventaspunven.getcantidad_total());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresupuestoVentasPunVenConstantesFunciones.LABEL_VALORTOTAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresupuestoVentasPunVenConstantesFunciones.LABEL_VALORTOTAL);
					iRow++;

					for(PresupuestoVentasPunVen presupuestoventaspunven:presupuestoventaspunvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presupuestoventaspunven.getvalor_total());
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
			//	this.getFilaCabeceraExportarExcelPresupuestoVentasPunVen(row);				
			//	iRow++;
			//}				
			
			//for(PresupuestoVentasPunVen presupuestoventaspunvenAux:presupuestoventaspunvensSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelPresupuestoVentasPunVen(presupuestoventaspunvenAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Presupuesto Ventas",JOptionPane.INFORMATION_MESSAGE);
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
				this.presupuestoventaspunvenLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPresupuestoVentasPunVen(false);
			
			//SI ES MANUAL
			if(PresupuestoVentasPunVenJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPresupuestoVentasPunVen();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventaspunvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventaspunvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventaspunvenLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresPresupuestoVentasPunVenActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventaspunvenLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPresupuestoVentasPunVen(false);
			
			//SI ES MANUAL
			if(PresupuestoVentasPunVenJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPresupuestoVentasPunVen();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventaspunvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventaspunvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventaspunvenLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesPresupuestoVentasPunVenActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventaspunvenLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPresupuestoVentasPunVen(false);
			
			//SI ES MANUAL
			if(PresupuestoVentasPunVenJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPresupuestoVentasPunVen();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventaspunvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventaspunvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventaspunvenLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaPresupuestoVentasPunVen() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosPresupuestoVentasPunVen.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosPresupuestoVentasPunVen.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosPresupuestoVentasPunVen.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosPresupuestoVentasPunVen.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosPresupuestoVentasPunVen.setMinimumSize(dimensionMinimum);
		this.jTableDatosPresupuestoVentasPunVen.setMaximumSize(dimensionMaximum);
		this.jTableDatosPresupuestoVentasPunVen.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingPresupuestoVentasPunVen(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingPresupuestoVentasPunVen(esInicializar,true);
	}
	
	public void inicializarActualizarBindingPresupuestoVentasPunVen(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaPresupuestoVentasPunVen(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesPresupuestoVentasPunVen(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasPresupuestoVentasPunVen(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPresupuestoVentasPunVen(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesPresupuestoVentasPunVen(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !PresupuestoVentasPunVenJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!PresupuestoVentasPunVenJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualPresupuestoVentasPunVen() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaPresupuestoVentasPunVen();
		
		this.inicializarActualizarBindingBotonesManualPresupuestoVentasPunVen(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualPresupuestoVentasPunVen();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPresupuestoVentasPunVen() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualPresupuestoVentasPunVen(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualPresupuestoVentasPunVen(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosPresupuestoVentasPunVen.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosPresupuestoVentasPunVen.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReportePresupuestoVentasPunVen.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jCheckBoxPostAccionNuevoPresupuestoVentasPunVen.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jCheckBoxPostAccionSinCerrarPresupuestoVentasPunVen.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jCheckBoxPostAccionSinMensajePresupuestoVentasPunVen.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosPresupuestoVentasPunVen.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosPresupuestoVentasPunVen.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReportePresupuestoVentasPunVen.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen!=null) {
				this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jCheckBoxPostAccionNuevoPresupuestoVentasPunVen.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jCheckBoxPostAccionSinCerrarPresupuestoVentasPunVen.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jCheckBoxPostAccionSinMensajePresupuestoVentasPunVen.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionPresupuestoVentasPunVen.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionPresupuestoVentasPunVen.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxTiposAccionesFormularioPresupuestoVentasPunVen.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesPresupuestoVentasPunVen.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoPresupuestoVentasPunVen!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPresupuestoVentasPunVen.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesPresupuestoVentasPunVen.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesPresupuestoVentasPunVen.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarPresupuestoVentasPunVen.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesPresupuestoVentasPunVen.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoPresupuestoVentasPunVen!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPresupuestoVentasPunVen.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesPresupuestoVentasPunVen.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralPresupuestoVentasPunVen.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPresupuestoVentasPunVen(Boolean esInicializar) throws Exception {
		try	{	
			if(PresupuestoVentasPunVenJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualPresupuestoVentasPunVen(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesPresupuestoVentasPunVen() throws Exception {
		try	{
			if(PresupuestoVentasPunVenJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualPresupuestoVentasPunVen();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePresupuestoVentasPunVen() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxTiposAccionesFormularioPresupuestoVentasPunVen.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxTiposAccionesFormularioPresupuestoVentasPunVen.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualPresupuestoVentasPunVen() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesPresupuestoVentasPunVen.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesPresupuestoVentasPunVen.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesPresupuestoVentasPunVen.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesPresupuestoVentasPunVen.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesPresupuestoVentasPunVen.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesPresupuestoVentasPunVen.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionPresupuestoVentasPunVen.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionPresupuestoVentasPunVen.addItem(reporte);
			}
			
			
			if(!this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionPresupuestoVentasPunVen.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionPresupuestoVentasPunVen.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesPresupuestoVentasPunVen.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesPresupuestoVentasPunVen.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesPresupuestoVentasPunVen.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesPresupuestoVentasPunVen.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxTiposAccionesFormularioPresupuestoVentasPunVen.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxTiposAccionesFormularioPresupuestoVentasPunVen.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarPresupuestoVentasPunVen.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarPresupuestoVentasPunVen.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarPresupuestoVentasPunVen.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPresupuestoVentasPunVen();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPresupuestoVentasPunVen() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPresupuestoVentasPunVen!=null) {
				this.jInternalFrameReporteDinamicoPresupuestoVentasPunVen.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoPresupuestoVentasPunVen.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPresupuestoVentasPunVen!=null) {
				this.jInternalFrameReporteDinamicoPresupuestoVentasPunVen.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoPresupuestoVentasPunVen.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoPresupuestoVentasPunVen!=null) {
				
				if(this.jInternalFrameReporteDinamicoPresupuestoVentasPunVen.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPresupuestoVentasPunVen.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPresupuestoVentasPunVen.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoPresupuestoVentasPunVen.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPresupuestoVentasPunVen.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPresupuestoVentasPunVen.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoPresupuestoVentasPunVen.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoPresupuestoVentasPunVen.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=PresupuestoVentasPunVenConstantesFunciones.getTiposSeleccionarPresupuestoVentasPunVen(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoPresupuestoVentasPunVen.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoPresupuestoVentasPunVen.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoPresupuestoVentasPunVen.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=PresupuestoVentasPunVenConstantesFunciones.getTiposSeleccionarPresupuestoVentasPunVen(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoPresupuestoVentasPunVen.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoPresupuestoVentasPunVen.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoPresupuestoVentasPunVen.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=PresupuestoVentasPunVenConstantesFunciones.getTiposSeleccionarPresupuestoVentasPunVen(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPresupuestoVentasPunVen.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoPresupuestoVentasPunVen.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoPresupuestoVentasPunVen.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoPresupuestoVentasPunVen.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualPresupuestoVentasPunVen()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_cajaFK_IdCajaPresupuestoVentasPunVen.getSelectedItem()!=null){this.id_cajaFK_IdCaja=((Caja)this.jComboBoxid_cajaFK_IdCajaPresupuestoVentasPunVen.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasPresupuestoVentasPunVen(Boolean esInicializar) throws Exception {				
		if(PresupuestoVentasPunVenJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualPresupuestoVentasPunVen();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaPresupuestoVentasPunVen() throws Exception {
		this.inicializarActualizarBindingTablaPresupuestoVentasPunVen(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByPresupuestoVentasPunVen() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByPresupuestoVentasPunVen.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByPresupuestoVentasPunVen.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPresupuestoVentasPunVen.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new PresupuestoVentasPunVenPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByPresupuestoVentasPunVen.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPresupuestoVentasPunVen.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new PresupuestoVentasPunVenPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosPresupuestoVentasPunVenOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoVentasPunVenOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new PresupuestoVentasPunVenPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByPresupuestoVentasPunVen.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPresupuestoVentasPunVen.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new PresupuestoVentasPunVenPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByPresupuestoVentasPunVen.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaPresupuestoVentasPunVen(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=presupuestoventaspunvenLogic.getPresupuestoVentasPunVens().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=presupuestoventaspunvens.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(PresupuestoVentasPunVenJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosPresupuestoVentasPunVen.setModel(new PresupuestoVentasPunVenModel(this.presupuestoventaspunvenLogic.getPresupuestoVentasPunVens(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosPresupuestoVentasPunVen.setModel(new PresupuestoVentasPunVenModel(this.presupuestoventaspunvens,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByPresupuestoVentasPunVen!=null && this.jInternalFrameOrderByPresupuestoVentasPunVen.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByPresupuestoVentasPunVen();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosPresupuestoVentasPunVen.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoVentasPunVen,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new PresupuestoVentasPunVenPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+PresupuestoVentasPunVenConstantesFunciones.SCLASSWEBTITULO,presupuestoventaspunvenConstantesFunciones.resaltarSeleccionarPresupuestoVentasPunVen,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+PresupuestoVentasPunVenConstantesFunciones.SCLASSWEBTITULO,presupuestoventaspunvenConstantesFunciones.resaltarSeleccionarPresupuestoVentasPunVen,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosPresupuestoVentasPunVen.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoVentasPunVen,PresupuestoVentasPunVenConstantesFunciones.LABEL_ID));

		if(this.presupuestoventaspunvenConstantesFunciones.mostraridPresupuestoVentasPunVen && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresupuestoVentasPunVenConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.presupuestoventaspunvenConstantesFunciones.resaltaridPresupuestoVentasPunVen,this.presupuestoventaspunvenConstantesFunciones.activaridPresupuestoVentasPunVen,iSizeTabla,this,true,"idPresupuestoVentasPunVen","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.presupuestoventaspunvenConstantesFunciones.resaltaridPresupuestoVentasPunVen,this.presupuestoventaspunvenConstantesFunciones.activaridPresupuestoVentasPunVen,this,true,"idPresupuestoVentasPunVen","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresupuestoVentasPunVen.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoVentasPunVen,PresupuestoVentasPunVenConstantesFunciones.LABEL_IDEMPRESA));

		if(this.presupuestoventaspunvenConstantesFunciones.mostrarid_empresaPresupuestoVentasPunVen && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresupuestoVentasPunVenConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.presupuestoventaspunvenConstantesFunciones.resaltarid_empresaPresupuestoVentasPunVen,this,this.presupuestoventaspunvenConstantesFunciones.activarid_empresaPresupuestoVentasPunVen,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.presupuestoventaspunvenConstantesFunciones.resaltarid_empresaPresupuestoVentasPunVen,this,this.presupuestoventaspunvenConstantesFunciones.activarid_empresaPresupuestoVentasPunVen,false,"id_empresaPresupuestoVentasPunVen","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PresupuestoVentasPunVenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresupuestoVentasPunVen.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoVentasPunVen,PresupuestoVentasPunVenConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.presupuestoventaspunvenConstantesFunciones.mostrarid_sucursalPresupuestoVentasPunVen && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresupuestoVentasPunVenConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.presupuestoventaspunvenConstantesFunciones.resaltarid_sucursalPresupuestoVentasPunVen,this,this.presupuestoventaspunvenConstantesFunciones.activarid_sucursalPresupuestoVentasPunVen,iSizeTabla));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.presupuestoventaspunvenConstantesFunciones.resaltarid_sucursalPresupuestoVentasPunVen,this,this.presupuestoventaspunvenConstantesFunciones.activarid_sucursalPresupuestoVentasPunVen,false,"id_sucursalPresupuestoVentasPunVen","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PresupuestoVentasPunVenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresupuestoVentasPunVen.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoVentasPunVen,PresupuestoVentasPunVenConstantesFunciones.LABEL_IDEJERCICIO));

		if(this.presupuestoventaspunvenConstantesFunciones.mostrarid_ejercicioPresupuestoVentasPunVen && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresupuestoVentasPunVenConstantesFunciones.LABEL_IDEJERCICIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EjercicioTableCell(this.ejerciciosForeignKey,this.presupuestoventaspunvenConstantesFunciones.resaltarid_ejercicioPresupuestoVentasPunVen,this,this.presupuestoventaspunvenConstantesFunciones.activarid_ejercicioPresupuestoVentasPunVen,iSizeTabla));
			tableColumn.setCellEditor(new EjercicioTableCell(this.ejerciciosForeignKey,this.presupuestoventaspunvenConstantesFunciones.resaltarid_ejercicioPresupuestoVentasPunVen,this,this.presupuestoventaspunvenConstantesFunciones.activarid_ejercicioPresupuestoVentasPunVen,false,"id_ejercicioPresupuestoVentasPunVen","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PresupuestoVentasPunVenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresupuestoVentasPunVen.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoVentasPunVen,PresupuestoVentasPunVenConstantesFunciones.LABEL_IDPERIODO));

		if(this.presupuestoventaspunvenConstantesFunciones.mostrarid_periodoPresupuestoVentasPunVen && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresupuestoVentasPunVenConstantesFunciones.LABEL_IDPERIODO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new PeriodoTableCell(this.periodosForeignKey,this.presupuestoventaspunvenConstantesFunciones.resaltarid_periodoPresupuestoVentasPunVen,this,this.presupuestoventaspunvenConstantesFunciones.activarid_periodoPresupuestoVentasPunVen,iSizeTabla));
			tableColumn.setCellEditor(new PeriodoTableCell(this.periodosForeignKey,this.presupuestoventaspunvenConstantesFunciones.resaltarid_periodoPresupuestoVentasPunVen,this,this.presupuestoventaspunvenConstantesFunciones.activarid_periodoPresupuestoVentasPunVen,false,"id_periodoPresupuestoVentasPunVen","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PresupuestoVentasPunVenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresupuestoVentasPunVen.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoVentasPunVen,PresupuestoVentasPunVenConstantesFunciones.LABEL_IDCAJA));

		if(this.presupuestoventaspunvenConstantesFunciones.mostrarid_cajaPresupuestoVentasPunVen && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresupuestoVentasPunVenConstantesFunciones.LABEL_IDCAJA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CajaTableCell(this.cajasForeignKey,this.presupuestoventaspunvenConstantesFunciones.resaltarid_cajaPresupuestoVentasPunVen,this,this.presupuestoventaspunvenConstantesFunciones.activarid_cajaPresupuestoVentasPunVen,iSizeTabla));
			tableColumn.setCellEditor(new CajaTableCell(this.cajasForeignKey,this.presupuestoventaspunvenConstantesFunciones.resaltarid_cajaPresupuestoVentasPunVen,this,this.presupuestoventaspunvenConstantesFunciones.activarid_cajaPresupuestoVentasPunVen,true,"id_cajaPresupuestoVentasPunVen","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PresupuestoVentasPunVenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresupuestoVentasPunVen.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoVentasPunVen,PresupuestoVentasPunVenConstantesFunciones.LABEL_VALOR));

		if(this.presupuestoventaspunvenConstantesFunciones.mostrarvalorPresupuestoVentasPunVen && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresupuestoVentasPunVenConstantesFunciones.LABEL_VALOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.presupuestoventaspunvenConstantesFunciones.resaltarvalorPresupuestoVentasPunVen,this.presupuestoventaspunvenConstantesFunciones.activarvalorPresupuestoVentasPunVen,iSizeTabla,this,true,"valorPresupuestoVentasPunVen","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.presupuestoventaspunvenConstantesFunciones.resaltarvalorPresupuestoVentasPunVen,this.presupuestoventaspunvenConstantesFunciones.activarvalorPresupuestoVentasPunVen,this,true,"valorPresupuestoVentasPunVen","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PresupuestoVentasPunVenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresupuestoVentasPunVen.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoVentasPunVen,PresupuestoVentasPunVenConstantesFunciones.LABEL_CANTIDAD));

		if(this.presupuestoventaspunvenConstantesFunciones.mostrarcantidadPresupuestoVentasPunVen && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresupuestoVentasPunVenConstantesFunciones.LABEL_CANTIDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.presupuestoventaspunvenConstantesFunciones.resaltarcantidadPresupuestoVentasPunVen,this.presupuestoventaspunvenConstantesFunciones.activarcantidadPresupuestoVentasPunVen,iSizeTabla,this,true,"cantidadPresupuestoVentasPunVen","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.presupuestoventaspunvenConstantesFunciones.resaltarcantidadPresupuestoVentasPunVen,this.presupuestoventaspunvenConstantesFunciones.activarcantidadPresupuestoVentasPunVen,this,true,"cantidadPresupuestoVentasPunVen","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PresupuestoVentasPunVenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresupuestoVentasPunVen.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoVentasPunVen,PresupuestoVentasPunVenConstantesFunciones.LABEL_PORCENTAJE));

		if(this.presupuestoventaspunvenConstantesFunciones.mostrarporcentajePresupuestoVentasPunVen && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresupuestoVentasPunVenConstantesFunciones.LABEL_PORCENTAJE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.presupuestoventaspunvenConstantesFunciones.resaltarporcentajePresupuestoVentasPunVen,this.presupuestoventaspunvenConstantesFunciones.activarporcentajePresupuestoVentasPunVen,iSizeTabla,this,true,"porcentajePresupuestoVentasPunVen","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.presupuestoventaspunvenConstantesFunciones.resaltarporcentajePresupuestoVentasPunVen,this.presupuestoventaspunvenConstantesFunciones.activarporcentajePresupuestoVentasPunVen,this,true,"porcentajePresupuestoVentasPunVen","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PresupuestoVentasPunVenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresupuestoVentasPunVen.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoVentasPunVen,PresupuestoVentasPunVenConstantesFunciones.LABEL_CANTIDADTOTAL));

		if(this.presupuestoventaspunvenConstantesFunciones.mostrarcantidad_totalPresupuestoVentasPunVen && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresupuestoVentasPunVenConstantesFunciones.LABEL_CANTIDADTOTAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.presupuestoventaspunvenConstantesFunciones.resaltarcantidad_totalPresupuestoVentasPunVen,this.presupuestoventaspunvenConstantesFunciones.activarcantidad_totalPresupuestoVentasPunVen,iSizeTabla,this,true,"cantidad_totalPresupuestoVentasPunVen","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.presupuestoventaspunvenConstantesFunciones.resaltarcantidad_totalPresupuestoVentasPunVen,this.presupuestoventaspunvenConstantesFunciones.activarcantidad_totalPresupuestoVentasPunVen,this,true,"cantidad_totalPresupuestoVentasPunVen","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PresupuestoVentasPunVenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresupuestoVentasPunVen.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoVentasPunVen,PresupuestoVentasPunVenConstantesFunciones.LABEL_VALORTOTAL));

		if(this.presupuestoventaspunvenConstantesFunciones.mostrarvalor_totalPresupuestoVentasPunVen && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresupuestoVentasPunVenConstantesFunciones.LABEL_VALORTOTAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.presupuestoventaspunvenConstantesFunciones.resaltarvalor_totalPresupuestoVentasPunVen,this.presupuestoventaspunvenConstantesFunciones.activarvalor_totalPresupuestoVentasPunVen,iSizeTabla,this,true,"valor_totalPresupuestoVentasPunVen","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.presupuestoventaspunvenConstantesFunciones.resaltarvalor_totalPresupuestoVentasPunVen,this.presupuestoventaspunvenConstantesFunciones.activarvalor_totalPresupuestoVentasPunVen,this,true,"valor_totalPresupuestoVentasPunVen","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PresupuestoVentasPunVenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPresupuestoVentasPunVen.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPresupuestoVentasPunVen.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarPresupuestoVentasPunVen && this.isPermisoGuardarCambiosPresupuestoVentasPunVen) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosPresupuestoVentasPunVen.addColumn(tableColumn);
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
			
			this.jTableDatosPresupuestoVentasPunVen.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPresupuestoVentasPunVen && this.isPermisoGuardarCambiosPresupuestoVentasPunVen) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPresupuestoVentasPunVen && this.isPermisoGuardarCambiosPresupuestoVentasPunVen) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosPresupuestoVentasPunVen.moveColumn(this.jTableDatosPresupuestoVentasPunVen.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosPresupuestoVentasPunVen.moveColumn(this.jTableDatosPresupuestoVentasPunVen.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosPresupuestoVentasPunVen.moveColumn(this.jTableDatosPresupuestoVentasPunVen.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosPresupuestoVentasPunVen.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosPresupuestoVentasPunVen.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosPresupuestoVentasPunVen,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!PresupuestoVentasPunVenJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosPresupuestoVentasPunVen.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosPresupuestoVentasPunVen.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!PresupuestoVentasPunVenJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!PresupuestoVentasPunVenJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosPresupuestoVentasPunVen.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosPresupuestoVentasPunVen.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosPresupuestoVentasPunVen.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=presupuestoventaspunvenLogic.getPresupuestoVentasPunVens().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=presupuestoventaspunvens.size()-1;
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
		//this.jTableDatosPresupuestoVentasPunVen.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosPresupuestoVentasPunVen.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosPresupuestoVentasPunVen();
			
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
				
				//this.isEsNuevoPresupuestoVentasPunVen=false;
					
				PresupuestoVentasPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.presupuestoventaspunven,new Object(),this.presupuestoventaspunvenParameterGeneral,this.presupuestoventaspunvenReturnGeneral);
			
				if(this.presupuestoventaspunvenSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPresupuestoVentasPunVen.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPresupuestoVentasPunVen.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventaspunven =(PresupuestoVentasPunVen) this.presupuestoventaspunvenLogic.getPresupuestoVentasPunVens().toArray()[this.jTableDatosPresupuestoVentasPunVen.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presupuestoventaspunven =(PresupuestoVentasPunVen) this.presupuestoventaspunvens.toArray()[this.jTableDatosPresupuestoVentasPunVen.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.presupuestoventaspunven.getsType().equals("DUPLICADO")
				   || this.presupuestoventaspunven.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoPresupuestoVentasPunVen=true;
				
				} else {
					this.isEsNuevoPresupuestoVentasPunVen=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado()) {
					if(this.presupuestoventaspunven.getId()>=0 && !this.presupuestoventaspunven.getIsNew()) {						
						this.isEsNuevoPresupuestoVentasPunVen=false;
						
					} else {
						this.isEsNuevoPresupuestoVentasPunVen=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoPresupuestoVentasPunVen(esRelaciones);						
				
				this.seleccionarPresupuestoVentasPunVen(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.presupuestoventaspunven.getId()<0) {
					this.isEsNuevoPresupuestoVentasPunVen=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarPresupuestoVentasPunVen(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarPresupuestoVentasPunVen(evt,rowIndex);
				}	
				
				if(this.presupuestoventaspunvenSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion PresupuestoVentasPunVen: " + this.dDif); 
					}
				}								
				
				PresupuestoVentasPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.presupuestoventaspunven,new Object(),this.presupuestoventaspunvenParameterGeneral,this.presupuestoventaspunvenReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarPresupuestoVentasPunVen(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.presupuestoventaspunven)) {
					if(this.presupuestoventaspunven.getId()>0) {
						this.presupuestoventaspunven.setIsDeleted(true);
						
						this.presupuestoventaspunvensEliminados.add(this.presupuestoventaspunven);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.presupuestoventaspunvenLogic.getPresupuestoVentasPunVens().remove(this.presupuestoventaspunven);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.presupuestoventaspunvens.remove(this.presupuestoventaspunven);				
					}
					
					
					((PresupuestoVentasPunVenModel) this.jTableDatosPresupuestoVentasPunVen.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaPresupuestoVentasPunVen(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarPresupuestoVentasPunVen(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoPresupuestoVentasPunVen) {
			
			if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPresupuestoVentasPunVen.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPresupuestoVentasPunVen.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventaspunven =(PresupuestoVentasPunVen) this.presupuestoventaspunvenLogic.getPresupuestoVentasPunVens().toArray()[this.jTableDatosPresupuestoVentasPunVen.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presupuestoventaspunven =(PresupuestoVentasPunVen) this.presupuestoventaspunvens.toArray()[this.jTableDatosPresupuestoVentasPunVen.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(PresupuestoVentasPunVenJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioPresupuestoVentasPunVen(this.presupuestoventaspunven);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.presupuestoventaspunvenConstantesFunciones.cargarid_empresaPresupuestoVentasPunVen || this.presupuestoventaspunvenConstantesFunciones.event_dependid_empresaPresupuestoVentasPunVen) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.presupuestoventaspunven.getid_empresa());
									//this.inicializarActualizarBindingPresupuestoVentasPunVen(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(presupuestoventaspunven.getEmpresa()!=null) {
							this.empresasForeignKey.add(presupuestoventaspunven.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.presupuestoventaspunven.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.presupuestoventaspunvenConstantesFunciones.cargarid_sucursalPresupuestoVentasPunVen || this.presupuestoventaspunvenConstantesFunciones.event_dependid_sucursalPresupuestoVentasPunVen) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.presupuestoventaspunven.getid_sucursal());
									//this.inicializarActualizarBindingPresupuestoVentasPunVen(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(presupuestoventaspunven.getSucursal()!=null) {
							this.sucursalsForeignKey.add(presupuestoventaspunven.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.presupuestoventaspunven.getid_sucursal(),false,"Formulario");

					//Ejercicio
					if(!this.presupuestoventaspunvenConstantesFunciones.cargarid_ejercicioPresupuestoVentasPunVen || this.presupuestoventaspunvenConstantesFunciones.event_dependid_ejercicioPresupuestoVentasPunVen) {
						//this.cargarCombosEjerciciosForeignKeyLista(" where id="+this.presupuestoventaspunven.getid_ejercicio());
									//this.inicializarActualizarBindingPresupuestoVentasPunVen(false,false);
						this.ejerciciosForeignKey=new ArrayList<Ejercicio>();

						if(presupuestoventaspunven.getEjercicio()!=null) {
							this.ejerciciosForeignKey.add(presupuestoventaspunven.getEjercicio());
						}

						this.addItemDefectoCombosForeignKeyEjercicio();
						this.cargarCombosFrameEjerciciosForeignKey("Todos");
					}
					this.setActualEjercicioForeignKey(this.presupuestoventaspunven.getid_ejercicio(),false,"Formulario");

					//Periodo
					if(!this.presupuestoventaspunvenConstantesFunciones.cargarid_periodoPresupuestoVentasPunVen || this.presupuestoventaspunvenConstantesFunciones.event_dependid_periodoPresupuestoVentasPunVen) {
						//this.cargarCombosPeriodosForeignKeyLista(" where id="+this.presupuestoventaspunven.getid_periodo());
									//this.inicializarActualizarBindingPresupuestoVentasPunVen(false,false);
						this.periodosForeignKey=new ArrayList<Periodo>();

						if(presupuestoventaspunven.getPeriodo()!=null) {
							this.periodosForeignKey.add(presupuestoventaspunven.getPeriodo());
						}

						this.addItemDefectoCombosForeignKeyPeriodo();
						this.cargarCombosFramePeriodosForeignKey("Todos");
					}
					this.setActualPeriodoForeignKey(this.presupuestoventaspunven.getid_periodo(),false,"Formulario");

					//Caja
					if(!this.presupuestoventaspunvenConstantesFunciones.cargarid_cajaPresupuestoVentasPunVen || this.presupuestoventaspunvenConstantesFunciones.event_dependid_cajaPresupuestoVentasPunVen) {
						//this.cargarCombosCajasForeignKeyLista(" where id="+this.presupuestoventaspunven.getid_caja());
									//this.inicializarActualizarBindingPresupuestoVentasPunVen(false,false);
						this.cajasForeignKey=new ArrayList<Caja>();

						if(presupuestoventaspunven.getCaja()!=null) {
							this.cajasForeignKey.add(presupuestoventaspunven.getCaja());
						}

						this.addItemDefectoCombosForeignKeyCaja();
						this.cargarCombosFrameCajasForeignKey("Todos");
					}
					this.setActualCajaForeignKey(this.presupuestoventaspunven.getid_caja(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesPresupuestoVentasPunVen("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesPresupuestoVentasPunVen(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPresupuestoVentasPunVen() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoPresupuestoVentasPunVen(PresupuestoVentasPunVen presupuestoventaspunven) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoPresupuestoVentasPunVen(presupuestoventaspunven,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoPresupuestoVentasPunVen(PresupuestoVentasPunVen presupuestoventaspunven,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioPresupuestoVentasPunVen(presupuestoventaspunven);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyPresupuestoVentasPunVen(presupuestoventaspunven,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyPresupuestoVentasPunVen(presupuestoventaspunven);
	}
	
	public void setVariablesObjetoActualToFormularioPresupuestoVentasPunVen(PresupuestoVentasPunVen presupuestoventaspunven) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jLabelidPresupuestoVentasPunVen.setText(presupuestoventaspunven.getId().toString());
			this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jTextFieldvalorPresupuestoVentasPunVen.setText(presupuestoventaspunven.getvalor().toString());
			this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jTextFieldcantidadPresupuestoVentasPunVen.setText(presupuestoventaspunven.getcantidad().toString());
			this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jTextFieldporcentajePresupuestoVentasPunVen.setText(presupuestoventaspunven.getporcentaje().toString());
			this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jTextFieldcantidad_totalPresupuestoVentasPunVen.setText(presupuestoventaspunven.getcantidad_total().toString());
			this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jTextFieldvalor_totalPresupuestoVentasPunVen.setText(presupuestoventaspunven.getvalor_total().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,PresupuestoVentasPunVen presupuestoventaspunvenLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,presupuestoventaspunvenLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,PresupuestoVentasPunVen presupuestoventaspunvenLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				presupuestoventaspunvenLocal=this.presupuestoventaspunven;
			} else {
				presupuestoventaspunvenLocal=this.presupuestoventaspunvenAnterior;
			}
		}
		
		if(this.permiteMantenimiento(presupuestoventaspunvenLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoPresupuestoVentasPunVen(presupuestoventaspunvenLocal,true);
					
					if(presupuestoventaspunvenSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(presupuestoventaspunvenLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(presupuestoventaspunvenLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoPresupuestoVentasPunVen(PresupuestoVentasPunVen presupuestoventaspunven,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPresupuestoVentasPunVen(presupuestoventaspunven,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoVentasPunVen(presupuestoventaspunven);
	}
	
	public void setVariablesFormularioToObjetoActualPresupuestoVentasPunVen(PresupuestoVentasPunVen presupuestoventaspunven,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPresupuestoVentasPunVen(presupuestoventaspunven,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualPresupuestoVentasPunVen(PresupuestoVentasPunVen presupuestoventaspunven,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jLabelidPresupuestoVentasPunVen.getText()==null || this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jLabelidPresupuestoVentasPunVen.getText()=="" || this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jLabelidPresupuestoVentasPunVen.getText()=="Id") {
				this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jLabelidPresupuestoVentasPunVen.setText("0");
			}

			if(conColumnasBase) {presupuestoventaspunven.setId(Long.parseLong(this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jLabelidPresupuestoVentasPunVen.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PresupuestoVentasPunVenConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jLabelIdPresupuestoVentasPunVen,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			presupuestoventaspunven.setvalor(Double.parseDouble(this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jTextFieldvalorPresupuestoVentasPunVen.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PresupuestoVentasPunVenConstantesFunciones.LABEL_VALOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jLabelvalorPresupuestoVentasPunVen,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			presupuestoventaspunven.setcantidad(Integer.parseInt(this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jTextFieldcantidadPresupuestoVentasPunVen.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PresupuestoVentasPunVenConstantesFunciones.LABEL_CANTIDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jLabelcantidadPresupuestoVentasPunVen,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			presupuestoventaspunven.setporcentaje(Double.parseDouble(this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jTextFieldporcentajePresupuestoVentasPunVen.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PresupuestoVentasPunVenConstantesFunciones.LABEL_PORCENTAJE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jLabelporcentajePresupuestoVentasPunVen,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			presupuestoventaspunven.setcantidad_total(Integer.parseInt(this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jTextFieldcantidad_totalPresupuestoVentasPunVen.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PresupuestoVentasPunVenConstantesFunciones.LABEL_CANTIDADTOTAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jLabelcantidad_totalPresupuestoVentasPunVen,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			presupuestoventaspunven.setvalor_total(Double.parseDouble(this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jTextFieldvalor_totalPresupuestoVentasPunVen.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PresupuestoVentasPunVenConstantesFunciones.LABEL_VALORTOTAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jLabelvalor_totalPresupuestoVentasPunVen,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPresupuestoVentasPunVen(PresupuestoVentasPunVen presupuestoventaspunvenBean,PresupuestoVentasPunVen presupuestoventaspunven,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && presupuestoventaspunvenBean.getid_caja()!=null && !presupuestoventaspunvenBean.getid_caja().equals(-1L))) {presupuestoventaspunven.setid_caja(presupuestoventaspunvenBean.getid_caja());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosPresupuestoVentasPunVen(PresupuestoVentasPunVen presupuestoventaspunvenOrigen,PresupuestoVentasPunVen presupuestoventaspunven,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && presupuestoventaspunvenOrigen.getId()!=null && !presupuestoventaspunvenOrigen.getId().equals(0L))) {presupuestoventaspunven.setId(presupuestoventaspunvenOrigen.getId());}}
			if(conDefault || (!conDefault && presupuestoventaspunvenOrigen.getid_caja()!=null && !presupuestoventaspunvenOrigen.getid_caja().equals(-1L))) {presupuestoventaspunven.setid_caja(presupuestoventaspunvenOrigen.getid_caja());}
			if(conDefault || (!conDefault && presupuestoventaspunvenOrigen.getvalor()!=null && !presupuestoventaspunvenOrigen.getvalor().equals(0.0))) {presupuestoventaspunven.setvalor(presupuestoventaspunvenOrigen.getvalor());}
			if(conDefault || (!conDefault && presupuestoventaspunvenOrigen.getcantidad()!=null && !presupuestoventaspunvenOrigen.getcantidad().equals(0))) {presupuestoventaspunven.setcantidad(presupuestoventaspunvenOrigen.getcantidad());}
			if(conDefault || (!conDefault && presupuestoventaspunvenOrigen.getporcentaje()!=null && !presupuestoventaspunvenOrigen.getporcentaje().equals(0.0))) {presupuestoventaspunven.setporcentaje(presupuestoventaspunvenOrigen.getporcentaje());}
			if(conDefault || (!conDefault && presupuestoventaspunvenOrigen.getcantidad_total()!=null && !presupuestoventaspunvenOrigen.getcantidad_total().equals(0))) {presupuestoventaspunven.setcantidad_total(presupuestoventaspunvenOrigen.getcantidad_total());}
			if(conDefault || (!conDefault && presupuestoventaspunvenOrigen.getvalor_total()!=null && !presupuestoventaspunvenOrigen.getvalor_total().equals(0.0))) {presupuestoventaspunven.setvalor_total(presupuestoventaspunvenOrigen.getvalor_total());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPresupuestoVentasPunVen(PresupuestoVentasPunVen presupuestoventaspunven) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jLabelidPresupuestoVentasPunVen.setText(presupuestoventaspunven.getId().toString());
			this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jTextFieldvalorPresupuestoVentasPunVen.setText(presupuestoventaspunven.getvalor().toString());
			this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jTextFieldcantidadPresupuestoVentasPunVen.setText(presupuestoventaspunven.getcantidad().toString());
			this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jTextFieldporcentajePresupuestoVentasPunVen.setText(presupuestoventaspunven.getporcentaje().toString());
			this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jTextFieldcantidad_totalPresupuestoVentasPunVen.setText(presupuestoventaspunven.getcantidad_total().toString());
			this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jTextFieldvalor_totalPresupuestoVentasPunVen.setText(presupuestoventaspunven.getvalor_total().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPresupuestoVentasPunVen(PresupuestoVentasPunVenBean presupuestoventaspunvenBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jLabelidPresupuestoVentasPunVen.setText(presupuestoventaspunvenBean.getId().toString());
			this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jTextFieldvalorPresupuestoVentasPunVen.setText(presupuestoventaspunvenBean.getvalor().toString());
			this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jTextFieldcantidadPresupuestoVentasPunVen.setText(presupuestoventaspunvenBean.getcantidad().toString());
			this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jTextFieldporcentajePresupuestoVentasPunVen.setText(presupuestoventaspunvenBean.getporcentaje().toString());
			this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jTextFieldcantidad_totalPresupuestoVentasPunVen.setText(presupuestoventaspunvenBean.getcantidad_total().toString());
			this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jTextFieldvalor_totalPresupuestoVentasPunVen.setText(presupuestoventaspunvenBean.getvalor_total().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanPresupuestoVentasPunVen(PresupuestoVentasPunVenParameterReturnGeneral presupuestoventaspunvenReturnGeneral,PresupuestoVentasPunVenBean presupuestoventaspunvenBean,Boolean conDefault) throws Exception { 
		try {
			PresupuestoVentasPunVen presupuestoventaspunvenLocal=new PresupuestoVentasPunVen();
			
			presupuestoventaspunvenLocal=presupuestoventaspunvenReturnGeneral.getPresupuestoVentasPunVen();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && presupuestoventaspunvenLocal.getId()!=null && !presupuestoventaspunvenLocal.getId().equals(0L))) {presupuestoventaspunvenBean.setId(presupuestoventaspunvenLocal.getId());}}
			if(conDefault || (!conDefault && presupuestoventaspunvenLocal.getid_caja()!=null && !presupuestoventaspunvenLocal.getid_caja().equals(-1L))) {presupuestoventaspunvenBean.setid_caja(presupuestoventaspunvenLocal.getid_caja());}
			if(conDefault || (!conDefault && presupuestoventaspunvenLocal.getvalor()!=null && !presupuestoventaspunvenLocal.getvalor().equals(0.0))) {presupuestoventaspunvenBean.setvalor(presupuestoventaspunvenLocal.getvalor());}
			if(conDefault || (!conDefault && presupuestoventaspunvenLocal.getcantidad()!=null && !presupuestoventaspunvenLocal.getcantidad().equals(0))) {presupuestoventaspunvenBean.setcantidad(presupuestoventaspunvenLocal.getcantidad());}
			if(conDefault || (!conDefault && presupuestoventaspunvenLocal.getporcentaje()!=null && !presupuestoventaspunvenLocal.getporcentaje().equals(0.0))) {presupuestoventaspunvenBean.setporcentaje(presupuestoventaspunvenLocal.getporcentaje());}
			if(conDefault || (!conDefault && presupuestoventaspunvenLocal.getcantidad_total()!=null && !presupuestoventaspunvenLocal.getcantidad_total().equals(0))) {presupuestoventaspunvenBean.setcantidad_total(presupuestoventaspunvenLocal.getcantidad_total());}
			if(conDefault || (!conDefault && presupuestoventaspunvenLocal.getvalor_total()!=null && !presupuestoventaspunvenLocal.getvalor_total().equals(0.0))) {presupuestoventaspunvenBean.setvalor_total(presupuestoventaspunvenLocal.getvalor_total());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxPresupuestoVentasPunVenGenerico(Long idPresupuestoVentasPunVenSeleccionado,JComboBox jComboBoxPresupuestoVentasPunVen,List<PresupuestoVentasPunVen> presupuestoventaspunvensLocal)throws Exception {
		try {
			PresupuestoVentasPunVen  presupuestoventaspunvenTemp=null;

			for(PresupuestoVentasPunVen presupuestoventaspunvenAux:presupuestoventaspunvensLocal) {
				if(presupuestoventaspunvenAux.getId()!=null && presupuestoventaspunvenAux.getId().equals(idPresupuestoVentasPunVenSeleccionado)) {
					presupuestoventaspunvenTemp=presupuestoventaspunvenAux;
					break;
				}
			}

			jComboBoxPresupuestoVentasPunVen.setSelectedItem(presupuestoventaspunvenTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxPresupuestoVentasPunVenGenerico(JComboBox jComboBoxPresupuestoVentasPunVen,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxPresupuestoVentasPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPresupuestoVentasPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxPresupuestoVentasPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPresupuestoVentasPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPresupuestoVentasPunVen.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxPresupuestoVentasPunVen.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPresupuestoVentasPunVen.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxPresupuestoVentasPunVen.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxPresupuestoVentasPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxPresupuestoVentasPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			presupuestoventaspunven=(PresupuestoVentasPunVen) presupuestoventaspunvenLogic.getPresupuestoVentasPunVens().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			presupuestoventaspunven =(PresupuestoVentasPunVen) presupuestoventaspunvens.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!presupuestoventaspunven.getIsNew() && !presupuestoventaspunven.getIsChanged() && !presupuestoventaspunven.getIsDeleted()) {
				sDescripcion=presupuestoventaspunven.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=presupuestoventaspunven.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!presupuestoventaspunven.getIsNew() && !presupuestoventaspunven.getIsChanged() && !presupuestoventaspunven.getIsDeleted()) {
				sDescripcion=presupuestoventaspunven.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=presupuestoventaspunven.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Ejercicio")) {
			//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
			if(!presupuestoventaspunven.getIsNew() && !presupuestoventaspunven.getIsChanged() && !presupuestoventaspunven.getIsDeleted()) {
				sDescripcion=presupuestoventaspunven.getejercicio_descripcion();
			} else {
				//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
				sDescripcion=presupuestoventaspunven.getejercicio_descripcion();
			}
		}

		if(sTipo.equals("Periodo")) {
			//sDescripcion=this.getActualPeriodoForeignKeyDescripcion((Long)value);
			if(!presupuestoventaspunven.getIsNew() && !presupuestoventaspunven.getIsChanged() && !presupuestoventaspunven.getIsDeleted()) {
				sDescripcion=presupuestoventaspunven.getperiodo_descripcion();
			} else {
				//sDescripcion=this.getActualPeriodoForeignKeyDescripcion((Long)value);
				sDescripcion=presupuestoventaspunven.getperiodo_descripcion();
			}
		}

		if(sTipo.equals("Caja")) {
			//sDescripcion=this.getActualCajaForeignKeyDescripcion((Long)value);
			if(!presupuestoventaspunven.getIsNew() && !presupuestoventaspunven.getIsChanged() && !presupuestoventaspunven.getIsDeleted()) {
				sDescripcion=presupuestoventaspunven.getcaja_descripcion();
			} else {
				//sDescripcion=this.getActualCajaForeignKeyDescripcion((Long)value);
				sDescripcion=presupuestoventaspunven.getcaja_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		PresupuestoVentasPunVen presupuestoventaspunvenRow=new PresupuestoVentasPunVen();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			presupuestoventaspunvenRow=(PresupuestoVentasPunVen) presupuestoventaspunvenLogic.getPresupuestoVentasPunVens().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			presupuestoventaspunvenRow=(PresupuestoVentasPunVen) presupuestoventaspunvens.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualPresupuestoVentasPunVen(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoPresupuestoVentasPunVen.setVisible((this.isVisibilidadCeldaNuevoPresupuestoVentasPunVen && this.isPermisoNuevoPresupuestoVentasPunVen));			
			this.jButtonDuplicarPresupuestoVentasPunVen.setVisible((this.isVisibilidadCeldaDuplicarPresupuestoVentasPunVen && this.isPermisoDuplicarPresupuestoVentasPunVen));			
			this.jButtonCopiarPresupuestoVentasPunVen.setVisible((this.isVisibilidadCeldaCopiarPresupuestoVentasPunVen && this.isPermisoCopiarPresupuestoVentasPunVen));
			this.jButtonVerFormPresupuestoVentasPunVen.setVisible((this.isVisibilidadCeldaVerFormPresupuestoVentasPunVen && this.isPermisoVerFormPresupuestoVentasPunVen));
			
			this.jButtonAbrirOrderByPresupuestoVentasPunVen.setVisible((this.isVisibilidadCeldaOrdenPresupuestoVentasPunVen && this.isPermisoOrdenPresupuestoVentasPunVen));			
			
			this.jButtonNuevoRelacionesPresupuestoVentasPunVen.setVisible((this.isVisibilidadCeldaNuevoRelacionesPresupuestoVentasPunVen && this.isPermisoNuevoPresupuestoVentasPunVen));			
			this.jButtonNuevoGuardarCambiosPresupuestoVentasPunVen.setVisible((this.isVisibilidadCeldaNuevoPresupuestoVentasPunVen && this.isPermisoNuevoPresupuestoVentasPunVen && this.isPermisoGuardarCambiosPresupuestoVentasPunVen));
			
			if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen!=null) {
			this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonModificarPresupuestoVentasPunVen.setVisible((this.isVisibilidadCeldaModificarPresupuestoVentasPunVen && this.isPermisoActualizarPresupuestoVentasPunVen));	
			this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonActualizarPresupuestoVentasPunVen.setVisible((this.isVisibilidadCeldaActualizarPresupuestoVentasPunVen && this.isPermisoActualizarPresupuestoVentasPunVen));	
			this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonEliminarPresupuestoVentasPunVen.setVisible((this.isVisibilidadCeldaEliminarPresupuestoVentasPunVen && this.isPermisoEliminarPresupuestoVentasPunVen));
			this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonCancelarPresupuestoVentasPunVen.setVisible(this.isVisibilidadCeldaCancelarPresupuestoVentasPunVen);							
			this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonGuardarCambiosPresupuestoVentasPunVen.setVisible((this.isVisibilidadCeldaGuardarPresupuestoVentasPunVen && this.isPermisoGuardarCambiosPresupuestoVentasPunVen));			
			
			}
						
			this.jButtonGuardarCambiosTablaPresupuestoVentasPunVen.setVisible((this.isVisibilidadCeldaGuardarCambiosPresupuestoVentasPunVen && this.isPermisoGuardarCambiosPresupuestoVentasPunVen));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarPresupuestoVentasPunVen.setVisible((this.isVisibilidadCeldaNuevoPresupuestoVentasPunVen && this.isPermisoNuevoPresupuestoVentasPunVen));						
			this.jButtonDuplicarToolBarPresupuestoVentasPunVen.setVisible((this.isVisibilidadCeldaDuplicarPresupuestoVentasPunVen && this.isPermisoDuplicarPresupuestoVentasPunVen));						
			this.jButtonCopiarToolBarPresupuestoVentasPunVen.setVisible((this.isVisibilidadCeldaCopiarPresupuestoVentasPunVen && this.isPermisoCopiarPresupuestoVentasPunVen));			
			this.jButtonVerFormToolBarPresupuestoVentasPunVen.setVisible((this.isVisibilidadCeldaVerFormPresupuestoVentasPunVen && this.isPermisoVerFormPresupuestoVentasPunVen));			
			this.jButtonAbrirOrderByToolBarPresupuestoVentasPunVen.setVisible((this.isVisibilidadCeldaOrdenPresupuestoVentasPunVen && this.isPermisoOrdenPresupuestoVentasPunVen));
			this.jButtonNuevoRelacionesToolBarPresupuestoVentasPunVen.setVisible((this.isVisibilidadCeldaNuevoRelacionesPresupuestoVentasPunVen && this.isPermisoNuevoPresupuestoVentasPunVen));			
			this.jButtonNuevoGuardarCambiosToolBarPresupuestoVentasPunVen.setVisible((this.isVisibilidadCeldaNuevoPresupuestoVentasPunVen && this.isPermisoNuevoPresupuestoVentasPunVen && this.isPermisoGuardarCambiosPresupuestoVentasPunVen));			
			
			if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen!=null) {
			this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonModificarToolBarPresupuestoVentasPunVen.setVisible((this.isVisibilidadCeldaModificarPresupuestoVentasPunVen && this.isPermisoActualizarPresupuestoVentasPunVen));	
			this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonActualizarToolBarPresupuestoVentasPunVen.setVisible((this.isVisibilidadCeldaActualizarPresupuestoVentasPunVen  && this.isPermisoActualizarPresupuestoVentasPunVen));	
			this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonEliminarToolBarPresupuestoVentasPunVen.setVisible((this.isVisibilidadCeldaEliminarPresupuestoVentasPunVen && this.isPermisoEliminarPresupuestoVentasPunVen));
			this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonCancelarToolBarPresupuestoVentasPunVen.setVisible(this.isVisibilidadCeldaCancelarPresupuestoVentasPunVen);				
			this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonGuardarCambiosToolBarPresupuestoVentasPunVen.setVisible((this.isVisibilidadCeldaGuardarPresupuestoVentasPunVen && this.isPermisoGuardarCambiosPresupuestoVentasPunVen));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarPresupuestoVentasPunVen.setVisible((this.isVisibilidadCeldaGuardarCambiosPresupuestoVentasPunVen && this.isPermisoGuardarCambiosPresupuestoVentasPunVen));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoPresupuestoVentasPunVen.setVisible((this.isVisibilidadCeldaNuevoPresupuestoVentasPunVen && this.isPermisoNuevoPresupuestoVentasPunVen));			
			this.jMenuItemDuplicarPresupuestoVentasPunVen.setVisible((this.isVisibilidadCeldaDuplicarPresupuestoVentasPunVen && this.isPermisoDuplicarPresupuestoVentasPunVen));			
			this.jMenuItemCopiarPresupuestoVentasPunVen.setVisible((this.isVisibilidadCeldaCopiarPresupuestoVentasPunVen && this.isPermisoCopiarPresupuestoVentasPunVen));			
			this.jMenuItemVerFormPresupuestoVentasPunVen.setVisible((this.isVisibilidadCeldaVerFormPresupuestoVentasPunVen && this.isPermisoVerFormPresupuestoVentasPunVen));			
			this.jMenuItemAbrirOrderByPresupuestoVentasPunVen.setVisible((this.isVisibilidadCeldaOrdenPresupuestoVentasPunVen && this.isPermisoOrdenPresupuestoVentasPunVen));			
			//this.jMenuItemMostrarOcultarPresupuestoVentasPunVen.setVisible((this.isVisibilidadCeldaOrdenPresupuestoVentasPunVen && this.isPermisoOrdenPresupuestoVentasPunVen));
			this.jMenuItemDetalleAbrirOrderByPresupuestoVentasPunVen.setVisible((this.isVisibilidadCeldaOrdenPresupuestoVentasPunVen && this.isPermisoOrdenPresupuestoVentasPunVen));			
			//this.jMenuItemDetalleMostrarOcultarPresupuestoVentasPunVen.setVisible((this.isVisibilidadCeldaOrdenPresupuestoVentasPunVen && this.isPermisoOrdenPresupuestoVentasPunVen));			
			this.jMenuItemNuevoRelacionesPresupuestoVentasPunVen.setVisible((this.isVisibilidadCeldaNuevoRelacionesPresupuestoVentasPunVen && this.isPermisoNuevoPresupuestoVentasPunVen));			
			this.jMenuItemNuevoGuardarCambiosPresupuestoVentasPunVen.setVisible((this.isVisibilidadCeldaNuevoPresupuestoVentasPunVen && this.isPermisoNuevoPresupuestoVentasPunVen && this.isPermisoGuardarCambiosPresupuestoVentasPunVen));									
			
			if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen!=null) {
			this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jMenuItemModificarPresupuestoVentasPunVen.setVisible((this.isVisibilidadCeldaModificarPresupuestoVentasPunVen && this.isPermisoActualizarPresupuestoVentasPunVen));	
			this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jMenuItemActualizarPresupuestoVentasPunVen.setVisible((this.isVisibilidadCeldaActualizarPresupuestoVentasPunVen && this.isPermisoActualizarPresupuestoVentasPunVen));	
			this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jMenuItemEliminarPresupuestoVentasPunVen.setVisible((this.isVisibilidadCeldaEliminarPresupuestoVentasPunVen && this.isPermisoEliminarPresupuestoVentasPunVen));
			this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jMenuItemCancelarPresupuestoVentasPunVen.setVisible(this.isVisibilidadCeldaCancelarPresupuestoVentasPunVen);				
			}
			
			this.jMenuItemGuardarCambiosPresupuestoVentasPunVen.setVisible((this.isVisibilidadCeldaGuardarPresupuestoVentasPunVen && this.isPermisoGuardarCambiosPresupuestoVentasPunVen));						
			this.jMenuItemGuardarCambiosTablaPresupuestoVentasPunVen.setVisible((this.isVisibilidadCeldaGuardarCambiosPresupuestoVentasPunVen && this.isPermisoGuardarCambiosPresupuestoVentasPunVen));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoPresupuestoVentasPunVen=this.jButtonNuevoPresupuestoVentasPunVen.isVisible();
			this.isVisibilidadCeldaDuplicarPresupuestoVentasPunVen=this.jButtonDuplicarPresupuestoVentasPunVen.isVisible();
			this.isVisibilidadCeldaCopiarPresupuestoVentasPunVen=this.jButtonCopiarPresupuestoVentasPunVen.isVisible();
			this.isVisibilidadCeldaVerFormPresupuestoVentasPunVen=this.jButtonVerFormPresupuestoVentasPunVen.isVisible();
			
			this.isVisibilidadCeldaOrdenPresupuestoVentasPunVen=this.jButtonAbrirOrderByPresupuestoVentasPunVen.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesPresupuestoVentasPunVen=this.jButtonNuevoRelacionesPresupuestoVentasPunVen.isVisible();
			this.isVisibilidadCeldaModificarPresupuestoVentasPunVen=this.jButtonModificarPresupuestoVentasPunVen.isVisible();
			
			if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen!=null) {
			this.isVisibilidadCeldaActualizarPresupuestoVentasPunVen=this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonActualizarPresupuestoVentasPunVen.isVisible();
			this.isVisibilidadCeldaEliminarPresupuestoVentasPunVen=this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonEliminarPresupuestoVentasPunVen.isVisible();
			this.isVisibilidadCeldaCancelarPresupuestoVentasPunVen=this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonCancelarPresupuestoVentasPunVen.isVisible();
			this.isVisibilidadCeldaGuardarPresupuestoVentasPunVen=this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonGuardarCambiosPresupuestoVentasPunVen.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosPresupuestoVentasPunVen=this.jButtonGuardarCambiosTablaPresupuestoVentasPunVen.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoPresupuestoVentasPunVen=this.jButtonNuevoToolBarPresupuestoVentasPunVen.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPresupuestoVentasPunVen=this.jButtonNuevoRelacionesToolBarPresupuestoVentasPunVen.isVisible();
			
			if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen!=null) {
			this.isVisibilidadCeldaModificarPresupuestoVentasPunVen=this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonModificarToolBarPresupuestoVentasPunVen.isVisible();
			this.isVisibilidadCeldaActualizarPresupuestoVentasPunVen=this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonActualizarToolBarPresupuestoVentasPunVen.isVisible();
			this.isVisibilidadCeldaEliminarPresupuestoVentasPunVen=this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonEliminarToolBarPresupuestoVentasPunVen.isVisible();
			this.isVisibilidadCeldaCancelarPresupuestoVentasPunVen=this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonCancelarToolBarPresupuestoVentasPunVen.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPresupuestoVentasPunVen=this.jButtonGuardarCambiosToolBarPresupuestoVentasPunVen.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPresupuestoVentasPunVen=this.jButtonGuardarCambiosTablaToolBarPresupuestoVentasPunVen.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoPresupuestoVentasPunVen=this.jMenuItemNuevoPresupuestoVentasPunVen.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPresupuestoVentasPunVen=this.jMenuItemNuevoRelacionesPresupuestoVentasPunVen.isVisible();
			
			if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen!=null) {
			this.isVisibilidadCeldaModificarPresupuestoVentasPunVen=this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jMenuItemModificarPresupuestoVentasPunVen.isVisible();
			this.isVisibilidadCeldaActualizarPresupuestoVentasPunVen=this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jMenuItemActualizarPresupuestoVentasPunVen.isVisible();
			this.isVisibilidadCeldaEliminarPresupuestoVentasPunVen=this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jMenuItemEliminarPresupuestoVentasPunVen.isVisible();
			this.isVisibilidadCeldaCancelarPresupuestoVentasPunVen=this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jMenuItemCancelarPresupuestoVentasPunVen.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPresupuestoVentasPunVen=this.jMenuItemGuardarCambiosPresupuestoVentasPunVen.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPresupuestoVentasPunVen=this.jMenuItemGuardarCambiosTablaPresupuestoVentasPunVen.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesPresupuestoVentasPunVen(Boolean esInicializar) {
		if(PresupuestoVentasPunVenJInternalFrame.ISBINDING_MANUAL) {			
			if(this.presupuestoventaspunvenSessionBean.getConGuardarRelaciones()) {
				//if(this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesPresupuestoVentasPunVen();
			}
			
			this.inicializarActualizarBindingBotonesManualPresupuestoVentasPunVen(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualPresupuestoVentasPunVen() {
		this.jButtonNuevoPresupuestoVentasPunVen.setVisible(this.isPermisoNuevoPresupuestoVentasPunVen);			
		this.jButtonDuplicarPresupuestoVentasPunVen.setVisible(this.isPermisoDuplicarPresupuestoVentasPunVen);			
		this.jButtonCopiarPresupuestoVentasPunVen.setVisible(this.isPermisoCopiarPresupuestoVentasPunVen);			
		this.jButtonVerFormPresupuestoVentasPunVen.setVisible(this.isPermisoVerFormPresupuestoVentasPunVen);			
		
		this.jButtonAbrirOrderByPresupuestoVentasPunVen.setVisible(this.isPermisoOrdenPresupuestoVentasPunVen);					
		
		this.jButtonNuevoRelacionesPresupuestoVentasPunVen.setVisible(this.isPermisoNuevoPresupuestoVentasPunVen);			
		
		if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonModificarPresupuestoVentasPunVen.setVisible(this.isPermisoActualizarPresupuestoVentasPunVen);	
			this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonActualizarPresupuestoVentasPunVen.setVisible(this.isPermisoActualizarPresupuestoVentasPunVen);	
			this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonEliminarPresupuestoVentasPunVen.setVisible(this.isPermisoEliminarPresupuestoVentasPunVen);
			this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonCancelarPresupuestoVentasPunVen.setVisible(this.isVisibilidadCeldaCancelarPresupuestoVentasPunVen);						
			this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonGuardarCambiosPresupuestoVentasPunVen.setVisible(this.isPermisoGuardarCambiosPresupuestoVentasPunVen);							
		}
		
		this.jButtonGuardarCambiosTablaPresupuestoVentasPunVen.setVisible(this.isPermisoActualizarPresupuestoVentasPunVen);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetallePresupuestoVentasPunVen() {
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonModificarPresupuestoVentasPunVen.setVisible(this.isPermisoActualizarPresupuestoVentasPunVen);	
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonActualizarPresupuestoVentasPunVen.setVisible(this.isPermisoActualizarPresupuestoVentasPunVen);	
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonEliminarPresupuestoVentasPunVen.setVisible(this.isPermisoEliminarPresupuestoVentasPunVen);
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonCancelarPresupuestoVentasPunVen.setVisible(this.isVisibilidadCeldaCancelarPresupuestoVentasPunVen);							
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonGuardarCambiosPresupuestoVentasPunVen.setVisible((this.isVisibilidadCeldaGuardarPresupuestoVentasPunVen && this.isPermisoGuardarCambiosPresupuestoVentasPunVen));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosPresupuestoVentasPunVen() {
		if(PresupuestoVentasPunVenJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualPresupuestoVentasPunVen();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesPresupuestoVentasPunVen() {
	}
	
	public void jTableDatosPresupuestoVentasPunVenListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarPresupuestoVentasPunVen(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidPresupuestoVentasPunVenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventaspunvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestoVentasPunVen.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresupuestoVentasPunVen(this.getpresupuestoventaspunven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoVentasPunVen(this.presupuestoventaspunven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestoventaspunven =(PresupuestoVentasPunVen) this.presupuestoventaspunvenLogic.getPresupuestoVentasPunVens().toArray()[this.jTableDatosPresupuestoVentasPunVen.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presupuestoventaspunven =(PresupuestoVentasPunVen) this.presupuestoventaspunvens.toArray()[this.jTableDatosPresupuestoVentasPunVen.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presupuestoventaspunven==null) {
						this.presupuestoventaspunven = new PresupuestoVentasPunVen();
					}

					this.setVariablesFormularioToObjetoActualPresupuestoVentasPunVen(this.presupuestoventaspunven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoVentasPunVen(this.presupuestoventaspunven);
				}

				if(this.presupuestoventaspunven.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.presupuestoventaspunven.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresupuestoVentasPunVen(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventaspunvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventaspunvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventaspunvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaPresupuestoVentasPunVenUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventaspunvenLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebPresupuestoVentasPunVen(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestoVentasPunVen.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPresupuestoVentasPunVen.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPresupuestoVentasPunVen.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventaspunven =(PresupuestoVentasPunVen) this.presupuestoventaspunvenLogic.getPresupuestoVentasPunVens().toArray()[this.jTableDatosPresupuestoVentasPunVen.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.presupuestoventaspunven =(PresupuestoVentasPunVen) this.presupuestoventaspunvens.toArray()[this.jTableDatosPresupuestoVentasPunVen.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPresupuestoVentasPunVen(this.getpresupuestoventaspunven(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoVentasPunVen(this.presupuestoventaspunven);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.presupuestoventaspunvenLogic.getConnexion());

				if(this.presupuestoventaspunven.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.presupuestoventaspunven.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPresupuestoVentasPunVen=(TitledBorder)this.jScrollPanelDatosPresupuestoVentasPunVen.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderPresupuestoVentasPunVen.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventaspunvenLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventaspunvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventaspunvenLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaPresupuestoVentasPunVenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventaspunvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestoVentasPunVen.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresupuestoVentasPunVen(this.getpresupuestoventaspunven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoVentasPunVen(this.presupuestoventaspunven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestoventaspunven =(PresupuestoVentasPunVen) this.presupuestoventaspunvenLogic.getPresupuestoVentasPunVens().toArray()[this.jTableDatosPresupuestoVentasPunVen.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presupuestoventaspunven =(PresupuestoVentasPunVen) this.presupuestoventaspunvens.toArray()[this.jTableDatosPresupuestoVentasPunVen.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presupuestoventaspunven==null) {
						this.presupuestoventaspunven = new PresupuestoVentasPunVen();
					}

					this.setVariablesFormularioToObjetoActualPresupuestoVentasPunVen(this.presupuestoventaspunven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoVentasPunVen(this.presupuestoventaspunven);
				}

				if(this.presupuestoventaspunven.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.presupuestoventaspunven.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresupuestoVentasPunVen(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventaspunvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventaspunvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventaspunvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalPresupuestoVentasPunVenUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventaspunvenLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebPresupuestoVentasPunVen(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestoVentasPunVen.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPresupuestoVentasPunVen.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPresupuestoVentasPunVen.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventaspunven =(PresupuestoVentasPunVen) this.presupuestoventaspunvenLogic.getPresupuestoVentasPunVens().toArray()[this.jTableDatosPresupuestoVentasPunVen.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.presupuestoventaspunven =(PresupuestoVentasPunVen) this.presupuestoventaspunvens.toArray()[this.jTableDatosPresupuestoVentasPunVen.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPresupuestoVentasPunVen(this.getpresupuestoventaspunven(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoVentasPunVen(this.presupuestoventaspunven);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.presupuestoventaspunvenLogic.getConnexion());

				if(this.presupuestoventaspunven.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.presupuestoventaspunven.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPresupuestoVentasPunVen=(TitledBorder)this.jScrollPanelDatosPresupuestoVentasPunVen.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderPresupuestoVentasPunVen.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventaspunvenLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventaspunvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventaspunvenLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalPresupuestoVentasPunVenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventaspunvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestoVentasPunVen.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresupuestoVentasPunVen(this.getpresupuestoventaspunven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoVentasPunVen(this.presupuestoventaspunven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestoventaspunven =(PresupuestoVentasPunVen) this.presupuestoventaspunvenLogic.getPresupuestoVentasPunVens().toArray()[this.jTableDatosPresupuestoVentasPunVen.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presupuestoventaspunven =(PresupuestoVentasPunVen) this.presupuestoventaspunvens.toArray()[this.jTableDatosPresupuestoVentasPunVen.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presupuestoventaspunven==null) {
						this.presupuestoventaspunven = new PresupuestoVentasPunVen();
					}

					this.setVariablesFormularioToObjetoActualPresupuestoVentasPunVen(this.presupuestoventaspunven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoVentasPunVen(this.presupuestoventaspunven);
				}

				if(this.presupuestoventaspunven.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.presupuestoventaspunven.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresupuestoVentasPunVen(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventaspunvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventaspunvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventaspunvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ejercicioPresupuestoVentasPunVenUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventaspunvenLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoejercicio=true;

			idTienePermisoejercicio=this.tienePermisosUsuarioEnPaginaWebPresupuestoVentasPunVen(EjercicioConstantesFunciones.CLASSNAME);

			if(idTienePermisoejercicio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestoVentasPunVen.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPresupuestoVentasPunVen.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPresupuestoVentasPunVen.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventaspunven =(PresupuestoVentasPunVen) this.presupuestoventaspunvenLogic.getPresupuestoVentasPunVens().toArray()[this.jTableDatosPresupuestoVentasPunVen.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.presupuestoventaspunven =(PresupuestoVentasPunVen) this.presupuestoventaspunvens.toArray()[this.jTableDatosPresupuestoVentasPunVen.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPresupuestoVentasPunVen(this.getpresupuestoventaspunven(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoVentasPunVen(this.presupuestoventaspunven);

				this.ejercicioBeanSwingJInternalFrame=new EjercicioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ejercicioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ejercicioBeanSwingJInternalFrame.getEjercicioLogic().setConnexion(this.presupuestoventaspunvenLogic.getConnexion());

				if(this.presupuestoventaspunven.getid_ejercicio()!=null) {
					this.ejercicioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ejercicioBeanSwingJInternalFrame.setIdActual(this.presupuestoventaspunven.getid_ejercicio());
					this.ejercicioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.inicializarActualizarBindingTablaEjercicio();
				}

				JInternalFrameBase jinternalFrame =this.ejercicioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPresupuestoVentasPunVen=(TitledBorder)this.jScrollPanelDatosPresupuestoVentasPunVen.getBorder();
				TitledBorder titledBorderejercicio=(TitledBorder)this.ejercicioBeanSwingJInternalFrame.jScrollPanelDatosEjercicio.getBorder();

				titledBorderejercicio.setTitle(titledBorderPresupuestoVentasPunVen.getTitle() + " -> Ejercicio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventaspunvenLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventaspunvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventaspunvenLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ejercicioPresupuestoVentasPunVenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventaspunvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestoVentasPunVen.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresupuestoVentasPunVen(this.getpresupuestoventaspunven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoVentasPunVen(this.presupuestoventaspunven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestoventaspunven =(PresupuestoVentasPunVen) this.presupuestoventaspunvenLogic.getPresupuestoVentasPunVens().toArray()[this.jTableDatosPresupuestoVentasPunVen.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presupuestoventaspunven =(PresupuestoVentasPunVen) this.presupuestoventaspunvens.toArray()[this.jTableDatosPresupuestoVentasPunVen.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presupuestoventaspunven==null) {
						this.presupuestoventaspunven = new PresupuestoVentasPunVen();
					}

					this.setVariablesFormularioToObjetoActualPresupuestoVentasPunVen(this.presupuestoventaspunven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoVentasPunVen(this.presupuestoventaspunven);
				}

				if(this.presupuestoventaspunven.getid_ejercicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ejercicio = "+this.presupuestoventaspunven.getid_ejercicio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresupuestoVentasPunVen(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventaspunvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventaspunvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventaspunvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_periodoPresupuestoVentasPunVenUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventaspunvenLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoperiodo=true;

			idTienePermisoperiodo=this.tienePermisosUsuarioEnPaginaWebPresupuestoVentasPunVen(PeriodoConstantesFunciones.CLASSNAME);

			if(idTienePermisoperiodo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestoVentasPunVen.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPresupuestoVentasPunVen.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPresupuestoVentasPunVen.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventaspunven =(PresupuestoVentasPunVen) this.presupuestoventaspunvenLogic.getPresupuestoVentasPunVens().toArray()[this.jTableDatosPresupuestoVentasPunVen.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.presupuestoventaspunven =(PresupuestoVentasPunVen) this.presupuestoventaspunvens.toArray()[this.jTableDatosPresupuestoVentasPunVen.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPresupuestoVentasPunVen(this.getpresupuestoventaspunven(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoVentasPunVen(this.presupuestoventaspunven);

				this.periodoBeanSwingJInternalFrame=new PeriodoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.periodoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.periodoBeanSwingJInternalFrame.getPeriodoLogic().setConnexion(this.presupuestoventaspunvenLogic.getConnexion());

				if(this.presupuestoventaspunven.getid_periodo()!=null) {
					this.periodoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.periodoBeanSwingJInternalFrame.setIdActual(this.presupuestoventaspunven.getid_periodo());
					this.periodoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.inicializarActualizarBindingTablaPeriodo();
				}

				JInternalFrameBase jinternalFrame =this.periodoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPresupuestoVentasPunVen=(TitledBorder)this.jScrollPanelDatosPresupuestoVentasPunVen.getBorder();
				TitledBorder titledBorderperiodo=(TitledBorder)this.periodoBeanSwingJInternalFrame.jScrollPanelDatosPeriodo.getBorder();

				titledBorderperiodo.setTitle(titledBorderPresupuestoVentasPunVen.getTitle() + " -> Periodo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventaspunvenLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventaspunvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventaspunvenLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_periodoPresupuestoVentasPunVenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventaspunvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestoVentasPunVen.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresupuestoVentasPunVen(this.getpresupuestoventaspunven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoVentasPunVen(this.presupuestoventaspunven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestoventaspunven =(PresupuestoVentasPunVen) this.presupuestoventaspunvenLogic.getPresupuestoVentasPunVens().toArray()[this.jTableDatosPresupuestoVentasPunVen.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presupuestoventaspunven =(PresupuestoVentasPunVen) this.presupuestoventaspunvens.toArray()[this.jTableDatosPresupuestoVentasPunVen.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presupuestoventaspunven==null) {
						this.presupuestoventaspunven = new PresupuestoVentasPunVen();
					}

					this.setVariablesFormularioToObjetoActualPresupuestoVentasPunVen(this.presupuestoventaspunven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoVentasPunVen(this.presupuestoventaspunven);
				}

				if(this.presupuestoventaspunven.getid_periodo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_periodo = "+this.presupuestoventaspunven.getid_periodo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresupuestoVentasPunVen(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventaspunvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventaspunvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventaspunvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_cajaPresupuestoVentasPunVenUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventaspunvenLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocaja=true;

			idTienePermisocaja=this.tienePermisosUsuarioEnPaginaWebPresupuestoVentasPunVen(CajaConstantesFunciones.CLASSNAME);

			if(idTienePermisocaja) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestoVentasPunVen.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPresupuestoVentasPunVen.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPresupuestoVentasPunVen.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventaspunven =(PresupuestoVentasPunVen) this.presupuestoventaspunvenLogic.getPresupuestoVentasPunVens().toArray()[this.jTableDatosPresupuestoVentasPunVen.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.presupuestoventaspunven =(PresupuestoVentasPunVen) this.presupuestoventaspunvens.toArray()[this.jTableDatosPresupuestoVentasPunVen.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPresupuestoVentasPunVen(this.getpresupuestoventaspunven(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoVentasPunVen(this.presupuestoventaspunven);

				this.cajaBeanSwingJInternalFrame=new CajaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.cajaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.cajaBeanSwingJInternalFrame.getCajaLogic().setConnexion(this.presupuestoventaspunvenLogic.getConnexion());

				if(this.presupuestoventaspunven.getid_caja()!=null) {
					this.cajaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.cajaBeanSwingJInternalFrame.setIdActual(this.presupuestoventaspunven.getid_caja());
					this.cajaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.cajaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.cajaBeanSwingJInternalFrame.inicializarActualizarBindingTablaCaja();
				}

				JInternalFrameBase jinternalFrame =this.cajaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPresupuestoVentasPunVen=(TitledBorder)this.jScrollPanelDatosPresupuestoVentasPunVen.getBorder();
				TitledBorder titledBordercaja=(TitledBorder)this.cajaBeanSwingJInternalFrame.jScrollPanelDatosCaja.getBorder();

				titledBordercaja.setTitle(titledBorderPresupuestoVentasPunVen.getTitle() + " -> Caja");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventaspunvenLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventaspunvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventaspunvenLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_cajaPresupuestoVentasPunVenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventaspunvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestoVentasPunVen.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresupuestoVentasPunVen(this.getpresupuestoventaspunven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoVentasPunVen(this.presupuestoventaspunven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestoventaspunven =(PresupuestoVentasPunVen) this.presupuestoventaspunvenLogic.getPresupuestoVentasPunVens().toArray()[this.jTableDatosPresupuestoVentasPunVen.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presupuestoventaspunven =(PresupuestoVentasPunVen) this.presupuestoventaspunvens.toArray()[this.jTableDatosPresupuestoVentasPunVen.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presupuestoventaspunven==null) {
						this.presupuestoventaspunven = new PresupuestoVentasPunVen();
					}

					this.setVariablesFormularioToObjetoActualPresupuestoVentasPunVen(this.presupuestoventaspunven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoVentasPunVen(this.presupuestoventaspunven);
				}

				if(this.presupuestoventaspunven.getid_caja()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_caja = "+this.presupuestoventaspunven.getid_caja().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresupuestoVentasPunVen(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventaspunvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventaspunvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventaspunvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalorPresupuestoVentasPunVenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventaspunvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestoVentasPunVen.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresupuestoVentasPunVen(this.getpresupuestoventaspunven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoVentasPunVen(this.presupuestoventaspunven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestoventaspunven =(PresupuestoVentasPunVen) this.presupuestoventaspunvenLogic.getPresupuestoVentasPunVens().toArray()[this.jTableDatosPresupuestoVentasPunVen.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presupuestoventaspunven =(PresupuestoVentasPunVen) this.presupuestoventaspunvens.toArray()[this.jTableDatosPresupuestoVentasPunVen.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presupuestoventaspunven==null) {
						this.presupuestoventaspunven = new PresupuestoVentasPunVen();
					}

					this.setVariablesFormularioToObjetoActualPresupuestoVentasPunVen(this.presupuestoventaspunven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoVentasPunVen(this.presupuestoventaspunven);
				}

				if(this.presupuestoventaspunven.getvalor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor = "+this.presupuestoventaspunven.getvalor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresupuestoVentasPunVen(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventaspunvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventaspunvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventaspunvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncantidadPresupuestoVentasPunVenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventaspunvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestoVentasPunVen.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresupuestoVentasPunVen(this.getpresupuestoventaspunven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoVentasPunVen(this.presupuestoventaspunven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestoventaspunven =(PresupuestoVentasPunVen) this.presupuestoventaspunvenLogic.getPresupuestoVentasPunVens().toArray()[this.jTableDatosPresupuestoVentasPunVen.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presupuestoventaspunven =(PresupuestoVentasPunVen) this.presupuestoventaspunvens.toArray()[this.jTableDatosPresupuestoVentasPunVen.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presupuestoventaspunven==null) {
						this.presupuestoventaspunven = new PresupuestoVentasPunVen();
					}

					this.setVariablesFormularioToObjetoActualPresupuestoVentasPunVen(this.presupuestoventaspunven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoVentasPunVen(this.presupuestoventaspunven);
				}

				if(this.presupuestoventaspunven.getcantidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cantidad = "+this.presupuestoventaspunven.getcantidad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresupuestoVentasPunVen(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventaspunvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventaspunvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventaspunvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonporcentajePresupuestoVentasPunVenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventaspunvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestoVentasPunVen.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresupuestoVentasPunVen(this.getpresupuestoventaspunven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoVentasPunVen(this.presupuestoventaspunven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestoventaspunven =(PresupuestoVentasPunVen) this.presupuestoventaspunvenLogic.getPresupuestoVentasPunVens().toArray()[this.jTableDatosPresupuestoVentasPunVen.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presupuestoventaspunven =(PresupuestoVentasPunVen) this.presupuestoventaspunvens.toArray()[this.jTableDatosPresupuestoVentasPunVen.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presupuestoventaspunven==null) {
						this.presupuestoventaspunven = new PresupuestoVentasPunVen();
					}

					this.setVariablesFormularioToObjetoActualPresupuestoVentasPunVen(this.presupuestoventaspunven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoVentasPunVen(this.presupuestoventaspunven);
				}

				if(this.presupuestoventaspunven.getporcentaje()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where porcentaje = "+this.presupuestoventaspunven.getporcentaje().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresupuestoVentasPunVen(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventaspunvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventaspunvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventaspunvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncantidad_totalPresupuestoVentasPunVenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventaspunvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestoVentasPunVen.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresupuestoVentasPunVen(this.getpresupuestoventaspunven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoVentasPunVen(this.presupuestoventaspunven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestoventaspunven =(PresupuestoVentasPunVen) this.presupuestoventaspunvenLogic.getPresupuestoVentasPunVens().toArray()[this.jTableDatosPresupuestoVentasPunVen.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presupuestoventaspunven =(PresupuestoVentasPunVen) this.presupuestoventaspunvens.toArray()[this.jTableDatosPresupuestoVentasPunVen.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presupuestoventaspunven==null) {
						this.presupuestoventaspunven = new PresupuestoVentasPunVen();
					}

					this.setVariablesFormularioToObjetoActualPresupuestoVentasPunVen(this.presupuestoventaspunven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoVentasPunVen(this.presupuestoventaspunven);
				}

				if(this.presupuestoventaspunven.getcantidad_total()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cantidad_total = "+this.presupuestoventaspunven.getcantidad_total().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresupuestoVentasPunVen(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventaspunvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventaspunvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventaspunvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor_totalPresupuestoVentasPunVenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventaspunvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestoVentasPunVen.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresupuestoVentasPunVen(this.getpresupuestoventaspunven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoVentasPunVen(this.presupuestoventaspunven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestoventaspunven =(PresupuestoVentasPunVen) this.presupuestoventaspunvenLogic.getPresupuestoVentasPunVens().toArray()[this.jTableDatosPresupuestoVentasPunVen.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presupuestoventaspunven =(PresupuestoVentasPunVen) this.presupuestoventaspunvens.toArray()[this.jTableDatosPresupuestoVentasPunVen.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presupuestoventaspunven==null) {
						this.presupuestoventaspunven = new PresupuestoVentasPunVen();
					}

					this.setVariablesFormularioToObjetoActualPresupuestoVentasPunVen(this.presupuestoventaspunven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoVentasPunVen(this.presupuestoventaspunven);
				}

				if(this.presupuestoventaspunven.getvalor_total()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor_total = "+this.presupuestoventaspunven.getvalor_total().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresupuestoVentasPunVen(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventaspunvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventaspunvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventaspunvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdCajaPresupuestoVentasPunVenActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventaspunvenLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPresupuestoVentasPunVen(false,false);

			this.getPresupuestoVentasPunVensFK_IdCaja();

			this.inicializarActualizarBindingPresupuestoVentasPunVen(false);

			//if(PresupuestoVentasPunVenBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPresupuestoVentasPunVen(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventaspunvenLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventaspunvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventaspunvenLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEjercicioPresupuestoVentasPunVenActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventaspunvenLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPresupuestoVentasPunVen(false,false);

			this.getPresupuestoVentasPunVensFK_IdEjercicio();

			this.inicializarActualizarBindingPresupuestoVentasPunVen(false);

			//if(PresupuestoVentasPunVenBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPresupuestoVentasPunVen(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventaspunvenLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventaspunvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventaspunvenLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaPresupuestoVentasPunVenActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventaspunvenLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPresupuestoVentasPunVen(false,false);

			this.getPresupuestoVentasPunVensFK_IdEmpresa();

			this.inicializarActualizarBindingPresupuestoVentasPunVen(false);

			//if(PresupuestoVentasPunVenBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPresupuestoVentasPunVen(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventaspunvenLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventaspunvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventaspunvenLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPeriodoPresupuestoVentasPunVenActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventaspunvenLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPresupuestoVentasPunVen(false,false);

			this.getPresupuestoVentasPunVensFK_IdPeriodo();

			this.inicializarActualizarBindingPresupuestoVentasPunVen(false);

			//if(PresupuestoVentasPunVenBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPresupuestoVentasPunVen(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventaspunvenLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventaspunvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventaspunvenLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalPresupuestoVentasPunVenActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventaspunvenLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPresupuestoVentasPunVen(false,false);

			this.getPresupuestoVentasPunVensFK_IdSucursal();

			this.inicializarActualizarBindingPresupuestoVentasPunVen(false);

			//if(PresupuestoVentasPunVenBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPresupuestoVentasPunVen(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventaspunvenLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventaspunvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoventaspunvenLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFramePresupuestoVentasPunVen() {
		if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen!=null) {
			this.jInternalFrameDetalleFormPresupuestoVentasPunVen.setVisible(false);	    			
			this.jInternalFrameDetalleFormPresupuestoVentasPunVen.dispose();
			this.jInternalFrameDetalleFormPresupuestoVentasPunVen=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoPresupuestoVentasPunVen!=null) {
			this.jInternalFrameReporteDinamicoPresupuestoVentasPunVen.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoPresupuestoVentasPunVen.dispose();
			this.jInternalFrameReporteDinamicoPresupuestoVentasPunVen=null;
		}
		
		if(this.jInternalFrameImportacionPresupuestoVentasPunVen!=null) {
			this.jInternalFrameImportacionPresupuestoVentasPunVen.setVisible(false);	    			
			this.jInternalFrameImportacionPresupuestoVentasPunVen.dispose();
			this.jInternalFrameImportacionPresupuestoVentasPunVen=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessPresupuestoVentasPunVen();
			
			PresupuestoVentasPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presupuestoventaspunven,new Object(),this.presupuestoventaspunvenParameterGeneral,this.presupuestoventaspunvenReturnGeneral);
			
			
			if(sTipo.equals("NuevoPresupuestoVentasPunVen")) {
				jButtonNuevoPresupuestoVentasPunVenActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarPresupuestoVentasPunVen")) {
				jButtonDuplicarPresupuestoVentasPunVenActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarPresupuestoVentasPunVen")) {
				jButtonCopiarPresupuestoVentasPunVenActionPerformed(evt);
			} else if(sTipo.equals("VerFormPresupuestoVentasPunVen")) {
				jButtonVerFormPresupuestoVentasPunVenActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarPresupuestoVentasPunVen")) {
				jButtonNuevoPresupuestoVentasPunVenActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarPresupuestoVentasPunVen")) {
				jButtonDuplicarPresupuestoVentasPunVenActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoPresupuestoVentasPunVen")) {
				jButtonNuevoPresupuestoVentasPunVenActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarPresupuestoVentasPunVen")) {
				jButtonDuplicarPresupuestoVentasPunVenActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesPresupuestoVentasPunVen")) {
				jButtonNuevoPresupuestoVentasPunVenActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarPresupuestoVentasPunVen")) {
				jButtonNuevoPresupuestoVentasPunVenActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesPresupuestoVentasPunVen")) {
				jButtonNuevoPresupuestoVentasPunVenActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarPresupuestoVentasPunVen")) {
				jButtonModificarPresupuestoVentasPunVenActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarPresupuestoVentasPunVen")) {
				jButtonModificarPresupuestoVentasPunVenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarPresupuestoVentasPunVen")) {
				jButtonModificarPresupuestoVentasPunVenActionPerformed(evt);
			} else if(sTipo.equals("ActualizarPresupuestoVentasPunVen")) {
				jButtonActualizarPresupuestoVentasPunVenActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarPresupuestoVentasPunVen")) {
				jButtonActualizarPresupuestoVentasPunVenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarPresupuestoVentasPunVen")) {
				jButtonActualizarPresupuestoVentasPunVenActionPerformed(evt);
			} else if(sTipo.equals("EliminarPresupuestoVentasPunVen")) {
				jButtonEliminarPresupuestoVentasPunVenActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarPresupuestoVentasPunVen")) {
				jButtonEliminarPresupuestoVentasPunVenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarPresupuestoVentasPunVen")) {
				jButtonEliminarPresupuestoVentasPunVenActionPerformed(evt);
			} else if(sTipo.equals("CancelarPresupuestoVentasPunVen")) {
				jButtonCancelarPresupuestoVentasPunVenActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarPresupuestoVentasPunVen")) {
				jButtonCancelarPresupuestoVentasPunVenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarPresupuestoVentasPunVen")) {
				jButtonCancelarPresupuestoVentasPunVenActionPerformed(evt);
			} else if(sTipo.equals("CerrarPresupuestoVentasPunVen")) {
				jButtonCerrarPresupuestoVentasPunVenActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarPresupuestoVentasPunVen")) {
				jButtonCerrarPresupuestoVentasPunVenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarPresupuestoVentasPunVen")) {
				jButtonCerrarPresupuestoVentasPunVenActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarPresupuestoVentasPunVen")) {
				jButtonMostrarOcultarPresupuestoVentasPunVenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarPresupuestoVentasPunVen")) {
				jButtonCancelarPresupuestoVentasPunVenActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosPresupuestoVentasPunVen")) {
				jButtonGuardarCambiosPresupuestoVentasPunVenActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarPresupuestoVentasPunVen")) {
				jButtonGuardarCambiosPresupuestoVentasPunVenActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarPresupuestoVentasPunVen")) {
				jButtonCopiarPresupuestoVentasPunVenActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarPresupuestoVentasPunVen")) {
				jButtonVerFormPresupuestoVentasPunVenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosPresupuestoVentasPunVen")) {
				jButtonGuardarCambiosPresupuestoVentasPunVenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarPresupuestoVentasPunVen")) {
				jButtonCopiarPresupuestoVentasPunVenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormPresupuestoVentasPunVen")) {
				jButtonVerFormPresupuestoVentasPunVenActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaPresupuestoVentasPunVen")) {
				jButtonGuardarCambiosPresupuestoVentasPunVenActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarPresupuestoVentasPunVen")) {
				jButtonGuardarCambiosPresupuestoVentasPunVenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaPresupuestoVentasPunVen")) {
				jButtonGuardarCambiosPresupuestoVentasPunVenActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionPresupuestoVentasPunVen")) {
				jButtonRecargarInformacionPresupuestoVentasPunVenActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarPresupuestoVentasPunVen")) {
				jButtonRecargarInformacionPresupuestoVentasPunVenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionPresupuestoVentasPunVen")) {
				jButtonRecargarInformacionPresupuestoVentasPunVenActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresPresupuestoVentasPunVen")) {
				jButtonAnterioresPresupuestoVentasPunVenActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarPresupuestoVentasPunVen")) {
				jButtonAnterioresPresupuestoVentasPunVenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnteriorePresupuestoVentasPunVen")) {
				jButtonAnterioresPresupuestoVentasPunVenActionPerformed(evt);
			} else if(sTipo.equals("SiguientesPresupuestoVentasPunVen")) {
				jButtonSiguientesPresupuestoVentasPunVenActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarPresupuestoVentasPunVen")) {
				jButtonSiguientesPresupuestoVentasPunVenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesPresupuestoVentasPunVen")) {
				jButtonSiguientesPresupuestoVentasPunVenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByPresupuestoVentasPunVen") || sTipo.equals("MenuItemDetalleAbrirOrderByPresupuestoVentasPunVen")) {
				jButtonAbrirOrderByPresupuestoVentasPunVenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarPresupuestoVentasPunVen") || sTipo.equals("MenuItemDetalleMostrarOcultarPresupuestoVentasPunVen")) {
				jButtonMostrarOcultarPresupuestoVentasPunVenActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosPresupuestoVentasPunVen")) {
				jButtonNuevoGuardarCambiosPresupuestoVentasPunVenActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarPresupuestoVentasPunVen")) {
				jButtonNuevoGuardarCambiosPresupuestoVentasPunVenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosPresupuestoVentasPunVen")) {
				jButtonNuevoGuardarCambiosPresupuestoVentasPunVenActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoPresupuestoVentasPunVen")) {
				jButtonCerrarReporteDinamicoPresupuestoVentasPunVenActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoPresupuestoVentasPunVen")) {
				jButtonGenerarReporteDinamicoPresupuestoVentasPunVenActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoPresupuestoVentasPunVen")) {
				
				jButtonGenerarExcelReporteDinamicoPresupuestoVentasPunVenActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionPresupuestoVentasPunVen")) {
				jButtonCerrarImportacionPresupuestoVentasPunVenActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionPresupuestoVentasPunVen")) {
				
				jButtonGenerarImportacionPresupuestoVentasPunVenActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionPresupuestoVentasPunVen")) {
				
				jButtonAbrirImportacionPresupuestoVentasPunVenActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesPresupuestoVentasPunVen")) {
				jComboBoxTiposAccionesPresupuestoVentasPunVenActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesPresupuestoVentasPunVen")) {
				jComboBoxTiposRelacionesPresupuestoVentasPunVenActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioPresupuestoVentasPunVen")) {
				jComboBoxTiposAccionesPresupuestoVentasPunVenActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarPresupuestoVentasPunVen")) {
				
				jComboBoxTiposSeleccionarPresupuestoVentasPunVenActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralPresupuestoVentasPunVen")) {
				jTextFieldValorCampoGeneralPresupuestoVentasPunVenActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByPresupuestoVentasPunVen")) {
				jButtonAbrirOrderByPresupuestoVentasPunVenActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarPresupuestoVentasPunVen")) {
				jButtonAbrirOrderByPresupuestoVentasPunVenActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByPresupuestoVentasPunVen")) {
				jButtonCerrarOrderByPresupuestoVentasPunVenActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPresupuestoVentasPunVenBusqueda")) {
				this.jButtonidPresupuestoVentasPunVenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaPresupuestoVentasPunVenUpdate")) {
				this.jButtonid_empresaPresupuestoVentasPunVenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaPresupuestoVentasPunVenBusqueda")) {
				this.jButtonid_empresaPresupuestoVentasPunVenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalPresupuestoVentasPunVenUpdate")) {
				this.jButtonid_sucursalPresupuestoVentasPunVenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalPresupuestoVentasPunVenBusqueda")) {
				this.jButtonid_sucursalPresupuestoVentasPunVenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioPresupuestoVentasPunVenUpdate")) {
				this.jButtonid_ejercicioPresupuestoVentasPunVenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioPresupuestoVentasPunVenBusqueda")) {
				this.jButtonid_ejercicioPresupuestoVentasPunVenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoPresupuestoVentasPunVenUpdate")) {
				this.jButtonid_periodoPresupuestoVentasPunVenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoPresupuestoVentasPunVenBusqueda")) {
				this.jButtonid_periodoPresupuestoVentasPunVenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cajaPresupuestoVentasPunVenUpdate")) {
				this.jButtonid_cajaPresupuestoVentasPunVenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cajaPresupuestoVentasPunVenBusqueda")) {
				this.jButtonid_cajaPresupuestoVentasPunVenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorPresupuestoVentasPunVenBusqueda")) {
				this.jButtonvalorPresupuestoVentasPunVenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidadPresupuestoVentasPunVenBusqueda")) {
				this.jButtoncantidadPresupuestoVentasPunVenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajePresupuestoVentasPunVenBusqueda")) {
				this.jButtonporcentajePresupuestoVentasPunVenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidad_totalPresupuestoVentasPunVenBusqueda")) {
				this.jButtoncantidad_totalPresupuestoVentasPunVenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_totalPresupuestoVentasPunVenBusqueda")) {
				this.jButtonvalor_totalPresupuestoVentasPunVenBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdCajaPresupuestoVentasPunVen")) {
				this.jButtonFK_IdCajaPresupuestoVentasPunVenActionPerformed(evt);
			}
			
			;
			
			
			PresupuestoVentasPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presupuestoventaspunven,new Object(),this.presupuestoventaspunvenParameterGeneral,this.presupuestoventaspunvenReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessPresupuestoVentasPunVen();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresupuestoVentasPunVenActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestoventaspunven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presupuestoventaspunven);
				
				PresupuestoVentasPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestoventaspunven,new Object(),this.presupuestoventaspunvenParameterGeneral,this.presupuestoventaspunvenReturnGeneral);
				
				


				
				PresupuestoVentasPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestoventaspunven,new Object(),this.presupuestoventaspunvenParameterGeneral,this.presupuestoventaspunvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresupuestoVentasPunVen.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresupuestoVentasPunVen.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			PresupuestoVentasPunVen presupuestoventaspunvenLocal=null;
			
			if(!this.getEsControlTabla()) {
				presupuestoventaspunvenLocal=this.presupuestoventaspunven;
			} else {
				presupuestoventaspunvenLocal=this.presupuestoventaspunvenAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestoventaspunven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presupuestoventaspunven);
				
				PresupuestoVentasPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestoventaspunven,new Object(),this.presupuestoventaspunvenParameterGeneral,this.presupuestoventaspunvenReturnGeneral);
							
				
				


				
				PresupuestoVentasPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestoventaspunven,new Object(),this.presupuestoventaspunvenParameterGeneral,this.presupuestoventaspunvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresupuestoVentasPunVen.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresupuestoVentasPunVen.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresupuestoVentasPunVenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPresupuestoVentasPunVen.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventaspunvenAnterior =(PresupuestoVentasPunVen) this.presupuestoventaspunvenLogic.getPresupuestoVentasPunVens().toArray()[this.jTableDatosPresupuestoVentasPunVen.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presupuestoventaspunvenAnterior =(PresupuestoVentasPunVen) this.presupuestoventaspunvens.toArray()[this.jTableDatosPresupuestoVentasPunVen.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
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
			
			PresupuestoVentasPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestoventaspunven,new Object(),this.presupuestoventaspunvenParameterGeneral,this.presupuestoventaspunvenReturnGeneral);
			
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
			
			


			
			PresupuestoVentasPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestoventaspunven,new Object(),this.presupuestoventaspunvenParameterGeneral,this.presupuestoventaspunvenReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresupuestoVentasPunVenActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestoventaspunven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presupuestoventaspunven);
				
				PresupuestoVentasPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestoventaspunven,new Object(),this.presupuestoventaspunvenParameterGeneral,this.presupuestoventaspunvenReturnGeneral);
								
						
				


				
				PresupuestoVentasPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestoventaspunven,new Object(),this.presupuestoventaspunvenParameterGeneral,this.presupuestoventaspunvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresupuestoVentasPunVen.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresupuestoVentasPunVen.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestoventaspunven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presupuestoventaspunven);
				
				PresupuestoVentasPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestoventaspunven,new Object(),this.presupuestoventaspunvenParameterGeneral,this.presupuestoventaspunvenReturnGeneral);
								
				
				


				
				PresupuestoVentasPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestoventaspunven,new Object(),this.presupuestoventaspunvenParameterGeneral,this.presupuestoventaspunvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresupuestoVentasPunVen.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresupuestoVentasPunVen.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresupuestoVentasPunVenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPresupuestoVentasPunVen.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventaspunvenAnterior =(PresupuestoVentasPunVen) this.presupuestoventaspunvenLogic.getPresupuestoVentasPunVens().toArray()[this.jTableDatosPresupuestoVentasPunVen.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presupuestoventaspunvenAnterior =(PresupuestoVentasPunVen) this.presupuestoventaspunvens.toArray()[this.jTableDatosPresupuestoVentasPunVen.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestoventaspunven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presupuestoventaspunven);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresupuestoVentasPunVenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPresupuestoVentasPunVen.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventaspunvenAnterior =(PresupuestoVentasPunVen) this.presupuestoventaspunvenLogic.getPresupuestoVentasPunVens().toArray()[this.jTableDatosPresupuestoVentasPunVen.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presupuestoventaspunvenAnterior =(PresupuestoVentasPunVen) this.presupuestoventaspunvens.toArray()[this.jTableDatosPresupuestoVentasPunVen.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresupuestoVentasPunVenActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestoventaspunven);
			
			this.actualizarInformacion("INFO_PADRE",false,this.presupuestoventaspunven);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestoventaspunven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presupuestoventaspunven);
				
				PresupuestoVentasPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestoventaspunven,new Object(),this.presupuestoventaspunvenParameterGeneral,this.presupuestoventaspunvenReturnGeneral);
							
				
				


				
				PresupuestoVentasPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestoventaspunven,new Object(),this.presupuestoventaspunvenParameterGeneral,this.presupuestoventaspunvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresupuestoVentasPunVen.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresupuestoVentasPunVen.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresupuestoVentasPunVenActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPresupuestoVentasPunVen.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestoventaspunvenAnterior =(PresupuestoVentasPunVen) this.presupuestoventaspunvenLogic.getPresupuestoVentasPunVens().toArray()[this.jTableDatosPresupuestoVentasPunVen.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.presupuestoventaspunvenAnterior =(PresupuestoVentasPunVen) this.presupuestoventaspunvens.toArray()[this.jTableDatosPresupuestoVentasPunVen.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
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
			
			PresupuestoVentasPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestoventaspunven,new Object(),this.presupuestoventaspunvenParameterGeneral,this.presupuestoventaspunvenReturnGeneral);
			
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
			
			


			
			PresupuestoVentasPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestoventaspunven,new Object(),this.presupuestoventaspunvenParameterGeneral,this.presupuestoventaspunvenReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresupuestoVentasPunVenActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestoventaspunven);
			
			this.actualizarInformacion("INFO_PADRE",false,this.presupuestoventaspunven);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestoventaspunven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presupuestoventaspunven);
				
				PresupuestoVentasPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestoventaspunven,new Object(),this.presupuestoventaspunvenParameterGeneral,this.presupuestoventaspunvenReturnGeneral);
								
				
				


				
				PresupuestoVentasPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestoventaspunven,new Object(),this.presupuestoventaspunvenParameterGeneral,this.presupuestoventaspunvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresupuestoVentasPunVen.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresupuestoVentasPunVen.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresupuestoVentasPunVenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPresupuestoVentasPunVen.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventaspunvenAnterior =(PresupuestoVentasPunVen) this.presupuestoventaspunvenLogic.getPresupuestoVentasPunVens().toArray()[this.jTableDatosPresupuestoVentasPunVen.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presupuestoventaspunvenAnterior =(PresupuestoVentasPunVen) this.presupuestoventaspunvens.toArray()[this.jTableDatosPresupuestoVentasPunVen.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresupuestoVentasPunVenActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestoventaspunven);
			
			this.actualizarInformacion("INFO_PADRE",false,this.presupuestoventaspunven);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresupuestoVentasPunVenActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestoventaspunven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presupuestoventaspunven);
				
				PresupuestoVentasPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presupuestoventaspunven,new Object(),this.presupuestoventaspunvenParameterGeneral,this.presupuestoventaspunvenReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosPresupuestoVentasPunVen")) {
					jCheckBoxSeleccionarTodosPresupuestoVentasPunVenItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosPresupuestoVentasPunVen")) {
					jCheckBoxSeleccionadosPresupuestoVentasPunVenItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarPresupuestoVentasPunVen")) {
					
				}
				
				


				
				
				PresupuestoVentasPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presupuestoventaspunven,new Object(),this.presupuestoventaspunvenParameterGeneral,this.presupuestoventaspunvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresupuestoVentasPunVen.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresupuestoVentasPunVen.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestoventaspunven);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.presupuestoventaspunven);
				
				PresupuestoVentasPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presupuestoventaspunven,new Object(),this.presupuestoventaspunvenParameterGeneral,this.presupuestoventaspunvenReturnGeneral);
												
				
				


				
				
				PresupuestoVentasPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presupuestoventaspunven,new Object(),this.presupuestoventaspunvenParameterGeneral,this.presupuestoventaspunvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresupuestoVentasPunVen.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresupuestoVentasPunVen.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresupuestoVentasPunVenActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPresupuestoVentasPunVen.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestoventaspunvenAnterior =(PresupuestoVentasPunVen) this.presupuestoventaspunvenLogic.getPresupuestoVentasPunVens().toArray()[this.jTableDatosPresupuestoVentasPunVen.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.presupuestoventaspunvenAnterior =(PresupuestoVentasPunVen) this.presupuestoventaspunvens.toArray()[this.jTableDatosPresupuestoVentasPunVen.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresupuestoVentasPunVenActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestoventaspunven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presupuestoventaspunven);
				
				PresupuestoVentasPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presupuestoventaspunven,new Object(),this.presupuestoventaspunvenParameterGeneral,this.presupuestoventaspunvenReturnGeneral);
				
				
				PresupuestoVentasPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presupuestoventaspunven,new Object(),this.presupuestoventaspunvenParameterGeneral,this.presupuestoventaspunvenReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
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
			
			PresupuestoVentasPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.presupuestoventaspunven,new Object(),this.presupuestoventaspunvenParameterGeneral,this.presupuestoventaspunvenReturnGeneral);
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
			
			


			
			PresupuestoVentasPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestoventaspunven,new Object(),this.presupuestoventaspunvenParameterGeneral,this.presupuestoventaspunvenReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresupuestoVentasPunVenActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestoventaspunven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presupuestoventaspunven);
				
				PresupuestoVentasPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.presupuestoventaspunven,new Object(),this.presupuestoventaspunvenParameterGeneral,this.presupuestoventaspunvenReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				PresupuestoVentasPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestoventaspunven,new Object(),this.presupuestoventaspunvenParameterGeneral,this.presupuestoventaspunvenReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresupuestoVentasPunVen.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresupuestoVentasPunVen.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestoventaspunven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presupuestoventaspunven);
				
				PresupuestoVentasPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.presupuestoventaspunven,new Object(),this.presupuestoventaspunvenParameterGeneral,this.presupuestoventaspunvenReturnGeneral);
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
				
				


				
				PresupuestoVentasPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestoventaspunven,new Object(),this.presupuestoventaspunvenParameterGeneral,this.presupuestoventaspunvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresupuestoVentasPunVen.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresupuestoVentasPunVen.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresupuestoVentasPunVenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPresupuestoVentasPunVen.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoventaspunvenAnterior =(PresupuestoVentasPunVen) this.presupuestoventaspunvenLogic.getPresupuestoVentasPunVens().toArray()[this.jTableDatosPresupuestoVentasPunVen.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presupuestoventaspunvenAnterior =(PresupuestoVentasPunVen) this.presupuestoventaspunvens.toArray()[this.jTableDatosPresupuestoVentasPunVen.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				PresupuestoVentasPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestoventaspunven,new Object(),this.presupuestoventaspunvenParameterGeneral,this.presupuestoventaspunvenReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarPresupuestoVentasPunVen")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosPresupuestoVentasPunVenListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosPresupuestoVentasPunVen.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.presupuestoventaspunven =(PresupuestoVentasPunVen) this.presupuestoventaspunvenLogic.getPresupuestoVentasPunVens().toArray()[this.jTableDatosPresupuestoVentasPunVen.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.presupuestoventaspunven =(PresupuestoVentasPunVen) this.presupuestoventaspunvens.toArray()[this.jTableDatosPresupuestoVentasPunVen.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.presupuestoventaspunven);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarPresupuestoVentasPunVen")) {
				
				}
				
				PresupuestoVentasPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestoventaspunven,new Object(),this.presupuestoventaspunvenParameterGeneral,this.presupuestoventaspunvenReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			PresupuestoVentasPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.presupuestoventaspunven,new Object(),this.presupuestoventaspunvenParameterGeneral,this.presupuestoventaspunvenReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarPresupuestoVentasPunVen")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosPresupuestoVentasPunVen.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarPresupuestoVentasPunVen")) {
			
			}
			
			PresupuestoVentasPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.presupuestoventaspunven,new Object(),this.presupuestoventaspunvenParameterGeneral,this.presupuestoventaspunvenReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessPresupuestoVentasPunVen();
			
			PresupuestoVentasPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presupuestoventaspunven,new Object(),this.presupuestoventaspunvenParameterGeneral,this.presupuestoventaspunvenReturnGeneral);
			
			if(sTipo.equals("NuevoPresupuestoVentasPunVen")) {
				jButtonNuevoPresupuestoVentasPunVenActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarPresupuestoVentasPunVen")) {
				jButtonDuplicarPresupuestoVentasPunVenActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarPresupuestoVentasPunVen")) {
				jButtonCopiarPresupuestoVentasPunVenActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormPresupuestoVentasPunVen")) {
				jButtonVerFormPresupuestoVentasPunVenActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesPresupuestoVentasPunVen")) {
				jButtonNuevoPresupuestoVentasPunVenActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarPresupuestoVentasPunVen")) {
				jButtonModificarPresupuestoVentasPunVenActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarPresupuestoVentasPunVen")) {
				jButtonActualizarPresupuestoVentasPunVenActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarPresupuestoVentasPunVen")) {
				jButtonEliminarPresupuestoVentasPunVenActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaPresupuestoVentasPunVen")) {
				jButtonGuardarCambiosPresupuestoVentasPunVenActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarPresupuestoVentasPunVen")) {
				jButtonCancelarPresupuestoVentasPunVenActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarPresupuestoVentasPunVen")) {
				jButtonCerrarPresupuestoVentasPunVenActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosPresupuestoVentasPunVen")) {
				jButtonGuardarCambiosPresupuestoVentasPunVenActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosPresupuestoVentasPunVen")) {
				jButtonNuevoGuardarCambiosPresupuestoVentasPunVenActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByPresupuestoVentasPunVen")) {
				jButtonAbrirOrderByPresupuestoVentasPunVenActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionPresupuestoVentasPunVen")) {
				jButtonRecargarInformacionPresupuestoVentasPunVenActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresPresupuestoVentasPunVen")) {
				jButtonAnterioresPresupuestoVentasPunVenActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesPresupuestoVentasPunVen")) {
				jButtonSiguientesPresupuestoVentasPunVenActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPresupuestoVentasPunVenBusqueda")) {
				this.jButtonidPresupuestoVentasPunVenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaPresupuestoVentasPunVenUpdate")) {
				this.jButtonid_empresaPresupuestoVentasPunVenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaPresupuestoVentasPunVenBusqueda")) {
				this.jButtonid_empresaPresupuestoVentasPunVenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalPresupuestoVentasPunVenUpdate")) {
				this.jButtonid_sucursalPresupuestoVentasPunVenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalPresupuestoVentasPunVenBusqueda")) {
				this.jButtonid_sucursalPresupuestoVentasPunVenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioPresupuestoVentasPunVenUpdate")) {
				this.jButtonid_ejercicioPresupuestoVentasPunVenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioPresupuestoVentasPunVenBusqueda")) {
				this.jButtonid_ejercicioPresupuestoVentasPunVenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoPresupuestoVentasPunVenUpdate")) {
				this.jButtonid_periodoPresupuestoVentasPunVenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoPresupuestoVentasPunVenBusqueda")) {
				this.jButtonid_periodoPresupuestoVentasPunVenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cajaPresupuestoVentasPunVenUpdate")) {
				this.jButtonid_cajaPresupuestoVentasPunVenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cajaPresupuestoVentasPunVenBusqueda")) {
				this.jButtonid_cajaPresupuestoVentasPunVenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorPresupuestoVentasPunVenBusqueda")) {
				this.jButtonvalorPresupuestoVentasPunVenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidadPresupuestoVentasPunVenBusqueda")) {
				this.jButtoncantidadPresupuestoVentasPunVenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajePresupuestoVentasPunVenBusqueda")) {
				this.jButtonporcentajePresupuestoVentasPunVenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidad_totalPresupuestoVentasPunVenBusqueda")) {
				this.jButtoncantidad_totalPresupuestoVentasPunVenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_totalPresupuestoVentasPunVenBusqueda")) {
				this.jButtonvalor_totalPresupuestoVentasPunVenBusquedaActionPerformed(evt);
			}
			
			PresupuestoVentasPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presupuestoventaspunven,new Object(),this.presupuestoventaspunvenParameterGeneral,this.presupuestoventaspunvenReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessPresupuestoVentasPunVen();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			PresupuestoVentasPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.presupuestoventaspunven,new Object(),this.presupuestoventaspunvenParameterGeneral,this.presupuestoventaspunvenReturnGeneral);
			
			if(sTipo.equals("CloseInternalFramePresupuestoVentasPunVen")) {
				closingInternalFramePresupuestoVentasPunVen();
				
			} else if(sTipo.equals("jButtonCancelarPresupuestoVentasPunVen")) {
				JInternalFrameBase jInternalFrameDetalleFormPresupuestoVentasPunVen = (JInternalFrameBase)evt.getSource();
	            	
	            PresupuestoVentasPunVenBeanSwingJInternalFrame jInternalFrameParent=(PresupuestoVentasPunVenBeanSwingJInternalFrame)jInternalFrameDetalleFormPresupuestoVentasPunVen.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarPresupuestoVentasPunVenActionPerformed(null);
			}
			
			PresupuestoVentasPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.presupuestoventaspunven,new Object(),this.presupuestoventaspunvenParameterGeneral,this.presupuestoventaspunvenReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormPresupuestoVentasPunVen(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormPresupuestoVentasPunVen(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormPresupuestoVentasPunVen(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.presupuestoventaspunven)) {
			if(!esControlTabla) {
				if(PresupuestoVentasPunVenJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualPresupuestoVentasPunVen(this.presupuestoventaspunven,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoVentasPunVen(this.presupuestoventaspunven);			
				}
				
				if(this.presupuestoventaspunvenSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualPresupuestoVentasPunVen(this.presupuestoventaspunven,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.presupuestoventaspunvenReturnGeneral=presupuestoventaspunvenLogic.procesarEventosPresupuestoVentasPunVensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.presupuestoventaspunvenLogic.getPresupuestoVentasPunVens(),this.presupuestoventaspunven,this.presupuestoventaspunvenParameterGeneral,this.isEsNuevoPresupuestoVentasPunVen,classes);//this.presupuestoventaspunvenLogic.getPresupuestoVentasPunVen()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanPresupuestoVentasPunVen(this.presupuestoventaspunvenReturnGeneral,this.presupuestoventaspunvenBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.presupuestoventaspunvenSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanPresupuestoVentasPunVen(classes,this.presupuestoventaspunvenReturnGeneral,this.presupuestoventaspunvenBean,false);
					}
						
					if(this.presupuestoventaspunvenReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyPresupuestoVentasPunVen(this.presupuestoventaspunvenReturnGeneral.getPresupuestoVentasPunVen());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioPresupuestoVentasPunVen(this.presupuestoventaspunvenReturnGeneral.getPresupuestoVentasPunVen());	
					}
						
					if(this.presupuestoventaspunvenReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioPresupuestoVentasPunVen(this.presupuestoventaspunvenReturnGeneral.getPresupuestoVentasPunVen(),classes);//this.presupuestoventaspunvenBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioPresupuestoVentasPunVen(this.presupuestoventaspunven,classes);//this.presupuestoventaspunvenBean);									
				}
			
				if(PresupuestoVentasPunVenJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualPresupuestoVentasPunVen(this.presupuestoventaspunven,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoVentasPunVen(this.presupuestoventaspunven);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.presupuestoventaspunvenAnterior!=null) {
						this.presupuestoventaspunven=this.presupuestoventaspunvenAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.presupuestoventaspunvenReturnGeneral=presupuestoventaspunvenLogic.procesarEventosPresupuestoVentasPunVensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.presupuestoventaspunvenLogic.getPresupuestoVentasPunVens(),this.presupuestoventaspunven,this.presupuestoventaspunvenParameterGeneral,this.isEsNuevoPresupuestoVentasPunVen,classes);//this.presupuestoventaspunvenLogic.getPresupuestoVentasPunVen()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.presupuestoventaspunvenSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.presupuestoventaspunvenReturnGeneral.getPresupuestoVentasPunVen(),presupuestoventaspunvenLogic.getPresupuestoVentasPunVens());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.presupuestoventaspunvenReturnGeneral.getPresupuestoVentasPunVen(),this.presupuestoventaspunvens);
				}
				//ARCHITECTURE
				
				//this.jTableDatosPresupuestoVentasPunVen.repaint();
				
				//((AbstractTableModel) this.jTableDatosPresupuestoVentasPunVen.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosPresupuestoVentasPunVen();
			}
		}
	}
	
	public void actualizarVisualTableDatosPresupuestoVentasPunVen() throws Exception {
		
		PresupuestoVentasPunVenModel presupuestoventaspunvenModel=(PresupuestoVentasPunVenModel)this.jTableDatosPresupuestoVentasPunVen.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			presupuestoventaspunvenModel.presupuestoventaspunvens=this.presupuestoventaspunvenLogic.getPresupuestoVentasPunVens();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			presupuestoventaspunvenModel.presupuestoventaspunvens=this.presupuestoventaspunvens;
		}
		
		
		((PresupuestoVentasPunVenModel) this.jTableDatosPresupuestoVentasPunVen.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaPresupuestoVentasPunVen() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getpresupuestoventaspunvenAnterior(),this.presupuestoventaspunvenLogic.getPresupuestoVentasPunVens());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getpresupuestoventaspunvenAnterior(),this.presupuestoventaspunvens);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosPresupuestoVentasPunVen();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioPresupuestoVentasPunVen(PresupuestoVentasPunVen presupuestoventaspunven,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
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
										
				PresupuestoVentasPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.presupuestoventaspunven,new Object(),generalEntityParameterGeneral,this.presupuestoventaspunvenReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.presupuestoventaspunvenSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=PresupuestoVentasPunVenConstantesFunciones.getClassesRelationshipsOfPresupuestoVentasPunVen(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=PresupuestoVentasPunVenConstantesFunciones.getClassesRelationshipsFromStringsOfPresupuestoVentasPunVen(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormPresupuestoVentasPunVen(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				PresupuestoVentasPunVenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.presupuestoventaspunven,new Object(),generalEntityParameterGeneral,this.presupuestoventaspunvenReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioPresupuestoVentasPunVen(PresupuestoVentasPunVenBean presupuestoventaspunvenBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanPresupuestoVentasPunVen(ArrayList<Classe> classes,PresupuestoVentasPunVenReturnGeneral presupuestoventaspunvenReturnGeneral,PresupuestoVentasPunVenBean presupuestoventaspunvenBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualPresupuestoVentasPunVen(PresupuestoVentasPunVen presupuestoventaspunven,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.presupuestoventaspunven)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen = new PresupuestoVentasPunVenDetalleFormJInternalFrame(jDesktopPane,this.presupuestoventaspunvenSessionBean.getConGuardarRelaciones(),this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormPresupuestoVentasPunVen);
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.setVisible(false);
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.setSelected(false);						
		
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.presupuestoventaspunvenLogic=this.presupuestoventaspunvenLogic;
		
		this.cargarCombosFrameForeignKeyPresupuestoVentasPunVen("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetallePresupuestoVentasPunVen();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePresupuestoVentasPunVen();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyPresupuestoVentasPunVen("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyPresupuestoVentasPunVen();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPresupuestoVentasPunVen"));
		
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonModificarPresupuestoVentasPunVen.addActionListener(new ButtonActionListener(this,"ModificarPresupuestoVentasPunVen"));

		
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonModificarToolBarPresupuestoVentasPunVen.addActionListener(new ButtonActionListener(this,"ModificarToolBarPresupuestoVentasPunVen"));
					
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jMenuItemModificarPresupuestoVentasPunVen.addActionListener(new ButtonActionListener(this,"MenuItemModificarPresupuestoVentasPunVen"));		
		
		
		
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonActualizarPresupuestoVentasPunVen.addActionListener (new ButtonActionListener(this,"ActualizarPresupuestoVentasPunVen"));
		
		
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonActualizarToolBarPresupuestoVentasPunVen.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPresupuestoVentasPunVen"));
						
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jMenuItemActualizarPresupuestoVentasPunVen.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPresupuestoVentasPunVen"));		
		
		
		
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonEliminarPresupuestoVentasPunVen.addActionListener (new ButtonActionListener(this,"EliminarPresupuestoVentasPunVen"));
		
		
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonEliminarToolBarPresupuestoVentasPunVen.addActionListener (new ButtonActionListener(this,"EliminarToolBarPresupuestoVentasPunVen"));
								
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jMenuItemEliminarPresupuestoVentasPunVen.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPresupuestoVentasPunVen"));		
		
		
		
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonCancelarPresupuestoVentasPunVen.addActionListener (new ButtonActionListener(this,"CancelarPresupuestoVentasPunVen"));
		
		
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonCancelarToolBarPresupuestoVentasPunVen.addActionListener (new ButtonActionListener(this,"CancelarToolBarPresupuestoVentasPunVen"));
					
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jMenuItemCancelarPresupuestoVentasPunVen.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPresupuestoVentasPunVen"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jMenuItemDetalleCerrarPresupuestoVentasPunVen.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPresupuestoVentasPunVen"));		
		
		
		
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonGuardarCambiosToolBarPresupuestoVentasPunVen.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPresupuestoVentasPunVen"));
		
		
		
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonGuardarCambiosToolBarPresupuestoVentasPunVen.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPresupuestoVentasPunVen"));
		
		
		
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxTiposAccionesFormularioPresupuestoVentasPunVen.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPresupuestoVentasPunVen"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonidPresupuestoVentasPunVenBusqueda.addActionListener(new ButtonActionListener(this,"idPresupuestoVentasPunVenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonid_empresaPresupuestoVentasPunVenUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPresupuestoVentasPunVenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonid_empresaPresupuestoVentasPunVenBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPresupuestoVentasPunVenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonid_sucursalPresupuestoVentasPunVenUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalPresupuestoVentasPunVenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonid_sucursalPresupuestoVentasPunVenBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalPresupuestoVentasPunVenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonid_ejercicioPresupuestoVentasPunVenUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioPresupuestoVentasPunVenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonid_ejercicioPresupuestoVentasPunVenBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioPresupuestoVentasPunVenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonid_periodoPresupuestoVentasPunVenUpdate.addActionListener(new ButtonActionListener(this,"id_periodoPresupuestoVentasPunVenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonid_periodoPresupuestoVentasPunVenBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoPresupuestoVentasPunVenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonid_cajaPresupuestoVentasPunVenUpdate.addActionListener(new ButtonActionListener(this,"id_cajaPresupuestoVentasPunVenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonid_cajaPresupuestoVentasPunVenBusqueda.addActionListener(new ButtonActionListener(this,"id_cajaPresupuestoVentasPunVenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonvalorPresupuestoVentasPunVenBusqueda.addActionListener(new ButtonActionListener(this,"valorPresupuestoVentasPunVenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtoncantidadPresupuestoVentasPunVenBusqueda.addActionListener(new ButtonActionListener(this,"cantidadPresupuestoVentasPunVenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonporcentajePresupuestoVentasPunVenBusqueda.addActionListener(new ButtonActionListener(this,"porcentajePresupuestoVentasPunVenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtoncantidad_totalPresupuestoVentasPunVenBusqueda.addActionListener(new ButtonActionListener(this,"cantidad_totalPresupuestoVentasPunVenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonvalor_totalPresupuestoVentasPunVenBusqueda.addActionListener(new ButtonActionListener(this,"valor_totalPresupuestoVentasPunVenBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jTabbedPaneRelacionesPresupuestoVentasPunVen.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPresupuestoVentasPunVen"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFramePresupuestoVentasPunVen"));
		
		if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresupuestoVentasPunVen.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPresupuestoVentasPunVen"));
		}
		
		this.jTableDatosPresupuestoVentasPunVen.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarPresupuestoVentasPunVen"));
		
		this.jTableDatosPresupuestoVentasPunVen.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarPresupuestoVentasPunVen"));
		
		this.jButtonNuevoPresupuestoVentasPunVen.addActionListener(new ButtonActionListener(this,"NuevoPresupuestoVentasPunVen"));
		
		this.jButtonDuplicarPresupuestoVentasPunVen.addActionListener(new ButtonActionListener(this,"DuplicarPresupuestoVentasPunVen"));
		
		this.jButtonCopiarPresupuestoVentasPunVen.addActionListener(new ButtonActionListener(this,"CopiarPresupuestoVentasPunVen"));
		
		this.jButtonVerFormPresupuestoVentasPunVen.addActionListener(new ButtonActionListener(this,"VerFormPresupuestoVentasPunVen"));
		
		
		this.jButtonNuevoToolBarPresupuestoVentasPunVen.addActionListener(new ButtonActionListener(this,"NuevoToolBarPresupuestoVentasPunVen"));
			
		this.jButtonDuplicarToolBarPresupuestoVentasPunVen.addActionListener(new ButtonActionListener(this,"DuplicarToolBarPresupuestoVentasPunVen"));
			
		this.jMenuItemNuevoPresupuestoVentasPunVen.addActionListener (new ButtonActionListener(this,"MenuItemNuevoPresupuestoVentasPunVen"));
			
		this.jMenuItemDuplicarPresupuestoVentasPunVen.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarPresupuestoVentasPunVen"));		
		
		
		this.jButtonNuevoRelacionesPresupuestoVentasPunVen.addActionListener (new ButtonActionListener(this,"NuevoRelacionesPresupuestoVentasPunVen"));
		
		
		this.jButtonNuevoRelacionesToolBarPresupuestoVentasPunVen.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarPresupuestoVentasPunVen"));
			
		this.jMenuItemNuevoRelacionesPresupuestoVentasPunVen.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesPresupuestoVentasPunVen"));		
		
		
		if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonModificarPresupuestoVentasPunVen.addActionListener(new ButtonActionListener(this,"ModificarPresupuestoVentasPunVen"));
		}
		
		
		if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonModificarToolBarPresupuestoVentasPunVen.addActionListener(new ButtonActionListener(this,"ModificarToolBarPresupuestoVentasPunVen"));
			
			this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jMenuItemModificarPresupuestoVentasPunVen.addActionListener(new ButtonActionListener(this,"MenuItemModificarPresupuestoVentasPunVen"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonActualizarPresupuestoVentasPunVen.addActionListener (new ButtonActionListener(this,"ActualizarPresupuestoVentasPunVen"));
		}
		
		
		if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonActualizarToolBarPresupuestoVentasPunVen.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPresupuestoVentasPunVen"));
				
			this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jMenuItemActualizarPresupuestoVentasPunVen.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPresupuestoVentasPunVen"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonEliminarPresupuestoVentasPunVen.addActionListener (new ButtonActionListener(this,"EliminarPresupuestoVentasPunVen"));
		}
		
		
		if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonEliminarToolBarPresupuestoVentasPunVen.addActionListener (new ButtonActionListener(this,"EliminarToolBarPresupuestoVentasPunVen"));
						
			this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jMenuItemEliminarPresupuestoVentasPunVen.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPresupuestoVentasPunVen"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonCancelarPresupuestoVentasPunVen.addActionListener (new ButtonActionListener(this,"CancelarPresupuestoVentasPunVen"));
		}
		
		
		if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonCancelarToolBarPresupuestoVentasPunVen.addActionListener (new ButtonActionListener(this,"CancelarToolBarPresupuestoVentasPunVen"));
			
			this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jMenuItemCancelarPresupuestoVentasPunVen.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPresupuestoVentasPunVen"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarPresupuestoVentasPunVen.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarPresupuestoVentasPunVen"));		
		
		
		this.jButtonCerrarPresupuestoVentasPunVen.addActionListener (new ButtonActionListener(this,"CerrarPresupuestoVentasPunVen"));
		
		
		this.jButtonCerrarToolBarPresupuestoVentasPunVen.addActionListener (new ButtonActionListener(this,"CerrarToolBarPresupuestoVentasPunVen"));
			
		this.jMenuItemCerrarPresupuestoVentasPunVen.addActionListener (new ButtonActionListener(this,"MenuItemCerrarPresupuestoVentasPunVen"));
			
		if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jMenuItemDetalleCerrarPresupuestoVentasPunVen.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPresupuestoVentasPunVen"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonGuardarCambiosPresupuestoVentasPunVen.addActionListener (new ButtonActionListener(this,"GuardarCambiosPresupuestoVentasPunVen"));
		}
		
		
		if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonGuardarCambiosToolBarPresupuestoVentasPunVen.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPresupuestoVentasPunVen"));
		}
		
		this.jButtonCopiarToolBarPresupuestoVentasPunVen.addActionListener (new ButtonActionListener(this,"CopiarToolBarPresupuestoVentasPunVen"));
			
		this.jButtonVerFormToolBarPresupuestoVentasPunVen.addActionListener (new ButtonActionListener(this,"VerFormToolBarPresupuestoVentasPunVen"));
		
		this.jMenuItemGuardarCambiosPresupuestoVentasPunVen.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosPresupuestoVentasPunVen"));
			
		this.jMenuItemCopiarPresupuestoVentasPunVen.addActionListener (new ButtonActionListener(this,"MenuItemCopiarPresupuestoVentasPunVen"));		
		
		this.jMenuItemVerFormPresupuestoVentasPunVen.addActionListener (new ButtonActionListener(this,"MenuItemVerFormPresupuestoVentasPunVen"));		
		
		
		this.jButtonGuardarCambiosTablaPresupuestoVentasPunVen.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPresupuestoVentasPunVen"));
		
		
		this.jButtonGuardarCambiosTablaToolBarPresupuestoVentasPunVen.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarPresupuestoVentasPunVen"));
			
		this.jMenuItemGuardarCambiosTablaPresupuestoVentasPunVen.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPresupuestoVentasPunVen"));		
		
		
		
		this.jButtonRecargarInformacionPresupuestoVentasPunVen.addActionListener (new ButtonActionListener(this,"RecargarInformacionPresupuestoVentasPunVen"));
					
		this.jButtonRecargarInformacionToolBarPresupuestoVentasPunVen.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarPresupuestoVentasPunVen"));
		
		this.jMenuItemRecargarInformacionPresupuestoVentasPunVen.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionPresupuestoVentasPunVen"));		
		
		
		
		this.jButtonAnterioresPresupuestoVentasPunVen.addActionListener (new ButtonActionListener(this,"AnterioresPresupuestoVentasPunVen"));
		
		
		this.jButtonAnterioresToolBarPresupuestoVentasPunVen.addActionListener (new ButtonActionListener(this,"AnterioresToolBarPresupuestoVentasPunVen"));
		
		this.jMenuItemAnterioresPresupuestoVentasPunVen.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresPresupuestoVentasPunVen"));		
		
		
		this.jButtonSiguientesPresupuestoVentasPunVen.addActionListener (new ButtonActionListener(this,"SiguientesPresupuestoVentasPunVen"));
		
		
		this.jButtonSiguientesToolBarPresupuestoVentasPunVen.addActionListener (new ButtonActionListener(this,"SiguientesToolBarPresupuestoVentasPunVen"));
			
		this.jMenuItemSiguientesPresupuestoVentasPunVen.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesPresupuestoVentasPunVen"));
			
		this.jMenuItemAbrirOrderByPresupuestoVentasPunVen.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByPresupuestoVentasPunVen"));
			
		this.jMenuItemMostrarOcultarPresupuestoVentasPunVen.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarPresupuestoVentasPunVen"));
			
		this.jMenuItemDetalleAbrirOrderByPresupuestoVentasPunVen.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByPresupuestoVentasPunVen"));
			
		this.jMenuItemDetalleMostarOcultarPresupuestoVentasPunVen.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarPresupuestoVentasPunVen"));		
		
		
		this.jButtonNuevoGuardarCambiosPresupuestoVentasPunVen.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosPresupuestoVentasPunVen"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarPresupuestoVentasPunVen.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarPresupuestoVentasPunVen"));
			
		this.jMenuItemNuevoGuardarCambiosPresupuestoVentasPunVen.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosPresupuestoVentasPunVen"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosPresupuestoVentasPunVen.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosPresupuestoVentasPunVen"));

		this.jCheckBoxSeleccionadosPresupuestoVentasPunVen.addItemListener(new CheckBoxItemListener(this,"SeleccionadosPresupuestoVentasPunVen"));
		
		if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxTiposAccionesFormularioPresupuestoVentasPunVen.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPresupuestoVentasPunVen"));
		}
		
		
		this.jComboBoxTiposRelacionesPresupuestoVentasPunVen.addActionListener (new ButtonActionListener(this,"TiposRelacionesPresupuestoVentasPunVen"));
			
		this.jComboBoxTiposAccionesPresupuestoVentasPunVen.addActionListener (new ButtonActionListener(this,"TiposAccionesPresupuestoVentasPunVen"));
					
		this.jComboBoxTiposSeleccionarPresupuestoVentasPunVen.addActionListener (new ButtonActionListener(this,"TiposSeleccionarPresupuestoVentasPunVen"));
			
		this.jTextFieldValorCampoGeneralPresupuestoVentasPunVen.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralPresupuestoVentasPunVen"));		
		
		
		if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonidPresupuestoVentasPunVenBusqueda.addActionListener(new ButtonActionListener(this,"idPresupuestoVentasPunVenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonid_empresaPresupuestoVentasPunVenUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPresupuestoVentasPunVenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonid_empresaPresupuestoVentasPunVenBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPresupuestoVentasPunVenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonid_sucursalPresupuestoVentasPunVenUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalPresupuestoVentasPunVenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonid_sucursalPresupuestoVentasPunVenBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalPresupuestoVentasPunVenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonid_ejercicioPresupuestoVentasPunVenUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioPresupuestoVentasPunVenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonid_ejercicioPresupuestoVentasPunVenBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioPresupuestoVentasPunVenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonid_periodoPresupuestoVentasPunVenUpdate.addActionListener(new ButtonActionListener(this,"id_periodoPresupuestoVentasPunVenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonid_periodoPresupuestoVentasPunVenBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoPresupuestoVentasPunVenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonid_cajaPresupuestoVentasPunVenUpdate.addActionListener(new ButtonActionListener(this,"id_cajaPresupuestoVentasPunVenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonid_cajaPresupuestoVentasPunVenBusqueda.addActionListener(new ButtonActionListener(this,"id_cajaPresupuestoVentasPunVenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonvalorPresupuestoVentasPunVenBusqueda.addActionListener(new ButtonActionListener(this,"valorPresupuestoVentasPunVenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtoncantidadPresupuestoVentasPunVenBusqueda.addActionListener(new ButtonActionListener(this,"cantidadPresupuestoVentasPunVenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonporcentajePresupuestoVentasPunVenBusqueda.addActionListener(new ButtonActionListener(this,"porcentajePresupuestoVentasPunVenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtoncantidad_totalPresupuestoVentasPunVenBusqueda.addActionListener(new ButtonActionListener(this,"cantidad_totalPresupuestoVentasPunVenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonvalor_totalPresupuestoVentasPunVenBusqueda.addActionListener(new ButtonActionListener(this,"valor_totalPresupuestoVentasPunVenBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdCajaPresupuestoVentasPunVen.addActionListener(new ButtonActionListener(this,"FK_IdCajaPresupuestoVentasPunVen"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoPresupuestoVentasPunVen!=null) {
				this.jInternalFrameReporteDinamicoPresupuestoVentasPunVen.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPresupuestoVentasPunVen"));
				this.jInternalFrameReporteDinamicoPresupuestoVentasPunVen.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPresupuestoVentasPunVen"));
				this.jInternalFrameReporteDinamicoPresupuestoVentasPunVen.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPresupuestoVentasPunVen"));
			}
			
			//this.jButtonCerrarReporteDinamicoPresupuestoVentasPunVen.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPresupuestoVentasPunVen"));				
			//this.jButtonGenerarReporteDinamicoPresupuestoVentasPunVen.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPresupuestoVentasPunVen"));
			//this.jButtonGenerarExcelReporteDinamicoPresupuestoVentasPunVen.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPresupuestoVentasPunVen"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionPresupuestoVentasPunVen!=null) {
				this.jInternalFrameImportacionPresupuestoVentasPunVen.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPresupuestoVentasPunVen"));
				this.jInternalFrameImportacionPresupuestoVentasPunVen.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPresupuestoVentasPunVen"));
				this.jInternalFrameImportacionPresupuestoVentasPunVen.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPresupuestoVentasPunVen"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByPresupuestoVentasPunVen.addActionListener (new ButtonActionListener(this,"AbrirOrderByPresupuestoVentasPunVen"));
			
			this.jButtonAbrirOrderByToolBarPresupuestoVentasPunVen.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarPresupuestoVentasPunVen"));			
			
			if(this.jInternalFrameOrderByPresupuestoVentasPunVen!=null) {
				this.jInternalFrameOrderByPresupuestoVentasPunVen.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPresupuestoVentasPunVen"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jTabbedPaneRelacionesPresupuestoVentasPunVen.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPresupuestoVentasPunVen"));
		
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
            		closingInternalFramePresupuestoVentasPunVen();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormPresupuestoVentasPunVen = (JInternalFrameBase)event.getSource();
	            	
	            PresupuestoVentasPunVenBeanSwingJInternalFrame jInternalFrameParent=(PresupuestoVentasPunVenBeanSwingJInternalFrame)jInternalFrameDetalleFormPresupuestoVentasPunVen.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarPresupuestoVentasPunVenActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosPresupuestoVentasPunVen.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosPresupuestoVentasPunVenListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosPresupuestoVentasPunVen.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosPresupuestoVentasPunVen.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoPresupuestoVentasPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPresupuestoVentasPunVenActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarPresupuestoVentasPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPresupuestoVentasPunVenActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoPresupuestoVentasPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPresupuestoVentasPunVenActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoPresupuestoVentasPunVen";
		inputMap = this.jButtonNuevoPresupuestoVentasPunVen.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoPresupuestoVentasPunVen.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPresupuestoVentasPunVenActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesPresupuestoVentasPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPresupuestoVentasPunVenActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarPresupuestoVentasPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPresupuestoVentasPunVenActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesPresupuestoVentasPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPresupuestoVentasPunVenActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesPresupuestoVentasPunVen";
		inputMap = this.jButtonNuevoRelacionesPresupuestoVentasPunVen.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesPresupuestoVentasPunVen.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPresupuestoVentasPunVenActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarPresupuestoVentasPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPresupuestoVentasPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarPresupuestoVentasPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPresupuestoVentasPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarPresupuestoVentasPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPresupuestoVentasPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarPresupuestoVentasPunVen";
		inputMap = this.jButtonModificarPresupuestoVentasPunVen.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarPresupuestoVentasPunVen.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarPresupuestoVentasPunVenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarPresupuestoVentasPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPresupuestoVentasPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarPresupuestoVentasPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPresupuestoVentasPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarPresupuestoVentasPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPresupuestoVentasPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarPresupuestoVentasPunVen";
		inputMap = this.jButtonActualizarPresupuestoVentasPunVen.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarPresupuestoVentasPunVen.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarPresupuestoVentasPunVenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarPresupuestoVentasPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPresupuestoVentasPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarPresupuestoVentasPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPresupuestoVentasPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarPresupuestoVentasPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPresupuestoVentasPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarPresupuestoVentasPunVen";
		inputMap = this.jButtonEliminarPresupuestoVentasPunVen.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarPresupuestoVentasPunVen.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarPresupuestoVentasPunVenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarPresupuestoVentasPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPresupuestoVentasPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarPresupuestoVentasPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPresupuestoVentasPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarPresupuestoVentasPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPresupuestoVentasPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarPresupuestoVentasPunVen";
		inputMap = this.jButtonCancelarPresupuestoVentasPunVen.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarPresupuestoVentasPunVen.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarPresupuestoVentasPunVenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarPresupuestoVentasPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPresupuestoVentasPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarPresupuestoVentasPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPresupuestoVentasPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarPresupuestoVentasPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPresupuestoVentasPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarPresupuestoVentasPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarPresupuestoVentasPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarPresupuestoVentasPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarPresupuestoVentasPunVen";
		inputMap = this.jButtonCerrarPresupuestoVentasPunVen.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarPresupuestoVentasPunVen.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarPresupuestoVentasPunVenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonGuardarCambiosPresupuestoVentasPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPresupuestoVentasPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarPresupuestoVentasPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPresupuestoVentasPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosPresupuestoVentasPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPresupuestoVentasPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaPresupuestoVentasPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPresupuestoVentasPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarPresupuestoVentasPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPresupuestoVentasPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaPresupuestoVentasPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPresupuestoVentasPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosPresupuestoVentasPunVen";
		inputMap = this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonGuardarCambiosPresupuestoVentasPunVen.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonGuardarCambiosPresupuestoVentasPunVen.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosPresupuestoVentasPunVenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionPresupuestoVentasPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPresupuestoVentasPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarPresupuestoVentasPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPresupuestoVentasPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionPresupuestoVentasPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPresupuestoVentasPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresPresupuestoVentasPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPresupuestoVentasPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarPresupuestoVentasPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPresupuestoVentasPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresPresupuestoVentasPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPresupuestoVentasPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesPresupuestoVentasPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPresupuestoVentasPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarPresupuestoVentasPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPresupuestoVentasPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesPresupuestoVentasPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPresupuestoVentasPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosPresupuestoVentasPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPresupuestoVentasPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarPresupuestoVentasPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPresupuestoVentasPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosPresupuestoVentasPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPresupuestoVentasPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosPresupuestoVentasPunVen.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosPresupuestoVentasPunVenItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesPresupuestoVentasPunVen.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesPresupuestoVentasPunVenActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarPresupuestoVentasPunVen.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarPresupuestoVentasPunVenActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralPresupuestoVentasPunVen.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralPresupuestoVentasPunVenActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonidPresupuestoVentasPunVenBusqueda.addActionListener(new ButtonActionListener(this,"idPresupuestoVentasPunVenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonid_empresaPresupuestoVentasPunVenUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPresupuestoVentasPunVenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonid_empresaPresupuestoVentasPunVenBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPresupuestoVentasPunVenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonid_sucursalPresupuestoVentasPunVenUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalPresupuestoVentasPunVenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonid_sucursalPresupuestoVentasPunVenBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalPresupuestoVentasPunVenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonid_ejercicioPresupuestoVentasPunVenUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioPresupuestoVentasPunVenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonid_ejercicioPresupuestoVentasPunVenBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioPresupuestoVentasPunVenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonid_periodoPresupuestoVentasPunVenUpdate.addActionListener(new ButtonActionListener(this,"id_periodoPresupuestoVentasPunVenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonid_periodoPresupuestoVentasPunVenBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoPresupuestoVentasPunVenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonid_cajaPresupuestoVentasPunVenUpdate.addActionListener(new ButtonActionListener(this,"id_cajaPresupuestoVentasPunVenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonid_cajaPresupuestoVentasPunVenBusqueda.addActionListener(new ButtonActionListener(this,"id_cajaPresupuestoVentasPunVenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonvalorPresupuestoVentasPunVenBusqueda.addActionListener(new ButtonActionListener(this,"valorPresupuestoVentasPunVenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtoncantidadPresupuestoVentasPunVenBusqueda.addActionListener(new ButtonActionListener(this,"cantidadPresupuestoVentasPunVenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonporcentajePresupuestoVentasPunVenBusqueda.addActionListener(new ButtonActionListener(this,"porcentajePresupuestoVentasPunVenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtoncantidad_totalPresupuestoVentasPunVenBusqueda.addActionListener(new ButtonActionListener(this,"cantidad_totalPresupuestoVentasPunVenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jButtonvalor_totalPresupuestoVentasPunVenBusqueda.addActionListener(new ButtonActionListener(this,"valor_totalPresupuestoVentasPunVenBusqueda"));
		
		
		this.jButtonFK_IdCajaPresupuestoVentasPunVen.addActionListener(new ButtonActionListener(this,"FK_IdCajaPresupuestoVentasPunVen"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoPresupuestoVentasPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoPresupuestoVentasPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoPresupuestoVentasPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoPresupuestoVentasPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoPresupuestoVentasPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoPresupuestoVentasPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionPresupuestoVentasPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionPresupuestoVentasPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionPresupuestoVentasPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionPresupuestoVentasPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionPresupuestoVentasPunVen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionPresupuestoVentasPunVenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarPresupuestoVentasPunVenActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarPresupuestoVentasPunVen.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosPresupuestoVentasPunVen(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(PresupuestoVentasPunVen presupuestoventaspunvenAux:this.presupuestoventaspunvenLogic.getPresupuestoVentasPunVens()) {
					presupuestoventaspunvenAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PresupuestoVentasPunVen presupuestoventaspunvenAux:presupuestoventaspunvens) {
					presupuestoventaspunvenAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosPresupuestoVentasPunVenItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPresupuestoVentasPunVen(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(PresupuestoVentasPunVen presupuestoventaspunvenAux:this.presupuestoventaspunvenLogic.getPresupuestoVentasPunVens()) {
						presupuestoventaspunvenAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PresupuestoVentasPunVen presupuestoventaspunvenAux:presupuestoventaspunvens) {
						presupuestoventaspunvenAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(PresupuestoVentasPunVen presupuestoventaspunvenAux:this.presupuestoventaspunvenLogic.getPresupuestoVentasPunVens()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PresupuestoVentasPunVen presupuestoventaspunvenAux:presupuestoventaspunvens) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaPresupuestoVentasPunVen(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPresupuestoVentasPunVen.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPresupuestoVentasPunVen.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoVentasPunVen,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosPresupuestoVentasPunVenItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPresupuestoVentasPunVen(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosPresupuestoVentasPunVen.getSelectedRows();
			
			PresupuestoVentasPunVen presupuestoventaspunvenLocal=new PresupuestoVentasPunVen();
			
			//this.seleccionarTodosPresupuestoVentasPunVen(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					presupuestoventaspunvenLocal =(PresupuestoVentasPunVen) this.presupuestoventaspunvenLogic.getPresupuestoVentasPunVens().toArray()[this.jTableDatosPresupuestoVentasPunVen.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					presupuestoventaspunvenLocal =(PresupuestoVentasPunVen) this.presupuestoventaspunvens.toArray()[this.jTableDatosPresupuestoVentasPunVen.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				presupuestoventaspunvenLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(PresupuestoVentasPunVen presupuestoventaspunvenAux:this.presupuestoventaspunvenLogic.getPresupuestoVentasPunVens()) {
						presupuestoventaspunvenAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PresupuestoVentasPunVen presupuestoventaspunvenAux:presupuestoventaspunvens) {
						presupuestoventaspunvenAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaPresupuestoVentasPunVen(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPresupuestoVentasPunVen.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPresupuestoVentasPunVen.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoVentasPunVen,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualPresupuestoVentasPunVenItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarPresupuestoVentasPunVenParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralPresupuestoVentasPunVenActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingPresupuestoVentasPunVen(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralPresupuestoVentasPunVen.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(PresupuestoVentasPunVen presupuestoventaspunvenAux:this.presupuestoventaspunvenLogic.getPresupuestoVentasPunVens()) {
				
						if(sTipoSeleccionar.equals(PresupuestoVentasPunVenConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							presupuestoventaspunvenAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PresupuestoVentasPunVenConstantesFunciones.LABEL_CANTIDAD)) {
							existe=true;
							presupuestoventaspunvenAux.setcantidad(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PresupuestoVentasPunVenConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							presupuestoventaspunvenAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PresupuestoVentasPunVenConstantesFunciones.LABEL_CANTIDADTOTAL)) {
							existe=true;
							presupuestoventaspunvenAux.setcantidad_total(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PresupuestoVentasPunVenConstantesFunciones.LABEL_VALORTOTAL)) {
							existe=true;
							presupuestoventaspunvenAux.setvalor_total(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PresupuestoVentasPunVen presupuestoventaspunvenAux:presupuestoventaspunvens) {
					
						if(sTipoSeleccionar.equals(PresupuestoVentasPunVenConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							presupuestoventaspunvenAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PresupuestoVentasPunVenConstantesFunciones.LABEL_CANTIDAD)) {
							existe=true;
							presupuestoventaspunvenAux.setcantidad(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PresupuestoVentasPunVenConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							presupuestoventaspunvenAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PresupuestoVentasPunVenConstantesFunciones.LABEL_CANTIDADTOTAL)) {
							existe=true;
							presupuestoventaspunvenAux.setcantidad_total(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PresupuestoVentasPunVenConstantesFunciones.LABEL_VALORTOTAL)) {
							existe=true;
							presupuestoventaspunvenAux.setvalor_total(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaPresupuestoVentasPunVen(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesPresupuestoVentasPunVenActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingPresupuestoVentasPunVen(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioPresupuestoVentasPunVen=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesPresupuestoVentasPunVen.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxTiposAccionesFormularioPresupuestoVentasPunVen.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReportePresupuestoVentasPunVen) {				
					conSplash=true;//false;										
					
					//this.startProcessPresupuestoVentasPunVen(conSplash);
				
					this.generarReportePresupuestoVentasPunVensSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPresupuestoVentasPunVen.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxTiposAccionesFormularioPresupuestoVentasPunVen.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoPresupuestoVentasPunVensSeleccionados();
				//this.jComboBoxTiposAccionesPresupuestoVentasPunVen.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPresupuestoVentasPunVensSeleccionados(false);
				//this.jComboBoxTiposAccionesPresupuestoVentasPunVen.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPresupuestoVentasPunVensSeleccionados(true);
				//this.jComboBoxTiposAccionesPresupuestoVentasPunVen.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPresupuestoVentasPunVen();
				
				this.exportarPresupuestoVentasPunVensSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPresupuestoVentasPunVen.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxTiposAccionesFormularioPresupuestoVentasPunVen.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionPresupuestoVentasPunVens();
				//this.importarPresupuestoVentasPunVens();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPresupuestoVentasPunVen.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxTiposAccionesFormularioPresupuestoVentasPunVen.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPresupuestoVentasPunVen();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelPresupuestoVentasPunVensSeleccionados();
				//this.jComboBoxTiposAccionesPresupuestoVentasPunVen.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Presupuesto Ventas", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessPresupuestoVentasPunVen();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoPresupuestoVentasPunVen)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyPresupuestoVentasPunVen(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Presupuesto Ventas",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPresupuestoVentasPunVen.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxTiposAccionesFormularioPresupuestoVentasPunVen.setSelectedIndex(0);					
				}	
			} 			
			else if(PresupuestoVentasPunVenBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReportePresupuestoVentasPunVen) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessPresupuestoVentasPunVen(conSplash);
					
						//this.actualizarParametrosGeneralPresupuestoVentasPunVen();
						
						this.generarReporteProcesoAccionPresupuestoVentasPunVensSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesPresupuestoVentasPunVen.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxTiposAccionesFormularioPresupuestoVentasPunVen.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(PresupuestoVentasPunVenBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Presupuesto VentasES SELECCIONADOS?", "MANTENIMIENTO DE Presupuesto Ventas", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessPresupuestoVentasPunVen();
				
						this.actualizarParametrosGeneralPresupuestoVentasPunVen();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.presupuestoventaspunvenReturnGeneral=presupuestoventaspunvenLogic.procesarAccionPresupuestoVentasPunVensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.presupuestoventaspunvenLogic.getPresupuestoVentasPunVens(),this.presupuestoventaspunvenParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarPresupuestoVentasPunVenReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPresupuestoVentasPunVen.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxTiposAccionesFormularioPresupuestoVentasPunVen.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralPresupuestoVentasPunVen();
					
					PresupuestoVentasPunVenBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarPresupuestoVentasPunVenReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPresupuestoVentasPunVen.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxTiposAccionesFormularioPresupuestoVentasPunVen.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessPresupuestoVentasPunVen(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesPresupuestoVentasPunVenActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessPresupuestoVentasPunVen();
			
			if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<PresupuestoVentasPunVen> presupuestoventaspunvensSeleccionados=new ArrayList<PresupuestoVentasPunVen>();		
			PresupuestoVentasPunVen presupuestoventaspunven=new PresupuestoVentasPunVen();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingPresupuestoVentasPunVen(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesPresupuestoVentasPunVen.getSelectedItem();
			
			
			
			
			presupuestoventaspunvensSeleccionados=this.getPresupuestoVentasPunVensSeleccionados(true);
			//this.sTipoAccion;
			
			if(presupuestoventaspunvensSeleccionados.size()==1) {
				for(PresupuestoVentasPunVen presupuestoventaspunvenAux:presupuestoventaspunvensSeleccionados) {
					presupuestoventaspunven=presupuestoventaspunvenAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessPresupuestoVentasPunVen();
			
      		//this.finishProcessPresupuestoVentasPunVen(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarPresupuestoVentasPunVenReturnGeneral() throws Exception {
		if(this.presupuestoventaspunvenReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.presupuestoventaspunvenReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.presupuestoventaspunvenReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.presupuestoventaspunvenReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.presupuestoventaspunvenReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.presupuestoventaspunvenReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingPresupuestoVentasPunVen(false);
		}
		
		if(this.presupuestoventaspunvenReturnGeneral.getConRetornoLista() || this.presupuestoventaspunvenReturnGeneral.getConRetornoObjeto()) {
			if(this.presupuestoventaspunvenReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.presupuestoventaspunvenLogic.setPresupuestoVentasPunVens(this.presupuestoventaspunvenReturnGeneral.getPresupuestoVentasPunVens());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.presupuestoventaspunvenReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.presupuestoventaspunvenLogic.setPresupuestoVentasPunVen(this.presupuestoventaspunvenReturnGeneral.getPresupuestoVentasPunVen());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingPresupuestoVentasPunVen(false);
		}
	}
	
	public void actualizarParametrosGeneralPresupuestoVentasPunVen() throws Exception {
		
		
	}
	
	public ArrayList<PresupuestoVentasPunVen> getPresupuestoVentasPunVensSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<PresupuestoVentasPunVen> presupuestoventaspunvensSeleccionados=new ArrayList<PresupuestoVentasPunVen>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioPresupuestoVentasPunVen) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(PresupuestoVentasPunVen presupuestoventaspunvenAux:presupuestoventaspunvenLogic.getPresupuestoVentasPunVens()) {
					if(presupuestoventaspunvenAux.getIsSelected()) {
						presupuestoventaspunvensSeleccionados.add(presupuestoventaspunvenAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PresupuestoVentasPunVen presupuestoventaspunvenAux:this.presupuestoventaspunvens) {
					if(presupuestoventaspunvenAux.getIsSelected()) {
						presupuestoventaspunvensSeleccionados.add(presupuestoventaspunvenAux);				
					}
				}
			}
			
			if(presupuestoventaspunvensSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						presupuestoventaspunvensSeleccionados.addAll(this.presupuestoventaspunvenLogic.getPresupuestoVentasPunVens());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						presupuestoventaspunvensSeleccionados.addAll(this.presupuestoventaspunvens);				
					}
				}
			}
		} else {
			presupuestoventaspunvensSeleccionados.add(this.presupuestoventaspunven);
		}
		
		return presupuestoventaspunvensSeleccionados;
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
	
	public void generarReportePresupuestoVentasPunVensSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalPresupuestoVentasPunVensSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoPresupuestoVentasPunVensSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPresupuestoVentasPunVensSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPresupuestoVentasPunVensSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Presupuesto Ventas",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesPresupuestoVentasPunVensSeleccionados() throws Exception {
		ArrayList<PresupuestoVentasPunVen> presupuestoventaspunvensSeleccionados=new ArrayList<PresupuestoVentasPunVen>();		
		
		presupuestoventaspunvensSeleccionados=this.getPresupuestoVentasPunVensSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReportePresupuestoVentasPunVens("Todos",presupuestoventaspunvensSeleccionados);
		
	}	
	
	public void generarReporteNormalPresupuestoVentasPunVensSeleccionados() throws Exception {
		ArrayList<PresupuestoVentasPunVen> presupuestoventaspunvensSeleccionados=new ArrayList<PresupuestoVentasPunVen>();		
		
		presupuestoventaspunvensSeleccionados=this.getPresupuestoVentasPunVensSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReportePresupuestoVentasPunVens("Todos",presupuestoventaspunvensSeleccionados);
	}		
	
	public void generarReporteProcesoAccionPresupuestoVentasPunVensSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<PresupuestoVentasPunVen> presupuestoventaspunvensSeleccionados=new ArrayList<PresupuestoVentasPunVen>();
		
		presupuestoventaspunvensSeleccionados=this.getPresupuestoVentasPunVensSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReportePresupuestoVentasPunVens("Todos",presupuestoventaspunvensSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoPresupuestoVentasPunVensSeleccionados() throws Exception {
		ArrayList<PresupuestoVentasPunVen> presupuestoventaspunvensSeleccionados=new ArrayList<PresupuestoVentasPunVen>();		
		
		
		this.abrirInicializarFrameReporteDinamicoPresupuestoVentasPunVen();
		
		
		presupuestoventaspunvensSeleccionados=this.getPresupuestoVentasPunVensSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoPresupuestoVentasPunVen();
		
		
		//this.generarReportePresupuestoVentasPunVens("Todos",presupuestoventaspunvensSeleccionados ,presupuestoventaspunvenImplementable,presupuestoventaspunvenImplementableHome);
	}
	
	public void mostrarImportacionPresupuestoVentasPunVens() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionPresupuestoVentasPunVen();
		
		this.abrirFrameImportacionPresupuestoVentasPunVen();		
		
			
		//this.generarReportePresupuestoVentasPunVens("Todos",presupuestoventaspunvensSeleccionados ,presupuestoventaspunvenImplementable,presupuestoventaspunvenImplementableHome);
	}
	
	public void importarPresupuestoVentasPunVens() throws Exception {		
	
	}
	
	public void exportarPresupuestoVentasPunVensSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelPresupuestoVentasPunVensSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoPresupuestoVentasPunVensSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlPresupuestoVentasPunVensSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Presupuesto Ventas",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoPresupuestoVentasPunVensSeleccionados() throws Exception {
		ArrayList<PresupuestoVentasPunVen> presupuestoventaspunvensSeleccionados=new ArrayList<PresupuestoVentasPunVen>();		
		
		presupuestoventaspunvensSeleccionados=this.getPresupuestoVentasPunVensSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presupuestoventaspunven."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarPresupuestoVentasPunVen(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(PresupuestoVentasPunVen presupuestoventaspunvenAux:presupuestoventaspunvensSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarPresupuestoVentasPunVen(presupuestoventaspunvenAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//presupuestoventaspunvenAux.setsDetalleGeneralEntityReporte(presupuestoventaspunvenAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Presupuesto Ventas",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarPresupuestoVentasPunVen(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=PresupuestoVentasPunVenConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresupuestoVentasPunVenConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresupuestoVentasPunVenConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresupuestoVentasPunVenConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresupuestoVentasPunVenConstantesFunciones.LABEL_IDEJERCICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresupuestoVentasPunVenConstantesFunciones.LABEL_IDPERIODO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresupuestoVentasPunVenConstantesFunciones.LABEL_IDCAJA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresupuestoVentasPunVenConstantesFunciones.LABEL_VALOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresupuestoVentasPunVenConstantesFunciones.LABEL_CANTIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresupuestoVentasPunVenConstantesFunciones.LABEL_PORCENTAJE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresupuestoVentasPunVenConstantesFunciones.LABEL_CANTIDADTOTAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresupuestoVentasPunVenConstantesFunciones.LABEL_VALORTOTAL;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarPresupuestoVentasPunVen(PresupuestoVentasPunVen presupuestoventaspunven,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=presupuestoventaspunven.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=presupuestoventaspunven.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=presupuestoventaspunven.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presupuestoventaspunven.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presupuestoventaspunven.getejercicio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presupuestoventaspunven.getperiodo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presupuestoventaspunven.getcaja_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presupuestoventaspunven.getvalor().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presupuestoventaspunven.getcantidad().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presupuestoventaspunven.getporcentaje().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presupuestoventaspunven.getcantidad_total().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presupuestoventaspunven.getvalor_total().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelPresupuestoVentasPunVensSeleccionados() throws Exception {
		ArrayList<PresupuestoVentasPunVen> presupuestoventaspunvensSeleccionados=new ArrayList<PresupuestoVentasPunVen>();		
		
		presupuestoventaspunvensSeleccionados=this.getPresupuestoVentasPunVensSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presupuestoventaspunven.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("PresupuestoVentasPunVens");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelPresupuestoVentasPunVen(row);				
				iRow++;
			}				
			
			for(PresupuestoVentasPunVen presupuestoventaspunvenAux:presupuestoventaspunvensSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelPresupuestoVentasPunVen(presupuestoventaspunvenAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Presupuesto Ventas",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlPresupuestoVentasPunVensSeleccionados() throws Exception {
		ArrayList<PresupuestoVentasPunVen> presupuestoventaspunvensSeleccionados=new ArrayList<PresupuestoVentasPunVen>();		
		
		presupuestoventaspunvensSeleccionados=this.getPresupuestoVentasPunVensSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presupuestoventaspunven.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("presupuestoventaspunvens");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("presupuestoventaspunven");
			//elementRoot.appendChild(element);
		
			for(PresupuestoVentasPunVen presupuestoventaspunvenAux:presupuestoventaspunvensSeleccionados) {
				element = document.createElement("presupuestoventaspunven");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlPresupuestoVentasPunVen(presupuestoventaspunvenAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Presupuesto Ventas",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelPresupuestoVentasPunVen(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(PresupuestoVentasPunVenConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(PresupuestoVentasPunVenConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(PresupuestoVentasPunVenConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(PresupuestoVentasPunVenConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(PresupuestoVentasPunVenConstantesFunciones.LABEL_IDEJERCICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(PresupuestoVentasPunVenConstantesFunciones.LABEL_IDPERIODO);
		cell = row.createCell(iColumn++);cell.setCellValue(PresupuestoVentasPunVenConstantesFunciones.LABEL_IDCAJA);
		cell = row.createCell(iColumn++);cell.setCellValue(PresupuestoVentasPunVenConstantesFunciones.LABEL_VALOR);
		cell = row.createCell(iColumn++);cell.setCellValue(PresupuestoVentasPunVenConstantesFunciones.LABEL_CANTIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(PresupuestoVentasPunVenConstantesFunciones.LABEL_PORCENTAJE);
		cell = row.createCell(iColumn++);cell.setCellValue(PresupuestoVentasPunVenConstantesFunciones.LABEL_CANTIDADTOTAL);
		cell = row.createCell(iColumn++);cell.setCellValue(PresupuestoVentasPunVenConstantesFunciones.LABEL_VALORTOTAL);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelPresupuestoVentasPunVen(PresupuestoVentasPunVen presupuestoventaspunven,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(presupuestoventaspunven.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(presupuestoventaspunven.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(presupuestoventaspunven.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(presupuestoventaspunven.getejercicio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(presupuestoventaspunven.getperiodo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(presupuestoventaspunven.getcaja_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(presupuestoventaspunven.getvalor());
		cell = row.createCell(iColumn++);cell.setCellValue(presupuestoventaspunven.getcantidad());
		cell = row.createCell(iColumn++);cell.setCellValue(presupuestoventaspunven.getporcentaje());
		cell = row.createCell(iColumn++);cell.setCellValue(presupuestoventaspunven.getcantidad_total());
		cell = row.createCell(iColumn++);cell.setCellValue(presupuestoventaspunven.getvalor_total());				
	}
	
	public void setFilaDatosExportarXmlPresupuestoVentasPunVen(PresupuestoVentasPunVen presupuestoventaspunven,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(PresupuestoVentasPunVenConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(presupuestoventaspunven.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(PresupuestoVentasPunVenConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(presupuestoventaspunven.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(PresupuestoVentasPunVenConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(presupuestoventaspunven.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(PresupuestoVentasPunVenConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(presupuestoventaspunven.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementejercicio_descripcion = document.createElement(PresupuestoVentasPunVenConstantesFunciones.IDEJERCICIO);
		elementejercicio_descripcion.appendChild(document.createTextNode(presupuestoventaspunven.getejercicio_descripcion()));
		element.appendChild(elementejercicio_descripcion);

		Element elementperiodo_descripcion = document.createElement(PresupuestoVentasPunVenConstantesFunciones.IDPERIODO);
		elementperiodo_descripcion.appendChild(document.createTextNode(presupuestoventaspunven.getperiodo_descripcion()));
		element.appendChild(elementperiodo_descripcion);

		Element elementcaja_descripcion = document.createElement(PresupuestoVentasPunVenConstantesFunciones.IDCAJA);
		elementcaja_descripcion.appendChild(document.createTextNode(presupuestoventaspunven.getcaja_descripcion()));
		element.appendChild(elementcaja_descripcion);

		Element elementvalor = document.createElement(PresupuestoVentasPunVenConstantesFunciones.VALOR);
		elementvalor.appendChild(document.createTextNode(presupuestoventaspunven.getvalor().toString().trim()));
		element.appendChild(elementvalor);

		Element elementcantidad = document.createElement(PresupuestoVentasPunVenConstantesFunciones.CANTIDAD);
		elementcantidad.appendChild(document.createTextNode(presupuestoventaspunven.getcantidad().toString().trim()));
		element.appendChild(elementcantidad);

		Element elementporcentaje = document.createElement(PresupuestoVentasPunVenConstantesFunciones.PORCENTAJE);
		elementporcentaje.appendChild(document.createTextNode(presupuestoventaspunven.getporcentaje().toString().trim()));
		element.appendChild(elementporcentaje);

		Element elementcantidad_total = document.createElement(PresupuestoVentasPunVenConstantesFunciones.CANTIDADTOTAL);
		elementcantidad_total.appendChild(document.createTextNode(presupuestoventaspunven.getcantidad_total().toString().trim()));
		element.appendChild(elementcantidad_total);

		Element elementvalor_total = document.createElement(PresupuestoVentasPunVenConstantesFunciones.VALORTOTAL);
		elementvalor_total.appendChild(document.createTextNode(presupuestoventaspunven.getvalor_total().toString().trim()));
		element.appendChild(elementvalor_total);
	}
	
	public void generarReporteGroupGenericoPresupuestoVentasPunVensSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<PresupuestoVentasPunVen> presupuestoventaspunvensSeleccionados=new ArrayList<PresupuestoVentasPunVen>();
		
		presupuestoventaspunvensSeleccionados=this.getPresupuestoVentasPunVensSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoPresupuestoVentasPunVen(presupuestoventaspunvensSeleccionados);
		
		this.generarReportePresupuestoVentasPunVens("Todos",presupuestoventaspunvensSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoPresupuestoVentasPunVen(ArrayList<PresupuestoVentasPunVen> presupuestoventaspunvensSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(PresupuestoVentasPunVen presupuestoventaspunvenAux:presupuestoventaspunvensSeleccionados) {
				presupuestoventaspunvenAux.setsDetalleGeneralEntityReporte(presupuestoventaspunvenAux.toString());
			
				if(sTipoSeleccionar.equals(PresupuestoVentasPunVenConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					presupuestoventaspunvenAux.setsDescripcionGeneralEntityReporte1(presupuestoventaspunvenAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PresupuestoVentasPunVenConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					presupuestoventaspunvenAux.setsDescripcionGeneralEntityReporte1(presupuestoventaspunvenAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PresupuestoVentasPunVenConstantesFunciones.LABEL_IDEJERCICIO)) {
					existe=true;
					presupuestoventaspunvenAux.setsDescripcionGeneralEntityReporte1(presupuestoventaspunvenAux.getejercicio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PresupuestoVentasPunVenConstantesFunciones.LABEL_IDPERIODO)) {
					existe=true;
					presupuestoventaspunvenAux.setsDescripcionGeneralEntityReporte1(presupuestoventaspunvenAux.getperiodo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PresupuestoVentasPunVenConstantesFunciones.LABEL_IDCAJA)) {
					existe=true;
					presupuestoventaspunvenAux.setsDescripcionGeneralEntityReporte1(presupuestoventaspunvenAux.getcaja_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PresupuestoVentasPunVenConstantesFunciones.LABEL_CANTIDAD)) {
					existe=true;
					presupuestoventaspunvenAux.setsDescripcionGeneralEntityReporte1(presupuestoventaspunvenAux.getcantidad().toString());
				}
				 else if(sTipoSeleccionar.equals(PresupuestoVentasPunVenConstantesFunciones.LABEL_CANTIDADTOTAL)) {
					existe=true;
					presupuestoventaspunvenAux.setsDescripcionGeneralEntityReporte1(presupuestoventaspunvenAux.getcantidad_total().toString());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoVentasPunVenConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesPresupuestoVentasPunVen(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoPresupuestoVentasPunVen=true;
				this.isVisibilidadCeldaNuevoRelacionesPresupuestoVentasPunVen=true;
				this.isVisibilidadCeldaGuardarCambiosPresupuestoVentasPunVen=true;
			}
			
			this.isVisibilidadCeldaModificarPresupuestoVentasPunVen=false;
			this.isVisibilidadCeldaActualizarPresupuestoVentasPunVen=false;
			this.isVisibilidadCeldaEliminarPresupuestoVentasPunVen=false;
			this.isVisibilidadCeldaCancelarPresupuestoVentasPunVen=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresupuestoVentasPunVen=true;
				} else {
					this.isVisibilidadCeldaGuardarPresupuestoVentasPunVen=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoPresupuestoVentasPunVen=false;
			this.isVisibilidadCeldaNuevoRelacionesPresupuestoVentasPunVen=false;
			this.isVisibilidadCeldaGuardarCambiosPresupuestoVentasPunVen=false;
			this.isVisibilidadCeldaModificarPresupuestoVentasPunVen=false;
			this.isVisibilidadCeldaActualizarPresupuestoVentasPunVen=true;
			this.isVisibilidadCeldaEliminarPresupuestoVentasPunVen=false;
			this.isVisibilidadCeldaCancelarPresupuestoVentasPunVen=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresupuestoVentasPunVen=true;
				} else {
					this.isVisibilidadCeldaGuardarPresupuestoVentasPunVen=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoPresupuestoVentasPunVen=false;
			this.isVisibilidadCeldaNuevoRelacionesPresupuestoVentasPunVen=false;
			this.isVisibilidadCeldaGuardarCambiosPresupuestoVentasPunVen=false;
			this.isVisibilidadCeldaModificarPresupuestoVentasPunVen=false;
			this.isVisibilidadCeldaActualizarPresupuestoVentasPunVen=true;
			this.isVisibilidadCeldaEliminarPresupuestoVentasPunVen=true;
			this.isVisibilidadCeldaCancelarPresupuestoVentasPunVen=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresupuestoVentasPunVen=true;
				} else {
					this.isVisibilidadCeldaGuardarPresupuestoVentasPunVen=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoPresupuestoVentasPunVen=false;
			this.isVisibilidadCeldaNuevoRelacionesPresupuestoVentasPunVen=false;
			this.isVisibilidadCeldaGuardarCambiosPresupuestoVentasPunVen=false;
			this.isVisibilidadCeldaModificarPresupuestoVentasPunVen=false;
			this.isVisibilidadCeldaActualizarPresupuestoVentasPunVen=true;
			this.isVisibilidadCeldaEliminarPresupuestoVentasPunVen=false;
			this.isVisibilidadCeldaCancelarPresupuestoVentasPunVen=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresupuestoVentasPunVen=false;
				} else {
					this.isVisibilidadCeldaGuardarPresupuestoVentasPunVen=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoPresupuestoVentasPunVen=true;
			this.isVisibilidadCeldaNuevoRelacionesPresupuestoVentasPunVen=true;
			this.isVisibilidadCeldaGuardarCambiosPresupuestoVentasPunVen=true;
			this.isVisibilidadCeldaModificarPresupuestoVentasPunVen=false;
			this.isVisibilidadCeldaActualizarPresupuestoVentasPunVen=false;
			this.isVisibilidadCeldaEliminarPresupuestoVentasPunVen=false;
			this.isVisibilidadCeldaCancelarPresupuestoVentasPunVen=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresupuestoVentasPunVen=true;
				} else {
					this.isVisibilidadCeldaGuardarPresupuestoVentasPunVen=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoPresupuestoVentasPunVen=false;
			this.isVisibilidadCeldaNuevoRelacionesPresupuestoVentasPunVen=false;
			this.isVisibilidadCeldaGuardarCambiosPresupuestoVentasPunVen=false;
			this.isVisibilidadCeldaActualizarPresupuestoVentasPunVen=false;
			this.isVisibilidadCeldaEliminarPresupuestoVentasPunVen=false;
			this.isVisibilidadCeldaCancelarPresupuestoVentasPunVen=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresupuestoVentasPunVen=false;
				} else {
					this.isVisibilidadCeldaGuardarPresupuestoVentasPunVen=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoPresupuestoVentasPunVen=false;
			this.isVisibilidadCeldaNuevoRelacionesPresupuestoVentasPunVen=false;
			this.isVisibilidadCeldaGuardarCambiosPresupuestoVentasPunVen=false;
			this.isVisibilidadCeldaModificarPresupuestoVentasPunVen=true;
			this.isVisibilidadCeldaActualizarPresupuestoVentasPunVen=false;
			this.isVisibilidadCeldaEliminarPresupuestoVentasPunVen=false;
			this.isVisibilidadCeldaCancelarPresupuestoVentasPunVen=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresupuestoVentasPunVen=false;
				} else {
					this.isVisibilidadCeldaGuardarPresupuestoVentasPunVen=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(PresupuestoVentasPunVenJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoPresupuestoVentasPunVen=true;
			this.isVisibilidadCeldaNuevoRelacionesPresupuestoVentasPunVen=true;
			this.isVisibilidadCeldaGuardarCambiosPresupuestoVentasPunVen=true;
		} else {
			this.actualizarEstadoPanelsPresupuestoVentasPunVen(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarPresupuestoVentasPunVen=false;
			//this.isVisibilidadCeldaVerFormPresupuestoVentasPunVen=false;
			this.isVisibilidadCeldaDuplicarPresupuestoVentasPunVen=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!presupuestoventaspunvenSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesPresupuestoVentasPunVen=false;
		} else {
			this.isVisibilidadCeldaNuevoPresupuestoVentasPunVen=false;
			this.isVisibilidadCeldaGuardarCambiosPresupuestoVentasPunVen=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(presupuestoventaspunvenSessionBean.getEsGuardarRelacionado()) {
			if(!presupuestoventaspunvenSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesPresupuestoVentasPunVen=false;												
			}
			
			this.jButtonCerrarPresupuestoVentasPunVen.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesPresupuestoVentasPunVen=false;
		}
		
		if(!this.permiteMantenimiento(this.presupuestoventaspunven)) {
			this.isVisibilidadCeldaActualizarPresupuestoVentasPunVen=false;
			this.isVisibilidadCeldaEliminarPresupuestoVentasPunVen=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesPresupuestoVentasPunVen() {
	}
	
	public void actualizarEstadoPanelsPresupuestoVentasPunVen(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionPresupuestoVentasPunVen!=null) {
				this.jScrollPanelDatosEdicionPresupuestoVentasPunVen.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresupuestoVentasPunVen!=null) {
				this.jTabbedPaneBusquedasPresupuestoVentasPunVen.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPresupuestoVentasPunVen!=null) {
				this.jScrollPanelDatosPresupuestoVentasPunVen.setVisible(true);
			}
			
			if(this.jPanelPaginacionPresupuestoVentasPunVen!=null) {
				this.jPanelPaginacionPresupuestoVentasPunVen.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPresupuestoVentasPunVen!=null) {
				this.jPanelParametrosReportesPresupuestoVentasPunVen.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionPresupuestoVentasPunVen!=null) {
				this.jScrollPanelDatosEdicionPresupuestoVentasPunVen.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresupuestoVentasPunVen!=null) {
				this.jTabbedPaneBusquedasPresupuestoVentasPunVen.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosPresupuestoVentasPunVen!=null) {
				this.jScrollPanelDatosPresupuestoVentasPunVen.setVisible(false);
			}
			
			if(this.jPanelPaginacionPresupuestoVentasPunVen!=null) {
				this.jPanelPaginacionPresupuestoVentasPunVen.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPresupuestoVentasPunVen!=null) {
				this.jPanelParametrosReportesPresupuestoVentasPunVen.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionPresupuestoVentasPunVen!=null) {
				this.jScrollPanelDatosEdicionPresupuestoVentasPunVen.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresupuestoVentasPunVen!=null) {
				this.jTabbedPaneBusquedasPresupuestoVentasPunVen.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPresupuestoVentasPunVen!=null) {
				this.jScrollPanelDatosPresupuestoVentasPunVen.setVisible(false);
			}
			
			if(this.jPanelPaginacionPresupuestoVentasPunVen!=null) {
				this.jPanelPaginacionPresupuestoVentasPunVen.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPresupuestoVentasPunVen!=null) {
				this.jPanelParametrosReportesPresupuestoVentasPunVen.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionPresupuestoVentasPunVen!=null) {
				this.jScrollPanelDatosEdicionPresupuestoVentasPunVen.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresupuestoVentasPunVen!=null) {
				this.jTabbedPaneBusquedasPresupuestoVentasPunVen.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPresupuestoVentasPunVen!=null) {
				this.jScrollPanelDatosPresupuestoVentasPunVen.setVisible(false);
			}
			
			if(this.jPanelPaginacionPresupuestoVentasPunVen!=null) {
				this.jPanelPaginacionPresupuestoVentasPunVen.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPresupuestoVentasPunVen!=null) {
				this.jPanelParametrosReportesPresupuestoVentasPunVen.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionPresupuestoVentasPunVen!=null) {
				this.jScrollPanelDatosEdicionPresupuestoVentasPunVen.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresupuestoVentasPunVen!=null) {
				this.jTabbedPaneBusquedasPresupuestoVentasPunVen.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPresupuestoVentasPunVen!=null) {
				this.jScrollPanelDatosPresupuestoVentasPunVen.setVisible(true);
			}
			
			if(this.jPanelPaginacionPresupuestoVentasPunVen!=null) {
				this.jPanelPaginacionPresupuestoVentasPunVen.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPresupuestoVentasPunVen!=null) {
				this.jPanelParametrosReportesPresupuestoVentasPunVen.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionPresupuestoVentasPunVen!=null) {
				this.jScrollPanelDatosEdicionPresupuestoVentasPunVen.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresupuestoVentasPunVen!=null) {
				this.jTabbedPaneBusquedasPresupuestoVentasPunVen.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPresupuestoVentasPunVen!=null) {
				this.jScrollPanelDatosPresupuestoVentasPunVen.setVisible(true);
			}
			
			if(this.jPanelPaginacionPresupuestoVentasPunVen!=null) {
				this.jPanelPaginacionPresupuestoVentasPunVen.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPresupuestoVentasPunVen!=null) {
				this.jPanelParametrosReportesPresupuestoVentasPunVen.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionPresupuestoVentasPunVen!=null) {
				this.jScrollPanelDatosEdicionPresupuestoVentasPunVen.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresupuestoVentasPunVen!=null) {
				this.jTabbedPaneBusquedasPresupuestoVentasPunVen.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPresupuestoVentasPunVen!=null) {
				this.jScrollPanelDatosPresupuestoVentasPunVen.setVisible(true);
			}
			
			if(this.jPanelPaginacionPresupuestoVentasPunVen!=null) {
				this.jPanelPaginacionPresupuestoVentasPunVen.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPresupuestoVentasPunVen!=null) {
				this.jPanelParametrosReportesPresupuestoVentasPunVen.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasPresupuestoVentasPunVen!=null) {
					this.jTabbedPaneBusquedasPresupuestoVentasPunVen.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesPresupuestoVentasPunVen!=null) {
				this.jPanelParametrosReportesPresupuestoVentasPunVen.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.presupuestoventaspunvenSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresupuestoVentasPunVen!=null) {
				this.jTabbedPaneBusquedasPresupuestoVentasPunVen.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesPresupuestoVentasPunVen!=null) {
				this.jPanelParametrosReportesPresupuestoVentasPunVen.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdCaja=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCaja) {this.jTabbedPaneBusquedasPresupuestoVentasPunVen.remove(jPanelFK_IdCajaPresupuestoVentasPunVen);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdCaja=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdCaja) {this.jTabbedPaneBusquedasPresupuestoVentasPunVen.remove(jPanelFK_IdCajaPresupuestoVentasPunVen);}
		}
		
	}

	public void setVisibilidadBusquedasParaEjercicio(Boolean isParaEjercicio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEjercicioNegation=!isParaEjercicio;

			this.isVisibilidadFK_IdCaja=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdCaja) {this.jTabbedPaneBusquedasPresupuestoVentasPunVen.remove(jPanelFK_IdCajaPresupuestoVentasPunVen);}
		}
		
	}

	public void setVisibilidadBusquedasParaPeriodo(Boolean isParaPeriodo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPeriodoNegation=!isParaPeriodo;

			this.isVisibilidadFK_IdCaja=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdCaja) {this.jTabbedPaneBusquedasPresupuestoVentasPunVen.remove(jPanelFK_IdCajaPresupuestoVentasPunVen);}
		}
		
	}

	public void setVisibilidadBusquedasParaCaja(Boolean isParaCaja){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCajaNegation=!isParaCaja;

			this.isVisibilidadFK_IdCaja=isParaCaja;
			if(!this.isVisibilidadFK_IdCaja) {this.jTabbedPaneBusquedasPresupuestoVentasPunVen.remove(jPanelFK_IdCajaPresupuestoVentasPunVen);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//PresupuestoVentasPunVenSessionBean presupuestoventaspunvenSessionBean=new PresupuestoVentasPunVenSessionBean();
		
		if(this.presupuestoventaspunvenSessionBean==null) {
			this.presupuestoventaspunvenSessionBean=new PresupuestoVentasPunVenSessionBean();
		}
		
		this.presupuestoventaspunvenSessionBean.setsUltimaBusquedaPresupuestoVentasPunVen(this.getsAccionBusqueda());
		this.presupuestoventaspunvenSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.presupuestoventaspunvenSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdCaja")) {
			presupuestoventaspunvenSessionBean.setid_caja(this.getid_cajaFK_IdCaja());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEjercicio")) {
			presupuestoventaspunvenSessionBean.setid_ejercicio(this.getid_ejercicioFK_IdEjercicio());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			presupuestoventaspunvenSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdPeriodo")) {
			presupuestoventaspunvenSessionBean.setid_periodo(this.getid_periodoFK_IdPeriodo());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			presupuestoventaspunvenSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//PresupuestoVentasPunVenSessionBean presupuestoventaspunvenSessionBean=new PresupuestoVentasPunVenSessionBean();
		
		if(this.presupuestoventaspunvenSessionBean==null) {
			this.presupuestoventaspunvenSessionBean=new PresupuestoVentasPunVenSessionBean();
		}
		
		if(this.presupuestoventaspunvenSessionBean.getsUltimaBusquedaPresupuestoVentasPunVen()!=null&&!this.presupuestoventaspunvenSessionBean.getsUltimaBusquedaPresupuestoVentasPunVen().equals("")) {
			this.setsAccionBusqueda(presupuestoventaspunvenSessionBean.getsUltimaBusquedaPresupuestoVentasPunVen());
			this.setiNumeroPaginacion(presupuestoventaspunvenSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(presupuestoventaspunvenSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdCaja")) {
				this.setid_cajaFK_IdCaja(presupuestoventaspunvenSessionBean.getid_caja());
				presupuestoventaspunvenSessionBean.setid_caja(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEjercicio")) {
				this.setid_ejercicioFK_IdEjercicio(presupuestoventaspunvenSessionBean.getid_ejercicio());
				presupuestoventaspunvenSessionBean.setid_ejercicio(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(presupuestoventaspunvenSessionBean.getid_empresa());
				presupuestoventaspunvenSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdPeriodo")) {
				this.setid_periodoFK_IdPeriodo(presupuestoventaspunvenSessionBean.getid_periodo());
				presupuestoventaspunvenSessionBean.setid_periodo(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(presupuestoventaspunvenSessionBean.getid_sucursal());
				presupuestoventaspunvenSessionBean.setid_sucursal(-1L);
			}
		}
		
		this.presupuestoventaspunvenSessionBean.setsUltimaBusquedaPresupuestoVentasPunVen("");
		this.presupuestoventaspunvenSessionBean.setiNumeroPaginacion(PresupuestoVentasPunVenConstantesFunciones.INUMEROPAGINACION);
		this.presupuestoventaspunvenSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaPresupuestoVentasPunVen(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioPresupuestoVentasPunVen() {
		this.updateBorderResaltarBusquedasFormularioPresupuestoVentasPunVen();
		this.updateVisibilidadBusquedasFormularioPresupuestoVentasPunVen();
		this.updateHabilitarBusquedasFormularioPresupuestoVentasPunVen();
	}
	
	public void updateBorderResaltarBusquedasFormularioPresupuestoVentasPunVen() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasPresupuestoVentasPunVen.getComponents().length>0) {
	

		if(this.presupuestoventaspunvenConstantesFunciones.resaltarFK_IdCajaPresupuestoVentasPunVen!=null) {
			index= this.jTabbedPaneBusquedasPresupuestoVentasPunVen.indexOfComponent(this.jPanelFK_IdCajaPresupuestoVentasPunVen);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPresupuestoVentasPunVen.getComponent(index);
				jPanel.setBorder(this.presupuestoventaspunvenConstantesFunciones.resaltarFK_IdCajaPresupuestoVentasPunVen);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioPresupuestoVentasPunVen() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasPresupuestoVentasPunVen.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPresupuestoVentasPunVen.indexOfComponent(this.jPanelFK_IdCajaPresupuestoVentasPunVen);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPresupuestoVentasPunVen.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.presupuestoventaspunvenConstantesFunciones.mostrarFK_IdCajaPresupuestoVentasPunVen);
			if(!this.presupuestoventaspunvenConstantesFunciones.mostrarFK_IdCajaPresupuestoVentasPunVen && index>-1) {
				this.jTabbedPaneBusquedasPresupuestoVentasPunVen.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioPresupuestoVentasPunVen() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasPresupuestoVentasPunVen.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPresupuestoVentasPunVen.indexOfComponent(this.jPanelFK_IdCajaPresupuestoVentasPunVen);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPresupuestoVentasPunVen.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.presupuestoventaspunvenConstantesFunciones.activarFK_IdCajaPresupuestoVentasPunVen);
				this.jTabbedPaneBusquedasPresupuestoVentasPunVen.setEnabledAt(index,this.presupuestoventaspunvenConstantesFunciones.activarFK_IdCajaPresupuestoVentasPunVen);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaPresupuestoVentasPunVen(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdCaja")) {
			index= this.jTabbedPaneBusquedasPresupuestoVentasPunVen.indexOfComponent(this.jPanelFK_IdCajaPresupuestoVentasPunVen);

			this.jTabbedPaneBusquedasPresupuestoVentasPunVen.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPresupuestoVentasPunVen.getComponent(index);

			this.presupuestoventaspunvenConstantesFunciones.setResaltarFK_IdCajaPresupuestoVentasPunVen(resaltar);

			jPanel.setBorder(this.presupuestoventaspunvenConstantesFunciones.resaltarFK_IdCajaPresupuestoVentasPunVen);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarPresupuestoVentasPunVen.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioPresupuestoVentasPunVen() throws Exception {

		if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioPresupuestoVentasPunVen();
		this.updateVisibilidadResaltarControlesFormularioPresupuestoVentasPunVen();
		this.updateHabilitarResaltarControlesFormularioPresupuestoVentasPunVen();
		
	}
	
	public void updateBorderResaltarControlesFormularioPresupuestoVentasPunVen() throws Exception {
		if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.presupuestoventaspunvenConstantesFunciones.resaltaridPresupuestoVentasPunVen!=null && this.jInternalFrameDetalleFormPresupuestoVentasPunVen!=null) {this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jLabelidPresupuestoVentasPunVen.setBorder(this.presupuestoventaspunvenConstantesFunciones.resaltaridPresupuestoVentasPunVen);}
		if(this.presupuestoventaspunvenConstantesFunciones.resaltarid_empresaPresupuestoVentasPunVen!=null && this.jInternalFrameDetalleFormPresupuestoVentasPunVen!=null) {this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxid_empresaPresupuestoVentasPunVen.setBorder(this.presupuestoventaspunvenConstantesFunciones.resaltarid_empresaPresupuestoVentasPunVen);}
		if(this.presupuestoventaspunvenConstantesFunciones.resaltarid_sucursalPresupuestoVentasPunVen!=null && this.jInternalFrameDetalleFormPresupuestoVentasPunVen!=null) {this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxid_sucursalPresupuestoVentasPunVen.setBorder(this.presupuestoventaspunvenConstantesFunciones.resaltarid_sucursalPresupuestoVentasPunVen);}
		if(this.presupuestoventaspunvenConstantesFunciones.resaltarid_ejercicioPresupuestoVentasPunVen!=null && this.jInternalFrameDetalleFormPresupuestoVentasPunVen!=null) {this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxid_ejercicioPresupuestoVentasPunVen.setBorder(this.presupuestoventaspunvenConstantesFunciones.resaltarid_ejercicioPresupuestoVentasPunVen);}
		if(this.presupuestoventaspunvenConstantesFunciones.resaltarid_periodoPresupuestoVentasPunVen!=null && this.jInternalFrameDetalleFormPresupuestoVentasPunVen!=null) {this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxid_periodoPresupuestoVentasPunVen.setBorder(this.presupuestoventaspunvenConstantesFunciones.resaltarid_periodoPresupuestoVentasPunVen);}
		if(this.presupuestoventaspunvenConstantesFunciones.resaltarid_cajaPresupuestoVentasPunVen!=null && this.jInternalFrameDetalleFormPresupuestoVentasPunVen!=null) {this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxid_cajaPresupuestoVentasPunVen.setBorder(this.presupuestoventaspunvenConstantesFunciones.resaltarid_cajaPresupuestoVentasPunVen);}
		if(this.presupuestoventaspunvenConstantesFunciones.resaltarvalorPresupuestoVentasPunVen!=null && this.jInternalFrameDetalleFormPresupuestoVentasPunVen!=null) {this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jTextFieldvalorPresupuestoVentasPunVen.setBorder(this.presupuestoventaspunvenConstantesFunciones.resaltarvalorPresupuestoVentasPunVen);}
		if(this.presupuestoventaspunvenConstantesFunciones.resaltarcantidadPresupuestoVentasPunVen!=null && this.jInternalFrameDetalleFormPresupuestoVentasPunVen!=null) {this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jTextFieldcantidadPresupuestoVentasPunVen.setBorder(this.presupuestoventaspunvenConstantesFunciones.resaltarcantidadPresupuestoVentasPunVen);}
		if(this.presupuestoventaspunvenConstantesFunciones.resaltarporcentajePresupuestoVentasPunVen!=null && this.jInternalFrameDetalleFormPresupuestoVentasPunVen!=null) {this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jTextFieldporcentajePresupuestoVentasPunVen.setBorder(this.presupuestoventaspunvenConstantesFunciones.resaltarporcentajePresupuestoVentasPunVen);}
		if(this.presupuestoventaspunvenConstantesFunciones.resaltarcantidad_totalPresupuestoVentasPunVen!=null && this.jInternalFrameDetalleFormPresupuestoVentasPunVen!=null) {this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jTextFieldcantidad_totalPresupuestoVentasPunVen.setBorder(this.presupuestoventaspunvenConstantesFunciones.resaltarcantidad_totalPresupuestoVentasPunVen);}
		if(this.presupuestoventaspunvenConstantesFunciones.resaltarvalor_totalPresupuestoVentasPunVen!=null && this.jInternalFrameDetalleFormPresupuestoVentasPunVen!=null) {this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jTextFieldvalor_totalPresupuestoVentasPunVen.setBorder(this.presupuestoventaspunvenConstantesFunciones.resaltarvalor_totalPresupuestoVentasPunVen);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioPresupuestoVentasPunVen() throws Exception {		
		if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen!=null) {
	
		//this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jLabelidPresupuestoVentasPunVen.setVisible(this.presupuestoventaspunvenConstantesFunciones.mostraridPresupuestoVentasPunVen);
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jPanelidPresupuestoVentasPunVen.setVisible(this.presupuestoventaspunvenConstantesFunciones.mostraridPresupuestoVentasPunVen);
		//this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxid_empresaPresupuestoVentasPunVen.setVisible(this.presupuestoventaspunvenConstantesFunciones.mostrarid_empresaPresupuestoVentasPunVen);
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jPanelid_empresaPresupuestoVentasPunVen.setVisible(this.presupuestoventaspunvenConstantesFunciones.mostrarid_empresaPresupuestoVentasPunVen);
		//this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxid_sucursalPresupuestoVentasPunVen.setVisible(this.presupuestoventaspunvenConstantesFunciones.mostrarid_sucursalPresupuestoVentasPunVen);
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jPanelid_sucursalPresupuestoVentasPunVen.setVisible(this.presupuestoventaspunvenConstantesFunciones.mostrarid_sucursalPresupuestoVentasPunVen);
		//this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxid_ejercicioPresupuestoVentasPunVen.setVisible(this.presupuestoventaspunvenConstantesFunciones.mostrarid_ejercicioPresupuestoVentasPunVen);
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jPanelid_ejercicioPresupuestoVentasPunVen.setVisible(this.presupuestoventaspunvenConstantesFunciones.mostrarid_ejercicioPresupuestoVentasPunVen);
		//this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxid_periodoPresupuestoVentasPunVen.setVisible(this.presupuestoventaspunvenConstantesFunciones.mostrarid_periodoPresupuestoVentasPunVen);
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jPanelid_periodoPresupuestoVentasPunVen.setVisible(this.presupuestoventaspunvenConstantesFunciones.mostrarid_periodoPresupuestoVentasPunVen);
		//this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxid_cajaPresupuestoVentasPunVen.setVisible(this.presupuestoventaspunvenConstantesFunciones.mostrarid_cajaPresupuestoVentasPunVen);
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jPanelid_cajaPresupuestoVentasPunVen.setVisible(this.presupuestoventaspunvenConstantesFunciones.mostrarid_cajaPresupuestoVentasPunVen);
		//this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jTextFieldvalorPresupuestoVentasPunVen.setVisible(this.presupuestoventaspunvenConstantesFunciones.mostrarvalorPresupuestoVentasPunVen);
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jPanelvalorPresupuestoVentasPunVen.setVisible(this.presupuestoventaspunvenConstantesFunciones.mostrarvalorPresupuestoVentasPunVen);
		//this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jTextFieldcantidadPresupuestoVentasPunVen.setVisible(this.presupuestoventaspunvenConstantesFunciones.mostrarcantidadPresupuestoVentasPunVen);
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jPanelcantidadPresupuestoVentasPunVen.setVisible(this.presupuestoventaspunvenConstantesFunciones.mostrarcantidadPresupuestoVentasPunVen);
		//this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jTextFieldporcentajePresupuestoVentasPunVen.setVisible(this.presupuestoventaspunvenConstantesFunciones.mostrarporcentajePresupuestoVentasPunVen);
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jPanelporcentajePresupuestoVentasPunVen.setVisible(this.presupuestoventaspunvenConstantesFunciones.mostrarporcentajePresupuestoVentasPunVen);
		//this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jTextFieldcantidad_totalPresupuestoVentasPunVen.setVisible(this.presupuestoventaspunvenConstantesFunciones.mostrarcantidad_totalPresupuestoVentasPunVen);
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jPanelcantidad_totalPresupuestoVentasPunVen.setVisible(this.presupuestoventaspunvenConstantesFunciones.mostrarcantidad_totalPresupuestoVentasPunVen);
		//this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jTextFieldvalor_totalPresupuestoVentasPunVen.setVisible(this.presupuestoventaspunvenConstantesFunciones.mostrarvalor_totalPresupuestoVentasPunVen);
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jPanelvalor_totalPresupuestoVentasPunVen.setVisible(this.presupuestoventaspunvenConstantesFunciones.mostrarvalor_totalPresupuestoVentasPunVen);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioPresupuestoVentasPunVen() throws Exception {
		if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPresupuestoVentasPunVen!=null) {
	
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jLabelidPresupuestoVentasPunVen.setEnabled(this.presupuestoventaspunvenConstantesFunciones.activaridPresupuestoVentasPunVen);
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxid_empresaPresupuestoVentasPunVen.setEnabled(this.presupuestoventaspunvenConstantesFunciones.activarid_empresaPresupuestoVentasPunVen);
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxid_sucursalPresupuestoVentasPunVen.setEnabled(this.presupuestoventaspunvenConstantesFunciones.activarid_sucursalPresupuestoVentasPunVen);
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxid_ejercicioPresupuestoVentasPunVen.setEnabled(this.presupuestoventaspunvenConstantesFunciones.activarid_ejercicioPresupuestoVentasPunVen);
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxid_periodoPresupuestoVentasPunVen.setEnabled(this.presupuestoventaspunvenConstantesFunciones.activarid_periodoPresupuestoVentasPunVen);
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jComboBoxid_cajaPresupuestoVentasPunVen.setEnabled(this.presupuestoventaspunvenConstantesFunciones.activarid_cajaPresupuestoVentasPunVen);
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jTextFieldvalorPresupuestoVentasPunVen.setEnabled(this.presupuestoventaspunvenConstantesFunciones.activarvalorPresupuestoVentasPunVen);
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jTextFieldcantidadPresupuestoVentasPunVen.setEnabled(this.presupuestoventaspunvenConstantesFunciones.activarcantidadPresupuestoVentasPunVen);
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jTextFieldporcentajePresupuestoVentasPunVen.setEnabled(this.presupuestoventaspunvenConstantesFunciones.activarporcentajePresupuestoVentasPunVen);
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jTextFieldcantidad_totalPresupuestoVentasPunVen.setEnabled(this.presupuestoventaspunvenConstantesFunciones.activarcantidad_totalPresupuestoVentasPunVen);
		this.jInternalFrameDetalleFormPresupuestoVentasPunVen.jTextFieldvalor_totalPresupuestoVentasPunVen.setEnabled(this.presupuestoventaspunvenConstantesFunciones.activarvalor_totalPresupuestoVentasPunVen);
		}
	}
	
		
}