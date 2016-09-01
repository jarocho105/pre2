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

import com.bydan.erp.contabilidad.util.PresupuestoFlujoCajaConstantesFunciones;
import com.bydan.erp.contabilidad.util.PresupuestoFlujoCajaParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.PresupuestoFlujoCajaParameterGeneral;
//import com.bydan.erp.contabilidad.presentation.report.source.PresupuestoFlujoCajaBean;
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
public class PresupuestoFlujoCajaBeanSwingJInternalFrame extends PresupuestoFlujoCajaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(PresupuestoFlujoCajaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<PresupuestoFlujoCaja> presupuestoflujocajaValidator = new ClassValidator<PresupuestoFlujoCaja>(PresupuestoFlujoCaja.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public PresupuestoFlujoCaja presupuestoflujocaja;	
	public PresupuestoFlujoCaja presupuestoflujocajaAux;
	public PresupuestoFlujoCaja presupuestoflujocajaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public PresupuestoFlujoCaja presupuestoflujocajaTotales;
	public Long idPresupuestoFlujoCajaActual;
	public Long iIdNuevoPresupuestoFlujoCaja=0L;
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

	public String sFinalQueryComboCentroCosto="";

	public List<CentroCosto> centrocostosForeignKey;

	public List<CentroCosto> getcentrocostosForeignKey() {
		return centrocostosForeignKey;
	}

	public void setcentrocostosForeignKey(List<CentroCosto> centrocostosForeignKey) {
		this.centrocostosForeignKey = centrocostosForeignKey;
	}

	//OBJETO FK ACTUAL
	public CentroCosto centrocostoForeignKey;

	public CentroCosto getcentrocostoForeignKey() {
		return centrocostoForeignKey;
	}

	public void setcentrocostoForeignKey(CentroCosto centrocostoForeignKey) {
		this.centrocostoForeignKey = centrocostoForeignKey;
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
	
	public Boolean isPermisoTodoPresupuestoFlujoCaja;
	public Boolean isPermisoNuevoPresupuestoFlujoCaja;
	public Boolean isPermisoActualizarPresupuestoFlujoCaja;
	public Boolean isPermisoActualizarOriginalPresupuestoFlujoCaja;
	public Boolean isPermisoEliminarPresupuestoFlujoCaja;
	public Boolean isPermisoGuardarCambiosPresupuestoFlujoCaja;
	public Boolean isPermisoConsultaPresupuestoFlujoCaja;
	public Boolean isPermisoBusquedaPresupuestoFlujoCaja;
	public Boolean isPermisoReportePresupuestoFlujoCaja;
	public Boolean isPermisoPaginacionMedioPresupuestoFlujoCaja;
	public Boolean isPermisoPaginacionAltoPresupuestoFlujoCaja;
	public Boolean isPermisoPaginacionTodoPresupuestoFlujoCaja;
	public Boolean isPermisoCopiarPresupuestoFlujoCaja;
	public Boolean isPermisoVerFormPresupuestoFlujoCaja;
	public Boolean isPermisoDuplicarPresupuestoFlujoCaja;
	public Boolean isPermisoOrdenPresupuestoFlujoCaja;
	
	
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
	
	public PresupuestoFlujoCajaParameterReturnGeneral presupuestoflujocajaReturnGeneral;
	public PresupuestoFlujoCajaParameterReturnGeneral presupuestoflujocajaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoPresupuestoFlujoCaja=false;
	public Boolean esParaAccionDesdeFormularioPresupuestoFlujoCaja=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected PresupuestoFlujoCajaSessionBeanAdditional presupuestoflujocajaSessionBeanAdditional=null;
	
	public PresupuestoFlujoCajaSessionBeanAdditional getPresupuestoFlujoCajaSessionBeanAdditional() {
		return this.presupuestoflujocajaSessionBeanAdditional;
	}
	
	public void setPresupuestoFlujoCajaSessionBeanAdditional(PresupuestoFlujoCajaSessionBeanAdditional presupuestoflujocajaSessionBeanAdditional) {
		try {
			this.presupuestoflujocajaSessionBeanAdditional=presupuestoflujocajaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected PresupuestoFlujoCajaBeanSwingJInternalFrameAdditional presupuestoflujocajaBeanSwingJInternalFrameAdditional=null;
	//public class PresupuestoFlujoCajaBeanSwingJInternalFrame
	
	public PresupuestoFlujoCajaBeanSwingJInternalFrameAdditional getPresupuestoFlujoCajaBeanSwingJInternalFrameAdditional() {
		return this.presupuestoflujocajaBeanSwingJInternalFrameAdditional;
	}
	
	public void setPresupuestoFlujoCajaBeanSwingJInternalFrameAdditional(PresupuestoFlujoCajaBeanSwingJInternalFrameAdditional presupuestoflujocajaBeanSwingJInternalFrameAdditional) {
		try {
			this.presupuestoflujocajaBeanSwingJInternalFrameAdditional=presupuestoflujocajaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public PresupuestoFlujoCajaLogic presupuestoflujocajaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public PresupuestoFlujoCaja presupuestoflujocajaBean;
	public PresupuestoFlujoCajaConstantesFunciones presupuestoflujocajaConstantesFunciones;
	//public PresupuestoFlujoCajaParameterReturnGeneral presupuestoflujocajaReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public CuentaContableLogic cuentacontableLogic;
	public EjercicioLogic ejercicioLogic;
	public PeriodoLogic periodoLogic;
	public CentroCostoLogic centrocostoLogic;
	public AnioLogic anioLogic;
	public MesLogic mesLogic;
	
	//PARAMETROS
	
	
	//public List<PresupuestoFlujoCaja> presupuestoflujocajas;	
	//public List<PresupuestoFlujoCaja> presupuestoflujocajasEliminados;
	//public List<PresupuestoFlujoCaja> presupuestoflujocajasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoPresupuestoFlujoCaja=false;
	public Boolean isVisibilidadCeldaDuplicarPresupuestoFlujoCaja=true;
	public Boolean isVisibilidadCeldaCopiarPresupuestoFlujoCaja=true;
	public Boolean isVisibilidadCeldaVerFormPresupuestoFlujoCaja=true;
	public Boolean isVisibilidadCeldaOrdenPresupuestoFlujoCaja=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesPresupuestoFlujoCaja=false;
	public Boolean isVisibilidadCeldaModificarPresupuestoFlujoCaja=false;
	public Boolean isVisibilidadCeldaActualizarPresupuestoFlujoCaja=false;
	public Boolean isVisibilidadCeldaEliminarPresupuestoFlujoCaja=false;
	public Boolean isVisibilidadCeldaCancelarPresupuestoFlujoCaja=false;
	public Boolean isVisibilidadCeldaGuardarPresupuestoFlujoCaja=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosPresupuestoFlujoCaja=false;	
	
	
	public Boolean isVisibilidadFK_IdAnio=false;
	public Boolean isVisibilidadFK_IdCentroCosto=false;
	public Boolean isVisibilidadFK_IdCuentaContable=false;
	public Boolean isVisibilidadFK_IdEjercicio=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdMes=false;
	public Boolean isVisibilidadFK_IdPeriodo=false;
	
	public Long getiIdNuevoPresupuestoFlujoCaja() {
		return this.iIdNuevoPresupuestoFlujoCaja;
	}

	public void setiIdNuevoPresupuestoFlujoCaja(Long iIdNuevoPresupuestoFlujoCaja) {
		this.iIdNuevoPresupuestoFlujoCaja = iIdNuevoPresupuestoFlujoCaja;
	}
	
	public Long getidPresupuestoFlujoCajaActual() {
		return this.idPresupuestoFlujoCajaActual;
	}

	public void setidPresupuestoFlujoCajaActual(Long idPresupuestoFlujoCajaActual) {
		this.idPresupuestoFlujoCajaActual = idPresupuestoFlujoCajaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public PresupuestoFlujoCaja getpresupuestoflujocaja() {
		return this.presupuestoflujocaja;
	}

	public void setpresupuestoflujocaja(PresupuestoFlujoCaja presupuestoflujocaja) {
		this.presupuestoflujocaja = presupuestoflujocaja;
	}
	
	public PresupuestoFlujoCaja getpresupuestoflujocajaAux() {
		return this.presupuestoflujocajaAux;
	}

	public void setpresupuestoflujocajaAux(PresupuestoFlujoCaja presupuestoflujocajaAux) {
		this.presupuestoflujocajaAux = presupuestoflujocajaAux;
	}				
	
	public PresupuestoFlujoCaja getpresupuestoflujocajaAnterior() {
		return this.presupuestoflujocajaAnterior;
	}

	public void setpresupuestoflujocajaAnterior(PresupuestoFlujoCaja presupuestoflujocajaAnterior) {
		this.presupuestoflujocajaAnterior = presupuestoflujocajaAnterior;
	}	
	
	public PresupuestoFlujoCaja getpresupuestoflujocajaTotales() {
		return this.presupuestoflujocajaTotales;
	}

	public void setpresupuestoflujocajaTotales(PresupuestoFlujoCaja presupuestoflujocajaTotales) {
		this.presupuestoflujocajaTotales = presupuestoflujocajaTotales;
	}	
	
	public PresupuestoFlujoCaja getpresupuestoflujocajaBean() {
		return this.presupuestoflujocajaBean;
	}

	public void setpresupuestoflujocajaBean(PresupuestoFlujoCaja presupuestoflujocajaBean) {
		this.presupuestoflujocajaBean = presupuestoflujocajaBean;
	}	
	
	public PresupuestoFlujoCajaParameterReturnGeneral getpresupuestoflujocajaReturnGeneral() {
		return this.presupuestoflujocajaReturnGeneral;
	}

	public void setpresupuestoflujocajaReturnGeneral(PresupuestoFlujoCajaParameterReturnGeneral presupuestoflujocajaReturnGeneral) {
		this.presupuestoflujocajaReturnGeneral = presupuestoflujocajaReturnGeneral;
	}	
	
	
	public Long id_anioFK_IdAnio=null;

	public Long getid_anioFK_IdAnio() {
		return this.id_anioFK_IdAnio;
	}

	public void setid_anioFK_IdAnio(Long id_anioFK_IdAnio) {
		this.id_anioFK_IdAnio = id_anioFK_IdAnio;
	}

	public Long id_centro_costoFK_IdCentroCosto=null;

	public Long getid_centro_costoFK_IdCentroCosto() {
		return this.id_centro_costoFK_IdCentroCosto;
	}

	public void setid_centro_costoFK_IdCentroCosto(Long id_centro_costoFK_IdCentroCosto) {
		this.id_centro_costoFK_IdCentroCosto = id_centro_costoFK_IdCentroCosto;
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

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public PresupuestoFlujoCajaLogic getPresupuestoFlujoCajaLogic()	{		
		return presupuestoflujocajaLogic;
	}

	public void setPresupuestoFlujoCajaLogic(PresupuestoFlujoCajaLogic presupuestoflujocajaLogic) {
		this.presupuestoflujocajaLogic = presupuestoflujocajaLogic;
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
	
	public Boolean getIsEsNuevoPresupuestoFlujoCaja() {
		return isEsNuevoPresupuestoFlujoCaja;
	}

	public void setIsEsNuevoPresupuestoFlujoCaja(Boolean isEsNuevoPresupuestoFlujoCaja) {
		this.isEsNuevoPresupuestoFlujoCaja = isEsNuevoPresupuestoFlujoCaja;
	}

	public Boolean getEsParaAccionDesdeFormularioPresupuestoFlujoCaja() {
		return esParaAccionDesdeFormularioPresupuestoFlujoCaja;
	}
	
	public void setEsParaAccionDesdeFormularioPresupuestoFlujoCaja(Boolean esParaAccionDesdeFormularioPresupuestoFlujoCaja) {
		this.esParaAccionDesdeFormularioPresupuestoFlujoCaja = esParaAccionDesdeFormularioPresupuestoFlujoCaja;
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

			if(this.presupuestoflujocajaSessionBean==null) {
				this.presupuestoflujocajaSessionBean=new PresupuestoFlujoCajaSessionBean();
			}

			if(!this.presupuestoflujocajaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(presupuestoflujocajaSessionBean.getlidEmpresaActual());
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

			if(this.presupuestoflujocajaSessionBean==null) {
				this.presupuestoflujocajaSessionBean=new PresupuestoFlujoCajaSessionBean();
			}

			if(!this.presupuestoflujocajaSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContable()) {
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
					cuentacontableLogic.getEntityWithConnection(presupuestoflujocajaSessionBean.getlidCuentaContableActual());
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

			if(this.presupuestoflujocajaSessionBean==null) {
				this.presupuestoflujocajaSessionBean=new PresupuestoFlujoCajaSessionBean();
			}

			if(!this.presupuestoflujocajaSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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
					ejercicioLogic.getEntityWithConnection(presupuestoflujocajaSessionBean.getlidEjercicioActual());
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

			if(this.presupuestoflujocajaSessionBean==null) {
				this.presupuestoflujocajaSessionBean=new PresupuestoFlujoCajaSessionBean();
			}

			if(!this.presupuestoflujocajaSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
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
					periodoLogic.getEntityWithConnection(presupuestoflujocajaSessionBean.getlidPeriodoActual());
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

	public void cargarCombosCentroCostosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.centrocostosForeignKey=new ArrayList<CentroCosto>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			CentroCostoLogic centrocostoLogic=new CentroCostoLogic();

			//centrocostoLogic.getCentroCostoDataAccess().setIsForForeingKeyData(true);

			if(this.presupuestoflujocajaSessionBean==null) {
				this.presupuestoflujocajaSessionBean=new PresupuestoFlujoCajaSessionBean();
			}

			if(!this.presupuestoflujocajaSessionBean.getisBusquedaDesdeForeignKeySesionCentroCosto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//centrocostoLogic.getCentroCostoDataAccess().setIsForForeingKeyData(true);

					centrocostoLogic.getTodosCentroCostosWithConnection(sFinalQuery,new Pagination());

					this.centrocostosForeignKey=centrocostoLogic.getCentroCostos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCentroCosto(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					centrocostoLogic.getEntityWithConnection(presupuestoflujocajaSessionBean.getlidCentroCostoActual());
					this.centrocostosForeignKey.add(centrocostoLogic.getCentroCosto());
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

			if(this.presupuestoflujocajaSessionBean==null) {
				this.presupuestoflujocajaSessionBean=new PresupuestoFlujoCajaSessionBean();
			}

			if(!this.presupuestoflujocajaSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
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
					anioLogic.getEntityWithConnection(presupuestoflujocajaSessionBean.getlidAnioActual());
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

			if(this.presupuestoflujocajaSessionBean==null) {
				this.presupuestoflujocajaSessionBean=new PresupuestoFlujoCajaSessionBean();
			}

			if(!this.presupuestoflujocajaSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
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
					mesLogic.getEntityWithConnection(presupuestoflujocajaSessionBean.getlidMesActual());
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

					if(this.presupuestoflujocaja!=null) {
						this.presupuestoflujocaja.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) {
						this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_empresaPresupuestoFlujoCaja.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaPresupuestoFlujoCaja.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) {
						if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_empresaPresupuestoFlujoCaja.getItemCount()>0) {
							this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_empresaPresupuestoFlujoCaja.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaPresupuestoFlujoCajaGenerico)throws Exception
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
				jComboBoxid_empresaPresupuestoFlujoCajaGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaPresupuestoFlujoCajaGenerico!=null && jComboBoxid_empresaPresupuestoFlujoCajaGenerico.getItemCount()>0) {
					jComboBoxid_empresaPresupuestoFlujoCajaGenerico.setSelectedIndex(0);
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

					if(this.presupuestoflujocaja!=null) {
						this.presupuestoflujocaja.setCuentaContable(cuentacontableTemp);
					}

					if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) {
						this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_cuenta_contablePresupuestoFlujoCaja.setSelectedItem(cuentacontableTemp);
					}
				} else {
					//jComboBoxid_cuenta_contablePresupuestoFlujoCaja.setSelectedItem(cuentacontableTemp);
					if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) {
						if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_cuenta_contablePresupuestoFlujoCaja.getItemCount()>0) {
							this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_cuenta_contablePresupuestoFlujoCaja.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCuentaContable") || sFormularioTipoBusqueda.equals("Todos")){
					if(cuentacontableTemp!=null && jComboBoxid_cuenta_contableFK_IdCuentaContablePresupuestoFlujoCaja!=null) {
						jComboBoxid_cuenta_contableFK_IdCuentaContablePresupuestoFlujoCaja.setSelectedItem(cuentacontableTemp);
					} else {
						if(jComboBoxid_cuenta_contableFK_IdCuentaContablePresupuestoFlujoCaja!=null) {
							//jComboBoxid_cuenta_contableFK_IdCuentaContablePresupuestoFlujoCaja.setSelectedItem(cuentacontableTemp);
							if(jComboBoxid_cuenta_contableFK_IdCuentaContablePresupuestoFlujoCaja.getItemCount()>0) {
								jComboBoxid_cuenta_contableFK_IdCuentaContablePresupuestoFlujoCaja.setSelectedIndex(0);
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
	public void setActualCuentaContableForeignKeyGenerico(Long idCuentaContableSeleccionado,JComboBox jComboBoxid_cuenta_contablePresupuestoFlujoCajaGenerico)throws Exception
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
				jComboBoxid_cuenta_contablePresupuestoFlujoCajaGenerico.setSelectedItem(cuentacontableTemp);
			} else {
				if(jComboBoxid_cuenta_contablePresupuestoFlujoCajaGenerico!=null && jComboBoxid_cuenta_contablePresupuestoFlujoCajaGenerico.getItemCount()>0) {
					jComboBoxid_cuenta_contablePresupuestoFlujoCajaGenerico.setSelectedIndex(0);
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

					if(this.presupuestoflujocaja!=null) {
						this.presupuestoflujocaja.setEjercicio(ejercicioTemp);
					}

					if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) {
						this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_ejercicioPresupuestoFlujoCaja.setSelectedItem(ejercicioTemp);
					}
				} else {
					//jComboBoxid_ejercicioPresupuestoFlujoCaja.setSelectedItem(ejercicioTemp);
					if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) {
						if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_ejercicioPresupuestoFlujoCaja.getItemCount()>0) {
							this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_ejercicioPresupuestoFlujoCaja.setSelectedIndex(0);
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
	public void setActualEjercicioForeignKeyGenerico(Long idEjercicioSeleccionado,JComboBox jComboBoxid_ejercicioPresupuestoFlujoCajaGenerico)throws Exception
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
				jComboBoxid_ejercicioPresupuestoFlujoCajaGenerico.setSelectedItem(ejercicioTemp);
			} else {
				if(jComboBoxid_ejercicioPresupuestoFlujoCajaGenerico!=null && jComboBoxid_ejercicioPresupuestoFlujoCajaGenerico.getItemCount()>0) {
					jComboBoxid_ejercicioPresupuestoFlujoCajaGenerico.setSelectedIndex(0);
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

					if(this.presupuestoflujocaja!=null) {
						this.presupuestoflujocaja.setPeriodo(periodoTemp);
					}

					if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) {
						this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_periodoPresupuestoFlujoCaja.setSelectedItem(periodoTemp);
					}
				} else {
					//jComboBoxid_periodoPresupuestoFlujoCaja.setSelectedItem(periodoTemp);
					if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) {
						if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_periodoPresupuestoFlujoCaja.getItemCount()>0) {
							this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_periodoPresupuestoFlujoCaja.setSelectedIndex(0);
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
	public void setActualPeriodoForeignKeyGenerico(Long idPeriodoSeleccionado,JComboBox jComboBoxid_periodoPresupuestoFlujoCajaGenerico)throws Exception
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
				jComboBoxid_periodoPresupuestoFlujoCajaGenerico.setSelectedItem(periodoTemp);
			} else {
				if(jComboBoxid_periodoPresupuestoFlujoCajaGenerico!=null && jComboBoxid_periodoPresupuestoFlujoCajaGenerico.getItemCount()>0) {
					jComboBoxid_periodoPresupuestoFlujoCajaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualCentroCostoForeignKey(Long idCentroCostoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			CentroCosto  centrocostoTemp=null;

			for(CentroCosto centrocostoAux:centrocostosForeignKey) {
				if(centrocostoAux.getId()!=null && centrocostoAux.getId().equals(idCentroCostoSeleccionado)) {
					centrocostoTemp=centrocostoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(centrocostoTemp!=null) {

					if(this.presupuestoflujocaja!=null) {
						this.presupuestoflujocaja.setCentroCosto(centrocostoTemp);
					}

					if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) {
						this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_centro_costoPresupuestoFlujoCaja.setSelectedItem(centrocostoTemp);
					}
				} else {
					//jComboBoxid_centro_costoPresupuestoFlujoCaja.setSelectedItem(centrocostoTemp);
					if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) {
						if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_centro_costoPresupuestoFlujoCaja.getItemCount()>0) {
							this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_centro_costoPresupuestoFlujoCaja.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCentroCosto") || sFormularioTipoBusqueda.equals("Todos")){
					if(centrocostoTemp!=null && jComboBoxid_centro_costoFK_IdCentroCostoPresupuestoFlujoCaja!=null) {
						jComboBoxid_centro_costoFK_IdCentroCostoPresupuestoFlujoCaja.setSelectedItem(centrocostoTemp);
					} else {
						if(jComboBoxid_centro_costoFK_IdCentroCostoPresupuestoFlujoCaja!=null) {
							//jComboBoxid_centro_costoFK_IdCentroCostoPresupuestoFlujoCaja.setSelectedItem(centrocostoTemp);
							if(jComboBoxid_centro_costoFK_IdCentroCostoPresupuestoFlujoCaja.getItemCount()>0) {
								jComboBoxid_centro_costoFK_IdCentroCostoPresupuestoFlujoCaja.setSelectedIndex(0);
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

	public String getActualCentroCostoForeignKeyDescripcion(Long idCentroCostoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			CentroCosto  centrocostoTemp=null;

			for(CentroCosto centrocostoAux:centrocostosForeignKey) {
				if(centrocostoAux.getId()!=null && centrocostoAux.getId().equals(idCentroCostoSeleccionado)) {
					centrocostoTemp=centrocostoAux;
					break;
				}
			}


			sDescripcion=CentroCostoConstantesFunciones.getCentroCostoDescripcion(centrocostoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualCentroCostoForeignKeyGenerico(Long idCentroCostoSeleccionado,JComboBox jComboBoxid_centro_costoPresupuestoFlujoCajaGenerico)throws Exception
	{
		try
		{
			CentroCosto  centrocostoTemp=null;

			for(CentroCosto centrocostoAux:centrocostosForeignKey) {
				if(centrocostoAux.getId()!=null && centrocostoAux.getId().equals(idCentroCostoSeleccionado)) {
					centrocostoTemp=centrocostoAux;
					break;
				}
			}

			if(centrocostoTemp!=null) {
				jComboBoxid_centro_costoPresupuestoFlujoCajaGenerico.setSelectedItem(centrocostoTemp);
			} else {
				if(jComboBoxid_centro_costoPresupuestoFlujoCajaGenerico!=null && jComboBoxid_centro_costoPresupuestoFlujoCajaGenerico.getItemCount()>0) {
					jComboBoxid_centro_costoPresupuestoFlujoCajaGenerico.setSelectedIndex(0);
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

					if(this.presupuestoflujocaja!=null) {
						this.presupuestoflujocaja.setAnio(anioTemp);
					}

					if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) {
						this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_anioPresupuestoFlujoCaja.setSelectedItem(anioTemp);
					}
				} else {
					//jComboBoxid_anioPresupuestoFlujoCaja.setSelectedItem(anioTemp);
					if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) {
						if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_anioPresupuestoFlujoCaja.getItemCount()>0) {
							this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_anioPresupuestoFlujoCaja.setSelectedIndex(0);
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
	public void setActualAnioForeignKeyGenerico(Long idAnioSeleccionado,JComboBox jComboBoxid_anioPresupuestoFlujoCajaGenerico)throws Exception
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
				jComboBoxid_anioPresupuestoFlujoCajaGenerico.setSelectedItem(anioTemp);
			} else {
				if(jComboBoxid_anioPresupuestoFlujoCajaGenerico!=null && jComboBoxid_anioPresupuestoFlujoCajaGenerico.getItemCount()>0) {
					jComboBoxid_anioPresupuestoFlujoCajaGenerico.setSelectedIndex(0);
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

					if(this.presupuestoflujocaja!=null) {
						this.presupuestoflujocaja.setMes(mesTemp);
					}

					if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) {
						this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_mesPresupuestoFlujoCaja.setSelectedItem(mesTemp);
					}
				} else {
					//jComboBoxid_mesPresupuestoFlujoCaja.setSelectedItem(mesTemp);
					if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) {
						if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_mesPresupuestoFlujoCaja.getItemCount()>0) {
							this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_mesPresupuestoFlujoCaja.setSelectedIndex(0);
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
	public void setActualMesForeignKeyGenerico(Long idMesSeleccionado,JComboBox jComboBoxid_mesPresupuestoFlujoCajaGenerico)throws Exception
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
				jComboBoxid_mesPresupuestoFlujoCajaGenerico.setSelectedItem(mesTemp);
			} else {
				if(jComboBoxid_mesPresupuestoFlujoCajaGenerico!=null && jComboBoxid_mesPresupuestoFlujoCajaGenerico.getItemCount()>0) {
					jComboBoxid_mesPresupuestoFlujoCajaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(PresupuestoFlujoCaja presupuestoflujocaja,JComboBox jComboBoxid_empresaPresupuestoFlujoCajaGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaPresupuestoFlujoCajaGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_empresaPresupuestoFlujoCaja.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaPresupuestoFlujoCajaGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				presupuestoflujocaja.setid_empresa(empresaAux.getId());
				presupuestoflujocaja.setempresa_descripcion(PresupuestoFlujoCajaConstantesFunciones.getEmpresaDescripcion(empresaAux));
				presupuestoflujocaja.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCuentaContableForeignKey(PresupuestoFlujoCaja presupuestoflujocaja,JComboBox jComboBoxid_cuenta_contablePresupuestoFlujoCajaGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontableAux=new CuentaContable();

			if(jComboBoxid_cuenta_contablePresupuestoFlujoCajaGenerico==null) {
				cuentacontableAux=(CuentaContable)this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_cuenta_contablePresupuestoFlujoCaja.getSelectedItem();
			} else {
				cuentacontableAux=(CuentaContable)jComboBoxid_cuenta_contablePresupuestoFlujoCajaGenerico.getSelectedItem();
			}

			if(cuentacontableAux!=null && cuentacontableAux.getId()!=null) {
				presupuestoflujocaja.setid_cuenta_contable(cuentacontableAux.getId());
				presupuestoflujocaja.setcuentacontable_descripcion(PresupuestoFlujoCajaConstantesFunciones.getCuentaContableDescripcion(cuentacontableAux));
				presupuestoflujocaja.setCuentaContable(cuentacontableAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEjercicioForeignKey(PresupuestoFlujoCaja presupuestoflujocaja,JComboBox jComboBoxid_ejercicioPresupuestoFlujoCajaGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioAux=new Ejercicio();

			if(jComboBoxid_ejercicioPresupuestoFlujoCajaGenerico==null) {
				ejercicioAux=(Ejercicio)this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_ejercicioPresupuestoFlujoCaja.getSelectedItem();
			} else {
				ejercicioAux=(Ejercicio)jComboBoxid_ejercicioPresupuestoFlujoCajaGenerico.getSelectedItem();
			}

			if(ejercicioAux!=null && ejercicioAux.getId()!=null) {
				presupuestoflujocaja.setid_ejercicio(ejercicioAux.getId());
				presupuestoflujocaja.setejercicio_descripcion(PresupuestoFlujoCajaConstantesFunciones.getEjercicioDescripcion(ejercicioAux));
				presupuestoflujocaja.setEjercicio(ejercicioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPeriodoForeignKey(PresupuestoFlujoCaja presupuestoflujocaja,JComboBox jComboBoxid_periodoPresupuestoFlujoCajaGenerico)throws Exception
	{
		try
		{
			Periodo  periodoAux=new Periodo();

			if(jComboBoxid_periodoPresupuestoFlujoCajaGenerico==null) {
				periodoAux=(Periodo)this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_periodoPresupuestoFlujoCaja.getSelectedItem();
			} else {
				periodoAux=(Periodo)jComboBoxid_periodoPresupuestoFlujoCajaGenerico.getSelectedItem();
			}

			if(periodoAux!=null && periodoAux.getId()!=null) {
				if(periodoAux.getid_estado_periodo().equals(0L)) {
					throw new Exception("Periodo INACTIVO, NO PUEDE GUARDAR LA INFORMACION CONSULTE CON EL ADMINISTRADOR");
				}

				presupuestoflujocaja.setid_periodo(periodoAux.getId());
				presupuestoflujocaja.setperiodo_descripcion(PresupuestoFlujoCajaConstantesFunciones.getPeriodoDescripcion(periodoAux));
				presupuestoflujocaja.setPeriodo(periodoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCentroCostoForeignKey(PresupuestoFlujoCaja presupuestoflujocaja,JComboBox jComboBoxid_centro_costoPresupuestoFlujoCajaGenerico)throws Exception
	{
		try
		{
			CentroCosto  centrocostoAux=new CentroCosto();

			if(jComboBoxid_centro_costoPresupuestoFlujoCajaGenerico==null) {
				centrocostoAux=(CentroCosto)this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_centro_costoPresupuestoFlujoCaja.getSelectedItem();
			} else {
				centrocostoAux=(CentroCosto)jComboBoxid_centro_costoPresupuestoFlujoCajaGenerico.getSelectedItem();
			}

			if(centrocostoAux!=null) {
				presupuestoflujocaja.setid_centro_costo(centrocostoAux.getId());
				presupuestoflujocaja.setcentrocosto_descripcion(PresupuestoFlujoCajaConstantesFunciones.getCentroCostoDescripcion(centrocostoAux));
				presupuestoflujocaja.setCentroCosto(centrocostoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarAnioForeignKey(PresupuestoFlujoCaja presupuestoflujocaja,JComboBox jComboBoxid_anioPresupuestoFlujoCajaGenerico)throws Exception
	{
		try
		{
			Anio  anioAux=new Anio();

			if(jComboBoxid_anioPresupuestoFlujoCajaGenerico==null) {
				anioAux=(Anio)this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_anioPresupuestoFlujoCaja.getSelectedItem();
			} else {
				anioAux=(Anio)jComboBoxid_anioPresupuestoFlujoCajaGenerico.getSelectedItem();
			}

			if(anioAux!=null) {
				presupuestoflujocaja.setid_anio(anioAux.getId());
				presupuestoflujocaja.setanio_descripcion(PresupuestoFlujoCajaConstantesFunciones.getAnioDescripcion(anioAux));
				presupuestoflujocaja.setAnio(anioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarMesForeignKey(PresupuestoFlujoCaja presupuestoflujocaja,JComboBox jComboBoxid_mesPresupuestoFlujoCajaGenerico)throws Exception
	{
		try
		{
			Mes  mesAux=new Mes();

			if(jComboBoxid_mesPresupuestoFlujoCajaGenerico==null) {
				mesAux=(Mes)this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_mesPresupuestoFlujoCaja.getSelectedItem();
			} else {
				mesAux=(Mes)jComboBoxid_mesPresupuestoFlujoCajaGenerico.getSelectedItem();
			}

			if(mesAux!=null) {
				presupuestoflujocaja.setid_mes(mesAux.getId());
				presupuestoflujocaja.setmes_descripcion(PresupuestoFlujoCajaConstantesFunciones.getMesDescripcion(mesAux));
				presupuestoflujocaja.setMes(mesAux);			}
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

					if(!PresupuestoFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) { 
							this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_empresaPresupuestoFlujoCaja.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_empresaPresupuestoFlujoCaja.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) { 
					}

					if(!PresupuestoFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
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

					if(!PresupuestoFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) { 
							this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_cuenta_contablePresupuestoFlujoCaja.removeAllItems();

							for(CuentaContable cuentacontable:this.cuentacontablesForeignKey) {
								this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_cuenta_contablePresupuestoFlujoCaja.addItem(cuentacontable);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) { 
					}

					if(!PresupuestoFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCuentaContable") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PresupuestoFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_cuenta_contableFK_IdCuentaContablePresupuestoFlujoCaja.removeAllItems();

							for(CuentaContable cuentacontable:this.cuentacontablesForeignKey) {
								this.jComboBoxid_cuenta_contableFK_IdCuentaContablePresupuestoFlujoCaja.addItem(cuentacontable);
							}
						}

						if(!PresupuestoFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

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

					if(!PresupuestoFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) { 
							this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_ejercicioPresupuestoFlujoCaja.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_ejercicioPresupuestoFlujoCaja.addItem(ejercicio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) { 
					}

					if(!PresupuestoFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
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

					if(!PresupuestoFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) { 
							this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_periodoPresupuestoFlujoCaja.removeAllItems();

							for(Periodo periodo:this.periodosForeignKey) {
								this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_periodoPresupuestoFlujoCaja.addItem(periodo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) { 
					}

					if(!PresupuestoFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameCentroCostosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCentroCosto=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!PresupuestoFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) { 
							this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_centro_costoPresupuestoFlujoCaja.removeAllItems();

							for(CentroCosto centrocosto:this.centrocostosForeignKey) {
								this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_centro_costoPresupuestoFlujoCaja.addItem(centrocosto);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) { 
					}

					if(!PresupuestoFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCentroCosto") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PresupuestoFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_centro_costoFK_IdCentroCostoPresupuestoFlujoCaja.removeAllItems();

							for(CentroCosto centrocosto:this.centrocostosForeignKey) {
								this.jComboBoxid_centro_costoFK_IdCentroCostoPresupuestoFlujoCaja.addItem(centrocosto);
							}
						}

						if(!PresupuestoFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
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

					if(!PresupuestoFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) { 
							this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_anioPresupuestoFlujoCaja.removeAllItems();

							for(Anio anio:this.aniosForeignKey) {
								this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_anioPresupuestoFlujoCaja.addItem(anio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) { 
					}

					if(!PresupuestoFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
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

					if(!PresupuestoFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) { 
							this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_mesPresupuestoFlujoCaja.removeAllItems();

							for(Mes mes:this.messForeignKey) {
								this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_mesPresupuestoFlujoCaja.addItem(mes);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) { 
					}

					if(!PresupuestoFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) {
							this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_empresaPresupuestoFlujoCaja.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) {
							this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_empresaPresupuestoFlujoCaja.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) {
							this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_cuenta_contablePresupuestoFlujoCaja.setSelectedItem(cuentacontable);
						}
					} else {
						if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) {
							this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_cuenta_contablePresupuestoFlujoCaja.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_cuenta_contableFK_IdCuentaContablePresupuestoFlujoCaja.setSelectedItem(cuentacontable);
						} else {
							this.jComboBoxid_cuenta_contableFK_IdCuentaContablePresupuestoFlujoCaja.setSelectedIndex(iIndexSelected);
						}

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
						if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) {
							this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_ejercicioPresupuestoFlujoCaja.setSelectedItem(ejercicio);
						}
					} else {
						if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) {
							this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_ejercicioPresupuestoFlujoCaja.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) {
							this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_periodoPresupuestoFlujoCaja.setSelectedItem(periodo);
						}
					} else {
						if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) {
							this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_periodoPresupuestoFlujoCaja.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameCentroCostoForeignKey(CentroCosto centrocosto,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) {
							this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_centro_costoPresupuestoFlujoCaja.setSelectedItem(centrocosto);
						}
					} else {
						if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) {
							this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_centro_costoPresupuestoFlujoCaja.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_centro_costoFK_IdCentroCostoPresupuestoFlujoCaja.setSelectedItem(centrocosto);
						} else {
							this.jComboBoxid_centro_costoFK_IdCentroCostoPresupuestoFlujoCaja.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) {
							this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_anioPresupuestoFlujoCaja.setSelectedItem(anio);
						}
					} else {
						if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) {
							this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_anioPresupuestoFlujoCaja.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) {
							this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_mesPresupuestoFlujoCaja.setSelectedItem(mes);
						}
					} else {
						if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) {
							this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_mesPresupuestoFlujoCaja.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesPresupuestoFlujoCaja() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			PresupuestoFlujoCajaConstantesFunciones.refrescarForeignKeysDescripcionesPresupuestoFlujoCaja(this.presupuestoflujocajaLogic.getPresupuestoFlujoCajas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			PresupuestoFlujoCajaConstantesFunciones.refrescarForeignKeysDescripcionesPresupuestoFlujoCaja(this.presupuestoflujocajas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(CuentaContable.class));
		classes.add(new Classe(Ejercicio.class));
		classes.add(new Classe(Periodo.class));
		classes.add(new Classe(CentroCosto.class));
		classes.add(new Classe(Anio.class));
		classes.add(new Classe(Mes.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//presupuestoflujocajaLogic.setPresupuestoFlujoCajas(this.presupuestoflujocajas);
			presupuestoflujocajaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public PresupuestoFlujoCajaParameterReturnGeneral getPresupuestoFlujoCajaParameterGeneral() {
		return this.presupuestoflujocajaParameterGeneral;
	}
	
	public void setPresupuestoFlujoCajaParameterGeneral(PresupuestoFlujoCajaParameterReturnGeneral presupuestoflujocajaParameterGeneral) {
		this.presupuestoflujocajaParameterGeneral = presupuestoflujocajaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoPresupuestoFlujoCaja() {
		return isPermisoTodoPresupuestoFlujoCaja;
	}

	public void setIsPermisoTodoPresupuestoFlujoCaja(Boolean isPermisoTodoPresupuestoFlujoCaja) {
		this.isPermisoTodoPresupuestoFlujoCaja = isPermisoTodoPresupuestoFlujoCaja;
	}

	public Boolean getIsPermisoNuevoPresupuestoFlujoCaja() {
		return isPermisoNuevoPresupuestoFlujoCaja;
	}

	public void setIsPermisoNuevoPresupuestoFlujoCaja(Boolean isPermisoNuevoPresupuestoFlujoCaja) {
		this.isPermisoNuevoPresupuestoFlujoCaja = isPermisoNuevoPresupuestoFlujoCaja;
	}

	public Boolean getIsPermisoActualizarPresupuestoFlujoCaja() {
		return isPermisoActualizarPresupuestoFlujoCaja;
	}

	public void setIsPermisoActualizarPresupuestoFlujoCaja(Boolean isPermisoActualizarPresupuestoFlujoCaja) {
		this.isPermisoActualizarPresupuestoFlujoCaja = isPermisoActualizarPresupuestoFlujoCaja;
	}

	public Boolean getIsPermisoEliminarPresupuestoFlujoCaja() {
		return isPermisoEliminarPresupuestoFlujoCaja;
	}

	public void setIsPermisoEliminarPresupuestoFlujoCaja(Boolean isPermisoEliminarPresupuestoFlujoCaja) {
		this.isPermisoEliminarPresupuestoFlujoCaja = isPermisoEliminarPresupuestoFlujoCaja;
	}

	public Boolean getIsPermisoGuardarCambiosPresupuestoFlujoCaja() {
		return isPermisoGuardarCambiosPresupuestoFlujoCaja;
	}

	public void setIsPermisoGuardarCambiosPresupuestoFlujoCaja(Boolean isPermisoGuardarCambiosPresupuestoFlujoCaja) {
		this.isPermisoGuardarCambiosPresupuestoFlujoCaja = isPermisoGuardarCambiosPresupuestoFlujoCaja;
	}
	
	public Boolean getIsPermisoConsultaPresupuestoFlujoCaja() {
		return isPermisoConsultaPresupuestoFlujoCaja;
	}

	public void setIsPermisoConsultaPresupuestoFlujoCaja(Boolean isPermisoConsultaPresupuestoFlujoCaja) {
		this.isPermisoConsultaPresupuestoFlujoCaja = isPermisoConsultaPresupuestoFlujoCaja;
	}

	public Boolean getIsPermisoBusquedaPresupuestoFlujoCaja() {
		return isPermisoBusquedaPresupuestoFlujoCaja;
	}

	public void setIsPermisoBusquedaPresupuestoFlujoCaja(Boolean isPermisoBusquedaPresupuestoFlujoCaja) {
		this.isPermisoBusquedaPresupuestoFlujoCaja = isPermisoBusquedaPresupuestoFlujoCaja;
	}

	public Boolean getIsPermisoReportePresupuestoFlujoCaja() {
		return isPermisoReportePresupuestoFlujoCaja;
	}

	public void setIsPermisoReportePresupuestoFlujoCaja(Boolean isPermisoReportePresupuestoFlujoCaja) {
		this.isPermisoReportePresupuestoFlujoCaja = isPermisoReportePresupuestoFlujoCaja;
	}
	
	public Boolean getIsPermisoPaginacionMedioPresupuestoFlujoCaja() {
		return isPermisoPaginacionMedioPresupuestoFlujoCaja;
	}

	public void setIsPermisoPaginacionMedioPresupuestoFlujoCaja(Boolean isPermisoPaginacionMedioPresupuestoFlujoCaja) {
		this.isPermisoPaginacionMedioPresupuestoFlujoCaja = isPermisoPaginacionMedioPresupuestoFlujoCaja;
	}
	
	public Boolean getIsPermisoPaginacionTodoPresupuestoFlujoCaja() {
		return isPermisoPaginacionTodoPresupuestoFlujoCaja;
	}

	public void setIsPermisoPaginacionTodoPresupuestoFlujoCaja(Boolean isPermisoPaginacionTodoPresupuestoFlujoCaja) {
		this.isPermisoPaginacionTodoPresupuestoFlujoCaja = isPermisoPaginacionTodoPresupuestoFlujoCaja;
	}
	
	public Boolean getIsPermisoPaginacionAltoPresupuestoFlujoCaja() {
		return isPermisoPaginacionAltoPresupuestoFlujoCaja;
	}

	public void setIsPermisoPaginacionAltoPresupuestoFlujoCaja(Boolean isPermisoPaginacionAltoPresupuestoFlujoCaja) {
		this.isPermisoPaginacionAltoPresupuestoFlujoCaja = isPermisoPaginacionAltoPresupuestoFlujoCaja;
	}
	
	public Boolean getIsPermisoCopiarPresupuestoFlujoCaja() {
		return isPermisoCopiarPresupuestoFlujoCaja;
	}

	public void setIsPermisoCopiarPresupuestoFlujoCaja(Boolean isPermisoCopiarPresupuestoFlujoCaja) {
		this.isPermisoCopiarPresupuestoFlujoCaja = isPermisoCopiarPresupuestoFlujoCaja;
	}
	
	public Boolean getIsPermisoVerFormPresupuestoFlujoCaja() {
		return isPermisoVerFormPresupuestoFlujoCaja;
	}

	public void setIsPermisoVerFormPresupuestoFlujoCaja(Boolean isPermisoVerFormPresupuestoFlujoCaja) {
		this.isPermisoVerFormPresupuestoFlujoCaja = isPermisoVerFormPresupuestoFlujoCaja;
	}
	
	public Boolean getIsPermisoDuplicarPresupuestoFlujoCaja() {
		return isPermisoDuplicarPresupuestoFlujoCaja;
	}

	public void setIsPermisoDuplicarPresupuestoFlujoCaja(Boolean isPermisoDuplicarPresupuestoFlujoCaja) {
		this.isPermisoDuplicarPresupuestoFlujoCaja = isPermisoDuplicarPresupuestoFlujoCaja;
	}
	
	public Boolean getIsPermisoOrdenPresupuestoFlujoCaja() {
		return isPermisoOrdenPresupuestoFlujoCaja;
	}

	public void setIsPermisoOrdenPresupuestoFlujoCaja(Boolean isPermisoOrdenPresupuestoFlujoCaja) {
		this.isPermisoOrdenPresupuestoFlujoCaja = isPermisoOrdenPresupuestoFlujoCaja;
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
	
	public Boolean getIsVisibilidadCeldaNuevoPresupuestoFlujoCaja() {
		return isVisibilidadCeldaNuevoPresupuestoFlujoCaja;
	}

	public void setIsVisibilidadCeldaNuevoPresupuestoFlujoCaja(Boolean isVisibilidadCeldaNuevoPresupuestoFlujoCaja) {
		this.isVisibilidadCeldaNuevoPresupuestoFlujoCaja = isVisibilidadCeldaNuevoPresupuestoFlujoCaja;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarPresupuestoFlujoCaja() {
		return isVisibilidadCeldaDuplicarPresupuestoFlujoCaja;
	}

	public void setIsVisibilidadCeldaDuplicarPresupuestoFlujoCaja(Boolean isVisibilidadCeldaDuplicarPresupuestoFlujoCaja) {
		this.isVisibilidadCeldaDuplicarPresupuestoFlujoCaja = isVisibilidadCeldaDuplicarPresupuestoFlujoCaja;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarPresupuestoFlujoCaja() {
		return isVisibilidadCeldaCopiarPresupuestoFlujoCaja;
	}

	public void setIsVisibilidadCeldaCopiarPresupuestoFlujoCaja(Boolean isVisibilidadCeldaCopiarPresupuestoFlujoCaja) {
		this.isVisibilidadCeldaCopiarPresupuestoFlujoCaja = isVisibilidadCeldaCopiarPresupuestoFlujoCaja;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormPresupuestoFlujoCaja() {
		return isVisibilidadCeldaVerFormPresupuestoFlujoCaja;
	}

	public void setIsVisibilidadCeldaVerFormPresupuestoFlujoCaja(Boolean isVisibilidadCeldaVerFormPresupuestoFlujoCaja) {
		this.isVisibilidadCeldaVerFormPresupuestoFlujoCaja = isVisibilidadCeldaVerFormPresupuestoFlujoCaja;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenPresupuestoFlujoCaja() {
		return isVisibilidadCeldaOrdenPresupuestoFlujoCaja;
	}

	public void setIsVisibilidadCeldaOrdenPresupuestoFlujoCaja(Boolean isVisibilidadCeldaOrdenPresupuestoFlujoCaja) {
		this.isVisibilidadCeldaOrdenPresupuestoFlujoCaja = isVisibilidadCeldaOrdenPresupuestoFlujoCaja;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesPresupuestoFlujoCaja() {
		return isVisibilidadCeldaNuevoRelacionesPresupuestoFlujoCaja;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesPresupuestoFlujoCaja(Boolean isVisibilidadCeldaNuevoRelacionesPresupuestoFlujoCaja) {
		this.isVisibilidadCeldaNuevoRelacionesPresupuestoFlujoCaja = isVisibilidadCeldaNuevoRelacionesPresupuestoFlujoCaja;
	}
	
	public Boolean getIsVisibilidadCeldaModificarPresupuestoFlujoCaja() {
		return isVisibilidadCeldaModificarPresupuestoFlujoCaja;
	}

	public void setIsVisibilidadCeldaModificarPresupuestoFlujoCaja(Boolean isVisibilidadCeldaModificarPresupuestoFlujoCaja) {
		this.isVisibilidadCeldaModificarPresupuestoFlujoCaja = isVisibilidadCeldaModificarPresupuestoFlujoCaja;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarPresupuestoFlujoCaja() {
		return isVisibilidadCeldaActualizarPresupuestoFlujoCaja;
	}

	public void setIsVisibilidadCeldaActualizarPresupuestoFlujoCaja(Boolean isVisibilidadCeldaActualizarPresupuestoFlujoCaja) {
		this.isVisibilidadCeldaActualizarPresupuestoFlujoCaja = isVisibilidadCeldaActualizarPresupuestoFlujoCaja;
	}

	public Boolean getIsVisibilidadCeldaEliminarPresupuestoFlujoCaja() {
		return isVisibilidadCeldaEliminarPresupuestoFlujoCaja;
	}

	public void setIsVisibilidadCeldaEliminarPresupuestoFlujoCaja(Boolean isVisibilidadCeldaEliminarPresupuestoFlujoCaja) {
		this.isVisibilidadCeldaEliminarPresupuestoFlujoCaja = isVisibilidadCeldaEliminarPresupuestoFlujoCaja;
	}

	public Boolean getIsVisibilidadCeldaCancelarPresupuestoFlujoCaja() {
		return isVisibilidadCeldaCancelarPresupuestoFlujoCaja;
	}

	public void setIsVisibilidadCeldaCancelarPresupuestoFlujoCaja(Boolean isVisibilidadCeldaCancelarPresupuestoFlujoCaja) {
		this.isVisibilidadCeldaCancelarPresupuestoFlujoCaja = isVisibilidadCeldaCancelarPresupuestoFlujoCaja;
	}

	public Boolean getIsVisibilidadCeldaGuardarPresupuestoFlujoCaja() {
		return isVisibilidadCeldaGuardarPresupuestoFlujoCaja;
	}

	public void setIsVisibilidadCeldaGuardarPresupuestoFlujoCaja(Boolean isVisibilidadCeldaGuardarPresupuestoFlujoCaja) {
		this.isVisibilidadCeldaGuardarPresupuestoFlujoCaja = isVisibilidadCeldaGuardarPresupuestoFlujoCaja;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosPresupuestoFlujoCaja() {
		return isVisibilidadCeldaGuardarCambiosPresupuestoFlujoCaja;
	}

	public void setIsVisibilidadCeldaGuardarCambiosPresupuestoFlujoCaja(Boolean isVisibilidadCeldaGuardarCambiosPresupuestoFlujoCaja) {
		this.isVisibilidadCeldaGuardarCambiosPresupuestoFlujoCaja = isVisibilidadCeldaGuardarCambiosPresupuestoFlujoCaja;
	}
		
	public PresupuestoFlujoCajaSessionBean getpresupuestoflujocajaSessionBean() {
		return this.presupuestoflujocajaSessionBean;
	}
	
	public void setpresupuestoflujocajaSessionBean(PresupuestoFlujoCajaSessionBean presupuestoflujocajaSessionBean) {
		this.presupuestoflujocajaSessionBean=presupuestoflujocajaSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdAnio() {
		return this.isVisibilidadFK_IdAnio;
	}

	public void setisVisibilidadFK_IdAnio(Boolean isVisibilidadFK_IdAnio) {
		this.isVisibilidadFK_IdAnio=isVisibilidadFK_IdAnio;
	}

	public Boolean getisVisibilidadFK_IdCentroCosto() {
		return this.isVisibilidadFK_IdCentroCosto;
	}

	public void setisVisibilidadFK_IdCentroCosto(Boolean isVisibilidadFK_IdCentroCosto) {
		this.isVisibilidadFK_IdCentroCosto=isVisibilidadFK_IdCentroCosto;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysPresupuestoFlujoCaja(PresupuestoFlujoCaja presupuestoflujocaja)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(presupuestoflujocaja,null);
				this.setActualParaGuardarCuentaContableForeignKey(presupuestoflujocaja,null);
				this.setActualParaGuardarEjercicioForeignKey(presupuestoflujocaja,null);
				this.setActualParaGuardarPeriodoForeignKey(presupuestoflujocaja,null);
				this.setActualParaGuardarCentroCostoForeignKey(presupuestoflujocaja,null);
				this.setActualParaGuardarAnioForeignKey(presupuestoflujocaja,null);
				this.setActualParaGuardarMesForeignKey(presupuestoflujocaja,null);
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
	
	public void bugActualizarReferenciaActual(PresupuestoFlujoCaja presupuestoflujocaja,PresupuestoFlujoCaja presupuestoflujocajaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalPresupuestoFlujoCaja(presupuestoflujocaja);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		presupuestoflujocajaAux.setId(presupuestoflujocaja.getId());
		presupuestoflujocajaAux.setVersionRow(presupuestoflujocaja.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessPresupuestoFlujoCaja();
		
			int intSelectedRow = this.jTableDatosPresupuestoFlujoCaja.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoflujocaja =(PresupuestoFlujoCaja) this.presupuestoflujocajaLogic.getPresupuestoFlujoCajas().toArray()[this.jTableDatosPresupuestoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.presupuestoflujocaja =(PresupuestoFlujoCaja) this.presupuestoflujocajas.toArray()[this.jTableDatosPresupuestoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(PresupuestoFlujoCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualPresupuestoFlujoCaja(this.presupuestoflujocaja,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoFlujoCaja(this.presupuestoflujocaja);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = presupuestoflujocajaValidator.getInvalidValues(this.presupuestoflujocaja);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			presupuestoflujocajaLogic.setDatosCliente(datosCliente);
			presupuestoflujocajaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				presupuestoflujocajaAux=new  PresupuestoFlujoCaja();
				
				presupuestoflujocajaAux.setIsNew(true);
				presupuestoflujocajaAux.setIsChanged(true);
				
				presupuestoflujocajaAux.setPresupuestoFlujoCajaOriginal(this.presupuestoflujocaja);
				
				presupuestoflujocajaAux.setId(this.presupuestoflujocaja.getId());	
				presupuestoflujocajaAux.setVersionRow(this.presupuestoflujocaja.getVersionRow());	
				presupuestoflujocajaAux.setid_empresa(this.presupuestoflujocaja.getid_empresa());	
				presupuestoflujocajaAux.setid_cuenta_contable(this.presupuestoflujocaja.getid_cuenta_contable());	
				presupuestoflujocajaAux.setid_ejercicio(this.presupuestoflujocaja.getid_ejercicio());	
				presupuestoflujocajaAux.setid_periodo(this.presupuestoflujocaja.getid_periodo());	
				presupuestoflujocajaAux.setid_centro_costo(this.presupuestoflujocaja.getid_centro_costo());	
				presupuestoflujocajaAux.setvalor(this.presupuestoflujocaja.getvalor());	
				presupuestoflujocajaAux.setvalor_efectivo(this.presupuestoflujocaja.getvalor_efectivo());	
				presupuestoflujocajaAux.setporcentaje(this.presupuestoflujocaja.getporcentaje());	
				presupuestoflujocajaAux.setfecha_presupuesto(this.presupuestoflujocaja.getfecha_presupuesto());	
				presupuestoflujocajaAux.setfecha_proceso(this.presupuestoflujocaja.getfecha_proceso());	
				presupuestoflujocajaAux.setobservacion(this.presupuestoflujocaja.getobservacion());	
				presupuestoflujocajaAux.setid_anio(this.presupuestoflujocaja.getid_anio());	
				presupuestoflujocajaAux.setid_mes(this.presupuestoflujocaja.getid_mes());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.presupuestoflujocajaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(presupuestoflujocajaAux,presupuestoflujocajaLogic.getPresupuestoFlujoCajas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(presupuestoflujocajaAux,presupuestoflujocajas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.presupuestoflujocajaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						presupuestoflujocajaLogic.savePresupuestoFlujoCajas();//WithConnection
						//presupuestoflujocajaLogic.getSetVersionRowPresupuestoFlujoCajas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.presupuestoflujocaja,presupuestoflujocajaAux);
					
					this.refrescarForeignKeysDescripcionesPresupuestoFlujoCaja();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.presupuestoflujocajaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								presupuestoflujocajaLogic.savePresupuestoFlujoCajaRelaciones(presupuestoflujocajaAux);//WithConnection
								//presupuestoflujocajaLogic.getSetVersionRowPresupuestoFlujoCajas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.presupuestoflujocaja,presupuestoflujocajaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.presupuestoflujocajaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(presupuestoflujocajaAux,presupuestoflujocajaLogic.getPresupuestoFlujoCajas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(presupuestoflujocajaAux,presupuestoflujocajas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.presupuestoflujocaja,presupuestoflujocajaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				presupuestoflujocajaAux=new  PresupuestoFlujoCaja();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado() 
					|| (this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado() && this.presupuestoflujocaja.getId()>=0)) {
						
					presupuestoflujocajaAux.setIsNew(false);
				}
				
				presupuestoflujocajaAux.setIsDeleted(false);
			
				presupuestoflujocajaAux.setId(this.presupuestoflujocaja.getId());	
				presupuestoflujocajaAux.setVersionRow(this.presupuestoflujocaja.getVersionRow());	
				presupuestoflujocajaAux.setid_empresa(this.presupuestoflujocaja.getid_empresa());	
				presupuestoflujocajaAux.setid_cuenta_contable(this.presupuestoflujocaja.getid_cuenta_contable());	
				presupuestoflujocajaAux.setid_ejercicio(this.presupuestoflujocaja.getid_ejercicio());	
				presupuestoflujocajaAux.setid_periodo(this.presupuestoflujocaja.getid_periodo());	
				presupuestoflujocajaAux.setid_centro_costo(this.presupuestoflujocaja.getid_centro_costo());	
				presupuestoflujocajaAux.setvalor(this.presupuestoflujocaja.getvalor());	
				presupuestoflujocajaAux.setvalor_efectivo(this.presupuestoflujocaja.getvalor_efectivo());	
				presupuestoflujocajaAux.setporcentaje(this.presupuestoflujocaja.getporcentaje());	
				presupuestoflujocajaAux.setfecha_presupuesto(this.presupuestoflujocaja.getfecha_presupuesto());	
				presupuestoflujocajaAux.setfecha_proceso(this.presupuestoflujocaja.getfecha_proceso());	
				presupuestoflujocajaAux.setobservacion(this.presupuestoflujocaja.getobservacion());	
				presupuestoflujocajaAux.setid_anio(this.presupuestoflujocaja.getid_anio());	
				presupuestoflujocajaAux.setid_mes(this.presupuestoflujocaja.getid_mes());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(presupuestoflujocajaAux,presupuestoflujocajaLogic.getPresupuestoFlujoCajas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(presupuestoflujocajaAux,presupuestoflujocajas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.presupuestoflujocajaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						presupuestoflujocajaLogic.savePresupuestoFlujoCajas();//WithConnection
						//presupuestoflujocajaLogic.getSetVersionRowPresupuestoFlujoCajas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.presupuestoflujocaja,presupuestoflujocajaAux);
					
					this.refrescarForeignKeysDescripcionesPresupuestoFlujoCaja();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.presupuestoflujocajaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								presupuestoflujocajaLogic.savePresupuestoFlujoCajaRelaciones(presupuestoflujocajaAux);//WithConnection
								//presupuestoflujocajaLogic.getSetVersionRowPresupuestoFlujoCajas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.presupuestoflujocaja,presupuestoflujocajaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.presupuestoflujocajaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(presupuestoflujocajaAux,presupuestoflujocajaLogic.getPresupuestoFlujoCajas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(presupuestoflujocajaAux,presupuestoflujocajas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.presupuestoflujocaja,presupuestoflujocajaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				presupuestoflujocajaAux=new  PresupuestoFlujoCaja();
				
				presupuestoflujocajaAux.setIsNew(false);
				presupuestoflujocajaAux.setIsChanged(false);
				
				presupuestoflujocajaAux.setIsDeleted(true);
				
				presupuestoflujocajaAux.setId(this.presupuestoflujocaja.getId());	
				presupuestoflujocajaAux.setVersionRow(this.presupuestoflujocaja.getVersionRow());	
				presupuestoflujocajaAux.setid_empresa(this.presupuestoflujocaja.getid_empresa());	
				presupuestoflujocajaAux.setid_cuenta_contable(this.presupuestoflujocaja.getid_cuenta_contable());	
				presupuestoflujocajaAux.setid_ejercicio(this.presupuestoflujocaja.getid_ejercicio());	
				presupuestoflujocajaAux.setid_periodo(this.presupuestoflujocaja.getid_periodo());	
				presupuestoflujocajaAux.setid_centro_costo(this.presupuestoflujocaja.getid_centro_costo());	
				presupuestoflujocajaAux.setvalor(this.presupuestoflujocaja.getvalor());	
				presupuestoflujocajaAux.setvalor_efectivo(this.presupuestoflujocaja.getvalor_efectivo());	
				presupuestoflujocajaAux.setporcentaje(this.presupuestoflujocaja.getporcentaje());	
				presupuestoflujocajaAux.setfecha_presupuesto(this.presupuestoflujocaja.getfecha_presupuesto());	
				presupuestoflujocajaAux.setfecha_proceso(this.presupuestoflujocaja.getfecha_proceso());	
				presupuestoflujocajaAux.setobservacion(this.presupuestoflujocaja.getobservacion());	
				presupuestoflujocajaAux.setid_anio(this.presupuestoflujocaja.getid_anio());	
				presupuestoflujocajaAux.setid_mes(this.presupuestoflujocaja.getid_mes());	
				
				if(this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.presupuestoflujocajaAux.getId()>=0) {	
						this.presupuestoflujocajasEliminados.add(presupuestoflujocajaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(presupuestoflujocajaAux,presupuestoflujocajaLogic.getPresupuestoFlujoCajas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(presupuestoflujocajaAux,presupuestoflujocajas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.presupuestoflujocajaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						presupuestoflujocajaLogic.savePresupuestoFlujoCajas();//WithConnection
						//presupuestoflujocajaLogic.getSetVersionRowPresupuestoFlujoCajas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.presupuestoflujocajaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								presupuestoflujocajaLogic.savePresupuestoFlujoCajaRelaciones(presupuestoflujocajaAux);//WithConnection
								//presupuestoflujocajaLogic.getSetVersionRowPresupuestoFlujoCajas();//WithConnection
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
							if(this.presupuestoflujocajaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(presupuestoflujocajaAux,presupuestoflujocajaLogic.getPresupuestoFlujoCajas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(presupuestoflujocajaAux,presupuestoflujocajas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoflujocajaLogic.getPresupuestoFlujoCajas().addAll(this.presupuestoflujocajasEliminados);
					
					presupuestoflujocajaLogic.savePresupuestoFlujoCajas();//WithConnection
					//presupuestoflujocajaLogic.getSetVersionRowPresupuestoFlujoCajas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesPresupuestoFlujoCaja();
				
				this.presupuestoflujocajasEliminados= new ArrayList<PresupuestoFlujoCaja>();		
			}
			
			if(this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Presupuesto Flujo Caja GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Presupuesto Flujo Caja",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.presupuestoflujocaja=presupuestoflujocajaAux;
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
      		//this.finishProcessPresupuestoFlujoCaja();
      	}
		
	}	
	
	public void actualizarRelaciones(PresupuestoFlujoCaja presupuestoflujocajaLocal) throws Exception {
		
		if(this.presupuestoflujocajaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(PresupuestoFlujoCaja presupuestoflujocajaLocal) throws Exception {	
		if(this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				presupuestoflujocajaLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CuentaContableDetalleFormJInternalFrame.class)) {
				CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrameLocal=(CuentaContableBeanSwingJInternalFrame) ((CuentaContableDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				cuentacontableBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCuentaContable(cuentacontableBeanSwingJInternalFrameLocal.getcuentacontable(),true);
				cuentacontableBeanSwingJInternalFrameLocal.actualizarLista(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable,this.cuentacontablesForeignKey);

				cuentacontableBeanSwingJInternalFrameLocal.actualizarRelaciones(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable);

				presupuestoflujocajaLocal.setCuentaContable(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable);

				this.addItemDefectoCombosForeignKeyCuentaContable();
				this.cargarCombosFrameCuentaContablesForeignKey("Formulario");
				this.setActualCuentaContableForeignKey(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EjercicioDetalleFormJInternalFrame.class)) {
				EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrameLocal=(EjercicioBeanSwingJInternalFrame) ((EjercicioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ejercicioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEjercicio(ejercicioBeanSwingJInternalFrameLocal.getejercicio(),true);
				ejercicioBeanSwingJInternalFrameLocal.actualizarLista(ejercicioBeanSwingJInternalFrameLocal.ejercicio,this.ejerciciosForeignKey);

				ejercicioBeanSwingJInternalFrameLocal.actualizarRelaciones(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				presupuestoflujocajaLocal.setEjercicio(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				this.addItemDefectoCombosForeignKeyEjercicio();
				this.cargarCombosFrameEjerciciosForeignKey("Formulario");
				this.setActualEjercicioForeignKey(ejercicioBeanSwingJInternalFrameLocal.ejercicio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(PeriodoDetalleFormJInternalFrame.class)) {
				PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrameLocal=(PeriodoBeanSwingJInternalFrame) ((PeriodoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				periodoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPeriodo(periodoBeanSwingJInternalFrameLocal.getperiodo(),true);
				periodoBeanSwingJInternalFrameLocal.actualizarLista(periodoBeanSwingJInternalFrameLocal.periodo,this.periodosForeignKey);

				periodoBeanSwingJInternalFrameLocal.actualizarRelaciones(periodoBeanSwingJInternalFrameLocal.periodo);

				presupuestoflujocajaLocal.setPeriodo(periodoBeanSwingJInternalFrameLocal.periodo);

				this.addItemDefectoCombosForeignKeyPeriodo();
				this.cargarCombosFramePeriodosForeignKey("Formulario");
				this.setActualPeriodoForeignKey(periodoBeanSwingJInternalFrameLocal.periodo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CentroCostoDetalleFormJInternalFrame.class)) {
				CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrameLocal=(CentroCostoBeanSwingJInternalFrame) ((CentroCostoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				centrocostoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCentroCosto(centrocostoBeanSwingJInternalFrameLocal.getcentrocosto(),true);
				centrocostoBeanSwingJInternalFrameLocal.actualizarLista(centrocostoBeanSwingJInternalFrameLocal.centrocosto,this.centrocostosForeignKey);

				centrocostoBeanSwingJInternalFrameLocal.actualizarRelaciones(centrocostoBeanSwingJInternalFrameLocal.centrocosto);

				presupuestoflujocajaLocal.setCentroCosto(centrocostoBeanSwingJInternalFrameLocal.centrocosto);

				this.addItemDefectoCombosForeignKeyCentroCosto();
				this.cargarCombosFrameCentroCostosForeignKey("Formulario");
				this.setActualCentroCostoForeignKey(centrocostoBeanSwingJInternalFrameLocal.centrocosto.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(AnioDetalleFormJInternalFrame.class)) {
				AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrameLocal=(AnioBeanSwingJInternalFrame) ((AnioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				anioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoAnio(anioBeanSwingJInternalFrameLocal.getanio(),true);
				anioBeanSwingJInternalFrameLocal.actualizarLista(anioBeanSwingJInternalFrameLocal.anio,this.aniosForeignKey);

				anioBeanSwingJInternalFrameLocal.actualizarRelaciones(anioBeanSwingJInternalFrameLocal.anio);

				presupuestoflujocajaLocal.setAnio(anioBeanSwingJInternalFrameLocal.anio);

				this.addItemDefectoCombosForeignKeyAnio();
				this.cargarCombosFrameAniosForeignKey("Formulario");
				this.setActualAnioForeignKey(anioBeanSwingJInternalFrameLocal.anio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(MesDetalleFormJInternalFrame.class)) {
				MesBeanSwingJInternalFrame mesBeanSwingJInternalFrameLocal=(MesBeanSwingJInternalFrame) ((MesDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				mesBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoMes(mesBeanSwingJInternalFrameLocal.getmes(),true);
				mesBeanSwingJInternalFrameLocal.actualizarLista(mesBeanSwingJInternalFrameLocal.mes,this.messForeignKey);

				mesBeanSwingJInternalFrameLocal.actualizarRelaciones(mesBeanSwingJInternalFrameLocal.mes);

				presupuestoflujocajaLocal.setMes(mesBeanSwingJInternalFrameLocal.mes);

				this.addItemDefectoCombosForeignKeyMes();
				this.cargarCombosFrameMessForeignKey("Formulario");
				this.setActualMesForeignKey(mesBeanSwingJInternalFrameLocal.mes.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarPresupuestoFlujoCajaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosPresupuestoFlujoCaja.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.presupuestoflujocaja =(PresupuestoFlujoCaja) this.presupuestoflujocajaLogic.getPresupuestoFlujoCajas().toArray()[this.jTableDatosPresupuestoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.presupuestoflujocaja =(PresupuestoFlujoCaja) this.presupuestoflujocajas.toArray()[this.jTableDatosPresupuestoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = presupuestoflujocajaValidator.getInvalidValues(this.presupuestoflujocaja);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(PresupuestoFlujoCaja presupuestoflujocaja,List<PresupuestoFlujoCaja> presupuestoflujocajas) throws Exception {
		try	{		
			PresupuestoFlujoCajaConstantesFunciones.actualizarLista(presupuestoflujocaja,presupuestoflujocajas,this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(PresupuestoFlujoCaja presupuestoflujocaja,List<PresupuestoFlujoCaja> presupuestoflujocajas) throws Exception {
		try	{			
			PresupuestoFlujoCajaConstantesFunciones.actualizarSelectedLista(presupuestoflujocaja,presupuestoflujocajas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<PresupuestoFlujoCaja> presupuestoflujocajasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				presupuestoflujocajasLocal=this.presupuestoflujocajaLogic.getPresupuestoFlujoCajas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				presupuestoflujocajasLocal=this.presupuestoflujocajas;
			}
			//ARCHITECTURE
		
			for(PresupuestoFlujoCaja presupuestoflujocajaLocal:presupuestoflujocajasLocal) {
				if(this.permiteMantenimiento(presupuestoflujocajaLocal) && presupuestoflujocajaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+PresupuestoFlujoCajaConstantesFunciones.getPresupuestoFlujoCajaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(PresupuestoFlujoCajaConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jLabelid_empresaPresupuestoFlujoCaja,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresupuestoFlujoCajaConstantesFunciones.IDCUENTACONTABLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jLabelid_cuenta_contablePresupuestoFlujoCaja,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresupuestoFlujoCajaConstantesFunciones.IDEJERCICIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jLabelid_ejercicioPresupuestoFlujoCaja,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresupuestoFlujoCajaConstantesFunciones.IDPERIODO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jLabelid_periodoPresupuestoFlujoCaja,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresupuestoFlujoCajaConstantesFunciones.IDCENTROCOSTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jLabelid_centro_costoPresupuestoFlujoCaja,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresupuestoFlujoCajaConstantesFunciones.VALOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jLabelvalorPresupuestoFlujoCaja,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresupuestoFlujoCajaConstantesFunciones.VALOREFECTIVO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jLabelvalor_efectivoPresupuestoFlujoCaja,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresupuestoFlujoCajaConstantesFunciones.PORCENTAJE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jLabelporcentajePresupuestoFlujoCaja,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresupuestoFlujoCajaConstantesFunciones.FECHAPRESUPUESTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jLabelfecha_presupuestoPresupuestoFlujoCaja,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresupuestoFlujoCajaConstantesFunciones.FECHAPROCESO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jLabelfecha_procesoPresupuestoFlujoCaja,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresupuestoFlujoCajaConstantesFunciones.OBSERVACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jLabelobservacionPresupuestoFlujoCaja,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresupuestoFlujoCajaConstantesFunciones.IDANIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jLabelid_anioPresupuestoFlujoCaja,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresupuestoFlujoCajaConstantesFunciones.IDMES)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jLabelid_mesPresupuestoFlujoCaja,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jLabelid_empresaPresupuestoFlujoCaja,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jLabelid_cuenta_contablePresupuestoFlujoCaja,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jLabelid_ejercicioPresupuestoFlujoCaja,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jLabelid_periodoPresupuestoFlujoCaja,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jLabelid_centro_costoPresupuestoFlujoCaja,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jLabelvalorPresupuestoFlujoCaja,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jLabelvalor_efectivoPresupuestoFlujoCaja,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jLabelporcentajePresupuestoFlujoCaja,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jLabelfecha_presupuestoPresupuestoFlujoCaja,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jLabelfecha_procesoPresupuestoFlujoCaja,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jLabelobservacionPresupuestoFlujoCaja,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jLabelid_anioPresupuestoFlujoCaja,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jLabelid_mesPresupuestoFlujoCaja,"");
		
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
		this.iIdNuevoPresupuestoFlujoCaja--;	
		
		
		this.presupuestoflujocajaAux=new PresupuestoFlujoCaja();
		
		this.presupuestoflujocajaAux.setId(this.iIdNuevoPresupuestoFlujoCaja);
		this.presupuestoflujocajaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.presupuestoflujocajaLogic.getPresupuestoFlujoCajas().add(this.presupuestoflujocajaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.presupuestoflujocajas.add(this.presupuestoflujocajaAux);
		}
		//ARCHITECTURE
		
		this.presupuestoflujocaja=this.presupuestoflujocajaAux;
		
		if(PresupuestoFlujoCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioPresupuestoFlujoCaja(this.presupuestoflujocaja);
			this.setVariablesObjetoActualToFormularioForeignKeyPresupuestoFlujoCaja(this.presupuestoflujocaja);
		}
				
		//this.setDefaultControlesPresupuestoFlujoCaja();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyPresupuestoFlujoCaja();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyPresupuestoFlujoCaja();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyPresupuestoFlujoCaja();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPresupuestoFlujoCaja(this.presupuestoflujocajaBean,this.presupuestoflujocaja,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoFlujoCaja(this.presupuestoflujocaja);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.presupuestoflujocajaSessionBean.getConGuardarRelaciones()) {
			classes=PresupuestoFlujoCajaConstantesFunciones.getClassesRelationshipsOfPresupuestoFlujoCaja(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.presupuestoflujocajaReturnGeneral=presupuestoflujocajaLogic.procesarEventosPresupuestoFlujoCajasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.presupuestoflujocajaLogic.getPresupuestoFlujoCajas(),this.presupuestoflujocaja,this.presupuestoflujocajaParameterGeneral,this.isEsNuevoPresupuestoFlujoCaja,classes);//this.presupuestoflujocajaLogic.getPresupuestoFlujoCaja()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanPresupuestoFlujoCaja(this.presupuestoflujocajaReturnGeneral,this.presupuestoflujocajaBean,false);
		
		if(this.presupuestoflujocajaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyPresupuestoFlujoCaja(this.presupuestoflujocajaReturnGeneral.getPresupuestoFlujoCaja());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioPresupuestoFlujoCaja(this.presupuestoflujocajaReturnGeneral.getPresupuestoFlujoCaja());
		}
		
		if(this.presupuestoflujocajaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioPresupuestoFlujoCaja(this.presupuestoflujocajaReturnGeneral.getPresupuestoFlujoCaja(),classes);//this.presupuestoflujocajaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualPresupuestoFlujoCaja(this.presupuestoflujocaja,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyPresupuestoFlujoCaja();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyPresupuestoFlujoCaja();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PresupuestoFlujoCajaBeanSwingJInternalFrameAdditional.RecargarFormPresupuestoFlujoCaja(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingPresupuestoFlujoCaja(false);
						
			if(presupuestoflujocajaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(PresupuestoFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPresupuestoFlujoCaja();
			}
			
			this.actualizarVisualTableDatosPresupuestoFlujoCaja();
			
			this.jTableDatosPresupuestoFlujoCaja.setRowSelectionInterval(this.getIndiceNuevoPresupuestoFlujoCaja(), this.getIndiceNuevoPresupuestoFlujoCaja());
			
			this.seleccionarFilaTablaPresupuestoFlujoCajaActual();
						
			this.actualizarEstadoCeldasBotonesPresupuestoFlujoCaja("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesPresupuestoFlujoCaja(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jTextFieldvalorPresupuestoFlujoCaja.setEnabled(isHabilitar && this.presupuestoflujocajaConstantesFunciones.activarvalorPresupuestoFlujoCaja);
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jTextFieldvalor_efectivoPresupuestoFlujoCaja.setEnabled(isHabilitar && this.presupuestoflujocajaConstantesFunciones.activarvalor_efectivoPresupuestoFlujoCaja);
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jTextFieldporcentajePresupuestoFlujoCaja.setEnabled(isHabilitar && this.presupuestoflujocajaConstantesFunciones.activarporcentajePresupuestoFlujoCaja);
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jDateChooserfecha_presupuestoPresupuestoFlujoCaja.setEnabled(isHabilitar && this.presupuestoflujocajaConstantesFunciones.activarfecha_presupuestoPresupuestoFlujoCaja);
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jDateChooserfecha_procesoPresupuestoFlujoCaja.setEnabled(isHabilitar && this.presupuestoflujocajaConstantesFunciones.activarfecha_procesoPresupuestoFlujoCaja);
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jTextAreaobservacionPresupuestoFlujoCaja.setEnabled(isHabilitar && this.presupuestoflujocajaConstantesFunciones.activarobservacionPresupuestoFlujoCaja);	
		//
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_empresaPresupuestoFlujoCaja.setEnabled(isHabilitar && this.presupuestoflujocajaConstantesFunciones.activarid_empresaPresupuestoFlujoCaja);
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_cuenta_contablePresupuestoFlujoCaja.setEnabled(isHabilitar && this.presupuestoflujocajaConstantesFunciones.activarid_cuenta_contablePresupuestoFlujoCaja);//
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_ejercicioPresupuestoFlujoCaja.setEnabled(isHabilitar && this.presupuestoflujocajaConstantesFunciones.activarid_ejercicioPresupuestoFlujoCaja);//
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_periodoPresupuestoFlujoCaja.setEnabled(isHabilitar && this.presupuestoflujocajaConstantesFunciones.activarid_periodoPresupuestoFlujoCaja);
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_centro_costoPresupuestoFlujoCaja.setEnabled(isHabilitar && this.presupuestoflujocajaConstantesFunciones.activarid_centro_costoPresupuestoFlujoCaja);//
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_anioPresupuestoFlujoCaja.setEnabled(isHabilitar && this.presupuestoflujocajaConstantesFunciones.activarid_anioPresupuestoFlujoCaja);//
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_mesPresupuestoFlujoCaja.setEnabled(isHabilitar && this.presupuestoflujocajaConstantesFunciones.activarid_mesPresupuestoFlujoCaja);
	};
	
	public void setDefaultControlesPresupuestoFlujoCaja() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoPresupuestoFlujoCaja(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.presupuestoflujocajaSessionBean.setConGuardarRelaciones(true);			
			this.presupuestoflujocajaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jTabbedPaneRelacionesPresupuestoFlujoCaja.setVisible(true);
			
					
		} else {
			//this.presupuestoflujocajaSessionBean.setConGuardarRelaciones(false);			
			this.presupuestoflujocajaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jTabbedPaneRelacionesPresupuestoFlujoCaja.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoPresupuestoFlujoCaja() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PresupuestoFlujoCaja presupuestoflujocajaAux:this.presupuestoflujocajaLogic.getPresupuestoFlujoCajas()) {
				if(presupuestoflujocajaAux.getId().equals(this.iIdNuevoPresupuestoFlujoCaja)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PresupuestoFlujoCaja presupuestoflujocajaAux:this.presupuestoflujocajas) {
				if(presupuestoflujocajaAux.getId().equals(this.iIdNuevoPresupuestoFlujoCaja)) {
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
	
	public int getIndiceActualPresupuestoFlujoCaja(PresupuestoFlujoCaja presupuestoflujocaja,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PresupuestoFlujoCaja presupuestoflujocajaAux:this.presupuestoflujocajaLogic.getPresupuestoFlujoCajas()) {
				if(presupuestoflujocajaAux.getId().equals(presupuestoflujocaja.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PresupuestoFlujoCaja presupuestoflujocajaAux:this.presupuestoflujocajas) {
				if(presupuestoflujocajaAux.getId().equals(presupuestoflujocaja.getId())) {
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
	
	public void setCamposBaseDesdeOriginalPresupuestoFlujoCaja(PresupuestoFlujoCaja presupuestoflujocajaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PresupuestoFlujoCaja presupuestoflujocajaAux:this.presupuestoflujocajaLogic.getPresupuestoFlujoCajas()) {
				if(presupuestoflujocajaAux.getPresupuestoFlujoCajaOriginal().getId().equals(presupuestoflujocajaOriginal.getId())) {
					existe=true;
					presupuestoflujocajaOriginal.setId(presupuestoflujocajaAux.getId());
					presupuestoflujocajaOriginal.setVersionRow(presupuestoflujocajaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PresupuestoFlujoCaja presupuestoflujocajaAux:this.presupuestoflujocajas) {
				if(presupuestoflujocajaAux.getPresupuestoFlujoCajaOriginal().getId().equals(presupuestoflujocajaOriginal.getId())) {
					existe=true;
					presupuestoflujocajaOriginal.setId(presupuestoflujocajaAux.getId());
					presupuestoflujocajaOriginal.setVersionRow(presupuestoflujocajaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosPresupuestoFlujoCaja(Boolean esParaCancelar) throws Exception {
		presupuestoflujocajasAux=new ArrayList<PresupuestoFlujoCaja>();
		presupuestoflujocajaAux=new PresupuestoFlujoCaja();
		
		if(!this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(PresupuestoFlujoCaja presupuestoflujocajaAux:this.presupuestoflujocajaLogic.getPresupuestoFlujoCajas()) {
					if(presupuestoflujocajaAux.getId()<0) {
						presupuestoflujocajasAux.add(presupuestoflujocajaAux);
					}		
				}
				this.iIdNuevoPresupuestoFlujoCaja=0L;
				this.presupuestoflujocajaLogic.getPresupuestoFlujoCajas().removeAll(presupuestoflujocajasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PresupuestoFlujoCaja presupuestoflujocajaAux:this.presupuestoflujocajas) {
					if(presupuestoflujocajaAux.getId()<0) {
						presupuestoflujocajasAux.add(presupuestoflujocajaAux);
					}		
				}
				this.iIdNuevoPresupuestoFlujoCaja=0L;
				this.presupuestoflujocajas.removeAll(presupuestoflujocajasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoPresupuestoFlujoCaja 
					&& this.presupuestoflujocajaLogic.getPresupuestoFlujoCajas().size()>0
					) {
					presupuestoflujocajaAux=this.presupuestoflujocajaLogic.getPresupuestoFlujoCajas().get(this.presupuestoflujocajaLogic.getPresupuestoFlujoCajas().size() - 1);
				
					if(presupuestoflujocajaAux.getId()<0) {
						this.presupuestoflujocajaLogic.getPresupuestoFlujoCajas().remove(presupuestoflujocajaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoPresupuestoFlujoCaja && this.presupuestoflujocajas.size()>0) {
					presupuestoflujocajaAux=this.presupuestoflujocajas.get(this.presupuestoflujocajas.size() - 1);
				
					if(presupuestoflujocajaAux.getId()<0) {
						this.presupuestoflujocajas.remove(presupuestoflujocajaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoPresupuestoFlujoCaja(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(presupuestoflujocaja.getId()<0) {
				this.presupuestoflujocajaLogic.getPresupuestoFlujoCajas().remove(this.presupuestoflujocaja);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(presupuestoflujocaja.getId()<0) {
				this.presupuestoflujocajas.remove(this.presupuestoflujocaja);
			}
		}			
	}
	
	public void setEstadosInicialesPresupuestoFlujoCaja(List<PresupuestoFlujoCaja> presupuestoflujocajasAux) throws Exception {
		PresupuestoFlujoCajaConstantesFunciones.setEstadosInicialesPresupuestoFlujoCaja(presupuestoflujocajasAux);
	}
	
	public void setEstadosInicialesPresupuestoFlujoCaja(PresupuestoFlujoCaja presupuestoflujocajaAux) throws Exception {
		PresupuestoFlujoCajaConstantesFunciones.setEstadosInicialesPresupuestoFlujoCaja(presupuestoflujocajaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarPresupuestoFlujoCajaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesPresupuestoFlujoCaja("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarPresupuestoFlujoCajaActual()) {
				if(!this.isEsNuevoPresupuestoFlujoCaja) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesPresupuestoFlujoCaja("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoPresupuestoFlujoCaja=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarPresupuestoFlujoCajaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Presupuesto Flujo Caja ?", "MANTENIMIENTO DE Presupuesto Flujo Caja", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesPresupuestoFlujoCaja("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(PresupuestoFlujoCaja presupuestoflujocaja) throws Exception {
		PresupuestoFlujoCajaConstantesFunciones.seleccionarAsignar(this.presupuestoflujocaja,presupuestoflujocaja);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarPresupuestoFlujoCaja=this.isPermisoActualizarOriginalPresupuestoFlujoCaja;
			
			
			this.seleccionarAsignar(presupuestoflujocaja);
			
			

			idCuentaContableActual=presupuestoflujocaja.getid_cuenta_contable();
			this.seleccionarCuentaContableActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PresupuestoFlujoCajaConstantesFunciones.quitarEspaciosPresupuestoFlujoCaja(this.presupuestoflujocaja,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesPresupuestoFlujoCaja("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.presupuestoflujocajaSessionBean.setsFuncionBusquedaRapida(this.presupuestoflujocajaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
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
			if(this.isEsNuevoPresupuestoFlujoCaja) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosPresupuestoFlujoCaja(esParaCancelar);				
				this.cancelarNuevoPresupuestoFlujoCaja(esParaCancelar);								
			}
			
			this.presupuestoflujocaja=new PresupuestoFlujoCaja();
			
			this.inicializarPresupuestoFlujoCaja();
			
			this.actualizarEstadoCeldasBotonesPresupuestoFlujoCaja("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarPresupuestoFlujoCaja() throws Exception {
		try {
			PresupuestoFlujoCajaConstantesFunciones.inicializarPresupuestoFlujoCaja(this.presupuestoflujocaja);
			
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
			FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.presupuestoflujocajaLogic.getPresupuestoFlujoCajas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReportePresupuestoFlujoCajas(String sAccionBusqueda,List<PresupuestoFlujoCaja> presupuestoflujocajasParaReportes) throws Exception {
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
					sPathReporteFinal="PresupuestoFlujoCaja"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="PresupuestoFlujoCajaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("PresupuestoFlujoCajaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="PresupuestoFlujoCaja"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Presupuesto Flujo Cajas");		
		parameters.put("busquedapor", PresupuestoFlujoCajaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourcePresupuestoFlujoCaja=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			PresupuestoFlujoCajaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			PresupuestoFlujoCajaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourcePresupuestoFlujoCaja=new JRBeanArrayDataSource(PresupuestoFlujoCajaJInternalFrame.TraerPresupuestoFlujoCajaBeans(presupuestoflujocajasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourcePresupuestoFlujoCaja);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+PresupuestoFlujoCajaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+PresupuestoFlujoCajaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(PresupuestoFlujoCajaBean.TraerPresupuestoFlujoCajaBeans(presupuestoflujocajasParaReportes).toArray()));
							
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
				this.generarExcelReportePresupuestoFlujoCajas(sAccionBusqueda,sTipoArchivoReporte,presupuestoflujocajasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalPresupuestoFlujoCajas(sAccionBusqueda,sTipoArchivoReporte,presupuestoflujocajasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoPresupuestoFlujoCajaActionPerformed(null);
					//this.generarExcelReportePresupuestoFlujoCajas(sAccionBusqueda,sTipoArchivoReporte,presupuestoflujocajasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalPresupuestoFlujoCajas(sAccionBusqueda,sTipoArchivoReporte,presupuestoflujocajasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesPresupuestoFlujoCajas(sAccionBusqueda,sTipoArchivoReporte,presupuestoflujocajasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesPresupuestoFlujoCajas(sAccionBusqueda,sTipoArchivoReporte,presupuestoflujocajasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReportePresupuestoFlujoCajas(String sAccionBusqueda,String sTipoArchivoReporte,List<PresupuestoFlujoCaja> presupuestoflujocajasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presupuestoflujocaja";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PresupuestoFlujoCajas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPresupuestoFlujoCaja("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(PresupuestoFlujoCaja presupuestoflujocaja : presupuestoflujocajasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			PresupuestoFlujoCajaConstantesFunciones.generarExcelReporteDataPresupuestoFlujoCaja("NORMAL",row,workbook,presupuestoflujocaja,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Presupuesto Flujo Caja",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderPresupuestoFlujoCaja(String sTipo,Row row,Workbook workbook) {
		
		PresupuestoFlujoCajaConstantesFunciones.generarExcelReporteHeaderPresupuestoFlujoCaja(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalPresupuestoFlujoCajas(String sAccionBusqueda,String sTipoArchivoReporte,List<PresupuestoFlujoCaja> presupuestoflujocajasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presupuestoflujocaja_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PresupuestoFlujoCajas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(PresupuestoFlujoCaja presupuestoflujocaja : presupuestoflujocajasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(PresupuestoFlujoCajaConstantesFunciones.getPresupuestoFlujoCajaDescripcion(presupuestoflujocaja));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresupuestoFlujoCajaConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresupuestoFlujoCajaConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presupuestoflujocaja.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresupuestoFlujoCajaConstantesFunciones.LABEL_IDCUENTACONTABLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresupuestoFlujoCajaConstantesFunciones.LABEL_IDCUENTACONTABLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presupuestoflujocaja.getcuentacontable_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresupuestoFlujoCajaConstantesFunciones.LABEL_IDEJERCICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresupuestoFlujoCajaConstantesFunciones.LABEL_IDEJERCICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presupuestoflujocaja.getejercicio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresupuestoFlujoCajaConstantesFunciones.LABEL_IDPERIODO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresupuestoFlujoCajaConstantesFunciones.LABEL_IDPERIODO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presupuestoflujocaja.getperiodo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresupuestoFlujoCajaConstantesFunciones.LABEL_IDCENTROCOSTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresupuestoFlujoCajaConstantesFunciones.LABEL_IDCENTROCOSTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presupuestoflujocaja.getcentrocosto_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresupuestoFlujoCajaConstantesFunciones.LABEL_VALOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresupuestoFlujoCajaConstantesFunciones.LABEL_VALOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presupuestoflujocaja.getvalor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresupuestoFlujoCajaConstantesFunciones.LABEL_VALOREFECTIVO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresupuestoFlujoCajaConstantesFunciones.LABEL_VALOREFECTIVO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presupuestoflujocaja.getvalor_efectivo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresupuestoFlujoCajaConstantesFunciones.LABEL_PORCENTAJE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresupuestoFlujoCajaConstantesFunciones.LABEL_PORCENTAJE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presupuestoflujocaja.getporcentaje());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresupuestoFlujoCajaConstantesFunciones.LABEL_FECHAPRESUPUESTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresupuestoFlujoCajaConstantesFunciones.LABEL_FECHAPRESUPUESTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presupuestoflujocaja.getfecha_presupuesto());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresupuestoFlujoCajaConstantesFunciones.LABEL_FECHAPROCESO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresupuestoFlujoCajaConstantesFunciones.LABEL_FECHAPROCESO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presupuestoflujocaja.getfecha_proceso());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresupuestoFlujoCajaConstantesFunciones.LABEL_OBSERVACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresupuestoFlujoCajaConstantesFunciones.LABEL_OBSERVACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presupuestoflujocaja.getobservacion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresupuestoFlujoCajaConstantesFunciones.LABEL_IDANIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresupuestoFlujoCajaConstantesFunciones.LABEL_IDANIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presupuestoflujocaja.getanio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresupuestoFlujoCajaConstantesFunciones.LABEL_IDMES))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresupuestoFlujoCajaConstantesFunciones.LABEL_IDMES);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presupuestoflujocaja.getmes_descripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Presupuesto Flujo Caja",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesPresupuestoFlujoCajas(String sAccionBusqueda,String sTipoArchivoReporte,List<PresupuestoFlujoCaja> presupuestoflujocajasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<PresupuestoFlujoCaja> presupuestoflujocajasRespaldo=null;
		
		classes=PresupuestoFlujoCajaConstantesFunciones.getClassesRelationshipsOfPresupuestoFlujoCaja(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.presupuestoflujocajaLogic.setDatosCliente(this.datosCliente);
		this.presupuestoflujocajaLogic.setDatosDeep(this.datosDeep);
		this.presupuestoflujocajaLogic.setIsConDeep(true);
		
		presupuestoflujocajasRespaldo=this.presupuestoflujocajaLogic.getPresupuestoFlujoCajas();
		
		this.presupuestoflujocajaLogic.setPresupuestoFlujoCajas(presupuestoflujocajasParaReportes);	
		this.presupuestoflujocajaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		presupuestoflujocajasParaReportes=this.presupuestoflujocajaLogic.getPresupuestoFlujoCajas();
		this.presupuestoflujocajaLogic.setPresupuestoFlujoCajas(presupuestoflujocajasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presupuestoflujocaja_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PresupuestoFlujoCajas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPresupuestoFlujoCaja("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(PresupuestoFlujoCaja presupuestoflujocaja : presupuestoflujocajasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderPresupuestoFlujoCaja("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			PresupuestoFlujoCajaConstantesFunciones.generarExcelReporteDataPresupuestoFlujoCaja("NORMAL",row,workbook,presupuestoflujocaja,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(PresupuestoFlujoCajaConstantesFunciones.getPresupuestoFlujoCajaDescripcion(presupuestoflujocaja));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Presupuesto Flujo Caja",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoPresupuestoFlujoCaja.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPresupuestoFlujoCaja.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoPresupuestoFlujoCaja.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPresupuestoFlujoCaja.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessPresupuestoFlujoCaja() throws Exception {		
		this.startProcessPresupuestoFlujoCaja(true);
	}
	
	public void startProcessPresupuestoFlujoCaja(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasPresupuestoFlujoCaja ,this.jPanelParametrosReportesPresupuestoFlujoCaja, this.jScrollPanelDatosPresupuestoFlujoCaja,this.jPanelPaginacionPresupuestoFlujoCaja, this.jScrollPanelDatosEdicionPresupuestoFlujoCaja, this.jPanelAccionesPresupuestoFlujoCaja,this.jPanelAccionesFormularioPresupuestoFlujoCaja,this.jmenuBarPresupuestoFlujoCaja,this.jmenuBarDetallePresupuestoFlujoCaja,this.jTtoolBarPresupuestoFlujoCaja,this.jTtoolBarDetallePresupuestoFlujoCaja);		
		
		final JTabbedPane jTabbedPaneBusquedasPresupuestoFlujoCaja=this.jTabbedPaneBusquedasPresupuestoFlujoCaja; 
		
		final JPanel jPanelParametrosReportesPresupuestoFlujoCaja=this.jPanelParametrosReportesPresupuestoFlujoCaja;
		//final JScrollPane jScrollPanelDatosPresupuestoFlujoCaja=this.jScrollPanelDatosPresupuestoFlujoCaja;
		final JTable jTableDatosPresupuestoFlujoCaja=this.jTableDatosPresupuestoFlujoCaja;		
		final JPanel jPanelPaginacionPresupuestoFlujoCaja=this.jPanelPaginacionPresupuestoFlujoCaja;
		//final JScrollPane jScrollPanelDatosEdicionPresupuestoFlujoCaja=this.jScrollPanelDatosEdicionPresupuestoFlujoCaja;
		final JPanel jPanelAccionesPresupuestoFlujoCaja=this.jPanelAccionesPresupuestoFlujoCaja;
		
		JPanel jPanelCamposAuxiliarPresupuestoFlujoCaja=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarPresupuestoFlujoCaja=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) {
			jPanelCamposAuxiliarPresupuestoFlujoCaja=this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jPanelCamposPresupuestoFlujoCaja;
			jPanelAccionesFormularioAuxiliarPresupuestoFlujoCaja=this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jPanelAccionesFormularioPresupuestoFlujoCaja;
		}
		
		final JPanel jPanelCamposPresupuestoFlujoCaja=jPanelCamposAuxiliarPresupuestoFlujoCaja;
		final JPanel jPanelAccionesFormularioPresupuestoFlujoCaja=jPanelAccionesFormularioAuxiliarPresupuestoFlujoCaja;
		
		
		final JMenuBar jmenuBarPresupuestoFlujoCaja=this.jmenuBarPresupuestoFlujoCaja;
		final JToolBar jTtoolBarPresupuestoFlujoCaja=this.jTtoolBarPresupuestoFlujoCaja;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarPresupuestoFlujoCaja=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPresupuestoFlujoCaja=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) {
			jmenuBarDetalleAuxiliarPresupuestoFlujoCaja=this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jmenuBarDetallePresupuestoFlujoCaja;
			jTtoolBarDetalleAuxiliarPresupuestoFlujoCaja=this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jTtoolBarDetallePresupuestoFlujoCaja;
		}
		
		final JMenuBar jmenuBarDetallePresupuestoFlujoCaja=jmenuBarDetalleAuxiliarPresupuestoFlujoCaja;
		final JToolBar jTtoolBarDetallePresupuestoFlujoCaja=jTtoolBarDetalleAuxiliarPresupuestoFlujoCaja;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPresupuestoFlujoCaja;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPresupuestoFlujoCaja;
			processRunnable.jTableDatos=jTableDatosPresupuestoFlujoCaja;
			processRunnable.jPanelCampos=jPanelCamposPresupuestoFlujoCaja;
			processRunnable.jPanelPaginacion=jPanelPaginacionPresupuestoFlujoCaja;
			processRunnable.jPanelAcciones=jPanelAccionesPresupuestoFlujoCaja;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPresupuestoFlujoCaja;
			
			
			processRunnable.jmenuBar=jmenuBarPresupuestoFlujoCaja;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePresupuestoFlujoCaja;
			processRunnable.jTtoolBar=jTtoolBarPresupuestoFlujoCaja;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePresupuestoFlujoCaja;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPresupuestoFlujoCaja ,jPanelParametrosReportesPresupuestoFlujoCaja,jTableDatosPresupuestoFlujoCaja, /*jScrollPanelDatosPresupuestoFlujoCaja,*/jPanelCamposPresupuestoFlujoCaja,jPanelPaginacionPresupuestoFlujoCaja, /*jScrollPanelDatosEdicionPresupuestoFlujoCaja,*/ jPanelAccionesPresupuestoFlujoCaja,jPanelAccionesFormularioPresupuestoFlujoCaja,jmenuBarPresupuestoFlujoCaja,jmenuBarDetallePresupuestoFlujoCaja,jTtoolBarPresupuestoFlujoCaja,jTtoolBarDetallePresupuestoFlujoCaja);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPresupuestoFlujoCaja ,jPanelParametrosReportesPresupuestoFlujoCaja, jScrollPanelDatosPresupuestoFlujoCaja,jPanelPaginacionPresupuestoFlujoCaja, jScrollPanelDatosEdicionPresupuestoFlujoCaja, jPanelAccionesPresupuestoFlujoCaja,jPanelAccionesFormularioPresupuestoFlujoCaja,jmenuBarPresupuestoFlujoCaja,jmenuBarDetallePresupuestoFlujoCaja,jTtoolBarPresupuestoFlujoCaja,jTtoolBarDetallePresupuestoFlujoCaja);
						
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
	
	public void finishProcessPresupuestoFlujoCaja() {// throws Exception 
		this.finishProcessPresupuestoFlujoCaja(true);
	}
	
	public void finishProcessPresupuestoFlujoCaja(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasPresupuestoFlujoCaja ,this.jPanelParametrosReportesPresupuestoFlujoCaja, this.jScrollPanelDatosPresupuestoFlujoCaja,this.jPanelPaginacionPresupuestoFlujoCaja, this.jScrollPanelDatosEdicionPresupuestoFlujoCaja, this.jPanelAccionesPresupuestoFlujoCaja,this.jPanelAccionesFormularioPresupuestoFlujoCaja,this.jmenuBarPresupuestoFlujoCaja,this.jmenuBarDetallePresupuestoFlujoCaja,this.jTtoolBarPresupuestoFlujoCaja,this.jTtoolBarDetallePresupuestoFlujoCaja);		
		
		final JTabbedPane jTabbedPaneBusquedasPresupuestoFlujoCaja=this.jTabbedPaneBusquedasPresupuestoFlujoCaja; 
		
		final JPanel jPanelParametrosReportesPresupuestoFlujoCaja=this.jPanelParametrosReportesPresupuestoFlujoCaja;
		//final JScrollPane jScrollPanelDatosPresupuestoFlujoCaja=this.jScrollPanelDatosPresupuestoFlujoCaja;
		final JTable jTableDatosPresupuestoFlujoCaja=this.jTableDatosPresupuestoFlujoCaja;		
		final JPanel jPanelPaginacionPresupuestoFlujoCaja=this.jPanelPaginacionPresupuestoFlujoCaja;
		//final JScrollPane jScrollPanelDatosEdicionPresupuestoFlujoCaja=this.jScrollPanelDatosEdicionPresupuestoFlujoCaja;
		final JPanel jPanelAccionesPresupuestoFlujoCaja=this.jPanelAccionesPresupuestoFlujoCaja;
		
		JPanel jPanelCamposAuxiliarPresupuestoFlujoCaja=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarPresupuestoFlujoCaja=new JPanel();
		
		if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) {
			jPanelCamposAuxiliarPresupuestoFlujoCaja=this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jPanelCamposPresupuestoFlujoCaja;
			jPanelAccionesFormularioAuxiliarPresupuestoFlujoCaja=this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jPanelAccionesFormularioPresupuestoFlujoCaja;
		}
		
		final JPanel jPanelCamposPresupuestoFlujoCaja=jPanelCamposAuxiliarPresupuestoFlujoCaja;
		final JPanel jPanelAccionesFormularioPresupuestoFlujoCaja=jPanelAccionesFormularioAuxiliarPresupuestoFlujoCaja;
		
		
		final JMenuBar jmenuBarPresupuestoFlujoCaja=this.jmenuBarPresupuestoFlujoCaja;		
		final JToolBar jTtoolBarPresupuestoFlujoCaja=this.jTtoolBarPresupuestoFlujoCaja;
				
		JMenuBar jmenuBarDetalleAuxiliarPresupuestoFlujoCaja=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPresupuestoFlujoCaja=new JToolBar();
		
		if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) {
			jmenuBarDetalleAuxiliarPresupuestoFlujoCaja=this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jmenuBarDetallePresupuestoFlujoCaja;
			jTtoolBarDetalleAuxiliarPresupuestoFlujoCaja=this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jTtoolBarDetallePresupuestoFlujoCaja;		
		}
		
		final JMenuBar jmenuBarDetallePresupuestoFlujoCaja=jmenuBarDetalleAuxiliarPresupuestoFlujoCaja;
		final JToolBar jTtoolBarDetallePresupuestoFlujoCaja=jTtoolBarDetalleAuxiliarPresupuestoFlujoCaja;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPresupuestoFlujoCaja;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPresupuestoFlujoCaja;
			processRunnable.jTableDatos=jTableDatosPresupuestoFlujoCaja;
			processRunnable.jPanelCampos=jPanelCamposPresupuestoFlujoCaja;
			processRunnable.jPanelPaginacion=jPanelPaginacionPresupuestoFlujoCaja;
			processRunnable.jPanelAcciones=jPanelAccionesPresupuestoFlujoCaja;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPresupuestoFlujoCaja;
			
			
			processRunnable.jmenuBar=jmenuBarPresupuestoFlujoCaja;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePresupuestoFlujoCaja;
			processRunnable.jTtoolBar=jTtoolBarPresupuestoFlujoCaja;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePresupuestoFlujoCaja;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasPresupuestoFlujoCaja ,jPanelParametrosReportesPresupuestoFlujoCaja, jTableDatosPresupuestoFlujoCaja,/*jScrollPanelDatosPresupuestoFlujoCaja,*/jPanelCamposPresupuestoFlujoCaja,jPanelPaginacionPresupuestoFlujoCaja, /*jScrollPanelDatosEdicionPresupuestoFlujoCaja,*/ jPanelAccionesPresupuestoFlujoCaja,jPanelAccionesFormularioPresupuestoFlujoCaja,jmenuBarPresupuestoFlujoCaja,jmenuBarDetallePresupuestoFlujoCaja,jTtoolBarPresupuestoFlujoCaja,jTtoolBarDetallePresupuestoFlujoCaja));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesPresupuestoFlujoCaja(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarPresupuestoFlujoCaja(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuPresupuestoFlujoCaja(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarPresupuestoFlujoCaja(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarPresupuestoFlujoCaja,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetallePresupuestoFlujoCaja,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuPresupuestoFlujoCaja(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarPresupuestoFlujoCaja,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetallePresupuestoFlujoCaja,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.presupuestoflujocajaConstantesFunciones.getsFinalQueryPresupuestoFlujoCaja();
		String  finalQueryPaginacionTodos=this.presupuestoflujocajaConstantesFunciones.getsFinalQueryPresupuestoFlujoCaja();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=PresupuestoFlujoCajaConstantesFunciones.getArrayColumnasGlobalesNoPresupuestoFlujoCaja(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=PresupuestoFlujoCajaConstantesFunciones.getArrayColumnasGlobalesPresupuestoFlujoCaja(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,PresupuestoFlujoCajaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.presupuestoflujocajasEliminados= new ArrayList<PresupuestoFlujoCaja>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessPresupuestoFlujoCaja();
		
				///*PresupuestoFlujoCajaSessionBean*/this.presupuestoflujocajaSessionBean=new PresupuestoFlujoCajaSessionBean();
			
			if(this.presupuestoflujocajaSessionBean==null) {
				this.presupuestoflujocajaSessionBean=new PresupuestoFlujoCajaSessionBean();
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
					this.iNumeroPaginacion=PresupuestoFlujoCajaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=PresupuestoFlujoCajaConstantesFunciones.getClassesForeignKeysOfPresupuestoFlujoCaja(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/presupuestoflujocaja."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			presupuestoflujocajasAux= new ArrayList<PresupuestoFlujoCaja>();
			
				
			presupuestoflujocajaLogic.setDatosCliente(this.datosCliente);
			presupuestoflujocajaLogic.setDatosDeep(this.datosDeep);
			presupuestoflujocajaLogic.setIsConDeep(true);
			
			
			presupuestoflujocajaLogic.getPresupuestoFlujoCajaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					presupuestoflujocajaLogic.getTodosPresupuestoFlujoCajas(finalQueryGlobal,pagination);
					
					//presupuestoflujocajaLogic.getTodosPresupuestoFlujoCajasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(presupuestoflujocajaLogic.getPresupuestoFlujoCajas()==null|| presupuestoflujocajaLogic.getPresupuestoFlujoCajas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							presupuestoflujocajasAux= new ArrayList<PresupuestoFlujoCaja>();
							presupuestoflujocajasAux.addAll(presupuestoflujocajaLogic.getPresupuestoFlujoCajas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presupuestoflujocajasAux= new ArrayList<PresupuestoFlujoCaja>();
							presupuestoflujocajasAux.addAll(presupuestoflujocajas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							presupuestoflujocajaLogic.getTodosPresupuestoFlujoCajas(finalQueryGlobal+"",this.pagination);												
							
							//presupuestoflujocajaLogic.getTodosPresupuestoFlujoCajasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReportePresupuestoFlujoCajas("Todos",presupuestoflujocajaLogic.getPresupuestoFlujoCajas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							presupuestoflujocajaLogic.setPresupuestoFlujoCajas(new ArrayList<PresupuestoFlujoCaja>());					
							presupuestoflujocajaLogic.getPresupuestoFlujoCajas().addAll(presupuestoflujocajasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presupuestoflujocajas=new ArrayList<PresupuestoFlujoCaja>();
							presupuestoflujocajas.addAll(presupuestoflujocajasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idPresupuestoFlujoCaja=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idPresupuestoFlujoCaja=this.idActual;
				
				} else if(this.idPresupuestoFlujoCajaActual!=null && this.idPresupuestoFlujoCajaActual!=0L) {
					idPresupuestoFlujoCaja=idPresupuestoFlujoCajaActual;
				}
				
					
				this.sDetalleReporte=PresupuestoFlujoCajaConstantesFunciones.getDetalleIndicePorId(idPresupuestoFlujoCaja);
				
				this.presupuestoflujocajas=new ArrayList<PresupuestoFlujoCaja>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					presupuestoflujocajaLogic.getEntity(idPresupuestoFlujoCaja);
					
					//presupuestoflujocajaLogic.getEntityWithConnection(idPresupuestoFlujoCaja);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					presupuestoflujocajaLogic.setPresupuestoFlujoCajas(new ArrayList<PresupuestoFlujoCaja>());
					presupuestoflujocajaLogic.getPresupuestoFlujoCajas().add(presupuestoflujocajaLogic.getPresupuestoFlujoCaja());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.presupuestoflujocajas=new ArrayList<PresupuestoFlujoCaja>();
					this.presupuestoflujocajas.add(presupuestoflujocaja);
				}
				
				if(presupuestoflujocajaLogic.getPresupuestoFlujoCaja()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdCentroCosto")) {
				this.sDetalleReporte=PresupuestoFlujoCajaConstantesFunciones.getDetalleIndiceFK_IdCentroCosto(id_centro_costoFK_IdCentroCosto);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					presupuestoflujocajaLogic.getPresupuestoFlujoCajasFK_IdCentroCosto(finalQueryGlobal,pagination,id_centro_costoFK_IdCentroCosto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresupuestoFlujoCajaConstantesFunciones.getDetalleIndiceFK_IdCentroCosto(id_centro_costoFK_IdCentroCosto);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresupuestoFlujoCajaConstantesFunciones.getDetalleIndiceFK_IdCentroCosto(id_centro_costoFK_IdCentroCosto);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=presupuestoflujocajaLogic.getPresupuestoFlujoCajas()==null||presupuestoflujocajaLogic.getPresupuestoFlujoCajas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=presupuestoflujocajas==null|| presupuestoflujocajas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						presupuestoflujocajasAux=new ArrayList<PresupuestoFlujoCaja>();
						presupuestoflujocajasAux.addAll(presupuestoflujocajaLogic.getPresupuestoFlujoCajas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presupuestoflujocajasAux=new ArrayList<PresupuestoFlujoCaja>();
							presupuestoflujocajasAux.addAll(presupuestoflujocajas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							presupuestoflujocajaLogic.getPresupuestoFlujoCajasFK_IdCentroCosto(finalQueryGlobal,pagination,id_centro_costoFK_IdCentroCosto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresupuestoFlujoCajaConstantesFunciones.getDetalleIndiceFK_IdCentroCosto(id_centro_costoFK_IdCentroCosto);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresupuestoFlujoCajaConstantesFunciones.getDetalleIndiceFK_IdCentroCosto(id_centro_costoFK_IdCentroCosto);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePresupuestoFlujoCajas("FK_IdCentroCosto",presupuestoflujocajaLogic.getPresupuestoFlujoCajas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePresupuestoFlujoCajas("FK_IdCentroCosto",presupuestoflujocajas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						presupuestoflujocajaLogic.setPresupuestoFlujoCajas(new ArrayList<PresupuestoFlujoCaja>());
						presupuestoflujocajaLogic.getPresupuestoFlujoCajas().addAll(presupuestoflujocajasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presupuestoflujocajas=new ArrayList<PresupuestoFlujoCaja>();
							presupuestoflujocajas.addAll(presupuestoflujocajasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdCuentaContable")) {
				this.sDetalleReporte=PresupuestoFlujoCajaConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					presupuestoflujocajaLogic.getPresupuestoFlujoCajasFK_IdCuentaContable(finalQueryGlobal,pagination,id_cuenta_contableFK_IdCuentaContable);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresupuestoFlujoCajaConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresupuestoFlujoCajaConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=presupuestoflujocajaLogic.getPresupuestoFlujoCajas()==null||presupuestoflujocajaLogic.getPresupuestoFlujoCajas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=presupuestoflujocajas==null|| presupuestoflujocajas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						presupuestoflujocajasAux=new ArrayList<PresupuestoFlujoCaja>();
						presupuestoflujocajasAux.addAll(presupuestoflujocajaLogic.getPresupuestoFlujoCajas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presupuestoflujocajasAux=new ArrayList<PresupuestoFlujoCaja>();
							presupuestoflujocajasAux.addAll(presupuestoflujocajas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							presupuestoflujocajaLogic.getPresupuestoFlujoCajasFK_IdCuentaContable(finalQueryGlobal,pagination,id_cuenta_contableFK_IdCuentaContable);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresupuestoFlujoCajaConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresupuestoFlujoCajaConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePresupuestoFlujoCajas("FK_IdCuentaContable",presupuestoflujocajaLogic.getPresupuestoFlujoCajas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePresupuestoFlujoCajas("FK_IdCuentaContable",presupuestoflujocajas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						presupuestoflujocajaLogic.setPresupuestoFlujoCajas(new ArrayList<PresupuestoFlujoCaja>());
						presupuestoflujocajaLogic.getPresupuestoFlujoCajas().addAll(presupuestoflujocajasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presupuestoflujocajas=new ArrayList<PresupuestoFlujoCaja>();
							presupuestoflujocajas.addAll(presupuestoflujocajasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEjercicio")) {
				this.sDetalleReporte=PresupuestoFlujoCajaConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					presupuestoflujocajaLogic.getPresupuestoFlujoCajasFK_IdEjercicio(finalQueryGlobal,pagination,id_ejercicioFK_IdEjercicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresupuestoFlujoCajaConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresupuestoFlujoCajaConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=presupuestoflujocajaLogic.getPresupuestoFlujoCajas()==null||presupuestoflujocajaLogic.getPresupuestoFlujoCajas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=presupuestoflujocajas==null|| presupuestoflujocajas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						presupuestoflujocajasAux=new ArrayList<PresupuestoFlujoCaja>();
						presupuestoflujocajasAux.addAll(presupuestoflujocajaLogic.getPresupuestoFlujoCajas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presupuestoflujocajasAux=new ArrayList<PresupuestoFlujoCaja>();
							presupuestoflujocajasAux.addAll(presupuestoflujocajas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							presupuestoflujocajaLogic.getPresupuestoFlujoCajasFK_IdEjercicio(finalQueryGlobal,pagination,id_ejercicioFK_IdEjercicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresupuestoFlujoCajaConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresupuestoFlujoCajaConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePresupuestoFlujoCajas("FK_IdEjercicio",presupuestoflujocajaLogic.getPresupuestoFlujoCajas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePresupuestoFlujoCajas("FK_IdEjercicio",presupuestoflujocajas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						presupuestoflujocajaLogic.setPresupuestoFlujoCajas(new ArrayList<PresupuestoFlujoCaja>());
						presupuestoflujocajaLogic.getPresupuestoFlujoCajas().addAll(presupuestoflujocajasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presupuestoflujocajas=new ArrayList<PresupuestoFlujoCaja>();
							presupuestoflujocajas.addAll(presupuestoflujocajasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=PresupuestoFlujoCajaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					presupuestoflujocajaLogic.getPresupuestoFlujoCajasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresupuestoFlujoCajaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresupuestoFlujoCajaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=presupuestoflujocajaLogic.getPresupuestoFlujoCajas()==null||presupuestoflujocajaLogic.getPresupuestoFlujoCajas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=presupuestoflujocajas==null|| presupuestoflujocajas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						presupuestoflujocajasAux=new ArrayList<PresupuestoFlujoCaja>();
						presupuestoflujocajasAux.addAll(presupuestoflujocajaLogic.getPresupuestoFlujoCajas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presupuestoflujocajasAux=new ArrayList<PresupuestoFlujoCaja>();
							presupuestoflujocajasAux.addAll(presupuestoflujocajas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							presupuestoflujocajaLogic.getPresupuestoFlujoCajasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresupuestoFlujoCajaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresupuestoFlujoCajaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePresupuestoFlujoCajas("FK_IdEmpresa",presupuestoflujocajaLogic.getPresupuestoFlujoCajas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePresupuestoFlujoCajas("FK_IdEmpresa",presupuestoflujocajas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						presupuestoflujocajaLogic.setPresupuestoFlujoCajas(new ArrayList<PresupuestoFlujoCaja>());
						presupuestoflujocajaLogic.getPresupuestoFlujoCajas().addAll(presupuestoflujocajasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presupuestoflujocajas=new ArrayList<PresupuestoFlujoCaja>();
							presupuestoflujocajas.addAll(presupuestoflujocajasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdPeriodo")) {
				this.sDetalleReporte=PresupuestoFlujoCajaConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					presupuestoflujocajaLogic.getPresupuestoFlujoCajasFK_IdPeriodo(finalQueryGlobal,pagination,id_periodoFK_IdPeriodo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresupuestoFlujoCajaConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresupuestoFlujoCajaConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=presupuestoflujocajaLogic.getPresupuestoFlujoCajas()==null||presupuestoflujocajaLogic.getPresupuestoFlujoCajas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=presupuestoflujocajas==null|| presupuestoflujocajas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						presupuestoflujocajasAux=new ArrayList<PresupuestoFlujoCaja>();
						presupuestoflujocajasAux.addAll(presupuestoflujocajaLogic.getPresupuestoFlujoCajas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presupuestoflujocajasAux=new ArrayList<PresupuestoFlujoCaja>();
							presupuestoflujocajasAux.addAll(presupuestoflujocajas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							presupuestoflujocajaLogic.getPresupuestoFlujoCajasFK_IdPeriodo(finalQueryGlobal,pagination,id_periodoFK_IdPeriodo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresupuestoFlujoCajaConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresupuestoFlujoCajaConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePresupuestoFlujoCajas("FK_IdPeriodo",presupuestoflujocajaLogic.getPresupuestoFlujoCajas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePresupuestoFlujoCajas("FK_IdPeriodo",presupuestoflujocajas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						presupuestoflujocajaLogic.setPresupuestoFlujoCajas(new ArrayList<PresupuestoFlujoCaja>());
						presupuestoflujocajaLogic.getPresupuestoFlujoCajas().addAll(presupuestoflujocajasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presupuestoflujocajas=new ArrayList<PresupuestoFlujoCaja>();
							presupuestoflujocajas.addAll(presupuestoflujocajasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesPresupuestoFlujoCaja();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessPresupuestoFlujoCaja();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=presupuestoflujocajaLogic.getPresupuestoFlujoCajas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=presupuestoflujocajas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=presupuestoflujocajaLogic.getPresupuestoFlujoCajas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=presupuestoflujocajas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(PresupuestoFlujoCaja presupuestoflujocaja) {
		Boolean permite=true;
		
		if(this.presupuestoflujocaja.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=PresupuestoFlujoCajaConstantesFunciones.getOrderByListaPresupuestoFlujoCaja();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=PresupuestoFlujoCajaConstantesFunciones.getOrderByListaPresupuestoFlujoCaja();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PresupuestoFlujoCaja presupuestoflujocaja:presupuestoflujocajaLogic.getPresupuestoFlujoCajas()) {
				if(presupuestoflujocaja.getsType().equals(Constantes2.S_TOTALES)) {
					presupuestoflujocajaTotales=presupuestoflujocaja;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PresupuestoFlujoCaja presupuestoflujocaja:this.presupuestoflujocajas) {
				if(presupuestoflujocaja.getsType().equals(Constantes2.S_TOTALES)) {
					presupuestoflujocajaTotales=presupuestoflujocaja;
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
			this.presupuestoflujocajaAux=new PresupuestoFlujoCaja();
			this.presupuestoflujocajaAux.setsType(Constantes2.S_TOTALES);
			this.presupuestoflujocajaAux.setIsNew(false);
			this.presupuestoflujocajaAux.setIsChanged(false);
			this.presupuestoflujocajaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				PresupuestoFlujoCajaConstantesFunciones.TotalizarValoresFilaPresupuestoFlujoCaja(this.presupuestoflujocajaLogic.getPresupuestoFlujoCajas(),this.presupuestoflujocajaAux);
				
				this.presupuestoflujocajaLogic.getPresupuestoFlujoCajas().add(this.presupuestoflujocajaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				PresupuestoFlujoCajaConstantesFunciones.TotalizarValoresFilaPresupuestoFlujoCaja(this.presupuestoflujocajas,this.presupuestoflujocajaAux);
				
				this.presupuestoflujocajas.add(this.presupuestoflujocajaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		presupuestoflujocajaTotales=new PresupuestoFlujoCaja();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.presupuestoflujocajaLogic.getPresupuestoFlujoCajas().remove(presupuestoflujocajaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.presupuestoflujocajas.remove(presupuestoflujocajaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		presupuestoflujocajaTotales=new PresupuestoFlujoCaja();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PresupuestoFlujoCaja presupuestoflujocaja:presupuestoflujocajaLogic.getPresupuestoFlujoCajas()) {
				if(presupuestoflujocaja.getsType().equals(Constantes2.S_TOTALES)) {
					presupuestoflujocajaTotales=presupuestoflujocaja;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PresupuestoFlujoCajaConstantesFunciones.TotalizarValoresFilaPresupuestoFlujoCaja(this.presupuestoflujocajaLogic.getPresupuestoFlujoCajas(),presupuestoflujocajaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PresupuestoFlujoCaja presupuestoflujocaja:this.presupuestoflujocajas) {
				if(presupuestoflujocaja.getsType().equals(Constantes2.S_TOTALES)) {
					presupuestoflujocajaTotales=presupuestoflujocaja;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PresupuestoFlujoCajaConstantesFunciones.TotalizarValoresFilaPresupuestoFlujoCaja(this.presupuestoflujocajas,presupuestoflujocajaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getPresupuestoFlujoCajasFK_IdAnio()throws Exception {
		try {
			sAccionBusqueda="FK_IdAnio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPresupuestoFlujoCajasFK_IdCentroCosto()throws Exception {
		try {
			sAccionBusqueda="FK_IdCentroCosto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPresupuestoFlujoCajasFK_IdCuentaContable()throws Exception {
		try {
			sAccionBusqueda="FK_IdCuentaContable";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPresupuestoFlujoCajasFK_IdEjercicio()throws Exception {
		try {
			sAccionBusqueda="FK_IdEjercicio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPresupuestoFlujoCajasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPresupuestoFlujoCajasFK_IdMes()throws Exception {
		try {
			sAccionBusqueda="FK_IdMes";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPresupuestoFlujoCajasFK_IdPeriodo()throws Exception {
		try {
			sAccionBusqueda="FK_IdPeriodo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getPresupuestoFlujoCajasFK_IdAnio(String sFinalQuery,Long id_anio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					presupuestoflujocajaLogic.getPresupuestoFlujoCajasFK_IdAnio(sFinalQuery,this.pagination,id_anio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPresupuestoFlujoCajasFK_IdCentroCosto(String sFinalQuery,Long id_centro_costo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					presupuestoflujocajaLogic.getPresupuestoFlujoCajasFK_IdCentroCosto(sFinalQuery,this.pagination,id_centro_costo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPresupuestoFlujoCajasFK_IdCuentaContable(String sFinalQuery,Long id_cuenta_contable)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					presupuestoflujocajaLogic.getPresupuestoFlujoCajasFK_IdCuentaContable(sFinalQuery,this.pagination,id_cuenta_contable);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPresupuestoFlujoCajasFK_IdEjercicio(String sFinalQuery,Long id_ejercicio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					presupuestoflujocajaLogic.getPresupuestoFlujoCajasFK_IdEjercicio(sFinalQuery,this.pagination,id_ejercicio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPresupuestoFlujoCajasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					presupuestoflujocajaLogic.getPresupuestoFlujoCajasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPresupuestoFlujoCajasFK_IdMes(String sFinalQuery,Long id_mes)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					presupuestoflujocajaLogic.getPresupuestoFlujoCajasFK_IdMes(sFinalQuery,this.pagination,id_mes);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPresupuestoFlujoCajasFK_IdPeriodo(String sFinalQuery,Long id_periodo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					presupuestoflujocajaLogic.getPresupuestoFlujoCajasFK_IdPeriodo(sFinalQuery,this.pagination,id_periodo);
				
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
	
	public void inicializarPermisosPresupuestoFlujoCaja() {
		this.isPermisoTodoPresupuestoFlujoCaja=false;
		this.isPermisoNuevoPresupuestoFlujoCaja=false;
		this.isPermisoActualizarPresupuestoFlujoCaja=false;
		this.isPermisoActualizarOriginalPresupuestoFlujoCaja=false;
		this.isPermisoEliminarPresupuestoFlujoCaja=false;
		this.isPermisoGuardarCambiosPresupuestoFlujoCaja=false;
		this.isPermisoConsultaPresupuestoFlujoCaja=false;
		this.isPermisoBusquedaPresupuestoFlujoCaja=false;
		this.isPermisoReportePresupuestoFlujoCaja=false;		
		this.isPermisoOrdenPresupuestoFlujoCaja=false;		
		this.isPermisoPaginacionMedioPresupuestoFlujoCaja=false;		
		this.isPermisoPaginacionAltoPresupuestoFlujoCaja=false;
		this.isPermisoPaginacionTodoPresupuestoFlujoCaja=false;
		this.isPermisoCopiarPresupuestoFlujoCaja=false;		
		this.isPermisoVerFormPresupuestoFlujoCaja=false;		
		this.isPermisoDuplicarPresupuestoFlujoCaja=false;		
		this.isPermisoOrdenPresupuestoFlujoCaja=false;		
	}
	
	public void setPermisosUsuarioPresupuestoFlujoCaja(Boolean isPermiso) {
		this.isPermisoTodoPresupuestoFlujoCaja=isPermiso;
		this.isPermisoNuevoPresupuestoFlujoCaja=isPermiso;
		this.isPermisoActualizarPresupuestoFlujoCaja=isPermiso;
		this.isPermisoActualizarOriginalPresupuestoFlujoCaja=isPermiso;
		this.isPermisoEliminarPresupuestoFlujoCaja=isPermiso;
		this.isPermisoGuardarCambiosPresupuestoFlujoCaja=isPermiso;
		this.isPermisoConsultaPresupuestoFlujoCaja=isPermiso;
		this.isPermisoBusquedaPresupuestoFlujoCaja=isPermiso;
		this.isPermisoReportePresupuestoFlujoCaja=isPermiso;
		this.isPermisoOrdenPresupuestoFlujoCaja=isPermiso;		
		this.isPermisoPaginacionMedioPresupuestoFlujoCaja=isPermiso;		
		this.isPermisoPaginacionAltoPresupuestoFlujoCaja=isPermiso;		
		this.isPermisoPaginacionTodoPresupuestoFlujoCaja=isPermiso;		
		this.isPermisoCopiarPresupuestoFlujoCaja=isPermiso;		
		this.isPermisoVerFormPresupuestoFlujoCaja=isPermiso;		
		this.isPermisoDuplicarPresupuestoFlujoCaja=isPermiso;
		this.isPermisoOrdenPresupuestoFlujoCaja=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioPresupuestoFlujoCaja(Boolean isPermiso) {
		//this.isPermisoTodoPresupuestoFlujoCaja=isPermiso;
		this.isPermisoNuevoPresupuestoFlujoCaja=isPermiso;
		this.isPermisoActualizarPresupuestoFlujoCaja=isPermiso;
		this.isPermisoActualizarOriginalPresupuestoFlujoCaja=isPermiso;
		this.isPermisoEliminarPresupuestoFlujoCaja=isPermiso;
		this.isPermisoGuardarCambiosPresupuestoFlujoCaja=isPermiso;
		//this.isPermisoConsultaPresupuestoFlujoCaja=isPermiso;
		//this.isPermisoBusquedaPresupuestoFlujoCaja=isPermiso;
		//this.isPermisoReportePresupuestoFlujoCaja=isPermiso;
		//this.isPermisoOrdenPresupuestoFlujoCaja=isPermiso;		
		//this.isPermisoPaginacionMedioPresupuestoFlujoCaja=isPermiso;		
		//this.isPermisoPaginacionAltoPresupuestoFlujoCaja=isPermiso;		
		//this.isPermisoPaginacionTodoPresupuestoFlujoCaja=isPermiso;		
		//this.isPermisoCopiarPresupuestoFlujoCaja=isPermiso;		
		//this.isPermisoDuplicarPresupuestoFlujoCaja=isPermiso;
		//this.isPermisoOrdenPresupuestoFlujoCaja=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioPresupuestoFlujoCajaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(PresupuestoFlujoCajaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebPresupuestoFlujoCaja(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioPresupuestoFlujoCajaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioPresupuestoFlujoCajaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionPresupuestoFlujoCajaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioPresupuestoFlujoCajaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioPresupuestoFlujoCaja() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(PresupuestoFlujoCajaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, PresupuestoFlujoCajaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoPresupuestoFlujoCaja=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarPresupuestoFlujoCaja=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalPresupuestoFlujoCaja=this.isPermisoActualizarPresupuestoFlujoCaja;
			this.isPermisoEliminarPresupuestoFlujoCaja=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosPresupuestoFlujoCaja=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaPresupuestoFlujoCaja=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaPresupuestoFlujoCaja=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoPresupuestoFlujoCaja=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReportePresupuestoFlujoCaja=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPresupuestoFlujoCaja=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioPresupuestoFlujoCaja=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoPresupuestoFlujoCaja=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoPresupuestoFlujoCaja=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarPresupuestoFlujoCaja=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormPresupuestoFlujoCaja=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarPresupuestoFlujoCaja=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPresupuestoFlujoCaja=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosPresupuestoFlujoCaja.setToolTipText(this.jTableDatosPresupuestoFlujoCaja.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioPresupuestoFlujoCaja(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioPresupuestoFlujoCaja(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(PresupuestoFlujoCajaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(PresupuestoFlujoCajaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioPresupuestoFlujoCaja() throws Exception {
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
	public void inicializarCombosForeignKeyPresupuestoFlujoCajaListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.cuentacontablesForeignKey=new ArrayList();
				this.ejerciciosForeignKey=new ArrayList();
				this.periodosForeignKey=new ArrayList();
				this.centrocostosForeignKey=new ArrayList();
				this.aniosForeignKey=new ArrayList();
				this.messForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyPresupuestoFlujoCajaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(PresupuestoFlujoCajaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyPresupuestoFlujoCajaListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCuentaContableListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEjercicioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyPeriodoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCentroCostoListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyCentroCostoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.centrocostosForeignKey==null||this.centrocostosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=CentroCostoConstantesFunciones.getArrayColumnasGlobalesCentroCosto(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CentroCostoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=CentroCostoConstantesFunciones.SFINALQUERY;

				this.cargarCombosCentroCostosForeignKeyLista(finalQueryGlobal);
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
	
	public void cargarCombosLoteForeignKeyPresupuestoFlujoCajaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			PresupuestoFlujoCajaParameterReturnGeneral presupuestoflujocajaReturnGeneral=new PresupuestoFlujoCajaParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.presupuestoflujocajaConstantesFunciones.cargarid_empresaPresupuestoFlujoCaja)
					 || (this.esRecargarFks && this.presupuestoflujocajaConstantesFunciones.cargarid_empresaPresupuestoFlujoCaja)) {

					if(!this.presupuestoflujocajaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+presupuestoflujocajaSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalCuentaContable="";

				if(((this.cuentacontablesForeignKey==null||this.cuentacontablesForeignKey.size()<=0) && this.presupuestoflujocajaConstantesFunciones.cargarid_cuenta_contablePresupuestoFlujoCaja)
					 || (this.esRecargarFks && this.presupuestoflujocajaConstantesFunciones.cargarid_cuenta_contablePresupuestoFlujoCaja)) {

					if(!this.presupuestoflujocajaSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContable()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();

						this.arrDatoGeneralNo.add("id_modulo");

						arrColumnasGlobales=CuentaContableConstantesFunciones.getArrayColumnasGlobalesCuentaContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCuentaContable=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaContableConstantesFunciones.TABLENAME);

						finalQueryGlobalCuentaContable=Funciones.GetFinalQueryAppend(finalQueryGlobalCuentaContable, "");
						finalQueryGlobalCuentaContable+=CuentaContableConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCuentaContablesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCuentaContable=" WHERE " + ConstantesSql.ID + "="+presupuestoflujocajaSessionBean.getlidCuentaContableActual();
					}
				} else {
					finalQueryGlobalCuentaContable="NONE";
				}


				String finalQueryGlobalEjercicio="";

				if(((this.ejerciciosForeignKey==null||this.ejerciciosForeignKey.size()<=0) && this.presupuestoflujocajaConstantesFunciones.cargarid_ejercicioPresupuestoFlujoCaja)
					 || (this.esRecargarFks && this.presupuestoflujocajaConstantesFunciones.cargarid_ejercicioPresupuestoFlujoCaja)) {

					if(!this.presupuestoflujocajaSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EjercicioConstantesFunciones.getArrayColumnasGlobalesEjercicio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEjercicio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EjercicioConstantesFunciones.TABLENAME);

						finalQueryGlobalEjercicio=Funciones.GetFinalQueryAppend(finalQueryGlobalEjercicio, "");
						finalQueryGlobalEjercicio+=EjercicioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEjerciciosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEjercicio=" WHERE " + ConstantesSql.ID + "="+presupuestoflujocajaSessionBean.getlidEjercicioActual();
					}
				} else {
					finalQueryGlobalEjercicio="NONE";
				}


				String finalQueryGlobalPeriodo="";

				if(((this.periodosForeignKey==null||this.periodosForeignKey.size()<=0) && this.presupuestoflujocajaConstantesFunciones.cargarid_periodoPresupuestoFlujoCaja)
					 || (this.esRecargarFks && this.presupuestoflujocajaConstantesFunciones.cargarid_periodoPresupuestoFlujoCaja)) {

					if(!this.presupuestoflujocajaSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PeriodoConstantesFunciones.getArrayColumnasGlobalesPeriodo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPeriodo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PeriodoConstantesFunciones.TABLENAME);

						finalQueryGlobalPeriodo=Funciones.GetFinalQueryAppend(finalQueryGlobalPeriodo, "");
						finalQueryGlobalPeriodo+=PeriodoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPeriodosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPeriodo=" WHERE " + ConstantesSql.ID + "="+presupuestoflujocajaSessionBean.getlidPeriodoActual();
					}
				} else {
					finalQueryGlobalPeriodo="NONE";
				}


				String finalQueryGlobalCentroCosto="";

				if(((this.centrocostosForeignKey==null||this.centrocostosForeignKey.size()<=0) && this.presupuestoflujocajaConstantesFunciones.cargarid_centro_costoPresupuestoFlujoCaja)
					 || (this.esRecargarFks && this.presupuestoflujocajaConstantesFunciones.cargarid_centro_costoPresupuestoFlujoCaja)) {

					if(!this.presupuestoflujocajaSessionBean.getisBusquedaDesdeForeignKeySesionCentroCosto()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=CentroCostoConstantesFunciones.getArrayColumnasGlobalesCentroCosto(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCentroCosto=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CentroCostoConstantesFunciones.TABLENAME);

						finalQueryGlobalCentroCosto=Funciones.GetFinalQueryAppend(finalQueryGlobalCentroCosto, "");
						finalQueryGlobalCentroCosto+=CentroCostoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCentroCostosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCentroCosto=" WHERE " + ConstantesSql.ID + "="+presupuestoflujocajaSessionBean.getlidCentroCostoActual();
					}
				} else {
					finalQueryGlobalCentroCosto="NONE";
				}


				String finalQueryGlobalAnio="";

				if(((this.aniosForeignKey==null||this.aniosForeignKey.size()<=0) && this.presupuestoflujocajaConstantesFunciones.cargarid_anioPresupuestoFlujoCaja)
					 || (this.esRecargarFks && this.presupuestoflujocajaConstantesFunciones.cargarid_anioPresupuestoFlujoCaja)) {

					if(!this.presupuestoflujocajaSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=AnioConstantesFunciones.getArrayColumnasGlobalesAnio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalAnio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,AnioConstantesFunciones.TABLENAME);

						finalQueryGlobalAnio=Funciones.GetFinalQueryAppend(finalQueryGlobalAnio, "");
						finalQueryGlobalAnio+=AnioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosAniosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalAnio=" WHERE " + ConstantesSql.ID + "="+presupuestoflujocajaSessionBean.getlidAnioActual();
					}
				} else {
					finalQueryGlobalAnio="NONE";
				}


				String finalQueryGlobalMes="";

				if(((this.messForeignKey==null||this.messForeignKey.size()<=0) && this.presupuestoflujocajaConstantesFunciones.cargarid_mesPresupuestoFlujoCaja)
					 || (this.esRecargarFks && this.presupuestoflujocajaConstantesFunciones.cargarid_mesPresupuestoFlujoCaja)) {

					if(!this.presupuestoflujocajaSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=MesConstantesFunciones.getArrayColumnasGlobalesMes(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalMes=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,MesConstantesFunciones.TABLENAME);

						finalQueryGlobalMes=Funciones.GetFinalQueryAppend(finalQueryGlobalMes, "");
						finalQueryGlobalMes+=MesConstantesFunciones.SFINALQUERY;

						//this.cargarCombosMessForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalMes=" WHERE " + ConstantesSql.ID + "="+presupuestoflujocajaSessionBean.getlidMesActual();
					}
				} else {
					finalQueryGlobalMes="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				presupuestoflujocajaReturnGeneral=presupuestoflujocajaLogic.cargarCombosLoteForeignKeyPresupuestoFlujoCaja(finalQueryGlobalEmpresa,finalQueryGlobalCuentaContable,finalQueryGlobalEjercicio,finalQueryGlobalPeriodo,finalQueryGlobalCentroCosto,finalQueryGlobalAnio,finalQueryGlobalMes);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=presupuestoflujocajaReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalCuentaContable.equals("NONE")) {
				this.cuentacontablesForeignKey=presupuestoflujocajaReturnGeneral.getcuentacontablesForeignKey();
			}

			if(!finalQueryGlobalEjercicio.equals("NONE")) {
				this.ejerciciosForeignKey=presupuestoflujocajaReturnGeneral.getejerciciosForeignKey();
			}

			if(!finalQueryGlobalPeriodo.equals("NONE")) {
				this.periodosForeignKey=presupuestoflujocajaReturnGeneral.getperiodosForeignKey();
			}

			if(!finalQueryGlobalCentroCosto.equals("NONE")) {
				this.centrocostosForeignKey=presupuestoflujocajaReturnGeneral.getcentrocostosForeignKey();
			}

			if(!finalQueryGlobalAnio.equals("NONE")) {
				this.aniosForeignKey=presupuestoflujocajaReturnGeneral.getaniosForeignKey();
			}

			if(!finalQueryGlobalMes.equals("NONE")) {
				this.messForeignKey=presupuestoflujocajaReturnGeneral.getmessForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyPresupuestoFlujoCaja()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyCuentaContable();
			this.addItemDefectoCombosForeignKeyEjercicio();
			this.addItemDefectoCombosForeignKeyPeriodo();
			this.addItemDefectoCombosForeignKeyCentroCosto();
			this.addItemDefectoCombosForeignKeyAnio();
			this.addItemDefectoCombosForeignKeyMes();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.presupuestoflujocajaSessionBean==null) {
				this.presupuestoflujocajaSessionBean=new PresupuestoFlujoCajaSessionBean();
			}

			if(!this.presupuestoflujocajaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyCuentaContable()throws Exception {
		try {

			if(!this.presupuestoflujocajaSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContable()) {
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

	public void addItemDefectoCombosForeignKeyEjercicio()throws Exception {
		try {

			if(!this.presupuestoflujocajaSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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

			if(!this.presupuestoflujocajaSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
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

	public void addItemDefectoCombosForeignKeyCentroCosto()throws Exception {
		try {

			if(!this.presupuestoflujocajaSessionBean.getisBusquedaDesdeForeignKeySesionCentroCosto()) {
				CentroCosto centrocosto=new CentroCosto();
				CentroCostoConstantesFunciones.setCentroCostoDescripcion(centrocosto,Constantes.SMENSAJE_ESCOJA_OPCION);
				centrocosto.setId(null);

				if(!CentroCostoConstantesFunciones.ExisteEnLista(this.centrocostosForeignKey,centrocosto,true)) {

					this.centrocostosForeignKey.add(0,centrocosto);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyAnio()throws Exception {
		try {

			if(!this.presupuestoflujocajaSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
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

			if(!this.presupuestoflujocajaSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
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
	
	public void initActionsCombosTodosForeignKeyPresupuestoFlujoCaja()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyPresupuestoFlujoCaja(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyPresupuestoFlujoCaja()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualEjercicioForeignKey(this.parametroGeneralUsuario.getid_ejercicio(),false,"Formulario");
				this.setActualPeriodoForeignKey(this.parametroGeneralUsuario.getid_periodo(),false,"Formulario");
			
			
				this.presupuestoflujocaja.setfecha_presupuesto(this.parametroGeneralUsuario.getfecha_sistema());
				this.presupuestoflujocaja.setfecha_proceso(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyPresupuestoFlujoCaja();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyPresupuestoFlujoCaja(PresupuestoFlujoCaja presupuestoflujocaja)throws Exception {	
		try {
			
			this.setActualCuentaContableForeignKey(presupuestoflujocaja.getid_cuenta_contable(),false,"Formulario");
			this.setActualCentroCostoForeignKey(presupuestoflujocaja.getid_centro_costo(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyPresupuestoFlujoCaja(PresupuestoFlujoCaja presupuestoflujocaja,String sTipoEvento)throws Exception {	
		try {
			
			

				if(presupuestoflujocaja.getCuentaContable()!=null && !sTipoEvento.equals("id_cuenta_contablePresupuestoFlujoCaja")) { //sTipoEvento Evita Bucle Infinito

					this.cuentacontablesForeignKey=new ArrayList<CuentaContable>();
					this.cuentacontablesForeignKey.add(presupuestoflujocaja.getCuentaContable());

					this.addItemDefectoCombosForeignKeyCuentaContable();
					this.cargarCombosFrameCuentaContablesForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyPresupuestoFlujoCaja()throws Exception {	
		try {
			
			this.setActualCuentaContableForeignKey(this.presupuestoflujocajaConstantesFunciones.getid_cuenta_contable(),false,"Formulario");
			this.setActualCentroCostoForeignKey(this.presupuestoflujocajaConstantesFunciones.getid_centro_costo(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyPresupuestoFlujoCaja()throws Exception {	
		try {
			

				if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) {
					Ejercicio ejercicioActual=(Ejercicio)this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_ejercicioPresupuestoFlujoCaja.getSelectedItem();
					this.setActualAnioForeignKey(ejercicioActual.getid_anio(),false,"Formulario");
				}

				if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) {
					Periodo periodoActual=(Periodo)this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_periodoPresupuestoFlujoCaja.getSelectedItem();
					this.setActualMesForeignKey(periodoActual.getid_mes(),false,"Formulario");
				}
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyPresupuestoFlujoCaja()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyPresupuestoFlujoCaja()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroPresupuestoFlujoCaja()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyPresupuestoFlujoCaja()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameCuentaContablesForeignKey("Todos");
			this.cargarCombosFrameEjerciciosForeignKey("Todos");
			this.cargarCombosFramePeriodosForeignKey("Todos");
			this.cargarCombosFrameCentroCostosForeignKey("Todos");
			this.cargarCombosFrameAniosForeignKey("Todos");
			this.cargarCombosFrameMessForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyPresupuestoFlujoCaja(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCuentaContablesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEjerciciosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFramePeriodosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCentroCostosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameAniosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameMessForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyPresupuestoFlujoCaja()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_empresaPresupuestoFlujoCaja!=null && this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_empresaPresupuestoFlujoCaja.getItemCount()>0) {
				this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_empresaPresupuestoFlujoCaja.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_cuenta_contablePresupuestoFlujoCaja!=null && this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_cuenta_contablePresupuestoFlujoCaja.getItemCount()>0) {
				this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_cuenta_contablePresupuestoFlujoCaja.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_ejercicioPresupuestoFlujoCaja!=null && this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_ejercicioPresupuestoFlujoCaja.getItemCount()>0) {
				this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_ejercicioPresupuestoFlujoCaja.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_periodoPresupuestoFlujoCaja!=null && this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_periodoPresupuestoFlujoCaja.getItemCount()>0) {
				this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_periodoPresupuestoFlujoCaja.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_centro_costoPresupuestoFlujoCaja!=null && this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_centro_costoPresupuestoFlujoCaja.getItemCount()>0) {
				this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_centro_costoPresupuestoFlujoCaja.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_anioPresupuestoFlujoCaja!=null && this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_anioPresupuestoFlujoCaja.getItemCount()>0) {
				this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_anioPresupuestoFlujoCaja.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_mesPresupuestoFlujoCaja!=null && this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_mesPresupuestoFlujoCaja.getItemCount()>0) {
				this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_mesPresupuestoFlujoCaja.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	














	
	

	public PresupuestoFlujoCajaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public PresupuestoFlujoCajaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public PresupuestoFlujoCajaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.presupuestoflujocajaSessionBean=new PresupuestoFlujoCajaSessionBean(); 
		this.presupuestoflujocajaConstantesFunciones=new PresupuestoFlujoCajaConstantesFunciones(); 
		this.presupuestoflujocajaBean=new PresupuestoFlujoCaja();//(this.presupuestoflujocajaConstantesFunciones); 		
		this.presupuestoflujocajaReturnGeneral=new PresupuestoFlujoCajaParameterReturnGeneral(); 
		
		this.presupuestoflujocajaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.presupuestoflujocajaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public PresupuestoFlujoCajaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public PresupuestoFlujoCajaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public PresupuestoFlujoCajaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessPresupuestoFlujoCaja(true);
			
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
			
			this.presupuestoflujocajaConstantesFunciones=new PresupuestoFlujoCajaConstantesFunciones(); 
			this.presupuestoflujocajaBean=new PresupuestoFlujoCaja();//this.presupuestoflujocajaConstantesFunciones); 			
			this.presupuestoflujocajaReturnGeneral=new PresupuestoFlujoCajaParameterReturnGeneral(); 
		
			PresupuestoFlujoCajaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Presupuesto Flujo Caja Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.presupuestoflujocaja=new PresupuestoFlujoCaja();
			this.presupuestoflujocajas = new ArrayList<PresupuestoFlujoCaja>();
			this.presupuestoflujocajasAux = new ArrayList<PresupuestoFlujoCaja>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocajaLogic=new PresupuestoFlujoCajaLogic();
				this.presupuestoflujocajaLogic.getNewConnexionToDeep("");
			}
			
			//this.presupuestoflujocajaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.presupuestoflujocajaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormPresupuestoFlujoCaja);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoPresupuestoFlujoCaja!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPresupuestoFlujoCaja);	
					}
					
					if(this.jInternalFrameImportacionPresupuestoFlujoCaja!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPresupuestoFlujoCaja);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByPresupuestoFlujoCaja!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByPresupuestoFlujoCaja);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormPresupuestoFlujoCaja);
				this.jInternalFrameDetalleFormPresupuestoFlujoCaja.setVisible(false);
				this.jInternalFrameDetalleFormPresupuestoFlujoCaja.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoPresupuestoFlujoCaja!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPresupuestoFlujoCaja);
					this.jInternalFrameReporteDinamicoPresupuestoFlujoCaja.setVisible(false);
					this.jInternalFrameReporteDinamicoPresupuestoFlujoCaja.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionPresupuestoFlujoCaja!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionPresupuestoFlujoCaja);
					this.jInternalFrameImportacionPresupuestoFlujoCaja.setVisible(false);
					this.jInternalFrameImportacionPresupuestoFlujoCaja.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByPresupuestoFlujoCaja!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByPresupuestoFlujoCaja);
					this.jInternalFrameOrderByPresupuestoFlujoCaja.setVisible(false);
					this.jInternalFrameOrderByPresupuestoFlujoCaja.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idPresupuestoFlujoCajaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=PresupuestoFlujoCajaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.presupuestoflujocajaReturnGeneral=new PresupuestoFlujoCajaParameterReturnGeneral();
			
			this.presupuestoflujocajaParameterGeneral=new PresupuestoFlujoCajaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.presupuestoflujocajaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(PresupuestoFlujoCajaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PresupuestoFlujoCajaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado(),this.presupuestoflujocajaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PresupuestoFlujoCajaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado(),this.presupuestoflujocajaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoPresupuestoFlujoCaja=false;
			this.isVisibilidadCeldaDuplicarPresupuestoFlujoCaja=true;
			this.isVisibilidadCeldaCopiarPresupuestoFlujoCaja=true;
			this.isVisibilidadCeldaVerFormPresupuestoFlujoCaja=true;
			this.isVisibilidadCeldaOrdenPresupuestoFlujoCaja=true;
			this.isVisibilidadCeldaNuevoRelacionesPresupuestoFlujoCaja=false;
			this.isVisibilidadCeldaModificarPresupuestoFlujoCaja=false;
			this.isVisibilidadCeldaActualizarPresupuestoFlujoCaja=false;
			this.isVisibilidadCeldaEliminarPresupuestoFlujoCaja=false;
			this.isVisibilidadCeldaCancelarPresupuestoFlujoCaja=false;
			this.isVisibilidadCeldaGuardarPresupuestoFlujoCaja=false;
			this.isVisibilidadCeldaGuardarCambiosPresupuestoFlujoCaja=false;
			
			
			this.isVisibilidadFK_IdAnio=true;
			this.isVisibilidadFK_IdCentroCosto=true;
			this.isVisibilidadFK_IdCuentaContable=true;
			this.isVisibilidadFK_IdEjercicio=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdMes=true;
			this.isVisibilidadFK_IdPeriodo=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesPresupuestoFlujoCaja("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosPresupuestoFlujoCaja();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioPresupuestoFlujoCaja(false);
			
			this.setPermisosUsuarioPresupuestoFlujoCaja();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado() 
				|| (this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado() && this.presupuestoflujocajaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioPresupuestoFlujoCajaClasesRelacionadas();
			}
			
			if(this.presupuestoflujocajaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioPresupuestoFlujoCajaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!PresupuestoFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosPresupuestoFlujoCaja();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualPresupuestoFlujoCaja();
			}
			
			if(!this.isPermisoBusquedaPresupuestoFlujoCaja) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasPresupuestoFlujoCaja.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioPresupuestoFlujoCaja,this.isPermisoPaginacionMedioPresupuestoFlujoCaja,this.isPermisoPaginacionTodoPresupuestoFlujoCaja);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(PresupuestoFlujoCajaConstantesFunciones.getTiposSeleccionarPresupuestoFlujoCaja());
				
				this.tiposColumnasSelect=PresupuestoFlujoCajaConstantesFunciones.getTiposSeleccionarPresupuestoFlujoCaja(true);
				
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
			//if(!this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioPresupuestoFlujoCaja();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioPresupuestoFlujoCaja(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioPresupuestoFlujoCaja(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesPresupuestoFlujoCaja() ;
			
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
			this.cuentacontableLogic=new CuentaContableLogic();
			this.ejercicioLogic=new EjercicioLogic();
			this.periodoLogic=new PeriodoLogic();
			this.centrocostoLogic=new CentroCostoLogic();
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
				presupuestoflujocajaImplementable= (PresupuestoFlujoCajaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PresupuestoFlujoCajaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				presupuestoflujocajaImplementableHome= (PresupuestoFlujoCajaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PresupuestoFlujoCajaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.presupuestoflujocajas= new ArrayList<PresupuestoFlujoCaja>();
			this.presupuestoflujocajasEliminados= new ArrayList<PresupuestoFlujoCaja>();
						
			this.isEsNuevoPresupuestoFlujoCaja=false;
			this.esParaAccionDesdeFormularioPresupuestoFlujoCaja=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idCuentaContableActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.cuentacontablesForeignKey=new ArrayList<CuentaContable>() ;
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>() ;
			this.periodosForeignKey=new ArrayList<Periodo>() ;
			this.centrocostosForeignKey=new ArrayList<CentroCosto>() ;
			this.aniosForeignKey=new ArrayList<Anio>() ;
			this.messForeignKey=new ArrayList<Mes>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyPresupuestoFlujoCaja(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroPresupuestoFlujoCaja();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			PresupuestoFlujoCajaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=PresupuestoFlujoCajaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesPresupuestoFlujoCaja("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingPresupuestoFlujoCaja(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioPresupuestoFlujoCaja();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioPresupuestoFlujoCaja();
			}
			
			PresupuestoFlujoCajaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasPresupuestoFlujoCaja.getTabCount(); i++) {
					this.jTabbedPaneBusquedasPresupuestoFlujoCaja.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasPresupuestoFlujoCaja.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocajaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessPresupuestoFlujoCaja(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga PresupuestoFlujoCaja: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocajaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocajaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectPresupuestoFlujoCaja() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesPresupuestoFlujoCaja")) {
				iIndex=this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jTabbedPaneRelacionesPresupuestoFlujoCaja.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jTabbedPaneRelacionesPresupuestoFlujoCaja.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosPresupuestoFlujoCaja.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessPresupuestoFlujoCaja();	
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
	
	public void cargarCombosForeignKeyPresupuestoFlujoCaja(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyPresupuestoFlujoCaja(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyPresupuestoFlujoCaja(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyPresupuestoFlujoCajaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyPresupuestoFlujoCaja();
		
		this.cargarCombosFrameForeignKeyPresupuestoFlujoCaja();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyPresupuestoFlujoCaja();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyPresupuestoFlujoCaja();
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

	public void cargarCombosForeignKeyCentroCosto(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyCentroCostoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCentroCosto();
				this.cargarCombosFrameCentroCostosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCentroCosto(this.centrocostosForeignKey);

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
	
	public void jButtonNuevoPresupuestoFlujoCajaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.presupuestoflujocajaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			PresupuestoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.presupuestoflujocaja,new Object(),this.presupuestoflujocajaParameterGeneral,this.presupuestoflujocajaReturnGeneral);
			
			
			if(jTableDatosPresupuestoFlujoCaja.getRowCount()>=1) {
				jTableDatosPresupuestoFlujoCaja.removeRowSelectionInterval(0, jTableDatosPresupuestoFlujoCaja.getRowCount()-1);						
			}
			
			this.isEsNuevoPresupuestoFlujoCaja=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoPresupuestoFlujoCaja(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesPresupuestoFlujoCaja(true);			
			//this.presupuestoflujocaja=new PresupuestoFlujoCaja();
			//this.presupuestoflujocaja.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPresupuestoFlujoCaja(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPresupuestoFlujoCaja() ;
			
			if(PresupuestoFlujoCajaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePresupuestoFlujoCaja(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.presupuestoflujocaja);	
			this.actualizarInformacion("INFO_PADRE",false,this.presupuestoflujocaja);				
			
			PresupuestoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.presupuestoflujocaja,new Object(),this.presupuestoflujocajaParameterGeneral,this.presupuestoflujocajaReturnGeneral);
			
			if(this.presupuestoflujocajaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar PresupuestoFlujoCaja: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			PresupuestoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.presupuestoflujocaja,new Object(),this.presupuestoflujocajaParameterGeneral,this.presupuestoflujocajaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarPresupuestoFlujoCajaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<PresupuestoFlujoCaja> presupuestoflujocajasSeleccionados=new ArrayList<PresupuestoFlujoCaja>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosPresupuestoFlujoCaja.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosPresupuestoFlujoCaja.getSelectedRows().length;			
			}
			
			presupuestoflujocajasSeleccionados=this.getPresupuestoFlujoCajasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoPresupuestoFlujoCaja--;			
				//PresupuestoFlujoCaja presupuestoflujocajaAux= new PresupuestoFlujoCaja();			
				//presupuestoflujocajaAux.setId(this.iIdNuevoPresupuestoFlujoCaja);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//PresupuestoFlujoCaja presupuestoflujocajaOrigen=new PresupuestoFlujoCaja();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(PresupuestoFlujoCaja presupuestoflujocajaOrigen : presupuestoflujocajasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosPresupuestoFlujoCaja.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							presupuestoflujocajaOrigen =(PresupuestoFlujoCaja) this.presupuestoflujocajaLogic.getPresupuestoFlujoCajas().toArray()[this.jTableDatosPresupuestoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presupuestoflujocajaOrigen =(PresupuestoFlujoCaja) this.presupuestoflujocajas.toArray()[this.jTableDatosPresupuestoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaPresupuestoFlujoCaja();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.presupuestoflujocaja.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosPresupuestoFlujoCaja(presupuestoflujocajaOrigen,this.presupuestoflujocaja,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoFlujoCaja(this.presupuestoflujocaja);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.presupuestoflujocajaLogic.getPresupuestoFlujoCajas().add(this.presupuestoflujocajaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.presupuestoflujocajas.add(this.presupuestoflujocajaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaPresupuestoFlujoCaja(false);
				
				this.jTableDatosPresupuestoFlujoCaja.setRowSelectionInterval(this.getIndiceNuevoPresupuestoFlujoCaja(), this.getIndiceNuevoPresupuestoFlujoCaja());
				
				int iLastRow =  this.jTableDatosPresupuestoFlujoCaja.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPresupuestoFlujoCaja.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPresupuestoFlujoCaja.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPresupuestoFlujoCaja(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarPresupuestoFlujoCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<PresupuestoFlujoCaja> presupuestoflujocajasSeleccionados=new ArrayList<PresupuestoFlujoCaja>();									
		
			PresupuestoFlujoCaja presupuestoflujocajaOrigen=new PresupuestoFlujoCaja();
			PresupuestoFlujoCaja presupuestoflujocajaDestino=new PresupuestoFlujoCaja();
				
			presupuestoflujocajasSeleccionados=this.getPresupuestoFlujoCajasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosPresupuestoFlujoCaja.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || presupuestoflujocajasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosPresupuestoFlujoCaja.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						presupuestoflujocajaOrigen =(PresupuestoFlujoCaja) this.presupuestoflujocajaLogic.getPresupuestoFlujoCajas().toArray()[this.jTableDatosPresupuestoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						presupuestoflujocajaOrigen =(PresupuestoFlujoCaja) this.presupuestoflujocajas.toArray()[this.jTableDatosPresupuestoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						presupuestoflujocajaDestino =(PresupuestoFlujoCaja) this.presupuestoflujocajaLogic.getPresupuestoFlujoCajas().toArray()[this.jTableDatosPresupuestoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						presupuestoflujocajaDestino =(PresupuestoFlujoCaja) this.presupuestoflujocajas.toArray()[this.jTableDatosPresupuestoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				presupuestoflujocajaOrigen =presupuestoflujocajasSeleccionados.get(0);
				presupuestoflujocajaDestino =presupuestoflujocajasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosPresupuestoFlujoCaja(presupuestoflujocajaOrigen,presupuestoflujocajaDestino,true,false);
				
				presupuestoflujocajaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(presupuestoflujocajaDestino,presupuestoflujocajaLogic.getPresupuestoFlujoCajas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(presupuestoflujocajaDestino,presupuestoflujocajas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaPresupuestoFlujoCaja(false);
				
				//this.jTableDatosPresupuestoFlujoCaja.setRowSelectionInterval(this.getIndiceNuevoPresupuestoFlujoCaja(), this.getIndiceNuevoPresupuestoFlujoCaja());
				
				int iLastRow =  this.jTableDatosPresupuestoFlujoCaja.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPresupuestoFlujoCaja.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPresupuestoFlujoCaja.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPresupuestoFlujoCaja(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormPresupuestoFlujoCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormPresupuestoFlujoCaja.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarPresupuestoFlujoCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesPresupuestoFlujoCaja.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasPresupuestoFlujoCaja.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesPresupuestoFlujoCaja.setVisible(!isVisible);
			this.jPanelPaginacionPresupuestoFlujoCaja.setVisible(!isVisible);
			this.jPanelAccionesPresupuestoFlujoCaja.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarPresupuestoFlujoCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFramePresupuestoFlujoCaja();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoPresupuestoFlujoCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoPresupuestoFlujoCaja();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionPresupuestoFlujoCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionPresupuestoFlujoCaja();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByPresupuestoFlujoCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByPresupuestoFlujoCaja();
			
			this.abrirFrameOrderByPresupuestoFlujoCaja();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByPresupuestoFlujoCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByPresupuestoFlujoCaja();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetallePresupuestoFlujoCaja(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormPresupuestoFlujoCaja);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja.isMaximum()) {
					this.jInternalFrameDetalleFormPresupuestoFlujoCaja.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.setSize(this.jInternalFrameDetalleFormPresupuestoFlujoCaja.iWidthFormulario,this.jInternalFrameDetalleFormPresupuestoFlujoCaja.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormPresupuestoFlujoCaja.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormPresupuestoFlujoCaja.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormPresupuestoFlujoCaja.isMaximum()) {
						this.jInternalFrameDetalleFormPresupuestoFlujoCaja.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jContentPaneDetallePresupuestoFlujoCaja.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jTabbedPaneRelacionesPresupuestoFlujoCaja.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jContentPaneDetallePresupuestoFlujoCaja.getWidth(),PresupuestoFlujoCajaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jTabbedPaneRelacionesPresupuestoFlujoCaja.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jContentPaneDetallePresupuestoFlujoCaja.getWidth(),PresupuestoFlujoCajaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jTabbedPaneRelacionesPresupuestoFlujoCaja.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jContentPaneDetallePresupuestoFlujoCaja.getWidth(),PresupuestoFlujoCajaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormPresupuestoFlujoCaja.setVisible(true);
	        this.jInternalFrameDetalleFormPresupuestoFlujoCaja.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByPresupuestoFlujoCaja() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByPresupuestoFlujoCaja==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByPresupuestoFlujoCaja=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPresupuestoFlujoCaja,false,this);
				} else {
					this.jInternalFrameOrderByPresupuestoFlujoCaja=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPresupuestoFlujoCaja,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByPresupuestoFlujoCaja);
				this.jInternalFrameOrderByPresupuestoFlujoCaja.setVisible(false);
				this.jInternalFrameOrderByPresupuestoFlujoCaja.setSelected(false);
				
				this.jInternalFrameOrderByPresupuestoFlujoCaja.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPresupuestoFlujoCaja"));
				
				this.inicializarActualizarBindingTablaOrderByPresupuestoFlujoCaja();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionPresupuestoFlujoCaja() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionPresupuestoFlujoCaja==null) {
				
				this.jInternalFrameImportacionPresupuestoFlujoCaja=new ImportacionJInternalFrame(PresupuestoFlujoCajaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPresupuestoFlujoCaja);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionPresupuestoFlujoCaja);
				this.jInternalFrameImportacionPresupuestoFlujoCaja.setVisible(false);
				this.jInternalFrameImportacionPresupuestoFlujoCaja.setSelected(false);


				this.jInternalFrameImportacionPresupuestoFlujoCaja.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPresupuestoFlujoCaja"));
				this.jInternalFrameImportacionPresupuestoFlujoCaja.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPresupuestoFlujoCaja"));
				this.jInternalFrameImportacionPresupuestoFlujoCaja.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPresupuestoFlujoCaja"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoPresupuestoFlujoCaja() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoPresupuestoFlujoCaja==null) {
				this.jInternalFrameReporteDinamicoPresupuestoFlujoCaja=new ReporteDinamicoJInternalFrame(PresupuestoFlujoCajaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPresupuestoFlujoCaja);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPresupuestoFlujoCaja);
				this.jInternalFrameReporteDinamicoPresupuestoFlujoCaja.setVisible(false);
				this.jInternalFrameReporteDinamicoPresupuestoFlujoCaja.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoPresupuestoFlujoCaja.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPresupuestoFlujoCaja"));
				this.jInternalFrameReporteDinamicoPresupuestoFlujoCaja.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPresupuestoFlujoCaja"));
				this.jInternalFrameReporteDinamicoPresupuestoFlujoCaja.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPresupuestoFlujoCaja"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPresupuestoFlujoCaja();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetallePresupuestoFlujoCaja() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormPresupuestoFlujoCaja);
			
	       	this.jInternalFrameDetalleFormPresupuestoFlujoCaja.setVisible(false);
	        this.jInternalFrameDetalleFormPresupuestoFlujoCaja.setSelected(false);
			
			//this.jInternalFrameDetalleFormPresupuestoFlujoCaja.dispose();
			//this.jInternalFrameDetalleFormPresupuestoFlujoCaja=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoPresupuestoFlujoCaja() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoPresupuestoFlujoCaja.setVisible(true);
	        this.jInternalFrameReporteDinamicoPresupuestoFlujoCaja.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionPresupuestoFlujoCaja() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionPresupuestoFlujoCaja.setVisible(true);
	        this.jInternalFrameImportacionPresupuestoFlujoCaja.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByPresupuestoFlujoCaja() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByPresupuestoFlujoCaja.setVisible(true);
	        this.jInternalFrameOrderByPresupuestoFlujoCaja.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByPresupuestoFlujoCaja() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByPresupuestoFlujoCaja.setVisible(false);
	        this.jInternalFrameOrderByPresupuestoFlujoCaja.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoPresupuestoFlujoCaja() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoPresupuestoFlujoCaja.setVisible(false);
	        this.jInternalFrameReporteDinamicoPresupuestoFlujoCaja.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionPresupuestoFlujoCaja() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionPresupuestoFlujoCaja.setVisible(false);
	        this.jInternalFrameImportacionPresupuestoFlujoCaja.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
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
						TitledBorder titledBorderPresupuestoFlujoCaja=(TitledBorder)this.jScrollPanelDatosPresupuestoFlujoCaja.getBorder();
						TitledBorder titledBorderCuentaContable=(TitledBorder)cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

						titledBorderCuentaContable.setTitle(titledBorderPresupuestoFlujoCaja.getTitle() + " -> Cuenta Contable");


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

				public void abrirFrameTreeCentroCosto(String sTipoProceso) { //throws Exception
					try {
						//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
						//this.jDesktopPane.add(jInternalFrameTreeCentroCosto);
						CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrame=new CentroCostoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
						centrocostoBeanSwingJInternalFrame.setJInternalFrameParent(this);
						centrocostoBeanSwingJInternalFrame.jInternalFrameTreeCentroCosto.setsTipoProceso(sTipoProceso);

						if(sTipoProceso.equals("BUSQUEDA_FK")) {
							centrocostoBeanSwingJInternalFrame.jInternalFrameTreeCentroCosto.sTipoBusqueda="CentroCosto";
						}

						centrocostoBeanSwingJInternalFrame.getTodosCentroCostoArbol();
						centrocostoBeanSwingJInternalFrame.jInternalFrameTreeCentroCosto.setCentroCostos(centrocostoBeanSwingJInternalFrame.centrocostosArbol);
						centrocostoBeanSwingJInternalFrame.jInternalFrameTreeCentroCosto.CargarTreeCentroCosto();
						centrocostoBeanSwingJInternalFrame.jInternalFrameTreeCentroCosto.setVisible(true);
						centrocostoBeanSwingJInternalFrame.jInternalFrameTreeCentroCosto.setSelected(true);

						//SE CAMBIA PARENT ORIGINAL PARA QUE RETORNE EN ESTE FORMULARIO
						centrocostoBeanSwingJInternalFrame.jInternalFrameTreeCentroCosto.jInternalFrameParent=this;
						TitledBorder titledBorderPresupuestoFlujoCaja=(TitledBorder)this.jScrollPanelDatosPresupuestoFlujoCaja.getBorder();
						TitledBorder titledBorderCentroCosto=(TitledBorder)centrocostoBeanSwingJInternalFrame.jScrollPanelDatosCentroCosto.getBorder();

						titledBorderCentroCosto.setTitle(titledBorderPresupuestoFlujoCaja.getTitle() + " -> Centro Costo");


						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,centrocostoBeanSwingJInternalFrame);
						}
						this.jDesktopPane.add(centrocostoBeanSwingJInternalFrame);

					} catch (Exception e) {
						e.getStackTrace();
						//Funciones<%=getFrameworkDomain()%>.manageException(this, e,logger,<%=GetNombreClaseC(TablaBase.ToString())%>ConstantesFunciones.CLASSNAME);
					}
				}

				public void cerrarFrameTreeCentroCosto(CentroCostoBeanSwingJInternalFrame jInternalFrameTreeCentroCosto) throws Exception {
					try {
						//jDesktopPane.add(jInternalFrameTreeCentroCosto);
						jInternalFrameTreeCentroCosto.setVisible(false);
						jInternalFrameTreeCentroCosto.setSelected(false);
						//jInternalFrameTreeCentroCosto.dispose();
						//jInternalFrameTreeCentroCosto=null;
					} catch (final java.beans.PropertyVetoException e) {
						FuncionesSwing.manageException(this, e,logger);
					}
				}
	
	public void jButtonModificarPresupuestoFlujoCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarPresupuestoFlujoCaja(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarPresupuestoFlujoCaja(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPresupuestoFlujoCaja.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesPresupuestoFlujoCaja(true);
			//this.isEsNuevoPresupuestoFlujoCaja=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocaja =(PresupuestoFlujoCaja) this.presupuestoflujocajaLogic.getPresupuestoFlujoCajas().toArray()[this.jTableDatosPresupuestoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.presupuestoflujocaja =(PresupuestoFlujoCaja) this.presupuestoflujocajas.toArray()[this.jTableDatosPresupuestoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesPresupuestoFlujoCaja("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPresupuestoFlujoCaja(false) ;
			
			if(presupuestoflujocajaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(PresupuestoFlujoCajaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePresupuestoFlujoCaja(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPresupuestoFlujoCaja(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaPresupuestoFlujoCajaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosPresupuestoFlujoCaja.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoflujocaja =(PresupuestoFlujoCaja) this.presupuestoflujocajaLogic.getPresupuestoFlujoCajas().toArray()[this.jTableDatosPresupuestoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presupuestoflujocaja =(PresupuestoFlujoCaja) this.presupuestoflujocajas.toArray()[this.jTableDatosPresupuestoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarPresupuestoFlujoCaja(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPresupuestoFlujoCaja.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesPresupuestoFlujoCaja(true);
			//this.isEsNuevoPresupuestoFlujoCaja=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocaja =(PresupuestoFlujoCaja) this.presupuestoflujocajaLogic.getPresupuestoFlujoCajas().toArray()[this.jTableDatosPresupuestoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.presupuestoflujocaja =(PresupuestoFlujoCaja) this.presupuestoflujocajas.toArray()[this.jTableDatosPresupuestoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.presupuestoflujocaja.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesPresupuestoFlujoCaja("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesPresupuestoFlujoCaja(false) ;
			
			if(PresupuestoFlujoCajaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePresupuestoFlujoCaja(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPresupuestoFlujoCaja(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("CuentaContable")) {
				if(!this.presupuestoflujocajaConstantesFunciones.cargarid_cuenta_contablePresupuestoFlujoCaja) {
					this.cargarCombosCuentaContablesForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingPresupuestoFlujoCaja(false,false);
					this.cargarCombosFrameCuentaContablesForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_cuenta_contable (id);

				this.recargarComboTablaCuentaContable(this.cuentacontablesForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaCuentaContable(List<CuentaContable> cuentacontablesForeignKey)throws Exception{
		TableColumn tableColumnCuentaContable=this.jTableDatosPresupuestoFlujoCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoFlujoCaja,PresupuestoFlujoCajaConstantesFunciones.LABEL_IDCUENTACONTABLE));
		TableCellEditor tableCellEditorCuentaContable =tableColumnCuentaContable.getCellEditor();

		CuentaContableTableCell cuentacontableTableCellFk=(CuentaContableTableCell)tableCellEditorCuentaContable;

		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.setcuentacontablesForeignKey(cuentacontablesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPresupuestoFlujoCaja.getSelectedRow();

		//if(intSelectedRow<=0) {
			//cuentacontableTableCellFk.setRowActual(intSelectedRow);
			//cuentacontableTableCellFk.setcuentacontablesForeignKeyActual(cuentacontablesForeignKey);
		//}


		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.RecargarCuentaContablesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
			
	
	public void recargarComboTablaCentroCosto(List<CentroCosto> centrocostosForeignKey)throws Exception{
		TableColumn tableColumnCentroCosto=this.jTableDatosPresupuestoFlujoCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoFlujoCaja,PresupuestoFlujoCajaConstantesFunciones.LABEL_IDCENTROCOSTO));
		TableCellEditor tableCellEditorCentroCosto =tableColumnCentroCosto.getCellEditor();

		CentroCostoTableCell centrocostoTableCellFk=(CentroCostoTableCell)tableCellEditorCentroCosto;

		if(centrocostoTableCellFk!=null) {
			centrocostoTableCellFk.setcentrocostosForeignKey(centrocostosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPresupuestoFlujoCaja.getSelectedRow();

		//if(intSelectedRow<=0) {
			//centrocostoTableCellFk.setRowActual(intSelectedRow);
			//centrocostoTableCellFk.setcentrocostosForeignKeyActual(centrocostosForeignKey);
		//}


		if(centrocostoTableCellFk!=null) {
			centrocostoTableCellFk.RecargarCentroCostosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaAnio(List<Anio> aniosForeignKey)throws Exception{
		TableColumn tableColumnAnio=this.jTableDatosPresupuestoFlujoCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoFlujoCaja,PresupuestoFlujoCajaConstantesFunciones.LABEL_IDANIO));
		TableCellEditor tableCellEditorAnio =tableColumnAnio.getCellEditor();

		AnioTableCell anioTableCellFk=(AnioTableCell)tableCellEditorAnio;

		if(anioTableCellFk!=null) {
			anioTableCellFk.setaniosForeignKey(aniosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPresupuestoFlujoCaja.getSelectedRow();

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
		TableColumn tableColumnMes=this.jTableDatosPresupuestoFlujoCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoFlujoCaja,PresupuestoFlujoCajaConstantesFunciones.LABEL_IDMES));
		TableCellEditor tableCellEditorMes =tableColumnMes.getCellEditor();

		MesTableCell mesTableCellFk=(MesTableCell)tableCellEditorMes;

		if(mesTableCellFk!=null) {
			mesTableCellFk.setmessForeignKey(messForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPresupuestoFlujoCaja.getSelectedRow();

		//if(intSelectedRow<=0) {
			//mesTableCellFk.setRowActual(intSelectedRow);
			//mesTableCellFk.setmessForeignKeyActual(messForeignKey);
		//}


		if(mesTableCellFk!=null) {
			mesTableCellFk.RecargarMessForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_cuenta_contable (Long id) throws Exception {
		this.setActualCuentaContableForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarPresupuestoFlujoCajaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocajaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesPresupuestoFlujoCaja(false);
			
			//if(!this.isEsNuevoPresupuestoFlujoCaja) {								
				int intSelectedRow = this.jTableDatosPresupuestoFlujoCaja.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoflujocaja =(PresupuestoFlujoCaja) this.presupuestoflujocajaLogic.getPresupuestoFlujoCajas().toArray()[this.jTableDatosPresupuestoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.presupuestoflujocaja =(PresupuestoFlujoCaja) this.presupuestoflujocajas.toArray()[this.jTableDatosPresupuestoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(PresupuestoFlujoCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualPresupuestoFlujoCaja(this.presupuestoflujocaja,true);
				this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoFlujoCaja(this.presupuestoflujocaja);
				
			}
			
			if(this.permiteMantenimiento(this.presupuestoflujocaja)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoPresupuestoFlujoCaja=true;
					this.inicializarActualizarBindingTablaPresupuestoFlujoCaja(false);
					this.isEsNuevoPresupuestoFlujoCaja=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoPresupuestoFlujoCaja=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoPresupuestoFlujoCaja=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPresupuestoFlujoCaja(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPresupuestoFlujoCaja(false);
				
				this.habilitarDeshabilitarControlesPresupuestoFlujoCaja(false);
			
												
				
				if(PresupuestoFlujoCajaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetallePresupuestoFlujoCaja();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoPresupuestoFlujoCajaActionPerformed(evt,presupuestoflujocajaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualPresupuestoFlujoCaja(this.presupuestoflujocaja,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosPresupuestoFlujoCaja.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,presupuestoflujocajaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocajaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.presupuestoflujocaja.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(PresupuestoFlujoCaja.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresupuestoFlujoCaja.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocajaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocajaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarPresupuestoFlujoCajaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocajaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosPresupuestoFlujoCaja.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocaja =(PresupuestoFlujoCaja) this.presupuestoflujocajaLogic.getPresupuestoFlujoCajas().toArray()[this.jTableDatosPresupuestoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				this.presupuestoflujocaja.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.presupuestoflujocaja =(PresupuestoFlujoCaja) this.presupuestoflujocajas.toArray()[this.jTableDatosPresupuestoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				this.presupuestoflujocaja.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.presupuestoflujocaja)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((PresupuestoFlujoCajaModel) this.jTableDatosPresupuestoFlujoCaja.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoPresupuestoFlujoCaja=true;
				this.inicializarActualizarBindingTablaPresupuestoFlujoCaja(false);
				this.isEsNuevoPresupuestoFlujoCaja=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPresupuestoFlujoCaja(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPresupuestoFlujoCaja(false);
				
				this.habilitarDeshabilitarControlesPresupuestoFlujoCaja(false);
				
				
				
				if(PresupuestoFlujoCajaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetallePresupuestoFlujoCaja();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocajaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocajaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarPresupuestoFlujoCajaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosPresupuestoFlujoCaja.getRowCount()>=1) {
				jTableDatosPresupuestoFlujoCaja.removeRowSelectionInterval(0, jTableDatosPresupuestoFlujoCaja.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesPresupuestoFlujoCaja(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaPresupuestoFlujoCaja(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPresupuestoFlujoCaja(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPresupuestoFlujoCaja(false) ;
			
			this.isEsNuevoPresupuestoFlujoCaja=false;
			
			if(PresupuestoFlujoCajaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetallePresupuestoFlujoCaja();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosPresupuestoFlujoCajaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocajaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingPresupuestoFlujoCaja(false);
				
				//SI ES MANUAL
				if(PresupuestoFlujoCajaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualPresupuestoFlujoCaja();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocajaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocajaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosPresupuestoFlujoCajaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoPresupuestoFlujoCaja--;			
			//PresupuestoFlujoCaja presupuestoflujocajaAux= new PresupuestoFlujoCaja();			
			//presupuestoflujocajaAux.setId(this.iIdNuevoPresupuestoFlujoCaja);
			
			if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaPresupuestoFlujoCaja();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoFlujoCaja(this.presupuestoflujocaja);
			
			this.presupuestoflujocaja.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.presupuestoflujocajaLogic.getPresupuestoFlujoCajas().add(this.presupuestoflujocajaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.presupuestoflujocajas.add(this.presupuestoflujocajaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaPresupuestoFlujoCaja(false);
			
			this.jTableDatosPresupuestoFlujoCaja.setRowSelectionInterval(this.getIndiceNuevoPresupuestoFlujoCaja(), this.getIndiceNuevoPresupuestoFlujoCaja());
			
			int iLastRow =  this.jTableDatosPresupuestoFlujoCaja.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosPresupuestoFlujoCaja.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosPresupuestoFlujoCaja.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaPresupuestoFlujoCaja(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionPresupuestoFlujoCajaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocajaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingPresupuestoFlujoCaja(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPresupuestoFlujoCaja(false);
			
			//SI ES MANUAL
			if(PresupuestoFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPresupuestoFlujoCaja();
			}
			
			//this.abrirFrameTreePresupuestoFlujoCaja();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocajaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocajaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocajaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionPresupuestoFlujoCajaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Presupuesto Flujo CajaS ?", "MANTENIMIENTO DE Presupuesto Flujo Caja", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionPresupuestoFlujoCaja.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralPresupuestoFlujoCaja();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.presupuestoflujocajaReturnGeneral=presupuestoflujocajaLogic.procesarImportacionPresupuestoFlujoCajasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.presupuestoflujocajaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarPresupuestoFlujoCajaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionPresupuestoFlujoCajaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionPresupuestoFlujoCaja.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionPresupuestoFlujoCaja.setFileImportacion(this.jInternalFrameImportacionPresupuestoFlujoCaja.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionPresupuestoFlujoCaja.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionPresupuestoFlujoCaja.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionPresupuestoFlujoCaja.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionPresupuestoFlujoCaja.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoPresupuestoFlujoCajaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<PresupuestoFlujoCaja> presupuestoflujocajasSeleccionados=new ArrayList<PresupuestoFlujoCaja>();		

		presupuestoflujocajasSeleccionados=this.getPresupuestoFlujoCajasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPresupuestoFlujoCaja.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPresupuestoFlujoCaja.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("PresupuestoFlujoCajaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"PresupuestoFlujoCajaBaseDesign.jrxml";
			
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
			
			this.generarReportePresupuestoFlujoCajas("Todos",presupuestoflujocajasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Presupuesto Flujo Caja",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoPresupuestoFlujoCaja.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPresupuestoFlujoCaja.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PresupuestoFlujoCajaConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresupuestoFlujoCajaConstantesFunciones.LABEL_IDCUENTACONTABLE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_CuentaContable_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_CuentaContable_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_CuentaContable_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_CuentaContable_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresupuestoFlujoCajaConstantesFunciones.LABEL_IDEJERCICIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Ejercicio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Ejercicio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Ejercicio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Ejercicio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresupuestoFlujoCajaConstantesFunciones.LABEL_IDPERIODO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Periodo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Periodo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Periodo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Periodo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresupuestoFlujoCajaConstantesFunciones.LABEL_IDCENTROCOSTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_CentroCosto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_CentroCosto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_CentroCosto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_CentroCosto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresupuestoFlujoCajaConstantesFunciones.LABEL_VALOR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresupuestoFlujoCajaConstantesFunciones.LABEL_VALOREFECTIVO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lorEfectivo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lorEfectivo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lorEfectivo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lorEfectivo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresupuestoFlujoCajaConstantesFunciones.LABEL_PORCENTAJE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rcentaje_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rcentaje_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rcentaje_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rcentaje_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresupuestoFlujoCajaConstantesFunciones.LABEL_FECHAPRESUPUESTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaPresupuesto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaPresupuesto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaPresupuesto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaPresupuesto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresupuestoFlujoCajaConstantesFunciones.LABEL_FECHAPROCESO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaProceso_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaProceso_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaProceso_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaProceso_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresupuestoFlujoCajaConstantesFunciones.LABEL_OBSERVACION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_servacion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_servacion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_servacion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_servacion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresupuestoFlujoCajaConstantesFunciones.LABEL_IDANIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Anio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Anio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Anio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Anio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresupuestoFlujoCajaConstantesFunciones.LABEL_IDMES:
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
		
		if(this.jInternalFrameReporteDinamicoPresupuestoFlujoCaja.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoPresupuestoFlujoCaja.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoPresupuestoFlujoCaja.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case PresupuestoFlujoCajaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case PresupuestoFlujoCajaConstantesFunciones.LABEL_IDCUENTACONTABLE:
					sNombreCampoCategoria="id_cuenta_contable";
					break;

				case PresupuestoFlujoCajaConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoria="id_ejercicio";
					break;

				case PresupuestoFlujoCajaConstantesFunciones.LABEL_IDPERIODO:
					sNombreCampoCategoria="id_periodo";
					break;

				case PresupuestoFlujoCajaConstantesFunciones.LABEL_IDCENTROCOSTO:
					sNombreCampoCategoria="id_centro_costo";
					break;

				case PresupuestoFlujoCajaConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoria="valor";
					break;

				case PresupuestoFlujoCajaConstantesFunciones.LABEL_VALOREFECTIVO:
					sNombreCampoCategoria="valor_efectivo";
					break;

				case PresupuestoFlujoCajaConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoria="porcentaje";
					break;

				case PresupuestoFlujoCajaConstantesFunciones.LABEL_FECHAPRESUPUESTO:
					sNombreCampoCategoria="fecha_presupuesto";
					break;

				case PresupuestoFlujoCajaConstantesFunciones.LABEL_FECHAPROCESO:
					sNombreCampoCategoria="fecha_proceso";
					break;

				case PresupuestoFlujoCajaConstantesFunciones.LABEL_OBSERVACION:
					sNombreCampoCategoria="observacion";
					break;

				case PresupuestoFlujoCajaConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoria="id_anio";
					break;

				case PresupuestoFlujoCajaConstantesFunciones.LABEL_IDMES:
					sNombreCampoCategoria="id_mes";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoPresupuestoFlujoCaja.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case PresupuestoFlujoCajaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case PresupuestoFlujoCajaConstantesFunciones.LABEL_IDCUENTACONTABLE:
					sNombreCampoCategoriaValor="id_cuenta_contable";
					break;

				case PresupuestoFlujoCajaConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoriaValor="id_ejercicio";
					break;

				case PresupuestoFlujoCajaConstantesFunciones.LABEL_IDPERIODO:
					sNombreCampoCategoriaValor="id_periodo";
					break;

				case PresupuestoFlujoCajaConstantesFunciones.LABEL_IDCENTROCOSTO:
					sNombreCampoCategoriaValor="id_centro_costo";
					break;

				case PresupuestoFlujoCajaConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoriaValor="valor";
					break;

				case PresupuestoFlujoCajaConstantesFunciones.LABEL_VALOREFECTIVO:
					sNombreCampoCategoriaValor="valor_efectivo";
					break;

				case PresupuestoFlujoCajaConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoriaValor="porcentaje";
					break;

				case PresupuestoFlujoCajaConstantesFunciones.LABEL_FECHAPRESUPUESTO:
					sNombreCampoCategoriaValor="fecha_presupuesto";
					break;

				case PresupuestoFlujoCajaConstantesFunciones.LABEL_FECHAPROCESO:
					sNombreCampoCategoriaValor="fecha_proceso";
					break;

				case PresupuestoFlujoCajaConstantesFunciones.LABEL_OBSERVACION:
					sNombreCampoCategoriaValor="observacion";
					break;

				case PresupuestoFlujoCajaConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoriaValor="id_anio";
					break;

				case PresupuestoFlujoCajaConstantesFunciones.LABEL_IDMES:
					sNombreCampoCategoriaValor="id_mes";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoPresupuestoFlujoCaja.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPresupuestoFlujoCaja.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PresupuestoFlujoCajaConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case PresupuestoFlujoCajaConstantesFunciones.LABEL_IDCUENTACONTABLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cuenta Contable",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cuenta_contable");
					break;

				case PresupuestoFlujoCajaConstantesFunciones.LABEL_IDEJERCICIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ejercicio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_ejercicio");
					break;

				case PresupuestoFlujoCajaConstantesFunciones.LABEL_IDPERIODO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Periodo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_periodo");
					break;

				case PresupuestoFlujoCajaConstantesFunciones.LABEL_IDCENTROCOSTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Centro Costo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_centro_costo");
					break;

				case PresupuestoFlujoCajaConstantesFunciones.LABEL_VALOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor");
					break;

				case PresupuestoFlujoCajaConstantesFunciones.LABEL_VALOREFECTIVO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor Efectivo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor_efectivo");
					break;

				case PresupuestoFlujoCajaConstantesFunciones.LABEL_PORCENTAJE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Porcentaje",sNombreCampoCategoria,sNombreCampoCategoriaValor,"porcentaje");
					break;

				case PresupuestoFlujoCajaConstantesFunciones.LABEL_FECHAPRESUPUESTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Presupuesto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_presupuesto");
					break;

				case PresupuestoFlujoCajaConstantesFunciones.LABEL_FECHAPROCESO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Proceso",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_proceso");
					break;

				case PresupuestoFlujoCajaConstantesFunciones.LABEL_OBSERVACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Observacion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"observacion");
					break;

				case PresupuestoFlujoCajaConstantesFunciones.LABEL_IDANIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Anio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_anio");
					break;

				case PresupuestoFlujoCajaConstantesFunciones.LABEL_IDMES:
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
	
	public void jButtonGenerarExcelReporteDinamicoPresupuestoFlujoCajaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<PresupuestoFlujoCaja> presupuestoflujocajasSeleccionados=new ArrayList<PresupuestoFlujoCaja>();		
		
		presupuestoflujocajasSeleccionados=this.getPresupuestoFlujoCajasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presupuestoflujocaja";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("PresupuestoFlujoCajas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoPresupuestoFlujoCaja.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoPresupuestoFlujoCaja.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case PresupuestoFlujoCajaConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresupuestoFlujoCajaConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(PresupuestoFlujoCaja presupuestoflujocaja:presupuestoflujocajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presupuestoflujocaja.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresupuestoFlujoCajaConstantesFunciones.LABEL_IDCUENTACONTABLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresupuestoFlujoCajaConstantesFunciones.LABEL_IDCUENTACONTABLE);
					iRow++;

					for(PresupuestoFlujoCaja presupuestoflujocaja:presupuestoflujocajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presupuestoflujocaja.getcuentacontable_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresupuestoFlujoCajaConstantesFunciones.LABEL_IDEJERCICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresupuestoFlujoCajaConstantesFunciones.LABEL_IDEJERCICIO);
					iRow++;

					for(PresupuestoFlujoCaja presupuestoflujocaja:presupuestoflujocajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presupuestoflujocaja.getejercicio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresupuestoFlujoCajaConstantesFunciones.LABEL_IDPERIODO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresupuestoFlujoCajaConstantesFunciones.LABEL_IDPERIODO);
					iRow++;

					for(PresupuestoFlujoCaja presupuestoflujocaja:presupuestoflujocajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presupuestoflujocaja.getperiodo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresupuestoFlujoCajaConstantesFunciones.LABEL_IDCENTROCOSTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresupuestoFlujoCajaConstantesFunciones.LABEL_IDCENTROCOSTO);
					iRow++;

					for(PresupuestoFlujoCaja presupuestoflujocaja:presupuestoflujocajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presupuestoflujocaja.getcentrocosto_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresupuestoFlujoCajaConstantesFunciones.LABEL_VALOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresupuestoFlujoCajaConstantesFunciones.LABEL_VALOR);
					iRow++;

					for(PresupuestoFlujoCaja presupuestoflujocaja:presupuestoflujocajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presupuestoflujocaja.getvalor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresupuestoFlujoCajaConstantesFunciones.LABEL_VALOREFECTIVO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresupuestoFlujoCajaConstantesFunciones.LABEL_VALOREFECTIVO);
					iRow++;

					for(PresupuestoFlujoCaja presupuestoflujocaja:presupuestoflujocajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presupuestoflujocaja.getvalor_efectivo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresupuestoFlujoCajaConstantesFunciones.LABEL_PORCENTAJE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresupuestoFlujoCajaConstantesFunciones.LABEL_PORCENTAJE);
					iRow++;

					for(PresupuestoFlujoCaja presupuestoflujocaja:presupuestoflujocajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presupuestoflujocaja.getporcentaje());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresupuestoFlujoCajaConstantesFunciones.LABEL_FECHAPRESUPUESTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresupuestoFlujoCajaConstantesFunciones.LABEL_FECHAPRESUPUESTO);
					iRow++;

					for(PresupuestoFlujoCaja presupuestoflujocaja:presupuestoflujocajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presupuestoflujocaja.getfecha_presupuesto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresupuestoFlujoCajaConstantesFunciones.LABEL_FECHAPROCESO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresupuestoFlujoCajaConstantesFunciones.LABEL_FECHAPROCESO);
					iRow++;

					for(PresupuestoFlujoCaja presupuestoflujocaja:presupuestoflujocajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presupuestoflujocaja.getfecha_proceso());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresupuestoFlujoCajaConstantesFunciones.LABEL_OBSERVACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresupuestoFlujoCajaConstantesFunciones.LABEL_OBSERVACION);
					iRow++;

					for(PresupuestoFlujoCaja presupuestoflujocaja:presupuestoflujocajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presupuestoflujocaja.getobservacion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresupuestoFlujoCajaConstantesFunciones.LABEL_IDANIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresupuestoFlujoCajaConstantesFunciones.LABEL_IDANIO);
					iRow++;

					for(PresupuestoFlujoCaja presupuestoflujocaja:presupuestoflujocajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presupuestoflujocaja.getanio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresupuestoFlujoCajaConstantesFunciones.LABEL_IDMES:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresupuestoFlujoCajaConstantesFunciones.LABEL_IDMES);
					iRow++;

					for(PresupuestoFlujoCaja presupuestoflujocaja:presupuestoflujocajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presupuestoflujocaja.getmes_descripcion());
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
			//	this.getFilaCabeceraExportarExcelPresupuestoFlujoCaja(row);				
			//	iRow++;
			//}				
			
			//for(PresupuestoFlujoCaja presupuestoflujocajaAux:presupuestoflujocajasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelPresupuestoFlujoCaja(presupuestoflujocajaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Presupuesto Flujo Caja",JOptionPane.INFORMATION_MESSAGE);
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
				this.presupuestoflujocajaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPresupuestoFlujoCaja(false);
			
			//SI ES MANUAL
			if(PresupuestoFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPresupuestoFlujoCaja();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocajaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocajaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocajaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresPresupuestoFlujoCajaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocajaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPresupuestoFlujoCaja(false);
			
			//SI ES MANUAL
			if(PresupuestoFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPresupuestoFlujoCaja();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocajaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocajaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocajaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesPresupuestoFlujoCajaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocajaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPresupuestoFlujoCaja(false);
			
			//SI ES MANUAL
			if(PresupuestoFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPresupuestoFlujoCaja();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocajaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocajaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocajaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaPresupuestoFlujoCaja() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosPresupuestoFlujoCaja.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosPresupuestoFlujoCaja.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosPresupuestoFlujoCaja.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosPresupuestoFlujoCaja.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosPresupuestoFlujoCaja.setMinimumSize(dimensionMinimum);
		this.jTableDatosPresupuestoFlujoCaja.setMaximumSize(dimensionMaximum);
		this.jTableDatosPresupuestoFlujoCaja.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingPresupuestoFlujoCaja(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingPresupuestoFlujoCaja(esInicializar,true);
	}
	
	public void inicializarActualizarBindingPresupuestoFlujoCaja(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaPresupuestoFlujoCaja(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesPresupuestoFlujoCaja(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasPresupuestoFlujoCaja(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPresupuestoFlujoCaja(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesPresupuestoFlujoCaja(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !PresupuestoFlujoCajaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!PresupuestoFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualPresupuestoFlujoCaja() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaPresupuestoFlujoCaja();
		
		this.inicializarActualizarBindingBotonesManualPresupuestoFlujoCaja(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualPresupuestoFlujoCaja();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPresupuestoFlujoCaja() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualPresupuestoFlujoCaja(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualPresupuestoFlujoCaja(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosPresupuestoFlujoCaja.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosPresupuestoFlujoCaja.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReportePresupuestoFlujoCaja.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jCheckBoxPostAccionNuevoPresupuestoFlujoCaja.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jCheckBoxPostAccionSinCerrarPresupuestoFlujoCaja.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jCheckBoxPostAccionSinMensajePresupuestoFlujoCaja.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosPresupuestoFlujoCaja.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosPresupuestoFlujoCaja.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReportePresupuestoFlujoCaja.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) {
				this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jCheckBoxPostAccionNuevoPresupuestoFlujoCaja.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jCheckBoxPostAccionSinCerrarPresupuestoFlujoCaja.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jCheckBoxPostAccionSinMensajePresupuestoFlujoCaja.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionPresupuestoFlujoCaja.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionPresupuestoFlujoCaja.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxTiposAccionesFormularioPresupuestoFlujoCaja.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesPresupuestoFlujoCaja.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoPresupuestoFlujoCaja!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPresupuestoFlujoCaja.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesPresupuestoFlujoCaja.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesPresupuestoFlujoCaja.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarPresupuestoFlujoCaja.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesPresupuestoFlujoCaja.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoPresupuestoFlujoCaja!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPresupuestoFlujoCaja.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesPresupuestoFlujoCaja.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralPresupuestoFlujoCaja.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPresupuestoFlujoCaja(Boolean esInicializar) throws Exception {
		try	{	
			if(PresupuestoFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualPresupuestoFlujoCaja(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesPresupuestoFlujoCaja() throws Exception {
		try	{
			if(PresupuestoFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualPresupuestoFlujoCaja();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePresupuestoFlujoCaja() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxTiposAccionesFormularioPresupuestoFlujoCaja.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxTiposAccionesFormularioPresupuestoFlujoCaja.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualPresupuestoFlujoCaja() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesPresupuestoFlujoCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesPresupuestoFlujoCaja.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesPresupuestoFlujoCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesPresupuestoFlujoCaja.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesPresupuestoFlujoCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesPresupuestoFlujoCaja.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionPresupuestoFlujoCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionPresupuestoFlujoCaja.addItem(reporte);
			}
			
			
			if(!this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionPresupuestoFlujoCaja.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionPresupuestoFlujoCaja.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesPresupuestoFlujoCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesPresupuestoFlujoCaja.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesPresupuestoFlujoCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesPresupuestoFlujoCaja.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxTiposAccionesFormularioPresupuestoFlujoCaja.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxTiposAccionesFormularioPresupuestoFlujoCaja.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarPresupuestoFlujoCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarPresupuestoFlujoCaja.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarPresupuestoFlujoCaja.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPresupuestoFlujoCaja();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPresupuestoFlujoCaja() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPresupuestoFlujoCaja!=null) {
				this.jInternalFrameReporteDinamicoPresupuestoFlujoCaja.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoPresupuestoFlujoCaja.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPresupuestoFlujoCaja!=null) {
				this.jInternalFrameReporteDinamicoPresupuestoFlujoCaja.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoPresupuestoFlujoCaja.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoPresupuestoFlujoCaja!=null) {
				
				if(this.jInternalFrameReporteDinamicoPresupuestoFlujoCaja.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPresupuestoFlujoCaja.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPresupuestoFlujoCaja.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoPresupuestoFlujoCaja.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPresupuestoFlujoCaja.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPresupuestoFlujoCaja.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoPresupuestoFlujoCaja.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoPresupuestoFlujoCaja.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=PresupuestoFlujoCajaConstantesFunciones.getTiposSeleccionarPresupuestoFlujoCaja(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoPresupuestoFlujoCaja.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoPresupuestoFlujoCaja.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoPresupuestoFlujoCaja.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=PresupuestoFlujoCajaConstantesFunciones.getTiposSeleccionarPresupuestoFlujoCaja(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoPresupuestoFlujoCaja.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoPresupuestoFlujoCaja.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoPresupuestoFlujoCaja.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=PresupuestoFlujoCajaConstantesFunciones.getTiposSeleccionarPresupuestoFlujoCaja(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPresupuestoFlujoCaja.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoPresupuestoFlujoCaja.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoPresupuestoFlujoCaja.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoPresupuestoFlujoCaja.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualPresupuestoFlujoCaja()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_centro_costoFK_IdCentroCostoPresupuestoFlujoCaja.getSelectedItem()!=null){this.id_centro_costoFK_IdCentroCosto=((CentroCosto)this.jComboBoxid_centro_costoFK_IdCentroCostoPresupuestoFlujoCaja.getSelectedItem()).getId();}
		if(this.jComboBoxid_cuenta_contableFK_IdCuentaContablePresupuestoFlujoCaja.getSelectedItem()!=null){this.id_cuenta_contableFK_IdCuentaContable=((CuentaContable)this.jComboBoxid_cuenta_contableFK_IdCuentaContablePresupuestoFlujoCaja.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasPresupuestoFlujoCaja(Boolean esInicializar) throws Exception {				
		if(PresupuestoFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualPresupuestoFlujoCaja();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaPresupuestoFlujoCaja() throws Exception {
		this.inicializarActualizarBindingTablaPresupuestoFlujoCaja(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByPresupuestoFlujoCaja() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByPresupuestoFlujoCaja.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByPresupuestoFlujoCaja.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPresupuestoFlujoCaja.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new PresupuestoFlujoCajaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByPresupuestoFlujoCaja.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPresupuestoFlujoCaja.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new PresupuestoFlujoCajaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosPresupuestoFlujoCajaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoFlujoCajaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new PresupuestoFlujoCajaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByPresupuestoFlujoCaja.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPresupuestoFlujoCaja.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new PresupuestoFlujoCajaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByPresupuestoFlujoCaja.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaPresupuestoFlujoCaja(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=presupuestoflujocajaLogic.getPresupuestoFlujoCajas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=presupuestoflujocajas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(PresupuestoFlujoCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosPresupuestoFlujoCaja.setModel(new PresupuestoFlujoCajaModel(this.presupuestoflujocajaLogic.getPresupuestoFlujoCajas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosPresupuestoFlujoCaja.setModel(new PresupuestoFlujoCajaModel(this.presupuestoflujocajas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByPresupuestoFlujoCaja!=null && this.jInternalFrameOrderByPresupuestoFlujoCaja.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByPresupuestoFlujoCaja();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosPresupuestoFlujoCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoFlujoCaja,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new PresupuestoFlujoCajaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+PresupuestoFlujoCajaConstantesFunciones.SCLASSWEBTITULO,presupuestoflujocajaConstantesFunciones.resaltarSeleccionarPresupuestoFlujoCaja,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+PresupuestoFlujoCajaConstantesFunciones.SCLASSWEBTITULO,presupuestoflujocajaConstantesFunciones.resaltarSeleccionarPresupuestoFlujoCaja,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosPresupuestoFlujoCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoFlujoCaja,PresupuestoFlujoCajaConstantesFunciones.LABEL_ID));

		if(this.presupuestoflujocajaConstantesFunciones.mostraridPresupuestoFlujoCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresupuestoFlujoCajaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.presupuestoflujocajaConstantesFunciones.resaltaridPresupuestoFlujoCaja,this.presupuestoflujocajaConstantesFunciones.activaridPresupuestoFlujoCaja,iSizeTabla,this,true,"idPresupuestoFlujoCaja","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.presupuestoflujocajaConstantesFunciones.resaltaridPresupuestoFlujoCaja,this.presupuestoflujocajaConstantesFunciones.activaridPresupuestoFlujoCaja,this,true,"idPresupuestoFlujoCaja","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresupuestoFlujoCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoFlujoCaja,PresupuestoFlujoCajaConstantesFunciones.LABEL_IDEMPRESA));

		if(this.presupuestoflujocajaConstantesFunciones.mostrarid_empresaPresupuestoFlujoCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresupuestoFlujoCajaConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.presupuestoflujocajaConstantesFunciones.resaltarid_empresaPresupuestoFlujoCaja,this,this.presupuestoflujocajaConstantesFunciones.activarid_empresaPresupuestoFlujoCaja,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.presupuestoflujocajaConstantesFunciones.resaltarid_empresaPresupuestoFlujoCaja,this,this.presupuestoflujocajaConstantesFunciones.activarid_empresaPresupuestoFlujoCaja,false,"id_empresaPresupuestoFlujoCaja","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PresupuestoFlujoCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresupuestoFlujoCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoFlujoCaja,PresupuestoFlujoCajaConstantesFunciones.LABEL_IDCUENTACONTABLE));

		if(this.presupuestoflujocajaConstantesFunciones.mostrarid_cuenta_contablePresupuestoFlujoCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresupuestoFlujoCajaConstantesFunciones.LABEL_IDCUENTACONTABLE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CuentaContableTableCell(this.cuentacontablesForeignKey,this.presupuestoflujocajaConstantesFunciones.resaltarid_cuenta_contablePresupuestoFlujoCaja,this,this.presupuestoflujocajaConstantesFunciones.activarid_cuenta_contablePresupuestoFlujoCaja,iSizeTabla));
			tableColumn.setCellEditor(new CuentaContableTableCell(this.cuentacontablesForeignKey,this.presupuestoflujocajaConstantesFunciones.resaltarid_cuenta_contablePresupuestoFlujoCaja,this,this.presupuestoflujocajaConstantesFunciones.activarid_cuenta_contablePresupuestoFlujoCaja,true,"id_cuenta_contablePresupuestoFlujoCaja","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70);
			//tableColumn.addPropertyChangeListener(new PresupuestoFlujoCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresupuestoFlujoCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoFlujoCaja,PresupuestoFlujoCajaConstantesFunciones.LABEL_IDEJERCICIO));

		if(this.presupuestoflujocajaConstantesFunciones.mostrarid_ejercicioPresupuestoFlujoCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresupuestoFlujoCajaConstantesFunciones.LABEL_IDEJERCICIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EjercicioTableCell(this.ejerciciosForeignKey,this.presupuestoflujocajaConstantesFunciones.resaltarid_ejercicioPresupuestoFlujoCaja,this,this.presupuestoflujocajaConstantesFunciones.activarid_ejercicioPresupuestoFlujoCaja,iSizeTabla));
			tableColumn.setCellEditor(new EjercicioTableCell(this.ejerciciosForeignKey,this.presupuestoflujocajaConstantesFunciones.resaltarid_ejercicioPresupuestoFlujoCaja,this,this.presupuestoflujocajaConstantesFunciones.activarid_ejercicioPresupuestoFlujoCaja,false,"id_ejercicioPresupuestoFlujoCaja","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PresupuestoFlujoCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresupuestoFlujoCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoFlujoCaja,PresupuestoFlujoCajaConstantesFunciones.LABEL_IDPERIODO));

		if(this.presupuestoflujocajaConstantesFunciones.mostrarid_periodoPresupuestoFlujoCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresupuestoFlujoCajaConstantesFunciones.LABEL_IDPERIODO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new PeriodoTableCell(this.periodosForeignKey,this.presupuestoflujocajaConstantesFunciones.resaltarid_periodoPresupuestoFlujoCaja,this,this.presupuestoflujocajaConstantesFunciones.activarid_periodoPresupuestoFlujoCaja,iSizeTabla));
			tableColumn.setCellEditor(new PeriodoTableCell(this.periodosForeignKey,this.presupuestoflujocajaConstantesFunciones.resaltarid_periodoPresupuestoFlujoCaja,this,this.presupuestoflujocajaConstantesFunciones.activarid_periodoPresupuestoFlujoCaja,false,"id_periodoPresupuestoFlujoCaja","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PresupuestoFlujoCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresupuestoFlujoCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoFlujoCaja,PresupuestoFlujoCajaConstantesFunciones.LABEL_IDCENTROCOSTO));

		if(this.presupuestoflujocajaConstantesFunciones.mostrarid_centro_costoPresupuestoFlujoCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresupuestoFlujoCajaConstantesFunciones.LABEL_IDCENTROCOSTO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CentroCostoTableCell(this.centrocostosForeignKey,this.presupuestoflujocajaConstantesFunciones.resaltarid_centro_costoPresupuestoFlujoCaja,this,this.presupuestoflujocajaConstantesFunciones.activarid_centro_costoPresupuestoFlujoCaja,iSizeTabla));
			tableColumn.setCellEditor(new CentroCostoTableCell(this.centrocostosForeignKey,this.presupuestoflujocajaConstantesFunciones.resaltarid_centro_costoPresupuestoFlujoCaja,this,this.presupuestoflujocajaConstantesFunciones.activarid_centro_costoPresupuestoFlujoCaja,true,"id_centro_costoPresupuestoFlujoCaja","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PresupuestoFlujoCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresupuestoFlujoCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoFlujoCaja,PresupuestoFlujoCajaConstantesFunciones.LABEL_VALOR));

		if(this.presupuestoflujocajaConstantesFunciones.mostrarvalorPresupuestoFlujoCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresupuestoFlujoCajaConstantesFunciones.LABEL_VALOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.presupuestoflujocajaConstantesFunciones.resaltarvalorPresupuestoFlujoCaja,this.presupuestoflujocajaConstantesFunciones.activarvalorPresupuestoFlujoCaja,iSizeTabla,this,true,"valorPresupuestoFlujoCaja","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.presupuestoflujocajaConstantesFunciones.resaltarvalorPresupuestoFlujoCaja,this.presupuestoflujocajaConstantesFunciones.activarvalorPresupuestoFlujoCaja,this,true,"valorPresupuestoFlujoCaja","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PresupuestoFlujoCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresupuestoFlujoCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoFlujoCaja,PresupuestoFlujoCajaConstantesFunciones.LABEL_VALOREFECTIVO));

		if(this.presupuestoflujocajaConstantesFunciones.mostrarvalor_efectivoPresupuestoFlujoCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresupuestoFlujoCajaConstantesFunciones.LABEL_VALOREFECTIVO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.presupuestoflujocajaConstantesFunciones.resaltarvalor_efectivoPresupuestoFlujoCaja,this.presupuestoflujocajaConstantesFunciones.activarvalor_efectivoPresupuestoFlujoCaja,iSizeTabla,this,true,"valor_efectivoPresupuestoFlujoCaja","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.presupuestoflujocajaConstantesFunciones.resaltarvalor_efectivoPresupuestoFlujoCaja,this.presupuestoflujocajaConstantesFunciones.activarvalor_efectivoPresupuestoFlujoCaja,this,true,"valor_efectivoPresupuestoFlujoCaja","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PresupuestoFlujoCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresupuestoFlujoCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoFlujoCaja,PresupuestoFlujoCajaConstantesFunciones.LABEL_PORCENTAJE));

		if(this.presupuestoflujocajaConstantesFunciones.mostrarporcentajePresupuestoFlujoCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresupuestoFlujoCajaConstantesFunciones.LABEL_PORCENTAJE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.presupuestoflujocajaConstantesFunciones.resaltarporcentajePresupuestoFlujoCaja,this.presupuestoflujocajaConstantesFunciones.activarporcentajePresupuestoFlujoCaja,iSizeTabla,this,true,"porcentajePresupuestoFlujoCaja","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.presupuestoflujocajaConstantesFunciones.resaltarporcentajePresupuestoFlujoCaja,this.presupuestoflujocajaConstantesFunciones.activarporcentajePresupuestoFlujoCaja,this,true,"porcentajePresupuestoFlujoCaja","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PresupuestoFlujoCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresupuestoFlujoCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoFlujoCaja,PresupuestoFlujoCajaConstantesFunciones.LABEL_FECHAPRESUPUESTO));

		if(this.presupuestoflujocajaConstantesFunciones.mostrarfecha_presupuestoPresupuestoFlujoCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresupuestoFlujoCajaConstantesFunciones.LABEL_FECHAPRESUPUESTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.presupuestoflujocajaConstantesFunciones.resaltarfecha_presupuestoPresupuestoFlujoCaja,this.presupuestoflujocajaConstantesFunciones.activarfecha_presupuestoPresupuestoFlujoCaja,iSizeTabla,this,true,"fecha_presupuestoPresupuestoFlujoCaja","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.presupuestoflujocajaConstantesFunciones.resaltarfecha_presupuestoPresupuestoFlujoCaja,this.presupuestoflujocajaConstantesFunciones.activarfecha_presupuestoPresupuestoFlujoCaja,this,true,"fecha_presupuestoPresupuestoFlujoCaja","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new PresupuestoFlujoCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresupuestoFlujoCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoFlujoCaja,PresupuestoFlujoCajaConstantesFunciones.LABEL_FECHAPROCESO));

		if(this.presupuestoflujocajaConstantesFunciones.mostrarfecha_procesoPresupuestoFlujoCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresupuestoFlujoCajaConstantesFunciones.LABEL_FECHAPROCESO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.presupuestoflujocajaConstantesFunciones.resaltarfecha_procesoPresupuestoFlujoCaja,this.presupuestoflujocajaConstantesFunciones.activarfecha_procesoPresupuestoFlujoCaja,iSizeTabla,this,true,"fecha_procesoPresupuestoFlujoCaja","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.presupuestoflujocajaConstantesFunciones.resaltarfecha_procesoPresupuestoFlujoCaja,this.presupuestoflujocajaConstantesFunciones.activarfecha_procesoPresupuestoFlujoCaja,this,true,"fecha_procesoPresupuestoFlujoCaja","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new PresupuestoFlujoCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresupuestoFlujoCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoFlujoCaja,PresupuestoFlujoCajaConstantesFunciones.LABEL_OBSERVACION));

		if(this.presupuestoflujocajaConstantesFunciones.mostrarobservacionPresupuestoFlujoCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresupuestoFlujoCajaConstantesFunciones.LABEL_OBSERVACION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.presupuestoflujocajaConstantesFunciones.resaltarobservacionPresupuestoFlujoCaja,this.presupuestoflujocajaConstantesFunciones.activarobservacionPresupuestoFlujoCaja,iSizeTabla,this,true,"observacionPresupuestoFlujoCaja","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.presupuestoflujocajaConstantesFunciones.resaltarobservacionPresupuestoFlujoCaja,this.presupuestoflujocajaConstantesFunciones.activarobservacionPresupuestoFlujoCaja,this,true,"observacionPresupuestoFlujoCaja","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PresupuestoFlujoCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresupuestoFlujoCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoFlujoCaja,PresupuestoFlujoCajaConstantesFunciones.LABEL_IDANIO));

		if(this.presupuestoflujocajaConstantesFunciones.mostrarid_anioPresupuestoFlujoCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresupuestoFlujoCajaConstantesFunciones.LABEL_IDANIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new AnioTableCell(this.aniosForeignKey,this.presupuestoflujocajaConstantesFunciones.resaltarid_anioPresupuestoFlujoCaja,this,this.presupuestoflujocajaConstantesFunciones.activarid_anioPresupuestoFlujoCaja,iSizeTabla));
			tableColumn.setCellEditor(new AnioTableCell(this.aniosForeignKey,this.presupuestoflujocajaConstantesFunciones.resaltarid_anioPresupuestoFlujoCaja,this,this.presupuestoflujocajaConstantesFunciones.activarid_anioPresupuestoFlujoCaja,true,"id_anioPresupuestoFlujoCaja","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PresupuestoFlujoCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresupuestoFlujoCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoFlujoCaja,PresupuestoFlujoCajaConstantesFunciones.LABEL_IDMES));

		if(this.presupuestoflujocajaConstantesFunciones.mostrarid_mesPresupuestoFlujoCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresupuestoFlujoCajaConstantesFunciones.LABEL_IDMES,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new MesTableCell(this.messForeignKey,this.presupuestoflujocajaConstantesFunciones.resaltarid_mesPresupuestoFlujoCaja,this,this.presupuestoflujocajaConstantesFunciones.activarid_mesPresupuestoFlujoCaja,iSizeTabla));
			tableColumn.setCellEditor(new MesTableCell(this.messForeignKey,this.presupuestoflujocajaConstantesFunciones.resaltarid_mesPresupuestoFlujoCaja,this,this.presupuestoflujocajaConstantesFunciones.activarid_mesPresupuestoFlujoCaja,true,"id_mesPresupuestoFlujoCaja","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PresupuestoFlujoCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPresupuestoFlujoCaja.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPresupuestoFlujoCaja.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarPresupuestoFlujoCaja && this.isPermisoGuardarCambiosPresupuestoFlujoCaja) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosPresupuestoFlujoCaja.addColumn(tableColumn);
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
			
			this.jTableDatosPresupuestoFlujoCaja.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPresupuestoFlujoCaja && this.isPermisoGuardarCambiosPresupuestoFlujoCaja) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPresupuestoFlujoCaja && this.isPermisoGuardarCambiosPresupuestoFlujoCaja) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosPresupuestoFlujoCaja.moveColumn(this.jTableDatosPresupuestoFlujoCaja.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosPresupuestoFlujoCaja.moveColumn(this.jTableDatosPresupuestoFlujoCaja.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosPresupuestoFlujoCaja.moveColumn(this.jTableDatosPresupuestoFlujoCaja.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosPresupuestoFlujoCaja.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosPresupuestoFlujoCaja.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosPresupuestoFlujoCaja,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!PresupuestoFlujoCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosPresupuestoFlujoCaja.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosPresupuestoFlujoCaja.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!PresupuestoFlujoCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!PresupuestoFlujoCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosPresupuestoFlujoCaja.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosPresupuestoFlujoCaja.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosPresupuestoFlujoCaja.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=presupuestoflujocajaLogic.getPresupuestoFlujoCajas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=presupuestoflujocajas.size()-1;
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
		//this.jTableDatosPresupuestoFlujoCaja.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosPresupuestoFlujoCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosPresupuestoFlujoCaja();
			
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
				
				//this.isEsNuevoPresupuestoFlujoCaja=false;
					
				PresupuestoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.presupuestoflujocaja,new Object(),this.presupuestoflujocajaParameterGeneral,this.presupuestoflujocajaReturnGeneral);
			
				if(this.presupuestoflujocajaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPresupuestoFlujoCaja.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPresupuestoFlujoCaja.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoflujocaja =(PresupuestoFlujoCaja) this.presupuestoflujocajaLogic.getPresupuestoFlujoCajas().toArray()[this.jTableDatosPresupuestoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presupuestoflujocaja =(PresupuestoFlujoCaja) this.presupuestoflujocajas.toArray()[this.jTableDatosPresupuestoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.presupuestoflujocaja.getsType().equals("DUPLICADO")
				   || this.presupuestoflujocaja.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoPresupuestoFlujoCaja=true;
				
				} else {
					this.isEsNuevoPresupuestoFlujoCaja=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado()) {
					if(this.presupuestoflujocaja.getId()>=0 && !this.presupuestoflujocaja.getIsNew()) {						
						this.isEsNuevoPresupuestoFlujoCaja=false;
						
					} else {
						this.isEsNuevoPresupuestoFlujoCaja=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoPresupuestoFlujoCaja(esRelaciones);						
				
				this.seleccionarPresupuestoFlujoCaja(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.presupuestoflujocaja.getId()<0) {
					this.isEsNuevoPresupuestoFlujoCaja=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarPresupuestoFlujoCaja(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarPresupuestoFlujoCaja(evt,rowIndex);
				}	
				
				if(this.presupuestoflujocajaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion PresupuestoFlujoCaja: " + this.dDif); 
					}
				}								
				
				PresupuestoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.presupuestoflujocaja,new Object(),this.presupuestoflujocajaParameterGeneral,this.presupuestoflujocajaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarPresupuestoFlujoCaja(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.presupuestoflujocaja)) {
					if(this.presupuestoflujocaja.getId()>0) {
						this.presupuestoflujocaja.setIsDeleted(true);
						
						this.presupuestoflujocajasEliminados.add(this.presupuestoflujocaja);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.presupuestoflujocajaLogic.getPresupuestoFlujoCajas().remove(this.presupuestoflujocaja);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.presupuestoflujocajas.remove(this.presupuestoflujocaja);				
					}
					
					
					((PresupuestoFlujoCajaModel) this.jTableDatosPresupuestoFlujoCaja.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaPresupuestoFlujoCaja(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarPresupuestoFlujoCaja(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoPresupuestoFlujoCaja) {
			
			if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPresupuestoFlujoCaja.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPresupuestoFlujoCaja.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoflujocaja =(PresupuestoFlujoCaja) this.presupuestoflujocajaLogic.getPresupuestoFlujoCajas().toArray()[this.jTableDatosPresupuestoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presupuestoflujocaja =(PresupuestoFlujoCaja) this.presupuestoflujocajas.toArray()[this.jTableDatosPresupuestoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(PresupuestoFlujoCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioPresupuestoFlujoCaja(this.presupuestoflujocaja);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.presupuestoflujocajaConstantesFunciones.cargarid_empresaPresupuestoFlujoCaja || this.presupuestoflujocajaConstantesFunciones.event_dependid_empresaPresupuestoFlujoCaja) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.presupuestoflujocaja.getid_empresa());
									//this.inicializarActualizarBindingPresupuestoFlujoCaja(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(presupuestoflujocaja.getEmpresa()!=null) {
							this.empresasForeignKey.add(presupuestoflujocaja.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.presupuestoflujocaja.getid_empresa(),false,"Formulario");

					//CuentaContable
					if(!this.presupuestoflujocajaConstantesFunciones.cargarid_cuenta_contablePresupuestoFlujoCaja || this.presupuestoflujocajaConstantesFunciones.event_dependid_cuenta_contablePresupuestoFlujoCaja) {
						//this.cargarCombosCuentaContablesForeignKeyLista(" where id="+this.presupuestoflujocaja.getid_cuenta_contable());
									//this.inicializarActualizarBindingPresupuestoFlujoCaja(false,false);
						this.cuentacontablesForeignKey=new ArrayList<CuentaContable>();

						if(presupuestoflujocaja.getCuentaContable()!=null) {
							this.cuentacontablesForeignKey.add(presupuestoflujocaja.getCuentaContable());
						}

						this.addItemDefectoCombosForeignKeyCuentaContable();
						this.cargarCombosFrameCuentaContablesForeignKey("Todos");
					}
					this.setActualCuentaContableForeignKey(this.presupuestoflujocaja.getid_cuenta_contable(),false,"Formulario");

					//Ejercicio
					if(!this.presupuestoflujocajaConstantesFunciones.cargarid_ejercicioPresupuestoFlujoCaja || this.presupuestoflujocajaConstantesFunciones.event_dependid_ejercicioPresupuestoFlujoCaja) {
						//this.cargarCombosEjerciciosForeignKeyLista(" where id="+this.presupuestoflujocaja.getid_ejercicio());
									//this.inicializarActualizarBindingPresupuestoFlujoCaja(false,false);
						this.ejerciciosForeignKey=new ArrayList<Ejercicio>();

						if(presupuestoflujocaja.getEjercicio()!=null) {
							this.ejerciciosForeignKey.add(presupuestoflujocaja.getEjercicio());
						}

						this.addItemDefectoCombosForeignKeyEjercicio();
						this.cargarCombosFrameEjerciciosForeignKey("Todos");
					}
					this.setActualEjercicioForeignKey(this.presupuestoflujocaja.getid_ejercicio(),false,"Formulario");

					//Periodo
					if(!this.presupuestoflujocajaConstantesFunciones.cargarid_periodoPresupuestoFlujoCaja || this.presupuestoflujocajaConstantesFunciones.event_dependid_periodoPresupuestoFlujoCaja) {
						//this.cargarCombosPeriodosForeignKeyLista(" where id="+this.presupuestoflujocaja.getid_periodo());
									//this.inicializarActualizarBindingPresupuestoFlujoCaja(false,false);
						this.periodosForeignKey=new ArrayList<Periodo>();

						if(presupuestoflujocaja.getPeriodo()!=null) {
							this.periodosForeignKey.add(presupuestoflujocaja.getPeriodo());
						}

						this.addItemDefectoCombosForeignKeyPeriodo();
						this.cargarCombosFramePeriodosForeignKey("Todos");
					}
					this.setActualPeriodoForeignKey(this.presupuestoflujocaja.getid_periodo(),false,"Formulario");

					//CentroCosto
					if(!this.presupuestoflujocajaConstantesFunciones.cargarid_centro_costoPresupuestoFlujoCaja || this.presupuestoflujocajaConstantesFunciones.event_dependid_centro_costoPresupuestoFlujoCaja) {
						//this.cargarCombosCentroCostosForeignKeyLista(" where id="+this.presupuestoflujocaja.getid_centro_costo());
									//this.inicializarActualizarBindingPresupuestoFlujoCaja(false,false);
						this.centrocostosForeignKey=new ArrayList<CentroCosto>();

						if(presupuestoflujocaja.getCentroCosto()!=null) {
							this.centrocostosForeignKey.add(presupuestoflujocaja.getCentroCosto());
						}

						this.addItemDefectoCombosForeignKeyCentroCosto();
						this.cargarCombosFrameCentroCostosForeignKey("Todos");
					}
					this.setActualCentroCostoForeignKey(this.presupuestoflujocaja.getid_centro_costo(),false,"Formulario");

					//Anio
					if(!this.presupuestoflujocajaConstantesFunciones.cargarid_anioPresupuestoFlujoCaja || this.presupuestoflujocajaConstantesFunciones.event_dependid_anioPresupuestoFlujoCaja) {
						//this.cargarCombosAniosForeignKeyLista(" where id="+this.presupuestoflujocaja.getid_anio());
									//this.inicializarActualizarBindingPresupuestoFlujoCaja(false,false);
						this.aniosForeignKey=new ArrayList<Anio>();

						if(presupuestoflujocaja.getAnio()!=null) {
							this.aniosForeignKey.add(presupuestoflujocaja.getAnio());
						}

						this.addItemDefectoCombosForeignKeyAnio();
						this.cargarCombosFrameAniosForeignKey("Todos");
					}
					this.setActualAnioForeignKey(this.presupuestoflujocaja.getid_anio(),false,"Formulario");

					//Mes
					if(!this.presupuestoflujocajaConstantesFunciones.cargarid_mesPresupuestoFlujoCaja || this.presupuestoflujocajaConstantesFunciones.event_dependid_mesPresupuestoFlujoCaja) {
						//this.cargarCombosMessForeignKeyLista(" where id="+this.presupuestoflujocaja.getid_mes());
									//this.inicializarActualizarBindingPresupuestoFlujoCaja(false,false);
						this.messForeignKey=new ArrayList<Mes>();

						if(presupuestoflujocaja.getMes()!=null) {
							this.messForeignKey.add(presupuestoflujocaja.getMes());
						}

						this.addItemDefectoCombosForeignKeyMes();
						this.cargarCombosFrameMessForeignKey("Todos");
					}
					this.setActualMesForeignKey(this.presupuestoflujocaja.getid_mes(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesPresupuestoFlujoCaja("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesPresupuestoFlujoCaja(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPresupuestoFlujoCaja() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoPresupuestoFlujoCaja(PresupuestoFlujoCaja presupuestoflujocaja) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoPresupuestoFlujoCaja(presupuestoflujocaja,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoPresupuestoFlujoCaja(PresupuestoFlujoCaja presupuestoflujocaja,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioPresupuestoFlujoCaja(presupuestoflujocaja);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyPresupuestoFlujoCaja(presupuestoflujocaja,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyPresupuestoFlujoCaja(presupuestoflujocaja);
	}
	
	public void setVariablesObjetoActualToFormularioPresupuestoFlujoCaja(PresupuestoFlujoCaja presupuestoflujocaja) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jLabelidPresupuestoFlujoCaja.setText(presupuestoflujocaja.getId().toString());
			this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jTextFieldvalorPresupuestoFlujoCaja.setText(presupuestoflujocaja.getvalor().toString());
			this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jTextFieldvalor_efectivoPresupuestoFlujoCaja.setText(presupuestoflujocaja.getvalor_efectivo().toString());
			this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jTextFieldporcentajePresupuestoFlujoCaja.setText(presupuestoflujocaja.getporcentaje().toString());
			this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jDateChooserfecha_presupuestoPresupuestoFlujoCaja.setDate(presupuestoflujocaja.getfecha_presupuesto());
			this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jDateChooserfecha_procesoPresupuestoFlujoCaja.setDate(presupuestoflujocaja.getfecha_proceso());
			this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jTextAreaobservacionPresupuestoFlujoCaja.setText(presupuestoflujocaja.getobservacion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,PresupuestoFlujoCaja presupuestoflujocajaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,presupuestoflujocajaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,PresupuestoFlujoCaja presupuestoflujocajaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				presupuestoflujocajaLocal=this.presupuestoflujocaja;
			} else {
				presupuestoflujocajaLocal=this.presupuestoflujocajaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(presupuestoflujocajaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoPresupuestoFlujoCaja(presupuestoflujocajaLocal,true);
					
					if(presupuestoflujocajaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(presupuestoflujocajaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(presupuestoflujocajaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoPresupuestoFlujoCaja(PresupuestoFlujoCaja presupuestoflujocaja,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPresupuestoFlujoCaja(presupuestoflujocaja,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoFlujoCaja(presupuestoflujocaja);
	}
	
	public void setVariablesFormularioToObjetoActualPresupuestoFlujoCaja(PresupuestoFlujoCaja presupuestoflujocaja,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPresupuestoFlujoCaja(presupuestoflujocaja,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualPresupuestoFlujoCaja(PresupuestoFlujoCaja presupuestoflujocaja,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jLabelidPresupuestoFlujoCaja.getText()==null || this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jLabelidPresupuestoFlujoCaja.getText()=="" || this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jLabelidPresupuestoFlujoCaja.getText()=="Id") {
				this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jLabelidPresupuestoFlujoCaja.setText("0");
			}

			if(conColumnasBase) {presupuestoflujocaja.setId(Long.parseLong(this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jLabelidPresupuestoFlujoCaja.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PresupuestoFlujoCajaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jLabelIdPresupuestoFlujoCaja,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			presupuestoflujocaja.setvalor(Double.parseDouble(this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jTextFieldvalorPresupuestoFlujoCaja.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PresupuestoFlujoCajaConstantesFunciones.LABEL_VALOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jLabelvalorPresupuestoFlujoCaja,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			presupuestoflujocaja.setvalor_efectivo(Double.parseDouble(this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jTextFieldvalor_efectivoPresupuestoFlujoCaja.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PresupuestoFlujoCajaConstantesFunciones.LABEL_VALOREFECTIVO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jLabelvalor_efectivoPresupuestoFlujoCaja,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			presupuestoflujocaja.setporcentaje(Double.parseDouble(this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jTextFieldporcentajePresupuestoFlujoCaja.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PresupuestoFlujoCajaConstantesFunciones.LABEL_PORCENTAJE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jLabelporcentajePresupuestoFlujoCaja,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			presupuestoflujocaja.setfecha_presupuesto(this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jDateChooserfecha_presupuestoPresupuestoFlujoCaja.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PresupuestoFlujoCajaConstantesFunciones.LABEL_FECHAPRESUPUESTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jLabelfecha_presupuestoPresupuestoFlujoCaja,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			presupuestoflujocaja.setfecha_proceso(this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jDateChooserfecha_procesoPresupuestoFlujoCaja.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PresupuestoFlujoCajaConstantesFunciones.LABEL_FECHAPROCESO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jLabelfecha_procesoPresupuestoFlujoCaja,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			presupuestoflujocaja.setobservacion(this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jTextAreaobservacionPresupuestoFlujoCaja.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PresupuestoFlujoCajaConstantesFunciones.LABEL_OBSERVACION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jLabelobservacionPresupuestoFlujoCaja,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPresupuestoFlujoCaja(PresupuestoFlujoCaja presupuestoflujocajaBean,PresupuestoFlujoCaja presupuestoflujocaja,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosPresupuestoFlujoCaja(PresupuestoFlujoCaja presupuestoflujocajaOrigen,PresupuestoFlujoCaja presupuestoflujocaja,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && presupuestoflujocajaOrigen.getId()!=null && !presupuestoflujocajaOrigen.getId().equals(0L))) {presupuestoflujocaja.setId(presupuestoflujocajaOrigen.getId());}}
			if(conDefault || (!conDefault && presupuestoflujocajaOrigen.getvalor()!=null && !presupuestoflujocajaOrigen.getvalor().equals(0.0))) {presupuestoflujocaja.setvalor(presupuestoflujocajaOrigen.getvalor());}
			if(conDefault || (!conDefault && presupuestoflujocajaOrigen.getvalor_efectivo()!=null && !presupuestoflujocajaOrigen.getvalor_efectivo().equals(0.0))) {presupuestoflujocaja.setvalor_efectivo(presupuestoflujocajaOrigen.getvalor_efectivo());}
			if(conDefault || (!conDefault && presupuestoflujocajaOrigen.getporcentaje()!=null && !presupuestoflujocajaOrigen.getporcentaje().equals(0.0))) {presupuestoflujocaja.setporcentaje(presupuestoflujocajaOrigen.getporcentaje());}
			if(conDefault || (!conDefault && presupuestoflujocajaOrigen.getfecha_presupuesto()!=null && !presupuestoflujocajaOrigen.getfecha_presupuesto().equals(new Date()))) {presupuestoflujocaja.setfecha_presupuesto(presupuestoflujocajaOrigen.getfecha_presupuesto());}
			if(conDefault || (!conDefault && presupuestoflujocajaOrigen.getfecha_proceso()!=null && !presupuestoflujocajaOrigen.getfecha_proceso().equals(new Date()))) {presupuestoflujocaja.setfecha_proceso(presupuestoflujocajaOrigen.getfecha_proceso());}
			if(conDefault || (!conDefault && presupuestoflujocajaOrigen.getobservacion()!=null && !presupuestoflujocajaOrigen.getobservacion().equals(""))) {presupuestoflujocaja.setobservacion(presupuestoflujocajaOrigen.getobservacion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPresupuestoFlujoCaja(PresupuestoFlujoCaja presupuestoflujocaja) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jLabelidPresupuestoFlujoCaja.setText(presupuestoflujocaja.getId().toString());
			this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jTextFieldvalorPresupuestoFlujoCaja.setText(presupuestoflujocaja.getvalor().toString());
			this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jTextFieldvalor_efectivoPresupuestoFlujoCaja.setText(presupuestoflujocaja.getvalor_efectivo().toString());
			this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jTextFieldporcentajePresupuestoFlujoCaja.setText(presupuestoflujocaja.getporcentaje().toString());
			this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jDateChooserfecha_presupuestoPresupuestoFlujoCaja.setDate(presupuestoflujocaja.getfecha_presupuesto());
			this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jDateChooserfecha_procesoPresupuestoFlujoCaja.setDate(presupuestoflujocaja.getfecha_proceso());
			this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jTextAreaobservacionPresupuestoFlujoCaja.setText(presupuestoflujocaja.getobservacion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPresupuestoFlujoCaja(PresupuestoFlujoCajaBean presupuestoflujocajaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jLabelidPresupuestoFlujoCaja.setText(presupuestoflujocajaBean.getId().toString());
			this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jTextFieldvalorPresupuestoFlujoCaja.setText(presupuestoflujocajaBean.getvalor().toString());
			this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jTextFieldvalor_efectivoPresupuestoFlujoCaja.setText(presupuestoflujocajaBean.getvalor_efectivo().toString());
			this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jTextFieldporcentajePresupuestoFlujoCaja.setText(presupuestoflujocajaBean.getporcentaje().toString());
			this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jDateChooserfecha_presupuestoPresupuestoFlujoCaja.setDate(presupuestoflujocajaBean.getfecha_presupuesto());
			this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jDateChooserfecha_procesoPresupuestoFlujoCaja.setDate(presupuestoflujocajaBean.getfecha_proceso());
			this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jTextAreaobservacionPresupuestoFlujoCaja.setText(presupuestoflujocajaBean.getobservacion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanPresupuestoFlujoCaja(PresupuestoFlujoCajaParameterReturnGeneral presupuestoflujocajaReturnGeneral,PresupuestoFlujoCajaBean presupuestoflujocajaBean,Boolean conDefault) throws Exception { 
		try {
			PresupuestoFlujoCaja presupuestoflujocajaLocal=new PresupuestoFlujoCaja();
			
			presupuestoflujocajaLocal=presupuestoflujocajaReturnGeneral.getPresupuestoFlujoCaja();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && presupuestoflujocajaLocal.getId()!=null && !presupuestoflujocajaLocal.getId().equals(0L))) {presupuestoflujocajaBean.setId(presupuestoflujocajaLocal.getId());}}
			if(conDefault || (!conDefault && presupuestoflujocajaLocal.getvalor()!=null && !presupuestoflujocajaLocal.getvalor().equals(0.0))) {presupuestoflujocajaBean.setvalor(presupuestoflujocajaLocal.getvalor());}
			if(conDefault || (!conDefault && presupuestoflujocajaLocal.getvalor_efectivo()!=null && !presupuestoflujocajaLocal.getvalor_efectivo().equals(0.0))) {presupuestoflujocajaBean.setvalor_efectivo(presupuestoflujocajaLocal.getvalor_efectivo());}
			if(conDefault || (!conDefault && presupuestoflujocajaLocal.getporcentaje()!=null && !presupuestoflujocajaLocal.getporcentaje().equals(0.0))) {presupuestoflujocajaBean.setporcentaje(presupuestoflujocajaLocal.getporcentaje());}
			if(conDefault || (!conDefault && presupuestoflujocajaLocal.getfecha_presupuesto()!=null && !presupuestoflujocajaLocal.getfecha_presupuesto().equals(new Date()))) {presupuestoflujocajaBean.setfecha_presupuesto(presupuestoflujocajaLocal.getfecha_presupuesto());}
			if(conDefault || (!conDefault && presupuestoflujocajaLocal.getfecha_proceso()!=null && !presupuestoflujocajaLocal.getfecha_proceso().equals(new Date()))) {presupuestoflujocajaBean.setfecha_proceso(presupuestoflujocajaLocal.getfecha_proceso());}
			if(conDefault || (!conDefault && presupuestoflujocajaLocal.getobservacion()!=null && !presupuestoflujocajaLocal.getobservacion().equals(""))) {presupuestoflujocajaBean.setobservacion(presupuestoflujocajaLocal.getobservacion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxPresupuestoFlujoCajaGenerico(Long idPresupuestoFlujoCajaSeleccionado,JComboBox jComboBoxPresupuestoFlujoCaja,List<PresupuestoFlujoCaja> presupuestoflujocajasLocal)throws Exception {
		try {
			PresupuestoFlujoCaja  presupuestoflujocajaTemp=null;

			for(PresupuestoFlujoCaja presupuestoflujocajaAux:presupuestoflujocajasLocal) {
				if(presupuestoflujocajaAux.getId()!=null && presupuestoflujocajaAux.getId().equals(idPresupuestoFlujoCajaSeleccionado)) {
					presupuestoflujocajaTemp=presupuestoflujocajaAux;
					break;
				}
			}

			jComboBoxPresupuestoFlujoCaja.setSelectedItem(presupuestoflujocajaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxPresupuestoFlujoCajaGenerico(JComboBox jComboBoxPresupuestoFlujoCaja,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxPresupuestoFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPresupuestoFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxPresupuestoFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPresupuestoFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPresupuestoFlujoCaja.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxPresupuestoFlujoCaja.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPresupuestoFlujoCaja.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxPresupuestoFlujoCaja.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxPresupuestoFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxPresupuestoFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			presupuestoflujocaja=(PresupuestoFlujoCaja) presupuestoflujocajaLogic.getPresupuestoFlujoCajas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			presupuestoflujocaja =(PresupuestoFlujoCaja) presupuestoflujocajas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!presupuestoflujocaja.getIsNew() && !presupuestoflujocaja.getIsChanged() && !presupuestoflujocaja.getIsDeleted()) {
				sDescripcion=presupuestoflujocaja.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=presupuestoflujocaja.getempresa_descripcion();
			}
		}

		if(sTipo.equals("CuentaContable")) {
			//sDescripcion=this.getActualCuentaContableForeignKeyDescripcion((Long)value);
			if(!presupuestoflujocaja.getIsNew() && !presupuestoflujocaja.getIsChanged() && !presupuestoflujocaja.getIsDeleted()) {
				sDescripcion=presupuestoflujocaja.getcuentacontable_descripcion();
			} else {
				//sDescripcion=this.getActualCuentaContableForeignKeyDescripcion((Long)value);
				sDescripcion=presupuestoflujocaja.getcuentacontable_descripcion();
			}
		}

		if(sTipo.equals("Ejercicio")) {
			//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
			if(!presupuestoflujocaja.getIsNew() && !presupuestoflujocaja.getIsChanged() && !presupuestoflujocaja.getIsDeleted()) {
				sDescripcion=presupuestoflujocaja.getejercicio_descripcion();
			} else {
				//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
				sDescripcion=presupuestoflujocaja.getejercicio_descripcion();
			}
		}

		if(sTipo.equals("Periodo")) {
			//sDescripcion=this.getActualPeriodoForeignKeyDescripcion((Long)value);
			if(!presupuestoflujocaja.getIsNew() && !presupuestoflujocaja.getIsChanged() && !presupuestoflujocaja.getIsDeleted()) {
				sDescripcion=presupuestoflujocaja.getperiodo_descripcion();
			} else {
				//sDescripcion=this.getActualPeriodoForeignKeyDescripcion((Long)value);
				sDescripcion=presupuestoflujocaja.getperiodo_descripcion();
			}
		}

		if(sTipo.equals("CentroCosto")) {
			//sDescripcion=this.getActualCentroCostoForeignKeyDescripcion((Long)value);
			if(!presupuestoflujocaja.getIsNew() && !presupuestoflujocaja.getIsChanged() && !presupuestoflujocaja.getIsDeleted()) {
				sDescripcion=presupuestoflujocaja.getcentrocosto_descripcion();
			} else {
				//sDescripcion=this.getActualCentroCostoForeignKeyDescripcion((Long)value);
				sDescripcion=presupuestoflujocaja.getcentrocosto_descripcion();
			}
		}

		if(sTipo.equals("Anio")) {
			//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
			if(!presupuestoflujocaja.getIsNew() && !presupuestoflujocaja.getIsChanged() && !presupuestoflujocaja.getIsDeleted()) {
				sDescripcion=presupuestoflujocaja.getanio_descripcion();
			} else {
				//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
				sDescripcion=presupuestoflujocaja.getanio_descripcion();
			}
		}

		if(sTipo.equals("Mes")) {
			//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
			if(!presupuestoflujocaja.getIsNew() && !presupuestoflujocaja.getIsChanged() && !presupuestoflujocaja.getIsDeleted()) {
				sDescripcion=presupuestoflujocaja.getmes_descripcion();
			} else {
				//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
				sDescripcion=presupuestoflujocaja.getmes_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		PresupuestoFlujoCaja presupuestoflujocajaRow=new PresupuestoFlujoCaja();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			presupuestoflujocajaRow=(PresupuestoFlujoCaja) presupuestoflujocajaLogic.getPresupuestoFlujoCajas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			presupuestoflujocajaRow=(PresupuestoFlujoCaja) presupuestoflujocajas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualPresupuestoFlujoCaja(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoPresupuestoFlujoCaja.setVisible((this.isVisibilidadCeldaNuevoPresupuestoFlujoCaja && this.isPermisoNuevoPresupuestoFlujoCaja));			
			this.jButtonDuplicarPresupuestoFlujoCaja.setVisible((this.isVisibilidadCeldaDuplicarPresupuestoFlujoCaja && this.isPermisoDuplicarPresupuestoFlujoCaja));			
			this.jButtonCopiarPresupuestoFlujoCaja.setVisible((this.isVisibilidadCeldaCopiarPresupuestoFlujoCaja && this.isPermisoCopiarPresupuestoFlujoCaja));
			this.jButtonVerFormPresupuestoFlujoCaja.setVisible((this.isVisibilidadCeldaVerFormPresupuestoFlujoCaja && this.isPermisoVerFormPresupuestoFlujoCaja));
			
			this.jButtonAbrirOrderByPresupuestoFlujoCaja.setVisible((this.isVisibilidadCeldaOrdenPresupuestoFlujoCaja && this.isPermisoOrdenPresupuestoFlujoCaja));			
			
			this.jButtonNuevoRelacionesPresupuestoFlujoCaja.setVisible((this.isVisibilidadCeldaNuevoRelacionesPresupuestoFlujoCaja && this.isPermisoNuevoPresupuestoFlujoCaja));			
			this.jButtonNuevoGuardarCambiosPresupuestoFlujoCaja.setVisible((this.isVisibilidadCeldaNuevoPresupuestoFlujoCaja && this.isPermisoNuevoPresupuestoFlujoCaja && this.isPermisoGuardarCambiosPresupuestoFlujoCaja));
			
			if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) {
			this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonModificarPresupuestoFlujoCaja.setVisible((this.isVisibilidadCeldaModificarPresupuestoFlujoCaja && this.isPermisoActualizarPresupuestoFlujoCaja));	
			this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonActualizarPresupuestoFlujoCaja.setVisible((this.isVisibilidadCeldaActualizarPresupuestoFlujoCaja && this.isPermisoActualizarPresupuestoFlujoCaja));	
			this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonEliminarPresupuestoFlujoCaja.setVisible((this.isVisibilidadCeldaEliminarPresupuestoFlujoCaja && this.isPermisoEliminarPresupuestoFlujoCaja));
			this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonCancelarPresupuestoFlujoCaja.setVisible(this.isVisibilidadCeldaCancelarPresupuestoFlujoCaja);							
			this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonGuardarCambiosPresupuestoFlujoCaja.setVisible((this.isVisibilidadCeldaGuardarPresupuestoFlujoCaja && this.isPermisoGuardarCambiosPresupuestoFlujoCaja));			
			
			}
						
			this.jButtonGuardarCambiosTablaPresupuestoFlujoCaja.setVisible((this.isVisibilidadCeldaGuardarCambiosPresupuestoFlujoCaja && this.isPermisoGuardarCambiosPresupuestoFlujoCaja));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarPresupuestoFlujoCaja.setVisible((this.isVisibilidadCeldaNuevoPresupuestoFlujoCaja && this.isPermisoNuevoPresupuestoFlujoCaja));						
			this.jButtonDuplicarToolBarPresupuestoFlujoCaja.setVisible((this.isVisibilidadCeldaDuplicarPresupuestoFlujoCaja && this.isPermisoDuplicarPresupuestoFlujoCaja));						
			this.jButtonCopiarToolBarPresupuestoFlujoCaja.setVisible((this.isVisibilidadCeldaCopiarPresupuestoFlujoCaja && this.isPermisoCopiarPresupuestoFlujoCaja));			
			this.jButtonVerFormToolBarPresupuestoFlujoCaja.setVisible((this.isVisibilidadCeldaVerFormPresupuestoFlujoCaja && this.isPermisoVerFormPresupuestoFlujoCaja));			
			this.jButtonAbrirOrderByToolBarPresupuestoFlujoCaja.setVisible((this.isVisibilidadCeldaOrdenPresupuestoFlujoCaja && this.isPermisoOrdenPresupuestoFlujoCaja));
			this.jButtonNuevoRelacionesToolBarPresupuestoFlujoCaja.setVisible((this.isVisibilidadCeldaNuevoRelacionesPresupuestoFlujoCaja && this.isPermisoNuevoPresupuestoFlujoCaja));			
			this.jButtonNuevoGuardarCambiosToolBarPresupuestoFlujoCaja.setVisible((this.isVisibilidadCeldaNuevoPresupuestoFlujoCaja && this.isPermisoNuevoPresupuestoFlujoCaja && this.isPermisoGuardarCambiosPresupuestoFlujoCaja));			
			
			if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) {
			this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonModificarToolBarPresupuestoFlujoCaja.setVisible((this.isVisibilidadCeldaModificarPresupuestoFlujoCaja && this.isPermisoActualizarPresupuestoFlujoCaja));	
			this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonActualizarToolBarPresupuestoFlujoCaja.setVisible((this.isVisibilidadCeldaActualizarPresupuestoFlujoCaja  && this.isPermisoActualizarPresupuestoFlujoCaja));	
			this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonEliminarToolBarPresupuestoFlujoCaja.setVisible((this.isVisibilidadCeldaEliminarPresupuestoFlujoCaja && this.isPermisoEliminarPresupuestoFlujoCaja));
			this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonCancelarToolBarPresupuestoFlujoCaja.setVisible(this.isVisibilidadCeldaCancelarPresupuestoFlujoCaja);				
			this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonGuardarCambiosToolBarPresupuestoFlujoCaja.setVisible((this.isVisibilidadCeldaGuardarPresupuestoFlujoCaja && this.isPermisoGuardarCambiosPresupuestoFlujoCaja));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarPresupuestoFlujoCaja.setVisible((this.isVisibilidadCeldaGuardarCambiosPresupuestoFlujoCaja && this.isPermisoGuardarCambiosPresupuestoFlujoCaja));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoPresupuestoFlujoCaja.setVisible((this.isVisibilidadCeldaNuevoPresupuestoFlujoCaja && this.isPermisoNuevoPresupuestoFlujoCaja));			
			this.jMenuItemDuplicarPresupuestoFlujoCaja.setVisible((this.isVisibilidadCeldaDuplicarPresupuestoFlujoCaja && this.isPermisoDuplicarPresupuestoFlujoCaja));			
			this.jMenuItemCopiarPresupuestoFlujoCaja.setVisible((this.isVisibilidadCeldaCopiarPresupuestoFlujoCaja && this.isPermisoCopiarPresupuestoFlujoCaja));			
			this.jMenuItemVerFormPresupuestoFlujoCaja.setVisible((this.isVisibilidadCeldaVerFormPresupuestoFlujoCaja && this.isPermisoVerFormPresupuestoFlujoCaja));			
			this.jMenuItemAbrirOrderByPresupuestoFlujoCaja.setVisible((this.isVisibilidadCeldaOrdenPresupuestoFlujoCaja && this.isPermisoOrdenPresupuestoFlujoCaja));			
			//this.jMenuItemMostrarOcultarPresupuestoFlujoCaja.setVisible((this.isVisibilidadCeldaOrdenPresupuestoFlujoCaja && this.isPermisoOrdenPresupuestoFlujoCaja));
			this.jMenuItemDetalleAbrirOrderByPresupuestoFlujoCaja.setVisible((this.isVisibilidadCeldaOrdenPresupuestoFlujoCaja && this.isPermisoOrdenPresupuestoFlujoCaja));			
			//this.jMenuItemDetalleMostrarOcultarPresupuestoFlujoCaja.setVisible((this.isVisibilidadCeldaOrdenPresupuestoFlujoCaja && this.isPermisoOrdenPresupuestoFlujoCaja));			
			this.jMenuItemNuevoRelacionesPresupuestoFlujoCaja.setVisible((this.isVisibilidadCeldaNuevoRelacionesPresupuestoFlujoCaja && this.isPermisoNuevoPresupuestoFlujoCaja));			
			this.jMenuItemNuevoGuardarCambiosPresupuestoFlujoCaja.setVisible((this.isVisibilidadCeldaNuevoPresupuestoFlujoCaja && this.isPermisoNuevoPresupuestoFlujoCaja && this.isPermisoGuardarCambiosPresupuestoFlujoCaja));									
			
			if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) {
			this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jMenuItemModificarPresupuestoFlujoCaja.setVisible((this.isVisibilidadCeldaModificarPresupuestoFlujoCaja && this.isPermisoActualizarPresupuestoFlujoCaja));	
			this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jMenuItemActualizarPresupuestoFlujoCaja.setVisible((this.isVisibilidadCeldaActualizarPresupuestoFlujoCaja && this.isPermisoActualizarPresupuestoFlujoCaja));	
			this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jMenuItemEliminarPresupuestoFlujoCaja.setVisible((this.isVisibilidadCeldaEliminarPresupuestoFlujoCaja && this.isPermisoEliminarPresupuestoFlujoCaja));
			this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jMenuItemCancelarPresupuestoFlujoCaja.setVisible(this.isVisibilidadCeldaCancelarPresupuestoFlujoCaja);				
			}
			
			this.jMenuItemGuardarCambiosPresupuestoFlujoCaja.setVisible((this.isVisibilidadCeldaGuardarPresupuestoFlujoCaja && this.isPermisoGuardarCambiosPresupuestoFlujoCaja));						
			this.jMenuItemGuardarCambiosTablaPresupuestoFlujoCaja.setVisible((this.isVisibilidadCeldaGuardarCambiosPresupuestoFlujoCaja && this.isPermisoGuardarCambiosPresupuestoFlujoCaja));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoPresupuestoFlujoCaja=this.jButtonNuevoPresupuestoFlujoCaja.isVisible();
			this.isVisibilidadCeldaDuplicarPresupuestoFlujoCaja=this.jButtonDuplicarPresupuestoFlujoCaja.isVisible();
			this.isVisibilidadCeldaCopiarPresupuestoFlujoCaja=this.jButtonCopiarPresupuestoFlujoCaja.isVisible();
			this.isVisibilidadCeldaVerFormPresupuestoFlujoCaja=this.jButtonVerFormPresupuestoFlujoCaja.isVisible();
			
			this.isVisibilidadCeldaOrdenPresupuestoFlujoCaja=this.jButtonAbrirOrderByPresupuestoFlujoCaja.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesPresupuestoFlujoCaja=this.jButtonNuevoRelacionesPresupuestoFlujoCaja.isVisible();
			this.isVisibilidadCeldaModificarPresupuestoFlujoCaja=this.jButtonModificarPresupuestoFlujoCaja.isVisible();
			
			if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) {
			this.isVisibilidadCeldaActualizarPresupuestoFlujoCaja=this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonActualizarPresupuestoFlujoCaja.isVisible();
			this.isVisibilidadCeldaEliminarPresupuestoFlujoCaja=this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonEliminarPresupuestoFlujoCaja.isVisible();
			this.isVisibilidadCeldaCancelarPresupuestoFlujoCaja=this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonCancelarPresupuestoFlujoCaja.isVisible();
			this.isVisibilidadCeldaGuardarPresupuestoFlujoCaja=this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonGuardarCambiosPresupuestoFlujoCaja.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosPresupuestoFlujoCaja=this.jButtonGuardarCambiosTablaPresupuestoFlujoCaja.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoPresupuestoFlujoCaja=this.jButtonNuevoToolBarPresupuestoFlujoCaja.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPresupuestoFlujoCaja=this.jButtonNuevoRelacionesToolBarPresupuestoFlujoCaja.isVisible();
			
			if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) {
			this.isVisibilidadCeldaModificarPresupuestoFlujoCaja=this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonModificarToolBarPresupuestoFlujoCaja.isVisible();
			this.isVisibilidadCeldaActualizarPresupuestoFlujoCaja=this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonActualizarToolBarPresupuestoFlujoCaja.isVisible();
			this.isVisibilidadCeldaEliminarPresupuestoFlujoCaja=this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonEliminarToolBarPresupuestoFlujoCaja.isVisible();
			this.isVisibilidadCeldaCancelarPresupuestoFlujoCaja=this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonCancelarToolBarPresupuestoFlujoCaja.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPresupuestoFlujoCaja=this.jButtonGuardarCambiosToolBarPresupuestoFlujoCaja.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPresupuestoFlujoCaja=this.jButtonGuardarCambiosTablaToolBarPresupuestoFlujoCaja.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoPresupuestoFlujoCaja=this.jMenuItemNuevoPresupuestoFlujoCaja.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPresupuestoFlujoCaja=this.jMenuItemNuevoRelacionesPresupuestoFlujoCaja.isVisible();
			
			if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) {
			this.isVisibilidadCeldaModificarPresupuestoFlujoCaja=this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jMenuItemModificarPresupuestoFlujoCaja.isVisible();
			this.isVisibilidadCeldaActualizarPresupuestoFlujoCaja=this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jMenuItemActualizarPresupuestoFlujoCaja.isVisible();
			this.isVisibilidadCeldaEliminarPresupuestoFlujoCaja=this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jMenuItemEliminarPresupuestoFlujoCaja.isVisible();
			this.isVisibilidadCeldaCancelarPresupuestoFlujoCaja=this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jMenuItemCancelarPresupuestoFlujoCaja.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPresupuestoFlujoCaja=this.jMenuItemGuardarCambiosPresupuestoFlujoCaja.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPresupuestoFlujoCaja=this.jMenuItemGuardarCambiosTablaPresupuestoFlujoCaja.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesPresupuestoFlujoCaja(Boolean esInicializar) {
		if(PresupuestoFlujoCajaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.presupuestoflujocajaSessionBean.getConGuardarRelaciones()) {
				//if(this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesPresupuestoFlujoCaja();
			}
			
			this.inicializarActualizarBindingBotonesManualPresupuestoFlujoCaja(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualPresupuestoFlujoCaja() {
		this.jButtonNuevoPresupuestoFlujoCaja.setVisible(this.isPermisoNuevoPresupuestoFlujoCaja);			
		this.jButtonDuplicarPresupuestoFlujoCaja.setVisible(this.isPermisoDuplicarPresupuestoFlujoCaja);			
		this.jButtonCopiarPresupuestoFlujoCaja.setVisible(this.isPermisoCopiarPresupuestoFlujoCaja);			
		this.jButtonVerFormPresupuestoFlujoCaja.setVisible(this.isPermisoVerFormPresupuestoFlujoCaja);			
		
		this.jButtonAbrirOrderByPresupuestoFlujoCaja.setVisible(this.isPermisoOrdenPresupuestoFlujoCaja);					
		
		this.jButtonNuevoRelacionesPresupuestoFlujoCaja.setVisible(this.isPermisoNuevoPresupuestoFlujoCaja);			
		
		if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonModificarPresupuestoFlujoCaja.setVisible(this.isPermisoActualizarPresupuestoFlujoCaja);	
			this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonActualizarPresupuestoFlujoCaja.setVisible(this.isPermisoActualizarPresupuestoFlujoCaja);	
			this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonEliminarPresupuestoFlujoCaja.setVisible(this.isPermisoEliminarPresupuestoFlujoCaja);
			this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonCancelarPresupuestoFlujoCaja.setVisible(this.isVisibilidadCeldaCancelarPresupuestoFlujoCaja);						
			this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonGuardarCambiosPresupuestoFlujoCaja.setVisible(this.isPermisoGuardarCambiosPresupuestoFlujoCaja);							
		}
		
		this.jButtonGuardarCambiosTablaPresupuestoFlujoCaja.setVisible(this.isPermisoActualizarPresupuestoFlujoCaja);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetallePresupuestoFlujoCaja() {
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonModificarPresupuestoFlujoCaja.setVisible(this.isPermisoActualizarPresupuestoFlujoCaja);	
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonActualizarPresupuestoFlujoCaja.setVisible(this.isPermisoActualizarPresupuestoFlujoCaja);	
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonEliminarPresupuestoFlujoCaja.setVisible(this.isPermisoEliminarPresupuestoFlujoCaja);
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonCancelarPresupuestoFlujoCaja.setVisible(this.isVisibilidadCeldaCancelarPresupuestoFlujoCaja);							
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonGuardarCambiosPresupuestoFlujoCaja.setVisible((this.isVisibilidadCeldaGuardarPresupuestoFlujoCaja && this.isPermisoGuardarCambiosPresupuestoFlujoCaja));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosPresupuestoFlujoCaja() {
		if(PresupuestoFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualPresupuestoFlujoCaja();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesPresupuestoFlujoCaja() {
	}
	
	public void jTableDatosPresupuestoFlujoCajaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarPresupuestoFlujoCaja(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidPresupuestoFlujoCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoflujocajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestoFlujoCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresupuestoFlujoCaja(this.getpresupuestoflujocaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoFlujoCaja(this.presupuestoflujocaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestoflujocaja =(PresupuestoFlujoCaja) this.presupuestoflujocajaLogic.getPresupuestoFlujoCajas().toArray()[this.jTableDatosPresupuestoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presupuestoflujocaja =(PresupuestoFlujoCaja) this.presupuestoflujocajas.toArray()[this.jTableDatosPresupuestoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presupuestoflujocaja==null) {
						this.presupuestoflujocaja = new PresupuestoFlujoCaja();
					}

					this.setVariablesFormularioToObjetoActualPresupuestoFlujoCaja(this.presupuestoflujocaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoFlujoCaja(this.presupuestoflujocaja);
				}

				if(this.presupuestoflujocaja.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.presupuestoflujocaja.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresupuestoFlujoCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoflujocajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoflujocajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoflujocajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaPresupuestoFlujoCajaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocajaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebPresupuestoFlujoCaja(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestoFlujoCaja.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPresupuestoFlujoCaja.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPresupuestoFlujoCaja.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoflujocaja =(PresupuestoFlujoCaja) this.presupuestoflujocajaLogic.getPresupuestoFlujoCajas().toArray()[this.jTableDatosPresupuestoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.presupuestoflujocaja =(PresupuestoFlujoCaja) this.presupuestoflujocajas.toArray()[this.jTableDatosPresupuestoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPresupuestoFlujoCaja(this.getpresupuestoflujocaja(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoFlujoCaja(this.presupuestoflujocaja);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.presupuestoflujocajaLogic.getConnexion());

				if(this.presupuestoflujocaja.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.presupuestoflujocaja.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPresupuestoFlujoCaja=(TitledBorder)this.jScrollPanelDatosPresupuestoFlujoCaja.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderPresupuestoFlujoCaja.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocajaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocajaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaPresupuestoFlujoCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoflujocajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestoFlujoCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresupuestoFlujoCaja(this.getpresupuestoflujocaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoFlujoCaja(this.presupuestoflujocaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestoflujocaja =(PresupuestoFlujoCaja) this.presupuestoflujocajaLogic.getPresupuestoFlujoCajas().toArray()[this.jTableDatosPresupuestoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presupuestoflujocaja =(PresupuestoFlujoCaja) this.presupuestoflujocajas.toArray()[this.jTableDatosPresupuestoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presupuestoflujocaja==null) {
						this.presupuestoflujocaja = new PresupuestoFlujoCaja();
					}

					this.setVariablesFormularioToObjetoActualPresupuestoFlujoCaja(this.presupuestoflujocaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoFlujoCaja(this.presupuestoflujocaja);
				}

				if(this.presupuestoflujocaja.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.presupuestoflujocaja.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresupuestoFlujoCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoflujocajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoflujocajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoflujocajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_cuenta_contablePresupuestoFlujoCajaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderPresupuestoFlujoCaja=null;
			TitledBorder titledBordercuentacontable=null;

			if(!this.jScrollPanelDatosPresupuestoFlujoCaja.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderPresupuestoFlujoCaja=(TitledBorder)this.jScrollPanelDatosPresupuestoFlujoCaja.getBorder();
				titledBordercuentacontable=(TitledBorder)this.cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontable.setTitle(titledBorderPresupuestoFlujoCaja.getTitle() + " -> Cuenta Contable");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_cuenta_contablePresupuestoFlujoCajaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocajaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocuentacontable=true;

			idTienePermisocuentacontable=this.tienePermisosUsuarioEnPaginaWebPresupuestoFlujoCaja(CuentaContableConstantesFunciones.CLASSNAME);

			if(idTienePermisocuentacontable) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestoFlujoCaja.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPresupuestoFlujoCaja.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPresupuestoFlujoCaja.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoflujocaja =(PresupuestoFlujoCaja) this.presupuestoflujocajaLogic.getPresupuestoFlujoCajas().toArray()[this.jTableDatosPresupuestoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.presupuestoflujocaja =(PresupuestoFlujoCaja) this.presupuestoflujocajas.toArray()[this.jTableDatosPresupuestoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPresupuestoFlujoCaja(this.getpresupuestoflujocaja(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoFlujoCaja(this.presupuestoflujocaja);

				this.cuentacontableBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.cuentacontableBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.cuentacontableBeanSwingJInternalFrame.getCuentaContableLogic().setConnexion(this.presupuestoflujocajaLogic.getConnexion());

				if(this.presupuestoflujocaja.getid_cuenta_contable()!=null) {
					this.cuentacontableBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.cuentacontableBeanSwingJInternalFrame.setIdActual(this.presupuestoflujocaja.getid_cuenta_contable());
					this.cuentacontableBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.cuentacontableBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.cuentacontableBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuentaContable();
				}

				JInternalFrameBase jinternalFrame =this.cuentacontableBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPresupuestoFlujoCaja=(TitledBorder)this.jScrollPanelDatosPresupuestoFlujoCaja.getBorder();
				TitledBorder titledBordercuentacontable=(TitledBorder)this.cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontable.setTitle(titledBorderPresupuestoFlujoCaja.getTitle() + " -> Cuenta Contable");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocajaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocajaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_cuenta_contablePresupuestoFlujoCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoflujocajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestoFlujoCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresupuestoFlujoCaja(this.getpresupuestoflujocaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoFlujoCaja(this.presupuestoflujocaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestoflujocaja =(PresupuestoFlujoCaja) this.presupuestoflujocajaLogic.getPresupuestoFlujoCajas().toArray()[this.jTableDatosPresupuestoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presupuestoflujocaja =(PresupuestoFlujoCaja) this.presupuestoflujocajas.toArray()[this.jTableDatosPresupuestoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presupuestoflujocaja==null) {
						this.presupuestoflujocaja = new PresupuestoFlujoCaja();
					}

					this.setVariablesFormularioToObjetoActualPresupuestoFlujoCaja(this.presupuestoflujocaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoFlujoCaja(this.presupuestoflujocaja);
				}

				if(this.presupuestoflujocaja.getid_cuenta_contable()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cuenta_contable = "+this.presupuestoflujocaja.getid_cuenta_contable().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresupuestoFlujoCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoflujocajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoflujocajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoflujocajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ejercicioPresupuestoFlujoCajaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocajaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoejercicio=true;

			idTienePermisoejercicio=this.tienePermisosUsuarioEnPaginaWebPresupuestoFlujoCaja(EjercicioConstantesFunciones.CLASSNAME);

			if(idTienePermisoejercicio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestoFlujoCaja.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPresupuestoFlujoCaja.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPresupuestoFlujoCaja.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoflujocaja =(PresupuestoFlujoCaja) this.presupuestoflujocajaLogic.getPresupuestoFlujoCajas().toArray()[this.jTableDatosPresupuestoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.presupuestoflujocaja =(PresupuestoFlujoCaja) this.presupuestoflujocajas.toArray()[this.jTableDatosPresupuestoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPresupuestoFlujoCaja(this.getpresupuestoflujocaja(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoFlujoCaja(this.presupuestoflujocaja);

				this.ejercicioBeanSwingJInternalFrame=new EjercicioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ejercicioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ejercicioBeanSwingJInternalFrame.getEjercicioLogic().setConnexion(this.presupuestoflujocajaLogic.getConnexion());

				if(this.presupuestoflujocaja.getid_ejercicio()!=null) {
					this.ejercicioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ejercicioBeanSwingJInternalFrame.setIdActual(this.presupuestoflujocaja.getid_ejercicio());
					this.ejercicioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.inicializarActualizarBindingTablaEjercicio();
				}

				JInternalFrameBase jinternalFrame =this.ejercicioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPresupuestoFlujoCaja=(TitledBorder)this.jScrollPanelDatosPresupuestoFlujoCaja.getBorder();
				TitledBorder titledBorderejercicio=(TitledBorder)this.ejercicioBeanSwingJInternalFrame.jScrollPanelDatosEjercicio.getBorder();

				titledBorderejercicio.setTitle(titledBorderPresupuestoFlujoCaja.getTitle() + " -> Ejercicio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocajaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocajaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ejercicioPresupuestoFlujoCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoflujocajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestoFlujoCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresupuestoFlujoCaja(this.getpresupuestoflujocaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoFlujoCaja(this.presupuestoflujocaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestoflujocaja =(PresupuestoFlujoCaja) this.presupuestoflujocajaLogic.getPresupuestoFlujoCajas().toArray()[this.jTableDatosPresupuestoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presupuestoflujocaja =(PresupuestoFlujoCaja) this.presupuestoflujocajas.toArray()[this.jTableDatosPresupuestoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presupuestoflujocaja==null) {
						this.presupuestoflujocaja = new PresupuestoFlujoCaja();
					}

					this.setVariablesFormularioToObjetoActualPresupuestoFlujoCaja(this.presupuestoflujocaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoFlujoCaja(this.presupuestoflujocaja);
				}

				if(this.presupuestoflujocaja.getid_ejercicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ejercicio = "+this.presupuestoflujocaja.getid_ejercicio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresupuestoFlujoCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoflujocajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoflujocajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoflujocajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_periodoPresupuestoFlujoCajaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocajaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoperiodo=true;

			idTienePermisoperiodo=this.tienePermisosUsuarioEnPaginaWebPresupuestoFlujoCaja(PeriodoConstantesFunciones.CLASSNAME);

			if(idTienePermisoperiodo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestoFlujoCaja.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPresupuestoFlujoCaja.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPresupuestoFlujoCaja.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoflujocaja =(PresupuestoFlujoCaja) this.presupuestoflujocajaLogic.getPresupuestoFlujoCajas().toArray()[this.jTableDatosPresupuestoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.presupuestoflujocaja =(PresupuestoFlujoCaja) this.presupuestoflujocajas.toArray()[this.jTableDatosPresupuestoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPresupuestoFlujoCaja(this.getpresupuestoflujocaja(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoFlujoCaja(this.presupuestoflujocaja);

				this.periodoBeanSwingJInternalFrame=new PeriodoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.periodoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.periodoBeanSwingJInternalFrame.getPeriodoLogic().setConnexion(this.presupuestoflujocajaLogic.getConnexion());

				if(this.presupuestoflujocaja.getid_periodo()!=null) {
					this.periodoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.periodoBeanSwingJInternalFrame.setIdActual(this.presupuestoflujocaja.getid_periodo());
					this.periodoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.inicializarActualizarBindingTablaPeriodo();
				}

				JInternalFrameBase jinternalFrame =this.periodoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPresupuestoFlujoCaja=(TitledBorder)this.jScrollPanelDatosPresupuestoFlujoCaja.getBorder();
				TitledBorder titledBorderperiodo=(TitledBorder)this.periodoBeanSwingJInternalFrame.jScrollPanelDatosPeriodo.getBorder();

				titledBorderperiodo.setTitle(titledBorderPresupuestoFlujoCaja.getTitle() + " -> Periodo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocajaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocajaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_periodoPresupuestoFlujoCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoflujocajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestoFlujoCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresupuestoFlujoCaja(this.getpresupuestoflujocaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoFlujoCaja(this.presupuestoflujocaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestoflujocaja =(PresupuestoFlujoCaja) this.presupuestoflujocajaLogic.getPresupuestoFlujoCajas().toArray()[this.jTableDatosPresupuestoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presupuestoflujocaja =(PresupuestoFlujoCaja) this.presupuestoflujocajas.toArray()[this.jTableDatosPresupuestoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presupuestoflujocaja==null) {
						this.presupuestoflujocaja = new PresupuestoFlujoCaja();
					}

					this.setVariablesFormularioToObjetoActualPresupuestoFlujoCaja(this.presupuestoflujocaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoFlujoCaja(this.presupuestoflujocaja);
				}

				if(this.presupuestoflujocaja.getid_periodo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_periodo = "+this.presupuestoflujocaja.getid_periodo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresupuestoFlujoCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoflujocajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoflujocajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoflujocajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_centro_costoPresupuestoFlujoCajaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocajaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocentrocosto=true;

			idTienePermisocentrocosto=this.tienePermisosUsuarioEnPaginaWebPresupuestoFlujoCaja(CentroCostoConstantesFunciones.CLASSNAME);

			if(idTienePermisocentrocosto) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestoFlujoCaja.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPresupuestoFlujoCaja.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPresupuestoFlujoCaja.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoflujocaja =(PresupuestoFlujoCaja) this.presupuestoflujocajaLogic.getPresupuestoFlujoCajas().toArray()[this.jTableDatosPresupuestoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.presupuestoflujocaja =(PresupuestoFlujoCaja) this.presupuestoflujocajas.toArray()[this.jTableDatosPresupuestoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPresupuestoFlujoCaja(this.getpresupuestoflujocaja(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoFlujoCaja(this.presupuestoflujocaja);

				this.centrocostoBeanSwingJInternalFrame=new CentroCostoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.centrocostoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.centrocostoBeanSwingJInternalFrame.getCentroCostoLogic().setConnexion(this.presupuestoflujocajaLogic.getConnexion());

				if(this.presupuestoflujocaja.getid_centro_costo()!=null) {
					this.centrocostoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.centrocostoBeanSwingJInternalFrame.setIdActual(this.presupuestoflujocaja.getid_centro_costo());
					this.centrocostoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.centrocostoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.centrocostoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCentroCosto();
				}

				JInternalFrameBase jinternalFrame =this.centrocostoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPresupuestoFlujoCaja=(TitledBorder)this.jScrollPanelDatosPresupuestoFlujoCaja.getBorder();
				TitledBorder titledBordercentrocosto=(TitledBorder)this.centrocostoBeanSwingJInternalFrame.jScrollPanelDatosCentroCosto.getBorder();

				titledBordercentrocosto.setTitle(titledBorderPresupuestoFlujoCaja.getTitle() + " -> Centro Costo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocajaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocajaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_centro_costoPresupuestoFlujoCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoflujocajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestoFlujoCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresupuestoFlujoCaja(this.getpresupuestoflujocaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoFlujoCaja(this.presupuestoflujocaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestoflujocaja =(PresupuestoFlujoCaja) this.presupuestoflujocajaLogic.getPresupuestoFlujoCajas().toArray()[this.jTableDatosPresupuestoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presupuestoflujocaja =(PresupuestoFlujoCaja) this.presupuestoflujocajas.toArray()[this.jTableDatosPresupuestoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presupuestoflujocaja==null) {
						this.presupuestoflujocaja = new PresupuestoFlujoCaja();
					}

					this.setVariablesFormularioToObjetoActualPresupuestoFlujoCaja(this.presupuestoflujocaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoFlujoCaja(this.presupuestoflujocaja);
				}

				if(this.presupuestoflujocaja.getid_centro_costo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_centro_costo = "+this.presupuestoflujocaja.getid_centro_costo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresupuestoFlujoCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoflujocajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoflujocajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoflujocajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalorPresupuestoFlujoCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoflujocajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestoFlujoCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresupuestoFlujoCaja(this.getpresupuestoflujocaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoFlujoCaja(this.presupuestoflujocaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestoflujocaja =(PresupuestoFlujoCaja) this.presupuestoflujocajaLogic.getPresupuestoFlujoCajas().toArray()[this.jTableDatosPresupuestoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presupuestoflujocaja =(PresupuestoFlujoCaja) this.presupuestoflujocajas.toArray()[this.jTableDatosPresupuestoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presupuestoflujocaja==null) {
						this.presupuestoflujocaja = new PresupuestoFlujoCaja();
					}

					this.setVariablesFormularioToObjetoActualPresupuestoFlujoCaja(this.presupuestoflujocaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoFlujoCaja(this.presupuestoflujocaja);
				}

				if(this.presupuestoflujocaja.getvalor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor = "+this.presupuestoflujocaja.getvalor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresupuestoFlujoCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoflujocajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoflujocajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoflujocajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor_efectivoPresupuestoFlujoCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoflujocajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestoFlujoCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresupuestoFlujoCaja(this.getpresupuestoflujocaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoFlujoCaja(this.presupuestoflujocaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestoflujocaja =(PresupuestoFlujoCaja) this.presupuestoflujocajaLogic.getPresupuestoFlujoCajas().toArray()[this.jTableDatosPresupuestoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presupuestoflujocaja =(PresupuestoFlujoCaja) this.presupuestoflujocajas.toArray()[this.jTableDatosPresupuestoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presupuestoflujocaja==null) {
						this.presupuestoflujocaja = new PresupuestoFlujoCaja();
					}

					this.setVariablesFormularioToObjetoActualPresupuestoFlujoCaja(this.presupuestoflujocaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoFlujoCaja(this.presupuestoflujocaja);
				}

				if(this.presupuestoflujocaja.getvalor_efectivo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor_efectivo = "+this.presupuestoflujocaja.getvalor_efectivo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresupuestoFlujoCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoflujocajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoflujocajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoflujocajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonporcentajePresupuestoFlujoCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoflujocajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestoFlujoCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresupuestoFlujoCaja(this.getpresupuestoflujocaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoFlujoCaja(this.presupuestoflujocaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestoflujocaja =(PresupuestoFlujoCaja) this.presupuestoflujocajaLogic.getPresupuestoFlujoCajas().toArray()[this.jTableDatosPresupuestoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presupuestoflujocaja =(PresupuestoFlujoCaja) this.presupuestoflujocajas.toArray()[this.jTableDatosPresupuestoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presupuestoflujocaja==null) {
						this.presupuestoflujocaja = new PresupuestoFlujoCaja();
					}

					this.setVariablesFormularioToObjetoActualPresupuestoFlujoCaja(this.presupuestoflujocaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoFlujoCaja(this.presupuestoflujocaja);
				}

				if(this.presupuestoflujocaja.getporcentaje()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where porcentaje = "+this.presupuestoflujocaja.getporcentaje().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresupuestoFlujoCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoflujocajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoflujocajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoflujocajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_presupuestoPresupuestoFlujoCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoflujocajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestoFlujoCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresupuestoFlujoCaja(this.getpresupuestoflujocaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoFlujoCaja(this.presupuestoflujocaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestoflujocaja =(PresupuestoFlujoCaja) this.presupuestoflujocajaLogic.getPresupuestoFlujoCajas().toArray()[this.jTableDatosPresupuestoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presupuestoflujocaja =(PresupuestoFlujoCaja) this.presupuestoflujocajas.toArray()[this.jTableDatosPresupuestoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presupuestoflujocaja==null) {
						this.presupuestoflujocaja = new PresupuestoFlujoCaja();
					}

					this.setVariablesFormularioToObjetoActualPresupuestoFlujoCaja(this.presupuestoflujocaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoFlujoCaja(this.presupuestoflujocaja);
				}

				if(this.presupuestoflujocaja.getfecha_presupuesto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_presupuesto = '"+Funciones2.getStringPostgresDate(this.presupuestoflujocaja.getfecha_presupuesto())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresupuestoFlujoCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoflujocajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoflujocajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoflujocajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_procesoPresupuestoFlujoCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoflujocajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestoFlujoCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresupuestoFlujoCaja(this.getpresupuestoflujocaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoFlujoCaja(this.presupuestoflujocaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestoflujocaja =(PresupuestoFlujoCaja) this.presupuestoflujocajaLogic.getPresupuestoFlujoCajas().toArray()[this.jTableDatosPresupuestoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presupuestoflujocaja =(PresupuestoFlujoCaja) this.presupuestoflujocajas.toArray()[this.jTableDatosPresupuestoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presupuestoflujocaja==null) {
						this.presupuestoflujocaja = new PresupuestoFlujoCaja();
					}

					this.setVariablesFormularioToObjetoActualPresupuestoFlujoCaja(this.presupuestoflujocaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoFlujoCaja(this.presupuestoflujocaja);
				}

				if(this.presupuestoflujocaja.getfecha_proceso()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_proceso = '"+Funciones2.getStringPostgresDate(this.presupuestoflujocaja.getfecha_proceso())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresupuestoFlujoCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoflujocajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoflujocajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoflujocajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonobservacionPresupuestoFlujoCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoflujocajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestoFlujoCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresupuestoFlujoCaja(this.getpresupuestoflujocaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoFlujoCaja(this.presupuestoflujocaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestoflujocaja =(PresupuestoFlujoCaja) this.presupuestoflujocajaLogic.getPresupuestoFlujoCajas().toArray()[this.jTableDatosPresupuestoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presupuestoflujocaja =(PresupuestoFlujoCaja) this.presupuestoflujocajas.toArray()[this.jTableDatosPresupuestoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presupuestoflujocaja==null) {
						this.presupuestoflujocaja = new PresupuestoFlujoCaja();
					}

					this.setVariablesFormularioToObjetoActualPresupuestoFlujoCaja(this.presupuestoflujocaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoFlujoCaja(this.presupuestoflujocaja);
				}

				if(this.presupuestoflujocaja.getobservacion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where observacion like '%"+this.presupuestoflujocaja.getobservacion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresupuestoFlujoCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoflujocajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoflujocajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoflujocajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_anioPresupuestoFlujoCajaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocajaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoanio=true;

			idTienePermisoanio=this.tienePermisosUsuarioEnPaginaWebPresupuestoFlujoCaja(AnioConstantesFunciones.CLASSNAME);

			if(idTienePermisoanio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestoFlujoCaja.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPresupuestoFlujoCaja.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPresupuestoFlujoCaja.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoflujocaja =(PresupuestoFlujoCaja) this.presupuestoflujocajaLogic.getPresupuestoFlujoCajas().toArray()[this.jTableDatosPresupuestoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.presupuestoflujocaja =(PresupuestoFlujoCaja) this.presupuestoflujocajas.toArray()[this.jTableDatosPresupuestoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPresupuestoFlujoCaja(this.getpresupuestoflujocaja(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoFlujoCaja(this.presupuestoflujocaja);

				this.anioBeanSwingJInternalFrame=new AnioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.anioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.anioBeanSwingJInternalFrame.getAnioLogic().setConnexion(this.presupuestoflujocajaLogic.getConnexion());

				if(this.presupuestoflujocaja.getid_anio()!=null) {
					this.anioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.anioBeanSwingJInternalFrame.setIdActual(this.presupuestoflujocaja.getid_anio());
					this.anioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.inicializarActualizarBindingTablaAnio();
				}

				JInternalFrameBase jinternalFrame =this.anioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPresupuestoFlujoCaja=(TitledBorder)this.jScrollPanelDatosPresupuestoFlujoCaja.getBorder();
				TitledBorder titledBorderanio=(TitledBorder)this.anioBeanSwingJInternalFrame.jScrollPanelDatosAnio.getBorder();

				titledBorderanio.setTitle(titledBorderPresupuestoFlujoCaja.getTitle() + " -> Anio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocajaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocajaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_anioPresupuestoFlujoCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoflujocajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestoFlujoCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresupuestoFlujoCaja(this.getpresupuestoflujocaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoFlujoCaja(this.presupuestoflujocaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestoflujocaja =(PresupuestoFlujoCaja) this.presupuestoflujocajaLogic.getPresupuestoFlujoCajas().toArray()[this.jTableDatosPresupuestoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presupuestoflujocaja =(PresupuestoFlujoCaja) this.presupuestoflujocajas.toArray()[this.jTableDatosPresupuestoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presupuestoflujocaja==null) {
						this.presupuestoflujocaja = new PresupuestoFlujoCaja();
					}

					this.setVariablesFormularioToObjetoActualPresupuestoFlujoCaja(this.presupuestoflujocaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoFlujoCaja(this.presupuestoflujocaja);
				}

				if(this.presupuestoflujocaja.getid_anio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_anio = "+this.presupuestoflujocaja.getid_anio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresupuestoFlujoCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoflujocajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoflujocajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoflujocajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_mesPresupuestoFlujoCajaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocajaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisomes=true;

			idTienePermisomes=this.tienePermisosUsuarioEnPaginaWebPresupuestoFlujoCaja(MesConstantesFunciones.CLASSNAME);

			if(idTienePermisomes) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestoFlujoCaja.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPresupuestoFlujoCaja.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPresupuestoFlujoCaja.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoflujocaja =(PresupuestoFlujoCaja) this.presupuestoflujocajaLogic.getPresupuestoFlujoCajas().toArray()[this.jTableDatosPresupuestoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.presupuestoflujocaja =(PresupuestoFlujoCaja) this.presupuestoflujocajas.toArray()[this.jTableDatosPresupuestoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPresupuestoFlujoCaja(this.getpresupuestoflujocaja(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoFlujoCaja(this.presupuestoflujocaja);

				this.mesBeanSwingJInternalFrame=new MesBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.mesBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.mesBeanSwingJInternalFrame.getMesLogic().setConnexion(this.presupuestoflujocajaLogic.getConnexion());

				if(this.presupuestoflujocaja.getid_mes()!=null) {
					this.mesBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.mesBeanSwingJInternalFrame.setIdActual(this.presupuestoflujocaja.getid_mes());
					this.mesBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.inicializarActualizarBindingTablaMes();
				}

				JInternalFrameBase jinternalFrame =this.mesBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPresupuestoFlujoCaja=(TitledBorder)this.jScrollPanelDatosPresupuestoFlujoCaja.getBorder();
				TitledBorder titledBordermes=(TitledBorder)this.mesBeanSwingJInternalFrame.jScrollPanelDatosMes.getBorder();

				titledBordermes.setTitle(titledBorderPresupuestoFlujoCaja.getTitle() + " -> Mes");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocajaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocajaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_mesPresupuestoFlujoCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoflujocajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresupuestoFlujoCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresupuestoFlujoCaja(this.getpresupuestoflujocaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoFlujoCaja(this.presupuestoflujocaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestoflujocaja =(PresupuestoFlujoCaja) this.presupuestoflujocajaLogic.getPresupuestoFlujoCajas().toArray()[this.jTableDatosPresupuestoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presupuestoflujocaja =(PresupuestoFlujoCaja) this.presupuestoflujocajas.toArray()[this.jTableDatosPresupuestoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presupuestoflujocaja==null) {
						this.presupuestoflujocaja = new PresupuestoFlujoCaja();
					}

					this.setVariablesFormularioToObjetoActualPresupuestoFlujoCaja(this.presupuestoflujocaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoFlujoCaja(this.presupuestoflujocaja);
				}

				if(this.presupuestoflujocaja.getid_mes()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_mes = "+this.presupuestoflujocaja.getid_mes().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresupuestoFlujoCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoflujocajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoflujocajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoflujocajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdAnioPresupuestoFlujoCajaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocajaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPresupuestoFlujoCaja(false,false);

			this.getPresupuestoFlujoCajasFK_IdAnio();

			this.inicializarActualizarBindingPresupuestoFlujoCaja(false);

			//if(PresupuestoFlujoCajaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPresupuestoFlujoCaja(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocajaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocajaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdCentroCostoPresupuestoFlujoCajaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocajaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPresupuestoFlujoCaja(false,false);

			this.getPresupuestoFlujoCajasFK_IdCentroCosto();

			this.inicializarActualizarBindingPresupuestoFlujoCaja(false);

			//if(PresupuestoFlujoCajaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPresupuestoFlujoCaja(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocajaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocajaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdCuentaContablePresupuestoFlujoCajaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocajaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPresupuestoFlujoCaja(false,false);

			this.getPresupuestoFlujoCajasFK_IdCuentaContable();

			this.inicializarActualizarBindingPresupuestoFlujoCaja(false);

			//if(PresupuestoFlujoCajaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPresupuestoFlujoCaja(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocajaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocajaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEjercicioPresupuestoFlujoCajaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocajaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPresupuestoFlujoCaja(false,false);

			this.getPresupuestoFlujoCajasFK_IdEjercicio();

			this.inicializarActualizarBindingPresupuestoFlujoCaja(false);

			//if(PresupuestoFlujoCajaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPresupuestoFlujoCaja(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocajaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocajaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaPresupuestoFlujoCajaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocajaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPresupuestoFlujoCaja(false,false);

			this.getPresupuestoFlujoCajasFK_IdEmpresa();

			this.inicializarActualizarBindingPresupuestoFlujoCaja(false);

			//if(PresupuestoFlujoCajaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPresupuestoFlujoCaja(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocajaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocajaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdMesPresupuestoFlujoCajaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocajaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPresupuestoFlujoCaja(false,false);

			this.getPresupuestoFlujoCajasFK_IdMes();

			this.inicializarActualizarBindingPresupuestoFlujoCaja(false);

			//if(PresupuestoFlujoCajaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPresupuestoFlujoCaja(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocajaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocajaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPeriodoPresupuestoFlujoCajaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocajaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPresupuestoFlujoCaja(false,false);

			this.getPresupuestoFlujoCajasFK_IdPeriodo();

			this.inicializarActualizarBindingPresupuestoFlujoCaja(false);

			//if(PresupuestoFlujoCajaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPresupuestoFlujoCaja(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocajaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presupuestoflujocajaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFramePresupuestoFlujoCaja() {
		if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) {
			this.jInternalFrameDetalleFormPresupuestoFlujoCaja.setVisible(false);	    			
			this.jInternalFrameDetalleFormPresupuestoFlujoCaja.dispose();
			this.jInternalFrameDetalleFormPresupuestoFlujoCaja=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoPresupuestoFlujoCaja!=null) {
			this.jInternalFrameReporteDinamicoPresupuestoFlujoCaja.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoPresupuestoFlujoCaja.dispose();
			this.jInternalFrameReporteDinamicoPresupuestoFlujoCaja=null;
		}
		
		if(this.jInternalFrameImportacionPresupuestoFlujoCaja!=null) {
			this.jInternalFrameImportacionPresupuestoFlujoCaja.setVisible(false);	    			
			this.jInternalFrameImportacionPresupuestoFlujoCaja.dispose();
			this.jInternalFrameImportacionPresupuestoFlujoCaja=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessPresupuestoFlujoCaja();
			
			PresupuestoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presupuestoflujocaja,new Object(),this.presupuestoflujocajaParameterGeneral,this.presupuestoflujocajaReturnGeneral);
			
			
			if(sTipo.equals("NuevoPresupuestoFlujoCaja")) {
				jButtonNuevoPresupuestoFlujoCajaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarPresupuestoFlujoCaja")) {
				jButtonDuplicarPresupuestoFlujoCajaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarPresupuestoFlujoCaja")) {
				jButtonCopiarPresupuestoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("VerFormPresupuestoFlujoCaja")) {
				jButtonVerFormPresupuestoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarPresupuestoFlujoCaja")) {
				jButtonNuevoPresupuestoFlujoCajaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarPresupuestoFlujoCaja")) {
				jButtonDuplicarPresupuestoFlujoCajaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoPresupuestoFlujoCaja")) {
				jButtonNuevoPresupuestoFlujoCajaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarPresupuestoFlujoCaja")) {
				jButtonDuplicarPresupuestoFlujoCajaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesPresupuestoFlujoCaja")) {
				jButtonNuevoPresupuestoFlujoCajaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarPresupuestoFlujoCaja")) {
				jButtonNuevoPresupuestoFlujoCajaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesPresupuestoFlujoCaja")) {
				jButtonNuevoPresupuestoFlujoCajaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarPresupuestoFlujoCaja")) {
				jButtonModificarPresupuestoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarPresupuestoFlujoCaja")) {
				jButtonModificarPresupuestoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarPresupuestoFlujoCaja")) {
				jButtonModificarPresupuestoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarPresupuestoFlujoCaja")) {
				jButtonActualizarPresupuestoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarPresupuestoFlujoCaja")) {
				jButtonActualizarPresupuestoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarPresupuestoFlujoCaja")) {
				jButtonActualizarPresupuestoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("EliminarPresupuestoFlujoCaja")) {
				jButtonEliminarPresupuestoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarPresupuestoFlujoCaja")) {
				jButtonEliminarPresupuestoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarPresupuestoFlujoCaja")) {
				jButtonEliminarPresupuestoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("CancelarPresupuestoFlujoCaja")) {
				jButtonCancelarPresupuestoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarPresupuestoFlujoCaja")) {
				jButtonCancelarPresupuestoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarPresupuestoFlujoCaja")) {
				jButtonCancelarPresupuestoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("CerrarPresupuestoFlujoCaja")) {
				jButtonCerrarPresupuestoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarPresupuestoFlujoCaja")) {
				jButtonCerrarPresupuestoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarPresupuestoFlujoCaja")) {
				jButtonCerrarPresupuestoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarPresupuestoFlujoCaja")) {
				jButtonMostrarOcultarPresupuestoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarPresupuestoFlujoCaja")) {
				jButtonCancelarPresupuestoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosPresupuestoFlujoCaja")) {
				jButtonGuardarCambiosPresupuestoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarPresupuestoFlujoCaja")) {
				jButtonGuardarCambiosPresupuestoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarPresupuestoFlujoCaja")) {
				jButtonCopiarPresupuestoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarPresupuestoFlujoCaja")) {
				jButtonVerFormPresupuestoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosPresupuestoFlujoCaja")) {
				jButtonGuardarCambiosPresupuestoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarPresupuestoFlujoCaja")) {
				jButtonCopiarPresupuestoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormPresupuestoFlujoCaja")) {
				jButtonVerFormPresupuestoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaPresupuestoFlujoCaja")) {
				jButtonGuardarCambiosPresupuestoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarPresupuestoFlujoCaja")) {
				jButtonGuardarCambiosPresupuestoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaPresupuestoFlujoCaja")) {
				jButtonGuardarCambiosPresupuestoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionPresupuestoFlujoCaja")) {
				jButtonRecargarInformacionPresupuestoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarPresupuestoFlujoCaja")) {
				jButtonRecargarInformacionPresupuestoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionPresupuestoFlujoCaja")) {
				jButtonRecargarInformacionPresupuestoFlujoCajaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresPresupuestoFlujoCaja")) {
				jButtonAnterioresPresupuestoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarPresupuestoFlujoCaja")) {
				jButtonAnterioresPresupuestoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnteriorePresupuestoFlujoCaja")) {
				jButtonAnterioresPresupuestoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesPresupuestoFlujoCaja")) {
				jButtonSiguientesPresupuestoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarPresupuestoFlujoCaja")) {
				jButtonSiguientesPresupuestoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesPresupuestoFlujoCaja")) {
				jButtonSiguientesPresupuestoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByPresupuestoFlujoCaja") || sTipo.equals("MenuItemDetalleAbrirOrderByPresupuestoFlujoCaja")) {
				jButtonAbrirOrderByPresupuestoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarPresupuestoFlujoCaja") || sTipo.equals("MenuItemDetalleMostrarOcultarPresupuestoFlujoCaja")) {
				jButtonMostrarOcultarPresupuestoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosPresupuestoFlujoCaja")) {
				jButtonNuevoGuardarCambiosPresupuestoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarPresupuestoFlujoCaja")) {
				jButtonNuevoGuardarCambiosPresupuestoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosPresupuestoFlujoCaja")) {
				jButtonNuevoGuardarCambiosPresupuestoFlujoCajaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoPresupuestoFlujoCaja")) {
				jButtonCerrarReporteDinamicoPresupuestoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoPresupuestoFlujoCaja")) {
				jButtonGenerarReporteDinamicoPresupuestoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoPresupuestoFlujoCaja")) {
				
				jButtonGenerarExcelReporteDinamicoPresupuestoFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionPresupuestoFlujoCaja")) {
				jButtonCerrarImportacionPresupuestoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionPresupuestoFlujoCaja")) {
				
				jButtonGenerarImportacionPresupuestoFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionPresupuestoFlujoCaja")) {
				
				jButtonAbrirImportacionPresupuestoFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesPresupuestoFlujoCaja")) {
				jComboBoxTiposAccionesPresupuestoFlujoCajaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesPresupuestoFlujoCaja")) {
				jComboBoxTiposRelacionesPresupuestoFlujoCajaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioPresupuestoFlujoCaja")) {
				jComboBoxTiposAccionesPresupuestoFlujoCajaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarPresupuestoFlujoCaja")) {
				
				jComboBoxTiposSeleccionarPresupuestoFlujoCajaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralPresupuestoFlujoCaja")) {
				jTextFieldValorCampoGeneralPresupuestoFlujoCajaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByPresupuestoFlujoCaja")) {
				jButtonAbrirOrderByPresupuestoFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarPresupuestoFlujoCaja")) {
				jButtonAbrirOrderByPresupuestoFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByPresupuestoFlujoCaja")) {
				jButtonCerrarOrderByPresupuestoFlujoCajaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPresupuestoFlujoCajaBusqueda")) {
				this.jButtonidPresupuestoFlujoCajaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaPresupuestoFlujoCajaUpdate")) {
				this.jButtonid_empresaPresupuestoFlujoCajaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaPresupuestoFlujoCajaBusqueda")) {
				this.jButtonid_empresaPresupuestoFlujoCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_cuenta_contablePresupuestoFlujoCaja")) {
				this.jButtonid_cuenta_contablePresupuestoFlujoCajaActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_cuenta_contablePresupuestoFlujoCajaArbol")) {
				this.abrirFrameTreeCuentaContable("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contablePresupuestoFlujoCajaUpdate")) {
				this.jButtonid_cuenta_contablePresupuestoFlujoCajaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contablePresupuestoFlujoCajaBusqueda")) {
				this.jButtonid_cuenta_contablePresupuestoFlujoCajaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioPresupuestoFlujoCajaUpdate")) {
				this.jButtonid_ejercicioPresupuestoFlujoCajaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioPresupuestoFlujoCajaBusqueda")) {
				this.jButtonid_ejercicioPresupuestoFlujoCajaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoPresupuestoFlujoCajaUpdate")) {
				this.jButtonid_periodoPresupuestoFlujoCajaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoPresupuestoFlujoCajaBusqueda")) {
				this.jButtonid_periodoPresupuestoFlujoCajaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_centro_costoPresupuestoFlujoCajaUpdate")) {
				this.jButtonid_centro_costoPresupuestoFlujoCajaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_centro_costoPresupuestoFlujoCajaBusqueda")) {
				this.jButtonid_centro_costoPresupuestoFlujoCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorPresupuestoFlujoCajaBusqueda")) {
				this.jButtonvalorPresupuestoFlujoCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_efectivoPresupuestoFlujoCajaBusqueda")) {
				this.jButtonvalor_efectivoPresupuestoFlujoCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajePresupuestoFlujoCajaBusqueda")) {
				this.jButtonporcentajePresupuestoFlujoCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_presupuestoPresupuestoFlujoCajaBusqueda")) {
				this.jButtonfecha_presupuestoPresupuestoFlujoCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_procesoPresupuestoFlujoCajaBusqueda")) {
				this.jButtonfecha_procesoPresupuestoFlujoCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("observacionPresupuestoFlujoCajaBusqueda")) {
				this.jButtonobservacionPresupuestoFlujoCajaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioPresupuestoFlujoCajaUpdate")) {
				this.jButtonid_anioPresupuestoFlujoCajaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioPresupuestoFlujoCajaBusqueda")) {
				this.jButtonid_anioPresupuestoFlujoCajaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesPresupuestoFlujoCajaUpdate")) {
				this.jButtonid_mesPresupuestoFlujoCajaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesPresupuestoFlujoCajaBusqueda")) {
				this.jButtonid_mesPresupuestoFlujoCajaBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_cuenta_contablePresupuestoFlujoCaja")) {
				this.jButtonid_cuenta_contablePresupuestoFlujoCajaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdCentroCostoPresupuestoFlujoCaja")) {
				this.jButtonFK_IdCentroCostoPresupuestoFlujoCajaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdCuentaContablePresupuestoFlujoCaja")) {
				this.jButtonFK_IdCuentaContablePresupuestoFlujoCajaActionPerformed(evt);
			}
			
			;
			
			
			PresupuestoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presupuestoflujocaja,new Object(),this.presupuestoflujocajaParameterGeneral,this.presupuestoflujocajaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessPresupuestoFlujoCaja();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresupuestoFlujoCajaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestoflujocaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presupuestoflujocaja);
				
				PresupuestoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestoflujocaja,new Object(),this.presupuestoflujocajaParameterGeneral,this.presupuestoflujocajaReturnGeneral);
				
				


				
				PresupuestoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestoflujocaja,new Object(),this.presupuestoflujocajaParameterGeneral,this.presupuestoflujocajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresupuestoFlujoCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresupuestoFlujoCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			PresupuestoFlujoCaja presupuestoflujocajaLocal=null;
			
			if(!this.getEsControlTabla()) {
				presupuestoflujocajaLocal=this.presupuestoflujocaja;
			} else {
				presupuestoflujocajaLocal=this.presupuestoflujocajaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestoflujocaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presupuestoflujocaja);
				
				PresupuestoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestoflujocaja,new Object(),this.presupuestoflujocajaParameterGeneral,this.presupuestoflujocajaReturnGeneral);
							
				
				


				
				PresupuestoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestoflujocaja,new Object(),this.presupuestoflujocajaParameterGeneral,this.presupuestoflujocajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresupuestoFlujoCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresupuestoFlujoCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresupuestoFlujoCajaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPresupuestoFlujoCaja.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoflujocajaAnterior =(PresupuestoFlujoCaja) this.presupuestoflujocajaLogic.getPresupuestoFlujoCajas().toArray()[this.jTableDatosPresupuestoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presupuestoflujocajaAnterior =(PresupuestoFlujoCaja) this.presupuestoflujocajas.toArray()[this.jTableDatosPresupuestoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
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
			
			PresupuestoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestoflujocaja,new Object(),this.presupuestoflujocajaParameterGeneral,this.presupuestoflujocajaReturnGeneral);
			
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
			
			


			
			PresupuestoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestoflujocaja,new Object(),this.presupuestoflujocajaParameterGeneral,this.presupuestoflujocajaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresupuestoFlujoCajaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestoflujocaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presupuestoflujocaja);
				
				PresupuestoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestoflujocaja,new Object(),this.presupuestoflujocajaParameterGeneral,this.presupuestoflujocajaReturnGeneral);
								
						
				


				
				PresupuestoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestoflujocaja,new Object(),this.presupuestoflujocajaParameterGeneral,this.presupuestoflujocajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresupuestoFlujoCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresupuestoFlujoCaja.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestoflujocaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presupuestoflujocaja);
				
				PresupuestoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestoflujocaja,new Object(),this.presupuestoflujocajaParameterGeneral,this.presupuestoflujocajaReturnGeneral);
								
				
				


				
				PresupuestoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestoflujocaja,new Object(),this.presupuestoflujocajaParameterGeneral,this.presupuestoflujocajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresupuestoFlujoCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresupuestoFlujoCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresupuestoFlujoCajaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPresupuestoFlujoCaja.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoflujocajaAnterior =(PresupuestoFlujoCaja) this.presupuestoflujocajaLogic.getPresupuestoFlujoCajas().toArray()[this.jTableDatosPresupuestoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presupuestoflujocajaAnterior =(PresupuestoFlujoCaja) this.presupuestoflujocajas.toArray()[this.jTableDatosPresupuestoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestoflujocaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presupuestoflujocaja);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresupuestoFlujoCajaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPresupuestoFlujoCaja.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoflujocajaAnterior =(PresupuestoFlujoCaja) this.presupuestoflujocajaLogic.getPresupuestoFlujoCajas().toArray()[this.jTableDatosPresupuestoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presupuestoflujocajaAnterior =(PresupuestoFlujoCaja) this.presupuestoflujocajas.toArray()[this.jTableDatosPresupuestoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresupuestoFlujoCajaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestoflujocaja);
			
			this.actualizarInformacion("INFO_PADRE",false,this.presupuestoflujocaja);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestoflujocaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presupuestoflujocaja);
				
				PresupuestoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestoflujocaja,new Object(),this.presupuestoflujocajaParameterGeneral,this.presupuestoflujocajaReturnGeneral);
							
				
				


				
				PresupuestoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestoflujocaja,new Object(),this.presupuestoflujocajaParameterGeneral,this.presupuestoflujocajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresupuestoFlujoCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresupuestoFlujoCaja.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresupuestoFlujoCajaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPresupuestoFlujoCaja.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestoflujocajaAnterior =(PresupuestoFlujoCaja) this.presupuestoflujocajaLogic.getPresupuestoFlujoCajas().toArray()[this.jTableDatosPresupuestoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.presupuestoflujocajaAnterior =(PresupuestoFlujoCaja) this.presupuestoflujocajas.toArray()[this.jTableDatosPresupuestoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
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
			
			PresupuestoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestoflujocaja,new Object(),this.presupuestoflujocajaParameterGeneral,this.presupuestoflujocajaReturnGeneral);
			
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
			
			


			
			PresupuestoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestoflujocaja,new Object(),this.presupuestoflujocajaParameterGeneral,this.presupuestoflujocajaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresupuestoFlujoCajaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestoflujocaja);
			
			this.actualizarInformacion("INFO_PADRE",false,this.presupuestoflujocaja);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestoflujocaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presupuestoflujocaja);
				
				PresupuestoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestoflujocaja,new Object(),this.presupuestoflujocajaParameterGeneral,this.presupuestoflujocajaReturnGeneral);
								
				
				


				
				PresupuestoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestoflujocaja,new Object(),this.presupuestoflujocajaParameterGeneral,this.presupuestoflujocajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresupuestoFlujoCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresupuestoFlujoCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresupuestoFlujoCajaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPresupuestoFlujoCaja.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoflujocajaAnterior =(PresupuestoFlujoCaja) this.presupuestoflujocajaLogic.getPresupuestoFlujoCajas().toArray()[this.jTableDatosPresupuestoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presupuestoflujocajaAnterior =(PresupuestoFlujoCaja) this.presupuestoflujocajas.toArray()[this.jTableDatosPresupuestoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresupuestoFlujoCajaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestoflujocaja);
			
			this.actualizarInformacion("INFO_PADRE",false,this.presupuestoflujocaja);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresupuestoFlujoCajaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestoflujocaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presupuestoflujocaja);
				
				PresupuestoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presupuestoflujocaja,new Object(),this.presupuestoflujocajaParameterGeneral,this.presupuestoflujocajaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosPresupuestoFlujoCaja")) {
					jCheckBoxSeleccionarTodosPresupuestoFlujoCajaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosPresupuestoFlujoCaja")) {
					jCheckBoxSeleccionadosPresupuestoFlujoCajaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarPresupuestoFlujoCaja")) {
					
				}
				
				


				
				
				PresupuestoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presupuestoflujocaja,new Object(),this.presupuestoflujocajaParameterGeneral,this.presupuestoflujocajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresupuestoFlujoCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresupuestoFlujoCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestoflujocaja);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.presupuestoflujocaja);
				
				PresupuestoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presupuestoflujocaja,new Object(),this.presupuestoflujocajaParameterGeneral,this.presupuestoflujocajaReturnGeneral);
												
				
				


				
				
				PresupuestoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presupuestoflujocaja,new Object(),this.presupuestoflujocajaParameterGeneral,this.presupuestoflujocajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresupuestoFlujoCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresupuestoFlujoCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresupuestoFlujoCajaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPresupuestoFlujoCaja.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presupuestoflujocajaAnterior =(PresupuestoFlujoCaja) this.presupuestoflujocajaLogic.getPresupuestoFlujoCajas().toArray()[this.jTableDatosPresupuestoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.presupuestoflujocajaAnterior =(PresupuestoFlujoCaja) this.presupuestoflujocajas.toArray()[this.jTableDatosPresupuestoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresupuestoFlujoCajaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestoflujocaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presupuestoflujocaja);
				
				PresupuestoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presupuestoflujocaja,new Object(),this.presupuestoflujocajaParameterGeneral,this.presupuestoflujocajaReturnGeneral);
				
				
				PresupuestoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presupuestoflujocaja,new Object(),this.presupuestoflujocajaParameterGeneral,this.presupuestoflujocajaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
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
			
			PresupuestoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.presupuestoflujocaja,new Object(),this.presupuestoflujocajaParameterGeneral,this.presupuestoflujocajaReturnGeneral);
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
			
			


			
			PresupuestoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestoflujocaja,new Object(),this.presupuestoflujocajaParameterGeneral,this.presupuestoflujocajaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresupuestoFlujoCajaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestoflujocaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presupuestoflujocaja);
				
				PresupuestoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.presupuestoflujocaja,new Object(),this.presupuestoflujocajaParameterGeneral,this.presupuestoflujocajaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				PresupuestoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestoflujocaja,new Object(),this.presupuestoflujocajaParameterGeneral,this.presupuestoflujocajaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresupuestoFlujoCaja.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresupuestoFlujoCaja.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presupuestoflujocaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presupuestoflujocaja);
				
				PresupuestoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.presupuestoflujocaja,new Object(),this.presupuestoflujocajaParameterGeneral,this.presupuestoflujocajaReturnGeneral);
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
				
				


				
				PresupuestoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestoflujocaja,new Object(),this.presupuestoflujocajaParameterGeneral,this.presupuestoflujocajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresupuestoFlujoCaja.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresupuestoFlujoCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresupuestoFlujoCajaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPresupuestoFlujoCaja.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presupuestoflujocajaAnterior =(PresupuestoFlujoCaja) this.presupuestoflujocajaLogic.getPresupuestoFlujoCajas().toArray()[this.jTableDatosPresupuestoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presupuestoflujocajaAnterior =(PresupuestoFlujoCaja) this.presupuestoflujocajas.toArray()[this.jTableDatosPresupuestoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				PresupuestoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestoflujocaja,new Object(),this.presupuestoflujocajaParameterGeneral,this.presupuestoflujocajaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarPresupuestoFlujoCaja")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosPresupuestoFlujoCajaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosPresupuestoFlujoCaja.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.presupuestoflujocaja =(PresupuestoFlujoCaja) this.presupuestoflujocajaLogic.getPresupuestoFlujoCajas().toArray()[this.jTableDatosPresupuestoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.presupuestoflujocaja =(PresupuestoFlujoCaja) this.presupuestoflujocajas.toArray()[this.jTableDatosPresupuestoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.presupuestoflujocaja);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarPresupuestoFlujoCaja")) {
				
				}
				
				PresupuestoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presupuestoflujocaja,new Object(),this.presupuestoflujocajaParameterGeneral,this.presupuestoflujocajaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			PresupuestoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.presupuestoflujocaja,new Object(),this.presupuestoflujocajaParameterGeneral,this.presupuestoflujocajaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarPresupuestoFlujoCaja")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosPresupuestoFlujoCaja.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarPresupuestoFlujoCaja")) {
			
			}
			
			PresupuestoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.presupuestoflujocaja,new Object(),this.presupuestoflujocajaParameterGeneral,this.presupuestoflujocajaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessPresupuestoFlujoCaja();
			
			PresupuestoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presupuestoflujocaja,new Object(),this.presupuestoflujocajaParameterGeneral,this.presupuestoflujocajaReturnGeneral);
			
			if(sTipo.equals("NuevoPresupuestoFlujoCaja")) {
				jButtonNuevoPresupuestoFlujoCajaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarPresupuestoFlujoCaja")) {
				jButtonDuplicarPresupuestoFlujoCajaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarPresupuestoFlujoCaja")) {
				jButtonCopiarPresupuestoFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormPresupuestoFlujoCaja")) {
				jButtonVerFormPresupuestoFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesPresupuestoFlujoCaja")) {
				jButtonNuevoPresupuestoFlujoCajaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarPresupuestoFlujoCaja")) {
				jButtonModificarPresupuestoFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarPresupuestoFlujoCaja")) {
				jButtonActualizarPresupuestoFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarPresupuestoFlujoCaja")) {
				jButtonEliminarPresupuestoFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaPresupuestoFlujoCaja")) {
				jButtonGuardarCambiosPresupuestoFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarPresupuestoFlujoCaja")) {
				jButtonCancelarPresupuestoFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarPresupuestoFlujoCaja")) {
				jButtonCerrarPresupuestoFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosPresupuestoFlujoCaja")) {
				jButtonGuardarCambiosPresupuestoFlujoCajaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosPresupuestoFlujoCaja")) {
				jButtonNuevoGuardarCambiosPresupuestoFlujoCajaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByPresupuestoFlujoCaja")) {
				jButtonAbrirOrderByPresupuestoFlujoCajaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionPresupuestoFlujoCaja")) {
				jButtonRecargarInformacionPresupuestoFlujoCajaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresPresupuestoFlujoCaja")) {
				jButtonAnterioresPresupuestoFlujoCajaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesPresupuestoFlujoCaja")) {
				jButtonSiguientesPresupuestoFlujoCajaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPresupuestoFlujoCajaBusqueda")) {
				this.jButtonidPresupuestoFlujoCajaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaPresupuestoFlujoCajaUpdate")) {
				this.jButtonid_empresaPresupuestoFlujoCajaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaPresupuestoFlujoCajaBusqueda")) {
				this.jButtonid_empresaPresupuestoFlujoCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_cuenta_contablePresupuestoFlujoCaja")) {
				this.jButtonid_cuenta_contablePresupuestoFlujoCajaActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_cuenta_contablePresupuestoFlujoCajaArbol")) {
				this.abrirFrameTreeCuentaContable("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contablePresupuestoFlujoCajaUpdate")) {
				this.jButtonid_cuenta_contablePresupuestoFlujoCajaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contablePresupuestoFlujoCajaBusqueda")) {
				this.jButtonid_cuenta_contablePresupuestoFlujoCajaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioPresupuestoFlujoCajaUpdate")) {
				this.jButtonid_ejercicioPresupuestoFlujoCajaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioPresupuestoFlujoCajaBusqueda")) {
				this.jButtonid_ejercicioPresupuestoFlujoCajaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoPresupuestoFlujoCajaUpdate")) {
				this.jButtonid_periodoPresupuestoFlujoCajaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoPresupuestoFlujoCajaBusqueda")) {
				this.jButtonid_periodoPresupuestoFlujoCajaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_centro_costoPresupuestoFlujoCajaUpdate")) {
				this.jButtonid_centro_costoPresupuestoFlujoCajaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_centro_costoPresupuestoFlujoCajaBusqueda")) {
				this.jButtonid_centro_costoPresupuestoFlujoCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorPresupuestoFlujoCajaBusqueda")) {
				this.jButtonvalorPresupuestoFlujoCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_efectivoPresupuestoFlujoCajaBusqueda")) {
				this.jButtonvalor_efectivoPresupuestoFlujoCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajePresupuestoFlujoCajaBusqueda")) {
				this.jButtonporcentajePresupuestoFlujoCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_presupuestoPresupuestoFlujoCajaBusqueda")) {
				this.jButtonfecha_presupuestoPresupuestoFlujoCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_procesoPresupuestoFlujoCajaBusqueda")) {
				this.jButtonfecha_procesoPresupuestoFlujoCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("observacionPresupuestoFlujoCajaBusqueda")) {
				this.jButtonobservacionPresupuestoFlujoCajaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioPresupuestoFlujoCajaUpdate")) {
				this.jButtonid_anioPresupuestoFlujoCajaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioPresupuestoFlujoCajaBusqueda")) {
				this.jButtonid_anioPresupuestoFlujoCajaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesPresupuestoFlujoCajaUpdate")) {
				this.jButtonid_mesPresupuestoFlujoCajaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesPresupuestoFlujoCajaBusqueda")) {
				this.jButtonid_mesPresupuestoFlujoCajaBusquedaActionPerformed(evt);
			}
			
			PresupuestoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presupuestoflujocaja,new Object(),this.presupuestoflujocajaParameterGeneral,this.presupuestoflujocajaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessPresupuestoFlujoCaja();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			PresupuestoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.presupuestoflujocaja,new Object(),this.presupuestoflujocajaParameterGeneral,this.presupuestoflujocajaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFramePresupuestoFlujoCaja")) {
				closingInternalFramePresupuestoFlujoCaja();
				
			} else if(sTipo.equals("jButtonCancelarPresupuestoFlujoCaja")) {
				JInternalFrameBase jInternalFrameDetalleFormPresupuestoFlujoCaja = (JInternalFrameBase)evt.getSource();
	            	
	            PresupuestoFlujoCajaBeanSwingJInternalFrame jInternalFrameParent=(PresupuestoFlujoCajaBeanSwingJInternalFrame)jInternalFrameDetalleFormPresupuestoFlujoCaja.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarPresupuestoFlujoCajaActionPerformed(null);
			}
			
			PresupuestoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.presupuestoflujocaja,new Object(),this.presupuestoflujocajaParameterGeneral,this.presupuestoflujocajaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormPresupuestoFlujoCaja(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormPresupuestoFlujoCaja(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormPresupuestoFlujoCaja(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.presupuestoflujocaja)) {
			if(!esControlTabla) {
				if(PresupuestoFlujoCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualPresupuestoFlujoCaja(this.presupuestoflujocaja,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoFlujoCaja(this.presupuestoflujocaja);			
				}
				
				if(this.presupuestoflujocajaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualPresupuestoFlujoCaja(this.presupuestoflujocaja,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.presupuestoflujocajaReturnGeneral=presupuestoflujocajaLogic.procesarEventosPresupuestoFlujoCajasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.presupuestoflujocajaLogic.getPresupuestoFlujoCajas(),this.presupuestoflujocaja,this.presupuestoflujocajaParameterGeneral,this.isEsNuevoPresupuestoFlujoCaja,classes);//this.presupuestoflujocajaLogic.getPresupuestoFlujoCaja()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanPresupuestoFlujoCaja(this.presupuestoflujocajaReturnGeneral,this.presupuestoflujocajaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.presupuestoflujocajaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanPresupuestoFlujoCaja(classes,this.presupuestoflujocajaReturnGeneral,this.presupuestoflujocajaBean,false);
					}
						
					if(this.presupuestoflujocajaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyPresupuestoFlujoCaja(this.presupuestoflujocajaReturnGeneral.getPresupuestoFlujoCaja());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioPresupuestoFlujoCaja(this.presupuestoflujocajaReturnGeneral.getPresupuestoFlujoCaja());	
					}
						
					if(this.presupuestoflujocajaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioPresupuestoFlujoCaja(this.presupuestoflujocajaReturnGeneral.getPresupuestoFlujoCaja(),classes);//this.presupuestoflujocajaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioPresupuestoFlujoCaja(this.presupuestoflujocaja,classes);//this.presupuestoflujocajaBean);									
				}
			
				if(PresupuestoFlujoCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualPresupuestoFlujoCaja(this.presupuestoflujocaja,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPresupuestoFlujoCaja(this.presupuestoflujocaja);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.presupuestoflujocajaAnterior!=null) {
						this.presupuestoflujocaja=this.presupuestoflujocajaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.presupuestoflujocajaReturnGeneral=presupuestoflujocajaLogic.procesarEventosPresupuestoFlujoCajasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.presupuestoflujocajaLogic.getPresupuestoFlujoCajas(),this.presupuestoflujocaja,this.presupuestoflujocajaParameterGeneral,this.isEsNuevoPresupuestoFlujoCaja,classes);//this.presupuestoflujocajaLogic.getPresupuestoFlujoCaja()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.presupuestoflujocajaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.presupuestoflujocajaReturnGeneral.getPresupuestoFlujoCaja(),presupuestoflujocajaLogic.getPresupuestoFlujoCajas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.presupuestoflujocajaReturnGeneral.getPresupuestoFlujoCaja(),this.presupuestoflujocajas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosPresupuestoFlujoCaja.repaint();
				
				//((AbstractTableModel) this.jTableDatosPresupuestoFlujoCaja.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosPresupuestoFlujoCaja();
			}
		}
	}
	
	public void actualizarVisualTableDatosPresupuestoFlujoCaja() throws Exception {
		
		PresupuestoFlujoCajaModel presupuestoflujocajaModel=(PresupuestoFlujoCajaModel)this.jTableDatosPresupuestoFlujoCaja.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			presupuestoflujocajaModel.presupuestoflujocajas=this.presupuestoflujocajaLogic.getPresupuestoFlujoCajas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			presupuestoflujocajaModel.presupuestoflujocajas=this.presupuestoflujocajas;
		}
		
		
		((PresupuestoFlujoCajaModel) this.jTableDatosPresupuestoFlujoCaja.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaPresupuestoFlujoCaja() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getpresupuestoflujocajaAnterior(),this.presupuestoflujocajaLogic.getPresupuestoFlujoCajas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getpresupuestoflujocajaAnterior(),this.presupuestoflujocajas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosPresupuestoFlujoCaja();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioPresupuestoFlujoCaja(PresupuestoFlujoCaja presupuestoflujocaja,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
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
										
				PresupuestoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.presupuestoflujocaja,new Object(),generalEntityParameterGeneral,this.presupuestoflujocajaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.presupuestoflujocajaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=PresupuestoFlujoCajaConstantesFunciones.getClassesRelationshipsOfPresupuestoFlujoCaja(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=PresupuestoFlujoCajaConstantesFunciones.getClassesRelationshipsFromStringsOfPresupuestoFlujoCaja(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormPresupuestoFlujoCaja(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				PresupuestoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.presupuestoflujocaja,new Object(),generalEntityParameterGeneral,this.presupuestoflujocajaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioPresupuestoFlujoCaja(PresupuestoFlujoCajaBean presupuestoflujocajaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanPresupuestoFlujoCaja(ArrayList<Classe> classes,PresupuestoFlujoCajaReturnGeneral presupuestoflujocajaReturnGeneral,PresupuestoFlujoCajaBean presupuestoflujocajaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualPresupuestoFlujoCaja(PresupuestoFlujoCaja presupuestoflujocaja,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.presupuestoflujocaja)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja = new PresupuestoFlujoCajaDetalleFormJInternalFrame(jDesktopPane,this.presupuestoflujocajaSessionBean.getConGuardarRelaciones(),this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormPresupuestoFlujoCaja);
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.setVisible(false);
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.setSelected(false);						
		
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.presupuestoflujocajaLogic=this.presupuestoflujocajaLogic;
		
		this.cargarCombosFrameForeignKeyPresupuestoFlujoCaja("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetallePresupuestoFlujoCaja();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePresupuestoFlujoCaja();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyPresupuestoFlujoCaja("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyPresupuestoFlujoCaja();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPresupuestoFlujoCaja"));
		
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonModificarPresupuestoFlujoCaja.addActionListener(new ButtonActionListener(this,"ModificarPresupuestoFlujoCaja"));

		
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonModificarToolBarPresupuestoFlujoCaja.addActionListener(new ButtonActionListener(this,"ModificarToolBarPresupuestoFlujoCaja"));
					
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jMenuItemModificarPresupuestoFlujoCaja.addActionListener(new ButtonActionListener(this,"MenuItemModificarPresupuestoFlujoCaja"));		
		
		
		
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonActualizarPresupuestoFlujoCaja.addActionListener (new ButtonActionListener(this,"ActualizarPresupuestoFlujoCaja"));
		
		
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonActualizarToolBarPresupuestoFlujoCaja.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPresupuestoFlujoCaja"));
						
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jMenuItemActualizarPresupuestoFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPresupuestoFlujoCaja"));		
		
		
		
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonEliminarPresupuestoFlujoCaja.addActionListener (new ButtonActionListener(this,"EliminarPresupuestoFlujoCaja"));
		
		
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonEliminarToolBarPresupuestoFlujoCaja.addActionListener (new ButtonActionListener(this,"EliminarToolBarPresupuestoFlujoCaja"));
								
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jMenuItemEliminarPresupuestoFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPresupuestoFlujoCaja"));		
		
		
		
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonCancelarPresupuestoFlujoCaja.addActionListener (new ButtonActionListener(this,"CancelarPresupuestoFlujoCaja"));
		
		
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonCancelarToolBarPresupuestoFlujoCaja.addActionListener (new ButtonActionListener(this,"CancelarToolBarPresupuestoFlujoCaja"));
					
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jMenuItemCancelarPresupuestoFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPresupuestoFlujoCaja"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jMenuItemDetalleCerrarPresupuestoFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPresupuestoFlujoCaja"));		
		
		
		
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonGuardarCambiosToolBarPresupuestoFlujoCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPresupuestoFlujoCaja"));
		
		
		
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonGuardarCambiosToolBarPresupuestoFlujoCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPresupuestoFlujoCaja"));
		
		
		
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxTiposAccionesFormularioPresupuestoFlujoCaja.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPresupuestoFlujoCaja"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonidPresupuestoFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"idPresupuestoFlujoCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonid_empresaPresupuestoFlujoCajaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPresupuestoFlujoCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonid_empresaPresupuestoFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPresupuestoFlujoCajaBusqueda"));
		//jButtonid_cuenta_contablePresupuestoFlujoCaja.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contablePresupuestoFlujoCajaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonid_cuenta_contablePresupuestoFlujoCaja.addActionListener(new ButtonActionListener(this,"id_cuenta_contablePresupuestoFlujoCaja"));
		//jButtonid_cuenta_contablePresupuestoFlujoCajaArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContable("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonid_cuenta_contablePresupuestoFlujoCajaArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contablePresupuestoFlujoCajaArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonid_cuenta_contablePresupuestoFlujoCajaUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contablePresupuestoFlujoCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonid_cuenta_contablePresupuestoFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contablePresupuestoFlujoCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonid_ejercicioPresupuestoFlujoCajaUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioPresupuestoFlujoCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonid_ejercicioPresupuestoFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioPresupuestoFlujoCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonid_periodoPresupuestoFlujoCajaUpdate.addActionListener(new ButtonActionListener(this,"id_periodoPresupuestoFlujoCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonid_periodoPresupuestoFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoPresupuestoFlujoCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonid_centro_costoPresupuestoFlujoCajaUpdate.addActionListener(new ButtonActionListener(this,"id_centro_costoPresupuestoFlujoCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonid_centro_costoPresupuestoFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_centro_costoPresupuestoFlujoCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonvalorPresupuestoFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"valorPresupuestoFlujoCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonvalor_efectivoPresupuestoFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"valor_efectivoPresupuestoFlujoCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonporcentajePresupuestoFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"porcentajePresupuestoFlujoCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonfecha_presupuestoPresupuestoFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_presupuestoPresupuestoFlujoCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonfecha_procesoPresupuestoFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_procesoPresupuestoFlujoCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonobservacionPresupuestoFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"observacionPresupuestoFlujoCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonid_anioPresupuestoFlujoCajaUpdate.addActionListener(new ButtonActionListener(this,"id_anioPresupuestoFlujoCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonid_anioPresupuestoFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_anioPresupuestoFlujoCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonid_mesPresupuestoFlujoCajaUpdate.addActionListener(new ButtonActionListener(this,"id_mesPresupuestoFlujoCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonid_mesPresupuestoFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_mesPresupuestoFlujoCajaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jTabbedPaneRelacionesPresupuestoFlujoCaja.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPresupuestoFlujoCaja"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFramePresupuestoFlujoCaja"));
		
		if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresupuestoFlujoCaja.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPresupuestoFlujoCaja"));
		}
		
		this.jTableDatosPresupuestoFlujoCaja.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarPresupuestoFlujoCaja"));
		
		this.jTableDatosPresupuestoFlujoCaja.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarPresupuestoFlujoCaja"));
		
		this.jButtonNuevoPresupuestoFlujoCaja.addActionListener(new ButtonActionListener(this,"NuevoPresupuestoFlujoCaja"));
		
		this.jButtonDuplicarPresupuestoFlujoCaja.addActionListener(new ButtonActionListener(this,"DuplicarPresupuestoFlujoCaja"));
		
		this.jButtonCopiarPresupuestoFlujoCaja.addActionListener(new ButtonActionListener(this,"CopiarPresupuestoFlujoCaja"));
		
		this.jButtonVerFormPresupuestoFlujoCaja.addActionListener(new ButtonActionListener(this,"VerFormPresupuestoFlujoCaja"));
		
		
		this.jButtonNuevoToolBarPresupuestoFlujoCaja.addActionListener(new ButtonActionListener(this,"NuevoToolBarPresupuestoFlujoCaja"));
			
		this.jButtonDuplicarToolBarPresupuestoFlujoCaja.addActionListener(new ButtonActionListener(this,"DuplicarToolBarPresupuestoFlujoCaja"));
			
		this.jMenuItemNuevoPresupuestoFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemNuevoPresupuestoFlujoCaja"));
			
		this.jMenuItemDuplicarPresupuestoFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarPresupuestoFlujoCaja"));		
		
		
		this.jButtonNuevoRelacionesPresupuestoFlujoCaja.addActionListener (new ButtonActionListener(this,"NuevoRelacionesPresupuestoFlujoCaja"));
		
		
		this.jButtonNuevoRelacionesToolBarPresupuestoFlujoCaja.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarPresupuestoFlujoCaja"));
			
		this.jMenuItemNuevoRelacionesPresupuestoFlujoCaja.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesPresupuestoFlujoCaja"));		
		
		
		if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonModificarPresupuestoFlujoCaja.addActionListener(new ButtonActionListener(this,"ModificarPresupuestoFlujoCaja"));
		}
		
		
		if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonModificarToolBarPresupuestoFlujoCaja.addActionListener(new ButtonActionListener(this,"ModificarToolBarPresupuestoFlujoCaja"));
			
			this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jMenuItemModificarPresupuestoFlujoCaja.addActionListener(new ButtonActionListener(this,"MenuItemModificarPresupuestoFlujoCaja"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonActualizarPresupuestoFlujoCaja.addActionListener (new ButtonActionListener(this,"ActualizarPresupuestoFlujoCaja"));
		}
		
		
		if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonActualizarToolBarPresupuestoFlujoCaja.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPresupuestoFlujoCaja"));
				
			this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jMenuItemActualizarPresupuestoFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPresupuestoFlujoCaja"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonEliminarPresupuestoFlujoCaja.addActionListener (new ButtonActionListener(this,"EliminarPresupuestoFlujoCaja"));
		}
		
		
		if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonEliminarToolBarPresupuestoFlujoCaja.addActionListener (new ButtonActionListener(this,"EliminarToolBarPresupuestoFlujoCaja"));
						
			this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jMenuItemEliminarPresupuestoFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPresupuestoFlujoCaja"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonCancelarPresupuestoFlujoCaja.addActionListener (new ButtonActionListener(this,"CancelarPresupuestoFlujoCaja"));
		}
		
		
		if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonCancelarToolBarPresupuestoFlujoCaja.addActionListener (new ButtonActionListener(this,"CancelarToolBarPresupuestoFlujoCaja"));
			
			this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jMenuItemCancelarPresupuestoFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPresupuestoFlujoCaja"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarPresupuestoFlujoCaja.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarPresupuestoFlujoCaja"));		
		
		
		this.jButtonCerrarPresupuestoFlujoCaja.addActionListener (new ButtonActionListener(this,"CerrarPresupuestoFlujoCaja"));
		
		
		this.jButtonCerrarToolBarPresupuestoFlujoCaja.addActionListener (new ButtonActionListener(this,"CerrarToolBarPresupuestoFlujoCaja"));
			
		this.jMenuItemCerrarPresupuestoFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemCerrarPresupuestoFlujoCaja"));
			
		if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jMenuItemDetalleCerrarPresupuestoFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPresupuestoFlujoCaja"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonGuardarCambiosPresupuestoFlujoCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosPresupuestoFlujoCaja"));
		}
		
		
		if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonGuardarCambiosToolBarPresupuestoFlujoCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPresupuestoFlujoCaja"));
		}
		
		this.jButtonCopiarToolBarPresupuestoFlujoCaja.addActionListener (new ButtonActionListener(this,"CopiarToolBarPresupuestoFlujoCaja"));
			
		this.jButtonVerFormToolBarPresupuestoFlujoCaja.addActionListener (new ButtonActionListener(this,"VerFormToolBarPresupuestoFlujoCaja"));
		
		this.jMenuItemGuardarCambiosPresupuestoFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosPresupuestoFlujoCaja"));
			
		this.jMenuItemCopiarPresupuestoFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemCopiarPresupuestoFlujoCaja"));		
		
		this.jMenuItemVerFormPresupuestoFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemVerFormPresupuestoFlujoCaja"));		
		
		
		this.jButtonGuardarCambiosTablaPresupuestoFlujoCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPresupuestoFlujoCaja"));
		
		
		this.jButtonGuardarCambiosTablaToolBarPresupuestoFlujoCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarPresupuestoFlujoCaja"));
			
		this.jMenuItemGuardarCambiosTablaPresupuestoFlujoCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPresupuestoFlujoCaja"));		
		
		
		
		this.jButtonRecargarInformacionPresupuestoFlujoCaja.addActionListener (new ButtonActionListener(this,"RecargarInformacionPresupuestoFlujoCaja"));
					
		this.jButtonRecargarInformacionToolBarPresupuestoFlujoCaja.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarPresupuestoFlujoCaja"));
		
		this.jMenuItemRecargarInformacionPresupuestoFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionPresupuestoFlujoCaja"));		
		
		
		
		this.jButtonAnterioresPresupuestoFlujoCaja.addActionListener (new ButtonActionListener(this,"AnterioresPresupuestoFlujoCaja"));
		
		
		this.jButtonAnterioresToolBarPresupuestoFlujoCaja.addActionListener (new ButtonActionListener(this,"AnterioresToolBarPresupuestoFlujoCaja"));
		
		this.jMenuItemAnterioresPresupuestoFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresPresupuestoFlujoCaja"));		
		
		
		this.jButtonSiguientesPresupuestoFlujoCaja.addActionListener (new ButtonActionListener(this,"SiguientesPresupuestoFlujoCaja"));
		
		
		this.jButtonSiguientesToolBarPresupuestoFlujoCaja.addActionListener (new ButtonActionListener(this,"SiguientesToolBarPresupuestoFlujoCaja"));
			
		this.jMenuItemSiguientesPresupuestoFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesPresupuestoFlujoCaja"));
			
		this.jMenuItemAbrirOrderByPresupuestoFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByPresupuestoFlujoCaja"));
			
		this.jMenuItemMostrarOcultarPresupuestoFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarPresupuestoFlujoCaja"));
			
		this.jMenuItemDetalleAbrirOrderByPresupuestoFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByPresupuestoFlujoCaja"));
			
		this.jMenuItemDetalleMostarOcultarPresupuestoFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarPresupuestoFlujoCaja"));		
		
		
		this.jButtonNuevoGuardarCambiosPresupuestoFlujoCaja.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosPresupuestoFlujoCaja"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarPresupuestoFlujoCaja.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarPresupuestoFlujoCaja"));
			
		this.jMenuItemNuevoGuardarCambiosPresupuestoFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosPresupuestoFlujoCaja"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosPresupuestoFlujoCaja.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosPresupuestoFlujoCaja"));

		this.jCheckBoxSeleccionadosPresupuestoFlujoCaja.addItemListener(new CheckBoxItemListener(this,"SeleccionadosPresupuestoFlujoCaja"));
		
		if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxTiposAccionesFormularioPresupuestoFlujoCaja.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPresupuestoFlujoCaja"));
		}
		
		
		this.jComboBoxTiposRelacionesPresupuestoFlujoCaja.addActionListener (new ButtonActionListener(this,"TiposRelacionesPresupuestoFlujoCaja"));
			
		this.jComboBoxTiposAccionesPresupuestoFlujoCaja.addActionListener (new ButtonActionListener(this,"TiposAccionesPresupuestoFlujoCaja"));
					
		this.jComboBoxTiposSeleccionarPresupuestoFlujoCaja.addActionListener (new ButtonActionListener(this,"TiposSeleccionarPresupuestoFlujoCaja"));
			
		this.jTextFieldValorCampoGeneralPresupuestoFlujoCaja.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralPresupuestoFlujoCaja"));		
		
		
		if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonidPresupuestoFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"idPresupuestoFlujoCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonid_empresaPresupuestoFlujoCajaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPresupuestoFlujoCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonid_empresaPresupuestoFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPresupuestoFlujoCajaBusqueda"));
		//jButtonid_cuenta_contablePresupuestoFlujoCaja.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contablePresupuestoFlujoCajaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonid_cuenta_contablePresupuestoFlujoCaja.addActionListener(new ButtonActionListener(this,"id_cuenta_contablePresupuestoFlujoCaja"));
		//jButtonid_cuenta_contablePresupuestoFlujoCajaArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContable("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonid_cuenta_contablePresupuestoFlujoCajaArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contablePresupuestoFlujoCajaArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonid_cuenta_contablePresupuestoFlujoCajaUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contablePresupuestoFlujoCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonid_cuenta_contablePresupuestoFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contablePresupuestoFlujoCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonid_ejercicioPresupuestoFlujoCajaUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioPresupuestoFlujoCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonid_ejercicioPresupuestoFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioPresupuestoFlujoCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonid_periodoPresupuestoFlujoCajaUpdate.addActionListener(new ButtonActionListener(this,"id_periodoPresupuestoFlujoCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonid_periodoPresupuestoFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoPresupuestoFlujoCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonid_centro_costoPresupuestoFlujoCajaUpdate.addActionListener(new ButtonActionListener(this,"id_centro_costoPresupuestoFlujoCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonid_centro_costoPresupuestoFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_centro_costoPresupuestoFlujoCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonvalorPresupuestoFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"valorPresupuestoFlujoCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonvalor_efectivoPresupuestoFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"valor_efectivoPresupuestoFlujoCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonporcentajePresupuestoFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"porcentajePresupuestoFlujoCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonfecha_presupuestoPresupuestoFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_presupuestoPresupuestoFlujoCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonfecha_procesoPresupuestoFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_procesoPresupuestoFlujoCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonobservacionPresupuestoFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"observacionPresupuestoFlujoCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonid_anioPresupuestoFlujoCajaUpdate.addActionListener(new ButtonActionListener(this,"id_anioPresupuestoFlujoCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonid_anioPresupuestoFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_anioPresupuestoFlujoCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonid_mesPresupuestoFlujoCajaUpdate.addActionListener(new ButtonActionListener(this,"id_mesPresupuestoFlujoCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonid_mesPresupuestoFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_mesPresupuestoFlujoCajaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdCentroCostoPresupuestoFlujoCaja.addActionListener(new ButtonActionListener(this,"FK_IdCentroCostoPresupuestoFlujoCaja"));

			this.jButtonFK_IdCuentaContablePresupuestoFlujoCaja.addActionListener(new ButtonActionListener(this,"FK_IdCuentaContablePresupuestoFlujoCaja"));

			this.jButtonBuscarFK_IdCuentaContableid_cuenta_contablePresupuestoFlujoCaja.addActionListener(new ButtonActionListener(this,"id_cuenta_contablePresupuestoFlujoCaja"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoPresupuestoFlujoCaja!=null) {
				this.jInternalFrameReporteDinamicoPresupuestoFlujoCaja.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPresupuestoFlujoCaja"));
				this.jInternalFrameReporteDinamicoPresupuestoFlujoCaja.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPresupuestoFlujoCaja"));
				this.jInternalFrameReporteDinamicoPresupuestoFlujoCaja.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPresupuestoFlujoCaja"));
			}
			
			//this.jButtonCerrarReporteDinamicoPresupuestoFlujoCaja.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPresupuestoFlujoCaja"));				
			//this.jButtonGenerarReporteDinamicoPresupuestoFlujoCaja.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPresupuestoFlujoCaja"));
			//this.jButtonGenerarExcelReporteDinamicoPresupuestoFlujoCaja.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPresupuestoFlujoCaja"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionPresupuestoFlujoCaja!=null) {
				this.jInternalFrameImportacionPresupuestoFlujoCaja.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPresupuestoFlujoCaja"));
				this.jInternalFrameImportacionPresupuestoFlujoCaja.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPresupuestoFlujoCaja"));
				this.jInternalFrameImportacionPresupuestoFlujoCaja.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPresupuestoFlujoCaja"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByPresupuestoFlujoCaja.addActionListener (new ButtonActionListener(this,"AbrirOrderByPresupuestoFlujoCaja"));
			
			this.jButtonAbrirOrderByToolBarPresupuestoFlujoCaja.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarPresupuestoFlujoCaja"));			
			
			if(this.jInternalFrameOrderByPresupuestoFlujoCaja!=null) {
				this.jInternalFrameOrderByPresupuestoFlujoCaja.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPresupuestoFlujoCaja"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jTabbedPaneRelacionesPresupuestoFlujoCaja.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPresupuestoFlujoCaja"));
		
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
            		closingInternalFramePresupuestoFlujoCaja();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormPresupuestoFlujoCaja = (JInternalFrameBase)event.getSource();
	            	
	            PresupuestoFlujoCajaBeanSwingJInternalFrame jInternalFrameParent=(PresupuestoFlujoCajaBeanSwingJInternalFrame)jInternalFrameDetalleFormPresupuestoFlujoCaja.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarPresupuestoFlujoCajaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosPresupuestoFlujoCaja.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosPresupuestoFlujoCajaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosPresupuestoFlujoCaja.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosPresupuestoFlujoCaja.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoPresupuestoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPresupuestoFlujoCajaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarPresupuestoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPresupuestoFlujoCajaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoPresupuestoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPresupuestoFlujoCajaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoPresupuestoFlujoCaja";
		inputMap = this.jButtonNuevoPresupuestoFlujoCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoPresupuestoFlujoCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPresupuestoFlujoCajaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesPresupuestoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPresupuestoFlujoCajaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarPresupuestoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPresupuestoFlujoCajaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesPresupuestoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPresupuestoFlujoCajaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesPresupuestoFlujoCaja";
		inputMap = this.jButtonNuevoRelacionesPresupuestoFlujoCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesPresupuestoFlujoCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPresupuestoFlujoCajaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarPresupuestoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPresupuestoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarPresupuestoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPresupuestoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarPresupuestoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPresupuestoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarPresupuestoFlujoCaja";
		inputMap = this.jButtonModificarPresupuestoFlujoCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarPresupuestoFlujoCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarPresupuestoFlujoCajaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarPresupuestoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPresupuestoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarPresupuestoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPresupuestoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarPresupuestoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPresupuestoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarPresupuestoFlujoCaja";
		inputMap = this.jButtonActualizarPresupuestoFlujoCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarPresupuestoFlujoCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarPresupuestoFlujoCajaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarPresupuestoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPresupuestoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarPresupuestoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPresupuestoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarPresupuestoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPresupuestoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarPresupuestoFlujoCaja";
		inputMap = this.jButtonEliminarPresupuestoFlujoCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarPresupuestoFlujoCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarPresupuestoFlujoCajaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarPresupuestoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPresupuestoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarPresupuestoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPresupuestoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarPresupuestoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPresupuestoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarPresupuestoFlujoCaja";
		inputMap = this.jButtonCancelarPresupuestoFlujoCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarPresupuestoFlujoCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarPresupuestoFlujoCajaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarPresupuestoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPresupuestoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarPresupuestoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPresupuestoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarPresupuestoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPresupuestoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarPresupuestoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarPresupuestoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarPresupuestoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarPresupuestoFlujoCaja";
		inputMap = this.jButtonCerrarPresupuestoFlujoCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarPresupuestoFlujoCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarPresupuestoFlujoCajaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonGuardarCambiosPresupuestoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPresupuestoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarPresupuestoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPresupuestoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosPresupuestoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPresupuestoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaPresupuestoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPresupuestoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarPresupuestoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPresupuestoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaPresupuestoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPresupuestoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosPresupuestoFlujoCaja";
		inputMap = this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonGuardarCambiosPresupuestoFlujoCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonGuardarCambiosPresupuestoFlujoCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosPresupuestoFlujoCajaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionPresupuestoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPresupuestoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarPresupuestoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPresupuestoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionPresupuestoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPresupuestoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresPresupuestoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPresupuestoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarPresupuestoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPresupuestoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresPresupuestoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPresupuestoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesPresupuestoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPresupuestoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarPresupuestoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPresupuestoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesPresupuestoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPresupuestoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosPresupuestoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPresupuestoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarPresupuestoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPresupuestoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosPresupuestoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPresupuestoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosPresupuestoFlujoCaja.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosPresupuestoFlujoCajaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesPresupuestoFlujoCaja.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesPresupuestoFlujoCajaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarPresupuestoFlujoCaja.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarPresupuestoFlujoCajaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralPresupuestoFlujoCaja.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralPresupuestoFlujoCajaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonidPresupuestoFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"idPresupuestoFlujoCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonid_empresaPresupuestoFlujoCajaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPresupuestoFlujoCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonid_empresaPresupuestoFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPresupuestoFlujoCajaBusqueda"));
		//jButtonid_cuenta_contablePresupuestoFlujoCaja.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contablePresupuestoFlujoCajaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonid_cuenta_contablePresupuestoFlujoCaja.addActionListener(new ButtonActionListener(this,"id_cuenta_contablePresupuestoFlujoCaja"));
		//jButtonid_cuenta_contablePresupuestoFlujoCajaArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContable("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonid_cuenta_contablePresupuestoFlujoCajaArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contablePresupuestoFlujoCajaArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonid_cuenta_contablePresupuestoFlujoCajaUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contablePresupuestoFlujoCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonid_cuenta_contablePresupuestoFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contablePresupuestoFlujoCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonid_ejercicioPresupuestoFlujoCajaUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioPresupuestoFlujoCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonid_ejercicioPresupuestoFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioPresupuestoFlujoCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonid_periodoPresupuestoFlujoCajaUpdate.addActionListener(new ButtonActionListener(this,"id_periodoPresupuestoFlujoCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonid_periodoPresupuestoFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoPresupuestoFlujoCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonid_centro_costoPresupuestoFlujoCajaUpdate.addActionListener(new ButtonActionListener(this,"id_centro_costoPresupuestoFlujoCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonid_centro_costoPresupuestoFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_centro_costoPresupuestoFlujoCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonvalorPresupuestoFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"valorPresupuestoFlujoCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonvalor_efectivoPresupuestoFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"valor_efectivoPresupuestoFlujoCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonporcentajePresupuestoFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"porcentajePresupuestoFlujoCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonfecha_presupuestoPresupuestoFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_presupuestoPresupuestoFlujoCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonfecha_procesoPresupuestoFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_procesoPresupuestoFlujoCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonobservacionPresupuestoFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"observacionPresupuestoFlujoCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonid_anioPresupuestoFlujoCajaUpdate.addActionListener(new ButtonActionListener(this,"id_anioPresupuestoFlujoCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonid_anioPresupuestoFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_anioPresupuestoFlujoCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonid_mesPresupuestoFlujoCajaUpdate.addActionListener(new ButtonActionListener(this,"id_mesPresupuestoFlujoCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonid_mesPresupuestoFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_mesPresupuestoFlujoCajaBusqueda"));
		
		
		this.jButtonFK_IdCentroCostoPresupuestoFlujoCaja.addActionListener(new ButtonActionListener(this,"FK_IdCentroCostoPresupuestoFlujoCaja"));

		this.jButtonFK_IdCuentaContablePresupuestoFlujoCaja.addActionListener(new ButtonActionListener(this,"FK_IdCuentaContablePresupuestoFlujoCaja"));

		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contablePresupuestoFlujoCaja.addActionListener(new ButtonActionListener(this,"id_cuenta_contablePresupuestoFlujoCaja"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoPresupuestoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoPresupuestoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoPresupuestoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoPresupuestoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoPresupuestoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoPresupuestoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionPresupuestoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionPresupuestoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionPresupuestoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionPresupuestoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionPresupuestoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionPresupuestoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarPresupuestoFlujoCajaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarPresupuestoFlujoCaja.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosPresupuestoFlujoCaja(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(PresupuestoFlujoCaja presupuestoflujocajaAux:this.presupuestoflujocajaLogic.getPresupuestoFlujoCajas()) {
					presupuestoflujocajaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PresupuestoFlujoCaja presupuestoflujocajaAux:presupuestoflujocajas) {
					presupuestoflujocajaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosPresupuestoFlujoCajaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPresupuestoFlujoCaja(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(PresupuestoFlujoCaja presupuestoflujocajaAux:this.presupuestoflujocajaLogic.getPresupuestoFlujoCajas()) {
						presupuestoflujocajaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PresupuestoFlujoCaja presupuestoflujocajaAux:presupuestoflujocajas) {
						presupuestoflujocajaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(PresupuestoFlujoCaja presupuestoflujocajaAux:this.presupuestoflujocajaLogic.getPresupuestoFlujoCajas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PresupuestoFlujoCaja presupuestoflujocajaAux:presupuestoflujocajas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaPresupuestoFlujoCaja(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPresupuestoFlujoCaja.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPresupuestoFlujoCaja.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoFlujoCaja,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosPresupuestoFlujoCajaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPresupuestoFlujoCaja(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosPresupuestoFlujoCaja.getSelectedRows();
			
			PresupuestoFlujoCaja presupuestoflujocajaLocal=new PresupuestoFlujoCaja();
			
			//this.seleccionarTodosPresupuestoFlujoCaja(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					presupuestoflujocajaLocal =(PresupuestoFlujoCaja) this.presupuestoflujocajaLogic.getPresupuestoFlujoCajas().toArray()[this.jTableDatosPresupuestoFlujoCaja.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					presupuestoflujocajaLocal =(PresupuestoFlujoCaja) this.presupuestoflujocajas.toArray()[this.jTableDatosPresupuestoFlujoCaja.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				presupuestoflujocajaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(PresupuestoFlujoCaja presupuestoflujocajaAux:this.presupuestoflujocajaLogic.getPresupuestoFlujoCajas()) {
						presupuestoflujocajaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PresupuestoFlujoCaja presupuestoflujocajaAux:presupuestoflujocajas) {
						presupuestoflujocajaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaPresupuestoFlujoCaja(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPresupuestoFlujoCaja.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPresupuestoFlujoCaja.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPresupuestoFlujoCaja,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualPresupuestoFlujoCajaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarPresupuestoFlujoCajaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralPresupuestoFlujoCajaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingPresupuestoFlujoCaja(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralPresupuestoFlujoCaja.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(PresupuestoFlujoCaja presupuestoflujocajaAux:this.presupuestoflujocajaLogic.getPresupuestoFlujoCajas()) {
				
						if(sTipoSeleccionar.equals(PresupuestoFlujoCajaConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							presupuestoflujocajaAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PresupuestoFlujoCajaConstantesFunciones.LABEL_VALOREFECTIVO)) {
							existe=true;
							presupuestoflujocajaAux.setvalor_efectivo(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PresupuestoFlujoCajaConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							presupuestoflujocajaAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PresupuestoFlujoCajaConstantesFunciones.LABEL_FECHAPRESUPUESTO)) {
							existe=true;
							presupuestoflujocajaAux.setfecha_presupuesto(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PresupuestoFlujoCajaConstantesFunciones.LABEL_FECHAPROCESO)) {
							existe=true;
							presupuestoflujocajaAux.setfecha_proceso(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PresupuestoFlujoCajaConstantesFunciones.LABEL_OBSERVACION)) {
							existe=true;
							presupuestoflujocajaAux.setobservacion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PresupuestoFlujoCaja presupuestoflujocajaAux:presupuestoflujocajas) {
					
						if(sTipoSeleccionar.equals(PresupuestoFlujoCajaConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							presupuestoflujocajaAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PresupuestoFlujoCajaConstantesFunciones.LABEL_VALOREFECTIVO)) {
							existe=true;
							presupuestoflujocajaAux.setvalor_efectivo(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PresupuestoFlujoCajaConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							presupuestoflujocajaAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PresupuestoFlujoCajaConstantesFunciones.LABEL_FECHAPRESUPUESTO)) {
							existe=true;
							presupuestoflujocajaAux.setfecha_presupuesto(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PresupuestoFlujoCajaConstantesFunciones.LABEL_FECHAPROCESO)) {
							existe=true;
							presupuestoflujocajaAux.setfecha_proceso(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PresupuestoFlujoCajaConstantesFunciones.LABEL_OBSERVACION)) {
							existe=true;
							presupuestoflujocajaAux.setobservacion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaPresupuestoFlujoCaja(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesPresupuestoFlujoCajaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingPresupuestoFlujoCaja(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioPresupuestoFlujoCaja=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesPresupuestoFlujoCaja.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxTiposAccionesFormularioPresupuestoFlujoCaja.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReportePresupuestoFlujoCaja) {				
					conSplash=true;//false;										
					
					//this.startProcessPresupuestoFlujoCaja(conSplash);
				
					this.generarReportePresupuestoFlujoCajasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPresupuestoFlujoCaja.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxTiposAccionesFormularioPresupuestoFlujoCaja.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoPresupuestoFlujoCajasSeleccionados();
				//this.jComboBoxTiposAccionesPresupuestoFlujoCaja.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPresupuestoFlujoCajasSeleccionados(false);
				//this.jComboBoxTiposAccionesPresupuestoFlujoCaja.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPresupuestoFlujoCajasSeleccionados(true);
				//this.jComboBoxTiposAccionesPresupuestoFlujoCaja.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPresupuestoFlujoCaja();
				
				this.exportarPresupuestoFlujoCajasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPresupuestoFlujoCaja.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxTiposAccionesFormularioPresupuestoFlujoCaja.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionPresupuestoFlujoCajas();
				//this.importarPresupuestoFlujoCajas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPresupuestoFlujoCaja.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxTiposAccionesFormularioPresupuestoFlujoCaja.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPresupuestoFlujoCaja();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelPresupuestoFlujoCajasSeleccionados();
				//this.jComboBoxTiposAccionesPresupuestoFlujoCaja.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Presupuesto Flujo Caja", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessPresupuestoFlujoCaja();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoPresupuestoFlujoCaja)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyPresupuestoFlujoCaja(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Presupuesto Flujo Caja",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPresupuestoFlujoCaja.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxTiposAccionesFormularioPresupuestoFlujoCaja.setSelectedIndex(0);					
				}	
			} 			
			else if(PresupuestoFlujoCajaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReportePresupuestoFlujoCaja) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessPresupuestoFlujoCaja(conSplash);
					
						//this.actualizarParametrosGeneralPresupuestoFlujoCaja();
						
						this.generarReporteProcesoAccionPresupuestoFlujoCajasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesPresupuestoFlujoCaja.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxTiposAccionesFormularioPresupuestoFlujoCaja.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(PresupuestoFlujoCajaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Presupuesto Flujo CajaS SELECCIONADOS?", "MANTENIMIENTO DE Presupuesto Flujo Caja", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessPresupuestoFlujoCaja();
				
						this.actualizarParametrosGeneralPresupuestoFlujoCaja();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.presupuestoflujocajaReturnGeneral=presupuestoflujocajaLogic.procesarAccionPresupuestoFlujoCajasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.presupuestoflujocajaLogic.getPresupuestoFlujoCajas(),this.presupuestoflujocajaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarPresupuestoFlujoCajaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPresupuestoFlujoCaja.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxTiposAccionesFormularioPresupuestoFlujoCaja.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralPresupuestoFlujoCaja();
					
					PresupuestoFlujoCajaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarPresupuestoFlujoCajaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPresupuestoFlujoCaja.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxTiposAccionesFormularioPresupuestoFlujoCaja.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessPresupuestoFlujoCaja(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesPresupuestoFlujoCajaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessPresupuestoFlujoCaja();
			
			if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<PresupuestoFlujoCaja> presupuestoflujocajasSeleccionados=new ArrayList<PresupuestoFlujoCaja>();		
			PresupuestoFlujoCaja presupuestoflujocaja=new PresupuestoFlujoCaja();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingPresupuestoFlujoCaja(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesPresupuestoFlujoCaja.getSelectedItem();
			
			
			
			
			presupuestoflujocajasSeleccionados=this.getPresupuestoFlujoCajasSeleccionados(true);
			//this.sTipoAccion;
			
			if(presupuestoflujocajasSeleccionados.size()==1) {
				for(PresupuestoFlujoCaja presupuestoflujocajaAux:presupuestoflujocajasSeleccionados) {
					presupuestoflujocaja=presupuestoflujocajaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessPresupuestoFlujoCaja();
			
      		//this.finishProcessPresupuestoFlujoCaja(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarPresupuestoFlujoCajaReturnGeneral() throws Exception {
		if(this.presupuestoflujocajaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.presupuestoflujocajaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.presupuestoflujocajaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.presupuestoflujocajaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.presupuestoflujocajaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.presupuestoflujocajaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingPresupuestoFlujoCaja(false);
		}
		
		if(this.presupuestoflujocajaReturnGeneral.getConRetornoLista() || this.presupuestoflujocajaReturnGeneral.getConRetornoObjeto()) {
			if(this.presupuestoflujocajaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.presupuestoflujocajaLogic.setPresupuestoFlujoCajas(this.presupuestoflujocajaReturnGeneral.getPresupuestoFlujoCajas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.presupuestoflujocajaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.presupuestoflujocajaLogic.setPresupuestoFlujoCaja(this.presupuestoflujocajaReturnGeneral.getPresupuestoFlujoCaja());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingPresupuestoFlujoCaja(false);
		}
	}
	
	public void actualizarParametrosGeneralPresupuestoFlujoCaja() throws Exception {
		
		
	}
	
	public ArrayList<PresupuestoFlujoCaja> getPresupuestoFlujoCajasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<PresupuestoFlujoCaja> presupuestoflujocajasSeleccionados=new ArrayList<PresupuestoFlujoCaja>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioPresupuestoFlujoCaja) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(PresupuestoFlujoCaja presupuestoflujocajaAux:presupuestoflujocajaLogic.getPresupuestoFlujoCajas()) {
					if(presupuestoflujocajaAux.getIsSelected()) {
						presupuestoflujocajasSeleccionados.add(presupuestoflujocajaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PresupuestoFlujoCaja presupuestoflujocajaAux:this.presupuestoflujocajas) {
					if(presupuestoflujocajaAux.getIsSelected()) {
						presupuestoflujocajasSeleccionados.add(presupuestoflujocajaAux);				
					}
				}
			}
			
			if(presupuestoflujocajasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						presupuestoflujocajasSeleccionados.addAll(this.presupuestoflujocajaLogic.getPresupuestoFlujoCajas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						presupuestoflujocajasSeleccionados.addAll(this.presupuestoflujocajas);				
					}
				}
			}
		} else {
			presupuestoflujocajasSeleccionados.add(this.presupuestoflujocaja);
		}
		
		return presupuestoflujocajasSeleccionados;
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
	
	public void generarReportePresupuestoFlujoCajasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalPresupuestoFlujoCajasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoPresupuestoFlujoCajasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPresupuestoFlujoCajasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPresupuestoFlujoCajasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Presupuesto Flujo Caja",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesPresupuestoFlujoCajasSeleccionados() throws Exception {
		ArrayList<PresupuestoFlujoCaja> presupuestoflujocajasSeleccionados=new ArrayList<PresupuestoFlujoCaja>();		
		
		presupuestoflujocajasSeleccionados=this.getPresupuestoFlujoCajasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReportePresupuestoFlujoCajas("Todos",presupuestoflujocajasSeleccionados);
		
	}	
	
	public void generarReporteNormalPresupuestoFlujoCajasSeleccionados() throws Exception {
		ArrayList<PresupuestoFlujoCaja> presupuestoflujocajasSeleccionados=new ArrayList<PresupuestoFlujoCaja>();		
		
		presupuestoflujocajasSeleccionados=this.getPresupuestoFlujoCajasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReportePresupuestoFlujoCajas("Todos",presupuestoflujocajasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionPresupuestoFlujoCajasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<PresupuestoFlujoCaja> presupuestoflujocajasSeleccionados=new ArrayList<PresupuestoFlujoCaja>();
		
		presupuestoflujocajasSeleccionados=this.getPresupuestoFlujoCajasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReportePresupuestoFlujoCajas("Todos",presupuestoflujocajasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoPresupuestoFlujoCajasSeleccionados() throws Exception {
		ArrayList<PresupuestoFlujoCaja> presupuestoflujocajasSeleccionados=new ArrayList<PresupuestoFlujoCaja>();		
		
		
		this.abrirInicializarFrameReporteDinamicoPresupuestoFlujoCaja();
		
		
		presupuestoflujocajasSeleccionados=this.getPresupuestoFlujoCajasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoPresupuestoFlujoCaja();
		
		
		//this.generarReportePresupuestoFlujoCajas("Todos",presupuestoflujocajasSeleccionados ,presupuestoflujocajaImplementable,presupuestoflujocajaImplementableHome);
	}
	
	public void mostrarImportacionPresupuestoFlujoCajas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionPresupuestoFlujoCaja();
		
		this.abrirFrameImportacionPresupuestoFlujoCaja();		
		
			
		//this.generarReportePresupuestoFlujoCajas("Todos",presupuestoflujocajasSeleccionados ,presupuestoflujocajaImplementable,presupuestoflujocajaImplementableHome);
	}
	
	public void importarPresupuestoFlujoCajas() throws Exception {		
	
	}
	
	public void exportarPresupuestoFlujoCajasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelPresupuestoFlujoCajasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoPresupuestoFlujoCajasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlPresupuestoFlujoCajasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Presupuesto Flujo Caja",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoPresupuestoFlujoCajasSeleccionados() throws Exception {
		ArrayList<PresupuestoFlujoCaja> presupuestoflujocajasSeleccionados=new ArrayList<PresupuestoFlujoCaja>();		
		
		presupuestoflujocajasSeleccionados=this.getPresupuestoFlujoCajasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presupuestoflujocaja."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarPresupuestoFlujoCaja(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(PresupuestoFlujoCaja presupuestoflujocajaAux:presupuestoflujocajasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarPresupuestoFlujoCaja(presupuestoflujocajaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//presupuestoflujocajaAux.setsDetalleGeneralEntityReporte(presupuestoflujocajaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Presupuesto Flujo Caja",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarPresupuestoFlujoCaja(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=PresupuestoFlujoCajaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresupuestoFlujoCajaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresupuestoFlujoCajaConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresupuestoFlujoCajaConstantesFunciones.LABEL_IDCUENTACONTABLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresupuestoFlujoCajaConstantesFunciones.LABEL_IDEJERCICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresupuestoFlujoCajaConstantesFunciones.LABEL_IDPERIODO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresupuestoFlujoCajaConstantesFunciones.LABEL_IDCENTROCOSTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresupuestoFlujoCajaConstantesFunciones.LABEL_VALOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresupuestoFlujoCajaConstantesFunciones.LABEL_VALOREFECTIVO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresupuestoFlujoCajaConstantesFunciones.LABEL_PORCENTAJE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresupuestoFlujoCajaConstantesFunciones.LABEL_FECHAPRESUPUESTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresupuestoFlujoCajaConstantesFunciones.LABEL_FECHAPROCESO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresupuestoFlujoCajaConstantesFunciones.LABEL_OBSERVACION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresupuestoFlujoCajaConstantesFunciones.LABEL_IDANIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresupuestoFlujoCajaConstantesFunciones.LABEL_IDMES;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarPresupuestoFlujoCaja(PresupuestoFlujoCaja presupuestoflujocaja,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=presupuestoflujocaja.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=presupuestoflujocaja.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=presupuestoflujocaja.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presupuestoflujocaja.getcuentacontable_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presupuestoflujocaja.getejercicio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presupuestoflujocaja.getperiodo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presupuestoflujocaja.getcentrocosto_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presupuestoflujocaja.getvalor().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presupuestoflujocaja.getvalor_efectivo().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presupuestoflujocaja.getporcentaje().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presupuestoflujocaja.getfecha_presupuesto().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presupuestoflujocaja.getfecha_proceso().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presupuestoflujocaja.getobservacion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presupuestoflujocaja.getanio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presupuestoflujocaja.getmes_descripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelPresupuestoFlujoCajasSeleccionados() throws Exception {
		ArrayList<PresupuestoFlujoCaja> presupuestoflujocajasSeleccionados=new ArrayList<PresupuestoFlujoCaja>();		
		
		presupuestoflujocajasSeleccionados=this.getPresupuestoFlujoCajasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presupuestoflujocaja.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("PresupuestoFlujoCajas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelPresupuestoFlujoCaja(row);				
				iRow++;
			}				
			
			for(PresupuestoFlujoCaja presupuestoflujocajaAux:presupuestoflujocajasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelPresupuestoFlujoCaja(presupuestoflujocajaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Presupuesto Flujo Caja",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlPresupuestoFlujoCajasSeleccionados() throws Exception {
		ArrayList<PresupuestoFlujoCaja> presupuestoflujocajasSeleccionados=new ArrayList<PresupuestoFlujoCaja>();		
		
		presupuestoflujocajasSeleccionados=this.getPresupuestoFlujoCajasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presupuestoflujocaja.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("presupuestoflujocajas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("presupuestoflujocaja");
			//elementRoot.appendChild(element);
		
			for(PresupuestoFlujoCaja presupuestoflujocajaAux:presupuestoflujocajasSeleccionados) {
				element = document.createElement("presupuestoflujocaja");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlPresupuestoFlujoCaja(presupuestoflujocajaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Presupuesto Flujo Caja",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelPresupuestoFlujoCaja(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(PresupuestoFlujoCajaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(PresupuestoFlujoCajaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(PresupuestoFlujoCajaConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(PresupuestoFlujoCajaConstantesFunciones.LABEL_IDCUENTACONTABLE);
		cell = row.createCell(iColumn++);cell.setCellValue(PresupuestoFlujoCajaConstantesFunciones.LABEL_IDEJERCICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(PresupuestoFlujoCajaConstantesFunciones.LABEL_IDPERIODO);
		cell = row.createCell(iColumn++);cell.setCellValue(PresupuestoFlujoCajaConstantesFunciones.LABEL_IDCENTROCOSTO);
		cell = row.createCell(iColumn++);cell.setCellValue(PresupuestoFlujoCajaConstantesFunciones.LABEL_VALOR);
		cell = row.createCell(iColumn++);cell.setCellValue(PresupuestoFlujoCajaConstantesFunciones.LABEL_VALOREFECTIVO);
		cell = row.createCell(iColumn++);cell.setCellValue(PresupuestoFlujoCajaConstantesFunciones.LABEL_PORCENTAJE);
		cell = row.createCell(iColumn++);cell.setCellValue(PresupuestoFlujoCajaConstantesFunciones.LABEL_FECHAPRESUPUESTO);
		cell = row.createCell(iColumn++);cell.setCellValue(PresupuestoFlujoCajaConstantesFunciones.LABEL_FECHAPROCESO);
		cell = row.createCell(iColumn++);cell.setCellValue(PresupuestoFlujoCajaConstantesFunciones.LABEL_OBSERVACION);
		cell = row.createCell(iColumn++);cell.setCellValue(PresupuestoFlujoCajaConstantesFunciones.LABEL_IDANIO);
		cell = row.createCell(iColumn++);cell.setCellValue(PresupuestoFlujoCajaConstantesFunciones.LABEL_IDMES);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelPresupuestoFlujoCaja(PresupuestoFlujoCaja presupuestoflujocaja,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(presupuestoflujocaja.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(presupuestoflujocaja.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(presupuestoflujocaja.getcuentacontable_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(presupuestoflujocaja.getejercicio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(presupuestoflujocaja.getperiodo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(presupuestoflujocaja.getcentrocosto_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(presupuestoflujocaja.getvalor());
		cell = row.createCell(iColumn++);cell.setCellValue(presupuestoflujocaja.getvalor_efectivo());
		cell = row.createCell(iColumn++);cell.setCellValue(presupuestoflujocaja.getporcentaje());
		cell = row.createCell(iColumn++);cell.setCellValue(presupuestoflujocaja.getfecha_presupuesto());
		cell = row.createCell(iColumn++);cell.setCellValue(presupuestoflujocaja.getfecha_proceso());
		cell = row.createCell(iColumn++);cell.setCellValue(presupuestoflujocaja.getobservacion());
		cell = row.createCell(iColumn++);cell.setCellValue(presupuestoflujocaja.getanio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(presupuestoflujocaja.getmes_descripcion());				
	}
	
	public void setFilaDatosExportarXmlPresupuestoFlujoCaja(PresupuestoFlujoCaja presupuestoflujocaja,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(PresupuestoFlujoCajaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(presupuestoflujocaja.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(PresupuestoFlujoCajaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(presupuestoflujocaja.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(PresupuestoFlujoCajaConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(presupuestoflujocaja.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcuentacontable_descripcion = document.createElement(PresupuestoFlujoCajaConstantesFunciones.IDCUENTACONTABLE);
		elementcuentacontable_descripcion.appendChild(document.createTextNode(presupuestoflujocaja.getcuentacontable_descripcion()));
		element.appendChild(elementcuentacontable_descripcion);

		Element elementejercicio_descripcion = document.createElement(PresupuestoFlujoCajaConstantesFunciones.IDEJERCICIO);
		elementejercicio_descripcion.appendChild(document.createTextNode(presupuestoflujocaja.getejercicio_descripcion()));
		element.appendChild(elementejercicio_descripcion);

		Element elementperiodo_descripcion = document.createElement(PresupuestoFlujoCajaConstantesFunciones.IDPERIODO);
		elementperiodo_descripcion.appendChild(document.createTextNode(presupuestoflujocaja.getperiodo_descripcion()));
		element.appendChild(elementperiodo_descripcion);

		Element elementcentrocosto_descripcion = document.createElement(PresupuestoFlujoCajaConstantesFunciones.IDCENTROCOSTO);
		elementcentrocosto_descripcion.appendChild(document.createTextNode(presupuestoflujocaja.getcentrocosto_descripcion()));
		element.appendChild(elementcentrocosto_descripcion);

		Element elementvalor = document.createElement(PresupuestoFlujoCajaConstantesFunciones.VALOR);
		elementvalor.appendChild(document.createTextNode(presupuestoflujocaja.getvalor().toString().trim()));
		element.appendChild(elementvalor);

		Element elementvalor_efectivo = document.createElement(PresupuestoFlujoCajaConstantesFunciones.VALOREFECTIVO);
		elementvalor_efectivo.appendChild(document.createTextNode(presupuestoflujocaja.getvalor_efectivo().toString().trim()));
		element.appendChild(elementvalor_efectivo);

		Element elementporcentaje = document.createElement(PresupuestoFlujoCajaConstantesFunciones.PORCENTAJE);
		elementporcentaje.appendChild(document.createTextNode(presupuestoflujocaja.getporcentaje().toString().trim()));
		element.appendChild(elementporcentaje);

		Element elementfecha_presupuesto = document.createElement(PresupuestoFlujoCajaConstantesFunciones.FECHAPRESUPUESTO);
		elementfecha_presupuesto.appendChild(document.createTextNode(presupuestoflujocaja.getfecha_presupuesto().toString().trim()));
		element.appendChild(elementfecha_presupuesto);

		Element elementfecha_proceso = document.createElement(PresupuestoFlujoCajaConstantesFunciones.FECHAPROCESO);
		elementfecha_proceso.appendChild(document.createTextNode(presupuestoflujocaja.getfecha_proceso().toString().trim()));
		element.appendChild(elementfecha_proceso);

		Element elementobservacion = document.createElement(PresupuestoFlujoCajaConstantesFunciones.OBSERVACION);
		elementobservacion.appendChild(document.createTextNode(presupuestoflujocaja.getobservacion().trim()));
		element.appendChild(elementobservacion);

		Element elementanio_descripcion = document.createElement(PresupuestoFlujoCajaConstantesFunciones.IDANIO);
		elementanio_descripcion.appendChild(document.createTextNode(presupuestoflujocaja.getanio_descripcion()));
		element.appendChild(elementanio_descripcion);

		Element elementmes_descripcion = document.createElement(PresupuestoFlujoCajaConstantesFunciones.IDMES);
		elementmes_descripcion.appendChild(document.createTextNode(presupuestoflujocaja.getmes_descripcion()));
		element.appendChild(elementmes_descripcion);
	}
	
	public void generarReporteGroupGenericoPresupuestoFlujoCajasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<PresupuestoFlujoCaja> presupuestoflujocajasSeleccionados=new ArrayList<PresupuestoFlujoCaja>();
		
		presupuestoflujocajasSeleccionados=this.getPresupuestoFlujoCajasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoPresupuestoFlujoCaja(presupuestoflujocajasSeleccionados);
		
		this.generarReportePresupuestoFlujoCajas("Todos",presupuestoflujocajasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoPresupuestoFlujoCaja(ArrayList<PresupuestoFlujoCaja> presupuestoflujocajasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(PresupuestoFlujoCaja presupuestoflujocajaAux:presupuestoflujocajasSeleccionados) {
				presupuestoflujocajaAux.setsDetalleGeneralEntityReporte(presupuestoflujocajaAux.toString());
			
				if(sTipoSeleccionar.equals(PresupuestoFlujoCajaConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					presupuestoflujocajaAux.setsDescripcionGeneralEntityReporte1(presupuestoflujocajaAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PresupuestoFlujoCajaConstantesFunciones.LABEL_IDCUENTACONTABLE)) {
					existe=true;
					presupuestoflujocajaAux.setsDescripcionGeneralEntityReporte1(presupuestoflujocajaAux.getcuentacontable_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PresupuestoFlujoCajaConstantesFunciones.LABEL_IDEJERCICIO)) {
					existe=true;
					presupuestoflujocajaAux.setsDescripcionGeneralEntityReporte1(presupuestoflujocajaAux.getejercicio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PresupuestoFlujoCajaConstantesFunciones.LABEL_IDPERIODO)) {
					existe=true;
					presupuestoflujocajaAux.setsDescripcionGeneralEntityReporte1(presupuestoflujocajaAux.getperiodo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PresupuestoFlujoCajaConstantesFunciones.LABEL_IDCENTROCOSTO)) {
					existe=true;
					presupuestoflujocajaAux.setsDescripcionGeneralEntityReporte1(presupuestoflujocajaAux.getcentrocosto_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PresupuestoFlujoCajaConstantesFunciones.LABEL_FECHAPRESUPUESTO)) {
					existe=true;
					presupuestoflujocajaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(presupuestoflujocajaAux.getfecha_presupuesto()));
				}
				 else if(sTipoSeleccionar.equals(PresupuestoFlujoCajaConstantesFunciones.LABEL_FECHAPROCESO)) {
					existe=true;
					presupuestoflujocajaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(presupuestoflujocajaAux.getfecha_proceso()));
				}
				 else if(sTipoSeleccionar.equals(PresupuestoFlujoCajaConstantesFunciones.LABEL_OBSERVACION)) {
					existe=true;
					presupuestoflujocajaAux.setsDescripcionGeneralEntityReporte1(presupuestoflujocajaAux.getobservacion());
				}
				 else if(sTipoSeleccionar.equals(PresupuestoFlujoCajaConstantesFunciones.LABEL_IDANIO)) {
					existe=true;
					presupuestoflujocajaAux.setsDescripcionGeneralEntityReporte1(presupuestoflujocajaAux.getanio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PresupuestoFlujoCajaConstantesFunciones.LABEL_IDMES)) {
					existe=true;
					presupuestoflujocajaAux.setsDescripcionGeneralEntityReporte1(presupuestoflujocajaAux.getmes_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresupuestoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesPresupuestoFlujoCaja(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoPresupuestoFlujoCaja=true;
				this.isVisibilidadCeldaNuevoRelacionesPresupuestoFlujoCaja=true;
				this.isVisibilidadCeldaGuardarCambiosPresupuestoFlujoCaja=true;
			}
			
			this.isVisibilidadCeldaModificarPresupuestoFlujoCaja=false;
			this.isVisibilidadCeldaActualizarPresupuestoFlujoCaja=false;
			this.isVisibilidadCeldaEliminarPresupuestoFlujoCaja=false;
			this.isVisibilidadCeldaCancelarPresupuestoFlujoCaja=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresupuestoFlujoCaja=true;
				} else {
					this.isVisibilidadCeldaGuardarPresupuestoFlujoCaja=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoPresupuestoFlujoCaja=false;
			this.isVisibilidadCeldaNuevoRelacionesPresupuestoFlujoCaja=false;
			this.isVisibilidadCeldaGuardarCambiosPresupuestoFlujoCaja=false;
			this.isVisibilidadCeldaModificarPresupuestoFlujoCaja=false;
			this.isVisibilidadCeldaActualizarPresupuestoFlujoCaja=true;
			this.isVisibilidadCeldaEliminarPresupuestoFlujoCaja=false;
			this.isVisibilidadCeldaCancelarPresupuestoFlujoCaja=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresupuestoFlujoCaja=true;
				} else {
					this.isVisibilidadCeldaGuardarPresupuestoFlujoCaja=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoPresupuestoFlujoCaja=false;
			this.isVisibilidadCeldaNuevoRelacionesPresupuestoFlujoCaja=false;
			this.isVisibilidadCeldaGuardarCambiosPresupuestoFlujoCaja=false;
			this.isVisibilidadCeldaModificarPresupuestoFlujoCaja=false;
			this.isVisibilidadCeldaActualizarPresupuestoFlujoCaja=true;
			this.isVisibilidadCeldaEliminarPresupuestoFlujoCaja=true;
			this.isVisibilidadCeldaCancelarPresupuestoFlujoCaja=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresupuestoFlujoCaja=true;
				} else {
					this.isVisibilidadCeldaGuardarPresupuestoFlujoCaja=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoPresupuestoFlujoCaja=false;
			this.isVisibilidadCeldaNuevoRelacionesPresupuestoFlujoCaja=false;
			this.isVisibilidadCeldaGuardarCambiosPresupuestoFlujoCaja=false;
			this.isVisibilidadCeldaModificarPresupuestoFlujoCaja=false;
			this.isVisibilidadCeldaActualizarPresupuestoFlujoCaja=true;
			this.isVisibilidadCeldaEliminarPresupuestoFlujoCaja=false;
			this.isVisibilidadCeldaCancelarPresupuestoFlujoCaja=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresupuestoFlujoCaja=false;
				} else {
					this.isVisibilidadCeldaGuardarPresupuestoFlujoCaja=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoPresupuestoFlujoCaja=true;
			this.isVisibilidadCeldaNuevoRelacionesPresupuestoFlujoCaja=true;
			this.isVisibilidadCeldaGuardarCambiosPresupuestoFlujoCaja=true;
			this.isVisibilidadCeldaModificarPresupuestoFlujoCaja=false;
			this.isVisibilidadCeldaActualizarPresupuestoFlujoCaja=false;
			this.isVisibilidadCeldaEliminarPresupuestoFlujoCaja=false;
			this.isVisibilidadCeldaCancelarPresupuestoFlujoCaja=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresupuestoFlujoCaja=true;
				} else {
					this.isVisibilidadCeldaGuardarPresupuestoFlujoCaja=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoPresupuestoFlujoCaja=false;
			this.isVisibilidadCeldaNuevoRelacionesPresupuestoFlujoCaja=false;
			this.isVisibilidadCeldaGuardarCambiosPresupuestoFlujoCaja=false;
			this.isVisibilidadCeldaActualizarPresupuestoFlujoCaja=false;
			this.isVisibilidadCeldaEliminarPresupuestoFlujoCaja=false;
			this.isVisibilidadCeldaCancelarPresupuestoFlujoCaja=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresupuestoFlujoCaja=false;
				} else {
					this.isVisibilidadCeldaGuardarPresupuestoFlujoCaja=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoPresupuestoFlujoCaja=false;
			this.isVisibilidadCeldaNuevoRelacionesPresupuestoFlujoCaja=false;
			this.isVisibilidadCeldaGuardarCambiosPresupuestoFlujoCaja=false;
			this.isVisibilidadCeldaModificarPresupuestoFlujoCaja=true;
			this.isVisibilidadCeldaActualizarPresupuestoFlujoCaja=false;
			this.isVisibilidadCeldaEliminarPresupuestoFlujoCaja=false;
			this.isVisibilidadCeldaCancelarPresupuestoFlujoCaja=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresupuestoFlujoCaja=false;
				} else {
					this.isVisibilidadCeldaGuardarPresupuestoFlujoCaja=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(PresupuestoFlujoCajaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoPresupuestoFlujoCaja=true;
			this.isVisibilidadCeldaNuevoRelacionesPresupuestoFlujoCaja=true;
			this.isVisibilidadCeldaGuardarCambiosPresupuestoFlujoCaja=true;
		} else {
			this.actualizarEstadoPanelsPresupuestoFlujoCaja(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarPresupuestoFlujoCaja=false;
			//this.isVisibilidadCeldaVerFormPresupuestoFlujoCaja=false;
			this.isVisibilidadCeldaDuplicarPresupuestoFlujoCaja=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!presupuestoflujocajaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesPresupuestoFlujoCaja=false;
		} else {
			this.isVisibilidadCeldaNuevoPresupuestoFlujoCaja=false;
			this.isVisibilidadCeldaGuardarCambiosPresupuestoFlujoCaja=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(presupuestoflujocajaSessionBean.getEsGuardarRelacionado()) {
			if(!presupuestoflujocajaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesPresupuestoFlujoCaja=false;												
			}
			
			this.jButtonCerrarPresupuestoFlujoCaja.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesPresupuestoFlujoCaja=false;
		}
		
		if(!this.permiteMantenimiento(this.presupuestoflujocaja)) {
			this.isVisibilidadCeldaActualizarPresupuestoFlujoCaja=false;
			this.isVisibilidadCeldaEliminarPresupuestoFlujoCaja=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesPresupuestoFlujoCaja() {
	}
	
	public void actualizarEstadoPanelsPresupuestoFlujoCaja(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionPresupuestoFlujoCaja!=null) {
				this.jScrollPanelDatosEdicionPresupuestoFlujoCaja.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresupuestoFlujoCaja!=null) {
				this.jTabbedPaneBusquedasPresupuestoFlujoCaja.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPresupuestoFlujoCaja!=null) {
				this.jScrollPanelDatosPresupuestoFlujoCaja.setVisible(true);
			}
			
			if(this.jPanelPaginacionPresupuestoFlujoCaja!=null) {
				this.jPanelPaginacionPresupuestoFlujoCaja.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPresupuestoFlujoCaja!=null) {
				this.jPanelParametrosReportesPresupuestoFlujoCaja.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionPresupuestoFlujoCaja!=null) {
				this.jScrollPanelDatosEdicionPresupuestoFlujoCaja.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresupuestoFlujoCaja!=null) {
				this.jTabbedPaneBusquedasPresupuestoFlujoCaja.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosPresupuestoFlujoCaja!=null) {
				this.jScrollPanelDatosPresupuestoFlujoCaja.setVisible(false);
			}
			
			if(this.jPanelPaginacionPresupuestoFlujoCaja!=null) {
				this.jPanelPaginacionPresupuestoFlujoCaja.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPresupuestoFlujoCaja!=null) {
				this.jPanelParametrosReportesPresupuestoFlujoCaja.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionPresupuestoFlujoCaja!=null) {
				this.jScrollPanelDatosEdicionPresupuestoFlujoCaja.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresupuestoFlujoCaja!=null) {
				this.jTabbedPaneBusquedasPresupuestoFlujoCaja.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPresupuestoFlujoCaja!=null) {
				this.jScrollPanelDatosPresupuestoFlujoCaja.setVisible(false);
			}
			
			if(this.jPanelPaginacionPresupuestoFlujoCaja!=null) {
				this.jPanelPaginacionPresupuestoFlujoCaja.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPresupuestoFlujoCaja!=null) {
				this.jPanelParametrosReportesPresupuestoFlujoCaja.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionPresupuestoFlujoCaja!=null) {
				this.jScrollPanelDatosEdicionPresupuestoFlujoCaja.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresupuestoFlujoCaja!=null) {
				this.jTabbedPaneBusquedasPresupuestoFlujoCaja.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPresupuestoFlujoCaja!=null) {
				this.jScrollPanelDatosPresupuestoFlujoCaja.setVisible(false);
			}
			
			if(this.jPanelPaginacionPresupuestoFlujoCaja!=null) {
				this.jPanelPaginacionPresupuestoFlujoCaja.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPresupuestoFlujoCaja!=null) {
				this.jPanelParametrosReportesPresupuestoFlujoCaja.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionPresupuestoFlujoCaja!=null) {
				this.jScrollPanelDatosEdicionPresupuestoFlujoCaja.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresupuestoFlujoCaja!=null) {
				this.jTabbedPaneBusquedasPresupuestoFlujoCaja.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPresupuestoFlujoCaja!=null) {
				this.jScrollPanelDatosPresupuestoFlujoCaja.setVisible(true);
			}
			
			if(this.jPanelPaginacionPresupuestoFlujoCaja!=null) {
				this.jPanelPaginacionPresupuestoFlujoCaja.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPresupuestoFlujoCaja!=null) {
				this.jPanelParametrosReportesPresupuestoFlujoCaja.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionPresupuestoFlujoCaja!=null) {
				this.jScrollPanelDatosEdicionPresupuestoFlujoCaja.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresupuestoFlujoCaja!=null) {
				this.jTabbedPaneBusquedasPresupuestoFlujoCaja.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPresupuestoFlujoCaja!=null) {
				this.jScrollPanelDatosPresupuestoFlujoCaja.setVisible(true);
			}
			
			if(this.jPanelPaginacionPresupuestoFlujoCaja!=null) {
				this.jPanelPaginacionPresupuestoFlujoCaja.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPresupuestoFlujoCaja!=null) {
				this.jPanelParametrosReportesPresupuestoFlujoCaja.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionPresupuestoFlujoCaja!=null) {
				this.jScrollPanelDatosEdicionPresupuestoFlujoCaja.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresupuestoFlujoCaja!=null) {
				this.jTabbedPaneBusquedasPresupuestoFlujoCaja.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPresupuestoFlujoCaja!=null) {
				this.jScrollPanelDatosPresupuestoFlujoCaja.setVisible(true);
			}
			
			if(this.jPanelPaginacionPresupuestoFlujoCaja!=null) {
				this.jPanelPaginacionPresupuestoFlujoCaja.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPresupuestoFlujoCaja!=null) {
				this.jPanelParametrosReportesPresupuestoFlujoCaja.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasPresupuestoFlujoCaja!=null) {
					this.jTabbedPaneBusquedasPresupuestoFlujoCaja.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesPresupuestoFlujoCaja!=null) {
				this.jPanelParametrosReportesPresupuestoFlujoCaja.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.presupuestoflujocajaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresupuestoFlujoCaja!=null) {
				this.jTabbedPaneBusquedasPresupuestoFlujoCaja.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesPresupuestoFlujoCaja!=null) {
				this.jPanelParametrosReportesPresupuestoFlujoCaja.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdCentroCosto=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCentroCosto) {this.jTabbedPaneBusquedasPresupuestoFlujoCaja.remove(jPanelFK_IdCentroCostoPresupuestoFlujoCaja);}

			this.isVisibilidadFK_IdCuentaContable=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasPresupuestoFlujoCaja.remove(jPanelFK_IdCuentaContablePresupuestoFlujoCaja);}
		}
		
	}

	public void setVisibilidadBusquedasParaCuentaContable(Boolean isParaCuentaContable){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCuentaContableNegation=!isParaCuentaContable;

			this.isVisibilidadFK_IdCentroCosto=isParaCuentaContableNegation;
			if(!this.isVisibilidadFK_IdCentroCosto) {this.jTabbedPaneBusquedasPresupuestoFlujoCaja.remove(jPanelFK_IdCentroCostoPresupuestoFlujoCaja);}

			this.isVisibilidadFK_IdCuentaContable=isParaCuentaContable;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasPresupuestoFlujoCaja.remove(jPanelFK_IdCuentaContablePresupuestoFlujoCaja);}
		}
		
	}

	public void setVisibilidadBusquedasParaEjercicio(Boolean isParaEjercicio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEjercicioNegation=!isParaEjercicio;

			this.isVisibilidadFK_IdCentroCosto=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdCentroCosto) {this.jTabbedPaneBusquedasPresupuestoFlujoCaja.remove(jPanelFK_IdCentroCostoPresupuestoFlujoCaja);}

			this.isVisibilidadFK_IdCuentaContable=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasPresupuestoFlujoCaja.remove(jPanelFK_IdCuentaContablePresupuestoFlujoCaja);}
		}
		
	}

	public void setVisibilidadBusquedasParaPeriodo(Boolean isParaPeriodo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPeriodoNegation=!isParaPeriodo;

			this.isVisibilidadFK_IdCentroCosto=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdCentroCosto) {this.jTabbedPaneBusquedasPresupuestoFlujoCaja.remove(jPanelFK_IdCentroCostoPresupuestoFlujoCaja);}

			this.isVisibilidadFK_IdCuentaContable=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasPresupuestoFlujoCaja.remove(jPanelFK_IdCuentaContablePresupuestoFlujoCaja);}
		}
		
	}

	public void setVisibilidadBusquedasParaCentroCosto(Boolean isParaCentroCosto){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCentroCostoNegation=!isParaCentroCosto;

			this.isVisibilidadFK_IdCentroCosto=isParaCentroCosto;
			if(!this.isVisibilidadFK_IdCentroCosto) {this.jTabbedPaneBusquedasPresupuestoFlujoCaja.remove(jPanelFK_IdCentroCostoPresupuestoFlujoCaja);}

			this.isVisibilidadFK_IdCuentaContable=isParaCentroCostoNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasPresupuestoFlujoCaja.remove(jPanelFK_IdCuentaContablePresupuestoFlujoCaja);}
		}
		
	}

	public void setVisibilidadBusquedasParaAnio(Boolean isParaAnio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaAnioNegation=!isParaAnio;

			this.isVisibilidadFK_IdCentroCosto=isParaAnioNegation;
			if(!this.isVisibilidadFK_IdCentroCosto) {this.jTabbedPaneBusquedasPresupuestoFlujoCaja.remove(jPanelFK_IdCentroCostoPresupuestoFlujoCaja);}

			this.isVisibilidadFK_IdCuentaContable=isParaAnioNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasPresupuestoFlujoCaja.remove(jPanelFK_IdCuentaContablePresupuestoFlujoCaja);}
		}
		
	}

	public void setVisibilidadBusquedasParaMes(Boolean isParaMes){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaMesNegation=!isParaMes;

			this.isVisibilidadFK_IdCentroCosto=isParaMesNegation;
			if(!this.isVisibilidadFK_IdCentroCosto) {this.jTabbedPaneBusquedasPresupuestoFlujoCaja.remove(jPanelFK_IdCentroCostoPresupuestoFlujoCaja);}

			this.isVisibilidadFK_IdCuentaContable=isParaMesNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasPresupuestoFlujoCaja.remove(jPanelFK_IdCuentaContablePresupuestoFlujoCaja);}
		}
		
	}
	
	
	
	

	public String registrarSesionPresupuestoFlujoCajaParaBusquedaCuentaContables() throws Exception {
		Boolean isPaginaPopupCuentaContable=false;

		try {

			if(presupuestoflujocajaSessionBean==null) {
				presupuestoflujocajaSessionBean=new PresupuestoFlujoCajaSessionBean();
			}

			if(cuentacontableSessionBean==null) {
				cuentacontableSessionBean=new CuentaContableSessionBean();
			}

			cuentacontableSessionBean.setsPathNavegacionActual(presupuestoflujocajaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+CuentaContableConstantesFunciones.SCLASSWEBTITULO);
			cuentacontableSessionBean.setisPermiteRecargarInformacion(false);
			cuentacontableSessionBean.setisPaginaPopup(true);
			isPaginaPopupCuentaContable=cuentacontableSessionBean.getisPaginaPopup();
			cuentacontableSessionBean.setisPaginaPopup(false);
			cuentacontableSessionBean.setEstaModoBusqueda(true);
			cuentacontableSessionBean.setsFuncionBusquedaRapida("window.opener.presupuestoflujocajaFuncionGeneral.setCombosCodigoDesdeBusquedaid_cuenta_contable(TO_REPLACE);");
			cuentacontableSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCuentaContable(true);
			cuentacontableSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaContable(PresupuestoFlujoCajaConstantesFunciones.SNOMBREOPCION);
			//cuentacontableSessionBean.setisBusquedaDesdeForeignKeySesionPresupuestoFlujoCaja(true);
			//cuentacontableSessionBean.setlidPresupuestoFlujoCajaActual(this.idPresupuestoFlujoCajaActual);

			presupuestoflujocajaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyPresupuestoFlujoCaja(true);
			presupuestoflujocajaSessionBean.setlIdPresupuestoFlujoCajaActualForeignKey(this.idPresupuestoFlujoCajaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//PresupuestoFlujoCajaSessionBean presupuestoflujocajaSessionBean=new PresupuestoFlujoCajaSessionBean();
		
		if(this.presupuestoflujocajaSessionBean==null) {
			this.presupuestoflujocajaSessionBean=new PresupuestoFlujoCajaSessionBean();
		}
		
		this.presupuestoflujocajaSessionBean.setsUltimaBusquedaPresupuestoFlujoCaja(this.getsAccionBusqueda());
		this.presupuestoflujocajaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.presupuestoflujocajaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdCentroCosto")) {
			presupuestoflujocajaSessionBean.setid_centro_costo(this.getid_centro_costoFK_IdCentroCosto());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdCuentaContable")) {
			presupuestoflujocajaSessionBean.setid_cuenta_contable(this.getid_cuenta_contableFK_IdCuentaContable());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEjercicio")) {
			presupuestoflujocajaSessionBean.setid_ejercicio(this.getid_ejercicioFK_IdEjercicio());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			presupuestoflujocajaSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdPeriodo")) {
			presupuestoflujocajaSessionBean.setid_periodo(this.getid_periodoFK_IdPeriodo());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//PresupuestoFlujoCajaSessionBean presupuestoflujocajaSessionBean=new PresupuestoFlujoCajaSessionBean();
		
		if(this.presupuestoflujocajaSessionBean==null) {
			this.presupuestoflujocajaSessionBean=new PresupuestoFlujoCajaSessionBean();
		}
		
		if(this.presupuestoflujocajaSessionBean.getsUltimaBusquedaPresupuestoFlujoCaja()!=null&&!this.presupuestoflujocajaSessionBean.getsUltimaBusquedaPresupuestoFlujoCaja().equals("")) {
			this.setsAccionBusqueda(presupuestoflujocajaSessionBean.getsUltimaBusquedaPresupuestoFlujoCaja());
			this.setiNumeroPaginacion(presupuestoflujocajaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(presupuestoflujocajaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdCentroCosto")) {
				this.setid_centro_costoFK_IdCentroCosto(presupuestoflujocajaSessionBean.getid_centro_costo());
				presupuestoflujocajaSessionBean.setid_centro_costo(null);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdCuentaContable")) {
				this.setid_cuenta_contableFK_IdCuentaContable(presupuestoflujocajaSessionBean.getid_cuenta_contable());
				presupuestoflujocajaSessionBean.setid_cuenta_contable(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEjercicio")) {
				this.setid_ejercicioFK_IdEjercicio(presupuestoflujocajaSessionBean.getid_ejercicio());
				presupuestoflujocajaSessionBean.setid_ejercicio(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(presupuestoflujocajaSessionBean.getid_empresa());
				presupuestoflujocajaSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdPeriodo")) {
				this.setid_periodoFK_IdPeriodo(presupuestoflujocajaSessionBean.getid_periodo());
				presupuestoflujocajaSessionBean.setid_periodo(-1L);
			}
		}
		
		this.presupuestoflujocajaSessionBean.setsUltimaBusquedaPresupuestoFlujoCaja("");
		this.presupuestoflujocajaSessionBean.setiNumeroPaginacion(PresupuestoFlujoCajaConstantesFunciones.INUMEROPAGINACION);
		this.presupuestoflujocajaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaPresupuestoFlujoCaja(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioPresupuestoFlujoCaja() {
		this.updateBorderResaltarBusquedasFormularioPresupuestoFlujoCaja();
		this.updateVisibilidadBusquedasFormularioPresupuestoFlujoCaja();
		this.updateHabilitarBusquedasFormularioPresupuestoFlujoCaja();
	}
	
	public void updateBorderResaltarBusquedasFormularioPresupuestoFlujoCaja() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasPresupuestoFlujoCaja.getComponents().length>0) {
	

		if(this.presupuestoflujocajaConstantesFunciones.resaltarFK_IdCentroCostoPresupuestoFlujoCaja!=null) {
			index= this.jTabbedPaneBusquedasPresupuestoFlujoCaja.indexOfComponent(this.jPanelFK_IdCentroCostoPresupuestoFlujoCaja);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPresupuestoFlujoCaja.getComponent(index);
				jPanel.setBorder(this.presupuestoflujocajaConstantesFunciones.resaltarFK_IdCentroCostoPresupuestoFlujoCaja);
			}
		}

		if(this.presupuestoflujocajaConstantesFunciones.resaltarFK_IdCuentaContablePresupuestoFlujoCaja!=null) {
			index= this.jTabbedPaneBusquedasPresupuestoFlujoCaja.indexOfComponent(this.jPanelFK_IdCuentaContablePresupuestoFlujoCaja);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPresupuestoFlujoCaja.getComponent(index);
				jPanel.setBorder(this.presupuestoflujocajaConstantesFunciones.resaltarFK_IdCuentaContablePresupuestoFlujoCaja);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioPresupuestoFlujoCaja() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasPresupuestoFlujoCaja.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPresupuestoFlujoCaja.indexOfComponent(this.jPanelFK_IdCentroCostoPresupuestoFlujoCaja);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPresupuestoFlujoCaja.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.presupuestoflujocajaConstantesFunciones.mostrarFK_IdCentroCostoPresupuestoFlujoCaja);
			if(!this.presupuestoflujocajaConstantesFunciones.mostrarFK_IdCentroCostoPresupuestoFlujoCaja && index>-1) {
				this.jTabbedPaneBusquedasPresupuestoFlujoCaja.remove(index);
			}

			index= this.jTabbedPaneBusquedasPresupuestoFlujoCaja.indexOfComponent(this.jPanelFK_IdCuentaContablePresupuestoFlujoCaja);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPresupuestoFlujoCaja.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.presupuestoflujocajaConstantesFunciones.mostrarFK_IdCuentaContablePresupuestoFlujoCaja);
			if(!this.presupuestoflujocajaConstantesFunciones.mostrarFK_IdCuentaContablePresupuestoFlujoCaja && index>-1) {
				this.jTabbedPaneBusquedasPresupuestoFlujoCaja.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioPresupuestoFlujoCaja() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasPresupuestoFlujoCaja.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPresupuestoFlujoCaja.indexOfComponent(this.jPanelFK_IdCentroCostoPresupuestoFlujoCaja);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPresupuestoFlujoCaja.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.presupuestoflujocajaConstantesFunciones.activarFK_IdCentroCostoPresupuestoFlujoCaja);
				this.jTabbedPaneBusquedasPresupuestoFlujoCaja.setEnabledAt(index,this.presupuestoflujocajaConstantesFunciones.activarFK_IdCentroCostoPresupuestoFlujoCaja);
			}

			index= this.jTabbedPaneBusquedasPresupuestoFlujoCaja.indexOfComponent(this.jPanelFK_IdCuentaContablePresupuestoFlujoCaja);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPresupuestoFlujoCaja.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.presupuestoflujocajaConstantesFunciones.activarFK_IdCuentaContablePresupuestoFlujoCaja);
				this.jTabbedPaneBusquedasPresupuestoFlujoCaja.setEnabledAt(index,this.presupuestoflujocajaConstantesFunciones.activarFK_IdCuentaContablePresupuestoFlujoCaja);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaPresupuestoFlujoCaja(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdCentroCosto")) {
			index= this.jTabbedPaneBusquedasPresupuestoFlujoCaja.indexOfComponent(this.jPanelFK_IdCentroCostoPresupuestoFlujoCaja);

			this.jTabbedPaneBusquedasPresupuestoFlujoCaja.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPresupuestoFlujoCaja.getComponent(index);

			this.presupuestoflujocajaConstantesFunciones.setResaltarFK_IdCentroCostoPresupuestoFlujoCaja(resaltar);

			jPanel.setBorder(this.presupuestoflujocajaConstantesFunciones.resaltarFK_IdCentroCostoPresupuestoFlujoCaja);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdCuentaContable")) {
			index= this.jTabbedPaneBusquedasPresupuestoFlujoCaja.indexOfComponent(this.jPanelFK_IdCuentaContablePresupuestoFlujoCaja);

			this.jTabbedPaneBusquedasPresupuestoFlujoCaja.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPresupuestoFlujoCaja.getComponent(index);

			this.presupuestoflujocajaConstantesFunciones.setResaltarFK_IdCuentaContablePresupuestoFlujoCaja(resaltar);

			jPanel.setBorder(this.presupuestoflujocajaConstantesFunciones.resaltarFK_IdCuentaContablePresupuestoFlujoCaja);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarPresupuestoFlujoCaja.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioPresupuestoFlujoCaja() throws Exception {

		if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioPresupuestoFlujoCaja();
		this.updateVisibilidadResaltarControlesFormularioPresupuestoFlujoCaja();
		this.updateHabilitarResaltarControlesFormularioPresupuestoFlujoCaja();
		
	}
	
	public void updateBorderResaltarControlesFormularioPresupuestoFlujoCaja() throws Exception {
		if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.presupuestoflujocajaConstantesFunciones.resaltaridPresupuestoFlujoCaja!=null && this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) {this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jLabelidPresupuestoFlujoCaja.setBorder(this.presupuestoflujocajaConstantesFunciones.resaltaridPresupuestoFlujoCaja);}
		if(this.presupuestoflujocajaConstantesFunciones.resaltarid_empresaPresupuestoFlujoCaja!=null && this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) {this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_empresaPresupuestoFlujoCaja.setBorder(this.presupuestoflujocajaConstantesFunciones.resaltarid_empresaPresupuestoFlujoCaja);}
		if(this.presupuestoflujocajaConstantesFunciones.resaltarid_cuenta_contablePresupuestoFlujoCaja!=null && this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) {this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_cuenta_contablePresupuestoFlujoCaja.setBorder(this.presupuestoflujocajaConstantesFunciones.resaltarid_cuenta_contablePresupuestoFlujoCaja);}
		if(this.presupuestoflujocajaConstantesFunciones.resaltarid_ejercicioPresupuestoFlujoCaja!=null && this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) {this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_ejercicioPresupuestoFlujoCaja.setBorder(this.presupuestoflujocajaConstantesFunciones.resaltarid_ejercicioPresupuestoFlujoCaja);}
		if(this.presupuestoflujocajaConstantesFunciones.resaltarid_periodoPresupuestoFlujoCaja!=null && this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) {this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_periodoPresupuestoFlujoCaja.setBorder(this.presupuestoflujocajaConstantesFunciones.resaltarid_periodoPresupuestoFlujoCaja);}
		if(this.presupuestoflujocajaConstantesFunciones.resaltarid_centro_costoPresupuestoFlujoCaja!=null && this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) {this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_centro_costoPresupuestoFlujoCaja.setBorder(this.presupuestoflujocajaConstantesFunciones.resaltarid_centro_costoPresupuestoFlujoCaja);}
		if(this.presupuestoflujocajaConstantesFunciones.resaltarvalorPresupuestoFlujoCaja!=null && this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) {this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jTextFieldvalorPresupuestoFlujoCaja.setBorder(this.presupuestoflujocajaConstantesFunciones.resaltarvalorPresupuestoFlujoCaja);}
		if(this.presupuestoflujocajaConstantesFunciones.resaltarvalor_efectivoPresupuestoFlujoCaja!=null && this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) {this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jTextFieldvalor_efectivoPresupuestoFlujoCaja.setBorder(this.presupuestoflujocajaConstantesFunciones.resaltarvalor_efectivoPresupuestoFlujoCaja);}
		if(this.presupuestoflujocajaConstantesFunciones.resaltarporcentajePresupuestoFlujoCaja!=null && this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) {this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jTextFieldporcentajePresupuestoFlujoCaja.setBorder(this.presupuestoflujocajaConstantesFunciones.resaltarporcentajePresupuestoFlujoCaja);}
		if(this.presupuestoflujocajaConstantesFunciones.resaltarfecha_presupuestoPresupuestoFlujoCaja!=null && this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) {this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jDateChooserfecha_presupuestoPresupuestoFlujoCaja.setBorder(this.presupuestoflujocajaConstantesFunciones.resaltarfecha_presupuestoPresupuestoFlujoCaja);}
		if(this.presupuestoflujocajaConstantesFunciones.resaltarfecha_procesoPresupuestoFlujoCaja!=null && this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) {this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jDateChooserfecha_procesoPresupuestoFlujoCaja.setBorder(this.presupuestoflujocajaConstantesFunciones.resaltarfecha_procesoPresupuestoFlujoCaja);}
		if(this.presupuestoflujocajaConstantesFunciones.resaltarobservacionPresupuestoFlujoCaja!=null && this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) {this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jTextAreaobservacionPresupuestoFlujoCaja.setBorder(this.presupuestoflujocajaConstantesFunciones.resaltarobservacionPresupuestoFlujoCaja);}
		if(this.presupuestoflujocajaConstantesFunciones.resaltarid_anioPresupuestoFlujoCaja!=null && this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) {this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_anioPresupuestoFlujoCaja.setBorder(this.presupuestoflujocajaConstantesFunciones.resaltarid_anioPresupuestoFlujoCaja);}
		if(this.presupuestoflujocajaConstantesFunciones.resaltarid_mesPresupuestoFlujoCaja!=null && this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) {this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_mesPresupuestoFlujoCaja.setBorder(this.presupuestoflujocajaConstantesFunciones.resaltarid_mesPresupuestoFlujoCaja);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioPresupuestoFlujoCaja() throws Exception {		
		if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) {
	
		//this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jLabelidPresupuestoFlujoCaja.setVisible(this.presupuestoflujocajaConstantesFunciones.mostraridPresupuestoFlujoCaja);
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jPanelidPresupuestoFlujoCaja.setVisible(this.presupuestoflujocajaConstantesFunciones.mostraridPresupuestoFlujoCaja);
		//this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_empresaPresupuestoFlujoCaja.setVisible(this.presupuestoflujocajaConstantesFunciones.mostrarid_empresaPresupuestoFlujoCaja);
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jPanelid_empresaPresupuestoFlujoCaja.setVisible(this.presupuestoflujocajaConstantesFunciones.mostrarid_empresaPresupuestoFlujoCaja);
		//this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_cuenta_contablePresupuestoFlujoCaja.setVisible(this.presupuestoflujocajaConstantesFunciones.mostrarid_cuenta_contablePresupuestoFlujoCaja);
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jPanelid_cuenta_contablePresupuestoFlujoCaja.setVisible(this.presupuestoflujocajaConstantesFunciones.mostrarid_cuenta_contablePresupuestoFlujoCaja);
			this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonid_cuenta_contablePresupuestoFlujoCaja.setVisible(this.presupuestoflujocajaConstantesFunciones.mostrarid_cuenta_contablePresupuestoFlujoCaja);
		//this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_ejercicioPresupuestoFlujoCaja.setVisible(this.presupuestoflujocajaConstantesFunciones.mostrarid_ejercicioPresupuestoFlujoCaja);
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jPanelid_ejercicioPresupuestoFlujoCaja.setVisible(this.presupuestoflujocajaConstantesFunciones.mostrarid_ejercicioPresupuestoFlujoCaja);
		//this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_periodoPresupuestoFlujoCaja.setVisible(this.presupuestoflujocajaConstantesFunciones.mostrarid_periodoPresupuestoFlujoCaja);
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jPanelid_periodoPresupuestoFlujoCaja.setVisible(this.presupuestoflujocajaConstantesFunciones.mostrarid_periodoPresupuestoFlujoCaja);
		//this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_centro_costoPresupuestoFlujoCaja.setVisible(this.presupuestoflujocajaConstantesFunciones.mostrarid_centro_costoPresupuestoFlujoCaja);
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jPanelid_centro_costoPresupuestoFlujoCaja.setVisible(this.presupuestoflujocajaConstantesFunciones.mostrarid_centro_costoPresupuestoFlujoCaja);
		//this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jTextFieldvalorPresupuestoFlujoCaja.setVisible(this.presupuestoflujocajaConstantesFunciones.mostrarvalorPresupuestoFlujoCaja);
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jPanelvalorPresupuestoFlujoCaja.setVisible(this.presupuestoflujocajaConstantesFunciones.mostrarvalorPresupuestoFlujoCaja);
		//this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jTextFieldvalor_efectivoPresupuestoFlujoCaja.setVisible(this.presupuestoflujocajaConstantesFunciones.mostrarvalor_efectivoPresupuestoFlujoCaja);
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jPanelvalor_efectivoPresupuestoFlujoCaja.setVisible(this.presupuestoflujocajaConstantesFunciones.mostrarvalor_efectivoPresupuestoFlujoCaja);
		//this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jTextFieldporcentajePresupuestoFlujoCaja.setVisible(this.presupuestoflujocajaConstantesFunciones.mostrarporcentajePresupuestoFlujoCaja);
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jPanelporcentajePresupuestoFlujoCaja.setVisible(this.presupuestoflujocajaConstantesFunciones.mostrarporcentajePresupuestoFlujoCaja);
		//this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jDateChooserfecha_presupuestoPresupuestoFlujoCaja.setVisible(this.presupuestoflujocajaConstantesFunciones.mostrarfecha_presupuestoPresupuestoFlujoCaja);
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jPanelfecha_presupuestoPresupuestoFlujoCaja.setVisible(this.presupuestoflujocajaConstantesFunciones.mostrarfecha_presupuestoPresupuestoFlujoCaja);
		//this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jDateChooserfecha_procesoPresupuestoFlujoCaja.setVisible(this.presupuestoflujocajaConstantesFunciones.mostrarfecha_procesoPresupuestoFlujoCaja);
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jPanelfecha_procesoPresupuestoFlujoCaja.setVisible(this.presupuestoflujocajaConstantesFunciones.mostrarfecha_procesoPresupuestoFlujoCaja);
		//this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jTextAreaobservacionPresupuestoFlujoCaja.setVisible(this.presupuestoflujocajaConstantesFunciones.mostrarobservacionPresupuestoFlujoCaja);
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jPanelobservacionPresupuestoFlujoCaja.setVisible(this.presupuestoflujocajaConstantesFunciones.mostrarobservacionPresupuestoFlujoCaja);
		//this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_anioPresupuestoFlujoCaja.setVisible(this.presupuestoflujocajaConstantesFunciones.mostrarid_anioPresupuestoFlujoCaja);
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jPanelid_anioPresupuestoFlujoCaja.setVisible(this.presupuestoflujocajaConstantesFunciones.mostrarid_anioPresupuestoFlujoCaja);
		//this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_mesPresupuestoFlujoCaja.setVisible(this.presupuestoflujocajaConstantesFunciones.mostrarid_mesPresupuestoFlujoCaja);
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jPanelid_mesPresupuestoFlujoCaja.setVisible(this.presupuestoflujocajaConstantesFunciones.mostrarid_mesPresupuestoFlujoCaja);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioPresupuestoFlujoCaja() throws Exception {
		if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPresupuestoFlujoCaja!=null) {
	
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jLabelidPresupuestoFlujoCaja.setEnabled(this.presupuestoflujocajaConstantesFunciones.activaridPresupuestoFlujoCaja);
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_empresaPresupuestoFlujoCaja.setEnabled(this.presupuestoflujocajaConstantesFunciones.activarid_empresaPresupuestoFlujoCaja);
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_cuenta_contablePresupuestoFlujoCaja.setEnabled(this.presupuestoflujocajaConstantesFunciones.activarid_cuenta_contablePresupuestoFlujoCaja);
			this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jButtonid_cuenta_contablePresupuestoFlujoCaja.setEnabled(this.presupuestoflujocajaConstantesFunciones.activarid_cuenta_contablePresupuestoFlujoCaja);
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_ejercicioPresupuestoFlujoCaja.setEnabled(this.presupuestoflujocajaConstantesFunciones.activarid_ejercicioPresupuestoFlujoCaja);
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_periodoPresupuestoFlujoCaja.setEnabled(this.presupuestoflujocajaConstantesFunciones.activarid_periodoPresupuestoFlujoCaja);
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_centro_costoPresupuestoFlujoCaja.setEnabled(this.presupuestoflujocajaConstantesFunciones.activarid_centro_costoPresupuestoFlujoCaja);
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jTextFieldvalorPresupuestoFlujoCaja.setEnabled(this.presupuestoflujocajaConstantesFunciones.activarvalorPresupuestoFlujoCaja);
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jTextFieldvalor_efectivoPresupuestoFlujoCaja.setEnabled(this.presupuestoflujocajaConstantesFunciones.activarvalor_efectivoPresupuestoFlujoCaja);
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jTextFieldporcentajePresupuestoFlujoCaja.setEnabled(this.presupuestoflujocajaConstantesFunciones.activarporcentajePresupuestoFlujoCaja);
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jDateChooserfecha_presupuestoPresupuestoFlujoCaja.setEnabled(this.presupuestoflujocajaConstantesFunciones.activarfecha_presupuestoPresupuestoFlujoCaja);
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jDateChooserfecha_procesoPresupuestoFlujoCaja.setEnabled(this.presupuestoflujocajaConstantesFunciones.activarfecha_procesoPresupuestoFlujoCaja);
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jTextAreaobservacionPresupuestoFlujoCaja.setEnabled(this.presupuestoflujocajaConstantesFunciones.activarobservacionPresupuestoFlujoCaja);
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_anioPresupuestoFlujoCaja.setEnabled(this.presupuestoflujocajaConstantesFunciones.activarid_anioPresupuestoFlujoCaja);
		this.jInternalFrameDetalleFormPresupuestoFlujoCaja.jComboBoxid_mesPresupuestoFlujoCaja.setEnabled(this.presupuestoflujocajaConstantesFunciones.activarid_mesPresupuestoFlujoCaja);
		}
	}
	
		
}