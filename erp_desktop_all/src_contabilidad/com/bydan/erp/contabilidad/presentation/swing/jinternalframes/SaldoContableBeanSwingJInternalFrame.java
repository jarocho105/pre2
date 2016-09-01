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

import com.bydan.erp.contabilidad.util.SaldoContableConstantesFunciones;
import com.bydan.erp.contabilidad.util.SaldoContableParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.SaldoContableParameterGeneral;
//import com.bydan.erp.contabilidad.presentation.report.source.SaldoContableBean;
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
public class SaldoContableBeanSwingJInternalFrame extends SaldoContableJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(SaldoContableBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<SaldoContable> saldocontableValidator = new ClassValidator<SaldoContable>(SaldoContable.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public SaldoContable saldocontable;	
	public SaldoContable saldocontableAux;
	public SaldoContable saldocontableAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public SaldoContable saldocontableTotales;
	public Long idSaldoContableActual;
	public Long iIdNuevoSaldoContable=0L;
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

	public String sFinalQueryComboCuentaContable="";

	public List<CuentaContable> cuentacontablesForeignKey;

	public List<CuentaContable> getcuentacontablesForeignKey() {
		return cuentacontablesForeignKey;
	}

	public void setcuentacontablesForeignKey(List<CuentaContable> cuentacontablesForeignKey) {
		this.cuentacontablesForeignKey = cuentacontablesForeignKey;
	}

	//OBJETO FK ACTUAL
	public CuentaContable cuentacontableForeignKey;

	public CuentaContable getcuentacontableForeignKey() {
		return cuentacontableForeignKey;
	}

	public void setcuentacontableForeignKey(CuentaContable cuentacontableForeignKey) {
		this.cuentacontableForeignKey = cuentacontableForeignKey;
	}

		
	
	
	
	//BUSQUEDA INTERNA FK
	public Long idCuentaContableActual=0L;

	public Long getidCuentaContableActual() {
		return idCuentaContableActual;
	}

	public void setidCuentaContableActual(Long idCuentaContableActual) {
		this.idCuentaContableActual= idCuentaContableActual;
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
	
	public Boolean isPermisoTodoSaldoContable;
	public Boolean isPermisoNuevoSaldoContable;
	public Boolean isPermisoActualizarSaldoContable;
	public Boolean isPermisoActualizarOriginalSaldoContable;
	public Boolean isPermisoEliminarSaldoContable;
	public Boolean isPermisoGuardarCambiosSaldoContable;
	public Boolean isPermisoConsultaSaldoContable;
	public Boolean isPermisoBusquedaSaldoContable;
	public Boolean isPermisoReporteSaldoContable;
	public Boolean isPermisoPaginacionMedioSaldoContable;
	public Boolean isPermisoPaginacionAltoSaldoContable;
	public Boolean isPermisoPaginacionTodoSaldoContable;
	public Boolean isPermisoCopiarSaldoContable;
	public Boolean isPermisoVerFormSaldoContable;
	public Boolean isPermisoDuplicarSaldoContable;
	public Boolean isPermisoOrdenSaldoContable;
	
	
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
	
	public SaldoContableParameterReturnGeneral saldocontableReturnGeneral;
	public SaldoContableParameterReturnGeneral saldocontableParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoSaldoContable=false;
	public Boolean esParaAccionDesdeFormularioSaldoContable=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected SaldoContableSessionBeanAdditional saldocontableSessionBeanAdditional=null;
	
	public SaldoContableSessionBeanAdditional getSaldoContableSessionBeanAdditional() {
		return this.saldocontableSessionBeanAdditional;
	}
	
	public void setSaldoContableSessionBeanAdditional(SaldoContableSessionBeanAdditional saldocontableSessionBeanAdditional) {
		try {
			this.saldocontableSessionBeanAdditional=saldocontableSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected SaldoContableBeanSwingJInternalFrameAdditional saldocontableBeanSwingJInternalFrameAdditional=null;
	//public class SaldoContableBeanSwingJInternalFrame
	
	public SaldoContableBeanSwingJInternalFrameAdditional getSaldoContableBeanSwingJInternalFrameAdditional() {
		return this.saldocontableBeanSwingJInternalFrameAdditional;
	}
	
	public void setSaldoContableBeanSwingJInternalFrameAdditional(SaldoContableBeanSwingJInternalFrameAdditional saldocontableBeanSwingJInternalFrameAdditional) {
		try {
			this.saldocontableBeanSwingJInternalFrameAdditional=saldocontableBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public SaldoContableLogic saldocontableLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public SaldoContable saldocontableBean;
	public SaldoContableConstantesFunciones saldocontableConstantesFunciones;
	//public SaldoContableParameterReturnGeneral saldocontableReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public EjercicioLogic ejercicioLogic;
	public PeriodoLogic periodoLogic;
	public AnioLogic anioLogic;
	public MesLogic mesLogic;
	public CuentaContableLogic cuentacontableLogic;
	
	//PARAMETROS
	
	
	//public List<SaldoContable> saldocontables;	
	//public List<SaldoContable> saldocontablesEliminados;
	//public List<SaldoContable> saldocontablesAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoSaldoContable=false;
	public Boolean isVisibilidadCeldaDuplicarSaldoContable=true;
	public Boolean isVisibilidadCeldaCopiarSaldoContable=true;
	public Boolean isVisibilidadCeldaVerFormSaldoContable=true;
	public Boolean isVisibilidadCeldaOrdenSaldoContable=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesSaldoContable=false;
	public Boolean isVisibilidadCeldaModificarSaldoContable=false;
	public Boolean isVisibilidadCeldaActualizarSaldoContable=false;
	public Boolean isVisibilidadCeldaEliminarSaldoContable=false;
	public Boolean isVisibilidadCeldaCancelarSaldoContable=false;
	public Boolean isVisibilidadCeldaGuardarSaldoContable=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosSaldoContable=false;	
	
	
	public Boolean isVisibilidadFK_IdAnio=false;
	public Boolean isVisibilidadFK_IdCuentaContable=false;
	public Boolean isVisibilidadFK_IdEjercicio=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdMes=false;
	public Boolean isVisibilidadFK_IdPeriodo=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoSaldoContable() {
		return this.iIdNuevoSaldoContable;
	}

	public void setiIdNuevoSaldoContable(Long iIdNuevoSaldoContable) {
		this.iIdNuevoSaldoContable = iIdNuevoSaldoContable;
	}
	
	public Long getidSaldoContableActual() {
		return this.idSaldoContableActual;
	}

	public void setidSaldoContableActual(Long idSaldoContableActual) {
		this.idSaldoContableActual = idSaldoContableActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public SaldoContable getsaldocontable() {
		return this.saldocontable;
	}

	public void setsaldocontable(SaldoContable saldocontable) {
		this.saldocontable = saldocontable;
	}
	
	public SaldoContable getsaldocontableAux() {
		return this.saldocontableAux;
	}

	public void setsaldocontableAux(SaldoContable saldocontableAux) {
		this.saldocontableAux = saldocontableAux;
	}				
	
	public SaldoContable getsaldocontableAnterior() {
		return this.saldocontableAnterior;
	}

	public void setsaldocontableAnterior(SaldoContable saldocontableAnterior) {
		this.saldocontableAnterior = saldocontableAnterior;
	}	
	
	public SaldoContable getsaldocontableTotales() {
		return this.saldocontableTotales;
	}

	public void setsaldocontableTotales(SaldoContable saldocontableTotales) {
		this.saldocontableTotales = saldocontableTotales;
	}	
	
	public SaldoContable getsaldocontableBean() {
		return this.saldocontableBean;
	}

	public void setsaldocontableBean(SaldoContable saldocontableBean) {
		this.saldocontableBean = saldocontableBean;
	}	
	
	public SaldoContableParameterReturnGeneral getsaldocontableReturnGeneral() {
		return this.saldocontableReturnGeneral;
	}

	public void setsaldocontableReturnGeneral(SaldoContableParameterReturnGeneral saldocontableReturnGeneral) {
		this.saldocontableReturnGeneral = saldocontableReturnGeneral;
	}	
	
	
	public Long id_anioFK_IdAnio=null;

	public Long getid_anioFK_IdAnio() {
		return this.id_anioFK_IdAnio;
	}

	public void setid_anioFK_IdAnio(Long id_anioFK_IdAnio) {
		this.id_anioFK_IdAnio = id_anioFK_IdAnio;
	}

	public Long id_cuenta_contableFK_IdCuentaContable=-1L;

	public Long getid_cuenta_contableFK_IdCuentaContable() {
		return this.id_cuenta_contableFK_IdCuentaContable;
	}

	public void setid_cuenta_contableFK_IdCuentaContable(Long id_cuenta_contableFK_IdCuentaContable) {
		this.id_cuenta_contableFK_IdCuentaContable = id_cuenta_contableFK_IdCuentaContable;
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

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public SaldoContableLogic getSaldoContableLogic()	{		
		return saldocontableLogic;
	}

	public void setSaldoContableLogic(SaldoContableLogic saldocontableLogic) {
		this.saldocontableLogic = saldocontableLogic;
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
	
	public Boolean getIsEsNuevoSaldoContable() {
		return isEsNuevoSaldoContable;
	}

	public void setIsEsNuevoSaldoContable(Boolean isEsNuevoSaldoContable) {
		this.isEsNuevoSaldoContable = isEsNuevoSaldoContable;
	}

	public Boolean getEsParaAccionDesdeFormularioSaldoContable() {
		return esParaAccionDesdeFormularioSaldoContable;
	}
	
	public void setEsParaAccionDesdeFormularioSaldoContable(Boolean esParaAccionDesdeFormularioSaldoContable) {
		this.esParaAccionDesdeFormularioSaldoContable = esParaAccionDesdeFormularioSaldoContable;
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

			if(this.saldocontableSessionBean==null) {
				this.saldocontableSessionBean=new SaldoContableSessionBean();
			}

			if(!this.saldocontableSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(saldocontableSessionBean.getlidEmpresaActual());
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

			if(this.saldocontableSessionBean==null) {
				this.saldocontableSessionBean=new SaldoContableSessionBean();
			}

			if(!this.saldocontableSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(saldocontableSessionBean.getlidSucursalActual());
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

			if(this.saldocontableSessionBean==null) {
				this.saldocontableSessionBean=new SaldoContableSessionBean();
			}

			if(!this.saldocontableSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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
					ejercicioLogic.getEntityWithConnection(saldocontableSessionBean.getlidEjercicioActual());
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

			if(this.saldocontableSessionBean==null) {
				this.saldocontableSessionBean=new SaldoContableSessionBean();
			}

			if(!this.saldocontableSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
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
					periodoLogic.getEntityWithConnection(saldocontableSessionBean.getlidPeriodoActual());
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

			if(this.saldocontableSessionBean==null) {
				this.saldocontableSessionBean=new SaldoContableSessionBean();
			}

			if(!this.saldocontableSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
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
					anioLogic.getEntityWithConnection(saldocontableSessionBean.getlidAnioActual());
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

			if(this.saldocontableSessionBean==null) {
				this.saldocontableSessionBean=new SaldoContableSessionBean();
			}

			if(!this.saldocontableSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
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
					mesLogic.getEntityWithConnection(saldocontableSessionBean.getlidMesActual());
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

	public void cargarCombosCuentaContablesForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.cuentacontablesForeignKey=new ArrayList<CuentaContable>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			CuentaContableLogic cuentacontableLogic=new CuentaContableLogic();

			//cuentacontableLogic.getCuentaContableDataAccess().setIsForForeingKeyData(true);

			if(this.saldocontableSessionBean==null) {
				this.saldocontableSessionBean=new SaldoContableSessionBean();
			}

			if(!this.saldocontableSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContable()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cuentacontableLogic.getCuentaContableDataAccess().setIsForForeingKeyData(true);

					cuentacontableLogic.getTodosCuentaContablesWithConnection(sFinalQuery,new Pagination());

					this.cuentacontablesForeignKey=cuentacontableLogic.getCuentaContables();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCuentaContable(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacontableLogic.getEntityWithConnection(saldocontableSessionBean.getlidCuentaContableActual());
					this.cuentacontablesForeignKey.add(cuentacontableLogic.getCuentaContable());
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

					if(this.saldocontable!=null) {
						this.saldocontable.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormSaldoContable!=null) {
						this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_empresaSaldoContable.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaSaldoContable.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormSaldoContable!=null) {
						if(this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_empresaSaldoContable.getItemCount()>0) {
							this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_empresaSaldoContable.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaSaldoContableGenerico)throws Exception
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
				jComboBoxid_empresaSaldoContableGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaSaldoContableGenerico!=null && jComboBoxid_empresaSaldoContableGenerico.getItemCount()>0) {
					jComboBoxid_empresaSaldoContableGenerico.setSelectedIndex(0);
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

					if(this.saldocontable!=null) {
						this.saldocontable.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormSaldoContable!=null) {
						this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_sucursalSaldoContable.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalSaldoContable.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormSaldoContable!=null) {
						if(this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_sucursalSaldoContable.getItemCount()>0) {
							this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_sucursalSaldoContable.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalSaldoContableGenerico)throws Exception
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
				jComboBoxid_sucursalSaldoContableGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalSaldoContableGenerico!=null && jComboBoxid_sucursalSaldoContableGenerico.getItemCount()>0) {
					jComboBoxid_sucursalSaldoContableGenerico.setSelectedIndex(0);
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

					if(this.saldocontable!=null) {
						this.saldocontable.setEjercicio(ejercicioTemp);
					}

					if(this.jInternalFrameDetalleFormSaldoContable!=null) {
						this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_ejercicioSaldoContable.setSelectedItem(ejercicioTemp);
					}
				} else {
					//jComboBoxid_ejercicioSaldoContable.setSelectedItem(ejercicioTemp);
					if(this.jInternalFrameDetalleFormSaldoContable!=null) {
						if(this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_ejercicioSaldoContable.getItemCount()>0) {
							this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_ejercicioSaldoContable.setSelectedIndex(0);
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
	public void setActualEjercicioForeignKeyGenerico(Long idEjercicioSeleccionado,JComboBox jComboBoxid_ejercicioSaldoContableGenerico)throws Exception
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
				jComboBoxid_ejercicioSaldoContableGenerico.setSelectedItem(ejercicioTemp);
			} else {
				if(jComboBoxid_ejercicioSaldoContableGenerico!=null && jComboBoxid_ejercicioSaldoContableGenerico.getItemCount()>0) {
					jComboBoxid_ejercicioSaldoContableGenerico.setSelectedIndex(0);
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

					if(this.saldocontable!=null) {
						this.saldocontable.setPeriodo(periodoTemp);
					}

					if(this.jInternalFrameDetalleFormSaldoContable!=null) {
						this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_periodoSaldoContable.setSelectedItem(periodoTemp);
					}
				} else {
					//jComboBoxid_periodoSaldoContable.setSelectedItem(periodoTemp);
					if(this.jInternalFrameDetalleFormSaldoContable!=null) {
						if(this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_periodoSaldoContable.getItemCount()>0) {
							this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_periodoSaldoContable.setSelectedIndex(0);
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
	public void setActualPeriodoForeignKeyGenerico(Long idPeriodoSeleccionado,JComboBox jComboBoxid_periodoSaldoContableGenerico)throws Exception
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
				jComboBoxid_periodoSaldoContableGenerico.setSelectedItem(periodoTemp);
			} else {
				if(jComboBoxid_periodoSaldoContableGenerico!=null && jComboBoxid_periodoSaldoContableGenerico.getItemCount()>0) {
					jComboBoxid_periodoSaldoContableGenerico.setSelectedIndex(0);
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

					if(this.saldocontable!=null) {
						this.saldocontable.setAnio(anioTemp);
					}

					if(this.jInternalFrameDetalleFormSaldoContable!=null) {
						this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_anioSaldoContable.setSelectedItem(anioTemp);
					}
				} else {
					//jComboBoxid_anioSaldoContable.setSelectedItem(anioTemp);
					if(this.jInternalFrameDetalleFormSaldoContable!=null) {
						if(this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_anioSaldoContable.getItemCount()>0) {
							this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_anioSaldoContable.setSelectedIndex(0);
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
	public void setActualAnioForeignKeyGenerico(Long idAnioSeleccionado,JComboBox jComboBoxid_anioSaldoContableGenerico)throws Exception
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
				jComboBoxid_anioSaldoContableGenerico.setSelectedItem(anioTemp);
			} else {
				if(jComboBoxid_anioSaldoContableGenerico!=null && jComboBoxid_anioSaldoContableGenerico.getItemCount()>0) {
					jComboBoxid_anioSaldoContableGenerico.setSelectedIndex(0);
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

					if(this.saldocontable!=null) {
						this.saldocontable.setMes(mesTemp);
					}

					if(this.jInternalFrameDetalleFormSaldoContable!=null) {
						this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_mesSaldoContable.setSelectedItem(mesTemp);
					}
				} else {
					//jComboBoxid_mesSaldoContable.setSelectedItem(mesTemp);
					if(this.jInternalFrameDetalleFormSaldoContable!=null) {
						if(this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_mesSaldoContable.getItemCount()>0) {
							this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_mesSaldoContable.setSelectedIndex(0);
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
	public void setActualMesForeignKeyGenerico(Long idMesSeleccionado,JComboBox jComboBoxid_mesSaldoContableGenerico)throws Exception
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
				jComboBoxid_mesSaldoContableGenerico.setSelectedItem(mesTemp);
			} else {
				if(jComboBoxid_mesSaldoContableGenerico!=null && jComboBoxid_mesSaldoContableGenerico.getItemCount()>0) {
					jComboBoxid_mesSaldoContableGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualCuentaContableForeignKey(Long idCuentaContableSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			CuentaContable  cuentacontableTemp=null;

			for(CuentaContable cuentacontableAux:cuentacontablesForeignKey) {
				if(cuentacontableAux.getId()!=null && cuentacontableAux.getId().equals(idCuentaContableSeleccionado)) {
					cuentacontableTemp=cuentacontableAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(cuentacontableTemp!=null) {

					if(this.saldocontable!=null) {
						this.saldocontable.setCuentaContable(cuentacontableTemp);
					}

					if(this.jInternalFrameDetalleFormSaldoContable!=null) {
						this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_cuenta_contableSaldoContable.setSelectedItem(cuentacontableTemp);
					}
				} else {
					//jComboBoxid_cuenta_contableSaldoContable.setSelectedItem(cuentacontableTemp);
					if(this.jInternalFrameDetalleFormSaldoContable!=null) {
						if(this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_cuenta_contableSaldoContable.getItemCount()>0) {
							this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_cuenta_contableSaldoContable.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCuentaContable") || sFormularioTipoBusqueda.equals("Todos")){
					if(cuentacontableTemp!=null && jComboBoxid_cuenta_contableFK_IdCuentaContableSaldoContable!=null) {
						jComboBoxid_cuenta_contableFK_IdCuentaContableSaldoContable.setSelectedItem(cuentacontableTemp);
					} else {
						if(jComboBoxid_cuenta_contableFK_IdCuentaContableSaldoContable!=null) {
							//jComboBoxid_cuenta_contableFK_IdCuentaContableSaldoContable.setSelectedItem(cuentacontableTemp);
							if(jComboBoxid_cuenta_contableFK_IdCuentaContableSaldoContable.getItemCount()>0) {
								jComboBoxid_cuenta_contableFK_IdCuentaContableSaldoContable.setSelectedIndex(0);
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

	public String getActualCuentaContableForeignKeyDescripcion(Long idCuentaContableSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			CuentaContable  cuentacontableTemp=null;

			for(CuentaContable cuentacontableAux:cuentacontablesForeignKey) {
				if(cuentacontableAux.getId()!=null && cuentacontableAux.getId().equals(idCuentaContableSeleccionado)) {
					cuentacontableTemp=cuentacontableAux;
					break;
				}
			}


			sDescripcion=CuentaContableConstantesFunciones.getCuentaContableDescripcion(cuentacontableTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualCuentaContableForeignKeyGenerico(Long idCuentaContableSeleccionado,JComboBox jComboBoxid_cuenta_contableSaldoContableGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontableTemp=null;

			for(CuentaContable cuentacontableAux:cuentacontablesForeignKey) {
				if(cuentacontableAux.getId()!=null && cuentacontableAux.getId().equals(idCuentaContableSeleccionado)) {
					cuentacontableTemp=cuentacontableAux;
					break;
				}
			}

			if(cuentacontableTemp!=null) {
				jComboBoxid_cuenta_contableSaldoContableGenerico.setSelectedItem(cuentacontableTemp);
			} else {
				if(jComboBoxid_cuenta_contableSaldoContableGenerico!=null && jComboBoxid_cuenta_contableSaldoContableGenerico.getItemCount()>0) {
					jComboBoxid_cuenta_contableSaldoContableGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(SaldoContable saldocontable,JComboBox jComboBoxid_empresaSaldoContableGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaSaldoContableGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_empresaSaldoContable.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaSaldoContableGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				saldocontable.setid_empresa(empresaAux.getId());
				saldocontable.setempresa_descripcion(SaldoContableConstantesFunciones.getEmpresaDescripcion(empresaAux));
				saldocontable.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(SaldoContable saldocontable,JComboBox jComboBoxid_sucursalSaldoContableGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalSaldoContableGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_sucursalSaldoContable.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalSaldoContableGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				saldocontable.setid_sucursal(sucursalAux.getId());
				saldocontable.setsucursal_descripcion(SaldoContableConstantesFunciones.getSucursalDescripcion(sucursalAux));
				saldocontable.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEjercicioForeignKey(SaldoContable saldocontable,JComboBox jComboBoxid_ejercicioSaldoContableGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioAux=new Ejercicio();

			if(jComboBoxid_ejercicioSaldoContableGenerico==null) {
				ejercicioAux=(Ejercicio)this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_ejercicioSaldoContable.getSelectedItem();
			} else {
				ejercicioAux=(Ejercicio)jComboBoxid_ejercicioSaldoContableGenerico.getSelectedItem();
			}

			if(ejercicioAux!=null && ejercicioAux.getId()!=null) {
				saldocontable.setid_ejercicio(ejercicioAux.getId());
				saldocontable.setejercicio_descripcion(SaldoContableConstantesFunciones.getEjercicioDescripcion(ejercicioAux));
				saldocontable.setEjercicio(ejercicioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPeriodoForeignKey(SaldoContable saldocontable,JComboBox jComboBoxid_periodoSaldoContableGenerico)throws Exception
	{
		try
		{
			Periodo  periodoAux=new Periodo();

			if(jComboBoxid_periodoSaldoContableGenerico==null) {
				periodoAux=(Periodo)this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_periodoSaldoContable.getSelectedItem();
			} else {
				periodoAux=(Periodo)jComboBoxid_periodoSaldoContableGenerico.getSelectedItem();
			}

			if(periodoAux!=null && periodoAux.getId()!=null) {
				if(periodoAux.getid_estado_periodo().equals(0L)) {
					throw new Exception("Periodo INACTIVO, NO PUEDE GUARDAR LA INFORMACION CONSULTE CON EL ADMINISTRADOR");
				}

				saldocontable.setid_periodo(periodoAux.getId());
				saldocontable.setperiodo_descripcion(SaldoContableConstantesFunciones.getPeriodoDescripcion(periodoAux));
				saldocontable.setPeriodo(periodoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarAnioForeignKey(SaldoContable saldocontable,JComboBox jComboBoxid_anioSaldoContableGenerico)throws Exception
	{
		try
		{
			Anio  anioAux=new Anio();

			if(jComboBoxid_anioSaldoContableGenerico==null) {
				anioAux=(Anio)this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_anioSaldoContable.getSelectedItem();
			} else {
				anioAux=(Anio)jComboBoxid_anioSaldoContableGenerico.getSelectedItem();
			}

			if(anioAux!=null) {
				saldocontable.setid_anio(anioAux.getId());
				saldocontable.setanio_descripcion(SaldoContableConstantesFunciones.getAnioDescripcion(anioAux));
				saldocontable.setAnio(anioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarMesForeignKey(SaldoContable saldocontable,JComboBox jComboBoxid_mesSaldoContableGenerico)throws Exception
	{
		try
		{
			Mes  mesAux=new Mes();

			if(jComboBoxid_mesSaldoContableGenerico==null) {
				mesAux=(Mes)this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_mesSaldoContable.getSelectedItem();
			} else {
				mesAux=(Mes)jComboBoxid_mesSaldoContableGenerico.getSelectedItem();
			}

			if(mesAux!=null) {
				saldocontable.setid_mes(mesAux.getId());
				saldocontable.setmes_descripcion(SaldoContableConstantesFunciones.getMesDescripcion(mesAux));
				saldocontable.setMes(mesAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCuentaContableForeignKey(SaldoContable saldocontable,JComboBox jComboBoxid_cuenta_contableSaldoContableGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontableAux=new CuentaContable();

			if(jComboBoxid_cuenta_contableSaldoContableGenerico==null) {
				cuentacontableAux=(CuentaContable)this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_cuenta_contableSaldoContable.getSelectedItem();
			} else {
				cuentacontableAux=(CuentaContable)jComboBoxid_cuenta_contableSaldoContableGenerico.getSelectedItem();
			}

			if(cuentacontableAux!=null && cuentacontableAux.getId()!=null) {
				saldocontable.setid_cuenta_contable(cuentacontableAux.getId());
				saldocontable.setcuentacontable_descripcion(SaldoContableConstantesFunciones.getCuentaContableDescripcion(cuentacontableAux));
				saldocontable.setCuentaContable(cuentacontableAux);			}
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

					if(!SaldoContableJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSaldoContable!=null) { 
							this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_empresaSaldoContable.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_empresaSaldoContable.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSaldoContable!=null) { 
					}

					if(!SaldoContableJInternalFrame.ISBINDING_MANUAL) {
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

					if(!SaldoContableJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSaldoContable!=null) { 
							this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_sucursalSaldoContable.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_sucursalSaldoContable.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSaldoContable!=null) { 
					}

					if(!SaldoContableJInternalFrame.ISBINDING_MANUAL) {
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

					if(!SaldoContableJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSaldoContable!=null) { 
							this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_ejercicioSaldoContable.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_ejercicioSaldoContable.addItem(ejercicio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSaldoContable!=null) { 
					}

					if(!SaldoContableJInternalFrame.ISBINDING_MANUAL) {
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

					if(!SaldoContableJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSaldoContable!=null) { 
							this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_periodoSaldoContable.removeAllItems();

							for(Periodo periodo:this.periodosForeignKey) {
								this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_periodoSaldoContable.addItem(periodo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSaldoContable!=null) { 
					}

					if(!SaldoContableJInternalFrame.ISBINDING_MANUAL) {
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

					if(!SaldoContableJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSaldoContable!=null) { 
							this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_anioSaldoContable.removeAllItems();

							for(Anio anio:this.aniosForeignKey) {
								this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_anioSaldoContable.addItem(anio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSaldoContable!=null) { 
					}

					if(!SaldoContableJInternalFrame.ISBINDING_MANUAL) {
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

					if(!SaldoContableJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSaldoContable!=null) { 
							this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_mesSaldoContable.removeAllItems();

							for(Mes mes:this.messForeignKey) {
								this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_mesSaldoContable.addItem(mes);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSaldoContable!=null) { 
					}

					if(!SaldoContableJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameCuentaContablesForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCuentaContable=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!SaldoContableJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSaldoContable!=null) { 
							this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_cuenta_contableSaldoContable.removeAllItems();

							for(CuentaContable cuentacontable:this.cuentacontablesForeignKey) {
								this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_cuenta_contableSaldoContable.addItem(cuentacontable);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSaldoContable!=null) { 
					}

					if(!SaldoContableJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCuentaContable") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!SaldoContableJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_cuenta_contableFK_IdCuentaContableSaldoContable.removeAllItems();

							for(CuentaContable cuentacontable:this.cuentacontablesForeignKey) {
								this.jComboBoxid_cuenta_contableFK_IdCuentaContableSaldoContable.addItem(cuentacontable);
							}
						}

						if(!SaldoContableJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormSaldoContable!=null) {
							this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_empresaSaldoContable.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormSaldoContable!=null) {
							this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_empresaSaldoContable.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormSaldoContable!=null) {
							this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_sucursalSaldoContable.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormSaldoContable!=null) {
							this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_sucursalSaldoContable.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormSaldoContable!=null) {
							this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_ejercicioSaldoContable.setSelectedItem(ejercicio);
						}
					} else {
						if(this.jInternalFrameDetalleFormSaldoContable!=null) {
							this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_ejercicioSaldoContable.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormSaldoContable!=null) {
							this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_periodoSaldoContable.setSelectedItem(periodo);
						}
					} else {
						if(this.jInternalFrameDetalleFormSaldoContable!=null) {
							this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_periodoSaldoContable.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormSaldoContable!=null) {
							this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_anioSaldoContable.setSelectedItem(anio);
						}
					} else {
						if(this.jInternalFrameDetalleFormSaldoContable!=null) {
							this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_anioSaldoContable.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormSaldoContable!=null) {
							this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_mesSaldoContable.setSelectedItem(mes);
						}
					} else {
						if(this.jInternalFrameDetalleFormSaldoContable!=null) {
							this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_mesSaldoContable.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameCuentaContableForeignKey(CuentaContable cuentacontable,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormSaldoContable!=null) {
							this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_cuenta_contableSaldoContable.setSelectedItem(cuentacontable);
						}
					} else {
						if(this.jInternalFrameDetalleFormSaldoContable!=null) {
							this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_cuenta_contableSaldoContable.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_cuenta_contableFK_IdCuentaContableSaldoContable.setSelectedItem(cuentacontable);
						} else {
							this.jComboBoxid_cuenta_contableFK_IdCuentaContableSaldoContable.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesSaldoContable() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			SaldoContableConstantesFunciones.refrescarForeignKeysDescripcionesSaldoContable(this.saldocontableLogic.getSaldoContables());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			SaldoContableConstantesFunciones.refrescarForeignKeysDescripcionesSaldoContable(this.saldocontables);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Ejercicio.class));
		classes.add(new Classe(Periodo.class));
		classes.add(new Classe(Anio.class));
		classes.add(new Classe(Mes.class));
		classes.add(new Classe(CuentaContable.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//saldocontableLogic.setSaldoContables(this.saldocontables);
			saldocontableLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public SaldoContableParameterReturnGeneral getSaldoContableParameterGeneral() {
		return this.saldocontableParameterGeneral;
	}
	
	public void setSaldoContableParameterGeneral(SaldoContableParameterReturnGeneral saldocontableParameterGeneral) {
		this.saldocontableParameterGeneral = saldocontableParameterGeneral;
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
	
	public Boolean getIsPermisoTodoSaldoContable() {
		return isPermisoTodoSaldoContable;
	}

	public void setIsPermisoTodoSaldoContable(Boolean isPermisoTodoSaldoContable) {
		this.isPermisoTodoSaldoContable = isPermisoTodoSaldoContable;
	}

	public Boolean getIsPermisoNuevoSaldoContable() {
		return isPermisoNuevoSaldoContable;
	}

	public void setIsPermisoNuevoSaldoContable(Boolean isPermisoNuevoSaldoContable) {
		this.isPermisoNuevoSaldoContable = isPermisoNuevoSaldoContable;
	}

	public Boolean getIsPermisoActualizarSaldoContable() {
		return isPermisoActualizarSaldoContable;
	}

	public void setIsPermisoActualizarSaldoContable(Boolean isPermisoActualizarSaldoContable) {
		this.isPermisoActualizarSaldoContable = isPermisoActualizarSaldoContable;
	}

	public Boolean getIsPermisoEliminarSaldoContable() {
		return isPermisoEliminarSaldoContable;
	}

	public void setIsPermisoEliminarSaldoContable(Boolean isPermisoEliminarSaldoContable) {
		this.isPermisoEliminarSaldoContable = isPermisoEliminarSaldoContable;
	}

	public Boolean getIsPermisoGuardarCambiosSaldoContable() {
		return isPermisoGuardarCambiosSaldoContable;
	}

	public void setIsPermisoGuardarCambiosSaldoContable(Boolean isPermisoGuardarCambiosSaldoContable) {
		this.isPermisoGuardarCambiosSaldoContable = isPermisoGuardarCambiosSaldoContable;
	}
	
	public Boolean getIsPermisoConsultaSaldoContable() {
		return isPermisoConsultaSaldoContable;
	}

	public void setIsPermisoConsultaSaldoContable(Boolean isPermisoConsultaSaldoContable) {
		this.isPermisoConsultaSaldoContable = isPermisoConsultaSaldoContable;
	}

	public Boolean getIsPermisoBusquedaSaldoContable() {
		return isPermisoBusquedaSaldoContable;
	}

	public void setIsPermisoBusquedaSaldoContable(Boolean isPermisoBusquedaSaldoContable) {
		this.isPermisoBusquedaSaldoContable = isPermisoBusquedaSaldoContable;
	}

	public Boolean getIsPermisoReporteSaldoContable() {
		return isPermisoReporteSaldoContable;
	}

	public void setIsPermisoReporteSaldoContable(Boolean isPermisoReporteSaldoContable) {
		this.isPermisoReporteSaldoContable = isPermisoReporteSaldoContable;
	}
	
	public Boolean getIsPermisoPaginacionMedioSaldoContable() {
		return isPermisoPaginacionMedioSaldoContable;
	}

	public void setIsPermisoPaginacionMedioSaldoContable(Boolean isPermisoPaginacionMedioSaldoContable) {
		this.isPermisoPaginacionMedioSaldoContable = isPermisoPaginacionMedioSaldoContable;
	}
	
	public Boolean getIsPermisoPaginacionTodoSaldoContable() {
		return isPermisoPaginacionTodoSaldoContable;
	}

	public void setIsPermisoPaginacionTodoSaldoContable(Boolean isPermisoPaginacionTodoSaldoContable) {
		this.isPermisoPaginacionTodoSaldoContable = isPermisoPaginacionTodoSaldoContable;
	}
	
	public Boolean getIsPermisoPaginacionAltoSaldoContable() {
		return isPermisoPaginacionAltoSaldoContable;
	}

	public void setIsPermisoPaginacionAltoSaldoContable(Boolean isPermisoPaginacionAltoSaldoContable) {
		this.isPermisoPaginacionAltoSaldoContable = isPermisoPaginacionAltoSaldoContable;
	}
	
	public Boolean getIsPermisoCopiarSaldoContable() {
		return isPermisoCopiarSaldoContable;
	}

	public void setIsPermisoCopiarSaldoContable(Boolean isPermisoCopiarSaldoContable) {
		this.isPermisoCopiarSaldoContable = isPermisoCopiarSaldoContable;
	}
	
	public Boolean getIsPermisoVerFormSaldoContable() {
		return isPermisoVerFormSaldoContable;
	}

	public void setIsPermisoVerFormSaldoContable(Boolean isPermisoVerFormSaldoContable) {
		this.isPermisoVerFormSaldoContable = isPermisoVerFormSaldoContable;
	}
	
	public Boolean getIsPermisoDuplicarSaldoContable() {
		return isPermisoDuplicarSaldoContable;
	}

	public void setIsPermisoDuplicarSaldoContable(Boolean isPermisoDuplicarSaldoContable) {
		this.isPermisoDuplicarSaldoContable = isPermisoDuplicarSaldoContable;
	}
	
	public Boolean getIsPermisoOrdenSaldoContable() {
		return isPermisoOrdenSaldoContable;
	}

	public void setIsPermisoOrdenSaldoContable(Boolean isPermisoOrdenSaldoContable) {
		this.isPermisoOrdenSaldoContable = isPermisoOrdenSaldoContable;
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
	
	public Boolean getIsVisibilidadCeldaNuevoSaldoContable() {
		return isVisibilidadCeldaNuevoSaldoContable;
	}

	public void setIsVisibilidadCeldaNuevoSaldoContable(Boolean isVisibilidadCeldaNuevoSaldoContable) {
		this.isVisibilidadCeldaNuevoSaldoContable = isVisibilidadCeldaNuevoSaldoContable;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarSaldoContable() {
		return isVisibilidadCeldaDuplicarSaldoContable;
	}

	public void setIsVisibilidadCeldaDuplicarSaldoContable(Boolean isVisibilidadCeldaDuplicarSaldoContable) {
		this.isVisibilidadCeldaDuplicarSaldoContable = isVisibilidadCeldaDuplicarSaldoContable;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarSaldoContable() {
		return isVisibilidadCeldaCopiarSaldoContable;
	}

	public void setIsVisibilidadCeldaCopiarSaldoContable(Boolean isVisibilidadCeldaCopiarSaldoContable) {
		this.isVisibilidadCeldaCopiarSaldoContable = isVisibilidadCeldaCopiarSaldoContable;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormSaldoContable() {
		return isVisibilidadCeldaVerFormSaldoContable;
	}

	public void setIsVisibilidadCeldaVerFormSaldoContable(Boolean isVisibilidadCeldaVerFormSaldoContable) {
		this.isVisibilidadCeldaVerFormSaldoContable = isVisibilidadCeldaVerFormSaldoContable;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenSaldoContable() {
		return isVisibilidadCeldaOrdenSaldoContable;
	}

	public void setIsVisibilidadCeldaOrdenSaldoContable(Boolean isVisibilidadCeldaOrdenSaldoContable) {
		this.isVisibilidadCeldaOrdenSaldoContable = isVisibilidadCeldaOrdenSaldoContable;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesSaldoContable() {
		return isVisibilidadCeldaNuevoRelacionesSaldoContable;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesSaldoContable(Boolean isVisibilidadCeldaNuevoRelacionesSaldoContable) {
		this.isVisibilidadCeldaNuevoRelacionesSaldoContable = isVisibilidadCeldaNuevoRelacionesSaldoContable;
	}
	
	public Boolean getIsVisibilidadCeldaModificarSaldoContable() {
		return isVisibilidadCeldaModificarSaldoContable;
	}

	public void setIsVisibilidadCeldaModificarSaldoContable(Boolean isVisibilidadCeldaModificarSaldoContable) {
		this.isVisibilidadCeldaModificarSaldoContable = isVisibilidadCeldaModificarSaldoContable;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarSaldoContable() {
		return isVisibilidadCeldaActualizarSaldoContable;
	}

	public void setIsVisibilidadCeldaActualizarSaldoContable(Boolean isVisibilidadCeldaActualizarSaldoContable) {
		this.isVisibilidadCeldaActualizarSaldoContable = isVisibilidadCeldaActualizarSaldoContable;
	}

	public Boolean getIsVisibilidadCeldaEliminarSaldoContable() {
		return isVisibilidadCeldaEliminarSaldoContable;
	}

	public void setIsVisibilidadCeldaEliminarSaldoContable(Boolean isVisibilidadCeldaEliminarSaldoContable) {
		this.isVisibilidadCeldaEliminarSaldoContable = isVisibilidadCeldaEliminarSaldoContable;
	}

	public Boolean getIsVisibilidadCeldaCancelarSaldoContable() {
		return isVisibilidadCeldaCancelarSaldoContable;
	}

	public void setIsVisibilidadCeldaCancelarSaldoContable(Boolean isVisibilidadCeldaCancelarSaldoContable) {
		this.isVisibilidadCeldaCancelarSaldoContable = isVisibilidadCeldaCancelarSaldoContable;
	}

	public Boolean getIsVisibilidadCeldaGuardarSaldoContable() {
		return isVisibilidadCeldaGuardarSaldoContable;
	}

	public void setIsVisibilidadCeldaGuardarSaldoContable(Boolean isVisibilidadCeldaGuardarSaldoContable) {
		this.isVisibilidadCeldaGuardarSaldoContable = isVisibilidadCeldaGuardarSaldoContable;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosSaldoContable() {
		return isVisibilidadCeldaGuardarCambiosSaldoContable;
	}

	public void setIsVisibilidadCeldaGuardarCambiosSaldoContable(Boolean isVisibilidadCeldaGuardarCambiosSaldoContable) {
		this.isVisibilidadCeldaGuardarCambiosSaldoContable = isVisibilidadCeldaGuardarCambiosSaldoContable;
	}
		
	public SaldoContableSessionBean getsaldocontableSessionBean() {
		return this.saldocontableSessionBean;
	}
	
	public void setsaldocontableSessionBean(SaldoContableSessionBean saldocontableSessionBean) {
		this.saldocontableSessionBean=saldocontableSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdAnio() {
		return this.isVisibilidadFK_IdAnio;
	}

	public void setisVisibilidadFK_IdAnio(Boolean isVisibilidadFK_IdAnio) {
		this.isVisibilidadFK_IdAnio=isVisibilidadFK_IdAnio;
	}

	public Boolean getisVisibilidadFK_IdCuentaContable() {
		return this.isVisibilidadFK_IdCuentaContable;
	}

	public void setisVisibilidadFK_IdCuentaContable(Boolean isVisibilidadFK_IdCuentaContable) {
		this.isVisibilidadFK_IdCuentaContable=isVisibilidadFK_IdCuentaContable;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysSaldoContable(SaldoContable saldocontable)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(saldocontable,null);
				this.setActualParaGuardarSucursalForeignKey(saldocontable,null);
				this.setActualParaGuardarEjercicioForeignKey(saldocontable,null);
				this.setActualParaGuardarPeriodoForeignKey(saldocontable,null);
				this.setActualParaGuardarAnioForeignKey(saldocontable,null);
				this.setActualParaGuardarMesForeignKey(saldocontable,null);
				this.setActualParaGuardarCuentaContableForeignKey(saldocontable,null);
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
	
	public void bugActualizarReferenciaActual(SaldoContable saldocontable,SaldoContable saldocontableAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalSaldoContable(saldocontable);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		saldocontableAux.setId(saldocontable.getId());
		saldocontableAux.setVersionRow(saldocontable.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessSaldoContable();
		
			int intSelectedRow = this.jTableDatosSaldoContable.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldocontable =(SaldoContable) this.saldocontableLogic.getSaldoContables().toArray()[this.jTableDatosSaldoContable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.saldocontable =(SaldoContable) this.saldocontables.toArray()[this.jTableDatosSaldoContable.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(SaldoContableJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualSaldoContable(this.saldocontable,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysSaldoContable(this.saldocontable);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = saldocontableValidator.getInvalidValues(this.saldocontable);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			saldocontableLogic.setDatosCliente(datosCliente);
			saldocontableLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				saldocontableAux=new  SaldoContable();
				
				saldocontableAux.setIsNew(true);
				saldocontableAux.setIsChanged(true);
				
				saldocontableAux.setSaldoContableOriginal(this.saldocontable);
				
				saldocontableAux.setId(this.saldocontable.getId());	
				saldocontableAux.setVersionRow(this.saldocontable.getVersionRow());	
				saldocontableAux.setid_empresa(this.saldocontable.getid_empresa());	
				saldocontableAux.setid_sucursal(this.saldocontable.getid_sucursal());	
				saldocontableAux.setid_ejercicio(this.saldocontable.getid_ejercicio());	
				saldocontableAux.setid_periodo(this.saldocontable.getid_periodo());	
				saldocontableAux.setid_anio(this.saldocontable.getid_anio());	
				saldocontableAux.setid_mes(this.saldocontable.getid_mes());	
				saldocontableAux.setid_cuenta_contable(this.saldocontable.getid_cuenta_contable());	
				saldocontableAux.setdebito_mone_local(this.saldocontable.getdebito_mone_local());	
				saldocontableAux.setcredito_mone_local(this.saldocontable.getcredito_mone_local());	
				saldocontableAux.setsaldo_mone_local(this.saldocontable.getsaldo_mone_local());	
				saldocontableAux.setdebito_mone_extra(this.saldocontable.getdebito_mone_extra());	
				saldocontableAux.setcredito_mone_extra(this.saldocontable.getcredito_mone_extra());	
				saldocontableAux.setsaldo_mone_extra(this.saldocontable.getsaldo_mone_extra());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.saldocontableSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.saldocontableSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(saldocontableAux,saldocontableLogic.getSaldoContables());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(saldocontableAux,saldocontables);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.saldocontableSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.saldocontableSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						saldocontableLogic.saveSaldoContables();//WithConnection
						//saldocontableLogic.getSetVersionRowSaldoContables();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.saldocontable,saldocontableAux);
					
					this.refrescarForeignKeysDescripcionesSaldoContable();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.saldocontableSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.saldocontableSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								saldocontableLogic.saveSaldoContableRelaciones(saldocontableAux);//WithConnection
								//saldocontableLogic.getSetVersionRowSaldoContables();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.saldocontable,saldocontableAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.saldocontableSessionBean.getEstaModoGuardarRelaciones() 
									|| this.saldocontableSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(saldocontableAux,saldocontableLogic.getSaldoContables());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(saldocontableAux,saldocontables);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.saldocontable,saldocontableAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				saldocontableAux=new  SaldoContable();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.saldocontableSessionBean.getEsGuardarRelacionado() 
					|| (this.saldocontableSessionBean.getEsGuardarRelacionado() && this.saldocontable.getId()>=0)) {
						
					saldocontableAux.setIsNew(false);
				}
				
				saldocontableAux.setIsDeleted(false);
			
				saldocontableAux.setId(this.saldocontable.getId());	
				saldocontableAux.setVersionRow(this.saldocontable.getVersionRow());	
				saldocontableAux.setid_empresa(this.saldocontable.getid_empresa());	
				saldocontableAux.setid_sucursal(this.saldocontable.getid_sucursal());	
				saldocontableAux.setid_ejercicio(this.saldocontable.getid_ejercicio());	
				saldocontableAux.setid_periodo(this.saldocontable.getid_periodo());	
				saldocontableAux.setid_anio(this.saldocontable.getid_anio());	
				saldocontableAux.setid_mes(this.saldocontable.getid_mes());	
				saldocontableAux.setid_cuenta_contable(this.saldocontable.getid_cuenta_contable());	
				saldocontableAux.setdebito_mone_local(this.saldocontable.getdebito_mone_local());	
				saldocontableAux.setcredito_mone_local(this.saldocontable.getcredito_mone_local());	
				saldocontableAux.setsaldo_mone_local(this.saldocontable.getsaldo_mone_local());	
				saldocontableAux.setdebito_mone_extra(this.saldocontable.getdebito_mone_extra());	
				saldocontableAux.setcredito_mone_extra(this.saldocontable.getcredito_mone_extra());	
				saldocontableAux.setsaldo_mone_extra(this.saldocontable.getsaldo_mone_extra());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(saldocontableAux,saldocontableLogic.getSaldoContables());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(saldocontableAux,saldocontables);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.saldocontableSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.saldocontableSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						saldocontableLogic.saveSaldoContables();//WithConnection
						//saldocontableLogic.getSetVersionRowSaldoContables();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.saldocontable,saldocontableAux);
					
					this.refrescarForeignKeysDescripcionesSaldoContable();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.saldocontableSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.saldocontableSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								saldocontableLogic.saveSaldoContableRelaciones(saldocontableAux);//WithConnection
								//saldocontableLogic.getSetVersionRowSaldoContables();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.saldocontable,saldocontableAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.saldocontableSessionBean.getEstaModoGuardarRelaciones() 
									|| this.saldocontableSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(saldocontableAux,saldocontableLogic.getSaldoContables());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(saldocontableAux,saldocontables);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.saldocontable,saldocontableAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				saldocontableAux=new  SaldoContable();
				
				saldocontableAux.setIsNew(false);
				saldocontableAux.setIsChanged(false);
				
				saldocontableAux.setIsDeleted(true);
				
				saldocontableAux.setId(this.saldocontable.getId());	
				saldocontableAux.setVersionRow(this.saldocontable.getVersionRow());	
				saldocontableAux.setid_empresa(this.saldocontable.getid_empresa());	
				saldocontableAux.setid_sucursal(this.saldocontable.getid_sucursal());	
				saldocontableAux.setid_ejercicio(this.saldocontable.getid_ejercicio());	
				saldocontableAux.setid_periodo(this.saldocontable.getid_periodo());	
				saldocontableAux.setid_anio(this.saldocontable.getid_anio());	
				saldocontableAux.setid_mes(this.saldocontable.getid_mes());	
				saldocontableAux.setid_cuenta_contable(this.saldocontable.getid_cuenta_contable());	
				saldocontableAux.setdebito_mone_local(this.saldocontable.getdebito_mone_local());	
				saldocontableAux.setcredito_mone_local(this.saldocontable.getcredito_mone_local());	
				saldocontableAux.setsaldo_mone_local(this.saldocontable.getsaldo_mone_local());	
				saldocontableAux.setdebito_mone_extra(this.saldocontable.getdebito_mone_extra());	
				saldocontableAux.setcredito_mone_extra(this.saldocontable.getcredito_mone_extra());	
				saldocontableAux.setsaldo_mone_extra(this.saldocontable.getsaldo_mone_extra());	
				
				if(this.saldocontableSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.saldocontableAux.getId()>=0) {	
						this.saldocontablesEliminados.add(saldocontableAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(saldocontableAux,saldocontableLogic.getSaldoContables());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(saldocontableAux,saldocontables);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.saldocontableSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.saldocontableSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						saldocontableLogic.saveSaldoContables();//WithConnection
						//saldocontableLogic.getSetVersionRowSaldoContables();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.saldocontableSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.saldocontableSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								saldocontableLogic.saveSaldoContableRelaciones(saldocontableAux);//WithConnection
								//saldocontableLogic.getSetVersionRowSaldoContables();//WithConnection
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
							if(this.saldocontableSessionBean.getEstaModoGuardarRelaciones() 
								|| this.saldocontableSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(saldocontableAux,saldocontableLogic.getSaldoContables());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(saldocontableAux,saldocontables);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldocontableLogic.getSaldoContables().addAll(this.saldocontablesEliminados);
					
					saldocontableLogic.saveSaldoContables();//WithConnection
					//saldocontableLogic.getSetVersionRowSaldoContables();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesSaldoContable();
				
				this.saldocontablesEliminados= new ArrayList<SaldoContable>();		
			}
			
			if(this.saldocontableSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.saldocontableSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Saldo Contable GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Saldo Contable",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.saldocontable=saldocontableAux;
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
      		//this.finishProcessSaldoContable();
      	}
		
	}	
	
	public void actualizarRelaciones(SaldoContable saldocontableLocal) throws Exception {
		
		if(this.saldocontableSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(SaldoContable saldocontableLocal) throws Exception {	
		if(this.saldocontableSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				saldocontableLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				saldocontableLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EjercicioDetalleFormJInternalFrame.class)) {
				EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrameLocal=(EjercicioBeanSwingJInternalFrame) ((EjercicioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ejercicioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEjercicio(ejercicioBeanSwingJInternalFrameLocal.getejercicio(),true);
				ejercicioBeanSwingJInternalFrameLocal.actualizarLista(ejercicioBeanSwingJInternalFrameLocal.ejercicio,this.ejerciciosForeignKey);

				ejercicioBeanSwingJInternalFrameLocal.actualizarRelaciones(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				saldocontableLocal.setEjercicio(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				this.addItemDefectoCombosForeignKeyEjercicio();
				this.cargarCombosFrameEjerciciosForeignKey("Formulario");
				this.setActualEjercicioForeignKey(ejercicioBeanSwingJInternalFrameLocal.ejercicio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(PeriodoDetalleFormJInternalFrame.class)) {
				PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrameLocal=(PeriodoBeanSwingJInternalFrame) ((PeriodoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				periodoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPeriodo(periodoBeanSwingJInternalFrameLocal.getperiodo(),true);
				periodoBeanSwingJInternalFrameLocal.actualizarLista(periodoBeanSwingJInternalFrameLocal.periodo,this.periodosForeignKey);

				periodoBeanSwingJInternalFrameLocal.actualizarRelaciones(periodoBeanSwingJInternalFrameLocal.periodo);

				saldocontableLocal.setPeriodo(periodoBeanSwingJInternalFrameLocal.periodo);

				this.addItemDefectoCombosForeignKeyPeriodo();
				this.cargarCombosFramePeriodosForeignKey("Formulario");
				this.setActualPeriodoForeignKey(periodoBeanSwingJInternalFrameLocal.periodo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(AnioDetalleFormJInternalFrame.class)) {
				AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrameLocal=(AnioBeanSwingJInternalFrame) ((AnioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				anioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoAnio(anioBeanSwingJInternalFrameLocal.getanio(),true);
				anioBeanSwingJInternalFrameLocal.actualizarLista(anioBeanSwingJInternalFrameLocal.anio,this.aniosForeignKey);

				anioBeanSwingJInternalFrameLocal.actualizarRelaciones(anioBeanSwingJInternalFrameLocal.anio);

				saldocontableLocal.setAnio(anioBeanSwingJInternalFrameLocal.anio);

				this.addItemDefectoCombosForeignKeyAnio();
				this.cargarCombosFrameAniosForeignKey("Formulario");
				this.setActualAnioForeignKey(anioBeanSwingJInternalFrameLocal.anio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(MesDetalleFormJInternalFrame.class)) {
				MesBeanSwingJInternalFrame mesBeanSwingJInternalFrameLocal=(MesBeanSwingJInternalFrame) ((MesDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				mesBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoMes(mesBeanSwingJInternalFrameLocal.getmes(),true);
				mesBeanSwingJInternalFrameLocal.actualizarLista(mesBeanSwingJInternalFrameLocal.mes,this.messForeignKey);

				mesBeanSwingJInternalFrameLocal.actualizarRelaciones(mesBeanSwingJInternalFrameLocal.mes);

				saldocontableLocal.setMes(mesBeanSwingJInternalFrameLocal.mes);

				this.addItemDefectoCombosForeignKeyMes();
				this.cargarCombosFrameMessForeignKey("Formulario");
				this.setActualMesForeignKey(mesBeanSwingJInternalFrameLocal.mes.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CuentaContableDetalleFormJInternalFrame.class)) {
				CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrameLocal=(CuentaContableBeanSwingJInternalFrame) ((CuentaContableDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				cuentacontableBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCuentaContable(cuentacontableBeanSwingJInternalFrameLocal.getcuentacontable(),true);
				cuentacontableBeanSwingJInternalFrameLocal.actualizarLista(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable,this.cuentacontablesForeignKey);

				cuentacontableBeanSwingJInternalFrameLocal.actualizarRelaciones(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable);

				saldocontableLocal.setCuentaContable(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable);

				this.addItemDefectoCombosForeignKeyCuentaContable();
				this.cargarCombosFrameCuentaContablesForeignKey("Formulario");
				this.setActualCuentaContableForeignKey(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarSaldoContableActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosSaldoContable.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.saldocontable =(SaldoContable) this.saldocontableLogic.getSaldoContables().toArray()[this.jTableDatosSaldoContable.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.saldocontable =(SaldoContable) this.saldocontables.toArray()[this.jTableDatosSaldoContable.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = saldocontableValidator.getInvalidValues(this.saldocontable);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(SaldoContable saldocontable,List<SaldoContable> saldocontables) throws Exception {
		try	{		
			SaldoContableConstantesFunciones.actualizarLista(saldocontable,saldocontables,this.saldocontableSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(SaldoContable saldocontable,List<SaldoContable> saldocontables) throws Exception {
		try	{			
			SaldoContableConstantesFunciones.actualizarSelectedLista(saldocontable,saldocontables);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<SaldoContable> saldocontablesLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				saldocontablesLocal=this.saldocontableLogic.getSaldoContables();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				saldocontablesLocal=this.saldocontables;
			}
			//ARCHITECTURE
		
			for(SaldoContable saldocontableLocal:saldocontablesLocal) {
				if(this.permiteMantenimiento(saldocontableLocal) && saldocontableLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+SaldoContableConstantesFunciones.getSaldoContableLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(SaldoContableConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSaldoContable.jLabelid_empresaSaldoContable,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SaldoContableConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSaldoContable.jLabelid_sucursalSaldoContable,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SaldoContableConstantesFunciones.IDEJERCICIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSaldoContable.jLabelid_ejercicioSaldoContable,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SaldoContableConstantesFunciones.IDPERIODO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSaldoContable.jLabelid_periodoSaldoContable,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SaldoContableConstantesFunciones.IDANIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSaldoContable.jLabelid_anioSaldoContable,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SaldoContableConstantesFunciones.IDMES)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSaldoContable.jLabelid_mesSaldoContable,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SaldoContableConstantesFunciones.IDCUENTACONTABLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSaldoContable.jLabelid_cuenta_contableSaldoContable,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SaldoContableConstantesFunciones.DEBITOMONELOCAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSaldoContable.jLabeldebito_mone_localSaldoContable,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SaldoContableConstantesFunciones.CREDITOMONELOCAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSaldoContable.jLabelcredito_mone_localSaldoContable,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SaldoContableConstantesFunciones.SALDOMONELOCAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSaldoContable.jLabelsaldo_mone_localSaldoContable,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SaldoContableConstantesFunciones.DEBITOMONEEXTRA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSaldoContable.jLabeldebito_mone_extraSaldoContable,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SaldoContableConstantesFunciones.CREDITOMONEEXTRA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSaldoContable.jLabelcredito_mone_extraSaldoContable,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SaldoContableConstantesFunciones.SALDOMONEEXTRA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSaldoContable.jLabelsaldo_mone_extraSaldoContable,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormSaldoContable!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSaldoContable.jLabelid_empresaSaldoContable,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSaldoContable.jLabelid_sucursalSaldoContable,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSaldoContable.jLabelid_ejercicioSaldoContable,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSaldoContable.jLabelid_periodoSaldoContable,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSaldoContable.jLabelid_anioSaldoContable,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSaldoContable.jLabelid_mesSaldoContable,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSaldoContable.jLabelid_cuenta_contableSaldoContable,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSaldoContable.jLabeldebito_mone_localSaldoContable,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSaldoContable.jLabelcredito_mone_localSaldoContable,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSaldoContable.jLabelsaldo_mone_localSaldoContable,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSaldoContable.jLabeldebito_mone_extraSaldoContable,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSaldoContable.jLabelcredito_mone_extraSaldoContable,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSaldoContable.jLabelsaldo_mone_extraSaldoContable,"");
		
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
		this.iIdNuevoSaldoContable--;	
		
		
		this.saldocontableAux=new SaldoContable();
		
		this.saldocontableAux.setId(this.iIdNuevoSaldoContable);
		this.saldocontableAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.saldocontableLogic.getSaldoContables().add(this.saldocontableAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.saldocontables.add(this.saldocontableAux);
		}
		//ARCHITECTURE
		
		this.saldocontable=this.saldocontableAux;
		
		if(SaldoContableJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioSaldoContable(this.saldocontable);
			this.setVariablesObjetoActualToFormularioForeignKeySaldoContable(this.saldocontable);
		}
				
		//this.setDefaultControlesSaldoContable();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeySaldoContable();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeySaldoContable();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeySaldoContable();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualSaldoContable(this.saldocontableBean,this.saldocontable,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysSaldoContable(this.saldocontable);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(SaldoContableConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.saldocontableSessionBean.getConGuardarRelaciones()) {
			classes=SaldoContableConstantesFunciones.getClassesRelationshipsOfSaldoContable(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.saldocontableReturnGeneral=saldocontableLogic.procesarEventosSaldoContablesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.saldocontableLogic.getSaldoContables(),this.saldocontable,this.saldocontableParameterGeneral,this.isEsNuevoSaldoContable,classes);//this.saldocontableLogic.getSaldoContable()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanSaldoContable(this.saldocontableReturnGeneral,this.saldocontableBean,false);
		
		if(this.saldocontableReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeySaldoContable(this.saldocontableReturnGeneral.getSaldoContable());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioSaldoContable(this.saldocontableReturnGeneral.getSaldoContable());
		}
		
		if(this.saldocontableReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioSaldoContable(this.saldocontableReturnGeneral.getSaldoContable(),classes);//this.saldocontableBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualSaldoContable(this.saldocontable,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeySaldoContable();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeySaldoContable();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			SaldoContableBeanSwingJInternalFrameAdditional.RecargarFormSaldoContable(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingSaldoContable(false);
						
			if(saldocontableSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(SaldoContableJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualSaldoContable();
			}
			
			this.actualizarVisualTableDatosSaldoContable();
			
			this.jTableDatosSaldoContable.setRowSelectionInterval(this.getIndiceNuevoSaldoContable(), this.getIndiceNuevoSaldoContable());
			
			this.seleccionarFilaTablaSaldoContableActual();
						
			this.actualizarEstadoCeldasBotonesSaldoContable("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesSaldoContable(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormSaldoContable.jTextFielddebito_mone_localSaldoContable.setEnabled(isHabilitar && this.saldocontableConstantesFunciones.activardebito_mone_localSaldoContable);
		this.jInternalFrameDetalleFormSaldoContable.jTextFieldcredito_mone_localSaldoContable.setEnabled(isHabilitar && this.saldocontableConstantesFunciones.activarcredito_mone_localSaldoContable);
		this.jInternalFrameDetalleFormSaldoContable.jTextFieldsaldo_mone_localSaldoContable.setEnabled(isHabilitar && this.saldocontableConstantesFunciones.activarsaldo_mone_localSaldoContable);
		this.jInternalFrameDetalleFormSaldoContable.jTextFielddebito_mone_extraSaldoContable.setEnabled(isHabilitar && this.saldocontableConstantesFunciones.activardebito_mone_extraSaldoContable);
		this.jInternalFrameDetalleFormSaldoContable.jTextFieldcredito_mone_extraSaldoContable.setEnabled(isHabilitar && this.saldocontableConstantesFunciones.activarcredito_mone_extraSaldoContable);
		this.jInternalFrameDetalleFormSaldoContable.jTextFieldsaldo_mone_extraSaldoContable.setEnabled(isHabilitar && this.saldocontableConstantesFunciones.activarsaldo_mone_extraSaldoContable);	
		//
		this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_empresaSaldoContable.setEnabled(isHabilitar && this.saldocontableConstantesFunciones.activarid_empresaSaldoContable);//
		this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_sucursalSaldoContable.setEnabled(isHabilitar && this.saldocontableConstantesFunciones.activarid_sucursalSaldoContable);//
		this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_ejercicioSaldoContable.setEnabled(isHabilitar && this.saldocontableConstantesFunciones.activarid_ejercicioSaldoContable);//
		this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_periodoSaldoContable.setEnabled(isHabilitar && this.saldocontableConstantesFunciones.activarid_periodoSaldoContable);//
		this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_anioSaldoContable.setEnabled(isHabilitar && this.saldocontableConstantesFunciones.activarid_anioSaldoContable);//
		this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_mesSaldoContable.setEnabled(isHabilitar && this.saldocontableConstantesFunciones.activarid_mesSaldoContable);
		this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_cuenta_contableSaldoContable.setEnabled(isHabilitar && this.saldocontableConstantesFunciones.activarid_cuenta_contableSaldoContable);
	};
	
	public void setDefaultControlesSaldoContable() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoSaldoContable(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.saldocontableSessionBean.setConGuardarRelaciones(true);			
			this.saldocontableSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormSaldoContable.jTabbedPaneRelacionesSaldoContable.setVisible(true);
			
					
		} else {
			//this.saldocontableSessionBean.setConGuardarRelaciones(false);			
			this.saldocontableSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormSaldoContable.jTabbedPaneRelacionesSaldoContable.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoSaldoContable() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SaldoContable saldocontableAux:this.saldocontableLogic.getSaldoContables()) {
				if(saldocontableAux.getId().equals(this.iIdNuevoSaldoContable)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SaldoContable saldocontableAux:this.saldocontables) {
				if(saldocontableAux.getId().equals(this.iIdNuevoSaldoContable)) {
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
	
	public int getIndiceActualSaldoContable(SaldoContable saldocontable,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SaldoContable saldocontableAux:this.saldocontableLogic.getSaldoContables()) {
				if(saldocontableAux.getId().equals(saldocontable.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SaldoContable saldocontableAux:this.saldocontables) {
				if(saldocontableAux.getId().equals(saldocontable.getId())) {
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
	
	public void setCamposBaseDesdeOriginalSaldoContable(SaldoContable saldocontableOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SaldoContable saldocontableAux:this.saldocontableLogic.getSaldoContables()) {
				if(saldocontableAux.getSaldoContableOriginal().getId().equals(saldocontableOriginal.getId())) {
					existe=true;
					saldocontableOriginal.setId(saldocontableAux.getId());
					saldocontableOriginal.setVersionRow(saldocontableAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SaldoContable saldocontableAux:this.saldocontables) {
				if(saldocontableAux.getSaldoContableOriginal().getId().equals(saldocontableOriginal.getId())) {
					existe=true;
					saldocontableOriginal.setId(saldocontableAux.getId());
					saldocontableOriginal.setVersionRow(saldocontableAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosSaldoContable(Boolean esParaCancelar) throws Exception {
		saldocontablesAux=new ArrayList<SaldoContable>();
		saldocontableAux=new SaldoContable();
		
		if(!this.saldocontableSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(SaldoContable saldocontableAux:this.saldocontableLogic.getSaldoContables()) {
					if(saldocontableAux.getId()<0) {
						saldocontablesAux.add(saldocontableAux);
					}		
				}
				this.iIdNuevoSaldoContable=0L;
				this.saldocontableLogic.getSaldoContables().removeAll(saldocontablesAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(SaldoContable saldocontableAux:this.saldocontables) {
					if(saldocontableAux.getId()<0) {
						saldocontablesAux.add(saldocontableAux);
					}		
				}
				this.iIdNuevoSaldoContable=0L;
				this.saldocontables.removeAll(saldocontablesAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoSaldoContable 
					&& this.saldocontableLogic.getSaldoContables().size()>0
					) {
					saldocontableAux=this.saldocontableLogic.getSaldoContables().get(this.saldocontableLogic.getSaldoContables().size() - 1);
				
					if(saldocontableAux.getId()<0) {
						this.saldocontableLogic.getSaldoContables().remove(saldocontableAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoSaldoContable && this.saldocontables.size()>0) {
					saldocontableAux=this.saldocontables.get(this.saldocontables.size() - 1);
				
					if(saldocontableAux.getId()<0) {
						this.saldocontables.remove(saldocontableAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoSaldoContable(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(saldocontable.getId()<0) {
				this.saldocontableLogic.getSaldoContables().remove(this.saldocontable);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(saldocontable.getId()<0) {
				this.saldocontables.remove(this.saldocontable);
			}
		}			
	}
	
	public void setEstadosInicialesSaldoContable(List<SaldoContable> saldocontablesAux) throws Exception {
		SaldoContableConstantesFunciones.setEstadosInicialesSaldoContable(saldocontablesAux);
	}
	
	public void setEstadosInicialesSaldoContable(SaldoContable saldocontableAux) throws Exception {
		SaldoContableConstantesFunciones.setEstadosInicialesSaldoContable(saldocontableAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarSaldoContableActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesSaldoContable("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarSaldoContableActual()) {
				if(!this.isEsNuevoSaldoContable) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesSaldoContable("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoSaldoContable=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarSaldoContableActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Saldo Contable ?", "MANTENIMIENTO DE Saldo Contable", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesSaldoContable("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(SaldoContable saldocontable) throws Exception {
		SaldoContableConstantesFunciones.seleccionarAsignar(this.saldocontable,saldocontable);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarSaldoContable=this.isPermisoActualizarOriginalSaldoContable;
			
			
			this.seleccionarAsignar(saldocontable);
			
			

			idCuentaContableActual=saldocontable.getid_cuenta_contable();
			this.seleccionarCuentaContableActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			SaldoContableConstantesFunciones.quitarEspaciosSaldoContable(this.saldocontable,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesSaldoContable("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.saldocontableSessionBean.setsFuncionBusquedaRapida(this.saldocontableSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
		}
	}
	
	
	//BUSQUEDA INTERNA FK
	public void seleccionarCuentaContableActual() throws Exception {
		try	{
			CuentaContable cuentacontableAux=new CuentaContable();

			if(this.idCuentaContableActual != null && this.idCuentaContableActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacontableLogic.getEntityWithConnection(this.idCuentaContableActual);
					cuentacontableAux= cuentacontableLogic.getCuentaContable();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				cuentacontablesForeignKey=new ArrayList<CuentaContable>();
				cuentacontablesForeignKey.add(cuentacontableAux);
			}

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoSaldoContable) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosSaldoContable(esParaCancelar);				
				this.cancelarNuevoSaldoContable(esParaCancelar);								
			}
			
			this.saldocontable=new SaldoContable();
			
			this.inicializarSaldoContable();
			
			this.actualizarEstadoCeldasBotonesSaldoContable("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarSaldoContable() throws Exception {
		try {
			SaldoContableConstantesFunciones.inicializarSaldoContable(this.saldocontable);
			
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
			FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.saldocontableLogic.getSaldoContables().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteSaldoContables(String sAccionBusqueda,List<SaldoContable> saldocontablesParaReportes) throws Exception {
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
					sPathReporteFinal="SaldoContable"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="SaldoContableMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("SaldoContableMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="SaldoContable"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Saldo Contables");		
		parameters.put("busquedapor", SaldoContableConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceSaldoContable=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			SaldoContableConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			SaldoContableConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceSaldoContable=new JRBeanArrayDataSource(SaldoContableJInternalFrame.TraerSaldoContableBeans(saldocontablesParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceSaldoContable);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+SaldoContableConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+SaldoContableConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(SaldoContableBean.TraerSaldoContableBeans(saldocontablesParaReportes).toArray()));
							
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
				this.generarExcelReporteSaldoContables(sAccionBusqueda,sTipoArchivoReporte,saldocontablesParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalSaldoContables(sAccionBusqueda,sTipoArchivoReporte,saldocontablesParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoSaldoContableActionPerformed(null);
					//this.generarExcelReporteSaldoContables(sAccionBusqueda,sTipoArchivoReporte,saldocontablesParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalSaldoContables(sAccionBusqueda,sTipoArchivoReporte,saldocontablesParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesSaldoContables(sAccionBusqueda,sTipoArchivoReporte,saldocontablesParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesSaldoContables(sAccionBusqueda,sTipoArchivoReporte,saldocontablesParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteSaldoContables(String sAccionBusqueda,String sTipoArchivoReporte,List<SaldoContable> saldocontablesParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"saldocontable";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("SaldoContables");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderSaldoContable("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(SaldoContable saldocontable : saldocontablesParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			SaldoContableConstantesFunciones.generarExcelReporteDataSaldoContable("NORMAL",row,workbook,saldocontable,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.saldocontableSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Saldo Contable",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderSaldoContable(String sTipo,Row row,Workbook workbook) {
		
		SaldoContableConstantesFunciones.generarExcelReporteHeaderSaldoContable(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalSaldoContables(String sAccionBusqueda,String sTipoArchivoReporte,List<SaldoContable> saldocontablesParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"saldocontable_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("SaldoContables");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(SaldoContable saldocontable : saldocontablesParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(SaldoContableConstantesFunciones.getSaldoContableDescripcion(saldocontable));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SaldoContableConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SaldoContableConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(saldocontable.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SaldoContableConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SaldoContableConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(saldocontable.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SaldoContableConstantesFunciones.LABEL_IDEJERCICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SaldoContableConstantesFunciones.LABEL_IDEJERCICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(saldocontable.getejercicio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SaldoContableConstantesFunciones.LABEL_IDPERIODO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SaldoContableConstantesFunciones.LABEL_IDPERIODO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(saldocontable.getperiodo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SaldoContableConstantesFunciones.LABEL_IDANIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SaldoContableConstantesFunciones.LABEL_IDANIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(saldocontable.getanio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SaldoContableConstantesFunciones.LABEL_IDMES))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SaldoContableConstantesFunciones.LABEL_IDMES);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(saldocontable.getmes_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SaldoContableConstantesFunciones.LABEL_IDCUENTACONTABLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SaldoContableConstantesFunciones.LABEL_IDCUENTACONTABLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(saldocontable.getcuentacontable_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SaldoContableConstantesFunciones.LABEL_DEBITOMONELOCAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SaldoContableConstantesFunciones.LABEL_DEBITOMONELOCAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(saldocontable.getdebito_mone_local());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SaldoContableConstantesFunciones.LABEL_CREDITOMONELOCAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SaldoContableConstantesFunciones.LABEL_CREDITOMONELOCAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(saldocontable.getcredito_mone_local());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SaldoContableConstantesFunciones.LABEL_SALDOMONELOCAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SaldoContableConstantesFunciones.LABEL_SALDOMONELOCAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(saldocontable.getsaldo_mone_local());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SaldoContableConstantesFunciones.LABEL_DEBITOMONEEXTRA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SaldoContableConstantesFunciones.LABEL_DEBITOMONEEXTRA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(saldocontable.getdebito_mone_extra());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SaldoContableConstantesFunciones.LABEL_CREDITOMONEEXTRA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SaldoContableConstantesFunciones.LABEL_CREDITOMONEEXTRA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(saldocontable.getcredito_mone_extra());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SaldoContableConstantesFunciones.LABEL_SALDOMONEEXTRA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SaldoContableConstantesFunciones.LABEL_SALDOMONEEXTRA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(saldocontable.getsaldo_mone_extra());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.saldocontableSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Saldo Contable",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesSaldoContables(String sAccionBusqueda,String sTipoArchivoReporte,List<SaldoContable> saldocontablesParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<SaldoContable> saldocontablesRespaldo=null;
		
		classes=SaldoContableConstantesFunciones.getClassesRelationshipsOfSaldoContable(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.saldocontableLogic.setDatosCliente(this.datosCliente);
		this.saldocontableLogic.setDatosDeep(this.datosDeep);
		this.saldocontableLogic.setIsConDeep(true);
		
		saldocontablesRespaldo=this.saldocontableLogic.getSaldoContables();
		
		this.saldocontableLogic.setSaldoContables(saldocontablesParaReportes);	
		this.saldocontableLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		saldocontablesParaReportes=this.saldocontableLogic.getSaldoContables();
		this.saldocontableLogic.setSaldoContables(saldocontablesRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"saldocontable_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("SaldoContables");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderSaldoContable("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(SaldoContable saldocontable : saldocontablesParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderSaldoContable("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			SaldoContableConstantesFunciones.generarExcelReporteDataSaldoContable("NORMAL",row,workbook,saldocontable,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(SaldoContableConstantesFunciones.getSaldoContableDescripcion(saldocontable));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.saldocontableSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Saldo Contable",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoSaldoContable.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSaldoContable.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoSaldoContable.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSaldoContable.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessSaldoContable() throws Exception {		
		this.startProcessSaldoContable(true);
	}
	
	public void startProcessSaldoContable(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasSaldoContable ,this.jPanelParametrosReportesSaldoContable, this.jScrollPanelDatosSaldoContable,this.jPanelPaginacionSaldoContable, this.jScrollPanelDatosEdicionSaldoContable, this.jPanelAccionesSaldoContable,this.jPanelAccionesFormularioSaldoContable,this.jmenuBarSaldoContable,this.jmenuBarDetalleSaldoContable,this.jTtoolBarSaldoContable,this.jTtoolBarDetalleSaldoContable);		
		
		final JTabbedPane jTabbedPaneBusquedasSaldoContable=this.jTabbedPaneBusquedasSaldoContable; 
		
		final JPanel jPanelParametrosReportesSaldoContable=this.jPanelParametrosReportesSaldoContable;
		//final JScrollPane jScrollPanelDatosSaldoContable=this.jScrollPanelDatosSaldoContable;
		final JTable jTableDatosSaldoContable=this.jTableDatosSaldoContable;		
		final JPanel jPanelPaginacionSaldoContable=this.jPanelPaginacionSaldoContable;
		//final JScrollPane jScrollPanelDatosEdicionSaldoContable=this.jScrollPanelDatosEdicionSaldoContable;
		final JPanel jPanelAccionesSaldoContable=this.jPanelAccionesSaldoContable;
		
		JPanel jPanelCamposAuxiliarSaldoContable=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarSaldoContable=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormSaldoContable!=null) {
			jPanelCamposAuxiliarSaldoContable=this.jInternalFrameDetalleFormSaldoContable.jPanelCamposSaldoContable;
			jPanelAccionesFormularioAuxiliarSaldoContable=this.jInternalFrameDetalleFormSaldoContable.jPanelAccionesFormularioSaldoContable;
		}
		
		final JPanel jPanelCamposSaldoContable=jPanelCamposAuxiliarSaldoContable;
		final JPanel jPanelAccionesFormularioSaldoContable=jPanelAccionesFormularioAuxiliarSaldoContable;
		
		
		final JMenuBar jmenuBarSaldoContable=this.jmenuBarSaldoContable;
		final JToolBar jTtoolBarSaldoContable=this.jTtoolBarSaldoContable;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarSaldoContable=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarSaldoContable=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormSaldoContable!=null) {
			jmenuBarDetalleAuxiliarSaldoContable=this.jInternalFrameDetalleFormSaldoContable.jmenuBarDetalleSaldoContable;
			jTtoolBarDetalleAuxiliarSaldoContable=this.jInternalFrameDetalleFormSaldoContable.jTtoolBarDetalleSaldoContable;
		}
		
		final JMenuBar jmenuBarDetalleSaldoContable=jmenuBarDetalleAuxiliarSaldoContable;
		final JToolBar jTtoolBarDetalleSaldoContable=jTtoolBarDetalleAuxiliarSaldoContable;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasSaldoContable;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesSaldoContable;
			processRunnable.jTableDatos=jTableDatosSaldoContable;
			processRunnable.jPanelCampos=jPanelCamposSaldoContable;
			processRunnable.jPanelPaginacion=jPanelPaginacionSaldoContable;
			processRunnable.jPanelAcciones=jPanelAccionesSaldoContable;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioSaldoContable;
			
			
			processRunnable.jmenuBar=jmenuBarSaldoContable;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleSaldoContable;
			processRunnable.jTtoolBar=jTtoolBarSaldoContable;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleSaldoContable;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasSaldoContable ,jPanelParametrosReportesSaldoContable,jTableDatosSaldoContable, /*jScrollPanelDatosSaldoContable,*/jPanelCamposSaldoContable,jPanelPaginacionSaldoContable, /*jScrollPanelDatosEdicionSaldoContable,*/ jPanelAccionesSaldoContable,jPanelAccionesFormularioSaldoContable,jmenuBarSaldoContable,jmenuBarDetalleSaldoContable,jTtoolBarSaldoContable,jTtoolBarDetalleSaldoContable);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasSaldoContable ,jPanelParametrosReportesSaldoContable, jScrollPanelDatosSaldoContable,jPanelPaginacionSaldoContable, jScrollPanelDatosEdicionSaldoContable, jPanelAccionesSaldoContable,jPanelAccionesFormularioSaldoContable,jmenuBarSaldoContable,jmenuBarDetalleSaldoContable,jTtoolBarSaldoContable,jTtoolBarDetalleSaldoContable);
						
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
	
	public void finishProcessSaldoContable() {// throws Exception 
		this.finishProcessSaldoContable(true);
	}
	
	public void finishProcessSaldoContable(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasSaldoContable ,this.jPanelParametrosReportesSaldoContable, this.jScrollPanelDatosSaldoContable,this.jPanelPaginacionSaldoContable, this.jScrollPanelDatosEdicionSaldoContable, this.jPanelAccionesSaldoContable,this.jPanelAccionesFormularioSaldoContable,this.jmenuBarSaldoContable,this.jmenuBarDetalleSaldoContable,this.jTtoolBarSaldoContable,this.jTtoolBarDetalleSaldoContable);		
		
		final JTabbedPane jTabbedPaneBusquedasSaldoContable=this.jTabbedPaneBusquedasSaldoContable; 
		
		final JPanel jPanelParametrosReportesSaldoContable=this.jPanelParametrosReportesSaldoContable;
		//final JScrollPane jScrollPanelDatosSaldoContable=this.jScrollPanelDatosSaldoContable;
		final JTable jTableDatosSaldoContable=this.jTableDatosSaldoContable;		
		final JPanel jPanelPaginacionSaldoContable=this.jPanelPaginacionSaldoContable;
		//final JScrollPane jScrollPanelDatosEdicionSaldoContable=this.jScrollPanelDatosEdicionSaldoContable;
		final JPanel jPanelAccionesSaldoContable=this.jPanelAccionesSaldoContable;
		
		JPanel jPanelCamposAuxiliarSaldoContable=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarSaldoContable=new JPanel();
		
		if(this.jInternalFrameDetalleFormSaldoContable!=null) {
			jPanelCamposAuxiliarSaldoContable=this.jInternalFrameDetalleFormSaldoContable.jPanelCamposSaldoContable;
			jPanelAccionesFormularioAuxiliarSaldoContable=this.jInternalFrameDetalleFormSaldoContable.jPanelAccionesFormularioSaldoContable;
		}
		
		final JPanel jPanelCamposSaldoContable=jPanelCamposAuxiliarSaldoContable;
		final JPanel jPanelAccionesFormularioSaldoContable=jPanelAccionesFormularioAuxiliarSaldoContable;
		
		
		final JMenuBar jmenuBarSaldoContable=this.jmenuBarSaldoContable;		
		final JToolBar jTtoolBarSaldoContable=this.jTtoolBarSaldoContable;
				
		JMenuBar jmenuBarDetalleAuxiliarSaldoContable=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarSaldoContable=new JToolBar();
		
		if(this.jInternalFrameDetalleFormSaldoContable!=null) {
			jmenuBarDetalleAuxiliarSaldoContable=this.jInternalFrameDetalleFormSaldoContable.jmenuBarDetalleSaldoContable;
			jTtoolBarDetalleAuxiliarSaldoContable=this.jInternalFrameDetalleFormSaldoContable.jTtoolBarDetalleSaldoContable;		
		}
		
		final JMenuBar jmenuBarDetalleSaldoContable=jmenuBarDetalleAuxiliarSaldoContable;
		final JToolBar jTtoolBarDetalleSaldoContable=jTtoolBarDetalleAuxiliarSaldoContable;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasSaldoContable;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesSaldoContable;
			processRunnable.jTableDatos=jTableDatosSaldoContable;
			processRunnable.jPanelCampos=jPanelCamposSaldoContable;
			processRunnable.jPanelPaginacion=jPanelPaginacionSaldoContable;
			processRunnable.jPanelAcciones=jPanelAccionesSaldoContable;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioSaldoContable;
			
			
			processRunnable.jmenuBar=jmenuBarSaldoContable;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleSaldoContable;
			processRunnable.jTtoolBar=jTtoolBarSaldoContable;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleSaldoContable;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasSaldoContable ,jPanelParametrosReportesSaldoContable, jTableDatosSaldoContable,/*jScrollPanelDatosSaldoContable,*/jPanelCamposSaldoContable,jPanelPaginacionSaldoContable, /*jScrollPanelDatosEdicionSaldoContable,*/ jPanelAccionesSaldoContable,jPanelAccionesFormularioSaldoContable,jmenuBarSaldoContable,jmenuBarDetalleSaldoContable,jTtoolBarSaldoContable,jTtoolBarDetalleSaldoContable));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesSaldoContable(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarSaldoContable(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuSaldoContable(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarSaldoContable(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarSaldoContable,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleSaldoContable,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuSaldoContable(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarSaldoContable,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleSaldoContable,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.saldocontableConstantesFunciones.getsFinalQuerySaldoContable();
		String  finalQueryPaginacionTodos=this.saldocontableConstantesFunciones.getsFinalQuerySaldoContable();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=SaldoContableConstantesFunciones.getArrayColumnasGlobalesNoSaldoContable(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=SaldoContableConstantesFunciones.getArrayColumnasGlobalesSaldoContable(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,SaldoContableConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.saldocontablesEliminados= new ArrayList<SaldoContable>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessSaldoContable();
		
				///*SaldoContableSessionBean*/this.saldocontableSessionBean=new SaldoContableSessionBean();
			
			if(this.saldocontableSessionBean==null) {
				this.saldocontableSessionBean=new SaldoContableSessionBean();
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
					this.iNumeroPaginacion=SaldoContableConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=SaldoContableConstantesFunciones.getClassesForeignKeysOfSaldoContable(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/saldocontable."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			saldocontablesAux= new ArrayList<SaldoContable>();
			
				
			saldocontableLogic.setDatosCliente(this.datosCliente);
			saldocontableLogic.setDatosDeep(this.datosDeep);
			saldocontableLogic.setIsConDeep(true);
			
			
			saldocontableLogic.getSaldoContableDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					saldocontableLogic.getTodosSaldoContables(finalQueryGlobal,pagination);
					
					//saldocontableLogic.getTodosSaldoContablesWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(saldocontableLogic.getSaldoContables()==null|| saldocontableLogic.getSaldoContables().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							saldocontablesAux= new ArrayList<SaldoContable>();
							saldocontablesAux.addAll(saldocontableLogic.getSaldoContables());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							saldocontablesAux= new ArrayList<SaldoContable>();
							saldocontablesAux.addAll(saldocontables);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							saldocontableLogic.getTodosSaldoContables(finalQueryGlobal+"",this.pagination);												
							
							//saldocontableLogic.getTodosSaldoContablesWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteSaldoContables("Todos",saldocontableLogic.getSaldoContables() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							saldocontableLogic.setSaldoContables(new ArrayList<SaldoContable>());					
							saldocontableLogic.getSaldoContables().addAll(saldocontablesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							saldocontables=new ArrayList<SaldoContable>();
							saldocontables.addAll(saldocontablesAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idSaldoContable=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idSaldoContable=this.idActual;
				
				} else if(this.idSaldoContableActual!=null && this.idSaldoContableActual!=0L) {
					idSaldoContable=idSaldoContableActual;
				}
				
					
				this.sDetalleReporte=SaldoContableConstantesFunciones.getDetalleIndicePorId(idSaldoContable);
				
				this.saldocontables=new ArrayList<SaldoContable>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					saldocontableLogic.getEntity(idSaldoContable);
					
					//saldocontableLogic.getEntityWithConnection(idSaldoContable);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					saldocontableLogic.setSaldoContables(new ArrayList<SaldoContable>());
					saldocontableLogic.getSaldoContables().add(saldocontableLogic.getSaldoContable());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.saldocontables=new ArrayList<SaldoContable>();
					this.saldocontables.add(saldocontable);
				}
				
				if(saldocontableLogic.getSaldoContable()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdCuentaContable")) {
				this.sDetalleReporte=SaldoContableConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					saldocontableLogic.getSaldoContablesFK_IdCuentaContable(finalQueryGlobal,pagination,id_cuenta_contableFK_IdCuentaContable);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SaldoContableConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SaldoContableConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=saldocontableLogic.getSaldoContables()==null||saldocontableLogic.getSaldoContables().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=saldocontables==null|| saldocontables.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						saldocontablesAux=new ArrayList<SaldoContable>();
						saldocontablesAux.addAll(saldocontableLogic.getSaldoContables());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							saldocontablesAux=new ArrayList<SaldoContable>();
							saldocontablesAux.addAll(saldocontables);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							saldocontableLogic.getSaldoContablesFK_IdCuentaContable(finalQueryGlobal,pagination,id_cuenta_contableFK_IdCuentaContable);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SaldoContableConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SaldoContableConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteSaldoContables("FK_IdCuentaContable",saldocontableLogic.getSaldoContables());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteSaldoContables("FK_IdCuentaContable",saldocontables);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						saldocontableLogic.setSaldoContables(new ArrayList<SaldoContable>());
						saldocontableLogic.getSaldoContables().addAll(saldocontablesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							saldocontables=new ArrayList<SaldoContable>();
							saldocontables.addAll(saldocontablesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEjercicio")) {
				this.sDetalleReporte=SaldoContableConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					saldocontableLogic.getSaldoContablesFK_IdEjercicio(finalQueryGlobal,pagination,id_ejercicioFK_IdEjercicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SaldoContableConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SaldoContableConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=saldocontableLogic.getSaldoContables()==null||saldocontableLogic.getSaldoContables().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=saldocontables==null|| saldocontables.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						saldocontablesAux=new ArrayList<SaldoContable>();
						saldocontablesAux.addAll(saldocontableLogic.getSaldoContables());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							saldocontablesAux=new ArrayList<SaldoContable>();
							saldocontablesAux.addAll(saldocontables);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							saldocontableLogic.getSaldoContablesFK_IdEjercicio(finalQueryGlobal,pagination,id_ejercicioFK_IdEjercicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SaldoContableConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SaldoContableConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteSaldoContables("FK_IdEjercicio",saldocontableLogic.getSaldoContables());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteSaldoContables("FK_IdEjercicio",saldocontables);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						saldocontableLogic.setSaldoContables(new ArrayList<SaldoContable>());
						saldocontableLogic.getSaldoContables().addAll(saldocontablesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							saldocontables=new ArrayList<SaldoContable>();
							saldocontables.addAll(saldocontablesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=SaldoContableConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					saldocontableLogic.getSaldoContablesFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SaldoContableConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SaldoContableConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=saldocontableLogic.getSaldoContables()==null||saldocontableLogic.getSaldoContables().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=saldocontables==null|| saldocontables.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						saldocontablesAux=new ArrayList<SaldoContable>();
						saldocontablesAux.addAll(saldocontableLogic.getSaldoContables());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							saldocontablesAux=new ArrayList<SaldoContable>();
							saldocontablesAux.addAll(saldocontables);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							saldocontableLogic.getSaldoContablesFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SaldoContableConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SaldoContableConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteSaldoContables("FK_IdEmpresa",saldocontableLogic.getSaldoContables());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteSaldoContables("FK_IdEmpresa",saldocontables);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						saldocontableLogic.setSaldoContables(new ArrayList<SaldoContable>());
						saldocontableLogic.getSaldoContables().addAll(saldocontablesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							saldocontables=new ArrayList<SaldoContable>();
							saldocontables.addAll(saldocontablesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdPeriodo")) {
				this.sDetalleReporte=SaldoContableConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					saldocontableLogic.getSaldoContablesFK_IdPeriodo(finalQueryGlobal,pagination,id_periodoFK_IdPeriodo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SaldoContableConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SaldoContableConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=saldocontableLogic.getSaldoContables()==null||saldocontableLogic.getSaldoContables().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=saldocontables==null|| saldocontables.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						saldocontablesAux=new ArrayList<SaldoContable>();
						saldocontablesAux.addAll(saldocontableLogic.getSaldoContables());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							saldocontablesAux=new ArrayList<SaldoContable>();
							saldocontablesAux.addAll(saldocontables);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							saldocontableLogic.getSaldoContablesFK_IdPeriodo(finalQueryGlobal,pagination,id_periodoFK_IdPeriodo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SaldoContableConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SaldoContableConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteSaldoContables("FK_IdPeriodo",saldocontableLogic.getSaldoContables());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteSaldoContables("FK_IdPeriodo",saldocontables);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						saldocontableLogic.setSaldoContables(new ArrayList<SaldoContable>());
						saldocontableLogic.getSaldoContables().addAll(saldocontablesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							saldocontables=new ArrayList<SaldoContable>();
							saldocontables.addAll(saldocontablesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=SaldoContableConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					saldocontableLogic.getSaldoContablesFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SaldoContableConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SaldoContableConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=saldocontableLogic.getSaldoContables()==null||saldocontableLogic.getSaldoContables().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=saldocontables==null|| saldocontables.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						saldocontablesAux=new ArrayList<SaldoContable>();
						saldocontablesAux.addAll(saldocontableLogic.getSaldoContables());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							saldocontablesAux=new ArrayList<SaldoContable>();
							saldocontablesAux.addAll(saldocontables);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							saldocontableLogic.getSaldoContablesFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SaldoContableConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SaldoContableConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteSaldoContables("FK_IdSucursal",saldocontableLogic.getSaldoContables());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteSaldoContables("FK_IdSucursal",saldocontables);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						saldocontableLogic.setSaldoContables(new ArrayList<SaldoContable>());
						saldocontableLogic.getSaldoContables().addAll(saldocontablesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							saldocontables=new ArrayList<SaldoContable>();
							saldocontables.addAll(saldocontablesAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesSaldoContable();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessSaldoContable();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=saldocontableLogic.getSaldoContables().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=saldocontables.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=saldocontableLogic.getSaldoContables().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=saldocontables.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(SaldoContable saldocontable) {
		Boolean permite=true;
		
		if(this.saldocontable.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=SaldoContableConstantesFunciones.getOrderByListaSaldoContable();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=SaldoContableConstantesFunciones.getOrderByListaSaldoContable();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SaldoContable saldocontable:saldocontableLogic.getSaldoContables()) {
				if(saldocontable.getsType().equals(Constantes2.S_TOTALES)) {
					saldocontableTotales=saldocontable;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SaldoContable saldocontable:this.saldocontables) {
				if(saldocontable.getsType().equals(Constantes2.S_TOTALES)) {
					saldocontableTotales=saldocontable;
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
			this.saldocontableAux=new SaldoContable();
			this.saldocontableAux.setsType(Constantes2.S_TOTALES);
			this.saldocontableAux.setIsNew(false);
			this.saldocontableAux.setIsChanged(false);
			this.saldocontableAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				SaldoContableConstantesFunciones.TotalizarValoresFilaSaldoContable(this.saldocontableLogic.getSaldoContables(),this.saldocontableAux);
				
				this.saldocontableLogic.getSaldoContables().add(this.saldocontableAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				SaldoContableConstantesFunciones.TotalizarValoresFilaSaldoContable(this.saldocontables,this.saldocontableAux);
				
				this.saldocontables.add(this.saldocontableAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		saldocontableTotales=new SaldoContable();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.saldocontableLogic.getSaldoContables().remove(saldocontableTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.saldocontables.remove(saldocontableTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		saldocontableTotales=new SaldoContable();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SaldoContable saldocontable:saldocontableLogic.getSaldoContables()) {
				if(saldocontable.getsType().equals(Constantes2.S_TOTALES)) {
					saldocontableTotales=saldocontable;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				SaldoContableConstantesFunciones.TotalizarValoresFilaSaldoContable(this.saldocontableLogic.getSaldoContables(),saldocontableTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SaldoContable saldocontable:this.saldocontables) {
				if(saldocontable.getsType().equals(Constantes2.S_TOTALES)) {
					saldocontableTotales=saldocontable;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				SaldoContableConstantesFunciones.TotalizarValoresFilaSaldoContable(this.saldocontables,saldocontableTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getSaldoContablesFK_IdAnio()throws Exception {
		try {
			sAccionBusqueda="FK_IdAnio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSaldoContablesFK_IdCuentaContable()throws Exception {
		try {
			sAccionBusqueda="FK_IdCuentaContable";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSaldoContablesFK_IdEjercicio()throws Exception {
		try {
			sAccionBusqueda="FK_IdEjercicio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSaldoContablesFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSaldoContablesFK_IdMes()throws Exception {
		try {
			sAccionBusqueda="FK_IdMes";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSaldoContablesFK_IdPeriodo()throws Exception {
		try {
			sAccionBusqueda="FK_IdPeriodo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSaldoContablesFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getSaldoContablesFK_IdAnio(String sFinalQuery,Long id_anio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					saldocontableLogic.getSaldoContablesFK_IdAnio(sFinalQuery,this.pagination,id_anio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSaldoContablesFK_IdCuentaContable(String sFinalQuery,Long id_cuenta_contable)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					saldocontableLogic.getSaldoContablesFK_IdCuentaContable(sFinalQuery,this.pagination,id_cuenta_contable);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSaldoContablesFK_IdEjercicio(String sFinalQuery,Long id_ejercicio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					saldocontableLogic.getSaldoContablesFK_IdEjercicio(sFinalQuery,this.pagination,id_ejercicio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSaldoContablesFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					saldocontableLogic.getSaldoContablesFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSaldoContablesFK_IdMes(String sFinalQuery,Long id_mes)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					saldocontableLogic.getSaldoContablesFK_IdMes(sFinalQuery,this.pagination,id_mes);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSaldoContablesFK_IdPeriodo(String sFinalQuery,Long id_periodo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					saldocontableLogic.getSaldoContablesFK_IdPeriodo(sFinalQuery,this.pagination,id_periodo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSaldoContablesFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					saldocontableLogic.getSaldoContablesFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosSaldoContable() {
		this.isPermisoTodoSaldoContable=false;
		this.isPermisoNuevoSaldoContable=false;
		this.isPermisoActualizarSaldoContable=false;
		this.isPermisoActualizarOriginalSaldoContable=false;
		this.isPermisoEliminarSaldoContable=false;
		this.isPermisoGuardarCambiosSaldoContable=false;
		this.isPermisoConsultaSaldoContable=false;
		this.isPermisoBusquedaSaldoContable=false;
		this.isPermisoReporteSaldoContable=false;		
		this.isPermisoOrdenSaldoContable=false;		
		this.isPermisoPaginacionMedioSaldoContable=false;		
		this.isPermisoPaginacionAltoSaldoContable=false;
		this.isPermisoPaginacionTodoSaldoContable=false;
		this.isPermisoCopiarSaldoContable=false;		
		this.isPermisoVerFormSaldoContable=false;		
		this.isPermisoDuplicarSaldoContable=false;		
		this.isPermisoOrdenSaldoContable=false;		
	}
	
	public void setPermisosUsuarioSaldoContable(Boolean isPermiso) {
		this.isPermisoTodoSaldoContable=isPermiso;
		this.isPermisoNuevoSaldoContable=isPermiso;
		this.isPermisoActualizarSaldoContable=isPermiso;
		this.isPermisoActualizarOriginalSaldoContable=isPermiso;
		this.isPermisoEliminarSaldoContable=isPermiso;
		this.isPermisoGuardarCambiosSaldoContable=isPermiso;
		this.isPermisoConsultaSaldoContable=isPermiso;
		this.isPermisoBusquedaSaldoContable=isPermiso;
		this.isPermisoReporteSaldoContable=isPermiso;
		this.isPermisoOrdenSaldoContable=isPermiso;		
		this.isPermisoPaginacionMedioSaldoContable=isPermiso;		
		this.isPermisoPaginacionAltoSaldoContable=isPermiso;		
		this.isPermisoPaginacionTodoSaldoContable=isPermiso;		
		this.isPermisoCopiarSaldoContable=isPermiso;		
		this.isPermisoVerFormSaldoContable=isPermiso;		
		this.isPermisoDuplicarSaldoContable=isPermiso;
		this.isPermisoOrdenSaldoContable=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioSaldoContable(Boolean isPermiso) {
		//this.isPermisoTodoSaldoContable=isPermiso;
		this.isPermisoNuevoSaldoContable=isPermiso;
		this.isPermisoActualizarSaldoContable=isPermiso;
		this.isPermisoActualizarOriginalSaldoContable=isPermiso;
		this.isPermisoEliminarSaldoContable=isPermiso;
		this.isPermisoGuardarCambiosSaldoContable=isPermiso;
		//this.isPermisoConsultaSaldoContable=isPermiso;
		//this.isPermisoBusquedaSaldoContable=isPermiso;
		//this.isPermisoReporteSaldoContable=isPermiso;
		//this.isPermisoOrdenSaldoContable=isPermiso;		
		//this.isPermisoPaginacionMedioSaldoContable=isPermiso;		
		//this.isPermisoPaginacionAltoSaldoContable=isPermiso;		
		//this.isPermisoPaginacionTodoSaldoContable=isPermiso;		
		//this.isPermisoCopiarSaldoContable=isPermiso;		
		//this.isPermisoDuplicarSaldoContable=isPermiso;
		//this.isPermisoOrdenSaldoContable=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioSaldoContableClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(SaldoContableJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebSaldoContable(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioSaldoContableClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioSaldoContableClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionSaldoContableClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioSaldoContableClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioSaldoContable() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(SaldoContableJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.saldocontableSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, SaldoContableConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoSaldoContable=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarSaldoContable=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalSaldoContable=this.isPermisoActualizarSaldoContable;
			this.isPermisoEliminarSaldoContable=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosSaldoContable=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaSaldoContable=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaSaldoContable=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoSaldoContable=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteSaldoContable=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenSaldoContable=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioSaldoContable=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoSaldoContable=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoSaldoContable=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarSaldoContable=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormSaldoContable=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarSaldoContable=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenSaldoContable=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.saldocontableSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosSaldoContable.setToolTipText(this.jTableDatosSaldoContable.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioSaldoContable(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioSaldoContable(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(SaldoContableJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(SaldoContableJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioSaldoContable() throws Exception {
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
	public void inicializarCombosForeignKeySaldoContableListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.ejerciciosForeignKey=new ArrayList();
				this.periodosForeignKey=new ArrayList();
				this.aniosForeignKey=new ArrayList();
				this.messForeignKey=new ArrayList();
				this.cuentacontablesForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeySaldoContableListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(SaldoContableJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeySaldoContableListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEjercicioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyPeriodoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyAnioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyMesListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCuentaContableListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyCuentaContableListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.cuentacontablesForeignKey==null||this.cuentacontablesForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=CuentaContableConstantesFunciones.getArrayColumnasGlobalesCuentaContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaContableConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=CuentaContableConstantesFunciones.SFINALQUERY;

				this.cargarCombosCuentaContablesForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeySaldoContableListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			SaldoContableParameterReturnGeneral saldocontableReturnGeneral=new SaldoContableParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.saldocontableConstantesFunciones.cargarid_empresaSaldoContable)
					 || (this.esRecargarFks && this.saldocontableConstantesFunciones.cargarid_empresaSaldoContable)) {

					if(!this.saldocontableSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+saldocontableSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.saldocontableConstantesFunciones.cargarid_sucursalSaldoContable)
					 || (this.esRecargarFks && this.saldocontableConstantesFunciones.cargarid_sucursalSaldoContable)) {

					if(!this.saldocontableSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+saldocontableSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalEjercicio="";

				if(((this.ejerciciosForeignKey==null||this.ejerciciosForeignKey.size()<=0) && this.saldocontableConstantesFunciones.cargarid_ejercicioSaldoContable)
					 || (this.esRecargarFks && this.saldocontableConstantesFunciones.cargarid_ejercicioSaldoContable)) {

					if(!this.saldocontableSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EjercicioConstantesFunciones.getArrayColumnasGlobalesEjercicio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEjercicio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EjercicioConstantesFunciones.TABLENAME);

						finalQueryGlobalEjercicio=Funciones.GetFinalQueryAppend(finalQueryGlobalEjercicio, "");
						finalQueryGlobalEjercicio+=EjercicioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEjerciciosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEjercicio=" WHERE " + ConstantesSql.ID + "="+saldocontableSessionBean.getlidEjercicioActual();
					}
				} else {
					finalQueryGlobalEjercicio="NONE";
				}


				String finalQueryGlobalPeriodo="";

				if(((this.periodosForeignKey==null||this.periodosForeignKey.size()<=0) && this.saldocontableConstantesFunciones.cargarid_periodoSaldoContable)
					 || (this.esRecargarFks && this.saldocontableConstantesFunciones.cargarid_periodoSaldoContable)) {

					if(!this.saldocontableSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PeriodoConstantesFunciones.getArrayColumnasGlobalesPeriodo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPeriodo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PeriodoConstantesFunciones.TABLENAME);

						finalQueryGlobalPeriodo=Funciones.GetFinalQueryAppend(finalQueryGlobalPeriodo, "");
						finalQueryGlobalPeriodo+=PeriodoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPeriodosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPeriodo=" WHERE " + ConstantesSql.ID + "="+saldocontableSessionBean.getlidPeriodoActual();
					}
				} else {
					finalQueryGlobalPeriodo="NONE";
				}


				String finalQueryGlobalAnio="";

				if(((this.aniosForeignKey==null||this.aniosForeignKey.size()<=0) && this.saldocontableConstantesFunciones.cargarid_anioSaldoContable)
					 || (this.esRecargarFks && this.saldocontableConstantesFunciones.cargarid_anioSaldoContable)) {

					if(!this.saldocontableSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=AnioConstantesFunciones.getArrayColumnasGlobalesAnio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalAnio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,AnioConstantesFunciones.TABLENAME);

						finalQueryGlobalAnio=Funciones.GetFinalQueryAppend(finalQueryGlobalAnio, "");
						finalQueryGlobalAnio+=AnioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosAniosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalAnio=" WHERE " + ConstantesSql.ID + "="+saldocontableSessionBean.getlidAnioActual();
					}
				} else {
					finalQueryGlobalAnio="NONE";
				}


				String finalQueryGlobalMes="";

				if(((this.messForeignKey==null||this.messForeignKey.size()<=0) && this.saldocontableConstantesFunciones.cargarid_mesSaldoContable)
					 || (this.esRecargarFks && this.saldocontableConstantesFunciones.cargarid_mesSaldoContable)) {

					if(!this.saldocontableSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=MesConstantesFunciones.getArrayColumnasGlobalesMes(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalMes=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,MesConstantesFunciones.TABLENAME);

						finalQueryGlobalMes=Funciones.GetFinalQueryAppend(finalQueryGlobalMes, "");
						finalQueryGlobalMes+=MesConstantesFunciones.SFINALQUERY;

						//this.cargarCombosMessForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalMes=" WHERE " + ConstantesSql.ID + "="+saldocontableSessionBean.getlidMesActual();
					}
				} else {
					finalQueryGlobalMes="NONE";
				}


				String finalQueryGlobalCuentaContable="";

				if(((this.cuentacontablesForeignKey==null||this.cuentacontablesForeignKey.size()<=0) && this.saldocontableConstantesFunciones.cargarid_cuenta_contableSaldoContable)
					 || (this.esRecargarFks && this.saldocontableConstantesFunciones.cargarid_cuenta_contableSaldoContable)) {

					if(!this.saldocontableSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContable()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();

						this.arrDatoGeneralNo.add("id_modulo");

						arrColumnasGlobales=CuentaContableConstantesFunciones.getArrayColumnasGlobalesCuentaContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCuentaContable=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaContableConstantesFunciones.TABLENAME);

						finalQueryGlobalCuentaContable=Funciones.GetFinalQueryAppend(finalQueryGlobalCuentaContable, "");
						finalQueryGlobalCuentaContable+=CuentaContableConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCuentaContablesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCuentaContable=" WHERE " + ConstantesSql.ID + "="+saldocontableSessionBean.getlidCuentaContableActual();
					}
				} else {
					finalQueryGlobalCuentaContable="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				saldocontableReturnGeneral=saldocontableLogic.cargarCombosLoteForeignKeySaldoContable(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalEjercicio,finalQueryGlobalPeriodo,finalQueryGlobalAnio,finalQueryGlobalMes,finalQueryGlobalCuentaContable);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=saldocontableReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=saldocontableReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalEjercicio.equals("NONE")) {
				this.ejerciciosForeignKey=saldocontableReturnGeneral.getejerciciosForeignKey();
			}

			if(!finalQueryGlobalPeriodo.equals("NONE")) {
				this.periodosForeignKey=saldocontableReturnGeneral.getperiodosForeignKey();
			}

			if(!finalQueryGlobalAnio.equals("NONE")) {
				this.aniosForeignKey=saldocontableReturnGeneral.getaniosForeignKey();
			}

			if(!finalQueryGlobalMes.equals("NONE")) {
				this.messForeignKey=saldocontableReturnGeneral.getmessForeignKey();
			}

			if(!finalQueryGlobalCuentaContable.equals("NONE")) {
				this.cuentacontablesForeignKey=saldocontableReturnGeneral.getcuentacontablesForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeySaldoContable()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyEjercicio();
			this.addItemDefectoCombosForeignKeyPeriodo();
			this.addItemDefectoCombosForeignKeyAnio();
			this.addItemDefectoCombosForeignKeyMes();
			this.addItemDefectoCombosForeignKeyCuentaContable();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.saldocontableSessionBean==null) {
				this.saldocontableSessionBean=new SaldoContableSessionBean();
			}

			if(!this.saldocontableSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.saldocontableSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

			if(!this.saldocontableSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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

			if(!this.saldocontableSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
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

	public void addItemDefectoCombosForeignKeyAnio()throws Exception {
		try {

			if(!this.saldocontableSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
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

			if(!this.saldocontableSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
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

	public void addItemDefectoCombosForeignKeyCuentaContable()throws Exception {
		try {

			if(!this.saldocontableSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContable()) {
				CuentaContable cuentacontable=new CuentaContable();
				CuentaContableConstantesFunciones.setCuentaContableDescripcion(cuentacontable,Constantes.SMENSAJE_ESCOJA_OPCION);
				cuentacontable.setId(null);

				if(!CuentaContableConstantesFunciones.ExisteEnLista(this.cuentacontablesForeignKey,cuentacontable,true)) {

					this.cuentacontablesForeignKey.add(0,cuentacontable);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeySaldoContable()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeySaldoContable(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeySaldoContable()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
				this.setActualEjercicioForeignKey(this.parametroGeneralUsuario.getid_ejercicio(),false,"Formulario");
				this.setActualPeriodoForeignKey(this.parametroGeneralUsuario.getid_periodo(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeySaldoContable();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeySaldoContable(SaldoContable saldocontable)throws Exception {	
		try {
			
			this.setActualCuentaContableForeignKey(saldocontable.getid_cuenta_contable(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeySaldoContable(SaldoContable saldocontable,String sTipoEvento)throws Exception {	
		try {
			
			

				if(saldocontable.getCuentaContable()!=null && !sTipoEvento.equals("id_cuenta_contableSaldoContable")) { //sTipoEvento Evita Bucle Infinito

					this.cuentacontablesForeignKey=new ArrayList<CuentaContable>();
					this.cuentacontablesForeignKey.add(saldocontable.getCuentaContable());

					this.addItemDefectoCombosForeignKeyCuentaContable();
					this.cargarCombosFrameCuentaContablesForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeySaldoContable()throws Exception {	
		try {
			
			this.setActualCuentaContableForeignKey(this.saldocontableConstantesFunciones.getid_cuenta_contable(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeySaldoContable()throws Exception {	
		try {
			

				if(this.jInternalFrameDetalleFormSaldoContable!=null) {
					Ejercicio ejercicioActual=(Ejercicio)this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_ejercicioSaldoContable.getSelectedItem();
					this.setActualAnioForeignKey(ejercicioActual.getid_anio(),false,"Formulario");
				}

				if(this.jInternalFrameDetalleFormSaldoContable!=null) {
					Periodo periodoActual=(Periodo)this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_periodoSaldoContable.getSelectedItem();
					this.setActualMesForeignKey(periodoActual.getid_mes(),false,"Formulario");
				}
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeySaldoContable()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeySaldoContable()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroSaldoContable()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeySaldoContable()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameEjerciciosForeignKey("Todos");
			this.cargarCombosFramePeriodosForeignKey("Todos");
			this.cargarCombosFrameAniosForeignKey("Todos");
			this.cargarCombosFrameMessForeignKey("Todos");
			this.cargarCombosFrameCuentaContablesForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeySaldoContable(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEjerciciosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFramePeriodosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameAniosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameMessForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCuentaContablesForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeySaldoContable()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_empresaSaldoContable!=null && this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_empresaSaldoContable.getItemCount()>0) {
				this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_empresaSaldoContable.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_sucursalSaldoContable!=null && this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_sucursalSaldoContable.getItemCount()>0) {
				this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_sucursalSaldoContable.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_ejercicioSaldoContable!=null && this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_ejercicioSaldoContable.getItemCount()>0) {
				this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_ejercicioSaldoContable.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_periodoSaldoContable!=null && this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_periodoSaldoContable.getItemCount()>0) {
				this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_periodoSaldoContable.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_anioSaldoContable!=null && this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_anioSaldoContable.getItemCount()>0) {
				this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_anioSaldoContable.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_mesSaldoContable!=null && this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_mesSaldoContable.getItemCount()>0) {
				this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_mesSaldoContable.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_cuenta_contableSaldoContable!=null && this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_cuenta_contableSaldoContable.getItemCount()>0) {
				this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_cuenta_contableSaldoContable.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	














	
	

	public SaldoContableBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public SaldoContableBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public SaldoContableBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.saldocontableSessionBean=new SaldoContableSessionBean(); 
		this.saldocontableConstantesFunciones=new SaldoContableConstantesFunciones(); 
		this.saldocontableBean=new SaldoContable();//(this.saldocontableConstantesFunciones); 		
		this.saldocontableReturnGeneral=new SaldoContableParameterReturnGeneral(); 
		
		this.saldocontableSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.saldocontableSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public SaldoContableBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public SaldoContableBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public SaldoContableBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessSaldoContable(true);
			
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
			
			this.saldocontableConstantesFunciones=new SaldoContableConstantesFunciones(); 
			this.saldocontableBean=new SaldoContable();//this.saldocontableConstantesFunciones); 			
			this.saldocontableReturnGeneral=new SaldoContableParameterReturnGeneral(); 
		
			SaldoContableBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Saldo Contable Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.saldocontable=new SaldoContable();
			this.saldocontables = new ArrayList<SaldoContable>();
			this.saldocontablesAux = new ArrayList<SaldoContable>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontableLogic=new SaldoContableLogic();
				this.saldocontableLogic.getNewConnexionToDeep("");
			}
			
			//this.saldocontableSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.saldocontableSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormSaldoContable);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoSaldoContable!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoSaldoContable);	
					}
					
					if(this.jInternalFrameImportacionSaldoContable!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionSaldoContable);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderBySaldoContable!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderBySaldoContable);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormSaldoContable!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormSaldoContable);
				this.jInternalFrameDetalleFormSaldoContable.setVisible(false);
				this.jInternalFrameDetalleFormSaldoContable.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoSaldoContable!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoSaldoContable);
					this.jInternalFrameReporteDinamicoSaldoContable.setVisible(false);
					this.jInternalFrameReporteDinamicoSaldoContable.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionSaldoContable!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionSaldoContable);
					this.jInternalFrameImportacionSaldoContable.setVisible(false);
					this.jInternalFrameImportacionSaldoContable.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderBySaldoContable!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderBySaldoContable);
					this.jInternalFrameOrderBySaldoContable.setVisible(false);
					this.jInternalFrameOrderBySaldoContable.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idSaldoContableActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=SaldoContableConstantesFunciones.INUMEROPAGINACION;
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
			
			this.saldocontableReturnGeneral=new SaldoContableParameterReturnGeneral();
			
			this.saldocontableParameterGeneral=new SaldoContableParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.saldocontableLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.saldocontableSessionBean.getEsGuardarRelacionado()) {
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
			
			if(SaldoContableJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.saldocontableSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,SaldoContableConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.saldocontableSessionBean.getEsGuardarRelacionado(),this.saldocontableSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,SaldoContableConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.saldocontableSessionBean.getEsGuardarRelacionado(),this.saldocontableSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoSaldoContable=false;
			this.isVisibilidadCeldaDuplicarSaldoContable=true;
			this.isVisibilidadCeldaCopiarSaldoContable=true;
			this.isVisibilidadCeldaVerFormSaldoContable=true;
			this.isVisibilidadCeldaOrdenSaldoContable=true;
			this.isVisibilidadCeldaNuevoRelacionesSaldoContable=false;
			this.isVisibilidadCeldaModificarSaldoContable=false;
			this.isVisibilidadCeldaActualizarSaldoContable=false;
			this.isVisibilidadCeldaEliminarSaldoContable=false;
			this.isVisibilidadCeldaCancelarSaldoContable=false;
			this.isVisibilidadCeldaGuardarSaldoContable=false;
			this.isVisibilidadCeldaGuardarCambiosSaldoContable=false;
			
			
			this.isVisibilidadFK_IdAnio=true;
			this.isVisibilidadFK_IdCuentaContable=true;
			this.isVisibilidadFK_IdEjercicio=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdMes=true;
			this.isVisibilidadFK_IdPeriodo=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesSaldoContable("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosSaldoContable();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioSaldoContable(false);
			
			this.setPermisosUsuarioSaldoContable();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.saldocontableSessionBean.getEsGuardarRelacionado() 
				|| (this.saldocontableSessionBean.getEsGuardarRelacionado() && this.saldocontableSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioSaldoContableClasesRelacionadas();
			}
			
			if(this.saldocontableSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioSaldoContableClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!SaldoContableJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosSaldoContable();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualSaldoContable();
			}
			
			if(!this.isPermisoBusquedaSaldoContable) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasSaldoContable.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.saldocontableSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioSaldoContable,this.isPermisoPaginacionMedioSaldoContable,this.isPermisoPaginacionTodoSaldoContable);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(SaldoContableConstantesFunciones.getTiposSeleccionarSaldoContable());
				
				this.tiposColumnasSelect=SaldoContableConstantesFunciones.getTiposSeleccionarSaldoContable(true);
				
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
			//if(!this.saldocontableSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioSaldoContable();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioSaldoContable(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioSaldoContable(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesSaldoContable() ;
			
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
			this.anioLogic=new AnioLogic();
			this.mesLogic=new MesLogic();
			this.cuentacontableLogic=new CuentaContableLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				saldocontableImplementable= (SaldoContableImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+SaldoContableConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				saldocontableImplementableHome= (SaldoContableImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+SaldoContableConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.saldocontables= new ArrayList<SaldoContable>();
			this.saldocontablesEliminados= new ArrayList<SaldoContable>();
						
			this.isEsNuevoSaldoContable=false;
			this.esParaAccionDesdeFormularioSaldoContable=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idCuentaContableActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>() ;
			this.periodosForeignKey=new ArrayList<Periodo>() ;
			this.aniosForeignKey=new ArrayList<Anio>() ;
			this.messForeignKey=new ArrayList<Mes>() ;
			this.cuentacontablesForeignKey=new ArrayList<CuentaContable>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeySaldoContable(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroSaldoContable();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.saldocontableSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			SaldoContableBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=SaldoContableConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesSaldoContable("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingSaldoContable(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormSaldoContable!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioSaldoContable();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioSaldoContable();
			}
			
			SaldoContableBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasSaldoContable.getTabCount(); i++) {
					this.jTabbedPaneBusquedasSaldoContable.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasSaldoContable.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontableLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessSaldoContable(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga SaldoContable: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontableLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontableLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectSaldoContable() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesSaldoContable")) {
				iIndex=this.jInternalFrameDetalleFormSaldoContable.jTabbedPaneRelacionesSaldoContable.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormSaldoContable.jTabbedPaneRelacionesSaldoContable.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosSaldoContable.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessSaldoContable();	
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
	
	public void cargarCombosForeignKeySaldoContable(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeySaldoContable(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeySaldoContable(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeySaldoContableListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeySaldoContable();
		
		this.cargarCombosFrameForeignKeySaldoContable();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeySaldoContable();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeySaldoContable();
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

	public void cargarCombosForeignKeyCuentaContable(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyCuentaContableListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCuentaContable();
				this.cargarCombosFrameCuentaContablesForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCuentaContable(this.cuentacontablesForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoSaldoContableActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.saldocontableSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormSaldoContable==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			SaldoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.saldocontable,new Object(),this.saldocontableParameterGeneral,this.saldocontableReturnGeneral);
			
			
			if(jTableDatosSaldoContable.getRowCount()>=1) {
				jTableDatosSaldoContable.removeRowSelectionInterval(0, jTableDatosSaldoContable.getRowCount()-1);						
			}
			
			this.isEsNuevoSaldoContable=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoSaldoContable(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesSaldoContable(true);			
			//this.saldocontable=new SaldoContable();
			//this.saldocontable.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesSaldoContable(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSaldoContable() ;
			
			if(SaldoContableJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleSaldoContable(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.saldocontable);	
			this.actualizarInformacion("INFO_PADRE",false,this.saldocontable);				
			
			SaldoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.saldocontable,new Object(),this.saldocontableParameterGeneral,this.saldocontableReturnGeneral);
			
			if(this.saldocontableSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar SaldoContable: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			SaldoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.saldocontable,new Object(),this.saldocontableParameterGeneral,this.saldocontableReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarSaldoContableActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<SaldoContable> saldocontablesSeleccionados=new ArrayList<SaldoContable>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosSaldoContable.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosSaldoContable.getSelectedRows().length;			
			}
			
			saldocontablesSeleccionados=this.getSaldoContablesSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoSaldoContable--;			
				//SaldoContable saldocontableAux= new SaldoContable();			
				//saldocontableAux.setId(this.iIdNuevoSaldoContable);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//SaldoContable saldocontableOrigen=new SaldoContable();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(SaldoContable saldocontableOrigen : saldocontablesSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosSaldoContable.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							saldocontableOrigen =(SaldoContable) this.saldocontableLogic.getSaldoContables().toArray()[this.jTableDatosSaldoContable.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							saldocontableOrigen =(SaldoContable) this.saldocontables.toArray()[this.jTableDatosSaldoContable.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaSaldoContable();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.saldocontable.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosSaldoContable(saldocontableOrigen,this.saldocontable,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysSaldoContable(this.saldocontable);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.saldocontableLogic.getSaldoContables().add(this.saldocontableAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.saldocontables.add(this.saldocontableAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaSaldoContable(false);
				
				this.jTableDatosSaldoContable.setRowSelectionInterval(this.getIndiceNuevoSaldoContable(), this.getIndiceNuevoSaldoContable());
				
				int iLastRow =  this.jTableDatosSaldoContable.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosSaldoContable.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosSaldoContable.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaSaldoContable(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarSaldoContableActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<SaldoContable> saldocontablesSeleccionados=new ArrayList<SaldoContable>();									
		
			SaldoContable saldocontableOrigen=new SaldoContable();
			SaldoContable saldocontableDestino=new SaldoContable();
				
			saldocontablesSeleccionados=this.getSaldoContablesSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosSaldoContable.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || saldocontablesSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosSaldoContable.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						saldocontableOrigen =(SaldoContable) this.saldocontableLogic.getSaldoContables().toArray()[this.jTableDatosSaldoContable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						saldocontableOrigen =(SaldoContable) this.saldocontables.toArray()[this.jTableDatosSaldoContable.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						saldocontableDestino =(SaldoContable) this.saldocontableLogic.getSaldoContables().toArray()[this.jTableDatosSaldoContable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						saldocontableDestino =(SaldoContable) this.saldocontables.toArray()[this.jTableDatosSaldoContable.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				saldocontableOrigen =saldocontablesSeleccionados.get(0);
				saldocontableDestino =saldocontablesSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosSaldoContable(saldocontableOrigen,saldocontableDestino,true,false);
				
				saldocontableDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(saldocontableDestino,saldocontableLogic.getSaldoContables());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(saldocontableDestino,saldocontables);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaSaldoContable(false);
				
				//this.jTableDatosSaldoContable.setRowSelectionInterval(this.getIndiceNuevoSaldoContable(), this.getIndiceNuevoSaldoContable());
				
				int iLastRow =  this.jTableDatosSaldoContable.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosSaldoContable.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosSaldoContable.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaSaldoContable(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormSaldoContableActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormSaldoContable==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormSaldoContable.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarSaldoContableActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesSaldoContable.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasSaldoContable.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesSaldoContable.setVisible(!isVisible);
			this.jPanelPaginacionSaldoContable.setVisible(!isVisible);
			this.jPanelAccionesSaldoContable.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarSaldoContableActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameSaldoContable();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoSaldoContableActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoSaldoContable();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionSaldoContableActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionSaldoContable();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderBySaldoContableActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderBySaldoContable();
			
			this.abrirFrameOrderBySaldoContable();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderBySaldoContableActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderBySaldoContable();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleSaldoContable(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormSaldoContable);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormSaldoContable.isMaximum()) {
					this.jInternalFrameDetalleFormSaldoContable.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormSaldoContable.setSize(this.jInternalFrameDetalleFormSaldoContable.iWidthFormulario,this.jInternalFrameDetalleFormSaldoContable.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormSaldoContable.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormSaldoContable.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormSaldoContable.isMaximum()) {
						this.jInternalFrameDetalleFormSaldoContable.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormSaldoContable.jContentPaneDetalleSaldoContable.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormSaldoContable.jTabbedPaneRelacionesSaldoContable.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormSaldoContable.jContentPaneDetalleSaldoContable.getWidth(),SaldoContableConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormSaldoContable.jTabbedPaneRelacionesSaldoContable.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormSaldoContable.jContentPaneDetalleSaldoContable.getWidth(),SaldoContableConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormSaldoContable.jTabbedPaneRelacionesSaldoContable.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormSaldoContable.jContentPaneDetalleSaldoContable.getWidth(),SaldoContableConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormSaldoContable.setVisible(true);
	        this.jInternalFrameDetalleFormSaldoContable.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderBySaldoContable() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderBySaldoContable==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderBySaldoContable=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySaldoContable,false,this);
				} else {
					this.jInternalFrameOrderBySaldoContable=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySaldoContable,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderBySaldoContable);
				this.jInternalFrameOrderBySaldoContable.setVisible(false);
				this.jInternalFrameOrderBySaldoContable.setSelected(false);
				
				this.jInternalFrameOrderBySaldoContable.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderBySaldoContable"));
				
				this.inicializarActualizarBindingTablaOrderBySaldoContable();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionSaldoContable() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionSaldoContable==null) {
				
				this.jInternalFrameImportacionSaldoContable=new ImportacionJInternalFrame(SaldoContableConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionSaldoContable);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionSaldoContable);
				this.jInternalFrameImportacionSaldoContable.setVisible(false);
				this.jInternalFrameImportacionSaldoContable.setSelected(false);


				this.jInternalFrameImportacionSaldoContable.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionSaldoContable"));
				this.jInternalFrameImportacionSaldoContable.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionSaldoContable"));
				this.jInternalFrameImportacionSaldoContable.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionSaldoContable"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoSaldoContable() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoSaldoContable==null) {
				this.jInternalFrameReporteDinamicoSaldoContable=new ReporteDinamicoJInternalFrame(SaldoContableConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoSaldoContable);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoSaldoContable);
				this.jInternalFrameReporteDinamicoSaldoContable.setVisible(false);
				this.jInternalFrameReporteDinamicoSaldoContable.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoSaldoContable.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoSaldoContable"));
				this.jInternalFrameReporteDinamicoSaldoContable.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoSaldoContable"));
				this.jInternalFrameReporteDinamicoSaldoContable.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoSaldoContable"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualSaldoContable();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleSaldoContable() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormSaldoContable);
			
	       	this.jInternalFrameDetalleFormSaldoContable.setVisible(false);
	        this.jInternalFrameDetalleFormSaldoContable.setSelected(false);
			
			//this.jInternalFrameDetalleFormSaldoContable.dispose();
			//this.jInternalFrameDetalleFormSaldoContable=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoSaldoContable() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoSaldoContable.setVisible(true);
	        this.jInternalFrameReporteDinamicoSaldoContable.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionSaldoContable() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionSaldoContable.setVisible(true);
	        this.jInternalFrameImportacionSaldoContable.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderBySaldoContable() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderBySaldoContable.setVisible(true);
	        this.jInternalFrameOrderBySaldoContable.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderBySaldoContable() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderBySaldoContable.setVisible(false);
	        this.jInternalFrameOrderBySaldoContable.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoSaldoContable() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoSaldoContable.setVisible(false);
	        this.jInternalFrameReporteDinamicoSaldoContable.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionSaldoContable() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionSaldoContable.setVisible(false);
	        this.jInternalFrameImportacionSaldoContable.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	

				public void abrirFrameTreeCuentaContable(String sTipoProceso) { //throws Exception
					try {
						//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
						//this.jDesktopPane.add(jInternalFrameTreeCuentaContable);
						CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
						cuentacontableBeanSwingJInternalFrame.setJInternalFrameParent(this);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setsTipoProceso(sTipoProceso);

						if(sTipoProceso.equals("BUSQUEDA_FK")) {
							cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.sTipoBusqueda="CuentaContable";
						}

						cuentacontableBeanSwingJInternalFrame.getTodosCuentaContableArbol();
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setCuentaContables(cuentacontableBeanSwingJInternalFrame.cuentacontablesArbol);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.CargarTreeCuentaContable();
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setVisible(true);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setSelected(true);

						//SE CAMBIA PARENT ORIGINAL PARA QUE RETORNE EN ESTE FORMULARIO
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.jInternalFrameParent=this;
						TitledBorder titledBorderSaldoContable=(TitledBorder)this.jScrollPanelDatosSaldoContable.getBorder();
						TitledBorder titledBorderCuentaContable=(TitledBorder)cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

						titledBorderCuentaContable.setTitle(titledBorderSaldoContable.getTitle() + " -> Cuenta Contable");


						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,cuentacontableBeanSwingJInternalFrame);
						}
						this.jDesktopPane.add(cuentacontableBeanSwingJInternalFrame);

					} catch (Exception e) {
						e.getStackTrace();
						//Funciones<%=getFrameworkDomain()%>.manageException(this, e,logger,<%=GetNombreClaseC(TablaBase.ToString())%>ConstantesFunciones.CLASSNAME);
					}
				}

				public void cerrarFrameTreeCuentaContable(CuentaContableBeanSwingJInternalFrame jInternalFrameTreeCuentaContable) throws Exception {
					try {
						//jDesktopPane.add(jInternalFrameTreeCuentaContable);
						jInternalFrameTreeCuentaContable.setVisible(false);
						jInternalFrameTreeCuentaContable.setSelected(false);
						//jInternalFrameTreeCuentaContable.dispose();
						//jInternalFrameTreeCuentaContable=null;
					} catch (final java.beans.PropertyVetoException e) {
						FuncionesSwing.manageException(this, e,logger);
					}
				}
	
	public void jButtonModificarSaldoContableActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarSaldoContable(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarSaldoContable(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosSaldoContable.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesSaldoContable(true);
			//this.isEsNuevoSaldoContable=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontable =(SaldoContable) this.saldocontableLogic.getSaldoContables().toArray()[this.jTableDatosSaldoContable.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.saldocontable =(SaldoContable) this.saldocontables.toArray()[this.jTableDatosSaldoContable.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesSaldoContable("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesSaldoContable(false) ;
			
			if(saldocontableSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(SaldoContableJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleSaldoContable(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSaldoContable(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaSaldoContableActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosSaldoContable.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldocontable =(SaldoContable) this.saldocontableLogic.getSaldoContables().toArray()[this.jTableDatosSaldoContable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.saldocontable =(SaldoContable) this.saldocontables.toArray()[this.jTableDatosSaldoContable.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarSaldoContable(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormSaldoContable==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosSaldoContable.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesSaldoContable(true);
			//this.isEsNuevoSaldoContable=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontable =(SaldoContable) this.saldocontableLogic.getSaldoContables().toArray()[this.jTableDatosSaldoContable.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.saldocontable =(SaldoContable) this.saldocontables.toArray()[this.jTableDatosSaldoContable.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.saldocontable.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesSaldoContable("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesSaldoContable(false) ;
			
			if(SaldoContableJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleSaldoContable(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSaldoContable(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("CuentaContable")) {
				if(!this.saldocontableConstantesFunciones.cargarid_cuenta_contableSaldoContable) {
					this.cargarCombosCuentaContablesForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingSaldoContable(false,false);
					this.cargarCombosFrameCuentaContablesForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_cuenta_contable (id);

				this.recargarComboTablaCuentaContable(this.cuentacontablesForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
					
	
	public void recargarComboTablaAnio(List<Anio> aniosForeignKey)throws Exception{
		TableColumn tableColumnAnio=this.jTableDatosSaldoContable.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSaldoContable,SaldoContableConstantesFunciones.LABEL_IDANIO));
		TableCellEditor tableCellEditorAnio =tableColumnAnio.getCellEditor();

		AnioTableCell anioTableCellFk=(AnioTableCell)tableCellEditorAnio;

		if(anioTableCellFk!=null) {
			anioTableCellFk.setaniosForeignKey(aniosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosSaldoContable.getSelectedRow();

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
		TableColumn tableColumnMes=this.jTableDatosSaldoContable.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSaldoContable,SaldoContableConstantesFunciones.LABEL_IDMES));
		TableCellEditor tableCellEditorMes =tableColumnMes.getCellEditor();

		MesTableCell mesTableCellFk=(MesTableCell)tableCellEditorMes;

		if(mesTableCellFk!=null) {
			mesTableCellFk.setmessForeignKey(messForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosSaldoContable.getSelectedRow();

		//if(intSelectedRow<=0) {
			//mesTableCellFk.setRowActual(intSelectedRow);
			//mesTableCellFk.setmessForeignKeyActual(messForeignKey);
		//}


		if(mesTableCellFk!=null) {
			mesTableCellFk.RecargarMessForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaCuentaContable(List<CuentaContable> cuentacontablesForeignKey)throws Exception{
		TableColumn tableColumnCuentaContable=this.jTableDatosSaldoContable.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSaldoContable,SaldoContableConstantesFunciones.LABEL_IDCUENTACONTABLE));
		TableCellEditor tableCellEditorCuentaContable =tableColumnCuentaContable.getCellEditor();

		CuentaContableTableCell cuentacontableTableCellFk=(CuentaContableTableCell)tableCellEditorCuentaContable;

		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.setcuentacontablesForeignKey(cuentacontablesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosSaldoContable.getSelectedRow();

		//if(intSelectedRow<=0) {
			//cuentacontableTableCellFk.setRowActual(intSelectedRow);
			//cuentacontableTableCellFk.setcuentacontablesForeignKeyActual(cuentacontablesForeignKey);
		//}


		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.RecargarCuentaContablesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_cuenta_contable (Long id) throws Exception {
		this.setActualCuentaContableForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarSaldoContableActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontableLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesSaldoContable(false);
			
			//if(!this.isEsNuevoSaldoContable) {								
				int intSelectedRow = this.jTableDatosSaldoContable.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldocontable =(SaldoContable) this.saldocontableLogic.getSaldoContables().toArray()[this.jTableDatosSaldoContable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.saldocontable =(SaldoContable) this.saldocontables.toArray()[this.jTableDatosSaldoContable.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(SaldoContableJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualSaldoContable(this.saldocontable,true);
				this.setVariablesFormularioToObjetoActualForeignKeysSaldoContable(this.saldocontable);
				
			}
			
			if(this.permiteMantenimiento(this.saldocontable)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.saldocontableSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoSaldoContable=true;
					this.inicializarActualizarBindingTablaSaldoContable(false);
					this.isEsNuevoSaldoContable=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoSaldoContable=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoSaldoContable=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesSaldoContable(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualSaldoContable(false);
				
				this.habilitarDeshabilitarControlesSaldoContable(false);
			
												
				
				if(SaldoContableJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleSaldoContable();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoSaldoContableActionPerformed(evt,saldocontableSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualSaldoContable(this.saldocontable,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosSaldoContable.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,saldocontableSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontableLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.saldocontable.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(SaldoContable.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SaldoContable.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontableLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontableLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarSaldoContableActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontableLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosSaldoContable.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontable =(SaldoContable) this.saldocontableLogic.getSaldoContables().toArray()[this.jTableDatosSaldoContable.convertRowIndexToModel(intSelectedRow)];
				this.saldocontable.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.saldocontable =(SaldoContable) this.saldocontables.toArray()[this.jTableDatosSaldoContable.convertRowIndexToModel(intSelectedRow)];
				this.saldocontable.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.saldocontable)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.saldocontableSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((SaldoContableModel) this.jTableDatosSaldoContable.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoSaldoContable=true;
				this.inicializarActualizarBindingTablaSaldoContable(false);
				this.isEsNuevoSaldoContable=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesSaldoContable(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualSaldoContable(false);
				
				this.habilitarDeshabilitarControlesSaldoContable(false);
				
				
				
				if(SaldoContableJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleSaldoContable();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontableLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontableLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontableLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarSaldoContableActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosSaldoContable.getRowCount()>=1) {
				jTableDatosSaldoContable.removeRowSelectionInterval(0, jTableDatosSaldoContable.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesSaldoContable(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaSaldoContable(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesSaldoContable(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSaldoContable(false) ;
			
			this.isEsNuevoSaldoContable=false;
			
			if(SaldoContableJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleSaldoContable();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosSaldoContableActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontableLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingSaldoContable(false);
				
				//SI ES MANUAL
				if(SaldoContableJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualSaldoContable();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontableLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontableLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontableLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosSaldoContableActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoSaldoContable--;			
			//SaldoContable saldocontableAux= new SaldoContable();			
			//saldocontableAux.setId(this.iIdNuevoSaldoContable);
			
			if(this.jInternalFrameDetalleFormSaldoContable==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaSaldoContable();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysSaldoContable(this.saldocontable);
			
			this.saldocontable.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.saldocontableLogic.getSaldoContables().add(this.saldocontableAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.saldocontables.add(this.saldocontableAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaSaldoContable(false);
			
			this.jTableDatosSaldoContable.setRowSelectionInterval(this.getIndiceNuevoSaldoContable(), this.getIndiceNuevoSaldoContable());
			
			int iLastRow =  this.jTableDatosSaldoContable.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosSaldoContable.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosSaldoContable.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaSaldoContable(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionSaldoContableActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontableLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingSaldoContable(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSaldoContable(false);
			
			//SI ES MANUAL
			if(SaldoContableJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualSaldoContable();
			}
			
			//this.abrirFrameTreeSaldoContable();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontableLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontableLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontableLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionSaldoContableActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Saldo ContableS ?", "MANTENIMIENTO DE Saldo Contable", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionSaldoContable.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralSaldoContable();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.saldocontableReturnGeneral=saldocontableLogic.procesarImportacionSaldoContablesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.saldocontableParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarSaldoContableReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionSaldoContableActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionSaldoContable.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionSaldoContable.setFileImportacion(this.jInternalFrameImportacionSaldoContable.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionSaldoContable.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionSaldoContable.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionSaldoContable.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionSaldoContable.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoSaldoContableActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<SaldoContable> saldocontablesSeleccionados=new ArrayList<SaldoContable>();		

		saldocontablesSeleccionados=this.getSaldoContablesSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSaldoContable.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSaldoContable.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("SaldoContableBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"SaldoContableBaseDesign.jrxml";
			
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
			
			this.generarReporteSaldoContables("Todos",saldocontablesSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.saldocontableSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Saldo Contable",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoSaldoContable.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSaldoContable.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case SaldoContableConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SaldoContableConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SaldoContableConstantesFunciones.LABEL_IDEJERCICIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Ejercicio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Ejercicio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Ejercicio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Ejercicio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SaldoContableConstantesFunciones.LABEL_IDPERIODO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Periodo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Periodo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Periodo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Periodo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SaldoContableConstantesFunciones.LABEL_IDANIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Anio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Anio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Anio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Anio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SaldoContableConstantesFunciones.LABEL_IDMES:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Mes_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Mes_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Mes_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Mes_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SaldoContableConstantesFunciones.LABEL_IDCUENTACONTABLE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_CuentaContable_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_CuentaContable_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_CuentaContable_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_CuentaContable_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SaldoContableConstantesFunciones.LABEL_DEBITOMONELOCAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_bitoMoneLocal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_bitoMoneLocal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_bitoMoneLocal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_bitoMoneLocal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SaldoContableConstantesFunciones.LABEL_CREDITOMONELOCAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_editoMoneLocal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_editoMoneLocal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_editoMoneLocal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_editoMoneLocal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SaldoContableConstantesFunciones.LABEL_SALDOMONELOCAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ldoMoneLocal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ldoMoneLocal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ldoMoneLocal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ldoMoneLocal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SaldoContableConstantesFunciones.LABEL_DEBITOMONEEXTRA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_bitoMoneExtra_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_bitoMoneExtra_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_bitoMoneExtra_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_bitoMoneExtra_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SaldoContableConstantesFunciones.LABEL_CREDITOMONEEXTRA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_editoMoneExtra_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_editoMoneExtra_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_editoMoneExtra_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_editoMoneExtra_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SaldoContableConstantesFunciones.LABEL_SALDOMONEEXTRA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ldoMoneExtra_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ldoMoneExtra_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ldoMoneExtra_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ldoMoneExtra_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoSaldoContable.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoSaldoContable.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoSaldoContable.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case SaldoContableConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case SaldoContableConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case SaldoContableConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoria="id_ejercicio";
					break;

				case SaldoContableConstantesFunciones.LABEL_IDPERIODO:
					sNombreCampoCategoria="id_periodo";
					break;

				case SaldoContableConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoria="id_anio";
					break;

				case SaldoContableConstantesFunciones.LABEL_IDMES:
					sNombreCampoCategoria="id_mes";
					break;

				case SaldoContableConstantesFunciones.LABEL_IDCUENTACONTABLE:
					sNombreCampoCategoria="id_cuenta_contable";
					break;

				case SaldoContableConstantesFunciones.LABEL_DEBITOMONELOCAL:
					sNombreCampoCategoria="debito_mone_local";
					break;

				case SaldoContableConstantesFunciones.LABEL_CREDITOMONELOCAL:
					sNombreCampoCategoria="credito_mone_local";
					break;

				case SaldoContableConstantesFunciones.LABEL_SALDOMONELOCAL:
					sNombreCampoCategoria="saldo_mone_local";
					break;

				case SaldoContableConstantesFunciones.LABEL_DEBITOMONEEXTRA:
					sNombreCampoCategoria="debito_mone_extra";
					break;

				case SaldoContableConstantesFunciones.LABEL_CREDITOMONEEXTRA:
					sNombreCampoCategoria="credito_mone_extra";
					break;

				case SaldoContableConstantesFunciones.LABEL_SALDOMONEEXTRA:
					sNombreCampoCategoria="saldo_mone_extra";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoSaldoContable.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case SaldoContableConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case SaldoContableConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case SaldoContableConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoriaValor="id_ejercicio";
					break;

				case SaldoContableConstantesFunciones.LABEL_IDPERIODO:
					sNombreCampoCategoriaValor="id_periodo";
					break;

				case SaldoContableConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoriaValor="id_anio";
					break;

				case SaldoContableConstantesFunciones.LABEL_IDMES:
					sNombreCampoCategoriaValor="id_mes";
					break;

				case SaldoContableConstantesFunciones.LABEL_IDCUENTACONTABLE:
					sNombreCampoCategoriaValor="id_cuenta_contable";
					break;

				case SaldoContableConstantesFunciones.LABEL_DEBITOMONELOCAL:
					sNombreCampoCategoriaValor="debito_mone_local";
					break;

				case SaldoContableConstantesFunciones.LABEL_CREDITOMONELOCAL:
					sNombreCampoCategoriaValor="credito_mone_local";
					break;

				case SaldoContableConstantesFunciones.LABEL_SALDOMONELOCAL:
					sNombreCampoCategoriaValor="saldo_mone_local";
					break;

				case SaldoContableConstantesFunciones.LABEL_DEBITOMONEEXTRA:
					sNombreCampoCategoriaValor="debito_mone_extra";
					break;

				case SaldoContableConstantesFunciones.LABEL_CREDITOMONEEXTRA:
					sNombreCampoCategoriaValor="credito_mone_extra";
					break;

				case SaldoContableConstantesFunciones.LABEL_SALDOMONEEXTRA:
					sNombreCampoCategoriaValor="saldo_mone_extra";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoSaldoContable.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSaldoContable.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case SaldoContableConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case SaldoContableConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case SaldoContableConstantesFunciones.LABEL_IDEJERCICIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ejercicio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_ejercicio");
					break;

				case SaldoContableConstantesFunciones.LABEL_IDPERIODO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Periodo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_periodo");
					break;

				case SaldoContableConstantesFunciones.LABEL_IDANIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Anio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_anio");
					break;

				case SaldoContableConstantesFunciones.LABEL_IDMES:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Mes",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_mes");
					break;

				case SaldoContableConstantesFunciones.LABEL_IDCUENTACONTABLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cuenta Contable",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cuenta_contable");
					break;

				case SaldoContableConstantesFunciones.LABEL_DEBITOMONELOCAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Debito Moneda Local",sNombreCampoCategoria,sNombreCampoCategoriaValor,"debito_mone_local");
					break;

				case SaldoContableConstantesFunciones.LABEL_CREDITOMONELOCAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Credito Moneda Local",sNombreCampoCategoria,sNombreCampoCategoriaValor,"credito_mone_local");
					break;

				case SaldoContableConstantesFunciones.LABEL_SALDOMONELOCAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Saldo Moneda Local",sNombreCampoCategoria,sNombreCampoCategoriaValor,"saldo_mone_local");
					break;

				case SaldoContableConstantesFunciones.LABEL_DEBITOMONEEXTRA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Debito Moneda Extranjera",sNombreCampoCategoria,sNombreCampoCategoriaValor,"debito_mone_extra");
					break;

				case SaldoContableConstantesFunciones.LABEL_CREDITOMONEEXTRA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Credito Moneda Extrajera",sNombreCampoCategoria,sNombreCampoCategoriaValor,"credito_mone_extra");
					break;

				case SaldoContableConstantesFunciones.LABEL_SALDOMONEEXTRA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Saldo Moneda Extrajera",sNombreCampoCategoria,sNombreCampoCategoriaValor,"saldo_mone_extra");
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
	
	public void jButtonGenerarExcelReporteDinamicoSaldoContableActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<SaldoContable> saldocontablesSeleccionados=new ArrayList<SaldoContable>();		
		
		saldocontablesSeleccionados=this.getSaldoContablesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"saldocontable";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("SaldoContables");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoSaldoContable.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoSaldoContable.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case SaldoContableConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SaldoContableConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(SaldoContable saldocontable:saldocontablesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(saldocontable.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SaldoContableConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SaldoContableConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(SaldoContable saldocontable:saldocontablesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(saldocontable.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SaldoContableConstantesFunciones.LABEL_IDEJERCICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SaldoContableConstantesFunciones.LABEL_IDEJERCICIO);
					iRow++;

					for(SaldoContable saldocontable:saldocontablesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(saldocontable.getejercicio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SaldoContableConstantesFunciones.LABEL_IDPERIODO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SaldoContableConstantesFunciones.LABEL_IDPERIODO);
					iRow++;

					for(SaldoContable saldocontable:saldocontablesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(saldocontable.getperiodo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SaldoContableConstantesFunciones.LABEL_IDANIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SaldoContableConstantesFunciones.LABEL_IDANIO);
					iRow++;

					for(SaldoContable saldocontable:saldocontablesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(saldocontable.getanio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SaldoContableConstantesFunciones.LABEL_IDMES:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SaldoContableConstantesFunciones.LABEL_IDMES);
					iRow++;

					for(SaldoContable saldocontable:saldocontablesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(saldocontable.getmes_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SaldoContableConstantesFunciones.LABEL_IDCUENTACONTABLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SaldoContableConstantesFunciones.LABEL_IDCUENTACONTABLE);
					iRow++;

					for(SaldoContable saldocontable:saldocontablesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(saldocontable.getcuentacontable_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SaldoContableConstantesFunciones.LABEL_DEBITOMONELOCAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SaldoContableConstantesFunciones.LABEL_DEBITOMONELOCAL);
					iRow++;

					for(SaldoContable saldocontable:saldocontablesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(saldocontable.getdebito_mone_local());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SaldoContableConstantesFunciones.LABEL_CREDITOMONELOCAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SaldoContableConstantesFunciones.LABEL_CREDITOMONELOCAL);
					iRow++;

					for(SaldoContable saldocontable:saldocontablesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(saldocontable.getcredito_mone_local());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SaldoContableConstantesFunciones.LABEL_SALDOMONELOCAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SaldoContableConstantesFunciones.LABEL_SALDOMONELOCAL);
					iRow++;

					for(SaldoContable saldocontable:saldocontablesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(saldocontable.getsaldo_mone_local());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SaldoContableConstantesFunciones.LABEL_DEBITOMONEEXTRA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SaldoContableConstantesFunciones.LABEL_DEBITOMONEEXTRA);
					iRow++;

					for(SaldoContable saldocontable:saldocontablesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(saldocontable.getdebito_mone_extra());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SaldoContableConstantesFunciones.LABEL_CREDITOMONEEXTRA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SaldoContableConstantesFunciones.LABEL_CREDITOMONEEXTRA);
					iRow++;

					for(SaldoContable saldocontable:saldocontablesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(saldocontable.getcredito_mone_extra());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SaldoContableConstantesFunciones.LABEL_SALDOMONEEXTRA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SaldoContableConstantesFunciones.LABEL_SALDOMONEEXTRA);
					iRow++;

					for(SaldoContable saldocontable:saldocontablesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(saldocontable.getsaldo_mone_extra());
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
			//	this.getFilaCabeceraExportarExcelSaldoContable(row);				
			//	iRow++;
			//}				
			
			//for(SaldoContable saldocontableAux:saldocontablesSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelSaldoContable(saldocontableAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.saldocontableSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Saldo Contable",JOptionPane.INFORMATION_MESSAGE);
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
				this.saldocontableLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSaldoContable(false);
			
			//SI ES MANUAL
			if(SaldoContableJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualSaldoContable();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontableLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontableLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontableLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresSaldoContableActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontableLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSaldoContable(false);
			
			//SI ES MANUAL
			if(SaldoContableJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualSaldoContable();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontableLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontableLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontableLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesSaldoContableActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontableLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSaldoContable(false);
			
			//SI ES MANUAL
			if(SaldoContableJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualSaldoContable();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontableLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontableLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontableLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaSaldoContable() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosSaldoContable.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosSaldoContable.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosSaldoContable.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosSaldoContable.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosSaldoContable.setMinimumSize(dimensionMinimum);
		this.jTableDatosSaldoContable.setMaximumSize(dimensionMaximum);
		this.jTableDatosSaldoContable.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingSaldoContable(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingSaldoContable(esInicializar,true);
	}
	
	public void inicializarActualizarBindingSaldoContable(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaSaldoContable(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesSaldoContable(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.saldocontableSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasSaldoContable(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesSaldoContable(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesSaldoContable(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !SaldoContableJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!SaldoContableJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualSaldoContable() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaSaldoContable();
		
		this.inicializarActualizarBindingBotonesManualSaldoContable(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.saldocontableSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualSaldoContable();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesSaldoContable() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualSaldoContable(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualSaldoContable(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosSaldoContable.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosSaldoContable.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteSaldoContable.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormSaldoContable!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormSaldoContable.jCheckBoxPostAccionNuevoSaldoContable.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormSaldoContable.jCheckBoxPostAccionSinCerrarSaldoContable.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormSaldoContable.jCheckBoxPostAccionSinMensajeSaldoContable.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosSaldoContable.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosSaldoContable.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteSaldoContable.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormSaldoContable!=null) {
				this.jInternalFrameDetalleFormSaldoContable.jCheckBoxPostAccionNuevoSaldoContable.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormSaldoContable.jCheckBoxPostAccionSinCerrarSaldoContable.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormSaldoContable.jCheckBoxPostAccionSinMensajeSaldoContable.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionSaldoContable.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionSaldoContable.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormSaldoContable!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormSaldoContable.jComboBoxTiposAccionesFormularioSaldoContable.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesSaldoContable.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoSaldoContable!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSaldoContable.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesSaldoContable.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesSaldoContable.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarSaldoContable.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesSaldoContable.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoSaldoContable!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSaldoContable.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesSaldoContable.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralSaldoContable.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesSaldoContable(Boolean esInicializar) throws Exception {
		try	{	
			if(SaldoContableJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualSaldoContable(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesSaldoContable() throws Exception {
		try	{
			if(SaldoContableJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualSaldoContable();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleSaldoContable() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormSaldoContable.jComboBoxTiposAccionesFormularioSaldoContable.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormSaldoContable.jComboBoxTiposAccionesFormularioSaldoContable.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualSaldoContable() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesSaldoContable.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesSaldoContable.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesSaldoContable.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesSaldoContable.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesSaldoContable.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesSaldoContable.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionSaldoContable.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionSaldoContable.addItem(reporte);
			}
			
			
			if(!this.saldocontableSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionSaldoContable.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionSaldoContable.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesSaldoContable.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesSaldoContable.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesSaldoContable.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesSaldoContable.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormSaldoContable!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormSaldoContable.jComboBoxTiposAccionesFormularioSaldoContable.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormSaldoContable.jComboBoxTiposAccionesFormularioSaldoContable.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarSaldoContable.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarSaldoContable.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarSaldoContable.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualSaldoContable();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualSaldoContable() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoSaldoContable!=null) {
				this.jInternalFrameReporteDinamicoSaldoContable.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoSaldoContable.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoSaldoContable!=null) {
				this.jInternalFrameReporteDinamicoSaldoContable.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoSaldoContable.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoSaldoContable!=null) {
				
				if(this.jInternalFrameReporteDinamicoSaldoContable.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoSaldoContable.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoSaldoContable.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoSaldoContable.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoSaldoContable.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoSaldoContable.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoSaldoContable.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoSaldoContable.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=SaldoContableConstantesFunciones.getTiposSeleccionarSaldoContable(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoSaldoContable.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoSaldoContable.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoSaldoContable.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=SaldoContableConstantesFunciones.getTiposSeleccionarSaldoContable(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoSaldoContable.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoSaldoContable.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoSaldoContable.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=SaldoContableConstantesFunciones.getTiposSeleccionarSaldoContable(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoSaldoContable.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoSaldoContable.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoSaldoContable.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoSaldoContable.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualSaldoContable()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_cuenta_contableFK_IdCuentaContableSaldoContable.getSelectedItem()!=null){this.id_cuenta_contableFK_IdCuentaContable=((CuentaContable)this.jComboBoxid_cuenta_contableFK_IdCuentaContableSaldoContable.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasSaldoContable(Boolean esInicializar) throws Exception {				
		if(SaldoContableJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualSaldoContable();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaSaldoContable() throws Exception {
		this.inicializarActualizarBindingTablaSaldoContable(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderBySaldoContable() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderBySaldoContable.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderBySaldoContable.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderBySaldoContable.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new SaldoContablePropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderBySaldoContable.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderBySaldoContable.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new SaldoContablePropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosSaldoContableOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSaldoContableOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new SaldoContablePropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderBySaldoContable.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderBySaldoContable.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new SaldoContablePropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderBySaldoContable.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaSaldoContable(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=saldocontableLogic.getSaldoContables().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=saldocontables.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(SaldoContableJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosSaldoContable.setModel(new SaldoContableModel(this.saldocontableLogic.getSaldoContables(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosSaldoContable.setModel(new SaldoContableModel(this.saldocontables,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderBySaldoContable!=null && this.jInternalFrameOrderBySaldoContable.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderBySaldoContable();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosSaldoContable.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSaldoContable,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new SaldoContablePropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+SaldoContableConstantesFunciones.SCLASSWEBTITULO,saldocontableConstantesFunciones.resaltarSeleccionarSaldoContable,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+SaldoContableConstantesFunciones.SCLASSWEBTITULO,saldocontableConstantesFunciones.resaltarSeleccionarSaldoContable,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosSaldoContable.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSaldoContable,SaldoContableConstantesFunciones.LABEL_ID));

		if(this.saldocontableConstantesFunciones.mostraridSaldoContable && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SaldoContableConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.saldocontableConstantesFunciones.resaltaridSaldoContable,this.saldocontableConstantesFunciones.activaridSaldoContable,iSizeTabla,this,true,"idSaldoContable","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.saldocontableConstantesFunciones.resaltaridSaldoContable,this.saldocontableConstantesFunciones.activaridSaldoContable,this,true,"idSaldoContable","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSaldoContable.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSaldoContable,SaldoContableConstantesFunciones.LABEL_IDEMPRESA));

		if(this.saldocontableConstantesFunciones.mostrarid_empresaSaldoContable && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SaldoContableConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.saldocontableConstantesFunciones.resaltarid_empresaSaldoContable,this,this.saldocontableConstantesFunciones.activarid_empresaSaldoContable,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.saldocontableConstantesFunciones.resaltarid_empresaSaldoContable,this,this.saldocontableConstantesFunciones.activarid_empresaSaldoContable,false,"id_empresaSaldoContable","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SaldoContablePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSaldoContable.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSaldoContable,SaldoContableConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.saldocontableConstantesFunciones.mostrarid_sucursalSaldoContable && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SaldoContableConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.saldocontableConstantesFunciones.resaltarid_sucursalSaldoContable,this,this.saldocontableConstantesFunciones.activarid_sucursalSaldoContable,iSizeTabla));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.saldocontableConstantesFunciones.resaltarid_sucursalSaldoContable,this,this.saldocontableConstantesFunciones.activarid_sucursalSaldoContable,false,"id_sucursalSaldoContable","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SaldoContablePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSaldoContable.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSaldoContable,SaldoContableConstantesFunciones.LABEL_IDEJERCICIO));

		if(this.saldocontableConstantesFunciones.mostrarid_ejercicioSaldoContable && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SaldoContableConstantesFunciones.LABEL_IDEJERCICIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EjercicioTableCell(this.ejerciciosForeignKey,this.saldocontableConstantesFunciones.resaltarid_ejercicioSaldoContable,this,this.saldocontableConstantesFunciones.activarid_ejercicioSaldoContable,iSizeTabla));
			tableColumn.setCellEditor(new EjercicioTableCell(this.ejerciciosForeignKey,this.saldocontableConstantesFunciones.resaltarid_ejercicioSaldoContable,this,this.saldocontableConstantesFunciones.activarid_ejercicioSaldoContable,false,"id_ejercicioSaldoContable","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SaldoContablePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSaldoContable.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSaldoContable,SaldoContableConstantesFunciones.LABEL_IDPERIODO));

		if(this.saldocontableConstantesFunciones.mostrarid_periodoSaldoContable && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SaldoContableConstantesFunciones.LABEL_IDPERIODO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new PeriodoTableCell(this.periodosForeignKey,this.saldocontableConstantesFunciones.resaltarid_periodoSaldoContable,this,this.saldocontableConstantesFunciones.activarid_periodoSaldoContable,iSizeTabla));
			tableColumn.setCellEditor(new PeriodoTableCell(this.periodosForeignKey,this.saldocontableConstantesFunciones.resaltarid_periodoSaldoContable,this,this.saldocontableConstantesFunciones.activarid_periodoSaldoContable,false,"id_periodoSaldoContable","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SaldoContablePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSaldoContable.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSaldoContable,SaldoContableConstantesFunciones.LABEL_IDANIO));

		if(this.saldocontableConstantesFunciones.mostrarid_anioSaldoContable && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SaldoContableConstantesFunciones.LABEL_IDANIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new AnioTableCell(this.aniosForeignKey,this.saldocontableConstantesFunciones.resaltarid_anioSaldoContable,this,this.saldocontableConstantesFunciones.activarid_anioSaldoContable,iSizeTabla));
			tableColumn.setCellEditor(new AnioTableCell(this.aniosForeignKey,this.saldocontableConstantesFunciones.resaltarid_anioSaldoContable,this,this.saldocontableConstantesFunciones.activarid_anioSaldoContable,true,"id_anioSaldoContable","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SaldoContablePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSaldoContable.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSaldoContable,SaldoContableConstantesFunciones.LABEL_IDMES));

		if(this.saldocontableConstantesFunciones.mostrarid_mesSaldoContable && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SaldoContableConstantesFunciones.LABEL_IDMES,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new MesTableCell(this.messForeignKey,this.saldocontableConstantesFunciones.resaltarid_mesSaldoContable,this,this.saldocontableConstantesFunciones.activarid_mesSaldoContable,iSizeTabla));
			tableColumn.setCellEditor(new MesTableCell(this.messForeignKey,this.saldocontableConstantesFunciones.resaltarid_mesSaldoContable,this,this.saldocontableConstantesFunciones.activarid_mesSaldoContable,true,"id_mesSaldoContable","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SaldoContablePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSaldoContable.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSaldoContable,SaldoContableConstantesFunciones.LABEL_IDCUENTACONTABLE));

		if(this.saldocontableConstantesFunciones.mostrarid_cuenta_contableSaldoContable && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SaldoContableConstantesFunciones.LABEL_IDCUENTACONTABLE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CuentaContableTableCell(this.cuentacontablesForeignKey,this.saldocontableConstantesFunciones.resaltarid_cuenta_contableSaldoContable,this,this.saldocontableConstantesFunciones.activarid_cuenta_contableSaldoContable,iSizeTabla));
			tableColumn.setCellEditor(new CuentaContableTableCell(this.cuentacontablesForeignKey,this.saldocontableConstantesFunciones.resaltarid_cuenta_contableSaldoContable,this,this.saldocontableConstantesFunciones.activarid_cuenta_contableSaldoContable,true,"id_cuenta_contableSaldoContable","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70);
			//tableColumn.addPropertyChangeListener(new SaldoContablePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSaldoContable.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSaldoContable,SaldoContableConstantesFunciones.LABEL_DEBITOMONELOCAL));

		if(this.saldocontableConstantesFunciones.mostrardebito_mone_localSaldoContable && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SaldoContableConstantesFunciones.LABEL_DEBITOMONELOCAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.saldocontableConstantesFunciones.resaltardebito_mone_localSaldoContable,this.saldocontableConstantesFunciones.activardebito_mone_localSaldoContable,iSizeTabla,this,true,"debito_mone_localSaldoContable","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.saldocontableConstantesFunciones.resaltardebito_mone_localSaldoContable,this.saldocontableConstantesFunciones.activardebito_mone_localSaldoContable,this,true,"debito_mone_localSaldoContable","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new SaldoContablePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSaldoContable.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSaldoContable,SaldoContableConstantesFunciones.LABEL_CREDITOMONELOCAL));

		if(this.saldocontableConstantesFunciones.mostrarcredito_mone_localSaldoContable && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SaldoContableConstantesFunciones.LABEL_CREDITOMONELOCAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.saldocontableConstantesFunciones.resaltarcredito_mone_localSaldoContable,this.saldocontableConstantesFunciones.activarcredito_mone_localSaldoContable,iSizeTabla,this,true,"credito_mone_localSaldoContable","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.saldocontableConstantesFunciones.resaltarcredito_mone_localSaldoContable,this.saldocontableConstantesFunciones.activarcredito_mone_localSaldoContable,this,true,"credito_mone_localSaldoContable","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new SaldoContablePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSaldoContable.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSaldoContable,SaldoContableConstantesFunciones.LABEL_SALDOMONELOCAL));

		if(this.saldocontableConstantesFunciones.mostrarsaldo_mone_localSaldoContable && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SaldoContableConstantesFunciones.LABEL_SALDOMONELOCAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.saldocontableConstantesFunciones.resaltarsaldo_mone_localSaldoContable,this.saldocontableConstantesFunciones.activarsaldo_mone_localSaldoContable,iSizeTabla,this,true,"saldo_mone_localSaldoContable","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.saldocontableConstantesFunciones.resaltarsaldo_mone_localSaldoContable,this.saldocontableConstantesFunciones.activarsaldo_mone_localSaldoContable,this,true,"saldo_mone_localSaldoContable","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new SaldoContablePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSaldoContable.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSaldoContable,SaldoContableConstantesFunciones.LABEL_DEBITOMONEEXTRA));

		if(this.saldocontableConstantesFunciones.mostrardebito_mone_extraSaldoContable && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SaldoContableConstantesFunciones.LABEL_DEBITOMONEEXTRA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.saldocontableConstantesFunciones.resaltardebito_mone_extraSaldoContable,this.saldocontableConstantesFunciones.activardebito_mone_extraSaldoContable,iSizeTabla,this,true,"debito_mone_extraSaldoContable","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.saldocontableConstantesFunciones.resaltardebito_mone_extraSaldoContable,this.saldocontableConstantesFunciones.activardebito_mone_extraSaldoContable,this,true,"debito_mone_extraSaldoContable","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new SaldoContablePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSaldoContable.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSaldoContable,SaldoContableConstantesFunciones.LABEL_CREDITOMONEEXTRA));

		if(this.saldocontableConstantesFunciones.mostrarcredito_mone_extraSaldoContable && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SaldoContableConstantesFunciones.LABEL_CREDITOMONEEXTRA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.saldocontableConstantesFunciones.resaltarcredito_mone_extraSaldoContable,this.saldocontableConstantesFunciones.activarcredito_mone_extraSaldoContable,iSizeTabla,this,true,"credito_mone_extraSaldoContable","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.saldocontableConstantesFunciones.resaltarcredito_mone_extraSaldoContable,this.saldocontableConstantesFunciones.activarcredito_mone_extraSaldoContable,this,true,"credito_mone_extraSaldoContable","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new SaldoContablePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSaldoContable.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSaldoContable,SaldoContableConstantesFunciones.LABEL_SALDOMONEEXTRA));

		if(this.saldocontableConstantesFunciones.mostrarsaldo_mone_extraSaldoContable && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SaldoContableConstantesFunciones.LABEL_SALDOMONEEXTRA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.saldocontableConstantesFunciones.resaltarsaldo_mone_extraSaldoContable,this.saldocontableConstantesFunciones.activarsaldo_mone_extraSaldoContable,iSizeTabla,this,true,"saldo_mone_extraSaldoContable","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.saldocontableConstantesFunciones.resaltarsaldo_mone_extraSaldoContable,this.saldocontableConstantesFunciones.activarsaldo_mone_extraSaldoContable,this,true,"saldo_mone_extraSaldoContable","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new SaldoContablePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.saldocontableSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.saldocontableSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.saldocontableSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosSaldoContable.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.saldocontableSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.saldocontableSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosSaldoContable.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarSaldoContable && this.isPermisoGuardarCambiosSaldoContable) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.saldocontableSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.saldocontableSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosSaldoContable.addColumn(tableColumn);
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
			
			this.jTableDatosSaldoContable.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarSaldoContable && this.isPermisoGuardarCambiosSaldoContable) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarSaldoContable && this.isPermisoGuardarCambiosSaldoContable) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosSaldoContable.moveColumn(this.jTableDatosSaldoContable.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosSaldoContable.moveColumn(this.jTableDatosSaldoContable.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosSaldoContable.moveColumn(this.jTableDatosSaldoContable.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosSaldoContable.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosSaldoContable.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosSaldoContable,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!SaldoContableJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosSaldoContable.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosSaldoContable.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!SaldoContableJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!SaldoContableJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosSaldoContable.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosSaldoContable.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosSaldoContable.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=saldocontableLogic.getSaldoContables().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=saldocontables.size()-1;
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
		//this.jTableDatosSaldoContable.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosSaldoContable.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosSaldoContable();
			
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
				
				//this.isEsNuevoSaldoContable=false;
					
				SaldoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.saldocontable,new Object(),this.saldocontableParameterGeneral,this.saldocontableReturnGeneral);
			
				if(this.saldocontableSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormSaldoContable==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosSaldoContable.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosSaldoContable.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldocontable =(SaldoContable) this.saldocontableLogic.getSaldoContables().toArray()[this.jTableDatosSaldoContable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.saldocontable =(SaldoContable) this.saldocontables.toArray()[this.jTableDatosSaldoContable.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.saldocontable.getsType().equals("DUPLICADO")
				   || this.saldocontable.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoSaldoContable=true;
				
				} else {
					this.isEsNuevoSaldoContable=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.saldocontableSessionBean.getEsGuardarRelacionado()) {
					if(this.saldocontable.getId()>=0 && !this.saldocontable.getIsNew()) {						
						this.isEsNuevoSaldoContable=false;
						
					} else {
						this.isEsNuevoSaldoContable=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoSaldoContable(esRelaciones);						
				
				this.seleccionarSaldoContable(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.saldocontable.getId()<0) {
					this.isEsNuevoSaldoContable=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarSaldoContable(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarSaldoContable(evt,rowIndex);
				}	
				
				if(this.saldocontableSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion SaldoContable: " + this.dDif); 
					}
				}								
				
				SaldoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.saldocontable,new Object(),this.saldocontableParameterGeneral,this.saldocontableReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarSaldoContable(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.saldocontable)) {
					if(this.saldocontable.getId()>0) {
						this.saldocontable.setIsDeleted(true);
						
						this.saldocontablesEliminados.add(this.saldocontable);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.saldocontableLogic.getSaldoContables().remove(this.saldocontable);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.saldocontables.remove(this.saldocontable);				
					}
					
					
					((SaldoContableModel) this.jTableDatosSaldoContable.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaSaldoContable(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarSaldoContable(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoSaldoContable) {
			
			if(this.jInternalFrameDetalleFormSaldoContable==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosSaldoContable.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosSaldoContable.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldocontable =(SaldoContable) this.saldocontableLogic.getSaldoContables().toArray()[this.jTableDatosSaldoContable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.saldocontable =(SaldoContable) this.saldocontables.toArray()[this.jTableDatosSaldoContable.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(SaldoContableJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioSaldoContable(this.saldocontable);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.saldocontableConstantesFunciones.cargarid_empresaSaldoContable || this.saldocontableConstantesFunciones.event_dependid_empresaSaldoContable) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.saldocontable.getid_empresa());
									//this.inicializarActualizarBindingSaldoContable(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(saldocontable.getEmpresa()!=null) {
							this.empresasForeignKey.add(saldocontable.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.saldocontable.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.saldocontableConstantesFunciones.cargarid_sucursalSaldoContable || this.saldocontableConstantesFunciones.event_dependid_sucursalSaldoContable) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.saldocontable.getid_sucursal());
									//this.inicializarActualizarBindingSaldoContable(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(saldocontable.getSucursal()!=null) {
							this.sucursalsForeignKey.add(saldocontable.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.saldocontable.getid_sucursal(),false,"Formulario");

					//Ejercicio
					if(!this.saldocontableConstantesFunciones.cargarid_ejercicioSaldoContable || this.saldocontableConstantesFunciones.event_dependid_ejercicioSaldoContable) {
						//this.cargarCombosEjerciciosForeignKeyLista(" where id="+this.saldocontable.getid_ejercicio());
									//this.inicializarActualizarBindingSaldoContable(false,false);
						this.ejerciciosForeignKey=new ArrayList<Ejercicio>();

						if(saldocontable.getEjercicio()!=null) {
							this.ejerciciosForeignKey.add(saldocontable.getEjercicio());
						}

						this.addItemDefectoCombosForeignKeyEjercicio();
						this.cargarCombosFrameEjerciciosForeignKey("Todos");
					}
					this.setActualEjercicioForeignKey(this.saldocontable.getid_ejercicio(),false,"Formulario");

					//Periodo
					if(!this.saldocontableConstantesFunciones.cargarid_periodoSaldoContable || this.saldocontableConstantesFunciones.event_dependid_periodoSaldoContable) {
						//this.cargarCombosPeriodosForeignKeyLista(" where id="+this.saldocontable.getid_periodo());
									//this.inicializarActualizarBindingSaldoContable(false,false);
						this.periodosForeignKey=new ArrayList<Periodo>();

						if(saldocontable.getPeriodo()!=null) {
							this.periodosForeignKey.add(saldocontable.getPeriodo());
						}

						this.addItemDefectoCombosForeignKeyPeriodo();
						this.cargarCombosFramePeriodosForeignKey("Todos");
					}
					this.setActualPeriodoForeignKey(this.saldocontable.getid_periodo(),false,"Formulario");

					//Anio
					if(!this.saldocontableConstantesFunciones.cargarid_anioSaldoContable || this.saldocontableConstantesFunciones.event_dependid_anioSaldoContable) {
						//this.cargarCombosAniosForeignKeyLista(" where id="+this.saldocontable.getid_anio());
									//this.inicializarActualizarBindingSaldoContable(false,false);
						this.aniosForeignKey=new ArrayList<Anio>();

						if(saldocontable.getAnio()!=null) {
							this.aniosForeignKey.add(saldocontable.getAnio());
						}

						this.addItemDefectoCombosForeignKeyAnio();
						this.cargarCombosFrameAniosForeignKey("Todos");
					}
					this.setActualAnioForeignKey(this.saldocontable.getid_anio(),false,"Formulario");

					//Mes
					if(!this.saldocontableConstantesFunciones.cargarid_mesSaldoContable || this.saldocontableConstantesFunciones.event_dependid_mesSaldoContable) {
						//this.cargarCombosMessForeignKeyLista(" where id="+this.saldocontable.getid_mes());
									//this.inicializarActualizarBindingSaldoContable(false,false);
						this.messForeignKey=new ArrayList<Mes>();

						if(saldocontable.getMes()!=null) {
							this.messForeignKey.add(saldocontable.getMes());
						}

						this.addItemDefectoCombosForeignKeyMes();
						this.cargarCombosFrameMessForeignKey("Todos");
					}
					this.setActualMesForeignKey(this.saldocontable.getid_mes(),false,"Formulario");

					//CuentaContable
					if(!this.saldocontableConstantesFunciones.cargarid_cuenta_contableSaldoContable || this.saldocontableConstantesFunciones.event_dependid_cuenta_contableSaldoContable) {
						//this.cargarCombosCuentaContablesForeignKeyLista(" where id="+this.saldocontable.getid_cuenta_contable());
									//this.inicializarActualizarBindingSaldoContable(false,false);
						this.cuentacontablesForeignKey=new ArrayList<CuentaContable>();

						if(saldocontable.getCuentaContable()!=null) {
							this.cuentacontablesForeignKey.add(saldocontable.getCuentaContable());
						}

						this.addItemDefectoCombosForeignKeyCuentaContable();
						this.cargarCombosFrameCuentaContablesForeignKey("Todos");
					}
					this.setActualCuentaContableForeignKey(this.saldocontable.getid_cuenta_contable(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesSaldoContable("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesSaldoContable(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualSaldoContable() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoSaldoContable(SaldoContable saldocontable) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoSaldoContable(saldocontable,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoSaldoContable(SaldoContable saldocontable,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioSaldoContable(saldocontable);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeySaldoContable(saldocontable,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeySaldoContable(saldocontable);
	}
	
	public void setVariablesObjetoActualToFormularioSaldoContable(SaldoContable saldocontable) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormSaldoContable==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormSaldoContable.jLabelidSaldoContable.setText(saldocontable.getId().toString());
			this.jInternalFrameDetalleFormSaldoContable.jTextFielddebito_mone_localSaldoContable.setText(saldocontable.getdebito_mone_local().toString());
			this.jInternalFrameDetalleFormSaldoContable.jTextFieldcredito_mone_localSaldoContable.setText(saldocontable.getcredito_mone_local().toString());
			this.jInternalFrameDetalleFormSaldoContable.jTextFieldsaldo_mone_localSaldoContable.setText(saldocontable.getsaldo_mone_local().toString());
			this.jInternalFrameDetalleFormSaldoContable.jTextFielddebito_mone_extraSaldoContable.setText(saldocontable.getdebito_mone_extra().toString());
			this.jInternalFrameDetalleFormSaldoContable.jTextFieldcredito_mone_extraSaldoContable.setText(saldocontable.getcredito_mone_extra().toString());
			this.jInternalFrameDetalleFormSaldoContable.jTextFieldsaldo_mone_extraSaldoContable.setText(saldocontable.getsaldo_mone_extra().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,SaldoContable saldocontableLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,saldocontableLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,SaldoContable saldocontableLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				saldocontableLocal=this.saldocontable;
			} else {
				saldocontableLocal=this.saldocontableAnterior;
			}
		}
		
		if(this.permiteMantenimiento(saldocontableLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoSaldoContable(saldocontableLocal,true);
					
					if(saldocontableSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(saldocontableLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.saldocontableSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(saldocontableLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoSaldoContable(SaldoContable saldocontable,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualSaldoContable(saldocontable,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysSaldoContable(saldocontable);
	}
	
	public void setVariablesFormularioToObjetoActualSaldoContable(SaldoContable saldocontable,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualSaldoContable(saldocontable,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualSaldoContable(SaldoContable saldocontable,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormSaldoContable==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormSaldoContable.jLabelidSaldoContable.getText()==null || this.jInternalFrameDetalleFormSaldoContable.jLabelidSaldoContable.getText()=="" || this.jInternalFrameDetalleFormSaldoContable.jLabelidSaldoContable.getText()=="Id") {
				this.jInternalFrameDetalleFormSaldoContable.jLabelidSaldoContable.setText("0");
			}

			if(conColumnasBase) {saldocontable.setId(Long.parseLong(this.jInternalFrameDetalleFormSaldoContable.jLabelidSaldoContable.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SaldoContableConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSaldoContable.jLabelIdSaldoContable,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			saldocontable.setdebito_mone_local(Double.parseDouble(this.jInternalFrameDetalleFormSaldoContable.jTextFielddebito_mone_localSaldoContable.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SaldoContableConstantesFunciones.LABEL_DEBITOMONELOCAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSaldoContable.jLabeldebito_mone_localSaldoContable,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			saldocontable.setcredito_mone_local(Double.parseDouble(this.jInternalFrameDetalleFormSaldoContable.jTextFieldcredito_mone_localSaldoContable.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SaldoContableConstantesFunciones.LABEL_CREDITOMONELOCAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSaldoContable.jLabelcredito_mone_localSaldoContable,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			saldocontable.setsaldo_mone_local(Double.parseDouble(this.jInternalFrameDetalleFormSaldoContable.jTextFieldsaldo_mone_localSaldoContable.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SaldoContableConstantesFunciones.LABEL_SALDOMONELOCAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSaldoContable.jLabelsaldo_mone_localSaldoContable,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			saldocontable.setdebito_mone_extra(Double.parseDouble(this.jInternalFrameDetalleFormSaldoContable.jTextFielddebito_mone_extraSaldoContable.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SaldoContableConstantesFunciones.LABEL_DEBITOMONEEXTRA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSaldoContable.jLabeldebito_mone_extraSaldoContable,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			saldocontable.setcredito_mone_extra(Double.parseDouble(this.jInternalFrameDetalleFormSaldoContable.jTextFieldcredito_mone_extraSaldoContable.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SaldoContableConstantesFunciones.LABEL_CREDITOMONEEXTRA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSaldoContable.jLabelcredito_mone_extraSaldoContable,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			saldocontable.setsaldo_mone_extra(Double.parseDouble(this.jInternalFrameDetalleFormSaldoContable.jTextFieldsaldo_mone_extraSaldoContable.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SaldoContableConstantesFunciones.LABEL_SALDOMONEEXTRA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSaldoContable.jLabelsaldo_mone_extraSaldoContable,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualSaldoContable(SaldoContable saldocontableBean,SaldoContable saldocontable,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosSaldoContable(SaldoContable saldocontableOrigen,SaldoContable saldocontable,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && saldocontableOrigen.getId()!=null && !saldocontableOrigen.getId().equals(0L))) {saldocontable.setId(saldocontableOrigen.getId());}}
			if(conDefault || (!conDefault && saldocontableOrigen.getdebito_mone_local()!=null && !saldocontableOrigen.getdebito_mone_local().equals(0.0))) {saldocontable.setdebito_mone_local(saldocontableOrigen.getdebito_mone_local());}
			if(conDefault || (!conDefault && saldocontableOrigen.getcredito_mone_local()!=null && !saldocontableOrigen.getcredito_mone_local().equals(0.0))) {saldocontable.setcredito_mone_local(saldocontableOrigen.getcredito_mone_local());}
			if(conDefault || (!conDefault && saldocontableOrigen.getsaldo_mone_local()!=null && !saldocontableOrigen.getsaldo_mone_local().equals(0.0))) {saldocontable.setsaldo_mone_local(saldocontableOrigen.getsaldo_mone_local());}
			if(conDefault || (!conDefault && saldocontableOrigen.getdebito_mone_extra()!=null && !saldocontableOrigen.getdebito_mone_extra().equals(0.0))) {saldocontable.setdebito_mone_extra(saldocontableOrigen.getdebito_mone_extra());}
			if(conDefault || (!conDefault && saldocontableOrigen.getcredito_mone_extra()!=null && !saldocontableOrigen.getcredito_mone_extra().equals(0.0))) {saldocontable.setcredito_mone_extra(saldocontableOrigen.getcredito_mone_extra());}
			if(conDefault || (!conDefault && saldocontableOrigen.getsaldo_mone_extra()!=null && !saldocontableOrigen.getsaldo_mone_extra().equals(0.0))) {saldocontable.setsaldo_mone_extra(saldocontableOrigen.getsaldo_mone_extra());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioSaldoContable(SaldoContable saldocontable) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormSaldoContable.jLabelidSaldoContable.setText(saldocontable.getId().toString());
			this.jInternalFrameDetalleFormSaldoContable.jTextFielddebito_mone_localSaldoContable.setText(saldocontable.getdebito_mone_local().toString());
			this.jInternalFrameDetalleFormSaldoContable.jTextFieldcredito_mone_localSaldoContable.setText(saldocontable.getcredito_mone_local().toString());
			this.jInternalFrameDetalleFormSaldoContable.jTextFieldsaldo_mone_localSaldoContable.setText(saldocontable.getsaldo_mone_local().toString());
			this.jInternalFrameDetalleFormSaldoContable.jTextFielddebito_mone_extraSaldoContable.setText(saldocontable.getdebito_mone_extra().toString());
			this.jInternalFrameDetalleFormSaldoContable.jTextFieldcredito_mone_extraSaldoContable.setText(saldocontable.getcredito_mone_extra().toString());
			this.jInternalFrameDetalleFormSaldoContable.jTextFieldsaldo_mone_extraSaldoContable.setText(saldocontable.getsaldo_mone_extra().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioSaldoContable(SaldoContableBean saldocontableBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormSaldoContable.jLabelidSaldoContable.setText(saldocontableBean.getId().toString());
			this.jInternalFrameDetalleFormSaldoContable.jTextFielddebito_mone_localSaldoContable.setText(saldocontableBean.getdebito_mone_local().toString());
			this.jInternalFrameDetalleFormSaldoContable.jTextFieldcredito_mone_localSaldoContable.setText(saldocontableBean.getcredito_mone_local().toString());
			this.jInternalFrameDetalleFormSaldoContable.jTextFieldsaldo_mone_localSaldoContable.setText(saldocontableBean.getsaldo_mone_local().toString());
			this.jInternalFrameDetalleFormSaldoContable.jTextFielddebito_mone_extraSaldoContable.setText(saldocontableBean.getdebito_mone_extra().toString());
			this.jInternalFrameDetalleFormSaldoContable.jTextFieldcredito_mone_extraSaldoContable.setText(saldocontableBean.getcredito_mone_extra().toString());
			this.jInternalFrameDetalleFormSaldoContable.jTextFieldsaldo_mone_extraSaldoContable.setText(saldocontableBean.getsaldo_mone_extra().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanSaldoContable(SaldoContableParameterReturnGeneral saldocontableReturnGeneral,SaldoContableBean saldocontableBean,Boolean conDefault) throws Exception { 
		try {
			SaldoContable saldocontableLocal=new SaldoContable();
			
			saldocontableLocal=saldocontableReturnGeneral.getSaldoContable();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && saldocontableLocal.getId()!=null && !saldocontableLocal.getId().equals(0L))) {saldocontableBean.setId(saldocontableLocal.getId());}}
			if(conDefault || (!conDefault && saldocontableLocal.getdebito_mone_local()!=null && !saldocontableLocal.getdebito_mone_local().equals(0.0))) {saldocontableBean.setdebito_mone_local(saldocontableLocal.getdebito_mone_local());}
			if(conDefault || (!conDefault && saldocontableLocal.getcredito_mone_local()!=null && !saldocontableLocal.getcredito_mone_local().equals(0.0))) {saldocontableBean.setcredito_mone_local(saldocontableLocal.getcredito_mone_local());}
			if(conDefault || (!conDefault && saldocontableLocal.getsaldo_mone_local()!=null && !saldocontableLocal.getsaldo_mone_local().equals(0.0))) {saldocontableBean.setsaldo_mone_local(saldocontableLocal.getsaldo_mone_local());}
			if(conDefault || (!conDefault && saldocontableLocal.getdebito_mone_extra()!=null && !saldocontableLocal.getdebito_mone_extra().equals(0.0))) {saldocontableBean.setdebito_mone_extra(saldocontableLocal.getdebito_mone_extra());}
			if(conDefault || (!conDefault && saldocontableLocal.getcredito_mone_extra()!=null && !saldocontableLocal.getcredito_mone_extra().equals(0.0))) {saldocontableBean.setcredito_mone_extra(saldocontableLocal.getcredito_mone_extra());}
			if(conDefault || (!conDefault && saldocontableLocal.getsaldo_mone_extra()!=null && !saldocontableLocal.getsaldo_mone_extra().equals(0.0))) {saldocontableBean.setsaldo_mone_extra(saldocontableLocal.getsaldo_mone_extra());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxSaldoContableGenerico(Long idSaldoContableSeleccionado,JComboBox jComboBoxSaldoContable,List<SaldoContable> saldocontablesLocal)throws Exception {
		try {
			SaldoContable  saldocontableTemp=null;

			for(SaldoContable saldocontableAux:saldocontablesLocal) {
				if(saldocontableAux.getId()!=null && saldocontableAux.getId().equals(idSaldoContableSeleccionado)) {
					saldocontableTemp=saldocontableAux;
					break;
				}
			}

			jComboBoxSaldoContable.setSelectedItem(saldocontableTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxSaldoContableGenerico(JComboBox jComboBoxSaldoContable,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxSaldoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxSaldoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxSaldoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxSaldoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxSaldoContable.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxSaldoContable.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxSaldoContable.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxSaldoContable.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxSaldoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxSaldoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			saldocontable=(SaldoContable) saldocontableLogic.getSaldoContables().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			saldocontable =(SaldoContable) saldocontables.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!saldocontable.getIsNew() && !saldocontable.getIsChanged() && !saldocontable.getIsDeleted()) {
				sDescripcion=saldocontable.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=saldocontable.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!saldocontable.getIsNew() && !saldocontable.getIsChanged() && !saldocontable.getIsDeleted()) {
				sDescripcion=saldocontable.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=saldocontable.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Ejercicio")) {
			//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
			if(!saldocontable.getIsNew() && !saldocontable.getIsChanged() && !saldocontable.getIsDeleted()) {
				sDescripcion=saldocontable.getejercicio_descripcion();
			} else {
				//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
				sDescripcion=saldocontable.getejercicio_descripcion();
			}
		}

		if(sTipo.equals("Periodo")) {
			//sDescripcion=this.getActualPeriodoForeignKeyDescripcion((Long)value);
			if(!saldocontable.getIsNew() && !saldocontable.getIsChanged() && !saldocontable.getIsDeleted()) {
				sDescripcion=saldocontable.getperiodo_descripcion();
			} else {
				//sDescripcion=this.getActualPeriodoForeignKeyDescripcion((Long)value);
				sDescripcion=saldocontable.getperiodo_descripcion();
			}
		}

		if(sTipo.equals("Anio")) {
			//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
			if(!saldocontable.getIsNew() && !saldocontable.getIsChanged() && !saldocontable.getIsDeleted()) {
				sDescripcion=saldocontable.getanio_descripcion();
			} else {
				//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
				sDescripcion=saldocontable.getanio_descripcion();
			}
		}

		if(sTipo.equals("Mes")) {
			//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
			if(!saldocontable.getIsNew() && !saldocontable.getIsChanged() && !saldocontable.getIsDeleted()) {
				sDescripcion=saldocontable.getmes_descripcion();
			} else {
				//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
				sDescripcion=saldocontable.getmes_descripcion();
			}
		}

		if(sTipo.equals("CuentaContable")) {
			//sDescripcion=this.getActualCuentaContableForeignKeyDescripcion((Long)value);
			if(!saldocontable.getIsNew() && !saldocontable.getIsChanged() && !saldocontable.getIsDeleted()) {
				sDescripcion=saldocontable.getcuentacontable_descripcion();
			} else {
				//sDescripcion=this.getActualCuentaContableForeignKeyDescripcion((Long)value);
				sDescripcion=saldocontable.getcuentacontable_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		SaldoContable saldocontableRow=new SaldoContable();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			saldocontableRow=(SaldoContable) saldocontableLogic.getSaldoContables().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			saldocontableRow=(SaldoContable) saldocontables.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualSaldoContable(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoSaldoContable.setVisible((this.isVisibilidadCeldaNuevoSaldoContable && this.isPermisoNuevoSaldoContable));			
			this.jButtonDuplicarSaldoContable.setVisible((this.isVisibilidadCeldaDuplicarSaldoContable && this.isPermisoDuplicarSaldoContable));			
			this.jButtonCopiarSaldoContable.setVisible((this.isVisibilidadCeldaCopiarSaldoContable && this.isPermisoCopiarSaldoContable));
			this.jButtonVerFormSaldoContable.setVisible((this.isVisibilidadCeldaVerFormSaldoContable && this.isPermisoVerFormSaldoContable));
			
			this.jButtonAbrirOrderBySaldoContable.setVisible((this.isVisibilidadCeldaOrdenSaldoContable && this.isPermisoOrdenSaldoContable));			
			
			this.jButtonNuevoRelacionesSaldoContable.setVisible((this.isVisibilidadCeldaNuevoRelacionesSaldoContable && this.isPermisoNuevoSaldoContable));			
			this.jButtonNuevoGuardarCambiosSaldoContable.setVisible((this.isVisibilidadCeldaNuevoSaldoContable && this.isPermisoNuevoSaldoContable && this.isPermisoGuardarCambiosSaldoContable));
			
			if(this.jInternalFrameDetalleFormSaldoContable!=null) {
			this.jInternalFrameDetalleFormSaldoContable.jButtonModificarSaldoContable.setVisible((this.isVisibilidadCeldaModificarSaldoContable && this.isPermisoActualizarSaldoContable));	
			this.jInternalFrameDetalleFormSaldoContable.jButtonActualizarSaldoContable.setVisible((this.isVisibilidadCeldaActualizarSaldoContable && this.isPermisoActualizarSaldoContable));	
			this.jInternalFrameDetalleFormSaldoContable.jButtonEliminarSaldoContable.setVisible((this.isVisibilidadCeldaEliminarSaldoContable && this.isPermisoEliminarSaldoContable));
			this.jInternalFrameDetalleFormSaldoContable.jButtonCancelarSaldoContable.setVisible(this.isVisibilidadCeldaCancelarSaldoContable);							
			this.jInternalFrameDetalleFormSaldoContable.jButtonGuardarCambiosSaldoContable.setVisible((this.isVisibilidadCeldaGuardarSaldoContable && this.isPermisoGuardarCambiosSaldoContable));			
			
			}
						
			this.jButtonGuardarCambiosTablaSaldoContable.setVisible((this.isVisibilidadCeldaGuardarCambiosSaldoContable && this.isPermisoGuardarCambiosSaldoContable));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarSaldoContable.setVisible((this.isVisibilidadCeldaNuevoSaldoContable && this.isPermisoNuevoSaldoContable));						
			this.jButtonDuplicarToolBarSaldoContable.setVisible((this.isVisibilidadCeldaDuplicarSaldoContable && this.isPermisoDuplicarSaldoContable));						
			this.jButtonCopiarToolBarSaldoContable.setVisible((this.isVisibilidadCeldaCopiarSaldoContable && this.isPermisoCopiarSaldoContable));			
			this.jButtonVerFormToolBarSaldoContable.setVisible((this.isVisibilidadCeldaVerFormSaldoContable && this.isPermisoVerFormSaldoContable));			
			this.jButtonAbrirOrderByToolBarSaldoContable.setVisible((this.isVisibilidadCeldaOrdenSaldoContable && this.isPermisoOrdenSaldoContable));
			this.jButtonNuevoRelacionesToolBarSaldoContable.setVisible((this.isVisibilidadCeldaNuevoRelacionesSaldoContable && this.isPermisoNuevoSaldoContable));			
			this.jButtonNuevoGuardarCambiosToolBarSaldoContable.setVisible((this.isVisibilidadCeldaNuevoSaldoContable && this.isPermisoNuevoSaldoContable && this.isPermisoGuardarCambiosSaldoContable));			
			
			if(this.jInternalFrameDetalleFormSaldoContable!=null) {
			this.jInternalFrameDetalleFormSaldoContable.jButtonModificarToolBarSaldoContable.setVisible((this.isVisibilidadCeldaModificarSaldoContable && this.isPermisoActualizarSaldoContable));	
			this.jInternalFrameDetalleFormSaldoContable.jButtonActualizarToolBarSaldoContable.setVisible((this.isVisibilidadCeldaActualizarSaldoContable  && this.isPermisoActualizarSaldoContable));	
			this.jInternalFrameDetalleFormSaldoContable.jButtonEliminarToolBarSaldoContable.setVisible((this.isVisibilidadCeldaEliminarSaldoContable && this.isPermisoEliminarSaldoContable));
			this.jInternalFrameDetalleFormSaldoContable.jButtonCancelarToolBarSaldoContable.setVisible(this.isVisibilidadCeldaCancelarSaldoContable);				
			this.jInternalFrameDetalleFormSaldoContable.jButtonGuardarCambiosToolBarSaldoContable.setVisible((this.isVisibilidadCeldaGuardarSaldoContable && this.isPermisoGuardarCambiosSaldoContable));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarSaldoContable.setVisible((this.isVisibilidadCeldaGuardarCambiosSaldoContable && this.isPermisoGuardarCambiosSaldoContable));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoSaldoContable.setVisible((this.isVisibilidadCeldaNuevoSaldoContable && this.isPermisoNuevoSaldoContable));			
			this.jMenuItemDuplicarSaldoContable.setVisible((this.isVisibilidadCeldaDuplicarSaldoContable && this.isPermisoDuplicarSaldoContable));			
			this.jMenuItemCopiarSaldoContable.setVisible((this.isVisibilidadCeldaCopiarSaldoContable && this.isPermisoCopiarSaldoContable));			
			this.jMenuItemVerFormSaldoContable.setVisible((this.isVisibilidadCeldaVerFormSaldoContable && this.isPermisoVerFormSaldoContable));			
			this.jMenuItemAbrirOrderBySaldoContable.setVisible((this.isVisibilidadCeldaOrdenSaldoContable && this.isPermisoOrdenSaldoContable));			
			//this.jMenuItemMostrarOcultarSaldoContable.setVisible((this.isVisibilidadCeldaOrdenSaldoContable && this.isPermisoOrdenSaldoContable));
			this.jMenuItemDetalleAbrirOrderBySaldoContable.setVisible((this.isVisibilidadCeldaOrdenSaldoContable && this.isPermisoOrdenSaldoContable));			
			//this.jMenuItemDetalleMostrarOcultarSaldoContable.setVisible((this.isVisibilidadCeldaOrdenSaldoContable && this.isPermisoOrdenSaldoContable));			
			this.jMenuItemNuevoRelacionesSaldoContable.setVisible((this.isVisibilidadCeldaNuevoRelacionesSaldoContable && this.isPermisoNuevoSaldoContable));			
			this.jMenuItemNuevoGuardarCambiosSaldoContable.setVisible((this.isVisibilidadCeldaNuevoSaldoContable && this.isPermisoNuevoSaldoContable && this.isPermisoGuardarCambiosSaldoContable));									
			
			if(this.jInternalFrameDetalleFormSaldoContable!=null) {
			this.jInternalFrameDetalleFormSaldoContable.jMenuItemModificarSaldoContable.setVisible((this.isVisibilidadCeldaModificarSaldoContable && this.isPermisoActualizarSaldoContable));	
			this.jInternalFrameDetalleFormSaldoContable.jMenuItemActualizarSaldoContable.setVisible((this.isVisibilidadCeldaActualizarSaldoContable && this.isPermisoActualizarSaldoContable));	
			this.jInternalFrameDetalleFormSaldoContable.jMenuItemEliminarSaldoContable.setVisible((this.isVisibilidadCeldaEliminarSaldoContable && this.isPermisoEliminarSaldoContable));
			this.jInternalFrameDetalleFormSaldoContable.jMenuItemCancelarSaldoContable.setVisible(this.isVisibilidadCeldaCancelarSaldoContable);				
			}
			
			this.jMenuItemGuardarCambiosSaldoContable.setVisible((this.isVisibilidadCeldaGuardarSaldoContable && this.isPermisoGuardarCambiosSaldoContable));						
			this.jMenuItemGuardarCambiosTablaSaldoContable.setVisible((this.isVisibilidadCeldaGuardarCambiosSaldoContable && this.isPermisoGuardarCambiosSaldoContable));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoSaldoContable=this.jButtonNuevoSaldoContable.isVisible();
			this.isVisibilidadCeldaDuplicarSaldoContable=this.jButtonDuplicarSaldoContable.isVisible();
			this.isVisibilidadCeldaCopiarSaldoContable=this.jButtonCopiarSaldoContable.isVisible();
			this.isVisibilidadCeldaVerFormSaldoContable=this.jButtonVerFormSaldoContable.isVisible();
			
			this.isVisibilidadCeldaOrdenSaldoContable=this.jButtonAbrirOrderBySaldoContable.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesSaldoContable=this.jButtonNuevoRelacionesSaldoContable.isVisible();
			this.isVisibilidadCeldaModificarSaldoContable=this.jButtonModificarSaldoContable.isVisible();
			
			if(this.jInternalFrameDetalleFormSaldoContable!=null) {
			this.isVisibilidadCeldaActualizarSaldoContable=this.jInternalFrameDetalleFormSaldoContable.jButtonActualizarSaldoContable.isVisible();
			this.isVisibilidadCeldaEliminarSaldoContable=this.jInternalFrameDetalleFormSaldoContable.jButtonEliminarSaldoContable.isVisible();
			this.isVisibilidadCeldaCancelarSaldoContable=this.jInternalFrameDetalleFormSaldoContable.jButtonCancelarSaldoContable.isVisible();
			this.isVisibilidadCeldaGuardarSaldoContable=this.jInternalFrameDetalleFormSaldoContable.jButtonGuardarCambiosSaldoContable.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosSaldoContable=this.jButtonGuardarCambiosTablaSaldoContable.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoSaldoContable=this.jButtonNuevoToolBarSaldoContable.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesSaldoContable=this.jButtonNuevoRelacionesToolBarSaldoContable.isVisible();
			
			if(this.jInternalFrameDetalleFormSaldoContable!=null) {
			this.isVisibilidadCeldaModificarSaldoContable=this.jInternalFrameDetalleFormSaldoContable.jButtonModificarToolBarSaldoContable.isVisible();
			this.isVisibilidadCeldaActualizarSaldoContable=this.jInternalFrameDetalleFormSaldoContable.jButtonActualizarToolBarSaldoContable.isVisible();
			this.isVisibilidadCeldaEliminarSaldoContable=this.jInternalFrameDetalleFormSaldoContable.jButtonEliminarToolBarSaldoContable.isVisible();
			this.isVisibilidadCeldaCancelarSaldoContable=this.jInternalFrameDetalleFormSaldoContable.jButtonCancelarToolBarSaldoContable.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarSaldoContable=this.jButtonGuardarCambiosToolBarSaldoContable.isVisible();
			this.isVisibilidadCeldaGuardarCambiosSaldoContable=this.jButtonGuardarCambiosTablaToolBarSaldoContable.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoSaldoContable=this.jMenuItemNuevoSaldoContable.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesSaldoContable=this.jMenuItemNuevoRelacionesSaldoContable.isVisible();
			
			if(this.jInternalFrameDetalleFormSaldoContable!=null) {
			this.isVisibilidadCeldaModificarSaldoContable=this.jInternalFrameDetalleFormSaldoContable.jMenuItemModificarSaldoContable.isVisible();
			this.isVisibilidadCeldaActualizarSaldoContable=this.jInternalFrameDetalleFormSaldoContable.jMenuItemActualizarSaldoContable.isVisible();
			this.isVisibilidadCeldaEliminarSaldoContable=this.jInternalFrameDetalleFormSaldoContable.jMenuItemEliminarSaldoContable.isVisible();
			this.isVisibilidadCeldaCancelarSaldoContable=this.jInternalFrameDetalleFormSaldoContable.jMenuItemCancelarSaldoContable.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarSaldoContable=this.jMenuItemGuardarCambiosSaldoContable.isVisible();
			this.isVisibilidadCeldaGuardarCambiosSaldoContable=this.jMenuItemGuardarCambiosTablaSaldoContable.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesSaldoContable(Boolean esInicializar) {
		if(SaldoContableJInternalFrame.ISBINDING_MANUAL) {			
			if(this.saldocontableSessionBean.getConGuardarRelaciones()) {
				//if(this.saldocontableSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesSaldoContable();
			}
			
			this.inicializarActualizarBindingBotonesManualSaldoContable(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualSaldoContable() {
		this.jButtonNuevoSaldoContable.setVisible(this.isPermisoNuevoSaldoContable);			
		this.jButtonDuplicarSaldoContable.setVisible(this.isPermisoDuplicarSaldoContable);			
		this.jButtonCopiarSaldoContable.setVisible(this.isPermisoCopiarSaldoContable);			
		this.jButtonVerFormSaldoContable.setVisible(this.isPermisoVerFormSaldoContable);			
		
		this.jButtonAbrirOrderBySaldoContable.setVisible(this.isPermisoOrdenSaldoContable);					
		
		this.jButtonNuevoRelacionesSaldoContable.setVisible(this.isPermisoNuevoSaldoContable);			
		
		if(this.jInternalFrameDetalleFormSaldoContable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSaldoContable.jButtonModificarSaldoContable.setVisible(this.isPermisoActualizarSaldoContable);	
			this.jInternalFrameDetalleFormSaldoContable.jButtonActualizarSaldoContable.setVisible(this.isPermisoActualizarSaldoContable);	
			this.jInternalFrameDetalleFormSaldoContable.jButtonEliminarSaldoContable.setVisible(this.isPermisoEliminarSaldoContable);
			this.jInternalFrameDetalleFormSaldoContable.jButtonCancelarSaldoContable.setVisible(this.isVisibilidadCeldaCancelarSaldoContable);						
			this.jInternalFrameDetalleFormSaldoContable.jButtonGuardarCambiosSaldoContable.setVisible(this.isPermisoGuardarCambiosSaldoContable);							
		}
		
		this.jButtonGuardarCambiosTablaSaldoContable.setVisible(this.isPermisoActualizarSaldoContable);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleSaldoContable() {
		this.jInternalFrameDetalleFormSaldoContable.jButtonModificarSaldoContable.setVisible(this.isPermisoActualizarSaldoContable);	
		this.jInternalFrameDetalleFormSaldoContable.jButtonActualizarSaldoContable.setVisible(this.isPermisoActualizarSaldoContable);	
		this.jInternalFrameDetalleFormSaldoContable.jButtonEliminarSaldoContable.setVisible(this.isPermisoEliminarSaldoContable);
		this.jInternalFrameDetalleFormSaldoContable.jButtonCancelarSaldoContable.setVisible(this.isVisibilidadCeldaCancelarSaldoContable);							
		this.jInternalFrameDetalleFormSaldoContable.jButtonGuardarCambiosSaldoContable.setVisible((this.isVisibilidadCeldaGuardarSaldoContable && this.isPermisoGuardarCambiosSaldoContable));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosSaldoContable() {
		if(SaldoContableJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualSaldoContable();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesSaldoContable() {
	}
	
	public void jTableDatosSaldoContableListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarSaldoContable(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidSaldoContableBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldocontableLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldoContable.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSaldoContable(this.getsaldocontable(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldoContable(this.saldocontable);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.saldocontable =(SaldoContable) this.saldocontableLogic.getSaldoContables().toArray()[this.jTableDatosSaldoContable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.saldocontable =(SaldoContable) this.saldocontables.toArray()[this.jTableDatosSaldoContable.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.saldocontable==null) {
						this.saldocontable = new SaldoContable();
					}

					this.setVariablesFormularioToObjetoActualSaldoContable(this.saldocontable,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldoContable(this.saldocontable);
				}

				if(this.saldocontable.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.saldocontable.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSaldoContable(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldocontableLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldocontableLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldocontableLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaSaldoContableUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontableLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebSaldoContable(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldoContable.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSaldoContable.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSaldoContable.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldocontable =(SaldoContable) this.saldocontableLogic.getSaldoContables().toArray()[this.jTableDatosSaldoContable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.saldocontable =(SaldoContable) this.saldocontables.toArray()[this.jTableDatosSaldoContable.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSaldoContable(this.getsaldocontable(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSaldoContable(this.saldocontable);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.saldocontableLogic.getConnexion());

				if(this.saldocontable.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.saldocontable.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSaldoContable=(TitledBorder)this.jScrollPanelDatosSaldoContable.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderSaldoContable.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontableLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontableLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontableLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaSaldoContableBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldocontableLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldoContable.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSaldoContable(this.getsaldocontable(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldoContable(this.saldocontable);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.saldocontable =(SaldoContable) this.saldocontableLogic.getSaldoContables().toArray()[this.jTableDatosSaldoContable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.saldocontable =(SaldoContable) this.saldocontables.toArray()[this.jTableDatosSaldoContable.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.saldocontable==null) {
						this.saldocontable = new SaldoContable();
					}

					this.setVariablesFormularioToObjetoActualSaldoContable(this.saldocontable,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldoContable(this.saldocontable);
				}

				if(this.saldocontable.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.saldocontable.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSaldoContable(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldocontableLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldocontableLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldocontableLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalSaldoContableUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontableLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebSaldoContable(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldoContable.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSaldoContable.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSaldoContable.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldocontable =(SaldoContable) this.saldocontableLogic.getSaldoContables().toArray()[this.jTableDatosSaldoContable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.saldocontable =(SaldoContable) this.saldocontables.toArray()[this.jTableDatosSaldoContable.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSaldoContable(this.getsaldocontable(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSaldoContable(this.saldocontable);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.saldocontableLogic.getConnexion());

				if(this.saldocontable.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.saldocontable.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSaldoContable=(TitledBorder)this.jScrollPanelDatosSaldoContable.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderSaldoContable.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontableLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontableLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontableLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalSaldoContableBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldocontableLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldoContable.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSaldoContable(this.getsaldocontable(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldoContable(this.saldocontable);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.saldocontable =(SaldoContable) this.saldocontableLogic.getSaldoContables().toArray()[this.jTableDatosSaldoContable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.saldocontable =(SaldoContable) this.saldocontables.toArray()[this.jTableDatosSaldoContable.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.saldocontable==null) {
						this.saldocontable = new SaldoContable();
					}

					this.setVariablesFormularioToObjetoActualSaldoContable(this.saldocontable,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldoContable(this.saldocontable);
				}

				if(this.saldocontable.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.saldocontable.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSaldoContable(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldocontableLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldocontableLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldocontableLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ejercicioSaldoContableUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontableLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoejercicio=true;

			idTienePermisoejercicio=this.tienePermisosUsuarioEnPaginaWebSaldoContable(EjercicioConstantesFunciones.CLASSNAME);

			if(idTienePermisoejercicio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldoContable.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSaldoContable.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSaldoContable.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldocontable =(SaldoContable) this.saldocontableLogic.getSaldoContables().toArray()[this.jTableDatosSaldoContable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.saldocontable =(SaldoContable) this.saldocontables.toArray()[this.jTableDatosSaldoContable.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSaldoContable(this.getsaldocontable(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSaldoContable(this.saldocontable);

				this.ejercicioBeanSwingJInternalFrame=new EjercicioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ejercicioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ejercicioBeanSwingJInternalFrame.getEjercicioLogic().setConnexion(this.saldocontableLogic.getConnexion());

				if(this.saldocontable.getid_ejercicio()!=null) {
					this.ejercicioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ejercicioBeanSwingJInternalFrame.setIdActual(this.saldocontable.getid_ejercicio());
					this.ejercicioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.inicializarActualizarBindingTablaEjercicio();
				}

				JInternalFrameBase jinternalFrame =this.ejercicioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSaldoContable=(TitledBorder)this.jScrollPanelDatosSaldoContable.getBorder();
				TitledBorder titledBorderejercicio=(TitledBorder)this.ejercicioBeanSwingJInternalFrame.jScrollPanelDatosEjercicio.getBorder();

				titledBorderejercicio.setTitle(titledBorderSaldoContable.getTitle() + " -> Ejercicio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontableLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontableLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontableLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ejercicioSaldoContableBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldocontableLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldoContable.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSaldoContable(this.getsaldocontable(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldoContable(this.saldocontable);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.saldocontable =(SaldoContable) this.saldocontableLogic.getSaldoContables().toArray()[this.jTableDatosSaldoContable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.saldocontable =(SaldoContable) this.saldocontables.toArray()[this.jTableDatosSaldoContable.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.saldocontable==null) {
						this.saldocontable = new SaldoContable();
					}

					this.setVariablesFormularioToObjetoActualSaldoContable(this.saldocontable,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldoContable(this.saldocontable);
				}

				if(this.saldocontable.getid_ejercicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ejercicio = "+this.saldocontable.getid_ejercicio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSaldoContable(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldocontableLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldocontableLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldocontableLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_periodoSaldoContableUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontableLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoperiodo=true;

			idTienePermisoperiodo=this.tienePermisosUsuarioEnPaginaWebSaldoContable(PeriodoConstantesFunciones.CLASSNAME);

			if(idTienePermisoperiodo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldoContable.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSaldoContable.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSaldoContable.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldocontable =(SaldoContable) this.saldocontableLogic.getSaldoContables().toArray()[this.jTableDatosSaldoContable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.saldocontable =(SaldoContable) this.saldocontables.toArray()[this.jTableDatosSaldoContable.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSaldoContable(this.getsaldocontable(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSaldoContable(this.saldocontable);

				this.periodoBeanSwingJInternalFrame=new PeriodoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.periodoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.periodoBeanSwingJInternalFrame.getPeriodoLogic().setConnexion(this.saldocontableLogic.getConnexion());

				if(this.saldocontable.getid_periodo()!=null) {
					this.periodoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.periodoBeanSwingJInternalFrame.setIdActual(this.saldocontable.getid_periodo());
					this.periodoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.inicializarActualizarBindingTablaPeriodo();
				}

				JInternalFrameBase jinternalFrame =this.periodoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSaldoContable=(TitledBorder)this.jScrollPanelDatosSaldoContable.getBorder();
				TitledBorder titledBorderperiodo=(TitledBorder)this.periodoBeanSwingJInternalFrame.jScrollPanelDatosPeriodo.getBorder();

				titledBorderperiodo.setTitle(titledBorderSaldoContable.getTitle() + " -> Periodo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontableLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontableLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontableLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_periodoSaldoContableBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldocontableLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldoContable.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSaldoContable(this.getsaldocontable(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldoContable(this.saldocontable);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.saldocontable =(SaldoContable) this.saldocontableLogic.getSaldoContables().toArray()[this.jTableDatosSaldoContable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.saldocontable =(SaldoContable) this.saldocontables.toArray()[this.jTableDatosSaldoContable.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.saldocontable==null) {
						this.saldocontable = new SaldoContable();
					}

					this.setVariablesFormularioToObjetoActualSaldoContable(this.saldocontable,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldoContable(this.saldocontable);
				}

				if(this.saldocontable.getid_periodo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_periodo = "+this.saldocontable.getid_periodo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSaldoContable(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldocontableLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldocontableLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldocontableLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_anioSaldoContableUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontableLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoanio=true;

			idTienePermisoanio=this.tienePermisosUsuarioEnPaginaWebSaldoContable(AnioConstantesFunciones.CLASSNAME);

			if(idTienePermisoanio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldoContable.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSaldoContable.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSaldoContable.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldocontable =(SaldoContable) this.saldocontableLogic.getSaldoContables().toArray()[this.jTableDatosSaldoContable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.saldocontable =(SaldoContable) this.saldocontables.toArray()[this.jTableDatosSaldoContable.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSaldoContable(this.getsaldocontable(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSaldoContable(this.saldocontable);

				this.anioBeanSwingJInternalFrame=new AnioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.anioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.anioBeanSwingJInternalFrame.getAnioLogic().setConnexion(this.saldocontableLogic.getConnexion());

				if(this.saldocontable.getid_anio()!=null) {
					this.anioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.anioBeanSwingJInternalFrame.setIdActual(this.saldocontable.getid_anio());
					this.anioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.inicializarActualizarBindingTablaAnio();
				}

				JInternalFrameBase jinternalFrame =this.anioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSaldoContable=(TitledBorder)this.jScrollPanelDatosSaldoContable.getBorder();
				TitledBorder titledBorderanio=(TitledBorder)this.anioBeanSwingJInternalFrame.jScrollPanelDatosAnio.getBorder();

				titledBorderanio.setTitle(titledBorderSaldoContable.getTitle() + " -> Anio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontableLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontableLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontableLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_anioSaldoContableBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldocontableLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldoContable.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSaldoContable(this.getsaldocontable(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldoContable(this.saldocontable);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.saldocontable =(SaldoContable) this.saldocontableLogic.getSaldoContables().toArray()[this.jTableDatosSaldoContable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.saldocontable =(SaldoContable) this.saldocontables.toArray()[this.jTableDatosSaldoContable.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.saldocontable==null) {
						this.saldocontable = new SaldoContable();
					}

					this.setVariablesFormularioToObjetoActualSaldoContable(this.saldocontable,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldoContable(this.saldocontable);
				}

				if(this.saldocontable.getid_anio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_anio = "+this.saldocontable.getid_anio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSaldoContable(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldocontableLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldocontableLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldocontableLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_mesSaldoContableUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontableLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisomes=true;

			idTienePermisomes=this.tienePermisosUsuarioEnPaginaWebSaldoContable(MesConstantesFunciones.CLASSNAME);

			if(idTienePermisomes) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldoContable.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSaldoContable.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSaldoContable.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldocontable =(SaldoContable) this.saldocontableLogic.getSaldoContables().toArray()[this.jTableDatosSaldoContable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.saldocontable =(SaldoContable) this.saldocontables.toArray()[this.jTableDatosSaldoContable.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSaldoContable(this.getsaldocontable(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSaldoContable(this.saldocontable);

				this.mesBeanSwingJInternalFrame=new MesBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.mesBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.mesBeanSwingJInternalFrame.getMesLogic().setConnexion(this.saldocontableLogic.getConnexion());

				if(this.saldocontable.getid_mes()!=null) {
					this.mesBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.mesBeanSwingJInternalFrame.setIdActual(this.saldocontable.getid_mes());
					this.mesBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.inicializarActualizarBindingTablaMes();
				}

				JInternalFrameBase jinternalFrame =this.mesBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSaldoContable=(TitledBorder)this.jScrollPanelDatosSaldoContable.getBorder();
				TitledBorder titledBordermes=(TitledBorder)this.mesBeanSwingJInternalFrame.jScrollPanelDatosMes.getBorder();

				titledBordermes.setTitle(titledBorderSaldoContable.getTitle() + " -> Mes");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontableLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontableLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontableLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_mesSaldoContableBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldocontableLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldoContable.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSaldoContable(this.getsaldocontable(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldoContable(this.saldocontable);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.saldocontable =(SaldoContable) this.saldocontableLogic.getSaldoContables().toArray()[this.jTableDatosSaldoContable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.saldocontable =(SaldoContable) this.saldocontables.toArray()[this.jTableDatosSaldoContable.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.saldocontable==null) {
						this.saldocontable = new SaldoContable();
					}

					this.setVariablesFormularioToObjetoActualSaldoContable(this.saldocontable,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldoContable(this.saldocontable);
				}

				if(this.saldocontable.getid_mes()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_mes = "+this.saldocontable.getid_mes().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSaldoContable(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldocontableLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldocontableLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldocontableLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_cuenta_contableSaldoContableActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.cuentacontableBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.cuentacontableBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.cuentacontableBeanSwingJInternalFrame.sTipoBusqueda="CuentaContable";

			if(!this.sFinalQueryGeneral_cuentacontable.equals("")) {
				this.cuentacontableBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_cuentacontable);
				this.cuentacontableBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.cuentacontableBeanSwingJInternalFrame.procesarBusqueda(this.cuentacontableBeanSwingJInternalFrame.sAccionBusqueda);
				this.cuentacontableBeanSwingJInternalFrame.inicializarActualizarBindingCuentaContable(false);
			}

			if(!this.sFinalQueryComboCuentaContable.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.cuentacontableBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderSaldoContable=null;
			TitledBorder titledBordercuentacontable=null;

			if(!this.jScrollPanelDatosSaldoContable.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderSaldoContable=(TitledBorder)this.jScrollPanelDatosSaldoContable.getBorder();
				titledBordercuentacontable=(TitledBorder)this.cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontable.setTitle(titledBorderSaldoContable.getTitle() + " -> Cuenta Contable");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_cuenta_contableSaldoContableUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontableLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocuentacontable=true;

			idTienePermisocuentacontable=this.tienePermisosUsuarioEnPaginaWebSaldoContable(CuentaContableConstantesFunciones.CLASSNAME);

			if(idTienePermisocuentacontable) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldoContable.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSaldoContable.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSaldoContable.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldocontable =(SaldoContable) this.saldocontableLogic.getSaldoContables().toArray()[this.jTableDatosSaldoContable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.saldocontable =(SaldoContable) this.saldocontables.toArray()[this.jTableDatosSaldoContable.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSaldoContable(this.getsaldocontable(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSaldoContable(this.saldocontable);

				this.cuentacontableBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.cuentacontableBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.cuentacontableBeanSwingJInternalFrame.getCuentaContableLogic().setConnexion(this.saldocontableLogic.getConnexion());

				if(this.saldocontable.getid_cuenta_contable()!=null) {
					this.cuentacontableBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.cuentacontableBeanSwingJInternalFrame.setIdActual(this.saldocontable.getid_cuenta_contable());
					this.cuentacontableBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.cuentacontableBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.cuentacontableBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuentaContable();
				}

				JInternalFrameBase jinternalFrame =this.cuentacontableBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSaldoContable=(TitledBorder)this.jScrollPanelDatosSaldoContable.getBorder();
				TitledBorder titledBordercuentacontable=(TitledBorder)this.cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontable.setTitle(titledBorderSaldoContable.getTitle() + " -> Cuenta Contable");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontableLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontableLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontableLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_cuenta_contableSaldoContableBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldocontableLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldoContable.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSaldoContable(this.getsaldocontable(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldoContable(this.saldocontable);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.saldocontable =(SaldoContable) this.saldocontableLogic.getSaldoContables().toArray()[this.jTableDatosSaldoContable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.saldocontable =(SaldoContable) this.saldocontables.toArray()[this.jTableDatosSaldoContable.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.saldocontable==null) {
						this.saldocontable = new SaldoContable();
					}

					this.setVariablesFormularioToObjetoActualSaldoContable(this.saldocontable,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldoContable(this.saldocontable);
				}

				if(this.saldocontable.getid_cuenta_contable()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cuenta_contable = "+this.saldocontable.getid_cuenta_contable().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSaldoContable(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldocontableLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldocontableLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldocontableLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondebito_mone_localSaldoContableBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldocontableLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldoContable.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSaldoContable(this.getsaldocontable(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldoContable(this.saldocontable);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.saldocontable =(SaldoContable) this.saldocontableLogic.getSaldoContables().toArray()[this.jTableDatosSaldoContable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.saldocontable =(SaldoContable) this.saldocontables.toArray()[this.jTableDatosSaldoContable.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.saldocontable==null) {
						this.saldocontable = new SaldoContable();
					}

					this.setVariablesFormularioToObjetoActualSaldoContable(this.saldocontable,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldoContable(this.saldocontable);
				}

				if(this.saldocontable.getdebito_mone_local()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where debito_mone_local = "+this.saldocontable.getdebito_mone_local().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSaldoContable(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldocontableLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldocontableLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldocontableLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncredito_mone_localSaldoContableBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldocontableLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldoContable.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSaldoContable(this.getsaldocontable(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldoContable(this.saldocontable);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.saldocontable =(SaldoContable) this.saldocontableLogic.getSaldoContables().toArray()[this.jTableDatosSaldoContable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.saldocontable =(SaldoContable) this.saldocontables.toArray()[this.jTableDatosSaldoContable.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.saldocontable==null) {
						this.saldocontable = new SaldoContable();
					}

					this.setVariablesFormularioToObjetoActualSaldoContable(this.saldocontable,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldoContable(this.saldocontable);
				}

				if(this.saldocontable.getcredito_mone_local()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where credito_mone_local = "+this.saldocontable.getcredito_mone_local().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSaldoContable(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldocontableLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldocontableLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldocontableLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsaldo_mone_localSaldoContableBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldocontableLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldoContable.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSaldoContable(this.getsaldocontable(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldoContable(this.saldocontable);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.saldocontable =(SaldoContable) this.saldocontableLogic.getSaldoContables().toArray()[this.jTableDatosSaldoContable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.saldocontable =(SaldoContable) this.saldocontables.toArray()[this.jTableDatosSaldoContable.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.saldocontable==null) {
						this.saldocontable = new SaldoContable();
					}

					this.setVariablesFormularioToObjetoActualSaldoContable(this.saldocontable,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldoContable(this.saldocontable);
				}

				if(this.saldocontable.getsaldo_mone_local()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where saldo_mone_local = "+this.saldocontable.getsaldo_mone_local().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSaldoContable(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldocontableLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldocontableLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldocontableLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondebito_mone_extraSaldoContableBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldocontableLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldoContable.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSaldoContable(this.getsaldocontable(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldoContable(this.saldocontable);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.saldocontable =(SaldoContable) this.saldocontableLogic.getSaldoContables().toArray()[this.jTableDatosSaldoContable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.saldocontable =(SaldoContable) this.saldocontables.toArray()[this.jTableDatosSaldoContable.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.saldocontable==null) {
						this.saldocontable = new SaldoContable();
					}

					this.setVariablesFormularioToObjetoActualSaldoContable(this.saldocontable,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldoContable(this.saldocontable);
				}

				if(this.saldocontable.getdebito_mone_extra()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where debito_mone_extra = "+this.saldocontable.getdebito_mone_extra().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSaldoContable(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldocontableLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldocontableLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldocontableLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncredito_mone_extraSaldoContableBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldocontableLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldoContable.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSaldoContable(this.getsaldocontable(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldoContable(this.saldocontable);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.saldocontable =(SaldoContable) this.saldocontableLogic.getSaldoContables().toArray()[this.jTableDatosSaldoContable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.saldocontable =(SaldoContable) this.saldocontables.toArray()[this.jTableDatosSaldoContable.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.saldocontable==null) {
						this.saldocontable = new SaldoContable();
					}

					this.setVariablesFormularioToObjetoActualSaldoContable(this.saldocontable,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldoContable(this.saldocontable);
				}

				if(this.saldocontable.getcredito_mone_extra()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where credito_mone_extra = "+this.saldocontable.getcredito_mone_extra().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSaldoContable(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldocontableLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldocontableLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldocontableLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsaldo_mone_extraSaldoContableBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldocontableLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSaldoContable.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSaldoContable(this.getsaldocontable(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldoContable(this.saldocontable);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.saldocontable =(SaldoContable) this.saldocontableLogic.getSaldoContables().toArray()[this.jTableDatosSaldoContable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.saldocontable =(SaldoContable) this.saldocontables.toArray()[this.jTableDatosSaldoContable.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.saldocontable==null) {
						this.saldocontable = new SaldoContable();
					}

					this.setVariablesFormularioToObjetoActualSaldoContable(this.saldocontable,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldoContable(this.saldocontable);
				}

				if(this.saldocontable.getsaldo_mone_extra()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where saldo_mone_extra = "+this.saldocontable.getsaldo_mone_extra().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSaldoContable(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldocontableLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldocontableLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldocontableLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdAnioSaldoContableActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontableLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSaldoContable(false,false);

			this.getSaldoContablesFK_IdAnio();

			this.inicializarActualizarBindingSaldoContable(false);

			//if(SaldoContableBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSaldoContable(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontableLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontableLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontableLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdCuentaContableSaldoContableActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontableLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSaldoContable(false,false);

			this.getSaldoContablesFK_IdCuentaContable();

			this.inicializarActualizarBindingSaldoContable(false);

			//if(SaldoContableBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSaldoContable(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontableLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontableLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontableLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEjercicioSaldoContableActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontableLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSaldoContable(false,false);

			this.getSaldoContablesFK_IdEjercicio();

			this.inicializarActualizarBindingSaldoContable(false);

			//if(SaldoContableBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSaldoContable(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontableLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontableLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontableLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaSaldoContableActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontableLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSaldoContable(false,false);

			this.getSaldoContablesFK_IdEmpresa();

			this.inicializarActualizarBindingSaldoContable(false);

			//if(SaldoContableBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSaldoContable(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontableLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontableLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontableLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdMesSaldoContableActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontableLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSaldoContable(false,false);

			this.getSaldoContablesFK_IdMes();

			this.inicializarActualizarBindingSaldoContable(false);

			//if(SaldoContableBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSaldoContable(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontableLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontableLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontableLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPeriodoSaldoContableActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontableLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSaldoContable(false,false);

			this.getSaldoContablesFK_IdPeriodo();

			this.inicializarActualizarBindingSaldoContable(false);

			//if(SaldoContableBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSaldoContable(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontableLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontableLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontableLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalSaldoContableActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontableLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSaldoContable(false,false);

			this.getSaldoContablesFK_IdSucursal();

			this.inicializarActualizarBindingSaldoContable(false);

			//if(SaldoContableBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSaldoContable(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontableLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontableLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.saldocontableLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameSaldoContable() {
		if(this.jInternalFrameDetalleFormSaldoContable!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormSaldoContable!=null) {
			this.jInternalFrameDetalleFormSaldoContable.setVisible(false);	    			
			this.jInternalFrameDetalleFormSaldoContable.dispose();
			this.jInternalFrameDetalleFormSaldoContable=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoSaldoContable!=null) {
			this.jInternalFrameReporteDinamicoSaldoContable.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoSaldoContable.dispose();
			this.jInternalFrameReporteDinamicoSaldoContable=null;
		}
		
		if(this.jInternalFrameImportacionSaldoContable!=null) {
			this.jInternalFrameImportacionSaldoContable.setVisible(false);	    			
			this.jInternalFrameImportacionSaldoContable.dispose();
			this.jInternalFrameImportacionSaldoContable=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessSaldoContable();
			
			SaldoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.saldocontable,new Object(),this.saldocontableParameterGeneral,this.saldocontableReturnGeneral);
			
			
			if(sTipo.equals("NuevoSaldoContable")) {
				jButtonNuevoSaldoContableActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarSaldoContable")) {
				jButtonDuplicarSaldoContableActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarSaldoContable")) {
				jButtonCopiarSaldoContableActionPerformed(evt);
			} else if(sTipo.equals("VerFormSaldoContable")) {
				jButtonVerFormSaldoContableActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarSaldoContable")) {
				jButtonNuevoSaldoContableActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarSaldoContable")) {
				jButtonDuplicarSaldoContableActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoSaldoContable")) {
				jButtonNuevoSaldoContableActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarSaldoContable")) {
				jButtonDuplicarSaldoContableActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesSaldoContable")) {
				jButtonNuevoSaldoContableActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarSaldoContable")) {
				jButtonNuevoSaldoContableActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesSaldoContable")) {
				jButtonNuevoSaldoContableActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarSaldoContable")) {
				jButtonModificarSaldoContableActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarSaldoContable")) {
				jButtonModificarSaldoContableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarSaldoContable")) {
				jButtonModificarSaldoContableActionPerformed(evt);
			} else if(sTipo.equals("ActualizarSaldoContable")) {
				jButtonActualizarSaldoContableActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarSaldoContable")) {
				jButtonActualizarSaldoContableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarSaldoContable")) {
				jButtonActualizarSaldoContableActionPerformed(evt);
			} else if(sTipo.equals("EliminarSaldoContable")) {
				jButtonEliminarSaldoContableActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarSaldoContable")) {
				jButtonEliminarSaldoContableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarSaldoContable")) {
				jButtonEliminarSaldoContableActionPerformed(evt);
			} else if(sTipo.equals("CancelarSaldoContable")) {
				jButtonCancelarSaldoContableActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarSaldoContable")) {
				jButtonCancelarSaldoContableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarSaldoContable")) {
				jButtonCancelarSaldoContableActionPerformed(evt);
			} else if(sTipo.equals("CerrarSaldoContable")) {
				jButtonCerrarSaldoContableActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarSaldoContable")) {
				jButtonCerrarSaldoContableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarSaldoContable")) {
				jButtonCerrarSaldoContableActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarSaldoContable")) {
				jButtonMostrarOcultarSaldoContableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarSaldoContable")) {
				jButtonCancelarSaldoContableActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosSaldoContable")) {
				jButtonGuardarCambiosSaldoContableActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarSaldoContable")) {
				jButtonGuardarCambiosSaldoContableActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarSaldoContable")) {
				jButtonCopiarSaldoContableActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarSaldoContable")) {
				jButtonVerFormSaldoContableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosSaldoContable")) {
				jButtonGuardarCambiosSaldoContableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarSaldoContable")) {
				jButtonCopiarSaldoContableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormSaldoContable")) {
				jButtonVerFormSaldoContableActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaSaldoContable")) {
				jButtonGuardarCambiosSaldoContableActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarSaldoContable")) {
				jButtonGuardarCambiosSaldoContableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaSaldoContable")) {
				jButtonGuardarCambiosSaldoContableActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionSaldoContable")) {
				jButtonRecargarInformacionSaldoContableActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarSaldoContable")) {
				jButtonRecargarInformacionSaldoContableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionSaldoContable")) {
				jButtonRecargarInformacionSaldoContableActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresSaldoContable")) {
				jButtonAnterioresSaldoContableActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarSaldoContable")) {
				jButtonAnterioresSaldoContableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreSaldoContable")) {
				jButtonAnterioresSaldoContableActionPerformed(evt);
			} else if(sTipo.equals("SiguientesSaldoContable")) {
				jButtonSiguientesSaldoContableActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarSaldoContable")) {
				jButtonSiguientesSaldoContableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesSaldoContable")) {
				jButtonSiguientesSaldoContableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderBySaldoContable") || sTipo.equals("MenuItemDetalleAbrirOrderBySaldoContable")) {
				jButtonAbrirOrderBySaldoContableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarSaldoContable") || sTipo.equals("MenuItemDetalleMostrarOcultarSaldoContable")) {
				jButtonMostrarOcultarSaldoContableActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosSaldoContable")) {
				jButtonNuevoGuardarCambiosSaldoContableActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarSaldoContable")) {
				jButtonNuevoGuardarCambiosSaldoContableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosSaldoContable")) {
				jButtonNuevoGuardarCambiosSaldoContableActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoSaldoContable")) {
				jButtonCerrarReporteDinamicoSaldoContableActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoSaldoContable")) {
				jButtonGenerarReporteDinamicoSaldoContableActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoSaldoContable")) {
				
				jButtonGenerarExcelReporteDinamicoSaldoContableActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionSaldoContable")) {
				jButtonCerrarImportacionSaldoContableActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionSaldoContable")) {
				
				jButtonGenerarImportacionSaldoContableActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionSaldoContable")) {
				
				jButtonAbrirImportacionSaldoContableActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesSaldoContable")) {
				jComboBoxTiposAccionesSaldoContableActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesSaldoContable")) {
				jComboBoxTiposRelacionesSaldoContableActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioSaldoContable")) {
				jComboBoxTiposAccionesSaldoContableActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarSaldoContable")) {
				
				jComboBoxTiposSeleccionarSaldoContableActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralSaldoContable")) {
				jTextFieldValorCampoGeneralSaldoContableActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderBySaldoContable")) {
				jButtonAbrirOrderBySaldoContableActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarSaldoContable")) {
				jButtonAbrirOrderBySaldoContableActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderBySaldoContable")) {
				jButtonCerrarOrderBySaldoContableActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idSaldoContableBusqueda")) {
				this.jButtonidSaldoContableBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaSaldoContableUpdate")) {
				this.jButtonid_empresaSaldoContableUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaSaldoContableBusqueda")) {
				this.jButtonid_empresaSaldoContableBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalSaldoContableUpdate")) {
				this.jButtonid_sucursalSaldoContableUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalSaldoContableBusqueda")) {
				this.jButtonid_sucursalSaldoContableBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioSaldoContableUpdate")) {
				this.jButtonid_ejercicioSaldoContableUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioSaldoContableBusqueda")) {
				this.jButtonid_ejercicioSaldoContableBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoSaldoContableUpdate")) {
				this.jButtonid_periodoSaldoContableUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoSaldoContableBusqueda")) {
				this.jButtonid_periodoSaldoContableBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioSaldoContableUpdate")) {
				this.jButtonid_anioSaldoContableUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioSaldoContableBusqueda")) {
				this.jButtonid_anioSaldoContableBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesSaldoContableUpdate")) {
				this.jButtonid_mesSaldoContableUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesSaldoContableBusqueda")) {
				this.jButtonid_mesSaldoContableBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_cuenta_contableSaldoContable")) {
				this.jButtonid_cuenta_contableSaldoContableActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_cuenta_contableSaldoContableArbol")) {
				this.abrirFrameTreeCuentaContable("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contableSaldoContableUpdate")) {
				this.jButtonid_cuenta_contableSaldoContableUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contableSaldoContableBusqueda")) {
				this.jButtonid_cuenta_contableSaldoContableBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("debito_mone_localSaldoContableBusqueda")) {
				this.jButtondebito_mone_localSaldoContableBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("credito_mone_localSaldoContableBusqueda")) {
				this.jButtoncredito_mone_localSaldoContableBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("saldo_mone_localSaldoContableBusqueda")) {
				this.jButtonsaldo_mone_localSaldoContableBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("debito_mone_extraSaldoContableBusqueda")) {
				this.jButtondebito_mone_extraSaldoContableBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("credito_mone_extraSaldoContableBusqueda")) {
				this.jButtoncredito_mone_extraSaldoContableBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("saldo_mone_extraSaldoContableBusqueda")) {
				this.jButtonsaldo_mone_extraSaldoContableBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_cuenta_contableSaldoContable")) {
				this.jButtonid_cuenta_contableSaldoContableActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdCuentaContableSaldoContable")) {
				this.jButtonFK_IdCuentaContableSaldoContableActionPerformed(evt);
			}
			
			;
			
			
			SaldoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.saldocontable,new Object(),this.saldocontableParameterGeneral,this.saldocontableReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessSaldoContable();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSaldoContableActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.saldocontable);
				
				this.actualizarInformacion("INFO_PADRE",false,this.saldocontable);
				
				SaldoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldocontable,new Object(),this.saldocontableParameterGeneral,this.saldocontableReturnGeneral);
				
				


				
				SaldoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldocontable,new Object(),this.saldocontableParameterGeneral,this.saldocontableReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SaldoContable.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SaldoContable.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			SaldoContable saldocontableLocal=null;
			
			if(!this.getEsControlTabla()) {
				saldocontableLocal=this.saldocontable;
			} else {
				saldocontableLocal=this.saldocontableAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.saldocontable);
				
				this.actualizarInformacion("INFO_PADRE",false,this.saldocontable);
				
				SaldoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldocontable,new Object(),this.saldocontableParameterGeneral,this.saldocontableReturnGeneral);
							
				
				


				
				SaldoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldocontable,new Object(),this.saldocontableParameterGeneral,this.saldocontableReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SaldoContable.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SaldoContable.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSaldoContableActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSaldoContable.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldocontableAnterior =(SaldoContable) this.saldocontableLogic.getSaldoContables().toArray()[this.jTableDatosSaldoContable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.saldocontableAnterior =(SaldoContable) this.saldocontables.toArray()[this.jTableDatosSaldoContable.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
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
			
			SaldoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldocontable,new Object(),this.saldocontableParameterGeneral,this.saldocontableReturnGeneral);
			
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
			
			


			
			SaldoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldocontable,new Object(),this.saldocontableParameterGeneral,this.saldocontableReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSaldoContableActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.saldocontable);
				
				this.actualizarInformacion("INFO_PADRE",false,this.saldocontable);
				
				SaldoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldocontable,new Object(),this.saldocontableParameterGeneral,this.saldocontableReturnGeneral);
								
						
				


				
				SaldoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldocontable,new Object(),this.saldocontableParameterGeneral,this.saldocontableReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SaldoContable.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SaldoContable.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.saldocontable);
				
				this.actualizarInformacion("INFO_PADRE",false,this.saldocontable);
				
				SaldoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldocontable,new Object(),this.saldocontableParameterGeneral,this.saldocontableReturnGeneral);
								
				
				


				
				SaldoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldocontable,new Object(),this.saldocontableParameterGeneral,this.saldocontableReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SaldoContable.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SaldoContable.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSaldoContableActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSaldoContable.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldocontableAnterior =(SaldoContable) this.saldocontableLogic.getSaldoContables().toArray()[this.jTableDatosSaldoContable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.saldocontableAnterior =(SaldoContable) this.saldocontables.toArray()[this.jTableDatosSaldoContable.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.saldocontable);
				
				this.actualizarInformacion("INFO_PADRE",false,this.saldocontable);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSaldoContableActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSaldoContable.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldocontableAnterior =(SaldoContable) this.saldocontableLogic.getSaldoContables().toArray()[this.jTableDatosSaldoContable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.saldocontableAnterior =(SaldoContable) this.saldocontables.toArray()[this.jTableDatosSaldoContable.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSaldoContableActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.saldocontable);
			
			this.actualizarInformacion("INFO_PADRE",false,this.saldocontable);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.saldocontable);
				
				this.actualizarInformacion("INFO_PADRE",false,this.saldocontable);
				
				SaldoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldocontable,new Object(),this.saldocontableParameterGeneral,this.saldocontableReturnGeneral);
							
				
				


				
				SaldoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldocontable,new Object(),this.saldocontableParameterGeneral,this.saldocontableReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SaldoContable.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SaldoContable.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSaldoContableActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosSaldoContable.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.saldocontableAnterior =(SaldoContable) this.saldocontableLogic.getSaldoContables().toArray()[this.jTableDatosSaldoContable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.saldocontableAnterior =(SaldoContable) this.saldocontables.toArray()[this.jTableDatosSaldoContable.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
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
			
			SaldoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldocontable,new Object(),this.saldocontableParameterGeneral,this.saldocontableReturnGeneral);
			
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
			
			


			
			SaldoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldocontable,new Object(),this.saldocontableParameterGeneral,this.saldocontableReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSaldoContableActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.saldocontable);
			
			this.actualizarInformacion("INFO_PADRE",false,this.saldocontable);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.saldocontable);
				
				this.actualizarInformacion("INFO_PADRE",false,this.saldocontable);
				
				SaldoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldocontable,new Object(),this.saldocontableParameterGeneral,this.saldocontableReturnGeneral);
								
				
				


				
				SaldoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldocontable,new Object(),this.saldocontableParameterGeneral,this.saldocontableReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SaldoContable.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SaldoContable.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSaldoContableActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSaldoContable.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldocontableAnterior =(SaldoContable) this.saldocontableLogic.getSaldoContables().toArray()[this.jTableDatosSaldoContable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.saldocontableAnterior =(SaldoContable) this.saldocontables.toArray()[this.jTableDatosSaldoContable.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSaldoContableActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.saldocontable);
			
			this.actualizarInformacion("INFO_PADRE",false,this.saldocontable);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSaldoContableActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.saldocontable);
				
				this.actualizarInformacion("INFO_PADRE",false,this.saldocontable);
				
				SaldoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.saldocontable,new Object(),this.saldocontableParameterGeneral,this.saldocontableReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosSaldoContable")) {
					jCheckBoxSeleccionarTodosSaldoContableItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosSaldoContable")) {
					jCheckBoxSeleccionadosSaldoContableItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarSaldoContable")) {
					
				}
				
				


				
				
				SaldoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.saldocontable,new Object(),this.saldocontableParameterGeneral,this.saldocontableReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SaldoContable.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SaldoContable.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.saldocontable);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.saldocontable);
				
				SaldoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.saldocontable,new Object(),this.saldocontableParameterGeneral,this.saldocontableReturnGeneral);
												
				
				


				
				
				SaldoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.saldocontable,new Object(),this.saldocontableParameterGeneral,this.saldocontableReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SaldoContable.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SaldoContable.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSaldoContableActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosSaldoContable.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.saldocontableAnterior =(SaldoContable) this.saldocontableLogic.getSaldoContables().toArray()[this.jTableDatosSaldoContable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.saldocontableAnterior =(SaldoContable) this.saldocontables.toArray()[this.jTableDatosSaldoContable.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSaldoContableActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.saldocontable);
				
				this.actualizarInformacion("INFO_PADRE",false,this.saldocontable);
				
				SaldoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.saldocontable,new Object(),this.saldocontableParameterGeneral,this.saldocontableReturnGeneral);
				
				
				SaldoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.saldocontable,new Object(),this.saldocontableParameterGeneral,this.saldocontableReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
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
			
			SaldoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.saldocontable,new Object(),this.saldocontableParameterGeneral,this.saldocontableReturnGeneral);
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
			
			


			
			SaldoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldocontable,new Object(),this.saldocontableParameterGeneral,this.saldocontableReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSaldoContableActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.saldocontable);
				
				this.actualizarInformacion("INFO_PADRE",false,this.saldocontable);
				
				SaldoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.saldocontable,new Object(),this.saldocontableParameterGeneral,this.saldocontableReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				SaldoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldocontable,new Object(),this.saldocontableParameterGeneral,this.saldocontableReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SaldoContable.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SaldoContable.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.saldocontable);
				
				this.actualizarInformacion("INFO_PADRE",false,this.saldocontable);
				
				SaldoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.saldocontable,new Object(),this.saldocontableParameterGeneral,this.saldocontableReturnGeneral);
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
				
				


				
				SaldoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldocontable,new Object(),this.saldocontableParameterGeneral,this.saldocontableReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SaldoContable.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SaldoContable.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSaldoContableActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSaldoContable.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.saldocontableAnterior =(SaldoContable) this.saldocontableLogic.getSaldoContables().toArray()[this.jTableDatosSaldoContable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.saldocontableAnterior =(SaldoContable) this.saldocontables.toArray()[this.jTableDatosSaldoContable.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				SaldoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldocontable,new Object(),this.saldocontableParameterGeneral,this.saldocontableReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarSaldoContable")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosSaldoContableListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosSaldoContable.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.saldocontable =(SaldoContable) this.saldocontableLogic.getSaldoContables().toArray()[this.jTableDatosSaldoContable.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.saldocontable =(SaldoContable) this.saldocontables.toArray()[this.jTableDatosSaldoContable.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.saldocontable);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarSaldoContable")) {
				
				}
				
				SaldoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.saldocontable,new Object(),this.saldocontableParameterGeneral,this.saldocontableReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			SaldoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.saldocontable,new Object(),this.saldocontableParameterGeneral,this.saldocontableReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarSaldoContable")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosSaldoContable.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarSaldoContable")) {
			
			}
			
			SaldoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.saldocontable,new Object(),this.saldocontableParameterGeneral,this.saldocontableReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessSaldoContable();
			
			SaldoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.saldocontable,new Object(),this.saldocontableParameterGeneral,this.saldocontableReturnGeneral);
			
			if(sTipo.equals("NuevoSaldoContable")) {
				jButtonNuevoSaldoContableActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarSaldoContable")) {
				jButtonDuplicarSaldoContableActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarSaldoContable")) {
				jButtonCopiarSaldoContableActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormSaldoContable")) {
				jButtonVerFormSaldoContableActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesSaldoContable")) {
				jButtonNuevoSaldoContableActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarSaldoContable")) {
				jButtonModificarSaldoContableActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarSaldoContable")) {
				jButtonActualizarSaldoContableActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarSaldoContable")) {
				jButtonEliminarSaldoContableActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaSaldoContable")) {
				jButtonGuardarCambiosSaldoContableActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarSaldoContable")) {
				jButtonCancelarSaldoContableActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarSaldoContable")) {
				jButtonCerrarSaldoContableActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosSaldoContable")) {
				jButtonGuardarCambiosSaldoContableActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosSaldoContable")) {
				jButtonNuevoGuardarCambiosSaldoContableActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderBySaldoContable")) {
				jButtonAbrirOrderBySaldoContableActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionSaldoContable")) {
				jButtonRecargarInformacionSaldoContableActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresSaldoContable")) {
				jButtonAnterioresSaldoContableActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesSaldoContable")) {
				jButtonSiguientesSaldoContableActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idSaldoContableBusqueda")) {
				this.jButtonidSaldoContableBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaSaldoContableUpdate")) {
				this.jButtonid_empresaSaldoContableUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaSaldoContableBusqueda")) {
				this.jButtonid_empresaSaldoContableBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalSaldoContableUpdate")) {
				this.jButtonid_sucursalSaldoContableUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalSaldoContableBusqueda")) {
				this.jButtonid_sucursalSaldoContableBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioSaldoContableUpdate")) {
				this.jButtonid_ejercicioSaldoContableUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioSaldoContableBusqueda")) {
				this.jButtonid_ejercicioSaldoContableBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoSaldoContableUpdate")) {
				this.jButtonid_periodoSaldoContableUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoSaldoContableBusqueda")) {
				this.jButtonid_periodoSaldoContableBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioSaldoContableUpdate")) {
				this.jButtonid_anioSaldoContableUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioSaldoContableBusqueda")) {
				this.jButtonid_anioSaldoContableBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesSaldoContableUpdate")) {
				this.jButtonid_mesSaldoContableUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesSaldoContableBusqueda")) {
				this.jButtonid_mesSaldoContableBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_cuenta_contableSaldoContable")) {
				this.jButtonid_cuenta_contableSaldoContableActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_cuenta_contableSaldoContableArbol")) {
				this.abrirFrameTreeCuentaContable("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contableSaldoContableUpdate")) {
				this.jButtonid_cuenta_contableSaldoContableUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contableSaldoContableBusqueda")) {
				this.jButtonid_cuenta_contableSaldoContableBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("debito_mone_localSaldoContableBusqueda")) {
				this.jButtondebito_mone_localSaldoContableBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("credito_mone_localSaldoContableBusqueda")) {
				this.jButtoncredito_mone_localSaldoContableBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("saldo_mone_localSaldoContableBusqueda")) {
				this.jButtonsaldo_mone_localSaldoContableBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("debito_mone_extraSaldoContableBusqueda")) {
				this.jButtondebito_mone_extraSaldoContableBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("credito_mone_extraSaldoContableBusqueda")) {
				this.jButtoncredito_mone_extraSaldoContableBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("saldo_mone_extraSaldoContableBusqueda")) {
				this.jButtonsaldo_mone_extraSaldoContableBusquedaActionPerformed(evt);
			}
			
			SaldoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.saldocontable,new Object(),this.saldocontableParameterGeneral,this.saldocontableReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessSaldoContable();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			SaldoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.saldocontable,new Object(),this.saldocontableParameterGeneral,this.saldocontableReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameSaldoContable")) {
				closingInternalFrameSaldoContable();
				
			} else if(sTipo.equals("jButtonCancelarSaldoContable")) {
				JInternalFrameBase jInternalFrameDetalleFormSaldoContable = (JInternalFrameBase)evt.getSource();
	            	
	            SaldoContableBeanSwingJInternalFrame jInternalFrameParent=(SaldoContableBeanSwingJInternalFrame)jInternalFrameDetalleFormSaldoContable.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarSaldoContableActionPerformed(null);
			}
			
			SaldoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.saldocontable,new Object(),this.saldocontableParameterGeneral,this.saldocontableReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormSaldoContable(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormSaldoContable(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormSaldoContable(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.saldocontable)) {
			if(!esControlTabla) {
				if(SaldoContableJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualSaldoContable(this.saldocontable,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldoContable(this.saldocontable);			
				}
				
				if(this.saldocontableSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualSaldoContable(this.saldocontable,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.saldocontableReturnGeneral=saldocontableLogic.procesarEventosSaldoContablesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.saldocontableLogic.getSaldoContables(),this.saldocontable,this.saldocontableParameterGeneral,this.isEsNuevoSaldoContable,classes);//this.saldocontableLogic.getSaldoContable()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanSaldoContable(this.saldocontableReturnGeneral,this.saldocontableBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.saldocontableSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanSaldoContable(classes,this.saldocontableReturnGeneral,this.saldocontableBean,false);
					}
						
					if(this.saldocontableReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeySaldoContable(this.saldocontableReturnGeneral.getSaldoContable());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioSaldoContable(this.saldocontableReturnGeneral.getSaldoContable());	
					}
						
					if(this.saldocontableReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioSaldoContable(this.saldocontableReturnGeneral.getSaldoContable(),classes);//this.saldocontableBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioSaldoContable(this.saldocontable,classes);//this.saldocontableBean);									
				}
			
				if(SaldoContableJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualSaldoContable(this.saldocontable,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysSaldoContable(this.saldocontable);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.saldocontableAnterior!=null) {
						this.saldocontable=this.saldocontableAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.saldocontableReturnGeneral=saldocontableLogic.procesarEventosSaldoContablesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.saldocontableLogic.getSaldoContables(),this.saldocontable,this.saldocontableParameterGeneral,this.isEsNuevoSaldoContable,classes);//this.saldocontableLogic.getSaldoContable()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.saldocontableSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.saldocontableSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.saldocontableReturnGeneral.getSaldoContable(),saldocontableLogic.getSaldoContables());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.saldocontableReturnGeneral.getSaldoContable(),this.saldocontables);
				}
				//ARCHITECTURE
				
				//this.jTableDatosSaldoContable.repaint();
				
				//((AbstractTableModel) this.jTableDatosSaldoContable.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosSaldoContable();
			}
		}
	}
	
	public void actualizarVisualTableDatosSaldoContable() throws Exception {
		
		SaldoContableModel saldocontableModel=(SaldoContableModel)this.jTableDatosSaldoContable.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			saldocontableModel.saldocontables=this.saldocontableLogic.getSaldoContables();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			saldocontableModel.saldocontables=this.saldocontables;
		}
		
		
		((SaldoContableModel) this.jTableDatosSaldoContable.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaSaldoContable() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getsaldocontableAnterior(),this.saldocontableLogic.getSaldoContables());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getsaldocontableAnterior(),this.saldocontables);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosSaldoContable();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioSaldoContable(SaldoContable saldocontable,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
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
										
				SaldoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.saldocontable,new Object(),generalEntityParameterGeneral,this.saldocontableReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.saldocontableSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=SaldoContableConstantesFunciones.getClassesRelationshipsOfSaldoContable(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=SaldoContableConstantesFunciones.getClassesRelationshipsFromStringsOfSaldoContable(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormSaldoContable(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				SaldoContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.saldocontable,new Object(),generalEntityParameterGeneral,this.saldocontableReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioSaldoContable(SaldoContableBean saldocontableBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanSaldoContable(ArrayList<Classe> classes,SaldoContableReturnGeneral saldocontableReturnGeneral,SaldoContableBean saldocontableBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualSaldoContable(SaldoContable saldocontable,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.saldocontable)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormSaldoContable = new SaldoContableDetalleFormJInternalFrame(jDesktopPane,this.saldocontableSessionBean.getConGuardarRelaciones(),this.saldocontableSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormSaldoContable);
		this.jInternalFrameDetalleFormSaldoContable.setVisible(false);
		this.jInternalFrameDetalleFormSaldoContable.setSelected(false);						
		
		this.jInternalFrameDetalleFormSaldoContable.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormSaldoContable.saldocontableLogic=this.saldocontableLogic;
		
		this.cargarCombosFrameForeignKeySaldoContable("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleSaldoContable();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleSaldoContable();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeySaldoContable("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeySaldoContable();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormSaldoContable.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarSaldoContable"));
		
		this.jInternalFrameDetalleFormSaldoContable.jButtonModificarSaldoContable.addActionListener(new ButtonActionListener(this,"ModificarSaldoContable"));

		
		this.jInternalFrameDetalleFormSaldoContable.jButtonModificarToolBarSaldoContable.addActionListener(new ButtonActionListener(this,"ModificarToolBarSaldoContable"));
					
		this.jInternalFrameDetalleFormSaldoContable.jMenuItemModificarSaldoContable.addActionListener(new ButtonActionListener(this,"MenuItemModificarSaldoContable"));		
		
		
		
		this.jInternalFrameDetalleFormSaldoContable.jButtonActualizarSaldoContable.addActionListener (new ButtonActionListener(this,"ActualizarSaldoContable"));
		
		
		this.jInternalFrameDetalleFormSaldoContable.jButtonActualizarToolBarSaldoContable.addActionListener(new ButtonActionListener(this,"ActualizarToolBarSaldoContable"));
						
		this.jInternalFrameDetalleFormSaldoContable.jMenuItemActualizarSaldoContable.addActionListener (new ButtonActionListener(this,"MenuItemActualizarSaldoContable"));		
		
		
		
		this.jInternalFrameDetalleFormSaldoContable.jButtonEliminarSaldoContable.addActionListener (new ButtonActionListener(this,"EliminarSaldoContable"));
		
		
		this.jInternalFrameDetalleFormSaldoContable.jButtonEliminarToolBarSaldoContable.addActionListener (new ButtonActionListener(this,"EliminarToolBarSaldoContable"));
								
		this.jInternalFrameDetalleFormSaldoContable.jMenuItemEliminarSaldoContable.addActionListener (new ButtonActionListener(this,"MenuItemEliminarSaldoContable"));		
		
		
		
		this.jInternalFrameDetalleFormSaldoContable.jButtonCancelarSaldoContable.addActionListener (new ButtonActionListener(this,"CancelarSaldoContable"));
		
		
		this.jInternalFrameDetalleFormSaldoContable.jButtonCancelarToolBarSaldoContable.addActionListener (new ButtonActionListener(this,"CancelarToolBarSaldoContable"));
					
		this.jInternalFrameDetalleFormSaldoContable.jMenuItemCancelarSaldoContable.addActionListener (new ButtonActionListener(this,"MenuItemCancelarSaldoContable"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormSaldoContable.jMenuItemDetalleCerrarSaldoContable.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarSaldoContable"));		
		
		
		
		this.jInternalFrameDetalleFormSaldoContable.jButtonGuardarCambiosToolBarSaldoContable.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarSaldoContable"));
		
		
		
		this.jInternalFrameDetalleFormSaldoContable.jButtonGuardarCambiosToolBarSaldoContable.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarSaldoContable"));
		
		
		
		this.jInternalFrameDetalleFormSaldoContable.jComboBoxTiposAccionesFormularioSaldoContable.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioSaldoContable"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldoContable.jButtonidSaldoContableBusqueda.addActionListener(new ButtonActionListener(this,"idSaldoContableBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSaldoContable.jButtonid_empresaSaldoContableUpdate.addActionListener(new ButtonActionListener(this,"id_empresaSaldoContableUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldoContable.jButtonid_empresaSaldoContableBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaSaldoContableBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSaldoContable.jButtonid_sucursalSaldoContableUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalSaldoContableUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldoContable.jButtonid_sucursalSaldoContableBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalSaldoContableBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSaldoContable.jButtonid_ejercicioSaldoContableUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioSaldoContableUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldoContable.jButtonid_ejercicioSaldoContableBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioSaldoContableBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSaldoContable.jButtonid_periodoSaldoContableUpdate.addActionListener(new ButtonActionListener(this,"id_periodoSaldoContableUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldoContable.jButtonid_periodoSaldoContableBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoSaldoContableBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSaldoContable.jButtonid_anioSaldoContableUpdate.addActionListener(new ButtonActionListener(this,"id_anioSaldoContableUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldoContable.jButtonid_anioSaldoContableBusqueda.addActionListener(new ButtonActionListener(this,"id_anioSaldoContableBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSaldoContable.jButtonid_mesSaldoContableUpdate.addActionListener(new ButtonActionListener(this,"id_mesSaldoContableUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldoContable.jButtonid_mesSaldoContableBusqueda.addActionListener(new ButtonActionListener(this,"id_mesSaldoContableBusqueda"));
		//jButtonid_cuenta_contableSaldoContable.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contableSaldoContableActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormSaldoContable.jButtonid_cuenta_contableSaldoContable.addActionListener(new ButtonActionListener(this,"id_cuenta_contableSaldoContable"));
		//jButtonid_cuenta_contableSaldoContableArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContable("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormSaldoContable.jButtonid_cuenta_contableSaldoContableArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contableSaldoContableArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSaldoContable.jButtonid_cuenta_contableSaldoContableUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contableSaldoContableUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldoContable.jButtonid_cuenta_contableSaldoContableBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contableSaldoContableBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldoContable.jButtondebito_mone_localSaldoContableBusqueda.addActionListener(new ButtonActionListener(this,"debito_mone_localSaldoContableBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldoContable.jButtoncredito_mone_localSaldoContableBusqueda.addActionListener(new ButtonActionListener(this,"credito_mone_localSaldoContableBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldoContable.jButtonsaldo_mone_localSaldoContableBusqueda.addActionListener(new ButtonActionListener(this,"saldo_mone_localSaldoContableBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldoContable.jButtondebito_mone_extraSaldoContableBusqueda.addActionListener(new ButtonActionListener(this,"debito_mone_extraSaldoContableBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldoContable.jButtoncredito_mone_extraSaldoContableBusqueda.addActionListener(new ButtonActionListener(this,"credito_mone_extraSaldoContableBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldoContable.jButtonsaldo_mone_extraSaldoContableBusqueda.addActionListener(new ButtonActionListener(this,"saldo_mone_extraSaldoContableBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormSaldoContable.jTabbedPaneRelacionesSaldoContable.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesSaldoContable"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameSaldoContable"));
		
		if(this.jInternalFrameDetalleFormSaldoContable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSaldoContable.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarSaldoContable"));
		}
		
		this.jTableDatosSaldoContable.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarSaldoContable"));
		
		this.jTableDatosSaldoContable.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarSaldoContable"));
		
		this.jButtonNuevoSaldoContable.addActionListener(new ButtonActionListener(this,"NuevoSaldoContable"));
		
		this.jButtonDuplicarSaldoContable.addActionListener(new ButtonActionListener(this,"DuplicarSaldoContable"));
		
		this.jButtonCopiarSaldoContable.addActionListener(new ButtonActionListener(this,"CopiarSaldoContable"));
		
		this.jButtonVerFormSaldoContable.addActionListener(new ButtonActionListener(this,"VerFormSaldoContable"));
		
		
		this.jButtonNuevoToolBarSaldoContable.addActionListener(new ButtonActionListener(this,"NuevoToolBarSaldoContable"));
			
		this.jButtonDuplicarToolBarSaldoContable.addActionListener(new ButtonActionListener(this,"DuplicarToolBarSaldoContable"));
			
		this.jMenuItemNuevoSaldoContable.addActionListener (new ButtonActionListener(this,"MenuItemNuevoSaldoContable"));
			
		this.jMenuItemDuplicarSaldoContable.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarSaldoContable"));		
		
		
		this.jButtonNuevoRelacionesSaldoContable.addActionListener (new ButtonActionListener(this,"NuevoRelacionesSaldoContable"));
		
		
		this.jButtonNuevoRelacionesToolBarSaldoContable.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarSaldoContable"));
			
		this.jMenuItemNuevoRelacionesSaldoContable.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesSaldoContable"));		
		
		
		if(this.jInternalFrameDetalleFormSaldoContable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSaldoContable.jButtonModificarSaldoContable.addActionListener(new ButtonActionListener(this,"ModificarSaldoContable"));
		}
		
		
		if(this.jInternalFrameDetalleFormSaldoContable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSaldoContable.jButtonModificarToolBarSaldoContable.addActionListener(new ButtonActionListener(this,"ModificarToolBarSaldoContable"));
			
			this.jInternalFrameDetalleFormSaldoContable.jMenuItemModificarSaldoContable.addActionListener(new ButtonActionListener(this,"MenuItemModificarSaldoContable"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSaldoContable!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormSaldoContable.jButtonActualizarSaldoContable.addActionListener (new ButtonActionListener(this,"ActualizarSaldoContable"));
		}
		
		
		if(this.jInternalFrameDetalleFormSaldoContable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSaldoContable.jButtonActualizarToolBarSaldoContable.addActionListener(new ButtonActionListener(this,"ActualizarToolBarSaldoContable"));
				
			this.jInternalFrameDetalleFormSaldoContable.jMenuItemActualizarSaldoContable.addActionListener (new ButtonActionListener(this,"MenuItemActualizarSaldoContable"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSaldoContable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSaldoContable.jButtonEliminarSaldoContable.addActionListener (new ButtonActionListener(this,"EliminarSaldoContable"));
		}
		
		
		if(this.jInternalFrameDetalleFormSaldoContable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSaldoContable.jButtonEliminarToolBarSaldoContable.addActionListener (new ButtonActionListener(this,"EliminarToolBarSaldoContable"));
						
			this.jInternalFrameDetalleFormSaldoContable.jMenuItemEliminarSaldoContable.addActionListener (new ButtonActionListener(this,"MenuItemEliminarSaldoContable"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSaldoContable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSaldoContable.jButtonCancelarSaldoContable.addActionListener (new ButtonActionListener(this,"CancelarSaldoContable"));
		}
		
		
		if(this.jInternalFrameDetalleFormSaldoContable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSaldoContable.jButtonCancelarToolBarSaldoContable.addActionListener (new ButtonActionListener(this,"CancelarToolBarSaldoContable"));
			
			this.jInternalFrameDetalleFormSaldoContable.jMenuItemCancelarSaldoContable.addActionListener (new ButtonActionListener(this,"MenuItemCancelarSaldoContable"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarSaldoContable.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarSaldoContable"));		
		
		
		this.jButtonCerrarSaldoContable.addActionListener (new ButtonActionListener(this,"CerrarSaldoContable"));
		
		
		this.jButtonCerrarToolBarSaldoContable.addActionListener (new ButtonActionListener(this,"CerrarToolBarSaldoContable"));
			
		this.jMenuItemCerrarSaldoContable.addActionListener (new ButtonActionListener(this,"MenuItemCerrarSaldoContable"));
			
		if(this.jInternalFrameDetalleFormSaldoContable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSaldoContable.jMenuItemDetalleCerrarSaldoContable.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarSaldoContable"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSaldoContable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSaldoContable.jButtonGuardarCambiosSaldoContable.addActionListener (new ButtonActionListener(this,"GuardarCambiosSaldoContable"));
		}
		
		
		if(this.jInternalFrameDetalleFormSaldoContable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSaldoContable.jButtonGuardarCambiosToolBarSaldoContable.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarSaldoContable"));
		}
		
		this.jButtonCopiarToolBarSaldoContable.addActionListener (new ButtonActionListener(this,"CopiarToolBarSaldoContable"));
			
		this.jButtonVerFormToolBarSaldoContable.addActionListener (new ButtonActionListener(this,"VerFormToolBarSaldoContable"));
		
		this.jMenuItemGuardarCambiosSaldoContable.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosSaldoContable"));
			
		this.jMenuItemCopiarSaldoContable.addActionListener (new ButtonActionListener(this,"MenuItemCopiarSaldoContable"));		
		
		this.jMenuItemVerFormSaldoContable.addActionListener (new ButtonActionListener(this,"MenuItemVerFormSaldoContable"));		
		
		
		this.jButtonGuardarCambiosTablaSaldoContable.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaSaldoContable"));
		
		
		this.jButtonGuardarCambiosTablaToolBarSaldoContable.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarSaldoContable"));
			
		this.jMenuItemGuardarCambiosTablaSaldoContable.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaSaldoContable"));		
		
		
		
		this.jButtonRecargarInformacionSaldoContable.addActionListener (new ButtonActionListener(this,"RecargarInformacionSaldoContable"));
					
		this.jButtonRecargarInformacionToolBarSaldoContable.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarSaldoContable"));
		
		this.jMenuItemRecargarInformacionSaldoContable.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionSaldoContable"));		
		
		
		
		this.jButtonAnterioresSaldoContable.addActionListener (new ButtonActionListener(this,"AnterioresSaldoContable"));
		
		
		this.jButtonAnterioresToolBarSaldoContable.addActionListener (new ButtonActionListener(this,"AnterioresToolBarSaldoContable"));
		
		this.jMenuItemAnterioresSaldoContable.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresSaldoContable"));		
		
		
		this.jButtonSiguientesSaldoContable.addActionListener (new ButtonActionListener(this,"SiguientesSaldoContable"));
		
		
		this.jButtonSiguientesToolBarSaldoContable.addActionListener (new ButtonActionListener(this,"SiguientesToolBarSaldoContable"));
			
		this.jMenuItemSiguientesSaldoContable.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesSaldoContable"));
			
		this.jMenuItemAbrirOrderBySaldoContable.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderBySaldoContable"));
			
		this.jMenuItemMostrarOcultarSaldoContable.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarSaldoContable"));
			
		this.jMenuItemDetalleAbrirOrderBySaldoContable.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderBySaldoContable"));
			
		this.jMenuItemDetalleMostarOcultarSaldoContable.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarSaldoContable"));		
		
		
		this.jButtonNuevoGuardarCambiosSaldoContable.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosSaldoContable"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarSaldoContable.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarSaldoContable"));
			
		this.jMenuItemNuevoGuardarCambiosSaldoContable.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosSaldoContable"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosSaldoContable.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosSaldoContable"));

		this.jCheckBoxSeleccionadosSaldoContable.addItemListener(new CheckBoxItemListener(this,"SeleccionadosSaldoContable"));
		
		if(this.jInternalFrameDetalleFormSaldoContable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSaldoContable.jComboBoxTiposAccionesFormularioSaldoContable.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioSaldoContable"));
		}
		
		
		this.jComboBoxTiposRelacionesSaldoContable.addActionListener (new ButtonActionListener(this,"TiposRelacionesSaldoContable"));
			
		this.jComboBoxTiposAccionesSaldoContable.addActionListener (new ButtonActionListener(this,"TiposAccionesSaldoContable"));
					
		this.jComboBoxTiposSeleccionarSaldoContable.addActionListener (new ButtonActionListener(this,"TiposSeleccionarSaldoContable"));
			
		this.jTextFieldValorCampoGeneralSaldoContable.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralSaldoContable"));		
		
		
		if(this.jInternalFrameDetalleFormSaldoContable!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldoContable.jButtonidSaldoContableBusqueda.addActionListener(new ButtonActionListener(this,"idSaldoContableBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSaldoContable.jButtonid_empresaSaldoContableUpdate.addActionListener(new ButtonActionListener(this,"id_empresaSaldoContableUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldoContable.jButtonid_empresaSaldoContableBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaSaldoContableBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSaldoContable.jButtonid_sucursalSaldoContableUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalSaldoContableUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldoContable.jButtonid_sucursalSaldoContableBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalSaldoContableBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSaldoContable.jButtonid_ejercicioSaldoContableUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioSaldoContableUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldoContable.jButtonid_ejercicioSaldoContableBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioSaldoContableBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSaldoContable.jButtonid_periodoSaldoContableUpdate.addActionListener(new ButtonActionListener(this,"id_periodoSaldoContableUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldoContable.jButtonid_periodoSaldoContableBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoSaldoContableBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSaldoContable.jButtonid_anioSaldoContableUpdate.addActionListener(new ButtonActionListener(this,"id_anioSaldoContableUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldoContable.jButtonid_anioSaldoContableBusqueda.addActionListener(new ButtonActionListener(this,"id_anioSaldoContableBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSaldoContable.jButtonid_mesSaldoContableUpdate.addActionListener(new ButtonActionListener(this,"id_mesSaldoContableUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldoContable.jButtonid_mesSaldoContableBusqueda.addActionListener(new ButtonActionListener(this,"id_mesSaldoContableBusqueda"));
		//jButtonid_cuenta_contableSaldoContable.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contableSaldoContableActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormSaldoContable.jButtonid_cuenta_contableSaldoContable.addActionListener(new ButtonActionListener(this,"id_cuenta_contableSaldoContable"));
		//jButtonid_cuenta_contableSaldoContableArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContable("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormSaldoContable.jButtonid_cuenta_contableSaldoContableArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contableSaldoContableArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSaldoContable.jButtonid_cuenta_contableSaldoContableUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contableSaldoContableUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldoContable.jButtonid_cuenta_contableSaldoContableBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contableSaldoContableBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldoContable.jButtondebito_mone_localSaldoContableBusqueda.addActionListener(new ButtonActionListener(this,"debito_mone_localSaldoContableBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldoContable.jButtoncredito_mone_localSaldoContableBusqueda.addActionListener(new ButtonActionListener(this,"credito_mone_localSaldoContableBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldoContable.jButtonsaldo_mone_localSaldoContableBusqueda.addActionListener(new ButtonActionListener(this,"saldo_mone_localSaldoContableBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldoContable.jButtondebito_mone_extraSaldoContableBusqueda.addActionListener(new ButtonActionListener(this,"debito_mone_extraSaldoContableBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldoContable.jButtoncredito_mone_extraSaldoContableBusqueda.addActionListener(new ButtonActionListener(this,"credito_mone_extraSaldoContableBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldoContable.jButtonsaldo_mone_extraSaldoContableBusqueda.addActionListener(new ButtonActionListener(this,"saldo_mone_extraSaldoContableBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdCuentaContableSaldoContable.addActionListener(new ButtonActionListener(this,"FK_IdCuentaContableSaldoContable"));

			this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableSaldoContable.addActionListener(new ButtonActionListener(this,"id_cuenta_contableSaldoContable"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoSaldoContable!=null) {
				this.jInternalFrameReporteDinamicoSaldoContable.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoSaldoContable"));
				this.jInternalFrameReporteDinamicoSaldoContable.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoSaldoContable"));
				this.jInternalFrameReporteDinamicoSaldoContable.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoSaldoContable"));
			}
			
			//this.jButtonCerrarReporteDinamicoSaldoContable.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoSaldoContable"));				
			//this.jButtonGenerarReporteDinamicoSaldoContable.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoSaldoContable"));
			//this.jButtonGenerarExcelReporteDinamicoSaldoContable.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoSaldoContable"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionSaldoContable!=null) {
				this.jInternalFrameImportacionSaldoContable.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionSaldoContable"));
				this.jInternalFrameImportacionSaldoContable.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionSaldoContable"));
				this.jInternalFrameImportacionSaldoContable.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionSaldoContable"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderBySaldoContable.addActionListener (new ButtonActionListener(this,"AbrirOrderBySaldoContable"));
			
			this.jButtonAbrirOrderByToolBarSaldoContable.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarSaldoContable"));			
			
			if(this.jInternalFrameOrderBySaldoContable!=null) {
				this.jInternalFrameOrderBySaldoContable.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderBySaldoContable"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormSaldoContable!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormSaldoContable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSaldoContable.jTabbedPaneRelacionesSaldoContable.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesSaldoContable"));
		
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
            		closingInternalFrameSaldoContable();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormSaldoContable.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormSaldoContable = (JInternalFrameBase)event.getSource();
	            	
	            SaldoContableBeanSwingJInternalFrame jInternalFrameParent=(SaldoContableBeanSwingJInternalFrame)jInternalFrameDetalleFormSaldoContable.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarSaldoContableActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosSaldoContable.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosSaldoContableListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosSaldoContable.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosSaldoContable.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoSaldoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSaldoContableActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarSaldoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSaldoContableActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoSaldoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSaldoContableActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoSaldoContable";
		inputMap = this.jButtonNuevoSaldoContable.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoSaldoContable.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoSaldoContableActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesSaldoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSaldoContableActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarSaldoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSaldoContableActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesSaldoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSaldoContableActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesSaldoContable";
		inputMap = this.jButtonNuevoRelacionesSaldoContable.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesSaldoContable.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoSaldoContableActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarSaldoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarSaldoContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarSaldoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarSaldoContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarSaldoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarSaldoContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarSaldoContable";
		inputMap = this.jButtonModificarSaldoContable.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarSaldoContable.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarSaldoContableActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarSaldoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarSaldoContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarSaldoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarSaldoContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarSaldoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarSaldoContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarSaldoContable";
		inputMap = this.jButtonActualizarSaldoContable.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarSaldoContable.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarSaldoContableActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarSaldoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarSaldoContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarSaldoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarSaldoContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarSaldoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarSaldoContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarSaldoContable";
		inputMap = this.jButtonEliminarSaldoContable.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarSaldoContable.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarSaldoContableActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarSaldoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarSaldoContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarSaldoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarSaldoContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarSaldoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarSaldoContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarSaldoContable";
		inputMap = this.jButtonCancelarSaldoContable.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarSaldoContable.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarSaldoContableActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarSaldoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarSaldoContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarSaldoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarSaldoContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarSaldoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarSaldoContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarSaldoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarSaldoContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarSaldoContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarSaldoContable";
		inputMap = this.jButtonCerrarSaldoContable.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarSaldoContable.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarSaldoContableActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormSaldoContable.jButtonGuardarCambiosSaldoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSaldoContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarSaldoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSaldoContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosSaldoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSaldoContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaSaldoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSaldoContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarSaldoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSaldoContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaSaldoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSaldoContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosSaldoContable";
		inputMap = this.jInternalFrameDetalleFormSaldoContable.jButtonGuardarCambiosSaldoContable.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormSaldoContable.jButtonGuardarCambiosSaldoContable.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosSaldoContableActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionSaldoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionSaldoContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarSaldoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionSaldoContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionSaldoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionSaldoContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresSaldoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresSaldoContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarSaldoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresSaldoContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresSaldoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresSaldoContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesSaldoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesSaldoContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarSaldoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesSaldoContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesSaldoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesSaldoContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosSaldoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosSaldoContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarSaldoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosSaldoContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosSaldoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosSaldoContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosSaldoContable.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosSaldoContableItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesSaldoContable.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesSaldoContableActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarSaldoContable.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarSaldoContableActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralSaldoContable.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralSaldoContableActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldoContable.jButtonidSaldoContableBusqueda.addActionListener(new ButtonActionListener(this,"idSaldoContableBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSaldoContable.jButtonid_empresaSaldoContableUpdate.addActionListener(new ButtonActionListener(this,"id_empresaSaldoContableUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldoContable.jButtonid_empresaSaldoContableBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaSaldoContableBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSaldoContable.jButtonid_sucursalSaldoContableUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalSaldoContableUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldoContable.jButtonid_sucursalSaldoContableBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalSaldoContableBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSaldoContable.jButtonid_ejercicioSaldoContableUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioSaldoContableUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldoContable.jButtonid_ejercicioSaldoContableBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioSaldoContableBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSaldoContable.jButtonid_periodoSaldoContableUpdate.addActionListener(new ButtonActionListener(this,"id_periodoSaldoContableUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldoContable.jButtonid_periodoSaldoContableBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoSaldoContableBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSaldoContable.jButtonid_anioSaldoContableUpdate.addActionListener(new ButtonActionListener(this,"id_anioSaldoContableUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldoContable.jButtonid_anioSaldoContableBusqueda.addActionListener(new ButtonActionListener(this,"id_anioSaldoContableBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSaldoContable.jButtonid_mesSaldoContableUpdate.addActionListener(new ButtonActionListener(this,"id_mesSaldoContableUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldoContable.jButtonid_mesSaldoContableBusqueda.addActionListener(new ButtonActionListener(this,"id_mesSaldoContableBusqueda"));
		//jButtonid_cuenta_contableSaldoContable.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contableSaldoContableActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormSaldoContable.jButtonid_cuenta_contableSaldoContable.addActionListener(new ButtonActionListener(this,"id_cuenta_contableSaldoContable"));
		//jButtonid_cuenta_contableSaldoContableArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContable("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormSaldoContable.jButtonid_cuenta_contableSaldoContableArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contableSaldoContableArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSaldoContable.jButtonid_cuenta_contableSaldoContableUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contableSaldoContableUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldoContable.jButtonid_cuenta_contableSaldoContableBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contableSaldoContableBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldoContable.jButtondebito_mone_localSaldoContableBusqueda.addActionListener(new ButtonActionListener(this,"debito_mone_localSaldoContableBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldoContable.jButtoncredito_mone_localSaldoContableBusqueda.addActionListener(new ButtonActionListener(this,"credito_mone_localSaldoContableBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldoContable.jButtonsaldo_mone_localSaldoContableBusqueda.addActionListener(new ButtonActionListener(this,"saldo_mone_localSaldoContableBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldoContable.jButtondebito_mone_extraSaldoContableBusqueda.addActionListener(new ButtonActionListener(this,"debito_mone_extraSaldoContableBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldoContable.jButtoncredito_mone_extraSaldoContableBusqueda.addActionListener(new ButtonActionListener(this,"credito_mone_extraSaldoContableBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSaldoContable.jButtonsaldo_mone_extraSaldoContableBusqueda.addActionListener(new ButtonActionListener(this,"saldo_mone_extraSaldoContableBusqueda"));
		
		
		this.jButtonFK_IdCuentaContableSaldoContable.addActionListener(new ButtonActionListener(this,"FK_IdCuentaContableSaldoContable"));

		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableSaldoContable.addActionListener(new ButtonActionListener(this,"id_cuenta_contableSaldoContable"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoSaldoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoSaldoContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoSaldoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoSaldoContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoSaldoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoSaldoContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionSaldoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionSaldoContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionSaldoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionSaldoContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionSaldoContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionSaldoContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarSaldoContableActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarSaldoContable.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosSaldoContable(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(SaldoContable saldocontableAux:this.saldocontableLogic.getSaldoContables()) {
					saldocontableAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(SaldoContable saldocontableAux:saldocontables) {
					saldocontableAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosSaldoContableItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingSaldoContable(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(SaldoContable saldocontableAux:this.saldocontableLogic.getSaldoContables()) {
						saldocontableAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(SaldoContable saldocontableAux:saldocontables) {
						saldocontableAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(SaldoContable saldocontableAux:this.saldocontableLogic.getSaldoContables()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(SaldoContable saldocontableAux:saldocontables) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaSaldoContable(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosSaldoContable.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosSaldoContable.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosSaldoContable,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosSaldoContableItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingSaldoContable(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosSaldoContable.getSelectedRows();
			
			SaldoContable saldocontableLocal=new SaldoContable();
			
			//this.seleccionarTodosSaldoContable(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					saldocontableLocal =(SaldoContable) this.saldocontableLogic.getSaldoContables().toArray()[this.jTableDatosSaldoContable.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					saldocontableLocal =(SaldoContable) this.saldocontables.toArray()[this.jTableDatosSaldoContable.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				saldocontableLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(SaldoContable saldocontableAux:this.saldocontableLogic.getSaldoContables()) {
						saldocontableAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(SaldoContable saldocontableAux:saldocontables) {
						saldocontableAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaSaldoContable(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosSaldoContable.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosSaldoContable.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosSaldoContable,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualSaldoContableItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarSaldoContableParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralSaldoContableActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingSaldoContable(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralSaldoContable.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(SaldoContable saldocontableAux:this.saldocontableLogic.getSaldoContables()) {
				
						if(sTipoSeleccionar.equals(SaldoContableConstantesFunciones.LABEL_DEBITOMONELOCAL)) {
							existe=true;
							saldocontableAux.setdebito_mone_local(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SaldoContableConstantesFunciones.LABEL_CREDITOMONELOCAL)) {
							existe=true;
							saldocontableAux.setcredito_mone_local(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SaldoContableConstantesFunciones.LABEL_SALDOMONELOCAL)) {
							existe=true;
							saldocontableAux.setsaldo_mone_local(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SaldoContableConstantesFunciones.LABEL_DEBITOMONEEXTRA)) {
							existe=true;
							saldocontableAux.setdebito_mone_extra(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SaldoContableConstantesFunciones.LABEL_CREDITOMONEEXTRA)) {
							existe=true;
							saldocontableAux.setcredito_mone_extra(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SaldoContableConstantesFunciones.LABEL_SALDOMONEEXTRA)) {
							existe=true;
							saldocontableAux.setsaldo_mone_extra(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(SaldoContable saldocontableAux:saldocontables) {
					
						if(sTipoSeleccionar.equals(SaldoContableConstantesFunciones.LABEL_DEBITOMONELOCAL)) {
							existe=true;
							saldocontableAux.setdebito_mone_local(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SaldoContableConstantesFunciones.LABEL_CREDITOMONELOCAL)) {
							existe=true;
							saldocontableAux.setcredito_mone_local(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SaldoContableConstantesFunciones.LABEL_SALDOMONELOCAL)) {
							existe=true;
							saldocontableAux.setsaldo_mone_local(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SaldoContableConstantesFunciones.LABEL_DEBITOMONEEXTRA)) {
							existe=true;
							saldocontableAux.setdebito_mone_extra(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SaldoContableConstantesFunciones.LABEL_CREDITOMONEEXTRA)) {
							existe=true;
							saldocontableAux.setcredito_mone_extra(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SaldoContableConstantesFunciones.LABEL_SALDOMONEEXTRA)) {
							existe=true;
							saldocontableAux.setsaldo_mone_extra(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaSaldoContable(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesSaldoContableActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingSaldoContable(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioSaldoContable=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesSaldoContable.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormSaldoContable.jComboBoxTiposAccionesFormularioSaldoContable.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteSaldoContable) {				
					conSplash=true;//false;										
					
					//this.startProcessSaldoContable(conSplash);
				
					this.generarReporteSaldoContablesSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSaldoContable.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSaldoContable.jComboBoxTiposAccionesFormularioSaldoContable.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoSaldoContablesSeleccionados();
				//this.jComboBoxTiposAccionesSaldoContable.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoSaldoContablesSeleccionados(false);
				//this.jComboBoxTiposAccionesSaldoContable.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoSaldoContablesSeleccionados(true);
				//this.jComboBoxTiposAccionesSaldoContable.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessSaldoContable();
				
				this.exportarSaldoContablesSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSaldoContable.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSaldoContable.jComboBoxTiposAccionesFormularioSaldoContable.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionSaldoContables();
				//this.importarSaldoContables();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSaldoContable.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSaldoContable.jComboBoxTiposAccionesFormularioSaldoContable.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessSaldoContable();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelSaldoContablesSeleccionados();
				//this.jComboBoxTiposAccionesSaldoContable.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Saldo Contable", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessSaldoContable();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoSaldoContable)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeySaldoContable(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Saldo Contable",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSaldoContable.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSaldoContable.jComboBoxTiposAccionesFormularioSaldoContable.setSelectedIndex(0);					
				}	
			} 			
			else if(SaldoContableBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteSaldoContable) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessSaldoContable(conSplash);
					
						//this.actualizarParametrosGeneralSaldoContable();
						
						this.generarReporteProcesoAccionSaldoContablesSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesSaldoContable.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormSaldoContable.jComboBoxTiposAccionesFormularioSaldoContable.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(SaldoContableBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Saldo ContableS SELECCIONADOS?", "MANTENIMIENTO DE Saldo Contable", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessSaldoContable();
				
						this.actualizarParametrosGeneralSaldoContable();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.saldocontableReturnGeneral=saldocontableLogic.procesarAccionSaldoContablesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.saldocontableLogic.getSaldoContables(),this.saldocontableParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarSaldoContableReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesSaldoContable.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormSaldoContable.jComboBoxTiposAccionesFormularioSaldoContable.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralSaldoContable();
					
					SaldoContableBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarSaldoContableReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesSaldoContable.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormSaldoContable.jComboBoxTiposAccionesFormularioSaldoContable.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessSaldoContable(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesSaldoContableActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessSaldoContable();
			
			if(this.jInternalFrameDetalleFormSaldoContable==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<SaldoContable> saldocontablesSeleccionados=new ArrayList<SaldoContable>();		
			SaldoContable saldocontable=new SaldoContable();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingSaldoContable(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesSaldoContable.getSelectedItem();
			
			
			
			
			saldocontablesSeleccionados=this.getSaldoContablesSeleccionados(true);
			//this.sTipoAccion;
			
			if(saldocontablesSeleccionados.size()==1) {
				for(SaldoContable saldocontableAux:saldocontablesSeleccionados) {
					saldocontable=saldocontableAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessSaldoContable();
			
      		//this.finishProcessSaldoContable(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarSaldoContableReturnGeneral() throws Exception {
		if(this.saldocontableReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.saldocontableReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.saldocontableReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.saldocontableReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.saldocontableReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.saldocontableReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingSaldoContable(false);
		}
		
		if(this.saldocontableReturnGeneral.getConRetornoLista() || this.saldocontableReturnGeneral.getConRetornoObjeto()) {
			if(this.saldocontableReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.saldocontableLogic.setSaldoContables(this.saldocontableReturnGeneral.getSaldoContables());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.saldocontableReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.saldocontableLogic.setSaldoContable(this.saldocontableReturnGeneral.getSaldoContable());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingSaldoContable(false);
		}
	}
	
	public void actualizarParametrosGeneralSaldoContable() throws Exception {
		
		
	}
	
	public ArrayList<SaldoContable> getSaldoContablesSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<SaldoContable> saldocontablesSeleccionados=new ArrayList<SaldoContable>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioSaldoContable) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(SaldoContable saldocontableAux:saldocontableLogic.getSaldoContables()) {
					if(saldocontableAux.getIsSelected()) {
						saldocontablesSeleccionados.add(saldocontableAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(SaldoContable saldocontableAux:this.saldocontables) {
					if(saldocontableAux.getIsSelected()) {
						saldocontablesSeleccionados.add(saldocontableAux);				
					}
				}
			}
			
			if(saldocontablesSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						saldocontablesSeleccionados.addAll(this.saldocontableLogic.getSaldoContables());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						saldocontablesSeleccionados.addAll(this.saldocontables);				
					}
				}
			}
		} else {
			saldocontablesSeleccionados.add(this.saldocontable);
		}
		
		return saldocontablesSeleccionados;
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
	
	public void generarReporteSaldoContablesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalSaldoContablesSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoSaldoContablesSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoSaldoContablesSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoSaldoContablesSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Saldo Contable",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesSaldoContablesSeleccionados() throws Exception {
		ArrayList<SaldoContable> saldocontablesSeleccionados=new ArrayList<SaldoContable>();		
		
		saldocontablesSeleccionados=this.getSaldoContablesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteSaldoContables("Todos",saldocontablesSeleccionados);
		
	}	
	
	public void generarReporteNormalSaldoContablesSeleccionados() throws Exception {
		ArrayList<SaldoContable> saldocontablesSeleccionados=new ArrayList<SaldoContable>();		
		
		saldocontablesSeleccionados=this.getSaldoContablesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteSaldoContables("Todos",saldocontablesSeleccionados);
	}		
	
	public void generarReporteProcesoAccionSaldoContablesSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<SaldoContable> saldocontablesSeleccionados=new ArrayList<SaldoContable>();
		
		saldocontablesSeleccionados=this.getSaldoContablesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteSaldoContables("Todos",saldocontablesSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoSaldoContablesSeleccionados() throws Exception {
		ArrayList<SaldoContable> saldocontablesSeleccionados=new ArrayList<SaldoContable>();		
		
		
		this.abrirInicializarFrameReporteDinamicoSaldoContable();
		
		
		saldocontablesSeleccionados=this.getSaldoContablesSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoSaldoContable();
		
		
		//this.generarReporteSaldoContables("Todos",saldocontablesSeleccionados ,saldocontableImplementable,saldocontableImplementableHome);
	}
	
	public void mostrarImportacionSaldoContables() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionSaldoContable();
		
		this.abrirFrameImportacionSaldoContable();		
		
			
		//this.generarReporteSaldoContables("Todos",saldocontablesSeleccionados ,saldocontableImplementable,saldocontableImplementableHome);
	}
	
	public void importarSaldoContables() throws Exception {		
	
	}
	
	public void exportarSaldoContablesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelSaldoContablesSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoSaldoContablesSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlSaldoContablesSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Saldo Contable",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoSaldoContablesSeleccionados() throws Exception {
		ArrayList<SaldoContable> saldocontablesSeleccionados=new ArrayList<SaldoContable>();		
		
		saldocontablesSeleccionados=this.getSaldoContablesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"saldocontable."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarSaldoContable(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(SaldoContable saldocontableAux:saldocontablesSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarSaldoContable(saldocontableAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//saldocontableAux.setsDetalleGeneralEntityReporte(saldocontableAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.saldocontableSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Saldo Contable",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarSaldoContable(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=SaldoContableConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SaldoContableConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SaldoContableConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SaldoContableConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SaldoContableConstantesFunciones.LABEL_IDEJERCICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SaldoContableConstantesFunciones.LABEL_IDPERIODO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SaldoContableConstantesFunciones.LABEL_IDANIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SaldoContableConstantesFunciones.LABEL_IDMES;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SaldoContableConstantesFunciones.LABEL_IDCUENTACONTABLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SaldoContableConstantesFunciones.LABEL_DEBITOMONELOCAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SaldoContableConstantesFunciones.LABEL_CREDITOMONELOCAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SaldoContableConstantesFunciones.LABEL_SALDOMONELOCAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SaldoContableConstantesFunciones.LABEL_DEBITOMONEEXTRA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SaldoContableConstantesFunciones.LABEL_CREDITOMONEEXTRA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SaldoContableConstantesFunciones.LABEL_SALDOMONEEXTRA;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarSaldoContable(SaldoContable saldocontable,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=saldocontable.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=saldocontable.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=saldocontable.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=saldocontable.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=saldocontable.getejercicio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=saldocontable.getperiodo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=saldocontable.getanio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=saldocontable.getmes_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=saldocontable.getcuentacontable_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=saldocontable.getdebito_mone_local().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=saldocontable.getcredito_mone_local().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=saldocontable.getsaldo_mone_local().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=saldocontable.getdebito_mone_extra().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=saldocontable.getcredito_mone_extra().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=saldocontable.getsaldo_mone_extra().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelSaldoContablesSeleccionados() throws Exception {
		ArrayList<SaldoContable> saldocontablesSeleccionados=new ArrayList<SaldoContable>();		
		
		saldocontablesSeleccionados=this.getSaldoContablesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"saldocontable.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("SaldoContables");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelSaldoContable(row);				
				iRow++;
			}				
			
			for(SaldoContable saldocontableAux:saldocontablesSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelSaldoContable(saldocontableAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.saldocontableSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Saldo Contable",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlSaldoContablesSeleccionados() throws Exception {
		ArrayList<SaldoContable> saldocontablesSeleccionados=new ArrayList<SaldoContable>();		
		
		saldocontablesSeleccionados=this.getSaldoContablesSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"saldocontable.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("saldocontables");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("saldocontable");
			//elementRoot.appendChild(element);
		
			for(SaldoContable saldocontableAux:saldocontablesSeleccionados) {
				element = document.createElement("saldocontable");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlSaldoContable(saldocontableAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.saldocontableSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Saldo Contable",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelSaldoContable(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(SaldoContableConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(SaldoContableConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(SaldoContableConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(SaldoContableConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(SaldoContableConstantesFunciones.LABEL_IDEJERCICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(SaldoContableConstantesFunciones.LABEL_IDPERIODO);
		cell = row.createCell(iColumn++);cell.setCellValue(SaldoContableConstantesFunciones.LABEL_IDANIO);
		cell = row.createCell(iColumn++);cell.setCellValue(SaldoContableConstantesFunciones.LABEL_IDMES);
		cell = row.createCell(iColumn++);cell.setCellValue(SaldoContableConstantesFunciones.LABEL_IDCUENTACONTABLE);
		cell = row.createCell(iColumn++);cell.setCellValue(SaldoContableConstantesFunciones.LABEL_DEBITOMONELOCAL);
		cell = row.createCell(iColumn++);cell.setCellValue(SaldoContableConstantesFunciones.LABEL_CREDITOMONELOCAL);
		cell = row.createCell(iColumn++);cell.setCellValue(SaldoContableConstantesFunciones.LABEL_SALDOMONELOCAL);
		cell = row.createCell(iColumn++);cell.setCellValue(SaldoContableConstantesFunciones.LABEL_DEBITOMONEEXTRA);
		cell = row.createCell(iColumn++);cell.setCellValue(SaldoContableConstantesFunciones.LABEL_CREDITOMONEEXTRA);
		cell = row.createCell(iColumn++);cell.setCellValue(SaldoContableConstantesFunciones.LABEL_SALDOMONEEXTRA);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelSaldoContable(SaldoContable saldocontable,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(saldocontable.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(saldocontable.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(saldocontable.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(saldocontable.getejercicio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(saldocontable.getperiodo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(saldocontable.getanio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(saldocontable.getmes_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(saldocontable.getcuentacontable_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(saldocontable.getdebito_mone_local());
		cell = row.createCell(iColumn++);cell.setCellValue(saldocontable.getcredito_mone_local());
		cell = row.createCell(iColumn++);cell.setCellValue(saldocontable.getsaldo_mone_local());
		cell = row.createCell(iColumn++);cell.setCellValue(saldocontable.getdebito_mone_extra());
		cell = row.createCell(iColumn++);cell.setCellValue(saldocontable.getcredito_mone_extra());
		cell = row.createCell(iColumn++);cell.setCellValue(saldocontable.getsaldo_mone_extra());				
	}
	
	public void setFilaDatosExportarXmlSaldoContable(SaldoContable saldocontable,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(SaldoContableConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(saldocontable.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(SaldoContableConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(saldocontable.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(SaldoContableConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(saldocontable.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(SaldoContableConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(saldocontable.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementejercicio_descripcion = document.createElement(SaldoContableConstantesFunciones.IDEJERCICIO);
		elementejercicio_descripcion.appendChild(document.createTextNode(saldocontable.getejercicio_descripcion()));
		element.appendChild(elementejercicio_descripcion);

		Element elementperiodo_descripcion = document.createElement(SaldoContableConstantesFunciones.IDPERIODO);
		elementperiodo_descripcion.appendChild(document.createTextNode(saldocontable.getperiodo_descripcion()));
		element.appendChild(elementperiodo_descripcion);

		Element elementanio_descripcion = document.createElement(SaldoContableConstantesFunciones.IDANIO);
		elementanio_descripcion.appendChild(document.createTextNode(saldocontable.getanio_descripcion()));
		element.appendChild(elementanio_descripcion);

		Element elementmes_descripcion = document.createElement(SaldoContableConstantesFunciones.IDMES);
		elementmes_descripcion.appendChild(document.createTextNode(saldocontable.getmes_descripcion()));
		element.appendChild(elementmes_descripcion);

		Element elementcuentacontable_descripcion = document.createElement(SaldoContableConstantesFunciones.IDCUENTACONTABLE);
		elementcuentacontable_descripcion.appendChild(document.createTextNode(saldocontable.getcuentacontable_descripcion()));
		element.appendChild(elementcuentacontable_descripcion);

		Element elementdebito_mone_local = document.createElement(SaldoContableConstantesFunciones.DEBITOMONELOCAL);
		elementdebito_mone_local.appendChild(document.createTextNode(saldocontable.getdebito_mone_local().toString().trim()));
		element.appendChild(elementdebito_mone_local);

		Element elementcredito_mone_local = document.createElement(SaldoContableConstantesFunciones.CREDITOMONELOCAL);
		elementcredito_mone_local.appendChild(document.createTextNode(saldocontable.getcredito_mone_local().toString().trim()));
		element.appendChild(elementcredito_mone_local);

		Element elementsaldo_mone_local = document.createElement(SaldoContableConstantesFunciones.SALDOMONELOCAL);
		elementsaldo_mone_local.appendChild(document.createTextNode(saldocontable.getsaldo_mone_local().toString().trim()));
		element.appendChild(elementsaldo_mone_local);

		Element elementdebito_mone_extra = document.createElement(SaldoContableConstantesFunciones.DEBITOMONEEXTRA);
		elementdebito_mone_extra.appendChild(document.createTextNode(saldocontable.getdebito_mone_extra().toString().trim()));
		element.appendChild(elementdebito_mone_extra);

		Element elementcredito_mone_extra = document.createElement(SaldoContableConstantesFunciones.CREDITOMONEEXTRA);
		elementcredito_mone_extra.appendChild(document.createTextNode(saldocontable.getcredito_mone_extra().toString().trim()));
		element.appendChild(elementcredito_mone_extra);

		Element elementsaldo_mone_extra = document.createElement(SaldoContableConstantesFunciones.SALDOMONEEXTRA);
		elementsaldo_mone_extra.appendChild(document.createTextNode(saldocontable.getsaldo_mone_extra().toString().trim()));
		element.appendChild(elementsaldo_mone_extra);
	}
	
	public void generarReporteGroupGenericoSaldoContablesSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<SaldoContable> saldocontablesSeleccionados=new ArrayList<SaldoContable>();
		
		saldocontablesSeleccionados=this.getSaldoContablesSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoSaldoContable(saldocontablesSeleccionados);
		
		this.generarReporteSaldoContables("Todos",saldocontablesSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoSaldoContable(ArrayList<SaldoContable> saldocontablesSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(SaldoContable saldocontableAux:saldocontablesSeleccionados) {
				saldocontableAux.setsDetalleGeneralEntityReporte(saldocontableAux.toString());
			
				if(sTipoSeleccionar.equals(SaldoContableConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					saldocontableAux.setsDescripcionGeneralEntityReporte1(saldocontableAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SaldoContableConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					saldocontableAux.setsDescripcionGeneralEntityReporte1(saldocontableAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SaldoContableConstantesFunciones.LABEL_IDEJERCICIO)) {
					existe=true;
					saldocontableAux.setsDescripcionGeneralEntityReporte1(saldocontableAux.getejercicio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SaldoContableConstantesFunciones.LABEL_IDPERIODO)) {
					existe=true;
					saldocontableAux.setsDescripcionGeneralEntityReporte1(saldocontableAux.getperiodo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SaldoContableConstantesFunciones.LABEL_IDANIO)) {
					existe=true;
					saldocontableAux.setsDescripcionGeneralEntityReporte1(saldocontableAux.getanio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SaldoContableConstantesFunciones.LABEL_IDMES)) {
					existe=true;
					saldocontableAux.setsDescripcionGeneralEntityReporte1(saldocontableAux.getmes_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SaldoContableConstantesFunciones.LABEL_IDCUENTACONTABLE)) {
					existe=true;
					saldocontableAux.setsDescripcionGeneralEntityReporte1(saldocontableAux.getcuentacontable_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SaldoContableConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesSaldoContable(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoSaldoContable=true;
				this.isVisibilidadCeldaNuevoRelacionesSaldoContable=true;
				this.isVisibilidadCeldaGuardarCambiosSaldoContable=true;
			}
			
			this.isVisibilidadCeldaModificarSaldoContable=false;
			this.isVisibilidadCeldaActualizarSaldoContable=false;
			this.isVisibilidadCeldaEliminarSaldoContable=false;
			this.isVisibilidadCeldaCancelarSaldoContable=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSaldoContable=true;
				} else {
					this.isVisibilidadCeldaGuardarSaldoContable=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoSaldoContable=false;
			this.isVisibilidadCeldaNuevoRelacionesSaldoContable=false;
			this.isVisibilidadCeldaGuardarCambiosSaldoContable=false;
			this.isVisibilidadCeldaModificarSaldoContable=false;
			this.isVisibilidadCeldaActualizarSaldoContable=true;
			this.isVisibilidadCeldaEliminarSaldoContable=false;
			this.isVisibilidadCeldaCancelarSaldoContable=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSaldoContable=true;
				} else {
					this.isVisibilidadCeldaGuardarSaldoContable=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoSaldoContable=false;
			this.isVisibilidadCeldaNuevoRelacionesSaldoContable=false;
			this.isVisibilidadCeldaGuardarCambiosSaldoContable=false;
			this.isVisibilidadCeldaModificarSaldoContable=false;
			this.isVisibilidadCeldaActualizarSaldoContable=true;
			this.isVisibilidadCeldaEliminarSaldoContable=true;
			this.isVisibilidadCeldaCancelarSaldoContable=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSaldoContable=true;
				} else {
					this.isVisibilidadCeldaGuardarSaldoContable=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoSaldoContable=false;
			this.isVisibilidadCeldaNuevoRelacionesSaldoContable=false;
			this.isVisibilidadCeldaGuardarCambiosSaldoContable=false;
			this.isVisibilidadCeldaModificarSaldoContable=false;
			this.isVisibilidadCeldaActualizarSaldoContable=true;
			this.isVisibilidadCeldaEliminarSaldoContable=false;
			this.isVisibilidadCeldaCancelarSaldoContable=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSaldoContable=false;
				} else {
					this.isVisibilidadCeldaGuardarSaldoContable=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoSaldoContable=true;
			this.isVisibilidadCeldaNuevoRelacionesSaldoContable=true;
			this.isVisibilidadCeldaGuardarCambiosSaldoContable=true;
			this.isVisibilidadCeldaModificarSaldoContable=false;
			this.isVisibilidadCeldaActualizarSaldoContable=false;
			this.isVisibilidadCeldaEliminarSaldoContable=false;
			this.isVisibilidadCeldaCancelarSaldoContable=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSaldoContable=true;
				} else {
					this.isVisibilidadCeldaGuardarSaldoContable=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoSaldoContable=false;
			this.isVisibilidadCeldaNuevoRelacionesSaldoContable=false;
			this.isVisibilidadCeldaGuardarCambiosSaldoContable=false;
			this.isVisibilidadCeldaActualizarSaldoContable=false;
			this.isVisibilidadCeldaEliminarSaldoContable=false;
			this.isVisibilidadCeldaCancelarSaldoContable=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSaldoContable=false;
				} else {
					this.isVisibilidadCeldaGuardarSaldoContable=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoSaldoContable=false;
			this.isVisibilidadCeldaNuevoRelacionesSaldoContable=false;
			this.isVisibilidadCeldaGuardarCambiosSaldoContable=false;
			this.isVisibilidadCeldaModificarSaldoContable=true;
			this.isVisibilidadCeldaActualizarSaldoContable=false;
			this.isVisibilidadCeldaEliminarSaldoContable=false;
			this.isVisibilidadCeldaCancelarSaldoContable=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSaldoContable=false;
				} else {
					this.isVisibilidadCeldaGuardarSaldoContable=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(SaldoContableJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoSaldoContable=true;
			this.isVisibilidadCeldaNuevoRelacionesSaldoContable=true;
			this.isVisibilidadCeldaGuardarCambiosSaldoContable=true;
		} else {
			this.actualizarEstadoPanelsSaldoContable(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarSaldoContable=false;
			//this.isVisibilidadCeldaVerFormSaldoContable=false;
			this.isVisibilidadCeldaDuplicarSaldoContable=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!saldocontableSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesSaldoContable=false;
		} else {
			this.isVisibilidadCeldaNuevoSaldoContable=false;
			this.isVisibilidadCeldaGuardarCambiosSaldoContable=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(saldocontableSessionBean.getEsGuardarRelacionado()) {
			if(!saldocontableSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesSaldoContable=false;												
			}
			
			this.jButtonCerrarSaldoContable.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesSaldoContable=false;
		}
		
		if(!this.permiteMantenimiento(this.saldocontable)) {
			this.isVisibilidadCeldaActualizarSaldoContable=false;
			this.isVisibilidadCeldaEliminarSaldoContable=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesSaldoContable() {
	}
	
	public void actualizarEstadoPanelsSaldoContable(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionSaldoContable!=null) {
				this.jScrollPanelDatosEdicionSaldoContable.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSaldoContable!=null) {
				this.jTabbedPaneBusquedasSaldoContable.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSaldoContable!=null) {
				this.jScrollPanelDatosSaldoContable.setVisible(true);
			}
			
			if(this.jPanelPaginacionSaldoContable!=null) {
				this.jPanelPaginacionSaldoContable.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSaldoContable!=null) {
				this.jPanelParametrosReportesSaldoContable.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionSaldoContable!=null) {
				this.jScrollPanelDatosEdicionSaldoContable.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSaldoContable!=null) {
				this.jTabbedPaneBusquedasSaldoContable.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosSaldoContable!=null) {
				this.jScrollPanelDatosSaldoContable.setVisible(false);
			}
			
			if(this.jPanelPaginacionSaldoContable!=null) {
				this.jPanelPaginacionSaldoContable.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesSaldoContable!=null) {
				this.jPanelParametrosReportesSaldoContable.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionSaldoContable!=null) {
				this.jScrollPanelDatosEdicionSaldoContable.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSaldoContable!=null) {
				this.jTabbedPaneBusquedasSaldoContable.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosSaldoContable!=null) {
				this.jScrollPanelDatosSaldoContable.setVisible(false);
			}
			
			if(this.jPanelPaginacionSaldoContable!=null) {
				this.jPanelPaginacionSaldoContable.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesSaldoContable!=null) {
				this.jPanelParametrosReportesSaldoContable.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionSaldoContable!=null) {
				this.jScrollPanelDatosEdicionSaldoContable.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSaldoContable!=null) {
				this.jTabbedPaneBusquedasSaldoContable.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosSaldoContable!=null) {
				this.jScrollPanelDatosSaldoContable.setVisible(false);
			}
			
			if(this.jPanelPaginacionSaldoContable!=null) {
				this.jPanelPaginacionSaldoContable.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesSaldoContable!=null) {
				this.jPanelParametrosReportesSaldoContable.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionSaldoContable!=null) {
				this.jScrollPanelDatosEdicionSaldoContable.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSaldoContable!=null) {
				this.jTabbedPaneBusquedasSaldoContable.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSaldoContable!=null) {
				this.jScrollPanelDatosSaldoContable.setVisible(true);
			}
			
			if(this.jPanelPaginacionSaldoContable!=null) {
				this.jPanelPaginacionSaldoContable.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSaldoContable!=null) {
				this.jPanelParametrosReportesSaldoContable.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionSaldoContable!=null) {
				this.jScrollPanelDatosEdicionSaldoContable.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSaldoContable!=null) {
				this.jTabbedPaneBusquedasSaldoContable.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSaldoContable!=null) {
				this.jScrollPanelDatosSaldoContable.setVisible(true);
			}
			
			if(this.jPanelPaginacionSaldoContable!=null) {
				this.jPanelPaginacionSaldoContable.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSaldoContable!=null) {
				this.jPanelParametrosReportesSaldoContable.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionSaldoContable!=null) {
				this.jScrollPanelDatosEdicionSaldoContable.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSaldoContable!=null) {
				this.jTabbedPaneBusquedasSaldoContable.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSaldoContable!=null) {
				this.jScrollPanelDatosSaldoContable.setVisible(true);
			}
			
			if(this.jPanelPaginacionSaldoContable!=null) {
				this.jPanelPaginacionSaldoContable.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSaldoContable!=null) {
				this.jPanelParametrosReportesSaldoContable.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.saldocontableSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasSaldoContable!=null) {
					this.jTabbedPaneBusquedasSaldoContable.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesSaldoContable!=null) {
				this.jPanelParametrosReportesSaldoContable.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.saldocontableSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSaldoContable!=null) {
				this.jTabbedPaneBusquedasSaldoContable.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesSaldoContable!=null) {
				this.jPanelParametrosReportesSaldoContable.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdCuentaContable=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasSaldoContable.remove(jPanelFK_IdCuentaContableSaldoContable);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdCuentaContable=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasSaldoContable.remove(jPanelFK_IdCuentaContableSaldoContable);}
		}
		
	}

	public void setVisibilidadBusquedasParaEjercicio(Boolean isParaEjercicio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEjercicioNegation=!isParaEjercicio;

			this.isVisibilidadFK_IdCuentaContable=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasSaldoContable.remove(jPanelFK_IdCuentaContableSaldoContable);}
		}
		
	}

	public void setVisibilidadBusquedasParaPeriodo(Boolean isParaPeriodo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPeriodoNegation=!isParaPeriodo;

			this.isVisibilidadFK_IdCuentaContable=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasSaldoContable.remove(jPanelFK_IdCuentaContableSaldoContable);}
		}
		
	}

	public void setVisibilidadBusquedasParaAnio(Boolean isParaAnio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaAnioNegation=!isParaAnio;

			this.isVisibilidadFK_IdCuentaContable=isParaAnioNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasSaldoContable.remove(jPanelFK_IdCuentaContableSaldoContable);}
		}
		
	}

	public void setVisibilidadBusquedasParaMes(Boolean isParaMes){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaMesNegation=!isParaMes;

			this.isVisibilidadFK_IdCuentaContable=isParaMesNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasSaldoContable.remove(jPanelFK_IdCuentaContableSaldoContable);}
		}
		
	}

	public void setVisibilidadBusquedasParaCuentaContable(Boolean isParaCuentaContable){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCuentaContableNegation=!isParaCuentaContable;

			this.isVisibilidadFK_IdCuentaContable=isParaCuentaContable;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasSaldoContable.remove(jPanelFK_IdCuentaContableSaldoContable);}
		}
		
	}
	
	
	
	

	public String registrarSesionSaldoContableParaBusquedaCuentaContables() throws Exception {
		Boolean isPaginaPopupCuentaContable=false;

		try {

			if(saldocontableSessionBean==null) {
				saldocontableSessionBean=new SaldoContableSessionBean();
			}

			if(cuentacontableSessionBean==null) {
				cuentacontableSessionBean=new CuentaContableSessionBean();
			}

			cuentacontableSessionBean.setsPathNavegacionActual(saldocontableSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+CuentaContableConstantesFunciones.SCLASSWEBTITULO);
			cuentacontableSessionBean.setisPermiteRecargarInformacion(false);
			cuentacontableSessionBean.setisPaginaPopup(true);
			isPaginaPopupCuentaContable=cuentacontableSessionBean.getisPaginaPopup();
			cuentacontableSessionBean.setisPaginaPopup(false);
			cuentacontableSessionBean.setEstaModoBusqueda(true);
			cuentacontableSessionBean.setsFuncionBusquedaRapida("window.opener.saldocontableFuncionGeneral.setCombosCodigoDesdeBusquedaid_cuenta_contable(TO_REPLACE);");
			cuentacontableSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCuentaContable(true);
			cuentacontableSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaContable(SaldoContableConstantesFunciones.SNOMBREOPCION);
			//cuentacontableSessionBean.setisBusquedaDesdeForeignKeySesionSaldoContable(true);
			//cuentacontableSessionBean.setlidSaldoContableActual(this.idSaldoContableActual);

			saldocontableSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeySaldoContable(true);
			saldocontableSessionBean.setlIdSaldoContableActualForeignKey(this.idSaldoContableActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//SaldoContableSessionBean saldocontableSessionBean=new SaldoContableSessionBean();
		
		if(this.saldocontableSessionBean==null) {
			this.saldocontableSessionBean=new SaldoContableSessionBean();
		}
		
		this.saldocontableSessionBean.setsUltimaBusquedaSaldoContable(this.getsAccionBusqueda());
		this.saldocontableSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.saldocontableSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdCuentaContable")) {
			saldocontableSessionBean.setid_cuenta_contable(this.getid_cuenta_contableFK_IdCuentaContable());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEjercicio")) {
			saldocontableSessionBean.setid_ejercicio(this.getid_ejercicioFK_IdEjercicio());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			saldocontableSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdPeriodo")) {
			saldocontableSessionBean.setid_periodo(this.getid_periodoFK_IdPeriodo());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			saldocontableSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//SaldoContableSessionBean saldocontableSessionBean=new SaldoContableSessionBean();
		
		if(this.saldocontableSessionBean==null) {
			this.saldocontableSessionBean=new SaldoContableSessionBean();
		}
		
		if(this.saldocontableSessionBean.getsUltimaBusquedaSaldoContable()!=null&&!this.saldocontableSessionBean.getsUltimaBusquedaSaldoContable().equals("")) {
			this.setsAccionBusqueda(saldocontableSessionBean.getsUltimaBusquedaSaldoContable());
			this.setiNumeroPaginacion(saldocontableSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(saldocontableSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdCuentaContable")) {
				this.setid_cuenta_contableFK_IdCuentaContable(saldocontableSessionBean.getid_cuenta_contable());
				saldocontableSessionBean.setid_cuenta_contable(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEjercicio")) {
				this.setid_ejercicioFK_IdEjercicio(saldocontableSessionBean.getid_ejercicio());
				saldocontableSessionBean.setid_ejercicio(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(saldocontableSessionBean.getid_empresa());
				saldocontableSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdPeriodo")) {
				this.setid_periodoFK_IdPeriodo(saldocontableSessionBean.getid_periodo());
				saldocontableSessionBean.setid_periodo(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(saldocontableSessionBean.getid_sucursal());
				saldocontableSessionBean.setid_sucursal(-1L);
			}
		}
		
		this.saldocontableSessionBean.setsUltimaBusquedaSaldoContable("");
		this.saldocontableSessionBean.setiNumeroPaginacion(SaldoContableConstantesFunciones.INUMEROPAGINACION);
		this.saldocontableSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaSaldoContable(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioSaldoContable() {
		this.updateBorderResaltarBusquedasFormularioSaldoContable();
		this.updateVisibilidadBusquedasFormularioSaldoContable();
		this.updateHabilitarBusquedasFormularioSaldoContable();
	}
	
	public void updateBorderResaltarBusquedasFormularioSaldoContable() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasSaldoContable.getComponents().length>0) {
	

		if(this.saldocontableConstantesFunciones.resaltarFK_IdCuentaContableSaldoContable!=null) {
			index= this.jTabbedPaneBusquedasSaldoContable.indexOfComponent(this.jPanelFK_IdCuentaContableSaldoContable);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSaldoContable.getComponent(index);
				jPanel.setBorder(this.saldocontableConstantesFunciones.resaltarFK_IdCuentaContableSaldoContable);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioSaldoContable() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasSaldoContable.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasSaldoContable.indexOfComponent(this.jPanelFK_IdCuentaContableSaldoContable);
			jPanel=(JPanel)this.jTabbedPaneBusquedasSaldoContable.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.saldocontableConstantesFunciones.mostrarFK_IdCuentaContableSaldoContable);
			if(!this.saldocontableConstantesFunciones.mostrarFK_IdCuentaContableSaldoContable && index>-1) {
				this.jTabbedPaneBusquedasSaldoContable.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioSaldoContable() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasSaldoContable.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasSaldoContable.indexOfComponent(this.jPanelFK_IdCuentaContableSaldoContable);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasSaldoContable.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.saldocontableConstantesFunciones.activarFK_IdCuentaContableSaldoContable);
				this.jTabbedPaneBusquedasSaldoContable.setEnabledAt(index,this.saldocontableConstantesFunciones.activarFK_IdCuentaContableSaldoContable);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaSaldoContable(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdCuentaContable")) {
			index= this.jTabbedPaneBusquedasSaldoContable.indexOfComponent(this.jPanelFK_IdCuentaContableSaldoContable);

			this.jTabbedPaneBusquedasSaldoContable.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSaldoContable.getComponent(index);

			this.saldocontableConstantesFunciones.setResaltarFK_IdCuentaContableSaldoContable(resaltar);

			jPanel.setBorder(this.saldocontableConstantesFunciones.resaltarFK_IdCuentaContableSaldoContable);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarSaldoContable.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioSaldoContable() throws Exception {

		if(this.jInternalFrameDetalleFormSaldoContable==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioSaldoContable();
		this.updateVisibilidadResaltarControlesFormularioSaldoContable();
		this.updateHabilitarResaltarControlesFormularioSaldoContable();
		
	}
	
	public void updateBorderResaltarControlesFormularioSaldoContable() throws Exception {
		if(this.jInternalFrameDetalleFormSaldoContable==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.saldocontableConstantesFunciones.resaltaridSaldoContable!=null && this.jInternalFrameDetalleFormSaldoContable!=null) {this.jInternalFrameDetalleFormSaldoContable.jLabelidSaldoContable.setBorder(this.saldocontableConstantesFunciones.resaltaridSaldoContable);}
		if(this.saldocontableConstantesFunciones.resaltarid_empresaSaldoContable!=null && this.jInternalFrameDetalleFormSaldoContable!=null) {this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_empresaSaldoContable.setBorder(this.saldocontableConstantesFunciones.resaltarid_empresaSaldoContable);}
		if(this.saldocontableConstantesFunciones.resaltarid_sucursalSaldoContable!=null && this.jInternalFrameDetalleFormSaldoContable!=null) {this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_sucursalSaldoContable.setBorder(this.saldocontableConstantesFunciones.resaltarid_sucursalSaldoContable);}
		if(this.saldocontableConstantesFunciones.resaltarid_ejercicioSaldoContable!=null && this.jInternalFrameDetalleFormSaldoContable!=null) {this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_ejercicioSaldoContable.setBorder(this.saldocontableConstantesFunciones.resaltarid_ejercicioSaldoContable);}
		if(this.saldocontableConstantesFunciones.resaltarid_periodoSaldoContable!=null && this.jInternalFrameDetalleFormSaldoContable!=null) {this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_periodoSaldoContable.setBorder(this.saldocontableConstantesFunciones.resaltarid_periodoSaldoContable);}
		if(this.saldocontableConstantesFunciones.resaltarid_anioSaldoContable!=null && this.jInternalFrameDetalleFormSaldoContable!=null) {this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_anioSaldoContable.setBorder(this.saldocontableConstantesFunciones.resaltarid_anioSaldoContable);}
		if(this.saldocontableConstantesFunciones.resaltarid_mesSaldoContable!=null && this.jInternalFrameDetalleFormSaldoContable!=null) {this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_mesSaldoContable.setBorder(this.saldocontableConstantesFunciones.resaltarid_mesSaldoContable);}
		if(this.saldocontableConstantesFunciones.resaltarid_cuenta_contableSaldoContable!=null && this.jInternalFrameDetalleFormSaldoContable!=null) {this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_cuenta_contableSaldoContable.setBorder(this.saldocontableConstantesFunciones.resaltarid_cuenta_contableSaldoContable);}
		if(this.saldocontableConstantesFunciones.resaltardebito_mone_localSaldoContable!=null && this.jInternalFrameDetalleFormSaldoContable!=null) {this.jInternalFrameDetalleFormSaldoContable.jTextFielddebito_mone_localSaldoContable.setBorder(this.saldocontableConstantesFunciones.resaltardebito_mone_localSaldoContable);}
		if(this.saldocontableConstantesFunciones.resaltarcredito_mone_localSaldoContable!=null && this.jInternalFrameDetalleFormSaldoContable!=null) {this.jInternalFrameDetalleFormSaldoContable.jTextFieldcredito_mone_localSaldoContable.setBorder(this.saldocontableConstantesFunciones.resaltarcredito_mone_localSaldoContable);}
		if(this.saldocontableConstantesFunciones.resaltarsaldo_mone_localSaldoContable!=null && this.jInternalFrameDetalleFormSaldoContable!=null) {this.jInternalFrameDetalleFormSaldoContable.jTextFieldsaldo_mone_localSaldoContable.setBorder(this.saldocontableConstantesFunciones.resaltarsaldo_mone_localSaldoContable);}
		if(this.saldocontableConstantesFunciones.resaltardebito_mone_extraSaldoContable!=null && this.jInternalFrameDetalleFormSaldoContable!=null) {this.jInternalFrameDetalleFormSaldoContable.jTextFielddebito_mone_extraSaldoContable.setBorder(this.saldocontableConstantesFunciones.resaltardebito_mone_extraSaldoContable);}
		if(this.saldocontableConstantesFunciones.resaltarcredito_mone_extraSaldoContable!=null && this.jInternalFrameDetalleFormSaldoContable!=null) {this.jInternalFrameDetalleFormSaldoContable.jTextFieldcredito_mone_extraSaldoContable.setBorder(this.saldocontableConstantesFunciones.resaltarcredito_mone_extraSaldoContable);}
		if(this.saldocontableConstantesFunciones.resaltarsaldo_mone_extraSaldoContable!=null && this.jInternalFrameDetalleFormSaldoContable!=null) {this.jInternalFrameDetalleFormSaldoContable.jTextFieldsaldo_mone_extraSaldoContable.setBorder(this.saldocontableConstantesFunciones.resaltarsaldo_mone_extraSaldoContable);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioSaldoContable() throws Exception {		
		if(this.jInternalFrameDetalleFormSaldoContable==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormSaldoContable!=null) {
	
		//this.jInternalFrameDetalleFormSaldoContable.jLabelidSaldoContable.setVisible(this.saldocontableConstantesFunciones.mostraridSaldoContable);
		this.jInternalFrameDetalleFormSaldoContable.jPanelidSaldoContable.setVisible(this.saldocontableConstantesFunciones.mostraridSaldoContable);
		//this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_empresaSaldoContable.setVisible(this.saldocontableConstantesFunciones.mostrarid_empresaSaldoContable);
		this.jInternalFrameDetalleFormSaldoContable.jPanelid_empresaSaldoContable.setVisible(this.saldocontableConstantesFunciones.mostrarid_empresaSaldoContable);
		//this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_sucursalSaldoContable.setVisible(this.saldocontableConstantesFunciones.mostrarid_sucursalSaldoContable);
		this.jInternalFrameDetalleFormSaldoContable.jPanelid_sucursalSaldoContable.setVisible(this.saldocontableConstantesFunciones.mostrarid_sucursalSaldoContable);
		//this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_ejercicioSaldoContable.setVisible(this.saldocontableConstantesFunciones.mostrarid_ejercicioSaldoContable);
		this.jInternalFrameDetalleFormSaldoContable.jPanelid_ejercicioSaldoContable.setVisible(this.saldocontableConstantesFunciones.mostrarid_ejercicioSaldoContable);
		//this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_periodoSaldoContable.setVisible(this.saldocontableConstantesFunciones.mostrarid_periodoSaldoContable);
		this.jInternalFrameDetalleFormSaldoContable.jPanelid_periodoSaldoContable.setVisible(this.saldocontableConstantesFunciones.mostrarid_periodoSaldoContable);
		//this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_anioSaldoContable.setVisible(this.saldocontableConstantesFunciones.mostrarid_anioSaldoContable);
		this.jInternalFrameDetalleFormSaldoContable.jPanelid_anioSaldoContable.setVisible(this.saldocontableConstantesFunciones.mostrarid_anioSaldoContable);
		//this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_mesSaldoContable.setVisible(this.saldocontableConstantesFunciones.mostrarid_mesSaldoContable);
		this.jInternalFrameDetalleFormSaldoContable.jPanelid_mesSaldoContable.setVisible(this.saldocontableConstantesFunciones.mostrarid_mesSaldoContable);
		//this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_cuenta_contableSaldoContable.setVisible(this.saldocontableConstantesFunciones.mostrarid_cuenta_contableSaldoContable);
		this.jInternalFrameDetalleFormSaldoContable.jPanelid_cuenta_contableSaldoContable.setVisible(this.saldocontableConstantesFunciones.mostrarid_cuenta_contableSaldoContable);
			this.jInternalFrameDetalleFormSaldoContable.jButtonid_cuenta_contableSaldoContable.setVisible(this.saldocontableConstantesFunciones.mostrarid_cuenta_contableSaldoContable);
		//this.jInternalFrameDetalleFormSaldoContable.jTextFielddebito_mone_localSaldoContable.setVisible(this.saldocontableConstantesFunciones.mostrardebito_mone_localSaldoContable);
		this.jInternalFrameDetalleFormSaldoContable.jPaneldebito_mone_localSaldoContable.setVisible(this.saldocontableConstantesFunciones.mostrardebito_mone_localSaldoContable);
		//this.jInternalFrameDetalleFormSaldoContable.jTextFieldcredito_mone_localSaldoContable.setVisible(this.saldocontableConstantesFunciones.mostrarcredito_mone_localSaldoContable);
		this.jInternalFrameDetalleFormSaldoContable.jPanelcredito_mone_localSaldoContable.setVisible(this.saldocontableConstantesFunciones.mostrarcredito_mone_localSaldoContable);
		//this.jInternalFrameDetalleFormSaldoContable.jTextFieldsaldo_mone_localSaldoContable.setVisible(this.saldocontableConstantesFunciones.mostrarsaldo_mone_localSaldoContable);
		this.jInternalFrameDetalleFormSaldoContable.jPanelsaldo_mone_localSaldoContable.setVisible(this.saldocontableConstantesFunciones.mostrarsaldo_mone_localSaldoContable);
		//this.jInternalFrameDetalleFormSaldoContable.jTextFielddebito_mone_extraSaldoContable.setVisible(this.saldocontableConstantesFunciones.mostrardebito_mone_extraSaldoContable);
		this.jInternalFrameDetalleFormSaldoContable.jPaneldebito_mone_extraSaldoContable.setVisible(this.saldocontableConstantesFunciones.mostrardebito_mone_extraSaldoContable);
		//this.jInternalFrameDetalleFormSaldoContable.jTextFieldcredito_mone_extraSaldoContable.setVisible(this.saldocontableConstantesFunciones.mostrarcredito_mone_extraSaldoContable);
		this.jInternalFrameDetalleFormSaldoContable.jPanelcredito_mone_extraSaldoContable.setVisible(this.saldocontableConstantesFunciones.mostrarcredito_mone_extraSaldoContable);
		//this.jInternalFrameDetalleFormSaldoContable.jTextFieldsaldo_mone_extraSaldoContable.setVisible(this.saldocontableConstantesFunciones.mostrarsaldo_mone_extraSaldoContable);
		this.jInternalFrameDetalleFormSaldoContable.jPanelsaldo_mone_extraSaldoContable.setVisible(this.saldocontableConstantesFunciones.mostrarsaldo_mone_extraSaldoContable);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioSaldoContable() throws Exception {
		if(this.jInternalFrameDetalleFormSaldoContable==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormSaldoContable!=null) {
	
		this.jInternalFrameDetalleFormSaldoContable.jLabelidSaldoContable.setEnabled(this.saldocontableConstantesFunciones.activaridSaldoContable);
		this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_empresaSaldoContable.setEnabled(this.saldocontableConstantesFunciones.activarid_empresaSaldoContable);
		this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_sucursalSaldoContable.setEnabled(this.saldocontableConstantesFunciones.activarid_sucursalSaldoContable);
		this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_ejercicioSaldoContable.setEnabled(this.saldocontableConstantesFunciones.activarid_ejercicioSaldoContable);
		this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_periodoSaldoContable.setEnabled(this.saldocontableConstantesFunciones.activarid_periodoSaldoContable);
		this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_anioSaldoContable.setEnabled(this.saldocontableConstantesFunciones.activarid_anioSaldoContable);
		this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_mesSaldoContable.setEnabled(this.saldocontableConstantesFunciones.activarid_mesSaldoContable);
		this.jInternalFrameDetalleFormSaldoContable.jComboBoxid_cuenta_contableSaldoContable.setEnabled(this.saldocontableConstantesFunciones.activarid_cuenta_contableSaldoContable);
			this.jInternalFrameDetalleFormSaldoContable.jButtonid_cuenta_contableSaldoContable.setEnabled(this.saldocontableConstantesFunciones.activarid_cuenta_contableSaldoContable);
		this.jInternalFrameDetalleFormSaldoContable.jTextFielddebito_mone_localSaldoContable.setEnabled(this.saldocontableConstantesFunciones.activardebito_mone_localSaldoContable);
		this.jInternalFrameDetalleFormSaldoContable.jTextFieldcredito_mone_localSaldoContable.setEnabled(this.saldocontableConstantesFunciones.activarcredito_mone_localSaldoContable);
		this.jInternalFrameDetalleFormSaldoContable.jTextFieldsaldo_mone_localSaldoContable.setEnabled(this.saldocontableConstantesFunciones.activarsaldo_mone_localSaldoContable);
		this.jInternalFrameDetalleFormSaldoContable.jTextFielddebito_mone_extraSaldoContable.setEnabled(this.saldocontableConstantesFunciones.activardebito_mone_extraSaldoContable);
		this.jInternalFrameDetalleFormSaldoContable.jTextFieldcredito_mone_extraSaldoContable.setEnabled(this.saldocontableConstantesFunciones.activarcredito_mone_extraSaldoContable);
		this.jInternalFrameDetalleFormSaldoContable.jTextFieldsaldo_mone_extraSaldoContable.setEnabled(this.saldocontableConstantesFunciones.activarsaldo_mone_extraSaldoContable);
		}
	}
	
		
}