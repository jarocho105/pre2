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
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes;




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

import com.bydan.erp.tesoreria.util.DetalleChequeGiradoConstantesFunciones;
import com.bydan.erp.tesoreria.util.DetalleChequeGiradoParameterReturnGeneral;
//import com.bydan.erp.tesoreria.util.DetalleChequeGiradoParameterGeneral;
//import com.bydan.erp.tesoreria.presentation.report.source.DetalleChequeGiradoBean;
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

import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.tesoreria.resources.reportes.AuxiliarReportes;


import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.tesoreria.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.tesoreria.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class DetalleChequeGiradoBeanSwingJInternalFrame extends DetalleChequeGiradoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(DetalleChequeGiradoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<DetalleChequeGirado> detallechequegiradoValidator = new ClassValidator<DetalleChequeGirado>(DetalleChequeGirado.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public DetalleChequeGirado detallechequegirado;	
	public DetalleChequeGirado detallechequegiradoAux;
	public DetalleChequeGirado detallechequegiradoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public DetalleChequeGirado detallechequegiradoTotales;
	public Long idDetalleChequeGiradoActual;
	public Long iIdNuevoDetalleChequeGirado=0L;
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

	public String sFinalQueryComboAsientoContable="";

	public List<AsientoContable> asientocontablesForeignKey;

	public List<AsientoContable> getasientocontablesForeignKey() {
		return asientocontablesForeignKey;
	}

	public void setasientocontablesForeignKey(List<AsientoContable> asientocontablesForeignKey) {
		this.asientocontablesForeignKey = asientocontablesForeignKey;
	}

	//OBJETO FK ACTUAL
	public AsientoContable asientocontableForeignKey;

	public AsientoContable getasientocontableForeignKey() {
		return asientocontableForeignKey;
	}

	public void setasientocontableForeignKey(AsientoContable asientocontableForeignKey) {
		this.asientocontableForeignKey = asientocontableForeignKey;
	}

	public String sFinalQueryComboEmpleado="";

	public List<Empleado> empleadosForeignKey;

	public List<Empleado> getempleadosForeignKey() {
		return empleadosForeignKey;
	}

	public void setempleadosForeignKey(List<Empleado> empleadosForeignKey) {
		this.empleadosForeignKey = empleadosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Empleado empleadoForeignKey;

	public Empleado getempleadoForeignKey() {
		return empleadoForeignKey;
	}

	public void setempleadoForeignKey(Empleado empleadoForeignKey) {
		this.empleadoForeignKey = empleadoForeignKey;
	}

	public String sFinalQueryComboCuentaBanco="";

	public List<CuentaBanco> cuentabancosForeignKey;

	public List<CuentaBanco> getcuentabancosForeignKey() {
		return cuentabancosForeignKey;
	}

	public void setcuentabancosForeignKey(List<CuentaBanco> cuentabancosForeignKey) {
		this.cuentabancosForeignKey = cuentabancosForeignKey;
	}

	//OBJETO FK ACTUAL
	public CuentaBanco cuentabancoForeignKey;

	public CuentaBanco getcuentabancoForeignKey() {
		return cuentabancoForeignKey;
	}

	public void setcuentabancoForeignKey(CuentaBanco cuentabancoForeignKey) {
		this.cuentabancoForeignKey = cuentabancoForeignKey;
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
	public Long idAsientoContableActual=0L;

	public Long getidAsientoContableActual() {
		return idAsientoContableActual;
	}

	public void setidAsientoContableActual(Long idAsientoContableActual) {
		this.idAsientoContableActual= idAsientoContableActual;
	}
	public Long idEmpleadoActual=0L;

	public Long getidEmpleadoActual() {
		return idEmpleadoActual;
	}

	public void setidEmpleadoActual(Long idEmpleadoActual) {
		this.idEmpleadoActual= idEmpleadoActual;
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
	
	public Boolean isPermisoTodoDetalleChequeGirado;
	public Boolean isPermisoNuevoDetalleChequeGirado;
	public Boolean isPermisoActualizarDetalleChequeGirado;
	public Boolean isPermisoActualizarOriginalDetalleChequeGirado;
	public Boolean isPermisoEliminarDetalleChequeGirado;
	public Boolean isPermisoGuardarCambiosDetalleChequeGirado;
	public Boolean isPermisoConsultaDetalleChequeGirado;
	public Boolean isPermisoBusquedaDetalleChequeGirado;
	public Boolean isPermisoReporteDetalleChequeGirado;
	public Boolean isPermisoPaginacionMedioDetalleChequeGirado;
	public Boolean isPermisoPaginacionAltoDetalleChequeGirado;
	public Boolean isPermisoPaginacionTodoDetalleChequeGirado;
	public Boolean isPermisoCopiarDetalleChequeGirado;
	public Boolean isPermisoVerFormDetalleChequeGirado;
	public Boolean isPermisoDuplicarDetalleChequeGirado;
	public Boolean isPermisoOrdenDetalleChequeGirado;
	
	
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
	
	public DetalleChequeGiradoParameterReturnGeneral detallechequegiradoReturnGeneral;
	public DetalleChequeGiradoParameterReturnGeneral detallechequegiradoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoDetalleChequeGirado=false;
	public Boolean esParaAccionDesdeFormularioDetalleChequeGirado=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected DetalleChequeGiradoSessionBeanAdditional detallechequegiradoSessionBeanAdditional=null;
	
	public DetalleChequeGiradoSessionBeanAdditional getDetalleChequeGiradoSessionBeanAdditional() {
		return this.detallechequegiradoSessionBeanAdditional;
	}
	
	public void setDetalleChequeGiradoSessionBeanAdditional(DetalleChequeGiradoSessionBeanAdditional detallechequegiradoSessionBeanAdditional) {
		try {
			this.detallechequegiradoSessionBeanAdditional=detallechequegiradoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected DetalleChequeGiradoBeanSwingJInternalFrameAdditional detallechequegiradoBeanSwingJInternalFrameAdditional=null;
	//public class DetalleChequeGiradoBeanSwingJInternalFrame
	
	public DetalleChequeGiradoBeanSwingJInternalFrameAdditional getDetalleChequeGiradoBeanSwingJInternalFrameAdditional() {
		return this.detallechequegiradoBeanSwingJInternalFrameAdditional;
	}
	
	public void setDetalleChequeGiradoBeanSwingJInternalFrameAdditional(DetalleChequeGiradoBeanSwingJInternalFrameAdditional detallechequegiradoBeanSwingJInternalFrameAdditional) {
		try {
			this.detallechequegiradoBeanSwingJInternalFrameAdditional=detallechequegiradoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public DetalleChequeGiradoLogic detallechequegiradoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public DetalleChequeGirado detallechequegiradoBean;
	public DetalleChequeGiradoConstantesFunciones detallechequegiradoConstantesFunciones;
	//public DetalleChequeGiradoParameterReturnGeneral detallechequegiradoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public EjercicioLogic ejercicioLogic;
	public PeriodoLogic periodoLogic;
	public AsientoContableLogic asientocontableLogic;
	public EmpleadoLogic empleadoLogic;
	public CuentaBancoLogic cuentabancoLogic;
	public AnioLogic anioLogic;
	public MesLogic mesLogic;
	
	//PARAMETROS
	
	
	//public List<DetalleChequeGirado> detallechequegirados;	
	//public List<DetalleChequeGirado> detallechequegiradosEliminados;
	//public List<DetalleChequeGirado> detallechequegiradosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoDetalleChequeGirado=false;
	public Boolean isVisibilidadCeldaDuplicarDetalleChequeGirado=true;
	public Boolean isVisibilidadCeldaCopiarDetalleChequeGirado=true;
	public Boolean isVisibilidadCeldaVerFormDetalleChequeGirado=true;
	public Boolean isVisibilidadCeldaOrdenDetalleChequeGirado=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesDetalleChequeGirado=false;
	public Boolean isVisibilidadCeldaModificarDetalleChequeGirado=false;
	public Boolean isVisibilidadCeldaActualizarDetalleChequeGirado=false;
	public Boolean isVisibilidadCeldaEliminarDetalleChequeGirado=false;
	public Boolean isVisibilidadCeldaCancelarDetalleChequeGirado=false;
	public Boolean isVisibilidadCeldaGuardarDetalleChequeGirado=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosDetalleChequeGirado=false;	
	
	
	public Boolean isVisibilidadFK_IdAnio=false;
	public Boolean isVisibilidadFK_IdAsientoContable=false;
	public Boolean isVisibilidadFK_IdCuentaBanco=false;
	public Boolean isVisibilidadFK_IdEjercicio=false;
	public Boolean isVisibilidadFK_IdEmpleado=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdMes=false;
	public Boolean isVisibilidadFK_IdPeriodo=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoDetalleChequeGirado() {
		return this.iIdNuevoDetalleChequeGirado;
	}

	public void setiIdNuevoDetalleChequeGirado(Long iIdNuevoDetalleChequeGirado) {
		this.iIdNuevoDetalleChequeGirado = iIdNuevoDetalleChequeGirado;
	}
	
	public Long getidDetalleChequeGiradoActual() {
		return this.idDetalleChequeGiradoActual;
	}

	public void setidDetalleChequeGiradoActual(Long idDetalleChequeGiradoActual) {
		this.idDetalleChequeGiradoActual = idDetalleChequeGiradoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public DetalleChequeGirado getdetallechequegirado() {
		return this.detallechequegirado;
	}

	public void setdetallechequegirado(DetalleChequeGirado detallechequegirado) {
		this.detallechequegirado = detallechequegirado;
	}
	
	public DetalleChequeGirado getdetallechequegiradoAux() {
		return this.detallechequegiradoAux;
	}

	public void setdetallechequegiradoAux(DetalleChequeGirado detallechequegiradoAux) {
		this.detallechequegiradoAux = detallechequegiradoAux;
	}				
	
	public DetalleChequeGirado getdetallechequegiradoAnterior() {
		return this.detallechequegiradoAnterior;
	}

	public void setdetallechequegiradoAnterior(DetalleChequeGirado detallechequegiradoAnterior) {
		this.detallechequegiradoAnterior = detallechequegiradoAnterior;
	}	
	
	public DetalleChequeGirado getdetallechequegiradoTotales() {
		return this.detallechequegiradoTotales;
	}

	public void setdetallechequegiradoTotales(DetalleChequeGirado detallechequegiradoTotales) {
		this.detallechequegiradoTotales = detallechequegiradoTotales;
	}	
	
	public DetalleChequeGirado getdetallechequegiradoBean() {
		return this.detallechequegiradoBean;
	}

	public void setdetallechequegiradoBean(DetalleChequeGirado detallechequegiradoBean) {
		this.detallechequegiradoBean = detallechequegiradoBean;
	}	
	
	public DetalleChequeGiradoParameterReturnGeneral getdetallechequegiradoReturnGeneral() {
		return this.detallechequegiradoReturnGeneral;
	}

	public void setdetallechequegiradoReturnGeneral(DetalleChequeGiradoParameterReturnGeneral detallechequegiradoReturnGeneral) {
		this.detallechequegiradoReturnGeneral = detallechequegiradoReturnGeneral;
	}	
	
	
	public Long id_anioFK_IdAnio=null;

	public Long getid_anioFK_IdAnio() {
		return this.id_anioFK_IdAnio;
	}

	public void setid_anioFK_IdAnio(Long id_anioFK_IdAnio) {
		this.id_anioFK_IdAnio = id_anioFK_IdAnio;
	}

	public Long id_asiento_contableFK_IdAsientoContable=-1L;

	public Long getid_asiento_contableFK_IdAsientoContable() {
		return this.id_asiento_contableFK_IdAsientoContable;
	}

	public void setid_asiento_contableFK_IdAsientoContable(Long id_asiento_contableFK_IdAsientoContable) {
		this.id_asiento_contableFK_IdAsientoContable = id_asiento_contableFK_IdAsientoContable;
	}

	public Long id_cuenta_bancoFK_IdCuentaBanco=-1L;

	public Long getid_cuenta_bancoFK_IdCuentaBanco() {
		return this.id_cuenta_bancoFK_IdCuentaBanco;
	}

	public void setid_cuenta_bancoFK_IdCuentaBanco(Long id_cuenta_bancoFK_IdCuentaBanco) {
		this.id_cuenta_bancoFK_IdCuentaBanco = id_cuenta_bancoFK_IdCuentaBanco;
	}

	public Long id_ejercicioFK_IdEjercicio=-1L;

	public Long getid_ejercicioFK_IdEjercicio() {
		return this.id_ejercicioFK_IdEjercicio;
	}

	public void setid_ejercicioFK_IdEjercicio(Long id_ejercicioFK_IdEjercicio) {
		this.id_ejercicioFK_IdEjercicio = id_ejercicioFK_IdEjercicio;
	}

	public Long id_empleadoFK_IdEmpleado=-1L;

	public Long getid_empleadoFK_IdEmpleado() {
		return this.id_empleadoFK_IdEmpleado;
	}

	public void setid_empleadoFK_IdEmpleado(Long id_empleadoFK_IdEmpleado) {
		this.id_empleadoFK_IdEmpleado = id_empleadoFK_IdEmpleado;
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
	
	
	public DetalleChequeGiradoLogic getDetalleChequeGiradoLogic()	{		
		return detallechequegiradoLogic;
	}

	public void setDetalleChequeGiradoLogic(DetalleChequeGiradoLogic detallechequegiradoLogic) {
		this.detallechequegiradoLogic = detallechequegiradoLogic;
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
	
	public Boolean getIsEsNuevoDetalleChequeGirado() {
		return isEsNuevoDetalleChequeGirado;
	}

	public void setIsEsNuevoDetalleChequeGirado(Boolean isEsNuevoDetalleChequeGirado) {
		this.isEsNuevoDetalleChequeGirado = isEsNuevoDetalleChequeGirado;
	}

	public Boolean getEsParaAccionDesdeFormularioDetalleChequeGirado() {
		return esParaAccionDesdeFormularioDetalleChequeGirado;
	}
	
	public void setEsParaAccionDesdeFormularioDetalleChequeGirado(Boolean esParaAccionDesdeFormularioDetalleChequeGirado) {
		this.esParaAccionDesdeFormularioDetalleChequeGirado = esParaAccionDesdeFormularioDetalleChequeGirado;
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

			if(this.detallechequegiradoSessionBean==null) {
				this.detallechequegiradoSessionBean=new DetalleChequeGiradoSessionBean();
			}

			if(!this.detallechequegiradoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(detallechequegiradoSessionBean.getlidEmpresaActual());
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

			if(this.detallechequegiradoSessionBean==null) {
				this.detallechequegiradoSessionBean=new DetalleChequeGiradoSessionBean();
			}

			if(!this.detallechequegiradoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(detallechequegiradoSessionBean.getlidSucursalActual());
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

			if(this.detallechequegiradoSessionBean==null) {
				this.detallechequegiradoSessionBean=new DetalleChequeGiradoSessionBean();
			}

			if(!this.detallechequegiradoSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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
					ejercicioLogic.getEntityWithConnection(detallechequegiradoSessionBean.getlidEjercicioActual());
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

			if(this.detallechequegiradoSessionBean==null) {
				this.detallechequegiradoSessionBean=new DetalleChequeGiradoSessionBean();
			}

			if(!this.detallechequegiradoSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
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
					periodoLogic.getEntityWithConnection(detallechequegiradoSessionBean.getlidPeriodoActual());
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

	public void cargarCombosAsientoContablesForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.asientocontablesForeignKey=new ArrayList<AsientoContable>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			AsientoContableLogic asientocontableLogic=new AsientoContableLogic();

			//asientocontableLogic.getAsientoContableDataAccess().setIsForForeingKeyData(true);

			if(this.detallechequegiradoSessionBean==null) {
				this.detallechequegiradoSessionBean=new DetalleChequeGiradoSessionBean();
			}

			if(!this.detallechequegiradoSessionBean.getisBusquedaDesdeForeignKeySesionAsientoContable()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//asientocontableLogic.getAsientoContableDataAccess().setIsForForeingKeyData(true);

					asientocontableLogic.getTodosAsientoContablesWithConnection(sFinalQuery,new Pagination());

					this.asientocontablesForeignKey=asientocontableLogic.getAsientoContables();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaAsientoContable(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					asientocontableLogic.getEntityWithConnection(detallechequegiradoSessionBean.getlidAsientoContableActual());
					this.asientocontablesForeignKey.add(asientocontableLogic.getAsientoContable());
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

	public void cargarCombosEmpleadosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.empleadosForeignKey=new ArrayList<Empleado>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EmpleadoLogic empleadoLogic=new EmpleadoLogic();

			//empleadoLogic.getEmpleadoDataAccess().setIsForForeingKeyData(true);

			if(this.detallechequegiradoSessionBean==null) {
				this.detallechequegiradoSessionBean=new DetalleChequeGiradoSessionBean();
			}

			if(!this.detallechequegiradoSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//empleadoLogic.getEmpleadoDataAccess().setIsForForeingKeyData(true);

					empleadoLogic.getTodosEmpleadosWithConnection(sFinalQuery,new Pagination());

					this.empleadosForeignKey=empleadoLogic.getEmpleados();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEmpleado(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadoLogic.getEntityWithConnection(detallechequegiradoSessionBean.getlidEmpleadoActual());
					this.empleadosForeignKey.add(empleadoLogic.getEmpleado());
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

	public void cargarCombosCuentaBancosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.cuentabancosForeignKey=new ArrayList<CuentaBanco>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			CuentaBancoLogic cuentabancoLogic=new CuentaBancoLogic();

			//cuentabancoLogic.getCuentaBancoDataAccess().setIsForForeingKeyData(true);

			if(this.detallechequegiradoSessionBean==null) {
				this.detallechequegiradoSessionBean=new DetalleChequeGiradoSessionBean();
			}

			if(!this.detallechequegiradoSessionBean.getisBusquedaDesdeForeignKeySesionCuentaBanco()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cuentabancoLogic.getCuentaBancoDataAccess().setIsForForeingKeyData(true);

					cuentabancoLogic.getTodosCuentaBancosWithConnection(sFinalQuery,new Pagination());

					this.cuentabancosForeignKey=cuentabancoLogic.getCuentaBancos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCuentaBanco(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentabancoLogic.getEntityWithConnection(detallechequegiradoSessionBean.getlidCuentaBancoActual());
					this.cuentabancosForeignKey.add(cuentabancoLogic.getCuentaBanco());
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

			if(this.detallechequegiradoSessionBean==null) {
				this.detallechequegiradoSessionBean=new DetalleChequeGiradoSessionBean();
			}

			if(!this.detallechequegiradoSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
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
					anioLogic.getEntityWithConnection(detallechequegiradoSessionBean.getlidAnioActual());
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

			if(this.detallechequegiradoSessionBean==null) {
				this.detallechequegiradoSessionBean=new DetalleChequeGiradoSessionBean();
			}

			if(!this.detallechequegiradoSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
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
					mesLogic.getEntityWithConnection(detallechequegiradoSessionBean.getlidMesActual());
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

					if(this.detallechequegirado!=null) {
						this.detallechequegirado.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) {
						this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_empresaDetalleChequeGirado.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaDetalleChequeGirado.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) {
						if(this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_empresaDetalleChequeGirado.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_empresaDetalleChequeGirado.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaDetalleChequeGiradoGenerico)throws Exception
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
				jComboBoxid_empresaDetalleChequeGiradoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaDetalleChequeGiradoGenerico!=null && jComboBoxid_empresaDetalleChequeGiradoGenerico.getItemCount()>0) {
					jComboBoxid_empresaDetalleChequeGiradoGenerico.setSelectedIndex(0);
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

					if(this.detallechequegirado!=null) {
						this.detallechequegirado.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) {
						this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_sucursalDetalleChequeGirado.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalDetalleChequeGirado.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) {
						if(this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_sucursalDetalleChequeGirado.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_sucursalDetalleChequeGirado.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalDetalleChequeGiradoGenerico)throws Exception
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
				jComboBoxid_sucursalDetalleChequeGiradoGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalDetalleChequeGiradoGenerico!=null && jComboBoxid_sucursalDetalleChequeGiradoGenerico.getItemCount()>0) {
					jComboBoxid_sucursalDetalleChequeGiradoGenerico.setSelectedIndex(0);
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

					if(this.detallechequegirado!=null) {
						this.detallechequegirado.setEjercicio(ejercicioTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) {
						this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_ejercicioDetalleChequeGirado.setSelectedItem(ejercicioTemp);
					}
				} else {
					//jComboBoxid_ejercicioDetalleChequeGirado.setSelectedItem(ejercicioTemp);
					if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) {
						if(this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_ejercicioDetalleChequeGirado.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_ejercicioDetalleChequeGirado.setSelectedIndex(0);
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
	public void setActualEjercicioForeignKeyGenerico(Long idEjercicioSeleccionado,JComboBox jComboBoxid_ejercicioDetalleChequeGiradoGenerico)throws Exception
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
				jComboBoxid_ejercicioDetalleChequeGiradoGenerico.setSelectedItem(ejercicioTemp);
			} else {
				if(jComboBoxid_ejercicioDetalleChequeGiradoGenerico!=null && jComboBoxid_ejercicioDetalleChequeGiradoGenerico.getItemCount()>0) {
					jComboBoxid_ejercicioDetalleChequeGiradoGenerico.setSelectedIndex(0);
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

					if(this.detallechequegirado!=null) {
						this.detallechequegirado.setPeriodo(periodoTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) {
						this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_periodoDetalleChequeGirado.setSelectedItem(periodoTemp);
					}
				} else {
					//jComboBoxid_periodoDetalleChequeGirado.setSelectedItem(periodoTemp);
					if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) {
						if(this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_periodoDetalleChequeGirado.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_periodoDetalleChequeGirado.setSelectedIndex(0);
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
	public void setActualPeriodoForeignKeyGenerico(Long idPeriodoSeleccionado,JComboBox jComboBoxid_periodoDetalleChequeGiradoGenerico)throws Exception
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
				jComboBoxid_periodoDetalleChequeGiradoGenerico.setSelectedItem(periodoTemp);
			} else {
				if(jComboBoxid_periodoDetalleChequeGiradoGenerico!=null && jComboBoxid_periodoDetalleChequeGiradoGenerico.getItemCount()>0) {
					jComboBoxid_periodoDetalleChequeGiradoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualAsientoContableForeignKey(Long idAsientoContableSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			AsientoContable  asientocontableTemp=null;

			for(AsientoContable asientocontableAux:asientocontablesForeignKey) {
				if(asientocontableAux.getId()!=null && asientocontableAux.getId().equals(idAsientoContableSeleccionado)) {
					asientocontableTemp=asientocontableAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(asientocontableTemp!=null) {

					if(this.detallechequegirado!=null) {
						this.detallechequegirado.setAsientoContable(asientocontableTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) {
						this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_asiento_contableDetalleChequeGirado.setSelectedItem(asientocontableTemp);
					}
				} else {
					//jComboBoxid_asiento_contableDetalleChequeGirado.setSelectedItem(asientocontableTemp);
					if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) {
						if(this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_asiento_contableDetalleChequeGirado.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_asiento_contableDetalleChequeGirado.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdAsientoContable") || sFormularioTipoBusqueda.equals("Todos")){
					if(asientocontableTemp!=null && jComboBoxid_asiento_contableFK_IdAsientoContableDetalleChequeGirado!=null) {
						jComboBoxid_asiento_contableFK_IdAsientoContableDetalleChequeGirado.setSelectedItem(asientocontableTemp);
					} else {
						if(jComboBoxid_asiento_contableFK_IdAsientoContableDetalleChequeGirado!=null) {
							//jComboBoxid_asiento_contableFK_IdAsientoContableDetalleChequeGirado.setSelectedItem(asientocontableTemp);
							if(jComboBoxid_asiento_contableFK_IdAsientoContableDetalleChequeGirado.getItemCount()>0) {
								jComboBoxid_asiento_contableFK_IdAsientoContableDetalleChequeGirado.setSelectedIndex(0);
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

	public String getActualAsientoContableForeignKeyDescripcion(Long idAsientoContableSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			AsientoContable  asientocontableTemp=null;

			for(AsientoContable asientocontableAux:asientocontablesForeignKey) {
				if(asientocontableAux.getId()!=null && asientocontableAux.getId().equals(idAsientoContableSeleccionado)) {
					asientocontableTemp=asientocontableAux;
					break;
				}
			}


			sDescripcion=AsientoContableConstantesFunciones.getAsientoContableDescripcion(asientocontableTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualAsientoContableForeignKeyGenerico(Long idAsientoContableSeleccionado,JComboBox jComboBoxid_asiento_contableDetalleChequeGiradoGenerico)throws Exception
	{
		try
		{
			AsientoContable  asientocontableTemp=null;

			for(AsientoContable asientocontableAux:asientocontablesForeignKey) {
				if(asientocontableAux.getId()!=null && asientocontableAux.getId().equals(idAsientoContableSeleccionado)) {
					asientocontableTemp=asientocontableAux;
					break;
				}
			}

			if(asientocontableTemp!=null) {
				jComboBoxid_asiento_contableDetalleChequeGiradoGenerico.setSelectedItem(asientocontableTemp);
			} else {
				if(jComboBoxid_asiento_contableDetalleChequeGiradoGenerico!=null && jComboBoxid_asiento_contableDetalleChequeGiradoGenerico.getItemCount()>0) {
					jComboBoxid_asiento_contableDetalleChequeGiradoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualEmpleadoForeignKey(Long idEmpleadoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Empleado  empleadoTemp=null;

			for(Empleado empleadoAux:empleadosForeignKey) {
				if(empleadoAux.getId()!=null && empleadoAux.getId().equals(idEmpleadoSeleccionado)) {
					empleadoTemp=empleadoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(empleadoTemp!=null) {

					if(this.detallechequegirado!=null) {
						this.detallechequegirado.setEmpleado(empleadoTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) {
						this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_empleadoDetalleChequeGirado.setSelectedItem(empleadoTemp);
					}
				} else {
					//jComboBoxid_empleadoDetalleChequeGirado.setSelectedItem(empleadoTemp);
					if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) {
						if(this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_empleadoDetalleChequeGirado.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_empleadoDetalleChequeGirado.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){
					if(empleadoTemp!=null && jComboBoxid_empleadoFK_IdEmpleadoDetalleChequeGirado!=null) {
						jComboBoxid_empleadoFK_IdEmpleadoDetalleChequeGirado.setSelectedItem(empleadoTemp);
					} else {
						if(jComboBoxid_empleadoFK_IdEmpleadoDetalleChequeGirado!=null) {
							//jComboBoxid_empleadoFK_IdEmpleadoDetalleChequeGirado.setSelectedItem(empleadoTemp);
							if(jComboBoxid_empleadoFK_IdEmpleadoDetalleChequeGirado.getItemCount()>0) {
								jComboBoxid_empleadoFK_IdEmpleadoDetalleChequeGirado.setSelectedIndex(0);
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

	public String getActualEmpleadoForeignKeyDescripcion(Long idEmpleadoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Empleado  empleadoTemp=null;

			for(Empleado empleadoAux:empleadosForeignKey) {
				if(empleadoAux.getId()!=null && empleadoAux.getId().equals(idEmpleadoSeleccionado)) {
					empleadoTemp=empleadoAux;
					break;
				}
			}


			sDescripcion=EmpleadoConstantesFunciones.getEmpleadoDescripcion(empleadoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEmpleadoForeignKeyGenerico(Long idEmpleadoSeleccionado,JComboBox jComboBoxid_empleadoDetalleChequeGiradoGenerico)throws Exception
	{
		try
		{
			Empleado  empleadoTemp=null;

			for(Empleado empleadoAux:empleadosForeignKey) {
				if(empleadoAux.getId()!=null && empleadoAux.getId().equals(idEmpleadoSeleccionado)) {
					empleadoTemp=empleadoAux;
					break;
				}
			}

			if(empleadoTemp!=null) {
				jComboBoxid_empleadoDetalleChequeGiradoGenerico.setSelectedItem(empleadoTemp);
			} else {
				if(jComboBoxid_empleadoDetalleChequeGiradoGenerico!=null && jComboBoxid_empleadoDetalleChequeGiradoGenerico.getItemCount()>0) {
					jComboBoxid_empleadoDetalleChequeGiradoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualCuentaBancoForeignKey(Long idCuentaBancoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			CuentaBanco  cuentabancoTemp=null;

			for(CuentaBanco cuentabancoAux:cuentabancosForeignKey) {
				if(cuentabancoAux.getId()!=null && cuentabancoAux.getId().equals(idCuentaBancoSeleccionado)) {
					cuentabancoTemp=cuentabancoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(cuentabancoTemp!=null) {

					if(this.detallechequegirado!=null) {
						this.detallechequegirado.setCuentaBanco(cuentabancoTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) {
						this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_cuenta_bancoDetalleChequeGirado.setSelectedItem(cuentabancoTemp);
					}
				} else {
					//jComboBoxid_cuenta_bancoDetalleChequeGirado.setSelectedItem(cuentabancoTemp);
					if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) {
						if(this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_cuenta_bancoDetalleChequeGirado.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_cuenta_bancoDetalleChequeGirado.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCuentaBanco") || sFormularioTipoBusqueda.equals("Todos")){
					if(cuentabancoTemp!=null && jComboBoxid_cuenta_bancoFK_IdCuentaBancoDetalleChequeGirado!=null) {
						jComboBoxid_cuenta_bancoFK_IdCuentaBancoDetalleChequeGirado.setSelectedItem(cuentabancoTemp);
					} else {
						if(jComboBoxid_cuenta_bancoFK_IdCuentaBancoDetalleChequeGirado!=null) {
							//jComboBoxid_cuenta_bancoFK_IdCuentaBancoDetalleChequeGirado.setSelectedItem(cuentabancoTemp);
							if(jComboBoxid_cuenta_bancoFK_IdCuentaBancoDetalleChequeGirado.getItemCount()>0) {
								jComboBoxid_cuenta_bancoFK_IdCuentaBancoDetalleChequeGirado.setSelectedIndex(0);
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

	public String getActualCuentaBancoForeignKeyDescripcion(Long idCuentaBancoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			CuentaBanco  cuentabancoTemp=null;

			for(CuentaBanco cuentabancoAux:cuentabancosForeignKey) {
				if(cuentabancoAux.getId()!=null && cuentabancoAux.getId().equals(idCuentaBancoSeleccionado)) {
					cuentabancoTemp=cuentabancoAux;
					break;
				}
			}


			sDescripcion=CuentaBancoConstantesFunciones.getCuentaBancoDescripcion(cuentabancoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualCuentaBancoForeignKeyGenerico(Long idCuentaBancoSeleccionado,JComboBox jComboBoxid_cuenta_bancoDetalleChequeGiradoGenerico)throws Exception
	{
		try
		{
			CuentaBanco  cuentabancoTemp=null;

			for(CuentaBanco cuentabancoAux:cuentabancosForeignKey) {
				if(cuentabancoAux.getId()!=null && cuentabancoAux.getId().equals(idCuentaBancoSeleccionado)) {
					cuentabancoTemp=cuentabancoAux;
					break;
				}
			}

			if(cuentabancoTemp!=null) {
				jComboBoxid_cuenta_bancoDetalleChequeGiradoGenerico.setSelectedItem(cuentabancoTemp);
			} else {
				if(jComboBoxid_cuenta_bancoDetalleChequeGiradoGenerico!=null && jComboBoxid_cuenta_bancoDetalleChequeGiradoGenerico.getItemCount()>0) {
					jComboBoxid_cuenta_bancoDetalleChequeGiradoGenerico.setSelectedIndex(0);
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

					if(this.detallechequegirado!=null) {
						this.detallechequegirado.setAnio(anioTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) {
						this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_anioDetalleChequeGirado.setSelectedItem(anioTemp);
					}
				} else {
					//jComboBoxid_anioDetalleChequeGirado.setSelectedItem(anioTemp);
					if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) {
						if(this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_anioDetalleChequeGirado.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_anioDetalleChequeGirado.setSelectedIndex(0);
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
	public void setActualAnioForeignKeyGenerico(Long idAnioSeleccionado,JComboBox jComboBoxid_anioDetalleChequeGiradoGenerico)throws Exception
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
				jComboBoxid_anioDetalleChequeGiradoGenerico.setSelectedItem(anioTemp);
			} else {
				if(jComboBoxid_anioDetalleChequeGiradoGenerico!=null && jComboBoxid_anioDetalleChequeGiradoGenerico.getItemCount()>0) {
					jComboBoxid_anioDetalleChequeGiradoGenerico.setSelectedIndex(0);
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

					if(this.detallechequegirado!=null) {
						this.detallechequegirado.setMes(mesTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) {
						this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_mesDetalleChequeGirado.setSelectedItem(mesTemp);
					}
				} else {
					//jComboBoxid_mesDetalleChequeGirado.setSelectedItem(mesTemp);
					if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) {
						if(this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_mesDetalleChequeGirado.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_mesDetalleChequeGirado.setSelectedIndex(0);
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
	public void setActualMesForeignKeyGenerico(Long idMesSeleccionado,JComboBox jComboBoxid_mesDetalleChequeGiradoGenerico)throws Exception
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
				jComboBoxid_mesDetalleChequeGiradoGenerico.setSelectedItem(mesTemp);
			} else {
				if(jComboBoxid_mesDetalleChequeGiradoGenerico!=null && jComboBoxid_mesDetalleChequeGiradoGenerico.getItemCount()>0) {
					jComboBoxid_mesDetalleChequeGiradoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(DetalleChequeGirado detallechequegirado,JComboBox jComboBoxid_empresaDetalleChequeGiradoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaDetalleChequeGiradoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_empresaDetalleChequeGirado.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaDetalleChequeGiradoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				detallechequegirado.setid_empresa(empresaAux.getId());
				detallechequegirado.setempresa_descripcion(DetalleChequeGiradoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				detallechequegirado.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(DetalleChequeGirado detallechequegirado,JComboBox jComboBoxid_sucursalDetalleChequeGiradoGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalDetalleChequeGiradoGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_sucursalDetalleChequeGirado.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalDetalleChequeGiradoGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				detallechequegirado.setid_sucursal(sucursalAux.getId());
				detallechequegirado.setsucursal_descripcion(DetalleChequeGiradoConstantesFunciones.getSucursalDescripcion(sucursalAux));
				detallechequegirado.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEjercicioForeignKey(DetalleChequeGirado detallechequegirado,JComboBox jComboBoxid_ejercicioDetalleChequeGiradoGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioAux=new Ejercicio();

			if(jComboBoxid_ejercicioDetalleChequeGiradoGenerico==null) {
				ejercicioAux=(Ejercicio)this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_ejercicioDetalleChequeGirado.getSelectedItem();
			} else {
				ejercicioAux=(Ejercicio)jComboBoxid_ejercicioDetalleChequeGiradoGenerico.getSelectedItem();
			}

			if(ejercicioAux!=null && ejercicioAux.getId()!=null) {
				detallechequegirado.setid_ejercicio(ejercicioAux.getId());
				detallechequegirado.setejercicio_descripcion(DetalleChequeGiradoConstantesFunciones.getEjercicioDescripcion(ejercicioAux));
				detallechequegirado.setEjercicio(ejercicioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPeriodoForeignKey(DetalleChequeGirado detallechequegirado,JComboBox jComboBoxid_periodoDetalleChequeGiradoGenerico)throws Exception
	{
		try
		{
			Periodo  periodoAux=new Periodo();

			if(jComboBoxid_periodoDetalleChequeGiradoGenerico==null) {
				periodoAux=(Periodo)this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_periodoDetalleChequeGirado.getSelectedItem();
			} else {
				periodoAux=(Periodo)jComboBoxid_periodoDetalleChequeGiradoGenerico.getSelectedItem();
			}

			if(periodoAux!=null && periodoAux.getId()!=null) {
				if(periodoAux.getid_estado_periodo().equals(0L)) {
					throw new Exception("Periodo INACTIVO, NO PUEDE GUARDAR LA INFORMACION CONSULTE CON EL ADMINISTRADOR");
				}

				detallechequegirado.setid_periodo(periodoAux.getId());
				detallechequegirado.setperiodo_descripcion(DetalleChequeGiradoConstantesFunciones.getPeriodoDescripcion(periodoAux));
				detallechequegirado.setPeriodo(periodoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarAsientoContableForeignKey(DetalleChequeGirado detallechequegirado,JComboBox jComboBoxid_asiento_contableDetalleChequeGiradoGenerico)throws Exception
	{
		try
		{
			AsientoContable  asientocontableAux=new AsientoContable();

			if(jComboBoxid_asiento_contableDetalleChequeGiradoGenerico==null) {
				asientocontableAux=(AsientoContable)this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_asiento_contableDetalleChequeGirado.getSelectedItem();
			} else {
				asientocontableAux=(AsientoContable)jComboBoxid_asiento_contableDetalleChequeGiradoGenerico.getSelectedItem();
			}

			if(asientocontableAux!=null && asientocontableAux.getId()!=null) {
				detallechequegirado.setid_asiento_contable(asientocontableAux.getId());
				detallechequegirado.setasientocontable_descripcion(DetalleChequeGiradoConstantesFunciones.getAsientoContableDescripcion(asientocontableAux));
				detallechequegirado.setAsientoContable(asientocontableAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpleadoForeignKey(DetalleChequeGirado detallechequegirado,JComboBox jComboBoxid_empleadoDetalleChequeGiradoGenerico)throws Exception
	{
		try
		{
			Empleado  empleadoAux=new Empleado();

			if(jComboBoxid_empleadoDetalleChequeGiradoGenerico==null) {
				empleadoAux=(Empleado)this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_empleadoDetalleChequeGirado.getSelectedItem();
			} else {
				empleadoAux=(Empleado)jComboBoxid_empleadoDetalleChequeGiradoGenerico.getSelectedItem();
			}

			if(empleadoAux!=null && empleadoAux.getId()!=null) {
				detallechequegirado.setid_empleado(empleadoAux.getId());
				detallechequegirado.setempleado_descripcion(DetalleChequeGiradoConstantesFunciones.getEmpleadoDescripcion(empleadoAux));
				detallechequegirado.setEmpleado(empleadoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCuentaBancoForeignKey(DetalleChequeGirado detallechequegirado,JComboBox jComboBoxid_cuenta_bancoDetalleChequeGiradoGenerico)throws Exception
	{
		try
		{
			CuentaBanco  cuentabancoAux=new CuentaBanco();

			if(jComboBoxid_cuenta_bancoDetalleChequeGiradoGenerico==null) {
				cuentabancoAux=(CuentaBanco)this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_cuenta_bancoDetalleChequeGirado.getSelectedItem();
			} else {
				cuentabancoAux=(CuentaBanco)jComboBoxid_cuenta_bancoDetalleChequeGiradoGenerico.getSelectedItem();
			}

			if(cuentabancoAux!=null && cuentabancoAux.getId()!=null) {
				detallechequegirado.setid_cuenta_banco(cuentabancoAux.getId());
				detallechequegirado.setcuentabanco_descripcion(DetalleChequeGiradoConstantesFunciones.getCuentaBancoDescripcion(cuentabancoAux));
				detallechequegirado.setCuentaBanco(cuentabancoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarAnioForeignKey(DetalleChequeGirado detallechequegirado,JComboBox jComboBoxid_anioDetalleChequeGiradoGenerico)throws Exception
	{
		try
		{
			Anio  anioAux=new Anio();

			if(jComboBoxid_anioDetalleChequeGiradoGenerico==null) {
				anioAux=(Anio)this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_anioDetalleChequeGirado.getSelectedItem();
			} else {
				anioAux=(Anio)jComboBoxid_anioDetalleChequeGiradoGenerico.getSelectedItem();
			}

			if(anioAux!=null) {
				detallechequegirado.setid_anio(anioAux.getId());
				detallechequegirado.setanio_descripcion(DetalleChequeGiradoConstantesFunciones.getAnioDescripcion(anioAux));
				detallechequegirado.setAnio(anioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarMesForeignKey(DetalleChequeGirado detallechequegirado,JComboBox jComboBoxid_mesDetalleChequeGiradoGenerico)throws Exception
	{
		try
		{
			Mes  mesAux=new Mes();

			if(jComboBoxid_mesDetalleChequeGiradoGenerico==null) {
				mesAux=(Mes)this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_mesDetalleChequeGirado.getSelectedItem();
			} else {
				mesAux=(Mes)jComboBoxid_mesDetalleChequeGiradoGenerico.getSelectedItem();
			}

			if(mesAux!=null) {
				detallechequegirado.setid_mes(mesAux.getId());
				detallechequegirado.setmes_descripcion(DetalleChequeGiradoConstantesFunciones.getMesDescripcion(mesAux));
				detallechequegirado.setMes(mesAux);			}
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

					if(!DetalleChequeGiradoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) { 
							this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_empresaDetalleChequeGirado.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_empresaDetalleChequeGirado.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) { 
					}

					if(!DetalleChequeGiradoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DetalleChequeGiradoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) { 
							this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_sucursalDetalleChequeGirado.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_sucursalDetalleChequeGirado.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) { 
					}

					if(!DetalleChequeGiradoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DetalleChequeGiradoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) { 
							this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_ejercicioDetalleChequeGirado.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_ejercicioDetalleChequeGirado.addItem(ejercicio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) { 
					}

					if(!DetalleChequeGiradoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DetalleChequeGiradoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) { 
							this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_periodoDetalleChequeGirado.removeAllItems();

							for(Periodo periodo:this.periodosForeignKey) {
								this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_periodoDetalleChequeGirado.addItem(periodo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) { 
					}

					if(!DetalleChequeGiradoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameAsientoContablesForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingAsientoContable=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DetalleChequeGiradoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) { 
							this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_asiento_contableDetalleChequeGirado.removeAllItems();

							for(AsientoContable asientocontable:this.asientocontablesForeignKey) {
								this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_asiento_contableDetalleChequeGirado.addItem(asientocontable);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) { 
					}

					if(!DetalleChequeGiradoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdAsientoContable") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DetalleChequeGiradoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_asiento_contableFK_IdAsientoContableDetalleChequeGirado.removeAllItems();

							for(AsientoContable asientocontable:this.asientocontablesForeignKey) {
								this.jComboBoxid_asiento_contableFK_IdAsientoContableDetalleChequeGirado.addItem(asientocontable);
							}
						}

						if(!DetalleChequeGiradoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEmpleadosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEmpleado=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DetalleChequeGiradoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) { 
							this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_empleadoDetalleChequeGirado.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_empleadoDetalleChequeGirado.addItem(empleado);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) { 
					}

					if(!DetalleChequeGiradoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DetalleChequeGiradoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoDetalleChequeGirado.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jComboBoxid_empleadoFK_IdEmpleadoDetalleChequeGirado.addItem(empleado);
							}
						}

						if(!DetalleChequeGiradoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameCuentaBancosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCuentaBanco=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DetalleChequeGiradoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) { 
							this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_cuenta_bancoDetalleChequeGirado.removeAllItems();

							for(CuentaBanco cuentabanco:this.cuentabancosForeignKey) {
								this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_cuenta_bancoDetalleChequeGirado.addItem(cuentabanco);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) { 
					}

					if(!DetalleChequeGiradoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCuentaBanco") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DetalleChequeGiradoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_cuenta_bancoFK_IdCuentaBancoDetalleChequeGirado.removeAllItems();

							for(CuentaBanco cuentabanco:this.cuentabancosForeignKey) {
								this.jComboBoxid_cuenta_bancoFK_IdCuentaBancoDetalleChequeGirado.addItem(cuentabanco);
							}
						}

						if(!DetalleChequeGiradoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DetalleChequeGiradoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) { 
							this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_anioDetalleChequeGirado.removeAllItems();

							for(Anio anio:this.aniosForeignKey) {
								this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_anioDetalleChequeGirado.addItem(anio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) { 
					}

					if(!DetalleChequeGiradoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DetalleChequeGiradoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) { 
							this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_mesDetalleChequeGirado.removeAllItems();

							for(Mes mes:this.messForeignKey) {
								this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_mesDetalleChequeGirado.addItem(mes);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) { 
					}

					if(!DetalleChequeGiradoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) {
							this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_empresaDetalleChequeGirado.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) {
							this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_empresaDetalleChequeGirado.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) {
							this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_sucursalDetalleChequeGirado.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) {
							this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_sucursalDetalleChequeGirado.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) {
							this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_ejercicioDetalleChequeGirado.setSelectedItem(ejercicio);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) {
							this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_ejercicioDetalleChequeGirado.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) {
							this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_periodoDetalleChequeGirado.setSelectedItem(periodo);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) {
							this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_periodoDetalleChequeGirado.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameAsientoContableForeignKey(AsientoContable asientocontable,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) {
							this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_asiento_contableDetalleChequeGirado.setSelectedItem(asientocontable);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) {
							this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_asiento_contableDetalleChequeGirado.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_asiento_contableFK_IdAsientoContableDetalleChequeGirado.setSelectedItem(asientocontable);
						} else {
							this.jComboBoxid_asiento_contableFK_IdAsientoContableDetalleChequeGirado.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameEmpleadoForeignKey(Empleado empleado,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) {
							this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_empleadoDetalleChequeGirado.setSelectedItem(empleado);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) {
							this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_empleadoDetalleChequeGirado.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_empleadoFK_IdEmpleadoDetalleChequeGirado.setSelectedItem(empleado);
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoDetalleChequeGirado.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameCuentaBancoForeignKey(CuentaBanco cuentabanco,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) {
							this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_cuenta_bancoDetalleChequeGirado.setSelectedItem(cuentabanco);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) {
							this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_cuenta_bancoDetalleChequeGirado.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_cuenta_bancoFK_IdCuentaBancoDetalleChequeGirado.setSelectedItem(cuentabanco);
						} else {
							this.jComboBoxid_cuenta_bancoFK_IdCuentaBancoDetalleChequeGirado.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) {
							this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_anioDetalleChequeGirado.setSelectedItem(anio);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) {
							this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_anioDetalleChequeGirado.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) {
							this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_mesDetalleChequeGirado.setSelectedItem(mes);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) {
							this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_mesDetalleChequeGirado.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesDetalleChequeGirado() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			DetalleChequeGiradoConstantesFunciones.refrescarForeignKeysDescripcionesDetalleChequeGirado(this.detallechequegiradoLogic.getDetalleChequeGirados());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			DetalleChequeGiradoConstantesFunciones.refrescarForeignKeysDescripcionesDetalleChequeGirado(this.detallechequegirados);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Ejercicio.class));
		classes.add(new Classe(Periodo.class));
		classes.add(new Classe(AsientoContable.class));
		classes.add(new Classe(Empleado.class));
		classes.add(new Classe(CuentaBanco.class));
		classes.add(new Classe(Anio.class));
		classes.add(new Classe(Mes.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//detallechequegiradoLogic.setDetalleChequeGirados(this.detallechequegirados);
			detallechequegiradoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public DetalleChequeGiradoParameterReturnGeneral getDetalleChequeGiradoParameterGeneral() {
		return this.detallechequegiradoParameterGeneral;
	}
	
	public void setDetalleChequeGiradoParameterGeneral(DetalleChequeGiradoParameterReturnGeneral detallechequegiradoParameterGeneral) {
		this.detallechequegiradoParameterGeneral = detallechequegiradoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoDetalleChequeGirado() {
		return isPermisoTodoDetalleChequeGirado;
	}

	public void setIsPermisoTodoDetalleChequeGirado(Boolean isPermisoTodoDetalleChequeGirado) {
		this.isPermisoTodoDetalleChequeGirado = isPermisoTodoDetalleChequeGirado;
	}

	public Boolean getIsPermisoNuevoDetalleChequeGirado() {
		return isPermisoNuevoDetalleChequeGirado;
	}

	public void setIsPermisoNuevoDetalleChequeGirado(Boolean isPermisoNuevoDetalleChequeGirado) {
		this.isPermisoNuevoDetalleChequeGirado = isPermisoNuevoDetalleChequeGirado;
	}

	public Boolean getIsPermisoActualizarDetalleChequeGirado() {
		return isPermisoActualizarDetalleChequeGirado;
	}

	public void setIsPermisoActualizarDetalleChequeGirado(Boolean isPermisoActualizarDetalleChequeGirado) {
		this.isPermisoActualizarDetalleChequeGirado = isPermisoActualizarDetalleChequeGirado;
	}

	public Boolean getIsPermisoEliminarDetalleChequeGirado() {
		return isPermisoEliminarDetalleChequeGirado;
	}

	public void setIsPermisoEliminarDetalleChequeGirado(Boolean isPermisoEliminarDetalleChequeGirado) {
		this.isPermisoEliminarDetalleChequeGirado = isPermisoEliminarDetalleChequeGirado;
	}

	public Boolean getIsPermisoGuardarCambiosDetalleChequeGirado() {
		return isPermisoGuardarCambiosDetalleChequeGirado;
	}

	public void setIsPermisoGuardarCambiosDetalleChequeGirado(Boolean isPermisoGuardarCambiosDetalleChequeGirado) {
		this.isPermisoGuardarCambiosDetalleChequeGirado = isPermisoGuardarCambiosDetalleChequeGirado;
	}
	
	public Boolean getIsPermisoConsultaDetalleChequeGirado() {
		return isPermisoConsultaDetalleChequeGirado;
	}

	public void setIsPermisoConsultaDetalleChequeGirado(Boolean isPermisoConsultaDetalleChequeGirado) {
		this.isPermisoConsultaDetalleChequeGirado = isPermisoConsultaDetalleChequeGirado;
	}

	public Boolean getIsPermisoBusquedaDetalleChequeGirado() {
		return isPermisoBusquedaDetalleChequeGirado;
	}

	public void setIsPermisoBusquedaDetalleChequeGirado(Boolean isPermisoBusquedaDetalleChequeGirado) {
		this.isPermisoBusquedaDetalleChequeGirado = isPermisoBusquedaDetalleChequeGirado;
	}

	public Boolean getIsPermisoReporteDetalleChequeGirado() {
		return isPermisoReporteDetalleChequeGirado;
	}

	public void setIsPermisoReporteDetalleChequeGirado(Boolean isPermisoReporteDetalleChequeGirado) {
		this.isPermisoReporteDetalleChequeGirado = isPermisoReporteDetalleChequeGirado;
	}
	
	public Boolean getIsPermisoPaginacionMedioDetalleChequeGirado() {
		return isPermisoPaginacionMedioDetalleChequeGirado;
	}

	public void setIsPermisoPaginacionMedioDetalleChequeGirado(Boolean isPermisoPaginacionMedioDetalleChequeGirado) {
		this.isPermisoPaginacionMedioDetalleChequeGirado = isPermisoPaginacionMedioDetalleChequeGirado;
	}
	
	public Boolean getIsPermisoPaginacionTodoDetalleChequeGirado() {
		return isPermisoPaginacionTodoDetalleChequeGirado;
	}

	public void setIsPermisoPaginacionTodoDetalleChequeGirado(Boolean isPermisoPaginacionTodoDetalleChequeGirado) {
		this.isPermisoPaginacionTodoDetalleChequeGirado = isPermisoPaginacionTodoDetalleChequeGirado;
	}
	
	public Boolean getIsPermisoPaginacionAltoDetalleChequeGirado() {
		return isPermisoPaginacionAltoDetalleChequeGirado;
	}

	public void setIsPermisoPaginacionAltoDetalleChequeGirado(Boolean isPermisoPaginacionAltoDetalleChequeGirado) {
		this.isPermisoPaginacionAltoDetalleChequeGirado = isPermisoPaginacionAltoDetalleChequeGirado;
	}
	
	public Boolean getIsPermisoCopiarDetalleChequeGirado() {
		return isPermisoCopiarDetalleChequeGirado;
	}

	public void setIsPermisoCopiarDetalleChequeGirado(Boolean isPermisoCopiarDetalleChequeGirado) {
		this.isPermisoCopiarDetalleChequeGirado = isPermisoCopiarDetalleChequeGirado;
	}
	
	public Boolean getIsPermisoVerFormDetalleChequeGirado() {
		return isPermisoVerFormDetalleChequeGirado;
	}

	public void setIsPermisoVerFormDetalleChequeGirado(Boolean isPermisoVerFormDetalleChequeGirado) {
		this.isPermisoVerFormDetalleChequeGirado = isPermisoVerFormDetalleChequeGirado;
	}
	
	public Boolean getIsPermisoDuplicarDetalleChequeGirado() {
		return isPermisoDuplicarDetalleChequeGirado;
	}

	public void setIsPermisoDuplicarDetalleChequeGirado(Boolean isPermisoDuplicarDetalleChequeGirado) {
		this.isPermisoDuplicarDetalleChequeGirado = isPermisoDuplicarDetalleChequeGirado;
	}
	
	public Boolean getIsPermisoOrdenDetalleChequeGirado() {
		return isPermisoOrdenDetalleChequeGirado;
	}

	public void setIsPermisoOrdenDetalleChequeGirado(Boolean isPermisoOrdenDetalleChequeGirado) {
		this.isPermisoOrdenDetalleChequeGirado = isPermisoOrdenDetalleChequeGirado;
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
	
	public Boolean getIsVisibilidadCeldaNuevoDetalleChequeGirado() {
		return isVisibilidadCeldaNuevoDetalleChequeGirado;
	}

	public void setIsVisibilidadCeldaNuevoDetalleChequeGirado(Boolean isVisibilidadCeldaNuevoDetalleChequeGirado) {
		this.isVisibilidadCeldaNuevoDetalleChequeGirado = isVisibilidadCeldaNuevoDetalleChequeGirado;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarDetalleChequeGirado() {
		return isVisibilidadCeldaDuplicarDetalleChequeGirado;
	}

	public void setIsVisibilidadCeldaDuplicarDetalleChequeGirado(Boolean isVisibilidadCeldaDuplicarDetalleChequeGirado) {
		this.isVisibilidadCeldaDuplicarDetalleChequeGirado = isVisibilidadCeldaDuplicarDetalleChequeGirado;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarDetalleChequeGirado() {
		return isVisibilidadCeldaCopiarDetalleChequeGirado;
	}

	public void setIsVisibilidadCeldaCopiarDetalleChequeGirado(Boolean isVisibilidadCeldaCopiarDetalleChequeGirado) {
		this.isVisibilidadCeldaCopiarDetalleChequeGirado = isVisibilidadCeldaCopiarDetalleChequeGirado;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormDetalleChequeGirado() {
		return isVisibilidadCeldaVerFormDetalleChequeGirado;
	}

	public void setIsVisibilidadCeldaVerFormDetalleChequeGirado(Boolean isVisibilidadCeldaVerFormDetalleChequeGirado) {
		this.isVisibilidadCeldaVerFormDetalleChequeGirado = isVisibilidadCeldaVerFormDetalleChequeGirado;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenDetalleChequeGirado() {
		return isVisibilidadCeldaOrdenDetalleChequeGirado;
	}

	public void setIsVisibilidadCeldaOrdenDetalleChequeGirado(Boolean isVisibilidadCeldaOrdenDetalleChequeGirado) {
		this.isVisibilidadCeldaOrdenDetalleChequeGirado = isVisibilidadCeldaOrdenDetalleChequeGirado;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesDetalleChequeGirado() {
		return isVisibilidadCeldaNuevoRelacionesDetalleChequeGirado;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesDetalleChequeGirado(Boolean isVisibilidadCeldaNuevoRelacionesDetalleChequeGirado) {
		this.isVisibilidadCeldaNuevoRelacionesDetalleChequeGirado = isVisibilidadCeldaNuevoRelacionesDetalleChequeGirado;
	}
	
	public Boolean getIsVisibilidadCeldaModificarDetalleChequeGirado() {
		return isVisibilidadCeldaModificarDetalleChequeGirado;
	}

	public void setIsVisibilidadCeldaModificarDetalleChequeGirado(Boolean isVisibilidadCeldaModificarDetalleChequeGirado) {
		this.isVisibilidadCeldaModificarDetalleChequeGirado = isVisibilidadCeldaModificarDetalleChequeGirado;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarDetalleChequeGirado() {
		return isVisibilidadCeldaActualizarDetalleChequeGirado;
	}

	public void setIsVisibilidadCeldaActualizarDetalleChequeGirado(Boolean isVisibilidadCeldaActualizarDetalleChequeGirado) {
		this.isVisibilidadCeldaActualizarDetalleChequeGirado = isVisibilidadCeldaActualizarDetalleChequeGirado;
	}

	public Boolean getIsVisibilidadCeldaEliminarDetalleChequeGirado() {
		return isVisibilidadCeldaEliminarDetalleChequeGirado;
	}

	public void setIsVisibilidadCeldaEliminarDetalleChequeGirado(Boolean isVisibilidadCeldaEliminarDetalleChequeGirado) {
		this.isVisibilidadCeldaEliminarDetalleChequeGirado = isVisibilidadCeldaEliminarDetalleChequeGirado;
	}

	public Boolean getIsVisibilidadCeldaCancelarDetalleChequeGirado() {
		return isVisibilidadCeldaCancelarDetalleChequeGirado;
	}

	public void setIsVisibilidadCeldaCancelarDetalleChequeGirado(Boolean isVisibilidadCeldaCancelarDetalleChequeGirado) {
		this.isVisibilidadCeldaCancelarDetalleChequeGirado = isVisibilidadCeldaCancelarDetalleChequeGirado;
	}

	public Boolean getIsVisibilidadCeldaGuardarDetalleChequeGirado() {
		return isVisibilidadCeldaGuardarDetalleChequeGirado;
	}

	public void setIsVisibilidadCeldaGuardarDetalleChequeGirado(Boolean isVisibilidadCeldaGuardarDetalleChequeGirado) {
		this.isVisibilidadCeldaGuardarDetalleChequeGirado = isVisibilidadCeldaGuardarDetalleChequeGirado;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosDetalleChequeGirado() {
		return isVisibilidadCeldaGuardarCambiosDetalleChequeGirado;
	}

	public void setIsVisibilidadCeldaGuardarCambiosDetalleChequeGirado(Boolean isVisibilidadCeldaGuardarCambiosDetalleChequeGirado) {
		this.isVisibilidadCeldaGuardarCambiosDetalleChequeGirado = isVisibilidadCeldaGuardarCambiosDetalleChequeGirado;
	}
		
	public DetalleChequeGiradoSessionBean getdetallechequegiradoSessionBean() {
		return this.detallechequegiradoSessionBean;
	}
	
	public void setdetallechequegiradoSessionBean(DetalleChequeGiradoSessionBean detallechequegiradoSessionBean) {
		this.detallechequegiradoSessionBean=detallechequegiradoSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdAnio() {
		return this.isVisibilidadFK_IdAnio;
	}

	public void setisVisibilidadFK_IdAnio(Boolean isVisibilidadFK_IdAnio) {
		this.isVisibilidadFK_IdAnio=isVisibilidadFK_IdAnio;
	}

	public Boolean getisVisibilidadFK_IdAsientoContable() {
		return this.isVisibilidadFK_IdAsientoContable;
	}

	public void setisVisibilidadFK_IdAsientoContable(Boolean isVisibilidadFK_IdAsientoContable) {
		this.isVisibilidadFK_IdAsientoContable=isVisibilidadFK_IdAsientoContable;
	}

	public Boolean getisVisibilidadFK_IdCuentaBanco() {
		return this.isVisibilidadFK_IdCuentaBanco;
	}

	public void setisVisibilidadFK_IdCuentaBanco(Boolean isVisibilidadFK_IdCuentaBanco) {
		this.isVisibilidadFK_IdCuentaBanco=isVisibilidadFK_IdCuentaBanco;
	}

	public Boolean getisVisibilidadFK_IdEjercicio() {
		return this.isVisibilidadFK_IdEjercicio;
	}

	public void setisVisibilidadFK_IdEjercicio(Boolean isVisibilidadFK_IdEjercicio) {
		this.isVisibilidadFK_IdEjercicio=isVisibilidadFK_IdEjercicio;
	}

	public Boolean getisVisibilidadFK_IdEmpleado() {
		return this.isVisibilidadFK_IdEmpleado;
	}

	public void setisVisibilidadFK_IdEmpleado(Boolean isVisibilidadFK_IdEmpleado) {
		this.isVisibilidadFK_IdEmpleado=isVisibilidadFK_IdEmpleado;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysDetalleChequeGirado(DetalleChequeGirado detallechequegirado)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(detallechequegirado,null);
				this.setActualParaGuardarSucursalForeignKey(detallechequegirado,null);
				this.setActualParaGuardarEjercicioForeignKey(detallechequegirado,null);
				this.setActualParaGuardarPeriodoForeignKey(detallechequegirado,null);
				this.setActualParaGuardarAsientoContableForeignKey(detallechequegirado,null);
				this.setActualParaGuardarEmpleadoForeignKey(detallechequegirado,null);
				this.setActualParaGuardarCuentaBancoForeignKey(detallechequegirado,null);
				this.setActualParaGuardarAnioForeignKey(detallechequegirado,null);
				this.setActualParaGuardarMesForeignKey(detallechequegirado,null);
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
	
	public void bugActualizarReferenciaActual(DetalleChequeGirado detallechequegirado,DetalleChequeGirado detallechequegiradoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalDetalleChequeGirado(detallechequegirado);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		detallechequegiradoAux.setId(detallechequegirado.getId());
		detallechequegiradoAux.setVersionRow(detallechequegirado.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessDetalleChequeGirado();
		
			int intSelectedRow = this.jTableDatosDetalleChequeGirado.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegirado =(DetalleChequeGirado) this.detallechequegiradoLogic.getDetalleChequeGirados().toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.detallechequegirado =(DetalleChequeGirado) this.detallechequegirados.toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(DetalleChequeGiradoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualDetalleChequeGirado(this.detallechequegirado,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleChequeGirado(this.detallechequegirado);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = detallechequegiradoValidator.getInvalidValues(this.detallechequegirado);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			detallechequegiradoLogic.setDatosCliente(datosCliente);
			detallechequegiradoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				detallechequegiradoAux=new  DetalleChequeGirado();
				
				detallechequegiradoAux.setIsNew(true);
				detallechequegiradoAux.setIsChanged(true);
				
				detallechequegiradoAux.setDetalleChequeGiradoOriginal(this.detallechequegirado);
				
				detallechequegiradoAux.setId(this.detallechequegirado.getId());	
				detallechequegiradoAux.setVersionRow(this.detallechequegirado.getVersionRow());	
				detallechequegiradoAux.setid_empresa(this.detallechequegirado.getid_empresa());	
				detallechequegiradoAux.setid_sucursal(this.detallechequegirado.getid_sucursal());	
				detallechequegiradoAux.setid_ejercicio(this.detallechequegirado.getid_ejercicio());	
				detallechequegiradoAux.setid_periodo(this.detallechequegirado.getid_periodo());	
				detallechequegiradoAux.setid_asiento_contable(this.detallechequegirado.getid_asiento_contable());	
				detallechequegiradoAux.setid_empleado(this.detallechequegirado.getid_empleado());	
				detallechequegiradoAux.setid_cuenta_banco(this.detallechequegirado.getid_cuenta_banco());	
				detallechequegiradoAux.setnumero_cheque(this.detallechequegirado.getnumero_cheque());	
				detallechequegiradoAux.setvalor(this.detallechequegirado.getvalor());	
				detallechequegiradoAux.setcuenta(this.detallechequegirado.getcuenta());	
				detallechequegiradoAux.setfecha(this.detallechequegirado.getfecha());	
				detallechequegiradoAux.setcon(this.detallechequegirado.getcon());	
				detallechequegiradoAux.setbeneficiario(this.detallechequegirado.getbeneficiario());	
				detallechequegiradoAux.setcodigo(this.detallechequegirado.getcodigo());	
				detallechequegiradoAux.setnombre_banco(this.detallechequegirado.getnombre_banco());	
				detallechequegiradoAux.setid_anio(this.detallechequegirado.getid_anio());	
				detallechequegiradoAux.setid_mes(this.detallechequegirado.getid_mes());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.detallechequegiradoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.detallechequegiradoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(detallechequegiradoAux,detallechequegiradoLogic.getDetalleChequeGirados());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detallechequegiradoAux,detallechequegirados);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.detallechequegiradoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.detallechequegiradoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detallechequegiradoLogic.saveDetalleChequeGirados();//WithConnection
						//detallechequegiradoLogic.getSetVersionRowDetalleChequeGirados();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.detallechequegirado,detallechequegiradoAux);
					
					this.refrescarForeignKeysDescripcionesDetalleChequeGirado();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.detallechequegiradoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.detallechequegiradoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								detallechequegiradoLogic.saveDetalleChequeGiradoRelaciones(detallechequegiradoAux);//WithConnection
								//detallechequegiradoLogic.getSetVersionRowDetalleChequeGirados();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.detallechequegirado,detallechequegiradoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.detallechequegiradoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.detallechequegiradoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(detallechequegiradoAux,detallechequegiradoLogic.getDetalleChequeGirados());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(detallechequegiradoAux,detallechequegirados);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.detallechequegirado,detallechequegiradoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				detallechequegiradoAux=new  DetalleChequeGirado();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.detallechequegiradoSessionBean.getEsGuardarRelacionado() 
					|| (this.detallechequegiradoSessionBean.getEsGuardarRelacionado() && this.detallechequegirado.getId()>=0)) {
						
					detallechequegiradoAux.setIsNew(false);
				}
				
				detallechequegiradoAux.setIsDeleted(false);
			
				detallechequegiradoAux.setId(this.detallechequegirado.getId());	
				detallechequegiradoAux.setVersionRow(this.detallechequegirado.getVersionRow());	
				detallechequegiradoAux.setid_empresa(this.detallechequegirado.getid_empresa());	
				detallechequegiradoAux.setid_sucursal(this.detallechequegirado.getid_sucursal());	
				detallechequegiradoAux.setid_ejercicio(this.detallechequegirado.getid_ejercicio());	
				detallechequegiradoAux.setid_periodo(this.detallechequegirado.getid_periodo());	
				detallechequegiradoAux.setid_asiento_contable(this.detallechequegirado.getid_asiento_contable());	
				detallechequegiradoAux.setid_empleado(this.detallechequegirado.getid_empleado());	
				detallechequegiradoAux.setid_cuenta_banco(this.detallechequegirado.getid_cuenta_banco());	
				detallechequegiradoAux.setnumero_cheque(this.detallechequegirado.getnumero_cheque());	
				detallechequegiradoAux.setvalor(this.detallechequegirado.getvalor());	
				detallechequegiradoAux.setcuenta(this.detallechequegirado.getcuenta());	
				detallechequegiradoAux.setfecha(this.detallechequegirado.getfecha());	
				detallechequegiradoAux.setcon(this.detallechequegirado.getcon());	
				detallechequegiradoAux.setbeneficiario(this.detallechequegirado.getbeneficiario());	
				detallechequegiradoAux.setcodigo(this.detallechequegirado.getcodigo());	
				detallechequegiradoAux.setnombre_banco(this.detallechequegirado.getnombre_banco());	
				detallechequegiradoAux.setid_anio(this.detallechequegirado.getid_anio());	
				detallechequegiradoAux.setid_mes(this.detallechequegirado.getid_mes());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(detallechequegiradoAux,detallechequegiradoLogic.getDetalleChequeGirados());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detallechequegiradoAux,detallechequegirados);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.detallechequegiradoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.detallechequegiradoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detallechequegiradoLogic.saveDetalleChequeGirados();//WithConnection
						//detallechequegiradoLogic.getSetVersionRowDetalleChequeGirados();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.detallechequegirado,detallechequegiradoAux);
					
					this.refrescarForeignKeysDescripcionesDetalleChequeGirado();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.detallechequegiradoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.detallechequegiradoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								detallechequegiradoLogic.saveDetalleChequeGiradoRelaciones(detallechequegiradoAux);//WithConnection
								//detallechequegiradoLogic.getSetVersionRowDetalleChequeGirados();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.detallechequegirado,detallechequegiradoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.detallechequegiradoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.detallechequegiradoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(detallechequegiradoAux,detallechequegiradoLogic.getDetalleChequeGirados());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(detallechequegiradoAux,detallechequegirados);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.detallechequegirado,detallechequegiradoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				detallechequegiradoAux=new  DetalleChequeGirado();
				
				detallechequegiradoAux.setIsNew(false);
				detallechequegiradoAux.setIsChanged(false);
				
				detallechequegiradoAux.setIsDeleted(true);
				
				detallechequegiradoAux.setId(this.detallechequegirado.getId());	
				detallechequegiradoAux.setVersionRow(this.detallechequegirado.getVersionRow());	
				detallechequegiradoAux.setid_empresa(this.detallechequegirado.getid_empresa());	
				detallechequegiradoAux.setid_sucursal(this.detallechequegirado.getid_sucursal());	
				detallechequegiradoAux.setid_ejercicio(this.detallechequegirado.getid_ejercicio());	
				detallechequegiradoAux.setid_periodo(this.detallechequegirado.getid_periodo());	
				detallechequegiradoAux.setid_asiento_contable(this.detallechequegirado.getid_asiento_contable());	
				detallechequegiradoAux.setid_empleado(this.detallechequegirado.getid_empleado());	
				detallechequegiradoAux.setid_cuenta_banco(this.detallechequegirado.getid_cuenta_banco());	
				detallechequegiradoAux.setnumero_cheque(this.detallechequegirado.getnumero_cheque());	
				detallechequegiradoAux.setvalor(this.detallechequegirado.getvalor());	
				detallechequegiradoAux.setcuenta(this.detallechequegirado.getcuenta());	
				detallechequegiradoAux.setfecha(this.detallechequegirado.getfecha());	
				detallechequegiradoAux.setcon(this.detallechequegirado.getcon());	
				detallechequegiradoAux.setbeneficiario(this.detallechequegirado.getbeneficiario());	
				detallechequegiradoAux.setcodigo(this.detallechequegirado.getcodigo());	
				detallechequegiradoAux.setnombre_banco(this.detallechequegirado.getnombre_banco());	
				detallechequegiradoAux.setid_anio(this.detallechequegirado.getid_anio());	
				detallechequegiradoAux.setid_mes(this.detallechequegirado.getid_mes());	
				
				if(this.detallechequegiradoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.detallechequegiradoAux.getId()>=0) {	
						this.detallechequegiradosEliminados.add(detallechequegiradoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(detallechequegiradoAux,detallechequegiradoLogic.getDetalleChequeGirados());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detallechequegiradoAux,detallechequegirados);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.detallechequegiradoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.detallechequegiradoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detallechequegiradoLogic.saveDetalleChequeGirados();//WithConnection
						//detallechequegiradoLogic.getSetVersionRowDetalleChequeGirados();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.detallechequegiradoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.detallechequegiradoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								detallechequegiradoLogic.saveDetalleChequeGiradoRelaciones(detallechequegiradoAux);//WithConnection
								//detallechequegiradoLogic.getSetVersionRowDetalleChequeGirados();//WithConnection
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
							if(this.detallechequegiradoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.detallechequegiradoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(detallechequegiradoAux,detallechequegiradoLogic.getDetalleChequeGirados());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(detallechequegiradoAux,detallechequegirados);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegiradoLogic.getDetalleChequeGirados().addAll(this.detallechequegiradosEliminados);
					
					detallechequegiradoLogic.saveDetalleChequeGirados();//WithConnection
					//detallechequegiradoLogic.getSetVersionRowDetalleChequeGirados();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesDetalleChequeGirado();
				
				this.detallechequegiradosEliminados= new ArrayList<DetalleChequeGirado>();		
			}
			
			if(this.detallechequegiradoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallechequegiradoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Detalle Cheque Girado GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Detalle Cheque Girado",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.detallechequegirado=detallechequegiradoAux;
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
      		//this.finishProcessDetalleChequeGirado();
      	}
		
	}	
	
	public void actualizarRelaciones(DetalleChequeGirado detallechequegiradoLocal) throws Exception {
		
		if(this.detallechequegiradoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(DetalleChequeGirado detallechequegiradoLocal) throws Exception {	
		if(this.detallechequegiradoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				detallechequegiradoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				detallechequegiradoLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EjercicioDetalleFormJInternalFrame.class)) {
				EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrameLocal=(EjercicioBeanSwingJInternalFrame) ((EjercicioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ejercicioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEjercicio(ejercicioBeanSwingJInternalFrameLocal.getejercicio(),true);
				ejercicioBeanSwingJInternalFrameLocal.actualizarLista(ejercicioBeanSwingJInternalFrameLocal.ejercicio,this.ejerciciosForeignKey);

				ejercicioBeanSwingJInternalFrameLocal.actualizarRelaciones(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				detallechequegiradoLocal.setEjercicio(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				this.addItemDefectoCombosForeignKeyEjercicio();
				this.cargarCombosFrameEjerciciosForeignKey("Formulario");
				this.setActualEjercicioForeignKey(ejercicioBeanSwingJInternalFrameLocal.ejercicio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(PeriodoDetalleFormJInternalFrame.class)) {
				PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrameLocal=(PeriodoBeanSwingJInternalFrame) ((PeriodoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				periodoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPeriodo(periodoBeanSwingJInternalFrameLocal.getperiodo(),true);
				periodoBeanSwingJInternalFrameLocal.actualizarLista(periodoBeanSwingJInternalFrameLocal.periodo,this.periodosForeignKey);

				periodoBeanSwingJInternalFrameLocal.actualizarRelaciones(periodoBeanSwingJInternalFrameLocal.periodo);

				detallechequegiradoLocal.setPeriodo(periodoBeanSwingJInternalFrameLocal.periodo);

				this.addItemDefectoCombosForeignKeyPeriodo();
				this.cargarCombosFramePeriodosForeignKey("Formulario");
				this.setActualPeriodoForeignKey(periodoBeanSwingJInternalFrameLocal.periodo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(AsientoContableDetalleFormJInternalFrame.class)) {
				AsientoContableBeanSwingJInternalFrame asientocontableBeanSwingJInternalFrameLocal=(AsientoContableBeanSwingJInternalFrame) ((AsientoContableDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				asientocontableBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoAsientoContable(asientocontableBeanSwingJInternalFrameLocal.getasientocontable(),true);
				asientocontableBeanSwingJInternalFrameLocal.actualizarLista(asientocontableBeanSwingJInternalFrameLocal.asientocontable,this.asientocontablesForeignKey);

				asientocontableBeanSwingJInternalFrameLocal.actualizarRelaciones(asientocontableBeanSwingJInternalFrameLocal.asientocontable);

				detallechequegiradoLocal.setAsientoContable(asientocontableBeanSwingJInternalFrameLocal.asientocontable);

				this.addItemDefectoCombosForeignKeyAsientoContable();
				this.cargarCombosFrameAsientoContablesForeignKey("Formulario");
				this.setActualAsientoContableForeignKey(asientocontableBeanSwingJInternalFrameLocal.asientocontable.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpleadoDetalleFormJInternalFrame.class)) {
				EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrameLocal=(EmpleadoBeanSwingJInternalFrame) ((EmpleadoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empleadoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpleado(empleadoBeanSwingJInternalFrameLocal.getempleado(),true);
				empleadoBeanSwingJInternalFrameLocal.actualizarLista(empleadoBeanSwingJInternalFrameLocal.empleado,this.empleadosForeignKey);

				empleadoBeanSwingJInternalFrameLocal.actualizarRelaciones(empleadoBeanSwingJInternalFrameLocal.empleado);

				detallechequegiradoLocal.setEmpleado(empleadoBeanSwingJInternalFrameLocal.empleado);

				this.addItemDefectoCombosForeignKeyEmpleado();
				this.cargarCombosFrameEmpleadosForeignKey("Formulario");
				this.setActualEmpleadoForeignKey(empleadoBeanSwingJInternalFrameLocal.empleado.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CuentaBancoDetalleFormJInternalFrame.class)) {
				CuentaBancoBeanSwingJInternalFrame cuentabancoBeanSwingJInternalFrameLocal=(CuentaBancoBeanSwingJInternalFrame) ((CuentaBancoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				cuentabancoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCuentaBanco(cuentabancoBeanSwingJInternalFrameLocal.getcuentabanco(),true);
				cuentabancoBeanSwingJInternalFrameLocal.actualizarLista(cuentabancoBeanSwingJInternalFrameLocal.cuentabanco,this.cuentabancosForeignKey);

				cuentabancoBeanSwingJInternalFrameLocal.actualizarRelaciones(cuentabancoBeanSwingJInternalFrameLocal.cuentabanco);

				detallechequegiradoLocal.setCuentaBanco(cuentabancoBeanSwingJInternalFrameLocal.cuentabanco);

				this.addItemDefectoCombosForeignKeyCuentaBanco();
				this.cargarCombosFrameCuentaBancosForeignKey("Formulario");
				this.setActualCuentaBancoForeignKey(cuentabancoBeanSwingJInternalFrameLocal.cuentabanco.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(AnioDetalleFormJInternalFrame.class)) {
				AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrameLocal=(AnioBeanSwingJInternalFrame) ((AnioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				anioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoAnio(anioBeanSwingJInternalFrameLocal.getanio(),true);
				anioBeanSwingJInternalFrameLocal.actualizarLista(anioBeanSwingJInternalFrameLocal.anio,this.aniosForeignKey);

				anioBeanSwingJInternalFrameLocal.actualizarRelaciones(anioBeanSwingJInternalFrameLocal.anio);

				detallechequegiradoLocal.setAnio(anioBeanSwingJInternalFrameLocal.anio);

				this.addItemDefectoCombosForeignKeyAnio();
				this.cargarCombosFrameAniosForeignKey("Formulario");
				this.setActualAnioForeignKey(anioBeanSwingJInternalFrameLocal.anio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(MesDetalleFormJInternalFrame.class)) {
				MesBeanSwingJInternalFrame mesBeanSwingJInternalFrameLocal=(MesBeanSwingJInternalFrame) ((MesDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				mesBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoMes(mesBeanSwingJInternalFrameLocal.getmes(),true);
				mesBeanSwingJInternalFrameLocal.actualizarLista(mesBeanSwingJInternalFrameLocal.mes,this.messForeignKey);

				mesBeanSwingJInternalFrameLocal.actualizarRelaciones(mesBeanSwingJInternalFrameLocal.mes);

				detallechequegiradoLocal.setMes(mesBeanSwingJInternalFrameLocal.mes);

				this.addItemDefectoCombosForeignKeyMes();
				this.cargarCombosFrameMessForeignKey("Formulario");
				this.setActualMesForeignKey(mesBeanSwingJInternalFrameLocal.mes.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarDetalleChequeGiradoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosDetalleChequeGirado.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.detallechequegirado =(DetalleChequeGirado) this.detallechequegiradoLogic.getDetalleChequeGirados().toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.detallechequegirado =(DetalleChequeGirado) this.detallechequegirados.toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = detallechequegiradoValidator.getInvalidValues(this.detallechequegirado);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(DetalleChequeGirado detallechequegirado,List<DetalleChequeGirado> detallechequegirados) throws Exception {
		try	{		
			DetalleChequeGiradoConstantesFunciones.actualizarLista(detallechequegirado,detallechequegirados,this.detallechequegiradoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(DetalleChequeGirado detallechequegirado,List<DetalleChequeGirado> detallechequegirados) throws Exception {
		try	{			
			DetalleChequeGiradoConstantesFunciones.actualizarSelectedLista(detallechequegirado,detallechequegirados);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<DetalleChequeGirado> detallechequegiradosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				detallechequegiradosLocal=this.detallechequegiradoLogic.getDetalleChequeGirados();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				detallechequegiradosLocal=this.detallechequegirados;
			}
			//ARCHITECTURE
		
			for(DetalleChequeGirado detallechequegiradoLocal:detallechequegiradosLocal) {
				if(this.permiteMantenimiento(detallechequegiradoLocal) && detallechequegiradoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+DetalleChequeGiradoConstantesFunciones.getDetalleChequeGiradoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(DetalleChequeGiradoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleChequeGirado.jLabelid_empresaDetalleChequeGirado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleChequeGiradoConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleChequeGirado.jLabelid_sucursalDetalleChequeGirado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleChequeGiradoConstantesFunciones.IDEJERCICIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleChequeGirado.jLabelid_ejercicioDetalleChequeGirado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleChequeGiradoConstantesFunciones.IDPERIODO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleChequeGirado.jLabelid_periodoDetalleChequeGirado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleChequeGiradoConstantesFunciones.IDASIENTOCONTABLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleChequeGirado.jLabelid_asiento_contableDetalleChequeGirado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleChequeGiradoConstantesFunciones.IDEMPLEADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleChequeGirado.jLabelid_empleadoDetalleChequeGirado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleChequeGiradoConstantesFunciones.IDCUENTABANCO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleChequeGirado.jLabelid_cuenta_bancoDetalleChequeGirado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleChequeGiradoConstantesFunciones.NUMEROCHEQUE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleChequeGirado.jLabelnumero_chequeDetalleChequeGirado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleChequeGiradoConstantesFunciones.VALOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleChequeGirado.jLabelvalorDetalleChequeGirado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleChequeGiradoConstantesFunciones.CUENTA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleChequeGirado.jLabelcuentaDetalleChequeGirado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleChequeGiradoConstantesFunciones.FECHA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleChequeGirado.jLabelfechaDetalleChequeGirado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleChequeGiradoConstantesFunciones.CON)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleChequeGirado.jLabelconDetalleChequeGirado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleChequeGiradoConstantesFunciones.BENEFICIARIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleChequeGirado.jLabelbeneficiarioDetalleChequeGirado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleChequeGiradoConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleChequeGirado.jLabelcodigoDetalleChequeGirado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleChequeGiradoConstantesFunciones.NOMBREBANCO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleChequeGirado.jLabelnombre_bancoDetalleChequeGirado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleChequeGiradoConstantesFunciones.IDANIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleChequeGirado.jLabelid_anioDetalleChequeGirado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleChequeGiradoConstantesFunciones.IDMES)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleChequeGirado.jLabelid_mesDetalleChequeGirado,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleChequeGirado.jLabelid_empresaDetalleChequeGirado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleChequeGirado.jLabelid_sucursalDetalleChequeGirado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleChequeGirado.jLabelid_ejercicioDetalleChequeGirado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleChequeGirado.jLabelid_periodoDetalleChequeGirado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleChequeGirado.jLabelid_asiento_contableDetalleChequeGirado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleChequeGirado.jLabelid_empleadoDetalleChequeGirado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleChequeGirado.jLabelid_cuenta_bancoDetalleChequeGirado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleChequeGirado.jLabelnumero_chequeDetalleChequeGirado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleChequeGirado.jLabelvalorDetalleChequeGirado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleChequeGirado.jLabelcuentaDetalleChequeGirado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleChequeGirado.jLabelfechaDetalleChequeGirado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleChequeGirado.jLabelconDetalleChequeGirado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleChequeGirado.jLabelbeneficiarioDetalleChequeGirado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleChequeGirado.jLabelcodigoDetalleChequeGirado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleChequeGirado.jLabelnombre_bancoDetalleChequeGirado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleChequeGirado.jLabelid_anioDetalleChequeGirado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleChequeGirado.jLabelid_mesDetalleChequeGirado,"");
		
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
		this.iIdNuevoDetalleChequeGirado--;	
		
		
		this.detallechequegiradoAux=new DetalleChequeGirado();
		
		this.detallechequegiradoAux.setId(this.iIdNuevoDetalleChequeGirado);
		this.detallechequegiradoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.detallechequegiradoLogic.getDetalleChequeGirados().add(this.detallechequegiradoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.detallechequegirados.add(this.detallechequegiradoAux);
		}
		//ARCHITECTURE
		
		this.detallechequegirado=this.detallechequegiradoAux;
		
		if(DetalleChequeGiradoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioDetalleChequeGirado(this.detallechequegirado);
			this.setVariablesObjetoActualToFormularioForeignKeyDetalleChequeGirado(this.detallechequegirado);
		}
				
		//this.setDefaultControlesDetalleChequeGirado();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyDetalleChequeGirado();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyDetalleChequeGirado();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyDetalleChequeGirado();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDetalleChequeGirado(this.detallechequegiradoBean,this.detallechequegirado,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysDetalleChequeGirado(this.detallechequegirado);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(DetalleChequeGiradoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.detallechequegiradoSessionBean.getConGuardarRelaciones()) {
			classes=DetalleChequeGiradoConstantesFunciones.getClassesRelationshipsOfDetalleChequeGirado(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.detallechequegiradoReturnGeneral=detallechequegiradoLogic.procesarEventosDetalleChequeGiradosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.detallechequegiradoLogic.getDetalleChequeGirados(),this.detallechequegirado,this.detallechequegiradoParameterGeneral,this.isEsNuevoDetalleChequeGirado,classes);//this.detallechequegiradoLogic.getDetalleChequeGirado()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanDetalleChequeGirado(this.detallechequegiradoReturnGeneral,this.detallechequegiradoBean,false);
		
		if(this.detallechequegiradoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyDetalleChequeGirado(this.detallechequegiradoReturnGeneral.getDetalleChequeGirado());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioDetalleChequeGirado(this.detallechequegiradoReturnGeneral.getDetalleChequeGirado());
		}
		
		if(this.detallechequegiradoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioDetalleChequeGirado(this.detallechequegiradoReturnGeneral.getDetalleChequeGirado(),classes);//this.detallechequegiradoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualDetalleChequeGirado(this.detallechequegirado,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyDetalleChequeGirado();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyDetalleChequeGirado();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			DetalleChequeGiradoBeanSwingJInternalFrameAdditional.RecargarFormDetalleChequeGirado(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingDetalleChequeGirado(false);
						
			if(detallechequegiradoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(DetalleChequeGiradoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDetalleChequeGirado();
			}
			
			this.actualizarVisualTableDatosDetalleChequeGirado();
			
			this.jTableDatosDetalleChequeGirado.setRowSelectionInterval(this.getIndiceNuevoDetalleChequeGirado(), this.getIndiceNuevoDetalleChequeGirado());
			
			this.seleccionarFilaTablaDetalleChequeGiradoActual();
						
			this.actualizarEstadoCeldasBotonesDetalleChequeGirado("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesDetalleChequeGirado(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormDetalleChequeGirado.jTextFieldnumero_chequeDetalleChequeGirado.setEnabled(isHabilitar && this.detallechequegiradoConstantesFunciones.activarnumero_chequeDetalleChequeGirado);
		this.jInternalFrameDetalleFormDetalleChequeGirado.jTextFieldvalorDetalleChequeGirado.setEnabled(isHabilitar && this.detallechequegiradoConstantesFunciones.activarvalorDetalleChequeGirado);
		this.jInternalFrameDetalleFormDetalleChequeGirado.jTextFieldcuentaDetalleChequeGirado.setEnabled(isHabilitar && this.detallechequegiradoConstantesFunciones.activarcuentaDetalleChequeGirado);
		this.jInternalFrameDetalleFormDetalleChequeGirado.jDateChooserfechaDetalleChequeGirado.setEnabled(isHabilitar && this.detallechequegiradoConstantesFunciones.activarfechaDetalleChequeGirado);
		this.jInternalFrameDetalleFormDetalleChequeGirado.jCheckBoxconDetalleChequeGirado.setEnabled(isHabilitar && this.detallechequegiradoConstantesFunciones.activarconDetalleChequeGirado);
		this.jInternalFrameDetalleFormDetalleChequeGirado.jTextAreabeneficiarioDetalleChequeGirado.setEnabled(isHabilitar && this.detallechequegiradoConstantesFunciones.activarbeneficiarioDetalleChequeGirado);
		this.jInternalFrameDetalleFormDetalleChequeGirado.jTextFieldcodigoDetalleChequeGirado.setEnabled(isHabilitar && this.detallechequegiradoConstantesFunciones.activarcodigoDetalleChequeGirado);
		this.jInternalFrameDetalleFormDetalleChequeGirado.jTextAreanombre_bancoDetalleChequeGirado.setEnabled(isHabilitar && this.detallechequegiradoConstantesFunciones.activarnombre_bancoDetalleChequeGirado);	
		//
		this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_empresaDetalleChequeGirado.setEnabled(isHabilitar && this.detallechequegiradoConstantesFunciones.activarid_empresaDetalleChequeGirado);//
		this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_sucursalDetalleChequeGirado.setEnabled(isHabilitar && this.detallechequegiradoConstantesFunciones.activarid_sucursalDetalleChequeGirado);//
		this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_ejercicioDetalleChequeGirado.setEnabled(isHabilitar && this.detallechequegiradoConstantesFunciones.activarid_ejercicioDetalleChequeGirado);//
		this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_periodoDetalleChequeGirado.setEnabled(isHabilitar && this.detallechequegiradoConstantesFunciones.activarid_periodoDetalleChequeGirado);
		this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_asiento_contableDetalleChequeGirado.setEnabled(isHabilitar && this.detallechequegiradoConstantesFunciones.activarid_asiento_contableDetalleChequeGirado);
		this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_empleadoDetalleChequeGirado.setEnabled(isHabilitar && this.detallechequegiradoConstantesFunciones.activarid_empleadoDetalleChequeGirado);
		this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_cuenta_bancoDetalleChequeGirado.setEnabled(isHabilitar && this.detallechequegiradoConstantesFunciones.activarid_cuenta_bancoDetalleChequeGirado);//
		this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_anioDetalleChequeGirado.setEnabled(isHabilitar && this.detallechequegiradoConstantesFunciones.activarid_anioDetalleChequeGirado);//
		this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_mesDetalleChequeGirado.setEnabled(isHabilitar && this.detallechequegiradoConstantesFunciones.activarid_mesDetalleChequeGirado);
	};
	
	public void setDefaultControlesDetalleChequeGirado() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoDetalleChequeGirado(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.detallechequegiradoSessionBean.setConGuardarRelaciones(true);			
			this.detallechequegiradoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormDetalleChequeGirado.jTabbedPaneRelacionesDetalleChequeGirado.setVisible(true);
			
					
		} else {
			//this.detallechequegiradoSessionBean.setConGuardarRelaciones(false);			
			this.detallechequegiradoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormDetalleChequeGirado.jTabbedPaneRelacionesDetalleChequeGirado.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoDetalleChequeGirado() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleChequeGirado detallechequegiradoAux:this.detallechequegiradoLogic.getDetalleChequeGirados()) {
				if(detallechequegiradoAux.getId().equals(this.iIdNuevoDetalleChequeGirado)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleChequeGirado detallechequegiradoAux:this.detallechequegirados) {
				if(detallechequegiradoAux.getId().equals(this.iIdNuevoDetalleChequeGirado)) {
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
	
	public int getIndiceActualDetalleChequeGirado(DetalleChequeGirado detallechequegirado,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleChequeGirado detallechequegiradoAux:this.detallechequegiradoLogic.getDetalleChequeGirados()) {
				if(detallechequegiradoAux.getId().equals(detallechequegirado.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleChequeGirado detallechequegiradoAux:this.detallechequegirados) {
				if(detallechequegiradoAux.getId().equals(detallechequegirado.getId())) {
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
	
	public void setCamposBaseDesdeOriginalDetalleChequeGirado(DetalleChequeGirado detallechequegiradoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleChequeGirado detallechequegiradoAux:this.detallechequegiradoLogic.getDetalleChequeGirados()) {
				if(detallechequegiradoAux.getDetalleChequeGiradoOriginal().getId().equals(detallechequegiradoOriginal.getId())) {
					existe=true;
					detallechequegiradoOriginal.setId(detallechequegiradoAux.getId());
					detallechequegiradoOriginal.setVersionRow(detallechequegiradoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleChequeGirado detallechequegiradoAux:this.detallechequegirados) {
				if(detallechequegiradoAux.getDetalleChequeGiradoOriginal().getId().equals(detallechequegiradoOriginal.getId())) {
					existe=true;
					detallechequegiradoOriginal.setId(detallechequegiradoAux.getId());
					detallechequegiradoOriginal.setVersionRow(detallechequegiradoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosDetalleChequeGirado(Boolean esParaCancelar) throws Exception {
		detallechequegiradosAux=new ArrayList<DetalleChequeGirado>();
		detallechequegiradoAux=new DetalleChequeGirado();
		
		if(!this.detallechequegiradoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DetalleChequeGirado detallechequegiradoAux:this.detallechequegiradoLogic.getDetalleChequeGirados()) {
					if(detallechequegiradoAux.getId()<0) {
						detallechequegiradosAux.add(detallechequegiradoAux);
					}		
				}
				this.iIdNuevoDetalleChequeGirado=0L;
				this.detallechequegiradoLogic.getDetalleChequeGirados().removeAll(detallechequegiradosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetalleChequeGirado detallechequegiradoAux:this.detallechequegirados) {
					if(detallechequegiradoAux.getId()<0) {
						detallechequegiradosAux.add(detallechequegiradoAux);
					}		
				}
				this.iIdNuevoDetalleChequeGirado=0L;
				this.detallechequegirados.removeAll(detallechequegiradosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoDetalleChequeGirado 
					&& this.detallechequegiradoLogic.getDetalleChequeGirados().size()>0
					) {
					detallechequegiradoAux=this.detallechequegiradoLogic.getDetalleChequeGirados().get(this.detallechequegiradoLogic.getDetalleChequeGirados().size() - 1);
				
					if(detallechequegiradoAux.getId()<0) {
						this.detallechequegiradoLogic.getDetalleChequeGirados().remove(detallechequegiradoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoDetalleChequeGirado && this.detallechequegirados.size()>0) {
					detallechequegiradoAux=this.detallechequegirados.get(this.detallechequegirados.size() - 1);
				
					if(detallechequegiradoAux.getId()<0) {
						this.detallechequegirados.remove(detallechequegiradoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoDetalleChequeGirado(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(detallechequegirado.getId()<0) {
				this.detallechequegiradoLogic.getDetalleChequeGirados().remove(this.detallechequegirado);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(detallechequegirado.getId()<0) {
				this.detallechequegirados.remove(this.detallechequegirado);
			}
		}			
	}
	
	public void setEstadosInicialesDetalleChequeGirado(List<DetalleChequeGirado> detallechequegiradosAux) throws Exception {
		DetalleChequeGiradoConstantesFunciones.setEstadosInicialesDetalleChequeGirado(detallechequegiradosAux);
	}
	
	public void setEstadosInicialesDetalleChequeGirado(DetalleChequeGirado detallechequegiradoAux) throws Exception {
		DetalleChequeGiradoConstantesFunciones.setEstadosInicialesDetalleChequeGirado(detallechequegiradoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarDetalleChequeGiradoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesDetalleChequeGirado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarDetalleChequeGiradoActual()) {
				if(!this.isEsNuevoDetalleChequeGirado) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesDetalleChequeGirado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoDetalleChequeGirado=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarDetalleChequeGiradoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Detalle Cheque Girado ?", "MANTENIMIENTO DE Detalle Cheque Girado", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesDetalleChequeGirado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(DetalleChequeGirado detallechequegirado) throws Exception {
		DetalleChequeGiradoConstantesFunciones.seleccionarAsignar(this.detallechequegirado,detallechequegirado);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarDetalleChequeGirado=this.isPermisoActualizarOriginalDetalleChequeGirado;
			
			
			this.seleccionarAsignar(detallechequegirado);
			
			

			idAsientoContableActual=detallechequegirado.getid_asiento_contable();
			this.seleccionarAsientoContableActual();

			idEmpleadoActual=detallechequegirado.getid_empleado();
			this.seleccionarEmpleadoActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			DetalleChequeGiradoConstantesFunciones.quitarEspaciosDetalleChequeGirado(this.detallechequegirado,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesDetalleChequeGirado("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.detallechequegiradoSessionBean.setsFuncionBusquedaRapida(this.detallechequegiradoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	//BUSQUEDA INTERNA FK
	public void seleccionarAsientoContableActual() throws Exception {
		try	{
			AsientoContable asientocontableAux=new AsientoContable();

			if(this.idAsientoContableActual != null && this.idAsientoContableActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					asientocontableLogic.getEntityWithConnection(this.idAsientoContableActual);
					asientocontableAux= asientocontableLogic.getAsientoContable();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				asientocontablesForeignKey=new ArrayList<AsientoContable>();
				asientocontablesForeignKey.add(asientocontableAux);
			}

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}
	public void seleccionarEmpleadoActual() throws Exception {
		try	{
			Empleado empleadoAux=new Empleado();

			if(this.idEmpleadoActual != null && this.idEmpleadoActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadoLogic.getEntityWithConnection(this.idEmpleadoActual);
					empleadoAux= empleadoLogic.getEmpleado();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				empleadosForeignKey=new ArrayList<Empleado>();
				empleadosForeignKey.add(empleadoAux);
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
			if(this.isEsNuevoDetalleChequeGirado) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosDetalleChequeGirado(esParaCancelar);				
				this.cancelarNuevoDetalleChequeGirado(esParaCancelar);								
			}
			
			this.detallechequegirado=new DetalleChequeGirado();
			
			this.inicializarDetalleChequeGirado();
			
			this.actualizarEstadoCeldasBotonesDetalleChequeGirado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarDetalleChequeGirado() throws Exception {
		try {
			DetalleChequeGiradoConstantesFunciones.inicializarDetalleChequeGirado(this.detallechequegirado);
			
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
			FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.detallechequegiradoLogic.getDetalleChequeGirados().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteDetalleChequeGirados(String sAccionBusqueda,List<DetalleChequeGirado> detallechequegiradosParaReportes) throws Exception {
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
					sPathReporteFinal="DetalleChequeGirado"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="DetalleChequeGiradoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("DetalleChequeGiradoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="DetalleChequeGirado"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Detalle Cheque Girados");		
		parameters.put("busquedapor", DetalleChequeGiradoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceDetalleChequeGirado=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			DetalleChequeGiradoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			DetalleChequeGiradoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceDetalleChequeGirado=new JRBeanArrayDataSource(DetalleChequeGiradoJInternalFrame.TraerDetalleChequeGiradoBeans(detallechequegiradosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceDetalleChequeGirado);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+DetalleChequeGiradoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+DetalleChequeGiradoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(DetalleChequeGiradoBean.TraerDetalleChequeGiradoBeans(detallechequegiradosParaReportes).toArray()));
							
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
				this.generarExcelReporteDetalleChequeGirados(sAccionBusqueda,sTipoArchivoReporte,detallechequegiradosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalDetalleChequeGirados(sAccionBusqueda,sTipoArchivoReporte,detallechequegiradosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoDetalleChequeGiradoActionPerformed(null);
					//this.generarExcelReporteDetalleChequeGirados(sAccionBusqueda,sTipoArchivoReporte,detallechequegiradosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalDetalleChequeGirados(sAccionBusqueda,sTipoArchivoReporte,detallechequegiradosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesDetalleChequeGirados(sAccionBusqueda,sTipoArchivoReporte,detallechequegiradosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesDetalleChequeGirados(sAccionBusqueda,sTipoArchivoReporte,detallechequegiradosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteDetalleChequeGirados(String sAccionBusqueda,String sTipoArchivoReporte,List<DetalleChequeGirado> detallechequegiradosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallechequegirado";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DetalleChequeGirados");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDetalleChequeGirado("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(DetalleChequeGirado detallechequegirado : detallechequegiradosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			DetalleChequeGiradoConstantesFunciones.generarExcelReporteDataDetalleChequeGirado("NORMAL",row,workbook,detallechequegirado,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallechequegiradoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Cheque Girado",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderDetalleChequeGirado(String sTipo,Row row,Workbook workbook) {
		
		DetalleChequeGiradoConstantesFunciones.generarExcelReporteHeaderDetalleChequeGirado(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalDetalleChequeGirados(String sAccionBusqueda,String sTipoArchivoReporte,List<DetalleChequeGirado> detallechequegiradosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallechequegirado_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DetalleChequeGirados");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(DetalleChequeGirado detallechequegirado : detallechequegiradosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(DetalleChequeGiradoConstantesFunciones.getDetalleChequeGiradoDescripcion(detallechequegirado));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleChequeGiradoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleChequeGiradoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallechequegirado.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleChequeGiradoConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleChequeGiradoConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallechequegirado.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleChequeGiradoConstantesFunciones.LABEL_IDEJERCICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleChequeGiradoConstantesFunciones.LABEL_IDEJERCICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallechequegirado.getejercicio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleChequeGiradoConstantesFunciones.LABEL_IDPERIODO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleChequeGiradoConstantesFunciones.LABEL_IDPERIODO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallechequegirado.getperiodo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleChequeGiradoConstantesFunciones.LABEL_IDASIENTOCONTABLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleChequeGiradoConstantesFunciones.LABEL_IDASIENTOCONTABLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallechequegirado.getasientocontable_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleChequeGiradoConstantesFunciones.LABEL_IDEMPLEADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleChequeGiradoConstantesFunciones.LABEL_IDEMPLEADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallechequegirado.getempleado_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleChequeGiradoConstantesFunciones.LABEL_IDCUENTABANCO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleChequeGiradoConstantesFunciones.LABEL_IDCUENTABANCO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallechequegirado.getcuentabanco_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleChequeGiradoConstantesFunciones.LABEL_NUMEROCHEQUE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleChequeGiradoConstantesFunciones.LABEL_NUMEROCHEQUE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallechequegirado.getnumero_cheque());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleChequeGiradoConstantesFunciones.LABEL_VALOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleChequeGiradoConstantesFunciones.LABEL_VALOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallechequegirado.getvalor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleChequeGiradoConstantesFunciones.LABEL_CUENTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleChequeGiradoConstantesFunciones.LABEL_CUENTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallechequegirado.getcuenta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleChequeGiradoConstantesFunciones.LABEL_FECHA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleChequeGiradoConstantesFunciones.LABEL_FECHA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallechequegirado.getfecha());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleChequeGiradoConstantesFunciones.LABEL_CON))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleChequeGiradoConstantesFunciones.LABEL_CON);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(detallechequegirado.getcon()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleChequeGiradoConstantesFunciones.LABEL_BENEFICIARIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleChequeGiradoConstantesFunciones.LABEL_BENEFICIARIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallechequegirado.getbeneficiario());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleChequeGiradoConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleChequeGiradoConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallechequegirado.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleChequeGiradoConstantesFunciones.LABEL_NOMBREBANCO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleChequeGiradoConstantesFunciones.LABEL_NOMBREBANCO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallechequegirado.getnombre_banco());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleChequeGiradoConstantesFunciones.LABEL_IDANIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleChequeGiradoConstantesFunciones.LABEL_IDANIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallechequegirado.getanio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleChequeGiradoConstantesFunciones.LABEL_IDMES))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleChequeGiradoConstantesFunciones.LABEL_IDMES);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallechequegirado.getmes_descripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallechequegiradoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Cheque Girado",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesDetalleChequeGirados(String sAccionBusqueda,String sTipoArchivoReporte,List<DetalleChequeGirado> detallechequegiradosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<DetalleChequeGirado> detallechequegiradosRespaldo=null;
		
		classes=DetalleChequeGiradoConstantesFunciones.getClassesRelationshipsOfDetalleChequeGirado(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.detallechequegiradoLogic.setDatosCliente(this.datosCliente);
		this.detallechequegiradoLogic.setDatosDeep(this.datosDeep);
		this.detallechequegiradoLogic.setIsConDeep(true);
		
		detallechequegiradosRespaldo=this.detallechequegiradoLogic.getDetalleChequeGirados();
		
		this.detallechequegiradoLogic.setDetalleChequeGirados(detallechequegiradosParaReportes);	
		this.detallechequegiradoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		detallechequegiradosParaReportes=this.detallechequegiradoLogic.getDetalleChequeGirados();
		this.detallechequegiradoLogic.setDetalleChequeGirados(detallechequegiradosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallechequegirado_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DetalleChequeGirados");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDetalleChequeGirado("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(DetalleChequeGirado detallechequegirado : detallechequegiradosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderDetalleChequeGirado("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			DetalleChequeGiradoConstantesFunciones.generarExcelReporteDataDetalleChequeGirado("NORMAL",row,workbook,detallechequegirado,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(DetalleChequeGiradoConstantesFunciones.getDetalleChequeGiradoDescripcion(detallechequegirado));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallechequegiradoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Cheque Girado",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoDetalleChequeGirado.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleChequeGirado.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoDetalleChequeGirado.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleChequeGirado.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessDetalleChequeGirado() throws Exception {		
		this.startProcessDetalleChequeGirado(true);
	}
	
	public void startProcessDetalleChequeGirado(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasDetalleChequeGirado ,this.jPanelParametrosReportesDetalleChequeGirado, this.jScrollPanelDatosDetalleChequeGirado,this.jPanelPaginacionDetalleChequeGirado, this.jScrollPanelDatosEdicionDetalleChequeGirado, this.jPanelAccionesDetalleChequeGirado,this.jPanelAccionesFormularioDetalleChequeGirado,this.jmenuBarDetalleChequeGirado,this.jmenuBarDetalleDetalleChequeGirado,this.jTtoolBarDetalleChequeGirado,this.jTtoolBarDetalleDetalleChequeGirado);		
		
		final JTabbedPane jTabbedPaneBusquedasDetalleChequeGirado=this.jTabbedPaneBusquedasDetalleChequeGirado; 
		
		final JPanel jPanelParametrosReportesDetalleChequeGirado=this.jPanelParametrosReportesDetalleChequeGirado;
		//final JScrollPane jScrollPanelDatosDetalleChequeGirado=this.jScrollPanelDatosDetalleChequeGirado;
		final JTable jTableDatosDetalleChequeGirado=this.jTableDatosDetalleChequeGirado;		
		final JPanel jPanelPaginacionDetalleChequeGirado=this.jPanelPaginacionDetalleChequeGirado;
		//final JScrollPane jScrollPanelDatosEdicionDetalleChequeGirado=this.jScrollPanelDatosEdicionDetalleChequeGirado;
		final JPanel jPanelAccionesDetalleChequeGirado=this.jPanelAccionesDetalleChequeGirado;
		
		JPanel jPanelCamposAuxiliarDetalleChequeGirado=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarDetalleChequeGirado=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) {
			jPanelCamposAuxiliarDetalleChequeGirado=this.jInternalFrameDetalleFormDetalleChequeGirado.jPanelCamposDetalleChequeGirado;
			jPanelAccionesFormularioAuxiliarDetalleChequeGirado=this.jInternalFrameDetalleFormDetalleChequeGirado.jPanelAccionesFormularioDetalleChequeGirado;
		}
		
		final JPanel jPanelCamposDetalleChequeGirado=jPanelCamposAuxiliarDetalleChequeGirado;
		final JPanel jPanelAccionesFormularioDetalleChequeGirado=jPanelAccionesFormularioAuxiliarDetalleChequeGirado;
		
		
		final JMenuBar jmenuBarDetalleChequeGirado=this.jmenuBarDetalleChequeGirado;
		final JToolBar jTtoolBarDetalleChequeGirado=this.jTtoolBarDetalleChequeGirado;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarDetalleChequeGirado=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDetalleChequeGirado=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) {
			jmenuBarDetalleAuxiliarDetalleChequeGirado=this.jInternalFrameDetalleFormDetalleChequeGirado.jmenuBarDetalleDetalleChequeGirado;
			jTtoolBarDetalleAuxiliarDetalleChequeGirado=this.jInternalFrameDetalleFormDetalleChequeGirado.jTtoolBarDetalleDetalleChequeGirado;
		}
		
		final JMenuBar jmenuBarDetalleDetalleChequeGirado=jmenuBarDetalleAuxiliarDetalleChequeGirado;
		final JToolBar jTtoolBarDetalleDetalleChequeGirado=jTtoolBarDetalleAuxiliarDetalleChequeGirado;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDetalleChequeGirado;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDetalleChequeGirado;
			processRunnable.jTableDatos=jTableDatosDetalleChequeGirado;
			processRunnable.jPanelCampos=jPanelCamposDetalleChequeGirado;
			processRunnable.jPanelPaginacion=jPanelPaginacionDetalleChequeGirado;
			processRunnable.jPanelAcciones=jPanelAccionesDetalleChequeGirado;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDetalleChequeGirado;
			
			
			processRunnable.jmenuBar=jmenuBarDetalleChequeGirado;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDetalleChequeGirado;
			processRunnable.jTtoolBar=jTtoolBarDetalleChequeGirado;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDetalleChequeGirado;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDetalleChequeGirado ,jPanelParametrosReportesDetalleChequeGirado,jTableDatosDetalleChequeGirado, /*jScrollPanelDatosDetalleChequeGirado,*/jPanelCamposDetalleChequeGirado,jPanelPaginacionDetalleChequeGirado, /*jScrollPanelDatosEdicionDetalleChequeGirado,*/ jPanelAccionesDetalleChequeGirado,jPanelAccionesFormularioDetalleChequeGirado,jmenuBarDetalleChequeGirado,jmenuBarDetalleDetalleChequeGirado,jTtoolBarDetalleChequeGirado,jTtoolBarDetalleDetalleChequeGirado);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDetalleChequeGirado ,jPanelParametrosReportesDetalleChequeGirado, jScrollPanelDatosDetalleChequeGirado,jPanelPaginacionDetalleChequeGirado, jScrollPanelDatosEdicionDetalleChequeGirado, jPanelAccionesDetalleChequeGirado,jPanelAccionesFormularioDetalleChequeGirado,jmenuBarDetalleChequeGirado,jmenuBarDetalleDetalleChequeGirado,jTtoolBarDetalleChequeGirado,jTtoolBarDetalleDetalleChequeGirado);
						
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
	
	public void finishProcessDetalleChequeGirado() {// throws Exception 
		this.finishProcessDetalleChequeGirado(true);
	}
	
	public void finishProcessDetalleChequeGirado(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasDetalleChequeGirado ,this.jPanelParametrosReportesDetalleChequeGirado, this.jScrollPanelDatosDetalleChequeGirado,this.jPanelPaginacionDetalleChequeGirado, this.jScrollPanelDatosEdicionDetalleChequeGirado, this.jPanelAccionesDetalleChequeGirado,this.jPanelAccionesFormularioDetalleChequeGirado,this.jmenuBarDetalleChequeGirado,this.jmenuBarDetalleDetalleChequeGirado,this.jTtoolBarDetalleChequeGirado,this.jTtoolBarDetalleDetalleChequeGirado);		
		
		final JTabbedPane jTabbedPaneBusquedasDetalleChequeGirado=this.jTabbedPaneBusquedasDetalleChequeGirado; 
		
		final JPanel jPanelParametrosReportesDetalleChequeGirado=this.jPanelParametrosReportesDetalleChequeGirado;
		//final JScrollPane jScrollPanelDatosDetalleChequeGirado=this.jScrollPanelDatosDetalleChequeGirado;
		final JTable jTableDatosDetalleChequeGirado=this.jTableDatosDetalleChequeGirado;		
		final JPanel jPanelPaginacionDetalleChequeGirado=this.jPanelPaginacionDetalleChequeGirado;
		//final JScrollPane jScrollPanelDatosEdicionDetalleChequeGirado=this.jScrollPanelDatosEdicionDetalleChequeGirado;
		final JPanel jPanelAccionesDetalleChequeGirado=this.jPanelAccionesDetalleChequeGirado;
		
		JPanel jPanelCamposAuxiliarDetalleChequeGirado=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarDetalleChequeGirado=new JPanel();
		
		if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) {
			jPanelCamposAuxiliarDetalleChequeGirado=this.jInternalFrameDetalleFormDetalleChequeGirado.jPanelCamposDetalleChequeGirado;
			jPanelAccionesFormularioAuxiliarDetalleChequeGirado=this.jInternalFrameDetalleFormDetalleChequeGirado.jPanelAccionesFormularioDetalleChequeGirado;
		}
		
		final JPanel jPanelCamposDetalleChequeGirado=jPanelCamposAuxiliarDetalleChequeGirado;
		final JPanel jPanelAccionesFormularioDetalleChequeGirado=jPanelAccionesFormularioAuxiliarDetalleChequeGirado;
		
		
		final JMenuBar jmenuBarDetalleChequeGirado=this.jmenuBarDetalleChequeGirado;		
		final JToolBar jTtoolBarDetalleChequeGirado=this.jTtoolBarDetalleChequeGirado;
				
		JMenuBar jmenuBarDetalleAuxiliarDetalleChequeGirado=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDetalleChequeGirado=new JToolBar();
		
		if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) {
			jmenuBarDetalleAuxiliarDetalleChequeGirado=this.jInternalFrameDetalleFormDetalleChequeGirado.jmenuBarDetalleDetalleChequeGirado;
			jTtoolBarDetalleAuxiliarDetalleChequeGirado=this.jInternalFrameDetalleFormDetalleChequeGirado.jTtoolBarDetalleDetalleChequeGirado;		
		}
		
		final JMenuBar jmenuBarDetalleDetalleChequeGirado=jmenuBarDetalleAuxiliarDetalleChequeGirado;
		final JToolBar jTtoolBarDetalleDetalleChequeGirado=jTtoolBarDetalleAuxiliarDetalleChequeGirado;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDetalleChequeGirado;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDetalleChequeGirado;
			processRunnable.jTableDatos=jTableDatosDetalleChequeGirado;
			processRunnable.jPanelCampos=jPanelCamposDetalleChequeGirado;
			processRunnable.jPanelPaginacion=jPanelPaginacionDetalleChequeGirado;
			processRunnable.jPanelAcciones=jPanelAccionesDetalleChequeGirado;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDetalleChequeGirado;
			
			
			processRunnable.jmenuBar=jmenuBarDetalleChequeGirado;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDetalleChequeGirado;
			processRunnable.jTtoolBar=jTtoolBarDetalleChequeGirado;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDetalleChequeGirado;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasDetalleChequeGirado ,jPanelParametrosReportesDetalleChequeGirado, jTableDatosDetalleChequeGirado,/*jScrollPanelDatosDetalleChequeGirado,*/jPanelCamposDetalleChequeGirado,jPanelPaginacionDetalleChequeGirado, /*jScrollPanelDatosEdicionDetalleChequeGirado,*/ jPanelAccionesDetalleChequeGirado,jPanelAccionesFormularioDetalleChequeGirado,jmenuBarDetalleChequeGirado,jmenuBarDetalleDetalleChequeGirado,jTtoolBarDetalleChequeGirado,jTtoolBarDetalleDetalleChequeGirado));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesDetalleChequeGirado(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarDetalleChequeGirado(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuDetalleChequeGirado(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarDetalleChequeGirado(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleChequeGirado,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleDetalleChequeGirado,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuDetalleChequeGirado(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleChequeGirado,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleDetalleChequeGirado,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.detallechequegiradoConstantesFunciones.getsFinalQueryDetalleChequeGirado();
		String  finalQueryPaginacionTodos=this.detallechequegiradoConstantesFunciones.getsFinalQueryDetalleChequeGirado();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=DetalleChequeGiradoConstantesFunciones.getArrayColumnasGlobalesNoDetalleChequeGirado(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=DetalleChequeGiradoConstantesFunciones.getArrayColumnasGlobalesDetalleChequeGirado(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,DetalleChequeGiradoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.detallechequegiradosEliminados= new ArrayList<DetalleChequeGirado>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessDetalleChequeGirado();
		
				///*DetalleChequeGiradoSessionBean*/this.detallechequegiradoSessionBean=new DetalleChequeGiradoSessionBean();
			
			if(this.detallechequegiradoSessionBean==null) {
				this.detallechequegiradoSessionBean=new DetalleChequeGiradoSessionBean();
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
					this.iNumeroPaginacion=DetalleChequeGiradoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=DetalleChequeGiradoConstantesFunciones.getClassesForeignKeysOfDetalleChequeGirado(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/detallechequegirado."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			detallechequegiradosAux= new ArrayList<DetalleChequeGirado>();
			
				
			detallechequegiradoLogic.setDatosCliente(this.datosCliente);
			detallechequegiradoLogic.setDatosDeep(this.datosDeep);
			detallechequegiradoLogic.setIsConDeep(true);
			
			
			detallechequegiradoLogic.getDetalleChequeGiradoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					detallechequegiradoLogic.getTodosDetalleChequeGirados(finalQueryGlobal,pagination);
					
					//detallechequegiradoLogic.getTodosDetalleChequeGiradosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(detallechequegiradoLogic.getDetalleChequeGirados()==null|| detallechequegiradoLogic.getDetalleChequeGirados().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							detallechequegiradosAux= new ArrayList<DetalleChequeGirado>();
							detallechequegiradosAux.addAll(detallechequegiradoLogic.getDetalleChequeGirados());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallechequegiradosAux= new ArrayList<DetalleChequeGirado>();
							detallechequegiradosAux.addAll(detallechequegirados);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							detallechequegiradoLogic.getTodosDetalleChequeGirados(finalQueryGlobal+"",this.pagination);												
							
							//detallechequegiradoLogic.getTodosDetalleChequeGiradosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteDetalleChequeGirados("Todos",detallechequegiradoLogic.getDetalleChequeGirados() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							detallechequegiradoLogic.setDetalleChequeGirados(new ArrayList<DetalleChequeGirado>());					
							detallechequegiradoLogic.getDetalleChequeGirados().addAll(detallechequegiradosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallechequegirados=new ArrayList<DetalleChequeGirado>();
							detallechequegirados.addAll(detallechequegiradosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idDetalleChequeGirado=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idDetalleChequeGirado=this.idActual;
				
				} else if(this.idDetalleChequeGiradoActual!=null && this.idDetalleChequeGiradoActual!=0L) {
					idDetalleChequeGirado=idDetalleChequeGiradoActual;
				}
				
					
				this.sDetalleReporte=DetalleChequeGiradoConstantesFunciones.getDetalleIndicePorId(idDetalleChequeGirado);
				
				this.detallechequegirados=new ArrayList<DetalleChequeGirado>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					detallechequegiradoLogic.getEntity(idDetalleChequeGirado);
					
					//detallechequegiradoLogic.getEntityWithConnection(idDetalleChequeGirado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallechequegiradoLogic.setDetalleChequeGirados(new ArrayList<DetalleChequeGirado>());
					detallechequegiradoLogic.getDetalleChequeGirados().add(detallechequegiradoLogic.getDetalleChequeGirado());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallechequegirados=new ArrayList<DetalleChequeGirado>();
					this.detallechequegirados.add(detallechequegirado);
				}
				
				if(detallechequegiradoLogic.getDetalleChequeGirado()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdAsientoContable")) {
				this.sDetalleReporte=DetalleChequeGiradoConstantesFunciones.getDetalleIndiceFK_IdAsientoContable(id_asiento_contableFK_IdAsientoContable);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detallechequegiradoLogic.getDetalleChequeGiradosFK_IdAsientoContable(finalQueryGlobal,pagination,id_asiento_contableFK_IdAsientoContable);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleChequeGiradoConstantesFunciones.getDetalleIndiceFK_IdAsientoContable(id_asiento_contableFK_IdAsientoContable);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleChequeGiradoConstantesFunciones.getDetalleIndiceFK_IdAsientoContable(id_asiento_contableFK_IdAsientoContable);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detallechequegiradoLogic.getDetalleChequeGirados()==null||detallechequegiradoLogic.getDetalleChequeGirados().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detallechequegirados==null|| detallechequegirados.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detallechequegiradosAux=new ArrayList<DetalleChequeGirado>();
						detallechequegiradosAux.addAll(detallechequegiradoLogic.getDetalleChequeGirados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallechequegiradosAux=new ArrayList<DetalleChequeGirado>();
							detallechequegiradosAux.addAll(detallechequegirados);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detallechequegiradoLogic.getDetalleChequeGiradosFK_IdAsientoContable(finalQueryGlobal,pagination,id_asiento_contableFK_IdAsientoContable);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleChequeGiradoConstantesFunciones.getDetalleIndiceFK_IdAsientoContable(id_asiento_contableFK_IdAsientoContable);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleChequeGiradoConstantesFunciones.getDetalleIndiceFK_IdAsientoContable(id_asiento_contableFK_IdAsientoContable);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleChequeGirados("FK_IdAsientoContable",detallechequegiradoLogic.getDetalleChequeGirados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleChequeGirados("FK_IdAsientoContable",detallechequegirados);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detallechequegiradoLogic.setDetalleChequeGirados(new ArrayList<DetalleChequeGirado>());
						detallechequegiradoLogic.getDetalleChequeGirados().addAll(detallechequegiradosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallechequegirados=new ArrayList<DetalleChequeGirado>();
							detallechequegirados.addAll(detallechequegiradosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdCuentaBanco")) {
				this.sDetalleReporte=DetalleChequeGiradoConstantesFunciones.getDetalleIndiceFK_IdCuentaBanco(id_cuenta_bancoFK_IdCuentaBanco);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detallechequegiradoLogic.getDetalleChequeGiradosFK_IdCuentaBanco(finalQueryGlobal,pagination,id_cuenta_bancoFK_IdCuentaBanco);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleChequeGiradoConstantesFunciones.getDetalleIndiceFK_IdCuentaBanco(id_cuenta_bancoFK_IdCuentaBanco);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleChequeGiradoConstantesFunciones.getDetalleIndiceFK_IdCuentaBanco(id_cuenta_bancoFK_IdCuentaBanco);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detallechequegiradoLogic.getDetalleChequeGirados()==null||detallechequegiradoLogic.getDetalleChequeGirados().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detallechequegirados==null|| detallechequegirados.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detallechequegiradosAux=new ArrayList<DetalleChequeGirado>();
						detallechequegiradosAux.addAll(detallechequegiradoLogic.getDetalleChequeGirados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallechequegiradosAux=new ArrayList<DetalleChequeGirado>();
							detallechequegiradosAux.addAll(detallechequegirados);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detallechequegiradoLogic.getDetalleChequeGiradosFK_IdCuentaBanco(finalQueryGlobal,pagination,id_cuenta_bancoFK_IdCuentaBanco);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleChequeGiradoConstantesFunciones.getDetalleIndiceFK_IdCuentaBanco(id_cuenta_bancoFK_IdCuentaBanco);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleChequeGiradoConstantesFunciones.getDetalleIndiceFK_IdCuentaBanco(id_cuenta_bancoFK_IdCuentaBanco);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleChequeGirados("FK_IdCuentaBanco",detallechequegiradoLogic.getDetalleChequeGirados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleChequeGirados("FK_IdCuentaBanco",detallechequegirados);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detallechequegiradoLogic.setDetalleChequeGirados(new ArrayList<DetalleChequeGirado>());
						detallechequegiradoLogic.getDetalleChequeGirados().addAll(detallechequegiradosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallechequegirados=new ArrayList<DetalleChequeGirado>();
							detallechequegirados.addAll(detallechequegiradosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEjercicio")) {
				this.sDetalleReporte=DetalleChequeGiradoConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detallechequegiradoLogic.getDetalleChequeGiradosFK_IdEjercicio(finalQueryGlobal,pagination,id_ejercicioFK_IdEjercicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleChequeGiradoConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleChequeGiradoConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detallechequegiradoLogic.getDetalleChequeGirados()==null||detallechequegiradoLogic.getDetalleChequeGirados().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detallechequegirados==null|| detallechequegirados.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detallechequegiradosAux=new ArrayList<DetalleChequeGirado>();
						detallechequegiradosAux.addAll(detallechequegiradoLogic.getDetalleChequeGirados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallechequegiradosAux=new ArrayList<DetalleChequeGirado>();
							detallechequegiradosAux.addAll(detallechequegirados);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detallechequegiradoLogic.getDetalleChequeGiradosFK_IdEjercicio(finalQueryGlobal,pagination,id_ejercicioFK_IdEjercicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleChequeGiradoConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleChequeGiradoConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleChequeGirados("FK_IdEjercicio",detallechequegiradoLogic.getDetalleChequeGirados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleChequeGirados("FK_IdEjercicio",detallechequegirados);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detallechequegiradoLogic.setDetalleChequeGirados(new ArrayList<DetalleChequeGirado>());
						detallechequegiradoLogic.getDetalleChequeGirados().addAll(detallechequegiradosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallechequegirados=new ArrayList<DetalleChequeGirado>();
							detallechequegirados.addAll(detallechequegiradosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpleado")) {
				this.sDetalleReporte=DetalleChequeGiradoConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detallechequegiradoLogic.getDetalleChequeGiradosFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleChequeGiradoConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleChequeGiradoConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detallechequegiradoLogic.getDetalleChequeGirados()==null||detallechequegiradoLogic.getDetalleChequeGirados().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detallechequegirados==null|| detallechequegirados.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detallechequegiradosAux=new ArrayList<DetalleChequeGirado>();
						detallechequegiradosAux.addAll(detallechequegiradoLogic.getDetalleChequeGirados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallechequegiradosAux=new ArrayList<DetalleChequeGirado>();
							detallechequegiradosAux.addAll(detallechequegirados);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detallechequegiradoLogic.getDetalleChequeGiradosFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleChequeGiradoConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleChequeGiradoConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleChequeGirados("FK_IdEmpleado",detallechequegiradoLogic.getDetalleChequeGirados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleChequeGirados("FK_IdEmpleado",detallechequegirados);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detallechequegiradoLogic.setDetalleChequeGirados(new ArrayList<DetalleChequeGirado>());
						detallechequegiradoLogic.getDetalleChequeGirados().addAll(detallechequegiradosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallechequegirados=new ArrayList<DetalleChequeGirado>();
							detallechequegirados.addAll(detallechequegiradosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=DetalleChequeGiradoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detallechequegiradoLogic.getDetalleChequeGiradosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleChequeGiradoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleChequeGiradoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detallechequegiradoLogic.getDetalleChequeGirados()==null||detallechequegiradoLogic.getDetalleChequeGirados().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detallechequegirados==null|| detallechequegirados.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detallechequegiradosAux=new ArrayList<DetalleChequeGirado>();
						detallechequegiradosAux.addAll(detallechequegiradoLogic.getDetalleChequeGirados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallechequegiradosAux=new ArrayList<DetalleChequeGirado>();
							detallechequegiradosAux.addAll(detallechequegirados);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detallechequegiradoLogic.getDetalleChequeGiradosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleChequeGiradoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleChequeGiradoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleChequeGirados("FK_IdEmpresa",detallechequegiradoLogic.getDetalleChequeGirados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleChequeGirados("FK_IdEmpresa",detallechequegirados);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detallechequegiradoLogic.setDetalleChequeGirados(new ArrayList<DetalleChequeGirado>());
						detallechequegiradoLogic.getDetalleChequeGirados().addAll(detallechequegiradosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallechequegirados=new ArrayList<DetalleChequeGirado>();
							detallechequegirados.addAll(detallechequegiradosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdPeriodo")) {
				this.sDetalleReporte=DetalleChequeGiradoConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detallechequegiradoLogic.getDetalleChequeGiradosFK_IdPeriodo(finalQueryGlobal,pagination,id_periodoFK_IdPeriodo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleChequeGiradoConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleChequeGiradoConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detallechequegiradoLogic.getDetalleChequeGirados()==null||detallechequegiradoLogic.getDetalleChequeGirados().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detallechequegirados==null|| detallechequegirados.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detallechequegiradosAux=new ArrayList<DetalleChequeGirado>();
						detallechequegiradosAux.addAll(detallechequegiradoLogic.getDetalleChequeGirados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallechequegiradosAux=new ArrayList<DetalleChequeGirado>();
							detallechequegiradosAux.addAll(detallechequegirados);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detallechequegiradoLogic.getDetalleChequeGiradosFK_IdPeriodo(finalQueryGlobal,pagination,id_periodoFK_IdPeriodo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleChequeGiradoConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleChequeGiradoConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleChequeGirados("FK_IdPeriodo",detallechequegiradoLogic.getDetalleChequeGirados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleChequeGirados("FK_IdPeriodo",detallechequegirados);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detallechequegiradoLogic.setDetalleChequeGirados(new ArrayList<DetalleChequeGirado>());
						detallechequegiradoLogic.getDetalleChequeGirados().addAll(detallechequegiradosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallechequegirados=new ArrayList<DetalleChequeGirado>();
							detallechequegirados.addAll(detallechequegiradosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=DetalleChequeGiradoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detallechequegiradoLogic.getDetalleChequeGiradosFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleChequeGiradoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleChequeGiradoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detallechequegiradoLogic.getDetalleChequeGirados()==null||detallechequegiradoLogic.getDetalleChequeGirados().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detallechequegirados==null|| detallechequegirados.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detallechequegiradosAux=new ArrayList<DetalleChequeGirado>();
						detallechequegiradosAux.addAll(detallechequegiradoLogic.getDetalleChequeGirados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallechequegiradosAux=new ArrayList<DetalleChequeGirado>();
							detallechequegiradosAux.addAll(detallechequegirados);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detallechequegiradoLogic.getDetalleChequeGiradosFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleChequeGiradoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleChequeGiradoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleChequeGirados("FK_IdSucursal",detallechequegiradoLogic.getDetalleChequeGirados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleChequeGirados("FK_IdSucursal",detallechequegirados);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detallechequegiradoLogic.setDetalleChequeGirados(new ArrayList<DetalleChequeGirado>());
						detallechequegiradoLogic.getDetalleChequeGirados().addAll(detallechequegiradosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallechequegirados=new ArrayList<DetalleChequeGirado>();
							detallechequegirados.addAll(detallechequegiradosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesDetalleChequeGirado();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessDetalleChequeGirado();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=detallechequegiradoLogic.getDetalleChequeGirados().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detallechequegirados.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=detallechequegiradoLogic.getDetalleChequeGirados().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detallechequegirados.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(DetalleChequeGirado detallechequegirado) {
		Boolean permite=true;
		
		if(this.detallechequegirado.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=DetalleChequeGiradoConstantesFunciones.getOrderByListaDetalleChequeGirado();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=DetalleChequeGiradoConstantesFunciones.getOrderByListaDetalleChequeGirado();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleChequeGirado detallechequegirado:detallechequegiradoLogic.getDetalleChequeGirados()) {
				if(detallechequegirado.getsType().equals(Constantes2.S_TOTALES)) {
					detallechequegiradoTotales=detallechequegirado;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleChequeGirado detallechequegirado:this.detallechequegirados) {
				if(detallechequegirado.getsType().equals(Constantes2.S_TOTALES)) {
					detallechequegiradoTotales=detallechequegirado;
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
			this.detallechequegiradoAux=new DetalleChequeGirado();
			this.detallechequegiradoAux.setsType(Constantes2.S_TOTALES);
			this.detallechequegiradoAux.setIsNew(false);
			this.detallechequegiradoAux.setIsChanged(false);
			this.detallechequegiradoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				DetalleChequeGiradoConstantesFunciones.TotalizarValoresFilaDetalleChequeGirado(this.detallechequegiradoLogic.getDetalleChequeGirados(),this.detallechequegiradoAux);
				
				this.detallechequegiradoLogic.getDetalleChequeGirados().add(this.detallechequegiradoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				DetalleChequeGiradoConstantesFunciones.TotalizarValoresFilaDetalleChequeGirado(this.detallechequegirados,this.detallechequegiradoAux);
				
				this.detallechequegirados.add(this.detallechequegiradoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		detallechequegiradoTotales=new DetalleChequeGirado();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.detallechequegiradoLogic.getDetalleChequeGirados().remove(detallechequegiradoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.detallechequegirados.remove(detallechequegiradoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		detallechequegiradoTotales=new DetalleChequeGirado();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleChequeGirado detallechequegirado:detallechequegiradoLogic.getDetalleChequeGirados()) {
				if(detallechequegirado.getsType().equals(Constantes2.S_TOTALES)) {
					detallechequegiradoTotales=detallechequegirado;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DetalleChequeGiradoConstantesFunciones.TotalizarValoresFilaDetalleChequeGirado(this.detallechequegiradoLogic.getDetalleChequeGirados(),detallechequegiradoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleChequeGirado detallechequegirado:this.detallechequegirados) {
				if(detallechequegirado.getsType().equals(Constantes2.S_TOTALES)) {
					detallechequegiradoTotales=detallechequegirado;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DetalleChequeGiradoConstantesFunciones.TotalizarValoresFilaDetalleChequeGirado(this.detallechequegirados,detallechequegiradoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getDetalleChequeGiradosFK_IdAnio()throws Exception {
		try {
			sAccionBusqueda="FK_IdAnio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetalleChequeGiradosFK_IdAsientoContable()throws Exception {
		try {
			sAccionBusqueda="FK_IdAsientoContable";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetalleChequeGiradosFK_IdCuentaBanco()throws Exception {
		try {
			sAccionBusqueda="FK_IdCuentaBanco";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetalleChequeGiradosFK_IdEjercicio()throws Exception {
		try {
			sAccionBusqueda="FK_IdEjercicio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetalleChequeGiradosFK_IdEmpleado()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpleado";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetalleChequeGiradosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetalleChequeGiradosFK_IdMes()throws Exception {
		try {
			sAccionBusqueda="FK_IdMes";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetalleChequeGiradosFK_IdPeriodo()throws Exception {
		try {
			sAccionBusqueda="FK_IdPeriodo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetalleChequeGiradosFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getDetalleChequeGiradosFK_IdAnio(String sFinalQuery,Long id_anio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallechequegiradoLogic.getDetalleChequeGiradosFK_IdAnio(sFinalQuery,this.pagination,id_anio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetalleChequeGiradosFK_IdAsientoContable(String sFinalQuery,Long id_asiento_contable)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallechequegiradoLogic.getDetalleChequeGiradosFK_IdAsientoContable(sFinalQuery,this.pagination,id_asiento_contable);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetalleChequeGiradosFK_IdCuentaBanco(String sFinalQuery,Long id_cuenta_banco)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallechequegiradoLogic.getDetalleChequeGiradosFK_IdCuentaBanco(sFinalQuery,this.pagination,id_cuenta_banco);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetalleChequeGiradosFK_IdEjercicio(String sFinalQuery,Long id_ejercicio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallechequegiradoLogic.getDetalleChequeGiradosFK_IdEjercicio(sFinalQuery,this.pagination,id_ejercicio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetalleChequeGiradosFK_IdEmpleado(String sFinalQuery,Long id_empleado)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallechequegiradoLogic.getDetalleChequeGiradosFK_IdEmpleado(sFinalQuery,this.pagination,id_empleado);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetalleChequeGiradosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallechequegiradoLogic.getDetalleChequeGiradosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetalleChequeGiradosFK_IdMes(String sFinalQuery,Long id_mes)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallechequegiradoLogic.getDetalleChequeGiradosFK_IdMes(sFinalQuery,this.pagination,id_mes);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetalleChequeGiradosFK_IdPeriodo(String sFinalQuery,Long id_periodo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallechequegiradoLogic.getDetalleChequeGiradosFK_IdPeriodo(sFinalQuery,this.pagination,id_periodo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetalleChequeGiradosFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallechequegiradoLogic.getDetalleChequeGiradosFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosDetalleChequeGirado() {
		this.isPermisoTodoDetalleChequeGirado=false;
		this.isPermisoNuevoDetalleChequeGirado=false;
		this.isPermisoActualizarDetalleChequeGirado=false;
		this.isPermisoActualizarOriginalDetalleChequeGirado=false;
		this.isPermisoEliminarDetalleChequeGirado=false;
		this.isPermisoGuardarCambiosDetalleChequeGirado=false;
		this.isPermisoConsultaDetalleChequeGirado=false;
		this.isPermisoBusquedaDetalleChequeGirado=false;
		this.isPermisoReporteDetalleChequeGirado=false;		
		this.isPermisoOrdenDetalleChequeGirado=false;		
		this.isPermisoPaginacionMedioDetalleChequeGirado=false;		
		this.isPermisoPaginacionAltoDetalleChequeGirado=false;
		this.isPermisoPaginacionTodoDetalleChequeGirado=false;
		this.isPermisoCopiarDetalleChequeGirado=false;		
		this.isPermisoVerFormDetalleChequeGirado=false;		
		this.isPermisoDuplicarDetalleChequeGirado=false;		
		this.isPermisoOrdenDetalleChequeGirado=false;		
	}
	
	public void setPermisosUsuarioDetalleChequeGirado(Boolean isPermiso) {
		this.isPermisoTodoDetalleChequeGirado=isPermiso;
		this.isPermisoNuevoDetalleChequeGirado=isPermiso;
		this.isPermisoActualizarDetalleChequeGirado=isPermiso;
		this.isPermisoActualizarOriginalDetalleChequeGirado=isPermiso;
		this.isPermisoEliminarDetalleChequeGirado=isPermiso;
		this.isPermisoGuardarCambiosDetalleChequeGirado=isPermiso;
		this.isPermisoConsultaDetalleChequeGirado=isPermiso;
		this.isPermisoBusquedaDetalleChequeGirado=isPermiso;
		this.isPermisoReporteDetalleChequeGirado=isPermiso;
		this.isPermisoOrdenDetalleChequeGirado=isPermiso;		
		this.isPermisoPaginacionMedioDetalleChequeGirado=isPermiso;		
		this.isPermisoPaginacionAltoDetalleChequeGirado=isPermiso;		
		this.isPermisoPaginacionTodoDetalleChequeGirado=isPermiso;		
		this.isPermisoCopiarDetalleChequeGirado=isPermiso;		
		this.isPermisoVerFormDetalleChequeGirado=isPermiso;		
		this.isPermisoDuplicarDetalleChequeGirado=isPermiso;
		this.isPermisoOrdenDetalleChequeGirado=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioDetalleChequeGirado(Boolean isPermiso) {
		//this.isPermisoTodoDetalleChequeGirado=isPermiso;
		this.isPermisoNuevoDetalleChequeGirado=isPermiso;
		this.isPermisoActualizarDetalleChequeGirado=isPermiso;
		this.isPermisoActualizarOriginalDetalleChequeGirado=isPermiso;
		this.isPermisoEliminarDetalleChequeGirado=isPermiso;
		this.isPermisoGuardarCambiosDetalleChequeGirado=isPermiso;
		//this.isPermisoConsultaDetalleChequeGirado=isPermiso;
		//this.isPermisoBusquedaDetalleChequeGirado=isPermiso;
		//this.isPermisoReporteDetalleChequeGirado=isPermiso;
		//this.isPermisoOrdenDetalleChequeGirado=isPermiso;		
		//this.isPermisoPaginacionMedioDetalleChequeGirado=isPermiso;		
		//this.isPermisoPaginacionAltoDetalleChequeGirado=isPermiso;		
		//this.isPermisoPaginacionTodoDetalleChequeGirado=isPermiso;		
		//this.isPermisoCopiarDetalleChequeGirado=isPermiso;		
		//this.isPermisoDuplicarDetalleChequeGirado=isPermiso;
		//this.isPermisoOrdenDetalleChequeGirado=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioDetalleChequeGiradoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(DetalleChequeGiradoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebDetalleChequeGirado(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioDetalleChequeGiradoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioDetalleChequeGiradoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionDetalleChequeGiradoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioDetalleChequeGiradoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioDetalleChequeGirado() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(DetalleChequeGiradoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.detallechequegiradoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, DetalleChequeGiradoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoDetalleChequeGirado=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarDetalleChequeGirado=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalDetalleChequeGirado=this.isPermisoActualizarDetalleChequeGirado;
			this.isPermisoEliminarDetalleChequeGirado=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosDetalleChequeGirado=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaDetalleChequeGirado=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaDetalleChequeGirado=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoDetalleChequeGirado=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteDetalleChequeGirado=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDetalleChequeGirado=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioDetalleChequeGirado=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoDetalleChequeGirado=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoDetalleChequeGirado=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarDetalleChequeGirado=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormDetalleChequeGirado=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarDetalleChequeGirado=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDetalleChequeGirado=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.detallechequegiradoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosDetalleChequeGirado.setToolTipText(this.jTableDatosDetalleChequeGirado.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioDetalleChequeGirado(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioDetalleChequeGirado(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(DetalleChequeGiradoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(DetalleChequeGiradoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioDetalleChequeGirado() throws Exception {
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
	public void inicializarCombosForeignKeyDetalleChequeGiradoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.ejerciciosForeignKey=new ArrayList();
				this.periodosForeignKey=new ArrayList();
				this.asientocontablesForeignKey=new ArrayList();
				this.empleadosForeignKey=new ArrayList();
				this.cuentabancosForeignKey=new ArrayList();
				this.aniosForeignKey=new ArrayList();
				this.messForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyDetalleChequeGiradoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(DetalleChequeGiradoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyDetalleChequeGiradoListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEjercicioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyPeriodoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyAsientoContableListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpleadoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCuentaBancoListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyAsientoContableListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.asientocontablesForeignKey==null||this.asientocontablesForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=AsientoContableConstantesFunciones.getArrayColumnasGlobalesAsientoContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,AsientoContableConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=AsientoContableConstantesFunciones.SFINALQUERY;

				this.cargarCombosAsientoContablesForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyEmpleadoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.empleadosForeignKey==null||this.empleadosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EmpleadoConstantesFunciones.getArrayColumnasGlobalesEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpleadoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EmpleadoConstantesFunciones.SFINALQUERY;

				this.cargarCombosEmpleadosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCuentaBancoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.cuentabancosForeignKey==null||this.cuentabancosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=CuentaBancoConstantesFunciones.getArrayColumnasGlobalesCuentaBanco(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaBancoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=CuentaBancoConstantesFunciones.SFINALQUERY;

				this.cargarCombosCuentaBancosForeignKeyLista(finalQueryGlobal);
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
	
	public void cargarCombosLoteForeignKeyDetalleChequeGiradoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			DetalleChequeGiradoParameterReturnGeneral detallechequegiradoReturnGeneral=new DetalleChequeGiradoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.detallechequegiradoConstantesFunciones.cargarid_empresaDetalleChequeGirado)
					 || (this.esRecargarFks && this.detallechequegiradoConstantesFunciones.cargarid_empresaDetalleChequeGirado)) {

					if(!this.detallechequegiradoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+detallechequegiradoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.detallechequegiradoConstantesFunciones.cargarid_sucursalDetalleChequeGirado)
					 || (this.esRecargarFks && this.detallechequegiradoConstantesFunciones.cargarid_sucursalDetalleChequeGirado)) {

					if(!this.detallechequegiradoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+detallechequegiradoSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalEjercicio="";

				if(((this.ejerciciosForeignKey==null||this.ejerciciosForeignKey.size()<=0) && this.detallechequegiradoConstantesFunciones.cargarid_ejercicioDetalleChequeGirado)
					 || (this.esRecargarFks && this.detallechequegiradoConstantesFunciones.cargarid_ejercicioDetalleChequeGirado)) {

					if(!this.detallechequegiradoSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EjercicioConstantesFunciones.getArrayColumnasGlobalesEjercicio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEjercicio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EjercicioConstantesFunciones.TABLENAME);

						finalQueryGlobalEjercicio=Funciones.GetFinalQueryAppend(finalQueryGlobalEjercicio, "");
						finalQueryGlobalEjercicio+=EjercicioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEjerciciosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEjercicio=" WHERE " + ConstantesSql.ID + "="+detallechequegiradoSessionBean.getlidEjercicioActual();
					}
				} else {
					finalQueryGlobalEjercicio="NONE";
				}


				String finalQueryGlobalPeriodo="";

				if(((this.periodosForeignKey==null||this.periodosForeignKey.size()<=0) && this.detallechequegiradoConstantesFunciones.cargarid_periodoDetalleChequeGirado)
					 || (this.esRecargarFks && this.detallechequegiradoConstantesFunciones.cargarid_periodoDetalleChequeGirado)) {

					if(!this.detallechequegiradoSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PeriodoConstantesFunciones.getArrayColumnasGlobalesPeriodo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPeriodo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PeriodoConstantesFunciones.TABLENAME);

						finalQueryGlobalPeriodo=Funciones.GetFinalQueryAppend(finalQueryGlobalPeriodo, "");
						finalQueryGlobalPeriodo+=PeriodoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPeriodosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPeriodo=" WHERE " + ConstantesSql.ID + "="+detallechequegiradoSessionBean.getlidPeriodoActual();
					}
				} else {
					finalQueryGlobalPeriodo="NONE";
				}


				String finalQueryGlobalAsientoContable="";

				if(((this.asientocontablesForeignKey==null||this.asientocontablesForeignKey.size()<=0) && this.detallechequegiradoConstantesFunciones.cargarid_asiento_contableDetalleChequeGirado)
					 || (this.esRecargarFks && this.detallechequegiradoConstantesFunciones.cargarid_asiento_contableDetalleChequeGirado)) {

					if(!this.detallechequegiradoSessionBean.getisBusquedaDesdeForeignKeySesionAsientoContable()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=AsientoContableConstantesFunciones.getArrayColumnasGlobalesAsientoContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalAsientoContable=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,AsientoContableConstantesFunciones.TABLENAME);

						finalQueryGlobalAsientoContable=Funciones.GetFinalQueryAppend(finalQueryGlobalAsientoContable, "");
						finalQueryGlobalAsientoContable+=AsientoContableConstantesFunciones.SFINALQUERY;

						//this.cargarCombosAsientoContablesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalAsientoContable=" WHERE " + ConstantesSql.ID + "="+detallechequegiradoSessionBean.getlidAsientoContableActual();
					}
				} else {
					finalQueryGlobalAsientoContable="NONE";
				}


				String finalQueryGlobalEmpleado="";

				if(((this.empleadosForeignKey==null||this.empleadosForeignKey.size()<=0) && this.detallechequegiradoConstantesFunciones.cargarid_empleadoDetalleChequeGirado)
					 || (this.esRecargarFks && this.detallechequegiradoConstantesFunciones.cargarid_empleadoDetalleChequeGirado)) {

					if(!this.detallechequegiradoSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpleadoConstantesFunciones.getArrayColumnasGlobalesEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpleado=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpleadoConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpleado=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpleado, "");
						finalQueryGlobalEmpleado+=EmpleadoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpleadosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpleado=" WHERE " + ConstantesSql.ID + "="+detallechequegiradoSessionBean.getlidEmpleadoActual();
					}
				} else {
					finalQueryGlobalEmpleado="NONE";
				}


				String finalQueryGlobalCuentaBanco="";

				if(((this.cuentabancosForeignKey==null||this.cuentabancosForeignKey.size()<=0) && this.detallechequegiradoConstantesFunciones.cargarid_cuenta_bancoDetalleChequeGirado)
					 || (this.esRecargarFks && this.detallechequegiradoConstantesFunciones.cargarid_cuenta_bancoDetalleChequeGirado)) {

					if(!this.detallechequegiradoSessionBean.getisBusquedaDesdeForeignKeySesionCuentaBanco()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=CuentaBancoConstantesFunciones.getArrayColumnasGlobalesCuentaBanco(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCuentaBanco=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaBancoConstantesFunciones.TABLENAME);

						finalQueryGlobalCuentaBanco=Funciones.GetFinalQueryAppend(finalQueryGlobalCuentaBanco, "");
						finalQueryGlobalCuentaBanco+=CuentaBancoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCuentaBancosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCuentaBanco=" WHERE " + ConstantesSql.ID + "="+detallechequegiradoSessionBean.getlidCuentaBancoActual();
					}
				} else {
					finalQueryGlobalCuentaBanco="NONE";
				}


				String finalQueryGlobalAnio="";

				if(((this.aniosForeignKey==null||this.aniosForeignKey.size()<=0) && this.detallechequegiradoConstantesFunciones.cargarid_anioDetalleChequeGirado)
					 || (this.esRecargarFks && this.detallechequegiradoConstantesFunciones.cargarid_anioDetalleChequeGirado)) {

					if(!this.detallechequegiradoSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=AnioConstantesFunciones.getArrayColumnasGlobalesAnio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalAnio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,AnioConstantesFunciones.TABLENAME);

						finalQueryGlobalAnio=Funciones.GetFinalQueryAppend(finalQueryGlobalAnio, "");
						finalQueryGlobalAnio+=AnioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosAniosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalAnio=" WHERE " + ConstantesSql.ID + "="+detallechequegiradoSessionBean.getlidAnioActual();
					}
				} else {
					finalQueryGlobalAnio="NONE";
				}


				String finalQueryGlobalMes="";

				if(((this.messForeignKey==null||this.messForeignKey.size()<=0) && this.detallechequegiradoConstantesFunciones.cargarid_mesDetalleChequeGirado)
					 || (this.esRecargarFks && this.detallechequegiradoConstantesFunciones.cargarid_mesDetalleChequeGirado)) {

					if(!this.detallechequegiradoSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=MesConstantesFunciones.getArrayColumnasGlobalesMes(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalMes=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,MesConstantesFunciones.TABLENAME);

						finalQueryGlobalMes=Funciones.GetFinalQueryAppend(finalQueryGlobalMes, "");
						finalQueryGlobalMes+=MesConstantesFunciones.SFINALQUERY;

						//this.cargarCombosMessForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalMes=" WHERE " + ConstantesSql.ID + "="+detallechequegiradoSessionBean.getlidMesActual();
					}
				} else {
					finalQueryGlobalMes="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				detallechequegiradoReturnGeneral=detallechequegiradoLogic.cargarCombosLoteForeignKeyDetalleChequeGirado(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalEjercicio,finalQueryGlobalPeriodo,finalQueryGlobalAsientoContable,finalQueryGlobalEmpleado,finalQueryGlobalCuentaBanco,finalQueryGlobalAnio,finalQueryGlobalMes);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=detallechequegiradoReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=detallechequegiradoReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalEjercicio.equals("NONE")) {
				this.ejerciciosForeignKey=detallechequegiradoReturnGeneral.getejerciciosForeignKey();
			}

			if(!finalQueryGlobalPeriodo.equals("NONE")) {
				this.periodosForeignKey=detallechequegiradoReturnGeneral.getperiodosForeignKey();
			}

			if(!finalQueryGlobalAsientoContable.equals("NONE")) {
				this.asientocontablesForeignKey=detallechequegiradoReturnGeneral.getasientocontablesForeignKey();
			}

			if(!finalQueryGlobalEmpleado.equals("NONE")) {
				this.empleadosForeignKey=detallechequegiradoReturnGeneral.getempleadosForeignKey();
			}

			if(!finalQueryGlobalCuentaBanco.equals("NONE")) {
				this.cuentabancosForeignKey=detallechequegiradoReturnGeneral.getcuentabancosForeignKey();
			}

			if(!finalQueryGlobalAnio.equals("NONE")) {
				this.aniosForeignKey=detallechequegiradoReturnGeneral.getaniosForeignKey();
			}

			if(!finalQueryGlobalMes.equals("NONE")) {
				this.messForeignKey=detallechequegiradoReturnGeneral.getmessForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyDetalleChequeGirado()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyEjercicio();
			this.addItemDefectoCombosForeignKeyPeriodo();
			this.addItemDefectoCombosForeignKeyAsientoContable();
			this.addItemDefectoCombosForeignKeyEmpleado();
			this.addItemDefectoCombosForeignKeyCuentaBanco();
			this.addItemDefectoCombosForeignKeyAnio();
			this.addItemDefectoCombosForeignKeyMes();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.detallechequegiradoSessionBean==null) {
				this.detallechequegiradoSessionBean=new DetalleChequeGiradoSessionBean();
			}

			if(!this.detallechequegiradoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.detallechequegiradoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

			if(!this.detallechequegiradoSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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

			if(!this.detallechequegiradoSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
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

	public void addItemDefectoCombosForeignKeyAsientoContable()throws Exception {
		try {

			if(!this.detallechequegiradoSessionBean.getisBusquedaDesdeForeignKeySesionAsientoContable()) {
				AsientoContable asientocontable=new AsientoContable();
				AsientoContableConstantesFunciones.setAsientoContableDescripcion(asientocontable,Constantes.SMENSAJE_ESCOJA_OPCION);
				asientocontable.setId(null);

				if(!AsientoContableConstantesFunciones.ExisteEnLista(this.asientocontablesForeignKey,asientocontable,true)) {

					this.asientocontablesForeignKey.add(0,asientocontable);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyEmpleado()throws Exception {
		try {

			if(!this.detallechequegiradoSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
				Empleado empleado=new Empleado();
				EmpleadoConstantesFunciones.setEmpleadoDescripcion(empleado,Constantes.SMENSAJE_ESCOJA_OPCION);
				empleado.setId(null);

				if(!EmpleadoConstantesFunciones.ExisteEnLista(this.empleadosForeignKey,empleado,true)) {

					this.empleadosForeignKey.add(0,empleado);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyCuentaBanco()throws Exception {
		try {

			if(!this.detallechequegiradoSessionBean.getisBusquedaDesdeForeignKeySesionCuentaBanco()) {
				CuentaBanco cuentabanco=new CuentaBanco();
				CuentaBancoConstantesFunciones.setCuentaBancoDescripcion(cuentabanco,Constantes.SMENSAJE_ESCOJA_OPCION);
				cuentabanco.setId(null);

				if(!CuentaBancoConstantesFunciones.ExisteEnLista(this.cuentabancosForeignKey,cuentabanco,true)) {

					this.cuentabancosForeignKey.add(0,cuentabanco);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyAnio()throws Exception {
		try {

			if(!this.detallechequegiradoSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
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

			if(!this.detallechequegiradoSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
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
	
	public void initActionsCombosTodosForeignKeyDetalleChequeGirado()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyDetalleChequeGirado(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyDetalleChequeGirado()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
				this.setActualEjercicioForeignKey(this.parametroGeneralUsuario.getid_ejercicio(),false,"Formulario");
				this.setActualPeriodoForeignKey(this.parametroGeneralUsuario.getid_periodo(),false,"Formulario");
			
			
				this.detallechequegirado.setfecha(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyDetalleChequeGirado();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyDetalleChequeGirado(DetalleChequeGirado detallechequegirado)throws Exception {	
		try {
			
			this.setActualAsientoContableForeignKey(detallechequegirado.getid_asiento_contable(),false,"Formulario");
			this.setActualEmpleadoForeignKey(detallechequegirado.getid_empleado(),false,"Formulario");
			this.setActualCuentaBancoForeignKey(detallechequegirado.getid_cuenta_banco(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyDetalleChequeGirado(DetalleChequeGirado detallechequegirado,String sTipoEvento)throws Exception {	
		try {
			
			

				if(detallechequegirado.getAsientoContable()!=null && !sTipoEvento.equals("id_asiento_contableDetalleChequeGirado")) { //sTipoEvento Evita Bucle Infinito

					this.asientocontablesForeignKey=new ArrayList<AsientoContable>();
					this.asientocontablesForeignKey.add(detallechequegirado.getAsientoContable());

					this.addItemDefectoCombosForeignKeyAsientoContable();
					this.cargarCombosFrameAsientoContablesForeignKey("Todos");
				}

				if(detallechequegirado.getEmpleado()!=null && !sTipoEvento.equals("id_empleadoDetalleChequeGirado")) { //sTipoEvento Evita Bucle Infinito

					this.empleadosForeignKey=new ArrayList<Empleado>();
					this.empleadosForeignKey.add(detallechequegirado.getEmpleado());

					this.addItemDefectoCombosForeignKeyEmpleado();
					this.cargarCombosFrameEmpleadosForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyDetalleChequeGirado()throws Exception {	
		try {
			
			this.setActualAsientoContableForeignKey(this.detallechequegiradoConstantesFunciones.getid_asiento_contable(),false,"Formulario");
			this.setActualEmpleadoForeignKey(this.detallechequegiradoConstantesFunciones.getid_empleado(),false,"Formulario");
			this.setActualCuentaBancoForeignKey(this.detallechequegiradoConstantesFunciones.getid_cuenta_banco(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyDetalleChequeGirado()throws Exception {	
		try {
			

				if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) {
					Ejercicio ejercicioActual=(Ejercicio)this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_ejercicioDetalleChequeGirado.getSelectedItem();
					this.setActualAnioForeignKey(ejercicioActual.getid_anio(),false,"Formulario");
				}

				if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) {
					Periodo periodoActual=(Periodo)this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_periodoDetalleChequeGirado.getSelectedItem();
					this.setActualMesForeignKey(periodoActual.getid_mes(),false,"Formulario");
				}
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyDetalleChequeGirado()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyDetalleChequeGirado()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroDetalleChequeGirado()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyDetalleChequeGirado()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameEjerciciosForeignKey("Todos");
			this.cargarCombosFramePeriodosForeignKey("Todos");
			this.cargarCombosFrameAsientoContablesForeignKey("Todos");
			this.cargarCombosFrameEmpleadosForeignKey("Todos");
			this.cargarCombosFrameCuentaBancosForeignKey("Todos");
			this.cargarCombosFrameAniosForeignKey("Todos");
			this.cargarCombosFrameMessForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyDetalleChequeGirado(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEjerciciosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFramePeriodosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameAsientoContablesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpleadosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCuentaBancosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameAniosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameMessForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyDetalleChequeGirado()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_empresaDetalleChequeGirado!=null && this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_empresaDetalleChequeGirado.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_empresaDetalleChequeGirado.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_sucursalDetalleChequeGirado!=null && this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_sucursalDetalleChequeGirado.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_sucursalDetalleChequeGirado.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_ejercicioDetalleChequeGirado!=null && this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_ejercicioDetalleChequeGirado.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_ejercicioDetalleChequeGirado.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_periodoDetalleChequeGirado!=null && this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_periodoDetalleChequeGirado.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_periodoDetalleChequeGirado.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_asiento_contableDetalleChequeGirado!=null && this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_asiento_contableDetalleChequeGirado.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_asiento_contableDetalleChequeGirado.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_empleadoDetalleChequeGirado!=null && this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_empleadoDetalleChequeGirado.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_empleadoDetalleChequeGirado.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_cuenta_bancoDetalleChequeGirado!=null && this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_cuenta_bancoDetalleChequeGirado.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_cuenta_bancoDetalleChequeGirado.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_anioDetalleChequeGirado!=null && this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_anioDetalleChequeGirado.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_anioDetalleChequeGirado.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_mesDetalleChequeGirado!=null && this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_mesDetalleChequeGirado.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_mesDetalleChequeGirado.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


















	
	

	public DetalleChequeGiradoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public DetalleChequeGiradoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public DetalleChequeGiradoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.detallechequegiradoSessionBean=new DetalleChequeGiradoSessionBean(); 
		this.detallechequegiradoConstantesFunciones=new DetalleChequeGiradoConstantesFunciones(); 
		this.detallechequegiradoBean=new DetalleChequeGirado();//(this.detallechequegiradoConstantesFunciones); 		
		this.detallechequegiradoReturnGeneral=new DetalleChequeGiradoParameterReturnGeneral(); 
		
		this.detallechequegiradoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detallechequegiradoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public DetalleChequeGiradoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public DetalleChequeGiradoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public DetalleChequeGiradoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessDetalleChequeGirado(true);
			
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
			
			this.detallechequegiradoConstantesFunciones=new DetalleChequeGiradoConstantesFunciones(); 
			this.detallechequegiradoBean=new DetalleChequeGirado();//this.detallechequegiradoConstantesFunciones); 			
			this.detallechequegiradoReturnGeneral=new DetalleChequeGiradoParameterReturnGeneral(); 
		
			DetalleChequeGiradoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Detalle Cheque Girado Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.detallechequegirado=new DetalleChequeGirado();
			this.detallechequegirados = new ArrayList<DetalleChequeGirado>();
			this.detallechequegiradosAux = new ArrayList<DetalleChequeGirado>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic=new DetalleChequeGiradoLogic();
				this.detallechequegiradoLogic.getNewConnexionToDeep("");
			}
			
			//this.detallechequegiradoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.detallechequegiradoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormDetalleChequeGirado);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoDetalleChequeGirado!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDetalleChequeGirado);	
					}
					
					if(this.jInternalFrameImportacionDetalleChequeGirado!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDetalleChequeGirado);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByDetalleChequeGirado!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByDetalleChequeGirado);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormDetalleChequeGirado);
				this.jInternalFrameDetalleFormDetalleChequeGirado.setVisible(false);
				this.jInternalFrameDetalleFormDetalleChequeGirado.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoDetalleChequeGirado!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDetalleChequeGirado);
					this.jInternalFrameReporteDinamicoDetalleChequeGirado.setVisible(false);
					this.jInternalFrameReporteDinamicoDetalleChequeGirado.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionDetalleChequeGirado!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionDetalleChequeGirado);
					this.jInternalFrameImportacionDetalleChequeGirado.setVisible(false);
					this.jInternalFrameImportacionDetalleChequeGirado.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByDetalleChequeGirado!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByDetalleChequeGirado);
					this.jInternalFrameOrderByDetalleChequeGirado.setVisible(false);
					this.jInternalFrameOrderByDetalleChequeGirado.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idDetalleChequeGiradoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=DetalleChequeGiradoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.detallechequegiradoReturnGeneral=new DetalleChequeGiradoParameterReturnGeneral();
			
			this.detallechequegiradoParameterGeneral=new DetalleChequeGiradoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.detallechequegiradoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.detallechequegiradoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(DetalleChequeGiradoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.detallechequegiradoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DetalleChequeGiradoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.detallechequegiradoSessionBean.getEsGuardarRelacionado(),this.detallechequegiradoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DetalleChequeGiradoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.detallechequegiradoSessionBean.getEsGuardarRelacionado(),this.detallechequegiradoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoDetalleChequeGirado=false;
			this.isVisibilidadCeldaDuplicarDetalleChequeGirado=true;
			this.isVisibilidadCeldaCopiarDetalleChequeGirado=true;
			this.isVisibilidadCeldaVerFormDetalleChequeGirado=true;
			this.isVisibilidadCeldaOrdenDetalleChequeGirado=true;
			this.isVisibilidadCeldaNuevoRelacionesDetalleChequeGirado=false;
			this.isVisibilidadCeldaModificarDetalleChequeGirado=false;
			this.isVisibilidadCeldaActualizarDetalleChequeGirado=false;
			this.isVisibilidadCeldaEliminarDetalleChequeGirado=false;
			this.isVisibilidadCeldaCancelarDetalleChequeGirado=false;
			this.isVisibilidadCeldaGuardarDetalleChequeGirado=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleChequeGirado=false;
			
			
			this.isVisibilidadFK_IdAnio=true;
			this.isVisibilidadFK_IdAsientoContable=true;
			this.isVisibilidadFK_IdCuentaBanco=true;
			this.isVisibilidadFK_IdEjercicio=true;
			this.isVisibilidadFK_IdEmpleado=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdMes=true;
			this.isVisibilidadFK_IdPeriodo=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesDetalleChequeGirado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosDetalleChequeGirado();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioDetalleChequeGirado(false);
			
			this.setPermisosUsuarioDetalleChequeGirado();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.detallechequegiradoSessionBean.getEsGuardarRelacionado() 
				|| (this.detallechequegiradoSessionBean.getEsGuardarRelacionado() && this.detallechequegiradoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioDetalleChequeGiradoClasesRelacionadas();
			}
			
			if(this.detallechequegiradoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioDetalleChequeGiradoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!DetalleChequeGiradoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosDetalleChequeGirado();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualDetalleChequeGirado();
			}
			
			if(!this.isPermisoBusquedaDetalleChequeGirado) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasDetalleChequeGirado.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.detallechequegiradoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioDetalleChequeGirado,this.isPermisoPaginacionMedioDetalleChequeGirado,this.isPermisoPaginacionTodoDetalleChequeGirado);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(DetalleChequeGiradoConstantesFunciones.getTiposSeleccionarDetalleChequeGirado());
				
				this.tiposColumnasSelect=DetalleChequeGiradoConstantesFunciones.getTiposSeleccionarDetalleChequeGirado(true);
				
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
			//if(!this.detallechequegiradoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioDetalleChequeGirado();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioDetalleChequeGirado(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioDetalleChequeGirado(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesDetalleChequeGirado() ;
			
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
			this.asientocontableLogic=new AsientoContableLogic();
			this.empleadoLogic=new EmpleadoLogic();
			this.cuentabancoLogic=new CuentaBancoLogic();
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
				detallechequegiradoImplementable= (DetalleChequeGiradoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DetalleChequeGiradoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				detallechequegiradoImplementableHome= (DetalleChequeGiradoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DetalleChequeGiradoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.detallechequegirados= new ArrayList<DetalleChequeGirado>();
			this.detallechequegiradosEliminados= new ArrayList<DetalleChequeGirado>();
						
			this.isEsNuevoDetalleChequeGirado=false;
			this.esParaAccionDesdeFormularioDetalleChequeGirado=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idAsientoContableActual=0L;
			this.idEmpleadoActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>() ;
			this.periodosForeignKey=new ArrayList<Periodo>() ;
			this.asientocontablesForeignKey=new ArrayList<AsientoContable>() ;
			this.empleadosForeignKey=new ArrayList<Empleado>() ;
			this.cuentabancosForeignKey=new ArrayList<CuentaBanco>() ;
			this.aniosForeignKey=new ArrayList<Anio>() ;
			this.messForeignKey=new ArrayList<Mes>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyDetalleChequeGirado(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroDetalleChequeGirado();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.detallechequegiradoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			DetalleChequeGiradoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=DetalleChequeGiradoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesDetalleChequeGirado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingDetalleChequeGirado(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioDetalleChequeGirado();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioDetalleChequeGirado();
			}
			
			DetalleChequeGiradoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasDetalleChequeGirado.getTabCount(); i++) {
					this.jTabbedPaneBusquedasDetalleChequeGirado.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasDetalleChequeGirado.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessDetalleChequeGirado(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga DetalleChequeGirado: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectDetalleChequeGirado() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesDetalleChequeGirado")) {
				iIndex=this.jInternalFrameDetalleFormDetalleChequeGirado.jTabbedPaneRelacionesDetalleChequeGirado.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormDetalleChequeGirado.jTabbedPaneRelacionesDetalleChequeGirado.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosDetalleChequeGirado.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessDetalleChequeGirado();	
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
	
	public void cargarCombosForeignKeyDetalleChequeGirado(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyDetalleChequeGirado(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyDetalleChequeGirado(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyDetalleChequeGiradoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyDetalleChequeGirado();
		
		this.cargarCombosFrameForeignKeyDetalleChequeGirado();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyDetalleChequeGirado();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyDetalleChequeGirado();
		}
	}
	
	

	public void cargarCombosForeignKeyAsientoContable(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyAsientoContableListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyAsientoContable();
				this.cargarCombosFrameAsientoContablesForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaAsientoContable(this.asientocontablesForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyEmpleado(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyEmpleadoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyEmpleado();
				this.cargarCombosFrameEmpleadosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaEmpleado(this.empleadosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCuentaBanco(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyCuentaBancoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCuentaBanco();
				this.cargarCombosFrameCuentaBancosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCuentaBanco(this.cuentabancosForeignKey);

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
	
	public void jButtonNuevoDetalleChequeGiradoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.detallechequegiradoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormDetalleChequeGirado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			DetalleChequeGiradoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.detallechequegirado,new Object(),this.detallechequegiradoParameterGeneral,this.detallechequegiradoReturnGeneral);
			
			
			if(jTableDatosDetalleChequeGirado.getRowCount()>=1) {
				jTableDatosDetalleChequeGirado.removeRowSelectionInterval(0, jTableDatosDetalleChequeGirado.getRowCount()-1);						
			}
			
			this.isEsNuevoDetalleChequeGirado=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoDetalleChequeGirado(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesDetalleChequeGirado(true);			
			//this.detallechequegirado=new DetalleChequeGirado();
			//this.detallechequegirado.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDetalleChequeGirado(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetalleChequeGirado() ;
			
			if(DetalleChequeGiradoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDetalleChequeGirado(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.detallechequegirado);	
			this.actualizarInformacion("INFO_PADRE",false,this.detallechequegirado);				
			
			DetalleChequeGiradoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.detallechequegirado,new Object(),this.detallechequegiradoParameterGeneral,this.detallechequegiradoReturnGeneral);
			
			if(this.detallechequegiradoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar DetalleChequeGirado: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			DetalleChequeGiradoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.detallechequegirado,new Object(),this.detallechequegiradoParameterGeneral,this.detallechequegiradoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarDetalleChequeGiradoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<DetalleChequeGirado> detallechequegiradosSeleccionados=new ArrayList<DetalleChequeGirado>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosDetalleChequeGirado.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosDetalleChequeGirado.getSelectedRows().length;			
			}
			
			detallechequegiradosSeleccionados=this.getDetalleChequeGiradosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoDetalleChequeGirado--;			
				//DetalleChequeGirado detallechequegiradoAux= new DetalleChequeGirado();			
				//detallechequegiradoAux.setId(this.iIdNuevoDetalleChequeGirado);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//DetalleChequeGirado detallechequegiradoOrigen=new DetalleChequeGirado();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(DetalleChequeGirado detallechequegiradoOrigen : detallechequegiradosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosDetalleChequeGirado.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							detallechequegiradoOrigen =(DetalleChequeGirado) this.detallechequegiradoLogic.getDetalleChequeGirados().toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallechequegiradoOrigen =(DetalleChequeGirado) this.detallechequegirados.toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaDetalleChequeGirado();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.detallechequegirado.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosDetalleChequeGirado(detallechequegiradoOrigen,this.detallechequegirado,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleChequeGirado(this.detallechequegirado);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.detallechequegiradoLogic.getDetalleChequeGirados().add(this.detallechequegiradoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.detallechequegirados.add(this.detallechequegiradoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaDetalleChequeGirado(false);
				
				this.jTableDatosDetalleChequeGirado.setRowSelectionInterval(this.getIndiceNuevoDetalleChequeGirado(), this.getIndiceNuevoDetalleChequeGirado());
				
				int iLastRow =  this.jTableDatosDetalleChequeGirado.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDetalleChequeGirado.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDetalleChequeGirado.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDetalleChequeGirado(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarDetalleChequeGiradoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<DetalleChequeGirado> detallechequegiradosSeleccionados=new ArrayList<DetalleChequeGirado>();									
		
			DetalleChequeGirado detallechequegiradoOrigen=new DetalleChequeGirado();
			DetalleChequeGirado detallechequegiradoDestino=new DetalleChequeGirado();
				
			detallechequegiradosSeleccionados=this.getDetalleChequeGiradosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosDetalleChequeGirado.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || detallechequegiradosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosDetalleChequeGirado.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detallechequegiradoOrigen =(DetalleChequeGirado) this.detallechequegiradoLogic.getDetalleChequeGirados().toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						detallechequegiradoOrigen =(DetalleChequeGirado) this.detallechequegirados.toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detallechequegiradoDestino =(DetalleChequeGirado) this.detallechequegiradoLogic.getDetalleChequeGirados().toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						detallechequegiradoDestino =(DetalleChequeGirado) this.detallechequegirados.toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				detallechequegiradoOrigen =detallechequegiradosSeleccionados.get(0);
				detallechequegiradoDestino =detallechequegiradosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosDetalleChequeGirado(detallechequegiradoOrigen,detallechequegiradoDestino,true,false);
				
				detallechequegiradoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(detallechequegiradoDestino,detallechequegiradoLogic.getDetalleChequeGirados());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detallechequegiradoDestino,detallechequegirados);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaDetalleChequeGirado(false);
				
				//this.jTableDatosDetalleChequeGirado.setRowSelectionInterval(this.getIndiceNuevoDetalleChequeGirado(), this.getIndiceNuevoDetalleChequeGirado());
				
				int iLastRow =  this.jTableDatosDetalleChequeGirado.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDetalleChequeGirado.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDetalleChequeGirado.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDetalleChequeGirado(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormDetalleChequeGiradoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDetalleChequeGirado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormDetalleChequeGirado.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarDetalleChequeGiradoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesDetalleChequeGirado.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasDetalleChequeGirado.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesDetalleChequeGirado.setVisible(!isVisible);
			this.jPanelPaginacionDetalleChequeGirado.setVisible(!isVisible);
			this.jPanelAccionesDetalleChequeGirado.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarDetalleChequeGiradoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameDetalleChequeGirado();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoDetalleChequeGiradoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoDetalleChequeGirado();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionDetalleChequeGiradoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionDetalleChequeGirado();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByDetalleChequeGiradoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByDetalleChequeGirado();
			
			this.abrirFrameOrderByDetalleChequeGirado();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByDetalleChequeGiradoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByDetalleChequeGirado();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleDetalleChequeGirado(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormDetalleChequeGirado);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormDetalleChequeGirado.isMaximum()) {
					this.jInternalFrameDetalleFormDetalleChequeGirado.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormDetalleChequeGirado.setSize(this.jInternalFrameDetalleFormDetalleChequeGirado.iWidthFormulario,this.jInternalFrameDetalleFormDetalleChequeGirado.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormDetalleChequeGirado.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormDetalleChequeGirado.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormDetalleChequeGirado.isMaximum()) {
						this.jInternalFrameDetalleFormDetalleChequeGirado.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormDetalleChequeGirado.jContentPaneDetalleDetalleChequeGirado.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormDetalleChequeGirado.jTabbedPaneRelacionesDetalleChequeGirado.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormDetalleChequeGirado.jContentPaneDetalleDetalleChequeGirado.getWidth(),DetalleChequeGiradoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDetalleChequeGirado.jTabbedPaneRelacionesDetalleChequeGirado.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormDetalleChequeGirado.jContentPaneDetalleDetalleChequeGirado.getWidth(),DetalleChequeGiradoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDetalleChequeGirado.jTabbedPaneRelacionesDetalleChequeGirado.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormDetalleChequeGirado.jContentPaneDetalleDetalleChequeGirado.getWidth(),DetalleChequeGiradoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormDetalleChequeGirado.setVisible(true);
	        this.jInternalFrameDetalleFormDetalleChequeGirado.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByDetalleChequeGirado() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByDetalleChequeGirado==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByDetalleChequeGirado=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleChequeGirado,false,this);
				} else {
					this.jInternalFrameOrderByDetalleChequeGirado=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleChequeGirado,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByDetalleChequeGirado);
				this.jInternalFrameOrderByDetalleChequeGirado.setVisible(false);
				this.jInternalFrameOrderByDetalleChequeGirado.setSelected(false);
				
				this.jInternalFrameOrderByDetalleChequeGirado.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDetalleChequeGirado"));
				
				this.inicializarActualizarBindingTablaOrderByDetalleChequeGirado();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionDetalleChequeGirado() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionDetalleChequeGirado==null) {
				
				this.jInternalFrameImportacionDetalleChequeGirado=new ImportacionJInternalFrame(DetalleChequeGiradoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDetalleChequeGirado);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionDetalleChequeGirado);
				this.jInternalFrameImportacionDetalleChequeGirado.setVisible(false);
				this.jInternalFrameImportacionDetalleChequeGirado.setSelected(false);


				this.jInternalFrameImportacionDetalleChequeGirado.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDetalleChequeGirado"));
				this.jInternalFrameImportacionDetalleChequeGirado.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDetalleChequeGirado"));
				this.jInternalFrameImportacionDetalleChequeGirado.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDetalleChequeGirado"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoDetalleChequeGirado() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoDetalleChequeGirado==null) {
				this.jInternalFrameReporteDinamicoDetalleChequeGirado=new ReporteDinamicoJInternalFrame(DetalleChequeGiradoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDetalleChequeGirado);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDetalleChequeGirado);
				this.jInternalFrameReporteDinamicoDetalleChequeGirado.setVisible(false);
				this.jInternalFrameReporteDinamicoDetalleChequeGirado.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoDetalleChequeGirado.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDetalleChequeGirado"));
				this.jInternalFrameReporteDinamicoDetalleChequeGirado.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDetalleChequeGirado"));
				this.jInternalFrameReporteDinamicoDetalleChequeGirado.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDetalleChequeGirado"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDetalleChequeGirado();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleDetalleChequeGirado() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormDetalleChequeGirado);
			
	       	this.jInternalFrameDetalleFormDetalleChequeGirado.setVisible(false);
	        this.jInternalFrameDetalleFormDetalleChequeGirado.setSelected(false);
			
			//this.jInternalFrameDetalleFormDetalleChequeGirado.dispose();
			//this.jInternalFrameDetalleFormDetalleChequeGirado=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoDetalleChequeGirado() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoDetalleChequeGirado.setVisible(true);
	        this.jInternalFrameReporteDinamicoDetalleChequeGirado.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionDetalleChequeGirado() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionDetalleChequeGirado.setVisible(true);
	        this.jInternalFrameImportacionDetalleChequeGirado.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByDetalleChequeGirado() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByDetalleChequeGirado.setVisible(true);
	        this.jInternalFrameOrderByDetalleChequeGirado.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByDetalleChequeGirado() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByDetalleChequeGirado.setVisible(false);
	        this.jInternalFrameOrderByDetalleChequeGirado.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoDetalleChequeGirado() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoDetalleChequeGirado.setVisible(false);
	        this.jInternalFrameReporteDinamicoDetalleChequeGirado.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionDetalleChequeGirado() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionDetalleChequeGirado.setVisible(false);
	        this.jInternalFrameImportacionDetalleChequeGirado.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarDetalleChequeGiradoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarDetalleChequeGirado(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarDetalleChequeGirado(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDetalleChequeGirado.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesDetalleChequeGirado(true);
			//this.isEsNuevoDetalleChequeGirado=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegirado =(DetalleChequeGirado) this.detallechequegiradoLogic.getDetalleChequeGirados().toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.detallechequegirado =(DetalleChequeGirado) this.detallechequegirados.toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesDetalleChequeGirado("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDetalleChequeGirado(false) ;
			
			if(detallechequegiradoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(DetalleChequeGiradoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDetalleChequeGirado(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetalleChequeGirado(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaDetalleChequeGiradoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosDetalleChequeGirado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegirado =(DetalleChequeGirado) this.detallechequegiradoLogic.getDetalleChequeGirados().toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallechequegirado =(DetalleChequeGirado) this.detallechequegirados.toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarDetalleChequeGirado(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDetalleChequeGirado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDetalleChequeGirado.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesDetalleChequeGirado(true);
			//this.isEsNuevoDetalleChequeGirado=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegirado =(DetalleChequeGirado) this.detallechequegiradoLogic.getDetalleChequeGirados().toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.detallechequegirado =(DetalleChequeGirado) this.detallechequegirados.toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.detallechequegirado.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesDetalleChequeGirado("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesDetalleChequeGirado(false) ;
			
			if(DetalleChequeGiradoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDetalleChequeGirado(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetalleChequeGirado(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("AsientoContable")) {
				if(!this.detallechequegiradoConstantesFunciones.cargarid_asiento_contableDetalleChequeGirado) {
					this.cargarCombosAsientoContablesForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingDetalleChequeGirado(false,false);
					this.cargarCombosFrameAsientoContablesForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_asiento_contable (id);

				this.recargarComboTablaAsientoContable(this.asientocontablesForeignKey);

			}
			
			if(sType.equals("Empleado")) {
				if(!this.detallechequegiradoConstantesFunciones.cargarid_empleadoDetalleChequeGirado) {
					this.cargarCombosEmpleadosForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingDetalleChequeGirado(false,false);
					this.cargarCombosFrameEmpleadosForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_empleado (id);

				this.recargarComboTablaEmpleado(this.empleadosForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
					
	
	public void recargarComboTablaAsientoContable(List<AsientoContable> asientocontablesForeignKey)throws Exception{
		TableColumn tableColumnAsientoContable=this.jTableDatosDetalleChequeGirado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleChequeGirado,DetalleChequeGiradoConstantesFunciones.LABEL_IDASIENTOCONTABLE));
		TableCellEditor tableCellEditorAsientoContable =tableColumnAsientoContable.getCellEditor();

		AsientoContableTableCell asientocontableTableCellFk=(AsientoContableTableCell)tableCellEditorAsientoContable;

		if(asientocontableTableCellFk!=null) {
			asientocontableTableCellFk.setasientocontablesForeignKey(asientocontablesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDetalleChequeGirado.getSelectedRow();

		//if(intSelectedRow<=0) {
			//asientocontableTableCellFk.setRowActual(intSelectedRow);
			//asientocontableTableCellFk.setasientocontablesForeignKeyActual(asientocontablesForeignKey);
		//}


		if(asientocontableTableCellFk!=null) {
			asientocontableTableCellFk.RecargarAsientoContablesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaEmpleado(List<Empleado> empleadosForeignKey)throws Exception{
		TableColumn tableColumnEmpleado=this.jTableDatosDetalleChequeGirado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleChequeGirado,DetalleChequeGiradoConstantesFunciones.LABEL_IDEMPLEADO));
		TableCellEditor tableCellEditorEmpleado =tableColumnEmpleado.getCellEditor();

		EmpleadoTableCell empleadoTableCellFk=(EmpleadoTableCell)tableCellEditorEmpleado;

		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.setempleadosForeignKey(empleadosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDetalleChequeGirado.getSelectedRow();

		//if(intSelectedRow<=0) {
			//empleadoTableCellFk.setRowActual(intSelectedRow);
			//empleadoTableCellFk.setempleadosForeignKeyActual(empleadosForeignKey);
		//}


		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.RecargarEmpleadosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaCuentaBanco(List<CuentaBanco> cuentabancosForeignKey)throws Exception{
		TableColumn tableColumnCuentaBanco=this.jTableDatosDetalleChequeGirado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleChequeGirado,DetalleChequeGiradoConstantesFunciones.LABEL_IDCUENTABANCO));
		TableCellEditor tableCellEditorCuentaBanco =tableColumnCuentaBanco.getCellEditor();

		CuentaBancoTableCell cuentabancoTableCellFk=(CuentaBancoTableCell)tableCellEditorCuentaBanco;

		if(cuentabancoTableCellFk!=null) {
			cuentabancoTableCellFk.setcuentabancosForeignKey(cuentabancosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDetalleChequeGirado.getSelectedRow();

		//if(intSelectedRow<=0) {
			//cuentabancoTableCellFk.setRowActual(intSelectedRow);
			//cuentabancoTableCellFk.setcuentabancosForeignKeyActual(cuentabancosForeignKey);
		//}


		if(cuentabancoTableCellFk!=null) {
			cuentabancoTableCellFk.RecargarCuentaBancosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaAnio(List<Anio> aniosForeignKey)throws Exception{
		TableColumn tableColumnAnio=this.jTableDatosDetalleChequeGirado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleChequeGirado,DetalleChequeGiradoConstantesFunciones.LABEL_IDANIO));
		TableCellEditor tableCellEditorAnio =tableColumnAnio.getCellEditor();

		AnioTableCell anioTableCellFk=(AnioTableCell)tableCellEditorAnio;

		if(anioTableCellFk!=null) {
			anioTableCellFk.setaniosForeignKey(aniosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDetalleChequeGirado.getSelectedRow();

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
		TableColumn tableColumnMes=this.jTableDatosDetalleChequeGirado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleChequeGirado,DetalleChequeGiradoConstantesFunciones.LABEL_IDMES));
		TableCellEditor tableCellEditorMes =tableColumnMes.getCellEditor();

		MesTableCell mesTableCellFk=(MesTableCell)tableCellEditorMes;

		if(mesTableCellFk!=null) {
			mesTableCellFk.setmessForeignKey(messForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDetalleChequeGirado.getSelectedRow();

		//if(intSelectedRow<=0) {
			//mesTableCellFk.setRowActual(intSelectedRow);
			//mesTableCellFk.setmessForeignKeyActual(messForeignKey);
		//}


		if(mesTableCellFk!=null) {
			mesTableCellFk.RecargarMessForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_asiento_contable (Long id) throws Exception {
		this.setActualAsientoContableForeignKey(id,true,"Todos");

	};
	

	public void setCombosCodigoDesdeBusquedaid_empleado (Long id) throws Exception {
		this.setActualEmpleadoForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarDetalleChequeGiradoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesDetalleChequeGirado(false);
			
			//if(!this.isEsNuevoDetalleChequeGirado) {								
				int intSelectedRow = this.jTableDatosDetalleChequeGirado.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegirado =(DetalleChequeGirado) this.detallechequegiradoLogic.getDetalleChequeGirados().toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallechequegirado =(DetalleChequeGirado) this.detallechequegirados.toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(DetalleChequeGiradoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualDetalleChequeGirado(this.detallechequegirado,true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleChequeGirado(this.detallechequegirado);
				
			}
			
			if(this.permiteMantenimiento(this.detallechequegirado)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.detallechequegiradoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoDetalleChequeGirado=true;
					this.inicializarActualizarBindingTablaDetalleChequeGirado(false);
					this.isEsNuevoDetalleChequeGirado=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoDetalleChequeGirado=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoDetalleChequeGirado=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDetalleChequeGirado(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDetalleChequeGirado(false);
				
				this.habilitarDeshabilitarControlesDetalleChequeGirado(false);
			
												
				
				if(DetalleChequeGiradoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleDetalleChequeGirado();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoDetalleChequeGiradoActionPerformed(evt,detallechequegiradoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualDetalleChequeGirado(this.detallechequegirado,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosDetalleChequeGirado.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,detallechequegiradoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.detallechequegirado.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(DetalleChequeGirado.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleChequeGirado.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarDetalleChequeGiradoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosDetalleChequeGirado.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegirado =(DetalleChequeGirado) this.detallechequegiradoLogic.getDetalleChequeGirados().toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
				this.detallechequegirado.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.detallechequegirado =(DetalleChequeGirado) this.detallechequegirados.toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
				this.detallechequegirado.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.detallechequegirado)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.detallechequegiradoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((DetalleChequeGiradoModel) this.jTableDatosDetalleChequeGirado.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoDetalleChequeGirado=true;
				this.inicializarActualizarBindingTablaDetalleChequeGirado(false);
				this.isEsNuevoDetalleChequeGirado=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDetalleChequeGirado(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDetalleChequeGirado(false);
				
				this.habilitarDeshabilitarControlesDetalleChequeGirado(false);
				
				
				
				if(DetalleChequeGiradoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleDetalleChequeGirado();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarDetalleChequeGiradoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosDetalleChequeGirado.getRowCount()>=1) {
				jTableDatosDetalleChequeGirado.removeRowSelectionInterval(0, jTableDatosDetalleChequeGirado.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesDetalleChequeGirado(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaDetalleChequeGirado(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDetalleChequeGirado(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetalleChequeGirado(false) ;
			
			this.isEsNuevoDetalleChequeGirado=false;
			
			if(DetalleChequeGiradoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleDetalleChequeGirado();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosDetalleChequeGiradoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingDetalleChequeGirado(false);
				
				//SI ES MANUAL
				if(DetalleChequeGiradoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualDetalleChequeGirado();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosDetalleChequeGiradoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoDetalleChequeGirado--;			
			//DetalleChequeGirado detallechequegiradoAux= new DetalleChequeGirado();			
			//detallechequegiradoAux.setId(this.iIdNuevoDetalleChequeGirado);
			
			if(this.jInternalFrameDetalleFormDetalleChequeGirado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaDetalleChequeGirado();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysDetalleChequeGirado(this.detallechequegirado);
			
			this.detallechequegirado.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.detallechequegiradoLogic.getDetalleChequeGirados().add(this.detallechequegiradoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.detallechequegirados.add(this.detallechequegiradoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaDetalleChequeGirado(false);
			
			this.jTableDatosDetalleChequeGirado.setRowSelectionInterval(this.getIndiceNuevoDetalleChequeGirado(), this.getIndiceNuevoDetalleChequeGirado());
			
			int iLastRow =  this.jTableDatosDetalleChequeGirado.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosDetalleChequeGirado.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosDetalleChequeGirado.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaDetalleChequeGirado(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionDetalleChequeGiradoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingDetalleChequeGirado(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetalleChequeGirado(false);
			
			//SI ES MANUAL
			if(DetalleChequeGiradoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDetalleChequeGirado();
			}
			
			//this.abrirFrameTreeDetalleChequeGirado();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionDetalleChequeGiradoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Detalle Cheque GiradoS ?", "MANTENIMIENTO DE Detalle Cheque Girado", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionDetalleChequeGirado.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralDetalleChequeGirado();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.detallechequegiradoReturnGeneral=detallechequegiradoLogic.procesarImportacionDetalleChequeGiradosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.detallechequegiradoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarDetalleChequeGiradoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionDetalleChequeGiradoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionDetalleChequeGirado.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionDetalleChequeGirado.setFileImportacion(this.jInternalFrameImportacionDetalleChequeGirado.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionDetalleChequeGirado.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionDetalleChequeGirado.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionDetalleChequeGirado.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionDetalleChequeGirado.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoDetalleChequeGiradoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<DetalleChequeGirado> detallechequegiradosSeleccionados=new ArrayList<DetalleChequeGirado>();		

		detallechequegiradosSeleccionados=this.getDetalleChequeGiradosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetalleChequeGirado.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetalleChequeGirado.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("DetalleChequeGiradoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"DetalleChequeGiradoBaseDesign.jrxml";
			
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
			
			this.generarReporteDetalleChequeGirados("Todos",detallechequegiradosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallechequegiradoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Cheque Girado",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoDetalleChequeGirado.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleChequeGirado.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DetalleChequeGiradoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleChequeGiradoConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleChequeGiradoConstantesFunciones.LABEL_IDEJERCICIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Ejercicio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Ejercicio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Ejercicio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Ejercicio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleChequeGiradoConstantesFunciones.LABEL_IDPERIODO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Periodo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Periodo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Periodo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Periodo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleChequeGiradoConstantesFunciones.LABEL_IDASIENTOCONTABLE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_AsientoContable_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_AsientoContable_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_AsientoContable_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_AsientoContable_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleChequeGiradoConstantesFunciones.LABEL_IDEMPLEADO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empleado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empleado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empleado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empleado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleChequeGiradoConstantesFunciones.LABEL_IDCUENTABANCO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_CuentaBanco_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_CuentaBanco_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_CuentaBanco_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_CuentaBanco_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleChequeGiradoConstantesFunciones.LABEL_NUMEROCHEQUE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroCheque_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroCheque_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroCheque_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroCheque_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleChequeGiradoConstantesFunciones.LABEL_VALOR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleChequeGiradoConstantesFunciones.LABEL_CUENTA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_enta_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_enta_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_enta_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_enta_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleChequeGiradoConstantesFunciones.LABEL_FECHA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cha_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cha_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cha_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cha_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleChequeGiradoConstantesFunciones.LABEL_CON:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_n_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_n_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_n_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_n_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleChequeGiradoConstantesFunciones.LABEL_BENEFICIARIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_neficiario_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_neficiario_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_neficiario_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_neficiario_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleChequeGiradoConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleChequeGiradoConstantesFunciones.LABEL_NOMBREBANCO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreBanco_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreBanco_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreBanco_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreBanco_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleChequeGiradoConstantesFunciones.LABEL_IDANIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Anio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Anio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Anio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Anio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleChequeGiradoConstantesFunciones.LABEL_IDMES:
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
		
		if(this.jInternalFrameReporteDinamicoDetalleChequeGirado.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoDetalleChequeGirado.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoDetalleChequeGirado.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case DetalleChequeGiradoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case DetalleChequeGiradoConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case DetalleChequeGiradoConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoria="id_ejercicio";
					break;

				case DetalleChequeGiradoConstantesFunciones.LABEL_IDPERIODO:
					sNombreCampoCategoria="id_periodo";
					break;

				case DetalleChequeGiradoConstantesFunciones.LABEL_IDASIENTOCONTABLE:
					sNombreCampoCategoria="id_asiento_contable";
					break;

				case DetalleChequeGiradoConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoria="id_empleado";
					break;

				case DetalleChequeGiradoConstantesFunciones.LABEL_IDCUENTABANCO:
					sNombreCampoCategoria="id_cuenta_banco";
					break;

				case DetalleChequeGiradoConstantesFunciones.LABEL_NUMEROCHEQUE:
					sNombreCampoCategoria="numero_cheque";
					break;

				case DetalleChequeGiradoConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoria="valor";
					break;

				case DetalleChequeGiradoConstantesFunciones.LABEL_CUENTA:
					sNombreCampoCategoria="cuenta";
					break;

				case DetalleChequeGiradoConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoria="fecha";
					break;

				case DetalleChequeGiradoConstantesFunciones.LABEL_CON:
					sNombreCampoCategoria="con";
					break;

				case DetalleChequeGiradoConstantesFunciones.LABEL_BENEFICIARIO:
					sNombreCampoCategoria="beneficiario";
					break;

				case DetalleChequeGiradoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case DetalleChequeGiradoConstantesFunciones.LABEL_NOMBREBANCO:
					sNombreCampoCategoria="nombre_banco";
					break;

				case DetalleChequeGiradoConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoria="id_anio";
					break;

				case DetalleChequeGiradoConstantesFunciones.LABEL_IDMES:
					sNombreCampoCategoria="id_mes";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoDetalleChequeGirado.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case DetalleChequeGiradoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case DetalleChequeGiradoConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case DetalleChequeGiradoConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoriaValor="id_ejercicio";
					break;

				case DetalleChequeGiradoConstantesFunciones.LABEL_IDPERIODO:
					sNombreCampoCategoriaValor="id_periodo";
					break;

				case DetalleChequeGiradoConstantesFunciones.LABEL_IDASIENTOCONTABLE:
					sNombreCampoCategoriaValor="id_asiento_contable";
					break;

				case DetalleChequeGiradoConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoriaValor="id_empleado";
					break;

				case DetalleChequeGiradoConstantesFunciones.LABEL_IDCUENTABANCO:
					sNombreCampoCategoriaValor="id_cuenta_banco";
					break;

				case DetalleChequeGiradoConstantesFunciones.LABEL_NUMEROCHEQUE:
					sNombreCampoCategoriaValor="numero_cheque";
					break;

				case DetalleChequeGiradoConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoriaValor="valor";
					break;

				case DetalleChequeGiradoConstantesFunciones.LABEL_CUENTA:
					sNombreCampoCategoriaValor="cuenta";
					break;

				case DetalleChequeGiradoConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoriaValor="fecha";
					break;

				case DetalleChequeGiradoConstantesFunciones.LABEL_CON:
					sNombreCampoCategoriaValor="con";
					break;

				case DetalleChequeGiradoConstantesFunciones.LABEL_BENEFICIARIO:
					sNombreCampoCategoriaValor="beneficiario";
					break;

				case DetalleChequeGiradoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case DetalleChequeGiradoConstantesFunciones.LABEL_NOMBREBANCO:
					sNombreCampoCategoriaValor="nombre_banco";
					break;

				case DetalleChequeGiradoConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoriaValor="id_anio";
					break;

				case DetalleChequeGiradoConstantesFunciones.LABEL_IDMES:
					sNombreCampoCategoriaValor="id_mes";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoDetalleChequeGirado.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleChequeGirado.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DetalleChequeGiradoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case DetalleChequeGiradoConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case DetalleChequeGiradoConstantesFunciones.LABEL_IDEJERCICIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ejercicio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_ejercicio");
					break;

				case DetalleChequeGiradoConstantesFunciones.LABEL_IDPERIODO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Periodo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_periodo");
					break;

				case DetalleChequeGiradoConstantesFunciones.LABEL_IDASIENTOCONTABLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Asiento Contable",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_asiento_contable");
					break;

				case DetalleChequeGiradoConstantesFunciones.LABEL_IDEMPLEADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empleado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empleado");
					break;

				case DetalleChequeGiradoConstantesFunciones.LABEL_IDCUENTABANCO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cuenta Banco",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cuenta_banco");
					break;

				case DetalleChequeGiradoConstantesFunciones.LABEL_NUMEROCHEQUE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Cheque",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_cheque");
					break;

				case DetalleChequeGiradoConstantesFunciones.LABEL_VALOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor");
					break;

				case DetalleChequeGiradoConstantesFunciones.LABEL_CUENTA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cuenta",sNombreCampoCategoria,sNombreCampoCategoriaValor,"cuenta");
					break;

				case DetalleChequeGiradoConstantesFunciones.LABEL_FECHA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha");
					break;

				case DetalleChequeGiradoConstantesFunciones.LABEL_CON:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Con",sNombreCampoCategoria,sNombreCampoCategoriaValor,"con");
					break;

				case DetalleChequeGiradoConstantesFunciones.LABEL_BENEFICIARIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Beneficiario",sNombreCampoCategoria,sNombreCampoCategoriaValor,"beneficiario");
					break;

				case DetalleChequeGiradoConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case DetalleChequeGiradoConstantesFunciones.LABEL_NOMBREBANCO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Banco",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_banco");
					break;

				case DetalleChequeGiradoConstantesFunciones.LABEL_IDANIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Anio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_anio");
					break;

				case DetalleChequeGiradoConstantesFunciones.LABEL_IDMES:
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
	
	public void jButtonGenerarExcelReporteDinamicoDetalleChequeGiradoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<DetalleChequeGirado> detallechequegiradosSeleccionados=new ArrayList<DetalleChequeGirado>();		
		
		detallechequegiradosSeleccionados=this.getDetalleChequeGiradosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallechequegirado";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("DetalleChequeGirados");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoDetalleChequeGirado.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleChequeGirado.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case DetalleChequeGiradoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleChequeGiradoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(DetalleChequeGirado detallechequegirado:detallechequegiradosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallechequegirado.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleChequeGiradoConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleChequeGiradoConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(DetalleChequeGirado detallechequegirado:detallechequegiradosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallechequegirado.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleChequeGiradoConstantesFunciones.LABEL_IDEJERCICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleChequeGiradoConstantesFunciones.LABEL_IDEJERCICIO);
					iRow++;

					for(DetalleChequeGirado detallechequegirado:detallechequegiradosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallechequegirado.getejercicio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleChequeGiradoConstantesFunciones.LABEL_IDPERIODO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleChequeGiradoConstantesFunciones.LABEL_IDPERIODO);
					iRow++;

					for(DetalleChequeGirado detallechequegirado:detallechequegiradosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallechequegirado.getperiodo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleChequeGiradoConstantesFunciones.LABEL_IDASIENTOCONTABLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleChequeGiradoConstantesFunciones.LABEL_IDASIENTOCONTABLE);
					iRow++;

					for(DetalleChequeGirado detallechequegirado:detallechequegiradosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallechequegirado.getasientocontable_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleChequeGiradoConstantesFunciones.LABEL_IDEMPLEADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleChequeGiradoConstantesFunciones.LABEL_IDEMPLEADO);
					iRow++;

					for(DetalleChequeGirado detallechequegirado:detallechequegiradosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallechequegirado.getempleado_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleChequeGiradoConstantesFunciones.LABEL_IDCUENTABANCO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleChequeGiradoConstantesFunciones.LABEL_IDCUENTABANCO);
					iRow++;

					for(DetalleChequeGirado detallechequegirado:detallechequegiradosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallechequegirado.getcuentabanco_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleChequeGiradoConstantesFunciones.LABEL_NUMEROCHEQUE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleChequeGiradoConstantesFunciones.LABEL_NUMEROCHEQUE);
					iRow++;

					for(DetalleChequeGirado detallechequegirado:detallechequegiradosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallechequegirado.getnumero_cheque());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleChequeGiradoConstantesFunciones.LABEL_VALOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleChequeGiradoConstantesFunciones.LABEL_VALOR);
					iRow++;

					for(DetalleChequeGirado detallechequegirado:detallechequegiradosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallechequegirado.getvalor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleChequeGiradoConstantesFunciones.LABEL_CUENTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleChequeGiradoConstantesFunciones.LABEL_CUENTA);
					iRow++;

					for(DetalleChequeGirado detallechequegirado:detallechequegiradosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallechequegirado.getcuenta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleChequeGiradoConstantesFunciones.LABEL_FECHA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleChequeGiradoConstantesFunciones.LABEL_FECHA);
					iRow++;

					for(DetalleChequeGirado detallechequegirado:detallechequegiradosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallechequegirado.getfecha());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleChequeGiradoConstantesFunciones.LABEL_CON:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleChequeGiradoConstantesFunciones.LABEL_CON);
					iRow++;

					for(DetalleChequeGirado detallechequegirado:detallechequegiradosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallechequegirado.getcon());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleChequeGiradoConstantesFunciones.LABEL_BENEFICIARIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleChequeGiradoConstantesFunciones.LABEL_BENEFICIARIO);
					iRow++;

					for(DetalleChequeGirado detallechequegirado:detallechequegiradosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallechequegirado.getbeneficiario());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleChequeGiradoConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleChequeGiradoConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(DetalleChequeGirado detallechequegirado:detallechequegiradosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallechequegirado.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleChequeGiradoConstantesFunciones.LABEL_NOMBREBANCO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleChequeGiradoConstantesFunciones.LABEL_NOMBREBANCO);
					iRow++;

					for(DetalleChequeGirado detallechequegirado:detallechequegiradosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallechequegirado.getnombre_banco());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleChequeGiradoConstantesFunciones.LABEL_IDANIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleChequeGiradoConstantesFunciones.LABEL_IDANIO);
					iRow++;

					for(DetalleChequeGirado detallechequegirado:detallechequegiradosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallechequegirado.getanio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleChequeGiradoConstantesFunciones.LABEL_IDMES:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleChequeGiradoConstantesFunciones.LABEL_IDMES);
					iRow++;

					for(DetalleChequeGirado detallechequegirado:detallechequegiradosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallechequegirado.getmes_descripcion());
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
			//	this.getFilaCabeceraExportarExcelDetalleChequeGirado(row);				
			//	iRow++;
			//}				
			
			//for(DetalleChequeGirado detallechequegiradoAux:detallechequegiradosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelDetalleChequeGirado(detallechequegiradoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallechequegiradoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Cheque Girado",JOptionPane.INFORMATION_MESSAGE);
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
				this.detallechequegiradoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetalleChequeGirado(false);
			
			//SI ES MANUAL
			if(DetalleChequeGiradoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDetalleChequeGirado();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresDetalleChequeGiradoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetalleChequeGirado(false);
			
			//SI ES MANUAL
			if(DetalleChequeGiradoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDetalleChequeGirado();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesDetalleChequeGiradoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetalleChequeGirado(false);
			
			//SI ES MANUAL
			if(DetalleChequeGiradoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDetalleChequeGirado();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaDetalleChequeGirado() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosDetalleChequeGirado.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosDetalleChequeGirado.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosDetalleChequeGirado.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosDetalleChequeGirado.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosDetalleChequeGirado.setMinimumSize(dimensionMinimum);
		this.jTableDatosDetalleChequeGirado.setMaximumSize(dimensionMaximum);
		this.jTableDatosDetalleChequeGirado.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingDetalleChequeGirado(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingDetalleChequeGirado(esInicializar,true);
	}
	
	public void inicializarActualizarBindingDetalleChequeGirado(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaDetalleChequeGirado(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesDetalleChequeGirado(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.detallechequegiradoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasDetalleChequeGirado(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDetalleChequeGirado(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesDetalleChequeGirado(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !DetalleChequeGiradoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!DetalleChequeGiradoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualDetalleChequeGirado() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaDetalleChequeGirado();
		
		this.inicializarActualizarBindingBotonesManualDetalleChequeGirado(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.detallechequegiradoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualDetalleChequeGirado();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDetalleChequeGirado() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualDetalleChequeGirado(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualDetalleChequeGirado(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosDetalleChequeGirado.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosDetalleChequeGirado.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteDetalleChequeGirado.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormDetalleChequeGirado.jCheckBoxPostAccionNuevoDetalleChequeGirado.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormDetalleChequeGirado.jCheckBoxPostAccionSinCerrarDetalleChequeGirado.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormDetalleChequeGirado.jCheckBoxPostAccionSinMensajeDetalleChequeGirado.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosDetalleChequeGirado.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosDetalleChequeGirado.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteDetalleChequeGirado.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) {
				this.jInternalFrameDetalleFormDetalleChequeGirado.jCheckBoxPostAccionNuevoDetalleChequeGirado.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormDetalleChequeGirado.jCheckBoxPostAccionSinCerrarDetalleChequeGirado.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormDetalleChequeGirado.jCheckBoxPostAccionSinMensajeDetalleChequeGirado.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionDetalleChequeGirado.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionDetalleChequeGirado.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxTiposAccionesFormularioDetalleChequeGirado.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesDetalleChequeGirado.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoDetalleChequeGirado!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetalleChequeGirado.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesDetalleChequeGirado.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesDetalleChequeGirado.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarDetalleChequeGirado.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesDetalleChequeGirado.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoDetalleChequeGirado!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetalleChequeGirado.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesDetalleChequeGirado.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralDetalleChequeGirado.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesDetalleChequeGirado(Boolean esInicializar) throws Exception {
		try	{	
			if(DetalleChequeGiradoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualDetalleChequeGirado(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesDetalleChequeGirado() throws Exception {
		try	{
			if(DetalleChequeGiradoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualDetalleChequeGirado();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDetalleChequeGirado() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxTiposAccionesFormularioDetalleChequeGirado.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxTiposAccionesFormularioDetalleChequeGirado.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualDetalleChequeGirado() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesDetalleChequeGirado.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesDetalleChequeGirado.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesDetalleChequeGirado.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesDetalleChequeGirado.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesDetalleChequeGirado.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesDetalleChequeGirado.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionDetalleChequeGirado.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionDetalleChequeGirado.addItem(reporte);
			}
			
			
			if(!this.detallechequegiradoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionDetalleChequeGirado.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionDetalleChequeGirado.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesDetalleChequeGirado.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesDetalleChequeGirado.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesDetalleChequeGirado.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesDetalleChequeGirado.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxTiposAccionesFormularioDetalleChequeGirado.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxTiposAccionesFormularioDetalleChequeGirado.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarDetalleChequeGirado.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarDetalleChequeGirado.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarDetalleChequeGirado.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDetalleChequeGirado();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDetalleChequeGirado() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDetalleChequeGirado!=null) {
				this.jInternalFrameReporteDinamicoDetalleChequeGirado.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoDetalleChequeGirado.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDetalleChequeGirado!=null) {
				this.jInternalFrameReporteDinamicoDetalleChequeGirado.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoDetalleChequeGirado.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoDetalleChequeGirado!=null) {
				
				if(this.jInternalFrameReporteDinamicoDetalleChequeGirado.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDetalleChequeGirado.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDetalleChequeGirado.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoDetalleChequeGirado.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDetalleChequeGirado.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDetalleChequeGirado.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoDetalleChequeGirado.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoDetalleChequeGirado.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=DetalleChequeGiradoConstantesFunciones.getTiposSeleccionarDetalleChequeGirado(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoDetalleChequeGirado.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoDetalleChequeGirado.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoDetalleChequeGirado.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=DetalleChequeGiradoConstantesFunciones.getTiposSeleccionarDetalleChequeGirado(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoDetalleChequeGirado.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoDetalleChequeGirado.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoDetalleChequeGirado.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=DetalleChequeGiradoConstantesFunciones.getTiposSeleccionarDetalleChequeGirado(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDetalleChequeGirado.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoDetalleChequeGirado.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoDetalleChequeGirado.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoDetalleChequeGirado.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualDetalleChequeGirado()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_asiento_contableFK_IdAsientoContableDetalleChequeGirado.getSelectedItem()!=null){this.id_asiento_contableFK_IdAsientoContable=((AsientoContable)this.jComboBoxid_asiento_contableFK_IdAsientoContableDetalleChequeGirado.getSelectedItem()).getId();}
		if(this.jComboBoxid_cuenta_bancoFK_IdCuentaBancoDetalleChequeGirado.getSelectedItem()!=null){this.id_cuenta_bancoFK_IdCuentaBanco=((CuentaBanco)this.jComboBoxid_cuenta_bancoFK_IdCuentaBancoDetalleChequeGirado.getSelectedItem()).getId();}
		if(this.jComboBoxid_empleadoFK_IdEmpleadoDetalleChequeGirado.getSelectedItem()!=null){this.id_empleadoFK_IdEmpleado=((Empleado)this.jComboBoxid_empleadoFK_IdEmpleadoDetalleChequeGirado.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasDetalleChequeGirado(Boolean esInicializar) throws Exception {				
		if(DetalleChequeGiradoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualDetalleChequeGirado();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaDetalleChequeGirado() throws Exception {
		this.inicializarActualizarBindingTablaDetalleChequeGirado(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByDetalleChequeGirado() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByDetalleChequeGirado.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByDetalleChequeGirado.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDetalleChequeGirado.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new DetalleChequeGiradoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByDetalleChequeGirado.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDetalleChequeGirado.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new DetalleChequeGiradoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosDetalleChequeGiradoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleChequeGiradoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new DetalleChequeGiradoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByDetalleChequeGirado.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDetalleChequeGirado.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new DetalleChequeGiradoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByDetalleChequeGirado.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaDetalleChequeGirado(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=detallechequegiradoLogic.getDetalleChequeGirados().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=detallechequegirados.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(DetalleChequeGiradoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosDetalleChequeGirado.setModel(new DetalleChequeGiradoModel(this.detallechequegiradoLogic.getDetalleChequeGirados(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosDetalleChequeGirado.setModel(new DetalleChequeGiradoModel(this.detallechequegirados,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByDetalleChequeGirado!=null && this.jInternalFrameOrderByDetalleChequeGirado.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByDetalleChequeGirado();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosDetalleChequeGirado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleChequeGirado,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new DetalleChequeGiradoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+DetalleChequeGiradoConstantesFunciones.SCLASSWEBTITULO,detallechequegiradoConstantesFunciones.resaltarSeleccionarDetalleChequeGirado,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+DetalleChequeGiradoConstantesFunciones.SCLASSWEBTITULO,detallechequegiradoConstantesFunciones.resaltarSeleccionarDetalleChequeGirado,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosDetalleChequeGirado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleChequeGirado,DetalleChequeGiradoConstantesFunciones.LABEL_ID));

		if(this.detallechequegiradoConstantesFunciones.mostraridDetalleChequeGirado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleChequeGiradoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detallechequegiradoConstantesFunciones.resaltaridDetalleChequeGirado,this.detallechequegiradoConstantesFunciones.activaridDetalleChequeGirado,iSizeTabla,this,true,"idDetalleChequeGirado","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detallechequegiradoConstantesFunciones.resaltaridDetalleChequeGirado,this.detallechequegiradoConstantesFunciones.activaridDetalleChequeGirado,this,true,"idDetalleChequeGirado","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleChequeGirado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleChequeGirado,DetalleChequeGiradoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.detallechequegiradoConstantesFunciones.mostrarid_empresaDetalleChequeGirado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleChequeGiradoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.detallechequegiradoConstantesFunciones.resaltarid_empresaDetalleChequeGirado,this,this.detallechequegiradoConstantesFunciones.activarid_empresaDetalleChequeGirado,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.detallechequegiradoConstantesFunciones.resaltarid_empresaDetalleChequeGirado,this,this.detallechequegiradoConstantesFunciones.activarid_empresaDetalleChequeGirado,false,"id_empresaDetalleChequeGirado","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleChequeGiradoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleChequeGirado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleChequeGirado,DetalleChequeGiradoConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.detallechequegiradoConstantesFunciones.mostrarid_sucursalDetalleChequeGirado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleChequeGiradoConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.detallechequegiradoConstantesFunciones.resaltarid_sucursalDetalleChequeGirado,this,this.detallechequegiradoConstantesFunciones.activarid_sucursalDetalleChequeGirado,iSizeTabla));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.detallechequegiradoConstantesFunciones.resaltarid_sucursalDetalleChequeGirado,this,this.detallechequegiradoConstantesFunciones.activarid_sucursalDetalleChequeGirado,false,"id_sucursalDetalleChequeGirado","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleChequeGiradoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleChequeGirado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleChequeGirado,DetalleChequeGiradoConstantesFunciones.LABEL_IDEJERCICIO));

		if(this.detallechequegiradoConstantesFunciones.mostrarid_ejercicioDetalleChequeGirado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleChequeGiradoConstantesFunciones.LABEL_IDEJERCICIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EjercicioTableCell(this.ejerciciosForeignKey,this.detallechequegiradoConstantesFunciones.resaltarid_ejercicioDetalleChequeGirado,this,this.detallechequegiradoConstantesFunciones.activarid_ejercicioDetalleChequeGirado,iSizeTabla));
			tableColumn.setCellEditor(new EjercicioTableCell(this.ejerciciosForeignKey,this.detallechequegiradoConstantesFunciones.resaltarid_ejercicioDetalleChequeGirado,this,this.detallechequegiradoConstantesFunciones.activarid_ejercicioDetalleChequeGirado,false,"id_ejercicioDetalleChequeGirado","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleChequeGiradoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleChequeGirado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleChequeGirado,DetalleChequeGiradoConstantesFunciones.LABEL_IDPERIODO));

		if(this.detallechequegiradoConstantesFunciones.mostrarid_periodoDetalleChequeGirado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleChequeGiradoConstantesFunciones.LABEL_IDPERIODO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new PeriodoTableCell(this.periodosForeignKey,this.detallechequegiradoConstantesFunciones.resaltarid_periodoDetalleChequeGirado,this,this.detallechequegiradoConstantesFunciones.activarid_periodoDetalleChequeGirado,iSizeTabla));
			tableColumn.setCellEditor(new PeriodoTableCell(this.periodosForeignKey,this.detallechequegiradoConstantesFunciones.resaltarid_periodoDetalleChequeGirado,this,this.detallechequegiradoConstantesFunciones.activarid_periodoDetalleChequeGirado,false,"id_periodoDetalleChequeGirado","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleChequeGiradoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleChequeGirado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleChequeGirado,DetalleChequeGiradoConstantesFunciones.LABEL_IDASIENTOCONTABLE));

		if(this.detallechequegiradoConstantesFunciones.mostrarid_asiento_contableDetalleChequeGirado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleChequeGiradoConstantesFunciones.LABEL_IDASIENTOCONTABLE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new AsientoContableTableCell(this.asientocontablesForeignKey,this.detallechequegiradoConstantesFunciones.resaltarid_asiento_contableDetalleChequeGirado,this,this.detallechequegiradoConstantesFunciones.activarid_asiento_contableDetalleChequeGirado,iSizeTabla));
			tableColumn.setCellEditor(new AsientoContableTableCell(this.asientocontablesForeignKey,this.detallechequegiradoConstantesFunciones.resaltarid_asiento_contableDetalleChequeGirado,this,this.detallechequegiradoConstantesFunciones.activarid_asiento_contableDetalleChequeGirado,true,"id_asiento_contableDetalleChequeGirado","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleChequeGiradoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleChequeGirado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleChequeGirado,DetalleChequeGiradoConstantesFunciones.LABEL_IDEMPLEADO));

		if(this.detallechequegiradoConstantesFunciones.mostrarid_empleadoDetalleChequeGirado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleChequeGiradoConstantesFunciones.LABEL_IDEMPLEADO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EmpleadoTableCell(this.empleadosForeignKey,this.detallechequegiradoConstantesFunciones.resaltarid_empleadoDetalleChequeGirado,this,this.detallechequegiradoConstantesFunciones.activarid_empleadoDetalleChequeGirado,iSizeTabla));
			tableColumn.setCellEditor(new EmpleadoTableCell(this.empleadosForeignKey,this.detallechequegiradoConstantesFunciones.resaltarid_empleadoDetalleChequeGirado,this,this.detallechequegiradoConstantesFunciones.activarid_empleadoDetalleChequeGirado,true,"id_empleadoDetalleChequeGirado","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new DetalleChequeGiradoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleChequeGirado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleChequeGirado,DetalleChequeGiradoConstantesFunciones.LABEL_IDCUENTABANCO));

		if(this.detallechequegiradoConstantesFunciones.mostrarid_cuenta_bancoDetalleChequeGirado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleChequeGiradoConstantesFunciones.LABEL_IDCUENTABANCO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CuentaBancoTableCell(this.cuentabancosForeignKey,this.detallechequegiradoConstantesFunciones.resaltarid_cuenta_bancoDetalleChequeGirado,this,this.detallechequegiradoConstantesFunciones.activarid_cuenta_bancoDetalleChequeGirado,iSizeTabla));
			tableColumn.setCellEditor(new CuentaBancoTableCell(this.cuentabancosForeignKey,this.detallechequegiradoConstantesFunciones.resaltarid_cuenta_bancoDetalleChequeGirado,this,this.detallechequegiradoConstantesFunciones.activarid_cuenta_bancoDetalleChequeGirado,true,"id_cuenta_bancoDetalleChequeGirado","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleChequeGiradoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleChequeGirado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleChequeGirado,DetalleChequeGiradoConstantesFunciones.LABEL_NUMEROCHEQUE));

		if(this.detallechequegiradoConstantesFunciones.mostrarnumero_chequeDetalleChequeGirado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleChequeGiradoConstantesFunciones.LABEL_NUMEROCHEQUE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.detallechequegiradoConstantesFunciones.resaltarnumero_chequeDetalleChequeGirado,this.detallechequegiradoConstantesFunciones.activarnumero_chequeDetalleChequeGirado,iSizeTabla,this,true,"numero_chequeDetalleChequeGirado","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detallechequegiradoConstantesFunciones.resaltarnumero_chequeDetalleChequeGirado,this.detallechequegiradoConstantesFunciones.activarnumero_chequeDetalleChequeGirado,this,true,"numero_chequeDetalleChequeGirado","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleChequeGiradoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleChequeGirado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleChequeGirado,DetalleChequeGiradoConstantesFunciones.LABEL_VALOR));

		if(this.detallechequegiradoConstantesFunciones.mostrarvalorDetalleChequeGirado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleChequeGiradoConstantesFunciones.LABEL_VALOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detallechequegiradoConstantesFunciones.resaltarvalorDetalleChequeGirado,this.detallechequegiradoConstantesFunciones.activarvalorDetalleChequeGirado,iSizeTabla,this,true,"valorDetalleChequeGirado","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detallechequegiradoConstantesFunciones.resaltarvalorDetalleChequeGirado,this.detallechequegiradoConstantesFunciones.activarvalorDetalleChequeGirado,this,true,"valorDetalleChequeGirado","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetalleChequeGiradoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleChequeGirado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleChequeGirado,DetalleChequeGiradoConstantesFunciones.LABEL_CUENTA));

		if(this.detallechequegiradoConstantesFunciones.mostrarcuentaDetalleChequeGirado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleChequeGiradoConstantesFunciones.LABEL_CUENTA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.detallechequegiradoConstantesFunciones.resaltarcuentaDetalleChequeGirado,this.detallechequegiradoConstantesFunciones.activarcuentaDetalleChequeGirado,iSizeTabla,this,true,"cuentaDetalleChequeGirado","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detallechequegiradoConstantesFunciones.resaltarcuentaDetalleChequeGirado,this.detallechequegiradoConstantesFunciones.activarcuentaDetalleChequeGirado,this,true,"cuentaDetalleChequeGirado","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleChequeGiradoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleChequeGirado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleChequeGirado,DetalleChequeGiradoConstantesFunciones.LABEL_FECHA));

		if(this.detallechequegiradoConstantesFunciones.mostrarfechaDetalleChequeGirado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleChequeGiradoConstantesFunciones.LABEL_FECHA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.detallechequegiradoConstantesFunciones.resaltarfechaDetalleChequeGirado,this.detallechequegiradoConstantesFunciones.activarfechaDetalleChequeGirado,iSizeTabla,this,true,"fechaDetalleChequeGirado","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.detallechequegiradoConstantesFunciones.resaltarfechaDetalleChequeGirado,this.detallechequegiradoConstantesFunciones.activarfechaDetalleChequeGirado,this,true,"fechaDetalleChequeGirado","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new DetalleChequeGiradoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleChequeGirado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleChequeGirado,DetalleChequeGiradoConstantesFunciones.LABEL_CON));

		if(this.detallechequegiradoConstantesFunciones.mostrarconDetalleChequeGirado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleChequeGiradoConstantesFunciones.LABEL_CON,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.detallechequegiradoConstantesFunciones.resaltarconDetalleChequeGirado,this.detallechequegiradoConstantesFunciones.activarconDetalleChequeGirado,iSizeTabla));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.detallechequegiradoConstantesFunciones.resaltarconDetalleChequeGirado,this.detallechequegiradoConstantesFunciones.activarconDetalleChequeGirado,this,true,"conDetalleChequeGirado","BASICO"));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
			//tableColumn.addPropertyChangeListener(new DetalleChequeGiradoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleChequeGirado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleChequeGirado,DetalleChequeGiradoConstantesFunciones.LABEL_BENEFICIARIO));

		if(this.detallechequegiradoConstantesFunciones.mostrarbeneficiarioDetalleChequeGirado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleChequeGiradoConstantesFunciones.LABEL_BENEFICIARIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.detallechequegiradoConstantesFunciones.resaltarbeneficiarioDetalleChequeGirado,this.detallechequegiradoConstantesFunciones.activarbeneficiarioDetalleChequeGirado,iSizeTabla,this,true,"beneficiarioDetalleChequeGirado","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detallechequegiradoConstantesFunciones.resaltarbeneficiarioDetalleChequeGirado,this.detallechequegiradoConstantesFunciones.activarbeneficiarioDetalleChequeGirado,this,true,"beneficiarioDetalleChequeGirado","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleChequeGiradoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleChequeGirado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleChequeGirado,DetalleChequeGiradoConstantesFunciones.LABEL_CODIGO));

		if(this.detallechequegiradoConstantesFunciones.mostrarcodigoDetalleChequeGirado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleChequeGiradoConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.detallechequegiradoConstantesFunciones.resaltarcodigoDetalleChequeGirado,this.detallechequegiradoConstantesFunciones.activarcodigoDetalleChequeGirado,iSizeTabla,this,true,"codigoDetalleChequeGirado","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detallechequegiradoConstantesFunciones.resaltarcodigoDetalleChequeGirado,this.detallechequegiradoConstantesFunciones.activarcodigoDetalleChequeGirado,this,true,"codigoDetalleChequeGirado","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleChequeGiradoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleChequeGirado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleChequeGirado,DetalleChequeGiradoConstantesFunciones.LABEL_NOMBREBANCO));

		if(this.detallechequegiradoConstantesFunciones.mostrarnombre_bancoDetalleChequeGirado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleChequeGiradoConstantesFunciones.LABEL_NOMBREBANCO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.detallechequegiradoConstantesFunciones.resaltarnombre_bancoDetalleChequeGirado,this.detallechequegiradoConstantesFunciones.activarnombre_bancoDetalleChequeGirado,iSizeTabla,this,true,"nombre_bancoDetalleChequeGirado","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detallechequegiradoConstantesFunciones.resaltarnombre_bancoDetalleChequeGirado,this.detallechequegiradoConstantesFunciones.activarnombre_bancoDetalleChequeGirado,this,true,"nombre_bancoDetalleChequeGirado","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleChequeGiradoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleChequeGirado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleChequeGirado,DetalleChequeGiradoConstantesFunciones.LABEL_IDANIO));

		if(this.detallechequegiradoConstantesFunciones.mostrarid_anioDetalleChequeGirado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleChequeGiradoConstantesFunciones.LABEL_IDANIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new AnioTableCell(this.aniosForeignKey,this.detallechequegiradoConstantesFunciones.resaltarid_anioDetalleChequeGirado,this,this.detallechequegiradoConstantesFunciones.activarid_anioDetalleChequeGirado,iSizeTabla));
			tableColumn.setCellEditor(new AnioTableCell(this.aniosForeignKey,this.detallechequegiradoConstantesFunciones.resaltarid_anioDetalleChequeGirado,this,this.detallechequegiradoConstantesFunciones.activarid_anioDetalleChequeGirado,true,"id_anioDetalleChequeGirado","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleChequeGiradoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleChequeGirado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleChequeGirado,DetalleChequeGiradoConstantesFunciones.LABEL_IDMES));

		if(this.detallechequegiradoConstantesFunciones.mostrarid_mesDetalleChequeGirado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleChequeGiradoConstantesFunciones.LABEL_IDMES,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new MesTableCell(this.messForeignKey,this.detallechequegiradoConstantesFunciones.resaltarid_mesDetalleChequeGirado,this,this.detallechequegiradoConstantesFunciones.activarid_mesDetalleChequeGirado,iSizeTabla));
			tableColumn.setCellEditor(new MesTableCell(this.messForeignKey,this.detallechequegiradoConstantesFunciones.resaltarid_mesDetalleChequeGirado,this,this.detallechequegiradoConstantesFunciones.activarid_mesDetalleChequeGirado,true,"id_mesDetalleChequeGirado","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleChequeGiradoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.detallechequegiradoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.detallechequegiradoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.detallechequegiradoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDetalleChequeGirado.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.detallechequegiradoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.detallechequegiradoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDetalleChequeGirado.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarDetalleChequeGirado && this.isPermisoGuardarCambiosDetalleChequeGirado) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.detallechequegiradoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.detallechequegiradoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosDetalleChequeGirado.addColumn(tableColumn);
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
			
			this.jTableDatosDetalleChequeGirado.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDetalleChequeGirado && this.isPermisoGuardarCambiosDetalleChequeGirado) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDetalleChequeGirado && this.isPermisoGuardarCambiosDetalleChequeGirado) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosDetalleChequeGirado.moveColumn(this.jTableDatosDetalleChequeGirado.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosDetalleChequeGirado.moveColumn(this.jTableDatosDetalleChequeGirado.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosDetalleChequeGirado.moveColumn(this.jTableDatosDetalleChequeGirado.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosDetalleChequeGirado.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosDetalleChequeGirado.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosDetalleChequeGirado,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!DetalleChequeGiradoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosDetalleChequeGirado.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosDetalleChequeGirado.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!DetalleChequeGiradoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!DetalleChequeGiradoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosDetalleChequeGirado.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosDetalleChequeGirado.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosDetalleChequeGirado.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=detallechequegiradoLogic.getDetalleChequeGirados().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=detallechequegirados.size()-1;
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
		//this.jTableDatosDetalleChequeGirado.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosDetalleChequeGirado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosDetalleChequeGirado();
			
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
				
				//this.isEsNuevoDetalleChequeGirado=false;
					
				DetalleChequeGiradoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.detallechequegirado,new Object(),this.detallechequegiradoParameterGeneral,this.detallechequegiradoReturnGeneral);
			
				if(this.detallechequegiradoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormDetalleChequeGirado==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDetalleChequeGirado.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDetalleChequeGirado.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegirado =(DetalleChequeGirado) this.detallechequegiradoLogic.getDetalleChequeGirados().toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallechequegirado =(DetalleChequeGirado) this.detallechequegirados.toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.detallechequegirado.getsType().equals("DUPLICADO")
				   || this.detallechequegirado.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoDetalleChequeGirado=true;
				
				} else {
					this.isEsNuevoDetalleChequeGirado=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.detallechequegiradoSessionBean.getEsGuardarRelacionado()) {
					if(this.detallechequegirado.getId()>=0 && !this.detallechequegirado.getIsNew()) {						
						this.isEsNuevoDetalleChequeGirado=false;
						
					} else {
						this.isEsNuevoDetalleChequeGirado=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoDetalleChequeGirado(esRelaciones);						
				
				this.seleccionarDetalleChequeGirado(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.detallechequegirado.getId()<0) {
					this.isEsNuevoDetalleChequeGirado=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarDetalleChequeGirado(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarDetalleChequeGirado(evt,rowIndex);
				}	
				
				if(this.detallechequegiradoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion DetalleChequeGirado: " + this.dDif); 
					}
				}								
				
				DetalleChequeGiradoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.detallechequegirado,new Object(),this.detallechequegiradoParameterGeneral,this.detallechequegiradoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarDetalleChequeGirado(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.detallechequegirado)) {
					if(this.detallechequegirado.getId()>0) {
						this.detallechequegirado.setIsDeleted(true);
						
						this.detallechequegiradosEliminados.add(this.detallechequegirado);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.detallechequegiradoLogic.getDetalleChequeGirados().remove(this.detallechequegirado);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.detallechequegirados.remove(this.detallechequegirado);				
					}
					
					
					((DetalleChequeGiradoModel) this.jTableDatosDetalleChequeGirado.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaDetalleChequeGirado(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarDetalleChequeGirado(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoDetalleChequeGirado) {
			
			if(this.jInternalFrameDetalleFormDetalleChequeGirado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDetalleChequeGirado.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDetalleChequeGirado.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegirado =(DetalleChequeGirado) this.detallechequegiradoLogic.getDetalleChequeGirados().toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallechequegirado =(DetalleChequeGirado) this.detallechequegirados.toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(DetalleChequeGiradoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioDetalleChequeGirado(this.detallechequegirado);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.detallechequegiradoConstantesFunciones.cargarid_empresaDetalleChequeGirado || this.detallechequegiradoConstantesFunciones.event_dependid_empresaDetalleChequeGirado) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.detallechequegirado.getid_empresa());
									//this.inicializarActualizarBindingDetalleChequeGirado(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(detallechequegirado.getEmpresa()!=null) {
							this.empresasForeignKey.add(detallechequegirado.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.detallechequegirado.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.detallechequegiradoConstantesFunciones.cargarid_sucursalDetalleChequeGirado || this.detallechequegiradoConstantesFunciones.event_dependid_sucursalDetalleChequeGirado) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.detallechequegirado.getid_sucursal());
									//this.inicializarActualizarBindingDetalleChequeGirado(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(detallechequegirado.getSucursal()!=null) {
							this.sucursalsForeignKey.add(detallechequegirado.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.detallechequegirado.getid_sucursal(),false,"Formulario");

					//Ejercicio
					if(!this.detallechequegiradoConstantesFunciones.cargarid_ejercicioDetalleChequeGirado || this.detallechequegiradoConstantesFunciones.event_dependid_ejercicioDetalleChequeGirado) {
						//this.cargarCombosEjerciciosForeignKeyLista(" where id="+this.detallechequegirado.getid_ejercicio());
									//this.inicializarActualizarBindingDetalleChequeGirado(false,false);
						this.ejerciciosForeignKey=new ArrayList<Ejercicio>();

						if(detallechequegirado.getEjercicio()!=null) {
							this.ejerciciosForeignKey.add(detallechequegirado.getEjercicio());
						}

						this.addItemDefectoCombosForeignKeyEjercicio();
						this.cargarCombosFrameEjerciciosForeignKey("Todos");
					}
					this.setActualEjercicioForeignKey(this.detallechequegirado.getid_ejercicio(),false,"Formulario");

					//Periodo
					if(!this.detallechequegiradoConstantesFunciones.cargarid_periodoDetalleChequeGirado || this.detallechequegiradoConstantesFunciones.event_dependid_periodoDetalleChequeGirado) {
						//this.cargarCombosPeriodosForeignKeyLista(" where id="+this.detallechequegirado.getid_periodo());
									//this.inicializarActualizarBindingDetalleChequeGirado(false,false);
						this.periodosForeignKey=new ArrayList<Periodo>();

						if(detallechequegirado.getPeriodo()!=null) {
							this.periodosForeignKey.add(detallechequegirado.getPeriodo());
						}

						this.addItemDefectoCombosForeignKeyPeriodo();
						this.cargarCombosFramePeriodosForeignKey("Todos");
					}
					this.setActualPeriodoForeignKey(this.detallechequegirado.getid_periodo(),false,"Formulario");

					//AsientoContable
					if(!this.detallechequegiradoConstantesFunciones.cargarid_asiento_contableDetalleChequeGirado || this.detallechequegiradoConstantesFunciones.event_dependid_asiento_contableDetalleChequeGirado) {
						//this.cargarCombosAsientoContablesForeignKeyLista(" where id="+this.detallechequegirado.getid_asiento_contable());
									//this.inicializarActualizarBindingDetalleChequeGirado(false,false);
						this.asientocontablesForeignKey=new ArrayList<AsientoContable>();

						if(detallechequegirado.getAsientoContable()!=null) {
							this.asientocontablesForeignKey.add(detallechequegirado.getAsientoContable());
						}

						this.addItemDefectoCombosForeignKeyAsientoContable();
						this.cargarCombosFrameAsientoContablesForeignKey("Todos");
					}
					this.setActualAsientoContableForeignKey(this.detallechequegirado.getid_asiento_contable(),false,"Formulario");

					//Empleado
					if(!this.detallechequegiradoConstantesFunciones.cargarid_empleadoDetalleChequeGirado || this.detallechequegiradoConstantesFunciones.event_dependid_empleadoDetalleChequeGirado) {
						//this.cargarCombosEmpleadosForeignKeyLista(" where id="+this.detallechequegirado.getid_empleado());
									//this.inicializarActualizarBindingDetalleChequeGirado(false,false);
						this.empleadosForeignKey=new ArrayList<Empleado>();

						if(detallechequegirado.getEmpleado()!=null) {
							this.empleadosForeignKey.add(detallechequegirado.getEmpleado());
						}

						this.addItemDefectoCombosForeignKeyEmpleado();
						this.cargarCombosFrameEmpleadosForeignKey("Todos");
					}
					this.setActualEmpleadoForeignKey(this.detallechequegirado.getid_empleado(),false,"Formulario");

					//CuentaBanco
					if(!this.detallechequegiradoConstantesFunciones.cargarid_cuenta_bancoDetalleChequeGirado || this.detallechequegiradoConstantesFunciones.event_dependid_cuenta_bancoDetalleChequeGirado) {
						//this.cargarCombosCuentaBancosForeignKeyLista(" where id="+this.detallechequegirado.getid_cuenta_banco());
									//this.inicializarActualizarBindingDetalleChequeGirado(false,false);
						this.cuentabancosForeignKey=new ArrayList<CuentaBanco>();

						if(detallechequegirado.getCuentaBanco()!=null) {
							this.cuentabancosForeignKey.add(detallechequegirado.getCuentaBanco());
						}

						this.addItemDefectoCombosForeignKeyCuentaBanco();
						this.cargarCombosFrameCuentaBancosForeignKey("Todos");
					}
					this.setActualCuentaBancoForeignKey(this.detallechequegirado.getid_cuenta_banco(),false,"Formulario");

					//Anio
					if(!this.detallechequegiradoConstantesFunciones.cargarid_anioDetalleChequeGirado || this.detallechequegiradoConstantesFunciones.event_dependid_anioDetalleChequeGirado) {
						//this.cargarCombosAniosForeignKeyLista(" where id="+this.detallechequegirado.getid_anio());
									//this.inicializarActualizarBindingDetalleChequeGirado(false,false);
						this.aniosForeignKey=new ArrayList<Anio>();

						if(detallechequegirado.getAnio()!=null) {
							this.aniosForeignKey.add(detallechequegirado.getAnio());
						}

						this.addItemDefectoCombosForeignKeyAnio();
						this.cargarCombosFrameAniosForeignKey("Todos");
					}
					this.setActualAnioForeignKey(this.detallechequegirado.getid_anio(),false,"Formulario");

					//Mes
					if(!this.detallechequegiradoConstantesFunciones.cargarid_mesDetalleChequeGirado || this.detallechequegiradoConstantesFunciones.event_dependid_mesDetalleChequeGirado) {
						//this.cargarCombosMessForeignKeyLista(" where id="+this.detallechequegirado.getid_mes());
									//this.inicializarActualizarBindingDetalleChequeGirado(false,false);
						this.messForeignKey=new ArrayList<Mes>();

						if(detallechequegirado.getMes()!=null) {
							this.messForeignKey.add(detallechequegirado.getMes());
						}

						this.addItemDefectoCombosForeignKeyMes();
						this.cargarCombosFrameMessForeignKey("Todos");
					}
					this.setActualMesForeignKey(this.detallechequegirado.getid_mes(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesDetalleChequeGirado("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesDetalleChequeGirado(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDetalleChequeGirado() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoDetalleChequeGirado(DetalleChequeGirado detallechequegirado) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoDetalleChequeGirado(detallechequegirado,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoDetalleChequeGirado(DetalleChequeGirado detallechequegirado,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioDetalleChequeGirado(detallechequegirado);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyDetalleChequeGirado(detallechequegirado,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyDetalleChequeGirado(detallechequegirado);
	}
	
	public void setVariablesObjetoActualToFormularioDetalleChequeGirado(DetalleChequeGirado detallechequegirado) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormDetalleChequeGirado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormDetalleChequeGirado.jLabelidDetalleChequeGirado.setText(detallechequegirado.getId().toString());
			this.jInternalFrameDetalleFormDetalleChequeGirado.jTextFieldnumero_chequeDetalleChequeGirado.setText(detallechequegirado.getnumero_cheque());
			this.jInternalFrameDetalleFormDetalleChequeGirado.jTextFieldvalorDetalleChequeGirado.setText(detallechequegirado.getvalor().toString());
			this.jInternalFrameDetalleFormDetalleChequeGirado.jTextFieldcuentaDetalleChequeGirado.setText(detallechequegirado.getcuenta());
			this.jInternalFrameDetalleFormDetalleChequeGirado.jDateChooserfechaDetalleChequeGirado.setDate(detallechequegirado.getfecha());
			this.jInternalFrameDetalleFormDetalleChequeGirado.jCheckBoxconDetalleChequeGirado.setSelected(detallechequegirado.getcon());
			this.jInternalFrameDetalleFormDetalleChequeGirado.jTextAreabeneficiarioDetalleChequeGirado.setText(detallechequegirado.getbeneficiario());
			this.jInternalFrameDetalleFormDetalleChequeGirado.jTextFieldcodigoDetalleChequeGirado.setText(detallechequegirado.getcodigo());
			this.jInternalFrameDetalleFormDetalleChequeGirado.jTextAreanombre_bancoDetalleChequeGirado.setText(detallechequegirado.getnombre_banco());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,DetalleChequeGirado detallechequegiradoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,detallechequegiradoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,DetalleChequeGirado detallechequegiradoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				detallechequegiradoLocal=this.detallechequegirado;
			} else {
				detallechequegiradoLocal=this.detallechequegiradoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(detallechequegiradoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoDetalleChequeGirado(detallechequegiradoLocal,true);
					
					if(detallechequegiradoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(detallechequegiradoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.detallechequegiradoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(detallechequegiradoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoDetalleChequeGirado(DetalleChequeGirado detallechequegirado,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDetalleChequeGirado(detallechequegirado,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysDetalleChequeGirado(detallechequegirado);
	}
	
	public void setVariablesFormularioToObjetoActualDetalleChequeGirado(DetalleChequeGirado detallechequegirado,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDetalleChequeGirado(detallechequegirado,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualDetalleChequeGirado(DetalleChequeGirado detallechequegirado,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormDetalleChequeGirado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormDetalleChequeGirado.jLabelidDetalleChequeGirado.getText()==null || this.jInternalFrameDetalleFormDetalleChequeGirado.jLabelidDetalleChequeGirado.getText()=="" || this.jInternalFrameDetalleFormDetalleChequeGirado.jLabelidDetalleChequeGirado.getText()=="Id") {
				this.jInternalFrameDetalleFormDetalleChequeGirado.jLabelidDetalleChequeGirado.setText("0");
			}

			if(conColumnasBase) {detallechequegirado.setId(Long.parseLong(this.jInternalFrameDetalleFormDetalleChequeGirado.jLabelidDetalleChequeGirado.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleChequeGiradoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleChequeGirado.jLabelIdDetalleChequeGirado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detallechequegirado.setnumero_cheque(this.jInternalFrameDetalleFormDetalleChequeGirado.jTextFieldnumero_chequeDetalleChequeGirado.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleChequeGiradoConstantesFunciones.LABEL_NUMEROCHEQUE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleChequeGirado.jLabelnumero_chequeDetalleChequeGirado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detallechequegirado.setvalor(Double.parseDouble(this.jInternalFrameDetalleFormDetalleChequeGirado.jTextFieldvalorDetalleChequeGirado.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleChequeGiradoConstantesFunciones.LABEL_VALOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleChequeGirado.jLabelvalorDetalleChequeGirado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detallechequegirado.setcuenta(this.jInternalFrameDetalleFormDetalleChequeGirado.jTextFieldcuentaDetalleChequeGirado.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleChequeGiradoConstantesFunciones.LABEL_CUENTA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleChequeGirado.jLabelcuentaDetalleChequeGirado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detallechequegirado.setfecha(this.jInternalFrameDetalleFormDetalleChequeGirado.jDateChooserfechaDetalleChequeGirado.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleChequeGiradoConstantesFunciones.LABEL_FECHA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleChequeGirado.jLabelfechaDetalleChequeGirado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detallechequegirado.setcon(this.jInternalFrameDetalleFormDetalleChequeGirado.jCheckBoxconDetalleChequeGirado.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleChequeGiradoConstantesFunciones.LABEL_CON+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleChequeGirado.jLabelconDetalleChequeGirado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detallechequegirado.setbeneficiario(this.jInternalFrameDetalleFormDetalleChequeGirado.jTextAreabeneficiarioDetalleChequeGirado.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleChequeGiradoConstantesFunciones.LABEL_BENEFICIARIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleChequeGirado.jLabelbeneficiarioDetalleChequeGirado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detallechequegirado.setcodigo(this.jInternalFrameDetalleFormDetalleChequeGirado.jTextFieldcodigoDetalleChequeGirado.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleChequeGiradoConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleChequeGirado.jLabelcodigoDetalleChequeGirado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detallechequegirado.setnombre_banco(this.jInternalFrameDetalleFormDetalleChequeGirado.jTextAreanombre_bancoDetalleChequeGirado.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleChequeGiradoConstantesFunciones.LABEL_NOMBREBANCO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleChequeGirado.jLabelnombre_bancoDetalleChequeGirado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDetalleChequeGirado(DetalleChequeGirado detallechequegiradoBean,DetalleChequeGirado detallechequegirado,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosDetalleChequeGirado(DetalleChequeGirado detallechequegiradoOrigen,DetalleChequeGirado detallechequegirado,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && detallechequegiradoOrigen.getId()!=null && !detallechequegiradoOrigen.getId().equals(0L))) {detallechequegirado.setId(detallechequegiradoOrigen.getId());}}
			if(conDefault || (!conDefault && detallechequegiradoOrigen.getnumero_cheque()!=null && !detallechequegiradoOrigen.getnumero_cheque().equals(""))) {detallechequegirado.setnumero_cheque(detallechequegiradoOrigen.getnumero_cheque());}
			if(conDefault || (!conDefault && detallechequegiradoOrigen.getvalor()!=null && !detallechequegiradoOrigen.getvalor().equals(0.0))) {detallechequegirado.setvalor(detallechequegiradoOrigen.getvalor());}
			if(conDefault || (!conDefault && detallechequegiradoOrigen.getcuenta()!=null && !detallechequegiradoOrigen.getcuenta().equals(""))) {detallechequegirado.setcuenta(detallechequegiradoOrigen.getcuenta());}
			if(conDefault || (!conDefault && detallechequegiradoOrigen.getfecha()!=null && !detallechequegiradoOrigen.getfecha().equals(new Date()))) {detallechequegirado.setfecha(detallechequegiradoOrigen.getfecha());}
			if(conDefault || (!conDefault && detallechequegiradoOrigen.getcon()!=null && !detallechequegiradoOrigen.getcon().equals(false))) {detallechequegirado.setcon(detallechequegiradoOrigen.getcon());}
			if(conDefault || (!conDefault && detallechequegiradoOrigen.getbeneficiario()!=null && !detallechequegiradoOrigen.getbeneficiario().equals(""))) {detallechequegirado.setbeneficiario(detallechequegiradoOrigen.getbeneficiario());}
			if(conDefault || (!conDefault && detallechequegiradoOrigen.getcodigo()!=null && !detallechequegiradoOrigen.getcodigo().equals(""))) {detallechequegirado.setcodigo(detallechequegiradoOrigen.getcodigo());}
			if(conDefault || (!conDefault && detallechequegiradoOrigen.getnombre_banco()!=null && !detallechequegiradoOrigen.getnombre_banco().equals(""))) {detallechequegirado.setnombre_banco(detallechequegiradoOrigen.getnombre_banco());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDetalleChequeGirado(DetalleChequeGirado detallechequegirado) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDetalleChequeGirado.jLabelidDetalleChequeGirado.setText(detallechequegirado.getId().toString());
			this.jInternalFrameDetalleFormDetalleChequeGirado.jTextFieldnumero_chequeDetalleChequeGirado.setText(detallechequegirado.getnumero_cheque());
			this.jInternalFrameDetalleFormDetalleChequeGirado.jTextFieldvalorDetalleChequeGirado.setText(detallechequegirado.getvalor().toString());
			this.jInternalFrameDetalleFormDetalleChequeGirado.jTextFieldcuentaDetalleChequeGirado.setText(detallechequegirado.getcuenta());
			this.jInternalFrameDetalleFormDetalleChequeGirado.jDateChooserfechaDetalleChequeGirado.setDate(detallechequegirado.getfecha());
			this.jInternalFrameDetalleFormDetalleChequeGirado.jCheckBoxconDetalleChequeGirado.setSelected(detallechequegirado.getcon());
			this.jInternalFrameDetalleFormDetalleChequeGirado.jTextAreabeneficiarioDetalleChequeGirado.setText(detallechequegirado.getbeneficiario());
			this.jInternalFrameDetalleFormDetalleChequeGirado.jTextFieldcodigoDetalleChequeGirado.setText(detallechequegirado.getcodigo());
			this.jInternalFrameDetalleFormDetalleChequeGirado.jTextAreanombre_bancoDetalleChequeGirado.setText(detallechequegirado.getnombre_banco());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDetalleChequeGirado(DetalleChequeGiradoBean detallechequegiradoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDetalleChequeGirado.jLabelidDetalleChequeGirado.setText(detallechequegiradoBean.getId().toString());
			this.jInternalFrameDetalleFormDetalleChequeGirado.jTextFieldnumero_chequeDetalleChequeGirado.setText(detallechequegiradoBean.getnumero_cheque());
			this.jInternalFrameDetalleFormDetalleChequeGirado.jTextFieldvalorDetalleChequeGirado.setText(detallechequegiradoBean.getvalor().toString());
			this.jInternalFrameDetalleFormDetalleChequeGirado.jTextFieldcuentaDetalleChequeGirado.setText(detallechequegiradoBean.getcuenta());
			this.jInternalFrameDetalleFormDetalleChequeGirado.jDateChooserfechaDetalleChequeGirado.setDate(detallechequegiradoBean.getfecha());
			this.jInternalFrameDetalleFormDetalleChequeGirado.jCheckBoxconDetalleChequeGirado.setSelected(detallechequegiradoBean.getcon());
			this.jInternalFrameDetalleFormDetalleChequeGirado.jTextAreabeneficiarioDetalleChequeGirado.setText(detallechequegiradoBean.getbeneficiario());
			this.jInternalFrameDetalleFormDetalleChequeGirado.jTextFieldcodigoDetalleChequeGirado.setText(detallechequegiradoBean.getcodigo());
			this.jInternalFrameDetalleFormDetalleChequeGirado.jTextAreanombre_bancoDetalleChequeGirado.setText(detallechequegiradoBean.getnombre_banco());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanDetalleChequeGirado(DetalleChequeGiradoParameterReturnGeneral detallechequegiradoReturnGeneral,DetalleChequeGiradoBean detallechequegiradoBean,Boolean conDefault) throws Exception { 
		try {
			DetalleChequeGirado detallechequegiradoLocal=new DetalleChequeGirado();
			
			detallechequegiradoLocal=detallechequegiradoReturnGeneral.getDetalleChequeGirado();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && detallechequegiradoLocal.getId()!=null && !detallechequegiradoLocal.getId().equals(0L))) {detallechequegiradoBean.setId(detallechequegiradoLocal.getId());}}
			if(conDefault || (!conDefault && detallechequegiradoLocal.getnumero_cheque()!=null && !detallechequegiradoLocal.getnumero_cheque().equals(""))) {detallechequegiradoBean.setnumero_cheque(detallechequegiradoLocal.getnumero_cheque());}
			if(conDefault || (!conDefault && detallechequegiradoLocal.getvalor()!=null && !detallechequegiradoLocal.getvalor().equals(0.0))) {detallechequegiradoBean.setvalor(detallechequegiradoLocal.getvalor());}
			if(conDefault || (!conDefault && detallechequegiradoLocal.getcuenta()!=null && !detallechequegiradoLocal.getcuenta().equals(""))) {detallechequegiradoBean.setcuenta(detallechequegiradoLocal.getcuenta());}
			if(conDefault || (!conDefault && detallechequegiradoLocal.getfecha()!=null && !detallechequegiradoLocal.getfecha().equals(new Date()))) {detallechequegiradoBean.setfecha(detallechequegiradoLocal.getfecha());}
			if(conDefault || (!conDefault && detallechequegiradoLocal.getcon()!=null && !detallechequegiradoLocal.getcon().equals(false))) {detallechequegiradoBean.setcon(detallechequegiradoLocal.getcon());}
			if(conDefault || (!conDefault && detallechequegiradoLocal.getbeneficiario()!=null && !detallechequegiradoLocal.getbeneficiario().equals(""))) {detallechequegiradoBean.setbeneficiario(detallechequegiradoLocal.getbeneficiario());}
			if(conDefault || (!conDefault && detallechequegiradoLocal.getcodigo()!=null && !detallechequegiradoLocal.getcodigo().equals(""))) {detallechequegiradoBean.setcodigo(detallechequegiradoLocal.getcodigo());}
			if(conDefault || (!conDefault && detallechequegiradoLocal.getnombre_banco()!=null && !detallechequegiradoLocal.getnombre_banco().equals(""))) {detallechequegiradoBean.setnombre_banco(detallechequegiradoLocal.getnombre_banco());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxDetalleChequeGiradoGenerico(Long idDetalleChequeGiradoSeleccionado,JComboBox jComboBoxDetalleChequeGirado,List<DetalleChequeGirado> detallechequegiradosLocal)throws Exception {
		try {
			DetalleChequeGirado  detallechequegiradoTemp=null;

			for(DetalleChequeGirado detallechequegiradoAux:detallechequegiradosLocal) {
				if(detallechequegiradoAux.getId()!=null && detallechequegiradoAux.getId().equals(idDetalleChequeGiradoSeleccionado)) {
					detallechequegiradoTemp=detallechequegiradoAux;
					break;
				}
			}

			jComboBoxDetalleChequeGirado.setSelectedItem(detallechequegiradoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxDetalleChequeGiradoGenerico(JComboBox jComboBoxDetalleChequeGirado,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxDetalleChequeGirado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDetalleChequeGirado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxDetalleChequeGirado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDetalleChequeGirado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDetalleChequeGirado.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxDetalleChequeGirado.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDetalleChequeGirado.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxDetalleChequeGirado.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxDetalleChequeGirado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxDetalleChequeGirado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			detallechequegirado=(DetalleChequeGirado) detallechequegiradoLogic.getDetalleChequeGirados().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			detallechequegirado =(DetalleChequeGirado) detallechequegirados.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!detallechequegirado.getIsNew() && !detallechequegirado.getIsChanged() && !detallechequegirado.getIsDeleted()) {
				sDescripcion=detallechequegirado.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=detallechequegirado.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!detallechequegirado.getIsNew() && !detallechequegirado.getIsChanged() && !detallechequegirado.getIsDeleted()) {
				sDescripcion=detallechequegirado.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=detallechequegirado.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Ejercicio")) {
			//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
			if(!detallechequegirado.getIsNew() && !detallechequegirado.getIsChanged() && !detallechequegirado.getIsDeleted()) {
				sDescripcion=detallechequegirado.getejercicio_descripcion();
			} else {
				//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
				sDescripcion=detallechequegirado.getejercicio_descripcion();
			}
		}

		if(sTipo.equals("Periodo")) {
			//sDescripcion=this.getActualPeriodoForeignKeyDescripcion((Long)value);
			if(!detallechequegirado.getIsNew() && !detallechequegirado.getIsChanged() && !detallechequegirado.getIsDeleted()) {
				sDescripcion=detallechequegirado.getperiodo_descripcion();
			} else {
				//sDescripcion=this.getActualPeriodoForeignKeyDescripcion((Long)value);
				sDescripcion=detallechequegirado.getperiodo_descripcion();
			}
		}

		if(sTipo.equals("AsientoContable")) {
			//sDescripcion=this.getActualAsientoContableForeignKeyDescripcion((Long)value);
			if(!detallechequegirado.getIsNew() && !detallechequegirado.getIsChanged() && !detallechequegirado.getIsDeleted()) {
				sDescripcion=detallechequegirado.getasientocontable_descripcion();
			} else {
				//sDescripcion=this.getActualAsientoContableForeignKeyDescripcion((Long)value);
				sDescripcion=detallechequegirado.getasientocontable_descripcion();
			}
		}

		if(sTipo.equals("Empleado")) {
			//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
			if(!detallechequegirado.getIsNew() && !detallechequegirado.getIsChanged() && !detallechequegirado.getIsDeleted()) {
				sDescripcion=detallechequegirado.getempleado_descripcion();
			} else {
				//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
				sDescripcion=detallechequegirado.getempleado_descripcion();
			}
		}

		if(sTipo.equals("CuentaBanco")) {
			//sDescripcion=this.getActualCuentaBancoForeignKeyDescripcion((Long)value);
			if(!detallechequegirado.getIsNew() && !detallechequegirado.getIsChanged() && !detallechequegirado.getIsDeleted()) {
				sDescripcion=detallechequegirado.getcuentabanco_descripcion();
			} else {
				//sDescripcion=this.getActualCuentaBancoForeignKeyDescripcion((Long)value);
				sDescripcion=detallechequegirado.getcuentabanco_descripcion();
			}
		}

		if(sTipo.equals("Anio")) {
			//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
			if(!detallechequegirado.getIsNew() && !detallechequegirado.getIsChanged() && !detallechequegirado.getIsDeleted()) {
				sDescripcion=detallechequegirado.getanio_descripcion();
			} else {
				//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
				sDescripcion=detallechequegirado.getanio_descripcion();
			}
		}

		if(sTipo.equals("Mes")) {
			//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
			if(!detallechequegirado.getIsNew() && !detallechequegirado.getIsChanged() && !detallechequegirado.getIsDeleted()) {
				sDescripcion=detallechequegirado.getmes_descripcion();
			} else {
				//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
				sDescripcion=detallechequegirado.getmes_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		DetalleChequeGirado detallechequegiradoRow=new DetalleChequeGirado();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			detallechequegiradoRow=(DetalleChequeGirado) detallechequegiradoLogic.getDetalleChequeGirados().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			detallechequegiradoRow=(DetalleChequeGirado) detallechequegirados.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualDetalleChequeGirado(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoDetalleChequeGirado.setVisible((this.isVisibilidadCeldaNuevoDetalleChequeGirado && this.isPermisoNuevoDetalleChequeGirado));			
			this.jButtonDuplicarDetalleChequeGirado.setVisible((this.isVisibilidadCeldaDuplicarDetalleChequeGirado && this.isPermisoDuplicarDetalleChequeGirado));			
			this.jButtonCopiarDetalleChequeGirado.setVisible((this.isVisibilidadCeldaCopiarDetalleChequeGirado && this.isPermisoCopiarDetalleChequeGirado));
			this.jButtonVerFormDetalleChequeGirado.setVisible((this.isVisibilidadCeldaVerFormDetalleChequeGirado && this.isPermisoVerFormDetalleChequeGirado));
			
			this.jButtonAbrirOrderByDetalleChequeGirado.setVisible((this.isVisibilidadCeldaOrdenDetalleChequeGirado && this.isPermisoOrdenDetalleChequeGirado));			
			
			this.jButtonNuevoRelacionesDetalleChequeGirado.setVisible((this.isVisibilidadCeldaNuevoRelacionesDetalleChequeGirado && this.isPermisoNuevoDetalleChequeGirado));			
			this.jButtonNuevoGuardarCambiosDetalleChequeGirado.setVisible((this.isVisibilidadCeldaNuevoDetalleChequeGirado && this.isPermisoNuevoDetalleChequeGirado && this.isPermisoGuardarCambiosDetalleChequeGirado));
			
			if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) {
			this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonModificarDetalleChequeGirado.setVisible((this.isVisibilidadCeldaModificarDetalleChequeGirado && this.isPermisoActualizarDetalleChequeGirado));	
			this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonActualizarDetalleChequeGirado.setVisible((this.isVisibilidadCeldaActualizarDetalleChequeGirado && this.isPermisoActualizarDetalleChequeGirado));	
			this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonEliminarDetalleChequeGirado.setVisible((this.isVisibilidadCeldaEliminarDetalleChequeGirado && this.isPermisoEliminarDetalleChequeGirado));
			this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonCancelarDetalleChequeGirado.setVisible(this.isVisibilidadCeldaCancelarDetalleChequeGirado);							
			this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonGuardarCambiosDetalleChequeGirado.setVisible((this.isVisibilidadCeldaGuardarDetalleChequeGirado && this.isPermisoGuardarCambiosDetalleChequeGirado));			
			
			}
						
			this.jButtonGuardarCambiosTablaDetalleChequeGirado.setVisible((this.isVisibilidadCeldaGuardarCambiosDetalleChequeGirado && this.isPermisoGuardarCambiosDetalleChequeGirado));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarDetalleChequeGirado.setVisible((this.isVisibilidadCeldaNuevoDetalleChequeGirado && this.isPermisoNuevoDetalleChequeGirado));						
			this.jButtonDuplicarToolBarDetalleChequeGirado.setVisible((this.isVisibilidadCeldaDuplicarDetalleChequeGirado && this.isPermisoDuplicarDetalleChequeGirado));						
			this.jButtonCopiarToolBarDetalleChequeGirado.setVisible((this.isVisibilidadCeldaCopiarDetalleChequeGirado && this.isPermisoCopiarDetalleChequeGirado));			
			this.jButtonVerFormToolBarDetalleChequeGirado.setVisible((this.isVisibilidadCeldaVerFormDetalleChequeGirado && this.isPermisoVerFormDetalleChequeGirado));			
			this.jButtonAbrirOrderByToolBarDetalleChequeGirado.setVisible((this.isVisibilidadCeldaOrdenDetalleChequeGirado && this.isPermisoOrdenDetalleChequeGirado));
			this.jButtonNuevoRelacionesToolBarDetalleChequeGirado.setVisible((this.isVisibilidadCeldaNuevoRelacionesDetalleChequeGirado && this.isPermisoNuevoDetalleChequeGirado));			
			this.jButtonNuevoGuardarCambiosToolBarDetalleChequeGirado.setVisible((this.isVisibilidadCeldaNuevoDetalleChequeGirado && this.isPermisoNuevoDetalleChequeGirado && this.isPermisoGuardarCambiosDetalleChequeGirado));			
			
			if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) {
			this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonModificarToolBarDetalleChequeGirado.setVisible((this.isVisibilidadCeldaModificarDetalleChequeGirado && this.isPermisoActualizarDetalleChequeGirado));	
			this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonActualizarToolBarDetalleChequeGirado.setVisible((this.isVisibilidadCeldaActualizarDetalleChequeGirado  && this.isPermisoActualizarDetalleChequeGirado));	
			this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonEliminarToolBarDetalleChequeGirado.setVisible((this.isVisibilidadCeldaEliminarDetalleChequeGirado && this.isPermisoEliminarDetalleChequeGirado));
			this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonCancelarToolBarDetalleChequeGirado.setVisible(this.isVisibilidadCeldaCancelarDetalleChequeGirado);				
			this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonGuardarCambiosToolBarDetalleChequeGirado.setVisible((this.isVisibilidadCeldaGuardarDetalleChequeGirado && this.isPermisoGuardarCambiosDetalleChequeGirado));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarDetalleChequeGirado.setVisible((this.isVisibilidadCeldaGuardarCambiosDetalleChequeGirado && this.isPermisoGuardarCambiosDetalleChequeGirado));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoDetalleChequeGirado.setVisible((this.isVisibilidadCeldaNuevoDetalleChequeGirado && this.isPermisoNuevoDetalleChequeGirado));			
			this.jMenuItemDuplicarDetalleChequeGirado.setVisible((this.isVisibilidadCeldaDuplicarDetalleChequeGirado && this.isPermisoDuplicarDetalleChequeGirado));			
			this.jMenuItemCopiarDetalleChequeGirado.setVisible((this.isVisibilidadCeldaCopiarDetalleChequeGirado && this.isPermisoCopiarDetalleChequeGirado));			
			this.jMenuItemVerFormDetalleChequeGirado.setVisible((this.isVisibilidadCeldaVerFormDetalleChequeGirado && this.isPermisoVerFormDetalleChequeGirado));			
			this.jMenuItemAbrirOrderByDetalleChequeGirado.setVisible((this.isVisibilidadCeldaOrdenDetalleChequeGirado && this.isPermisoOrdenDetalleChequeGirado));			
			//this.jMenuItemMostrarOcultarDetalleChequeGirado.setVisible((this.isVisibilidadCeldaOrdenDetalleChequeGirado && this.isPermisoOrdenDetalleChequeGirado));
			this.jMenuItemDetalleAbrirOrderByDetalleChequeGirado.setVisible((this.isVisibilidadCeldaOrdenDetalleChequeGirado && this.isPermisoOrdenDetalleChequeGirado));			
			//this.jMenuItemDetalleMostrarOcultarDetalleChequeGirado.setVisible((this.isVisibilidadCeldaOrdenDetalleChequeGirado && this.isPermisoOrdenDetalleChequeGirado));			
			this.jMenuItemNuevoRelacionesDetalleChequeGirado.setVisible((this.isVisibilidadCeldaNuevoRelacionesDetalleChequeGirado && this.isPermisoNuevoDetalleChequeGirado));			
			this.jMenuItemNuevoGuardarCambiosDetalleChequeGirado.setVisible((this.isVisibilidadCeldaNuevoDetalleChequeGirado && this.isPermisoNuevoDetalleChequeGirado && this.isPermisoGuardarCambiosDetalleChequeGirado));									
			
			if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) {
			this.jInternalFrameDetalleFormDetalleChequeGirado.jMenuItemModificarDetalleChequeGirado.setVisible((this.isVisibilidadCeldaModificarDetalleChequeGirado && this.isPermisoActualizarDetalleChequeGirado));	
			this.jInternalFrameDetalleFormDetalleChequeGirado.jMenuItemActualizarDetalleChequeGirado.setVisible((this.isVisibilidadCeldaActualizarDetalleChequeGirado && this.isPermisoActualizarDetalleChequeGirado));	
			this.jInternalFrameDetalleFormDetalleChequeGirado.jMenuItemEliminarDetalleChequeGirado.setVisible((this.isVisibilidadCeldaEliminarDetalleChequeGirado && this.isPermisoEliminarDetalleChequeGirado));
			this.jInternalFrameDetalleFormDetalleChequeGirado.jMenuItemCancelarDetalleChequeGirado.setVisible(this.isVisibilidadCeldaCancelarDetalleChequeGirado);				
			}
			
			this.jMenuItemGuardarCambiosDetalleChequeGirado.setVisible((this.isVisibilidadCeldaGuardarDetalleChequeGirado && this.isPermisoGuardarCambiosDetalleChequeGirado));						
			this.jMenuItemGuardarCambiosTablaDetalleChequeGirado.setVisible((this.isVisibilidadCeldaGuardarCambiosDetalleChequeGirado && this.isPermisoGuardarCambiosDetalleChequeGirado));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoDetalleChequeGirado=this.jButtonNuevoDetalleChequeGirado.isVisible();
			this.isVisibilidadCeldaDuplicarDetalleChequeGirado=this.jButtonDuplicarDetalleChequeGirado.isVisible();
			this.isVisibilidadCeldaCopiarDetalleChequeGirado=this.jButtonCopiarDetalleChequeGirado.isVisible();
			this.isVisibilidadCeldaVerFormDetalleChequeGirado=this.jButtonVerFormDetalleChequeGirado.isVisible();
			
			this.isVisibilidadCeldaOrdenDetalleChequeGirado=this.jButtonAbrirOrderByDetalleChequeGirado.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesDetalleChequeGirado=this.jButtonNuevoRelacionesDetalleChequeGirado.isVisible();
			this.isVisibilidadCeldaModificarDetalleChequeGirado=this.jButtonModificarDetalleChequeGirado.isVisible();
			
			if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) {
			this.isVisibilidadCeldaActualizarDetalleChequeGirado=this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonActualizarDetalleChequeGirado.isVisible();
			this.isVisibilidadCeldaEliminarDetalleChequeGirado=this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonEliminarDetalleChequeGirado.isVisible();
			this.isVisibilidadCeldaCancelarDetalleChequeGirado=this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonCancelarDetalleChequeGirado.isVisible();
			this.isVisibilidadCeldaGuardarDetalleChequeGirado=this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonGuardarCambiosDetalleChequeGirado.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosDetalleChequeGirado=this.jButtonGuardarCambiosTablaDetalleChequeGirado.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoDetalleChequeGirado=this.jButtonNuevoToolBarDetalleChequeGirado.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDetalleChequeGirado=this.jButtonNuevoRelacionesToolBarDetalleChequeGirado.isVisible();
			
			if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) {
			this.isVisibilidadCeldaModificarDetalleChequeGirado=this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonModificarToolBarDetalleChequeGirado.isVisible();
			this.isVisibilidadCeldaActualizarDetalleChequeGirado=this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonActualizarToolBarDetalleChequeGirado.isVisible();
			this.isVisibilidadCeldaEliminarDetalleChequeGirado=this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonEliminarToolBarDetalleChequeGirado.isVisible();
			this.isVisibilidadCeldaCancelarDetalleChequeGirado=this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonCancelarToolBarDetalleChequeGirado.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDetalleChequeGirado=this.jButtonGuardarCambiosToolBarDetalleChequeGirado.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDetalleChequeGirado=this.jButtonGuardarCambiosTablaToolBarDetalleChequeGirado.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoDetalleChequeGirado=this.jMenuItemNuevoDetalleChequeGirado.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDetalleChequeGirado=this.jMenuItemNuevoRelacionesDetalleChequeGirado.isVisible();
			
			if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) {
			this.isVisibilidadCeldaModificarDetalleChequeGirado=this.jInternalFrameDetalleFormDetalleChequeGirado.jMenuItemModificarDetalleChequeGirado.isVisible();
			this.isVisibilidadCeldaActualizarDetalleChequeGirado=this.jInternalFrameDetalleFormDetalleChequeGirado.jMenuItemActualizarDetalleChequeGirado.isVisible();
			this.isVisibilidadCeldaEliminarDetalleChequeGirado=this.jInternalFrameDetalleFormDetalleChequeGirado.jMenuItemEliminarDetalleChequeGirado.isVisible();
			this.isVisibilidadCeldaCancelarDetalleChequeGirado=this.jInternalFrameDetalleFormDetalleChequeGirado.jMenuItemCancelarDetalleChequeGirado.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDetalleChequeGirado=this.jMenuItemGuardarCambiosDetalleChequeGirado.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDetalleChequeGirado=this.jMenuItemGuardarCambiosTablaDetalleChequeGirado.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesDetalleChequeGirado(Boolean esInicializar) {
		if(DetalleChequeGiradoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.detallechequegiradoSessionBean.getConGuardarRelaciones()) {
				//if(this.detallechequegiradoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesDetalleChequeGirado();
			}
			
			this.inicializarActualizarBindingBotonesManualDetalleChequeGirado(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualDetalleChequeGirado() {
		this.jButtonNuevoDetalleChequeGirado.setVisible(this.isPermisoNuevoDetalleChequeGirado);			
		this.jButtonDuplicarDetalleChequeGirado.setVisible(this.isPermisoDuplicarDetalleChequeGirado);			
		this.jButtonCopiarDetalleChequeGirado.setVisible(this.isPermisoCopiarDetalleChequeGirado);			
		this.jButtonVerFormDetalleChequeGirado.setVisible(this.isPermisoVerFormDetalleChequeGirado);			
		
		this.jButtonAbrirOrderByDetalleChequeGirado.setVisible(this.isPermisoOrdenDetalleChequeGirado);					
		
		this.jButtonNuevoRelacionesDetalleChequeGirado.setVisible(this.isPermisoNuevoDetalleChequeGirado);			
		
		if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonModificarDetalleChequeGirado.setVisible(this.isPermisoActualizarDetalleChequeGirado);	
			this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonActualizarDetalleChequeGirado.setVisible(this.isPermisoActualizarDetalleChequeGirado);	
			this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonEliminarDetalleChequeGirado.setVisible(this.isPermisoEliminarDetalleChequeGirado);
			this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonCancelarDetalleChequeGirado.setVisible(this.isVisibilidadCeldaCancelarDetalleChequeGirado);						
			this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonGuardarCambiosDetalleChequeGirado.setVisible(this.isPermisoGuardarCambiosDetalleChequeGirado);							
		}
		
		this.jButtonGuardarCambiosTablaDetalleChequeGirado.setVisible(this.isPermisoActualizarDetalleChequeGirado);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleDetalleChequeGirado() {
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonModificarDetalleChequeGirado.setVisible(this.isPermisoActualizarDetalleChequeGirado);	
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonActualizarDetalleChequeGirado.setVisible(this.isPermisoActualizarDetalleChequeGirado);	
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonEliminarDetalleChequeGirado.setVisible(this.isPermisoEliminarDetalleChequeGirado);
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonCancelarDetalleChequeGirado.setVisible(this.isVisibilidadCeldaCancelarDetalleChequeGirado);							
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonGuardarCambiosDetalleChequeGirado.setVisible((this.isVisibilidadCeldaGuardarDetalleChequeGirado && this.isPermisoGuardarCambiosDetalleChequeGirado));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosDetalleChequeGirado() {
		if(DetalleChequeGiradoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualDetalleChequeGirado();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesDetalleChequeGirado() {
	}
	
	public void jTableDatosDetalleChequeGiradoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarDetalleChequeGirado(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidDetalleChequeGiradoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegiradoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleChequeGirado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleChequeGirado(this.getdetallechequegirado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleChequeGirado(this.detallechequegirado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallechequegirado =(DetalleChequeGirado) this.detallechequegiradoLogic.getDetalleChequeGirados().toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallechequegirado =(DetalleChequeGirado) this.detallechequegirados.toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallechequegirado==null) {
						this.detallechequegirado = new DetalleChequeGirado();
					}

					this.setVariablesFormularioToObjetoActualDetalleChequeGirado(this.detallechequegirado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleChequeGirado(this.detallechequegirado);
				}

				if(this.detallechequegirado.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.detallechequegirado.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleChequeGirado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegiradoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegiradoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegiradoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaDetalleChequeGiradoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebDetalleChequeGirado(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleChequeGirado.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleChequeGirado.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleChequeGirado.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegirado =(DetalleChequeGirado) this.detallechequegiradoLogic.getDetalleChequeGirados().toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallechequegirado =(DetalleChequeGirado) this.detallechequegirados.toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleChequeGirado(this.getdetallechequegirado(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleChequeGirado(this.detallechequegirado);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.detallechequegiradoLogic.getConnexion());

				if(this.detallechequegirado.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.detallechequegirado.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleChequeGirado=(TitledBorder)this.jScrollPanelDatosDetalleChequeGirado.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderDetalleChequeGirado.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaDetalleChequeGiradoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegiradoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleChequeGirado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleChequeGirado(this.getdetallechequegirado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleChequeGirado(this.detallechequegirado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallechequegirado =(DetalleChequeGirado) this.detallechequegiradoLogic.getDetalleChequeGirados().toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallechequegirado =(DetalleChequeGirado) this.detallechequegirados.toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallechequegirado==null) {
						this.detallechequegirado = new DetalleChequeGirado();
					}

					this.setVariablesFormularioToObjetoActualDetalleChequeGirado(this.detallechequegirado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleChequeGirado(this.detallechequegirado);
				}

				if(this.detallechequegirado.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.detallechequegirado.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleChequeGirado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegiradoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegiradoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegiradoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalDetalleChequeGiradoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebDetalleChequeGirado(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleChequeGirado.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleChequeGirado.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleChequeGirado.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegirado =(DetalleChequeGirado) this.detallechequegiradoLogic.getDetalleChequeGirados().toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallechequegirado =(DetalleChequeGirado) this.detallechequegirados.toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleChequeGirado(this.getdetallechequegirado(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleChequeGirado(this.detallechequegirado);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.detallechequegiradoLogic.getConnexion());

				if(this.detallechequegirado.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.detallechequegirado.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleChequeGirado=(TitledBorder)this.jScrollPanelDatosDetalleChequeGirado.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderDetalleChequeGirado.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalDetalleChequeGiradoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegiradoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleChequeGirado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleChequeGirado(this.getdetallechequegirado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleChequeGirado(this.detallechequegirado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallechequegirado =(DetalleChequeGirado) this.detallechequegiradoLogic.getDetalleChequeGirados().toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallechequegirado =(DetalleChequeGirado) this.detallechequegirados.toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallechequegirado==null) {
						this.detallechequegirado = new DetalleChequeGirado();
					}

					this.setVariablesFormularioToObjetoActualDetalleChequeGirado(this.detallechequegirado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleChequeGirado(this.detallechequegirado);
				}

				if(this.detallechequegirado.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.detallechequegirado.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleChequeGirado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegiradoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegiradoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegiradoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ejercicioDetalleChequeGiradoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoejercicio=true;

			idTienePermisoejercicio=this.tienePermisosUsuarioEnPaginaWebDetalleChequeGirado(EjercicioConstantesFunciones.CLASSNAME);

			if(idTienePermisoejercicio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleChequeGirado.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleChequeGirado.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleChequeGirado.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegirado =(DetalleChequeGirado) this.detallechequegiradoLogic.getDetalleChequeGirados().toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallechequegirado =(DetalleChequeGirado) this.detallechequegirados.toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleChequeGirado(this.getdetallechequegirado(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleChequeGirado(this.detallechequegirado);

				this.ejercicioBeanSwingJInternalFrame=new EjercicioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ejercicioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ejercicioBeanSwingJInternalFrame.getEjercicioLogic().setConnexion(this.detallechequegiradoLogic.getConnexion());

				if(this.detallechequegirado.getid_ejercicio()!=null) {
					this.ejercicioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ejercicioBeanSwingJInternalFrame.setIdActual(this.detallechequegirado.getid_ejercicio());
					this.ejercicioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.inicializarActualizarBindingTablaEjercicio();
				}

				JInternalFrameBase jinternalFrame =this.ejercicioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleChequeGirado=(TitledBorder)this.jScrollPanelDatosDetalleChequeGirado.getBorder();
				TitledBorder titledBorderejercicio=(TitledBorder)this.ejercicioBeanSwingJInternalFrame.jScrollPanelDatosEjercicio.getBorder();

				titledBorderejercicio.setTitle(titledBorderDetalleChequeGirado.getTitle() + " -> Ejercicio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ejercicioDetalleChequeGiradoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegiradoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleChequeGirado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleChequeGirado(this.getdetallechequegirado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleChequeGirado(this.detallechequegirado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallechequegirado =(DetalleChequeGirado) this.detallechequegiradoLogic.getDetalleChequeGirados().toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallechequegirado =(DetalleChequeGirado) this.detallechequegirados.toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallechequegirado==null) {
						this.detallechequegirado = new DetalleChequeGirado();
					}

					this.setVariablesFormularioToObjetoActualDetalleChequeGirado(this.detallechequegirado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleChequeGirado(this.detallechequegirado);
				}

				if(this.detallechequegirado.getid_ejercicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ejercicio = "+this.detallechequegirado.getid_ejercicio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleChequeGirado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegiradoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegiradoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegiradoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_periodoDetalleChequeGiradoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoperiodo=true;

			idTienePermisoperiodo=this.tienePermisosUsuarioEnPaginaWebDetalleChequeGirado(PeriodoConstantesFunciones.CLASSNAME);

			if(idTienePermisoperiodo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleChequeGirado.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleChequeGirado.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleChequeGirado.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegirado =(DetalleChequeGirado) this.detallechequegiradoLogic.getDetalleChequeGirados().toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallechequegirado =(DetalleChequeGirado) this.detallechequegirados.toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleChequeGirado(this.getdetallechequegirado(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleChequeGirado(this.detallechequegirado);

				this.periodoBeanSwingJInternalFrame=new PeriodoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.periodoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.periodoBeanSwingJInternalFrame.getPeriodoLogic().setConnexion(this.detallechequegiradoLogic.getConnexion());

				if(this.detallechequegirado.getid_periodo()!=null) {
					this.periodoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.periodoBeanSwingJInternalFrame.setIdActual(this.detallechequegirado.getid_periodo());
					this.periodoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.inicializarActualizarBindingTablaPeriodo();
				}

				JInternalFrameBase jinternalFrame =this.periodoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleChequeGirado=(TitledBorder)this.jScrollPanelDatosDetalleChequeGirado.getBorder();
				TitledBorder titledBorderperiodo=(TitledBorder)this.periodoBeanSwingJInternalFrame.jScrollPanelDatosPeriodo.getBorder();

				titledBorderperiodo.setTitle(titledBorderDetalleChequeGirado.getTitle() + " -> Periodo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_periodoDetalleChequeGiradoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegiradoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleChequeGirado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleChequeGirado(this.getdetallechequegirado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleChequeGirado(this.detallechequegirado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallechequegirado =(DetalleChequeGirado) this.detallechequegiradoLogic.getDetalleChequeGirados().toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallechequegirado =(DetalleChequeGirado) this.detallechequegirados.toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallechequegirado==null) {
						this.detallechequegirado = new DetalleChequeGirado();
					}

					this.setVariablesFormularioToObjetoActualDetalleChequeGirado(this.detallechequegirado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleChequeGirado(this.detallechequegirado);
				}

				if(this.detallechequegirado.getid_periodo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_periodo = "+this.detallechequegirado.getid_periodo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleChequeGirado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegiradoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegiradoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegiradoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_asiento_contableDetalleChequeGiradoActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.asientocontableBeanSwingJInternalFrame=new AsientoContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.asientocontableBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.asientocontableBeanSwingJInternalFrame.sTipoBusqueda="AsientoContable";

			if(!this.sFinalQueryGeneral_asientocontable.equals("")) {
				this.asientocontableBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_asientocontable);
				this.asientocontableBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.asientocontableBeanSwingJInternalFrame.procesarBusqueda(this.asientocontableBeanSwingJInternalFrame.sAccionBusqueda);
				this.asientocontableBeanSwingJInternalFrame.inicializarActualizarBindingAsientoContable(false);
			}

			if(!this.sFinalQueryComboAsientoContable.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.asientocontableBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderDetalleChequeGirado=null;
			TitledBorder titledBorderasientocontable=null;

			if(!this.jScrollPanelDatosDetalleChequeGirado.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderDetalleChequeGirado=(TitledBorder)this.jScrollPanelDatosDetalleChequeGirado.getBorder();
				titledBorderasientocontable=(TitledBorder)this.asientocontableBeanSwingJInternalFrame.jScrollPanelDatosAsientoContable.getBorder();

				titledBorderasientocontable.setTitle(titledBorderDetalleChequeGirado.getTitle() + " -> Asiento Contable");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_asiento_contableDetalleChequeGiradoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoasientocontable=true;

			idTienePermisoasientocontable=this.tienePermisosUsuarioEnPaginaWebDetalleChequeGirado(AsientoContableConstantesFunciones.CLASSNAME);

			if(idTienePermisoasientocontable) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleChequeGirado.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleChequeGirado.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleChequeGirado.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegirado =(DetalleChequeGirado) this.detallechequegiradoLogic.getDetalleChequeGirados().toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallechequegirado =(DetalleChequeGirado) this.detallechequegirados.toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleChequeGirado(this.getdetallechequegirado(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleChequeGirado(this.detallechequegirado);

				this.asientocontableBeanSwingJInternalFrame=new AsientoContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.asientocontableBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.asientocontableBeanSwingJInternalFrame.getAsientoContableLogic().setConnexion(this.detallechequegiradoLogic.getConnexion());

				if(this.detallechequegirado.getid_asiento_contable()!=null) {
					this.asientocontableBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.asientocontableBeanSwingJInternalFrame.setIdActual(this.detallechequegirado.getid_asiento_contable());
					this.asientocontableBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.asientocontableBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.asientocontableBeanSwingJInternalFrame.inicializarActualizarBindingTablaAsientoContable();
				}

				JInternalFrameBase jinternalFrame =this.asientocontableBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleChequeGirado=(TitledBorder)this.jScrollPanelDatosDetalleChequeGirado.getBorder();
				TitledBorder titledBorderasientocontable=(TitledBorder)this.asientocontableBeanSwingJInternalFrame.jScrollPanelDatosAsientoContable.getBorder();

				titledBorderasientocontable.setTitle(titledBorderDetalleChequeGirado.getTitle() + " -> Asiento Contable");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_asiento_contableDetalleChequeGiradoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegiradoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleChequeGirado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleChequeGirado(this.getdetallechequegirado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleChequeGirado(this.detallechequegirado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallechequegirado =(DetalleChequeGirado) this.detallechequegiradoLogic.getDetalleChequeGirados().toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallechequegirado =(DetalleChequeGirado) this.detallechequegirados.toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallechequegirado==null) {
						this.detallechequegirado = new DetalleChequeGirado();
					}

					this.setVariablesFormularioToObjetoActualDetalleChequeGirado(this.detallechequegirado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleChequeGirado(this.detallechequegirado);
				}

				if(this.detallechequegirado.getid_asiento_contable()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_asiento_contable = "+this.detallechequegirado.getid_asiento_contable().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleChequeGirado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegiradoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegiradoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegiradoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empleadoDetalleChequeGiradoActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.empleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.empleadoBeanSwingJInternalFrame.sTipoBusqueda="Empleado";

			if(!this.sFinalQueryGeneral_empleado.equals("")) {
				this.empleadoBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_empleado);
				this.empleadoBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.empleadoBeanSwingJInternalFrame.procesarBusqueda(this.empleadoBeanSwingJInternalFrame.sAccionBusqueda);
				this.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingEmpleado(false);
			}

			if(!this.sFinalQueryComboEmpleado.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.empleadoBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderDetalleChequeGirado=null;
			TitledBorder titledBorderempleado=null;

			if(!this.jScrollPanelDatosDetalleChequeGirado.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderDetalleChequeGirado=(TitledBorder)this.jScrollPanelDatosDetalleChequeGirado.getBorder();
				titledBorderempleado=(TitledBorder)this.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleado.setTitle(titledBorderDetalleChequeGirado.getTitle() + " -> Empleado");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_empleadoDetalleChequeGiradoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempleado=true;

			idTienePermisoempleado=this.tienePermisosUsuarioEnPaginaWebDetalleChequeGirado(EmpleadoConstantesFunciones.CLASSNAME);

			if(idTienePermisoempleado) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleChequeGirado.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleChequeGirado.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleChequeGirado.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegirado =(DetalleChequeGirado) this.detallechequegiradoLogic.getDetalleChequeGirados().toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallechequegirado =(DetalleChequeGirado) this.detallechequegirados.toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleChequeGirado(this.getdetallechequegirado(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleChequeGirado(this.detallechequegirado);

				this.empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empleadoBeanSwingJInternalFrame.getEmpleadoLogic().setConnexion(this.detallechequegiradoLogic.getConnexion());

				if(this.detallechequegirado.getid_empleado()!=null) {
					this.empleadoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empleadoBeanSwingJInternalFrame.setIdActual(this.detallechequegirado.getid_empleado());
					this.empleadoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado();
				}

				JInternalFrameBase jinternalFrame =this.empleadoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleChequeGirado=(TitledBorder)this.jScrollPanelDatosDetalleChequeGirado.getBorder();
				TitledBorder titledBorderempleado=(TitledBorder)this.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleado.setTitle(titledBorderDetalleChequeGirado.getTitle() + " -> Empleado");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empleadoDetalleChequeGiradoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegiradoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleChequeGirado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleChequeGirado(this.getdetallechequegirado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleChequeGirado(this.detallechequegirado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallechequegirado =(DetalleChequeGirado) this.detallechequegiradoLogic.getDetalleChequeGirados().toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallechequegirado =(DetalleChequeGirado) this.detallechequegirados.toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallechequegirado==null) {
						this.detallechequegirado = new DetalleChequeGirado();
					}

					this.setVariablesFormularioToObjetoActualDetalleChequeGirado(this.detallechequegirado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleChequeGirado(this.detallechequegirado);
				}

				if(this.detallechequegirado.getid_empleado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empleado = "+this.detallechequegirado.getid_empleado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleChequeGirado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegiradoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegiradoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegiradoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_cuenta_bancoDetalleChequeGiradoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocuentabanco=true;

			idTienePermisocuentabanco=this.tienePermisosUsuarioEnPaginaWebDetalleChequeGirado(CuentaBancoConstantesFunciones.CLASSNAME);

			if(idTienePermisocuentabanco) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleChequeGirado.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleChequeGirado.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleChequeGirado.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegirado =(DetalleChequeGirado) this.detallechequegiradoLogic.getDetalleChequeGirados().toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallechequegirado =(DetalleChequeGirado) this.detallechequegirados.toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleChequeGirado(this.getdetallechequegirado(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleChequeGirado(this.detallechequegirado);

				this.cuentabancoBeanSwingJInternalFrame=new CuentaBancoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.cuentabancoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.cuentabancoBeanSwingJInternalFrame.getCuentaBancoLogic().setConnexion(this.detallechequegiradoLogic.getConnexion());

				if(this.detallechequegirado.getid_cuenta_banco()!=null) {
					this.cuentabancoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.cuentabancoBeanSwingJInternalFrame.setIdActual(this.detallechequegirado.getid_cuenta_banco());
					this.cuentabancoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.cuentabancoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.cuentabancoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuentaBanco();
				}

				JInternalFrameBase jinternalFrame =this.cuentabancoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleChequeGirado=(TitledBorder)this.jScrollPanelDatosDetalleChequeGirado.getBorder();
				TitledBorder titledBordercuentabanco=(TitledBorder)this.cuentabancoBeanSwingJInternalFrame.jScrollPanelDatosCuentaBanco.getBorder();

				titledBordercuentabanco.setTitle(titledBorderDetalleChequeGirado.getTitle() + " -> Cuenta Banco");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_cuenta_bancoDetalleChequeGiradoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegiradoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleChequeGirado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleChequeGirado(this.getdetallechequegirado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleChequeGirado(this.detallechequegirado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallechequegirado =(DetalleChequeGirado) this.detallechequegiradoLogic.getDetalleChequeGirados().toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallechequegirado =(DetalleChequeGirado) this.detallechequegirados.toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallechequegirado==null) {
						this.detallechequegirado = new DetalleChequeGirado();
					}

					this.setVariablesFormularioToObjetoActualDetalleChequeGirado(this.detallechequegirado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleChequeGirado(this.detallechequegirado);
				}

				if(this.detallechequegirado.getid_cuenta_banco()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cuenta_banco = "+this.detallechequegirado.getid_cuenta_banco().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleChequeGirado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegiradoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegiradoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegiradoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_chequeDetalleChequeGiradoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegiradoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleChequeGirado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleChequeGirado(this.getdetallechequegirado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleChequeGirado(this.detallechequegirado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallechequegirado =(DetalleChequeGirado) this.detallechequegiradoLogic.getDetalleChequeGirados().toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallechequegirado =(DetalleChequeGirado) this.detallechequegirados.toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallechequegirado==null) {
						this.detallechequegirado = new DetalleChequeGirado();
					}

					this.setVariablesFormularioToObjetoActualDetalleChequeGirado(this.detallechequegirado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleChequeGirado(this.detallechequegirado);
				}

				if(this.detallechequegirado.getnumero_cheque()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_cheque like '%"+this.detallechequegirado.getnumero_cheque()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleChequeGirado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegiradoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegiradoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegiradoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalorDetalleChequeGiradoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegiradoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleChequeGirado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleChequeGirado(this.getdetallechequegirado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleChequeGirado(this.detallechequegirado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallechequegirado =(DetalleChequeGirado) this.detallechequegiradoLogic.getDetalleChequeGirados().toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallechequegirado =(DetalleChequeGirado) this.detallechequegirados.toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallechequegirado==null) {
						this.detallechequegirado = new DetalleChequeGirado();
					}

					this.setVariablesFormularioToObjetoActualDetalleChequeGirado(this.detallechequegirado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleChequeGirado(this.detallechequegirado);
				}

				if(this.detallechequegirado.getvalor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor = "+this.detallechequegirado.getvalor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleChequeGirado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegiradoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegiradoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegiradoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncuentaDetalleChequeGiradoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegiradoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleChequeGirado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleChequeGirado(this.getdetallechequegirado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleChequeGirado(this.detallechequegirado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallechequegirado =(DetalleChequeGirado) this.detallechequegiradoLogic.getDetalleChequeGirados().toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallechequegirado =(DetalleChequeGirado) this.detallechequegirados.toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallechequegirado==null) {
						this.detallechequegirado = new DetalleChequeGirado();
					}

					this.setVariablesFormularioToObjetoActualDetalleChequeGirado(this.detallechequegirado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleChequeGirado(this.detallechequegirado);
				}

				if(this.detallechequegirado.getcuenta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cuenta like '%"+this.detallechequegirado.getcuenta()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleChequeGirado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegiradoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegiradoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegiradoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfechaDetalleChequeGiradoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegiradoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleChequeGirado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleChequeGirado(this.getdetallechequegirado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleChequeGirado(this.detallechequegirado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallechequegirado =(DetalleChequeGirado) this.detallechequegiradoLogic.getDetalleChequeGirados().toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallechequegirado =(DetalleChequeGirado) this.detallechequegirados.toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallechequegirado==null) {
						this.detallechequegirado = new DetalleChequeGirado();
					}

					this.setVariablesFormularioToObjetoActualDetalleChequeGirado(this.detallechequegirado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleChequeGirado(this.detallechequegirado);
				}

				if(this.detallechequegirado.getfecha()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha = '"+Funciones2.getStringPostgresDate(this.detallechequegirado.getfecha())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleChequeGirado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegiradoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegiradoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegiradoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonconDetalleChequeGiradoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegiradoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleChequeGirado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleChequeGirado(this.getdetallechequegirado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleChequeGirado(this.detallechequegirado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallechequegirado =(DetalleChequeGirado) this.detallechequegiradoLogic.getDetalleChequeGirados().toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallechequegirado =(DetalleChequeGirado) this.detallechequegirados.toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallechequegirado==null) {
						this.detallechequegirado = new DetalleChequeGirado();
					}

					this.setVariablesFormularioToObjetoActualDetalleChequeGirado(this.detallechequegirado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleChequeGirado(this.detallechequegirado);
				}

				if(this.detallechequegirado.getcon()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where con = "+this.detallechequegirado.getcon().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleChequeGirado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegiradoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegiradoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegiradoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonbeneficiarioDetalleChequeGiradoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegiradoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleChequeGirado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleChequeGirado(this.getdetallechequegirado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleChequeGirado(this.detallechequegirado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallechequegirado =(DetalleChequeGirado) this.detallechequegiradoLogic.getDetalleChequeGirados().toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallechequegirado =(DetalleChequeGirado) this.detallechequegirados.toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallechequegirado==null) {
						this.detallechequegirado = new DetalleChequeGirado();
					}

					this.setVariablesFormularioToObjetoActualDetalleChequeGirado(this.detallechequegirado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleChequeGirado(this.detallechequegirado);
				}

				if(this.detallechequegirado.getbeneficiario()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where beneficiario like '%"+this.detallechequegirado.getbeneficiario()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleChequeGirado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegiradoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegiradoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegiradoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoDetalleChequeGiradoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegiradoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleChequeGirado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleChequeGirado(this.getdetallechequegirado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleChequeGirado(this.detallechequegirado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallechequegirado =(DetalleChequeGirado) this.detallechequegiradoLogic.getDetalleChequeGirados().toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallechequegirado =(DetalleChequeGirado) this.detallechequegirados.toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallechequegirado==null) {
						this.detallechequegirado = new DetalleChequeGirado();
					}

					this.setVariablesFormularioToObjetoActualDetalleChequeGirado(this.detallechequegirado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleChequeGirado(this.detallechequegirado);
				}

				if(this.detallechequegirado.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.detallechequegirado.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleChequeGirado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegiradoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegiradoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegiradoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_bancoDetalleChequeGiradoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegiradoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleChequeGirado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleChequeGirado(this.getdetallechequegirado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleChequeGirado(this.detallechequegirado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallechequegirado =(DetalleChequeGirado) this.detallechequegiradoLogic.getDetalleChequeGirados().toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallechequegirado =(DetalleChequeGirado) this.detallechequegirados.toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallechequegirado==null) {
						this.detallechequegirado = new DetalleChequeGirado();
					}

					this.setVariablesFormularioToObjetoActualDetalleChequeGirado(this.detallechequegirado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleChequeGirado(this.detallechequegirado);
				}

				if(this.detallechequegirado.getnombre_banco()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_banco like '%"+this.detallechequegirado.getnombre_banco()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleChequeGirado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegiradoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegiradoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegiradoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_anioDetalleChequeGiradoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoanio=true;

			idTienePermisoanio=this.tienePermisosUsuarioEnPaginaWebDetalleChequeGirado(AnioConstantesFunciones.CLASSNAME);

			if(idTienePermisoanio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleChequeGirado.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleChequeGirado.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleChequeGirado.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegirado =(DetalleChequeGirado) this.detallechequegiradoLogic.getDetalleChequeGirados().toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallechequegirado =(DetalleChequeGirado) this.detallechequegirados.toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleChequeGirado(this.getdetallechequegirado(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleChequeGirado(this.detallechequegirado);

				this.anioBeanSwingJInternalFrame=new AnioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.anioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.anioBeanSwingJInternalFrame.getAnioLogic().setConnexion(this.detallechequegiradoLogic.getConnexion());

				if(this.detallechequegirado.getid_anio()!=null) {
					this.anioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.anioBeanSwingJInternalFrame.setIdActual(this.detallechequegirado.getid_anio());
					this.anioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.inicializarActualizarBindingTablaAnio();
				}

				JInternalFrameBase jinternalFrame =this.anioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleChequeGirado=(TitledBorder)this.jScrollPanelDatosDetalleChequeGirado.getBorder();
				TitledBorder titledBorderanio=(TitledBorder)this.anioBeanSwingJInternalFrame.jScrollPanelDatosAnio.getBorder();

				titledBorderanio.setTitle(titledBorderDetalleChequeGirado.getTitle() + " -> Anio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_anioDetalleChequeGiradoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegiradoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleChequeGirado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleChequeGirado(this.getdetallechequegirado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleChequeGirado(this.detallechequegirado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallechequegirado =(DetalleChequeGirado) this.detallechequegiradoLogic.getDetalleChequeGirados().toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallechequegirado =(DetalleChequeGirado) this.detallechequegirados.toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallechequegirado==null) {
						this.detallechequegirado = new DetalleChequeGirado();
					}

					this.setVariablesFormularioToObjetoActualDetalleChequeGirado(this.detallechequegirado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleChequeGirado(this.detallechequegirado);
				}

				if(this.detallechequegirado.getid_anio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_anio = "+this.detallechequegirado.getid_anio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleChequeGirado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegiradoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegiradoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegiradoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_mesDetalleChequeGiradoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisomes=true;

			idTienePermisomes=this.tienePermisosUsuarioEnPaginaWebDetalleChequeGirado(MesConstantesFunciones.CLASSNAME);

			if(idTienePermisomes) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleChequeGirado.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleChequeGirado.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleChequeGirado.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegirado =(DetalleChequeGirado) this.detallechequegiradoLogic.getDetalleChequeGirados().toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallechequegirado =(DetalleChequeGirado) this.detallechequegirados.toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleChequeGirado(this.getdetallechequegirado(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleChequeGirado(this.detallechequegirado);

				this.mesBeanSwingJInternalFrame=new MesBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.mesBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.mesBeanSwingJInternalFrame.getMesLogic().setConnexion(this.detallechequegiradoLogic.getConnexion());

				if(this.detallechequegirado.getid_mes()!=null) {
					this.mesBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.mesBeanSwingJInternalFrame.setIdActual(this.detallechequegirado.getid_mes());
					this.mesBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.inicializarActualizarBindingTablaMes();
				}

				JInternalFrameBase jinternalFrame =this.mesBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleChequeGirado=(TitledBorder)this.jScrollPanelDatosDetalleChequeGirado.getBorder();
				TitledBorder titledBordermes=(TitledBorder)this.mesBeanSwingJInternalFrame.jScrollPanelDatosMes.getBorder();

				titledBordermes.setTitle(titledBorderDetalleChequeGirado.getTitle() + " -> Mes");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_mesDetalleChequeGiradoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegiradoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleChequeGirado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleChequeGirado(this.getdetallechequegirado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleChequeGirado(this.detallechequegirado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallechequegirado =(DetalleChequeGirado) this.detallechequegiradoLogic.getDetalleChequeGirados().toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallechequegirado =(DetalleChequeGirado) this.detallechequegirados.toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallechequegirado==null) {
						this.detallechequegirado = new DetalleChequeGirado();
					}

					this.setVariablesFormularioToObjetoActualDetalleChequeGirado(this.detallechequegirado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleChequeGirado(this.detallechequegirado);
				}

				if(this.detallechequegirado.getid_mes()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_mes = "+this.detallechequegirado.getid_mes().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleChequeGirado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegiradoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegiradoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegiradoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdAnioDetalleChequeGiradoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleChequeGirado(false,false);

			this.getDetalleChequeGiradosFK_IdAnio();

			this.inicializarActualizarBindingDetalleChequeGirado(false);

			//if(DetalleChequeGiradoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleChequeGirado(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdAsientoContableDetalleChequeGiradoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleChequeGirado(false,false);

			this.getDetalleChequeGiradosFK_IdAsientoContable();

			this.inicializarActualizarBindingDetalleChequeGirado(false);

			//if(DetalleChequeGiradoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleChequeGirado(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdCuentaBancoDetalleChequeGiradoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleChequeGirado(false,false);

			this.getDetalleChequeGiradosFK_IdCuentaBanco();

			this.inicializarActualizarBindingDetalleChequeGirado(false);

			//if(DetalleChequeGiradoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleChequeGirado(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEjercicioDetalleChequeGiradoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleChequeGirado(false,false);

			this.getDetalleChequeGiradosFK_IdEjercicio();

			this.inicializarActualizarBindingDetalleChequeGirado(false);

			//if(DetalleChequeGiradoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleChequeGirado(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpleadoDetalleChequeGiradoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleChequeGirado(false,false);

			this.getDetalleChequeGiradosFK_IdEmpleado();

			this.inicializarActualizarBindingDetalleChequeGirado(false);

			//if(DetalleChequeGiradoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleChequeGirado(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaDetalleChequeGiradoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleChequeGirado(false,false);

			this.getDetalleChequeGiradosFK_IdEmpresa();

			this.inicializarActualizarBindingDetalleChequeGirado(false);

			//if(DetalleChequeGiradoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleChequeGirado(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdMesDetalleChequeGiradoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleChequeGirado(false,false);

			this.getDetalleChequeGiradosFK_IdMes();

			this.inicializarActualizarBindingDetalleChequeGirado(false);

			//if(DetalleChequeGiradoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleChequeGirado(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPeriodoDetalleChequeGiradoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleChequeGirado(false,false);

			this.getDetalleChequeGiradosFK_IdPeriodo();

			this.inicializarActualizarBindingDetalleChequeGirado(false);

			//if(DetalleChequeGiradoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleChequeGirado(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalDetalleChequeGiradoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleChequeGirado(false,false);

			this.getDetalleChequeGiradosFK_IdSucursal();

			this.inicializarActualizarBindingDetalleChequeGirado(false);

			//if(DetalleChequeGiradoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleChequeGirado(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallechequegiradoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameDetalleChequeGirado() {
		if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) {
			this.jInternalFrameDetalleFormDetalleChequeGirado.setVisible(false);	    			
			this.jInternalFrameDetalleFormDetalleChequeGirado.dispose();
			this.jInternalFrameDetalleFormDetalleChequeGirado=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoDetalleChequeGirado!=null) {
			this.jInternalFrameReporteDinamicoDetalleChequeGirado.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoDetalleChequeGirado.dispose();
			this.jInternalFrameReporteDinamicoDetalleChequeGirado=null;
		}
		
		if(this.jInternalFrameImportacionDetalleChequeGirado!=null) {
			this.jInternalFrameImportacionDetalleChequeGirado.setVisible(false);	    			
			this.jInternalFrameImportacionDetalleChequeGirado.dispose();
			this.jInternalFrameImportacionDetalleChequeGirado=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessDetalleChequeGirado();
			
			DetalleChequeGiradoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallechequegirado,new Object(),this.detallechequegiradoParameterGeneral,this.detallechequegiradoReturnGeneral);
			
			
			if(sTipo.equals("NuevoDetalleChequeGirado")) {
				jButtonNuevoDetalleChequeGiradoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarDetalleChequeGirado")) {
				jButtonDuplicarDetalleChequeGiradoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarDetalleChequeGirado")) {
				jButtonCopiarDetalleChequeGiradoActionPerformed(evt);
			} else if(sTipo.equals("VerFormDetalleChequeGirado")) {
				jButtonVerFormDetalleChequeGiradoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarDetalleChequeGirado")) {
				jButtonNuevoDetalleChequeGiradoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarDetalleChequeGirado")) {
				jButtonDuplicarDetalleChequeGiradoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoDetalleChequeGirado")) {
				jButtonNuevoDetalleChequeGiradoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarDetalleChequeGirado")) {
				jButtonDuplicarDetalleChequeGiradoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesDetalleChequeGirado")) {
				jButtonNuevoDetalleChequeGiradoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarDetalleChequeGirado")) {
				jButtonNuevoDetalleChequeGiradoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesDetalleChequeGirado")) {
				jButtonNuevoDetalleChequeGiradoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarDetalleChequeGirado")) {
				jButtonModificarDetalleChequeGiradoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarDetalleChequeGirado")) {
				jButtonModificarDetalleChequeGiradoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarDetalleChequeGirado")) {
				jButtonModificarDetalleChequeGiradoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarDetalleChequeGirado")) {
				jButtonActualizarDetalleChequeGiradoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarDetalleChequeGirado")) {
				jButtonActualizarDetalleChequeGiradoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarDetalleChequeGirado")) {
				jButtonActualizarDetalleChequeGiradoActionPerformed(evt);
			} else if(sTipo.equals("EliminarDetalleChequeGirado")) {
				jButtonEliminarDetalleChequeGiradoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarDetalleChequeGirado")) {
				jButtonEliminarDetalleChequeGiradoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarDetalleChequeGirado")) {
				jButtonEliminarDetalleChequeGiradoActionPerformed(evt);
			} else if(sTipo.equals("CancelarDetalleChequeGirado")) {
				jButtonCancelarDetalleChequeGiradoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarDetalleChequeGirado")) {
				jButtonCancelarDetalleChequeGiradoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarDetalleChequeGirado")) {
				jButtonCancelarDetalleChequeGiradoActionPerformed(evt);
			} else if(sTipo.equals("CerrarDetalleChequeGirado")) {
				jButtonCerrarDetalleChequeGiradoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarDetalleChequeGirado")) {
				jButtonCerrarDetalleChequeGiradoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarDetalleChequeGirado")) {
				jButtonCerrarDetalleChequeGiradoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarDetalleChequeGirado")) {
				jButtonMostrarOcultarDetalleChequeGiradoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarDetalleChequeGirado")) {
				jButtonCancelarDetalleChequeGiradoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosDetalleChequeGirado")) {
				jButtonGuardarCambiosDetalleChequeGiradoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarDetalleChequeGirado")) {
				jButtonGuardarCambiosDetalleChequeGiradoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarDetalleChequeGirado")) {
				jButtonCopiarDetalleChequeGiradoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarDetalleChequeGirado")) {
				jButtonVerFormDetalleChequeGiradoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosDetalleChequeGirado")) {
				jButtonGuardarCambiosDetalleChequeGiradoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarDetalleChequeGirado")) {
				jButtonCopiarDetalleChequeGiradoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormDetalleChequeGirado")) {
				jButtonVerFormDetalleChequeGiradoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaDetalleChequeGirado")) {
				jButtonGuardarCambiosDetalleChequeGiradoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarDetalleChequeGirado")) {
				jButtonGuardarCambiosDetalleChequeGiradoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaDetalleChequeGirado")) {
				jButtonGuardarCambiosDetalleChequeGiradoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionDetalleChequeGirado")) {
				jButtonRecargarInformacionDetalleChequeGiradoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarDetalleChequeGirado")) {
				jButtonRecargarInformacionDetalleChequeGiradoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionDetalleChequeGirado")) {
				jButtonRecargarInformacionDetalleChequeGiradoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresDetalleChequeGirado")) {
				jButtonAnterioresDetalleChequeGiradoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarDetalleChequeGirado")) {
				jButtonAnterioresDetalleChequeGiradoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreDetalleChequeGirado")) {
				jButtonAnterioresDetalleChequeGiradoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesDetalleChequeGirado")) {
				jButtonSiguientesDetalleChequeGiradoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarDetalleChequeGirado")) {
				jButtonSiguientesDetalleChequeGiradoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesDetalleChequeGirado")) {
				jButtonSiguientesDetalleChequeGiradoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByDetalleChequeGirado") || sTipo.equals("MenuItemDetalleAbrirOrderByDetalleChequeGirado")) {
				jButtonAbrirOrderByDetalleChequeGiradoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarDetalleChequeGirado") || sTipo.equals("MenuItemDetalleMostrarOcultarDetalleChequeGirado")) {
				jButtonMostrarOcultarDetalleChequeGiradoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosDetalleChequeGirado")) {
				jButtonNuevoGuardarCambiosDetalleChequeGiradoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarDetalleChequeGirado")) {
				jButtonNuevoGuardarCambiosDetalleChequeGiradoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosDetalleChequeGirado")) {
				jButtonNuevoGuardarCambiosDetalleChequeGiradoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoDetalleChequeGirado")) {
				jButtonCerrarReporteDinamicoDetalleChequeGiradoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoDetalleChequeGirado")) {
				jButtonGenerarReporteDinamicoDetalleChequeGiradoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoDetalleChequeGirado")) {
				
				jButtonGenerarExcelReporteDinamicoDetalleChequeGiradoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionDetalleChequeGirado")) {
				jButtonCerrarImportacionDetalleChequeGiradoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionDetalleChequeGirado")) {
				
				jButtonGenerarImportacionDetalleChequeGiradoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionDetalleChequeGirado")) {
				
				jButtonAbrirImportacionDetalleChequeGiradoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesDetalleChequeGirado")) {
				jComboBoxTiposAccionesDetalleChequeGiradoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesDetalleChequeGirado")) {
				jComboBoxTiposRelacionesDetalleChequeGiradoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioDetalleChequeGirado")) {
				jComboBoxTiposAccionesDetalleChequeGiradoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarDetalleChequeGirado")) {
				
				jComboBoxTiposSeleccionarDetalleChequeGiradoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralDetalleChequeGirado")) {
				jTextFieldValorCampoGeneralDetalleChequeGiradoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByDetalleChequeGirado")) {
				jButtonAbrirOrderByDetalleChequeGiradoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarDetalleChequeGirado")) {
				jButtonAbrirOrderByDetalleChequeGiradoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByDetalleChequeGirado")) {
				jButtonCerrarOrderByDetalleChequeGiradoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDetalleChequeGiradoBusqueda")) {
				this.jButtonidDetalleChequeGiradoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaDetalleChequeGiradoUpdate")) {
				this.jButtonid_empresaDetalleChequeGiradoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaDetalleChequeGiradoBusqueda")) {
				this.jButtonid_empresaDetalleChequeGiradoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalDetalleChequeGiradoUpdate")) {
				this.jButtonid_sucursalDetalleChequeGiradoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalDetalleChequeGiradoBusqueda")) {
				this.jButtonid_sucursalDetalleChequeGiradoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioDetalleChequeGiradoUpdate")) {
				this.jButtonid_ejercicioDetalleChequeGiradoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioDetalleChequeGiradoBusqueda")) {
				this.jButtonid_ejercicioDetalleChequeGiradoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoDetalleChequeGiradoUpdate")) {
				this.jButtonid_periodoDetalleChequeGiradoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoDetalleChequeGiradoBusqueda")) {
				this.jButtonid_periodoDetalleChequeGiradoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_asiento_contableDetalleChequeGirado")) {
				this.jButtonid_asiento_contableDetalleChequeGiradoActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_asiento_contableDetalleChequeGiradoUpdate")) {
				this.jButtonid_asiento_contableDetalleChequeGiradoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_asiento_contableDetalleChequeGiradoBusqueda")) {
				this.jButtonid_asiento_contableDetalleChequeGiradoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_empleadoDetalleChequeGirado")) {
				this.jButtonid_empleadoDetalleChequeGiradoActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoDetalleChequeGiradoUpdate")) {
				this.jButtonid_empleadoDetalleChequeGiradoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoDetalleChequeGiradoBusqueda")) {
				this.jButtonid_empleadoDetalleChequeGiradoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_bancoDetalleChequeGiradoUpdate")) {
				this.jButtonid_cuenta_bancoDetalleChequeGiradoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_bancoDetalleChequeGiradoBusqueda")) {
				this.jButtonid_cuenta_bancoDetalleChequeGiradoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_chequeDetalleChequeGiradoBusqueda")) {
				this.jButtonnumero_chequeDetalleChequeGiradoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorDetalleChequeGiradoBusqueda")) {
				this.jButtonvalorDetalleChequeGiradoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cuentaDetalleChequeGiradoBusqueda")) {
				this.jButtoncuentaDetalleChequeGiradoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaDetalleChequeGiradoBusqueda")) {
				this.jButtonfechaDetalleChequeGiradoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("conDetalleChequeGiradoBusqueda")) {
				this.jButtonconDetalleChequeGiradoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("beneficiarioDetalleChequeGiradoBusqueda")) {
				this.jButtonbeneficiarioDetalleChequeGiradoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoDetalleChequeGiradoBusqueda")) {
				this.jButtoncodigoDetalleChequeGiradoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_bancoDetalleChequeGiradoBusqueda")) {
				this.jButtonnombre_bancoDetalleChequeGiradoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioDetalleChequeGiradoUpdate")) {
				this.jButtonid_anioDetalleChequeGiradoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioDetalleChequeGiradoBusqueda")) {
				this.jButtonid_anioDetalleChequeGiradoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesDetalleChequeGiradoUpdate")) {
				this.jButtonid_mesDetalleChequeGiradoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesDetalleChequeGiradoBusqueda")) {
				this.jButtonid_mesDetalleChequeGiradoBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_asiento_contableDetalleChequeGirado")) {
				this.jButtonid_asiento_contableDetalleChequeGiradoActionPerformed(evt);
			}
			else if(sTipo.equals("id_empleadoDetalleChequeGirado")) {
				this.jButtonid_empleadoDetalleChequeGiradoActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdAsientoContableDetalleChequeGirado")) {
				this.jButtonFK_IdAsientoContableDetalleChequeGiradoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdCuentaBancoDetalleChequeGirado")) {
				this.jButtonFK_IdCuentaBancoDetalleChequeGiradoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdEmpleadoDetalleChequeGirado")) {
				this.jButtonFK_IdEmpleadoDetalleChequeGiradoActionPerformed(evt);
			}
			
			;
			
			
			DetalleChequeGiradoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallechequegirado,new Object(),this.detallechequegiradoParameterGeneral,this.detallechequegiradoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessDetalleChequeGirado();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleChequeGiradoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallechequegirado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallechequegirado);
				
				DetalleChequeGiradoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallechequegirado,new Object(),this.detallechequegiradoParameterGeneral,this.detallechequegiradoReturnGeneral);
				
				


				
				DetalleChequeGiradoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallechequegirado,new Object(),this.detallechequegiradoParameterGeneral,this.detallechequegiradoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleChequeGirado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleChequeGirado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			DetalleChequeGirado detallechequegiradoLocal=null;
			
			if(!this.getEsControlTabla()) {
				detallechequegiradoLocal=this.detallechequegirado;
			} else {
				detallechequegiradoLocal=this.detallechequegiradoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallechequegirado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallechequegirado);
				
				DetalleChequeGiradoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallechequegirado,new Object(),this.detallechequegiradoParameterGeneral,this.detallechequegiradoReturnGeneral);
							
				
				


				
				DetalleChequeGiradoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallechequegirado,new Object(),this.detallechequegiradoParameterGeneral,this.detallechequegiradoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleChequeGirado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleChequeGirado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleChequeGiradoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleChequeGirado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegiradoAnterior =(DetalleChequeGirado) this.detallechequegiradoLogic.getDetalleChequeGirados().toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallechequegiradoAnterior =(DetalleChequeGirado) this.detallechequegirados.toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
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
			
			DetalleChequeGiradoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallechequegirado,new Object(),this.detallechequegiradoParameterGeneral,this.detallechequegiradoReturnGeneral);
			
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
			
			


			
			DetalleChequeGiradoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallechequegirado,new Object(),this.detallechequegiradoParameterGeneral,this.detallechequegiradoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleChequeGiradoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallechequegirado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallechequegirado);
				
				DetalleChequeGiradoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallechequegirado,new Object(),this.detallechequegiradoParameterGeneral,this.detallechequegiradoReturnGeneral);
								
						
				


				
				DetalleChequeGiradoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallechequegirado,new Object(),this.detallechequegiradoParameterGeneral,this.detallechequegiradoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleChequeGirado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleChequeGirado.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallechequegirado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallechequegirado);
				
				DetalleChequeGiradoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallechequegirado,new Object(),this.detallechequegiradoParameterGeneral,this.detallechequegiradoReturnGeneral);
								
				
				


				
				DetalleChequeGiradoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallechequegirado,new Object(),this.detallechequegiradoParameterGeneral,this.detallechequegiradoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleChequeGirado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleChequeGirado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleChequeGiradoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleChequeGirado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegiradoAnterior =(DetalleChequeGirado) this.detallechequegiradoLogic.getDetalleChequeGirados().toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallechequegiradoAnterior =(DetalleChequeGirado) this.detallechequegirados.toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallechequegirado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallechequegirado);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleChequeGiradoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleChequeGirado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegiradoAnterior =(DetalleChequeGirado) this.detallechequegiradoLogic.getDetalleChequeGirados().toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallechequegiradoAnterior =(DetalleChequeGirado) this.detallechequegirados.toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleChequeGiradoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.detallechequegirado);
			
			this.actualizarInformacion("INFO_PADRE",false,this.detallechequegirado);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallechequegirado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallechequegirado);
				
				DetalleChequeGiradoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallechequegirado,new Object(),this.detallechequegiradoParameterGeneral,this.detallechequegiradoReturnGeneral);
							
				
				


				
				DetalleChequeGiradoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallechequegirado,new Object(),this.detallechequegiradoParameterGeneral,this.detallechequegiradoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleChequeGirado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleChequeGirado.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleChequeGiradoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDetalleChequeGirado.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallechequegiradoAnterior =(DetalleChequeGirado) this.detallechequegiradoLogic.getDetalleChequeGirados().toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.detallechequegiradoAnterior =(DetalleChequeGirado) this.detallechequegirados.toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
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
			
			DetalleChequeGiradoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallechequegirado,new Object(),this.detallechequegiradoParameterGeneral,this.detallechequegiradoReturnGeneral);
			
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
			
			


			
			DetalleChequeGiradoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallechequegirado,new Object(),this.detallechequegiradoParameterGeneral,this.detallechequegiradoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleChequeGiradoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.detallechequegirado);
			
			this.actualizarInformacion("INFO_PADRE",false,this.detallechequegirado);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallechequegirado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallechequegirado);
				
				DetalleChequeGiradoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallechequegirado,new Object(),this.detallechequegiradoParameterGeneral,this.detallechequegiradoReturnGeneral);
								
				
				


				
				DetalleChequeGiradoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallechequegirado,new Object(),this.detallechequegiradoParameterGeneral,this.detallechequegiradoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleChequeGirado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleChequeGirado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleChequeGiradoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleChequeGirado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegiradoAnterior =(DetalleChequeGirado) this.detallechequegiradoLogic.getDetalleChequeGirados().toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallechequegiradoAnterior =(DetalleChequeGirado) this.detallechequegirados.toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleChequeGiradoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.detallechequegirado);
			
			this.actualizarInformacion("INFO_PADRE",false,this.detallechequegirado);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleChequeGiradoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallechequegirado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallechequegirado);
				
				DetalleChequeGiradoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallechequegirado,new Object(),this.detallechequegiradoParameterGeneral,this.detallechequegiradoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosDetalleChequeGirado")) {
					jCheckBoxSeleccionarTodosDetalleChequeGiradoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosDetalleChequeGirado")) {
					jCheckBoxSeleccionadosDetalleChequeGiradoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarDetalleChequeGirado")) {
					
				}
				
				


				
				
				DetalleChequeGiradoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallechequegirado,new Object(),this.detallechequegiradoParameterGeneral,this.detallechequegiradoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleChequeGirado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleChequeGirado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.detallechequegirado);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.detallechequegirado);
				
				DetalleChequeGiradoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallechequegirado,new Object(),this.detallechequegiradoParameterGeneral,this.detallechequegiradoReturnGeneral);
												
				
				


				
				
				DetalleChequeGiradoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallechequegirado,new Object(),this.detallechequegiradoParameterGeneral,this.detallechequegiradoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleChequeGirado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleChequeGirado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleChequeGiradoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDetalleChequeGirado.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallechequegiradoAnterior =(DetalleChequeGirado) this.detallechequegiradoLogic.getDetalleChequeGirados().toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.detallechequegiradoAnterior =(DetalleChequeGirado) this.detallechequegirados.toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleChequeGiradoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallechequegirado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallechequegirado);
				
				DetalleChequeGiradoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallechequegirado,new Object(),this.detallechequegiradoParameterGeneral,this.detallechequegiradoReturnGeneral);
				
				
				DetalleChequeGiradoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallechequegirado,new Object(),this.detallechequegiradoParameterGeneral,this.detallechequegiradoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
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
			
			DetalleChequeGiradoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.detallechequegirado,new Object(),this.detallechequegiradoParameterGeneral,this.detallechequegiradoReturnGeneral);
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
			
			


			
			DetalleChequeGiradoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallechequegirado,new Object(),this.detallechequegiradoParameterGeneral,this.detallechequegiradoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleChequeGiradoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallechequegirado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallechequegirado);
				
				DetalleChequeGiradoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.detallechequegirado,new Object(),this.detallechequegiradoParameterGeneral,this.detallechequegiradoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				DetalleChequeGiradoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallechequegirado,new Object(),this.detallechequegiradoParameterGeneral,this.detallechequegiradoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleChequeGirado.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleChequeGirado.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallechequegirado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallechequegirado);
				
				DetalleChequeGiradoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.detallechequegirado,new Object(),this.detallechequegiradoParameterGeneral,this.detallechequegiradoReturnGeneral);
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
				
				


				
				DetalleChequeGiradoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallechequegirado,new Object(),this.detallechequegiradoParameterGeneral,this.detallechequegiradoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleChequeGirado.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleChequeGirado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleChequeGiradoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleChequeGirado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallechequegiradoAnterior =(DetalleChequeGirado) this.detallechequegiradoLogic.getDetalleChequeGirados().toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallechequegiradoAnterior =(DetalleChequeGirado) this.detallechequegirados.toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				DetalleChequeGiradoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallechequegirado,new Object(),this.detallechequegiradoParameterGeneral,this.detallechequegiradoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarDetalleChequeGirado")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosDetalleChequeGiradoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosDetalleChequeGirado.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.detallechequegirado =(DetalleChequeGirado) this.detallechequegiradoLogic.getDetalleChequeGirados().toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.detallechequegirado =(DetalleChequeGirado) this.detallechequegirados.toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.detallechequegirado);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarDetalleChequeGirado")) {
				
				}
				
				DetalleChequeGiradoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallechequegirado,new Object(),this.detallechequegiradoParameterGeneral,this.detallechequegiradoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			DetalleChequeGiradoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.detallechequegirado,new Object(),this.detallechequegiradoParameterGeneral,this.detallechequegiradoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarDetalleChequeGirado")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosDetalleChequeGirado.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarDetalleChequeGirado")) {
			
			}
			
			DetalleChequeGiradoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.detallechequegirado,new Object(),this.detallechequegiradoParameterGeneral,this.detallechequegiradoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessDetalleChequeGirado();
			
			DetalleChequeGiradoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallechequegirado,new Object(),this.detallechequegiradoParameterGeneral,this.detallechequegiradoReturnGeneral);
			
			if(sTipo.equals("NuevoDetalleChequeGirado")) {
				jButtonNuevoDetalleChequeGiradoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarDetalleChequeGirado")) {
				jButtonDuplicarDetalleChequeGiradoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarDetalleChequeGirado")) {
				jButtonCopiarDetalleChequeGiradoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormDetalleChequeGirado")) {
				jButtonVerFormDetalleChequeGiradoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesDetalleChequeGirado")) {
				jButtonNuevoDetalleChequeGiradoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarDetalleChequeGirado")) {
				jButtonModificarDetalleChequeGiradoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarDetalleChequeGirado")) {
				jButtonActualizarDetalleChequeGiradoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarDetalleChequeGirado")) {
				jButtonEliminarDetalleChequeGiradoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaDetalleChequeGirado")) {
				jButtonGuardarCambiosDetalleChequeGiradoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarDetalleChequeGirado")) {
				jButtonCancelarDetalleChequeGiradoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarDetalleChequeGirado")) {
				jButtonCerrarDetalleChequeGiradoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosDetalleChequeGirado")) {
				jButtonGuardarCambiosDetalleChequeGiradoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosDetalleChequeGirado")) {
				jButtonNuevoGuardarCambiosDetalleChequeGiradoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByDetalleChequeGirado")) {
				jButtonAbrirOrderByDetalleChequeGiradoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionDetalleChequeGirado")) {
				jButtonRecargarInformacionDetalleChequeGiradoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresDetalleChequeGirado")) {
				jButtonAnterioresDetalleChequeGiradoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesDetalleChequeGirado")) {
				jButtonSiguientesDetalleChequeGiradoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDetalleChequeGiradoBusqueda")) {
				this.jButtonidDetalleChequeGiradoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaDetalleChequeGiradoUpdate")) {
				this.jButtonid_empresaDetalleChequeGiradoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaDetalleChequeGiradoBusqueda")) {
				this.jButtonid_empresaDetalleChequeGiradoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalDetalleChequeGiradoUpdate")) {
				this.jButtonid_sucursalDetalleChequeGiradoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalDetalleChequeGiradoBusqueda")) {
				this.jButtonid_sucursalDetalleChequeGiradoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioDetalleChequeGiradoUpdate")) {
				this.jButtonid_ejercicioDetalleChequeGiradoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioDetalleChequeGiradoBusqueda")) {
				this.jButtonid_ejercicioDetalleChequeGiradoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoDetalleChequeGiradoUpdate")) {
				this.jButtonid_periodoDetalleChequeGiradoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoDetalleChequeGiradoBusqueda")) {
				this.jButtonid_periodoDetalleChequeGiradoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_asiento_contableDetalleChequeGirado")) {
				this.jButtonid_asiento_contableDetalleChequeGiradoActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_asiento_contableDetalleChequeGiradoUpdate")) {
				this.jButtonid_asiento_contableDetalleChequeGiradoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_asiento_contableDetalleChequeGiradoBusqueda")) {
				this.jButtonid_asiento_contableDetalleChequeGiradoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_empleadoDetalleChequeGirado")) {
				this.jButtonid_empleadoDetalleChequeGiradoActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoDetalleChequeGiradoUpdate")) {
				this.jButtonid_empleadoDetalleChequeGiradoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoDetalleChequeGiradoBusqueda")) {
				this.jButtonid_empleadoDetalleChequeGiradoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_bancoDetalleChequeGiradoUpdate")) {
				this.jButtonid_cuenta_bancoDetalleChequeGiradoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_bancoDetalleChequeGiradoBusqueda")) {
				this.jButtonid_cuenta_bancoDetalleChequeGiradoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_chequeDetalleChequeGiradoBusqueda")) {
				this.jButtonnumero_chequeDetalleChequeGiradoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorDetalleChequeGiradoBusqueda")) {
				this.jButtonvalorDetalleChequeGiradoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cuentaDetalleChequeGiradoBusqueda")) {
				this.jButtoncuentaDetalleChequeGiradoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaDetalleChequeGiradoBusqueda")) {
				this.jButtonfechaDetalleChequeGiradoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("conDetalleChequeGiradoBusqueda")) {
				this.jButtonconDetalleChequeGiradoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("beneficiarioDetalleChequeGiradoBusqueda")) {
				this.jButtonbeneficiarioDetalleChequeGiradoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoDetalleChequeGiradoBusqueda")) {
				this.jButtoncodigoDetalleChequeGiradoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_bancoDetalleChequeGiradoBusqueda")) {
				this.jButtonnombre_bancoDetalleChequeGiradoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioDetalleChequeGiradoUpdate")) {
				this.jButtonid_anioDetalleChequeGiradoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioDetalleChequeGiradoBusqueda")) {
				this.jButtonid_anioDetalleChequeGiradoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesDetalleChequeGiradoUpdate")) {
				this.jButtonid_mesDetalleChequeGiradoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesDetalleChequeGiradoBusqueda")) {
				this.jButtonid_mesDetalleChequeGiradoBusquedaActionPerformed(evt);
			}
			
			DetalleChequeGiradoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallechequegirado,new Object(),this.detallechequegiradoParameterGeneral,this.detallechequegiradoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessDetalleChequeGirado();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			DetalleChequeGiradoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.detallechequegirado,new Object(),this.detallechequegiradoParameterGeneral,this.detallechequegiradoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameDetalleChequeGirado")) {
				closingInternalFrameDetalleChequeGirado();
				
			} else if(sTipo.equals("jButtonCancelarDetalleChequeGirado")) {
				JInternalFrameBase jInternalFrameDetalleFormDetalleChequeGirado = (JInternalFrameBase)evt.getSource();
	            	
	            DetalleChequeGiradoBeanSwingJInternalFrame jInternalFrameParent=(DetalleChequeGiradoBeanSwingJInternalFrame)jInternalFrameDetalleFormDetalleChequeGirado.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarDetalleChequeGiradoActionPerformed(null);
			}
			
			DetalleChequeGiradoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.detallechequegirado,new Object(),this.detallechequegiradoParameterGeneral,this.detallechequegiradoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormDetalleChequeGirado(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormDetalleChequeGirado(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormDetalleChequeGirado(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.detallechequegirado)) {
			if(!esControlTabla) {
				if(DetalleChequeGiradoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualDetalleChequeGirado(this.detallechequegirado,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleChequeGirado(this.detallechequegirado);			
				}
				
				if(this.detallechequegiradoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualDetalleChequeGirado(this.detallechequegirado,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.detallechequegiradoReturnGeneral=detallechequegiradoLogic.procesarEventosDetalleChequeGiradosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detallechequegiradoLogic.getDetalleChequeGirados(),this.detallechequegirado,this.detallechequegiradoParameterGeneral,this.isEsNuevoDetalleChequeGirado,classes);//this.detallechequegiradoLogic.getDetalleChequeGirado()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanDetalleChequeGirado(this.detallechequegiradoReturnGeneral,this.detallechequegiradoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.detallechequegiradoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanDetalleChequeGirado(classes,this.detallechequegiradoReturnGeneral,this.detallechequegiradoBean,false);
					}
						
					if(this.detallechequegiradoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyDetalleChequeGirado(this.detallechequegiradoReturnGeneral.getDetalleChequeGirado());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioDetalleChequeGirado(this.detallechequegiradoReturnGeneral.getDetalleChequeGirado());	
					}
						
					if(this.detallechequegiradoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioDetalleChequeGirado(this.detallechequegiradoReturnGeneral.getDetalleChequeGirado(),classes);//this.detallechequegiradoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioDetalleChequeGirado(this.detallechequegirado,classes);//this.detallechequegiradoBean);									
				}
			
				if(DetalleChequeGiradoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualDetalleChequeGirado(this.detallechequegirado,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleChequeGirado(this.detallechequegirado);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.detallechequegiradoAnterior!=null) {
						this.detallechequegirado=this.detallechequegiradoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.detallechequegiradoReturnGeneral=detallechequegiradoLogic.procesarEventosDetalleChequeGiradosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detallechequegiradoLogic.getDetalleChequeGirados(),this.detallechequegirado,this.detallechequegiradoParameterGeneral,this.isEsNuevoDetalleChequeGirado,classes);//this.detallechequegiradoLogic.getDetalleChequeGirado()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.detallechequegiradoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.detallechequegiradoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.detallechequegiradoReturnGeneral.getDetalleChequeGirado(),detallechequegiradoLogic.getDetalleChequeGirados());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.detallechequegiradoReturnGeneral.getDetalleChequeGirado(),this.detallechequegirados);
				}
				//ARCHITECTURE
				
				//this.jTableDatosDetalleChequeGirado.repaint();
				
				//((AbstractTableModel) this.jTableDatosDetalleChequeGirado.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosDetalleChequeGirado();
			}
		}
	}
	
	public void actualizarVisualTableDatosDetalleChequeGirado() throws Exception {
		
		DetalleChequeGiradoModel detallechequegiradoModel=(DetalleChequeGiradoModel)this.jTableDatosDetalleChequeGirado.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			detallechequegiradoModel.detallechequegirados=this.detallechequegiradoLogic.getDetalleChequeGirados();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			detallechequegiradoModel.detallechequegirados=this.detallechequegirados;
		}
		
		
		((DetalleChequeGiradoModel) this.jTableDatosDetalleChequeGirado.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaDetalleChequeGirado() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getdetallechequegiradoAnterior(),this.detallechequegiradoLogic.getDetalleChequeGirados());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getdetallechequegiradoAnterior(),this.detallechequegirados);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosDetalleChequeGirado();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioDetalleChequeGirado(DetalleChequeGirado detallechequegirado,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
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
										
				DetalleChequeGiradoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detallechequegirado,new Object(),generalEntityParameterGeneral,this.detallechequegiradoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.detallechequegiradoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=DetalleChequeGiradoConstantesFunciones.getClassesRelationshipsOfDetalleChequeGirado(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=DetalleChequeGiradoConstantesFunciones.getClassesRelationshipsFromStringsOfDetalleChequeGirado(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormDetalleChequeGirado(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				DetalleChequeGiradoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detallechequegirado,new Object(),generalEntityParameterGeneral,this.detallechequegiradoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioDetalleChequeGirado(DetalleChequeGiradoBean detallechequegiradoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanDetalleChequeGirado(ArrayList<Classe> classes,DetalleChequeGiradoReturnGeneral detallechequegiradoReturnGeneral,DetalleChequeGiradoBean detallechequegiradoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualDetalleChequeGirado(DetalleChequeGirado detallechequegirado,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.detallechequegirado)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormDetalleChequeGirado = new DetalleChequeGiradoDetalleFormJInternalFrame(jDesktopPane,this.detallechequegiradoSessionBean.getConGuardarRelaciones(),this.detallechequegiradoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormDetalleChequeGirado);
		this.jInternalFrameDetalleFormDetalleChequeGirado.setVisible(false);
		this.jInternalFrameDetalleFormDetalleChequeGirado.setSelected(false);						
		
		this.jInternalFrameDetalleFormDetalleChequeGirado.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormDetalleChequeGirado.detallechequegiradoLogic=this.detallechequegiradoLogic;
		
		this.cargarCombosFrameForeignKeyDetalleChequeGirado("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleDetalleChequeGirado();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDetalleChequeGirado();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyDetalleChequeGirado("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyDetalleChequeGirado();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormDetalleChequeGirado.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDetalleChequeGirado"));
		
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonModificarDetalleChequeGirado.addActionListener(new ButtonActionListener(this,"ModificarDetalleChequeGirado"));

		
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonModificarToolBarDetalleChequeGirado.addActionListener(new ButtonActionListener(this,"ModificarToolBarDetalleChequeGirado"));
					
		this.jInternalFrameDetalleFormDetalleChequeGirado.jMenuItemModificarDetalleChequeGirado.addActionListener(new ButtonActionListener(this,"MenuItemModificarDetalleChequeGirado"));		
		
		
		
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonActualizarDetalleChequeGirado.addActionListener (new ButtonActionListener(this,"ActualizarDetalleChequeGirado"));
		
		
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonActualizarToolBarDetalleChequeGirado.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDetalleChequeGirado"));
						
		this.jInternalFrameDetalleFormDetalleChequeGirado.jMenuItemActualizarDetalleChequeGirado.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDetalleChequeGirado"));		
		
		
		
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonEliminarDetalleChequeGirado.addActionListener (new ButtonActionListener(this,"EliminarDetalleChequeGirado"));
		
		
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonEliminarToolBarDetalleChequeGirado.addActionListener (new ButtonActionListener(this,"EliminarToolBarDetalleChequeGirado"));
								
		this.jInternalFrameDetalleFormDetalleChequeGirado.jMenuItemEliminarDetalleChequeGirado.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDetalleChequeGirado"));		
		
		
		
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonCancelarDetalleChequeGirado.addActionListener (new ButtonActionListener(this,"CancelarDetalleChequeGirado"));
		
		
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonCancelarToolBarDetalleChequeGirado.addActionListener (new ButtonActionListener(this,"CancelarToolBarDetalleChequeGirado"));
					
		this.jInternalFrameDetalleFormDetalleChequeGirado.jMenuItemCancelarDetalleChequeGirado.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDetalleChequeGirado"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormDetalleChequeGirado.jMenuItemDetalleCerrarDetalleChequeGirado.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDetalleChequeGirado"));		
		
		
		
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonGuardarCambiosToolBarDetalleChequeGirado.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDetalleChequeGirado"));
		
		
		
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonGuardarCambiosToolBarDetalleChequeGirado.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDetalleChequeGirado"));
		
		
		
		this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxTiposAccionesFormularioDetalleChequeGirado.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDetalleChequeGirado"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonidDetalleChequeGiradoBusqueda.addActionListener(new ButtonActionListener(this,"idDetalleChequeGiradoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonid_empresaDetalleChequeGiradoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDetalleChequeGiradoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonid_empresaDetalleChequeGiradoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDetalleChequeGiradoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonid_sucursalDetalleChequeGiradoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalDetalleChequeGiradoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonid_sucursalDetalleChequeGiradoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalDetalleChequeGiradoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonid_ejercicioDetalleChequeGiradoUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioDetalleChequeGiradoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonid_ejercicioDetalleChequeGiradoBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioDetalleChequeGiradoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonid_periodoDetalleChequeGiradoUpdate.addActionListener(new ButtonActionListener(this,"id_periodoDetalleChequeGiradoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonid_periodoDetalleChequeGiradoBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoDetalleChequeGiradoBusqueda"));
		//jButtonid_asiento_contableDetalleChequeGirado.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_asiento_contableDetalleChequeGiradoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonid_asiento_contableDetalleChequeGirado.addActionListener(new ButtonActionListener(this,"id_asiento_contableDetalleChequeGirado"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonid_asiento_contableDetalleChequeGiradoUpdate.addActionListener(new ButtonActionListener(this,"id_asiento_contableDetalleChequeGiradoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonid_asiento_contableDetalleChequeGiradoBusqueda.addActionListener(new ButtonActionListener(this,"id_asiento_contableDetalleChequeGiradoBusqueda"));
		//jButtonid_empleadoDetalleChequeGirado.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleadoDetalleChequeGiradoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonid_empleadoDetalleChequeGirado.addActionListener(new ButtonActionListener(this,"id_empleadoDetalleChequeGirado"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonid_empleadoDetalleChequeGiradoUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoDetalleChequeGiradoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonid_empleadoDetalleChequeGiradoBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoDetalleChequeGiradoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonid_cuenta_bancoDetalleChequeGiradoUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_bancoDetalleChequeGiradoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonid_cuenta_bancoDetalleChequeGiradoBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_bancoDetalleChequeGiradoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonnumero_chequeDetalleChequeGiradoBusqueda.addActionListener(new ButtonActionListener(this,"numero_chequeDetalleChequeGiradoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonvalorDetalleChequeGiradoBusqueda.addActionListener(new ButtonActionListener(this,"valorDetalleChequeGiradoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtoncuentaDetalleChequeGiradoBusqueda.addActionListener(new ButtonActionListener(this,"cuentaDetalleChequeGiradoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonfechaDetalleChequeGiradoBusqueda.addActionListener(new ButtonActionListener(this,"fechaDetalleChequeGiradoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonconDetalleChequeGiradoBusqueda.addActionListener(new ButtonActionListener(this,"conDetalleChequeGiradoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonbeneficiarioDetalleChequeGiradoBusqueda.addActionListener(new ButtonActionListener(this,"beneficiarioDetalleChequeGiradoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtoncodigoDetalleChequeGiradoBusqueda.addActionListener(new ButtonActionListener(this,"codigoDetalleChequeGiradoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonnombre_bancoDetalleChequeGiradoBusqueda.addActionListener(new ButtonActionListener(this,"nombre_bancoDetalleChequeGiradoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonid_anioDetalleChequeGiradoUpdate.addActionListener(new ButtonActionListener(this,"id_anioDetalleChequeGiradoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonid_anioDetalleChequeGiradoBusqueda.addActionListener(new ButtonActionListener(this,"id_anioDetalleChequeGiradoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonid_mesDetalleChequeGiradoUpdate.addActionListener(new ButtonActionListener(this,"id_mesDetalleChequeGiradoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonid_mesDetalleChequeGiradoBusqueda.addActionListener(new ButtonActionListener(this,"id_mesDetalleChequeGiradoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormDetalleChequeGirado.jTabbedPaneRelacionesDetalleChequeGirado.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDetalleChequeGirado"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameDetalleChequeGirado"));
		
		if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleChequeGirado.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDetalleChequeGirado"));
		}
		
		this.jTableDatosDetalleChequeGirado.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarDetalleChequeGirado"));
		
		this.jTableDatosDetalleChequeGirado.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarDetalleChequeGirado"));
		
		this.jButtonNuevoDetalleChequeGirado.addActionListener(new ButtonActionListener(this,"NuevoDetalleChequeGirado"));
		
		this.jButtonDuplicarDetalleChequeGirado.addActionListener(new ButtonActionListener(this,"DuplicarDetalleChequeGirado"));
		
		this.jButtonCopiarDetalleChequeGirado.addActionListener(new ButtonActionListener(this,"CopiarDetalleChequeGirado"));
		
		this.jButtonVerFormDetalleChequeGirado.addActionListener(new ButtonActionListener(this,"VerFormDetalleChequeGirado"));
		
		
		this.jButtonNuevoToolBarDetalleChequeGirado.addActionListener(new ButtonActionListener(this,"NuevoToolBarDetalleChequeGirado"));
			
		this.jButtonDuplicarToolBarDetalleChequeGirado.addActionListener(new ButtonActionListener(this,"DuplicarToolBarDetalleChequeGirado"));
			
		this.jMenuItemNuevoDetalleChequeGirado.addActionListener (new ButtonActionListener(this,"MenuItemNuevoDetalleChequeGirado"));
			
		this.jMenuItemDuplicarDetalleChequeGirado.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarDetalleChequeGirado"));		
		
		
		this.jButtonNuevoRelacionesDetalleChequeGirado.addActionListener (new ButtonActionListener(this,"NuevoRelacionesDetalleChequeGirado"));
		
		
		this.jButtonNuevoRelacionesToolBarDetalleChequeGirado.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarDetalleChequeGirado"));
			
		this.jMenuItemNuevoRelacionesDetalleChequeGirado.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesDetalleChequeGirado"));		
		
		
		if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonModificarDetalleChequeGirado.addActionListener(new ButtonActionListener(this,"ModificarDetalleChequeGirado"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonModificarToolBarDetalleChequeGirado.addActionListener(new ButtonActionListener(this,"ModificarToolBarDetalleChequeGirado"));
			
			this.jInternalFrameDetalleFormDetalleChequeGirado.jMenuItemModificarDetalleChequeGirado.addActionListener(new ButtonActionListener(this,"MenuItemModificarDetalleChequeGirado"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonActualizarDetalleChequeGirado.addActionListener (new ButtonActionListener(this,"ActualizarDetalleChequeGirado"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonActualizarToolBarDetalleChequeGirado.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDetalleChequeGirado"));
				
			this.jInternalFrameDetalleFormDetalleChequeGirado.jMenuItemActualizarDetalleChequeGirado.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDetalleChequeGirado"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonEliminarDetalleChequeGirado.addActionListener (new ButtonActionListener(this,"EliminarDetalleChequeGirado"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonEliminarToolBarDetalleChequeGirado.addActionListener (new ButtonActionListener(this,"EliminarToolBarDetalleChequeGirado"));
						
			this.jInternalFrameDetalleFormDetalleChequeGirado.jMenuItemEliminarDetalleChequeGirado.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDetalleChequeGirado"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonCancelarDetalleChequeGirado.addActionListener (new ButtonActionListener(this,"CancelarDetalleChequeGirado"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonCancelarToolBarDetalleChequeGirado.addActionListener (new ButtonActionListener(this,"CancelarToolBarDetalleChequeGirado"));
			
			this.jInternalFrameDetalleFormDetalleChequeGirado.jMenuItemCancelarDetalleChequeGirado.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDetalleChequeGirado"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarDetalleChequeGirado.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarDetalleChequeGirado"));		
		
		
		this.jButtonCerrarDetalleChequeGirado.addActionListener (new ButtonActionListener(this,"CerrarDetalleChequeGirado"));
		
		
		this.jButtonCerrarToolBarDetalleChequeGirado.addActionListener (new ButtonActionListener(this,"CerrarToolBarDetalleChequeGirado"));
			
		this.jMenuItemCerrarDetalleChequeGirado.addActionListener (new ButtonActionListener(this,"MenuItemCerrarDetalleChequeGirado"));
			
		if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleChequeGirado.jMenuItemDetalleCerrarDetalleChequeGirado.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDetalleChequeGirado"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonGuardarCambiosDetalleChequeGirado.addActionListener (new ButtonActionListener(this,"GuardarCambiosDetalleChequeGirado"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonGuardarCambiosToolBarDetalleChequeGirado.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDetalleChequeGirado"));
		}
		
		this.jButtonCopiarToolBarDetalleChequeGirado.addActionListener (new ButtonActionListener(this,"CopiarToolBarDetalleChequeGirado"));
			
		this.jButtonVerFormToolBarDetalleChequeGirado.addActionListener (new ButtonActionListener(this,"VerFormToolBarDetalleChequeGirado"));
		
		this.jMenuItemGuardarCambiosDetalleChequeGirado.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosDetalleChequeGirado"));
			
		this.jMenuItemCopiarDetalleChequeGirado.addActionListener (new ButtonActionListener(this,"MenuItemCopiarDetalleChequeGirado"));		
		
		this.jMenuItemVerFormDetalleChequeGirado.addActionListener (new ButtonActionListener(this,"MenuItemVerFormDetalleChequeGirado"));		
		
		
		this.jButtonGuardarCambiosTablaDetalleChequeGirado.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDetalleChequeGirado"));
		
		
		this.jButtonGuardarCambiosTablaToolBarDetalleChequeGirado.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarDetalleChequeGirado"));
			
		this.jMenuItemGuardarCambiosTablaDetalleChequeGirado.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDetalleChequeGirado"));		
		
		
		
		this.jButtonRecargarInformacionDetalleChequeGirado.addActionListener (new ButtonActionListener(this,"RecargarInformacionDetalleChequeGirado"));
					
		this.jButtonRecargarInformacionToolBarDetalleChequeGirado.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarDetalleChequeGirado"));
		
		this.jMenuItemRecargarInformacionDetalleChequeGirado.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionDetalleChequeGirado"));		
		
		
		
		this.jButtonAnterioresDetalleChequeGirado.addActionListener (new ButtonActionListener(this,"AnterioresDetalleChequeGirado"));
		
		
		this.jButtonAnterioresToolBarDetalleChequeGirado.addActionListener (new ButtonActionListener(this,"AnterioresToolBarDetalleChequeGirado"));
		
		this.jMenuItemAnterioresDetalleChequeGirado.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresDetalleChequeGirado"));		
		
		
		this.jButtonSiguientesDetalleChequeGirado.addActionListener (new ButtonActionListener(this,"SiguientesDetalleChequeGirado"));
		
		
		this.jButtonSiguientesToolBarDetalleChequeGirado.addActionListener (new ButtonActionListener(this,"SiguientesToolBarDetalleChequeGirado"));
			
		this.jMenuItemSiguientesDetalleChequeGirado.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesDetalleChequeGirado"));
			
		this.jMenuItemAbrirOrderByDetalleChequeGirado.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByDetalleChequeGirado"));
			
		this.jMenuItemMostrarOcultarDetalleChequeGirado.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarDetalleChequeGirado"));
			
		this.jMenuItemDetalleAbrirOrderByDetalleChequeGirado.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByDetalleChequeGirado"));
			
		this.jMenuItemDetalleMostarOcultarDetalleChequeGirado.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarDetalleChequeGirado"));		
		
		
		this.jButtonNuevoGuardarCambiosDetalleChequeGirado.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosDetalleChequeGirado"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarDetalleChequeGirado.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarDetalleChequeGirado"));
			
		this.jMenuItemNuevoGuardarCambiosDetalleChequeGirado.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosDetalleChequeGirado"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosDetalleChequeGirado.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosDetalleChequeGirado"));

		this.jCheckBoxSeleccionadosDetalleChequeGirado.addItemListener(new CheckBoxItemListener(this,"SeleccionadosDetalleChequeGirado"));
		
		if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxTiposAccionesFormularioDetalleChequeGirado.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDetalleChequeGirado"));
		}
		
		
		this.jComboBoxTiposRelacionesDetalleChequeGirado.addActionListener (new ButtonActionListener(this,"TiposRelacionesDetalleChequeGirado"));
			
		this.jComboBoxTiposAccionesDetalleChequeGirado.addActionListener (new ButtonActionListener(this,"TiposAccionesDetalleChequeGirado"));
					
		this.jComboBoxTiposSeleccionarDetalleChequeGirado.addActionListener (new ButtonActionListener(this,"TiposSeleccionarDetalleChequeGirado"));
			
		this.jTextFieldValorCampoGeneralDetalleChequeGirado.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralDetalleChequeGirado"));		
		
		
		if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonidDetalleChequeGiradoBusqueda.addActionListener(new ButtonActionListener(this,"idDetalleChequeGiradoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonid_empresaDetalleChequeGiradoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDetalleChequeGiradoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonid_empresaDetalleChequeGiradoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDetalleChequeGiradoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonid_sucursalDetalleChequeGiradoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalDetalleChequeGiradoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonid_sucursalDetalleChequeGiradoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalDetalleChequeGiradoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonid_ejercicioDetalleChequeGiradoUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioDetalleChequeGiradoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonid_ejercicioDetalleChequeGiradoBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioDetalleChequeGiradoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonid_periodoDetalleChequeGiradoUpdate.addActionListener(new ButtonActionListener(this,"id_periodoDetalleChequeGiradoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonid_periodoDetalleChequeGiradoBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoDetalleChequeGiradoBusqueda"));
		//jButtonid_asiento_contableDetalleChequeGirado.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_asiento_contableDetalleChequeGiradoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonid_asiento_contableDetalleChequeGirado.addActionListener(new ButtonActionListener(this,"id_asiento_contableDetalleChequeGirado"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonid_asiento_contableDetalleChequeGiradoUpdate.addActionListener(new ButtonActionListener(this,"id_asiento_contableDetalleChequeGiradoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonid_asiento_contableDetalleChequeGiradoBusqueda.addActionListener(new ButtonActionListener(this,"id_asiento_contableDetalleChequeGiradoBusqueda"));
		//jButtonid_empleadoDetalleChequeGirado.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleadoDetalleChequeGiradoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonid_empleadoDetalleChequeGirado.addActionListener(new ButtonActionListener(this,"id_empleadoDetalleChequeGirado"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonid_empleadoDetalleChequeGiradoUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoDetalleChequeGiradoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonid_empleadoDetalleChequeGiradoBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoDetalleChequeGiradoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonid_cuenta_bancoDetalleChequeGiradoUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_bancoDetalleChequeGiradoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonid_cuenta_bancoDetalleChequeGiradoBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_bancoDetalleChequeGiradoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonnumero_chequeDetalleChequeGiradoBusqueda.addActionListener(new ButtonActionListener(this,"numero_chequeDetalleChequeGiradoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonvalorDetalleChequeGiradoBusqueda.addActionListener(new ButtonActionListener(this,"valorDetalleChequeGiradoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtoncuentaDetalleChequeGiradoBusqueda.addActionListener(new ButtonActionListener(this,"cuentaDetalleChequeGiradoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonfechaDetalleChequeGiradoBusqueda.addActionListener(new ButtonActionListener(this,"fechaDetalleChequeGiradoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonconDetalleChequeGiradoBusqueda.addActionListener(new ButtonActionListener(this,"conDetalleChequeGiradoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonbeneficiarioDetalleChequeGiradoBusqueda.addActionListener(new ButtonActionListener(this,"beneficiarioDetalleChequeGiradoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtoncodigoDetalleChequeGiradoBusqueda.addActionListener(new ButtonActionListener(this,"codigoDetalleChequeGiradoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonnombre_bancoDetalleChequeGiradoBusqueda.addActionListener(new ButtonActionListener(this,"nombre_bancoDetalleChequeGiradoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonid_anioDetalleChequeGiradoUpdate.addActionListener(new ButtonActionListener(this,"id_anioDetalleChequeGiradoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonid_anioDetalleChequeGiradoBusqueda.addActionListener(new ButtonActionListener(this,"id_anioDetalleChequeGiradoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonid_mesDetalleChequeGiradoUpdate.addActionListener(new ButtonActionListener(this,"id_mesDetalleChequeGiradoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonid_mesDetalleChequeGiradoBusqueda.addActionListener(new ButtonActionListener(this,"id_mesDetalleChequeGiradoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdAsientoContableDetalleChequeGirado.addActionListener(new ButtonActionListener(this,"FK_IdAsientoContableDetalleChequeGirado"));

			this.jButtonBuscarFK_IdAsientoContableid_asiento_contableDetalleChequeGirado.addActionListener(new ButtonActionListener(this,"id_asiento_contableDetalleChequeGirado"));

			this.jButtonFK_IdCuentaBancoDetalleChequeGirado.addActionListener(new ButtonActionListener(this,"FK_IdCuentaBancoDetalleChequeGirado"));

			this.jButtonFK_IdEmpleadoDetalleChequeGirado.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoDetalleChequeGirado"));

			this.jButtonBuscarFK_IdEmpleadoid_empleadoDetalleChequeGirado.addActionListener(new ButtonActionListener(this,"id_empleadoDetalleChequeGirado"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoDetalleChequeGirado!=null) {
				this.jInternalFrameReporteDinamicoDetalleChequeGirado.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDetalleChequeGirado"));
				this.jInternalFrameReporteDinamicoDetalleChequeGirado.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDetalleChequeGirado"));
				this.jInternalFrameReporteDinamicoDetalleChequeGirado.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDetalleChequeGirado"));
			}
			
			//this.jButtonCerrarReporteDinamicoDetalleChequeGirado.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDetalleChequeGirado"));				
			//this.jButtonGenerarReporteDinamicoDetalleChequeGirado.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDetalleChequeGirado"));
			//this.jButtonGenerarExcelReporteDinamicoDetalleChequeGirado.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDetalleChequeGirado"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionDetalleChequeGirado!=null) {
				this.jInternalFrameImportacionDetalleChequeGirado.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDetalleChequeGirado"));
				this.jInternalFrameImportacionDetalleChequeGirado.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDetalleChequeGirado"));
				this.jInternalFrameImportacionDetalleChequeGirado.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDetalleChequeGirado"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByDetalleChequeGirado.addActionListener (new ButtonActionListener(this,"AbrirOrderByDetalleChequeGirado"));
			
			this.jButtonAbrirOrderByToolBarDetalleChequeGirado.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarDetalleChequeGirado"));			
			
			if(this.jInternalFrameOrderByDetalleChequeGirado!=null) {
				this.jInternalFrameOrderByDetalleChequeGirado.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDetalleChequeGirado"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleChequeGirado.jTabbedPaneRelacionesDetalleChequeGirado.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDetalleChequeGirado"));
		
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
            		closingInternalFrameDetalleChequeGirado();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormDetalleChequeGirado.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormDetalleChequeGirado = (JInternalFrameBase)event.getSource();
	            	
	            DetalleChequeGiradoBeanSwingJInternalFrame jInternalFrameParent=(DetalleChequeGiradoBeanSwingJInternalFrame)jInternalFrameDetalleFormDetalleChequeGirado.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarDetalleChequeGiradoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosDetalleChequeGirado.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosDetalleChequeGiradoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosDetalleChequeGirado.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosDetalleChequeGirado.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoDetalleChequeGirado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleChequeGiradoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarDetalleChequeGirado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleChequeGiradoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoDetalleChequeGirado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleChequeGiradoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoDetalleChequeGirado";
		inputMap = this.jButtonNuevoDetalleChequeGirado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoDetalleChequeGirado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDetalleChequeGiradoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesDetalleChequeGirado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleChequeGiradoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarDetalleChequeGirado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleChequeGiradoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesDetalleChequeGirado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleChequeGiradoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesDetalleChequeGirado";
		inputMap = this.jButtonNuevoRelacionesDetalleChequeGirado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesDetalleChequeGirado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDetalleChequeGiradoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarDetalleChequeGirado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDetalleChequeGiradoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarDetalleChequeGirado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDetalleChequeGiradoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarDetalleChequeGirado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDetalleChequeGiradoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarDetalleChequeGirado";
		inputMap = this.jButtonModificarDetalleChequeGirado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarDetalleChequeGirado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarDetalleChequeGiradoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarDetalleChequeGirado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDetalleChequeGiradoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarDetalleChequeGirado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDetalleChequeGiradoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarDetalleChequeGirado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDetalleChequeGiradoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarDetalleChequeGirado";
		inputMap = this.jButtonActualizarDetalleChequeGirado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarDetalleChequeGirado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarDetalleChequeGiradoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarDetalleChequeGirado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDetalleChequeGiradoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarDetalleChequeGirado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDetalleChequeGiradoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarDetalleChequeGirado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDetalleChequeGiradoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarDetalleChequeGirado";
		inputMap = this.jButtonEliminarDetalleChequeGirado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarDetalleChequeGirado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarDetalleChequeGiradoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarDetalleChequeGirado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDetalleChequeGiradoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarDetalleChequeGirado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDetalleChequeGiradoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarDetalleChequeGirado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDetalleChequeGiradoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarDetalleChequeGirado";
		inputMap = this.jButtonCancelarDetalleChequeGirado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarDetalleChequeGirado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarDetalleChequeGiradoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarDetalleChequeGirado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDetalleChequeGiradoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarDetalleChequeGirado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDetalleChequeGiradoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarDetalleChequeGirado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDetalleChequeGiradoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarDetalleChequeGirado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarDetalleChequeGiradoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarDetalleChequeGiradoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarDetalleChequeGirado";
		inputMap = this.jButtonCerrarDetalleChequeGirado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarDetalleChequeGirado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarDetalleChequeGiradoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonGuardarCambiosDetalleChequeGirado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleChequeGiradoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarDetalleChequeGirado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleChequeGiradoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosDetalleChequeGirado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleChequeGiradoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaDetalleChequeGirado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleChequeGiradoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarDetalleChequeGirado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleChequeGiradoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaDetalleChequeGirado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleChequeGiradoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosDetalleChequeGirado";
		inputMap = this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonGuardarCambiosDetalleChequeGirado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonGuardarCambiosDetalleChequeGirado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosDetalleChequeGiradoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionDetalleChequeGirado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDetalleChequeGiradoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarDetalleChequeGirado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDetalleChequeGiradoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionDetalleChequeGirado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDetalleChequeGiradoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresDetalleChequeGirado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDetalleChequeGiradoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarDetalleChequeGirado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDetalleChequeGiradoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresDetalleChequeGirado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDetalleChequeGiradoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesDetalleChequeGirado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDetalleChequeGiradoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarDetalleChequeGirado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDetalleChequeGiradoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesDetalleChequeGirado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDetalleChequeGiradoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosDetalleChequeGirado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDetalleChequeGiradoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarDetalleChequeGirado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDetalleChequeGiradoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosDetalleChequeGirado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDetalleChequeGiradoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosDetalleChequeGirado.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosDetalleChequeGiradoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesDetalleChequeGirado.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesDetalleChequeGiradoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarDetalleChequeGirado.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarDetalleChequeGiradoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralDetalleChequeGirado.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralDetalleChequeGiradoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonidDetalleChequeGiradoBusqueda.addActionListener(new ButtonActionListener(this,"idDetalleChequeGiradoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonid_empresaDetalleChequeGiradoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDetalleChequeGiradoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonid_empresaDetalleChequeGiradoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDetalleChequeGiradoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonid_sucursalDetalleChequeGiradoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalDetalleChequeGiradoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonid_sucursalDetalleChequeGiradoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalDetalleChequeGiradoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonid_ejercicioDetalleChequeGiradoUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioDetalleChequeGiradoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonid_ejercicioDetalleChequeGiradoBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioDetalleChequeGiradoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonid_periodoDetalleChequeGiradoUpdate.addActionListener(new ButtonActionListener(this,"id_periodoDetalleChequeGiradoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonid_periodoDetalleChequeGiradoBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoDetalleChequeGiradoBusqueda"));
		//jButtonid_asiento_contableDetalleChequeGirado.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_asiento_contableDetalleChequeGiradoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonid_asiento_contableDetalleChequeGirado.addActionListener(new ButtonActionListener(this,"id_asiento_contableDetalleChequeGirado"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonid_asiento_contableDetalleChequeGiradoUpdate.addActionListener(new ButtonActionListener(this,"id_asiento_contableDetalleChequeGiradoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonid_asiento_contableDetalleChequeGiradoBusqueda.addActionListener(new ButtonActionListener(this,"id_asiento_contableDetalleChequeGiradoBusqueda"));
		//jButtonid_empleadoDetalleChequeGirado.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleadoDetalleChequeGiradoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonid_empleadoDetalleChequeGirado.addActionListener(new ButtonActionListener(this,"id_empleadoDetalleChequeGirado"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonid_empleadoDetalleChequeGiradoUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoDetalleChequeGiradoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonid_empleadoDetalleChequeGiradoBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoDetalleChequeGiradoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonid_cuenta_bancoDetalleChequeGiradoUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_bancoDetalleChequeGiradoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonid_cuenta_bancoDetalleChequeGiradoBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_bancoDetalleChequeGiradoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonnumero_chequeDetalleChequeGiradoBusqueda.addActionListener(new ButtonActionListener(this,"numero_chequeDetalleChequeGiradoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonvalorDetalleChequeGiradoBusqueda.addActionListener(new ButtonActionListener(this,"valorDetalleChequeGiradoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtoncuentaDetalleChequeGiradoBusqueda.addActionListener(new ButtonActionListener(this,"cuentaDetalleChequeGiradoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonfechaDetalleChequeGiradoBusqueda.addActionListener(new ButtonActionListener(this,"fechaDetalleChequeGiradoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonconDetalleChequeGiradoBusqueda.addActionListener(new ButtonActionListener(this,"conDetalleChequeGiradoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonbeneficiarioDetalleChequeGiradoBusqueda.addActionListener(new ButtonActionListener(this,"beneficiarioDetalleChequeGiradoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtoncodigoDetalleChequeGiradoBusqueda.addActionListener(new ButtonActionListener(this,"codigoDetalleChequeGiradoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonnombre_bancoDetalleChequeGiradoBusqueda.addActionListener(new ButtonActionListener(this,"nombre_bancoDetalleChequeGiradoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonid_anioDetalleChequeGiradoUpdate.addActionListener(new ButtonActionListener(this,"id_anioDetalleChequeGiradoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonid_anioDetalleChequeGiradoBusqueda.addActionListener(new ButtonActionListener(this,"id_anioDetalleChequeGiradoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonid_mesDetalleChequeGiradoUpdate.addActionListener(new ButtonActionListener(this,"id_mesDetalleChequeGiradoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonid_mesDetalleChequeGiradoBusqueda.addActionListener(new ButtonActionListener(this,"id_mesDetalleChequeGiradoBusqueda"));
		
		
		this.jButtonFK_IdAsientoContableDetalleChequeGirado.addActionListener(new ButtonActionListener(this,"FK_IdAsientoContableDetalleChequeGirado"));

		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableDetalleChequeGirado.addActionListener(new ButtonActionListener(this,"id_asiento_contableDetalleChequeGirado"));

		this.jButtonFK_IdCuentaBancoDetalleChequeGirado.addActionListener(new ButtonActionListener(this,"FK_IdCuentaBancoDetalleChequeGirado"));

		this.jButtonFK_IdEmpleadoDetalleChequeGirado.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoDetalleChequeGirado"));

		this.jButtonBuscarFK_IdEmpleadoid_empleadoDetalleChequeGirado.addActionListener(new ButtonActionListener(this,"id_empleadoDetalleChequeGirado"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoDetalleChequeGirado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoDetalleChequeGiradoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoDetalleChequeGirado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoDetalleChequeGiradoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoDetalleChequeGirado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoDetalleChequeGiradoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionDetalleChequeGirado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionDetalleChequeGiradoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionDetalleChequeGirado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionDetalleChequeGiradoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionDetalleChequeGirado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionDetalleChequeGiradoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarDetalleChequeGiradoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarDetalleChequeGirado.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosDetalleChequeGirado(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(DetalleChequeGirado detallechequegiradoAux:this.detallechequegiradoLogic.getDetalleChequeGirados()) {
					detallechequegiradoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetalleChequeGirado detallechequegiradoAux:detallechequegirados) {
					detallechequegiradoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosDetalleChequeGiradoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDetalleChequeGirado(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DetalleChequeGirado detallechequegiradoAux:this.detallechequegiradoLogic.getDetalleChequeGirados()) {
						detallechequegiradoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DetalleChequeGirado detallechequegiradoAux:detallechequegirados) {
						detallechequegiradoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(DetalleChequeGirado detallechequegiradoAux:this.detallechequegiradoLogic.getDetalleChequeGirados()) {
					
						if(sTipoSeleccionar.equals(DetalleChequeGiradoConstantesFunciones.LABEL_CON)) {
							existe=true;
							detallechequegiradoAux.setcon(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DetalleChequeGirado detallechequegiradoAux:detallechequegirados) {
						
						if(sTipoSeleccionar.equals(DetalleChequeGiradoConstantesFunciones.LABEL_CON)) {
							existe=true;
							detallechequegiradoAux.setcon(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaDetalleChequeGirado(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDetalleChequeGirado.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDetalleChequeGirado.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDetalleChequeGirado,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosDetalleChequeGiradoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDetalleChequeGirado(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosDetalleChequeGirado.getSelectedRows();
			
			DetalleChequeGirado detallechequegiradoLocal=new DetalleChequeGirado();
			
			//this.seleccionarTodosDetalleChequeGirado(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallechequegiradoLocal =(DetalleChequeGirado) this.detallechequegiradoLogic.getDetalleChequeGirados().toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					detallechequegiradoLocal =(DetalleChequeGirado) this.detallechequegirados.toArray()[this.jTableDatosDetalleChequeGirado.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				detallechequegiradoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DetalleChequeGirado detallechequegiradoAux:this.detallechequegiradoLogic.getDetalleChequeGirados()) {
						detallechequegiradoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DetalleChequeGirado detallechequegiradoAux:detallechequegirados) {
						detallechequegiradoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaDetalleChequeGirado(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDetalleChequeGirado.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDetalleChequeGirado.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDetalleChequeGirado,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualDetalleChequeGiradoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarDetalleChequeGiradoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralDetalleChequeGiradoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingDetalleChequeGirado(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralDetalleChequeGirado.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DetalleChequeGirado detallechequegiradoAux:this.detallechequegiradoLogic.getDetalleChequeGirados()) {
				
						if(sTipoSeleccionar.equals(DetalleChequeGiradoConstantesFunciones.LABEL_NUMEROCHEQUE)) {
							existe=true;
							detallechequegiradoAux.setnumero_cheque(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DetalleChequeGiradoConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							detallechequegiradoAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleChequeGiradoConstantesFunciones.LABEL_CUENTA)) {
							existe=true;
							detallechequegiradoAux.setcuenta(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DetalleChequeGiradoConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							detallechequegiradoAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleChequeGiradoConstantesFunciones.LABEL_BENEFICIARIO)) {
							existe=true;
							detallechequegiradoAux.setbeneficiario(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DetalleChequeGiradoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							detallechequegiradoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DetalleChequeGiradoConstantesFunciones.LABEL_NOMBREBANCO)) {
							existe=true;
							detallechequegiradoAux.setnombre_banco(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetalleChequeGirado detallechequegiradoAux:detallechequegirados) {
					
						if(sTipoSeleccionar.equals(DetalleChequeGiradoConstantesFunciones.LABEL_NUMEROCHEQUE)) {
							existe=true;
							detallechequegiradoAux.setnumero_cheque(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DetalleChequeGiradoConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							detallechequegiradoAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleChequeGiradoConstantesFunciones.LABEL_CUENTA)) {
							existe=true;
							detallechequegiradoAux.setcuenta(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DetalleChequeGiradoConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							detallechequegiradoAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleChequeGiradoConstantesFunciones.LABEL_BENEFICIARIO)) {
							existe=true;
							detallechequegiradoAux.setbeneficiario(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DetalleChequeGiradoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							detallechequegiradoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DetalleChequeGiradoConstantesFunciones.LABEL_NOMBREBANCO)) {
							existe=true;
							detallechequegiradoAux.setnombre_banco(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaDetalleChequeGirado(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesDetalleChequeGiradoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingDetalleChequeGirado(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioDetalleChequeGirado=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesDetalleChequeGirado.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxTiposAccionesFormularioDetalleChequeGirado.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteDetalleChequeGirado) {				
					conSplash=true;//false;										
					
					//this.startProcessDetalleChequeGirado(conSplash);
				
					this.generarReporteDetalleChequeGiradosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetalleChequeGirado.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxTiposAccionesFormularioDetalleChequeGirado.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoDetalleChequeGiradosSeleccionados();
				//this.jComboBoxTiposAccionesDetalleChequeGirado.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDetalleChequeGiradosSeleccionados(false);
				//this.jComboBoxTiposAccionesDetalleChequeGirado.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDetalleChequeGiradosSeleccionados(true);
				//this.jComboBoxTiposAccionesDetalleChequeGirado.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDetalleChequeGirado();
				
				this.exportarDetalleChequeGiradosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetalleChequeGirado.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxTiposAccionesFormularioDetalleChequeGirado.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionDetalleChequeGirados();
				//this.importarDetalleChequeGirados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetalleChequeGirado.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxTiposAccionesFormularioDetalleChequeGirado.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDetalleChequeGirado();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelDetalleChequeGiradosSeleccionados();
				//this.jComboBoxTiposAccionesDetalleChequeGirado.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Detalle Cheque Girado", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessDetalleChequeGirado();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoDetalleChequeGirado)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyDetalleChequeGirado(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Detalle Cheque Girado",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetalleChequeGirado.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxTiposAccionesFormularioDetalleChequeGirado.setSelectedIndex(0);					
				}	
			} 			
			else if(DetalleChequeGiradoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteDetalleChequeGirado) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessDetalleChequeGirado(conSplash);
					
						//this.actualizarParametrosGeneralDetalleChequeGirado();
						
						this.generarReporteProcesoAccionDetalleChequeGiradosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesDetalleChequeGirado.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxTiposAccionesFormularioDetalleChequeGirado.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(DetalleChequeGiradoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Detalle Cheque GiradoS SELECCIONADOS?", "MANTENIMIENTO DE Detalle Cheque Girado", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessDetalleChequeGirado();
				
						this.actualizarParametrosGeneralDetalleChequeGirado();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.detallechequegiradoReturnGeneral=detallechequegiradoLogic.procesarAccionDetalleChequeGiradosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.detallechequegiradoLogic.getDetalleChequeGirados(),this.detallechequegiradoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarDetalleChequeGiradoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDetalleChequeGirado.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxTiposAccionesFormularioDetalleChequeGirado.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralDetalleChequeGirado();
					
					DetalleChequeGiradoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarDetalleChequeGiradoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDetalleChequeGirado.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxTiposAccionesFormularioDetalleChequeGirado.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessDetalleChequeGirado(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesDetalleChequeGiradoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessDetalleChequeGirado();
			
			if(this.jInternalFrameDetalleFormDetalleChequeGirado==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<DetalleChequeGirado> detallechequegiradosSeleccionados=new ArrayList<DetalleChequeGirado>();		
			DetalleChequeGirado detallechequegirado=new DetalleChequeGirado();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingDetalleChequeGirado(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesDetalleChequeGirado.getSelectedItem();
			
			
			
			
			detallechequegiradosSeleccionados=this.getDetalleChequeGiradosSeleccionados(true);
			//this.sTipoAccion;
			
			if(detallechequegiradosSeleccionados.size()==1) {
				for(DetalleChequeGirado detallechequegiradoAux:detallechequegiradosSeleccionados) {
					detallechequegirado=detallechequegiradoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessDetalleChequeGirado();
			
      		//this.finishProcessDetalleChequeGirado(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarDetalleChequeGiradoReturnGeneral() throws Exception {
		if(this.detallechequegiradoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.detallechequegiradoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.detallechequegiradoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.detallechequegiradoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.detallechequegiradoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.detallechequegiradoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingDetalleChequeGirado(false);
		}
		
		if(this.detallechequegiradoReturnGeneral.getConRetornoLista() || this.detallechequegiradoReturnGeneral.getConRetornoObjeto()) {
			if(this.detallechequegiradoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.detallechequegiradoLogic.setDetalleChequeGirados(this.detallechequegiradoReturnGeneral.getDetalleChequeGirados());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.detallechequegiradoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.detallechequegiradoLogic.setDetalleChequeGirado(this.detallechequegiradoReturnGeneral.getDetalleChequeGirado());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingDetalleChequeGirado(false);
		}
	}
	
	public void actualizarParametrosGeneralDetalleChequeGirado() throws Exception {
		
		
	}
	
	public ArrayList<DetalleChequeGirado> getDetalleChequeGiradosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<DetalleChequeGirado> detallechequegiradosSeleccionados=new ArrayList<DetalleChequeGirado>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioDetalleChequeGirado) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(DetalleChequeGirado detallechequegiradoAux:detallechequegiradoLogic.getDetalleChequeGirados()) {
					if(detallechequegiradoAux.getIsSelected()) {
						detallechequegiradosSeleccionados.add(detallechequegiradoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetalleChequeGirado detallechequegiradoAux:this.detallechequegirados) {
					if(detallechequegiradoAux.getIsSelected()) {
						detallechequegiradosSeleccionados.add(detallechequegiradoAux);				
					}
				}
			}
			
			if(detallechequegiradosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						detallechequegiradosSeleccionados.addAll(this.detallechequegiradoLogic.getDetalleChequeGirados());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						detallechequegiradosSeleccionados.addAll(this.detallechequegirados);				
					}
				}
			}
		} else {
			detallechequegiradosSeleccionados.add(this.detallechequegirado);
		}
		
		return detallechequegiradosSeleccionados;
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
	
	public void generarReporteDetalleChequeGiradosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalDetalleChequeGiradosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoDetalleChequeGiradosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDetalleChequeGiradosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDetalleChequeGiradosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Detalle Cheque Girado",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesDetalleChequeGiradosSeleccionados() throws Exception {
		ArrayList<DetalleChequeGirado> detallechequegiradosSeleccionados=new ArrayList<DetalleChequeGirado>();		
		
		detallechequegiradosSeleccionados=this.getDetalleChequeGiradosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteDetalleChequeGirados("Todos",detallechequegiradosSeleccionados);
		
	}	
	
	public void generarReporteNormalDetalleChequeGiradosSeleccionados() throws Exception {
		ArrayList<DetalleChequeGirado> detallechequegiradosSeleccionados=new ArrayList<DetalleChequeGirado>();		
		
		detallechequegiradosSeleccionados=this.getDetalleChequeGiradosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteDetalleChequeGirados("Todos",detallechequegiradosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionDetalleChequeGiradosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<DetalleChequeGirado> detallechequegiradosSeleccionados=new ArrayList<DetalleChequeGirado>();
		
		detallechequegiradosSeleccionados=this.getDetalleChequeGiradosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteDetalleChequeGirados("Todos",detallechequegiradosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoDetalleChequeGiradosSeleccionados() throws Exception {
		ArrayList<DetalleChequeGirado> detallechequegiradosSeleccionados=new ArrayList<DetalleChequeGirado>();		
		
		
		this.abrirInicializarFrameReporteDinamicoDetalleChequeGirado();
		
		
		detallechequegiradosSeleccionados=this.getDetalleChequeGiradosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoDetalleChequeGirado();
		
		
		//this.generarReporteDetalleChequeGirados("Todos",detallechequegiradosSeleccionados ,detallechequegiradoImplementable,detallechequegiradoImplementableHome);
	}
	
	public void mostrarImportacionDetalleChequeGirados() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionDetalleChequeGirado();
		
		this.abrirFrameImportacionDetalleChequeGirado();		
		
			
		//this.generarReporteDetalleChequeGirados("Todos",detallechequegiradosSeleccionados ,detallechequegiradoImplementable,detallechequegiradoImplementableHome);
	}
	
	public void importarDetalleChequeGirados() throws Exception {		
	
	}
	
	public void exportarDetalleChequeGiradosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelDetalleChequeGiradosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoDetalleChequeGiradosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlDetalleChequeGiradosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Detalle Cheque Girado",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoDetalleChequeGiradosSeleccionados() throws Exception {
		ArrayList<DetalleChequeGirado> detallechequegiradosSeleccionados=new ArrayList<DetalleChequeGirado>();		
		
		detallechequegiradosSeleccionados=this.getDetalleChequeGiradosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallechequegirado."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarDetalleChequeGirado(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(DetalleChequeGirado detallechequegiradoAux:detallechequegiradosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarDetalleChequeGirado(detallechequegiradoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//detallechequegiradoAux.setsDetalleGeneralEntityReporte(detallechequegiradoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallechequegiradoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Cheque Girado",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarDetalleChequeGirado(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=DetalleChequeGiradoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleChequeGiradoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleChequeGiradoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleChequeGiradoConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleChequeGiradoConstantesFunciones.LABEL_IDEJERCICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleChequeGiradoConstantesFunciones.LABEL_IDPERIODO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleChequeGiradoConstantesFunciones.LABEL_IDASIENTOCONTABLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleChequeGiradoConstantesFunciones.LABEL_IDEMPLEADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleChequeGiradoConstantesFunciones.LABEL_IDCUENTABANCO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleChequeGiradoConstantesFunciones.LABEL_NUMEROCHEQUE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleChequeGiradoConstantesFunciones.LABEL_VALOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleChequeGiradoConstantesFunciones.LABEL_CUENTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleChequeGiradoConstantesFunciones.LABEL_FECHA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleChequeGiradoConstantesFunciones.LABEL_CON;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleChequeGiradoConstantesFunciones.LABEL_BENEFICIARIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleChequeGiradoConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleChequeGiradoConstantesFunciones.LABEL_NOMBREBANCO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleChequeGiradoConstantesFunciones.LABEL_IDANIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleChequeGiradoConstantesFunciones.LABEL_IDMES;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarDetalleChequeGirado(DetalleChequeGirado detallechequegirado,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=detallechequegirado.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=detallechequegirado.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallechequegirado.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallechequegirado.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallechequegirado.getejercicio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallechequegirado.getperiodo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallechequegirado.getasientocontable_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallechequegirado.getempleado_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallechequegirado.getcuentabanco_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallechequegirado.getnumero_cheque();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallechequegirado.getvalor().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallechequegirado.getcuenta();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallechequegirado.getfecha().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallechequegirado.getcon().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallechequegirado.getbeneficiario();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallechequegirado.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallechequegirado.getnombre_banco();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallechequegirado.getanio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallechequegirado.getmes_descripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelDetalleChequeGiradosSeleccionados() throws Exception {
		ArrayList<DetalleChequeGirado> detallechequegiradosSeleccionados=new ArrayList<DetalleChequeGirado>();		
		
		detallechequegiradosSeleccionados=this.getDetalleChequeGiradosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallechequegirado.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("DetalleChequeGirados");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelDetalleChequeGirado(row);				
				iRow++;
			}				
			
			for(DetalleChequeGirado detallechequegiradoAux:detallechequegiradosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelDetalleChequeGirado(detallechequegiradoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallechequegiradoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Cheque Girado",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlDetalleChequeGiradosSeleccionados() throws Exception {
		ArrayList<DetalleChequeGirado> detallechequegiradosSeleccionados=new ArrayList<DetalleChequeGirado>();		
		
		detallechequegiradosSeleccionados=this.getDetalleChequeGiradosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallechequegirado.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("detallechequegirados");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("detallechequegirado");
			//elementRoot.appendChild(element);
		
			for(DetalleChequeGirado detallechequegiradoAux:detallechequegiradosSeleccionados) {
				element = document.createElement("detallechequegirado");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlDetalleChequeGirado(detallechequegiradoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallechequegiradoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Cheque Girado",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelDetalleChequeGirado(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleChequeGiradoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleChequeGiradoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(DetalleChequeGiradoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleChequeGiradoConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleChequeGiradoConstantesFunciones.LABEL_IDEJERCICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleChequeGiradoConstantesFunciones.LABEL_IDPERIODO);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleChequeGiradoConstantesFunciones.LABEL_IDASIENTOCONTABLE);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleChequeGiradoConstantesFunciones.LABEL_IDEMPLEADO);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleChequeGiradoConstantesFunciones.LABEL_IDCUENTABANCO);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleChequeGiradoConstantesFunciones.LABEL_NUMEROCHEQUE);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleChequeGiradoConstantesFunciones.LABEL_VALOR);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleChequeGiradoConstantesFunciones.LABEL_CUENTA);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleChequeGiradoConstantesFunciones.LABEL_FECHA);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleChequeGiradoConstantesFunciones.LABEL_CON);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleChequeGiradoConstantesFunciones.LABEL_BENEFICIARIO);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleChequeGiradoConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleChequeGiradoConstantesFunciones.LABEL_NOMBREBANCO);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleChequeGiradoConstantesFunciones.LABEL_IDANIO);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleChequeGiradoConstantesFunciones.LABEL_IDMES);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelDetalleChequeGirado(DetalleChequeGirado detallechequegirado,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(detallechequegirado.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(detallechequegirado.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detallechequegirado.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detallechequegirado.getejercicio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detallechequegirado.getperiodo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detallechequegirado.getasientocontable_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detallechequegirado.getempleado_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detallechequegirado.getcuentabanco_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detallechequegirado.getnumero_cheque());
		cell = row.createCell(iColumn++);cell.setCellValue(detallechequegirado.getvalor());
		cell = row.createCell(iColumn++);cell.setCellValue(detallechequegirado.getcuenta());
		cell = row.createCell(iColumn++);cell.setCellValue(detallechequegirado.getfecha());
		cell = row.createCell(iColumn++);cell.setCellValue(detallechequegirado.getcon());
		cell = row.createCell(iColumn++);cell.setCellValue(detallechequegirado.getbeneficiario());
		cell = row.createCell(iColumn++);cell.setCellValue(detallechequegirado.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(detallechequegirado.getnombre_banco());
		cell = row.createCell(iColumn++);cell.setCellValue(detallechequegirado.getanio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detallechequegirado.getmes_descripcion());				
	}
	
	public void setFilaDatosExportarXmlDetalleChequeGirado(DetalleChequeGirado detallechequegirado,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(DetalleChequeGiradoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(detallechequegirado.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(DetalleChequeGiradoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(detallechequegirado.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(DetalleChequeGiradoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(detallechequegirado.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(DetalleChequeGiradoConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(detallechequegirado.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementejercicio_descripcion = document.createElement(DetalleChequeGiradoConstantesFunciones.IDEJERCICIO);
		elementejercicio_descripcion.appendChild(document.createTextNode(detallechequegirado.getejercicio_descripcion()));
		element.appendChild(elementejercicio_descripcion);

		Element elementperiodo_descripcion = document.createElement(DetalleChequeGiradoConstantesFunciones.IDPERIODO);
		elementperiodo_descripcion.appendChild(document.createTextNode(detallechequegirado.getperiodo_descripcion()));
		element.appendChild(elementperiodo_descripcion);

		Element elementasientocontable_descripcion = document.createElement(DetalleChequeGiradoConstantesFunciones.IDASIENTOCONTABLE);
		elementasientocontable_descripcion.appendChild(document.createTextNode(detallechequegirado.getasientocontable_descripcion()));
		element.appendChild(elementasientocontable_descripcion);

		Element elementempleado_descripcion = document.createElement(DetalleChequeGiradoConstantesFunciones.IDEMPLEADO);
		elementempleado_descripcion.appendChild(document.createTextNode(detallechequegirado.getempleado_descripcion()));
		element.appendChild(elementempleado_descripcion);

		Element elementcuentabanco_descripcion = document.createElement(DetalleChequeGiradoConstantesFunciones.IDCUENTABANCO);
		elementcuentabanco_descripcion.appendChild(document.createTextNode(detallechequegirado.getcuentabanco_descripcion()));
		element.appendChild(elementcuentabanco_descripcion);

		Element elementnumero_cheque = document.createElement(DetalleChequeGiradoConstantesFunciones.NUMEROCHEQUE);
		elementnumero_cheque.appendChild(document.createTextNode(detallechequegirado.getnumero_cheque().trim()));
		element.appendChild(elementnumero_cheque);

		Element elementvalor = document.createElement(DetalleChequeGiradoConstantesFunciones.VALOR);
		elementvalor.appendChild(document.createTextNode(detallechequegirado.getvalor().toString().trim()));
		element.appendChild(elementvalor);

		Element elementcuenta = document.createElement(DetalleChequeGiradoConstantesFunciones.CUENTA);
		elementcuenta.appendChild(document.createTextNode(detallechequegirado.getcuenta().trim()));
		element.appendChild(elementcuenta);

		Element elementfecha = document.createElement(DetalleChequeGiradoConstantesFunciones.FECHA);
		elementfecha.appendChild(document.createTextNode(detallechequegirado.getfecha().toString().trim()));
		element.appendChild(elementfecha);

		Element elementcon = document.createElement(DetalleChequeGiradoConstantesFunciones.CON);
		elementcon.appendChild(document.createTextNode(detallechequegirado.getcon().toString().trim()));
		element.appendChild(elementcon);

		Element elementbeneficiario = document.createElement(DetalleChequeGiradoConstantesFunciones.BENEFICIARIO);
		elementbeneficiario.appendChild(document.createTextNode(detallechequegirado.getbeneficiario().trim()));
		element.appendChild(elementbeneficiario);

		Element elementcodigo = document.createElement(DetalleChequeGiradoConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(detallechequegirado.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre_banco = document.createElement(DetalleChequeGiradoConstantesFunciones.NOMBREBANCO);
		elementnombre_banco.appendChild(document.createTextNode(detallechequegirado.getnombre_banco().trim()));
		element.appendChild(elementnombre_banco);

		Element elementanio_descripcion = document.createElement(DetalleChequeGiradoConstantesFunciones.IDANIO);
		elementanio_descripcion.appendChild(document.createTextNode(detallechequegirado.getanio_descripcion()));
		element.appendChild(elementanio_descripcion);

		Element elementmes_descripcion = document.createElement(DetalleChequeGiradoConstantesFunciones.IDMES);
		elementmes_descripcion.appendChild(document.createTextNode(detallechequegirado.getmes_descripcion()));
		element.appendChild(elementmes_descripcion);
	}
	
	public void generarReporteGroupGenericoDetalleChequeGiradosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<DetalleChequeGirado> detallechequegiradosSeleccionados=new ArrayList<DetalleChequeGirado>();
		
		detallechequegiradosSeleccionados=this.getDetalleChequeGiradosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoDetalleChequeGirado(detallechequegiradosSeleccionados);
		
		this.generarReporteDetalleChequeGirados("Todos",detallechequegiradosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoDetalleChequeGirado(ArrayList<DetalleChequeGirado> detallechequegiradosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(DetalleChequeGirado detallechequegiradoAux:detallechequegiradosSeleccionados) {
				detallechequegiradoAux.setsDetalleGeneralEntityReporte(detallechequegiradoAux.toString());
			
				if(sTipoSeleccionar.equals(DetalleChequeGiradoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					detallechequegiradoAux.setsDescripcionGeneralEntityReporte1(detallechequegiradoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleChequeGiradoConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					detallechequegiradoAux.setsDescripcionGeneralEntityReporte1(detallechequegiradoAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleChequeGiradoConstantesFunciones.LABEL_IDEJERCICIO)) {
					existe=true;
					detallechequegiradoAux.setsDescripcionGeneralEntityReporte1(detallechequegiradoAux.getejercicio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleChequeGiradoConstantesFunciones.LABEL_IDPERIODO)) {
					existe=true;
					detallechequegiradoAux.setsDescripcionGeneralEntityReporte1(detallechequegiradoAux.getperiodo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleChequeGiradoConstantesFunciones.LABEL_IDASIENTOCONTABLE)) {
					existe=true;
					detallechequegiradoAux.setsDescripcionGeneralEntityReporte1(detallechequegiradoAux.getasientocontable_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleChequeGiradoConstantesFunciones.LABEL_IDEMPLEADO)) {
					existe=true;
					detallechequegiradoAux.setsDescripcionGeneralEntityReporte1(detallechequegiradoAux.getempleado_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleChequeGiradoConstantesFunciones.LABEL_IDCUENTABANCO)) {
					existe=true;
					detallechequegiradoAux.setsDescripcionGeneralEntityReporte1(detallechequegiradoAux.getcuentabanco_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleChequeGiradoConstantesFunciones.LABEL_NUMEROCHEQUE)) {
					existe=true;
					detallechequegiradoAux.setsDescripcionGeneralEntityReporte1(detallechequegiradoAux.getnumero_cheque());
				}
				 else if(sTipoSeleccionar.equals(DetalleChequeGiradoConstantesFunciones.LABEL_CUENTA)) {
					existe=true;
					detallechequegiradoAux.setsDescripcionGeneralEntityReporte1(detallechequegiradoAux.getcuenta());
				}
				 else if(sTipoSeleccionar.equals(DetalleChequeGiradoConstantesFunciones.LABEL_FECHA)) {
					existe=true;
					detallechequegiradoAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(detallechequegiradoAux.getfecha()));
				}
				 else if(sTipoSeleccionar.equals(DetalleChequeGiradoConstantesFunciones.LABEL_CON)) {
					existe=true;
					detallechequegiradoAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(detallechequegiradoAux.getcon()));
				}
				 else if(sTipoSeleccionar.equals(DetalleChequeGiradoConstantesFunciones.LABEL_BENEFICIARIO)) {
					existe=true;
					detallechequegiradoAux.setsDescripcionGeneralEntityReporte1(detallechequegiradoAux.getbeneficiario());
				}
				 else if(sTipoSeleccionar.equals(DetalleChequeGiradoConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					detallechequegiradoAux.setsDescripcionGeneralEntityReporte1(detallechequegiradoAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(DetalleChequeGiradoConstantesFunciones.LABEL_NOMBREBANCO)) {
					existe=true;
					detallechequegiradoAux.setsDescripcionGeneralEntityReporte1(detallechequegiradoAux.getnombre_banco());
				}
				 else if(sTipoSeleccionar.equals(DetalleChequeGiradoConstantesFunciones.LABEL_IDANIO)) {
					existe=true;
					detallechequegiradoAux.setsDescripcionGeneralEntityReporte1(detallechequegiradoAux.getanio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleChequeGiradoConstantesFunciones.LABEL_IDMES)) {
					existe=true;
					detallechequegiradoAux.setsDescripcionGeneralEntityReporte1(detallechequegiradoAux.getmes_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleChequeGiradoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesDetalleChequeGirado(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoDetalleChequeGirado=true;
				this.isVisibilidadCeldaNuevoRelacionesDetalleChequeGirado=true;
				this.isVisibilidadCeldaGuardarCambiosDetalleChequeGirado=true;
			}
			
			this.isVisibilidadCeldaModificarDetalleChequeGirado=false;
			this.isVisibilidadCeldaActualizarDetalleChequeGirado=false;
			this.isVisibilidadCeldaEliminarDetalleChequeGirado=false;
			this.isVisibilidadCeldaCancelarDetalleChequeGirado=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleChequeGirado=true;
				} else {
					this.isVisibilidadCeldaGuardarDetalleChequeGirado=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoDetalleChequeGirado=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleChequeGirado=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleChequeGirado=false;
			this.isVisibilidadCeldaModificarDetalleChequeGirado=false;
			this.isVisibilidadCeldaActualizarDetalleChequeGirado=true;
			this.isVisibilidadCeldaEliminarDetalleChequeGirado=false;
			this.isVisibilidadCeldaCancelarDetalleChequeGirado=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleChequeGirado=true;
				} else {
					this.isVisibilidadCeldaGuardarDetalleChequeGirado=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoDetalleChequeGirado=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleChequeGirado=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleChequeGirado=false;
			this.isVisibilidadCeldaModificarDetalleChequeGirado=false;
			this.isVisibilidadCeldaActualizarDetalleChequeGirado=true;
			this.isVisibilidadCeldaEliminarDetalleChequeGirado=true;
			this.isVisibilidadCeldaCancelarDetalleChequeGirado=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleChequeGirado=true;
				} else {
					this.isVisibilidadCeldaGuardarDetalleChequeGirado=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoDetalleChequeGirado=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleChequeGirado=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleChequeGirado=false;
			this.isVisibilidadCeldaModificarDetalleChequeGirado=false;
			this.isVisibilidadCeldaActualizarDetalleChequeGirado=true;
			this.isVisibilidadCeldaEliminarDetalleChequeGirado=false;
			this.isVisibilidadCeldaCancelarDetalleChequeGirado=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleChequeGirado=false;
				} else {
					this.isVisibilidadCeldaGuardarDetalleChequeGirado=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoDetalleChequeGirado=true;
			this.isVisibilidadCeldaNuevoRelacionesDetalleChequeGirado=true;
			this.isVisibilidadCeldaGuardarCambiosDetalleChequeGirado=true;
			this.isVisibilidadCeldaModificarDetalleChequeGirado=false;
			this.isVisibilidadCeldaActualizarDetalleChequeGirado=false;
			this.isVisibilidadCeldaEliminarDetalleChequeGirado=false;
			this.isVisibilidadCeldaCancelarDetalleChequeGirado=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleChequeGirado=true;
				} else {
					this.isVisibilidadCeldaGuardarDetalleChequeGirado=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoDetalleChequeGirado=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleChequeGirado=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleChequeGirado=false;
			this.isVisibilidadCeldaActualizarDetalleChequeGirado=false;
			this.isVisibilidadCeldaEliminarDetalleChequeGirado=false;
			this.isVisibilidadCeldaCancelarDetalleChequeGirado=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleChequeGirado=false;
				} else {
					this.isVisibilidadCeldaGuardarDetalleChequeGirado=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoDetalleChequeGirado=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleChequeGirado=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleChequeGirado=false;
			this.isVisibilidadCeldaModificarDetalleChequeGirado=true;
			this.isVisibilidadCeldaActualizarDetalleChequeGirado=false;
			this.isVisibilidadCeldaEliminarDetalleChequeGirado=false;
			this.isVisibilidadCeldaCancelarDetalleChequeGirado=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleChequeGirado=false;
				} else {
					this.isVisibilidadCeldaGuardarDetalleChequeGirado=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(DetalleChequeGiradoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoDetalleChequeGirado=true;
			this.isVisibilidadCeldaNuevoRelacionesDetalleChequeGirado=true;
			this.isVisibilidadCeldaGuardarCambiosDetalleChequeGirado=true;
		} else {
			this.actualizarEstadoPanelsDetalleChequeGirado(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarDetalleChequeGirado=false;
			//this.isVisibilidadCeldaVerFormDetalleChequeGirado=false;
			this.isVisibilidadCeldaDuplicarDetalleChequeGirado=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!detallechequegiradoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesDetalleChequeGirado=false;
		} else {
			this.isVisibilidadCeldaNuevoDetalleChequeGirado=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleChequeGirado=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(detallechequegiradoSessionBean.getEsGuardarRelacionado()) {
			if(!detallechequegiradoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesDetalleChequeGirado=false;												
			}
			
			this.jButtonCerrarDetalleChequeGirado.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesDetalleChequeGirado=false;
		}
		
		if(!this.permiteMantenimiento(this.detallechequegirado)) {
			this.isVisibilidadCeldaActualizarDetalleChequeGirado=false;
			this.isVisibilidadCeldaEliminarDetalleChequeGirado=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesDetalleChequeGirado() {
	}
	
	public void actualizarEstadoPanelsDetalleChequeGirado(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionDetalleChequeGirado!=null) {
				this.jScrollPanelDatosEdicionDetalleChequeGirado.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleChequeGirado!=null) {
				this.jTabbedPaneBusquedasDetalleChequeGirado.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetalleChequeGirado!=null) {
				this.jScrollPanelDatosDetalleChequeGirado.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetalleChequeGirado!=null) {
				this.jPanelPaginacionDetalleChequeGirado.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetalleChequeGirado!=null) {
				this.jPanelParametrosReportesDetalleChequeGirado.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionDetalleChequeGirado!=null) {
				this.jScrollPanelDatosEdicionDetalleChequeGirado.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleChequeGirado!=null) {
				this.jTabbedPaneBusquedasDetalleChequeGirado.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosDetalleChequeGirado!=null) {
				this.jScrollPanelDatosDetalleChequeGirado.setVisible(false);
			}
			
			if(this.jPanelPaginacionDetalleChequeGirado!=null) {
				this.jPanelPaginacionDetalleChequeGirado.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDetalleChequeGirado!=null) {
				this.jPanelParametrosReportesDetalleChequeGirado.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionDetalleChequeGirado!=null) {
				this.jScrollPanelDatosEdicionDetalleChequeGirado.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleChequeGirado!=null) {
				this.jTabbedPaneBusquedasDetalleChequeGirado.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDetalleChequeGirado!=null) {
				this.jScrollPanelDatosDetalleChequeGirado.setVisible(false);
			}
			
			if(this.jPanelPaginacionDetalleChequeGirado!=null) {
				this.jPanelPaginacionDetalleChequeGirado.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDetalleChequeGirado!=null) {
				this.jPanelParametrosReportesDetalleChequeGirado.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionDetalleChequeGirado!=null) {
				this.jScrollPanelDatosEdicionDetalleChequeGirado.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleChequeGirado!=null) {
				this.jTabbedPaneBusquedasDetalleChequeGirado.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDetalleChequeGirado!=null) {
				this.jScrollPanelDatosDetalleChequeGirado.setVisible(false);
			}
			
			if(this.jPanelPaginacionDetalleChequeGirado!=null) {
				this.jPanelPaginacionDetalleChequeGirado.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDetalleChequeGirado!=null) {
				this.jPanelParametrosReportesDetalleChequeGirado.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionDetalleChequeGirado!=null) {
				this.jScrollPanelDatosEdicionDetalleChequeGirado.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleChequeGirado!=null) {
				this.jTabbedPaneBusquedasDetalleChequeGirado.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetalleChequeGirado!=null) {
				this.jScrollPanelDatosDetalleChequeGirado.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetalleChequeGirado!=null) {
				this.jPanelPaginacionDetalleChequeGirado.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetalleChequeGirado!=null) {
				this.jPanelParametrosReportesDetalleChequeGirado.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionDetalleChequeGirado!=null) {
				this.jScrollPanelDatosEdicionDetalleChequeGirado.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleChequeGirado!=null) {
				this.jTabbedPaneBusquedasDetalleChequeGirado.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetalleChequeGirado!=null) {
				this.jScrollPanelDatosDetalleChequeGirado.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetalleChequeGirado!=null) {
				this.jPanelPaginacionDetalleChequeGirado.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetalleChequeGirado!=null) {
				this.jPanelParametrosReportesDetalleChequeGirado.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionDetalleChequeGirado!=null) {
				this.jScrollPanelDatosEdicionDetalleChequeGirado.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleChequeGirado!=null) {
				this.jTabbedPaneBusquedasDetalleChequeGirado.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetalleChequeGirado!=null) {
				this.jScrollPanelDatosDetalleChequeGirado.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetalleChequeGirado!=null) {
				this.jPanelPaginacionDetalleChequeGirado.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetalleChequeGirado!=null) {
				this.jPanelParametrosReportesDetalleChequeGirado.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.detallechequegiradoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasDetalleChequeGirado!=null) {
					this.jTabbedPaneBusquedasDetalleChequeGirado.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesDetalleChequeGirado!=null) {
				this.jPanelParametrosReportesDetalleChequeGirado.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.detallechequegiradoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleChequeGirado!=null) {
				this.jTabbedPaneBusquedasDetalleChequeGirado.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesDetalleChequeGirado!=null) {
				this.jPanelParametrosReportesDetalleChequeGirado.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdAsientoContable=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdAsientoContable) {this.jTabbedPaneBusquedasDetalleChequeGirado.remove(jPanelFK_IdAsientoContableDetalleChequeGirado);}

			this.isVisibilidadFK_IdCuentaBanco=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCuentaBanco) {this.jTabbedPaneBusquedasDetalleChequeGirado.remove(jPanelFK_IdCuentaBancoDetalleChequeGirado);}

			this.isVisibilidadFK_IdEmpleado=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasDetalleChequeGirado.remove(jPanelFK_IdEmpleadoDetalleChequeGirado);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdAsientoContable=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdAsientoContable) {this.jTabbedPaneBusquedasDetalleChequeGirado.remove(jPanelFK_IdAsientoContableDetalleChequeGirado);}

			this.isVisibilidadFK_IdCuentaBanco=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdCuentaBanco) {this.jTabbedPaneBusquedasDetalleChequeGirado.remove(jPanelFK_IdCuentaBancoDetalleChequeGirado);}

			this.isVisibilidadFK_IdEmpleado=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasDetalleChequeGirado.remove(jPanelFK_IdEmpleadoDetalleChequeGirado);}
		}
		
	}

	public void setVisibilidadBusquedasParaEjercicio(Boolean isParaEjercicio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEjercicioNegation=!isParaEjercicio;

			this.isVisibilidadFK_IdAsientoContable=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdAsientoContable) {this.jTabbedPaneBusquedasDetalleChequeGirado.remove(jPanelFK_IdAsientoContableDetalleChequeGirado);}

			this.isVisibilidadFK_IdCuentaBanco=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdCuentaBanco) {this.jTabbedPaneBusquedasDetalleChequeGirado.remove(jPanelFK_IdCuentaBancoDetalleChequeGirado);}

			this.isVisibilidadFK_IdEmpleado=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasDetalleChequeGirado.remove(jPanelFK_IdEmpleadoDetalleChequeGirado);}
		}
		
	}

	public void setVisibilidadBusquedasParaPeriodo(Boolean isParaPeriodo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPeriodoNegation=!isParaPeriodo;

			this.isVisibilidadFK_IdAsientoContable=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdAsientoContable) {this.jTabbedPaneBusquedasDetalleChequeGirado.remove(jPanelFK_IdAsientoContableDetalleChequeGirado);}

			this.isVisibilidadFK_IdCuentaBanco=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdCuentaBanco) {this.jTabbedPaneBusquedasDetalleChequeGirado.remove(jPanelFK_IdCuentaBancoDetalleChequeGirado);}

			this.isVisibilidadFK_IdEmpleado=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasDetalleChequeGirado.remove(jPanelFK_IdEmpleadoDetalleChequeGirado);}
		}
		
	}

	public void setVisibilidadBusquedasParaAsientoContable(Boolean isParaAsientoContable){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaAsientoContableNegation=!isParaAsientoContable;

			this.isVisibilidadFK_IdAsientoContable=isParaAsientoContable;
			if(!this.isVisibilidadFK_IdAsientoContable) {this.jTabbedPaneBusquedasDetalleChequeGirado.remove(jPanelFK_IdAsientoContableDetalleChequeGirado);}

			this.isVisibilidadFK_IdCuentaBanco=isParaAsientoContableNegation;
			if(!this.isVisibilidadFK_IdCuentaBanco) {this.jTabbedPaneBusquedasDetalleChequeGirado.remove(jPanelFK_IdCuentaBancoDetalleChequeGirado);}

			this.isVisibilidadFK_IdEmpleado=isParaAsientoContableNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasDetalleChequeGirado.remove(jPanelFK_IdEmpleadoDetalleChequeGirado);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpleado(Boolean isParaEmpleado){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpleadoNegation=!isParaEmpleado;

			this.isVisibilidadFK_IdAsientoContable=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdAsientoContable) {this.jTabbedPaneBusquedasDetalleChequeGirado.remove(jPanelFK_IdAsientoContableDetalleChequeGirado);}

			this.isVisibilidadFK_IdCuentaBanco=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdCuentaBanco) {this.jTabbedPaneBusquedasDetalleChequeGirado.remove(jPanelFK_IdCuentaBancoDetalleChequeGirado);}

			this.isVisibilidadFK_IdEmpleado=isParaEmpleado;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasDetalleChequeGirado.remove(jPanelFK_IdEmpleadoDetalleChequeGirado);}
		}
		
	}

	public void setVisibilidadBusquedasParaCuentaBanco(Boolean isParaCuentaBanco){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCuentaBancoNegation=!isParaCuentaBanco;

			this.isVisibilidadFK_IdAsientoContable=isParaCuentaBancoNegation;
			if(!this.isVisibilidadFK_IdAsientoContable) {this.jTabbedPaneBusquedasDetalleChequeGirado.remove(jPanelFK_IdAsientoContableDetalleChequeGirado);}

			this.isVisibilidadFK_IdCuentaBanco=isParaCuentaBanco;
			if(!this.isVisibilidadFK_IdCuentaBanco) {this.jTabbedPaneBusquedasDetalleChequeGirado.remove(jPanelFK_IdCuentaBancoDetalleChequeGirado);}

			this.isVisibilidadFK_IdEmpleado=isParaCuentaBancoNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasDetalleChequeGirado.remove(jPanelFK_IdEmpleadoDetalleChequeGirado);}
		}
		
	}

	public void setVisibilidadBusquedasParaAnio(Boolean isParaAnio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaAnioNegation=!isParaAnio;

			this.isVisibilidadFK_IdAsientoContable=isParaAnioNegation;
			if(!this.isVisibilidadFK_IdAsientoContable) {this.jTabbedPaneBusquedasDetalleChequeGirado.remove(jPanelFK_IdAsientoContableDetalleChequeGirado);}

			this.isVisibilidadFK_IdCuentaBanco=isParaAnioNegation;
			if(!this.isVisibilidadFK_IdCuentaBanco) {this.jTabbedPaneBusquedasDetalleChequeGirado.remove(jPanelFK_IdCuentaBancoDetalleChequeGirado);}

			this.isVisibilidadFK_IdEmpleado=isParaAnioNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasDetalleChequeGirado.remove(jPanelFK_IdEmpleadoDetalleChequeGirado);}
		}
		
	}

	public void setVisibilidadBusquedasParaMes(Boolean isParaMes){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaMesNegation=!isParaMes;

			this.isVisibilidadFK_IdAsientoContable=isParaMesNegation;
			if(!this.isVisibilidadFK_IdAsientoContable) {this.jTabbedPaneBusquedasDetalleChequeGirado.remove(jPanelFK_IdAsientoContableDetalleChequeGirado);}

			this.isVisibilidadFK_IdCuentaBanco=isParaMesNegation;
			if(!this.isVisibilidadFK_IdCuentaBanco) {this.jTabbedPaneBusquedasDetalleChequeGirado.remove(jPanelFK_IdCuentaBancoDetalleChequeGirado);}

			this.isVisibilidadFK_IdEmpleado=isParaMesNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasDetalleChequeGirado.remove(jPanelFK_IdEmpleadoDetalleChequeGirado);}
		}
		
	}
	
	
	
	

	public String registrarSesionDetalleChequeGiradoParaBusquedaAsientoContables() throws Exception {
		Boolean isPaginaPopupAsientoContable=false;

		try {

			if(detallechequegiradoSessionBean==null) {
				detallechequegiradoSessionBean=new DetalleChequeGiradoSessionBean();
			}

			if(asientocontableSessionBean==null) {
				asientocontableSessionBean=new AsientoContableSessionBean();
			}

			asientocontableSessionBean.setsPathNavegacionActual(detallechequegiradoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+AsientoContableConstantesFunciones.SCLASSWEBTITULO);
			asientocontableSessionBean.setisPermiteRecargarInformacion(false);
			asientocontableSessionBean.setisPaginaPopup(true);
			isPaginaPopupAsientoContable=asientocontableSessionBean.getisPaginaPopup();
			asientocontableSessionBean.setisPaginaPopup(false);
			asientocontableSessionBean.setEstaModoBusqueda(true);
			asientocontableSessionBean.setsFuncionBusquedaRapida("window.opener.detallechequegiradoFuncionGeneral.setCombosCodigoDesdeBusquedaid_asiento_contable(TO_REPLACE);");
			asientocontableSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeAsientoContable(true);
			asientocontableSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeAsientoContable(DetalleChequeGiradoConstantesFunciones.SNOMBREOPCION);
			//asientocontableSessionBean.setisBusquedaDesdeForeignKeySesionDetalleChequeGirado(true);
			//asientocontableSessionBean.setlidDetalleChequeGiradoActual(this.idDetalleChequeGiradoActual);

			detallechequegiradoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyDetalleChequeGirado(true);
			detallechequegiradoSessionBean.setlIdDetalleChequeGiradoActualForeignKey(this.idDetalleChequeGiradoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}

	public String registrarSesionDetalleChequeGiradoParaBusquedaEmpleados() throws Exception {
		Boolean isPaginaPopupEmpleado=false;

		try {

			if(detallechequegiradoSessionBean==null) {
				detallechequegiradoSessionBean=new DetalleChequeGiradoSessionBean();
			}

			if(empleadoSessionBean==null) {
				empleadoSessionBean=new EmpleadoSessionBean();
			}

			empleadoSessionBean.setsPathNavegacionActual(detallechequegiradoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+EmpleadoConstantesFunciones.SCLASSWEBTITULO);
			empleadoSessionBean.setisPermiteRecargarInformacion(false);
			empleadoSessionBean.setisPaginaPopup(true);
			isPaginaPopupEmpleado=empleadoSessionBean.getisPaginaPopup();
			empleadoSessionBean.setisPaginaPopup(false);
			empleadoSessionBean.setEstaModoBusqueda(true);
			empleadoSessionBean.setsFuncionBusquedaRapida("window.opener.detallechequegiradoFuncionGeneral.setCombosCodigoDesdeBusquedaid_empleado(TO_REPLACE);");
			empleadoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeEmpleado(true);
			empleadoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleado(DetalleChequeGiradoConstantesFunciones.SNOMBREOPCION);
			//empleadoSessionBean.setisBusquedaDesdeForeignKeySesionDetalleChequeGirado(true);
			//empleadoSessionBean.setlidDetalleChequeGiradoActual(this.idDetalleChequeGiradoActual);

			detallechequegiradoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyDetalleChequeGirado(true);
			detallechequegiradoSessionBean.setlIdDetalleChequeGiradoActualForeignKey(this.idDetalleChequeGiradoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//DetalleChequeGiradoSessionBean detallechequegiradoSessionBean=new DetalleChequeGiradoSessionBean();
		
		if(this.detallechequegiradoSessionBean==null) {
			this.detallechequegiradoSessionBean=new DetalleChequeGiradoSessionBean();
		}
		
		this.detallechequegiradoSessionBean.setsUltimaBusquedaDetalleChequeGirado(this.getsAccionBusqueda());
		this.detallechequegiradoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.detallechequegiradoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdAsientoContable")) {
			detallechequegiradoSessionBean.setid_asiento_contable(this.getid_asiento_contableFK_IdAsientoContable());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdCuentaBanco")) {
			detallechequegiradoSessionBean.setid_cuenta_banco(this.getid_cuenta_bancoFK_IdCuentaBanco());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEjercicio")) {
			detallechequegiradoSessionBean.setid_ejercicio(this.getid_ejercicioFK_IdEjercicio());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
			detallechequegiradoSessionBean.setid_empleado(this.getid_empleadoFK_IdEmpleado());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			detallechequegiradoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdPeriodo")) {
			detallechequegiradoSessionBean.setid_periodo(this.getid_periodoFK_IdPeriodo());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			detallechequegiradoSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//DetalleChequeGiradoSessionBean detallechequegiradoSessionBean=new DetalleChequeGiradoSessionBean();
		
		if(this.detallechequegiradoSessionBean==null) {
			this.detallechequegiradoSessionBean=new DetalleChequeGiradoSessionBean();
		}
		
		if(this.detallechequegiradoSessionBean.getsUltimaBusquedaDetalleChequeGirado()!=null&&!this.detallechequegiradoSessionBean.getsUltimaBusquedaDetalleChequeGirado().equals("")) {
			this.setsAccionBusqueda(detallechequegiradoSessionBean.getsUltimaBusquedaDetalleChequeGirado());
			this.setiNumeroPaginacion(detallechequegiradoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(detallechequegiradoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdAsientoContable")) {
				this.setid_asiento_contableFK_IdAsientoContable(detallechequegiradoSessionBean.getid_asiento_contable());
				detallechequegiradoSessionBean.setid_asiento_contable(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdCuentaBanco")) {
				this.setid_cuenta_bancoFK_IdCuentaBanco(detallechequegiradoSessionBean.getid_cuenta_banco());
				detallechequegiradoSessionBean.setid_cuenta_banco(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEjercicio")) {
				this.setid_ejercicioFK_IdEjercicio(detallechequegiradoSessionBean.getid_ejercicio());
				detallechequegiradoSessionBean.setid_ejercicio(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
				this.setid_empleadoFK_IdEmpleado(detallechequegiradoSessionBean.getid_empleado());
				detallechequegiradoSessionBean.setid_empleado(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(detallechequegiradoSessionBean.getid_empresa());
				detallechequegiradoSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdPeriodo")) {
				this.setid_periodoFK_IdPeriodo(detallechequegiradoSessionBean.getid_periodo());
				detallechequegiradoSessionBean.setid_periodo(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(detallechequegiradoSessionBean.getid_sucursal());
				detallechequegiradoSessionBean.setid_sucursal(-1L);
			}
		}
		
		this.detallechequegiradoSessionBean.setsUltimaBusquedaDetalleChequeGirado("");
		this.detallechequegiradoSessionBean.setiNumeroPaginacion(DetalleChequeGiradoConstantesFunciones.INUMEROPAGINACION);
		this.detallechequegiradoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaDetalleChequeGirado(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioDetalleChequeGirado() {
		this.updateBorderResaltarBusquedasFormularioDetalleChequeGirado();
		this.updateVisibilidadBusquedasFormularioDetalleChequeGirado();
		this.updateHabilitarBusquedasFormularioDetalleChequeGirado();
	}
	
	public void updateBorderResaltarBusquedasFormularioDetalleChequeGirado() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasDetalleChequeGirado.getComponents().length>0) {
	

		if(this.detallechequegiradoConstantesFunciones.resaltarFK_IdAsientoContableDetalleChequeGirado!=null) {
			index= this.jTabbedPaneBusquedasDetalleChequeGirado.indexOfComponent(this.jPanelFK_IdAsientoContableDetalleChequeGirado);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleChequeGirado.getComponent(index);
				jPanel.setBorder(this.detallechequegiradoConstantesFunciones.resaltarFK_IdAsientoContableDetalleChequeGirado);
			}
		}

		if(this.detallechequegiradoConstantesFunciones.resaltarFK_IdCuentaBancoDetalleChequeGirado!=null) {
			index= this.jTabbedPaneBusquedasDetalleChequeGirado.indexOfComponent(this.jPanelFK_IdCuentaBancoDetalleChequeGirado);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleChequeGirado.getComponent(index);
				jPanel.setBorder(this.detallechequegiradoConstantesFunciones.resaltarFK_IdCuentaBancoDetalleChequeGirado);
			}
		}

		if(this.detallechequegiradoConstantesFunciones.resaltarFK_IdEmpleadoDetalleChequeGirado!=null) {
			index= this.jTabbedPaneBusquedasDetalleChequeGirado.indexOfComponent(this.jPanelFK_IdEmpleadoDetalleChequeGirado);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleChequeGirado.getComponent(index);
				jPanel.setBorder(this.detallechequegiradoConstantesFunciones.resaltarFK_IdEmpleadoDetalleChequeGirado);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioDetalleChequeGirado() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasDetalleChequeGirado.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDetalleChequeGirado.indexOfComponent(this.jPanelFK_IdAsientoContableDetalleChequeGirado);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleChequeGirado.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.detallechequegiradoConstantesFunciones.mostrarFK_IdAsientoContableDetalleChequeGirado);
			if(!this.detallechequegiradoConstantesFunciones.mostrarFK_IdAsientoContableDetalleChequeGirado && index>-1) {
				this.jTabbedPaneBusquedasDetalleChequeGirado.remove(index);
			}

			index= this.jTabbedPaneBusquedasDetalleChequeGirado.indexOfComponent(this.jPanelFK_IdCuentaBancoDetalleChequeGirado);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleChequeGirado.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.detallechequegiradoConstantesFunciones.mostrarFK_IdCuentaBancoDetalleChequeGirado);
			if(!this.detallechequegiradoConstantesFunciones.mostrarFK_IdCuentaBancoDetalleChequeGirado && index>-1) {
				this.jTabbedPaneBusquedasDetalleChequeGirado.remove(index);
			}

			index= this.jTabbedPaneBusquedasDetalleChequeGirado.indexOfComponent(this.jPanelFK_IdEmpleadoDetalleChequeGirado);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleChequeGirado.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.detallechequegiradoConstantesFunciones.mostrarFK_IdEmpleadoDetalleChequeGirado);
			if(!this.detallechequegiradoConstantesFunciones.mostrarFK_IdEmpleadoDetalleChequeGirado && index>-1) {
				this.jTabbedPaneBusquedasDetalleChequeGirado.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioDetalleChequeGirado() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasDetalleChequeGirado.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDetalleChequeGirado.indexOfComponent(this.jPanelFK_IdAsientoContableDetalleChequeGirado);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleChequeGirado.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.detallechequegiradoConstantesFunciones.activarFK_IdAsientoContableDetalleChequeGirado);
				this.jTabbedPaneBusquedasDetalleChequeGirado.setEnabledAt(index,this.detallechequegiradoConstantesFunciones.activarFK_IdAsientoContableDetalleChequeGirado);
			}

			index= this.jTabbedPaneBusquedasDetalleChequeGirado.indexOfComponent(this.jPanelFK_IdCuentaBancoDetalleChequeGirado);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleChequeGirado.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.detallechequegiradoConstantesFunciones.activarFK_IdCuentaBancoDetalleChequeGirado);
				this.jTabbedPaneBusquedasDetalleChequeGirado.setEnabledAt(index,this.detallechequegiradoConstantesFunciones.activarFK_IdCuentaBancoDetalleChequeGirado);
			}

			index= this.jTabbedPaneBusquedasDetalleChequeGirado.indexOfComponent(this.jPanelFK_IdEmpleadoDetalleChequeGirado);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleChequeGirado.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.detallechequegiradoConstantesFunciones.activarFK_IdEmpleadoDetalleChequeGirado);
				this.jTabbedPaneBusquedasDetalleChequeGirado.setEnabledAt(index,this.detallechequegiradoConstantesFunciones.activarFK_IdEmpleadoDetalleChequeGirado);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaDetalleChequeGirado(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdAsientoContable")) {
			index= this.jTabbedPaneBusquedasDetalleChequeGirado.indexOfComponent(this.jPanelFK_IdAsientoContableDetalleChequeGirado);

			this.jTabbedPaneBusquedasDetalleChequeGirado.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleChequeGirado.getComponent(index);

			this.detallechequegiradoConstantesFunciones.setResaltarFK_IdAsientoContableDetalleChequeGirado(resaltar);

			jPanel.setBorder(this.detallechequegiradoConstantesFunciones.resaltarFK_IdAsientoContableDetalleChequeGirado);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdCuentaBanco")) {
			index= this.jTabbedPaneBusquedasDetalleChequeGirado.indexOfComponent(this.jPanelFK_IdCuentaBancoDetalleChequeGirado);

			this.jTabbedPaneBusquedasDetalleChequeGirado.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleChequeGirado.getComponent(index);

			this.detallechequegiradoConstantesFunciones.setResaltarFK_IdCuentaBancoDetalleChequeGirado(resaltar);

			jPanel.setBorder(this.detallechequegiradoConstantesFunciones.resaltarFK_IdCuentaBancoDetalleChequeGirado);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdEmpleado")) {
			index= this.jTabbedPaneBusquedasDetalleChequeGirado.indexOfComponent(this.jPanelFK_IdEmpleadoDetalleChequeGirado);

			this.jTabbedPaneBusquedasDetalleChequeGirado.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleChequeGirado.getComponent(index);

			this.detallechequegiradoConstantesFunciones.setResaltarFK_IdEmpleadoDetalleChequeGirado(resaltar);

			jPanel.setBorder(this.detallechequegiradoConstantesFunciones.resaltarFK_IdEmpleadoDetalleChequeGirado);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarDetalleChequeGirado.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioDetalleChequeGirado() throws Exception {

		if(this.jInternalFrameDetalleFormDetalleChequeGirado==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioDetalleChequeGirado();
		this.updateVisibilidadResaltarControlesFormularioDetalleChequeGirado();
		this.updateHabilitarResaltarControlesFormularioDetalleChequeGirado();
		
	}
	
	public void updateBorderResaltarControlesFormularioDetalleChequeGirado() throws Exception {
		if(this.jInternalFrameDetalleFormDetalleChequeGirado==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.detallechequegiradoConstantesFunciones.resaltaridDetalleChequeGirado!=null && this.jInternalFrameDetalleFormDetalleChequeGirado!=null) {this.jInternalFrameDetalleFormDetalleChequeGirado.jLabelidDetalleChequeGirado.setBorder(this.detallechequegiradoConstantesFunciones.resaltaridDetalleChequeGirado);}
		if(this.detallechequegiradoConstantesFunciones.resaltarid_empresaDetalleChequeGirado!=null && this.jInternalFrameDetalleFormDetalleChequeGirado!=null) {this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_empresaDetalleChequeGirado.setBorder(this.detallechequegiradoConstantesFunciones.resaltarid_empresaDetalleChequeGirado);}
		if(this.detallechequegiradoConstantesFunciones.resaltarid_sucursalDetalleChequeGirado!=null && this.jInternalFrameDetalleFormDetalleChequeGirado!=null) {this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_sucursalDetalleChequeGirado.setBorder(this.detallechequegiradoConstantesFunciones.resaltarid_sucursalDetalleChequeGirado);}
		if(this.detallechequegiradoConstantesFunciones.resaltarid_ejercicioDetalleChequeGirado!=null && this.jInternalFrameDetalleFormDetalleChequeGirado!=null) {this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_ejercicioDetalleChequeGirado.setBorder(this.detallechequegiradoConstantesFunciones.resaltarid_ejercicioDetalleChequeGirado);}
		if(this.detallechequegiradoConstantesFunciones.resaltarid_periodoDetalleChequeGirado!=null && this.jInternalFrameDetalleFormDetalleChequeGirado!=null) {this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_periodoDetalleChequeGirado.setBorder(this.detallechequegiradoConstantesFunciones.resaltarid_periodoDetalleChequeGirado);}
		if(this.detallechequegiradoConstantesFunciones.resaltarid_asiento_contableDetalleChequeGirado!=null && this.jInternalFrameDetalleFormDetalleChequeGirado!=null) {this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_asiento_contableDetalleChequeGirado.setBorder(this.detallechequegiradoConstantesFunciones.resaltarid_asiento_contableDetalleChequeGirado);}
		if(this.detallechequegiradoConstantesFunciones.resaltarid_empleadoDetalleChequeGirado!=null && this.jInternalFrameDetalleFormDetalleChequeGirado!=null) {this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_empleadoDetalleChequeGirado.setBorder(this.detallechequegiradoConstantesFunciones.resaltarid_empleadoDetalleChequeGirado);}
		if(this.detallechequegiradoConstantesFunciones.resaltarid_cuenta_bancoDetalleChequeGirado!=null && this.jInternalFrameDetalleFormDetalleChequeGirado!=null) {this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_cuenta_bancoDetalleChequeGirado.setBorder(this.detallechequegiradoConstantesFunciones.resaltarid_cuenta_bancoDetalleChequeGirado);}
		if(this.detallechequegiradoConstantesFunciones.resaltarnumero_chequeDetalleChequeGirado!=null && this.jInternalFrameDetalleFormDetalleChequeGirado!=null) {this.jInternalFrameDetalleFormDetalleChequeGirado.jTextFieldnumero_chequeDetalleChequeGirado.setBorder(this.detallechequegiradoConstantesFunciones.resaltarnumero_chequeDetalleChequeGirado);}
		if(this.detallechequegiradoConstantesFunciones.resaltarvalorDetalleChequeGirado!=null && this.jInternalFrameDetalleFormDetalleChequeGirado!=null) {this.jInternalFrameDetalleFormDetalleChequeGirado.jTextFieldvalorDetalleChequeGirado.setBorder(this.detallechequegiradoConstantesFunciones.resaltarvalorDetalleChequeGirado);}
		if(this.detallechequegiradoConstantesFunciones.resaltarcuentaDetalleChequeGirado!=null && this.jInternalFrameDetalleFormDetalleChequeGirado!=null) {this.jInternalFrameDetalleFormDetalleChequeGirado.jTextFieldcuentaDetalleChequeGirado.setBorder(this.detallechequegiradoConstantesFunciones.resaltarcuentaDetalleChequeGirado);}
		if(this.detallechequegiradoConstantesFunciones.resaltarfechaDetalleChequeGirado!=null && this.jInternalFrameDetalleFormDetalleChequeGirado!=null) {this.jInternalFrameDetalleFormDetalleChequeGirado.jDateChooserfechaDetalleChequeGirado.setBorder(this.detallechequegiradoConstantesFunciones.resaltarfechaDetalleChequeGirado);}
		if(this.detallechequegiradoConstantesFunciones.resaltarconDetalleChequeGirado!=null && this.jInternalFrameDetalleFormDetalleChequeGirado!=null) {this.jInternalFrameDetalleFormDetalleChequeGirado.jCheckBoxconDetalleChequeGirado.setBorderPainted(true);this.jInternalFrameDetalleFormDetalleChequeGirado.jCheckBoxconDetalleChequeGirado.setBorder(this.detallechequegiradoConstantesFunciones.resaltarconDetalleChequeGirado);}
		if(this.detallechequegiradoConstantesFunciones.resaltarbeneficiarioDetalleChequeGirado!=null && this.jInternalFrameDetalleFormDetalleChequeGirado!=null) {this.jInternalFrameDetalleFormDetalleChequeGirado.jTextAreabeneficiarioDetalleChequeGirado.setBorder(this.detallechequegiradoConstantesFunciones.resaltarbeneficiarioDetalleChequeGirado);}
		if(this.detallechequegiradoConstantesFunciones.resaltarcodigoDetalleChequeGirado!=null && this.jInternalFrameDetalleFormDetalleChequeGirado!=null) {this.jInternalFrameDetalleFormDetalleChequeGirado.jTextFieldcodigoDetalleChequeGirado.setBorder(this.detallechequegiradoConstantesFunciones.resaltarcodigoDetalleChequeGirado);}
		if(this.detallechequegiradoConstantesFunciones.resaltarnombre_bancoDetalleChequeGirado!=null && this.jInternalFrameDetalleFormDetalleChequeGirado!=null) {this.jInternalFrameDetalleFormDetalleChequeGirado.jTextAreanombre_bancoDetalleChequeGirado.setBorder(this.detallechequegiradoConstantesFunciones.resaltarnombre_bancoDetalleChequeGirado);}
		if(this.detallechequegiradoConstantesFunciones.resaltarid_anioDetalleChequeGirado!=null && this.jInternalFrameDetalleFormDetalleChequeGirado!=null) {this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_anioDetalleChequeGirado.setBorder(this.detallechequegiradoConstantesFunciones.resaltarid_anioDetalleChequeGirado);}
		if(this.detallechequegiradoConstantesFunciones.resaltarid_mesDetalleChequeGirado!=null && this.jInternalFrameDetalleFormDetalleChequeGirado!=null) {this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_mesDetalleChequeGirado.setBorder(this.detallechequegiradoConstantesFunciones.resaltarid_mesDetalleChequeGirado);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioDetalleChequeGirado() throws Exception {		
		if(this.jInternalFrameDetalleFormDetalleChequeGirado==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) {
	
		//this.jInternalFrameDetalleFormDetalleChequeGirado.jLabelidDetalleChequeGirado.setVisible(this.detallechequegiradoConstantesFunciones.mostraridDetalleChequeGirado);
		this.jInternalFrameDetalleFormDetalleChequeGirado.jPanelidDetalleChequeGirado.setVisible(this.detallechequegiradoConstantesFunciones.mostraridDetalleChequeGirado);
		//this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_empresaDetalleChequeGirado.setVisible(this.detallechequegiradoConstantesFunciones.mostrarid_empresaDetalleChequeGirado);
		this.jInternalFrameDetalleFormDetalleChequeGirado.jPanelid_empresaDetalleChequeGirado.setVisible(this.detallechequegiradoConstantesFunciones.mostrarid_empresaDetalleChequeGirado);
		//this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_sucursalDetalleChequeGirado.setVisible(this.detallechequegiradoConstantesFunciones.mostrarid_sucursalDetalleChequeGirado);
		this.jInternalFrameDetalleFormDetalleChequeGirado.jPanelid_sucursalDetalleChequeGirado.setVisible(this.detallechequegiradoConstantesFunciones.mostrarid_sucursalDetalleChequeGirado);
		//this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_ejercicioDetalleChequeGirado.setVisible(this.detallechequegiradoConstantesFunciones.mostrarid_ejercicioDetalleChequeGirado);
		this.jInternalFrameDetalleFormDetalleChequeGirado.jPanelid_ejercicioDetalleChequeGirado.setVisible(this.detallechequegiradoConstantesFunciones.mostrarid_ejercicioDetalleChequeGirado);
		//this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_periodoDetalleChequeGirado.setVisible(this.detallechequegiradoConstantesFunciones.mostrarid_periodoDetalleChequeGirado);
		this.jInternalFrameDetalleFormDetalleChequeGirado.jPanelid_periodoDetalleChequeGirado.setVisible(this.detallechequegiradoConstantesFunciones.mostrarid_periodoDetalleChequeGirado);
		//this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_asiento_contableDetalleChequeGirado.setVisible(this.detallechequegiradoConstantesFunciones.mostrarid_asiento_contableDetalleChequeGirado);
		this.jInternalFrameDetalleFormDetalleChequeGirado.jPanelid_asiento_contableDetalleChequeGirado.setVisible(this.detallechequegiradoConstantesFunciones.mostrarid_asiento_contableDetalleChequeGirado);
			this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonid_asiento_contableDetalleChequeGirado.setVisible(this.detallechequegiradoConstantesFunciones.mostrarid_asiento_contableDetalleChequeGirado);
		//this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_empleadoDetalleChequeGirado.setVisible(this.detallechequegiradoConstantesFunciones.mostrarid_empleadoDetalleChequeGirado);
		this.jInternalFrameDetalleFormDetalleChequeGirado.jPanelid_empleadoDetalleChequeGirado.setVisible(this.detallechequegiradoConstantesFunciones.mostrarid_empleadoDetalleChequeGirado);
			this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonid_empleadoDetalleChequeGirado.setVisible(this.detallechequegiradoConstantesFunciones.mostrarid_empleadoDetalleChequeGirado);
		//this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_cuenta_bancoDetalleChequeGirado.setVisible(this.detallechequegiradoConstantesFunciones.mostrarid_cuenta_bancoDetalleChequeGirado);
		this.jInternalFrameDetalleFormDetalleChequeGirado.jPanelid_cuenta_bancoDetalleChequeGirado.setVisible(this.detallechequegiradoConstantesFunciones.mostrarid_cuenta_bancoDetalleChequeGirado);
		//this.jInternalFrameDetalleFormDetalleChequeGirado.jTextFieldnumero_chequeDetalleChequeGirado.setVisible(this.detallechequegiradoConstantesFunciones.mostrarnumero_chequeDetalleChequeGirado);
		this.jInternalFrameDetalleFormDetalleChequeGirado.jPanelnumero_chequeDetalleChequeGirado.setVisible(this.detallechequegiradoConstantesFunciones.mostrarnumero_chequeDetalleChequeGirado);
		//this.jInternalFrameDetalleFormDetalleChequeGirado.jTextFieldvalorDetalleChequeGirado.setVisible(this.detallechequegiradoConstantesFunciones.mostrarvalorDetalleChequeGirado);
		this.jInternalFrameDetalleFormDetalleChequeGirado.jPanelvalorDetalleChequeGirado.setVisible(this.detallechequegiradoConstantesFunciones.mostrarvalorDetalleChequeGirado);
		//this.jInternalFrameDetalleFormDetalleChequeGirado.jTextFieldcuentaDetalleChequeGirado.setVisible(this.detallechequegiradoConstantesFunciones.mostrarcuentaDetalleChequeGirado);
		this.jInternalFrameDetalleFormDetalleChequeGirado.jPanelcuentaDetalleChequeGirado.setVisible(this.detallechequegiradoConstantesFunciones.mostrarcuentaDetalleChequeGirado);
		//this.jInternalFrameDetalleFormDetalleChequeGirado.jDateChooserfechaDetalleChequeGirado.setVisible(this.detallechequegiradoConstantesFunciones.mostrarfechaDetalleChequeGirado);
		this.jInternalFrameDetalleFormDetalleChequeGirado.jPanelfechaDetalleChequeGirado.setVisible(this.detallechequegiradoConstantesFunciones.mostrarfechaDetalleChequeGirado);
		//this.jInternalFrameDetalleFormDetalleChequeGirado.jCheckBoxconDetalleChequeGirado.setVisible(this.detallechequegiradoConstantesFunciones.mostrarconDetalleChequeGirado);
		this.jInternalFrameDetalleFormDetalleChequeGirado.jPanelconDetalleChequeGirado.setVisible(this.detallechequegiradoConstantesFunciones.mostrarconDetalleChequeGirado);
		//this.jInternalFrameDetalleFormDetalleChequeGirado.jTextAreabeneficiarioDetalleChequeGirado.setVisible(this.detallechequegiradoConstantesFunciones.mostrarbeneficiarioDetalleChequeGirado);
		this.jInternalFrameDetalleFormDetalleChequeGirado.jPanelbeneficiarioDetalleChequeGirado.setVisible(this.detallechequegiradoConstantesFunciones.mostrarbeneficiarioDetalleChequeGirado);
		//this.jInternalFrameDetalleFormDetalleChequeGirado.jTextFieldcodigoDetalleChequeGirado.setVisible(this.detallechequegiradoConstantesFunciones.mostrarcodigoDetalleChequeGirado);
		this.jInternalFrameDetalleFormDetalleChequeGirado.jPanelcodigoDetalleChequeGirado.setVisible(this.detallechequegiradoConstantesFunciones.mostrarcodigoDetalleChequeGirado);
		//this.jInternalFrameDetalleFormDetalleChequeGirado.jTextAreanombre_bancoDetalleChequeGirado.setVisible(this.detallechequegiradoConstantesFunciones.mostrarnombre_bancoDetalleChequeGirado);
		this.jInternalFrameDetalleFormDetalleChequeGirado.jPanelnombre_bancoDetalleChequeGirado.setVisible(this.detallechequegiradoConstantesFunciones.mostrarnombre_bancoDetalleChequeGirado);
		//this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_anioDetalleChequeGirado.setVisible(this.detallechequegiradoConstantesFunciones.mostrarid_anioDetalleChequeGirado);
		this.jInternalFrameDetalleFormDetalleChequeGirado.jPanelid_anioDetalleChequeGirado.setVisible(this.detallechequegiradoConstantesFunciones.mostrarid_anioDetalleChequeGirado);
		//this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_mesDetalleChequeGirado.setVisible(this.detallechequegiradoConstantesFunciones.mostrarid_mesDetalleChequeGirado);
		this.jInternalFrameDetalleFormDetalleChequeGirado.jPanelid_mesDetalleChequeGirado.setVisible(this.detallechequegiradoConstantesFunciones.mostrarid_mesDetalleChequeGirado);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioDetalleChequeGirado() throws Exception {
		if(this.jInternalFrameDetalleFormDetalleChequeGirado==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDetalleChequeGirado!=null) {
	
		this.jInternalFrameDetalleFormDetalleChequeGirado.jLabelidDetalleChequeGirado.setEnabled(this.detallechequegiradoConstantesFunciones.activaridDetalleChequeGirado);
		this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_empresaDetalleChequeGirado.setEnabled(this.detallechequegiradoConstantesFunciones.activarid_empresaDetalleChequeGirado);
		this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_sucursalDetalleChequeGirado.setEnabled(this.detallechequegiradoConstantesFunciones.activarid_sucursalDetalleChequeGirado);
		this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_ejercicioDetalleChequeGirado.setEnabled(this.detallechequegiradoConstantesFunciones.activarid_ejercicioDetalleChequeGirado);
		this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_periodoDetalleChequeGirado.setEnabled(this.detallechequegiradoConstantesFunciones.activarid_periodoDetalleChequeGirado);
		this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_asiento_contableDetalleChequeGirado.setEnabled(this.detallechequegiradoConstantesFunciones.activarid_asiento_contableDetalleChequeGirado);
			this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonid_asiento_contableDetalleChequeGirado.setEnabled(this.detallechequegiradoConstantesFunciones.activarid_asiento_contableDetalleChequeGirado);
		this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_empleadoDetalleChequeGirado.setEnabled(this.detallechequegiradoConstantesFunciones.activarid_empleadoDetalleChequeGirado);
			this.jInternalFrameDetalleFormDetalleChequeGirado.jButtonid_empleadoDetalleChequeGirado.setEnabled(this.detallechequegiradoConstantesFunciones.activarid_empleadoDetalleChequeGirado);
		this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_cuenta_bancoDetalleChequeGirado.setEnabled(this.detallechequegiradoConstantesFunciones.activarid_cuenta_bancoDetalleChequeGirado);
		this.jInternalFrameDetalleFormDetalleChequeGirado.jTextFieldnumero_chequeDetalleChequeGirado.setEnabled(this.detallechequegiradoConstantesFunciones.activarnumero_chequeDetalleChequeGirado);
		this.jInternalFrameDetalleFormDetalleChequeGirado.jTextFieldvalorDetalleChequeGirado.setEnabled(this.detallechequegiradoConstantesFunciones.activarvalorDetalleChequeGirado);
		this.jInternalFrameDetalleFormDetalleChequeGirado.jTextFieldcuentaDetalleChequeGirado.setEnabled(this.detallechequegiradoConstantesFunciones.activarcuentaDetalleChequeGirado);
		this.jInternalFrameDetalleFormDetalleChequeGirado.jDateChooserfechaDetalleChequeGirado.setEnabled(this.detallechequegiradoConstantesFunciones.activarfechaDetalleChequeGirado);
		this.jInternalFrameDetalleFormDetalleChequeGirado.jCheckBoxconDetalleChequeGirado.setEnabled(this.detallechequegiradoConstantesFunciones.activarconDetalleChequeGirado);
		this.jInternalFrameDetalleFormDetalleChequeGirado.jTextAreabeneficiarioDetalleChequeGirado.setEnabled(this.detallechequegiradoConstantesFunciones.activarbeneficiarioDetalleChequeGirado);
		this.jInternalFrameDetalleFormDetalleChequeGirado.jTextFieldcodigoDetalleChequeGirado.setEnabled(this.detallechequegiradoConstantesFunciones.activarcodigoDetalleChequeGirado);
		this.jInternalFrameDetalleFormDetalleChequeGirado.jTextAreanombre_bancoDetalleChequeGirado.setEnabled(this.detallechequegiradoConstantesFunciones.activarnombre_bancoDetalleChequeGirado);
		this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_anioDetalleChequeGirado.setEnabled(this.detallechequegiradoConstantesFunciones.activarid_anioDetalleChequeGirado);
		this.jInternalFrameDetalleFormDetalleChequeGirado.jComboBoxid_mesDetalleChequeGirado.setEnabled(this.detallechequegiradoConstantesFunciones.activarid_mesDetalleChequeGirado);
		}
	}
	
		
}