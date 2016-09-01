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

import com.bydan.erp.tesoreria.util.DetallePagoChequeConstantesFunciones;
import com.bydan.erp.tesoreria.util.DetallePagoChequeParameterReturnGeneral;
//import com.bydan.erp.tesoreria.util.DetallePagoChequeParameterGeneral;
//import com.bydan.erp.tesoreria.presentation.report.source.DetallePagoChequeBean;
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
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class DetallePagoChequeBeanSwingJInternalFrame extends DetallePagoChequeJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(DetallePagoChequeBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<DetallePagoCheque> detallepagochequeValidator = new ClassValidator<DetallePagoCheque>(DetallePagoCheque.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public DetallePagoCheque detallepagocheque;	
	public DetallePagoCheque detallepagochequeAux;
	public DetallePagoCheque detallepagochequeAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public DetallePagoCheque detallepagochequeTotales;
	public Long idDetallePagoChequeActual;
	public Long iIdNuevoDetallePagoCheque=0L;
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

		
	
	
	
	//BUSQUEDA INTERNA FK
	public Long idAsientoContableActual=0L;

	public Long getidAsientoContableActual() {
		return idAsientoContableActual;
	}

	public void setidAsientoContableActual(Long idAsientoContableActual) {
		this.idAsientoContableActual= idAsientoContableActual;
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
	
	public Boolean isPermisoTodoDetallePagoCheque;
	public Boolean isPermisoNuevoDetallePagoCheque;
	public Boolean isPermisoActualizarDetallePagoCheque;
	public Boolean isPermisoActualizarOriginalDetallePagoCheque;
	public Boolean isPermisoEliminarDetallePagoCheque;
	public Boolean isPermisoGuardarCambiosDetallePagoCheque;
	public Boolean isPermisoConsultaDetallePagoCheque;
	public Boolean isPermisoBusquedaDetallePagoCheque;
	public Boolean isPermisoReporteDetallePagoCheque;
	public Boolean isPermisoPaginacionMedioDetallePagoCheque;
	public Boolean isPermisoPaginacionAltoDetallePagoCheque;
	public Boolean isPermisoPaginacionTodoDetallePagoCheque;
	public Boolean isPermisoCopiarDetallePagoCheque;
	public Boolean isPermisoVerFormDetallePagoCheque;
	public Boolean isPermisoDuplicarDetallePagoCheque;
	public Boolean isPermisoOrdenDetallePagoCheque;
	
	
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
	
	public DetallePagoChequeParameterReturnGeneral detallepagochequeReturnGeneral;
	public DetallePagoChequeParameterReturnGeneral detallepagochequeParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoDetallePagoCheque=false;
	public Boolean esParaAccionDesdeFormularioDetallePagoCheque=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected DetallePagoChequeSessionBeanAdditional detallepagochequeSessionBeanAdditional=null;
	
	public DetallePagoChequeSessionBeanAdditional getDetallePagoChequeSessionBeanAdditional() {
		return this.detallepagochequeSessionBeanAdditional;
	}
	
	public void setDetallePagoChequeSessionBeanAdditional(DetallePagoChequeSessionBeanAdditional detallepagochequeSessionBeanAdditional) {
		try {
			this.detallepagochequeSessionBeanAdditional=detallepagochequeSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected DetallePagoChequeBeanSwingJInternalFrameAdditional detallepagochequeBeanSwingJInternalFrameAdditional=null;
	//public class DetallePagoChequeBeanSwingJInternalFrame
	
	public DetallePagoChequeBeanSwingJInternalFrameAdditional getDetallePagoChequeBeanSwingJInternalFrameAdditional() {
		return this.detallepagochequeBeanSwingJInternalFrameAdditional;
	}
	
	public void setDetallePagoChequeBeanSwingJInternalFrameAdditional(DetallePagoChequeBeanSwingJInternalFrameAdditional detallepagochequeBeanSwingJInternalFrameAdditional) {
		try {
			this.detallepagochequeBeanSwingJInternalFrameAdditional=detallepagochequeBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public DetallePagoChequeLogic detallepagochequeLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public DetallePagoCheque detallepagochequeBean;
	public DetallePagoChequeConstantesFunciones detallepagochequeConstantesFunciones;
	//public DetallePagoChequeParameterReturnGeneral detallepagochequeReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public AsientoContableLogic asientocontableLogic;
	public EjercicioLogic ejercicioLogic;
	public PeriodoLogic periodoLogic;
	public AnioLogic anioLogic;
	public MesLogic mesLogic;
	
	//PARAMETROS
	
	
	//public List<DetallePagoCheque> detallepagocheques;	
	//public List<DetallePagoCheque> detallepagochequesEliminados;
	//public List<DetallePagoCheque> detallepagochequesAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoDetallePagoCheque=false;
	public Boolean isVisibilidadCeldaDuplicarDetallePagoCheque=true;
	public Boolean isVisibilidadCeldaCopiarDetallePagoCheque=true;
	public Boolean isVisibilidadCeldaVerFormDetallePagoCheque=true;
	public Boolean isVisibilidadCeldaOrdenDetallePagoCheque=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesDetallePagoCheque=false;
	public Boolean isVisibilidadCeldaModificarDetallePagoCheque=false;
	public Boolean isVisibilidadCeldaActualizarDetallePagoCheque=false;
	public Boolean isVisibilidadCeldaEliminarDetallePagoCheque=false;
	public Boolean isVisibilidadCeldaCancelarDetallePagoCheque=false;
	public Boolean isVisibilidadCeldaGuardarDetallePagoCheque=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosDetallePagoCheque=false;	
	
	
	public Boolean isVisibilidadFK_IdAnio=false;
	public Boolean isVisibilidadFK_IdAsientoContable=false;
	public Boolean isVisibilidadFK_IdEjercicio=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdMes=false;
	public Boolean isVisibilidadFK_IdPeriodo=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoDetallePagoCheque() {
		return this.iIdNuevoDetallePagoCheque;
	}

	public void setiIdNuevoDetallePagoCheque(Long iIdNuevoDetallePagoCheque) {
		this.iIdNuevoDetallePagoCheque = iIdNuevoDetallePagoCheque;
	}
	
	public Long getidDetallePagoChequeActual() {
		return this.idDetallePagoChequeActual;
	}

	public void setidDetallePagoChequeActual(Long idDetallePagoChequeActual) {
		this.idDetallePagoChequeActual = idDetallePagoChequeActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public DetallePagoCheque getdetallepagocheque() {
		return this.detallepagocheque;
	}

	public void setdetallepagocheque(DetallePagoCheque detallepagocheque) {
		this.detallepagocheque = detallepagocheque;
	}
	
	public DetallePagoCheque getdetallepagochequeAux() {
		return this.detallepagochequeAux;
	}

	public void setdetallepagochequeAux(DetallePagoCheque detallepagochequeAux) {
		this.detallepagochequeAux = detallepagochequeAux;
	}				
	
	public DetallePagoCheque getdetallepagochequeAnterior() {
		return this.detallepagochequeAnterior;
	}

	public void setdetallepagochequeAnterior(DetallePagoCheque detallepagochequeAnterior) {
		this.detallepagochequeAnterior = detallepagochequeAnterior;
	}	
	
	public DetallePagoCheque getdetallepagochequeTotales() {
		return this.detallepagochequeTotales;
	}

	public void setdetallepagochequeTotales(DetallePagoCheque detallepagochequeTotales) {
		this.detallepagochequeTotales = detallepagochequeTotales;
	}	
	
	public DetallePagoCheque getdetallepagochequeBean() {
		return this.detallepagochequeBean;
	}

	public void setdetallepagochequeBean(DetallePagoCheque detallepagochequeBean) {
		this.detallepagochequeBean = detallepagochequeBean;
	}	
	
	public DetallePagoChequeParameterReturnGeneral getdetallepagochequeReturnGeneral() {
		return this.detallepagochequeReturnGeneral;
	}

	public void setdetallepagochequeReturnGeneral(DetallePagoChequeParameterReturnGeneral detallepagochequeReturnGeneral) {
		this.detallepagochequeReturnGeneral = detallepagochequeReturnGeneral;
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
	
	
	public DetallePagoChequeLogic getDetallePagoChequeLogic()	{		
		return detallepagochequeLogic;
	}

	public void setDetallePagoChequeLogic(DetallePagoChequeLogic detallepagochequeLogic) {
		this.detallepagochequeLogic = detallepagochequeLogic;
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
	
	public Boolean getIsEsNuevoDetallePagoCheque() {
		return isEsNuevoDetallePagoCheque;
	}

	public void setIsEsNuevoDetallePagoCheque(Boolean isEsNuevoDetallePagoCheque) {
		this.isEsNuevoDetallePagoCheque = isEsNuevoDetallePagoCheque;
	}

	public Boolean getEsParaAccionDesdeFormularioDetallePagoCheque() {
		return esParaAccionDesdeFormularioDetallePagoCheque;
	}
	
	public void setEsParaAccionDesdeFormularioDetallePagoCheque(Boolean esParaAccionDesdeFormularioDetallePagoCheque) {
		this.esParaAccionDesdeFormularioDetallePagoCheque = esParaAccionDesdeFormularioDetallePagoCheque;
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

			if(this.detallepagochequeSessionBean==null) {
				this.detallepagochequeSessionBean=new DetallePagoChequeSessionBean();
			}

			if(!this.detallepagochequeSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(detallepagochequeSessionBean.getlidEmpresaActual());
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

			if(this.detallepagochequeSessionBean==null) {
				this.detallepagochequeSessionBean=new DetallePagoChequeSessionBean();
			}

			if(!this.detallepagochequeSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(detallepagochequeSessionBean.getlidSucursalActual());
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

			if(this.detallepagochequeSessionBean==null) {
				this.detallepagochequeSessionBean=new DetallePagoChequeSessionBean();
			}

			if(!this.detallepagochequeSessionBean.getisBusquedaDesdeForeignKeySesionAsientoContable()) {
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
					asientocontableLogic.getEntityWithConnection(detallepagochequeSessionBean.getlidAsientoContableActual());
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

			if(this.detallepagochequeSessionBean==null) {
				this.detallepagochequeSessionBean=new DetallePagoChequeSessionBean();
			}

			if(!this.detallepagochequeSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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
					ejercicioLogic.getEntityWithConnection(detallepagochequeSessionBean.getlidEjercicioActual());
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

			if(this.detallepagochequeSessionBean==null) {
				this.detallepagochequeSessionBean=new DetallePagoChequeSessionBean();
			}

			if(!this.detallepagochequeSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
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
					periodoLogic.getEntityWithConnection(detallepagochequeSessionBean.getlidPeriodoActual());
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

			if(this.detallepagochequeSessionBean==null) {
				this.detallepagochequeSessionBean=new DetallePagoChequeSessionBean();
			}

			if(!this.detallepagochequeSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
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
					anioLogic.getEntityWithConnection(detallepagochequeSessionBean.getlidAnioActual());
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

			if(this.detallepagochequeSessionBean==null) {
				this.detallepagochequeSessionBean=new DetallePagoChequeSessionBean();
			}

			if(!this.detallepagochequeSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
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
					mesLogic.getEntityWithConnection(detallepagochequeSessionBean.getlidMesActual());
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

					if(this.detallepagocheque!=null) {
						this.detallepagocheque.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormDetallePagoCheque!=null) {
						this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_empresaDetallePagoCheque.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaDetallePagoCheque.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormDetallePagoCheque!=null) {
						if(this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_empresaDetallePagoCheque.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_empresaDetallePagoCheque.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaDetallePagoChequeGenerico)throws Exception
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
				jComboBoxid_empresaDetallePagoChequeGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaDetallePagoChequeGenerico!=null && jComboBoxid_empresaDetallePagoChequeGenerico.getItemCount()>0) {
					jComboBoxid_empresaDetallePagoChequeGenerico.setSelectedIndex(0);
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

					if(this.detallepagocheque!=null) {
						this.detallepagocheque.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormDetallePagoCheque!=null) {
						this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_sucursalDetallePagoCheque.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalDetallePagoCheque.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormDetallePagoCheque!=null) {
						if(this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_sucursalDetallePagoCheque.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_sucursalDetallePagoCheque.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalDetallePagoChequeGenerico)throws Exception
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
				jComboBoxid_sucursalDetallePagoChequeGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalDetallePagoChequeGenerico!=null && jComboBoxid_sucursalDetallePagoChequeGenerico.getItemCount()>0) {
					jComboBoxid_sucursalDetallePagoChequeGenerico.setSelectedIndex(0);
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

					if(this.detallepagocheque!=null) {
						this.detallepagocheque.setAsientoContable(asientocontableTemp);
					}

					if(this.jInternalFrameDetalleFormDetallePagoCheque!=null) {
						this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_asiento_contableDetallePagoCheque.setSelectedItem(asientocontableTemp);
					}
				} else {
					//jComboBoxid_asiento_contableDetallePagoCheque.setSelectedItem(asientocontableTemp);
					if(this.jInternalFrameDetalleFormDetallePagoCheque!=null) {
						if(this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_asiento_contableDetallePagoCheque.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_asiento_contableDetallePagoCheque.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdAsientoContable") || sFormularioTipoBusqueda.equals("Todos")){
					if(asientocontableTemp!=null && jComboBoxid_asiento_contableFK_IdAsientoContableDetallePagoCheque!=null) {
						jComboBoxid_asiento_contableFK_IdAsientoContableDetallePagoCheque.setSelectedItem(asientocontableTemp);
					} else {
						if(jComboBoxid_asiento_contableFK_IdAsientoContableDetallePagoCheque!=null) {
							//jComboBoxid_asiento_contableFK_IdAsientoContableDetallePagoCheque.setSelectedItem(asientocontableTemp);
							if(jComboBoxid_asiento_contableFK_IdAsientoContableDetallePagoCheque.getItemCount()>0) {
								jComboBoxid_asiento_contableFK_IdAsientoContableDetallePagoCheque.setSelectedIndex(0);
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
	public void setActualAsientoContableForeignKeyGenerico(Long idAsientoContableSeleccionado,JComboBox jComboBoxid_asiento_contableDetallePagoChequeGenerico)throws Exception
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
				jComboBoxid_asiento_contableDetallePagoChequeGenerico.setSelectedItem(asientocontableTemp);
			} else {
				if(jComboBoxid_asiento_contableDetallePagoChequeGenerico!=null && jComboBoxid_asiento_contableDetallePagoChequeGenerico.getItemCount()>0) {
					jComboBoxid_asiento_contableDetallePagoChequeGenerico.setSelectedIndex(0);
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

					if(this.detallepagocheque!=null) {
						this.detallepagocheque.setEjercicio(ejercicioTemp);
					}

					if(this.jInternalFrameDetalleFormDetallePagoCheque!=null) {
						this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_ejercicioDetallePagoCheque.setSelectedItem(ejercicioTemp);
					}
				} else {
					//jComboBoxid_ejercicioDetallePagoCheque.setSelectedItem(ejercicioTemp);
					if(this.jInternalFrameDetalleFormDetallePagoCheque!=null) {
						if(this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_ejercicioDetallePagoCheque.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_ejercicioDetallePagoCheque.setSelectedIndex(0);
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
	public void setActualEjercicioForeignKeyGenerico(Long idEjercicioSeleccionado,JComboBox jComboBoxid_ejercicioDetallePagoChequeGenerico)throws Exception
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
				jComboBoxid_ejercicioDetallePagoChequeGenerico.setSelectedItem(ejercicioTemp);
			} else {
				if(jComboBoxid_ejercicioDetallePagoChequeGenerico!=null && jComboBoxid_ejercicioDetallePagoChequeGenerico.getItemCount()>0) {
					jComboBoxid_ejercicioDetallePagoChequeGenerico.setSelectedIndex(0);
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

					if(this.detallepagocheque!=null) {
						this.detallepagocheque.setPeriodo(periodoTemp);
					}

					if(this.jInternalFrameDetalleFormDetallePagoCheque!=null) {
						this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_periodoDetallePagoCheque.setSelectedItem(periodoTemp);
					}
				} else {
					//jComboBoxid_periodoDetallePagoCheque.setSelectedItem(periodoTemp);
					if(this.jInternalFrameDetalleFormDetallePagoCheque!=null) {
						if(this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_periodoDetallePagoCheque.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_periodoDetallePagoCheque.setSelectedIndex(0);
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
	public void setActualPeriodoForeignKeyGenerico(Long idPeriodoSeleccionado,JComboBox jComboBoxid_periodoDetallePagoChequeGenerico)throws Exception
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
				jComboBoxid_periodoDetallePagoChequeGenerico.setSelectedItem(periodoTemp);
			} else {
				if(jComboBoxid_periodoDetallePagoChequeGenerico!=null && jComboBoxid_periodoDetallePagoChequeGenerico.getItemCount()>0) {
					jComboBoxid_periodoDetallePagoChequeGenerico.setSelectedIndex(0);
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

					if(this.detallepagocheque!=null) {
						this.detallepagocheque.setAnio(anioTemp);
					}

					if(this.jInternalFrameDetalleFormDetallePagoCheque!=null) {
						this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_anioDetallePagoCheque.setSelectedItem(anioTemp);
					}
				} else {
					//jComboBoxid_anioDetallePagoCheque.setSelectedItem(anioTemp);
					if(this.jInternalFrameDetalleFormDetallePagoCheque!=null) {
						if(this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_anioDetallePagoCheque.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_anioDetallePagoCheque.setSelectedIndex(0);
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
	public void setActualAnioForeignKeyGenerico(Long idAnioSeleccionado,JComboBox jComboBoxid_anioDetallePagoChequeGenerico)throws Exception
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
				jComboBoxid_anioDetallePagoChequeGenerico.setSelectedItem(anioTemp);
			} else {
				if(jComboBoxid_anioDetallePagoChequeGenerico!=null && jComboBoxid_anioDetallePagoChequeGenerico.getItemCount()>0) {
					jComboBoxid_anioDetallePagoChequeGenerico.setSelectedIndex(0);
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

					if(this.detallepagocheque!=null) {
						this.detallepagocheque.setMes(mesTemp);
					}

					if(this.jInternalFrameDetalleFormDetallePagoCheque!=null) {
						this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_mesDetallePagoCheque.setSelectedItem(mesTemp);
					}
				} else {
					//jComboBoxid_mesDetallePagoCheque.setSelectedItem(mesTemp);
					if(this.jInternalFrameDetalleFormDetallePagoCheque!=null) {
						if(this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_mesDetallePagoCheque.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_mesDetallePagoCheque.setSelectedIndex(0);
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
	public void setActualMesForeignKeyGenerico(Long idMesSeleccionado,JComboBox jComboBoxid_mesDetallePagoChequeGenerico)throws Exception
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
				jComboBoxid_mesDetallePagoChequeGenerico.setSelectedItem(mesTemp);
			} else {
				if(jComboBoxid_mesDetallePagoChequeGenerico!=null && jComboBoxid_mesDetallePagoChequeGenerico.getItemCount()>0) {
					jComboBoxid_mesDetallePagoChequeGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(DetallePagoCheque detallepagocheque,JComboBox jComboBoxid_empresaDetallePagoChequeGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaDetallePagoChequeGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_empresaDetallePagoCheque.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaDetallePagoChequeGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				detallepagocheque.setid_empresa(empresaAux.getId());
				detallepagocheque.setempresa_descripcion(DetallePagoChequeConstantesFunciones.getEmpresaDescripcion(empresaAux));
				detallepagocheque.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(DetallePagoCheque detallepagocheque,JComboBox jComboBoxid_sucursalDetallePagoChequeGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalDetallePagoChequeGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_sucursalDetallePagoCheque.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalDetallePagoChequeGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				detallepagocheque.setid_sucursal(sucursalAux.getId());
				detallepagocheque.setsucursal_descripcion(DetallePagoChequeConstantesFunciones.getSucursalDescripcion(sucursalAux));
				detallepagocheque.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarAsientoContableForeignKey(DetallePagoCheque detallepagocheque,JComboBox jComboBoxid_asiento_contableDetallePagoChequeGenerico)throws Exception
	{
		try
		{
			AsientoContable  asientocontableAux=new AsientoContable();

			if(jComboBoxid_asiento_contableDetallePagoChequeGenerico==null) {
				asientocontableAux=(AsientoContable)this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_asiento_contableDetallePagoCheque.getSelectedItem();
			} else {
				asientocontableAux=(AsientoContable)jComboBoxid_asiento_contableDetallePagoChequeGenerico.getSelectedItem();
			}

			if(asientocontableAux!=null && asientocontableAux.getId()!=null) {
				detallepagocheque.setid_asiento_contable(asientocontableAux.getId());
				detallepagocheque.setasientocontable_descripcion(DetallePagoChequeConstantesFunciones.getAsientoContableDescripcion(asientocontableAux));
				detallepagocheque.setAsientoContable(asientocontableAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEjercicioForeignKey(DetallePagoCheque detallepagocheque,JComboBox jComboBoxid_ejercicioDetallePagoChequeGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioAux=new Ejercicio();

			if(jComboBoxid_ejercicioDetallePagoChequeGenerico==null) {
				ejercicioAux=(Ejercicio)this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_ejercicioDetallePagoCheque.getSelectedItem();
			} else {
				ejercicioAux=(Ejercicio)jComboBoxid_ejercicioDetallePagoChequeGenerico.getSelectedItem();
			}

			if(ejercicioAux!=null && ejercicioAux.getId()!=null) {
				detallepagocheque.setid_ejercicio(ejercicioAux.getId());
				detallepagocheque.setejercicio_descripcion(DetallePagoChequeConstantesFunciones.getEjercicioDescripcion(ejercicioAux));
				detallepagocheque.setEjercicio(ejercicioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPeriodoForeignKey(DetallePagoCheque detallepagocheque,JComboBox jComboBoxid_periodoDetallePagoChequeGenerico)throws Exception
	{
		try
		{
			Periodo  periodoAux=new Periodo();

			if(jComboBoxid_periodoDetallePagoChequeGenerico==null) {
				periodoAux=(Periodo)this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_periodoDetallePagoCheque.getSelectedItem();
			} else {
				periodoAux=(Periodo)jComboBoxid_periodoDetallePagoChequeGenerico.getSelectedItem();
			}

			if(periodoAux!=null && periodoAux.getId()!=null) {
				if(periodoAux.getid_estado_periodo().equals(0L)) {
					throw new Exception("Periodo INACTIVO, NO PUEDE GUARDAR LA INFORMACION CONSULTE CON EL ADMINISTRADOR");
				}

				detallepagocheque.setid_periodo(periodoAux.getId());
				detallepagocheque.setperiodo_descripcion(DetallePagoChequeConstantesFunciones.getPeriodoDescripcion(periodoAux));
				detallepagocheque.setPeriodo(periodoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarAnioForeignKey(DetallePagoCheque detallepagocheque,JComboBox jComboBoxid_anioDetallePagoChequeGenerico)throws Exception
	{
		try
		{
			Anio  anioAux=new Anio();

			if(jComboBoxid_anioDetallePagoChequeGenerico==null) {
				anioAux=(Anio)this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_anioDetallePagoCheque.getSelectedItem();
			} else {
				anioAux=(Anio)jComboBoxid_anioDetallePagoChequeGenerico.getSelectedItem();
			}

			if(anioAux!=null) {
				detallepagocheque.setid_anio(anioAux.getId());
				detallepagocheque.setanio_descripcion(DetallePagoChequeConstantesFunciones.getAnioDescripcion(anioAux));
				detallepagocheque.setAnio(anioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarMesForeignKey(DetallePagoCheque detallepagocheque,JComboBox jComboBoxid_mesDetallePagoChequeGenerico)throws Exception
	{
		try
		{
			Mes  mesAux=new Mes();

			if(jComboBoxid_mesDetallePagoChequeGenerico==null) {
				mesAux=(Mes)this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_mesDetallePagoCheque.getSelectedItem();
			} else {
				mesAux=(Mes)jComboBoxid_mesDetallePagoChequeGenerico.getSelectedItem();
			}

			if(mesAux!=null) {
				detallepagocheque.setid_mes(mesAux.getId());
				detallepagocheque.setmes_descripcion(DetallePagoChequeConstantesFunciones.getMesDescripcion(mesAux));
				detallepagocheque.setMes(mesAux);			}
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

					if(!DetallePagoChequeJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetallePagoCheque!=null) { 
							this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_empresaDetallePagoCheque.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_empresaDetallePagoCheque.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetallePagoCheque!=null) { 
					}

					if(!DetallePagoChequeJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DetallePagoChequeJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetallePagoCheque!=null) { 
							this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_sucursalDetallePagoCheque.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_sucursalDetallePagoCheque.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetallePagoCheque!=null) { 
					}

					if(!DetallePagoChequeJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DetallePagoChequeJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetallePagoCheque!=null) { 
							this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_asiento_contableDetallePagoCheque.removeAllItems();

							for(AsientoContable asientocontable:this.asientocontablesForeignKey) {
								this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_asiento_contableDetallePagoCheque.addItem(asientocontable);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetallePagoCheque!=null) { 
					}

					if(!DetallePagoChequeJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdAsientoContable") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DetallePagoChequeJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_asiento_contableFK_IdAsientoContableDetallePagoCheque.removeAllItems();

							for(AsientoContable asientocontable:this.asientocontablesForeignKey) {
								this.jComboBoxid_asiento_contableFK_IdAsientoContableDetallePagoCheque.addItem(asientocontable);
							}
						}

						if(!DetallePagoChequeJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DetallePagoChequeJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetallePagoCheque!=null) { 
							this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_ejercicioDetallePagoCheque.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_ejercicioDetallePagoCheque.addItem(ejercicio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetallePagoCheque!=null) { 
					}

					if(!DetallePagoChequeJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DetallePagoChequeJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetallePagoCheque!=null) { 
							this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_periodoDetallePagoCheque.removeAllItems();

							for(Periodo periodo:this.periodosForeignKey) {
								this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_periodoDetallePagoCheque.addItem(periodo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetallePagoCheque!=null) { 
					}

					if(!DetallePagoChequeJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DetallePagoChequeJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetallePagoCheque!=null) { 
							this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_anioDetallePagoCheque.removeAllItems();

							for(Anio anio:this.aniosForeignKey) {
								this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_anioDetallePagoCheque.addItem(anio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetallePagoCheque!=null) { 
					}

					if(!DetallePagoChequeJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DetallePagoChequeJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetallePagoCheque!=null) { 
							this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_mesDetallePagoCheque.removeAllItems();

							for(Mes mes:this.messForeignKey) {
								this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_mesDetallePagoCheque.addItem(mes);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetallePagoCheque!=null) { 
					}

					if(!DetallePagoChequeJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormDetallePagoCheque!=null) {
							this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_empresaDetallePagoCheque.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetallePagoCheque!=null) {
							this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_empresaDetallePagoCheque.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDetallePagoCheque!=null) {
							this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_sucursalDetallePagoCheque.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetallePagoCheque!=null) {
							this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_sucursalDetallePagoCheque.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDetallePagoCheque!=null) {
							this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_asiento_contableDetallePagoCheque.setSelectedItem(asientocontable);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetallePagoCheque!=null) {
							this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_asiento_contableDetallePagoCheque.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_asiento_contableFK_IdAsientoContableDetallePagoCheque.setSelectedItem(asientocontable);
						} else {
							this.jComboBoxid_asiento_contableFK_IdAsientoContableDetallePagoCheque.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDetallePagoCheque!=null) {
							this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_ejercicioDetallePagoCheque.setSelectedItem(ejercicio);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetallePagoCheque!=null) {
							this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_ejercicioDetallePagoCheque.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDetallePagoCheque!=null) {
							this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_periodoDetallePagoCheque.setSelectedItem(periodo);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetallePagoCheque!=null) {
							this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_periodoDetallePagoCheque.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDetallePagoCheque!=null) {
							this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_anioDetallePagoCheque.setSelectedItem(anio);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetallePagoCheque!=null) {
							this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_anioDetallePagoCheque.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDetallePagoCheque!=null) {
							this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_mesDetallePagoCheque.setSelectedItem(mes);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetallePagoCheque!=null) {
							this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_mesDetallePagoCheque.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesDetallePagoCheque() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			DetallePagoChequeConstantesFunciones.refrescarForeignKeysDescripcionesDetallePagoCheque(this.detallepagochequeLogic.getDetallePagoCheques());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			DetallePagoChequeConstantesFunciones.refrescarForeignKeysDescripcionesDetallePagoCheque(this.detallepagocheques);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(AsientoContable.class));
		classes.add(new Classe(Ejercicio.class));
		classes.add(new Classe(Periodo.class));
		classes.add(new Classe(Anio.class));
		classes.add(new Classe(Mes.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//detallepagochequeLogic.setDetallePagoCheques(this.detallepagocheques);
			detallepagochequeLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public DetallePagoChequeParameterReturnGeneral getDetallePagoChequeParameterGeneral() {
		return this.detallepagochequeParameterGeneral;
	}
	
	public void setDetallePagoChequeParameterGeneral(DetallePagoChequeParameterReturnGeneral detallepagochequeParameterGeneral) {
		this.detallepagochequeParameterGeneral = detallepagochequeParameterGeneral;
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
	
	public Boolean getIsPermisoTodoDetallePagoCheque() {
		return isPermisoTodoDetallePagoCheque;
	}

	public void setIsPermisoTodoDetallePagoCheque(Boolean isPermisoTodoDetallePagoCheque) {
		this.isPermisoTodoDetallePagoCheque = isPermisoTodoDetallePagoCheque;
	}

	public Boolean getIsPermisoNuevoDetallePagoCheque() {
		return isPermisoNuevoDetallePagoCheque;
	}

	public void setIsPermisoNuevoDetallePagoCheque(Boolean isPermisoNuevoDetallePagoCheque) {
		this.isPermisoNuevoDetallePagoCheque = isPermisoNuevoDetallePagoCheque;
	}

	public Boolean getIsPermisoActualizarDetallePagoCheque() {
		return isPermisoActualizarDetallePagoCheque;
	}

	public void setIsPermisoActualizarDetallePagoCheque(Boolean isPermisoActualizarDetallePagoCheque) {
		this.isPermisoActualizarDetallePagoCheque = isPermisoActualizarDetallePagoCheque;
	}

	public Boolean getIsPermisoEliminarDetallePagoCheque() {
		return isPermisoEliminarDetallePagoCheque;
	}

	public void setIsPermisoEliminarDetallePagoCheque(Boolean isPermisoEliminarDetallePagoCheque) {
		this.isPermisoEliminarDetallePagoCheque = isPermisoEliminarDetallePagoCheque;
	}

	public Boolean getIsPermisoGuardarCambiosDetallePagoCheque() {
		return isPermisoGuardarCambiosDetallePagoCheque;
	}

	public void setIsPermisoGuardarCambiosDetallePagoCheque(Boolean isPermisoGuardarCambiosDetallePagoCheque) {
		this.isPermisoGuardarCambiosDetallePagoCheque = isPermisoGuardarCambiosDetallePagoCheque;
	}
	
	public Boolean getIsPermisoConsultaDetallePagoCheque() {
		return isPermisoConsultaDetallePagoCheque;
	}

	public void setIsPermisoConsultaDetallePagoCheque(Boolean isPermisoConsultaDetallePagoCheque) {
		this.isPermisoConsultaDetallePagoCheque = isPermisoConsultaDetallePagoCheque;
	}

	public Boolean getIsPermisoBusquedaDetallePagoCheque() {
		return isPermisoBusquedaDetallePagoCheque;
	}

	public void setIsPermisoBusquedaDetallePagoCheque(Boolean isPermisoBusquedaDetallePagoCheque) {
		this.isPermisoBusquedaDetallePagoCheque = isPermisoBusquedaDetallePagoCheque;
	}

	public Boolean getIsPermisoReporteDetallePagoCheque() {
		return isPermisoReporteDetallePagoCheque;
	}

	public void setIsPermisoReporteDetallePagoCheque(Boolean isPermisoReporteDetallePagoCheque) {
		this.isPermisoReporteDetallePagoCheque = isPermisoReporteDetallePagoCheque;
	}
	
	public Boolean getIsPermisoPaginacionMedioDetallePagoCheque() {
		return isPermisoPaginacionMedioDetallePagoCheque;
	}

	public void setIsPermisoPaginacionMedioDetallePagoCheque(Boolean isPermisoPaginacionMedioDetallePagoCheque) {
		this.isPermisoPaginacionMedioDetallePagoCheque = isPermisoPaginacionMedioDetallePagoCheque;
	}
	
	public Boolean getIsPermisoPaginacionTodoDetallePagoCheque() {
		return isPermisoPaginacionTodoDetallePagoCheque;
	}

	public void setIsPermisoPaginacionTodoDetallePagoCheque(Boolean isPermisoPaginacionTodoDetallePagoCheque) {
		this.isPermisoPaginacionTodoDetallePagoCheque = isPermisoPaginacionTodoDetallePagoCheque;
	}
	
	public Boolean getIsPermisoPaginacionAltoDetallePagoCheque() {
		return isPermisoPaginacionAltoDetallePagoCheque;
	}

	public void setIsPermisoPaginacionAltoDetallePagoCheque(Boolean isPermisoPaginacionAltoDetallePagoCheque) {
		this.isPermisoPaginacionAltoDetallePagoCheque = isPermisoPaginacionAltoDetallePagoCheque;
	}
	
	public Boolean getIsPermisoCopiarDetallePagoCheque() {
		return isPermisoCopiarDetallePagoCheque;
	}

	public void setIsPermisoCopiarDetallePagoCheque(Boolean isPermisoCopiarDetallePagoCheque) {
		this.isPermisoCopiarDetallePagoCheque = isPermisoCopiarDetallePagoCheque;
	}
	
	public Boolean getIsPermisoVerFormDetallePagoCheque() {
		return isPermisoVerFormDetallePagoCheque;
	}

	public void setIsPermisoVerFormDetallePagoCheque(Boolean isPermisoVerFormDetallePagoCheque) {
		this.isPermisoVerFormDetallePagoCheque = isPermisoVerFormDetallePagoCheque;
	}
	
	public Boolean getIsPermisoDuplicarDetallePagoCheque() {
		return isPermisoDuplicarDetallePagoCheque;
	}

	public void setIsPermisoDuplicarDetallePagoCheque(Boolean isPermisoDuplicarDetallePagoCheque) {
		this.isPermisoDuplicarDetallePagoCheque = isPermisoDuplicarDetallePagoCheque;
	}
	
	public Boolean getIsPermisoOrdenDetallePagoCheque() {
		return isPermisoOrdenDetallePagoCheque;
	}

	public void setIsPermisoOrdenDetallePagoCheque(Boolean isPermisoOrdenDetallePagoCheque) {
		this.isPermisoOrdenDetallePagoCheque = isPermisoOrdenDetallePagoCheque;
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
	
	public Boolean getIsVisibilidadCeldaNuevoDetallePagoCheque() {
		return isVisibilidadCeldaNuevoDetallePagoCheque;
	}

	public void setIsVisibilidadCeldaNuevoDetallePagoCheque(Boolean isVisibilidadCeldaNuevoDetallePagoCheque) {
		this.isVisibilidadCeldaNuevoDetallePagoCheque = isVisibilidadCeldaNuevoDetallePagoCheque;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarDetallePagoCheque() {
		return isVisibilidadCeldaDuplicarDetallePagoCheque;
	}

	public void setIsVisibilidadCeldaDuplicarDetallePagoCheque(Boolean isVisibilidadCeldaDuplicarDetallePagoCheque) {
		this.isVisibilidadCeldaDuplicarDetallePagoCheque = isVisibilidadCeldaDuplicarDetallePagoCheque;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarDetallePagoCheque() {
		return isVisibilidadCeldaCopiarDetallePagoCheque;
	}

	public void setIsVisibilidadCeldaCopiarDetallePagoCheque(Boolean isVisibilidadCeldaCopiarDetallePagoCheque) {
		this.isVisibilidadCeldaCopiarDetallePagoCheque = isVisibilidadCeldaCopiarDetallePagoCheque;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormDetallePagoCheque() {
		return isVisibilidadCeldaVerFormDetallePagoCheque;
	}

	public void setIsVisibilidadCeldaVerFormDetallePagoCheque(Boolean isVisibilidadCeldaVerFormDetallePagoCheque) {
		this.isVisibilidadCeldaVerFormDetallePagoCheque = isVisibilidadCeldaVerFormDetallePagoCheque;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenDetallePagoCheque() {
		return isVisibilidadCeldaOrdenDetallePagoCheque;
	}

	public void setIsVisibilidadCeldaOrdenDetallePagoCheque(Boolean isVisibilidadCeldaOrdenDetallePagoCheque) {
		this.isVisibilidadCeldaOrdenDetallePagoCheque = isVisibilidadCeldaOrdenDetallePagoCheque;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesDetallePagoCheque() {
		return isVisibilidadCeldaNuevoRelacionesDetallePagoCheque;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesDetallePagoCheque(Boolean isVisibilidadCeldaNuevoRelacionesDetallePagoCheque) {
		this.isVisibilidadCeldaNuevoRelacionesDetallePagoCheque = isVisibilidadCeldaNuevoRelacionesDetallePagoCheque;
	}
	
	public Boolean getIsVisibilidadCeldaModificarDetallePagoCheque() {
		return isVisibilidadCeldaModificarDetallePagoCheque;
	}

	public void setIsVisibilidadCeldaModificarDetallePagoCheque(Boolean isVisibilidadCeldaModificarDetallePagoCheque) {
		this.isVisibilidadCeldaModificarDetallePagoCheque = isVisibilidadCeldaModificarDetallePagoCheque;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarDetallePagoCheque() {
		return isVisibilidadCeldaActualizarDetallePagoCheque;
	}

	public void setIsVisibilidadCeldaActualizarDetallePagoCheque(Boolean isVisibilidadCeldaActualizarDetallePagoCheque) {
		this.isVisibilidadCeldaActualizarDetallePagoCheque = isVisibilidadCeldaActualizarDetallePagoCheque;
	}

	public Boolean getIsVisibilidadCeldaEliminarDetallePagoCheque() {
		return isVisibilidadCeldaEliminarDetallePagoCheque;
	}

	public void setIsVisibilidadCeldaEliminarDetallePagoCheque(Boolean isVisibilidadCeldaEliminarDetallePagoCheque) {
		this.isVisibilidadCeldaEliminarDetallePagoCheque = isVisibilidadCeldaEliminarDetallePagoCheque;
	}

	public Boolean getIsVisibilidadCeldaCancelarDetallePagoCheque() {
		return isVisibilidadCeldaCancelarDetallePagoCheque;
	}

	public void setIsVisibilidadCeldaCancelarDetallePagoCheque(Boolean isVisibilidadCeldaCancelarDetallePagoCheque) {
		this.isVisibilidadCeldaCancelarDetallePagoCheque = isVisibilidadCeldaCancelarDetallePagoCheque;
	}

	public Boolean getIsVisibilidadCeldaGuardarDetallePagoCheque() {
		return isVisibilidadCeldaGuardarDetallePagoCheque;
	}

	public void setIsVisibilidadCeldaGuardarDetallePagoCheque(Boolean isVisibilidadCeldaGuardarDetallePagoCheque) {
		this.isVisibilidadCeldaGuardarDetallePagoCheque = isVisibilidadCeldaGuardarDetallePagoCheque;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosDetallePagoCheque() {
		return isVisibilidadCeldaGuardarCambiosDetallePagoCheque;
	}

	public void setIsVisibilidadCeldaGuardarCambiosDetallePagoCheque(Boolean isVisibilidadCeldaGuardarCambiosDetallePagoCheque) {
		this.isVisibilidadCeldaGuardarCambiosDetallePagoCheque = isVisibilidadCeldaGuardarCambiosDetallePagoCheque;
	}
		
	public DetallePagoChequeSessionBean getdetallepagochequeSessionBean() {
		return this.detallepagochequeSessionBean;
	}
	
	public void setdetallepagochequeSessionBean(DetallePagoChequeSessionBean detallepagochequeSessionBean) {
		this.detallepagochequeSessionBean=detallepagochequeSessionBean;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysDetallePagoCheque(DetallePagoCheque detallepagocheque)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(detallepagocheque,null);
				this.setActualParaGuardarSucursalForeignKey(detallepagocheque,null);
				this.setActualParaGuardarAsientoContableForeignKey(detallepagocheque,null);
				this.setActualParaGuardarEjercicioForeignKey(detallepagocheque,null);
				this.setActualParaGuardarPeriodoForeignKey(detallepagocheque,null);
				this.setActualParaGuardarAnioForeignKey(detallepagocheque,null);
				this.setActualParaGuardarMesForeignKey(detallepagocheque,null);
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
	
	public void bugActualizarReferenciaActual(DetallePagoCheque detallepagocheque,DetallePagoCheque detallepagochequeAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalDetallePagoCheque(detallepagocheque);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		detallepagochequeAux.setId(detallepagocheque.getId());
		detallepagochequeAux.setVersionRow(detallepagocheque.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessDetallePagoCheque();
		
			int intSelectedRow = this.jTableDatosDetallePagoCheque.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagocheque =(DetallePagoCheque) this.detallepagochequeLogic.getDetallePagoCheques().toArray()[this.jTableDatosDetallePagoCheque.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.detallepagocheque =(DetallePagoCheque) this.detallepagocheques.toArray()[this.jTableDatosDetallePagoCheque.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(DetallePagoChequeJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualDetallePagoCheque(this.detallepagocheque,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysDetallePagoCheque(this.detallepagocheque);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = detallepagochequeValidator.getInvalidValues(this.detallepagocheque);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			detallepagochequeLogic.setDatosCliente(datosCliente);
			detallepagochequeLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				detallepagochequeAux=new  DetallePagoCheque();
				
				detallepagochequeAux.setIsNew(true);
				detallepagochequeAux.setIsChanged(true);
				
				detallepagochequeAux.setDetallePagoChequeOriginal(this.detallepagocheque);
				
				detallepagochequeAux.setId(this.detallepagocheque.getId());	
				detallepagochequeAux.setVersionRow(this.detallepagocheque.getVersionRow());	
				detallepagochequeAux.setid_empresa(this.detallepagocheque.getid_empresa());	
				detallepagochequeAux.setid_sucursal(this.detallepagocheque.getid_sucursal());	
				detallepagochequeAux.setid_asiento_contable(this.detallepagocheque.getid_asiento_contable());	
				detallepagochequeAux.setid_ejercicio(this.detallepagocheque.getid_ejercicio());	
				detallepagochequeAux.setid_periodo(this.detallepagocheque.getid_periodo());	
				detallepagochequeAux.setvalor(this.detallepagocheque.getvalor());	
				detallepagochequeAux.setid_anio(this.detallepagocheque.getid_anio());	
				detallepagochequeAux.setid_mes(this.detallepagocheque.getid_mes());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.detallepagochequeSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.detallepagochequeSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(detallepagochequeAux,detallepagochequeLogic.getDetallePagoCheques());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detallepagochequeAux,detallepagocheques);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.detallepagochequeSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.detallepagochequeSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detallepagochequeLogic.saveDetallePagoCheques();//WithConnection
						//detallepagochequeLogic.getSetVersionRowDetallePagoCheques();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.detallepagocheque,detallepagochequeAux);
					
					this.refrescarForeignKeysDescripcionesDetallePagoCheque();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.detallepagochequeSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.detallepagochequeSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								detallepagochequeLogic.saveDetallePagoChequeRelaciones(detallepagochequeAux);//WithConnection
								//detallepagochequeLogic.getSetVersionRowDetallePagoCheques();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.detallepagocheque,detallepagochequeAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.detallepagochequeSessionBean.getEstaModoGuardarRelaciones() 
									|| this.detallepagochequeSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(detallepagochequeAux,detallepagochequeLogic.getDetallePagoCheques());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(detallepagochequeAux,detallepagocheques);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.detallepagocheque,detallepagochequeAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				detallepagochequeAux=new  DetallePagoCheque();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.detallepagochequeSessionBean.getEsGuardarRelacionado() 
					|| (this.detallepagochequeSessionBean.getEsGuardarRelacionado() && this.detallepagocheque.getId()>=0)) {
						
					detallepagochequeAux.setIsNew(false);
				}
				
				detallepagochequeAux.setIsDeleted(false);
			
				detallepagochequeAux.setId(this.detallepagocheque.getId());	
				detallepagochequeAux.setVersionRow(this.detallepagocheque.getVersionRow());	
				detallepagochequeAux.setid_empresa(this.detallepagocheque.getid_empresa());	
				detallepagochequeAux.setid_sucursal(this.detallepagocheque.getid_sucursal());	
				detallepagochequeAux.setid_asiento_contable(this.detallepagocheque.getid_asiento_contable());	
				detallepagochequeAux.setid_ejercicio(this.detallepagocheque.getid_ejercicio());	
				detallepagochequeAux.setid_periodo(this.detallepagocheque.getid_periodo());	
				detallepagochequeAux.setvalor(this.detallepagocheque.getvalor());	
				detallepagochequeAux.setid_anio(this.detallepagocheque.getid_anio());	
				detallepagochequeAux.setid_mes(this.detallepagocheque.getid_mes());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(detallepagochequeAux,detallepagochequeLogic.getDetallePagoCheques());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detallepagochequeAux,detallepagocheques);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.detallepagochequeSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.detallepagochequeSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detallepagochequeLogic.saveDetallePagoCheques();//WithConnection
						//detallepagochequeLogic.getSetVersionRowDetallePagoCheques();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.detallepagocheque,detallepagochequeAux);
					
					this.refrescarForeignKeysDescripcionesDetallePagoCheque();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.detallepagochequeSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.detallepagochequeSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								detallepagochequeLogic.saveDetallePagoChequeRelaciones(detallepagochequeAux);//WithConnection
								//detallepagochequeLogic.getSetVersionRowDetallePagoCheques();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.detallepagocheque,detallepagochequeAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.detallepagochequeSessionBean.getEstaModoGuardarRelaciones() 
									|| this.detallepagochequeSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(detallepagochequeAux,detallepagochequeLogic.getDetallePagoCheques());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(detallepagochequeAux,detallepagocheques);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.detallepagocheque,detallepagochequeAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				detallepagochequeAux=new  DetallePagoCheque();
				
				detallepagochequeAux.setIsNew(false);
				detallepagochequeAux.setIsChanged(false);
				
				detallepagochequeAux.setIsDeleted(true);
				
				detallepagochequeAux.setId(this.detallepagocheque.getId());	
				detallepagochequeAux.setVersionRow(this.detallepagocheque.getVersionRow());	
				detallepagochequeAux.setid_empresa(this.detallepagocheque.getid_empresa());	
				detallepagochequeAux.setid_sucursal(this.detallepagocheque.getid_sucursal());	
				detallepagochequeAux.setid_asiento_contable(this.detallepagocheque.getid_asiento_contable());	
				detallepagochequeAux.setid_ejercicio(this.detallepagocheque.getid_ejercicio());	
				detallepagochequeAux.setid_periodo(this.detallepagocheque.getid_periodo());	
				detallepagochequeAux.setvalor(this.detallepagocheque.getvalor());	
				detallepagochequeAux.setid_anio(this.detallepagocheque.getid_anio());	
				detallepagochequeAux.setid_mes(this.detallepagocheque.getid_mes());	
				
				if(this.detallepagochequeSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.detallepagochequeAux.getId()>=0) {	
						this.detallepagochequesEliminados.add(detallepagochequeAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(detallepagochequeAux,detallepagochequeLogic.getDetallePagoCheques());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detallepagochequeAux,detallepagocheques);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.detallepagochequeSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.detallepagochequeSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detallepagochequeLogic.saveDetallePagoCheques();//WithConnection
						//detallepagochequeLogic.getSetVersionRowDetallePagoCheques();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.detallepagochequeSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.detallepagochequeSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								detallepagochequeLogic.saveDetallePagoChequeRelaciones(detallepagochequeAux);//WithConnection
								//detallepagochequeLogic.getSetVersionRowDetallePagoCheques();//WithConnection
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
							if(this.detallepagochequeSessionBean.getEstaModoGuardarRelaciones() 
								|| this.detallepagochequeSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(detallepagochequeAux,detallepagochequeLogic.getDetallePagoCheques());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(detallepagochequeAux,detallepagocheques);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagochequeLogic.getDetallePagoCheques().addAll(this.detallepagochequesEliminados);
					
					detallepagochequeLogic.saveDetallePagoCheques();//WithConnection
					//detallepagochequeLogic.getSetVersionRowDetallePagoCheques();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesDetallePagoCheque();
				
				this.detallepagochequesEliminados= new ArrayList<DetallePagoCheque>();		
			}
			
			if(this.detallepagochequeSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallepagochequeSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Detalle Pago Cheque GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Detalle Pago Cheque",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.detallepagocheque=detallepagochequeAux;
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
      		//this.finishProcessDetallePagoCheque();
      	}
		
	}	
	
	public void actualizarRelaciones(DetallePagoCheque detallepagochequeLocal) throws Exception {
		
		if(this.detallepagochequeSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(DetallePagoCheque detallepagochequeLocal) throws Exception {	
		if(this.detallepagochequeSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				detallepagochequeLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				detallepagochequeLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(AsientoContableDetalleFormJInternalFrame.class)) {
				AsientoContableBeanSwingJInternalFrame asientocontableBeanSwingJInternalFrameLocal=(AsientoContableBeanSwingJInternalFrame) ((AsientoContableDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				asientocontableBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoAsientoContable(asientocontableBeanSwingJInternalFrameLocal.getasientocontable(),true);
				asientocontableBeanSwingJInternalFrameLocal.actualizarLista(asientocontableBeanSwingJInternalFrameLocal.asientocontable,this.asientocontablesForeignKey);

				asientocontableBeanSwingJInternalFrameLocal.actualizarRelaciones(asientocontableBeanSwingJInternalFrameLocal.asientocontable);

				detallepagochequeLocal.setAsientoContable(asientocontableBeanSwingJInternalFrameLocal.asientocontable);

				this.addItemDefectoCombosForeignKeyAsientoContable();
				this.cargarCombosFrameAsientoContablesForeignKey("Formulario");
				this.setActualAsientoContableForeignKey(asientocontableBeanSwingJInternalFrameLocal.asientocontable.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EjercicioDetalleFormJInternalFrame.class)) {
				EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrameLocal=(EjercicioBeanSwingJInternalFrame) ((EjercicioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ejercicioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEjercicio(ejercicioBeanSwingJInternalFrameLocal.getejercicio(),true);
				ejercicioBeanSwingJInternalFrameLocal.actualizarLista(ejercicioBeanSwingJInternalFrameLocal.ejercicio,this.ejerciciosForeignKey);

				ejercicioBeanSwingJInternalFrameLocal.actualizarRelaciones(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				detallepagochequeLocal.setEjercicio(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				this.addItemDefectoCombosForeignKeyEjercicio();
				this.cargarCombosFrameEjerciciosForeignKey("Formulario");
				this.setActualEjercicioForeignKey(ejercicioBeanSwingJInternalFrameLocal.ejercicio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(PeriodoDetalleFormJInternalFrame.class)) {
				PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrameLocal=(PeriodoBeanSwingJInternalFrame) ((PeriodoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				periodoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPeriodo(periodoBeanSwingJInternalFrameLocal.getperiodo(),true);
				periodoBeanSwingJInternalFrameLocal.actualizarLista(periodoBeanSwingJInternalFrameLocal.periodo,this.periodosForeignKey);

				periodoBeanSwingJInternalFrameLocal.actualizarRelaciones(periodoBeanSwingJInternalFrameLocal.periodo);

				detallepagochequeLocal.setPeriodo(periodoBeanSwingJInternalFrameLocal.periodo);

				this.addItemDefectoCombosForeignKeyPeriodo();
				this.cargarCombosFramePeriodosForeignKey("Formulario");
				this.setActualPeriodoForeignKey(periodoBeanSwingJInternalFrameLocal.periodo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(AnioDetalleFormJInternalFrame.class)) {
				AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrameLocal=(AnioBeanSwingJInternalFrame) ((AnioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				anioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoAnio(anioBeanSwingJInternalFrameLocal.getanio(),true);
				anioBeanSwingJInternalFrameLocal.actualizarLista(anioBeanSwingJInternalFrameLocal.anio,this.aniosForeignKey);

				anioBeanSwingJInternalFrameLocal.actualizarRelaciones(anioBeanSwingJInternalFrameLocal.anio);

				detallepagochequeLocal.setAnio(anioBeanSwingJInternalFrameLocal.anio);

				this.addItemDefectoCombosForeignKeyAnio();
				this.cargarCombosFrameAniosForeignKey("Formulario");
				this.setActualAnioForeignKey(anioBeanSwingJInternalFrameLocal.anio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(MesDetalleFormJInternalFrame.class)) {
				MesBeanSwingJInternalFrame mesBeanSwingJInternalFrameLocal=(MesBeanSwingJInternalFrame) ((MesDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				mesBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoMes(mesBeanSwingJInternalFrameLocal.getmes(),true);
				mesBeanSwingJInternalFrameLocal.actualizarLista(mesBeanSwingJInternalFrameLocal.mes,this.messForeignKey);

				mesBeanSwingJInternalFrameLocal.actualizarRelaciones(mesBeanSwingJInternalFrameLocal.mes);

				detallepagochequeLocal.setMes(mesBeanSwingJInternalFrameLocal.mes);

				this.addItemDefectoCombosForeignKeyMes();
				this.cargarCombosFrameMessForeignKey("Formulario");
				this.setActualMesForeignKey(mesBeanSwingJInternalFrameLocal.mes.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarDetallePagoChequeActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosDetallePagoCheque.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.detallepagocheque =(DetallePagoCheque) this.detallepagochequeLogic.getDetallePagoCheques().toArray()[this.jTableDatosDetallePagoCheque.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.detallepagocheque =(DetallePagoCheque) this.detallepagocheques.toArray()[this.jTableDatosDetallePagoCheque.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = detallepagochequeValidator.getInvalidValues(this.detallepagocheque);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(DetallePagoCheque detallepagocheque,List<DetallePagoCheque> detallepagocheques) throws Exception {
		try	{		
			DetallePagoChequeConstantesFunciones.actualizarLista(detallepagocheque,detallepagocheques,this.detallepagochequeSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(DetallePagoCheque detallepagocheque,List<DetallePagoCheque> detallepagocheques) throws Exception {
		try	{			
			DetallePagoChequeConstantesFunciones.actualizarSelectedLista(detallepagocheque,detallepagocheques);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<DetallePagoCheque> detallepagochequesLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				detallepagochequesLocal=this.detallepagochequeLogic.getDetallePagoCheques();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				detallepagochequesLocal=this.detallepagocheques;
			}
			//ARCHITECTURE
		
			for(DetallePagoCheque detallepagochequeLocal:detallepagochequesLocal) {
				if(this.permiteMantenimiento(detallepagochequeLocal) && detallepagochequeLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+DetallePagoChequeConstantesFunciones.getDetallePagoChequeLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(DetallePagoChequeConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePagoCheque.jLabelid_empresaDetallePagoCheque,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetallePagoChequeConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePagoCheque.jLabelid_sucursalDetallePagoCheque,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetallePagoChequeConstantesFunciones.IDASIENTOCONTABLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePagoCheque.jLabelid_asiento_contableDetallePagoCheque,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetallePagoChequeConstantesFunciones.IDEJERCICIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePagoCheque.jLabelid_ejercicioDetallePagoCheque,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetallePagoChequeConstantesFunciones.IDPERIODO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePagoCheque.jLabelid_periodoDetallePagoCheque,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetallePagoChequeConstantesFunciones.VALOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePagoCheque.jLabelvalorDetallePagoCheque,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetallePagoChequeConstantesFunciones.IDANIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePagoCheque.jLabelid_anioDetallePagoCheque,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetallePagoChequeConstantesFunciones.IDMES)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePagoCheque.jLabelid_mesDetallePagoCheque,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormDetallePagoCheque!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetallePagoCheque.jLabelid_empresaDetallePagoCheque,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetallePagoCheque.jLabelid_sucursalDetallePagoCheque,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetallePagoCheque.jLabelid_asiento_contableDetallePagoCheque,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetallePagoCheque.jLabelid_ejercicioDetallePagoCheque,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetallePagoCheque.jLabelid_periodoDetallePagoCheque,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetallePagoCheque.jLabelvalorDetallePagoCheque,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetallePagoCheque.jLabelid_anioDetallePagoCheque,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetallePagoCheque.jLabelid_mesDetallePagoCheque,"");
		
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
		this.iIdNuevoDetallePagoCheque--;	
		
		
		this.detallepagochequeAux=new DetallePagoCheque();
		
		this.detallepagochequeAux.setId(this.iIdNuevoDetallePagoCheque);
		this.detallepagochequeAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.detallepagochequeLogic.getDetallePagoCheques().add(this.detallepagochequeAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.detallepagocheques.add(this.detallepagochequeAux);
		}
		//ARCHITECTURE
		
		this.detallepagocheque=this.detallepagochequeAux;
		
		if(DetallePagoChequeJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioDetallePagoCheque(this.detallepagocheque);
			this.setVariablesObjetoActualToFormularioForeignKeyDetallePagoCheque(this.detallepagocheque);
		}
				
		//this.setDefaultControlesDetallePagoCheque();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyDetallePagoCheque();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyDetallePagoCheque();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyDetallePagoCheque();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDetallePagoCheque(this.detallepagochequeBean,this.detallepagocheque,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysDetallePagoCheque(this.detallepagocheque);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(DetallePagoChequeConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.detallepagochequeSessionBean.getConGuardarRelaciones()) {
			classes=DetallePagoChequeConstantesFunciones.getClassesRelationshipsOfDetallePagoCheque(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.detallepagochequeReturnGeneral=detallepagochequeLogic.procesarEventosDetallePagoChequesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.detallepagochequeLogic.getDetallePagoCheques(),this.detallepagocheque,this.detallepagochequeParameterGeneral,this.isEsNuevoDetallePagoCheque,classes);//this.detallepagochequeLogic.getDetallePagoCheque()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanDetallePagoCheque(this.detallepagochequeReturnGeneral,this.detallepagochequeBean,false);
		
		if(this.detallepagochequeReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyDetallePagoCheque(this.detallepagochequeReturnGeneral.getDetallePagoCheque());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioDetallePagoCheque(this.detallepagochequeReturnGeneral.getDetallePagoCheque());
		}
		
		if(this.detallepagochequeReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioDetallePagoCheque(this.detallepagochequeReturnGeneral.getDetallePagoCheque(),classes);//this.detallepagochequeBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualDetallePagoCheque(this.detallepagocheque,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyDetallePagoCheque();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyDetallePagoCheque();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			DetallePagoChequeBeanSwingJInternalFrameAdditional.RecargarFormDetallePagoCheque(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingDetallePagoCheque(false);
						
			if(detallepagochequeSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(DetallePagoChequeJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDetallePagoCheque();
			}
			
			this.actualizarVisualTableDatosDetallePagoCheque();
			
			this.jTableDatosDetallePagoCheque.setRowSelectionInterval(this.getIndiceNuevoDetallePagoCheque(), this.getIndiceNuevoDetallePagoCheque());
			
			this.seleccionarFilaTablaDetallePagoChequeActual();
						
			this.actualizarEstadoCeldasBotonesDetallePagoCheque("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesDetallePagoCheque(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormDetallePagoCheque.jTextFieldvalorDetallePagoCheque.setEnabled(isHabilitar && this.detallepagochequeConstantesFunciones.activarvalorDetallePagoCheque);	
		//
		this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_empresaDetallePagoCheque.setEnabled(isHabilitar && this.detallepagochequeConstantesFunciones.activarid_empresaDetallePagoCheque);//
		this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_sucursalDetallePagoCheque.setEnabled(isHabilitar && this.detallepagochequeConstantesFunciones.activarid_sucursalDetallePagoCheque);
		this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_asiento_contableDetallePagoCheque.setEnabled(isHabilitar && this.detallepagochequeConstantesFunciones.activarid_asiento_contableDetallePagoCheque);//
		this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_ejercicioDetallePagoCheque.setEnabled(isHabilitar && this.detallepagochequeConstantesFunciones.activarid_ejercicioDetallePagoCheque);//
		this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_periodoDetallePagoCheque.setEnabled(isHabilitar && this.detallepagochequeConstantesFunciones.activarid_periodoDetallePagoCheque);//
		this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_anioDetallePagoCheque.setEnabled(isHabilitar && this.detallepagochequeConstantesFunciones.activarid_anioDetallePagoCheque);//
		this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_mesDetallePagoCheque.setEnabled(isHabilitar && this.detallepagochequeConstantesFunciones.activarid_mesDetallePagoCheque);
	};
	
	public void setDefaultControlesDetallePagoCheque() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoDetallePagoCheque(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.detallepagochequeSessionBean.setConGuardarRelaciones(true);			
			this.detallepagochequeSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormDetallePagoCheque.jTabbedPaneRelacionesDetallePagoCheque.setVisible(true);
			
					
		} else {
			//this.detallepagochequeSessionBean.setConGuardarRelaciones(false);			
			this.detallepagochequeSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormDetallePagoCheque.jTabbedPaneRelacionesDetallePagoCheque.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoDetallePagoCheque() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetallePagoCheque detallepagochequeAux:this.detallepagochequeLogic.getDetallePagoCheques()) {
				if(detallepagochequeAux.getId().equals(this.iIdNuevoDetallePagoCheque)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetallePagoCheque detallepagochequeAux:this.detallepagocheques) {
				if(detallepagochequeAux.getId().equals(this.iIdNuevoDetallePagoCheque)) {
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
	
	public int getIndiceActualDetallePagoCheque(DetallePagoCheque detallepagocheque,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetallePagoCheque detallepagochequeAux:this.detallepagochequeLogic.getDetallePagoCheques()) {
				if(detallepagochequeAux.getId().equals(detallepagocheque.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetallePagoCheque detallepagochequeAux:this.detallepagocheques) {
				if(detallepagochequeAux.getId().equals(detallepagocheque.getId())) {
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
	
	public void setCamposBaseDesdeOriginalDetallePagoCheque(DetallePagoCheque detallepagochequeOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetallePagoCheque detallepagochequeAux:this.detallepagochequeLogic.getDetallePagoCheques()) {
				if(detallepagochequeAux.getDetallePagoChequeOriginal().getId().equals(detallepagochequeOriginal.getId())) {
					existe=true;
					detallepagochequeOriginal.setId(detallepagochequeAux.getId());
					detallepagochequeOriginal.setVersionRow(detallepagochequeAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetallePagoCheque detallepagochequeAux:this.detallepagocheques) {
				if(detallepagochequeAux.getDetallePagoChequeOriginal().getId().equals(detallepagochequeOriginal.getId())) {
					existe=true;
					detallepagochequeOriginal.setId(detallepagochequeAux.getId());
					detallepagochequeOriginal.setVersionRow(detallepagochequeAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosDetallePagoCheque(Boolean esParaCancelar) throws Exception {
		detallepagochequesAux=new ArrayList<DetallePagoCheque>();
		detallepagochequeAux=new DetallePagoCheque();
		
		if(!this.detallepagochequeSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DetallePagoCheque detallepagochequeAux:this.detallepagochequeLogic.getDetallePagoCheques()) {
					if(detallepagochequeAux.getId()<0) {
						detallepagochequesAux.add(detallepagochequeAux);
					}		
				}
				this.iIdNuevoDetallePagoCheque=0L;
				this.detallepagochequeLogic.getDetallePagoCheques().removeAll(detallepagochequesAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetallePagoCheque detallepagochequeAux:this.detallepagocheques) {
					if(detallepagochequeAux.getId()<0) {
						detallepagochequesAux.add(detallepagochequeAux);
					}		
				}
				this.iIdNuevoDetallePagoCheque=0L;
				this.detallepagocheques.removeAll(detallepagochequesAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoDetallePagoCheque 
					&& this.detallepagochequeLogic.getDetallePagoCheques().size()>0
					) {
					detallepagochequeAux=this.detallepagochequeLogic.getDetallePagoCheques().get(this.detallepagochequeLogic.getDetallePagoCheques().size() - 1);
				
					if(detallepagochequeAux.getId()<0) {
						this.detallepagochequeLogic.getDetallePagoCheques().remove(detallepagochequeAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoDetallePagoCheque && this.detallepagocheques.size()>0) {
					detallepagochequeAux=this.detallepagocheques.get(this.detallepagocheques.size() - 1);
				
					if(detallepagochequeAux.getId()<0) {
						this.detallepagocheques.remove(detallepagochequeAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoDetallePagoCheque(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(detallepagocheque.getId()<0) {
				this.detallepagochequeLogic.getDetallePagoCheques().remove(this.detallepagocheque);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(detallepagocheque.getId()<0) {
				this.detallepagocheques.remove(this.detallepagocheque);
			}
		}			
	}
	
	public void setEstadosInicialesDetallePagoCheque(List<DetallePagoCheque> detallepagochequesAux) throws Exception {
		DetallePagoChequeConstantesFunciones.setEstadosInicialesDetallePagoCheque(detallepagochequesAux);
	}
	
	public void setEstadosInicialesDetallePagoCheque(DetallePagoCheque detallepagochequeAux) throws Exception {
		DetallePagoChequeConstantesFunciones.setEstadosInicialesDetallePagoCheque(detallepagochequeAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarDetallePagoChequeActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesDetallePagoCheque("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarDetallePagoChequeActual()) {
				if(!this.isEsNuevoDetallePagoCheque) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesDetallePagoCheque("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoDetallePagoCheque=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarDetallePagoChequeActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Detalle Pago Cheque ?", "MANTENIMIENTO DE Detalle Pago Cheque", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesDetallePagoCheque("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(DetallePagoCheque detallepagocheque) throws Exception {
		DetallePagoChequeConstantesFunciones.seleccionarAsignar(this.detallepagocheque,detallepagocheque);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarDetallePagoCheque=this.isPermisoActualizarOriginalDetallePagoCheque;
			
			
			this.seleccionarAsignar(detallepagocheque);
			
			

			idAsientoContableActual=detallepagocheque.getid_asiento_contable();
			this.seleccionarAsientoContableActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			DetallePagoChequeConstantesFunciones.quitarEspaciosDetallePagoCheque(this.detallepagocheque,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesDetallePagoCheque("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.detallepagochequeSessionBean.setsFuncionBusquedaRapida(this.detallepagochequeSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
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
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoDetallePagoCheque) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosDetallePagoCheque(esParaCancelar);				
				this.cancelarNuevoDetallePagoCheque(esParaCancelar);								
			}
			
			this.detallepagocheque=new DetallePagoCheque();
			
			this.inicializarDetallePagoCheque();
			
			this.actualizarEstadoCeldasBotonesDetallePagoCheque("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarDetallePagoCheque() throws Exception {
		try {
			DetallePagoChequeConstantesFunciones.inicializarDetallePagoCheque(this.detallepagocheque);
			
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
			FuncionesSwing.manageException(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.detallepagochequeLogic.getDetallePagoCheques().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteDetallePagoCheques(String sAccionBusqueda,List<DetallePagoCheque> detallepagochequesParaReportes) throws Exception {
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
					sPathReporteFinal="DetallePagoCheque"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="DetallePagoChequeMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("DetallePagoChequeMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="DetallePagoCheque"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Detalle Pago Cheques");		
		parameters.put("busquedapor", DetallePagoChequeConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceDetallePagoCheque=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			DetallePagoChequeConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			DetallePagoChequeConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceDetallePagoCheque=new JRBeanArrayDataSource(DetallePagoChequeJInternalFrame.TraerDetallePagoChequeBeans(detallepagochequesParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceDetallePagoCheque);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+DetallePagoChequeConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+DetallePagoChequeConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(DetallePagoChequeBean.TraerDetallePagoChequeBeans(detallepagochequesParaReportes).toArray()));
							
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
				this.generarExcelReporteDetallePagoCheques(sAccionBusqueda,sTipoArchivoReporte,detallepagochequesParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalDetallePagoCheques(sAccionBusqueda,sTipoArchivoReporte,detallepagochequesParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoDetallePagoChequeActionPerformed(null);
					//this.generarExcelReporteDetallePagoCheques(sAccionBusqueda,sTipoArchivoReporte,detallepagochequesParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalDetallePagoCheques(sAccionBusqueda,sTipoArchivoReporte,detallepagochequesParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesDetallePagoCheques(sAccionBusqueda,sTipoArchivoReporte,detallepagochequesParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesDetallePagoCheques(sAccionBusqueda,sTipoArchivoReporte,detallepagochequesParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteDetallePagoCheques(String sAccionBusqueda,String sTipoArchivoReporte,List<DetallePagoCheque> detallepagochequesParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallepagocheque";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DetallePagoCheques");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDetallePagoCheque("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(DetallePagoCheque detallepagocheque : detallepagochequesParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			DetallePagoChequeConstantesFunciones.generarExcelReporteDataDetallePagoCheque("NORMAL",row,workbook,detallepagocheque,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallepagochequeSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Pago Cheque",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderDetallePagoCheque(String sTipo,Row row,Workbook workbook) {
		
		DetallePagoChequeConstantesFunciones.generarExcelReporteHeaderDetallePagoCheque(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalDetallePagoCheques(String sAccionBusqueda,String sTipoArchivoReporte,List<DetallePagoCheque> detallepagochequesParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallepagocheque_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DetallePagoCheques");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(DetallePagoCheque detallepagocheque : detallepagochequesParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(DetallePagoChequeConstantesFunciones.getDetallePagoChequeDescripcion(detallepagocheque));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetallePagoChequeConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetallePagoChequeConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallepagocheque.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetallePagoChequeConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetallePagoChequeConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallepagocheque.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetallePagoChequeConstantesFunciones.LABEL_IDASIENTOCONTABLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetallePagoChequeConstantesFunciones.LABEL_IDASIENTOCONTABLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallepagocheque.getasientocontable_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetallePagoChequeConstantesFunciones.LABEL_IDEJERCICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetallePagoChequeConstantesFunciones.LABEL_IDEJERCICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallepagocheque.getejercicio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetallePagoChequeConstantesFunciones.LABEL_IDPERIODO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetallePagoChequeConstantesFunciones.LABEL_IDPERIODO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallepagocheque.getperiodo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetallePagoChequeConstantesFunciones.LABEL_VALOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetallePagoChequeConstantesFunciones.LABEL_VALOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallepagocheque.getvalor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetallePagoChequeConstantesFunciones.LABEL_IDANIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetallePagoChequeConstantesFunciones.LABEL_IDANIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallepagocheque.getanio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetallePagoChequeConstantesFunciones.LABEL_IDMES))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetallePagoChequeConstantesFunciones.LABEL_IDMES);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallepagocheque.getmes_descripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallepagochequeSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Pago Cheque",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesDetallePagoCheques(String sAccionBusqueda,String sTipoArchivoReporte,List<DetallePagoCheque> detallepagochequesParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<DetallePagoCheque> detallepagochequesRespaldo=null;
		
		classes=DetallePagoChequeConstantesFunciones.getClassesRelationshipsOfDetallePagoCheque(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.detallepagochequeLogic.setDatosCliente(this.datosCliente);
		this.detallepagochequeLogic.setDatosDeep(this.datosDeep);
		this.detallepagochequeLogic.setIsConDeep(true);
		
		detallepagochequesRespaldo=this.detallepagochequeLogic.getDetallePagoCheques();
		
		this.detallepagochequeLogic.setDetallePagoCheques(detallepagochequesParaReportes);	
		this.detallepagochequeLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		detallepagochequesParaReportes=this.detallepagochequeLogic.getDetallePagoCheques();
		this.detallepagochequeLogic.setDetallePagoCheques(detallepagochequesRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallepagocheque_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DetallePagoCheques");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDetallePagoCheque("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(DetallePagoCheque detallepagocheque : detallepagochequesParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderDetallePagoCheque("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			DetallePagoChequeConstantesFunciones.generarExcelReporteDataDetallePagoCheque("NORMAL",row,workbook,detallepagocheque,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(DetallePagoChequeConstantesFunciones.getDetallePagoChequeDescripcion(detallepagocheque));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallepagochequeSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Pago Cheque",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoDetallePagoCheque.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetallePagoCheque.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoDetallePagoCheque.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetallePagoCheque.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessDetallePagoCheque() throws Exception {		
		this.startProcessDetallePagoCheque(true);
	}
	
	public void startProcessDetallePagoCheque(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasDetallePagoCheque ,this.jPanelParametrosReportesDetallePagoCheque, this.jScrollPanelDatosDetallePagoCheque,this.jPanelPaginacionDetallePagoCheque, this.jScrollPanelDatosEdicionDetallePagoCheque, this.jPanelAccionesDetallePagoCheque,this.jPanelAccionesFormularioDetallePagoCheque,this.jmenuBarDetallePagoCheque,this.jmenuBarDetalleDetallePagoCheque,this.jTtoolBarDetallePagoCheque,this.jTtoolBarDetalleDetallePagoCheque);		
		
		final JTabbedPane jTabbedPaneBusquedasDetallePagoCheque=this.jTabbedPaneBusquedasDetallePagoCheque; 
		
		final JPanel jPanelParametrosReportesDetallePagoCheque=this.jPanelParametrosReportesDetallePagoCheque;
		//final JScrollPane jScrollPanelDatosDetallePagoCheque=this.jScrollPanelDatosDetallePagoCheque;
		final JTable jTableDatosDetallePagoCheque=this.jTableDatosDetallePagoCheque;		
		final JPanel jPanelPaginacionDetallePagoCheque=this.jPanelPaginacionDetallePagoCheque;
		//final JScrollPane jScrollPanelDatosEdicionDetallePagoCheque=this.jScrollPanelDatosEdicionDetallePagoCheque;
		final JPanel jPanelAccionesDetallePagoCheque=this.jPanelAccionesDetallePagoCheque;
		
		JPanel jPanelCamposAuxiliarDetallePagoCheque=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarDetallePagoCheque=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormDetallePagoCheque!=null) {
			jPanelCamposAuxiliarDetallePagoCheque=this.jInternalFrameDetalleFormDetallePagoCheque.jPanelCamposDetallePagoCheque;
			jPanelAccionesFormularioAuxiliarDetallePagoCheque=this.jInternalFrameDetalleFormDetallePagoCheque.jPanelAccionesFormularioDetallePagoCheque;
		}
		
		final JPanel jPanelCamposDetallePagoCheque=jPanelCamposAuxiliarDetallePagoCheque;
		final JPanel jPanelAccionesFormularioDetallePagoCheque=jPanelAccionesFormularioAuxiliarDetallePagoCheque;
		
		
		final JMenuBar jmenuBarDetallePagoCheque=this.jmenuBarDetallePagoCheque;
		final JToolBar jTtoolBarDetallePagoCheque=this.jTtoolBarDetallePagoCheque;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarDetallePagoCheque=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDetallePagoCheque=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormDetallePagoCheque!=null) {
			jmenuBarDetalleAuxiliarDetallePagoCheque=this.jInternalFrameDetalleFormDetallePagoCheque.jmenuBarDetalleDetallePagoCheque;
			jTtoolBarDetalleAuxiliarDetallePagoCheque=this.jInternalFrameDetalleFormDetallePagoCheque.jTtoolBarDetalleDetallePagoCheque;
		}
		
		final JMenuBar jmenuBarDetalleDetallePagoCheque=jmenuBarDetalleAuxiliarDetallePagoCheque;
		final JToolBar jTtoolBarDetalleDetallePagoCheque=jTtoolBarDetalleAuxiliarDetallePagoCheque;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDetallePagoCheque;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDetallePagoCheque;
			processRunnable.jTableDatos=jTableDatosDetallePagoCheque;
			processRunnable.jPanelCampos=jPanelCamposDetallePagoCheque;
			processRunnable.jPanelPaginacion=jPanelPaginacionDetallePagoCheque;
			processRunnable.jPanelAcciones=jPanelAccionesDetallePagoCheque;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDetallePagoCheque;
			
			
			processRunnable.jmenuBar=jmenuBarDetallePagoCheque;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDetallePagoCheque;
			processRunnable.jTtoolBar=jTtoolBarDetallePagoCheque;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDetallePagoCheque;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDetallePagoCheque ,jPanelParametrosReportesDetallePagoCheque,jTableDatosDetallePagoCheque, /*jScrollPanelDatosDetallePagoCheque,*/jPanelCamposDetallePagoCheque,jPanelPaginacionDetallePagoCheque, /*jScrollPanelDatosEdicionDetallePagoCheque,*/ jPanelAccionesDetallePagoCheque,jPanelAccionesFormularioDetallePagoCheque,jmenuBarDetallePagoCheque,jmenuBarDetalleDetallePagoCheque,jTtoolBarDetallePagoCheque,jTtoolBarDetalleDetallePagoCheque);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDetallePagoCheque ,jPanelParametrosReportesDetallePagoCheque, jScrollPanelDatosDetallePagoCheque,jPanelPaginacionDetallePagoCheque, jScrollPanelDatosEdicionDetallePagoCheque, jPanelAccionesDetallePagoCheque,jPanelAccionesFormularioDetallePagoCheque,jmenuBarDetallePagoCheque,jmenuBarDetalleDetallePagoCheque,jTtoolBarDetallePagoCheque,jTtoolBarDetalleDetallePagoCheque);
						
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
	
	public void finishProcessDetallePagoCheque() {// throws Exception 
		this.finishProcessDetallePagoCheque(true);
	}
	
	public void finishProcessDetallePagoCheque(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasDetallePagoCheque ,this.jPanelParametrosReportesDetallePagoCheque, this.jScrollPanelDatosDetallePagoCheque,this.jPanelPaginacionDetallePagoCheque, this.jScrollPanelDatosEdicionDetallePagoCheque, this.jPanelAccionesDetallePagoCheque,this.jPanelAccionesFormularioDetallePagoCheque,this.jmenuBarDetallePagoCheque,this.jmenuBarDetalleDetallePagoCheque,this.jTtoolBarDetallePagoCheque,this.jTtoolBarDetalleDetallePagoCheque);		
		
		final JTabbedPane jTabbedPaneBusquedasDetallePagoCheque=this.jTabbedPaneBusquedasDetallePagoCheque; 
		
		final JPanel jPanelParametrosReportesDetallePagoCheque=this.jPanelParametrosReportesDetallePagoCheque;
		//final JScrollPane jScrollPanelDatosDetallePagoCheque=this.jScrollPanelDatosDetallePagoCheque;
		final JTable jTableDatosDetallePagoCheque=this.jTableDatosDetallePagoCheque;		
		final JPanel jPanelPaginacionDetallePagoCheque=this.jPanelPaginacionDetallePagoCheque;
		//final JScrollPane jScrollPanelDatosEdicionDetallePagoCheque=this.jScrollPanelDatosEdicionDetallePagoCheque;
		final JPanel jPanelAccionesDetallePagoCheque=this.jPanelAccionesDetallePagoCheque;
		
		JPanel jPanelCamposAuxiliarDetallePagoCheque=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarDetallePagoCheque=new JPanel();
		
		if(this.jInternalFrameDetalleFormDetallePagoCheque!=null) {
			jPanelCamposAuxiliarDetallePagoCheque=this.jInternalFrameDetalleFormDetallePagoCheque.jPanelCamposDetallePagoCheque;
			jPanelAccionesFormularioAuxiliarDetallePagoCheque=this.jInternalFrameDetalleFormDetallePagoCheque.jPanelAccionesFormularioDetallePagoCheque;
		}
		
		final JPanel jPanelCamposDetallePagoCheque=jPanelCamposAuxiliarDetallePagoCheque;
		final JPanel jPanelAccionesFormularioDetallePagoCheque=jPanelAccionesFormularioAuxiliarDetallePagoCheque;
		
		
		final JMenuBar jmenuBarDetallePagoCheque=this.jmenuBarDetallePagoCheque;		
		final JToolBar jTtoolBarDetallePagoCheque=this.jTtoolBarDetallePagoCheque;
				
		JMenuBar jmenuBarDetalleAuxiliarDetallePagoCheque=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDetallePagoCheque=new JToolBar();
		
		if(this.jInternalFrameDetalleFormDetallePagoCheque!=null) {
			jmenuBarDetalleAuxiliarDetallePagoCheque=this.jInternalFrameDetalleFormDetallePagoCheque.jmenuBarDetalleDetallePagoCheque;
			jTtoolBarDetalleAuxiliarDetallePagoCheque=this.jInternalFrameDetalleFormDetallePagoCheque.jTtoolBarDetalleDetallePagoCheque;		
		}
		
		final JMenuBar jmenuBarDetalleDetallePagoCheque=jmenuBarDetalleAuxiliarDetallePagoCheque;
		final JToolBar jTtoolBarDetalleDetallePagoCheque=jTtoolBarDetalleAuxiliarDetallePagoCheque;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDetallePagoCheque;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDetallePagoCheque;
			processRunnable.jTableDatos=jTableDatosDetallePagoCheque;
			processRunnable.jPanelCampos=jPanelCamposDetallePagoCheque;
			processRunnable.jPanelPaginacion=jPanelPaginacionDetallePagoCheque;
			processRunnable.jPanelAcciones=jPanelAccionesDetallePagoCheque;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDetallePagoCheque;
			
			
			processRunnable.jmenuBar=jmenuBarDetallePagoCheque;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDetallePagoCheque;
			processRunnable.jTtoolBar=jTtoolBarDetallePagoCheque;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDetallePagoCheque;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasDetallePagoCheque ,jPanelParametrosReportesDetallePagoCheque, jTableDatosDetallePagoCheque,/*jScrollPanelDatosDetallePagoCheque,*/jPanelCamposDetallePagoCheque,jPanelPaginacionDetallePagoCheque, /*jScrollPanelDatosEdicionDetallePagoCheque,*/ jPanelAccionesDetallePagoCheque,jPanelAccionesFormularioDetallePagoCheque,jmenuBarDetallePagoCheque,jmenuBarDetalleDetallePagoCheque,jTtoolBarDetallePagoCheque,jTtoolBarDetalleDetallePagoCheque));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesDetallePagoCheque(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarDetallePagoCheque(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuDetallePagoCheque(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarDetallePagoCheque(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarDetallePagoCheque,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleDetallePagoCheque,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuDetallePagoCheque(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarDetallePagoCheque,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleDetallePagoCheque,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.detallepagochequeConstantesFunciones.getsFinalQueryDetallePagoCheque();
		String  finalQueryPaginacionTodos=this.detallepagochequeConstantesFunciones.getsFinalQueryDetallePagoCheque();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=DetallePagoChequeConstantesFunciones.getArrayColumnasGlobalesNoDetallePagoCheque(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=DetallePagoChequeConstantesFunciones.getArrayColumnasGlobalesDetallePagoCheque(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,DetallePagoChequeConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.detallepagochequesEliminados= new ArrayList<DetallePagoCheque>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessDetallePagoCheque();
		
				///*DetallePagoChequeSessionBean*/this.detallepagochequeSessionBean=new DetallePagoChequeSessionBean();
			
			if(this.detallepagochequeSessionBean==null) {
				this.detallepagochequeSessionBean=new DetallePagoChequeSessionBean();
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
					this.iNumeroPaginacion=DetallePagoChequeConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=DetallePagoChequeConstantesFunciones.getClassesForeignKeysOfDetallePagoCheque(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/detallepagocheque."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			detallepagochequesAux= new ArrayList<DetallePagoCheque>();
			
				
			detallepagochequeLogic.setDatosCliente(this.datosCliente);
			detallepagochequeLogic.setDatosDeep(this.datosDeep);
			detallepagochequeLogic.setIsConDeep(true);
			
			
			detallepagochequeLogic.getDetallePagoChequeDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					detallepagochequeLogic.getTodosDetallePagoCheques(finalQueryGlobal,pagination);
					
					//detallepagochequeLogic.getTodosDetallePagoChequesWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(detallepagochequeLogic.getDetallePagoCheques()==null|| detallepagochequeLogic.getDetallePagoCheques().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							detallepagochequesAux= new ArrayList<DetallePagoCheque>();
							detallepagochequesAux.addAll(detallepagochequeLogic.getDetallePagoCheques());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallepagochequesAux= new ArrayList<DetallePagoCheque>();
							detallepagochequesAux.addAll(detallepagocheques);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							detallepagochequeLogic.getTodosDetallePagoCheques(finalQueryGlobal+"",this.pagination);												
							
							//detallepagochequeLogic.getTodosDetallePagoChequesWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteDetallePagoCheques("Todos",detallepagochequeLogic.getDetallePagoCheques() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							detallepagochequeLogic.setDetallePagoCheques(new ArrayList<DetallePagoCheque>());					
							detallepagochequeLogic.getDetallePagoCheques().addAll(detallepagochequesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallepagocheques=new ArrayList<DetallePagoCheque>();
							detallepagocheques.addAll(detallepagochequesAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idDetallePagoCheque=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idDetallePagoCheque=this.idActual;
				
				} else if(this.idDetallePagoChequeActual!=null && this.idDetallePagoChequeActual!=0L) {
					idDetallePagoCheque=idDetallePagoChequeActual;
				}
				
					
				this.sDetalleReporte=DetallePagoChequeConstantesFunciones.getDetalleIndicePorId(idDetallePagoCheque);
				
				this.detallepagocheques=new ArrayList<DetallePagoCheque>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					detallepagochequeLogic.getEntity(idDetallePagoCheque);
					
					//detallepagochequeLogic.getEntityWithConnection(idDetallePagoCheque);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallepagochequeLogic.setDetallePagoCheques(new ArrayList<DetallePagoCheque>());
					detallepagochequeLogic.getDetallePagoCheques().add(detallepagochequeLogic.getDetallePagoCheque());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallepagocheques=new ArrayList<DetallePagoCheque>();
					this.detallepagocheques.add(detallepagocheque);
				}
				
				if(detallepagochequeLogic.getDetallePagoCheque()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdAsientoContable")) {
				this.sDetalleReporte=DetallePagoChequeConstantesFunciones.getDetalleIndiceFK_IdAsientoContable(id_asiento_contableFK_IdAsientoContable);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detallepagochequeLogic.getDetallePagoChequesFK_IdAsientoContable(finalQueryGlobal,pagination,id_asiento_contableFK_IdAsientoContable);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetallePagoChequeConstantesFunciones.getDetalleIndiceFK_IdAsientoContable(id_asiento_contableFK_IdAsientoContable);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetallePagoChequeConstantesFunciones.getDetalleIndiceFK_IdAsientoContable(id_asiento_contableFK_IdAsientoContable);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detallepagochequeLogic.getDetallePagoCheques()==null||detallepagochequeLogic.getDetallePagoCheques().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detallepagocheques==null|| detallepagocheques.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detallepagochequesAux=new ArrayList<DetallePagoCheque>();
						detallepagochequesAux.addAll(detallepagochequeLogic.getDetallePagoCheques());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallepagochequesAux=new ArrayList<DetallePagoCheque>();
							detallepagochequesAux.addAll(detallepagocheques);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detallepagochequeLogic.getDetallePagoChequesFK_IdAsientoContable(finalQueryGlobal,pagination,id_asiento_contableFK_IdAsientoContable);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetallePagoChequeConstantesFunciones.getDetalleIndiceFK_IdAsientoContable(id_asiento_contableFK_IdAsientoContable);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetallePagoChequeConstantesFunciones.getDetalleIndiceFK_IdAsientoContable(id_asiento_contableFK_IdAsientoContable);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetallePagoCheques("FK_IdAsientoContable",detallepagochequeLogic.getDetallePagoCheques());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetallePagoCheques("FK_IdAsientoContable",detallepagocheques);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detallepagochequeLogic.setDetallePagoCheques(new ArrayList<DetallePagoCheque>());
						detallepagochequeLogic.getDetallePagoCheques().addAll(detallepagochequesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallepagocheques=new ArrayList<DetallePagoCheque>();
							detallepagocheques.addAll(detallepagochequesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEjercicio")) {
				this.sDetalleReporte=DetallePagoChequeConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detallepagochequeLogic.getDetallePagoChequesFK_IdEjercicio(finalQueryGlobal,pagination,id_ejercicioFK_IdEjercicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetallePagoChequeConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetallePagoChequeConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detallepagochequeLogic.getDetallePagoCheques()==null||detallepagochequeLogic.getDetallePagoCheques().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detallepagocheques==null|| detallepagocheques.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detallepagochequesAux=new ArrayList<DetallePagoCheque>();
						detallepagochequesAux.addAll(detallepagochequeLogic.getDetallePagoCheques());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallepagochequesAux=new ArrayList<DetallePagoCheque>();
							detallepagochequesAux.addAll(detallepagocheques);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detallepagochequeLogic.getDetallePagoChequesFK_IdEjercicio(finalQueryGlobal,pagination,id_ejercicioFK_IdEjercicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetallePagoChequeConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetallePagoChequeConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetallePagoCheques("FK_IdEjercicio",detallepagochequeLogic.getDetallePagoCheques());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetallePagoCheques("FK_IdEjercicio",detallepagocheques);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detallepagochequeLogic.setDetallePagoCheques(new ArrayList<DetallePagoCheque>());
						detallepagochequeLogic.getDetallePagoCheques().addAll(detallepagochequesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallepagocheques=new ArrayList<DetallePagoCheque>();
							detallepagocheques.addAll(detallepagochequesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=DetallePagoChequeConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detallepagochequeLogic.getDetallePagoChequesFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetallePagoChequeConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetallePagoChequeConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detallepagochequeLogic.getDetallePagoCheques()==null||detallepagochequeLogic.getDetallePagoCheques().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detallepagocheques==null|| detallepagocheques.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detallepagochequesAux=new ArrayList<DetallePagoCheque>();
						detallepagochequesAux.addAll(detallepagochequeLogic.getDetallePagoCheques());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallepagochequesAux=new ArrayList<DetallePagoCheque>();
							detallepagochequesAux.addAll(detallepagocheques);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detallepagochequeLogic.getDetallePagoChequesFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetallePagoChequeConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetallePagoChequeConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetallePagoCheques("FK_IdEmpresa",detallepagochequeLogic.getDetallePagoCheques());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetallePagoCheques("FK_IdEmpresa",detallepagocheques);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detallepagochequeLogic.setDetallePagoCheques(new ArrayList<DetallePagoCheque>());
						detallepagochequeLogic.getDetallePagoCheques().addAll(detallepagochequesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallepagocheques=new ArrayList<DetallePagoCheque>();
							detallepagocheques.addAll(detallepagochequesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdPeriodo")) {
				this.sDetalleReporte=DetallePagoChequeConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detallepagochequeLogic.getDetallePagoChequesFK_IdPeriodo(finalQueryGlobal,pagination,id_periodoFK_IdPeriodo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetallePagoChequeConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetallePagoChequeConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detallepagochequeLogic.getDetallePagoCheques()==null||detallepagochequeLogic.getDetallePagoCheques().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detallepagocheques==null|| detallepagocheques.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detallepagochequesAux=new ArrayList<DetallePagoCheque>();
						detallepagochequesAux.addAll(detallepagochequeLogic.getDetallePagoCheques());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallepagochequesAux=new ArrayList<DetallePagoCheque>();
							detallepagochequesAux.addAll(detallepagocheques);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detallepagochequeLogic.getDetallePagoChequesFK_IdPeriodo(finalQueryGlobal,pagination,id_periodoFK_IdPeriodo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetallePagoChequeConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetallePagoChequeConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetallePagoCheques("FK_IdPeriodo",detallepagochequeLogic.getDetallePagoCheques());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetallePagoCheques("FK_IdPeriodo",detallepagocheques);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detallepagochequeLogic.setDetallePagoCheques(new ArrayList<DetallePagoCheque>());
						detallepagochequeLogic.getDetallePagoCheques().addAll(detallepagochequesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallepagocheques=new ArrayList<DetallePagoCheque>();
							detallepagocheques.addAll(detallepagochequesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=DetallePagoChequeConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detallepagochequeLogic.getDetallePagoChequesFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetallePagoChequeConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetallePagoChequeConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detallepagochequeLogic.getDetallePagoCheques()==null||detallepagochequeLogic.getDetallePagoCheques().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detallepagocheques==null|| detallepagocheques.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detallepagochequesAux=new ArrayList<DetallePagoCheque>();
						detallepagochequesAux.addAll(detallepagochequeLogic.getDetallePagoCheques());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallepagochequesAux=new ArrayList<DetallePagoCheque>();
							detallepagochequesAux.addAll(detallepagocheques);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detallepagochequeLogic.getDetallePagoChequesFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetallePagoChequeConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetallePagoChequeConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetallePagoCheques("FK_IdSucursal",detallepagochequeLogic.getDetallePagoCheques());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetallePagoCheques("FK_IdSucursal",detallepagocheques);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detallepagochequeLogic.setDetallePagoCheques(new ArrayList<DetallePagoCheque>());
						detallepagochequeLogic.getDetallePagoCheques().addAll(detallepagochequesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallepagocheques=new ArrayList<DetallePagoCheque>();
							detallepagocheques.addAll(detallepagochequesAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesDetallePagoCheque();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessDetallePagoCheque();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=detallepagochequeLogic.getDetallePagoCheques().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detallepagocheques.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=detallepagochequeLogic.getDetallePagoCheques().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detallepagocheques.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(DetallePagoCheque detallepagocheque) {
		Boolean permite=true;
		
		if(this.detallepagocheque.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=DetallePagoChequeConstantesFunciones.getOrderByListaDetallePagoCheque();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=DetallePagoChequeConstantesFunciones.getOrderByListaDetallePagoCheque();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetallePagoCheque detallepagocheque:detallepagochequeLogic.getDetallePagoCheques()) {
				if(detallepagocheque.getsType().equals(Constantes2.S_TOTALES)) {
					detallepagochequeTotales=detallepagocheque;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetallePagoCheque detallepagocheque:this.detallepagocheques) {
				if(detallepagocheque.getsType().equals(Constantes2.S_TOTALES)) {
					detallepagochequeTotales=detallepagocheque;
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
			this.detallepagochequeAux=new DetallePagoCheque();
			this.detallepagochequeAux.setsType(Constantes2.S_TOTALES);
			this.detallepagochequeAux.setIsNew(false);
			this.detallepagochequeAux.setIsChanged(false);
			this.detallepagochequeAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				DetallePagoChequeConstantesFunciones.TotalizarValoresFilaDetallePagoCheque(this.detallepagochequeLogic.getDetallePagoCheques(),this.detallepagochequeAux);
				
				this.detallepagochequeLogic.getDetallePagoCheques().add(this.detallepagochequeAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				DetallePagoChequeConstantesFunciones.TotalizarValoresFilaDetallePagoCheque(this.detallepagocheques,this.detallepagochequeAux);
				
				this.detallepagocheques.add(this.detallepagochequeAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		detallepagochequeTotales=new DetallePagoCheque();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.detallepagochequeLogic.getDetallePagoCheques().remove(detallepagochequeTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.detallepagocheques.remove(detallepagochequeTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		detallepagochequeTotales=new DetallePagoCheque();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetallePagoCheque detallepagocheque:detallepagochequeLogic.getDetallePagoCheques()) {
				if(detallepagocheque.getsType().equals(Constantes2.S_TOTALES)) {
					detallepagochequeTotales=detallepagocheque;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DetallePagoChequeConstantesFunciones.TotalizarValoresFilaDetallePagoCheque(this.detallepagochequeLogic.getDetallePagoCheques(),detallepagochequeTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetallePagoCheque detallepagocheque:this.detallepagocheques) {
				if(detallepagocheque.getsType().equals(Constantes2.S_TOTALES)) {
					detallepagochequeTotales=detallepagocheque;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DetallePagoChequeConstantesFunciones.TotalizarValoresFilaDetallePagoCheque(this.detallepagocheques,detallepagochequeTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getDetallePagoChequesFK_IdAnio()throws Exception {
		try {
			sAccionBusqueda="FK_IdAnio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetallePagoChequesFK_IdAsientoContable()throws Exception {
		try {
			sAccionBusqueda="FK_IdAsientoContable";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetallePagoChequesFK_IdEjercicio()throws Exception {
		try {
			sAccionBusqueda="FK_IdEjercicio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetallePagoChequesFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetallePagoChequesFK_IdMes()throws Exception {
		try {
			sAccionBusqueda="FK_IdMes";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetallePagoChequesFK_IdPeriodo()throws Exception {
		try {
			sAccionBusqueda="FK_IdPeriodo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetallePagoChequesFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getDetallePagoChequesFK_IdAnio(String sFinalQuery,Long id_anio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallepagochequeLogic.getDetallePagoChequesFK_IdAnio(sFinalQuery,this.pagination,id_anio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetallePagoChequesFK_IdAsientoContable(String sFinalQuery,Long id_asiento_contable)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallepagochequeLogic.getDetallePagoChequesFK_IdAsientoContable(sFinalQuery,this.pagination,id_asiento_contable);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetallePagoChequesFK_IdEjercicio(String sFinalQuery,Long id_ejercicio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallepagochequeLogic.getDetallePagoChequesFK_IdEjercicio(sFinalQuery,this.pagination,id_ejercicio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetallePagoChequesFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallepagochequeLogic.getDetallePagoChequesFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetallePagoChequesFK_IdMes(String sFinalQuery,Long id_mes)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallepagochequeLogic.getDetallePagoChequesFK_IdMes(sFinalQuery,this.pagination,id_mes);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetallePagoChequesFK_IdPeriodo(String sFinalQuery,Long id_periodo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallepagochequeLogic.getDetallePagoChequesFK_IdPeriodo(sFinalQuery,this.pagination,id_periodo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetallePagoChequesFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallepagochequeLogic.getDetallePagoChequesFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosDetallePagoCheque() {
		this.isPermisoTodoDetallePagoCheque=false;
		this.isPermisoNuevoDetallePagoCheque=false;
		this.isPermisoActualizarDetallePagoCheque=false;
		this.isPermisoActualizarOriginalDetallePagoCheque=false;
		this.isPermisoEliminarDetallePagoCheque=false;
		this.isPermisoGuardarCambiosDetallePagoCheque=false;
		this.isPermisoConsultaDetallePagoCheque=false;
		this.isPermisoBusquedaDetallePagoCheque=false;
		this.isPermisoReporteDetallePagoCheque=false;		
		this.isPermisoOrdenDetallePagoCheque=false;		
		this.isPermisoPaginacionMedioDetallePagoCheque=false;		
		this.isPermisoPaginacionAltoDetallePagoCheque=false;
		this.isPermisoPaginacionTodoDetallePagoCheque=false;
		this.isPermisoCopiarDetallePagoCheque=false;		
		this.isPermisoVerFormDetallePagoCheque=false;		
		this.isPermisoDuplicarDetallePagoCheque=false;		
		this.isPermisoOrdenDetallePagoCheque=false;		
	}
	
	public void setPermisosUsuarioDetallePagoCheque(Boolean isPermiso) {
		this.isPermisoTodoDetallePagoCheque=isPermiso;
		this.isPermisoNuevoDetallePagoCheque=isPermiso;
		this.isPermisoActualizarDetallePagoCheque=isPermiso;
		this.isPermisoActualizarOriginalDetallePagoCheque=isPermiso;
		this.isPermisoEliminarDetallePagoCheque=isPermiso;
		this.isPermisoGuardarCambiosDetallePagoCheque=isPermiso;
		this.isPermisoConsultaDetallePagoCheque=isPermiso;
		this.isPermisoBusquedaDetallePagoCheque=isPermiso;
		this.isPermisoReporteDetallePagoCheque=isPermiso;
		this.isPermisoOrdenDetallePagoCheque=isPermiso;		
		this.isPermisoPaginacionMedioDetallePagoCheque=isPermiso;		
		this.isPermisoPaginacionAltoDetallePagoCheque=isPermiso;		
		this.isPermisoPaginacionTodoDetallePagoCheque=isPermiso;		
		this.isPermisoCopiarDetallePagoCheque=isPermiso;		
		this.isPermisoVerFormDetallePagoCheque=isPermiso;		
		this.isPermisoDuplicarDetallePagoCheque=isPermiso;
		this.isPermisoOrdenDetallePagoCheque=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioDetallePagoCheque(Boolean isPermiso) {
		//this.isPermisoTodoDetallePagoCheque=isPermiso;
		this.isPermisoNuevoDetallePagoCheque=isPermiso;
		this.isPermisoActualizarDetallePagoCheque=isPermiso;
		this.isPermisoActualizarOriginalDetallePagoCheque=isPermiso;
		this.isPermisoEliminarDetallePagoCheque=isPermiso;
		this.isPermisoGuardarCambiosDetallePagoCheque=isPermiso;
		//this.isPermisoConsultaDetallePagoCheque=isPermiso;
		//this.isPermisoBusquedaDetallePagoCheque=isPermiso;
		//this.isPermisoReporteDetallePagoCheque=isPermiso;
		//this.isPermisoOrdenDetallePagoCheque=isPermiso;		
		//this.isPermisoPaginacionMedioDetallePagoCheque=isPermiso;		
		//this.isPermisoPaginacionAltoDetallePagoCheque=isPermiso;		
		//this.isPermisoPaginacionTodoDetallePagoCheque=isPermiso;		
		//this.isPermisoCopiarDetallePagoCheque=isPermiso;		
		//this.isPermisoDuplicarDetallePagoCheque=isPermiso;
		//this.isPermisoOrdenDetallePagoCheque=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioDetallePagoChequeClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(DetallePagoChequeJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebDetallePagoCheque(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioDetallePagoChequeClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioDetallePagoChequeClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionDetallePagoChequeClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioDetallePagoChequeClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioDetallePagoCheque() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(DetallePagoChequeJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.detallepagochequeSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, DetallePagoChequeConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoDetallePagoCheque=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarDetallePagoCheque=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalDetallePagoCheque=this.isPermisoActualizarDetallePagoCheque;
			this.isPermisoEliminarDetallePagoCheque=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosDetallePagoCheque=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaDetallePagoCheque=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaDetallePagoCheque=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoDetallePagoCheque=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteDetallePagoCheque=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDetallePagoCheque=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioDetallePagoCheque=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoDetallePagoCheque=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoDetallePagoCheque=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarDetallePagoCheque=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormDetallePagoCheque=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarDetallePagoCheque=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDetallePagoCheque=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.detallepagochequeSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosDetallePagoCheque.setToolTipText(this.jTableDatosDetallePagoCheque.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioDetallePagoCheque(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioDetallePagoCheque(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(DetallePagoChequeJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(DetallePagoChequeJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioDetallePagoCheque() throws Exception {
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
	public void inicializarCombosForeignKeyDetallePagoChequeListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.asientocontablesForeignKey=new ArrayList();
				this.ejerciciosForeignKey=new ArrayList();
				this.periodosForeignKey=new ArrayList();
				this.aniosForeignKey=new ArrayList();
				this.messForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyDetallePagoChequeListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(DetallePagoChequeJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyDetallePagoChequeListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyAsientoContableListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEjercicioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyPeriodoListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	public void cargarCombosLoteForeignKeyDetallePagoChequeListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			DetallePagoChequeParameterReturnGeneral detallepagochequeReturnGeneral=new DetallePagoChequeParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.detallepagochequeConstantesFunciones.cargarid_empresaDetallePagoCheque)
					 || (this.esRecargarFks && this.detallepagochequeConstantesFunciones.cargarid_empresaDetallePagoCheque)) {

					if(!this.detallepagochequeSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+detallepagochequeSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.detallepagochequeConstantesFunciones.cargarid_sucursalDetallePagoCheque)
					 || (this.esRecargarFks && this.detallepagochequeConstantesFunciones.cargarid_sucursalDetallePagoCheque)) {

					if(!this.detallepagochequeSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+detallepagochequeSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalAsientoContable="";

				if(((this.asientocontablesForeignKey==null||this.asientocontablesForeignKey.size()<=0) && this.detallepagochequeConstantesFunciones.cargarid_asiento_contableDetallePagoCheque)
					 || (this.esRecargarFks && this.detallepagochequeConstantesFunciones.cargarid_asiento_contableDetallePagoCheque)) {

					if(!this.detallepagochequeSessionBean.getisBusquedaDesdeForeignKeySesionAsientoContable()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=AsientoContableConstantesFunciones.getArrayColumnasGlobalesAsientoContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalAsientoContable=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,AsientoContableConstantesFunciones.TABLENAME);

						finalQueryGlobalAsientoContable=Funciones.GetFinalQueryAppend(finalQueryGlobalAsientoContable, "");
						finalQueryGlobalAsientoContable+=AsientoContableConstantesFunciones.SFINALQUERY;

						//this.cargarCombosAsientoContablesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalAsientoContable=" WHERE " + ConstantesSql.ID + "="+detallepagochequeSessionBean.getlidAsientoContableActual();
					}
				} else {
					finalQueryGlobalAsientoContable="NONE";
				}


				String finalQueryGlobalEjercicio="";

				if(((this.ejerciciosForeignKey==null||this.ejerciciosForeignKey.size()<=0) && this.detallepagochequeConstantesFunciones.cargarid_ejercicioDetallePagoCheque)
					 || (this.esRecargarFks && this.detallepagochequeConstantesFunciones.cargarid_ejercicioDetallePagoCheque)) {

					if(!this.detallepagochequeSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EjercicioConstantesFunciones.getArrayColumnasGlobalesEjercicio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEjercicio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EjercicioConstantesFunciones.TABLENAME);

						finalQueryGlobalEjercicio=Funciones.GetFinalQueryAppend(finalQueryGlobalEjercicio, "");
						finalQueryGlobalEjercicio+=EjercicioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEjerciciosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEjercicio=" WHERE " + ConstantesSql.ID + "="+detallepagochequeSessionBean.getlidEjercicioActual();
					}
				} else {
					finalQueryGlobalEjercicio="NONE";
				}


				String finalQueryGlobalPeriodo="";

				if(((this.periodosForeignKey==null||this.periodosForeignKey.size()<=0) && this.detallepagochequeConstantesFunciones.cargarid_periodoDetallePagoCheque)
					 || (this.esRecargarFks && this.detallepagochequeConstantesFunciones.cargarid_periodoDetallePagoCheque)) {

					if(!this.detallepagochequeSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PeriodoConstantesFunciones.getArrayColumnasGlobalesPeriodo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPeriodo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PeriodoConstantesFunciones.TABLENAME);

						finalQueryGlobalPeriodo=Funciones.GetFinalQueryAppend(finalQueryGlobalPeriodo, "");
						finalQueryGlobalPeriodo+=PeriodoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPeriodosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPeriodo=" WHERE " + ConstantesSql.ID + "="+detallepagochequeSessionBean.getlidPeriodoActual();
					}
				} else {
					finalQueryGlobalPeriodo="NONE";
				}


				String finalQueryGlobalAnio="";

				if(((this.aniosForeignKey==null||this.aniosForeignKey.size()<=0) && this.detallepagochequeConstantesFunciones.cargarid_anioDetallePagoCheque)
					 || (this.esRecargarFks && this.detallepagochequeConstantesFunciones.cargarid_anioDetallePagoCheque)) {

					if(!this.detallepagochequeSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=AnioConstantesFunciones.getArrayColumnasGlobalesAnio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalAnio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,AnioConstantesFunciones.TABLENAME);

						finalQueryGlobalAnio=Funciones.GetFinalQueryAppend(finalQueryGlobalAnio, "");
						finalQueryGlobalAnio+=AnioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosAniosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalAnio=" WHERE " + ConstantesSql.ID + "="+detallepagochequeSessionBean.getlidAnioActual();
					}
				} else {
					finalQueryGlobalAnio="NONE";
				}


				String finalQueryGlobalMes="";

				if(((this.messForeignKey==null||this.messForeignKey.size()<=0) && this.detallepagochequeConstantesFunciones.cargarid_mesDetallePagoCheque)
					 || (this.esRecargarFks && this.detallepagochequeConstantesFunciones.cargarid_mesDetallePagoCheque)) {

					if(!this.detallepagochequeSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=MesConstantesFunciones.getArrayColumnasGlobalesMes(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalMes=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,MesConstantesFunciones.TABLENAME);

						finalQueryGlobalMes=Funciones.GetFinalQueryAppend(finalQueryGlobalMes, "");
						finalQueryGlobalMes+=MesConstantesFunciones.SFINALQUERY;

						//this.cargarCombosMessForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalMes=" WHERE " + ConstantesSql.ID + "="+detallepagochequeSessionBean.getlidMesActual();
					}
				} else {
					finalQueryGlobalMes="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				detallepagochequeReturnGeneral=detallepagochequeLogic.cargarCombosLoteForeignKeyDetallePagoCheque(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalAsientoContable,finalQueryGlobalEjercicio,finalQueryGlobalPeriodo,finalQueryGlobalAnio,finalQueryGlobalMes);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=detallepagochequeReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=detallepagochequeReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalAsientoContable.equals("NONE")) {
				this.asientocontablesForeignKey=detallepagochequeReturnGeneral.getasientocontablesForeignKey();
			}

			if(!finalQueryGlobalEjercicio.equals("NONE")) {
				this.ejerciciosForeignKey=detallepagochequeReturnGeneral.getejerciciosForeignKey();
			}

			if(!finalQueryGlobalPeriodo.equals("NONE")) {
				this.periodosForeignKey=detallepagochequeReturnGeneral.getperiodosForeignKey();
			}

			if(!finalQueryGlobalAnio.equals("NONE")) {
				this.aniosForeignKey=detallepagochequeReturnGeneral.getaniosForeignKey();
			}

			if(!finalQueryGlobalMes.equals("NONE")) {
				this.messForeignKey=detallepagochequeReturnGeneral.getmessForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyDetallePagoCheque()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyAsientoContable();
			this.addItemDefectoCombosForeignKeyEjercicio();
			this.addItemDefectoCombosForeignKeyPeriodo();
			this.addItemDefectoCombosForeignKeyAnio();
			this.addItemDefectoCombosForeignKeyMes();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.detallepagochequeSessionBean==null) {
				this.detallepagochequeSessionBean=new DetallePagoChequeSessionBean();
			}

			if(!this.detallepagochequeSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.detallepagochequeSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

	public void addItemDefectoCombosForeignKeyAsientoContable()throws Exception {
		try {

			if(!this.detallepagochequeSessionBean.getisBusquedaDesdeForeignKeySesionAsientoContable()) {
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

	public void addItemDefectoCombosForeignKeyEjercicio()throws Exception {
		try {

			if(!this.detallepagochequeSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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

			if(!this.detallepagochequeSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
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

			if(!this.detallepagochequeSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
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

			if(!this.detallepagochequeSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
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
	
	public void initActionsCombosTodosForeignKeyDetallePagoCheque()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyDetallePagoCheque(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyDetallePagoCheque()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
				this.setActualEjercicioForeignKey(this.parametroGeneralUsuario.getid_ejercicio(),false,"Formulario");
				this.setActualPeriodoForeignKey(this.parametroGeneralUsuario.getid_periodo(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyDetallePagoCheque();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyDetallePagoCheque(DetallePagoCheque detallepagocheque)throws Exception {	
		try {
			
			this.setActualAsientoContableForeignKey(detallepagocheque.getid_asiento_contable(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyDetallePagoCheque(DetallePagoCheque detallepagocheque,String sTipoEvento)throws Exception {	
		try {
			
			

				if(detallepagocheque.getAsientoContable()!=null && !sTipoEvento.equals("id_asiento_contableDetallePagoCheque")) { //sTipoEvento Evita Bucle Infinito

					this.asientocontablesForeignKey=new ArrayList<AsientoContable>();
					this.asientocontablesForeignKey.add(detallepagocheque.getAsientoContable());

					this.addItemDefectoCombosForeignKeyAsientoContable();
					this.cargarCombosFrameAsientoContablesForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyDetallePagoCheque()throws Exception {	
		try {
			
			this.setActualAsientoContableForeignKey(this.detallepagochequeConstantesFunciones.getid_asiento_contable(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyDetallePagoCheque()throws Exception {	
		try {
			

				if(this.jInternalFrameDetalleFormDetallePagoCheque!=null) {
					Ejercicio ejercicioActual=(Ejercicio)this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_ejercicioDetallePagoCheque.getSelectedItem();
					this.setActualAnioForeignKey(ejercicioActual.getid_anio(),false,"Formulario");
				}

				if(this.jInternalFrameDetalleFormDetallePagoCheque!=null) {
					Periodo periodoActual=(Periodo)this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_periodoDetallePagoCheque.getSelectedItem();
					this.setActualMesForeignKey(periodoActual.getid_mes(),false,"Formulario");
				}
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyDetallePagoCheque()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyDetallePagoCheque()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroDetallePagoCheque()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyDetallePagoCheque()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameAsientoContablesForeignKey("Todos");
			this.cargarCombosFrameEjerciciosForeignKey("Todos");
			this.cargarCombosFramePeriodosForeignKey("Todos");
			this.cargarCombosFrameAniosForeignKey("Todos");
			this.cargarCombosFrameMessForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyDetallePagoCheque(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameAsientoContablesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEjerciciosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFramePeriodosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameAniosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameMessForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyDetallePagoCheque()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_empresaDetallePagoCheque!=null && this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_empresaDetallePagoCheque.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_empresaDetallePagoCheque.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_sucursalDetallePagoCheque!=null && this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_sucursalDetallePagoCheque.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_sucursalDetallePagoCheque.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_asiento_contableDetallePagoCheque!=null && this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_asiento_contableDetallePagoCheque.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_asiento_contableDetallePagoCheque.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_ejercicioDetallePagoCheque!=null && this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_ejercicioDetallePagoCheque.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_ejercicioDetallePagoCheque.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_periodoDetallePagoCheque!=null && this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_periodoDetallePagoCheque.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_periodoDetallePagoCheque.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_anioDetallePagoCheque!=null && this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_anioDetallePagoCheque.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_anioDetallePagoCheque.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_mesDetallePagoCheque!=null && this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_mesDetallePagoCheque.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_mesDetallePagoCheque.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	














	
	

	public DetallePagoChequeBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public DetallePagoChequeBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public DetallePagoChequeBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.detallepagochequeSessionBean=new DetallePagoChequeSessionBean(); 
		this.detallepagochequeConstantesFunciones=new DetallePagoChequeConstantesFunciones(); 
		this.detallepagochequeBean=new DetallePagoCheque();//(this.detallepagochequeConstantesFunciones); 		
		this.detallepagochequeReturnGeneral=new DetallePagoChequeParameterReturnGeneral(); 
		
		this.detallepagochequeSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detallepagochequeSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public DetallePagoChequeBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public DetallePagoChequeBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public DetallePagoChequeBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessDetallePagoCheque(true);
			
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
			
			this.detallepagochequeConstantesFunciones=new DetallePagoChequeConstantesFunciones(); 
			this.detallepagochequeBean=new DetallePagoCheque();//this.detallepagochequeConstantesFunciones); 			
			this.detallepagochequeReturnGeneral=new DetallePagoChequeParameterReturnGeneral(); 
		
			DetallePagoChequeBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Detalle Pago Cheque Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.detallepagocheque=new DetallePagoCheque();
			this.detallepagocheques = new ArrayList<DetallePagoCheque>();
			this.detallepagochequesAux = new ArrayList<DetallePagoCheque>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagochequeLogic=new DetallePagoChequeLogic();
				this.detallepagochequeLogic.getNewConnexionToDeep("");
			}
			
			//this.detallepagochequeSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.detallepagochequeSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormDetallePagoCheque);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoDetallePagoCheque!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDetallePagoCheque);	
					}
					
					if(this.jInternalFrameImportacionDetallePagoCheque!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDetallePagoCheque);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByDetallePagoCheque!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByDetallePagoCheque);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormDetallePagoCheque!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormDetallePagoCheque);
				this.jInternalFrameDetalleFormDetallePagoCheque.setVisible(false);
				this.jInternalFrameDetalleFormDetallePagoCheque.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoDetallePagoCheque!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDetallePagoCheque);
					this.jInternalFrameReporteDinamicoDetallePagoCheque.setVisible(false);
					this.jInternalFrameReporteDinamicoDetallePagoCheque.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionDetallePagoCheque!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionDetallePagoCheque);
					this.jInternalFrameImportacionDetallePagoCheque.setVisible(false);
					this.jInternalFrameImportacionDetallePagoCheque.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByDetallePagoCheque!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByDetallePagoCheque);
					this.jInternalFrameOrderByDetallePagoCheque.setVisible(false);
					this.jInternalFrameOrderByDetallePagoCheque.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idDetallePagoChequeActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=DetallePagoChequeConstantesFunciones.INUMEROPAGINACION;
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
			
			this.detallepagochequeReturnGeneral=new DetallePagoChequeParameterReturnGeneral();
			
			this.detallepagochequeParameterGeneral=new DetallePagoChequeParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.detallepagochequeLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.detallepagochequeSessionBean.getEsGuardarRelacionado()) {
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
			
			if(DetallePagoChequeJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.detallepagochequeSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DetallePagoChequeConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.detallepagochequeSessionBean.getEsGuardarRelacionado(),this.detallepagochequeSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DetallePagoChequeConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.detallepagochequeSessionBean.getEsGuardarRelacionado(),this.detallepagochequeSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoDetallePagoCheque=false;
			this.isVisibilidadCeldaDuplicarDetallePagoCheque=true;
			this.isVisibilidadCeldaCopiarDetallePagoCheque=true;
			this.isVisibilidadCeldaVerFormDetallePagoCheque=true;
			this.isVisibilidadCeldaOrdenDetallePagoCheque=true;
			this.isVisibilidadCeldaNuevoRelacionesDetallePagoCheque=false;
			this.isVisibilidadCeldaModificarDetallePagoCheque=false;
			this.isVisibilidadCeldaActualizarDetallePagoCheque=false;
			this.isVisibilidadCeldaEliminarDetallePagoCheque=false;
			this.isVisibilidadCeldaCancelarDetallePagoCheque=false;
			this.isVisibilidadCeldaGuardarDetallePagoCheque=false;
			this.isVisibilidadCeldaGuardarCambiosDetallePagoCheque=false;
			
			
			this.isVisibilidadFK_IdAnio=true;
			this.isVisibilidadFK_IdAsientoContable=true;
			this.isVisibilidadFK_IdEjercicio=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdMes=true;
			this.isVisibilidadFK_IdPeriodo=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesDetallePagoCheque("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosDetallePagoCheque();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioDetallePagoCheque(false);
			
			this.setPermisosUsuarioDetallePagoCheque();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.detallepagochequeSessionBean.getEsGuardarRelacionado() 
				|| (this.detallepagochequeSessionBean.getEsGuardarRelacionado() && this.detallepagochequeSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioDetallePagoChequeClasesRelacionadas();
			}
			
			if(this.detallepagochequeSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioDetallePagoChequeClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!DetallePagoChequeJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosDetallePagoCheque();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualDetallePagoCheque();
			}
			
			if(!this.isPermisoBusquedaDetallePagoCheque) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasDetallePagoCheque.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.detallepagochequeSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioDetallePagoCheque,this.isPermisoPaginacionMedioDetallePagoCheque,this.isPermisoPaginacionTodoDetallePagoCheque);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(DetallePagoChequeConstantesFunciones.getTiposSeleccionarDetallePagoCheque());
				
				this.tiposColumnasSelect=DetallePagoChequeConstantesFunciones.getTiposSeleccionarDetallePagoCheque(true);
				
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
			//if(!this.detallepagochequeSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioDetallePagoCheque();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioDetallePagoCheque(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioDetallePagoCheque(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesDetallePagoCheque() ;
			
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
			this.asientocontableLogic=new AsientoContableLogic();
			this.ejercicioLogic=new EjercicioLogic();
			this.periodoLogic=new PeriodoLogic();
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
				detallepagochequeImplementable= (DetallePagoChequeImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DetallePagoChequeConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				detallepagochequeImplementableHome= (DetallePagoChequeImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DetallePagoChequeConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.detallepagocheques= new ArrayList<DetallePagoCheque>();
			this.detallepagochequesEliminados= new ArrayList<DetallePagoCheque>();
						
			this.isEsNuevoDetallePagoCheque=false;
			this.esParaAccionDesdeFormularioDetallePagoCheque=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idAsientoContableActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.asientocontablesForeignKey=new ArrayList<AsientoContable>() ;
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>() ;
			this.periodosForeignKey=new ArrayList<Periodo>() ;
			this.aniosForeignKey=new ArrayList<Anio>() ;
			this.messForeignKey=new ArrayList<Mes>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyDetallePagoCheque(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroDetallePagoCheque();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.detallepagochequeSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			DetallePagoChequeBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=DetallePagoChequeConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesDetallePagoCheque("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingDetallePagoCheque(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormDetallePagoCheque!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioDetallePagoCheque();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioDetallePagoCheque();
			}
			
			DetallePagoChequeBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasDetallePagoCheque.getTabCount(); i++) {
					this.jTabbedPaneBusquedasDetallePagoCheque.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasDetallePagoCheque.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagochequeLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessDetallePagoCheque(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga DetallePagoCheque: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagochequeLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagochequeLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectDetallePagoCheque() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesDetallePagoCheque")) {
				iIndex=this.jInternalFrameDetalleFormDetallePagoCheque.jTabbedPaneRelacionesDetallePagoCheque.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormDetallePagoCheque.jTabbedPaneRelacionesDetallePagoCheque.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosDetallePagoCheque.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessDetallePagoCheque();	
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
	
	public void cargarCombosForeignKeyDetallePagoCheque(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyDetallePagoCheque(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyDetallePagoCheque(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyDetallePagoChequeListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyDetallePagoCheque();
		
		this.cargarCombosFrameForeignKeyDetallePagoCheque();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyDetallePagoCheque();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyDetallePagoCheque();
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
	
	public void jButtonNuevoDetallePagoChequeActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.detallepagochequeSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormDetallePagoCheque==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			DetallePagoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.detallepagocheque,new Object(),this.detallepagochequeParameterGeneral,this.detallepagochequeReturnGeneral);
			
			
			if(jTableDatosDetallePagoCheque.getRowCount()>=1) {
				jTableDatosDetallePagoCheque.removeRowSelectionInterval(0, jTableDatosDetallePagoCheque.getRowCount()-1);						
			}
			
			this.isEsNuevoDetallePagoCheque=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoDetallePagoCheque(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesDetallePagoCheque(true);			
			//this.detallepagocheque=new DetallePagoCheque();
			//this.detallepagocheque.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDetallePagoCheque(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetallePagoCheque() ;
			
			if(DetallePagoChequeJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDetallePagoCheque(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.detallepagocheque);	
			this.actualizarInformacion("INFO_PADRE",false,this.detallepagocheque);				
			
			DetallePagoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.detallepagocheque,new Object(),this.detallepagochequeParameterGeneral,this.detallepagochequeReturnGeneral);
			
			if(this.detallepagochequeSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar DetallePagoCheque: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			DetallePagoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.detallepagocheque,new Object(),this.detallepagochequeParameterGeneral,this.detallepagochequeReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarDetallePagoChequeActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<DetallePagoCheque> detallepagochequesSeleccionados=new ArrayList<DetallePagoCheque>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosDetallePagoCheque.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosDetallePagoCheque.getSelectedRows().length;			
			}
			
			detallepagochequesSeleccionados=this.getDetallePagoChequesSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoDetallePagoCheque--;			
				//DetallePagoCheque detallepagochequeAux= new DetallePagoCheque();			
				//detallepagochequeAux.setId(this.iIdNuevoDetallePagoCheque);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//DetallePagoCheque detallepagochequeOrigen=new DetallePagoCheque();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(DetallePagoCheque detallepagochequeOrigen : detallepagochequesSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosDetallePagoCheque.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							detallepagochequeOrigen =(DetallePagoCheque) this.detallepagochequeLogic.getDetallePagoCheques().toArray()[this.jTableDatosDetallePagoCheque.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallepagochequeOrigen =(DetallePagoCheque) this.detallepagocheques.toArray()[this.jTableDatosDetallePagoCheque.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaDetallePagoCheque();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.detallepagocheque.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosDetallePagoCheque(detallepagochequeOrigen,this.detallepagocheque,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePagoCheque(this.detallepagocheque);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.detallepagochequeLogic.getDetallePagoCheques().add(this.detallepagochequeAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.detallepagocheques.add(this.detallepagochequeAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaDetallePagoCheque(false);
				
				this.jTableDatosDetallePagoCheque.setRowSelectionInterval(this.getIndiceNuevoDetallePagoCheque(), this.getIndiceNuevoDetallePagoCheque());
				
				int iLastRow =  this.jTableDatosDetallePagoCheque.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDetallePagoCheque.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDetallePagoCheque.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDetallePagoCheque(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarDetallePagoChequeActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<DetallePagoCheque> detallepagochequesSeleccionados=new ArrayList<DetallePagoCheque>();									
		
			DetallePagoCheque detallepagochequeOrigen=new DetallePagoCheque();
			DetallePagoCheque detallepagochequeDestino=new DetallePagoCheque();
				
			detallepagochequesSeleccionados=this.getDetallePagoChequesSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosDetallePagoCheque.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || detallepagochequesSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosDetallePagoCheque.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detallepagochequeOrigen =(DetallePagoCheque) this.detallepagochequeLogic.getDetallePagoCheques().toArray()[this.jTableDatosDetallePagoCheque.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						detallepagochequeOrigen =(DetallePagoCheque) this.detallepagocheques.toArray()[this.jTableDatosDetallePagoCheque.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detallepagochequeDestino =(DetallePagoCheque) this.detallepagochequeLogic.getDetallePagoCheques().toArray()[this.jTableDatosDetallePagoCheque.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						detallepagochequeDestino =(DetallePagoCheque) this.detallepagocheques.toArray()[this.jTableDatosDetallePagoCheque.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				detallepagochequeOrigen =detallepagochequesSeleccionados.get(0);
				detallepagochequeDestino =detallepagochequesSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosDetallePagoCheque(detallepagochequeOrigen,detallepagochequeDestino,true,false);
				
				detallepagochequeDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(detallepagochequeDestino,detallepagochequeLogic.getDetallePagoCheques());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detallepagochequeDestino,detallepagocheques);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaDetallePagoCheque(false);
				
				//this.jTableDatosDetallePagoCheque.setRowSelectionInterval(this.getIndiceNuevoDetallePagoCheque(), this.getIndiceNuevoDetallePagoCheque());
				
				int iLastRow =  this.jTableDatosDetallePagoCheque.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDetallePagoCheque.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDetallePagoCheque.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDetallePagoCheque(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormDetallePagoChequeActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDetallePagoCheque==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormDetallePagoCheque.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarDetallePagoChequeActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesDetallePagoCheque.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasDetallePagoCheque.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesDetallePagoCheque.setVisible(!isVisible);
			this.jPanelPaginacionDetallePagoCheque.setVisible(!isVisible);
			this.jPanelAccionesDetallePagoCheque.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarDetallePagoChequeActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameDetallePagoCheque();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoDetallePagoChequeActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoDetallePagoCheque();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionDetallePagoChequeActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionDetallePagoCheque();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByDetallePagoChequeActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByDetallePagoCheque();
			
			this.abrirFrameOrderByDetallePagoCheque();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByDetallePagoChequeActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByDetallePagoCheque();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleDetallePagoCheque(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormDetallePagoCheque);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormDetallePagoCheque.isMaximum()) {
					this.jInternalFrameDetalleFormDetallePagoCheque.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormDetallePagoCheque.setSize(this.jInternalFrameDetalleFormDetallePagoCheque.iWidthFormulario,this.jInternalFrameDetalleFormDetallePagoCheque.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormDetallePagoCheque.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormDetallePagoCheque.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormDetallePagoCheque.isMaximum()) {
						this.jInternalFrameDetalleFormDetallePagoCheque.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormDetallePagoCheque.jContentPaneDetalleDetallePagoCheque.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormDetallePagoCheque.jTabbedPaneRelacionesDetallePagoCheque.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormDetallePagoCheque.jContentPaneDetalleDetallePagoCheque.getWidth(),DetallePagoChequeConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDetallePagoCheque.jTabbedPaneRelacionesDetallePagoCheque.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormDetallePagoCheque.jContentPaneDetalleDetallePagoCheque.getWidth(),DetallePagoChequeConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDetallePagoCheque.jTabbedPaneRelacionesDetallePagoCheque.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormDetallePagoCheque.jContentPaneDetalleDetallePagoCheque.getWidth(),DetallePagoChequeConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormDetallePagoCheque.setVisible(true);
	        this.jInternalFrameDetalleFormDetallePagoCheque.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByDetallePagoCheque() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByDetallePagoCheque==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByDetallePagoCheque=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetallePagoCheque,false,this);
				} else {
					this.jInternalFrameOrderByDetallePagoCheque=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetallePagoCheque,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByDetallePagoCheque);
				this.jInternalFrameOrderByDetallePagoCheque.setVisible(false);
				this.jInternalFrameOrderByDetallePagoCheque.setSelected(false);
				
				this.jInternalFrameOrderByDetallePagoCheque.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDetallePagoCheque"));
				
				this.inicializarActualizarBindingTablaOrderByDetallePagoCheque();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionDetallePagoCheque() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionDetallePagoCheque==null) {
				
				this.jInternalFrameImportacionDetallePagoCheque=new ImportacionJInternalFrame(DetallePagoChequeConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDetallePagoCheque);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionDetallePagoCheque);
				this.jInternalFrameImportacionDetallePagoCheque.setVisible(false);
				this.jInternalFrameImportacionDetallePagoCheque.setSelected(false);


				this.jInternalFrameImportacionDetallePagoCheque.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDetallePagoCheque"));
				this.jInternalFrameImportacionDetallePagoCheque.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDetallePagoCheque"));
				this.jInternalFrameImportacionDetallePagoCheque.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDetallePagoCheque"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoDetallePagoCheque() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoDetallePagoCheque==null) {
				this.jInternalFrameReporteDinamicoDetallePagoCheque=new ReporteDinamicoJInternalFrame(DetallePagoChequeConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDetallePagoCheque);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDetallePagoCheque);
				this.jInternalFrameReporteDinamicoDetallePagoCheque.setVisible(false);
				this.jInternalFrameReporteDinamicoDetallePagoCheque.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoDetallePagoCheque.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDetallePagoCheque"));
				this.jInternalFrameReporteDinamicoDetallePagoCheque.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDetallePagoCheque"));
				this.jInternalFrameReporteDinamicoDetallePagoCheque.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDetallePagoCheque"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDetallePagoCheque();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleDetallePagoCheque() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormDetallePagoCheque);
			
	       	this.jInternalFrameDetalleFormDetallePagoCheque.setVisible(false);
	        this.jInternalFrameDetalleFormDetallePagoCheque.setSelected(false);
			
			//this.jInternalFrameDetalleFormDetallePagoCheque.dispose();
			//this.jInternalFrameDetalleFormDetallePagoCheque=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoDetallePagoCheque() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoDetallePagoCheque.setVisible(true);
	        this.jInternalFrameReporteDinamicoDetallePagoCheque.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionDetallePagoCheque() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionDetallePagoCheque.setVisible(true);
	        this.jInternalFrameImportacionDetallePagoCheque.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByDetallePagoCheque() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByDetallePagoCheque.setVisible(true);
	        this.jInternalFrameOrderByDetallePagoCheque.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByDetallePagoCheque() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByDetallePagoCheque.setVisible(false);
	        this.jInternalFrameOrderByDetallePagoCheque.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoDetallePagoCheque() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoDetallePagoCheque.setVisible(false);
	        this.jInternalFrameReporteDinamicoDetallePagoCheque.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionDetallePagoCheque() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionDetallePagoCheque.setVisible(false);
	        this.jInternalFrameImportacionDetallePagoCheque.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarDetallePagoChequeActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarDetallePagoCheque(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarDetallePagoCheque(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDetallePagoCheque.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesDetallePagoCheque(true);
			//this.isEsNuevoDetallePagoCheque=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagocheque =(DetallePagoCheque) this.detallepagochequeLogic.getDetallePagoCheques().toArray()[this.jTableDatosDetallePagoCheque.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.detallepagocheque =(DetallePagoCheque) this.detallepagocheques.toArray()[this.jTableDatosDetallePagoCheque.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesDetallePagoCheque("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDetallePagoCheque(false) ;
			
			if(detallepagochequeSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(DetallePagoChequeJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDetallePagoCheque(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetallePagoCheque(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaDetallePagoChequeActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosDetallePagoCheque.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagocheque =(DetallePagoCheque) this.detallepagochequeLogic.getDetallePagoCheques().toArray()[this.jTableDatosDetallePagoCheque.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallepagocheque =(DetallePagoCheque) this.detallepagocheques.toArray()[this.jTableDatosDetallePagoCheque.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarDetallePagoCheque(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDetallePagoCheque==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDetallePagoCheque.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesDetallePagoCheque(true);
			//this.isEsNuevoDetallePagoCheque=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagocheque =(DetallePagoCheque) this.detallepagochequeLogic.getDetallePagoCheques().toArray()[this.jTableDatosDetallePagoCheque.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.detallepagocheque =(DetallePagoCheque) this.detallepagocheques.toArray()[this.jTableDatosDetallePagoCheque.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.detallepagocheque.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesDetallePagoCheque("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesDetallePagoCheque(false) ;
			
			if(DetallePagoChequeJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDetallePagoCheque(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetallePagoCheque(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("AsientoContable")) {
				if(!this.detallepagochequeConstantesFunciones.cargarid_asiento_contableDetallePagoCheque) {
					this.cargarCombosAsientoContablesForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingDetallePagoCheque(false,false);
					this.cargarCombosFrameAsientoContablesForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_asiento_contable (id);

				this.recargarComboTablaAsientoContable(this.asientocontablesForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaAsientoContable(List<AsientoContable> asientocontablesForeignKey)throws Exception{
		TableColumn tableColumnAsientoContable=this.jTableDatosDetallePagoCheque.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePagoCheque,DetallePagoChequeConstantesFunciones.LABEL_IDASIENTOCONTABLE));
		TableCellEditor tableCellEditorAsientoContable =tableColumnAsientoContable.getCellEditor();

		AsientoContableTableCell asientocontableTableCellFk=(AsientoContableTableCell)tableCellEditorAsientoContable;

		if(asientocontableTableCellFk!=null) {
			asientocontableTableCellFk.setasientocontablesForeignKey(asientocontablesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDetallePagoCheque.getSelectedRow();

		//if(intSelectedRow<=0) {
			//asientocontableTableCellFk.setRowActual(intSelectedRow);
			//asientocontableTableCellFk.setasientocontablesForeignKeyActual(asientocontablesForeignKey);
		//}


		if(asientocontableTableCellFk!=null) {
			asientocontableTableCellFk.RecargarAsientoContablesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
			
	
	public void recargarComboTablaAnio(List<Anio> aniosForeignKey)throws Exception{
		TableColumn tableColumnAnio=this.jTableDatosDetallePagoCheque.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePagoCheque,DetallePagoChequeConstantesFunciones.LABEL_IDANIO));
		TableCellEditor tableCellEditorAnio =tableColumnAnio.getCellEditor();

		AnioTableCell anioTableCellFk=(AnioTableCell)tableCellEditorAnio;

		if(anioTableCellFk!=null) {
			anioTableCellFk.setaniosForeignKey(aniosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDetallePagoCheque.getSelectedRow();

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
		TableColumn tableColumnMes=this.jTableDatosDetallePagoCheque.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePagoCheque,DetallePagoChequeConstantesFunciones.LABEL_IDMES));
		TableCellEditor tableCellEditorMes =tableColumnMes.getCellEditor();

		MesTableCell mesTableCellFk=(MesTableCell)tableCellEditorMes;

		if(mesTableCellFk!=null) {
			mesTableCellFk.setmessForeignKey(messForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDetallePagoCheque.getSelectedRow();

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
	
	public void jButtonActualizarDetallePagoChequeActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagochequeLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesDetallePagoCheque(false);
			
			//if(!this.isEsNuevoDetallePagoCheque) {								
				int intSelectedRow = this.jTableDatosDetallePagoCheque.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagocheque =(DetallePagoCheque) this.detallepagochequeLogic.getDetallePagoCheques().toArray()[this.jTableDatosDetallePagoCheque.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallepagocheque =(DetallePagoCheque) this.detallepagocheques.toArray()[this.jTableDatosDetallePagoCheque.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(DetallePagoChequeJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualDetallePagoCheque(this.detallepagocheque,true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetallePagoCheque(this.detallepagocheque);
				
			}
			
			if(this.permiteMantenimiento(this.detallepagocheque)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.detallepagochequeSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoDetallePagoCheque=true;
					this.inicializarActualizarBindingTablaDetallePagoCheque(false);
					this.isEsNuevoDetallePagoCheque=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoDetallePagoCheque=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoDetallePagoCheque=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDetallePagoCheque(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDetallePagoCheque(false);
				
				this.habilitarDeshabilitarControlesDetallePagoCheque(false);
			
												
				
				if(DetallePagoChequeJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleDetallePagoCheque();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoDetallePagoChequeActionPerformed(evt,detallepagochequeSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualDetallePagoCheque(this.detallepagocheque,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosDetallePagoCheque.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,detallepagochequeSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagochequeLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.detallepagocheque.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(DetallePagoCheque.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetallePagoCheque.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagochequeLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagochequeLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarDetallePagoChequeActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagochequeLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosDetallePagoCheque.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagocheque =(DetallePagoCheque) this.detallepagochequeLogic.getDetallePagoCheques().toArray()[this.jTableDatosDetallePagoCheque.convertRowIndexToModel(intSelectedRow)];
				this.detallepagocheque.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.detallepagocheque =(DetallePagoCheque) this.detallepagocheques.toArray()[this.jTableDatosDetallePagoCheque.convertRowIndexToModel(intSelectedRow)];
				this.detallepagocheque.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.detallepagocheque)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.detallepagochequeSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((DetallePagoChequeModel) this.jTableDatosDetallePagoCheque.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoDetallePagoCheque=true;
				this.inicializarActualizarBindingTablaDetallePagoCheque(false);
				this.isEsNuevoDetallePagoCheque=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDetallePagoCheque(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDetallePagoCheque(false);
				
				this.habilitarDeshabilitarControlesDetallePagoCheque(false);
				
				
				
				if(DetallePagoChequeJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleDetallePagoCheque();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagochequeLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagochequeLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagochequeLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarDetallePagoChequeActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosDetallePagoCheque.getRowCount()>=1) {
				jTableDatosDetallePagoCheque.removeRowSelectionInterval(0, jTableDatosDetallePagoCheque.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesDetallePagoCheque(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaDetallePagoCheque(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDetallePagoCheque(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetallePagoCheque(false) ;
			
			this.isEsNuevoDetallePagoCheque=false;
			
			if(DetallePagoChequeJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleDetallePagoCheque();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosDetallePagoChequeActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagochequeLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingDetallePagoCheque(false);
				
				//SI ES MANUAL
				if(DetallePagoChequeJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualDetallePagoCheque();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagochequeLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagochequeLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagochequeLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosDetallePagoChequeActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoDetallePagoCheque--;			
			//DetallePagoCheque detallepagochequeAux= new DetallePagoCheque();			
			//detallepagochequeAux.setId(this.iIdNuevoDetallePagoCheque);
			
			if(this.jInternalFrameDetalleFormDetallePagoCheque==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaDetallePagoCheque();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysDetallePagoCheque(this.detallepagocheque);
			
			this.detallepagocheque.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.detallepagochequeLogic.getDetallePagoCheques().add(this.detallepagochequeAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.detallepagocheques.add(this.detallepagochequeAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaDetallePagoCheque(false);
			
			this.jTableDatosDetallePagoCheque.setRowSelectionInterval(this.getIndiceNuevoDetallePagoCheque(), this.getIndiceNuevoDetallePagoCheque());
			
			int iLastRow =  this.jTableDatosDetallePagoCheque.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosDetallePagoCheque.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosDetallePagoCheque.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaDetallePagoCheque(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionDetallePagoChequeActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagochequeLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingDetallePagoCheque(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetallePagoCheque(false);
			
			//SI ES MANUAL
			if(DetallePagoChequeJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDetallePagoCheque();
			}
			
			//this.abrirFrameTreeDetallePagoCheque();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagochequeLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagochequeLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagochequeLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionDetallePagoChequeActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Detalle Pago ChequeS ?", "MANTENIMIENTO DE Detalle Pago Cheque", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionDetallePagoCheque.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralDetallePagoCheque();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.detallepagochequeReturnGeneral=detallepagochequeLogic.procesarImportacionDetallePagoChequesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.detallepagochequeParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarDetallePagoChequeReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionDetallePagoChequeActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionDetallePagoCheque.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionDetallePagoCheque.setFileImportacion(this.jInternalFrameImportacionDetallePagoCheque.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionDetallePagoCheque.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionDetallePagoCheque.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionDetallePagoCheque.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionDetallePagoCheque.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoDetallePagoChequeActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<DetallePagoCheque> detallepagochequesSeleccionados=new ArrayList<DetallePagoCheque>();		

		detallepagochequesSeleccionados=this.getDetallePagoChequesSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetallePagoCheque.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetallePagoCheque.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("DetallePagoChequeBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"DetallePagoChequeBaseDesign.jrxml";
			
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
			
			this.generarReporteDetallePagoCheques("Todos",detallepagochequesSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallepagochequeSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Pago Cheque",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoDetallePagoCheque.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetallePagoCheque.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DetallePagoChequeConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetallePagoChequeConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetallePagoChequeConstantesFunciones.LABEL_IDASIENTOCONTABLE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_AsientoContable_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_AsientoContable_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_AsientoContable_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_AsientoContable_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetallePagoChequeConstantesFunciones.LABEL_IDEJERCICIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Ejercicio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Ejercicio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Ejercicio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Ejercicio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetallePagoChequeConstantesFunciones.LABEL_IDPERIODO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Periodo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Periodo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Periodo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Periodo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetallePagoChequeConstantesFunciones.LABEL_VALOR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetallePagoChequeConstantesFunciones.LABEL_IDANIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Anio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Anio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Anio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Anio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetallePagoChequeConstantesFunciones.LABEL_IDMES:
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
		
		if(this.jInternalFrameReporteDinamicoDetallePagoCheque.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoDetallePagoCheque.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoDetallePagoCheque.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case DetallePagoChequeConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case DetallePagoChequeConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case DetallePagoChequeConstantesFunciones.LABEL_IDASIENTOCONTABLE:
					sNombreCampoCategoria="id_asiento_contable";
					break;

				case DetallePagoChequeConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoria="id_ejercicio";
					break;

				case DetallePagoChequeConstantesFunciones.LABEL_IDPERIODO:
					sNombreCampoCategoria="id_periodo";
					break;

				case DetallePagoChequeConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoria="valor";
					break;

				case DetallePagoChequeConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoria="id_anio";
					break;

				case DetallePagoChequeConstantesFunciones.LABEL_IDMES:
					sNombreCampoCategoria="id_mes";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoDetallePagoCheque.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case DetallePagoChequeConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case DetallePagoChequeConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case DetallePagoChequeConstantesFunciones.LABEL_IDASIENTOCONTABLE:
					sNombreCampoCategoriaValor="id_asiento_contable";
					break;

				case DetallePagoChequeConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoriaValor="id_ejercicio";
					break;

				case DetallePagoChequeConstantesFunciones.LABEL_IDPERIODO:
					sNombreCampoCategoriaValor="id_periodo";
					break;

				case DetallePagoChequeConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoriaValor="valor";
					break;

				case DetallePagoChequeConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoriaValor="id_anio";
					break;

				case DetallePagoChequeConstantesFunciones.LABEL_IDMES:
					sNombreCampoCategoriaValor="id_mes";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoDetallePagoCheque.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetallePagoCheque.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DetallePagoChequeConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case DetallePagoChequeConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case DetallePagoChequeConstantesFunciones.LABEL_IDASIENTOCONTABLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Asiento Contable",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_asiento_contable");
					break;

				case DetallePagoChequeConstantesFunciones.LABEL_IDEJERCICIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ejercicio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_ejercicio");
					break;

				case DetallePagoChequeConstantesFunciones.LABEL_IDPERIODO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Periodo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_periodo");
					break;

				case DetallePagoChequeConstantesFunciones.LABEL_VALOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor");
					break;

				case DetallePagoChequeConstantesFunciones.LABEL_IDANIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Anio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_anio");
					break;

				case DetallePagoChequeConstantesFunciones.LABEL_IDMES:
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
	
	public void jButtonGenerarExcelReporteDinamicoDetallePagoChequeActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<DetallePagoCheque> detallepagochequesSeleccionados=new ArrayList<DetallePagoCheque>();		
		
		detallepagochequesSeleccionados=this.getDetallePagoChequesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallepagocheque";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("DetallePagoCheques");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoDetallePagoCheque.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoDetallePagoCheque.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case DetallePagoChequeConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetallePagoChequeConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(DetallePagoCheque detallepagocheque:detallepagochequesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallepagocheque.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetallePagoChequeConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetallePagoChequeConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(DetallePagoCheque detallepagocheque:detallepagochequesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallepagocheque.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetallePagoChequeConstantesFunciones.LABEL_IDASIENTOCONTABLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetallePagoChequeConstantesFunciones.LABEL_IDASIENTOCONTABLE);
					iRow++;

					for(DetallePagoCheque detallepagocheque:detallepagochequesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallepagocheque.getasientocontable_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetallePagoChequeConstantesFunciones.LABEL_IDEJERCICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetallePagoChequeConstantesFunciones.LABEL_IDEJERCICIO);
					iRow++;

					for(DetallePagoCheque detallepagocheque:detallepagochequesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallepagocheque.getejercicio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetallePagoChequeConstantesFunciones.LABEL_IDPERIODO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetallePagoChequeConstantesFunciones.LABEL_IDPERIODO);
					iRow++;

					for(DetallePagoCheque detallepagocheque:detallepagochequesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallepagocheque.getperiodo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetallePagoChequeConstantesFunciones.LABEL_VALOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetallePagoChequeConstantesFunciones.LABEL_VALOR);
					iRow++;

					for(DetallePagoCheque detallepagocheque:detallepagochequesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallepagocheque.getvalor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetallePagoChequeConstantesFunciones.LABEL_IDANIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetallePagoChequeConstantesFunciones.LABEL_IDANIO);
					iRow++;

					for(DetallePagoCheque detallepagocheque:detallepagochequesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallepagocheque.getanio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetallePagoChequeConstantesFunciones.LABEL_IDMES:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetallePagoChequeConstantesFunciones.LABEL_IDMES);
					iRow++;

					for(DetallePagoCheque detallepagocheque:detallepagochequesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallepagocheque.getmes_descripcion());
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
			//	this.getFilaCabeceraExportarExcelDetallePagoCheque(row);				
			//	iRow++;
			//}				
			
			//for(DetallePagoCheque detallepagochequeAux:detallepagochequesSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelDetallePagoCheque(detallepagochequeAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallepagochequeSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Pago Cheque",JOptionPane.INFORMATION_MESSAGE);
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
				this.detallepagochequeLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetallePagoCheque(false);
			
			//SI ES MANUAL
			if(DetallePagoChequeJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDetallePagoCheque();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagochequeLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagochequeLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagochequeLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresDetallePagoChequeActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagochequeLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetallePagoCheque(false);
			
			//SI ES MANUAL
			if(DetallePagoChequeJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDetallePagoCheque();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagochequeLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagochequeLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagochequeLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesDetallePagoChequeActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagochequeLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetallePagoCheque(false);
			
			//SI ES MANUAL
			if(DetallePagoChequeJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDetallePagoCheque();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagochequeLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagochequeLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagochequeLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaDetallePagoCheque() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosDetallePagoCheque.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosDetallePagoCheque.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosDetallePagoCheque.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosDetallePagoCheque.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosDetallePagoCheque.setMinimumSize(dimensionMinimum);
		this.jTableDatosDetallePagoCheque.setMaximumSize(dimensionMaximum);
		this.jTableDatosDetallePagoCheque.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingDetallePagoCheque(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingDetallePagoCheque(esInicializar,true);
	}
	
	public void inicializarActualizarBindingDetallePagoCheque(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaDetallePagoCheque(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesDetallePagoCheque(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.detallepagochequeSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasDetallePagoCheque(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDetallePagoCheque(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesDetallePagoCheque(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !DetallePagoChequeJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!DetallePagoChequeJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualDetallePagoCheque() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaDetallePagoCheque();
		
		this.inicializarActualizarBindingBotonesManualDetallePagoCheque(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.detallepagochequeSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualDetallePagoCheque();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDetallePagoCheque() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualDetallePagoCheque(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualDetallePagoCheque(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosDetallePagoCheque.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosDetallePagoCheque.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteDetallePagoCheque.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormDetallePagoCheque!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormDetallePagoCheque.jCheckBoxPostAccionNuevoDetallePagoCheque.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormDetallePagoCheque.jCheckBoxPostAccionSinCerrarDetallePagoCheque.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormDetallePagoCheque.jCheckBoxPostAccionSinMensajeDetallePagoCheque.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosDetallePagoCheque.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosDetallePagoCheque.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteDetallePagoCheque.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormDetallePagoCheque!=null) {
				this.jInternalFrameDetalleFormDetallePagoCheque.jCheckBoxPostAccionNuevoDetallePagoCheque.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormDetallePagoCheque.jCheckBoxPostAccionSinCerrarDetallePagoCheque.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormDetallePagoCheque.jCheckBoxPostAccionSinMensajeDetallePagoCheque.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionDetallePagoCheque.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionDetallePagoCheque.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormDetallePagoCheque!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxTiposAccionesFormularioDetallePagoCheque.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesDetallePagoCheque.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoDetallePagoCheque!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetallePagoCheque.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesDetallePagoCheque.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesDetallePagoCheque.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarDetallePagoCheque.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesDetallePagoCheque.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoDetallePagoCheque!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetallePagoCheque.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesDetallePagoCheque.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralDetallePagoCheque.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesDetallePagoCheque(Boolean esInicializar) throws Exception {
		try	{	
			if(DetallePagoChequeJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualDetallePagoCheque(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesDetallePagoCheque() throws Exception {
		try	{
			if(DetallePagoChequeJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualDetallePagoCheque();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDetallePagoCheque() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxTiposAccionesFormularioDetallePagoCheque.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxTiposAccionesFormularioDetallePagoCheque.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualDetallePagoCheque() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesDetallePagoCheque.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesDetallePagoCheque.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesDetallePagoCheque.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesDetallePagoCheque.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesDetallePagoCheque.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesDetallePagoCheque.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionDetallePagoCheque.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionDetallePagoCheque.addItem(reporte);
			}
			
			
			if(!this.detallepagochequeSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionDetallePagoCheque.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionDetallePagoCheque.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesDetallePagoCheque.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesDetallePagoCheque.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesDetallePagoCheque.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesDetallePagoCheque.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormDetallePagoCheque!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxTiposAccionesFormularioDetallePagoCheque.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxTiposAccionesFormularioDetallePagoCheque.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarDetallePagoCheque.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarDetallePagoCheque.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarDetallePagoCheque.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDetallePagoCheque();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDetallePagoCheque() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDetallePagoCheque!=null) {
				this.jInternalFrameReporteDinamicoDetallePagoCheque.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoDetallePagoCheque.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDetallePagoCheque!=null) {
				this.jInternalFrameReporteDinamicoDetallePagoCheque.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoDetallePagoCheque.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoDetallePagoCheque!=null) {
				
				if(this.jInternalFrameReporteDinamicoDetallePagoCheque.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDetallePagoCheque.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDetallePagoCheque.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoDetallePagoCheque.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDetallePagoCheque.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDetallePagoCheque.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoDetallePagoCheque.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoDetallePagoCheque.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=DetallePagoChequeConstantesFunciones.getTiposSeleccionarDetallePagoCheque(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoDetallePagoCheque.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoDetallePagoCheque.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoDetallePagoCheque.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=DetallePagoChequeConstantesFunciones.getTiposSeleccionarDetallePagoCheque(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoDetallePagoCheque.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoDetallePagoCheque.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoDetallePagoCheque.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=DetallePagoChequeConstantesFunciones.getTiposSeleccionarDetallePagoCheque(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDetallePagoCheque.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoDetallePagoCheque.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoDetallePagoCheque.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoDetallePagoCheque.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualDetallePagoCheque()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_asiento_contableFK_IdAsientoContableDetallePagoCheque.getSelectedItem()!=null){this.id_asiento_contableFK_IdAsientoContable=((AsientoContable)this.jComboBoxid_asiento_contableFK_IdAsientoContableDetallePagoCheque.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasDetallePagoCheque(Boolean esInicializar) throws Exception {				
		if(DetallePagoChequeJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualDetallePagoCheque();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaDetallePagoCheque() throws Exception {
		this.inicializarActualizarBindingTablaDetallePagoCheque(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByDetallePagoCheque() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByDetallePagoCheque.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByDetallePagoCheque.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDetallePagoCheque.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new DetallePagoChequePropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByDetallePagoCheque.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDetallePagoCheque.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new DetallePagoChequePropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosDetallePagoChequeOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePagoChequeOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new DetallePagoChequePropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByDetallePagoCheque.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDetallePagoCheque.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new DetallePagoChequePropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByDetallePagoCheque.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaDetallePagoCheque(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=detallepagochequeLogic.getDetallePagoCheques().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=detallepagocheques.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(DetallePagoChequeJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosDetallePagoCheque.setModel(new DetallePagoChequeModel(this.detallepagochequeLogic.getDetallePagoCheques(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosDetallePagoCheque.setModel(new DetallePagoChequeModel(this.detallepagocheques,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByDetallePagoCheque!=null && this.jInternalFrameOrderByDetallePagoCheque.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByDetallePagoCheque();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosDetallePagoCheque.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePagoCheque,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new DetallePagoChequePropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+DetallePagoChequeConstantesFunciones.SCLASSWEBTITULO,detallepagochequeConstantesFunciones.resaltarSeleccionarDetallePagoCheque,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+DetallePagoChequeConstantesFunciones.SCLASSWEBTITULO,detallepagochequeConstantesFunciones.resaltarSeleccionarDetallePagoCheque,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosDetallePagoCheque.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePagoCheque,DetallePagoChequeConstantesFunciones.LABEL_ID));

		if(this.detallepagochequeConstantesFunciones.mostraridDetallePagoCheque && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetallePagoChequeConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detallepagochequeConstantesFunciones.resaltaridDetallePagoCheque,this.detallepagochequeConstantesFunciones.activaridDetallePagoCheque,iSizeTabla,this,true,"idDetallePagoCheque","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detallepagochequeConstantesFunciones.resaltaridDetallePagoCheque,this.detallepagochequeConstantesFunciones.activaridDetallePagoCheque,this,true,"idDetallePagoCheque","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetallePagoCheque.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePagoCheque,DetallePagoChequeConstantesFunciones.LABEL_IDEMPRESA));

		if(this.detallepagochequeConstantesFunciones.mostrarid_empresaDetallePagoCheque && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetallePagoChequeConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.detallepagochequeConstantesFunciones.resaltarid_empresaDetallePagoCheque,this,this.detallepagochequeConstantesFunciones.activarid_empresaDetallePagoCheque,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.detallepagochequeConstantesFunciones.resaltarid_empresaDetallePagoCheque,this,this.detallepagochequeConstantesFunciones.activarid_empresaDetallePagoCheque,false,"id_empresaDetallePagoCheque","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetallePagoChequePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetallePagoCheque.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePagoCheque,DetallePagoChequeConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.detallepagochequeConstantesFunciones.mostrarid_sucursalDetallePagoCheque && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetallePagoChequeConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.detallepagochequeConstantesFunciones.resaltarid_sucursalDetallePagoCheque,this,this.detallepagochequeConstantesFunciones.activarid_sucursalDetallePagoCheque,iSizeTabla));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.detallepagochequeConstantesFunciones.resaltarid_sucursalDetallePagoCheque,this,this.detallepagochequeConstantesFunciones.activarid_sucursalDetallePagoCheque,false,"id_sucursalDetallePagoCheque","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetallePagoChequePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetallePagoCheque.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePagoCheque,DetallePagoChequeConstantesFunciones.LABEL_IDASIENTOCONTABLE));

		if(this.detallepagochequeConstantesFunciones.mostrarid_asiento_contableDetallePagoCheque && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetallePagoChequeConstantesFunciones.LABEL_IDASIENTOCONTABLE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new AsientoContableTableCell(this.asientocontablesForeignKey,this.detallepagochequeConstantesFunciones.resaltarid_asiento_contableDetallePagoCheque,this,this.detallepagochequeConstantesFunciones.activarid_asiento_contableDetallePagoCheque,iSizeTabla));
			tableColumn.setCellEditor(new AsientoContableTableCell(this.asientocontablesForeignKey,this.detallepagochequeConstantesFunciones.resaltarid_asiento_contableDetallePagoCheque,this,this.detallepagochequeConstantesFunciones.activarid_asiento_contableDetallePagoCheque,true,"id_asiento_contableDetallePagoCheque","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetallePagoChequePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetallePagoCheque.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePagoCheque,DetallePagoChequeConstantesFunciones.LABEL_IDEJERCICIO));

		if(this.detallepagochequeConstantesFunciones.mostrarid_ejercicioDetallePagoCheque && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetallePagoChequeConstantesFunciones.LABEL_IDEJERCICIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EjercicioTableCell(this.ejerciciosForeignKey,this.detallepagochequeConstantesFunciones.resaltarid_ejercicioDetallePagoCheque,this,this.detallepagochequeConstantesFunciones.activarid_ejercicioDetallePagoCheque,iSizeTabla));
			tableColumn.setCellEditor(new EjercicioTableCell(this.ejerciciosForeignKey,this.detallepagochequeConstantesFunciones.resaltarid_ejercicioDetallePagoCheque,this,this.detallepagochequeConstantesFunciones.activarid_ejercicioDetallePagoCheque,false,"id_ejercicioDetallePagoCheque","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetallePagoChequePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetallePagoCheque.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePagoCheque,DetallePagoChequeConstantesFunciones.LABEL_IDPERIODO));

		if(this.detallepagochequeConstantesFunciones.mostrarid_periodoDetallePagoCheque && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetallePagoChequeConstantesFunciones.LABEL_IDPERIODO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new PeriodoTableCell(this.periodosForeignKey,this.detallepagochequeConstantesFunciones.resaltarid_periodoDetallePagoCheque,this,this.detallepagochequeConstantesFunciones.activarid_periodoDetallePagoCheque,iSizeTabla));
			tableColumn.setCellEditor(new PeriodoTableCell(this.periodosForeignKey,this.detallepagochequeConstantesFunciones.resaltarid_periodoDetallePagoCheque,this,this.detallepagochequeConstantesFunciones.activarid_periodoDetallePagoCheque,false,"id_periodoDetallePagoCheque","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetallePagoChequePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetallePagoCheque.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePagoCheque,DetallePagoChequeConstantesFunciones.LABEL_VALOR));

		if(this.detallepagochequeConstantesFunciones.mostrarvalorDetallePagoCheque && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetallePagoChequeConstantesFunciones.LABEL_VALOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detallepagochequeConstantesFunciones.resaltarvalorDetallePagoCheque,this.detallepagochequeConstantesFunciones.activarvalorDetallePagoCheque,iSizeTabla,this,true,"valorDetallePagoCheque","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detallepagochequeConstantesFunciones.resaltarvalorDetallePagoCheque,this.detallepagochequeConstantesFunciones.activarvalorDetallePagoCheque,this,true,"valorDetallePagoCheque","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetallePagoChequePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetallePagoCheque.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePagoCheque,DetallePagoChequeConstantesFunciones.LABEL_IDANIO));

		if(this.detallepagochequeConstantesFunciones.mostrarid_anioDetallePagoCheque && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetallePagoChequeConstantesFunciones.LABEL_IDANIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new AnioTableCell(this.aniosForeignKey,this.detallepagochequeConstantesFunciones.resaltarid_anioDetallePagoCheque,this,this.detallepagochequeConstantesFunciones.activarid_anioDetallePagoCheque,iSizeTabla));
			tableColumn.setCellEditor(new AnioTableCell(this.aniosForeignKey,this.detallepagochequeConstantesFunciones.resaltarid_anioDetallePagoCheque,this,this.detallepagochequeConstantesFunciones.activarid_anioDetallePagoCheque,true,"id_anioDetallePagoCheque","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetallePagoChequePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetallePagoCheque.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePagoCheque,DetallePagoChequeConstantesFunciones.LABEL_IDMES));

		if(this.detallepagochequeConstantesFunciones.mostrarid_mesDetallePagoCheque && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetallePagoChequeConstantesFunciones.LABEL_IDMES,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new MesTableCell(this.messForeignKey,this.detallepagochequeConstantesFunciones.resaltarid_mesDetallePagoCheque,this,this.detallepagochequeConstantesFunciones.activarid_mesDetallePagoCheque,iSizeTabla));
			tableColumn.setCellEditor(new MesTableCell(this.messForeignKey,this.detallepagochequeConstantesFunciones.resaltarid_mesDetallePagoCheque,this,this.detallepagochequeConstantesFunciones.activarid_mesDetallePagoCheque,true,"id_mesDetallePagoCheque","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetallePagoChequePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.detallepagochequeSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.detallepagochequeSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.detallepagochequeSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDetallePagoCheque.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.detallepagochequeSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.detallepagochequeSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDetallePagoCheque.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarDetallePagoCheque && this.isPermisoGuardarCambiosDetallePagoCheque) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.detallepagochequeSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.detallepagochequeSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosDetallePagoCheque.addColumn(tableColumn);
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
			
			this.jTableDatosDetallePagoCheque.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDetallePagoCheque && this.isPermisoGuardarCambiosDetallePagoCheque) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDetallePagoCheque && this.isPermisoGuardarCambiosDetallePagoCheque) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosDetallePagoCheque.moveColumn(this.jTableDatosDetallePagoCheque.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosDetallePagoCheque.moveColumn(this.jTableDatosDetallePagoCheque.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosDetallePagoCheque.moveColumn(this.jTableDatosDetallePagoCheque.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosDetallePagoCheque.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosDetallePagoCheque.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosDetallePagoCheque,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!DetallePagoChequeJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosDetallePagoCheque.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosDetallePagoCheque.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!DetallePagoChequeJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!DetallePagoChequeJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosDetallePagoCheque.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosDetallePagoCheque.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosDetallePagoCheque.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=detallepagochequeLogic.getDetallePagoCheques().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=detallepagocheques.size()-1;
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
		//this.jTableDatosDetallePagoCheque.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosDetallePagoCheque.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosDetallePagoCheque();
			
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
				
				//this.isEsNuevoDetallePagoCheque=false;
					
				DetallePagoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.detallepagocheque,new Object(),this.detallepagochequeParameterGeneral,this.detallepagochequeReturnGeneral);
			
				if(this.detallepagochequeSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormDetallePagoCheque==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDetallePagoCheque.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDetallePagoCheque.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagocheque =(DetallePagoCheque) this.detallepagochequeLogic.getDetallePagoCheques().toArray()[this.jTableDatosDetallePagoCheque.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallepagocheque =(DetallePagoCheque) this.detallepagocheques.toArray()[this.jTableDatosDetallePagoCheque.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.detallepagocheque.getsType().equals("DUPLICADO")
				   || this.detallepagocheque.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoDetallePagoCheque=true;
				
				} else {
					this.isEsNuevoDetallePagoCheque=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.detallepagochequeSessionBean.getEsGuardarRelacionado()) {
					if(this.detallepagocheque.getId()>=0 && !this.detallepagocheque.getIsNew()) {						
						this.isEsNuevoDetallePagoCheque=false;
						
					} else {
						this.isEsNuevoDetallePagoCheque=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoDetallePagoCheque(esRelaciones);						
				
				this.seleccionarDetallePagoCheque(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.detallepagocheque.getId()<0) {
					this.isEsNuevoDetallePagoCheque=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarDetallePagoCheque(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarDetallePagoCheque(evt,rowIndex);
				}	
				
				if(this.detallepagochequeSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion DetallePagoCheque: " + this.dDif); 
					}
				}								
				
				DetallePagoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.detallepagocheque,new Object(),this.detallepagochequeParameterGeneral,this.detallepagochequeReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarDetallePagoCheque(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.detallepagocheque)) {
					if(this.detallepagocheque.getId()>0) {
						this.detallepagocheque.setIsDeleted(true);
						
						this.detallepagochequesEliminados.add(this.detallepagocheque);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.detallepagochequeLogic.getDetallePagoCheques().remove(this.detallepagocheque);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.detallepagocheques.remove(this.detallepagocheque);				
					}
					
					
					((DetallePagoChequeModel) this.jTableDatosDetallePagoCheque.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaDetallePagoCheque(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarDetallePagoCheque(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoDetallePagoCheque) {
			
			if(this.jInternalFrameDetalleFormDetallePagoCheque==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDetallePagoCheque.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDetallePagoCheque.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagocheque =(DetallePagoCheque) this.detallepagochequeLogic.getDetallePagoCheques().toArray()[this.jTableDatosDetallePagoCheque.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallepagocheque =(DetallePagoCheque) this.detallepagocheques.toArray()[this.jTableDatosDetallePagoCheque.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(DetallePagoChequeJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioDetallePagoCheque(this.detallepagocheque);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.detallepagochequeConstantesFunciones.cargarid_empresaDetallePagoCheque || this.detallepagochequeConstantesFunciones.event_dependid_empresaDetallePagoCheque) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.detallepagocheque.getid_empresa());
									//this.inicializarActualizarBindingDetallePagoCheque(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(detallepagocheque.getEmpresa()!=null) {
							this.empresasForeignKey.add(detallepagocheque.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.detallepagocheque.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.detallepagochequeConstantesFunciones.cargarid_sucursalDetallePagoCheque || this.detallepagochequeConstantesFunciones.event_dependid_sucursalDetallePagoCheque) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.detallepagocheque.getid_sucursal());
									//this.inicializarActualizarBindingDetallePagoCheque(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(detallepagocheque.getSucursal()!=null) {
							this.sucursalsForeignKey.add(detallepagocheque.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.detallepagocheque.getid_sucursal(),false,"Formulario");

					//AsientoContable
					if(!this.detallepagochequeConstantesFunciones.cargarid_asiento_contableDetallePagoCheque || this.detallepagochequeConstantesFunciones.event_dependid_asiento_contableDetallePagoCheque) {
						//this.cargarCombosAsientoContablesForeignKeyLista(" where id="+this.detallepagocheque.getid_asiento_contable());
									//this.inicializarActualizarBindingDetallePagoCheque(false,false);
						this.asientocontablesForeignKey=new ArrayList<AsientoContable>();

						if(detallepagocheque.getAsientoContable()!=null) {
							this.asientocontablesForeignKey.add(detallepagocheque.getAsientoContable());
						}

						this.addItemDefectoCombosForeignKeyAsientoContable();
						this.cargarCombosFrameAsientoContablesForeignKey("Todos");
					}
					this.setActualAsientoContableForeignKey(this.detallepagocheque.getid_asiento_contable(),false,"Formulario");

					//Ejercicio
					if(!this.detallepagochequeConstantesFunciones.cargarid_ejercicioDetallePagoCheque || this.detallepagochequeConstantesFunciones.event_dependid_ejercicioDetallePagoCheque) {
						//this.cargarCombosEjerciciosForeignKeyLista(" where id="+this.detallepagocheque.getid_ejercicio());
									//this.inicializarActualizarBindingDetallePagoCheque(false,false);
						this.ejerciciosForeignKey=new ArrayList<Ejercicio>();

						if(detallepagocheque.getEjercicio()!=null) {
							this.ejerciciosForeignKey.add(detallepagocheque.getEjercicio());
						}

						this.addItemDefectoCombosForeignKeyEjercicio();
						this.cargarCombosFrameEjerciciosForeignKey("Todos");
					}
					this.setActualEjercicioForeignKey(this.detallepagocheque.getid_ejercicio(),false,"Formulario");

					//Periodo
					if(!this.detallepagochequeConstantesFunciones.cargarid_periodoDetallePagoCheque || this.detallepagochequeConstantesFunciones.event_dependid_periodoDetallePagoCheque) {
						//this.cargarCombosPeriodosForeignKeyLista(" where id="+this.detallepagocheque.getid_periodo());
									//this.inicializarActualizarBindingDetallePagoCheque(false,false);
						this.periodosForeignKey=new ArrayList<Periodo>();

						if(detallepagocheque.getPeriodo()!=null) {
							this.periodosForeignKey.add(detallepagocheque.getPeriodo());
						}

						this.addItemDefectoCombosForeignKeyPeriodo();
						this.cargarCombosFramePeriodosForeignKey("Todos");
					}
					this.setActualPeriodoForeignKey(this.detallepagocheque.getid_periodo(),false,"Formulario");

					//Anio
					if(!this.detallepagochequeConstantesFunciones.cargarid_anioDetallePagoCheque || this.detallepagochequeConstantesFunciones.event_dependid_anioDetallePagoCheque) {
						//this.cargarCombosAniosForeignKeyLista(" where id="+this.detallepagocheque.getid_anio());
									//this.inicializarActualizarBindingDetallePagoCheque(false,false);
						this.aniosForeignKey=new ArrayList<Anio>();

						if(detallepagocheque.getAnio()!=null) {
							this.aniosForeignKey.add(detallepagocheque.getAnio());
						}

						this.addItemDefectoCombosForeignKeyAnio();
						this.cargarCombosFrameAniosForeignKey("Todos");
					}
					this.setActualAnioForeignKey(this.detallepagocheque.getid_anio(),false,"Formulario");

					//Mes
					if(!this.detallepagochequeConstantesFunciones.cargarid_mesDetallePagoCheque || this.detallepagochequeConstantesFunciones.event_dependid_mesDetallePagoCheque) {
						//this.cargarCombosMessForeignKeyLista(" where id="+this.detallepagocheque.getid_mes());
									//this.inicializarActualizarBindingDetallePagoCheque(false,false);
						this.messForeignKey=new ArrayList<Mes>();

						if(detallepagocheque.getMes()!=null) {
							this.messForeignKey.add(detallepagocheque.getMes());
						}

						this.addItemDefectoCombosForeignKeyMes();
						this.cargarCombosFrameMessForeignKey("Todos");
					}
					this.setActualMesForeignKey(this.detallepagocheque.getid_mes(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesDetallePagoCheque("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesDetallePagoCheque(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDetallePagoCheque() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoDetallePagoCheque(DetallePagoCheque detallepagocheque) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoDetallePagoCheque(detallepagocheque,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoDetallePagoCheque(DetallePagoCheque detallepagocheque,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioDetallePagoCheque(detallepagocheque);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyDetallePagoCheque(detallepagocheque,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyDetallePagoCheque(detallepagocheque);
	}
	
	public void setVariablesObjetoActualToFormularioDetallePagoCheque(DetallePagoCheque detallepagocheque) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormDetallePagoCheque==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormDetallePagoCheque.jLabelidDetallePagoCheque.setText(detallepagocheque.getId().toString());
			this.jInternalFrameDetalleFormDetallePagoCheque.jTextFieldvalorDetallePagoCheque.setText(detallepagocheque.getvalor().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,DetallePagoCheque detallepagochequeLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,detallepagochequeLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,DetallePagoCheque detallepagochequeLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				detallepagochequeLocal=this.detallepagocheque;
			} else {
				detallepagochequeLocal=this.detallepagochequeAnterior;
			}
		}
		
		if(this.permiteMantenimiento(detallepagochequeLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoDetallePagoCheque(detallepagochequeLocal,true);
					
					if(detallepagochequeSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(detallepagochequeLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.detallepagochequeSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(detallepagochequeLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoDetallePagoCheque(DetallePagoCheque detallepagocheque,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDetallePagoCheque(detallepagocheque,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysDetallePagoCheque(detallepagocheque);
	}
	
	public void setVariablesFormularioToObjetoActualDetallePagoCheque(DetallePagoCheque detallepagocheque,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDetallePagoCheque(detallepagocheque,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualDetallePagoCheque(DetallePagoCheque detallepagocheque,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormDetallePagoCheque==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormDetallePagoCheque.jLabelidDetallePagoCheque.getText()==null || this.jInternalFrameDetalleFormDetallePagoCheque.jLabelidDetallePagoCheque.getText()=="" || this.jInternalFrameDetalleFormDetallePagoCheque.jLabelidDetallePagoCheque.getText()=="Id") {
				this.jInternalFrameDetalleFormDetallePagoCheque.jLabelidDetallePagoCheque.setText("0");
			}

			if(conColumnasBase) {detallepagocheque.setId(Long.parseLong(this.jInternalFrameDetalleFormDetallePagoCheque.jLabelidDetallePagoCheque.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetallePagoChequeConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePagoCheque.jLabelIdDetallePagoCheque,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detallepagocheque.setvalor(Double.parseDouble(this.jInternalFrameDetalleFormDetallePagoCheque.jTextFieldvalorDetallePagoCheque.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetallePagoChequeConstantesFunciones.LABEL_VALOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePagoCheque.jLabelvalorDetallePagoCheque,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDetallePagoCheque(DetallePagoCheque detallepagochequeBean,DetallePagoCheque detallepagocheque,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosDetallePagoCheque(DetallePagoCheque detallepagochequeOrigen,DetallePagoCheque detallepagocheque,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && detallepagochequeOrigen.getId()!=null && !detallepagochequeOrigen.getId().equals(0L))) {detallepagocheque.setId(detallepagochequeOrigen.getId());}}
			if(conDefault || (!conDefault && detallepagochequeOrigen.getvalor()!=null && !detallepagochequeOrigen.getvalor().equals(0.0))) {detallepagocheque.setvalor(detallepagochequeOrigen.getvalor());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDetallePagoCheque(DetallePagoCheque detallepagocheque) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDetallePagoCheque.jLabelidDetallePagoCheque.setText(detallepagocheque.getId().toString());
			this.jInternalFrameDetalleFormDetallePagoCheque.jTextFieldvalorDetallePagoCheque.setText(detallepagocheque.getvalor().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDetallePagoCheque(DetallePagoChequeBean detallepagochequeBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDetallePagoCheque.jLabelidDetallePagoCheque.setText(detallepagochequeBean.getId().toString());
			this.jInternalFrameDetalleFormDetallePagoCheque.jTextFieldvalorDetallePagoCheque.setText(detallepagochequeBean.getvalor().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanDetallePagoCheque(DetallePagoChequeParameterReturnGeneral detallepagochequeReturnGeneral,DetallePagoChequeBean detallepagochequeBean,Boolean conDefault) throws Exception { 
		try {
			DetallePagoCheque detallepagochequeLocal=new DetallePagoCheque();
			
			detallepagochequeLocal=detallepagochequeReturnGeneral.getDetallePagoCheque();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && detallepagochequeLocal.getId()!=null && !detallepagochequeLocal.getId().equals(0L))) {detallepagochequeBean.setId(detallepagochequeLocal.getId());}}
			if(conDefault || (!conDefault && detallepagochequeLocal.getvalor()!=null && !detallepagochequeLocal.getvalor().equals(0.0))) {detallepagochequeBean.setvalor(detallepagochequeLocal.getvalor());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxDetallePagoChequeGenerico(Long idDetallePagoChequeSeleccionado,JComboBox jComboBoxDetallePagoCheque,List<DetallePagoCheque> detallepagochequesLocal)throws Exception {
		try {
			DetallePagoCheque  detallepagochequeTemp=null;

			for(DetallePagoCheque detallepagochequeAux:detallepagochequesLocal) {
				if(detallepagochequeAux.getId()!=null && detallepagochequeAux.getId().equals(idDetallePagoChequeSeleccionado)) {
					detallepagochequeTemp=detallepagochequeAux;
					break;
				}
			}

			jComboBoxDetallePagoCheque.setSelectedItem(detallepagochequeTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxDetallePagoChequeGenerico(JComboBox jComboBoxDetallePagoCheque,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxDetallePagoCheque.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDetallePagoCheque.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxDetallePagoCheque.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDetallePagoCheque.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDetallePagoCheque.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxDetallePagoCheque.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDetallePagoCheque.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxDetallePagoCheque.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxDetallePagoCheque.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxDetallePagoCheque.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			detallepagocheque=(DetallePagoCheque) detallepagochequeLogic.getDetallePagoCheques().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			detallepagocheque =(DetallePagoCheque) detallepagocheques.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!detallepagocheque.getIsNew() && !detallepagocheque.getIsChanged() && !detallepagocheque.getIsDeleted()) {
				sDescripcion=detallepagocheque.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=detallepagocheque.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!detallepagocheque.getIsNew() && !detallepagocheque.getIsChanged() && !detallepagocheque.getIsDeleted()) {
				sDescripcion=detallepagocheque.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=detallepagocheque.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("AsientoContable")) {
			//sDescripcion=this.getActualAsientoContableForeignKeyDescripcion((Long)value);
			if(!detallepagocheque.getIsNew() && !detallepagocheque.getIsChanged() && !detallepagocheque.getIsDeleted()) {
				sDescripcion=detallepagocheque.getasientocontable_descripcion();
			} else {
				//sDescripcion=this.getActualAsientoContableForeignKeyDescripcion((Long)value);
				sDescripcion=detallepagocheque.getasientocontable_descripcion();
			}
		}

		if(sTipo.equals("Ejercicio")) {
			//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
			if(!detallepagocheque.getIsNew() && !detallepagocheque.getIsChanged() && !detallepagocheque.getIsDeleted()) {
				sDescripcion=detallepagocheque.getejercicio_descripcion();
			} else {
				//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
				sDescripcion=detallepagocheque.getejercicio_descripcion();
			}
		}

		if(sTipo.equals("Periodo")) {
			//sDescripcion=this.getActualPeriodoForeignKeyDescripcion((Long)value);
			if(!detallepagocheque.getIsNew() && !detallepagocheque.getIsChanged() && !detallepagocheque.getIsDeleted()) {
				sDescripcion=detallepagocheque.getperiodo_descripcion();
			} else {
				//sDescripcion=this.getActualPeriodoForeignKeyDescripcion((Long)value);
				sDescripcion=detallepagocheque.getperiodo_descripcion();
			}
		}

		if(sTipo.equals("Anio")) {
			//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
			if(!detallepagocheque.getIsNew() && !detallepagocheque.getIsChanged() && !detallepagocheque.getIsDeleted()) {
				sDescripcion=detallepagocheque.getanio_descripcion();
			} else {
				//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
				sDescripcion=detallepagocheque.getanio_descripcion();
			}
		}

		if(sTipo.equals("Mes")) {
			//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
			if(!detallepagocheque.getIsNew() && !detallepagocheque.getIsChanged() && !detallepagocheque.getIsDeleted()) {
				sDescripcion=detallepagocheque.getmes_descripcion();
			} else {
				//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
				sDescripcion=detallepagocheque.getmes_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		DetallePagoCheque detallepagochequeRow=new DetallePagoCheque();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			detallepagochequeRow=(DetallePagoCheque) detallepagochequeLogic.getDetallePagoCheques().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			detallepagochequeRow=(DetallePagoCheque) detallepagocheques.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualDetallePagoCheque(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoDetallePagoCheque.setVisible((this.isVisibilidadCeldaNuevoDetallePagoCheque && this.isPermisoNuevoDetallePagoCheque));			
			this.jButtonDuplicarDetallePagoCheque.setVisible((this.isVisibilidadCeldaDuplicarDetallePagoCheque && this.isPermisoDuplicarDetallePagoCheque));			
			this.jButtonCopiarDetallePagoCheque.setVisible((this.isVisibilidadCeldaCopiarDetallePagoCheque && this.isPermisoCopiarDetallePagoCheque));
			this.jButtonVerFormDetallePagoCheque.setVisible((this.isVisibilidadCeldaVerFormDetallePagoCheque && this.isPermisoVerFormDetallePagoCheque));
			
			this.jButtonAbrirOrderByDetallePagoCheque.setVisible((this.isVisibilidadCeldaOrdenDetallePagoCheque && this.isPermisoOrdenDetallePagoCheque));			
			
			this.jButtonNuevoRelacionesDetallePagoCheque.setVisible((this.isVisibilidadCeldaNuevoRelacionesDetallePagoCheque && this.isPermisoNuevoDetallePagoCheque));			
			this.jButtonNuevoGuardarCambiosDetallePagoCheque.setVisible((this.isVisibilidadCeldaNuevoDetallePagoCheque && this.isPermisoNuevoDetallePagoCheque && this.isPermisoGuardarCambiosDetallePagoCheque));
			
			if(this.jInternalFrameDetalleFormDetallePagoCheque!=null) {
			this.jInternalFrameDetalleFormDetallePagoCheque.jButtonModificarDetallePagoCheque.setVisible((this.isVisibilidadCeldaModificarDetallePagoCheque && this.isPermisoActualizarDetallePagoCheque));	
			this.jInternalFrameDetalleFormDetallePagoCheque.jButtonActualizarDetallePagoCheque.setVisible((this.isVisibilidadCeldaActualizarDetallePagoCheque && this.isPermisoActualizarDetallePagoCheque));	
			this.jInternalFrameDetalleFormDetallePagoCheque.jButtonEliminarDetallePagoCheque.setVisible((this.isVisibilidadCeldaEliminarDetallePagoCheque && this.isPermisoEliminarDetallePagoCheque));
			this.jInternalFrameDetalleFormDetallePagoCheque.jButtonCancelarDetallePagoCheque.setVisible(this.isVisibilidadCeldaCancelarDetallePagoCheque);							
			this.jInternalFrameDetalleFormDetallePagoCheque.jButtonGuardarCambiosDetallePagoCheque.setVisible((this.isVisibilidadCeldaGuardarDetallePagoCheque && this.isPermisoGuardarCambiosDetallePagoCheque));			
			
			}
						
			this.jButtonGuardarCambiosTablaDetallePagoCheque.setVisible((this.isVisibilidadCeldaGuardarCambiosDetallePagoCheque && this.isPermisoGuardarCambiosDetallePagoCheque));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarDetallePagoCheque.setVisible((this.isVisibilidadCeldaNuevoDetallePagoCheque && this.isPermisoNuevoDetallePagoCheque));						
			this.jButtonDuplicarToolBarDetallePagoCheque.setVisible((this.isVisibilidadCeldaDuplicarDetallePagoCheque && this.isPermisoDuplicarDetallePagoCheque));						
			this.jButtonCopiarToolBarDetallePagoCheque.setVisible((this.isVisibilidadCeldaCopiarDetallePagoCheque && this.isPermisoCopiarDetallePagoCheque));			
			this.jButtonVerFormToolBarDetallePagoCheque.setVisible((this.isVisibilidadCeldaVerFormDetallePagoCheque && this.isPermisoVerFormDetallePagoCheque));			
			this.jButtonAbrirOrderByToolBarDetallePagoCheque.setVisible((this.isVisibilidadCeldaOrdenDetallePagoCheque && this.isPermisoOrdenDetallePagoCheque));
			this.jButtonNuevoRelacionesToolBarDetallePagoCheque.setVisible((this.isVisibilidadCeldaNuevoRelacionesDetallePagoCheque && this.isPermisoNuevoDetallePagoCheque));			
			this.jButtonNuevoGuardarCambiosToolBarDetallePagoCheque.setVisible((this.isVisibilidadCeldaNuevoDetallePagoCheque && this.isPermisoNuevoDetallePagoCheque && this.isPermisoGuardarCambiosDetallePagoCheque));			
			
			if(this.jInternalFrameDetalleFormDetallePagoCheque!=null) {
			this.jInternalFrameDetalleFormDetallePagoCheque.jButtonModificarToolBarDetallePagoCheque.setVisible((this.isVisibilidadCeldaModificarDetallePagoCheque && this.isPermisoActualizarDetallePagoCheque));	
			this.jInternalFrameDetalleFormDetallePagoCheque.jButtonActualizarToolBarDetallePagoCheque.setVisible((this.isVisibilidadCeldaActualizarDetallePagoCheque  && this.isPermisoActualizarDetallePagoCheque));	
			this.jInternalFrameDetalleFormDetallePagoCheque.jButtonEliminarToolBarDetallePagoCheque.setVisible((this.isVisibilidadCeldaEliminarDetallePagoCheque && this.isPermisoEliminarDetallePagoCheque));
			this.jInternalFrameDetalleFormDetallePagoCheque.jButtonCancelarToolBarDetallePagoCheque.setVisible(this.isVisibilidadCeldaCancelarDetallePagoCheque);				
			this.jInternalFrameDetalleFormDetallePagoCheque.jButtonGuardarCambiosToolBarDetallePagoCheque.setVisible((this.isVisibilidadCeldaGuardarDetallePagoCheque && this.isPermisoGuardarCambiosDetallePagoCheque));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarDetallePagoCheque.setVisible((this.isVisibilidadCeldaGuardarCambiosDetallePagoCheque && this.isPermisoGuardarCambiosDetallePagoCheque));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoDetallePagoCheque.setVisible((this.isVisibilidadCeldaNuevoDetallePagoCheque && this.isPermisoNuevoDetallePagoCheque));			
			this.jMenuItemDuplicarDetallePagoCheque.setVisible((this.isVisibilidadCeldaDuplicarDetallePagoCheque && this.isPermisoDuplicarDetallePagoCheque));			
			this.jMenuItemCopiarDetallePagoCheque.setVisible((this.isVisibilidadCeldaCopiarDetallePagoCheque && this.isPermisoCopiarDetallePagoCheque));			
			this.jMenuItemVerFormDetallePagoCheque.setVisible((this.isVisibilidadCeldaVerFormDetallePagoCheque && this.isPermisoVerFormDetallePagoCheque));			
			this.jMenuItemAbrirOrderByDetallePagoCheque.setVisible((this.isVisibilidadCeldaOrdenDetallePagoCheque && this.isPermisoOrdenDetallePagoCheque));			
			//this.jMenuItemMostrarOcultarDetallePagoCheque.setVisible((this.isVisibilidadCeldaOrdenDetallePagoCheque && this.isPermisoOrdenDetallePagoCheque));
			this.jMenuItemDetalleAbrirOrderByDetallePagoCheque.setVisible((this.isVisibilidadCeldaOrdenDetallePagoCheque && this.isPermisoOrdenDetallePagoCheque));			
			//this.jMenuItemDetalleMostrarOcultarDetallePagoCheque.setVisible((this.isVisibilidadCeldaOrdenDetallePagoCheque && this.isPermisoOrdenDetallePagoCheque));			
			this.jMenuItemNuevoRelacionesDetallePagoCheque.setVisible((this.isVisibilidadCeldaNuevoRelacionesDetallePagoCheque && this.isPermisoNuevoDetallePagoCheque));			
			this.jMenuItemNuevoGuardarCambiosDetallePagoCheque.setVisible((this.isVisibilidadCeldaNuevoDetallePagoCheque && this.isPermisoNuevoDetallePagoCheque && this.isPermisoGuardarCambiosDetallePagoCheque));									
			
			if(this.jInternalFrameDetalleFormDetallePagoCheque!=null) {
			this.jInternalFrameDetalleFormDetallePagoCheque.jMenuItemModificarDetallePagoCheque.setVisible((this.isVisibilidadCeldaModificarDetallePagoCheque && this.isPermisoActualizarDetallePagoCheque));	
			this.jInternalFrameDetalleFormDetallePagoCheque.jMenuItemActualizarDetallePagoCheque.setVisible((this.isVisibilidadCeldaActualizarDetallePagoCheque && this.isPermisoActualizarDetallePagoCheque));	
			this.jInternalFrameDetalleFormDetallePagoCheque.jMenuItemEliminarDetallePagoCheque.setVisible((this.isVisibilidadCeldaEliminarDetallePagoCheque && this.isPermisoEliminarDetallePagoCheque));
			this.jInternalFrameDetalleFormDetallePagoCheque.jMenuItemCancelarDetallePagoCheque.setVisible(this.isVisibilidadCeldaCancelarDetallePagoCheque);				
			}
			
			this.jMenuItemGuardarCambiosDetallePagoCheque.setVisible((this.isVisibilidadCeldaGuardarDetallePagoCheque && this.isPermisoGuardarCambiosDetallePagoCheque));						
			this.jMenuItemGuardarCambiosTablaDetallePagoCheque.setVisible((this.isVisibilidadCeldaGuardarCambiosDetallePagoCheque && this.isPermisoGuardarCambiosDetallePagoCheque));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoDetallePagoCheque=this.jButtonNuevoDetallePagoCheque.isVisible();
			this.isVisibilidadCeldaDuplicarDetallePagoCheque=this.jButtonDuplicarDetallePagoCheque.isVisible();
			this.isVisibilidadCeldaCopiarDetallePagoCheque=this.jButtonCopiarDetallePagoCheque.isVisible();
			this.isVisibilidadCeldaVerFormDetallePagoCheque=this.jButtonVerFormDetallePagoCheque.isVisible();
			
			this.isVisibilidadCeldaOrdenDetallePagoCheque=this.jButtonAbrirOrderByDetallePagoCheque.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesDetallePagoCheque=this.jButtonNuevoRelacionesDetallePagoCheque.isVisible();
			this.isVisibilidadCeldaModificarDetallePagoCheque=this.jButtonModificarDetallePagoCheque.isVisible();
			
			if(this.jInternalFrameDetalleFormDetallePagoCheque!=null) {
			this.isVisibilidadCeldaActualizarDetallePagoCheque=this.jInternalFrameDetalleFormDetallePagoCheque.jButtonActualizarDetallePagoCheque.isVisible();
			this.isVisibilidadCeldaEliminarDetallePagoCheque=this.jInternalFrameDetalleFormDetallePagoCheque.jButtonEliminarDetallePagoCheque.isVisible();
			this.isVisibilidadCeldaCancelarDetallePagoCheque=this.jInternalFrameDetalleFormDetallePagoCheque.jButtonCancelarDetallePagoCheque.isVisible();
			this.isVisibilidadCeldaGuardarDetallePagoCheque=this.jInternalFrameDetalleFormDetallePagoCheque.jButtonGuardarCambiosDetallePagoCheque.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosDetallePagoCheque=this.jButtonGuardarCambiosTablaDetallePagoCheque.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoDetallePagoCheque=this.jButtonNuevoToolBarDetallePagoCheque.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDetallePagoCheque=this.jButtonNuevoRelacionesToolBarDetallePagoCheque.isVisible();
			
			if(this.jInternalFrameDetalleFormDetallePagoCheque!=null) {
			this.isVisibilidadCeldaModificarDetallePagoCheque=this.jInternalFrameDetalleFormDetallePagoCheque.jButtonModificarToolBarDetallePagoCheque.isVisible();
			this.isVisibilidadCeldaActualizarDetallePagoCheque=this.jInternalFrameDetalleFormDetallePagoCheque.jButtonActualizarToolBarDetallePagoCheque.isVisible();
			this.isVisibilidadCeldaEliminarDetallePagoCheque=this.jInternalFrameDetalleFormDetallePagoCheque.jButtonEliminarToolBarDetallePagoCheque.isVisible();
			this.isVisibilidadCeldaCancelarDetallePagoCheque=this.jInternalFrameDetalleFormDetallePagoCheque.jButtonCancelarToolBarDetallePagoCheque.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDetallePagoCheque=this.jButtonGuardarCambiosToolBarDetallePagoCheque.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDetallePagoCheque=this.jButtonGuardarCambiosTablaToolBarDetallePagoCheque.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoDetallePagoCheque=this.jMenuItemNuevoDetallePagoCheque.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDetallePagoCheque=this.jMenuItemNuevoRelacionesDetallePagoCheque.isVisible();
			
			if(this.jInternalFrameDetalleFormDetallePagoCheque!=null) {
			this.isVisibilidadCeldaModificarDetallePagoCheque=this.jInternalFrameDetalleFormDetallePagoCheque.jMenuItemModificarDetallePagoCheque.isVisible();
			this.isVisibilidadCeldaActualizarDetallePagoCheque=this.jInternalFrameDetalleFormDetallePagoCheque.jMenuItemActualizarDetallePagoCheque.isVisible();
			this.isVisibilidadCeldaEliminarDetallePagoCheque=this.jInternalFrameDetalleFormDetallePagoCheque.jMenuItemEliminarDetallePagoCheque.isVisible();
			this.isVisibilidadCeldaCancelarDetallePagoCheque=this.jInternalFrameDetalleFormDetallePagoCheque.jMenuItemCancelarDetallePagoCheque.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDetallePagoCheque=this.jMenuItemGuardarCambiosDetallePagoCheque.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDetallePagoCheque=this.jMenuItemGuardarCambiosTablaDetallePagoCheque.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesDetallePagoCheque(Boolean esInicializar) {
		if(DetallePagoChequeJInternalFrame.ISBINDING_MANUAL) {			
			if(this.detallepagochequeSessionBean.getConGuardarRelaciones()) {
				//if(this.detallepagochequeSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesDetallePagoCheque();
			}
			
			this.inicializarActualizarBindingBotonesManualDetallePagoCheque(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualDetallePagoCheque() {
		this.jButtonNuevoDetallePagoCheque.setVisible(this.isPermisoNuevoDetallePagoCheque);			
		this.jButtonDuplicarDetallePagoCheque.setVisible(this.isPermisoDuplicarDetallePagoCheque);			
		this.jButtonCopiarDetallePagoCheque.setVisible(this.isPermisoCopiarDetallePagoCheque);			
		this.jButtonVerFormDetallePagoCheque.setVisible(this.isPermisoVerFormDetallePagoCheque);			
		
		this.jButtonAbrirOrderByDetallePagoCheque.setVisible(this.isPermisoOrdenDetallePagoCheque);					
		
		this.jButtonNuevoRelacionesDetallePagoCheque.setVisible(this.isPermisoNuevoDetallePagoCheque);			
		
		if(this.jInternalFrameDetalleFormDetallePagoCheque!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetallePagoCheque.jButtonModificarDetallePagoCheque.setVisible(this.isPermisoActualizarDetallePagoCheque);	
			this.jInternalFrameDetalleFormDetallePagoCheque.jButtonActualizarDetallePagoCheque.setVisible(this.isPermisoActualizarDetallePagoCheque);	
			this.jInternalFrameDetalleFormDetallePagoCheque.jButtonEliminarDetallePagoCheque.setVisible(this.isPermisoEliminarDetallePagoCheque);
			this.jInternalFrameDetalleFormDetallePagoCheque.jButtonCancelarDetallePagoCheque.setVisible(this.isVisibilidadCeldaCancelarDetallePagoCheque);						
			this.jInternalFrameDetalleFormDetallePagoCheque.jButtonGuardarCambiosDetallePagoCheque.setVisible(this.isPermisoGuardarCambiosDetallePagoCheque);							
		}
		
		this.jButtonGuardarCambiosTablaDetallePagoCheque.setVisible(this.isPermisoActualizarDetallePagoCheque);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleDetallePagoCheque() {
		this.jInternalFrameDetalleFormDetallePagoCheque.jButtonModificarDetallePagoCheque.setVisible(this.isPermisoActualizarDetallePagoCheque);	
		this.jInternalFrameDetalleFormDetallePagoCheque.jButtonActualizarDetallePagoCheque.setVisible(this.isPermisoActualizarDetallePagoCheque);	
		this.jInternalFrameDetalleFormDetallePagoCheque.jButtonEliminarDetallePagoCheque.setVisible(this.isPermisoEliminarDetallePagoCheque);
		this.jInternalFrameDetalleFormDetallePagoCheque.jButtonCancelarDetallePagoCheque.setVisible(this.isVisibilidadCeldaCancelarDetallePagoCheque);							
		this.jInternalFrameDetalleFormDetallePagoCheque.jButtonGuardarCambiosDetallePagoCheque.setVisible((this.isVisibilidadCeldaGuardarDetallePagoCheque && this.isPermisoGuardarCambiosDetallePagoCheque));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosDetallePagoCheque() {
		if(DetallePagoChequeJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualDetallePagoCheque();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesDetallePagoCheque() {
	}
	
	public void jTableDatosDetallePagoChequeListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarDetallePagoCheque(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidDetallePagoChequeBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagochequeLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePagoCheque.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetallePagoCheque(this.getdetallepagocheque(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePagoCheque(this.detallepagocheque);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallepagocheque =(DetallePagoCheque) this.detallepagochequeLogic.getDetallePagoCheques().toArray()[this.jTableDatosDetallePagoCheque.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallepagocheque =(DetallePagoCheque) this.detallepagocheques.toArray()[this.jTableDatosDetallePagoCheque.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallepagocheque==null) {
						this.detallepagocheque = new DetallePagoCheque();
					}

					this.setVariablesFormularioToObjetoActualDetallePagoCheque(this.detallepagocheque,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePagoCheque(this.detallepagocheque);
				}

				if(this.detallepagocheque.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.detallepagocheque.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetallePagoCheque(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagochequeLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagochequeLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagochequeLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaDetallePagoChequeUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagochequeLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebDetallePagoCheque(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePagoCheque.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetallePagoCheque.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetallePagoCheque.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagocheque =(DetallePagoCheque) this.detallepagochequeLogic.getDetallePagoCheques().toArray()[this.jTableDatosDetallePagoCheque.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallepagocheque =(DetallePagoCheque) this.detallepagocheques.toArray()[this.jTableDatosDetallePagoCheque.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetallePagoCheque(this.getdetallepagocheque(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetallePagoCheque(this.detallepagocheque);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.detallepagochequeLogic.getConnexion());

				if(this.detallepagocheque.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.detallepagocheque.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetallePagoCheque=(TitledBorder)this.jScrollPanelDatosDetallePagoCheque.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderDetallePagoCheque.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagochequeLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagochequeLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagochequeLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaDetallePagoChequeBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagochequeLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePagoCheque.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetallePagoCheque(this.getdetallepagocheque(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePagoCheque(this.detallepagocheque);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallepagocheque =(DetallePagoCheque) this.detallepagochequeLogic.getDetallePagoCheques().toArray()[this.jTableDatosDetallePagoCheque.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallepagocheque =(DetallePagoCheque) this.detallepagocheques.toArray()[this.jTableDatosDetallePagoCheque.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallepagocheque==null) {
						this.detallepagocheque = new DetallePagoCheque();
					}

					this.setVariablesFormularioToObjetoActualDetallePagoCheque(this.detallepagocheque,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePagoCheque(this.detallepagocheque);
				}

				if(this.detallepagocheque.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.detallepagocheque.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetallePagoCheque(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagochequeLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagochequeLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagochequeLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalDetallePagoChequeUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagochequeLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebDetallePagoCheque(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePagoCheque.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetallePagoCheque.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetallePagoCheque.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagocheque =(DetallePagoCheque) this.detallepagochequeLogic.getDetallePagoCheques().toArray()[this.jTableDatosDetallePagoCheque.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallepagocheque =(DetallePagoCheque) this.detallepagocheques.toArray()[this.jTableDatosDetallePagoCheque.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetallePagoCheque(this.getdetallepagocheque(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetallePagoCheque(this.detallepagocheque);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.detallepagochequeLogic.getConnexion());

				if(this.detallepagocheque.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.detallepagocheque.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetallePagoCheque=(TitledBorder)this.jScrollPanelDatosDetallePagoCheque.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderDetallePagoCheque.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagochequeLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagochequeLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagochequeLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalDetallePagoChequeBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagochequeLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePagoCheque.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetallePagoCheque(this.getdetallepagocheque(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePagoCheque(this.detallepagocheque);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallepagocheque =(DetallePagoCheque) this.detallepagochequeLogic.getDetallePagoCheques().toArray()[this.jTableDatosDetallePagoCheque.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallepagocheque =(DetallePagoCheque) this.detallepagocheques.toArray()[this.jTableDatosDetallePagoCheque.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallepagocheque==null) {
						this.detallepagocheque = new DetallePagoCheque();
					}

					this.setVariablesFormularioToObjetoActualDetallePagoCheque(this.detallepagocheque,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePagoCheque(this.detallepagocheque);
				}

				if(this.detallepagocheque.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.detallepagocheque.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetallePagoCheque(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagochequeLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagochequeLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagochequeLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_asiento_contableDetallePagoChequeActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderDetallePagoCheque=null;
			TitledBorder titledBorderasientocontable=null;

			if(!this.jScrollPanelDatosDetallePagoCheque.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderDetallePagoCheque=(TitledBorder)this.jScrollPanelDatosDetallePagoCheque.getBorder();
				titledBorderasientocontable=(TitledBorder)this.asientocontableBeanSwingJInternalFrame.jScrollPanelDatosAsientoContable.getBorder();

				titledBorderasientocontable.setTitle(titledBorderDetallePagoCheque.getTitle() + " -> Asiento Contable");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_asiento_contableDetallePagoChequeUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagochequeLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoasientocontable=true;

			idTienePermisoasientocontable=this.tienePermisosUsuarioEnPaginaWebDetallePagoCheque(AsientoContableConstantesFunciones.CLASSNAME);

			if(idTienePermisoasientocontable) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePagoCheque.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetallePagoCheque.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetallePagoCheque.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagocheque =(DetallePagoCheque) this.detallepagochequeLogic.getDetallePagoCheques().toArray()[this.jTableDatosDetallePagoCheque.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallepagocheque =(DetallePagoCheque) this.detallepagocheques.toArray()[this.jTableDatosDetallePagoCheque.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetallePagoCheque(this.getdetallepagocheque(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetallePagoCheque(this.detallepagocheque);

				this.asientocontableBeanSwingJInternalFrame=new AsientoContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.asientocontableBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.asientocontableBeanSwingJInternalFrame.getAsientoContableLogic().setConnexion(this.detallepagochequeLogic.getConnexion());

				if(this.detallepagocheque.getid_asiento_contable()!=null) {
					this.asientocontableBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.asientocontableBeanSwingJInternalFrame.setIdActual(this.detallepagocheque.getid_asiento_contable());
					this.asientocontableBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.asientocontableBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.asientocontableBeanSwingJInternalFrame.inicializarActualizarBindingTablaAsientoContable();
				}

				JInternalFrameBase jinternalFrame =this.asientocontableBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetallePagoCheque=(TitledBorder)this.jScrollPanelDatosDetallePagoCheque.getBorder();
				TitledBorder titledBorderasientocontable=(TitledBorder)this.asientocontableBeanSwingJInternalFrame.jScrollPanelDatosAsientoContable.getBorder();

				titledBorderasientocontable.setTitle(titledBorderDetallePagoCheque.getTitle() + " -> Asiento Contable");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagochequeLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagochequeLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagochequeLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_asiento_contableDetallePagoChequeBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagochequeLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePagoCheque.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetallePagoCheque(this.getdetallepagocheque(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePagoCheque(this.detallepagocheque);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallepagocheque =(DetallePagoCheque) this.detallepagochequeLogic.getDetallePagoCheques().toArray()[this.jTableDatosDetallePagoCheque.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallepagocheque =(DetallePagoCheque) this.detallepagocheques.toArray()[this.jTableDatosDetallePagoCheque.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallepagocheque==null) {
						this.detallepagocheque = new DetallePagoCheque();
					}

					this.setVariablesFormularioToObjetoActualDetallePagoCheque(this.detallepagocheque,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePagoCheque(this.detallepagocheque);
				}

				if(this.detallepagocheque.getid_asiento_contable()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_asiento_contable = "+this.detallepagocheque.getid_asiento_contable().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetallePagoCheque(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagochequeLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagochequeLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagochequeLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ejercicioDetallePagoChequeUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagochequeLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoejercicio=true;

			idTienePermisoejercicio=this.tienePermisosUsuarioEnPaginaWebDetallePagoCheque(EjercicioConstantesFunciones.CLASSNAME);

			if(idTienePermisoejercicio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePagoCheque.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetallePagoCheque.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetallePagoCheque.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagocheque =(DetallePagoCheque) this.detallepagochequeLogic.getDetallePagoCheques().toArray()[this.jTableDatosDetallePagoCheque.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallepagocheque =(DetallePagoCheque) this.detallepagocheques.toArray()[this.jTableDatosDetallePagoCheque.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetallePagoCheque(this.getdetallepagocheque(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetallePagoCheque(this.detallepagocheque);

				this.ejercicioBeanSwingJInternalFrame=new EjercicioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ejercicioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ejercicioBeanSwingJInternalFrame.getEjercicioLogic().setConnexion(this.detallepagochequeLogic.getConnexion());

				if(this.detallepagocheque.getid_ejercicio()!=null) {
					this.ejercicioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ejercicioBeanSwingJInternalFrame.setIdActual(this.detallepagocheque.getid_ejercicio());
					this.ejercicioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.inicializarActualizarBindingTablaEjercicio();
				}

				JInternalFrameBase jinternalFrame =this.ejercicioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetallePagoCheque=(TitledBorder)this.jScrollPanelDatosDetallePagoCheque.getBorder();
				TitledBorder titledBorderejercicio=(TitledBorder)this.ejercicioBeanSwingJInternalFrame.jScrollPanelDatosEjercicio.getBorder();

				titledBorderejercicio.setTitle(titledBorderDetallePagoCheque.getTitle() + " -> Ejercicio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagochequeLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagochequeLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagochequeLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ejercicioDetallePagoChequeBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagochequeLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePagoCheque.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetallePagoCheque(this.getdetallepagocheque(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePagoCheque(this.detallepagocheque);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallepagocheque =(DetallePagoCheque) this.detallepagochequeLogic.getDetallePagoCheques().toArray()[this.jTableDatosDetallePagoCheque.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallepagocheque =(DetallePagoCheque) this.detallepagocheques.toArray()[this.jTableDatosDetallePagoCheque.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallepagocheque==null) {
						this.detallepagocheque = new DetallePagoCheque();
					}

					this.setVariablesFormularioToObjetoActualDetallePagoCheque(this.detallepagocheque,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePagoCheque(this.detallepagocheque);
				}

				if(this.detallepagocheque.getid_ejercicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ejercicio = "+this.detallepagocheque.getid_ejercicio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetallePagoCheque(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagochequeLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagochequeLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagochequeLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_periodoDetallePagoChequeUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagochequeLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoperiodo=true;

			idTienePermisoperiodo=this.tienePermisosUsuarioEnPaginaWebDetallePagoCheque(PeriodoConstantesFunciones.CLASSNAME);

			if(idTienePermisoperiodo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePagoCheque.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetallePagoCheque.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetallePagoCheque.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagocheque =(DetallePagoCheque) this.detallepagochequeLogic.getDetallePagoCheques().toArray()[this.jTableDatosDetallePagoCheque.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallepagocheque =(DetallePagoCheque) this.detallepagocheques.toArray()[this.jTableDatosDetallePagoCheque.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetallePagoCheque(this.getdetallepagocheque(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetallePagoCheque(this.detallepagocheque);

				this.periodoBeanSwingJInternalFrame=new PeriodoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.periodoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.periodoBeanSwingJInternalFrame.getPeriodoLogic().setConnexion(this.detallepagochequeLogic.getConnexion());

				if(this.detallepagocheque.getid_periodo()!=null) {
					this.periodoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.periodoBeanSwingJInternalFrame.setIdActual(this.detallepagocheque.getid_periodo());
					this.periodoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.inicializarActualizarBindingTablaPeriodo();
				}

				JInternalFrameBase jinternalFrame =this.periodoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetallePagoCheque=(TitledBorder)this.jScrollPanelDatosDetallePagoCheque.getBorder();
				TitledBorder titledBorderperiodo=(TitledBorder)this.periodoBeanSwingJInternalFrame.jScrollPanelDatosPeriodo.getBorder();

				titledBorderperiodo.setTitle(titledBorderDetallePagoCheque.getTitle() + " -> Periodo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagochequeLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagochequeLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagochequeLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_periodoDetallePagoChequeBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagochequeLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePagoCheque.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetallePagoCheque(this.getdetallepagocheque(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePagoCheque(this.detallepagocheque);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallepagocheque =(DetallePagoCheque) this.detallepagochequeLogic.getDetallePagoCheques().toArray()[this.jTableDatosDetallePagoCheque.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallepagocheque =(DetallePagoCheque) this.detallepagocheques.toArray()[this.jTableDatosDetallePagoCheque.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallepagocheque==null) {
						this.detallepagocheque = new DetallePagoCheque();
					}

					this.setVariablesFormularioToObjetoActualDetallePagoCheque(this.detallepagocheque,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePagoCheque(this.detallepagocheque);
				}

				if(this.detallepagocheque.getid_periodo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_periodo = "+this.detallepagocheque.getid_periodo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetallePagoCheque(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagochequeLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagochequeLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagochequeLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalorDetallePagoChequeBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagochequeLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePagoCheque.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetallePagoCheque(this.getdetallepagocheque(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePagoCheque(this.detallepagocheque);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallepagocheque =(DetallePagoCheque) this.detallepagochequeLogic.getDetallePagoCheques().toArray()[this.jTableDatosDetallePagoCheque.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallepagocheque =(DetallePagoCheque) this.detallepagocheques.toArray()[this.jTableDatosDetallePagoCheque.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallepagocheque==null) {
						this.detallepagocheque = new DetallePagoCheque();
					}

					this.setVariablesFormularioToObjetoActualDetallePagoCheque(this.detallepagocheque,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePagoCheque(this.detallepagocheque);
				}

				if(this.detallepagocheque.getvalor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor = "+this.detallepagocheque.getvalor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetallePagoCheque(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagochequeLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagochequeLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagochequeLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_anioDetallePagoChequeUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagochequeLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoanio=true;

			idTienePermisoanio=this.tienePermisosUsuarioEnPaginaWebDetallePagoCheque(AnioConstantesFunciones.CLASSNAME);

			if(idTienePermisoanio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePagoCheque.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetallePagoCheque.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetallePagoCheque.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagocheque =(DetallePagoCheque) this.detallepagochequeLogic.getDetallePagoCheques().toArray()[this.jTableDatosDetallePagoCheque.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallepagocheque =(DetallePagoCheque) this.detallepagocheques.toArray()[this.jTableDatosDetallePagoCheque.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetallePagoCheque(this.getdetallepagocheque(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetallePagoCheque(this.detallepagocheque);

				this.anioBeanSwingJInternalFrame=new AnioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.anioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.anioBeanSwingJInternalFrame.getAnioLogic().setConnexion(this.detallepagochequeLogic.getConnexion());

				if(this.detallepagocheque.getid_anio()!=null) {
					this.anioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.anioBeanSwingJInternalFrame.setIdActual(this.detallepagocheque.getid_anio());
					this.anioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.inicializarActualizarBindingTablaAnio();
				}

				JInternalFrameBase jinternalFrame =this.anioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetallePagoCheque=(TitledBorder)this.jScrollPanelDatosDetallePagoCheque.getBorder();
				TitledBorder titledBorderanio=(TitledBorder)this.anioBeanSwingJInternalFrame.jScrollPanelDatosAnio.getBorder();

				titledBorderanio.setTitle(titledBorderDetallePagoCheque.getTitle() + " -> Anio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagochequeLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagochequeLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagochequeLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_anioDetallePagoChequeBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagochequeLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePagoCheque.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetallePagoCheque(this.getdetallepagocheque(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePagoCheque(this.detallepagocheque);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallepagocheque =(DetallePagoCheque) this.detallepagochequeLogic.getDetallePagoCheques().toArray()[this.jTableDatosDetallePagoCheque.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallepagocheque =(DetallePagoCheque) this.detallepagocheques.toArray()[this.jTableDatosDetallePagoCheque.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallepagocheque==null) {
						this.detallepagocheque = new DetallePagoCheque();
					}

					this.setVariablesFormularioToObjetoActualDetallePagoCheque(this.detallepagocheque,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePagoCheque(this.detallepagocheque);
				}

				if(this.detallepagocheque.getid_anio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_anio = "+this.detallepagocheque.getid_anio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetallePagoCheque(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagochequeLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagochequeLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagochequeLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_mesDetallePagoChequeUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagochequeLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisomes=true;

			idTienePermisomes=this.tienePermisosUsuarioEnPaginaWebDetallePagoCheque(MesConstantesFunciones.CLASSNAME);

			if(idTienePermisomes) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePagoCheque.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetallePagoCheque.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetallePagoCheque.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagocheque =(DetallePagoCheque) this.detallepagochequeLogic.getDetallePagoCheques().toArray()[this.jTableDatosDetallePagoCheque.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallepagocheque =(DetallePagoCheque) this.detallepagocheques.toArray()[this.jTableDatosDetallePagoCheque.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetallePagoCheque(this.getdetallepagocheque(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetallePagoCheque(this.detallepagocheque);

				this.mesBeanSwingJInternalFrame=new MesBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.mesBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.mesBeanSwingJInternalFrame.getMesLogic().setConnexion(this.detallepagochequeLogic.getConnexion());

				if(this.detallepagocheque.getid_mes()!=null) {
					this.mesBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.mesBeanSwingJInternalFrame.setIdActual(this.detallepagocheque.getid_mes());
					this.mesBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.inicializarActualizarBindingTablaMes();
				}

				JInternalFrameBase jinternalFrame =this.mesBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetallePagoCheque=(TitledBorder)this.jScrollPanelDatosDetallePagoCheque.getBorder();
				TitledBorder titledBordermes=(TitledBorder)this.mesBeanSwingJInternalFrame.jScrollPanelDatosMes.getBorder();

				titledBordermes.setTitle(titledBorderDetallePagoCheque.getTitle() + " -> Mes");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagochequeLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagochequeLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagochequeLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_mesDetallePagoChequeBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagochequeLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePagoCheque.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetallePagoCheque(this.getdetallepagocheque(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePagoCheque(this.detallepagocheque);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallepagocheque =(DetallePagoCheque) this.detallepagochequeLogic.getDetallePagoCheques().toArray()[this.jTableDatosDetallePagoCheque.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallepagocheque =(DetallePagoCheque) this.detallepagocheques.toArray()[this.jTableDatosDetallePagoCheque.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallepagocheque==null) {
						this.detallepagocheque = new DetallePagoCheque();
					}

					this.setVariablesFormularioToObjetoActualDetallePagoCheque(this.detallepagocheque,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePagoCheque(this.detallepagocheque);
				}

				if(this.detallepagocheque.getid_mes()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_mes = "+this.detallepagocheque.getid_mes().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetallePagoCheque(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagochequeLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagochequeLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagochequeLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdAnioDetallePagoChequeActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagochequeLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetallePagoCheque(false,false);

			this.getDetallePagoChequesFK_IdAnio();

			this.inicializarActualizarBindingDetallePagoCheque(false);

			//if(DetallePagoChequeBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetallePagoCheque(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagochequeLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagochequeLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagochequeLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdAsientoContableDetallePagoChequeActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagochequeLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetallePagoCheque(false,false);

			this.getDetallePagoChequesFK_IdAsientoContable();

			this.inicializarActualizarBindingDetallePagoCheque(false);

			//if(DetallePagoChequeBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetallePagoCheque(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagochequeLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagochequeLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagochequeLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEjercicioDetallePagoChequeActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagochequeLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetallePagoCheque(false,false);

			this.getDetallePagoChequesFK_IdEjercicio();

			this.inicializarActualizarBindingDetallePagoCheque(false);

			//if(DetallePagoChequeBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetallePagoCheque(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagochequeLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagochequeLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagochequeLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaDetallePagoChequeActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagochequeLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetallePagoCheque(false,false);

			this.getDetallePagoChequesFK_IdEmpresa();

			this.inicializarActualizarBindingDetallePagoCheque(false);

			//if(DetallePagoChequeBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetallePagoCheque(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagochequeLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagochequeLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagochequeLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdMesDetallePagoChequeActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagochequeLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetallePagoCheque(false,false);

			this.getDetallePagoChequesFK_IdMes();

			this.inicializarActualizarBindingDetallePagoCheque(false);

			//if(DetallePagoChequeBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetallePagoCheque(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagochequeLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagochequeLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagochequeLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPeriodoDetallePagoChequeActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagochequeLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetallePagoCheque(false,false);

			this.getDetallePagoChequesFK_IdPeriodo();

			this.inicializarActualizarBindingDetallePagoCheque(false);

			//if(DetallePagoChequeBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetallePagoCheque(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagochequeLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagochequeLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagochequeLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalDetallePagoChequeActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagochequeLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetallePagoCheque(false,false);

			this.getDetallePagoChequesFK_IdSucursal();

			this.inicializarActualizarBindingDetallePagoCheque(false);

			//if(DetallePagoChequeBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetallePagoCheque(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagochequeLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagochequeLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagochequeLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameDetallePagoCheque() {
		if(this.jInternalFrameDetalleFormDetallePagoCheque!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormDetallePagoCheque!=null) {
			this.jInternalFrameDetalleFormDetallePagoCheque.setVisible(false);	    			
			this.jInternalFrameDetalleFormDetallePagoCheque.dispose();
			this.jInternalFrameDetalleFormDetallePagoCheque=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoDetallePagoCheque!=null) {
			this.jInternalFrameReporteDinamicoDetallePagoCheque.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoDetallePagoCheque.dispose();
			this.jInternalFrameReporteDinamicoDetallePagoCheque=null;
		}
		
		if(this.jInternalFrameImportacionDetallePagoCheque!=null) {
			this.jInternalFrameImportacionDetallePagoCheque.setVisible(false);	    			
			this.jInternalFrameImportacionDetallePagoCheque.dispose();
			this.jInternalFrameImportacionDetallePagoCheque=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessDetallePagoCheque();
			
			DetallePagoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallepagocheque,new Object(),this.detallepagochequeParameterGeneral,this.detallepagochequeReturnGeneral);
			
			
			if(sTipo.equals("NuevoDetallePagoCheque")) {
				jButtonNuevoDetallePagoChequeActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarDetallePagoCheque")) {
				jButtonDuplicarDetallePagoChequeActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarDetallePagoCheque")) {
				jButtonCopiarDetallePagoChequeActionPerformed(evt);
			} else if(sTipo.equals("VerFormDetallePagoCheque")) {
				jButtonVerFormDetallePagoChequeActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarDetallePagoCheque")) {
				jButtonNuevoDetallePagoChequeActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarDetallePagoCheque")) {
				jButtonDuplicarDetallePagoChequeActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoDetallePagoCheque")) {
				jButtonNuevoDetallePagoChequeActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarDetallePagoCheque")) {
				jButtonDuplicarDetallePagoChequeActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesDetallePagoCheque")) {
				jButtonNuevoDetallePagoChequeActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarDetallePagoCheque")) {
				jButtonNuevoDetallePagoChequeActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesDetallePagoCheque")) {
				jButtonNuevoDetallePagoChequeActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarDetallePagoCheque")) {
				jButtonModificarDetallePagoChequeActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarDetallePagoCheque")) {
				jButtonModificarDetallePagoChequeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarDetallePagoCheque")) {
				jButtonModificarDetallePagoChequeActionPerformed(evt);
			} else if(sTipo.equals("ActualizarDetallePagoCheque")) {
				jButtonActualizarDetallePagoChequeActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarDetallePagoCheque")) {
				jButtonActualizarDetallePagoChequeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarDetallePagoCheque")) {
				jButtonActualizarDetallePagoChequeActionPerformed(evt);
			} else if(sTipo.equals("EliminarDetallePagoCheque")) {
				jButtonEliminarDetallePagoChequeActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarDetallePagoCheque")) {
				jButtonEliminarDetallePagoChequeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarDetallePagoCheque")) {
				jButtonEliminarDetallePagoChequeActionPerformed(evt);
			} else if(sTipo.equals("CancelarDetallePagoCheque")) {
				jButtonCancelarDetallePagoChequeActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarDetallePagoCheque")) {
				jButtonCancelarDetallePagoChequeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarDetallePagoCheque")) {
				jButtonCancelarDetallePagoChequeActionPerformed(evt);
			} else if(sTipo.equals("CerrarDetallePagoCheque")) {
				jButtonCerrarDetallePagoChequeActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarDetallePagoCheque")) {
				jButtonCerrarDetallePagoChequeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarDetallePagoCheque")) {
				jButtonCerrarDetallePagoChequeActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarDetallePagoCheque")) {
				jButtonMostrarOcultarDetallePagoChequeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarDetallePagoCheque")) {
				jButtonCancelarDetallePagoChequeActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosDetallePagoCheque")) {
				jButtonGuardarCambiosDetallePagoChequeActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarDetallePagoCheque")) {
				jButtonGuardarCambiosDetallePagoChequeActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarDetallePagoCheque")) {
				jButtonCopiarDetallePagoChequeActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarDetallePagoCheque")) {
				jButtonVerFormDetallePagoChequeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosDetallePagoCheque")) {
				jButtonGuardarCambiosDetallePagoChequeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarDetallePagoCheque")) {
				jButtonCopiarDetallePagoChequeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormDetallePagoCheque")) {
				jButtonVerFormDetallePagoChequeActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaDetallePagoCheque")) {
				jButtonGuardarCambiosDetallePagoChequeActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarDetallePagoCheque")) {
				jButtonGuardarCambiosDetallePagoChequeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaDetallePagoCheque")) {
				jButtonGuardarCambiosDetallePagoChequeActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionDetallePagoCheque")) {
				jButtonRecargarInformacionDetallePagoChequeActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarDetallePagoCheque")) {
				jButtonRecargarInformacionDetallePagoChequeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionDetallePagoCheque")) {
				jButtonRecargarInformacionDetallePagoChequeActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresDetallePagoCheque")) {
				jButtonAnterioresDetallePagoChequeActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarDetallePagoCheque")) {
				jButtonAnterioresDetallePagoChequeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreDetallePagoCheque")) {
				jButtonAnterioresDetallePagoChequeActionPerformed(evt);
			} else if(sTipo.equals("SiguientesDetallePagoCheque")) {
				jButtonSiguientesDetallePagoChequeActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarDetallePagoCheque")) {
				jButtonSiguientesDetallePagoChequeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesDetallePagoCheque")) {
				jButtonSiguientesDetallePagoChequeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByDetallePagoCheque") || sTipo.equals("MenuItemDetalleAbrirOrderByDetallePagoCheque")) {
				jButtonAbrirOrderByDetallePagoChequeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarDetallePagoCheque") || sTipo.equals("MenuItemDetalleMostrarOcultarDetallePagoCheque")) {
				jButtonMostrarOcultarDetallePagoChequeActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosDetallePagoCheque")) {
				jButtonNuevoGuardarCambiosDetallePagoChequeActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarDetallePagoCheque")) {
				jButtonNuevoGuardarCambiosDetallePagoChequeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosDetallePagoCheque")) {
				jButtonNuevoGuardarCambiosDetallePagoChequeActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoDetallePagoCheque")) {
				jButtonCerrarReporteDinamicoDetallePagoChequeActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoDetallePagoCheque")) {
				jButtonGenerarReporteDinamicoDetallePagoChequeActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoDetallePagoCheque")) {
				
				jButtonGenerarExcelReporteDinamicoDetallePagoChequeActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionDetallePagoCheque")) {
				jButtonCerrarImportacionDetallePagoChequeActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionDetallePagoCheque")) {
				
				jButtonGenerarImportacionDetallePagoChequeActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionDetallePagoCheque")) {
				
				jButtonAbrirImportacionDetallePagoChequeActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesDetallePagoCheque")) {
				jComboBoxTiposAccionesDetallePagoChequeActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesDetallePagoCheque")) {
				jComboBoxTiposRelacionesDetallePagoChequeActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioDetallePagoCheque")) {
				jComboBoxTiposAccionesDetallePagoChequeActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarDetallePagoCheque")) {
				
				jComboBoxTiposSeleccionarDetallePagoChequeActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralDetallePagoCheque")) {
				jTextFieldValorCampoGeneralDetallePagoChequeActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByDetallePagoCheque")) {
				jButtonAbrirOrderByDetallePagoChequeActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarDetallePagoCheque")) {
				jButtonAbrirOrderByDetallePagoChequeActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByDetallePagoCheque")) {
				jButtonCerrarOrderByDetallePagoChequeActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDetallePagoChequeBusqueda")) {
				this.jButtonidDetallePagoChequeBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaDetallePagoChequeUpdate")) {
				this.jButtonid_empresaDetallePagoChequeUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaDetallePagoChequeBusqueda")) {
				this.jButtonid_empresaDetallePagoChequeBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalDetallePagoChequeUpdate")) {
				this.jButtonid_sucursalDetallePagoChequeUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalDetallePagoChequeBusqueda")) {
				this.jButtonid_sucursalDetallePagoChequeBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_asiento_contableDetallePagoCheque")) {
				this.jButtonid_asiento_contableDetallePagoChequeActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_asiento_contableDetallePagoChequeUpdate")) {
				this.jButtonid_asiento_contableDetallePagoChequeUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_asiento_contableDetallePagoChequeBusqueda")) {
				this.jButtonid_asiento_contableDetallePagoChequeBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioDetallePagoChequeUpdate")) {
				this.jButtonid_ejercicioDetallePagoChequeUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioDetallePagoChequeBusqueda")) {
				this.jButtonid_ejercicioDetallePagoChequeBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoDetallePagoChequeUpdate")) {
				this.jButtonid_periodoDetallePagoChequeUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoDetallePagoChequeBusqueda")) {
				this.jButtonid_periodoDetallePagoChequeBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorDetallePagoChequeBusqueda")) {
				this.jButtonvalorDetallePagoChequeBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioDetallePagoChequeUpdate")) {
				this.jButtonid_anioDetallePagoChequeUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioDetallePagoChequeBusqueda")) {
				this.jButtonid_anioDetallePagoChequeBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesDetallePagoChequeUpdate")) {
				this.jButtonid_mesDetallePagoChequeUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesDetallePagoChequeBusqueda")) {
				this.jButtonid_mesDetallePagoChequeBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_asiento_contableDetallePagoCheque")) {
				this.jButtonid_asiento_contableDetallePagoChequeActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdAsientoContableDetallePagoCheque")) {
				this.jButtonFK_IdAsientoContableDetallePagoChequeActionPerformed(evt);
			}
			
			;
			
			
			DetallePagoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallepagocheque,new Object(),this.detallepagochequeParameterGeneral,this.detallepagochequeReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessDetallePagoCheque();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetallePagoChequeActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallepagocheque);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallepagocheque);
				
				DetallePagoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallepagocheque,new Object(),this.detallepagochequeParameterGeneral,this.detallepagochequeReturnGeneral);
				
				


				
				DetallePagoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallepagocheque,new Object(),this.detallepagochequeParameterGeneral,this.detallepagochequeReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetallePagoCheque.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetallePagoCheque.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			DetallePagoCheque detallepagochequeLocal=null;
			
			if(!this.getEsControlTabla()) {
				detallepagochequeLocal=this.detallepagocheque;
			} else {
				detallepagochequeLocal=this.detallepagochequeAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallepagocheque);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallepagocheque);
				
				DetallePagoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallepagocheque,new Object(),this.detallepagochequeParameterGeneral,this.detallepagochequeReturnGeneral);
							
				
				


				
				DetallePagoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallepagocheque,new Object(),this.detallepagochequeParameterGeneral,this.detallepagochequeReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetallePagoCheque.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetallePagoCheque.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetallePagoChequeActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetallePagoCheque.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagochequeAnterior =(DetallePagoCheque) this.detallepagochequeLogic.getDetallePagoCheques().toArray()[this.jTableDatosDetallePagoCheque.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallepagochequeAnterior =(DetallePagoCheque) this.detallepagocheques.toArray()[this.jTableDatosDetallePagoCheque.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
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
			
			DetallePagoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallepagocheque,new Object(),this.detallepagochequeParameterGeneral,this.detallepagochequeReturnGeneral);
			
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
			
			


			
			DetallePagoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallepagocheque,new Object(),this.detallepagochequeParameterGeneral,this.detallepagochequeReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetallePagoChequeActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallepagocheque);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallepagocheque);
				
				DetallePagoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallepagocheque,new Object(),this.detallepagochequeParameterGeneral,this.detallepagochequeReturnGeneral);
								
						
				


				
				DetallePagoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallepagocheque,new Object(),this.detallepagochequeParameterGeneral,this.detallepagochequeReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetallePagoCheque.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetallePagoCheque.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallepagocheque);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallepagocheque);
				
				DetallePagoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallepagocheque,new Object(),this.detallepagochequeParameterGeneral,this.detallepagochequeReturnGeneral);
								
				
				


				
				DetallePagoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallepagocheque,new Object(),this.detallepagochequeParameterGeneral,this.detallepagochequeReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetallePagoCheque.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetallePagoCheque.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetallePagoChequeActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetallePagoCheque.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagochequeAnterior =(DetallePagoCheque) this.detallepagochequeLogic.getDetallePagoCheques().toArray()[this.jTableDatosDetallePagoCheque.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallepagochequeAnterior =(DetallePagoCheque) this.detallepagocheques.toArray()[this.jTableDatosDetallePagoCheque.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallepagocheque);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallepagocheque);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetallePagoChequeActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetallePagoCheque.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagochequeAnterior =(DetallePagoCheque) this.detallepagochequeLogic.getDetallePagoCheques().toArray()[this.jTableDatosDetallePagoCheque.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallepagochequeAnterior =(DetallePagoCheque) this.detallepagocheques.toArray()[this.jTableDatosDetallePagoCheque.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetallePagoChequeActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.detallepagocheque);
			
			this.actualizarInformacion("INFO_PADRE",false,this.detallepagocheque);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallepagocheque);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallepagocheque);
				
				DetallePagoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallepagocheque,new Object(),this.detallepagochequeParameterGeneral,this.detallepagochequeReturnGeneral);
							
				
				


				
				DetallePagoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallepagocheque,new Object(),this.detallepagochequeParameterGeneral,this.detallepagochequeReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetallePagoCheque.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetallePagoCheque.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetallePagoChequeActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDetallePagoCheque.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallepagochequeAnterior =(DetallePagoCheque) this.detallepagochequeLogic.getDetallePagoCheques().toArray()[this.jTableDatosDetallePagoCheque.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.detallepagochequeAnterior =(DetallePagoCheque) this.detallepagocheques.toArray()[this.jTableDatosDetallePagoCheque.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
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
			
			DetallePagoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallepagocheque,new Object(),this.detallepagochequeParameterGeneral,this.detallepagochequeReturnGeneral);
			
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
			
			


			
			DetallePagoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallepagocheque,new Object(),this.detallepagochequeParameterGeneral,this.detallepagochequeReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetallePagoChequeActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.detallepagocheque);
			
			this.actualizarInformacion("INFO_PADRE",false,this.detallepagocheque);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallepagocheque);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallepagocheque);
				
				DetallePagoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallepagocheque,new Object(),this.detallepagochequeParameterGeneral,this.detallepagochequeReturnGeneral);
								
				
				


				
				DetallePagoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallepagocheque,new Object(),this.detallepagochequeParameterGeneral,this.detallepagochequeReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetallePagoCheque.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetallePagoCheque.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetallePagoChequeActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetallePagoCheque.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagochequeAnterior =(DetallePagoCheque) this.detallepagochequeLogic.getDetallePagoCheques().toArray()[this.jTableDatosDetallePagoCheque.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallepagochequeAnterior =(DetallePagoCheque) this.detallepagocheques.toArray()[this.jTableDatosDetallePagoCheque.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetallePagoChequeActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.detallepagocheque);
			
			this.actualizarInformacion("INFO_PADRE",false,this.detallepagocheque);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetallePagoChequeActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallepagocheque);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallepagocheque);
				
				DetallePagoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallepagocheque,new Object(),this.detallepagochequeParameterGeneral,this.detallepagochequeReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosDetallePagoCheque")) {
					jCheckBoxSeleccionarTodosDetallePagoChequeItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosDetallePagoCheque")) {
					jCheckBoxSeleccionadosDetallePagoChequeItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarDetallePagoCheque")) {
					
				}
				
				


				
				
				DetallePagoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallepagocheque,new Object(),this.detallepagochequeParameterGeneral,this.detallepagochequeReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetallePagoCheque.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetallePagoCheque.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.detallepagocheque);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.detallepagocheque);
				
				DetallePagoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallepagocheque,new Object(),this.detallepagochequeParameterGeneral,this.detallepagochequeReturnGeneral);
												
				
				


				
				
				DetallePagoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallepagocheque,new Object(),this.detallepagochequeParameterGeneral,this.detallepagochequeReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetallePagoCheque.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetallePagoCheque.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetallePagoChequeActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDetallePagoCheque.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallepagochequeAnterior =(DetallePagoCheque) this.detallepagochequeLogic.getDetallePagoCheques().toArray()[this.jTableDatosDetallePagoCheque.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.detallepagochequeAnterior =(DetallePagoCheque) this.detallepagocheques.toArray()[this.jTableDatosDetallePagoCheque.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetallePagoChequeActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallepagocheque);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallepagocheque);
				
				DetallePagoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallepagocheque,new Object(),this.detallepagochequeParameterGeneral,this.detallepagochequeReturnGeneral);
				
				
				DetallePagoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallepagocheque,new Object(),this.detallepagochequeParameterGeneral,this.detallepagochequeReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
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
			
			DetallePagoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.detallepagocheque,new Object(),this.detallepagochequeParameterGeneral,this.detallepagochequeReturnGeneral);
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
			
			


			
			DetallePagoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallepagocheque,new Object(),this.detallepagochequeParameterGeneral,this.detallepagochequeReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetallePagoChequeActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallepagocheque);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallepagocheque);
				
				DetallePagoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.detallepagocheque,new Object(),this.detallepagochequeParameterGeneral,this.detallepagochequeReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				DetallePagoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallepagocheque,new Object(),this.detallepagochequeParameterGeneral,this.detallepagochequeReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetallePagoCheque.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetallePagoCheque.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallepagocheque);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallepagocheque);
				
				DetallePagoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.detallepagocheque,new Object(),this.detallepagochequeParameterGeneral,this.detallepagochequeReturnGeneral);
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
				
				


				
				DetallePagoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallepagocheque,new Object(),this.detallepagochequeParameterGeneral,this.detallepagochequeReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetallePagoCheque.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetallePagoCheque.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetallePagoChequeActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetallePagoCheque.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagochequeAnterior =(DetallePagoCheque) this.detallepagochequeLogic.getDetallePagoCheques().toArray()[this.jTableDatosDetallePagoCheque.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallepagochequeAnterior =(DetallePagoCheque) this.detallepagocheques.toArray()[this.jTableDatosDetallePagoCheque.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				DetallePagoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallepagocheque,new Object(),this.detallepagochequeParameterGeneral,this.detallepagochequeReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarDetallePagoCheque")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosDetallePagoChequeListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosDetallePagoCheque.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.detallepagocheque =(DetallePagoCheque) this.detallepagochequeLogic.getDetallePagoCheques().toArray()[this.jTableDatosDetallePagoCheque.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.detallepagocheque =(DetallePagoCheque) this.detallepagocheques.toArray()[this.jTableDatosDetallePagoCheque.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.detallepagocheque);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarDetallePagoCheque")) {
				
				}
				
				DetallePagoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallepagocheque,new Object(),this.detallepagochequeParameterGeneral,this.detallepagochequeReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			DetallePagoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.detallepagocheque,new Object(),this.detallepagochequeParameterGeneral,this.detallepagochequeReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarDetallePagoCheque")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosDetallePagoCheque.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarDetallePagoCheque")) {
			
			}
			
			DetallePagoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.detallepagocheque,new Object(),this.detallepagochequeParameterGeneral,this.detallepagochequeReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessDetallePagoCheque();
			
			DetallePagoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallepagocheque,new Object(),this.detallepagochequeParameterGeneral,this.detallepagochequeReturnGeneral);
			
			if(sTipo.equals("NuevoDetallePagoCheque")) {
				jButtonNuevoDetallePagoChequeActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarDetallePagoCheque")) {
				jButtonDuplicarDetallePagoChequeActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarDetallePagoCheque")) {
				jButtonCopiarDetallePagoChequeActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormDetallePagoCheque")) {
				jButtonVerFormDetallePagoChequeActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesDetallePagoCheque")) {
				jButtonNuevoDetallePagoChequeActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarDetallePagoCheque")) {
				jButtonModificarDetallePagoChequeActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarDetallePagoCheque")) {
				jButtonActualizarDetallePagoChequeActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarDetallePagoCheque")) {
				jButtonEliminarDetallePagoChequeActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaDetallePagoCheque")) {
				jButtonGuardarCambiosDetallePagoChequeActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarDetallePagoCheque")) {
				jButtonCancelarDetallePagoChequeActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarDetallePagoCheque")) {
				jButtonCerrarDetallePagoChequeActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosDetallePagoCheque")) {
				jButtonGuardarCambiosDetallePagoChequeActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosDetallePagoCheque")) {
				jButtonNuevoGuardarCambiosDetallePagoChequeActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByDetallePagoCheque")) {
				jButtonAbrirOrderByDetallePagoChequeActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionDetallePagoCheque")) {
				jButtonRecargarInformacionDetallePagoChequeActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresDetallePagoCheque")) {
				jButtonAnterioresDetallePagoChequeActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesDetallePagoCheque")) {
				jButtonSiguientesDetallePagoChequeActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDetallePagoChequeBusqueda")) {
				this.jButtonidDetallePagoChequeBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaDetallePagoChequeUpdate")) {
				this.jButtonid_empresaDetallePagoChequeUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaDetallePagoChequeBusqueda")) {
				this.jButtonid_empresaDetallePagoChequeBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalDetallePagoChequeUpdate")) {
				this.jButtonid_sucursalDetallePagoChequeUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalDetallePagoChequeBusqueda")) {
				this.jButtonid_sucursalDetallePagoChequeBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_asiento_contableDetallePagoCheque")) {
				this.jButtonid_asiento_contableDetallePagoChequeActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_asiento_contableDetallePagoChequeUpdate")) {
				this.jButtonid_asiento_contableDetallePagoChequeUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_asiento_contableDetallePagoChequeBusqueda")) {
				this.jButtonid_asiento_contableDetallePagoChequeBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioDetallePagoChequeUpdate")) {
				this.jButtonid_ejercicioDetallePagoChequeUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioDetallePagoChequeBusqueda")) {
				this.jButtonid_ejercicioDetallePagoChequeBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoDetallePagoChequeUpdate")) {
				this.jButtonid_periodoDetallePagoChequeUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoDetallePagoChequeBusqueda")) {
				this.jButtonid_periodoDetallePagoChequeBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorDetallePagoChequeBusqueda")) {
				this.jButtonvalorDetallePagoChequeBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioDetallePagoChequeUpdate")) {
				this.jButtonid_anioDetallePagoChequeUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioDetallePagoChequeBusqueda")) {
				this.jButtonid_anioDetallePagoChequeBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesDetallePagoChequeUpdate")) {
				this.jButtonid_mesDetallePagoChequeUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesDetallePagoChequeBusqueda")) {
				this.jButtonid_mesDetallePagoChequeBusquedaActionPerformed(evt);
			}
			
			DetallePagoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallepagocheque,new Object(),this.detallepagochequeParameterGeneral,this.detallepagochequeReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessDetallePagoCheque();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			DetallePagoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.detallepagocheque,new Object(),this.detallepagochequeParameterGeneral,this.detallepagochequeReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameDetallePagoCheque")) {
				closingInternalFrameDetallePagoCheque();
				
			} else if(sTipo.equals("jButtonCancelarDetallePagoCheque")) {
				JInternalFrameBase jInternalFrameDetalleFormDetallePagoCheque = (JInternalFrameBase)evt.getSource();
	            	
	            DetallePagoChequeBeanSwingJInternalFrame jInternalFrameParent=(DetallePagoChequeBeanSwingJInternalFrame)jInternalFrameDetalleFormDetallePagoCheque.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarDetallePagoChequeActionPerformed(null);
			}
			
			DetallePagoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.detallepagocheque,new Object(),this.detallepagochequeParameterGeneral,this.detallepagochequeReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormDetallePagoCheque(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormDetallePagoCheque(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormDetallePagoCheque(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.detallepagocheque)) {
			if(!esControlTabla) {
				if(DetallePagoChequeJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualDetallePagoCheque(this.detallepagocheque,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePagoCheque(this.detallepagocheque);			
				}
				
				if(this.detallepagochequeSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualDetallePagoCheque(this.detallepagocheque,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.detallepagochequeReturnGeneral=detallepagochequeLogic.procesarEventosDetallePagoChequesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detallepagochequeLogic.getDetallePagoCheques(),this.detallepagocheque,this.detallepagochequeParameterGeneral,this.isEsNuevoDetallePagoCheque,classes);//this.detallepagochequeLogic.getDetallePagoCheque()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanDetallePagoCheque(this.detallepagochequeReturnGeneral,this.detallepagochequeBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.detallepagochequeSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanDetallePagoCheque(classes,this.detallepagochequeReturnGeneral,this.detallepagochequeBean,false);
					}
						
					if(this.detallepagochequeReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyDetallePagoCheque(this.detallepagochequeReturnGeneral.getDetallePagoCheque());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioDetallePagoCheque(this.detallepagochequeReturnGeneral.getDetallePagoCheque());	
					}
						
					if(this.detallepagochequeReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioDetallePagoCheque(this.detallepagochequeReturnGeneral.getDetallePagoCheque(),classes);//this.detallepagochequeBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioDetallePagoCheque(this.detallepagocheque,classes);//this.detallepagochequeBean);									
				}
			
				if(DetallePagoChequeJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualDetallePagoCheque(this.detallepagocheque,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePagoCheque(this.detallepagocheque);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.detallepagochequeAnterior!=null) {
						this.detallepagocheque=this.detallepagochequeAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.detallepagochequeReturnGeneral=detallepagochequeLogic.procesarEventosDetallePagoChequesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detallepagochequeLogic.getDetallePagoCheques(),this.detallepagocheque,this.detallepagochequeParameterGeneral,this.isEsNuevoDetallePagoCheque,classes);//this.detallepagochequeLogic.getDetallePagoCheque()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.detallepagochequeSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.detallepagochequeSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.detallepagochequeReturnGeneral.getDetallePagoCheque(),detallepagochequeLogic.getDetallePagoCheques());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.detallepagochequeReturnGeneral.getDetallePagoCheque(),this.detallepagocheques);
				}
				//ARCHITECTURE
				
				//this.jTableDatosDetallePagoCheque.repaint();
				
				//((AbstractTableModel) this.jTableDatosDetallePagoCheque.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosDetallePagoCheque();
			}
		}
	}
	
	public void actualizarVisualTableDatosDetallePagoCheque() throws Exception {
		
		DetallePagoChequeModel detallepagochequeModel=(DetallePagoChequeModel)this.jTableDatosDetallePagoCheque.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			detallepagochequeModel.detallepagocheques=this.detallepagochequeLogic.getDetallePagoCheques();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			detallepagochequeModel.detallepagocheques=this.detallepagocheques;
		}
		
		
		((DetallePagoChequeModel) this.jTableDatosDetallePagoCheque.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaDetallePagoCheque() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getdetallepagochequeAnterior(),this.detallepagochequeLogic.getDetallePagoCheques());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getdetallepagochequeAnterior(),this.detallepagocheques);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosDetallePagoCheque();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioDetallePagoCheque(DetallePagoCheque detallepagocheque,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
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
										
				DetallePagoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detallepagocheque,new Object(),generalEntityParameterGeneral,this.detallepagochequeReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.detallepagochequeSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=DetallePagoChequeConstantesFunciones.getClassesRelationshipsOfDetallePagoCheque(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=DetallePagoChequeConstantesFunciones.getClassesRelationshipsFromStringsOfDetallePagoCheque(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormDetallePagoCheque(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				DetallePagoChequeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detallepagocheque,new Object(),generalEntityParameterGeneral,this.detallepagochequeReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioDetallePagoCheque(DetallePagoChequeBean detallepagochequeBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanDetallePagoCheque(ArrayList<Classe> classes,DetallePagoChequeReturnGeneral detallepagochequeReturnGeneral,DetallePagoChequeBean detallepagochequeBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualDetallePagoCheque(DetallePagoCheque detallepagocheque,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.detallepagocheque)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormDetallePagoCheque = new DetallePagoChequeDetalleFormJInternalFrame(jDesktopPane,this.detallepagochequeSessionBean.getConGuardarRelaciones(),this.detallepagochequeSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormDetallePagoCheque);
		this.jInternalFrameDetalleFormDetallePagoCheque.setVisible(false);
		this.jInternalFrameDetalleFormDetallePagoCheque.setSelected(false);						
		
		this.jInternalFrameDetalleFormDetallePagoCheque.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormDetallePagoCheque.detallepagochequeLogic=this.detallepagochequeLogic;
		
		this.cargarCombosFrameForeignKeyDetallePagoCheque("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleDetallePagoCheque();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDetallePagoCheque();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyDetallePagoCheque("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyDetallePagoCheque();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormDetallePagoCheque.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDetallePagoCheque"));
		
		this.jInternalFrameDetalleFormDetallePagoCheque.jButtonModificarDetallePagoCheque.addActionListener(new ButtonActionListener(this,"ModificarDetallePagoCheque"));

		
		this.jInternalFrameDetalleFormDetallePagoCheque.jButtonModificarToolBarDetallePagoCheque.addActionListener(new ButtonActionListener(this,"ModificarToolBarDetallePagoCheque"));
					
		this.jInternalFrameDetalleFormDetallePagoCheque.jMenuItemModificarDetallePagoCheque.addActionListener(new ButtonActionListener(this,"MenuItemModificarDetallePagoCheque"));		
		
		
		
		this.jInternalFrameDetalleFormDetallePagoCheque.jButtonActualizarDetallePagoCheque.addActionListener (new ButtonActionListener(this,"ActualizarDetallePagoCheque"));
		
		
		this.jInternalFrameDetalleFormDetallePagoCheque.jButtonActualizarToolBarDetallePagoCheque.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDetallePagoCheque"));
						
		this.jInternalFrameDetalleFormDetallePagoCheque.jMenuItemActualizarDetallePagoCheque.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDetallePagoCheque"));		
		
		
		
		this.jInternalFrameDetalleFormDetallePagoCheque.jButtonEliminarDetallePagoCheque.addActionListener (new ButtonActionListener(this,"EliminarDetallePagoCheque"));
		
		
		this.jInternalFrameDetalleFormDetallePagoCheque.jButtonEliminarToolBarDetallePagoCheque.addActionListener (new ButtonActionListener(this,"EliminarToolBarDetallePagoCheque"));
								
		this.jInternalFrameDetalleFormDetallePagoCheque.jMenuItemEliminarDetallePagoCheque.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDetallePagoCheque"));		
		
		
		
		this.jInternalFrameDetalleFormDetallePagoCheque.jButtonCancelarDetallePagoCheque.addActionListener (new ButtonActionListener(this,"CancelarDetallePagoCheque"));
		
		
		this.jInternalFrameDetalleFormDetallePagoCheque.jButtonCancelarToolBarDetallePagoCheque.addActionListener (new ButtonActionListener(this,"CancelarToolBarDetallePagoCheque"));
					
		this.jInternalFrameDetalleFormDetallePagoCheque.jMenuItemCancelarDetallePagoCheque.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDetallePagoCheque"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormDetallePagoCheque.jMenuItemDetalleCerrarDetallePagoCheque.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDetallePagoCheque"));		
		
		
		
		this.jInternalFrameDetalleFormDetallePagoCheque.jButtonGuardarCambiosToolBarDetallePagoCheque.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDetallePagoCheque"));
		
		
		
		this.jInternalFrameDetalleFormDetallePagoCheque.jButtonGuardarCambiosToolBarDetallePagoCheque.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDetallePagoCheque"));
		
		
		
		this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxTiposAccionesFormularioDetallePagoCheque.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDetallePagoCheque"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePagoCheque.jButtonidDetallePagoChequeBusqueda.addActionListener(new ButtonActionListener(this,"idDetallePagoChequeBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePagoCheque.jButtonid_empresaDetallePagoChequeUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDetallePagoChequeUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePagoCheque.jButtonid_empresaDetallePagoChequeBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDetallePagoChequeBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePagoCheque.jButtonid_sucursalDetallePagoChequeUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalDetallePagoChequeUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePagoCheque.jButtonid_sucursalDetallePagoChequeBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalDetallePagoChequeBusqueda"));
		//jButtonid_asiento_contableDetallePagoCheque.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_asiento_contableDetallePagoChequeActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormDetallePagoCheque.jButtonid_asiento_contableDetallePagoCheque.addActionListener(new ButtonActionListener(this,"id_asiento_contableDetallePagoCheque"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePagoCheque.jButtonid_asiento_contableDetallePagoChequeUpdate.addActionListener(new ButtonActionListener(this,"id_asiento_contableDetallePagoChequeUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePagoCheque.jButtonid_asiento_contableDetallePagoChequeBusqueda.addActionListener(new ButtonActionListener(this,"id_asiento_contableDetallePagoChequeBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePagoCheque.jButtonid_ejercicioDetallePagoChequeUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioDetallePagoChequeUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePagoCheque.jButtonid_ejercicioDetallePagoChequeBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioDetallePagoChequeBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePagoCheque.jButtonid_periodoDetallePagoChequeUpdate.addActionListener(new ButtonActionListener(this,"id_periodoDetallePagoChequeUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePagoCheque.jButtonid_periodoDetallePagoChequeBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoDetallePagoChequeBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePagoCheque.jButtonvalorDetallePagoChequeBusqueda.addActionListener(new ButtonActionListener(this,"valorDetallePagoChequeBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePagoCheque.jButtonid_anioDetallePagoChequeUpdate.addActionListener(new ButtonActionListener(this,"id_anioDetallePagoChequeUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePagoCheque.jButtonid_anioDetallePagoChequeBusqueda.addActionListener(new ButtonActionListener(this,"id_anioDetallePagoChequeBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePagoCheque.jButtonid_mesDetallePagoChequeUpdate.addActionListener(new ButtonActionListener(this,"id_mesDetallePagoChequeUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePagoCheque.jButtonid_mesDetallePagoChequeBusqueda.addActionListener(new ButtonActionListener(this,"id_mesDetallePagoChequeBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormDetallePagoCheque.jTabbedPaneRelacionesDetallePagoCheque.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDetallePagoCheque"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameDetallePagoCheque"));
		
		if(this.jInternalFrameDetalleFormDetallePagoCheque!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetallePagoCheque.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDetallePagoCheque"));
		}
		
		this.jTableDatosDetallePagoCheque.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarDetallePagoCheque"));
		
		this.jTableDatosDetallePagoCheque.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarDetallePagoCheque"));
		
		this.jButtonNuevoDetallePagoCheque.addActionListener(new ButtonActionListener(this,"NuevoDetallePagoCheque"));
		
		this.jButtonDuplicarDetallePagoCheque.addActionListener(new ButtonActionListener(this,"DuplicarDetallePagoCheque"));
		
		this.jButtonCopiarDetallePagoCheque.addActionListener(new ButtonActionListener(this,"CopiarDetallePagoCheque"));
		
		this.jButtonVerFormDetallePagoCheque.addActionListener(new ButtonActionListener(this,"VerFormDetallePagoCheque"));
		
		
		this.jButtonNuevoToolBarDetallePagoCheque.addActionListener(new ButtonActionListener(this,"NuevoToolBarDetallePagoCheque"));
			
		this.jButtonDuplicarToolBarDetallePagoCheque.addActionListener(new ButtonActionListener(this,"DuplicarToolBarDetallePagoCheque"));
			
		this.jMenuItemNuevoDetallePagoCheque.addActionListener (new ButtonActionListener(this,"MenuItemNuevoDetallePagoCheque"));
			
		this.jMenuItemDuplicarDetallePagoCheque.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarDetallePagoCheque"));		
		
		
		this.jButtonNuevoRelacionesDetallePagoCheque.addActionListener (new ButtonActionListener(this,"NuevoRelacionesDetallePagoCheque"));
		
		
		this.jButtonNuevoRelacionesToolBarDetallePagoCheque.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarDetallePagoCheque"));
			
		this.jMenuItemNuevoRelacionesDetallePagoCheque.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesDetallePagoCheque"));		
		
		
		if(this.jInternalFrameDetalleFormDetallePagoCheque!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetallePagoCheque.jButtonModificarDetallePagoCheque.addActionListener(new ButtonActionListener(this,"ModificarDetallePagoCheque"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetallePagoCheque!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetallePagoCheque.jButtonModificarToolBarDetallePagoCheque.addActionListener(new ButtonActionListener(this,"ModificarToolBarDetallePagoCheque"));
			
			this.jInternalFrameDetalleFormDetallePagoCheque.jMenuItemModificarDetallePagoCheque.addActionListener(new ButtonActionListener(this,"MenuItemModificarDetallePagoCheque"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetallePagoCheque!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormDetallePagoCheque.jButtonActualizarDetallePagoCheque.addActionListener (new ButtonActionListener(this,"ActualizarDetallePagoCheque"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetallePagoCheque!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetallePagoCheque.jButtonActualizarToolBarDetallePagoCheque.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDetallePagoCheque"));
				
			this.jInternalFrameDetalleFormDetallePagoCheque.jMenuItemActualizarDetallePagoCheque.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDetallePagoCheque"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetallePagoCheque!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetallePagoCheque.jButtonEliminarDetallePagoCheque.addActionListener (new ButtonActionListener(this,"EliminarDetallePagoCheque"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetallePagoCheque!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetallePagoCheque.jButtonEliminarToolBarDetallePagoCheque.addActionListener (new ButtonActionListener(this,"EliminarToolBarDetallePagoCheque"));
						
			this.jInternalFrameDetalleFormDetallePagoCheque.jMenuItemEliminarDetallePagoCheque.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDetallePagoCheque"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetallePagoCheque!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetallePagoCheque.jButtonCancelarDetallePagoCheque.addActionListener (new ButtonActionListener(this,"CancelarDetallePagoCheque"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetallePagoCheque!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetallePagoCheque.jButtonCancelarToolBarDetallePagoCheque.addActionListener (new ButtonActionListener(this,"CancelarToolBarDetallePagoCheque"));
			
			this.jInternalFrameDetalleFormDetallePagoCheque.jMenuItemCancelarDetallePagoCheque.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDetallePagoCheque"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarDetallePagoCheque.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarDetallePagoCheque"));		
		
		
		this.jButtonCerrarDetallePagoCheque.addActionListener (new ButtonActionListener(this,"CerrarDetallePagoCheque"));
		
		
		this.jButtonCerrarToolBarDetallePagoCheque.addActionListener (new ButtonActionListener(this,"CerrarToolBarDetallePagoCheque"));
			
		this.jMenuItemCerrarDetallePagoCheque.addActionListener (new ButtonActionListener(this,"MenuItemCerrarDetallePagoCheque"));
			
		if(this.jInternalFrameDetalleFormDetallePagoCheque!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetallePagoCheque.jMenuItemDetalleCerrarDetallePagoCheque.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDetallePagoCheque"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetallePagoCheque!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetallePagoCheque.jButtonGuardarCambiosDetallePagoCheque.addActionListener (new ButtonActionListener(this,"GuardarCambiosDetallePagoCheque"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetallePagoCheque!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetallePagoCheque.jButtonGuardarCambiosToolBarDetallePagoCheque.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDetallePagoCheque"));
		}
		
		this.jButtonCopiarToolBarDetallePagoCheque.addActionListener (new ButtonActionListener(this,"CopiarToolBarDetallePagoCheque"));
			
		this.jButtonVerFormToolBarDetallePagoCheque.addActionListener (new ButtonActionListener(this,"VerFormToolBarDetallePagoCheque"));
		
		this.jMenuItemGuardarCambiosDetallePagoCheque.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosDetallePagoCheque"));
			
		this.jMenuItemCopiarDetallePagoCheque.addActionListener (new ButtonActionListener(this,"MenuItemCopiarDetallePagoCheque"));		
		
		this.jMenuItemVerFormDetallePagoCheque.addActionListener (new ButtonActionListener(this,"MenuItemVerFormDetallePagoCheque"));		
		
		
		this.jButtonGuardarCambiosTablaDetallePagoCheque.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDetallePagoCheque"));
		
		
		this.jButtonGuardarCambiosTablaToolBarDetallePagoCheque.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarDetallePagoCheque"));
			
		this.jMenuItemGuardarCambiosTablaDetallePagoCheque.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDetallePagoCheque"));		
		
		
		
		this.jButtonRecargarInformacionDetallePagoCheque.addActionListener (new ButtonActionListener(this,"RecargarInformacionDetallePagoCheque"));
					
		this.jButtonRecargarInformacionToolBarDetallePagoCheque.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarDetallePagoCheque"));
		
		this.jMenuItemRecargarInformacionDetallePagoCheque.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionDetallePagoCheque"));		
		
		
		
		this.jButtonAnterioresDetallePagoCheque.addActionListener (new ButtonActionListener(this,"AnterioresDetallePagoCheque"));
		
		
		this.jButtonAnterioresToolBarDetallePagoCheque.addActionListener (new ButtonActionListener(this,"AnterioresToolBarDetallePagoCheque"));
		
		this.jMenuItemAnterioresDetallePagoCheque.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresDetallePagoCheque"));		
		
		
		this.jButtonSiguientesDetallePagoCheque.addActionListener (new ButtonActionListener(this,"SiguientesDetallePagoCheque"));
		
		
		this.jButtonSiguientesToolBarDetallePagoCheque.addActionListener (new ButtonActionListener(this,"SiguientesToolBarDetallePagoCheque"));
			
		this.jMenuItemSiguientesDetallePagoCheque.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesDetallePagoCheque"));
			
		this.jMenuItemAbrirOrderByDetallePagoCheque.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByDetallePagoCheque"));
			
		this.jMenuItemMostrarOcultarDetallePagoCheque.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarDetallePagoCheque"));
			
		this.jMenuItemDetalleAbrirOrderByDetallePagoCheque.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByDetallePagoCheque"));
			
		this.jMenuItemDetalleMostarOcultarDetallePagoCheque.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarDetallePagoCheque"));		
		
		
		this.jButtonNuevoGuardarCambiosDetallePagoCheque.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosDetallePagoCheque"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarDetallePagoCheque.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarDetallePagoCheque"));
			
		this.jMenuItemNuevoGuardarCambiosDetallePagoCheque.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosDetallePagoCheque"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosDetallePagoCheque.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosDetallePagoCheque"));

		this.jCheckBoxSeleccionadosDetallePagoCheque.addItemListener(new CheckBoxItemListener(this,"SeleccionadosDetallePagoCheque"));
		
		if(this.jInternalFrameDetalleFormDetallePagoCheque!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxTiposAccionesFormularioDetallePagoCheque.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDetallePagoCheque"));
		}
		
		
		this.jComboBoxTiposRelacionesDetallePagoCheque.addActionListener (new ButtonActionListener(this,"TiposRelacionesDetallePagoCheque"));
			
		this.jComboBoxTiposAccionesDetallePagoCheque.addActionListener (new ButtonActionListener(this,"TiposAccionesDetallePagoCheque"));
					
		this.jComboBoxTiposSeleccionarDetallePagoCheque.addActionListener (new ButtonActionListener(this,"TiposSeleccionarDetallePagoCheque"));
			
		this.jTextFieldValorCampoGeneralDetallePagoCheque.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralDetallePagoCheque"));		
		
		
		if(this.jInternalFrameDetalleFormDetallePagoCheque!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePagoCheque.jButtonidDetallePagoChequeBusqueda.addActionListener(new ButtonActionListener(this,"idDetallePagoChequeBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePagoCheque.jButtonid_empresaDetallePagoChequeUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDetallePagoChequeUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePagoCheque.jButtonid_empresaDetallePagoChequeBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDetallePagoChequeBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePagoCheque.jButtonid_sucursalDetallePagoChequeUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalDetallePagoChequeUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePagoCheque.jButtonid_sucursalDetallePagoChequeBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalDetallePagoChequeBusqueda"));
		//jButtonid_asiento_contableDetallePagoCheque.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_asiento_contableDetallePagoChequeActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormDetallePagoCheque.jButtonid_asiento_contableDetallePagoCheque.addActionListener(new ButtonActionListener(this,"id_asiento_contableDetallePagoCheque"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePagoCheque.jButtonid_asiento_contableDetallePagoChequeUpdate.addActionListener(new ButtonActionListener(this,"id_asiento_contableDetallePagoChequeUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePagoCheque.jButtonid_asiento_contableDetallePagoChequeBusqueda.addActionListener(new ButtonActionListener(this,"id_asiento_contableDetallePagoChequeBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePagoCheque.jButtonid_ejercicioDetallePagoChequeUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioDetallePagoChequeUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePagoCheque.jButtonid_ejercicioDetallePagoChequeBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioDetallePagoChequeBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePagoCheque.jButtonid_periodoDetallePagoChequeUpdate.addActionListener(new ButtonActionListener(this,"id_periodoDetallePagoChequeUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePagoCheque.jButtonid_periodoDetallePagoChequeBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoDetallePagoChequeBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePagoCheque.jButtonvalorDetallePagoChequeBusqueda.addActionListener(new ButtonActionListener(this,"valorDetallePagoChequeBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePagoCheque.jButtonid_anioDetallePagoChequeUpdate.addActionListener(new ButtonActionListener(this,"id_anioDetallePagoChequeUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePagoCheque.jButtonid_anioDetallePagoChequeBusqueda.addActionListener(new ButtonActionListener(this,"id_anioDetallePagoChequeBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePagoCheque.jButtonid_mesDetallePagoChequeUpdate.addActionListener(new ButtonActionListener(this,"id_mesDetallePagoChequeUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePagoCheque.jButtonid_mesDetallePagoChequeBusqueda.addActionListener(new ButtonActionListener(this,"id_mesDetallePagoChequeBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdAsientoContableDetallePagoCheque.addActionListener(new ButtonActionListener(this,"FK_IdAsientoContableDetallePagoCheque"));

			this.jButtonBuscarFK_IdAsientoContableid_asiento_contableDetallePagoCheque.addActionListener(new ButtonActionListener(this,"id_asiento_contableDetallePagoCheque"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoDetallePagoCheque!=null) {
				this.jInternalFrameReporteDinamicoDetallePagoCheque.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDetallePagoCheque"));
				this.jInternalFrameReporteDinamicoDetallePagoCheque.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDetallePagoCheque"));
				this.jInternalFrameReporteDinamicoDetallePagoCheque.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDetallePagoCheque"));
			}
			
			//this.jButtonCerrarReporteDinamicoDetallePagoCheque.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDetallePagoCheque"));				
			//this.jButtonGenerarReporteDinamicoDetallePagoCheque.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDetallePagoCheque"));
			//this.jButtonGenerarExcelReporteDinamicoDetallePagoCheque.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDetallePagoCheque"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionDetallePagoCheque!=null) {
				this.jInternalFrameImportacionDetallePagoCheque.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDetallePagoCheque"));
				this.jInternalFrameImportacionDetallePagoCheque.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDetallePagoCheque"));
				this.jInternalFrameImportacionDetallePagoCheque.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDetallePagoCheque"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByDetallePagoCheque.addActionListener (new ButtonActionListener(this,"AbrirOrderByDetallePagoCheque"));
			
			this.jButtonAbrirOrderByToolBarDetallePagoCheque.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarDetallePagoCheque"));			
			
			if(this.jInternalFrameOrderByDetallePagoCheque!=null) {
				this.jInternalFrameOrderByDetallePagoCheque.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDetallePagoCheque"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormDetallePagoCheque!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormDetallePagoCheque!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetallePagoCheque.jTabbedPaneRelacionesDetallePagoCheque.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDetallePagoCheque"));
		
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
            		closingInternalFrameDetallePagoCheque();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormDetallePagoCheque.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormDetallePagoCheque = (JInternalFrameBase)event.getSource();
	            	
	            DetallePagoChequeBeanSwingJInternalFrame jInternalFrameParent=(DetallePagoChequeBeanSwingJInternalFrame)jInternalFrameDetalleFormDetallePagoCheque.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarDetallePagoChequeActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosDetallePagoCheque.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosDetallePagoChequeListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosDetallePagoCheque.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosDetallePagoCheque.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoDetallePagoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetallePagoChequeActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarDetallePagoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetallePagoChequeActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoDetallePagoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetallePagoChequeActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoDetallePagoCheque";
		inputMap = this.jButtonNuevoDetallePagoCheque.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoDetallePagoCheque.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDetallePagoChequeActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesDetallePagoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetallePagoChequeActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarDetallePagoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetallePagoChequeActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesDetallePagoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetallePagoChequeActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesDetallePagoCheque";
		inputMap = this.jButtonNuevoRelacionesDetallePagoCheque.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesDetallePagoCheque.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDetallePagoChequeActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarDetallePagoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDetallePagoChequeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarDetallePagoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDetallePagoChequeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarDetallePagoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDetallePagoChequeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarDetallePagoCheque";
		inputMap = this.jButtonModificarDetallePagoCheque.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarDetallePagoCheque.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarDetallePagoChequeActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarDetallePagoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDetallePagoChequeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarDetallePagoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDetallePagoChequeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarDetallePagoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDetallePagoChequeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarDetallePagoCheque";
		inputMap = this.jButtonActualizarDetallePagoCheque.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarDetallePagoCheque.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarDetallePagoChequeActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarDetallePagoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDetallePagoChequeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarDetallePagoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDetallePagoChequeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarDetallePagoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDetallePagoChequeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarDetallePagoCheque";
		inputMap = this.jButtonEliminarDetallePagoCheque.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarDetallePagoCheque.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarDetallePagoChequeActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarDetallePagoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDetallePagoChequeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarDetallePagoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDetallePagoChequeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarDetallePagoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDetallePagoChequeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarDetallePagoCheque";
		inputMap = this.jButtonCancelarDetallePagoCheque.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarDetallePagoCheque.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarDetallePagoChequeActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarDetallePagoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDetallePagoChequeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarDetallePagoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDetallePagoChequeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarDetallePagoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDetallePagoChequeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarDetallePagoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarDetallePagoChequeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarDetallePagoChequeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarDetallePagoCheque";
		inputMap = this.jButtonCerrarDetallePagoCheque.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarDetallePagoCheque.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarDetallePagoChequeActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormDetallePagoCheque.jButtonGuardarCambiosDetallePagoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetallePagoChequeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarDetallePagoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetallePagoChequeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosDetallePagoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetallePagoChequeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaDetallePagoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetallePagoChequeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarDetallePagoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetallePagoChequeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaDetallePagoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetallePagoChequeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosDetallePagoCheque";
		inputMap = this.jInternalFrameDetalleFormDetallePagoCheque.jButtonGuardarCambiosDetallePagoCheque.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormDetallePagoCheque.jButtonGuardarCambiosDetallePagoCheque.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosDetallePagoChequeActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionDetallePagoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDetallePagoChequeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarDetallePagoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDetallePagoChequeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionDetallePagoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDetallePagoChequeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresDetallePagoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDetallePagoChequeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarDetallePagoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDetallePagoChequeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresDetallePagoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDetallePagoChequeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesDetallePagoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDetallePagoChequeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarDetallePagoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDetallePagoChequeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesDetallePagoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDetallePagoChequeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosDetallePagoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDetallePagoChequeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarDetallePagoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDetallePagoChequeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosDetallePagoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDetallePagoChequeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosDetallePagoCheque.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosDetallePagoChequeItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesDetallePagoCheque.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesDetallePagoChequeActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarDetallePagoCheque.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarDetallePagoChequeActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralDetallePagoCheque.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralDetallePagoChequeActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePagoCheque.jButtonidDetallePagoChequeBusqueda.addActionListener(new ButtonActionListener(this,"idDetallePagoChequeBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePagoCheque.jButtonid_empresaDetallePagoChequeUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDetallePagoChequeUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePagoCheque.jButtonid_empresaDetallePagoChequeBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDetallePagoChequeBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePagoCheque.jButtonid_sucursalDetallePagoChequeUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalDetallePagoChequeUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePagoCheque.jButtonid_sucursalDetallePagoChequeBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalDetallePagoChequeBusqueda"));
		//jButtonid_asiento_contableDetallePagoCheque.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_asiento_contableDetallePagoChequeActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormDetallePagoCheque.jButtonid_asiento_contableDetallePagoCheque.addActionListener(new ButtonActionListener(this,"id_asiento_contableDetallePagoCheque"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePagoCheque.jButtonid_asiento_contableDetallePagoChequeUpdate.addActionListener(new ButtonActionListener(this,"id_asiento_contableDetallePagoChequeUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePagoCheque.jButtonid_asiento_contableDetallePagoChequeBusqueda.addActionListener(new ButtonActionListener(this,"id_asiento_contableDetallePagoChequeBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePagoCheque.jButtonid_ejercicioDetallePagoChequeUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioDetallePagoChequeUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePagoCheque.jButtonid_ejercicioDetallePagoChequeBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioDetallePagoChequeBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePagoCheque.jButtonid_periodoDetallePagoChequeUpdate.addActionListener(new ButtonActionListener(this,"id_periodoDetallePagoChequeUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePagoCheque.jButtonid_periodoDetallePagoChequeBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoDetallePagoChequeBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePagoCheque.jButtonvalorDetallePagoChequeBusqueda.addActionListener(new ButtonActionListener(this,"valorDetallePagoChequeBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePagoCheque.jButtonid_anioDetallePagoChequeUpdate.addActionListener(new ButtonActionListener(this,"id_anioDetallePagoChequeUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePagoCheque.jButtonid_anioDetallePagoChequeBusqueda.addActionListener(new ButtonActionListener(this,"id_anioDetallePagoChequeBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePagoCheque.jButtonid_mesDetallePagoChequeUpdate.addActionListener(new ButtonActionListener(this,"id_mesDetallePagoChequeUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePagoCheque.jButtonid_mesDetallePagoChequeBusqueda.addActionListener(new ButtonActionListener(this,"id_mesDetallePagoChequeBusqueda"));
		
		
		this.jButtonFK_IdAsientoContableDetallePagoCheque.addActionListener(new ButtonActionListener(this,"FK_IdAsientoContableDetallePagoCheque"));

		this.jButtonBuscarFK_IdAsientoContableid_asiento_contableDetallePagoCheque.addActionListener(new ButtonActionListener(this,"id_asiento_contableDetallePagoCheque"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoDetallePagoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoDetallePagoChequeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoDetallePagoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoDetallePagoChequeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoDetallePagoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoDetallePagoChequeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionDetallePagoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionDetallePagoChequeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionDetallePagoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionDetallePagoChequeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionDetallePagoCheque.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionDetallePagoChequeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarDetallePagoChequeActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarDetallePagoCheque.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosDetallePagoCheque(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(DetallePagoCheque detallepagochequeAux:this.detallepagochequeLogic.getDetallePagoCheques()) {
					detallepagochequeAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetallePagoCheque detallepagochequeAux:detallepagocheques) {
					detallepagochequeAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosDetallePagoChequeItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDetallePagoCheque(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DetallePagoCheque detallepagochequeAux:this.detallepagochequeLogic.getDetallePagoCheques()) {
						detallepagochequeAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DetallePagoCheque detallepagochequeAux:detallepagocheques) {
						detallepagochequeAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(DetallePagoCheque detallepagochequeAux:this.detallepagochequeLogic.getDetallePagoCheques()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DetallePagoCheque detallepagochequeAux:detallepagocheques) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaDetallePagoCheque(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDetallePagoCheque.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDetallePagoCheque.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDetallePagoCheque,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosDetallePagoChequeItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDetallePagoCheque(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosDetallePagoCheque.getSelectedRows();
			
			DetallePagoCheque detallepagochequeLocal=new DetallePagoCheque();
			
			//this.seleccionarTodosDetallePagoCheque(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallepagochequeLocal =(DetallePagoCheque) this.detallepagochequeLogic.getDetallePagoCheques().toArray()[this.jTableDatosDetallePagoCheque.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					detallepagochequeLocal =(DetallePagoCheque) this.detallepagocheques.toArray()[this.jTableDatosDetallePagoCheque.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				detallepagochequeLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DetallePagoCheque detallepagochequeAux:this.detallepagochequeLogic.getDetallePagoCheques()) {
						detallepagochequeAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DetallePagoCheque detallepagochequeAux:detallepagocheques) {
						detallepagochequeAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaDetallePagoCheque(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDetallePagoCheque.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDetallePagoCheque.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDetallePagoCheque,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualDetallePagoChequeItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarDetallePagoChequeParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralDetallePagoChequeActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingDetallePagoCheque(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralDetallePagoCheque.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DetallePagoCheque detallepagochequeAux:this.detallepagochequeLogic.getDetallePagoCheques()) {
				
						if(sTipoSeleccionar.equals(DetallePagoChequeConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							detallepagochequeAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetallePagoCheque detallepagochequeAux:detallepagocheques) {
					
						if(sTipoSeleccionar.equals(DetallePagoChequeConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							detallepagochequeAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaDetallePagoCheque(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesDetallePagoChequeActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingDetallePagoCheque(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioDetallePagoCheque=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesDetallePagoCheque.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxTiposAccionesFormularioDetallePagoCheque.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteDetallePagoCheque) {				
					conSplash=true;//false;										
					
					//this.startProcessDetallePagoCheque(conSplash);
				
					this.generarReporteDetallePagoChequesSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetallePagoCheque.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxTiposAccionesFormularioDetallePagoCheque.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoDetallePagoChequesSeleccionados();
				//this.jComboBoxTiposAccionesDetallePagoCheque.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDetallePagoChequesSeleccionados(false);
				//this.jComboBoxTiposAccionesDetallePagoCheque.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDetallePagoChequesSeleccionados(true);
				//this.jComboBoxTiposAccionesDetallePagoCheque.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDetallePagoCheque();
				
				this.exportarDetallePagoChequesSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetallePagoCheque.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxTiposAccionesFormularioDetallePagoCheque.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionDetallePagoCheques();
				//this.importarDetallePagoCheques();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetallePagoCheque.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxTiposAccionesFormularioDetallePagoCheque.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDetallePagoCheque();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelDetallePagoChequesSeleccionados();
				//this.jComboBoxTiposAccionesDetallePagoCheque.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Detalle Pago Cheque", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessDetallePagoCheque();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoDetallePagoCheque)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyDetallePagoCheque(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Detalle Pago Cheque",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetallePagoCheque.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxTiposAccionesFormularioDetallePagoCheque.setSelectedIndex(0);					
				}	
			} 			
			else if(DetallePagoChequeBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteDetallePagoCheque) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessDetallePagoCheque(conSplash);
					
						//this.actualizarParametrosGeneralDetallePagoCheque();
						
						this.generarReporteProcesoAccionDetallePagoChequesSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesDetallePagoCheque.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxTiposAccionesFormularioDetallePagoCheque.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(DetallePagoChequeBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Detalle Pago ChequeS SELECCIONADOS?", "MANTENIMIENTO DE Detalle Pago Cheque", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessDetallePagoCheque();
				
						this.actualizarParametrosGeneralDetallePagoCheque();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.detallepagochequeReturnGeneral=detallepagochequeLogic.procesarAccionDetallePagoChequesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.detallepagochequeLogic.getDetallePagoCheques(),this.detallepagochequeParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarDetallePagoChequeReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDetallePagoCheque.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxTiposAccionesFormularioDetallePagoCheque.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralDetallePagoCheque();
					
					DetallePagoChequeBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarDetallePagoChequeReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDetallePagoCheque.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxTiposAccionesFormularioDetallePagoCheque.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessDetallePagoCheque(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesDetallePagoChequeActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessDetallePagoCheque();
			
			if(this.jInternalFrameDetalleFormDetallePagoCheque==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<DetallePagoCheque> detallepagochequesSeleccionados=new ArrayList<DetallePagoCheque>();		
			DetallePagoCheque detallepagocheque=new DetallePagoCheque();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingDetallePagoCheque(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesDetallePagoCheque.getSelectedItem();
			
			
			
			
			detallepagochequesSeleccionados=this.getDetallePagoChequesSeleccionados(true);
			//this.sTipoAccion;
			
			if(detallepagochequesSeleccionados.size()==1) {
				for(DetallePagoCheque detallepagochequeAux:detallepagochequesSeleccionados) {
					detallepagocheque=detallepagochequeAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessDetallePagoCheque();
			
      		//this.finishProcessDetallePagoCheque(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarDetallePagoChequeReturnGeneral() throws Exception {
		if(this.detallepagochequeReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.detallepagochequeReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.detallepagochequeReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.detallepagochequeReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.detallepagochequeReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.detallepagochequeReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingDetallePagoCheque(false);
		}
		
		if(this.detallepagochequeReturnGeneral.getConRetornoLista() || this.detallepagochequeReturnGeneral.getConRetornoObjeto()) {
			if(this.detallepagochequeReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.detallepagochequeLogic.setDetallePagoCheques(this.detallepagochequeReturnGeneral.getDetallePagoCheques());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.detallepagochequeReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.detallepagochequeLogic.setDetallePagoCheque(this.detallepagochequeReturnGeneral.getDetallePagoCheque());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingDetallePagoCheque(false);
		}
	}
	
	public void actualizarParametrosGeneralDetallePagoCheque() throws Exception {
		
		
	}
	
	public ArrayList<DetallePagoCheque> getDetallePagoChequesSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<DetallePagoCheque> detallepagochequesSeleccionados=new ArrayList<DetallePagoCheque>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioDetallePagoCheque) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(DetallePagoCheque detallepagochequeAux:detallepagochequeLogic.getDetallePagoCheques()) {
					if(detallepagochequeAux.getIsSelected()) {
						detallepagochequesSeleccionados.add(detallepagochequeAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetallePagoCheque detallepagochequeAux:this.detallepagocheques) {
					if(detallepagochequeAux.getIsSelected()) {
						detallepagochequesSeleccionados.add(detallepagochequeAux);				
					}
				}
			}
			
			if(detallepagochequesSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						detallepagochequesSeleccionados.addAll(this.detallepagochequeLogic.getDetallePagoCheques());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						detallepagochequesSeleccionados.addAll(this.detallepagocheques);				
					}
				}
			}
		} else {
			detallepagochequesSeleccionados.add(this.detallepagocheque);
		}
		
		return detallepagochequesSeleccionados;
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
	
	public void generarReporteDetallePagoChequesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalDetallePagoChequesSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoDetallePagoChequesSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDetallePagoChequesSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDetallePagoChequesSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Detalle Pago Cheque",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesDetallePagoChequesSeleccionados() throws Exception {
		ArrayList<DetallePagoCheque> detallepagochequesSeleccionados=new ArrayList<DetallePagoCheque>();		
		
		detallepagochequesSeleccionados=this.getDetallePagoChequesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteDetallePagoCheques("Todos",detallepagochequesSeleccionados);
		
	}	
	
	public void generarReporteNormalDetallePagoChequesSeleccionados() throws Exception {
		ArrayList<DetallePagoCheque> detallepagochequesSeleccionados=new ArrayList<DetallePagoCheque>();		
		
		detallepagochequesSeleccionados=this.getDetallePagoChequesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteDetallePagoCheques("Todos",detallepagochequesSeleccionados);
	}		
	
	public void generarReporteProcesoAccionDetallePagoChequesSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<DetallePagoCheque> detallepagochequesSeleccionados=new ArrayList<DetallePagoCheque>();
		
		detallepagochequesSeleccionados=this.getDetallePagoChequesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteDetallePagoCheques("Todos",detallepagochequesSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoDetallePagoChequesSeleccionados() throws Exception {
		ArrayList<DetallePagoCheque> detallepagochequesSeleccionados=new ArrayList<DetallePagoCheque>();		
		
		
		this.abrirInicializarFrameReporteDinamicoDetallePagoCheque();
		
		
		detallepagochequesSeleccionados=this.getDetallePagoChequesSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoDetallePagoCheque();
		
		
		//this.generarReporteDetallePagoCheques("Todos",detallepagochequesSeleccionados ,detallepagochequeImplementable,detallepagochequeImplementableHome);
	}
	
	public void mostrarImportacionDetallePagoCheques() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionDetallePagoCheque();
		
		this.abrirFrameImportacionDetallePagoCheque();		
		
			
		//this.generarReporteDetallePagoCheques("Todos",detallepagochequesSeleccionados ,detallepagochequeImplementable,detallepagochequeImplementableHome);
	}
	
	public void importarDetallePagoCheques() throws Exception {		
	
	}
	
	public void exportarDetallePagoChequesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelDetallePagoChequesSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoDetallePagoChequesSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlDetallePagoChequesSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Detalle Pago Cheque",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoDetallePagoChequesSeleccionados() throws Exception {
		ArrayList<DetallePagoCheque> detallepagochequesSeleccionados=new ArrayList<DetallePagoCheque>();		
		
		detallepagochequesSeleccionados=this.getDetallePagoChequesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallepagocheque."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarDetallePagoCheque(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(DetallePagoCheque detallepagochequeAux:detallepagochequesSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarDetallePagoCheque(detallepagochequeAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//detallepagochequeAux.setsDetalleGeneralEntityReporte(detallepagochequeAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallepagochequeSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Pago Cheque",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarDetallePagoCheque(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=DetallePagoChequeConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetallePagoChequeConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetallePagoChequeConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetallePagoChequeConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetallePagoChequeConstantesFunciones.LABEL_IDASIENTOCONTABLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetallePagoChequeConstantesFunciones.LABEL_IDEJERCICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetallePagoChequeConstantesFunciones.LABEL_IDPERIODO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetallePagoChequeConstantesFunciones.LABEL_VALOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetallePagoChequeConstantesFunciones.LABEL_IDANIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetallePagoChequeConstantesFunciones.LABEL_IDMES;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarDetallePagoCheque(DetallePagoCheque detallepagocheque,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=detallepagocheque.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=detallepagocheque.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallepagocheque.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallepagocheque.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallepagocheque.getasientocontable_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallepagocheque.getejercicio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallepagocheque.getperiodo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallepagocheque.getvalor().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallepagocheque.getanio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallepagocheque.getmes_descripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelDetallePagoChequesSeleccionados() throws Exception {
		ArrayList<DetallePagoCheque> detallepagochequesSeleccionados=new ArrayList<DetallePagoCheque>();		
		
		detallepagochequesSeleccionados=this.getDetallePagoChequesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallepagocheque.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("DetallePagoCheques");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelDetallePagoCheque(row);				
				iRow++;
			}				
			
			for(DetallePagoCheque detallepagochequeAux:detallepagochequesSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelDetallePagoCheque(detallepagochequeAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallepagochequeSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Pago Cheque",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlDetallePagoChequesSeleccionados() throws Exception {
		ArrayList<DetallePagoCheque> detallepagochequesSeleccionados=new ArrayList<DetallePagoCheque>();		
		
		detallepagochequesSeleccionados=this.getDetallePagoChequesSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallepagocheque.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("detallepagocheques");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("detallepagocheque");
			//elementRoot.appendChild(element);
		
			for(DetallePagoCheque detallepagochequeAux:detallepagochequesSeleccionados) {
				element = document.createElement("detallepagocheque");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlDetallePagoCheque(detallepagochequeAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallepagochequeSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Pago Cheque",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelDetallePagoCheque(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(DetallePagoChequeConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(DetallePagoChequeConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(DetallePagoChequeConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(DetallePagoChequeConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(DetallePagoChequeConstantesFunciones.LABEL_IDASIENTOCONTABLE);
		cell = row.createCell(iColumn++);cell.setCellValue(DetallePagoChequeConstantesFunciones.LABEL_IDEJERCICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(DetallePagoChequeConstantesFunciones.LABEL_IDPERIODO);
		cell = row.createCell(iColumn++);cell.setCellValue(DetallePagoChequeConstantesFunciones.LABEL_VALOR);
		cell = row.createCell(iColumn++);cell.setCellValue(DetallePagoChequeConstantesFunciones.LABEL_IDANIO);
		cell = row.createCell(iColumn++);cell.setCellValue(DetallePagoChequeConstantesFunciones.LABEL_IDMES);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelDetallePagoCheque(DetallePagoCheque detallepagocheque,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(detallepagocheque.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(detallepagocheque.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detallepagocheque.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detallepagocheque.getasientocontable_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detallepagocheque.getejercicio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detallepagocheque.getperiodo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detallepagocheque.getvalor());
		cell = row.createCell(iColumn++);cell.setCellValue(detallepagocheque.getanio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detallepagocheque.getmes_descripcion());				
	}
	
	public void setFilaDatosExportarXmlDetallePagoCheque(DetallePagoCheque detallepagocheque,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(DetallePagoChequeConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(detallepagocheque.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(DetallePagoChequeConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(detallepagocheque.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(DetallePagoChequeConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(detallepagocheque.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(DetallePagoChequeConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(detallepagocheque.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementasientocontable_descripcion = document.createElement(DetallePagoChequeConstantesFunciones.IDASIENTOCONTABLE);
		elementasientocontable_descripcion.appendChild(document.createTextNode(detallepagocheque.getasientocontable_descripcion()));
		element.appendChild(elementasientocontable_descripcion);

		Element elementejercicio_descripcion = document.createElement(DetallePagoChequeConstantesFunciones.IDEJERCICIO);
		elementejercicio_descripcion.appendChild(document.createTextNode(detallepagocheque.getejercicio_descripcion()));
		element.appendChild(elementejercicio_descripcion);

		Element elementperiodo_descripcion = document.createElement(DetallePagoChequeConstantesFunciones.IDPERIODO);
		elementperiodo_descripcion.appendChild(document.createTextNode(detallepagocheque.getperiodo_descripcion()));
		element.appendChild(elementperiodo_descripcion);

		Element elementvalor = document.createElement(DetallePagoChequeConstantesFunciones.VALOR);
		elementvalor.appendChild(document.createTextNode(detallepagocheque.getvalor().toString().trim()));
		element.appendChild(elementvalor);

		Element elementanio_descripcion = document.createElement(DetallePagoChequeConstantesFunciones.IDANIO);
		elementanio_descripcion.appendChild(document.createTextNode(detallepagocheque.getanio_descripcion()));
		element.appendChild(elementanio_descripcion);

		Element elementmes_descripcion = document.createElement(DetallePagoChequeConstantesFunciones.IDMES);
		elementmes_descripcion.appendChild(document.createTextNode(detallepagocheque.getmes_descripcion()));
		element.appendChild(elementmes_descripcion);
	}
	
	public void generarReporteGroupGenericoDetallePagoChequesSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<DetallePagoCheque> detallepagochequesSeleccionados=new ArrayList<DetallePagoCheque>();
		
		detallepagochequesSeleccionados=this.getDetallePagoChequesSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoDetallePagoCheque(detallepagochequesSeleccionados);
		
		this.generarReporteDetallePagoCheques("Todos",detallepagochequesSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoDetallePagoCheque(ArrayList<DetallePagoCheque> detallepagochequesSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(DetallePagoCheque detallepagochequeAux:detallepagochequesSeleccionados) {
				detallepagochequeAux.setsDetalleGeneralEntityReporte(detallepagochequeAux.toString());
			
				if(sTipoSeleccionar.equals(DetallePagoChequeConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					detallepagochequeAux.setsDescripcionGeneralEntityReporte1(detallepagochequeAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetallePagoChequeConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					detallepagochequeAux.setsDescripcionGeneralEntityReporte1(detallepagochequeAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetallePagoChequeConstantesFunciones.LABEL_IDASIENTOCONTABLE)) {
					existe=true;
					detallepagochequeAux.setsDescripcionGeneralEntityReporte1(detallepagochequeAux.getasientocontable_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetallePagoChequeConstantesFunciones.LABEL_IDEJERCICIO)) {
					existe=true;
					detallepagochequeAux.setsDescripcionGeneralEntityReporte1(detallepagochequeAux.getejercicio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetallePagoChequeConstantesFunciones.LABEL_IDPERIODO)) {
					existe=true;
					detallepagochequeAux.setsDescripcionGeneralEntityReporte1(detallepagochequeAux.getperiodo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetallePagoChequeConstantesFunciones.LABEL_IDANIO)) {
					existe=true;
					detallepagochequeAux.setsDescripcionGeneralEntityReporte1(detallepagochequeAux.getanio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetallePagoChequeConstantesFunciones.LABEL_IDMES)) {
					existe=true;
					detallepagochequeAux.setsDescripcionGeneralEntityReporte1(detallepagochequeAux.getmes_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagoChequeConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesDetallePagoCheque(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoDetallePagoCheque=true;
				this.isVisibilidadCeldaNuevoRelacionesDetallePagoCheque=true;
				this.isVisibilidadCeldaGuardarCambiosDetallePagoCheque=true;
			}
			
			this.isVisibilidadCeldaModificarDetallePagoCheque=false;
			this.isVisibilidadCeldaActualizarDetallePagoCheque=false;
			this.isVisibilidadCeldaEliminarDetallePagoCheque=false;
			this.isVisibilidadCeldaCancelarDetallePagoCheque=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetallePagoCheque=true;
				} else {
					this.isVisibilidadCeldaGuardarDetallePagoCheque=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoDetallePagoCheque=false;
			this.isVisibilidadCeldaNuevoRelacionesDetallePagoCheque=false;
			this.isVisibilidadCeldaGuardarCambiosDetallePagoCheque=false;
			this.isVisibilidadCeldaModificarDetallePagoCheque=false;
			this.isVisibilidadCeldaActualizarDetallePagoCheque=true;
			this.isVisibilidadCeldaEliminarDetallePagoCheque=false;
			this.isVisibilidadCeldaCancelarDetallePagoCheque=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetallePagoCheque=true;
				} else {
					this.isVisibilidadCeldaGuardarDetallePagoCheque=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoDetallePagoCheque=false;
			this.isVisibilidadCeldaNuevoRelacionesDetallePagoCheque=false;
			this.isVisibilidadCeldaGuardarCambiosDetallePagoCheque=false;
			this.isVisibilidadCeldaModificarDetallePagoCheque=false;
			this.isVisibilidadCeldaActualizarDetallePagoCheque=true;
			this.isVisibilidadCeldaEliminarDetallePagoCheque=true;
			this.isVisibilidadCeldaCancelarDetallePagoCheque=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetallePagoCheque=true;
				} else {
					this.isVisibilidadCeldaGuardarDetallePagoCheque=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoDetallePagoCheque=false;
			this.isVisibilidadCeldaNuevoRelacionesDetallePagoCheque=false;
			this.isVisibilidadCeldaGuardarCambiosDetallePagoCheque=false;
			this.isVisibilidadCeldaModificarDetallePagoCheque=false;
			this.isVisibilidadCeldaActualizarDetallePagoCheque=true;
			this.isVisibilidadCeldaEliminarDetallePagoCheque=false;
			this.isVisibilidadCeldaCancelarDetallePagoCheque=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetallePagoCheque=false;
				} else {
					this.isVisibilidadCeldaGuardarDetallePagoCheque=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoDetallePagoCheque=true;
			this.isVisibilidadCeldaNuevoRelacionesDetallePagoCheque=true;
			this.isVisibilidadCeldaGuardarCambiosDetallePagoCheque=true;
			this.isVisibilidadCeldaModificarDetallePagoCheque=false;
			this.isVisibilidadCeldaActualizarDetallePagoCheque=false;
			this.isVisibilidadCeldaEliminarDetallePagoCheque=false;
			this.isVisibilidadCeldaCancelarDetallePagoCheque=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetallePagoCheque=true;
				} else {
					this.isVisibilidadCeldaGuardarDetallePagoCheque=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoDetallePagoCheque=false;
			this.isVisibilidadCeldaNuevoRelacionesDetallePagoCheque=false;
			this.isVisibilidadCeldaGuardarCambiosDetallePagoCheque=false;
			this.isVisibilidadCeldaActualizarDetallePagoCheque=false;
			this.isVisibilidadCeldaEliminarDetallePagoCheque=false;
			this.isVisibilidadCeldaCancelarDetallePagoCheque=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetallePagoCheque=false;
				} else {
					this.isVisibilidadCeldaGuardarDetallePagoCheque=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoDetallePagoCheque=false;
			this.isVisibilidadCeldaNuevoRelacionesDetallePagoCheque=false;
			this.isVisibilidadCeldaGuardarCambiosDetallePagoCheque=false;
			this.isVisibilidadCeldaModificarDetallePagoCheque=true;
			this.isVisibilidadCeldaActualizarDetallePagoCheque=false;
			this.isVisibilidadCeldaEliminarDetallePagoCheque=false;
			this.isVisibilidadCeldaCancelarDetallePagoCheque=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetallePagoCheque=false;
				} else {
					this.isVisibilidadCeldaGuardarDetallePagoCheque=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(DetallePagoChequeJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoDetallePagoCheque=true;
			this.isVisibilidadCeldaNuevoRelacionesDetallePagoCheque=true;
			this.isVisibilidadCeldaGuardarCambiosDetallePagoCheque=true;
		} else {
			this.actualizarEstadoPanelsDetallePagoCheque(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarDetallePagoCheque=false;
			//this.isVisibilidadCeldaVerFormDetallePagoCheque=false;
			this.isVisibilidadCeldaDuplicarDetallePagoCheque=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!detallepagochequeSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesDetallePagoCheque=false;
		} else {
			this.isVisibilidadCeldaNuevoDetallePagoCheque=false;
			this.isVisibilidadCeldaGuardarCambiosDetallePagoCheque=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(detallepagochequeSessionBean.getEsGuardarRelacionado()) {
			if(!detallepagochequeSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesDetallePagoCheque=false;												
			}
			
			this.jButtonCerrarDetallePagoCheque.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesDetallePagoCheque=false;
		}
		
		if(!this.permiteMantenimiento(this.detallepagocheque)) {
			this.isVisibilidadCeldaActualizarDetallePagoCheque=false;
			this.isVisibilidadCeldaEliminarDetallePagoCheque=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesDetallePagoCheque() {
	}
	
	public void actualizarEstadoPanelsDetallePagoCheque(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionDetallePagoCheque!=null) {
				this.jScrollPanelDatosEdicionDetallePagoCheque.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetallePagoCheque!=null) {
				this.jTabbedPaneBusquedasDetallePagoCheque.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetallePagoCheque!=null) {
				this.jScrollPanelDatosDetallePagoCheque.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetallePagoCheque!=null) {
				this.jPanelPaginacionDetallePagoCheque.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetallePagoCheque!=null) {
				this.jPanelParametrosReportesDetallePagoCheque.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionDetallePagoCheque!=null) {
				this.jScrollPanelDatosEdicionDetallePagoCheque.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetallePagoCheque!=null) {
				this.jTabbedPaneBusquedasDetallePagoCheque.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosDetallePagoCheque!=null) {
				this.jScrollPanelDatosDetallePagoCheque.setVisible(false);
			}
			
			if(this.jPanelPaginacionDetallePagoCheque!=null) {
				this.jPanelPaginacionDetallePagoCheque.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDetallePagoCheque!=null) {
				this.jPanelParametrosReportesDetallePagoCheque.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionDetallePagoCheque!=null) {
				this.jScrollPanelDatosEdicionDetallePagoCheque.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetallePagoCheque!=null) {
				this.jTabbedPaneBusquedasDetallePagoCheque.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDetallePagoCheque!=null) {
				this.jScrollPanelDatosDetallePagoCheque.setVisible(false);
			}
			
			if(this.jPanelPaginacionDetallePagoCheque!=null) {
				this.jPanelPaginacionDetallePagoCheque.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDetallePagoCheque!=null) {
				this.jPanelParametrosReportesDetallePagoCheque.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionDetallePagoCheque!=null) {
				this.jScrollPanelDatosEdicionDetallePagoCheque.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetallePagoCheque!=null) {
				this.jTabbedPaneBusquedasDetallePagoCheque.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDetallePagoCheque!=null) {
				this.jScrollPanelDatosDetallePagoCheque.setVisible(false);
			}
			
			if(this.jPanelPaginacionDetallePagoCheque!=null) {
				this.jPanelPaginacionDetallePagoCheque.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDetallePagoCheque!=null) {
				this.jPanelParametrosReportesDetallePagoCheque.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionDetallePagoCheque!=null) {
				this.jScrollPanelDatosEdicionDetallePagoCheque.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetallePagoCheque!=null) {
				this.jTabbedPaneBusquedasDetallePagoCheque.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetallePagoCheque!=null) {
				this.jScrollPanelDatosDetallePagoCheque.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetallePagoCheque!=null) {
				this.jPanelPaginacionDetallePagoCheque.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetallePagoCheque!=null) {
				this.jPanelParametrosReportesDetallePagoCheque.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionDetallePagoCheque!=null) {
				this.jScrollPanelDatosEdicionDetallePagoCheque.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetallePagoCheque!=null) {
				this.jTabbedPaneBusquedasDetallePagoCheque.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetallePagoCheque!=null) {
				this.jScrollPanelDatosDetallePagoCheque.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetallePagoCheque!=null) {
				this.jPanelPaginacionDetallePagoCheque.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetallePagoCheque!=null) {
				this.jPanelParametrosReportesDetallePagoCheque.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionDetallePagoCheque!=null) {
				this.jScrollPanelDatosEdicionDetallePagoCheque.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetallePagoCheque!=null) {
				this.jTabbedPaneBusquedasDetallePagoCheque.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetallePagoCheque!=null) {
				this.jScrollPanelDatosDetallePagoCheque.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetallePagoCheque!=null) {
				this.jPanelPaginacionDetallePagoCheque.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetallePagoCheque!=null) {
				this.jPanelParametrosReportesDetallePagoCheque.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.detallepagochequeSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasDetallePagoCheque!=null) {
					this.jTabbedPaneBusquedasDetallePagoCheque.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesDetallePagoCheque!=null) {
				this.jPanelParametrosReportesDetallePagoCheque.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.detallepagochequeSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetallePagoCheque!=null) {
				this.jTabbedPaneBusquedasDetallePagoCheque.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesDetallePagoCheque!=null) {
				this.jPanelParametrosReportesDetallePagoCheque.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdAsientoContable=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdAsientoContable) {this.jTabbedPaneBusquedasDetallePagoCheque.remove(jPanelFK_IdAsientoContableDetallePagoCheque);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdAsientoContable=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdAsientoContable) {this.jTabbedPaneBusquedasDetallePagoCheque.remove(jPanelFK_IdAsientoContableDetallePagoCheque);}
		}
		
	}

	public void setVisibilidadBusquedasParaAsientoContable(Boolean isParaAsientoContable){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaAsientoContableNegation=!isParaAsientoContable;

			this.isVisibilidadFK_IdAsientoContable=isParaAsientoContable;
			if(!this.isVisibilidadFK_IdAsientoContable) {this.jTabbedPaneBusquedasDetallePagoCheque.remove(jPanelFK_IdAsientoContableDetallePagoCheque);}
		}
		
	}

	public void setVisibilidadBusquedasParaEjercicio(Boolean isParaEjercicio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEjercicioNegation=!isParaEjercicio;

			this.isVisibilidadFK_IdAsientoContable=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdAsientoContable) {this.jTabbedPaneBusquedasDetallePagoCheque.remove(jPanelFK_IdAsientoContableDetallePagoCheque);}
		}
		
	}

	public void setVisibilidadBusquedasParaPeriodo(Boolean isParaPeriodo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPeriodoNegation=!isParaPeriodo;

			this.isVisibilidadFK_IdAsientoContable=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdAsientoContable) {this.jTabbedPaneBusquedasDetallePagoCheque.remove(jPanelFK_IdAsientoContableDetallePagoCheque);}
		}
		
	}

	public void setVisibilidadBusquedasParaAnio(Boolean isParaAnio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaAnioNegation=!isParaAnio;

			this.isVisibilidadFK_IdAsientoContable=isParaAnioNegation;
			if(!this.isVisibilidadFK_IdAsientoContable) {this.jTabbedPaneBusquedasDetallePagoCheque.remove(jPanelFK_IdAsientoContableDetallePagoCheque);}
		}
		
	}

	public void setVisibilidadBusquedasParaMes(Boolean isParaMes){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaMesNegation=!isParaMes;

			this.isVisibilidadFK_IdAsientoContable=isParaMesNegation;
			if(!this.isVisibilidadFK_IdAsientoContable) {this.jTabbedPaneBusquedasDetallePagoCheque.remove(jPanelFK_IdAsientoContableDetallePagoCheque);}
		}
		
	}
	
	
	
	

	public String registrarSesionDetallePagoChequeParaBusquedaAsientoContables() throws Exception {
		Boolean isPaginaPopupAsientoContable=false;

		try {

			if(detallepagochequeSessionBean==null) {
				detallepagochequeSessionBean=new DetallePagoChequeSessionBean();
			}

			if(asientocontableSessionBean==null) {
				asientocontableSessionBean=new AsientoContableSessionBean();
			}

			asientocontableSessionBean.setsPathNavegacionActual(detallepagochequeSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+AsientoContableConstantesFunciones.SCLASSWEBTITULO);
			asientocontableSessionBean.setisPermiteRecargarInformacion(false);
			asientocontableSessionBean.setisPaginaPopup(true);
			isPaginaPopupAsientoContable=asientocontableSessionBean.getisPaginaPopup();
			asientocontableSessionBean.setisPaginaPopup(false);
			asientocontableSessionBean.setEstaModoBusqueda(true);
			asientocontableSessionBean.setsFuncionBusquedaRapida("window.opener.detallepagochequeFuncionGeneral.setCombosCodigoDesdeBusquedaid_asiento_contable(TO_REPLACE);");
			asientocontableSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeAsientoContable(true);
			asientocontableSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeAsientoContable(DetallePagoChequeConstantesFunciones.SNOMBREOPCION);
			//asientocontableSessionBean.setisBusquedaDesdeForeignKeySesionDetallePagoCheque(true);
			//asientocontableSessionBean.setlidDetallePagoChequeActual(this.idDetallePagoChequeActual);

			detallepagochequeSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyDetallePagoCheque(true);
			detallepagochequeSessionBean.setlIdDetallePagoChequeActualForeignKey(this.idDetallePagoChequeActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//DetallePagoChequeSessionBean detallepagochequeSessionBean=new DetallePagoChequeSessionBean();
		
		if(this.detallepagochequeSessionBean==null) {
			this.detallepagochequeSessionBean=new DetallePagoChequeSessionBean();
		}
		
		this.detallepagochequeSessionBean.setsUltimaBusquedaDetallePagoCheque(this.getsAccionBusqueda());
		this.detallepagochequeSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.detallepagochequeSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdAsientoContable")) {
			detallepagochequeSessionBean.setid_asiento_contable(this.getid_asiento_contableFK_IdAsientoContable());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEjercicio")) {
			detallepagochequeSessionBean.setid_ejercicio(this.getid_ejercicioFK_IdEjercicio());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			detallepagochequeSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdPeriodo")) {
			detallepagochequeSessionBean.setid_periodo(this.getid_periodoFK_IdPeriodo());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			detallepagochequeSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//DetallePagoChequeSessionBean detallepagochequeSessionBean=new DetallePagoChequeSessionBean();
		
		if(this.detallepagochequeSessionBean==null) {
			this.detallepagochequeSessionBean=new DetallePagoChequeSessionBean();
		}
		
		if(this.detallepagochequeSessionBean.getsUltimaBusquedaDetallePagoCheque()!=null&&!this.detallepagochequeSessionBean.getsUltimaBusquedaDetallePagoCheque().equals("")) {
			this.setsAccionBusqueda(detallepagochequeSessionBean.getsUltimaBusquedaDetallePagoCheque());
			this.setiNumeroPaginacion(detallepagochequeSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(detallepagochequeSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdAsientoContable")) {
				this.setid_asiento_contableFK_IdAsientoContable(detallepagochequeSessionBean.getid_asiento_contable());
				detallepagochequeSessionBean.setid_asiento_contable(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEjercicio")) {
				this.setid_ejercicioFK_IdEjercicio(detallepagochequeSessionBean.getid_ejercicio());
				detallepagochequeSessionBean.setid_ejercicio(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(detallepagochequeSessionBean.getid_empresa());
				detallepagochequeSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdPeriodo")) {
				this.setid_periodoFK_IdPeriodo(detallepagochequeSessionBean.getid_periodo());
				detallepagochequeSessionBean.setid_periodo(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(detallepagochequeSessionBean.getid_sucursal());
				detallepagochequeSessionBean.setid_sucursal(-1L);
			}
		}
		
		this.detallepagochequeSessionBean.setsUltimaBusquedaDetallePagoCheque("");
		this.detallepagochequeSessionBean.setiNumeroPaginacion(DetallePagoChequeConstantesFunciones.INUMEROPAGINACION);
		this.detallepagochequeSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaDetallePagoCheque(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioDetallePagoCheque() {
		this.updateBorderResaltarBusquedasFormularioDetallePagoCheque();
		this.updateVisibilidadBusquedasFormularioDetallePagoCheque();
		this.updateHabilitarBusquedasFormularioDetallePagoCheque();
	}
	
	public void updateBorderResaltarBusquedasFormularioDetallePagoCheque() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasDetallePagoCheque.getComponents().length>0) {
	

		if(this.detallepagochequeConstantesFunciones.resaltarFK_IdAsientoContableDetallePagoCheque!=null) {
			index= this.jTabbedPaneBusquedasDetallePagoCheque.indexOfComponent(this.jPanelFK_IdAsientoContableDetallePagoCheque);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetallePagoCheque.getComponent(index);
				jPanel.setBorder(this.detallepagochequeConstantesFunciones.resaltarFK_IdAsientoContableDetallePagoCheque);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioDetallePagoCheque() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasDetallePagoCheque.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDetallePagoCheque.indexOfComponent(this.jPanelFK_IdAsientoContableDetallePagoCheque);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDetallePagoCheque.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.detallepagochequeConstantesFunciones.mostrarFK_IdAsientoContableDetallePagoCheque);
			if(!this.detallepagochequeConstantesFunciones.mostrarFK_IdAsientoContableDetallePagoCheque && index>-1) {
				this.jTabbedPaneBusquedasDetallePagoCheque.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioDetallePagoCheque() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasDetallePagoCheque.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDetallePagoCheque.indexOfComponent(this.jPanelFK_IdAsientoContableDetallePagoCheque);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDetallePagoCheque.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.detallepagochequeConstantesFunciones.activarFK_IdAsientoContableDetallePagoCheque);
				this.jTabbedPaneBusquedasDetallePagoCheque.setEnabledAt(index,this.detallepagochequeConstantesFunciones.activarFK_IdAsientoContableDetallePagoCheque);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaDetallePagoCheque(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdAsientoContable")) {
			index= this.jTabbedPaneBusquedasDetallePagoCheque.indexOfComponent(this.jPanelFK_IdAsientoContableDetallePagoCheque);

			this.jTabbedPaneBusquedasDetallePagoCheque.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetallePagoCheque.getComponent(index);

			this.detallepagochequeConstantesFunciones.setResaltarFK_IdAsientoContableDetallePagoCheque(resaltar);

			jPanel.setBorder(this.detallepagochequeConstantesFunciones.resaltarFK_IdAsientoContableDetallePagoCheque);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarDetallePagoCheque.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioDetallePagoCheque() throws Exception {

		if(this.jInternalFrameDetalleFormDetallePagoCheque==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioDetallePagoCheque();
		this.updateVisibilidadResaltarControlesFormularioDetallePagoCheque();
		this.updateHabilitarResaltarControlesFormularioDetallePagoCheque();
		
	}
	
	public void updateBorderResaltarControlesFormularioDetallePagoCheque() throws Exception {
		if(this.jInternalFrameDetalleFormDetallePagoCheque==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.detallepagochequeConstantesFunciones.resaltaridDetallePagoCheque!=null && this.jInternalFrameDetalleFormDetallePagoCheque!=null) {this.jInternalFrameDetalleFormDetallePagoCheque.jLabelidDetallePagoCheque.setBorder(this.detallepagochequeConstantesFunciones.resaltaridDetallePagoCheque);}
		if(this.detallepagochequeConstantesFunciones.resaltarid_empresaDetallePagoCheque!=null && this.jInternalFrameDetalleFormDetallePagoCheque!=null) {this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_empresaDetallePagoCheque.setBorder(this.detallepagochequeConstantesFunciones.resaltarid_empresaDetallePagoCheque);}
		if(this.detallepagochequeConstantesFunciones.resaltarid_sucursalDetallePagoCheque!=null && this.jInternalFrameDetalleFormDetallePagoCheque!=null) {this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_sucursalDetallePagoCheque.setBorder(this.detallepagochequeConstantesFunciones.resaltarid_sucursalDetallePagoCheque);}
		if(this.detallepagochequeConstantesFunciones.resaltarid_asiento_contableDetallePagoCheque!=null && this.jInternalFrameDetalleFormDetallePagoCheque!=null) {this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_asiento_contableDetallePagoCheque.setBorder(this.detallepagochequeConstantesFunciones.resaltarid_asiento_contableDetallePagoCheque);}
		if(this.detallepagochequeConstantesFunciones.resaltarid_ejercicioDetallePagoCheque!=null && this.jInternalFrameDetalleFormDetallePagoCheque!=null) {this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_ejercicioDetallePagoCheque.setBorder(this.detallepagochequeConstantesFunciones.resaltarid_ejercicioDetallePagoCheque);}
		if(this.detallepagochequeConstantesFunciones.resaltarid_periodoDetallePagoCheque!=null && this.jInternalFrameDetalleFormDetallePagoCheque!=null) {this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_periodoDetallePagoCheque.setBorder(this.detallepagochequeConstantesFunciones.resaltarid_periodoDetallePagoCheque);}
		if(this.detallepagochequeConstantesFunciones.resaltarvalorDetallePagoCheque!=null && this.jInternalFrameDetalleFormDetallePagoCheque!=null) {this.jInternalFrameDetalleFormDetallePagoCheque.jTextFieldvalorDetallePagoCheque.setBorder(this.detallepagochequeConstantesFunciones.resaltarvalorDetallePagoCheque);}
		if(this.detallepagochequeConstantesFunciones.resaltarid_anioDetallePagoCheque!=null && this.jInternalFrameDetalleFormDetallePagoCheque!=null) {this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_anioDetallePagoCheque.setBorder(this.detallepagochequeConstantesFunciones.resaltarid_anioDetallePagoCheque);}
		if(this.detallepagochequeConstantesFunciones.resaltarid_mesDetallePagoCheque!=null && this.jInternalFrameDetalleFormDetallePagoCheque!=null) {this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_mesDetallePagoCheque.setBorder(this.detallepagochequeConstantesFunciones.resaltarid_mesDetallePagoCheque);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioDetallePagoCheque() throws Exception {		
		if(this.jInternalFrameDetalleFormDetallePagoCheque==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDetallePagoCheque!=null) {
	
		//this.jInternalFrameDetalleFormDetallePagoCheque.jLabelidDetallePagoCheque.setVisible(this.detallepagochequeConstantesFunciones.mostraridDetallePagoCheque);
		this.jInternalFrameDetalleFormDetallePagoCheque.jPanelidDetallePagoCheque.setVisible(this.detallepagochequeConstantesFunciones.mostraridDetallePagoCheque);
		//this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_empresaDetallePagoCheque.setVisible(this.detallepagochequeConstantesFunciones.mostrarid_empresaDetallePagoCheque);
		this.jInternalFrameDetalleFormDetallePagoCheque.jPanelid_empresaDetallePagoCheque.setVisible(this.detallepagochequeConstantesFunciones.mostrarid_empresaDetallePagoCheque);
		//this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_sucursalDetallePagoCheque.setVisible(this.detallepagochequeConstantesFunciones.mostrarid_sucursalDetallePagoCheque);
		this.jInternalFrameDetalleFormDetallePagoCheque.jPanelid_sucursalDetallePagoCheque.setVisible(this.detallepagochequeConstantesFunciones.mostrarid_sucursalDetallePagoCheque);
		//this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_asiento_contableDetallePagoCheque.setVisible(this.detallepagochequeConstantesFunciones.mostrarid_asiento_contableDetallePagoCheque);
		this.jInternalFrameDetalleFormDetallePagoCheque.jPanelid_asiento_contableDetallePagoCheque.setVisible(this.detallepagochequeConstantesFunciones.mostrarid_asiento_contableDetallePagoCheque);
			this.jInternalFrameDetalleFormDetallePagoCheque.jButtonid_asiento_contableDetallePagoCheque.setVisible(this.detallepagochequeConstantesFunciones.mostrarid_asiento_contableDetallePagoCheque);
		//this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_ejercicioDetallePagoCheque.setVisible(this.detallepagochequeConstantesFunciones.mostrarid_ejercicioDetallePagoCheque);
		this.jInternalFrameDetalleFormDetallePagoCheque.jPanelid_ejercicioDetallePagoCheque.setVisible(this.detallepagochequeConstantesFunciones.mostrarid_ejercicioDetallePagoCheque);
		//this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_periodoDetallePagoCheque.setVisible(this.detallepagochequeConstantesFunciones.mostrarid_periodoDetallePagoCheque);
		this.jInternalFrameDetalleFormDetallePagoCheque.jPanelid_periodoDetallePagoCheque.setVisible(this.detallepagochequeConstantesFunciones.mostrarid_periodoDetallePagoCheque);
		//this.jInternalFrameDetalleFormDetallePagoCheque.jTextFieldvalorDetallePagoCheque.setVisible(this.detallepagochequeConstantesFunciones.mostrarvalorDetallePagoCheque);
		this.jInternalFrameDetalleFormDetallePagoCheque.jPanelvalorDetallePagoCheque.setVisible(this.detallepagochequeConstantesFunciones.mostrarvalorDetallePagoCheque);
		//this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_anioDetallePagoCheque.setVisible(this.detallepagochequeConstantesFunciones.mostrarid_anioDetallePagoCheque);
		this.jInternalFrameDetalleFormDetallePagoCheque.jPanelid_anioDetallePagoCheque.setVisible(this.detallepagochequeConstantesFunciones.mostrarid_anioDetallePagoCheque);
		//this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_mesDetallePagoCheque.setVisible(this.detallepagochequeConstantesFunciones.mostrarid_mesDetallePagoCheque);
		this.jInternalFrameDetalleFormDetallePagoCheque.jPanelid_mesDetallePagoCheque.setVisible(this.detallepagochequeConstantesFunciones.mostrarid_mesDetallePagoCheque);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioDetallePagoCheque() throws Exception {
		if(this.jInternalFrameDetalleFormDetallePagoCheque==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDetallePagoCheque!=null) {
	
		this.jInternalFrameDetalleFormDetallePagoCheque.jLabelidDetallePagoCheque.setEnabled(this.detallepagochequeConstantesFunciones.activaridDetallePagoCheque);
		this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_empresaDetallePagoCheque.setEnabled(this.detallepagochequeConstantesFunciones.activarid_empresaDetallePagoCheque);
		this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_sucursalDetallePagoCheque.setEnabled(this.detallepagochequeConstantesFunciones.activarid_sucursalDetallePagoCheque);
		this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_asiento_contableDetallePagoCheque.setEnabled(this.detallepagochequeConstantesFunciones.activarid_asiento_contableDetallePagoCheque);
			this.jInternalFrameDetalleFormDetallePagoCheque.jButtonid_asiento_contableDetallePagoCheque.setEnabled(this.detallepagochequeConstantesFunciones.activarid_asiento_contableDetallePagoCheque);
		this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_ejercicioDetallePagoCheque.setEnabled(this.detallepagochequeConstantesFunciones.activarid_ejercicioDetallePagoCheque);
		this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_periodoDetallePagoCheque.setEnabled(this.detallepagochequeConstantesFunciones.activarid_periodoDetallePagoCheque);
		this.jInternalFrameDetalleFormDetallePagoCheque.jTextFieldvalorDetallePagoCheque.setEnabled(this.detallepagochequeConstantesFunciones.activarvalorDetallePagoCheque);
		this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_anioDetallePagoCheque.setEnabled(this.detallepagochequeConstantesFunciones.activarid_anioDetallePagoCheque);
		this.jInternalFrameDetalleFormDetallePagoCheque.jComboBoxid_mesDetallePagoCheque.setEnabled(this.detallepagochequeConstantesFunciones.activarid_mesDetallePagoCheque);
		}
	}
	
		
}