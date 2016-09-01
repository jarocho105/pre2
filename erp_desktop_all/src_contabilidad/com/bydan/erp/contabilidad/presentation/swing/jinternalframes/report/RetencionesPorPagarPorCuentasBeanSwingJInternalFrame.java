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

//import com.bydan.erp.contabilidad.util.RetencionesPorPagarPorCuentasConstantesFunciones;
import com.bydan.erp.contabilidad.util.report.RetencionesPorPagarPorCuentasParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.report.RetencionesPorPagarPorCuentasParameterGeneral;
//import com.bydan.erp.contabilidad.presentation.report.source.report.RetencionesPorPagarPorCuentasBean;
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
public class RetencionesPorPagarPorCuentasBeanSwingJInternalFrame extends RetencionesPorPagarPorCuentasJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(RetencionesPorPagarPorCuentasBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<RetencionesPorPagarPorCuentas> retencionesporpagarporcuentasValidator = new ClassValidator<RetencionesPorPagarPorCuentas>(RetencionesPorPagarPorCuentas.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public RetencionesPorPagarPorCuentas retencionesporpagarporcuentas;	
	public RetencionesPorPagarPorCuentas retencionesporpagarporcuentasAux;
	public RetencionesPorPagarPorCuentas retencionesporpagarporcuentasAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public RetencionesPorPagarPorCuentas retencionesporpagarporcuentasTotales;
	public Long idRetencionesPorPagarPorCuentasActual;
	public Long iIdNuevoRetencionesPorPagarPorCuentas=0L;
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

	public String sFinalQueryComboTipoRetencion="";

	public List<TipoRetencion> tiporetencionsForeignKey;

	public List<TipoRetencion> gettiporetencionsForeignKey() {
		return tiporetencionsForeignKey;
	}

	public void settiporetencionsForeignKey(List<TipoRetencion> tiporetencionsForeignKey) {
		this.tiporetencionsForeignKey = tiporetencionsForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoRetencion tiporetencionForeignKey;

	public TipoRetencion gettiporetencionForeignKey() {
		return tiporetencionForeignKey;
	}

	public void settiporetencionForeignKey(TipoRetencion tiporetencionForeignKey) {
		this.tiporetencionForeignKey = tiporetencionForeignKey;
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
	
	public Boolean isPermisoTodoRetencionesPorPagarPorCuentas;
	public Boolean isPermisoNuevoRetencionesPorPagarPorCuentas;
	public Boolean isPermisoActualizarRetencionesPorPagarPorCuentas;
	public Boolean isPermisoActualizarOriginalRetencionesPorPagarPorCuentas;
	public Boolean isPermisoEliminarRetencionesPorPagarPorCuentas;
	public Boolean isPermisoGuardarCambiosRetencionesPorPagarPorCuentas;
	public Boolean isPermisoConsultaRetencionesPorPagarPorCuentas;
	public Boolean isPermisoBusquedaRetencionesPorPagarPorCuentas;
	public Boolean isPermisoReporteRetencionesPorPagarPorCuentas;
	public Boolean isPermisoPaginacionMedioRetencionesPorPagarPorCuentas;
	public Boolean isPermisoPaginacionAltoRetencionesPorPagarPorCuentas;
	public Boolean isPermisoPaginacionTodoRetencionesPorPagarPorCuentas;
	public Boolean isPermisoCopiarRetencionesPorPagarPorCuentas;
	public Boolean isPermisoVerFormRetencionesPorPagarPorCuentas;
	public Boolean isPermisoDuplicarRetencionesPorPagarPorCuentas;
	public Boolean isPermisoOrdenRetencionesPorPagarPorCuentas;
	
	
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
	
	public RetencionesPorPagarPorCuentasParameterReturnGeneral retencionesporpagarporcuentasReturnGeneral;
	public RetencionesPorPagarPorCuentasParameterReturnGeneral retencionesporpagarporcuentasParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoRetencionesPorPagarPorCuentas=false;
	public Boolean esParaAccionDesdeFormularioRetencionesPorPagarPorCuentas=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected RetencionesPorPagarPorCuentasSessionBeanAdditional retencionesporpagarporcuentasSessionBeanAdditional=null;
	
	public RetencionesPorPagarPorCuentasSessionBeanAdditional getRetencionesPorPagarPorCuentasSessionBeanAdditional() {
		return this.retencionesporpagarporcuentasSessionBeanAdditional;
	}
	
	public void setRetencionesPorPagarPorCuentasSessionBeanAdditional(RetencionesPorPagarPorCuentasSessionBeanAdditional retencionesporpagarporcuentasSessionBeanAdditional) {
		try {
			this.retencionesporpagarporcuentasSessionBeanAdditional=retencionesporpagarporcuentasSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected RetencionesPorPagarPorCuentasBeanSwingJInternalFrameAdditional retencionesporpagarporcuentasBeanSwingJInternalFrameAdditional=null;
	//public class RetencionesPorPagarPorCuentasBeanSwingJInternalFrame
	
	public RetencionesPorPagarPorCuentasBeanSwingJInternalFrameAdditional getRetencionesPorPagarPorCuentasBeanSwingJInternalFrameAdditional() {
		return this.retencionesporpagarporcuentasBeanSwingJInternalFrameAdditional;
	}
	
	public void setRetencionesPorPagarPorCuentasBeanSwingJInternalFrameAdditional(RetencionesPorPagarPorCuentasBeanSwingJInternalFrameAdditional retencionesporpagarporcuentasBeanSwingJInternalFrameAdditional) {
		try {
			this.retencionesporpagarporcuentasBeanSwingJInternalFrameAdditional=retencionesporpagarporcuentasBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public RetencionesPorPagarPorCuentasLogic retencionesporpagarporcuentasLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public RetencionesPorPagarPorCuentas retencionesporpagarporcuentasBean;
	public RetencionesPorPagarPorCuentasConstantesFunciones retencionesporpagarporcuentasConstantesFunciones;
	//public RetencionesPorPagarPorCuentasParameterReturnGeneral retencionesporpagarporcuentasReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public EjercicioLogic ejercicioLogic;
	public PeriodoLogic periodoLogic;
	public TipoRetencionLogic tiporetencionLogic;
	
	//PARAMETROS
	
	
	//public List<RetencionesPorPagarPorCuentas> retencionesporpagarporcuentass;	
	//public List<RetencionesPorPagarPorCuentas> retencionesporpagarporcuentassEliminados;
	//public List<RetencionesPorPagarPorCuentas> retencionesporpagarporcuentassAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoRetencionesPorPagarPorCuentas=false;
	public Boolean isVisibilidadCeldaDuplicarRetencionesPorPagarPorCuentas=true;
	public Boolean isVisibilidadCeldaCopiarRetencionesPorPagarPorCuentas=true;
	public Boolean isVisibilidadCeldaVerFormRetencionesPorPagarPorCuentas=true;
	public Boolean isVisibilidadCeldaOrdenRetencionesPorPagarPorCuentas=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesRetencionesPorPagarPorCuentas=false;
	public Boolean isVisibilidadCeldaModificarRetencionesPorPagarPorCuentas=false;
	public Boolean isVisibilidadCeldaActualizarRetencionesPorPagarPorCuentas=false;
	public Boolean isVisibilidadCeldaEliminarRetencionesPorPagarPorCuentas=false;
	public Boolean isVisibilidadCeldaCancelarRetencionesPorPagarPorCuentas=false;
	public Boolean isVisibilidadCeldaGuardarRetencionesPorPagarPorCuentas=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosRetencionesPorPagarPorCuentas=false;	
	
	
	public Boolean isVisibilidadBusquedaRetencionesPorPagarPorCuentas=false;
	public Boolean isVisibilidadFK_IdEjercicio=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdPeriodo=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdTipoRetencion=false;
	
	public Long getiIdNuevoRetencionesPorPagarPorCuentas() {
		return this.iIdNuevoRetencionesPorPagarPorCuentas;
	}

	public void setiIdNuevoRetencionesPorPagarPorCuentas(Long iIdNuevoRetencionesPorPagarPorCuentas) {
		this.iIdNuevoRetencionesPorPagarPorCuentas = iIdNuevoRetencionesPorPagarPorCuentas;
	}
	
	public Long getidRetencionesPorPagarPorCuentasActual() {
		return this.idRetencionesPorPagarPorCuentasActual;
	}

	public void setidRetencionesPorPagarPorCuentasActual(Long idRetencionesPorPagarPorCuentasActual) {
		this.idRetencionesPorPagarPorCuentasActual = idRetencionesPorPagarPorCuentasActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public RetencionesPorPagarPorCuentas getretencionesporpagarporcuentas() {
		return this.retencionesporpagarporcuentas;
	}

	public void setretencionesporpagarporcuentas(RetencionesPorPagarPorCuentas retencionesporpagarporcuentas) {
		this.retencionesporpagarporcuentas = retencionesporpagarporcuentas;
	}
	
	public RetencionesPorPagarPorCuentas getretencionesporpagarporcuentasAux() {
		return this.retencionesporpagarporcuentasAux;
	}

	public void setretencionesporpagarporcuentasAux(RetencionesPorPagarPorCuentas retencionesporpagarporcuentasAux) {
		this.retencionesporpagarporcuentasAux = retencionesporpagarporcuentasAux;
	}				
	
	public RetencionesPorPagarPorCuentas getretencionesporpagarporcuentasAnterior() {
		return this.retencionesporpagarporcuentasAnterior;
	}

	public void setretencionesporpagarporcuentasAnterior(RetencionesPorPagarPorCuentas retencionesporpagarporcuentasAnterior) {
		this.retencionesporpagarporcuentasAnterior = retencionesporpagarporcuentasAnterior;
	}	
	
	public RetencionesPorPagarPorCuentas getretencionesporpagarporcuentasTotales() {
		return this.retencionesporpagarporcuentasTotales;
	}

	public void setretencionesporpagarporcuentasTotales(RetencionesPorPagarPorCuentas retencionesporpagarporcuentasTotales) {
		this.retencionesporpagarporcuentasTotales = retencionesporpagarporcuentasTotales;
	}	
	
	public RetencionesPorPagarPorCuentas getretencionesporpagarporcuentasBean() {
		return this.retencionesporpagarporcuentasBean;
	}

	public void setretencionesporpagarporcuentasBean(RetencionesPorPagarPorCuentas retencionesporpagarporcuentasBean) {
		this.retencionesporpagarporcuentasBean = retencionesporpagarporcuentasBean;
	}	
	
	public RetencionesPorPagarPorCuentasParameterReturnGeneral getretencionesporpagarporcuentasReturnGeneral() {
		return this.retencionesporpagarporcuentasReturnGeneral;
	}

	public void setretencionesporpagarporcuentasReturnGeneral(RetencionesPorPagarPorCuentasParameterReturnGeneral retencionesporpagarporcuentasReturnGeneral) {
		this.retencionesporpagarporcuentasReturnGeneral = retencionesporpagarporcuentasReturnGeneral;
	}	
	
	
	public Long id_ejercicioBusquedaRetencionesPorPagarPorCuentas=-1L;

	public Long getid_ejercicioBusquedaRetencionesPorPagarPorCuentas() {
		return this.id_ejercicioBusquedaRetencionesPorPagarPorCuentas;
	}

	public void setid_ejercicioBusquedaRetencionesPorPagarPorCuentas(Long id_ejercicioBusquedaRetencionesPorPagarPorCuentas) {
		this.id_ejercicioBusquedaRetencionesPorPagarPorCuentas = id_ejercicioBusquedaRetencionesPorPagarPorCuentas;
	}

;
	public Long id_periodoBusquedaRetencionesPorPagarPorCuentas=-1L;

	public Long getid_periodoBusquedaRetencionesPorPagarPorCuentas() {
		return this.id_periodoBusquedaRetencionesPorPagarPorCuentas;
	}

	public void setid_periodoBusquedaRetencionesPorPagarPorCuentas(Long id_periodoBusquedaRetencionesPorPagarPorCuentas) {
		this.id_periodoBusquedaRetencionesPorPagarPorCuentas = id_periodoBusquedaRetencionesPorPagarPorCuentas;
	}

;
	public Long id_tipo_retencionBusquedaRetencionesPorPagarPorCuentas=-1L;

	public Long getid_tipo_retencionBusquedaRetencionesPorPagarPorCuentas() {
		return this.id_tipo_retencionBusquedaRetencionesPorPagarPorCuentas;
	}

	public void setid_tipo_retencionBusquedaRetencionesPorPagarPorCuentas(Long id_tipo_retencionBusquedaRetencionesPorPagarPorCuentas) {
		this.id_tipo_retencionBusquedaRetencionesPorPagarPorCuentas = id_tipo_retencionBusquedaRetencionesPorPagarPorCuentas;
	}

;
	public Boolean es_debitoBusquedaRetencionesPorPagarPorCuentas=false;

	public Boolean getes_debitoBusquedaRetencionesPorPagarPorCuentas() {
		return this.es_debitoBusquedaRetencionesPorPagarPorCuentas;
	}

	public void setes_debitoBusquedaRetencionesPorPagarPorCuentas(Boolean es_debitoBusquedaRetencionesPorPagarPorCuentas) {
		this.es_debitoBusquedaRetencionesPorPagarPorCuentas = es_debitoBusquedaRetencionesPorPagarPorCuentas;
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

	public Long id_tipo_retencionFK_IdTipoRetencion=-1L;

	public Long getid_tipo_retencionFK_IdTipoRetencion() {
		return this.id_tipo_retencionFK_IdTipoRetencion;
	}

	public void setid_tipo_retencionFK_IdTipoRetencion(Long id_tipo_retencionFK_IdTipoRetencion) {
		this.id_tipo_retencionFK_IdTipoRetencion = id_tipo_retencionFK_IdTipoRetencion;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public RetencionesPorPagarPorCuentasLogic getRetencionesPorPagarPorCuentasLogic()	{		
		return retencionesporpagarporcuentasLogic;
	}

	public void setRetencionesPorPagarPorCuentasLogic(RetencionesPorPagarPorCuentasLogic retencionesporpagarporcuentasLogic) {
		this.retencionesporpagarporcuentasLogic = retencionesporpagarporcuentasLogic;
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
	
	public Boolean getIsEsNuevoRetencionesPorPagarPorCuentas() {
		return isEsNuevoRetencionesPorPagarPorCuentas;
	}

	public void setIsEsNuevoRetencionesPorPagarPorCuentas(Boolean isEsNuevoRetencionesPorPagarPorCuentas) {
		this.isEsNuevoRetencionesPorPagarPorCuentas = isEsNuevoRetencionesPorPagarPorCuentas;
	}

	public Boolean getEsParaAccionDesdeFormularioRetencionesPorPagarPorCuentas() {
		return esParaAccionDesdeFormularioRetencionesPorPagarPorCuentas;
	}
	
	public void setEsParaAccionDesdeFormularioRetencionesPorPagarPorCuentas(Boolean esParaAccionDesdeFormularioRetencionesPorPagarPorCuentas) {
		this.esParaAccionDesdeFormularioRetencionesPorPagarPorCuentas = esParaAccionDesdeFormularioRetencionesPorPagarPorCuentas;
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

			if(this.retencionesporpagarporcuentasSessionBean==null) {
				this.retencionesporpagarporcuentasSessionBean=new RetencionesPorPagarPorCuentasSessionBean();
			}

			if(!this.retencionesporpagarporcuentasSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(retencionesporpagarporcuentasSessionBean.getlidEmpresaActual());
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

			if(this.retencionesporpagarporcuentasSessionBean==null) {
				this.retencionesporpagarporcuentasSessionBean=new RetencionesPorPagarPorCuentasSessionBean();
			}

			if(!this.retencionesporpagarporcuentasSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(retencionesporpagarporcuentasSessionBean.getlidSucursalActual());
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

			if(this.retencionesporpagarporcuentasSessionBean==null) {
				this.retencionesporpagarporcuentasSessionBean=new RetencionesPorPagarPorCuentasSessionBean();
			}

			if(!this.retencionesporpagarporcuentasSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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
					ejercicioLogic.getEntityWithConnection(retencionesporpagarporcuentasSessionBean.getlidEjercicioActual());
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

			if(this.retencionesporpagarporcuentasSessionBean==null) {
				this.retencionesporpagarporcuentasSessionBean=new RetencionesPorPagarPorCuentasSessionBean();
			}

			if(!this.retencionesporpagarporcuentasSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
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
					periodoLogic.getEntityWithConnection(retencionesporpagarporcuentasSessionBean.getlidPeriodoActual());
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

	public void cargarCombosTipoRetencionsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tiporetencionsForeignKey=new ArrayList<TipoRetencion>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoRetencionLogic tiporetencionLogic=new TipoRetencionLogic();

			//tiporetencionLogic.getTipoRetencionDataAccess().setIsForForeingKeyData(true);

			if(this.retencionesporpagarporcuentasSessionBean==null) {
				this.retencionesporpagarporcuentasSessionBean=new RetencionesPorPagarPorCuentasSessionBean();
			}

			if(!this.retencionesporpagarporcuentasSessionBean.getisBusquedaDesdeForeignKeySesionTipoRetencion()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tiporetencionLogic.getTipoRetencionDataAccess().setIsForForeingKeyData(true);

					tiporetencionLogic.getTodosTipoRetencionsWithConnection(sFinalQuery,new Pagination());

					this.tiporetencionsForeignKey=tiporetencionLogic.getTipoRetencions();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoRetencion(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiporetencionLogic.getEntityWithConnection(retencionesporpagarporcuentasSessionBean.getlidTipoRetencionActual());
					this.tiporetencionsForeignKey.add(tiporetencionLogic.getTipoRetencion());
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

					if(this.retencionesporpagarporcuentas!=null) {
						this.retencionesporpagarporcuentas.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) {
						this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxid_empresaRetencionesPorPagarPorCuentas.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaRetencionesPorPagarPorCuentas.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) {
						if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxid_empresaRetencionesPorPagarPorCuentas.getItemCount()>0) {
							this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxid_empresaRetencionesPorPagarPorCuentas.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaRetencionesPorPagarPorCuentasGenerico)throws Exception
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
				jComboBoxid_empresaRetencionesPorPagarPorCuentasGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaRetencionesPorPagarPorCuentasGenerico!=null && jComboBoxid_empresaRetencionesPorPagarPorCuentasGenerico.getItemCount()>0) {
					jComboBoxid_empresaRetencionesPorPagarPorCuentasGenerico.setSelectedIndex(0);
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

					if(this.retencionesporpagarporcuentas!=null) {
						this.retencionesporpagarporcuentas.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) {
						this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxid_sucursalRetencionesPorPagarPorCuentas.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalRetencionesPorPagarPorCuentas.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) {
						if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxid_sucursalRetencionesPorPagarPorCuentas.getItemCount()>0) {
							this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxid_sucursalRetencionesPorPagarPorCuentas.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalRetencionesPorPagarPorCuentasGenerico)throws Exception
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
				jComboBoxid_sucursalRetencionesPorPagarPorCuentasGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalRetencionesPorPagarPorCuentasGenerico!=null && jComboBoxid_sucursalRetencionesPorPagarPorCuentasGenerico.getItemCount()>0) {
					jComboBoxid_sucursalRetencionesPorPagarPorCuentasGenerico.setSelectedIndex(0);
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

					if(this.retencionesporpagarporcuentas!=null) {
						this.retencionesporpagarporcuentas.setEjercicio(ejercicioTemp);
					}

					if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) {
						this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxid_ejercicioRetencionesPorPagarPorCuentas.setSelectedItem(ejercicioTemp);
					}
				} else {
					//jComboBoxid_ejercicioRetencionesPorPagarPorCuentas.setSelectedItem(ejercicioTemp);
					if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) {
						if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxid_ejercicioRetencionesPorPagarPorCuentas.getItemCount()>0) {
							this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxid_ejercicioRetencionesPorPagarPorCuentas.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaRetencionesPorPagarPorCuentas") || sFormularioTipoBusqueda.equals("Todos")){
					if(ejercicioTemp!=null && jComboBoxid_ejercicioBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas!=null) {
						jComboBoxid_ejercicioBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas.setSelectedItem(ejercicioTemp);
					} else {
						if(jComboBoxid_ejercicioBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas!=null) {
							//jComboBoxid_ejercicioBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas.setSelectedItem(ejercicioTemp);
							if(jComboBoxid_ejercicioBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas.getItemCount()>0) {
								jComboBoxid_ejercicioBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas.setSelectedIndex(0);
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
	public void setActualEjercicioForeignKeyGenerico(Long idEjercicioSeleccionado,JComboBox jComboBoxid_ejercicioRetencionesPorPagarPorCuentasGenerico)throws Exception
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
				jComboBoxid_ejercicioRetencionesPorPagarPorCuentasGenerico.setSelectedItem(ejercicioTemp);
			} else {
				if(jComboBoxid_ejercicioRetencionesPorPagarPorCuentasGenerico!=null && jComboBoxid_ejercicioRetencionesPorPagarPorCuentasGenerico.getItemCount()>0) {
					jComboBoxid_ejercicioRetencionesPorPagarPorCuentasGenerico.setSelectedIndex(0);
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

					if(this.retencionesporpagarporcuentas!=null) {
						this.retencionesporpagarporcuentas.setPeriodo(periodoTemp);
					}

					if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) {
						this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxid_periodoRetencionesPorPagarPorCuentas.setSelectedItem(periodoTemp);
					}
				} else {
					//jComboBoxid_periodoRetencionesPorPagarPorCuentas.setSelectedItem(periodoTemp);
					if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) {
						if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxid_periodoRetencionesPorPagarPorCuentas.getItemCount()>0) {
							this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxid_periodoRetencionesPorPagarPorCuentas.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaRetencionesPorPagarPorCuentas") || sFormularioTipoBusqueda.equals("Todos")){
					if(periodoTemp!=null && jComboBoxid_periodoBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas!=null) {
						jComboBoxid_periodoBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas.setSelectedItem(periodoTemp);
					} else {
						if(jComboBoxid_periodoBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas!=null) {
							//jComboBoxid_periodoBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas.setSelectedItem(periodoTemp);
							if(jComboBoxid_periodoBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas.getItemCount()>0) {
								jComboBoxid_periodoBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas.setSelectedIndex(0);
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
	public void setActualPeriodoForeignKeyGenerico(Long idPeriodoSeleccionado,JComboBox jComboBoxid_periodoRetencionesPorPagarPorCuentasGenerico)throws Exception
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
				jComboBoxid_periodoRetencionesPorPagarPorCuentasGenerico.setSelectedItem(periodoTemp);
			} else {
				if(jComboBoxid_periodoRetencionesPorPagarPorCuentasGenerico!=null && jComboBoxid_periodoRetencionesPorPagarPorCuentasGenerico.getItemCount()>0) {
					jComboBoxid_periodoRetencionesPorPagarPorCuentasGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoRetencionForeignKey(Long idTipoRetencionSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoRetencion  tiporetencionTemp=null;

			for(TipoRetencion tiporetencionAux:tiporetencionsForeignKey) {
				if(tiporetencionAux.getId()!=null && tiporetencionAux.getId().equals(idTipoRetencionSeleccionado)) {
					tiporetencionTemp=tiporetencionAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tiporetencionTemp!=null) {

					if(this.retencionesporpagarporcuentas!=null) {
						this.retencionesporpagarporcuentas.setTipoRetencion(tiporetencionTemp);
					}

					if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) {
						this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxid_tipo_retencionRetencionesPorPagarPorCuentas.setSelectedItem(tiporetencionTemp);
					}
				} else {
					//jComboBoxid_tipo_retencionRetencionesPorPagarPorCuentas.setSelectedItem(tiporetencionTemp);
					if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) {
						if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxid_tipo_retencionRetencionesPorPagarPorCuentas.getItemCount()>0) {
							this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxid_tipo_retencionRetencionesPorPagarPorCuentas.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaRetencionesPorPagarPorCuentas") || sFormularioTipoBusqueda.equals("Todos")){
					if(tiporetencionTemp!=null && jComboBoxid_tipo_retencionBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas!=null) {
						jComboBoxid_tipo_retencionBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas.setSelectedItem(tiporetencionTemp);
					} else {
						if(jComboBoxid_tipo_retencionBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas!=null) {
							//jComboBoxid_tipo_retencionBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas.setSelectedItem(tiporetencionTemp);
							if(jComboBoxid_tipo_retencionBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas.getItemCount()>0) {
								jComboBoxid_tipo_retencionBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas.setSelectedIndex(0);
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

	public String getActualTipoRetencionForeignKeyDescripcion(Long idTipoRetencionSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoRetencion  tiporetencionTemp=null;

			for(TipoRetencion tiporetencionAux:tiporetencionsForeignKey) {
				if(tiporetencionAux.getId()!=null && tiporetencionAux.getId().equals(idTipoRetencionSeleccionado)) {
					tiporetencionTemp=tiporetencionAux;
					break;
				}
			}


			sDescripcion=TipoRetencionConstantesFunciones.getTipoRetencionDescripcion(tiporetencionTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoRetencionForeignKeyGenerico(Long idTipoRetencionSeleccionado,JComboBox jComboBoxid_tipo_retencionRetencionesPorPagarPorCuentasGenerico)throws Exception
	{
		try
		{
			TipoRetencion  tiporetencionTemp=null;

			for(TipoRetencion tiporetencionAux:tiporetencionsForeignKey) {
				if(tiporetencionAux.getId()!=null && tiporetencionAux.getId().equals(idTipoRetencionSeleccionado)) {
					tiporetencionTemp=tiporetencionAux;
					break;
				}
			}

			if(tiporetencionTemp!=null) {
				jComboBoxid_tipo_retencionRetencionesPorPagarPorCuentasGenerico.setSelectedItem(tiporetencionTemp);
			} else {
				if(jComboBoxid_tipo_retencionRetencionesPorPagarPorCuentasGenerico!=null && jComboBoxid_tipo_retencionRetencionesPorPagarPorCuentasGenerico.getItemCount()>0) {
					jComboBoxid_tipo_retencionRetencionesPorPagarPorCuentasGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(RetencionesPorPagarPorCuentas retencionesporpagarporcuentas,JComboBox jComboBoxid_empresaRetencionesPorPagarPorCuentasGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaRetencionesPorPagarPorCuentasGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxid_empresaRetencionesPorPagarPorCuentas.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaRetencionesPorPagarPorCuentasGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				retencionesporpagarporcuentas.setid_empresa(empresaAux.getId());
				retencionesporpagarporcuentas.setempresa_descripcion(RetencionesPorPagarPorCuentasConstantesFunciones.getEmpresaDescripcion(empresaAux));
				retencionesporpagarporcuentas.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(RetencionesPorPagarPorCuentas retencionesporpagarporcuentas,JComboBox jComboBoxid_sucursalRetencionesPorPagarPorCuentasGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalRetencionesPorPagarPorCuentasGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxid_sucursalRetencionesPorPagarPorCuentas.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalRetencionesPorPagarPorCuentasGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				retencionesporpagarporcuentas.setid_sucursal(sucursalAux.getId());
				retencionesporpagarporcuentas.setsucursal_descripcion(RetencionesPorPagarPorCuentasConstantesFunciones.getSucursalDescripcion(sucursalAux));
				retencionesporpagarporcuentas.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEjercicioForeignKey(RetencionesPorPagarPorCuentas retencionesporpagarporcuentas,JComboBox jComboBoxid_ejercicioRetencionesPorPagarPorCuentasGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioAux=new Ejercicio();

			if(jComboBoxid_ejercicioRetencionesPorPagarPorCuentasGenerico==null) {
				ejercicioAux=(Ejercicio)this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxid_ejercicioRetencionesPorPagarPorCuentas.getSelectedItem();
			} else {
				ejercicioAux=(Ejercicio)jComboBoxid_ejercicioRetencionesPorPagarPorCuentasGenerico.getSelectedItem();
			}

			if(ejercicioAux!=null && ejercicioAux.getId()!=null) {
				retencionesporpagarporcuentas.setid_ejercicio(ejercicioAux.getId());
				retencionesporpagarporcuentas.setejercicio_descripcion(RetencionesPorPagarPorCuentasConstantesFunciones.getEjercicioDescripcion(ejercicioAux));
				retencionesporpagarporcuentas.setEjercicio(ejercicioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPeriodoForeignKey(RetencionesPorPagarPorCuentas retencionesporpagarporcuentas,JComboBox jComboBoxid_periodoRetencionesPorPagarPorCuentasGenerico)throws Exception
	{
		try
		{
			Periodo  periodoAux=new Periodo();

			if(jComboBoxid_periodoRetencionesPorPagarPorCuentasGenerico==null) {
				periodoAux=(Periodo)this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxid_periodoRetencionesPorPagarPorCuentas.getSelectedItem();
			} else {
				periodoAux=(Periodo)jComboBoxid_periodoRetencionesPorPagarPorCuentasGenerico.getSelectedItem();
			}

			if(periodoAux!=null && periodoAux.getId()!=null) {
				retencionesporpagarporcuentas.setid_periodo(periodoAux.getId());
				retencionesporpagarporcuentas.setperiodo_descripcion(RetencionesPorPagarPorCuentasConstantesFunciones.getPeriodoDescripcion(periodoAux));
				retencionesporpagarporcuentas.setPeriodo(periodoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoRetencionForeignKey(RetencionesPorPagarPorCuentas retencionesporpagarporcuentas,JComboBox jComboBoxid_tipo_retencionRetencionesPorPagarPorCuentasGenerico)throws Exception
	{
		try
		{
			TipoRetencion  tiporetencionAux=new TipoRetencion();

			if(jComboBoxid_tipo_retencionRetencionesPorPagarPorCuentasGenerico==null) {
				tiporetencionAux=(TipoRetencion)this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxid_tipo_retencionRetencionesPorPagarPorCuentas.getSelectedItem();
			} else {
				tiporetencionAux=(TipoRetencion)jComboBoxid_tipo_retencionRetencionesPorPagarPorCuentasGenerico.getSelectedItem();
			}

			if(tiporetencionAux!=null && tiporetencionAux.getId()!=null) {
				retencionesporpagarporcuentas.setid_tipo_retencion(tiporetencionAux.getId());
				retencionesporpagarporcuentas.settiporetencion_descripcion(RetencionesPorPagarPorCuentasConstantesFunciones.getTipoRetencionDescripcion(tiporetencionAux));
				retencionesporpagarporcuentas.setTipoRetencion(tiporetencionAux);			}
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

					if(!RetencionesPorPagarPorCuentasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) { 
							this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxid_empresaRetencionesPorPagarPorCuentas.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxid_empresaRetencionesPorPagarPorCuentas.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) { 
					}

					if(!RetencionesPorPagarPorCuentasJInternalFrame.ISBINDING_MANUAL) {
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

					if(!RetencionesPorPagarPorCuentasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) { 
							this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxid_sucursalRetencionesPorPagarPorCuentas.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxid_sucursalRetencionesPorPagarPorCuentas.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) { 
					}

					if(!RetencionesPorPagarPorCuentasJInternalFrame.ISBINDING_MANUAL) {
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

					if(!RetencionesPorPagarPorCuentasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) { 
							this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxid_ejercicioRetencionesPorPagarPorCuentas.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxid_ejercicioRetencionesPorPagarPorCuentas.addItem(ejercicio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) { 
					}

					if(!RetencionesPorPagarPorCuentasJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaRetencionesPorPagarPorCuentas") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!RetencionesPorPagarPorCuentasJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_ejercicioBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jComboBoxid_ejercicioBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas.addItem(ejercicio);
							}
						}

						if(!RetencionesPorPagarPorCuentasJInternalFrame.ISBINDING_MANUAL) {
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

					if(!RetencionesPorPagarPorCuentasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) { 
							this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxid_periodoRetencionesPorPagarPorCuentas.removeAllItems();

							for(Periodo periodo:this.periodosForeignKey) {
								this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxid_periodoRetencionesPorPagarPorCuentas.addItem(periodo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) { 
					}

					if(!RetencionesPorPagarPorCuentasJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaRetencionesPorPagarPorCuentas") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!RetencionesPorPagarPorCuentasJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_periodoBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas.removeAllItems();

							for(Periodo periodo:this.periodosForeignKey) {
								this.jComboBoxid_periodoBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas.addItem(periodo);
							}
						}

						if(!RetencionesPorPagarPorCuentasJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoRetencionsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoRetencion=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!RetencionesPorPagarPorCuentasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) { 
							this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxid_tipo_retencionRetencionesPorPagarPorCuentas.removeAllItems();

							for(TipoRetencion tiporetencion:this.tiporetencionsForeignKey) {
								this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxid_tipo_retencionRetencionesPorPagarPorCuentas.addItem(tiporetencion);
							}
						}
					}

					if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) { 
					}

					if(!RetencionesPorPagarPorCuentasJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaRetencionesPorPagarPorCuentas") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!RetencionesPorPagarPorCuentasJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_retencionBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas.removeAllItems();

							for(TipoRetencion tiporetencion:this.tiporetencionsForeignKey) {
								this.jComboBoxid_tipo_retencionBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas.addItem(tiporetencion);
							}
						}

						if(!RetencionesPorPagarPorCuentasJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) {
							this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxid_empresaRetencionesPorPagarPorCuentas.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) {
							this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxid_empresaRetencionesPorPagarPorCuentas.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) {
							this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxid_sucursalRetencionesPorPagarPorCuentas.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) {
							this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxid_sucursalRetencionesPorPagarPorCuentas.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) {
							this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxid_ejercicioRetencionesPorPagarPorCuentas.setSelectedItem(ejercicio);
						}
					} else {
						if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) {
							this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxid_ejercicioRetencionesPorPagarPorCuentas.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_ejercicioBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas.setSelectedItem(ejercicio);
						} else {
							this.jComboBoxid_ejercicioBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) {
							this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxid_periodoRetencionesPorPagarPorCuentas.setSelectedItem(periodo);
						}
					} else {
						if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) {
							this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxid_periodoRetencionesPorPagarPorCuentas.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_periodoBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas.setSelectedItem(periodo);
						} else {
							this.jComboBoxid_periodoBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoRetencionForeignKey(TipoRetencion tiporetencion,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) {
							this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxid_tipo_retencionRetencionesPorPagarPorCuentas.setSelectedItem(tiporetencion);
						}
					} else {
						if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) {
							this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxid_tipo_retencionRetencionesPorPagarPorCuentas.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_retencionBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas.setSelectedItem(tiporetencion);
						} else {
							this.jComboBoxid_tipo_retencionBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesRetencionesPorPagarPorCuentas() throws Exception {
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
		
	public RetencionesPorPagarPorCuentasParameterReturnGeneral getRetencionesPorPagarPorCuentasParameterGeneral() {
		return this.retencionesporpagarporcuentasParameterGeneral;
	}
	
	public void setRetencionesPorPagarPorCuentasParameterGeneral(RetencionesPorPagarPorCuentasParameterReturnGeneral retencionesporpagarporcuentasParameterGeneral) {
		this.retencionesporpagarporcuentasParameterGeneral = retencionesporpagarporcuentasParameterGeneral;
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
	
	public Boolean getIsPermisoTodoRetencionesPorPagarPorCuentas() {
		return isPermisoTodoRetencionesPorPagarPorCuentas;
	}

	public void setIsPermisoTodoRetencionesPorPagarPorCuentas(Boolean isPermisoTodoRetencionesPorPagarPorCuentas) {
		this.isPermisoTodoRetencionesPorPagarPorCuentas = isPermisoTodoRetencionesPorPagarPorCuentas;
	}

	public Boolean getIsPermisoNuevoRetencionesPorPagarPorCuentas() {
		return isPermisoNuevoRetencionesPorPagarPorCuentas;
	}

	public void setIsPermisoNuevoRetencionesPorPagarPorCuentas(Boolean isPermisoNuevoRetencionesPorPagarPorCuentas) {
		this.isPermisoNuevoRetencionesPorPagarPorCuentas = isPermisoNuevoRetencionesPorPagarPorCuentas;
	}

	public Boolean getIsPermisoActualizarRetencionesPorPagarPorCuentas() {
		return isPermisoActualizarRetencionesPorPagarPorCuentas;
	}

	public void setIsPermisoActualizarRetencionesPorPagarPorCuentas(Boolean isPermisoActualizarRetencionesPorPagarPorCuentas) {
		this.isPermisoActualizarRetencionesPorPagarPorCuentas = isPermisoActualizarRetencionesPorPagarPorCuentas;
	}

	public Boolean getIsPermisoEliminarRetencionesPorPagarPorCuentas() {
		return isPermisoEliminarRetencionesPorPagarPorCuentas;
	}

	public void setIsPermisoEliminarRetencionesPorPagarPorCuentas(Boolean isPermisoEliminarRetencionesPorPagarPorCuentas) {
		this.isPermisoEliminarRetencionesPorPagarPorCuentas = isPermisoEliminarRetencionesPorPagarPorCuentas;
	}

	public Boolean getIsPermisoGuardarCambiosRetencionesPorPagarPorCuentas() {
		return isPermisoGuardarCambiosRetencionesPorPagarPorCuentas;
	}

	public void setIsPermisoGuardarCambiosRetencionesPorPagarPorCuentas(Boolean isPermisoGuardarCambiosRetencionesPorPagarPorCuentas) {
		this.isPermisoGuardarCambiosRetencionesPorPagarPorCuentas = isPermisoGuardarCambiosRetencionesPorPagarPorCuentas;
	}
	
	public Boolean getIsPermisoConsultaRetencionesPorPagarPorCuentas() {
		return isPermisoConsultaRetencionesPorPagarPorCuentas;
	}

	public void setIsPermisoConsultaRetencionesPorPagarPorCuentas(Boolean isPermisoConsultaRetencionesPorPagarPorCuentas) {
		this.isPermisoConsultaRetencionesPorPagarPorCuentas = isPermisoConsultaRetencionesPorPagarPorCuentas;
	}

	public Boolean getIsPermisoBusquedaRetencionesPorPagarPorCuentas() {
		return isPermisoBusquedaRetencionesPorPagarPorCuentas;
	}

	public void setIsPermisoBusquedaRetencionesPorPagarPorCuentas(Boolean isPermisoBusquedaRetencionesPorPagarPorCuentas) {
		this.isPermisoBusquedaRetencionesPorPagarPorCuentas = isPermisoBusquedaRetencionesPorPagarPorCuentas;
	}

	public Boolean getIsPermisoReporteRetencionesPorPagarPorCuentas() {
		return isPermisoReporteRetencionesPorPagarPorCuentas;
	}

	public void setIsPermisoReporteRetencionesPorPagarPorCuentas(Boolean isPermisoReporteRetencionesPorPagarPorCuentas) {
		this.isPermisoReporteRetencionesPorPagarPorCuentas = isPermisoReporteRetencionesPorPagarPorCuentas;
	}
	
	public Boolean getIsPermisoPaginacionMedioRetencionesPorPagarPorCuentas() {
		return isPermisoPaginacionMedioRetencionesPorPagarPorCuentas;
	}

	public void setIsPermisoPaginacionMedioRetencionesPorPagarPorCuentas(Boolean isPermisoPaginacionMedioRetencionesPorPagarPorCuentas) {
		this.isPermisoPaginacionMedioRetencionesPorPagarPorCuentas = isPermisoPaginacionMedioRetencionesPorPagarPorCuentas;
	}
	
	public Boolean getIsPermisoPaginacionTodoRetencionesPorPagarPorCuentas() {
		return isPermisoPaginacionTodoRetencionesPorPagarPorCuentas;
	}

	public void setIsPermisoPaginacionTodoRetencionesPorPagarPorCuentas(Boolean isPermisoPaginacionTodoRetencionesPorPagarPorCuentas) {
		this.isPermisoPaginacionTodoRetencionesPorPagarPorCuentas = isPermisoPaginacionTodoRetencionesPorPagarPorCuentas;
	}
	
	public Boolean getIsPermisoPaginacionAltoRetencionesPorPagarPorCuentas() {
		return isPermisoPaginacionAltoRetencionesPorPagarPorCuentas;
	}

	public void setIsPermisoPaginacionAltoRetencionesPorPagarPorCuentas(Boolean isPermisoPaginacionAltoRetencionesPorPagarPorCuentas) {
		this.isPermisoPaginacionAltoRetencionesPorPagarPorCuentas = isPermisoPaginacionAltoRetencionesPorPagarPorCuentas;
	}
	
	public Boolean getIsPermisoCopiarRetencionesPorPagarPorCuentas() {
		return isPermisoCopiarRetencionesPorPagarPorCuentas;
	}

	public void setIsPermisoCopiarRetencionesPorPagarPorCuentas(Boolean isPermisoCopiarRetencionesPorPagarPorCuentas) {
		this.isPermisoCopiarRetencionesPorPagarPorCuentas = isPermisoCopiarRetencionesPorPagarPorCuentas;
	}
	
	public Boolean getIsPermisoVerFormRetencionesPorPagarPorCuentas() {
		return isPermisoVerFormRetencionesPorPagarPorCuentas;
	}

	public void setIsPermisoVerFormRetencionesPorPagarPorCuentas(Boolean isPermisoVerFormRetencionesPorPagarPorCuentas) {
		this.isPermisoVerFormRetencionesPorPagarPorCuentas = isPermisoVerFormRetencionesPorPagarPorCuentas;
	}
	
	public Boolean getIsPermisoDuplicarRetencionesPorPagarPorCuentas() {
		return isPermisoDuplicarRetencionesPorPagarPorCuentas;
	}

	public void setIsPermisoDuplicarRetencionesPorPagarPorCuentas(Boolean isPermisoDuplicarRetencionesPorPagarPorCuentas) {
		this.isPermisoDuplicarRetencionesPorPagarPorCuentas = isPermisoDuplicarRetencionesPorPagarPorCuentas;
	}
	
	public Boolean getIsPermisoOrdenRetencionesPorPagarPorCuentas() {
		return isPermisoOrdenRetencionesPorPagarPorCuentas;
	}

	public void setIsPermisoOrdenRetencionesPorPagarPorCuentas(Boolean isPermisoOrdenRetencionesPorPagarPorCuentas) {
		this.isPermisoOrdenRetencionesPorPagarPorCuentas = isPermisoOrdenRetencionesPorPagarPorCuentas;
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
	
	public Boolean getIsVisibilidadCeldaNuevoRetencionesPorPagarPorCuentas() {
		return isVisibilidadCeldaNuevoRetencionesPorPagarPorCuentas;
	}

	public void setIsVisibilidadCeldaNuevoRetencionesPorPagarPorCuentas(Boolean isVisibilidadCeldaNuevoRetencionesPorPagarPorCuentas) {
		this.isVisibilidadCeldaNuevoRetencionesPorPagarPorCuentas = isVisibilidadCeldaNuevoRetencionesPorPagarPorCuentas;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarRetencionesPorPagarPorCuentas() {
		return isVisibilidadCeldaDuplicarRetencionesPorPagarPorCuentas;
	}

	public void setIsVisibilidadCeldaDuplicarRetencionesPorPagarPorCuentas(Boolean isVisibilidadCeldaDuplicarRetencionesPorPagarPorCuentas) {
		this.isVisibilidadCeldaDuplicarRetencionesPorPagarPorCuentas = isVisibilidadCeldaDuplicarRetencionesPorPagarPorCuentas;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarRetencionesPorPagarPorCuentas() {
		return isVisibilidadCeldaCopiarRetencionesPorPagarPorCuentas;
	}

	public void setIsVisibilidadCeldaCopiarRetencionesPorPagarPorCuentas(Boolean isVisibilidadCeldaCopiarRetencionesPorPagarPorCuentas) {
		this.isVisibilidadCeldaCopiarRetencionesPorPagarPorCuentas = isVisibilidadCeldaCopiarRetencionesPorPagarPorCuentas;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormRetencionesPorPagarPorCuentas() {
		return isVisibilidadCeldaVerFormRetencionesPorPagarPorCuentas;
	}

	public void setIsVisibilidadCeldaVerFormRetencionesPorPagarPorCuentas(Boolean isVisibilidadCeldaVerFormRetencionesPorPagarPorCuentas) {
		this.isVisibilidadCeldaVerFormRetencionesPorPagarPorCuentas = isVisibilidadCeldaVerFormRetencionesPorPagarPorCuentas;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenRetencionesPorPagarPorCuentas() {
		return isVisibilidadCeldaOrdenRetencionesPorPagarPorCuentas;
	}

	public void setIsVisibilidadCeldaOrdenRetencionesPorPagarPorCuentas(Boolean isVisibilidadCeldaOrdenRetencionesPorPagarPorCuentas) {
		this.isVisibilidadCeldaOrdenRetencionesPorPagarPorCuentas = isVisibilidadCeldaOrdenRetencionesPorPagarPorCuentas;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesRetencionesPorPagarPorCuentas() {
		return isVisibilidadCeldaNuevoRelacionesRetencionesPorPagarPorCuentas;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesRetencionesPorPagarPorCuentas(Boolean isVisibilidadCeldaNuevoRelacionesRetencionesPorPagarPorCuentas) {
		this.isVisibilidadCeldaNuevoRelacionesRetencionesPorPagarPorCuentas = isVisibilidadCeldaNuevoRelacionesRetencionesPorPagarPorCuentas;
	}
	
	public Boolean getIsVisibilidadCeldaModificarRetencionesPorPagarPorCuentas() {
		return isVisibilidadCeldaModificarRetencionesPorPagarPorCuentas;
	}

	public void setIsVisibilidadCeldaModificarRetencionesPorPagarPorCuentas(Boolean isVisibilidadCeldaModificarRetencionesPorPagarPorCuentas) {
		this.isVisibilidadCeldaModificarRetencionesPorPagarPorCuentas = isVisibilidadCeldaModificarRetencionesPorPagarPorCuentas;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarRetencionesPorPagarPorCuentas() {
		return isVisibilidadCeldaActualizarRetencionesPorPagarPorCuentas;
	}

	public void setIsVisibilidadCeldaActualizarRetencionesPorPagarPorCuentas(Boolean isVisibilidadCeldaActualizarRetencionesPorPagarPorCuentas) {
		this.isVisibilidadCeldaActualizarRetencionesPorPagarPorCuentas = isVisibilidadCeldaActualizarRetencionesPorPagarPorCuentas;
	}

	public Boolean getIsVisibilidadCeldaEliminarRetencionesPorPagarPorCuentas() {
		return isVisibilidadCeldaEliminarRetencionesPorPagarPorCuentas;
	}

	public void setIsVisibilidadCeldaEliminarRetencionesPorPagarPorCuentas(Boolean isVisibilidadCeldaEliminarRetencionesPorPagarPorCuentas) {
		this.isVisibilidadCeldaEliminarRetencionesPorPagarPorCuentas = isVisibilidadCeldaEliminarRetencionesPorPagarPorCuentas;
	}

	public Boolean getIsVisibilidadCeldaCancelarRetencionesPorPagarPorCuentas() {
		return isVisibilidadCeldaCancelarRetencionesPorPagarPorCuentas;
	}

	public void setIsVisibilidadCeldaCancelarRetencionesPorPagarPorCuentas(Boolean isVisibilidadCeldaCancelarRetencionesPorPagarPorCuentas) {
		this.isVisibilidadCeldaCancelarRetencionesPorPagarPorCuentas = isVisibilidadCeldaCancelarRetencionesPorPagarPorCuentas;
	}

	public Boolean getIsVisibilidadCeldaGuardarRetencionesPorPagarPorCuentas() {
		return isVisibilidadCeldaGuardarRetencionesPorPagarPorCuentas;
	}

	public void setIsVisibilidadCeldaGuardarRetencionesPorPagarPorCuentas(Boolean isVisibilidadCeldaGuardarRetencionesPorPagarPorCuentas) {
		this.isVisibilidadCeldaGuardarRetencionesPorPagarPorCuentas = isVisibilidadCeldaGuardarRetencionesPorPagarPorCuentas;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosRetencionesPorPagarPorCuentas() {
		return isVisibilidadCeldaGuardarCambiosRetencionesPorPagarPorCuentas;
	}

	public void setIsVisibilidadCeldaGuardarCambiosRetencionesPorPagarPorCuentas(Boolean isVisibilidadCeldaGuardarCambiosRetencionesPorPagarPorCuentas) {
		this.isVisibilidadCeldaGuardarCambiosRetencionesPorPagarPorCuentas = isVisibilidadCeldaGuardarCambiosRetencionesPorPagarPorCuentas;
	}
		
	public RetencionesPorPagarPorCuentasSessionBean getretencionesporpagarporcuentasSessionBean() {
		return this.retencionesporpagarporcuentasSessionBean;
	}
	
	public void setretencionesporpagarporcuentasSessionBean(RetencionesPorPagarPorCuentasSessionBean retencionesporpagarporcuentasSessionBean) {
		this.retencionesporpagarporcuentasSessionBean=retencionesporpagarporcuentasSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaRetencionesPorPagarPorCuentas() {
		return this.isVisibilidadBusquedaRetencionesPorPagarPorCuentas;
	}

	public void setisVisibilidadBusquedaRetencionesPorPagarPorCuentas(Boolean isVisibilidadBusquedaRetencionesPorPagarPorCuentas) {
		this.isVisibilidadBusquedaRetencionesPorPagarPorCuentas=isVisibilidadBusquedaRetencionesPorPagarPorCuentas;
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

	public Boolean getisVisibilidadFK_IdTipoRetencion() {
		return this.isVisibilidadFK_IdTipoRetencion;
	}

	public void setisVisibilidadFK_IdTipoRetencion(Boolean isVisibilidadFK_IdTipoRetencion) {
		this.isVisibilidadFK_IdTipoRetencion=isVisibilidadFK_IdTipoRetencion;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorCuentas(RetencionesPorPagarPorCuentas retencionesporpagarporcuentas)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(retencionesporpagarporcuentas,null);
				this.setActualParaGuardarSucursalForeignKey(retencionesporpagarporcuentas,null);
				this.setActualParaGuardarEjercicioForeignKey(retencionesporpagarporcuentas,null);
				this.setActualParaGuardarPeriodoForeignKey(retencionesporpagarporcuentas,null);
				this.setActualParaGuardarTipoRetencionForeignKey(retencionesporpagarporcuentas,null);
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
	
	public void bugActualizarReferenciaActual(RetencionesPorPagarPorCuentas retencionesporpagarporcuentas,RetencionesPorPagarPorCuentas retencionesporpagarporcuentasAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalRetencionesPorPagarPorCuentas(retencionesporpagarporcuentas);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		retencionesporpagarporcuentasAux.setId(retencionesporpagarporcuentas.getId());
		retencionesporpagarporcuentasAux.setVersionRow(retencionesporpagarporcuentas.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(RetencionesPorPagarPorCuentas retencionesporpagarporcuentasLocal) throws Exception {
		
		if(this.retencionesporpagarporcuentasSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(RetencionesPorPagarPorCuentas retencionesporpagarporcuentasLocal) throws Exception {	
		if(this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				retencionesporpagarporcuentasLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				retencionesporpagarporcuentasLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EjercicioDetalleFormJInternalFrame.class)) {
				EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrameLocal=(EjercicioBeanSwingJInternalFrame) ((EjercicioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ejercicioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEjercicio(ejercicioBeanSwingJInternalFrameLocal.getejercicio(),true);
				ejercicioBeanSwingJInternalFrameLocal.actualizarLista(ejercicioBeanSwingJInternalFrameLocal.ejercicio,this.ejerciciosForeignKey);

				ejercicioBeanSwingJInternalFrameLocal.actualizarRelaciones(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				retencionesporpagarporcuentasLocal.setEjercicio(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				this.addItemDefectoCombosForeignKeyEjercicio();
				this.cargarCombosFrameEjerciciosForeignKey("Formulario");
				this.setActualEjercicioForeignKey(ejercicioBeanSwingJInternalFrameLocal.ejercicio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(PeriodoDetalleFormJInternalFrame.class)) {
				PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrameLocal=(PeriodoBeanSwingJInternalFrame) ((PeriodoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				periodoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPeriodo(periodoBeanSwingJInternalFrameLocal.getperiodo(),true);
				periodoBeanSwingJInternalFrameLocal.actualizarLista(periodoBeanSwingJInternalFrameLocal.periodo,this.periodosForeignKey);

				periodoBeanSwingJInternalFrameLocal.actualizarRelaciones(periodoBeanSwingJInternalFrameLocal.periodo);

				retencionesporpagarporcuentasLocal.setPeriodo(periodoBeanSwingJInternalFrameLocal.periodo);

				this.addItemDefectoCombosForeignKeyPeriodo();
				this.cargarCombosFramePeriodosForeignKey("Formulario");
				this.setActualPeriodoForeignKey(periodoBeanSwingJInternalFrameLocal.periodo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoRetencionDetalleFormJInternalFrame.class)) {
				TipoRetencionBeanSwingJInternalFrame tiporetencionBeanSwingJInternalFrameLocal=(TipoRetencionBeanSwingJInternalFrame) ((TipoRetencionDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tiporetencionBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoRetencion(tiporetencionBeanSwingJInternalFrameLocal.gettiporetencion(),true);
				tiporetencionBeanSwingJInternalFrameLocal.actualizarLista(tiporetencionBeanSwingJInternalFrameLocal.tiporetencion,this.tiporetencionsForeignKey);

				tiporetencionBeanSwingJInternalFrameLocal.actualizarRelaciones(tiporetencionBeanSwingJInternalFrameLocal.tiporetencion);

				retencionesporpagarporcuentasLocal.setTipoRetencion(tiporetencionBeanSwingJInternalFrameLocal.tiporetencion);

				this.addItemDefectoCombosForeignKeyTipoRetencion();
				this.cargarCombosFrameTipoRetencionsForeignKey("Formulario");
				this.setActualTipoRetencionForeignKey(tiporetencionBeanSwingJInternalFrameLocal.tiporetencion.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarRetencionesPorPagarPorCuentasActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosRetencionesPorPagarPorCuentas.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.retencionesporpagarporcuentas =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass().toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.retencionesporpagarporcuentas =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentass.toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = retencionesporpagarporcuentasValidator.getInvalidValues(this.retencionesporpagarporcuentas);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(RetencionesPorPagarPorCuentas retencionesporpagarporcuentas,List<RetencionesPorPagarPorCuentas> retencionesporpagarporcuentass) throws Exception {
	}		
	
	public void actualizarSelectedLista(RetencionesPorPagarPorCuentas retencionesporpagarporcuentas,List<RetencionesPorPagarPorCuentas> retencionesporpagarporcuentass) throws Exception {
		try	{			
			RetencionesPorPagarPorCuentasConstantesFunciones.actualizarSelectedLista(retencionesporpagarporcuentas,retencionesporpagarporcuentass);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<RetencionesPorPagarPorCuentas> retencionesporpagarporcuentassLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				retencionesporpagarporcuentassLocal=this.retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				retencionesporpagarporcuentassLocal=this.retencionesporpagarporcuentass;
			}
			//ARCHITECTURE
		
			for(RetencionesPorPagarPorCuentas retencionesporpagarporcuentasLocal:retencionesporpagarporcuentassLocal) {
				if(this.permiteMantenimiento(retencionesporpagarporcuentasLocal) && retencionesporpagarporcuentasLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+RetencionesPorPagarPorCuentasConstantesFunciones.getRetencionesPorPagarPorCuentasLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(RetencionesPorPagarPorCuentasConstantesFunciones.FECHAEMISION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jLabelfecha_emisionRetencionesPorPagarPorCuentas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RetencionesPorPagarPorCuentasConstantesFunciones.NOMBRETIPOMOVIMIENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jLabelnombre_tipo_movimientoRetencionesPorPagarPorCuentas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RetencionesPorPagarPorCuentasConstantesFunciones.NUMEROMAYOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jLabelnumero_mayorRetencionesPorPagarPorCuentas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RetencionesPorPagarPorCuentasConstantesFunciones.NOMBRECUENTACONTABLERETENCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jLabelnombre_cuenta_contable_retencionRetencionesPorPagarPorCuentas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RetencionesPorPagarPorCuentasConstantesFunciones.NUMEROPREIMPRESOFACTURA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jLabelnumero_pre_impreso_facturaRetencionesPorPagarPorCuentas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RetencionesPorPagarPorCuentasConstantesFunciones.PORCENTAJE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jLabelporcentajeRetencionesPorPagarPorCuentas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RetencionesPorPagarPorCuentasConstantesFunciones.BASEIMPONIBLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jLabelbase_imponibleRetencionesPorPagarPorCuentas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RetencionesPorPagarPorCuentasConstantesFunciones.VALOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jLabelvalorRetencionesPorPagarPorCuentas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RetencionesPorPagarPorCuentasConstantesFunciones.NUMERO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jLabelnumeroRetencionesPorPagarPorCuentas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RetencionesPorPagarPorCuentasConstantesFunciones.NOMBREBENEF)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jLabelnombre_benefRetencionesPorPagarPorCuentas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RetencionesPorPagarPorCuentasConstantesFunciones.RUCBENEF)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jLabelruc_benefRetencionesPorPagarPorCuentas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RetencionesPorPagarPorCuentasConstantesFunciones.NOMBRECUENTACONTABLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jLabelnombre_cuenta_contableRetencionesPorPagarPorCuentas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RetencionesPorPagarPorCuentasConstantesFunciones.NOMBRECUENTACONTABLECREDITO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jLabelnombre_cuenta_contable_creditoRetencionesPorPagarPorCuentas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RetencionesPorPagarPorCuentasConstantesFunciones.ESDEBITODATO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jLabeles_debito_datoRetencionesPorPagarPorCuentas,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jLabelfecha_emisionRetencionesPorPagarPorCuentas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jLabelnombre_tipo_movimientoRetencionesPorPagarPorCuentas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jLabelnumero_mayorRetencionesPorPagarPorCuentas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jLabelnombre_cuenta_contable_retencionRetencionesPorPagarPorCuentas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jLabelnumero_pre_impreso_facturaRetencionesPorPagarPorCuentas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jLabelporcentajeRetencionesPorPagarPorCuentas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jLabelbase_imponibleRetencionesPorPagarPorCuentas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jLabelvalorRetencionesPorPagarPorCuentas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jLabelnumeroRetencionesPorPagarPorCuentas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jLabelnombre_benefRetencionesPorPagarPorCuentas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jLabelruc_benefRetencionesPorPagarPorCuentas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jLabelnombre_cuenta_contableRetencionesPorPagarPorCuentas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jLabelnombre_cuenta_contable_creditoRetencionesPorPagarPorCuentas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jLabeles_debito_datoRetencionesPorPagarPorCuentas,"");
		
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
		this.iIdNuevoRetencionesPorPagarPorCuentas--;	
		
		
		this.retencionesporpagarporcuentasAux=new RetencionesPorPagarPorCuentas();
		
		this.retencionesporpagarporcuentasAux.setId(this.iIdNuevoRetencionesPorPagarPorCuentas);
		this.retencionesporpagarporcuentasAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass().add(this.retencionesporpagarporcuentasAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.retencionesporpagarporcuentass.add(this.retencionesporpagarporcuentasAux);
		}
		//ARCHITECTURE
		
		this.retencionesporpagarporcuentas=this.retencionesporpagarporcuentasAux;
		
		if(RetencionesPorPagarPorCuentasJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentas);
			this.setVariablesObjetoActualToFormularioForeignKeyRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentas);
		}
				
		//this.setDefaultControlesRetencionesPorPagarPorCuentas();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyRetencionesPorPagarPorCuentas();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyRetencionesPorPagarPorCuentas();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyRetencionesPorPagarPorCuentas();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentasBean,this.retencionesporpagarporcuentas,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentas);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentasReturnGeneral,this.retencionesporpagarporcuentasBean,false);
		
		if(this.retencionesporpagarporcuentasReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentasReturnGeneral.getRetencionesPorPagarPorCuentas());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentasReturnGeneral.getRetencionesPorPagarPorCuentas());
		}
		
		if(this.retencionesporpagarporcuentasReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentasReturnGeneral.getRetencionesPorPagarPorCuentas(),classes);//this.retencionesporpagarporcuentasBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentas,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyRetencionesPorPagarPorCuentas();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyRetencionesPorPagarPorCuentas();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			RetencionesPorPagarPorCuentasBeanSwingJInternalFrameAdditional.RecargarFormRetencionesPorPagarPorCuentas(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingRetencionesPorPagarPorCuentas(false);
						
			if(retencionesporpagarporcuentasSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(RetencionesPorPagarPorCuentasJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualRetencionesPorPagarPorCuentas();
			}
			
			this.actualizarVisualTableDatosRetencionesPorPagarPorCuentas();
			
			this.jTableDatosRetencionesPorPagarPorCuentas.setRowSelectionInterval(this.getIndiceNuevoRetencionesPorPagarPorCuentas(), this.getIndiceNuevoRetencionesPorPagarPorCuentas());
			
			this.seleccionarFilaTablaRetencionesPorPagarPorCuentasActual();
						
			this.actualizarEstadoCeldasBotonesRetencionesPorPagarPorCuentas("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesRetencionesPorPagarPorCuentas(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jCheckBoxes_debitoRetencionesPorPagarPorCuentas.setEnabled(isHabilitar && this.retencionesporpagarporcuentasConstantesFunciones.activares_debitoRetencionesPorPagarPorCuentas);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jDateChooserfecha_emisionRetencionesPorPagarPorCuentas.setEnabled(isHabilitar && this.retencionesporpagarporcuentasConstantesFunciones.activarfecha_emisionRetencionesPorPagarPorCuentas);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextAreanombre_tipo_movimientoRetencionesPorPagarPorCuentas.setEnabled(isHabilitar && this.retencionesporpagarporcuentasConstantesFunciones.activarnombre_tipo_movimientoRetencionesPorPagarPorCuentas);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextAreanumero_mayorRetencionesPorPagarPorCuentas.setEnabled(isHabilitar && this.retencionesporpagarporcuentasConstantesFunciones.activarnumero_mayorRetencionesPorPagarPorCuentas);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextAreanombre_cuenta_contable_retencionRetencionesPorPagarPorCuentas.setEnabled(isHabilitar && this.retencionesporpagarporcuentasConstantesFunciones.activarnombre_cuenta_contable_retencionRetencionesPorPagarPorCuentas);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextFieldnumero_pre_impreso_facturaRetencionesPorPagarPorCuentas.setEnabled(isHabilitar && this.retencionesporpagarporcuentasConstantesFunciones.activarnumero_pre_impreso_facturaRetencionesPorPagarPorCuentas);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextFieldporcentajeRetencionesPorPagarPorCuentas.setEnabled(isHabilitar && this.retencionesporpagarporcuentasConstantesFunciones.activarporcentajeRetencionesPorPagarPorCuentas);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextFieldbase_imponibleRetencionesPorPagarPorCuentas.setEnabled(isHabilitar && this.retencionesporpagarporcuentasConstantesFunciones.activarbase_imponibleRetencionesPorPagarPorCuentas);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextFieldvalorRetencionesPorPagarPorCuentas.setEnabled(isHabilitar && this.retencionesporpagarporcuentasConstantesFunciones.activarvalorRetencionesPorPagarPorCuentas);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextFieldnumeroRetencionesPorPagarPorCuentas.setEnabled(isHabilitar && this.retencionesporpagarporcuentasConstantesFunciones.activarnumeroRetencionesPorPagarPorCuentas);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextAreanombre_benefRetencionesPorPagarPorCuentas.setEnabled(isHabilitar && this.retencionesporpagarporcuentasConstantesFunciones.activarnombre_benefRetencionesPorPagarPorCuentas);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextFieldruc_benefRetencionesPorPagarPorCuentas.setEnabled(isHabilitar && this.retencionesporpagarporcuentasConstantesFunciones.activarruc_benefRetencionesPorPagarPorCuentas);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextAreanombre_cuenta_contableRetencionesPorPagarPorCuentas.setEnabled(isHabilitar && this.retencionesporpagarporcuentasConstantesFunciones.activarnombre_cuenta_contableRetencionesPorPagarPorCuentas);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextAreanombre_cuenta_contable_creditoRetencionesPorPagarPorCuentas.setEnabled(isHabilitar && this.retencionesporpagarporcuentasConstantesFunciones.activarnombre_cuenta_contable_creditoRetencionesPorPagarPorCuentas);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jCheckBoxes_debito_datoRetencionesPorPagarPorCuentas.setEnabled(isHabilitar && this.retencionesporpagarporcuentasConstantesFunciones.activares_debito_datoRetencionesPorPagarPorCuentas);	
		//
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxid_empresaRetencionesPorPagarPorCuentas.setEnabled(isHabilitar && this.retencionesporpagarporcuentasConstantesFunciones.activarid_empresaRetencionesPorPagarPorCuentas);//
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxid_sucursalRetencionesPorPagarPorCuentas.setEnabled(isHabilitar && this.retencionesporpagarporcuentasConstantesFunciones.activarid_sucursalRetencionesPorPagarPorCuentas);//
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxid_ejercicioRetencionesPorPagarPorCuentas.setEnabled(isHabilitar && this.retencionesporpagarporcuentasConstantesFunciones.activarid_ejercicioRetencionesPorPagarPorCuentas);//
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxid_periodoRetencionesPorPagarPorCuentas.setEnabled(isHabilitar && this.retencionesporpagarporcuentasConstantesFunciones.activarid_periodoRetencionesPorPagarPorCuentas);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxid_tipo_retencionRetencionesPorPagarPorCuentas.setEnabled(isHabilitar && this.retencionesporpagarporcuentasConstantesFunciones.activarid_tipo_retencionRetencionesPorPagarPorCuentas);
	};
	
	public void setDefaultControlesRetencionesPorPagarPorCuentas() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoRetencionesPorPagarPorCuentas(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.retencionesporpagarporcuentasSessionBean.setConGuardarRelaciones(true);			
			this.retencionesporpagarporcuentasSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTabbedPaneRelacionesRetencionesPorPagarPorCuentas.setVisible(true);
			
					
		} else {
			//this.retencionesporpagarporcuentasSessionBean.setConGuardarRelaciones(false);			
			this.retencionesporpagarporcuentasSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTabbedPaneRelacionesRetencionesPorPagarPorCuentas.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoRetencionesPorPagarPorCuentas() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(RetencionesPorPagarPorCuentas retencionesporpagarporcuentasAux:this.retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass()) {
				if(retencionesporpagarporcuentasAux.getId().equals(this.iIdNuevoRetencionesPorPagarPorCuentas)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(RetencionesPorPagarPorCuentas retencionesporpagarporcuentasAux:this.retencionesporpagarporcuentass) {
				if(retencionesporpagarporcuentasAux.getId().equals(this.iIdNuevoRetencionesPorPagarPorCuentas)) {
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
	
	public int getIndiceActualRetencionesPorPagarPorCuentas(RetencionesPorPagarPorCuentas retencionesporpagarporcuentas,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(RetencionesPorPagarPorCuentas retencionesporpagarporcuentasAux:this.retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass()) {
				if(retencionesporpagarporcuentasAux.getId().equals(retencionesporpagarporcuentas.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(RetencionesPorPagarPorCuentas retencionesporpagarporcuentasAux:this.retencionesporpagarporcuentass) {
				if(retencionesporpagarporcuentasAux.getId().equals(retencionesporpagarporcuentas.getId())) {
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
	
	public void setCamposBaseDesdeOriginalRetencionesPorPagarPorCuentas(RetencionesPorPagarPorCuentas retencionesporpagarporcuentasOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(RetencionesPorPagarPorCuentas retencionesporpagarporcuentasAux:this.retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass()) {
				if(retencionesporpagarporcuentasAux.getRetencionesPorPagarPorCuentasOriginal().getId().equals(retencionesporpagarporcuentasOriginal.getId())) {
					existe=true;
					retencionesporpagarporcuentasOriginal.setId(retencionesporpagarporcuentasAux.getId());
					retencionesporpagarporcuentasOriginal.setVersionRow(retencionesporpagarporcuentasAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(RetencionesPorPagarPorCuentas retencionesporpagarporcuentasAux:this.retencionesporpagarporcuentass) {
				if(retencionesporpagarporcuentasAux.getRetencionesPorPagarPorCuentasOriginal().getId().equals(retencionesporpagarporcuentasOriginal.getId())) {
					existe=true;
					retencionesporpagarporcuentasOriginal.setId(retencionesporpagarporcuentasAux.getId());
					retencionesporpagarporcuentasOriginal.setVersionRow(retencionesporpagarporcuentasAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosRetencionesPorPagarPorCuentas(Boolean esParaCancelar) throws Exception {
		retencionesporpagarporcuentassAux=new ArrayList<RetencionesPorPagarPorCuentas>();
		retencionesporpagarporcuentasAux=new RetencionesPorPagarPorCuentas();
		
		if(!this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(RetencionesPorPagarPorCuentas retencionesporpagarporcuentasAux:this.retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass()) {
					if(retencionesporpagarporcuentasAux.getId()<0) {
						retencionesporpagarporcuentassAux.add(retencionesporpagarporcuentasAux);
					}		
				}
				this.iIdNuevoRetencionesPorPagarPorCuentas=0L;
				this.retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass().removeAll(retencionesporpagarporcuentassAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(RetencionesPorPagarPorCuentas retencionesporpagarporcuentasAux:this.retencionesporpagarporcuentass) {
					if(retencionesporpagarporcuentasAux.getId()<0) {
						retencionesporpagarporcuentassAux.add(retencionesporpagarporcuentasAux);
					}		
				}
				this.iIdNuevoRetencionesPorPagarPorCuentas=0L;
				this.retencionesporpagarporcuentass.removeAll(retencionesporpagarporcuentassAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoRetencionesPorPagarPorCuentas 
					&& this.retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass().size()>0
					) {
					retencionesporpagarporcuentasAux=this.retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass().get(this.retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass().size() - 1);
				
					if(retencionesporpagarporcuentasAux.getId()<0) {
						this.retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass().remove(retencionesporpagarporcuentasAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoRetencionesPorPagarPorCuentas && this.retencionesporpagarporcuentass.size()>0) {
					retencionesporpagarporcuentasAux=this.retencionesporpagarporcuentass.get(this.retencionesporpagarporcuentass.size() - 1);
				
					if(retencionesporpagarporcuentasAux.getId()<0) {
						this.retencionesporpagarporcuentass.remove(retencionesporpagarporcuentasAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoRetencionesPorPagarPorCuentas(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(retencionesporpagarporcuentas.getId()<0) {
				this.retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass().remove(this.retencionesporpagarporcuentas);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(retencionesporpagarporcuentas.getId()<0) {
				this.retencionesporpagarporcuentass.remove(this.retencionesporpagarporcuentas);
			}
		}			
	}
	
	public void setEstadosInicialesRetencionesPorPagarPorCuentas(List<RetencionesPorPagarPorCuentas> retencionesporpagarporcuentassAux) throws Exception {
		RetencionesPorPagarPorCuentasConstantesFunciones.setEstadosInicialesRetencionesPorPagarPorCuentas(retencionesporpagarporcuentassAux);
	}
	
	public void setEstadosInicialesRetencionesPorPagarPorCuentas(RetencionesPorPagarPorCuentas retencionesporpagarporcuentasAux) throws Exception {
		RetencionesPorPagarPorCuentasConstantesFunciones.setEstadosInicialesRetencionesPorPagarPorCuentas(retencionesporpagarporcuentasAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarRetencionesPorPagarPorCuentasActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesRetencionesPorPagarPorCuentas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarRetencionesPorPagarPorCuentasActual()) {
				if(!this.isEsNuevoRetencionesPorPagarPorCuentas) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesRetencionesPorPagarPorCuentas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoRetencionesPorPagarPorCuentas=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarRetencionesPorPagarPorCuentasActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Retenciones Por Pagar Por Cuentas ?", "MANTENIMIENTO DE Retenciones Por Pagar Por Cuentas", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesRetencionesPorPagarPorCuentas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(RetencionesPorPagarPorCuentas retencionesporpagarporcuentas) throws Exception {
		RetencionesPorPagarPorCuentasConstantesFunciones.seleccionarAsignar(this.retencionesporpagarporcuentas,retencionesporpagarporcuentas);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarRetencionesPorPagarPorCuentas=this.isPermisoActualizarOriginalRetencionesPorPagarPorCuentas;
			
			
			this.seleccionarAsignar(retencionesporpagarporcuentas);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesRetencionesPorPagarPorCuentas("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.retencionesporpagarporcuentasSessionBean.setsFuncionBusquedaRapida(this.retencionesporpagarporcuentasSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoRetencionesPorPagarPorCuentas) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosRetencionesPorPagarPorCuentas(esParaCancelar);				
				this.cancelarNuevoRetencionesPorPagarPorCuentas(esParaCancelar);								
			}
			
			this.retencionesporpagarporcuentas=new RetencionesPorPagarPorCuentas();
			
			this.inicializarRetencionesPorPagarPorCuentas();
			
			this.actualizarEstadoCeldasBotonesRetencionesPorPagarPorCuentas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarRetencionesPorPagarPorCuentas() throws Exception {
		try {
			RetencionesPorPagarPorCuentasConstantesFunciones.inicializarRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentas);
			
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
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteRetencionesPorPagarPorCuentass(String sAccionBusqueda,List<RetencionesPorPagarPorCuentas> retencionesporpagarporcuentassParaReportes) throws Exception {
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
					sPathReporteFinal="RetencionesPorPagarPorCuentas"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="RetencionesPorPagarPorCuentasMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("RetencionesPorPagarPorCuentasMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="RetencionesPorPagarPorCuentas"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Retenciones Por Pagar Por Cuentases");		
		parameters.put("busquedapor", RetencionesPorPagarPorCuentasConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceRetencionesPorPagarPorCuentas=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			RetencionesPorPagarPorCuentasConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			RetencionesPorPagarPorCuentasConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceRetencionesPorPagarPorCuentas=new JRBeanArrayDataSource(RetencionesPorPagarPorCuentasJInternalFrame.TraerRetencionesPorPagarPorCuentasBeans(retencionesporpagarporcuentassParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceRetencionesPorPagarPorCuentas);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+RetencionesPorPagarPorCuentasConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(RetencionesPorPagarPorCuentasBean.TraerRetencionesPorPagarPorCuentasBeans(retencionesporpagarporcuentassParaReportes).toArray()));
							
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
				this.generarExcelReporteRetencionesPorPagarPorCuentass(sAccionBusqueda,sTipoArchivoReporte,retencionesporpagarporcuentassParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalRetencionesPorPagarPorCuentass(sAccionBusqueda,sTipoArchivoReporte,retencionesporpagarporcuentassParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoRetencionesPorPagarPorCuentasActionPerformed(null);
					//this.generarExcelReporteRetencionesPorPagarPorCuentass(sAccionBusqueda,sTipoArchivoReporte,retencionesporpagarporcuentassParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalRetencionesPorPagarPorCuentass(sAccionBusqueda,sTipoArchivoReporte,retencionesporpagarporcuentassParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesRetencionesPorPagarPorCuentass(sAccionBusqueda,sTipoArchivoReporte,retencionesporpagarporcuentassParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesRetencionesPorPagarPorCuentass(sAccionBusqueda,sTipoArchivoReporte,retencionesporpagarporcuentassParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRetencionesPorPagarPorCuentass(String sAccionBusqueda,String sTipoArchivoReporte,List<RetencionesPorPagarPorCuentas> retencionesporpagarporcuentassParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"retencionesporpagarporcuentas";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("RetencionesPorPagarPorCuentass");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderRetencionesPorPagarPorCuentas("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(RetencionesPorPagarPorCuentas retencionesporpagarporcuentas : retencionesporpagarporcuentassParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			RetencionesPorPagarPorCuentasConstantesFunciones.generarExcelReporteDataRetencionesPorPagarPorCuentas("NORMAL",row,workbook,retencionesporpagarporcuentas,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Retenciones Por Pagar Por Cuentas",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderRetencionesPorPagarPorCuentas(String sTipo,Row row,Workbook workbook) {
		
		RetencionesPorPagarPorCuentasConstantesFunciones.generarExcelReporteHeaderRetencionesPorPagarPorCuentas(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalRetencionesPorPagarPorCuentass(String sAccionBusqueda,String sTipoArchivoReporte,List<RetencionesPorPagarPorCuentas> retencionesporpagarporcuentassParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"retencionesporpagarporcuentas_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("RetencionesPorPagarPorCuentass");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(RetencionesPorPagarPorCuentas retencionesporpagarporcuentas : retencionesporpagarporcuentassParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(RetencionesPorPagarPorCuentasConstantesFunciones.getRetencionesPorPagarPorCuentasDescripcion(retencionesporpagarporcuentas));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(retencionesporpagarporcuentas.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(retencionesporpagarporcuentas.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_IDEJERCICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_IDEJERCICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(retencionesporpagarporcuentas.getejercicio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_IDPERIODO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_IDPERIODO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(retencionesporpagarporcuentas.getperiodo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_IDTIPORETENCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_IDTIPORETENCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(retencionesporpagarporcuentas.gettiporetencion_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_ESDEBITO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_ESDEBITO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(retencionesporpagarporcuentas.getes_debito()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_FECHAEMISION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_FECHAEMISION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(retencionesporpagarporcuentas.getfecha_emision());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBRETIPOMOVIMIENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBRETIPOMOVIMIENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(retencionesporpagarporcuentas.getnombre_tipo_movimiento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NUMEROMAYOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NUMEROMAYOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(retencionesporpagarporcuentas.getnumero_mayor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBRECUENTACONTABLERETENCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBRECUENTACONTABLERETENCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(retencionesporpagarporcuentas.getnombre_cuenta_contable_retencion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(retencionesporpagarporcuentas.getnumero_pre_impreso_factura());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_PORCENTAJE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_PORCENTAJE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(retencionesporpagarporcuentas.getporcentaje());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_BASEIMPONIBLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_BASEIMPONIBLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(retencionesporpagarporcuentas.getbase_imponible());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_VALOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_VALOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(retencionesporpagarporcuentas.getvalor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NUMERO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NUMERO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(retencionesporpagarporcuentas.getnumero());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBREBENEF))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBREBENEF);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(retencionesporpagarporcuentas.getnombre_benef());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_RUCBENEF))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_RUCBENEF);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(retencionesporpagarporcuentas.getruc_benef());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBRECUENTACONTABLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBRECUENTACONTABLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(retencionesporpagarporcuentas.getnombre_cuenta_contable());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBRECUENTACONTABLECREDITO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBRECUENTACONTABLECREDITO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(retencionesporpagarporcuentas.getnombre_cuenta_contable_credito());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_ESDEBITODATO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_ESDEBITODATO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(retencionesporpagarporcuentas.getes_debito_dato()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Retenciones Por Pagar Por Cuentas",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesRetencionesPorPagarPorCuentass(String sAccionBusqueda,String sTipoArchivoReporte,List<RetencionesPorPagarPorCuentas> retencionesporpagarporcuentassParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<RetencionesPorPagarPorCuentas> retencionesporpagarporcuentassRespaldo=null;
		
		classes=RetencionesPorPagarPorCuentasConstantesFunciones.getClassesRelationshipsOfRetencionesPorPagarPorCuentas(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.retencionesporpagarporcuentasLogic.setDatosCliente(this.datosCliente);
		this.retencionesporpagarporcuentasLogic.setDatosDeep(this.datosDeep);
		this.retencionesporpagarporcuentasLogic.setIsConDeep(true);
		
		retencionesporpagarporcuentassRespaldo=this.retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass();
		
		this.retencionesporpagarporcuentasLogic.setRetencionesPorPagarPorCuentass(retencionesporpagarporcuentassParaReportes);	
		this.retencionesporpagarporcuentasLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		retencionesporpagarporcuentassParaReportes=this.retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass();
		this.retencionesporpagarporcuentasLogic.setRetencionesPorPagarPorCuentass(retencionesporpagarporcuentassRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"retencionesporpagarporcuentas_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("RetencionesPorPagarPorCuentass");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderRetencionesPorPagarPorCuentas("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(RetencionesPorPagarPorCuentas retencionesporpagarporcuentas : retencionesporpagarporcuentassParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderRetencionesPorPagarPorCuentas("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			RetencionesPorPagarPorCuentasConstantesFunciones.generarExcelReporteDataRetencionesPorPagarPorCuentas("NORMAL",row,workbook,retencionesporpagarporcuentas,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(RetencionesPorPagarPorCuentasConstantesFunciones.getRetencionesPorPagarPorCuentasDescripcion(retencionesporpagarporcuentas));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Retenciones Por Pagar Por Cuentas",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoRetencionesPorPagarPorCuentas.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoRetencionesPorPagarPorCuentas.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoRetencionesPorPagarPorCuentas.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoRetencionesPorPagarPorCuentas.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessRetencionesPorPagarPorCuentas() throws Exception {		
		this.startProcessRetencionesPorPagarPorCuentas(true);
	}
	
	public void startProcessRetencionesPorPagarPorCuentas(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasRetencionesPorPagarPorCuentas ,this.jPanelParametrosReportesRetencionesPorPagarPorCuentas, this.jScrollPanelDatosRetencionesPorPagarPorCuentas,this.jPanelPaginacionRetencionesPorPagarPorCuentas, this.jScrollPanelDatosEdicionRetencionesPorPagarPorCuentas, this.jPanelAccionesRetencionesPorPagarPorCuentas,this.jPanelAccionesFormularioRetencionesPorPagarPorCuentas,this.jmenuBarRetencionesPorPagarPorCuentas,this.jmenuBarDetalleRetencionesPorPagarPorCuentas,this.jTtoolBarRetencionesPorPagarPorCuentas,this.jTtoolBarDetalleRetencionesPorPagarPorCuentas);		
		
		final JTabbedPane jTabbedPaneBusquedasRetencionesPorPagarPorCuentas=this.jTabbedPaneBusquedasRetencionesPorPagarPorCuentas; 
		
		final JPanel jPanelParametrosReportesRetencionesPorPagarPorCuentas=this.jPanelParametrosReportesRetencionesPorPagarPorCuentas;
		//final JScrollPane jScrollPanelDatosRetencionesPorPagarPorCuentas=this.jScrollPanelDatosRetencionesPorPagarPorCuentas;
		final JTable jTableDatosRetencionesPorPagarPorCuentas=this.jTableDatosRetencionesPorPagarPorCuentas;		
		final JPanel jPanelPaginacionRetencionesPorPagarPorCuentas=this.jPanelPaginacionRetencionesPorPagarPorCuentas;
		//final JScrollPane jScrollPanelDatosEdicionRetencionesPorPagarPorCuentas=this.jScrollPanelDatosEdicionRetencionesPorPagarPorCuentas;
		final JPanel jPanelAccionesRetencionesPorPagarPorCuentas=this.jPanelAccionesRetencionesPorPagarPorCuentas;
		
		JPanel jPanelCamposAuxiliarRetencionesPorPagarPorCuentas=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarRetencionesPorPagarPorCuentas=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) {
			jPanelCamposAuxiliarRetencionesPorPagarPorCuentas=this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jPanelCamposRetencionesPorPagarPorCuentas;
			jPanelAccionesFormularioAuxiliarRetencionesPorPagarPorCuentas=this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jPanelAccionesFormularioRetencionesPorPagarPorCuentas;
		}
		
		final JPanel jPanelCamposRetencionesPorPagarPorCuentas=jPanelCamposAuxiliarRetencionesPorPagarPorCuentas;
		final JPanel jPanelAccionesFormularioRetencionesPorPagarPorCuentas=jPanelAccionesFormularioAuxiliarRetencionesPorPagarPorCuentas;
		
		
		final JMenuBar jmenuBarRetencionesPorPagarPorCuentas=this.jmenuBarRetencionesPorPagarPorCuentas;
		final JToolBar jTtoolBarRetencionesPorPagarPorCuentas=this.jTtoolBarRetencionesPorPagarPorCuentas;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarRetencionesPorPagarPorCuentas=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarRetencionesPorPagarPorCuentas=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) {
			jmenuBarDetalleAuxiliarRetencionesPorPagarPorCuentas=this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jmenuBarDetalleRetencionesPorPagarPorCuentas;
			jTtoolBarDetalleAuxiliarRetencionesPorPagarPorCuentas=this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTtoolBarDetalleRetencionesPorPagarPorCuentas;
		}
		
		final JMenuBar jmenuBarDetalleRetencionesPorPagarPorCuentas=jmenuBarDetalleAuxiliarRetencionesPorPagarPorCuentas;
		final JToolBar jTtoolBarDetalleRetencionesPorPagarPorCuentas=jTtoolBarDetalleAuxiliarRetencionesPorPagarPorCuentas;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasRetencionesPorPagarPorCuentas;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesRetencionesPorPagarPorCuentas;
			processRunnable.jTableDatos=jTableDatosRetencionesPorPagarPorCuentas;
			processRunnable.jPanelCampos=jPanelCamposRetencionesPorPagarPorCuentas;
			processRunnable.jPanelPaginacion=jPanelPaginacionRetencionesPorPagarPorCuentas;
			processRunnable.jPanelAcciones=jPanelAccionesRetencionesPorPagarPorCuentas;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioRetencionesPorPagarPorCuentas;
			
			
			processRunnable.jmenuBar=jmenuBarRetencionesPorPagarPorCuentas;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleRetencionesPorPagarPorCuentas;
			processRunnable.jTtoolBar=jTtoolBarRetencionesPorPagarPorCuentas;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleRetencionesPorPagarPorCuentas;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasRetencionesPorPagarPorCuentas ,jPanelParametrosReportesRetencionesPorPagarPorCuentas,jTableDatosRetencionesPorPagarPorCuentas, /*jScrollPanelDatosRetencionesPorPagarPorCuentas,*/jPanelCamposRetencionesPorPagarPorCuentas,jPanelPaginacionRetencionesPorPagarPorCuentas, /*jScrollPanelDatosEdicionRetencionesPorPagarPorCuentas,*/ jPanelAccionesRetencionesPorPagarPorCuentas,jPanelAccionesFormularioRetencionesPorPagarPorCuentas,jmenuBarRetencionesPorPagarPorCuentas,jmenuBarDetalleRetencionesPorPagarPorCuentas,jTtoolBarRetencionesPorPagarPorCuentas,jTtoolBarDetalleRetencionesPorPagarPorCuentas);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasRetencionesPorPagarPorCuentas ,jPanelParametrosReportesRetencionesPorPagarPorCuentas, jScrollPanelDatosRetencionesPorPagarPorCuentas,jPanelPaginacionRetencionesPorPagarPorCuentas, jScrollPanelDatosEdicionRetencionesPorPagarPorCuentas, jPanelAccionesRetencionesPorPagarPorCuentas,jPanelAccionesFormularioRetencionesPorPagarPorCuentas,jmenuBarRetencionesPorPagarPorCuentas,jmenuBarDetalleRetencionesPorPagarPorCuentas,jTtoolBarRetencionesPorPagarPorCuentas,jTtoolBarDetalleRetencionesPorPagarPorCuentas);
						
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
	
	public void finishProcessRetencionesPorPagarPorCuentas() {// throws Exception 
		this.finishProcessRetencionesPorPagarPorCuentas(true);
	}
	
	public void finishProcessRetencionesPorPagarPorCuentas(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasRetencionesPorPagarPorCuentas ,this.jPanelParametrosReportesRetencionesPorPagarPorCuentas, this.jScrollPanelDatosRetencionesPorPagarPorCuentas,this.jPanelPaginacionRetencionesPorPagarPorCuentas, this.jScrollPanelDatosEdicionRetencionesPorPagarPorCuentas, this.jPanelAccionesRetencionesPorPagarPorCuentas,this.jPanelAccionesFormularioRetencionesPorPagarPorCuentas,this.jmenuBarRetencionesPorPagarPorCuentas,this.jmenuBarDetalleRetencionesPorPagarPorCuentas,this.jTtoolBarRetencionesPorPagarPorCuentas,this.jTtoolBarDetalleRetencionesPorPagarPorCuentas);		
		
		final JTabbedPane jTabbedPaneBusquedasRetencionesPorPagarPorCuentas=this.jTabbedPaneBusquedasRetencionesPorPagarPorCuentas; 
		
		final JPanel jPanelParametrosReportesRetencionesPorPagarPorCuentas=this.jPanelParametrosReportesRetencionesPorPagarPorCuentas;
		//final JScrollPane jScrollPanelDatosRetencionesPorPagarPorCuentas=this.jScrollPanelDatosRetencionesPorPagarPorCuentas;
		final JTable jTableDatosRetencionesPorPagarPorCuentas=this.jTableDatosRetencionesPorPagarPorCuentas;		
		final JPanel jPanelPaginacionRetencionesPorPagarPorCuentas=this.jPanelPaginacionRetencionesPorPagarPorCuentas;
		//final JScrollPane jScrollPanelDatosEdicionRetencionesPorPagarPorCuentas=this.jScrollPanelDatosEdicionRetencionesPorPagarPorCuentas;
		final JPanel jPanelAccionesRetencionesPorPagarPorCuentas=this.jPanelAccionesRetencionesPorPagarPorCuentas;
		
		JPanel jPanelCamposAuxiliarRetencionesPorPagarPorCuentas=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarRetencionesPorPagarPorCuentas=new JPanel();
		
		if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) {
			jPanelCamposAuxiliarRetencionesPorPagarPorCuentas=this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jPanelCamposRetencionesPorPagarPorCuentas;
			jPanelAccionesFormularioAuxiliarRetencionesPorPagarPorCuentas=this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jPanelAccionesFormularioRetencionesPorPagarPorCuentas;
		}
		
		final JPanel jPanelCamposRetencionesPorPagarPorCuentas=jPanelCamposAuxiliarRetencionesPorPagarPorCuentas;
		final JPanel jPanelAccionesFormularioRetencionesPorPagarPorCuentas=jPanelAccionesFormularioAuxiliarRetencionesPorPagarPorCuentas;
		
		
		final JMenuBar jmenuBarRetencionesPorPagarPorCuentas=this.jmenuBarRetencionesPorPagarPorCuentas;		
		final JToolBar jTtoolBarRetencionesPorPagarPorCuentas=this.jTtoolBarRetencionesPorPagarPorCuentas;
				
		JMenuBar jmenuBarDetalleAuxiliarRetencionesPorPagarPorCuentas=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarRetencionesPorPagarPorCuentas=new JToolBar();
		
		if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) {
			jmenuBarDetalleAuxiliarRetencionesPorPagarPorCuentas=this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jmenuBarDetalleRetencionesPorPagarPorCuentas;
			jTtoolBarDetalleAuxiliarRetencionesPorPagarPorCuentas=this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTtoolBarDetalleRetencionesPorPagarPorCuentas;		
		}
		
		final JMenuBar jmenuBarDetalleRetencionesPorPagarPorCuentas=jmenuBarDetalleAuxiliarRetencionesPorPagarPorCuentas;
		final JToolBar jTtoolBarDetalleRetencionesPorPagarPorCuentas=jTtoolBarDetalleAuxiliarRetencionesPorPagarPorCuentas;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasRetencionesPorPagarPorCuentas;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesRetencionesPorPagarPorCuentas;
			processRunnable.jTableDatos=jTableDatosRetencionesPorPagarPorCuentas;
			processRunnable.jPanelCampos=jPanelCamposRetencionesPorPagarPorCuentas;
			processRunnable.jPanelPaginacion=jPanelPaginacionRetencionesPorPagarPorCuentas;
			processRunnable.jPanelAcciones=jPanelAccionesRetencionesPorPagarPorCuentas;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioRetencionesPorPagarPorCuentas;
			
			
			processRunnable.jmenuBar=jmenuBarRetencionesPorPagarPorCuentas;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleRetencionesPorPagarPorCuentas;
			processRunnable.jTtoolBar=jTtoolBarRetencionesPorPagarPorCuentas;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleRetencionesPorPagarPorCuentas;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasRetencionesPorPagarPorCuentas ,jPanelParametrosReportesRetencionesPorPagarPorCuentas, jTableDatosRetencionesPorPagarPorCuentas,/*jScrollPanelDatosRetencionesPorPagarPorCuentas,*/jPanelCamposRetencionesPorPagarPorCuentas,jPanelPaginacionRetencionesPorPagarPorCuentas, /*jScrollPanelDatosEdicionRetencionesPorPagarPorCuentas,*/ jPanelAccionesRetencionesPorPagarPorCuentas,jPanelAccionesFormularioRetencionesPorPagarPorCuentas,jmenuBarRetencionesPorPagarPorCuentas,jmenuBarDetalleRetencionesPorPagarPorCuentas,jTtoolBarRetencionesPorPagarPorCuentas,jTtoolBarDetalleRetencionesPorPagarPorCuentas));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesRetencionesPorPagarPorCuentas(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarRetencionesPorPagarPorCuentas(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuRetencionesPorPagarPorCuentas(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarRetencionesPorPagarPorCuentas(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarRetencionesPorPagarPorCuentas,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleRetencionesPorPagarPorCuentas,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuRetencionesPorPagarPorCuentas(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarRetencionesPorPagarPorCuentas,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleRetencionesPorPagarPorCuentas,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.retencionesporpagarporcuentasConstantesFunciones.getsFinalQueryRetencionesPorPagarPorCuentas();
		String  finalQueryPaginacionTodos=this.retencionesporpagarporcuentasConstantesFunciones.getsFinalQueryRetencionesPorPagarPorCuentas();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=RetencionesPorPagarPorCuentasConstantesFunciones.getArrayColumnasGlobalesNoRetencionesPorPagarPorCuentas(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=RetencionesPorPagarPorCuentasConstantesFunciones.getArrayColumnasGlobalesRetencionesPorPagarPorCuentas(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,RetencionesPorPagarPorCuentasConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.retencionesporpagarporcuentassEliminados= new ArrayList<RetencionesPorPagarPorCuentas>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessRetencionesPorPagarPorCuentas();
		
				///*RetencionesPorPagarPorCuentasSessionBean*/this.retencionesporpagarporcuentasSessionBean=new RetencionesPorPagarPorCuentasSessionBean();
			
			if(this.retencionesporpagarporcuentasSessionBean==null) {
				this.retencionesporpagarporcuentasSessionBean=new RetencionesPorPagarPorCuentasSessionBean();
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
					this.iNumeroPaginacion=RetencionesPorPagarPorCuentasConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=RetencionesPorPagarPorCuentasConstantesFunciones.getClassesForeignKeysOfRetencionesPorPagarPorCuentas(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/retencionesporpagarporcuentas."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			retencionesporpagarporcuentassAux= new ArrayList<RetencionesPorPagarPorCuentas>();
			
				
			retencionesporpagarporcuentasLogic.setDatosCliente(this.datosCliente);
			retencionesporpagarporcuentasLogic.setDatosDeep(this.datosDeep);
			retencionesporpagarporcuentasLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaRetencionesPorPagarPorCuentas")) {
				this.sDetalleReporte=RetencionesPorPagarPorCuentasConstantesFunciones.getDetalleIndiceBusquedaRetencionesPorPagarPorCuentas(id_ejercicioBusquedaRetencionesPorPagarPorCuentas,id_periodoBusquedaRetencionesPorPagarPorCuentas,id_tipo_retencionBusquedaRetencionesPorPagarPorCuentas,es_debitoBusquedaRetencionesPorPagarPorCuentas);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentassBusquedaRetencionesPorPagarPorCuentas(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_ejercicioBusquedaRetencionesPorPagarPorCuentas,id_periodoBusquedaRetencionesPorPagarPorCuentas,id_tipo_retencionBusquedaRetencionesPorPagarPorCuentas,es_debitoBusquedaRetencionesPorPagarPorCuentas);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RetencionesPorPagarPorCuentasConstantesFunciones.getDetalleIndiceBusquedaRetencionesPorPagarPorCuentas(id_ejercicioBusquedaRetencionesPorPagarPorCuentas,id_periodoBusquedaRetencionesPorPagarPorCuentas,id_tipo_retencionBusquedaRetencionesPorPagarPorCuentas,es_debitoBusquedaRetencionesPorPagarPorCuentas);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RetencionesPorPagarPorCuentasConstantesFunciones.getDetalleIndiceBusquedaRetencionesPorPagarPorCuentas(id_ejercicioBusquedaRetencionesPorPagarPorCuentas,id_periodoBusquedaRetencionesPorPagarPorCuentas,id_tipo_retencionBusquedaRetencionesPorPagarPorCuentas,es_debitoBusquedaRetencionesPorPagarPorCuentas);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass()==null||retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=retencionesporpagarporcuentass==null|| retencionesporpagarporcuentass.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						retencionesporpagarporcuentassAux=new ArrayList<RetencionesPorPagarPorCuentas>();
						retencionesporpagarporcuentassAux.addAll(retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							retencionesporpagarporcuentassAux=new ArrayList<RetencionesPorPagarPorCuentas>();
							retencionesporpagarporcuentassAux.addAll(retencionesporpagarporcuentass);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentassBusquedaRetencionesPorPagarPorCuentas(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_ejercicioBusquedaRetencionesPorPagarPorCuentas,id_periodoBusquedaRetencionesPorPagarPorCuentas,id_tipo_retencionBusquedaRetencionesPorPagarPorCuentas,es_debitoBusquedaRetencionesPorPagarPorCuentas);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RetencionesPorPagarPorCuentasConstantesFunciones.getDetalleIndiceBusquedaRetencionesPorPagarPorCuentas(id_ejercicioBusquedaRetencionesPorPagarPorCuentas,id_periodoBusquedaRetencionesPorPagarPorCuentas,id_tipo_retencionBusquedaRetencionesPorPagarPorCuentas,es_debitoBusquedaRetencionesPorPagarPorCuentas);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RetencionesPorPagarPorCuentasConstantesFunciones.getDetalleIndiceBusquedaRetencionesPorPagarPorCuentas(id_ejercicioBusquedaRetencionesPorPagarPorCuentas,id_periodoBusquedaRetencionesPorPagarPorCuentas,id_tipo_retencionBusquedaRetencionesPorPagarPorCuentas,es_debitoBusquedaRetencionesPorPagarPorCuentas);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteRetencionesPorPagarPorCuentass("BusquedaRetencionesPorPagarPorCuentas",retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteRetencionesPorPagarPorCuentass("BusquedaRetencionesPorPagarPorCuentas",retencionesporpagarporcuentass);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						retencionesporpagarporcuentasLogic.setRetencionesPorPagarPorCuentass(new ArrayList<RetencionesPorPagarPorCuentas>());
						retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass().addAll(retencionesporpagarporcuentassAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							retencionesporpagarporcuentass=new ArrayList<RetencionesPorPagarPorCuentas>();
							retencionesporpagarporcuentass.addAll(retencionesporpagarporcuentassAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesRetencionesPorPagarPorCuentas();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessRetencionesPorPagarPorCuentas();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=retencionesporpagarporcuentass.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=retencionesporpagarporcuentass.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(RetencionesPorPagarPorCuentas retencionesporpagarporcuentas) {
		Boolean permite=true;
		
		if(this.retencionesporpagarporcuentas.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=RetencionesPorPagarPorCuentasConstantesFunciones.getOrderByListaRetencionesPorPagarPorCuentas();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=RetencionesPorPagarPorCuentasConstantesFunciones.getOrderByListaRetencionesPorPagarPorCuentas();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(RetencionesPorPagarPorCuentas retencionesporpagarporcuentas:retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass()) {
				if(retencionesporpagarporcuentas.getsType().equals(Constantes2.S_TOTALES)) {
					retencionesporpagarporcuentasTotales=retencionesporpagarporcuentas;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(RetencionesPorPagarPorCuentas retencionesporpagarporcuentas:this.retencionesporpagarporcuentass) {
				if(retencionesporpagarporcuentas.getsType().equals(Constantes2.S_TOTALES)) {
					retencionesporpagarporcuentasTotales=retencionesporpagarporcuentas;
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
			this.retencionesporpagarporcuentasAux=new RetencionesPorPagarPorCuentas();
			this.retencionesporpagarporcuentasAux.setsType(Constantes2.S_TOTALES);
			this.retencionesporpagarporcuentasAux.setIsNew(false);
			this.retencionesporpagarporcuentasAux.setIsChanged(false);
			this.retencionesporpagarporcuentasAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//RetencionesPorPagarPorCuentasConstantesFunciones.TotalizarValoresFilaRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass(),this.retencionesporpagarporcuentasAux);
				
				//this.retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass().add(this.retencionesporpagarporcuentasAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				RetencionesPorPagarPorCuentasConstantesFunciones.TotalizarValoresFilaRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentass,this.retencionesporpagarporcuentasAux);
				
				this.retencionesporpagarporcuentass.add(this.retencionesporpagarporcuentasAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		retencionesporpagarporcuentasTotales=new RetencionesPorPagarPorCuentas();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass().remove(retencionesporpagarporcuentasTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.retencionesporpagarporcuentass.remove(retencionesporpagarporcuentasTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		retencionesporpagarporcuentasTotales=new RetencionesPorPagarPorCuentas();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(RetencionesPorPagarPorCuentas retencionesporpagarporcuentas:retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass()) {
				if(retencionesporpagarporcuentas.getsType().equals(Constantes2.S_TOTALES)) {
					retencionesporpagarporcuentasTotales=retencionesporpagarporcuentas;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				RetencionesPorPagarPorCuentasConstantesFunciones.TotalizarValoresFilaRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass(),retencionesporpagarporcuentasTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(RetencionesPorPagarPorCuentas retencionesporpagarporcuentas:this.retencionesporpagarporcuentass) {
				if(retencionesporpagarporcuentas.getsType().equals(Constantes2.S_TOTALES)) {
					retencionesporpagarporcuentasTotales=retencionesporpagarporcuentas;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				RetencionesPorPagarPorCuentasConstantesFunciones.TotalizarValoresFilaRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentass,retencionesporpagarporcuentasTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getRetencionesPorPagarPorCuentassBusquedaRetencionesPorPagarPorCuentas()throws Exception {
		try {
			sAccionBusqueda="BusquedaRetencionesPorPagarPorCuentas";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getRetencionesPorPagarPorCuentassFK_IdEjercicio()throws Exception {
		try {
			sAccionBusqueda="FK_IdEjercicio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getRetencionesPorPagarPorCuentassFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getRetencionesPorPagarPorCuentassFK_IdPeriodo()throws Exception {
		try {
			sAccionBusqueda="FK_IdPeriodo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getRetencionesPorPagarPorCuentassFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getRetencionesPorPagarPorCuentassFK_IdTipoRetencion()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoRetencion";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getRetencionesPorPagarPorCuentassBusquedaRetencionesPorPagarPorCuentas(String sFinalQuery,Long id_ejercicio,Long id_periodo,Long id_tipo_retencion,Boolean es_debito)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentassBusquedaRetencionesPorPagarPorCuentas(sFinalQuery,this.pagination,id_ejercicio,id_periodo,id_tipo_retencion,es_debito);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getRetencionesPorPagarPorCuentassFK_IdEjercicio(String sFinalQuery,Long id_ejercicio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentassFK_IdEjercicio(sFinalQuery,this.pagination,id_ejercicio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getRetencionesPorPagarPorCuentassFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentassFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getRetencionesPorPagarPorCuentassFK_IdPeriodo(String sFinalQuery,Long id_periodo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentassFK_IdPeriodo(sFinalQuery,this.pagination,id_periodo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getRetencionesPorPagarPorCuentassFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentassFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getRetencionesPorPagarPorCuentassFK_IdTipoRetencion(String sFinalQuery,Long id_tipo_retencion)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentassFK_IdTipoRetencion(sFinalQuery,this.pagination,id_tipo_retencion);
				
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
	
	public void inicializarPermisosRetencionesPorPagarPorCuentas() {
		this.isPermisoTodoRetencionesPorPagarPorCuentas=false;
		this.isPermisoNuevoRetencionesPorPagarPorCuentas=false;
		this.isPermisoActualizarRetencionesPorPagarPorCuentas=false;
		this.isPermisoActualizarOriginalRetencionesPorPagarPorCuentas=false;
		this.isPermisoEliminarRetencionesPorPagarPorCuentas=false;
		this.isPermisoGuardarCambiosRetencionesPorPagarPorCuentas=false;
		this.isPermisoConsultaRetencionesPorPagarPorCuentas=true;
		this.isPermisoBusquedaRetencionesPorPagarPorCuentas=true;
		this.isPermisoReporteRetencionesPorPagarPorCuentas=true;
		this.isPermisoOrdenRetencionesPorPagarPorCuentas=false;		
		this.isPermisoPaginacionMedioRetencionesPorPagarPorCuentas=false;		
		this.isPermisoPaginacionAltoRetencionesPorPagarPorCuentas=false;		
		this.isPermisoPaginacionTodoRetencionesPorPagarPorCuentas=false;		
		this.isPermisoCopiarRetencionesPorPagarPorCuentas=false;		
		this.isPermisoVerFormRetencionesPorPagarPorCuentas=false;		
		this.isPermisoDuplicarRetencionesPorPagarPorCuentas=false;
		this.isPermisoOrdenRetencionesPorPagarPorCuentas=false;
	}
	
	public void setPermisosUsuarioRetencionesPorPagarPorCuentas(Boolean isPermiso) {
		this.isPermisoTodoRetencionesPorPagarPorCuentas=isPermiso;
		this.isPermisoNuevoRetencionesPorPagarPorCuentas=isPermiso;
		this.isPermisoActualizarRetencionesPorPagarPorCuentas=isPermiso;
		this.isPermisoActualizarOriginalRetencionesPorPagarPorCuentas=isPermiso;
		this.isPermisoEliminarRetencionesPorPagarPorCuentas=isPermiso;
		this.isPermisoGuardarCambiosRetencionesPorPagarPorCuentas=isPermiso;
		this.isPermisoConsultaRetencionesPorPagarPorCuentas=isPermiso;
		this.isPermisoBusquedaRetencionesPorPagarPorCuentas=isPermiso;
		this.isPermisoReporteRetencionesPorPagarPorCuentas=isPermiso;
		this.isPermisoOrdenRetencionesPorPagarPorCuentas=isPermiso;		
		this.isPermisoPaginacionMedioRetencionesPorPagarPorCuentas=isPermiso;		
		this.isPermisoPaginacionAltoRetencionesPorPagarPorCuentas=isPermiso;		
		this.isPermisoPaginacionTodoRetencionesPorPagarPorCuentas=isPermiso;		
		this.isPermisoCopiarRetencionesPorPagarPorCuentas=isPermiso;		
		this.isPermisoVerFormRetencionesPorPagarPorCuentas=isPermiso;		
		this.isPermisoDuplicarRetencionesPorPagarPorCuentas=isPermiso;
		this.isPermisoOrdenRetencionesPorPagarPorCuentas=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioRetencionesPorPagarPorCuentas(Boolean isPermiso) {
		//this.isPermisoTodoRetencionesPorPagarPorCuentas=isPermiso;
		this.isPermisoNuevoRetencionesPorPagarPorCuentas=isPermiso;
		this.isPermisoActualizarRetencionesPorPagarPorCuentas=isPermiso;
		this.isPermisoActualizarOriginalRetencionesPorPagarPorCuentas=isPermiso;
		this.isPermisoEliminarRetencionesPorPagarPorCuentas=isPermiso;
		this.isPermisoGuardarCambiosRetencionesPorPagarPorCuentas=isPermiso;
		//this.isPermisoConsultaRetencionesPorPagarPorCuentas=isPermiso;
		//this.isPermisoBusquedaRetencionesPorPagarPorCuentas=isPermiso;
		//this.isPermisoReporteRetencionesPorPagarPorCuentas=isPermiso;
		//this.isPermisoOrdenRetencionesPorPagarPorCuentas=isPermiso;		
		//this.isPermisoPaginacionMedioRetencionesPorPagarPorCuentas=isPermiso;		
		//this.isPermisoPaginacionAltoRetencionesPorPagarPorCuentas=isPermiso;		
		//this.isPermisoPaginacionTodoRetencionesPorPagarPorCuentas=isPermiso;		
		//this.isPermisoCopiarRetencionesPorPagarPorCuentas=isPermiso;		
		//this.isPermisoDuplicarRetencionesPorPagarPorCuentas=isPermiso;
		//this.isPermisoOrdenRetencionesPorPagarPorCuentas=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioRetencionesPorPagarPorCuentasClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(RetencionesPorPagarPorCuentasJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebRetencionesPorPagarPorCuentas(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioRetencionesPorPagarPorCuentasClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioRetencionesPorPagarPorCuentasClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionRetencionesPorPagarPorCuentasClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioRetencionesPorPagarPorCuentasClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioRetencionesPorPagarPorCuentas() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(RetencionesPorPagarPorCuentasJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, RetencionesPorPagarPorCuentasConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoRetencionesPorPagarPorCuentas=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarRetencionesPorPagarPorCuentas=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalRetencionesPorPagarPorCuentas=this.isPermisoActualizarRetencionesPorPagarPorCuentas;
			this.isPermisoEliminarRetencionesPorPagarPorCuentas=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosRetencionesPorPagarPorCuentas=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaRetencionesPorPagarPorCuentas=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaRetencionesPorPagarPorCuentas=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoRetencionesPorPagarPorCuentas=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteRetencionesPorPagarPorCuentas=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenRetencionesPorPagarPorCuentas=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioRetencionesPorPagarPorCuentas=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoRetencionesPorPagarPorCuentas=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoRetencionesPorPagarPorCuentas=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarRetencionesPorPagarPorCuentas=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormRetencionesPorPagarPorCuentas=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarRetencionesPorPagarPorCuentas=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenRetencionesPorPagarPorCuentas=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosRetencionesPorPagarPorCuentas.setToolTipText(this.jTableDatosRetencionesPorPagarPorCuentas.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioRetencionesPorPagarPorCuentas(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioRetencionesPorPagarPorCuentas(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(RetencionesPorPagarPorCuentasJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(RetencionesPorPagarPorCuentasJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioRetencionesPorPagarPorCuentas() throws Exception {
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
	public void inicializarCombosForeignKeyRetencionesPorPagarPorCuentasListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.ejerciciosForeignKey=new ArrayList();
				this.periodosForeignKey=new ArrayList();
				this.tiporetencionsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyRetencionesPorPagarPorCuentasListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(RetencionesPorPagarPorCuentasJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEjercicioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyPeriodoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoRetencionListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyTipoRetencionListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tiporetencionsForeignKey==null||this.tiporetencionsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoRetencionConstantesFunciones.getArrayColumnasGlobalesTipoRetencion(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoRetencionConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoRetencionConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoRetencionsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public void addItemDefectoCombosTodosForeignKeyRetencionesPorPagarPorCuentas()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyEjercicio();
			this.addItemDefectoCombosForeignKeyPeriodo();
			this.addItemDefectoCombosForeignKeyTipoRetencion();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.retencionesporpagarporcuentasSessionBean==null) {
				this.retencionesporpagarporcuentasSessionBean=new RetencionesPorPagarPorCuentasSessionBean();
			}

			if(!this.retencionesporpagarporcuentasSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.retencionesporpagarporcuentasSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

			if(!this.retencionesporpagarporcuentasSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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

			if(!this.retencionesporpagarporcuentasSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
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

	public void addItemDefectoCombosForeignKeyTipoRetencion()throws Exception {
		try {

			if(!this.retencionesporpagarporcuentasSessionBean.getisBusquedaDesdeForeignKeySesionTipoRetencion()) {
				TipoRetencion tiporetencion=new TipoRetencion();
				TipoRetencionConstantesFunciones.setTipoRetencionDescripcion(tiporetencion,Constantes.SMENSAJE_ESCOJA_OPCION);
				tiporetencion.setId(null);

				if(!TipoRetencionConstantesFunciones.ExisteEnLista(this.tiporetencionsForeignKey,tiporetencion,true)) {

					this.tiporetencionsForeignKey.add(0,tiporetencion);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyRetencionesPorPagarPorCuentas()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyRetencionesPorPagarPorCuentas(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyRetencionesPorPagarPorCuentas()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyRetencionesPorPagarPorCuentas();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyRetencionesPorPagarPorCuentas(RetencionesPorPagarPorCuentas retencionesporpagarporcuentas)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyRetencionesPorPagarPorCuentas(RetencionesPorPagarPorCuentas retencionesporpagarporcuentas,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyRetencionesPorPagarPorCuentas()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyRetencionesPorPagarPorCuentas()throws Exception {	
		try {
			

				if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) {
					Ejercicio ejercicioActual=(Ejercicio)this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxid_ejercicioRetencionesPorPagarPorCuentas.getSelectedItem();
				}

				if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) {
					Periodo periodoActual=(Periodo)this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxid_periodoRetencionesPorPagarPorCuentas.getSelectedItem();
				}
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyRetencionesPorPagarPorCuentas()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyRetencionesPorPagarPorCuentas()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroRetencionesPorPagarPorCuentas()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyRetencionesPorPagarPorCuentas()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameEjerciciosForeignKey("Todos");
			this.cargarCombosFramePeriodosForeignKey("Todos");
			this.cargarCombosFrameTipoRetencionsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyRetencionesPorPagarPorCuentas(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEjerciciosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFramePeriodosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoRetencionsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyRetencionesPorPagarPorCuentas()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxid_empresaRetencionesPorPagarPorCuentas!=null && this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxid_empresaRetencionesPorPagarPorCuentas.getItemCount()>0) {
				this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxid_empresaRetencionesPorPagarPorCuentas.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxid_sucursalRetencionesPorPagarPorCuentas!=null && this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxid_sucursalRetencionesPorPagarPorCuentas.getItemCount()>0) {
				this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxid_sucursalRetencionesPorPagarPorCuentas.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxid_ejercicioRetencionesPorPagarPorCuentas!=null && this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxid_ejercicioRetencionesPorPagarPorCuentas.getItemCount()>0) {
				this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxid_ejercicioRetencionesPorPagarPorCuentas.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxid_periodoRetencionesPorPagarPorCuentas!=null && this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxid_periodoRetencionesPorPagarPorCuentas.getItemCount()>0) {
				this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxid_periodoRetencionesPorPagarPorCuentas.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxid_tipo_retencionRetencionesPorPagarPorCuentas!=null && this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxid_tipo_retencionRetencionesPorPagarPorCuentas.getItemCount()>0) {
				this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxid_tipo_retencionRetencionesPorPagarPorCuentas.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	










	
	

	public RetencionesPorPagarPorCuentasBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public RetencionesPorPagarPorCuentasBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public RetencionesPorPagarPorCuentasBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.retencionesporpagarporcuentasSessionBean=new RetencionesPorPagarPorCuentasSessionBean(); 
		this.retencionesporpagarporcuentasConstantesFunciones=new RetencionesPorPagarPorCuentasConstantesFunciones(); 
		this.retencionesporpagarporcuentasBean=new RetencionesPorPagarPorCuentas();//(this.retencionesporpagarporcuentasConstantesFunciones); 		
		this.retencionesporpagarporcuentasReturnGeneral=new RetencionesPorPagarPorCuentasParameterReturnGeneral(); 
		
		this.retencionesporpagarporcuentasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.retencionesporpagarporcuentasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public RetencionesPorPagarPorCuentasBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public RetencionesPorPagarPorCuentasBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public RetencionesPorPagarPorCuentasBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessRetencionesPorPagarPorCuentas(true);
			
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
			
			this.retencionesporpagarporcuentasConstantesFunciones=new RetencionesPorPagarPorCuentasConstantesFunciones(); 
			this.retencionesporpagarporcuentasBean=new RetencionesPorPagarPorCuentas();//this.retencionesporpagarporcuentasConstantesFunciones); 			
			this.retencionesporpagarporcuentasReturnGeneral=new RetencionesPorPagarPorCuentasParameterReturnGeneral(); 
		
			RetencionesPorPagarPorCuentasBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Retenciones Por Pagar Por Cuentas Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.retencionesporpagarporcuentas=new RetencionesPorPagarPorCuentas();
			this.retencionesporpagarporcuentass = new ArrayList<RetencionesPorPagarPorCuentas>();
			this.retencionesporpagarporcuentassAux = new ArrayList<RetencionesPorPagarPorCuentas>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporcuentasLogic=new RetencionesPorPagarPorCuentasLogic();
				this.retencionesporpagarporcuentasLogic.getNewConnexionToDeep("");
			}
			
			//this.retencionesporpagarporcuentasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.retencionesporpagarporcuentasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoRetencionesPorPagarPorCuentas!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoRetencionesPorPagarPorCuentas);	
					}
					
					if(this.jInternalFrameImportacionRetencionesPorPagarPorCuentas!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionRetencionesPorPagarPorCuentas);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByRetencionesPorPagarPorCuentas!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByRetencionesPorPagarPorCuentas);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas);
				this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.setVisible(false);
				this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoRetencionesPorPagarPorCuentas!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoRetencionesPorPagarPorCuentas);
					this.jInternalFrameReporteDinamicoRetencionesPorPagarPorCuentas.setVisible(false);
					this.jInternalFrameReporteDinamicoRetencionesPorPagarPorCuentas.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionRetencionesPorPagarPorCuentas!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionRetencionesPorPagarPorCuentas);
					this.jInternalFrameImportacionRetencionesPorPagarPorCuentas.setVisible(false);
					this.jInternalFrameImportacionRetencionesPorPagarPorCuentas.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByRetencionesPorPagarPorCuentas!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByRetencionesPorPagarPorCuentas);
					this.jInternalFrameOrderByRetencionesPorPagarPorCuentas.setVisible(false);
					this.jInternalFrameOrderByRetencionesPorPagarPorCuentas.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idRetencionesPorPagarPorCuentasActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=RetencionesPorPagarPorCuentasConstantesFunciones.INUMEROPAGINACION;
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
			
			this.retencionesporpagarporcuentasReturnGeneral=new RetencionesPorPagarPorCuentasParameterReturnGeneral();
			
			this.retencionesporpagarporcuentasParameterGeneral=new RetencionesPorPagarPorCuentasParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.retencionesporpagarporcuentasLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado()) {
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
			
			if(RetencionesPorPagarPorCuentasJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,RetencionesPorPagarPorCuentasConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado(),this.retencionesporpagarporcuentasSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,RetencionesPorPagarPorCuentasConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado(),this.retencionesporpagarporcuentasSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoRetencionesPorPagarPorCuentas=false;
			this.isVisibilidadCeldaDuplicarRetencionesPorPagarPorCuentas=true;
			this.isVisibilidadCeldaCopiarRetencionesPorPagarPorCuentas=true;
			this.isVisibilidadCeldaVerFormRetencionesPorPagarPorCuentas=true;
			this.isVisibilidadCeldaOrdenRetencionesPorPagarPorCuentas=true;
			this.isVisibilidadCeldaNuevoRelacionesRetencionesPorPagarPorCuentas=false;
			this.isVisibilidadCeldaModificarRetencionesPorPagarPorCuentas=false;
			this.isVisibilidadCeldaActualizarRetencionesPorPagarPorCuentas=false;
			this.isVisibilidadCeldaEliminarRetencionesPorPagarPorCuentas=false;
			this.isVisibilidadCeldaCancelarRetencionesPorPagarPorCuentas=false;
			this.isVisibilidadCeldaGuardarRetencionesPorPagarPorCuentas=false;
			this.isVisibilidadCeldaGuardarCambiosRetencionesPorPagarPorCuentas=false;
			
			
			this.isVisibilidadBusquedaRetencionesPorPagarPorCuentas=true;
			this.isVisibilidadFK_IdEjercicio=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdPeriodo=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdTipoRetencion=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesRetencionesPorPagarPorCuentas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosRetencionesPorPagarPorCuentas();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioRetencionesPorPagarPorCuentas(false);
			
			this.setPermisosUsuarioRetencionesPorPagarPorCuentas();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado() 
				|| (this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado() && this.retencionesporpagarporcuentasSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioRetencionesPorPagarPorCuentasClasesRelacionadas();
			}
			
			if(this.retencionesporpagarporcuentasSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioRetencionesPorPagarPorCuentasClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!RetencionesPorPagarPorCuentasJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosRetencionesPorPagarPorCuentas();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualRetencionesPorPagarPorCuentas();
			}
			
			if(!this.isPermisoBusquedaRetencionesPorPagarPorCuentas) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasRetencionesPorPagarPorCuentas.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(RetencionesPorPagarPorCuentasConstantesFunciones.getTiposSeleccionarRetencionesPorPagarPorCuentas());
				
				this.tiposColumnasSelect=RetencionesPorPagarPorCuentasConstantesFunciones.getTiposSeleccionarRetencionesPorPagarPorCuentas(true);
				
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
			//if(!this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioRetencionesPorPagarPorCuentas();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioRetencionesPorPagarPorCuentas(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioRetencionesPorPagarPorCuentas(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesRetencionesPorPagarPorCuentas() ;
			
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
			this.tiporetencionLogic=new TipoRetencionLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				retencionesporpagarporcuentasImplementable= (RetencionesPorPagarPorCuentasImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+RetencionesPorPagarPorCuentasConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				retencionesporpagarporcuentasImplementableHome= (RetencionesPorPagarPorCuentasImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+RetencionesPorPagarPorCuentasConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.retencionesporpagarporcuentass= new ArrayList<RetencionesPorPagarPorCuentas>();
			this.retencionesporpagarporcuentassEliminados= new ArrayList<RetencionesPorPagarPorCuentas>();
						
			this.isEsNuevoRetencionesPorPagarPorCuentas=false;
			this.esParaAccionDesdeFormularioRetencionesPorPagarPorCuentas=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>() ;
			this.periodosForeignKey=new ArrayList<Periodo>() ;
			this.tiporetencionsForeignKey=new ArrayList<TipoRetencion>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyRetencionesPorPagarPorCuentas(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroRetencionesPorPagarPorCuentas();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			RetencionesPorPagarPorCuentasBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=RetencionesPorPagarPorCuentasConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesRetencionesPorPagarPorCuentas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingRetencionesPorPagarPorCuentas(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioRetencionesPorPagarPorCuentas();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioRetencionesPorPagarPorCuentas();
			}
			
			RetencionesPorPagarPorCuentasBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasRetencionesPorPagarPorCuentas.getTabCount(); i++) {
					this.jTabbedPaneBusquedasRetencionesPorPagarPorCuentas.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasRetencionesPorPagarPorCuentas.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporcuentasLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessRetencionesPorPagarPorCuentas(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga RetencionesPorPagarPorCuentas: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporcuentasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporcuentasLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectRetencionesPorPagarPorCuentas() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesRetencionesPorPagarPorCuentas")) {
				iIndex=this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTabbedPaneRelacionesRetencionesPorPagarPorCuentas.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTabbedPaneRelacionesRetencionesPorPagarPorCuentas.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosRetencionesPorPagarPorCuentas.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessRetencionesPorPagarPorCuentas();	
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
	
	public void cargarCombosForeignKeyRetencionesPorPagarPorCuentas(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyRetencionesPorPagarPorCuentas(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyRetencionesPorPagarPorCuentas(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyRetencionesPorPagarPorCuentasListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyRetencionesPorPagarPorCuentas();
		
		this.cargarCombosFrameForeignKeyRetencionesPorPagarPorCuentas();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyRetencionesPorPagarPorCuentas();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyRetencionesPorPagarPorCuentas();
		}
	}
	
	

	public void cargarCombosForeignKeyTipoRetencion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoRetencionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoRetencion();
				this.cargarCombosFrameTipoRetencionsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoRetencion(this.tiporetencionsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoRetencionesPorPagarPorCuentasActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.retencionesporpagarporcuentasSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			RetencionesPorPagarPorCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.retencionesporpagarporcuentas,new Object(),this.retencionesporpagarporcuentasParameterGeneral,this.retencionesporpagarporcuentasReturnGeneral);
			
			
			if(jTableDatosRetencionesPorPagarPorCuentas.getRowCount()>=1) {
				jTableDatosRetencionesPorPagarPorCuentas.removeRowSelectionInterval(0, jTableDatosRetencionesPorPagarPorCuentas.getRowCount()-1);						
			}
			
			this.isEsNuevoRetencionesPorPagarPorCuentas=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoRetencionesPorPagarPorCuentas(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesRetencionesPorPagarPorCuentas(true);			
			//this.retencionesporpagarporcuentas=new RetencionesPorPagarPorCuentas();
			//this.retencionesporpagarporcuentas.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesRetencionesPorPagarPorCuentas(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualRetencionesPorPagarPorCuentas() ;
			
			if(RetencionesPorPagarPorCuentasJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleRetencionesPorPagarPorCuentas(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.retencionesporpagarporcuentas);	
			this.actualizarInformacion("INFO_PADRE",false,this.retencionesporpagarporcuentas);				
			
			RetencionesPorPagarPorCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.retencionesporpagarporcuentas,new Object(),this.retencionesporpagarporcuentasParameterGeneral,this.retencionesporpagarporcuentasReturnGeneral);
			
			if(this.retencionesporpagarporcuentasSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar RetencionesPorPagarPorCuentas: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			RetencionesPorPagarPorCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.retencionesporpagarporcuentas,new Object(),this.retencionesporpagarporcuentasParameterGeneral,this.retencionesporpagarporcuentasReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarRetencionesPorPagarPorCuentasActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<RetencionesPorPagarPorCuentas> retencionesporpagarporcuentassSeleccionados=new ArrayList<RetencionesPorPagarPorCuentas>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosRetencionesPorPagarPorCuentas.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosRetencionesPorPagarPorCuentas.getSelectedRows().length;			
			}
			
			retencionesporpagarporcuentassSeleccionados=this.getRetencionesPorPagarPorCuentassSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoRetencionesPorPagarPorCuentas--;			
				//RetencionesPorPagarPorCuentas retencionesporpagarporcuentasAux= new RetencionesPorPagarPorCuentas();			
				//retencionesporpagarporcuentasAux.setId(this.iIdNuevoRetencionesPorPagarPorCuentas);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//RetencionesPorPagarPorCuentas retencionesporpagarporcuentasOrigen=new RetencionesPorPagarPorCuentas();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(RetencionesPorPagarPorCuentas retencionesporpagarporcuentasOrigen : retencionesporpagarporcuentassSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosRetencionesPorPagarPorCuentas.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							retencionesporpagarporcuentasOrigen =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass().toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							retencionesporpagarporcuentasOrigen =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentass.toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaRetencionesPorPagarPorCuentas();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.retencionesporpagarporcuentas.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosRetencionesPorPagarPorCuentas(retencionesporpagarporcuentasOrigen,this.retencionesporpagarporcuentas,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentas);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass().add(this.retencionesporpagarporcuentasAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.retencionesporpagarporcuentass.add(this.retencionesporpagarporcuentasAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaRetencionesPorPagarPorCuentas(false);
				
				this.jTableDatosRetencionesPorPagarPorCuentas.setRowSelectionInterval(this.getIndiceNuevoRetencionesPorPagarPorCuentas(), this.getIndiceNuevoRetencionesPorPagarPorCuentas());
				
				int iLastRow =  this.jTableDatosRetencionesPorPagarPorCuentas.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosRetencionesPorPagarPorCuentas.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosRetencionesPorPagarPorCuentas.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaRetencionesPorPagarPorCuentas(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarRetencionesPorPagarPorCuentasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<RetencionesPorPagarPorCuentas> retencionesporpagarporcuentassSeleccionados=new ArrayList<RetencionesPorPagarPorCuentas>();									
		
			RetencionesPorPagarPorCuentas retencionesporpagarporcuentasOrigen=new RetencionesPorPagarPorCuentas();
			RetencionesPorPagarPorCuentas retencionesporpagarporcuentasDestino=new RetencionesPorPagarPorCuentas();
				
			retencionesporpagarporcuentassSeleccionados=this.getRetencionesPorPagarPorCuentassSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosRetencionesPorPagarPorCuentas.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || retencionesporpagarporcuentassSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosRetencionesPorPagarPorCuentas.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						retencionesporpagarporcuentasOrigen =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass().toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						retencionesporpagarporcuentasOrigen =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentass.toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						retencionesporpagarporcuentasDestino =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass().toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						retencionesporpagarporcuentasDestino =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentass.toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				retencionesporpagarporcuentasOrigen =retencionesporpagarporcuentassSeleccionados.get(0);
				retencionesporpagarporcuentasDestino =retencionesporpagarporcuentassSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosRetencionesPorPagarPorCuentas(retencionesporpagarporcuentasOrigen,retencionesporpagarporcuentasDestino,true,false);
				
				retencionesporpagarporcuentasDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(retencionesporpagarporcuentasDestino,retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(retencionesporpagarporcuentasDestino,retencionesporpagarporcuentass);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaRetencionesPorPagarPorCuentas(false);
				
				//this.jTableDatosRetencionesPorPagarPorCuentas.setRowSelectionInterval(this.getIndiceNuevoRetencionesPorPagarPorCuentas(), this.getIndiceNuevoRetencionesPorPagarPorCuentas());
				
				int iLastRow =  this.jTableDatosRetencionesPorPagarPorCuentas.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosRetencionesPorPagarPorCuentas.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosRetencionesPorPagarPorCuentas.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaRetencionesPorPagarPorCuentas(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormRetencionesPorPagarPorCuentasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarRetencionesPorPagarPorCuentasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesRetencionesPorPagarPorCuentas.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasRetencionesPorPagarPorCuentas.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesRetencionesPorPagarPorCuentas.setVisible(!isVisible);
			this.jPanelPaginacionRetencionesPorPagarPorCuentas.setVisible(!isVisible);
			this.jPanelAccionesRetencionesPorPagarPorCuentas.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarRetencionesPorPagarPorCuentasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameRetencionesPorPagarPorCuentas();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoRetencionesPorPagarPorCuentasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoRetencionesPorPagarPorCuentas();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionRetencionesPorPagarPorCuentasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionRetencionesPorPagarPorCuentas();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByRetencionesPorPagarPorCuentasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByRetencionesPorPagarPorCuentas();
			
			this.abrirFrameOrderByRetencionesPorPagarPorCuentas();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByRetencionesPorPagarPorCuentasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByRetencionesPorPagarPorCuentas();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleRetencionesPorPagarPorCuentas(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormRetencionesPorPagarPorCuentas);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.isMaximum()) {
					this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.setSize(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.iWidthFormulario,this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.isMaximum()) {
						this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jContentPaneDetalleRetencionesPorPagarPorCuentas.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTabbedPaneRelacionesRetencionesPorPagarPorCuentas.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jContentPaneDetalleRetencionesPorPagarPorCuentas.getWidth(),RetencionesPorPagarPorCuentasConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTabbedPaneRelacionesRetencionesPorPagarPorCuentas.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jContentPaneDetalleRetencionesPorPagarPorCuentas.getWidth(),RetencionesPorPagarPorCuentasConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTabbedPaneRelacionesRetencionesPorPagarPorCuentas.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jContentPaneDetalleRetencionesPorPagarPorCuentas.getWidth(),RetencionesPorPagarPorCuentasConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.setVisible(true);
	        this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByRetencionesPorPagarPorCuentas() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByRetencionesPorPagarPorCuentas==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByRetencionesPorPagarPorCuentas=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRetencionesPorPagarPorCuentas,false,this);
				} else {
					this.jInternalFrameOrderByRetencionesPorPagarPorCuentas=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRetencionesPorPagarPorCuentas,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByRetencionesPorPagarPorCuentas);
				this.jInternalFrameOrderByRetencionesPorPagarPorCuentas.setVisible(false);
				this.jInternalFrameOrderByRetencionesPorPagarPorCuentas.setSelected(false);
				
				this.jInternalFrameOrderByRetencionesPorPagarPorCuentas.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByRetencionesPorPagarPorCuentas"));
				
				this.inicializarActualizarBindingTablaOrderByRetencionesPorPagarPorCuentas();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionRetencionesPorPagarPorCuentas() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionRetencionesPorPagarPorCuentas==null) {
				
				this.jInternalFrameImportacionRetencionesPorPagarPorCuentas=new ImportacionJInternalFrame(RetencionesPorPagarPorCuentasConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionRetencionesPorPagarPorCuentas);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionRetencionesPorPagarPorCuentas);
				this.jInternalFrameImportacionRetencionesPorPagarPorCuentas.setVisible(false);
				this.jInternalFrameImportacionRetencionesPorPagarPorCuentas.setSelected(false);


				this.jInternalFrameImportacionRetencionesPorPagarPorCuentas.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionRetencionesPorPagarPorCuentas"));
				this.jInternalFrameImportacionRetencionesPorPagarPorCuentas.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionRetencionesPorPagarPorCuentas"));
				this.jInternalFrameImportacionRetencionesPorPagarPorCuentas.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionRetencionesPorPagarPorCuentas"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoRetencionesPorPagarPorCuentas() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoRetencionesPorPagarPorCuentas==null) {
				this.jInternalFrameReporteDinamicoRetencionesPorPagarPorCuentas=new ReporteDinamicoJInternalFrame(RetencionesPorPagarPorCuentasConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoRetencionesPorPagarPorCuentas);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoRetencionesPorPagarPorCuentas);
				this.jInternalFrameReporteDinamicoRetencionesPorPagarPorCuentas.setVisible(false);
				this.jInternalFrameReporteDinamicoRetencionesPorPagarPorCuentas.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoRetencionesPorPagarPorCuentas.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoRetencionesPorPagarPorCuentas"));
				this.jInternalFrameReporteDinamicoRetencionesPorPagarPorCuentas.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoRetencionesPorPagarPorCuentas"));
				this.jInternalFrameReporteDinamicoRetencionesPorPagarPorCuentas.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoRetencionesPorPagarPorCuentas"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualRetencionesPorPagarPorCuentas();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleRetencionesPorPagarPorCuentas() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormRetencionesPorPagarPorCuentas);
			
	       	this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.setVisible(false);
	        this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.setSelected(false);
			
			//this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.dispose();
			//this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoRetencionesPorPagarPorCuentas() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoRetencionesPorPagarPorCuentas.setVisible(true);
	        this.jInternalFrameReporteDinamicoRetencionesPorPagarPorCuentas.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionRetencionesPorPagarPorCuentas() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionRetencionesPorPagarPorCuentas.setVisible(true);
	        this.jInternalFrameImportacionRetencionesPorPagarPorCuentas.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByRetencionesPorPagarPorCuentas() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByRetencionesPorPagarPorCuentas.setVisible(true);
	        this.jInternalFrameOrderByRetencionesPorPagarPorCuentas.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByRetencionesPorPagarPorCuentas() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByRetencionesPorPagarPorCuentas.setVisible(false);
	        this.jInternalFrameOrderByRetencionesPorPagarPorCuentas.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoRetencionesPorPagarPorCuentas() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoRetencionesPorPagarPorCuentas.setVisible(false);
	        this.jInternalFrameReporteDinamicoRetencionesPorPagarPorCuentas.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionRetencionesPorPagarPorCuentas() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionRetencionesPorPagarPorCuentas.setVisible(false);
	        this.jInternalFrameImportacionRetencionesPorPagarPorCuentas.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarRetencionesPorPagarPorCuentasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarRetencionesPorPagarPorCuentas(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarRetencionesPorPagarPorCuentas(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosRetencionesPorPagarPorCuentas.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesRetencionesPorPagarPorCuentas(true);
			//this.isEsNuevoRetencionesPorPagarPorCuentas=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporcuentas =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass().toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.retencionesporpagarporcuentas =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentass.toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesRetencionesPorPagarPorCuentas("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesRetencionesPorPagarPorCuentas(false) ;
			
			if(retencionesporpagarporcuentasSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(RetencionesPorPagarPorCuentasJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleRetencionesPorPagarPorCuentas(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualRetencionesPorPagarPorCuentas(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaRetencionesPorPagarPorCuentasActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosRetencionesPorPagarPorCuentas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentas =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass().toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.retencionesporpagarporcuentas =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentass.toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarRetencionesPorPagarPorCuentas(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosRetencionesPorPagarPorCuentas.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesRetencionesPorPagarPorCuentas(true);
			//this.isEsNuevoRetencionesPorPagarPorCuentas=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporcuentas =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass().toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.retencionesporpagarporcuentas =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentass.toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.retencionesporpagarporcuentas.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesRetencionesPorPagarPorCuentas("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesRetencionesPorPagarPorCuentas(false) ;
			
			if(RetencionesPorPagarPorCuentasJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleRetencionesPorPagarPorCuentas(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualRetencionesPorPagarPorCuentas(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
					
	
	public void recargarComboTablaTipoRetencion(List<TipoRetencion> tiporetencionsForeignKey)throws Exception{
		TableColumn tableColumnTipoRetencion=this.jTableDatosRetencionesPorPagarPorCuentas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRetencionesPorPagarPorCuentas,RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_IDTIPORETENCION));
		TableCellEditor tableCellEditorTipoRetencion =tableColumnTipoRetencion.getCellEditor();

		TipoRetencionTableCell tiporetencionTableCellFk=(TipoRetencionTableCell)tableCellEditorTipoRetencion;

		if(tiporetencionTableCellFk!=null) {
			tiporetencionTableCellFk.settiporetencionsForeignKey(tiporetencionsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosRetencionesPorPagarPorCuentas.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tiporetencionTableCellFk.setRowActual(intSelectedRow);
			//tiporetencionTableCellFk.settiporetencionsForeignKeyActual(tiporetencionsForeignKey);
		//}


		if(tiporetencionTableCellFk!=null) {
			tiporetencionTableCellFk.RecargarTipoRetencionsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarRetencionesPorPagarPorCuentasActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporcuentasLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesRetencionesPorPagarPorCuentas(false);
			
			//if(!this.isEsNuevoRetencionesPorPagarPorCuentas) {								
				int intSelectedRow = this.jTableDatosRetencionesPorPagarPorCuentas.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentas =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass().toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.retencionesporpagarporcuentas =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentass.toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(RetencionesPorPagarPorCuentasJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentas,true);
				this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentas);
				
			}
			
			if(this.permiteMantenimiento(this.retencionesporpagarporcuentas)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoRetencionesPorPagarPorCuentas=true;
					this.inicializarActualizarBindingTablaRetencionesPorPagarPorCuentas(false);
					this.isEsNuevoRetencionesPorPagarPorCuentas=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoRetencionesPorPagarPorCuentas=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoRetencionesPorPagarPorCuentas=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesRetencionesPorPagarPorCuentas(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualRetencionesPorPagarPorCuentas(false);
				
				this.habilitarDeshabilitarControlesRetencionesPorPagarPorCuentas(false);
			
												
				
				if(RetencionesPorPagarPorCuentasJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleRetencionesPorPagarPorCuentas();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoRetencionesPorPagarPorCuentasActionPerformed(evt,retencionesporpagarporcuentasSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentas,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosRetencionesPorPagarPorCuentas.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,retencionesporpagarporcuentasSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporcuentasLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.retencionesporpagarporcuentas.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(RetencionesPorPagarPorCuentas.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RetencionesPorPagarPorCuentas.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporcuentasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporcuentasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarRetencionesPorPagarPorCuentasActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporcuentasLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosRetencionesPorPagarPorCuentas.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporcuentas =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass().toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
				this.retencionesporpagarporcuentas.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.retencionesporpagarporcuentas =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentass.toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
				this.retencionesporpagarporcuentas.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.retencionesporpagarporcuentas)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((RetencionesPorPagarPorCuentasModel) this.jTableDatosRetencionesPorPagarPorCuentas.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoRetencionesPorPagarPorCuentas=true;
				this.inicializarActualizarBindingTablaRetencionesPorPagarPorCuentas(false);
				this.isEsNuevoRetencionesPorPagarPorCuentas=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesRetencionesPorPagarPorCuentas(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualRetencionesPorPagarPorCuentas(false);
				
				this.habilitarDeshabilitarControlesRetencionesPorPagarPorCuentas(false);
				
				
				
				if(RetencionesPorPagarPorCuentasJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleRetencionesPorPagarPorCuentas();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporcuentasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporcuentasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporcuentasLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarRetencionesPorPagarPorCuentasActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosRetencionesPorPagarPorCuentas.getRowCount()>=1) {
				jTableDatosRetencionesPorPagarPorCuentas.removeRowSelectionInterval(0, jTableDatosRetencionesPorPagarPorCuentas.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesRetencionesPorPagarPorCuentas(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaRetencionesPorPagarPorCuentas(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesRetencionesPorPagarPorCuentas(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualRetencionesPorPagarPorCuentas(false) ;
			
			this.isEsNuevoRetencionesPorPagarPorCuentas=false;
			
			if(RetencionesPorPagarPorCuentasJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleRetencionesPorPagarPorCuentas();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosRetencionesPorPagarPorCuentasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporcuentasLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingRetencionesPorPagarPorCuentas(false);
				
				//SI ES MANUAL
				if(RetencionesPorPagarPorCuentasJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualRetencionesPorPagarPorCuentas();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporcuentasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporcuentasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporcuentasLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosRetencionesPorPagarPorCuentasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoRetencionesPorPagarPorCuentas--;			
			//RetencionesPorPagarPorCuentas retencionesporpagarporcuentasAux= new RetencionesPorPagarPorCuentas();			
			//retencionesporpagarporcuentasAux.setId(this.iIdNuevoRetencionesPorPagarPorCuentas);
			
			if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaRetencionesPorPagarPorCuentas();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentas);
			
			this.retencionesporpagarporcuentas.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass().add(this.retencionesporpagarporcuentasAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.retencionesporpagarporcuentass.add(this.retencionesporpagarporcuentasAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaRetencionesPorPagarPorCuentas(false);
			
			this.jTableDatosRetencionesPorPagarPorCuentas.setRowSelectionInterval(this.getIndiceNuevoRetencionesPorPagarPorCuentas(), this.getIndiceNuevoRetencionesPorPagarPorCuentas());
			
			int iLastRow =  this.jTableDatosRetencionesPorPagarPorCuentas.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosRetencionesPorPagarPorCuentas.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosRetencionesPorPagarPorCuentas.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaRetencionesPorPagarPorCuentas(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionRetencionesPorPagarPorCuentasActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporcuentasLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingRetencionesPorPagarPorCuentas(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingRetencionesPorPagarPorCuentas(false);
			
			//SI ES MANUAL
			if(RetencionesPorPagarPorCuentasJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualRetencionesPorPagarPorCuentas();
			}
			
			//this.abrirFrameTreeRetencionesPorPagarPorCuentas();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporcuentasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporcuentasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporcuentasLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionRetencionesPorPagarPorCuentasActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionRetencionesPorPagarPorCuentasActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionRetencionesPorPagarPorCuentas.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionRetencionesPorPagarPorCuentas.setFileImportacion(this.jInternalFrameImportacionRetencionesPorPagarPorCuentas.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionRetencionesPorPagarPorCuentas.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionRetencionesPorPagarPorCuentas.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionRetencionesPorPagarPorCuentas.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionRetencionesPorPagarPorCuentas.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoRetencionesPorPagarPorCuentasActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<RetencionesPorPagarPorCuentas> retencionesporpagarporcuentassSeleccionados=new ArrayList<RetencionesPorPagarPorCuentas>();		

		retencionesporpagarporcuentassSeleccionados=this.getRetencionesPorPagarPorCuentassSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoRetencionesPorPagarPorCuentas.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoRetencionesPorPagarPorCuentas.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("RetencionesPorPagarPorCuentasBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"RetencionesPorPagarPorCuentasBaseDesign.jrxml";
			
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
			
			this.generarReporteRetencionesPorPagarPorCuentass("Todos",retencionesporpagarporcuentassSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Retenciones Por Pagar Por Cuentas",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoRetencionesPorPagarPorCuentas.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoRetencionesPorPagarPorCuentas.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_FECHAEMISION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaEmision_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaEmision_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaEmision_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaEmision_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBRETIPOMOVIMIENTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreTipoMovimiento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreTipoMovimiento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreTipoMovimiento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreTipoMovimiento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NUMEROMAYOR:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroMayor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroMayor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroMayor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroMayor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBRECUENTACONTABLERETENCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCuentaContableRetencion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCuentaContableRetencion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCuentaContableRetencion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCuentaContableRetencion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroPreImpresoFactura_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroPreImpresoFactura_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroPreImpresoFactura_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroPreImpresoFactura_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_PORCENTAJE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rcentaje_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rcentaje_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rcentaje_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rcentaje_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_BASEIMPONIBLE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_seImponible_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_seImponible_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_seImponible_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_seImponible_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_VALOR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NUMERO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mero_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mero_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mero_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mero_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBREBENEF:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreBenef_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreBenef_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreBenef_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreBenef_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_RUCBENEF:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cBenef_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cBenef_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cBenef_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cBenef_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBRECUENTACONTABLE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCuentaContable_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCuentaContable_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCuentaContable_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCuentaContable_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBRECUENTACONTABLECREDITO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCuentaContableCredito_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCuentaContableCredito_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCuentaContableCredito_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCuentaContableCredito_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_ESDEBITODATO:
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
		
		if(this.jInternalFrameReporteDinamicoRetencionesPorPagarPorCuentas.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoRetencionesPorPagarPorCuentas.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoRetencionesPorPagarPorCuentas.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoria="fecha_emision";
					break;

				case RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBRETIPOMOVIMIENTO:
					sNombreCampoCategoria="nombre_tipo_movimiento";
					break;

				case RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NUMEROMAYOR:
					sNombreCampoCategoria="numero_mayor";
					break;

				case RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBRECUENTACONTABLERETENCION:
					sNombreCampoCategoria="nombre_cuenta_contable_retencion";
					break;

				case RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA:
					sNombreCampoCategoria="numero_pre_impreso_factura";
					break;

				case RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoria="porcentaje";
					break;

				case RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_BASEIMPONIBLE:
					sNombreCampoCategoria="base_imponible";
					break;

				case RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoria="valor";
					break;

				case RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NUMERO:
					sNombreCampoCategoria="numero";
					break;

				case RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBREBENEF:
					sNombreCampoCategoria="nombre_benef";
					break;

				case RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_RUCBENEF:
					sNombreCampoCategoria="ruc_benef";
					break;

				case RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBRECUENTACONTABLE:
					sNombreCampoCategoria="nombre_cuenta_contable";
					break;

				case RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBRECUENTACONTABLECREDITO:
					sNombreCampoCategoria="nombre_cuenta_contable_credito";
					break;

				case RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_ESDEBITODATO:
					sNombreCampoCategoria="es_debito_dato";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoRetencionesPorPagarPorCuentas.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoriaValor="fecha_emision";
					break;

				case RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBRETIPOMOVIMIENTO:
					sNombreCampoCategoriaValor="nombre_tipo_movimiento";
					break;

				case RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NUMEROMAYOR:
					sNombreCampoCategoriaValor="numero_mayor";
					break;

				case RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBRECUENTACONTABLERETENCION:
					sNombreCampoCategoriaValor="nombre_cuenta_contable_retencion";
					break;

				case RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA:
					sNombreCampoCategoriaValor="numero_pre_impreso_factura";
					break;

				case RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoriaValor="porcentaje";
					break;

				case RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_BASEIMPONIBLE:
					sNombreCampoCategoriaValor="base_imponible";
					break;

				case RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoriaValor="valor";
					break;

				case RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NUMERO:
					sNombreCampoCategoriaValor="numero";
					break;

				case RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBREBENEF:
					sNombreCampoCategoriaValor="nombre_benef";
					break;

				case RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_RUCBENEF:
					sNombreCampoCategoriaValor="ruc_benef";
					break;

				case RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBRECUENTACONTABLE:
					sNombreCampoCategoriaValor="nombre_cuenta_contable";
					break;

				case RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBRECUENTACONTABLECREDITO:
					sNombreCampoCategoriaValor="nombre_cuenta_contable_credito";
					break;

				case RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_ESDEBITODATO:
					sNombreCampoCategoriaValor="es_debito_dato";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoRetencionesPorPagarPorCuentas.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoRetencionesPorPagarPorCuentas.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_FECHAEMISION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Emision",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_emision");
					break;

				case RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBRETIPOMOVIMIENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Tipo Movimiento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_tipo_movimiento");
					break;

				case RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NUMEROMAYOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Mayor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_mayor");
					break;

				case RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBRECUENTACONTABLERETENCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Cuenta Contable Retencion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_cuenta_contable_retencion");
					break;

				case RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Pre Impreso Factura",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_pre_impreso_factura");
					break;

				case RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_PORCENTAJE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Porcentaje",sNombreCampoCategoria,sNombreCampoCategoriaValor,"porcentaje");
					break;

				case RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_BASEIMPONIBLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Base Imponible",sNombreCampoCategoria,sNombreCampoCategoriaValor,"base_imponible");
					break;

				case RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_VALOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor");
					break;

				case RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NUMERO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero");
					break;

				case RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBREBENEF:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Benef",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_benef");
					break;

				case RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_RUCBENEF:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ruc Benef",sNombreCampoCategoria,sNombreCampoCategoriaValor,"ruc_benef");
					break;

				case RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBRECUENTACONTABLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Cuenta Contable",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_cuenta_contable");
					break;

				case RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBRECUENTACONTABLECREDITO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Cuenta Contable Credito",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_cuenta_contable_credito");
					break;

				case RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_ESDEBITODATO:
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
	
	public void jButtonGenerarExcelReporteDinamicoRetencionesPorPagarPorCuentasActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<RetencionesPorPagarPorCuentas> retencionesporpagarporcuentassSeleccionados=new ArrayList<RetencionesPorPagarPorCuentas>();		
		
		retencionesporpagarporcuentassSeleccionados=this.getRetencionesPorPagarPorCuentassSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"retencionesporpagarporcuentas";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("RetencionesPorPagarPorCuentass");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoRetencionesPorPagarPorCuentas.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoRetencionesPorPagarPorCuentas.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(RetencionesPorPagarPorCuentas retencionesporpagarporcuentas:retencionesporpagarporcuentassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(retencionesporpagarporcuentas.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(RetencionesPorPagarPorCuentas retencionesporpagarporcuentas:retencionesporpagarporcuentassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(retencionesporpagarporcuentas.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_IDEJERCICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_IDEJERCICIO);
					iRow++;

					for(RetencionesPorPagarPorCuentas retencionesporpagarporcuentas:retencionesporpagarporcuentassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(retencionesporpagarporcuentas.getejercicio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_IDPERIODO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_IDPERIODO);
					iRow++;

					for(RetencionesPorPagarPorCuentas retencionesporpagarporcuentas:retencionesporpagarporcuentassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(retencionesporpagarporcuentas.getperiodo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_IDTIPORETENCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_IDTIPORETENCION);
					iRow++;

					for(RetencionesPorPagarPorCuentas retencionesporpagarporcuentas:retencionesporpagarporcuentassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(retencionesporpagarporcuentas.gettiporetencion_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_ESDEBITO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_ESDEBITO);
					iRow++;

					for(RetencionesPorPagarPorCuentas retencionesporpagarporcuentas:retencionesporpagarporcuentassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(retencionesporpagarporcuentas.getes_debito());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_FECHAEMISION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_FECHAEMISION);
					iRow++;

					for(RetencionesPorPagarPorCuentas retencionesporpagarporcuentas:retencionesporpagarporcuentassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(retencionesporpagarporcuentas.getfecha_emision());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBRETIPOMOVIMIENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBRETIPOMOVIMIENTO);
					iRow++;

					for(RetencionesPorPagarPorCuentas retencionesporpagarporcuentas:retencionesporpagarporcuentassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(retencionesporpagarporcuentas.getnombre_tipo_movimiento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NUMEROMAYOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NUMEROMAYOR);
					iRow++;

					for(RetencionesPorPagarPorCuentas retencionesporpagarporcuentas:retencionesporpagarporcuentassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(retencionesporpagarporcuentas.getnumero_mayor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBRECUENTACONTABLERETENCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBRECUENTACONTABLERETENCION);
					iRow++;

					for(RetencionesPorPagarPorCuentas retencionesporpagarporcuentas:retencionesporpagarporcuentassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(retencionesporpagarporcuentas.getnombre_cuenta_contable_retencion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA);
					iRow++;

					for(RetencionesPorPagarPorCuentas retencionesporpagarporcuentas:retencionesporpagarporcuentassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(retencionesporpagarporcuentas.getnumero_pre_impreso_factura());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_PORCENTAJE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_PORCENTAJE);
					iRow++;

					for(RetencionesPorPagarPorCuentas retencionesporpagarporcuentas:retencionesporpagarporcuentassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(retencionesporpagarporcuentas.getporcentaje());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_BASEIMPONIBLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_BASEIMPONIBLE);
					iRow++;

					for(RetencionesPorPagarPorCuentas retencionesporpagarporcuentas:retencionesporpagarporcuentassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(retencionesporpagarporcuentas.getbase_imponible());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_VALOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_VALOR);
					iRow++;

					for(RetencionesPorPagarPorCuentas retencionesporpagarporcuentas:retencionesporpagarporcuentassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(retencionesporpagarporcuentas.getvalor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NUMERO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NUMERO);
					iRow++;

					for(RetencionesPorPagarPorCuentas retencionesporpagarporcuentas:retencionesporpagarporcuentassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(retencionesporpagarporcuentas.getnumero());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBREBENEF:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBREBENEF);
					iRow++;

					for(RetencionesPorPagarPorCuentas retencionesporpagarporcuentas:retencionesporpagarporcuentassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(retencionesporpagarporcuentas.getnombre_benef());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_RUCBENEF:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_RUCBENEF);
					iRow++;

					for(RetencionesPorPagarPorCuentas retencionesporpagarporcuentas:retencionesporpagarporcuentassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(retencionesporpagarporcuentas.getruc_benef());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBRECUENTACONTABLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBRECUENTACONTABLE);
					iRow++;

					for(RetencionesPorPagarPorCuentas retencionesporpagarporcuentas:retencionesporpagarporcuentassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(retencionesporpagarporcuentas.getnombre_cuenta_contable());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBRECUENTACONTABLECREDITO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBRECUENTACONTABLECREDITO);
					iRow++;

					for(RetencionesPorPagarPorCuentas retencionesporpagarporcuentas:retencionesporpagarporcuentassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(retencionesporpagarporcuentas.getnombre_cuenta_contable_credito());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_ESDEBITODATO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_ESDEBITODATO);
					iRow++;

					for(RetencionesPorPagarPorCuentas retencionesporpagarporcuentas:retencionesporpagarporcuentassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(retencionesporpagarporcuentas.getes_debito_dato());
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
			//	this.getFilaCabeceraExportarExcelRetencionesPorPagarPorCuentas(row);				
			//	iRow++;
			//}				
			
			//for(RetencionesPorPagarPorCuentas retencionesporpagarporcuentasAux:retencionesporpagarporcuentassSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelRetencionesPorPagarPorCuentas(retencionesporpagarporcuentasAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Retenciones Por Pagar Por Cuentas",JOptionPane.INFORMATION_MESSAGE);
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
				this.retencionesporpagarporcuentasLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingRetencionesPorPagarPorCuentas(false);
			
			//SI ES MANUAL
			if(RetencionesPorPagarPorCuentasJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualRetencionesPorPagarPorCuentas();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporcuentasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporcuentasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporcuentasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresRetencionesPorPagarPorCuentasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporcuentasLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingRetencionesPorPagarPorCuentas(false);
			
			//SI ES MANUAL
			if(RetencionesPorPagarPorCuentasJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualRetencionesPorPagarPorCuentas();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporcuentasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporcuentasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporcuentasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesRetencionesPorPagarPorCuentasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporcuentasLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingRetencionesPorPagarPorCuentas(false);
			
			//SI ES MANUAL
			if(RetencionesPorPagarPorCuentasJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualRetencionesPorPagarPorCuentas();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporcuentasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporcuentasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporcuentasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaRetencionesPorPagarPorCuentas() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosRetencionesPorPagarPorCuentas.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosRetencionesPorPagarPorCuentas.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosRetencionesPorPagarPorCuentas.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosRetencionesPorPagarPorCuentas.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosRetencionesPorPagarPorCuentas.setMinimumSize(dimensionMinimum);
		this.jTableDatosRetencionesPorPagarPorCuentas.setMaximumSize(dimensionMaximum);
		this.jTableDatosRetencionesPorPagarPorCuentas.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingRetencionesPorPagarPorCuentas(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingRetencionesPorPagarPorCuentas(esInicializar,true);
	}
	
	public void inicializarActualizarBindingRetencionesPorPagarPorCuentas(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaRetencionesPorPagarPorCuentas(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesRetencionesPorPagarPorCuentas(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasRetencionesPorPagarPorCuentas(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesRetencionesPorPagarPorCuentas(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesRetencionesPorPagarPorCuentas(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !RetencionesPorPagarPorCuentasJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!RetencionesPorPagarPorCuentasJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualRetencionesPorPagarPorCuentas() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaRetencionesPorPagarPorCuentas();
		
		this.inicializarActualizarBindingBotonesManualRetencionesPorPagarPorCuentas(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualRetencionesPorPagarPorCuentas();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesRetencionesPorPagarPorCuentas() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualRetencionesPorPagarPorCuentas(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualRetencionesPorPagarPorCuentas(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosRetencionesPorPagarPorCuentas.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosRetencionesPorPagarPorCuentas.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteRetencionesPorPagarPorCuentas.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jCheckBoxPostAccionNuevoRetencionesPorPagarPorCuentas.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jCheckBoxPostAccionSinCerrarRetencionesPorPagarPorCuentas.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jCheckBoxPostAccionSinMensajeRetencionesPorPagarPorCuentas.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosRetencionesPorPagarPorCuentas.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosRetencionesPorPagarPorCuentas.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteRetencionesPorPagarPorCuentas.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) {
				this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jCheckBoxPostAccionNuevoRetencionesPorPagarPorCuentas.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jCheckBoxPostAccionSinCerrarRetencionesPorPagarPorCuentas.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jCheckBoxPostAccionSinMensajeRetencionesPorPagarPorCuentas.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionRetencionesPorPagarPorCuentas.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionRetencionesPorPagarPorCuentas.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxTiposAccionesFormularioRetencionesPorPagarPorCuentas.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesRetencionesPorPagarPorCuentas.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoRetencionesPorPagarPorCuentas!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoRetencionesPorPagarPorCuentas.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesRetencionesPorPagarPorCuentas.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesRetencionesPorPagarPorCuentas.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarRetencionesPorPagarPorCuentas.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesRetencionesPorPagarPorCuentas.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoRetencionesPorPagarPorCuentas!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoRetencionesPorPagarPorCuentas.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesRetencionesPorPagarPorCuentas.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralRetencionesPorPagarPorCuentas.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesRetencionesPorPagarPorCuentas(Boolean esInicializar) throws Exception {
		try	{	
			if(RetencionesPorPagarPorCuentasJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualRetencionesPorPagarPorCuentas(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesRetencionesPorPagarPorCuentas() throws Exception {
		try	{
			if(RetencionesPorPagarPorCuentasJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualRetencionesPorPagarPorCuentas();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleRetencionesPorPagarPorCuentas() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxTiposAccionesFormularioRetencionesPorPagarPorCuentas.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxTiposAccionesFormularioRetencionesPorPagarPorCuentas.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualRetencionesPorPagarPorCuentas() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesRetencionesPorPagarPorCuentas.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesRetencionesPorPagarPorCuentas.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesRetencionesPorPagarPorCuentas.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesRetencionesPorPagarPorCuentas.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesRetencionesPorPagarPorCuentas.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesRetencionesPorPagarPorCuentas.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionRetencionesPorPagarPorCuentas.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionRetencionesPorPagarPorCuentas.addItem(reporte);
			}
			
			
			if(!this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionRetencionesPorPagarPorCuentas.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionRetencionesPorPagarPorCuentas.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesRetencionesPorPagarPorCuentas.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesRetencionesPorPagarPorCuentas.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesRetencionesPorPagarPorCuentas.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesRetencionesPorPagarPorCuentas.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxTiposAccionesFormularioRetencionesPorPagarPorCuentas.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxTiposAccionesFormularioRetencionesPorPagarPorCuentas.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarRetencionesPorPagarPorCuentas.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarRetencionesPorPagarPorCuentas.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarRetencionesPorPagarPorCuentas.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualRetencionesPorPagarPorCuentas();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualRetencionesPorPagarPorCuentas() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoRetencionesPorPagarPorCuentas!=null) {
				this.jInternalFrameReporteDinamicoRetencionesPorPagarPorCuentas.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoRetencionesPorPagarPorCuentas.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoRetencionesPorPagarPorCuentas!=null) {
				this.jInternalFrameReporteDinamicoRetencionesPorPagarPorCuentas.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoRetencionesPorPagarPorCuentas.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoRetencionesPorPagarPorCuentas!=null) {
				
				if(this.jInternalFrameReporteDinamicoRetencionesPorPagarPorCuentas.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoRetencionesPorPagarPorCuentas.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoRetencionesPorPagarPorCuentas.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoRetencionesPorPagarPorCuentas.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoRetencionesPorPagarPorCuentas.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoRetencionesPorPagarPorCuentas.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoRetencionesPorPagarPorCuentas.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoRetencionesPorPagarPorCuentas.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=RetencionesPorPagarPorCuentasConstantesFunciones.getTiposSeleccionarRetencionesPorPagarPorCuentas(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoRetencionesPorPagarPorCuentas.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoRetencionesPorPagarPorCuentas.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoRetencionesPorPagarPorCuentas.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=RetencionesPorPagarPorCuentasConstantesFunciones.getTiposSeleccionarRetencionesPorPagarPorCuentas(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoRetencionesPorPagarPorCuentas.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoRetencionesPorPagarPorCuentas.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoRetencionesPorPagarPorCuentas.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=RetencionesPorPagarPorCuentasConstantesFunciones.getTiposSeleccionarRetencionesPorPagarPorCuentas(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoRetencionesPorPagarPorCuentas.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoRetencionesPorPagarPorCuentas.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoRetencionesPorPagarPorCuentas.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoRetencionesPorPagarPorCuentas.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualRetencionesPorPagarPorCuentas()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_ejercicioBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas.getSelectedItem()!=null){this.id_ejercicioBusquedaRetencionesPorPagarPorCuentas=((Ejercicio)this.jComboBoxid_ejercicioBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas.getSelectedItem()).getId();}
		if(this.jComboBoxid_periodoBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas.getSelectedItem()!=null){this.id_periodoBusquedaRetencionesPorPagarPorCuentas=((Periodo)this.jComboBoxid_periodoBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_retencionBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas.getSelectedItem()!=null){this.id_tipo_retencionBusquedaRetencionesPorPagarPorCuentas=((TipoRetencion)this.jComboBoxid_tipo_retencionBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas.getSelectedItem()).getId();}
		this.es_debitoBusquedaRetencionesPorPagarPorCuentas=this.jCheckBoxes_debitoBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas.isSelected();
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasRetencionesPorPagarPorCuentas(Boolean esInicializar) throws Exception {				
		if(RetencionesPorPagarPorCuentasJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualRetencionesPorPagarPorCuentas();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaRetencionesPorPagarPorCuentas() throws Exception {
		this.inicializarActualizarBindingTablaRetencionesPorPagarPorCuentas(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByRetencionesPorPagarPorCuentas() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByRetencionesPorPagarPorCuentas.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByRetencionesPorPagarPorCuentas.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByRetencionesPorPagarPorCuentas.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new RetencionesPorPagarPorCuentasPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByRetencionesPorPagarPorCuentas.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByRetencionesPorPagarPorCuentas.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new RetencionesPorPagarPorCuentasPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosRetencionesPorPagarPorCuentasOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRetencionesPorPagarPorCuentasOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new RetencionesPorPagarPorCuentasPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByRetencionesPorPagarPorCuentas.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByRetencionesPorPagarPorCuentas.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new RetencionesPorPagarPorCuentasPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByRetencionesPorPagarPorCuentas.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaRetencionesPorPagarPorCuentas(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=retencionesporpagarporcuentass.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(RetencionesPorPagarPorCuentasJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosRetencionesPorPagarPorCuentas.setModel(new RetencionesPorPagarPorCuentasModel(this.retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosRetencionesPorPagarPorCuentas.setModel(new RetencionesPorPagarPorCuentasModel(this.retencionesporpagarporcuentass,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByRetencionesPorPagarPorCuentas!=null && this.jInternalFrameOrderByRetencionesPorPagarPorCuentas.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByRetencionesPorPagarPorCuentas();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosRetencionesPorPagarPorCuentas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRetencionesPorPagarPorCuentas,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new RetencionesPorPagarPorCuentasPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+RetencionesPorPagarPorCuentasConstantesFunciones.SCLASSWEBTITULO,retencionesporpagarporcuentasConstantesFunciones.resaltarSeleccionarRetencionesPorPagarPorCuentas,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+RetencionesPorPagarPorCuentasConstantesFunciones.SCLASSWEBTITULO,retencionesporpagarporcuentasConstantesFunciones.resaltarSeleccionarRetencionesPorPagarPorCuentas,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosRetencionesPorPagarPorCuentas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRetencionesPorPagarPorCuentas,RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_ID));

		if(this.retencionesporpagarporcuentasConstantesFunciones.mostraridRetencionesPorPagarPorCuentas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.retencionesporpagarporcuentasConstantesFunciones.resaltaridRetencionesPorPagarPorCuentas,this.retencionesporpagarporcuentasConstantesFunciones.activaridRetencionesPorPagarPorCuentas,iSizeTabla,this,true,"idRetencionesPorPagarPorCuentas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.retencionesporpagarporcuentasConstantesFunciones.resaltaridRetencionesPorPagarPorCuentas,this.retencionesporpagarporcuentasConstantesFunciones.activaridRetencionesPorPagarPorCuentas,this,true,"idRetencionesPorPagarPorCuentas","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRetencionesPorPagarPorCuentas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRetencionesPorPagarPorCuentas,RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_FECHAEMISION));

		if(this.retencionesporpagarporcuentasConstantesFunciones.mostrarfecha_emisionRetencionesPorPagarPorCuentas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_FECHAEMISION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.retencionesporpagarporcuentasConstantesFunciones.resaltarfecha_emisionRetencionesPorPagarPorCuentas,this.retencionesporpagarporcuentasConstantesFunciones.activarfecha_emisionRetencionesPorPagarPorCuentas,iSizeTabla,this,true,"fecha_emisionRetencionesPorPagarPorCuentas","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.retencionesporpagarporcuentasConstantesFunciones.resaltarfecha_emisionRetencionesPorPagarPorCuentas,this.retencionesporpagarporcuentasConstantesFunciones.activarfecha_emisionRetencionesPorPagarPorCuentas,this,true,"fecha_emisionRetencionesPorPagarPorCuentas","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new RetencionesPorPagarPorCuentasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRetencionesPorPagarPorCuentas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRetencionesPorPagarPorCuentas,RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBRETIPOMOVIMIENTO));

		if(this.retencionesporpagarporcuentasConstantesFunciones.mostrarnombre_tipo_movimientoRetencionesPorPagarPorCuentas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBRETIPOMOVIMIENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.retencionesporpagarporcuentasConstantesFunciones.resaltarnombre_tipo_movimientoRetencionesPorPagarPorCuentas,this.retencionesporpagarporcuentasConstantesFunciones.activarnombre_tipo_movimientoRetencionesPorPagarPorCuentas,iSizeTabla,this,true,"nombre_tipo_movimientoRetencionesPorPagarPorCuentas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.retencionesporpagarporcuentasConstantesFunciones.resaltarnombre_tipo_movimientoRetencionesPorPagarPorCuentas,this.retencionesporpagarporcuentasConstantesFunciones.activarnombre_tipo_movimientoRetencionesPorPagarPorCuentas,this,true,"nombre_tipo_movimientoRetencionesPorPagarPorCuentas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RetencionesPorPagarPorCuentasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRetencionesPorPagarPorCuentas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRetencionesPorPagarPorCuentas,RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NUMEROMAYOR));

		if(this.retencionesporpagarporcuentasConstantesFunciones.mostrarnumero_mayorRetencionesPorPagarPorCuentas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NUMEROMAYOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.retencionesporpagarporcuentasConstantesFunciones.resaltarnumero_mayorRetencionesPorPagarPorCuentas,this.retencionesporpagarporcuentasConstantesFunciones.activarnumero_mayorRetencionesPorPagarPorCuentas,iSizeTabla,this,true,"numero_mayorRetencionesPorPagarPorCuentas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.retencionesporpagarporcuentasConstantesFunciones.resaltarnumero_mayorRetencionesPorPagarPorCuentas,this.retencionesporpagarporcuentasConstantesFunciones.activarnumero_mayorRetencionesPorPagarPorCuentas,this,true,"numero_mayorRetencionesPorPagarPorCuentas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RetencionesPorPagarPorCuentasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRetencionesPorPagarPorCuentas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRetencionesPorPagarPorCuentas,RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBRECUENTACONTABLERETENCION));

		if(this.retencionesporpagarporcuentasConstantesFunciones.mostrarnombre_cuenta_contable_retencionRetencionesPorPagarPorCuentas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBRECUENTACONTABLERETENCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.retencionesporpagarporcuentasConstantesFunciones.resaltarnombre_cuenta_contable_retencionRetencionesPorPagarPorCuentas,this.retencionesporpagarporcuentasConstantesFunciones.activarnombre_cuenta_contable_retencionRetencionesPorPagarPorCuentas,iSizeTabla,this,true,"nombre_cuenta_contable_retencionRetencionesPorPagarPorCuentas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.retencionesporpagarporcuentasConstantesFunciones.resaltarnombre_cuenta_contable_retencionRetencionesPorPagarPorCuentas,this.retencionesporpagarporcuentasConstantesFunciones.activarnombre_cuenta_contable_retencionRetencionesPorPagarPorCuentas,this,true,"nombre_cuenta_contable_retencionRetencionesPorPagarPorCuentas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RetencionesPorPagarPorCuentasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRetencionesPorPagarPorCuentas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRetencionesPorPagarPorCuentas,RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA));

		if(this.retencionesporpagarporcuentasConstantesFunciones.mostrarnumero_pre_impreso_facturaRetencionesPorPagarPorCuentas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.retencionesporpagarporcuentasConstantesFunciones.resaltarnumero_pre_impreso_facturaRetencionesPorPagarPorCuentas,this.retencionesporpagarporcuentasConstantesFunciones.activarnumero_pre_impreso_facturaRetencionesPorPagarPorCuentas,iSizeTabla,this,true,"numero_pre_impreso_facturaRetencionesPorPagarPorCuentas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.retencionesporpagarporcuentasConstantesFunciones.resaltarnumero_pre_impreso_facturaRetencionesPorPagarPorCuentas,this.retencionesporpagarporcuentasConstantesFunciones.activarnumero_pre_impreso_facturaRetencionesPorPagarPorCuentas,this,true,"numero_pre_impreso_facturaRetencionesPorPagarPorCuentas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RetencionesPorPagarPorCuentasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRetencionesPorPagarPorCuentas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRetencionesPorPagarPorCuentas,RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_PORCENTAJE));

		if(this.retencionesporpagarporcuentasConstantesFunciones.mostrarporcentajeRetencionesPorPagarPorCuentas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_PORCENTAJE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.retencionesporpagarporcuentasConstantesFunciones.resaltarporcentajeRetencionesPorPagarPorCuentas,this.retencionesporpagarporcuentasConstantesFunciones.activarporcentajeRetencionesPorPagarPorCuentas,iSizeTabla,this,true,"porcentajeRetencionesPorPagarPorCuentas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.retencionesporpagarporcuentasConstantesFunciones.resaltarporcentajeRetencionesPorPagarPorCuentas,this.retencionesporpagarporcuentasConstantesFunciones.activarporcentajeRetencionesPorPagarPorCuentas,this,true,"porcentajeRetencionesPorPagarPorCuentas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new RetencionesPorPagarPorCuentasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRetencionesPorPagarPorCuentas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRetencionesPorPagarPorCuentas,RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_BASEIMPONIBLE));

		if(this.retencionesporpagarporcuentasConstantesFunciones.mostrarbase_imponibleRetencionesPorPagarPorCuentas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_BASEIMPONIBLE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.retencionesporpagarporcuentasConstantesFunciones.resaltarbase_imponibleRetencionesPorPagarPorCuentas,this.retencionesporpagarporcuentasConstantesFunciones.activarbase_imponibleRetencionesPorPagarPorCuentas,iSizeTabla,this,true,"base_imponibleRetencionesPorPagarPorCuentas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.retencionesporpagarporcuentasConstantesFunciones.resaltarbase_imponibleRetencionesPorPagarPorCuentas,this.retencionesporpagarporcuentasConstantesFunciones.activarbase_imponibleRetencionesPorPagarPorCuentas,this,true,"base_imponibleRetencionesPorPagarPorCuentas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new RetencionesPorPagarPorCuentasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRetencionesPorPagarPorCuentas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRetencionesPorPagarPorCuentas,RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_VALOR));

		if(this.retencionesporpagarporcuentasConstantesFunciones.mostrarvalorRetencionesPorPagarPorCuentas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_VALOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.retencionesporpagarporcuentasConstantesFunciones.resaltarvalorRetencionesPorPagarPorCuentas,this.retencionesporpagarporcuentasConstantesFunciones.activarvalorRetencionesPorPagarPorCuentas,iSizeTabla,this,true,"valorRetencionesPorPagarPorCuentas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.retencionesporpagarporcuentasConstantesFunciones.resaltarvalorRetencionesPorPagarPorCuentas,this.retencionesporpagarporcuentasConstantesFunciones.activarvalorRetencionesPorPagarPorCuentas,this,true,"valorRetencionesPorPagarPorCuentas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new RetencionesPorPagarPorCuentasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRetencionesPorPagarPorCuentas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRetencionesPorPagarPorCuentas,RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NUMERO));

		if(this.retencionesporpagarporcuentasConstantesFunciones.mostrarnumeroRetencionesPorPagarPorCuentas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NUMERO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.retencionesporpagarporcuentasConstantesFunciones.resaltarnumeroRetencionesPorPagarPorCuentas,this.retencionesporpagarporcuentasConstantesFunciones.activarnumeroRetencionesPorPagarPorCuentas,iSizeTabla,this,true,"numeroRetencionesPorPagarPorCuentas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.retencionesporpagarporcuentasConstantesFunciones.resaltarnumeroRetencionesPorPagarPorCuentas,this.retencionesporpagarporcuentasConstantesFunciones.activarnumeroRetencionesPorPagarPorCuentas,this,true,"numeroRetencionesPorPagarPorCuentas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RetencionesPorPagarPorCuentasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRetencionesPorPagarPorCuentas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRetencionesPorPagarPorCuentas,RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBREBENEF));

		if(this.retencionesporpagarporcuentasConstantesFunciones.mostrarnombre_benefRetencionesPorPagarPorCuentas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBREBENEF,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.retencionesporpagarporcuentasConstantesFunciones.resaltarnombre_benefRetencionesPorPagarPorCuentas,this.retencionesporpagarporcuentasConstantesFunciones.activarnombre_benefRetencionesPorPagarPorCuentas,iSizeTabla,this,true,"nombre_benefRetencionesPorPagarPorCuentas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.retencionesporpagarporcuentasConstantesFunciones.resaltarnombre_benefRetencionesPorPagarPorCuentas,this.retencionesporpagarporcuentasConstantesFunciones.activarnombre_benefRetencionesPorPagarPorCuentas,this,true,"nombre_benefRetencionesPorPagarPorCuentas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RetencionesPorPagarPorCuentasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRetencionesPorPagarPorCuentas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRetencionesPorPagarPorCuentas,RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_RUCBENEF));

		if(this.retencionesporpagarporcuentasConstantesFunciones.mostrarruc_benefRetencionesPorPagarPorCuentas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_RUCBENEF,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.retencionesporpagarporcuentasConstantesFunciones.resaltarruc_benefRetencionesPorPagarPorCuentas,this.retencionesporpagarporcuentasConstantesFunciones.activarruc_benefRetencionesPorPagarPorCuentas,iSizeTabla,this,true,"ruc_benefRetencionesPorPagarPorCuentas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.retencionesporpagarporcuentasConstantesFunciones.resaltarruc_benefRetencionesPorPagarPorCuentas,this.retencionesporpagarporcuentasConstantesFunciones.activarruc_benefRetencionesPorPagarPorCuentas,this,true,"ruc_benefRetencionesPorPagarPorCuentas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RetencionesPorPagarPorCuentasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRetencionesPorPagarPorCuentas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRetencionesPorPagarPorCuentas,RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBRECUENTACONTABLE));

		if(this.retencionesporpagarporcuentasConstantesFunciones.mostrarnombre_cuenta_contableRetencionesPorPagarPorCuentas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBRECUENTACONTABLE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.retencionesporpagarporcuentasConstantesFunciones.resaltarnombre_cuenta_contableRetencionesPorPagarPorCuentas,this.retencionesporpagarporcuentasConstantesFunciones.activarnombre_cuenta_contableRetencionesPorPagarPorCuentas,iSizeTabla,this,true,"nombre_cuenta_contableRetencionesPorPagarPorCuentas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.retencionesporpagarporcuentasConstantesFunciones.resaltarnombre_cuenta_contableRetencionesPorPagarPorCuentas,this.retencionesporpagarporcuentasConstantesFunciones.activarnombre_cuenta_contableRetencionesPorPagarPorCuentas,this,true,"nombre_cuenta_contableRetencionesPorPagarPorCuentas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RetencionesPorPagarPorCuentasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRetencionesPorPagarPorCuentas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRetencionesPorPagarPorCuentas,RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBRECUENTACONTABLECREDITO));

		if(this.retencionesporpagarporcuentasConstantesFunciones.mostrarnombre_cuenta_contable_creditoRetencionesPorPagarPorCuentas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBRECUENTACONTABLECREDITO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.retencionesporpagarporcuentasConstantesFunciones.resaltarnombre_cuenta_contable_creditoRetencionesPorPagarPorCuentas,this.retencionesporpagarporcuentasConstantesFunciones.activarnombre_cuenta_contable_creditoRetencionesPorPagarPorCuentas,iSizeTabla,this,true,"nombre_cuenta_contable_creditoRetencionesPorPagarPorCuentas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.retencionesporpagarporcuentasConstantesFunciones.resaltarnombre_cuenta_contable_creditoRetencionesPorPagarPorCuentas,this.retencionesporpagarporcuentasConstantesFunciones.activarnombre_cuenta_contable_creditoRetencionesPorPagarPorCuentas,this,true,"nombre_cuenta_contable_creditoRetencionesPorPagarPorCuentas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RetencionesPorPagarPorCuentasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRetencionesPorPagarPorCuentas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRetencionesPorPagarPorCuentas,RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_ESDEBITODATO));

		if(this.retencionesporpagarporcuentasConstantesFunciones.mostrares_debito_datoRetencionesPorPagarPorCuentas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_ESDEBITODATO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.retencionesporpagarporcuentasConstantesFunciones.resaltares_debito_datoRetencionesPorPagarPorCuentas,this.retencionesporpagarporcuentasConstantesFunciones.activares_debito_datoRetencionesPorPagarPorCuentas,iSizeTabla));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.retencionesporpagarporcuentasConstantesFunciones.resaltares_debito_datoRetencionesPorPagarPorCuentas,this.retencionesporpagarporcuentasConstantesFunciones.activares_debito_datoRetencionesPorPagarPorCuentas,this,true,"es_debito_datoRetencionesPorPagarPorCuentas","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new RetencionesPorPagarPorCuentasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosRetencionesPorPagarPorCuentas.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosRetencionesPorPagarPorCuentas.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarRetencionesPorPagarPorCuentas && this.isPermisoGuardarCambiosRetencionesPorPagarPorCuentas) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosRetencionesPorPagarPorCuentas.addColumn(tableColumn);
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
			
			this.jTableDatosRetencionesPorPagarPorCuentas.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarRetencionesPorPagarPorCuentas && this.isPermisoGuardarCambiosRetencionesPorPagarPorCuentas) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarRetencionesPorPagarPorCuentas && this.isPermisoGuardarCambiosRetencionesPorPagarPorCuentas) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosRetencionesPorPagarPorCuentas.moveColumn(this.jTableDatosRetencionesPorPagarPorCuentas.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosRetencionesPorPagarPorCuentas.moveColumn(this.jTableDatosRetencionesPorPagarPorCuentas.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosRetencionesPorPagarPorCuentas.moveColumn(this.jTableDatosRetencionesPorPagarPorCuentas.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosRetencionesPorPagarPorCuentas.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosRetencionesPorPagarPorCuentas.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosRetencionesPorPagarPorCuentas,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!RetencionesPorPagarPorCuentasJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosRetencionesPorPagarPorCuentas.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosRetencionesPorPagarPorCuentas.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!RetencionesPorPagarPorCuentasJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!RetencionesPorPagarPorCuentasJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosRetencionesPorPagarPorCuentas.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosRetencionesPorPagarPorCuentas.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosRetencionesPorPagarPorCuentas.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=retencionesporpagarporcuentass.size()-1;
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
		//this.jTableDatosRetencionesPorPagarPorCuentas.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosRetencionesPorPagarPorCuentas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosRetencionesPorPagarPorCuentas();
			
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
				
				//this.isEsNuevoRetencionesPorPagarPorCuentas=false;
					
				RetencionesPorPagarPorCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.retencionesporpagarporcuentas,new Object(),this.retencionesporpagarporcuentasParameterGeneral,this.retencionesporpagarporcuentasReturnGeneral);
			
				if(this.retencionesporpagarporcuentasSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosRetencionesPorPagarPorCuentas.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosRetencionesPorPagarPorCuentas.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentas =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass().toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.retencionesporpagarporcuentas =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentass.toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.retencionesporpagarporcuentas.getsType().equals("DUPLICADO")
				   || this.retencionesporpagarporcuentas.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoRetencionesPorPagarPorCuentas=true;
				
				} else {
					this.isEsNuevoRetencionesPorPagarPorCuentas=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado()) {
					if(this.retencionesporpagarporcuentas.getId()>=0 && !this.retencionesporpagarporcuentas.getIsNew()) {						
						this.isEsNuevoRetencionesPorPagarPorCuentas=false;
						
					} else {
						this.isEsNuevoRetencionesPorPagarPorCuentas=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoRetencionesPorPagarPorCuentas(esRelaciones);						
				
				this.seleccionarRetencionesPorPagarPorCuentas(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.retencionesporpagarporcuentas.getId()<0) {
					this.isEsNuevoRetencionesPorPagarPorCuentas=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarRetencionesPorPagarPorCuentas(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarRetencionesPorPagarPorCuentas(evt,rowIndex);
				}	
				
				if(this.retencionesporpagarporcuentasSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion RetencionesPorPagarPorCuentas: " + this.dDif); 
					}
				}								
				
				RetencionesPorPagarPorCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.retencionesporpagarporcuentas,new Object(),this.retencionesporpagarporcuentasParameterGeneral,this.retencionesporpagarporcuentasReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarRetencionesPorPagarPorCuentas(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.retencionesporpagarporcuentas)) {
					if(this.retencionesporpagarporcuentas.getId()>0) {
						this.retencionesporpagarporcuentas.setIsDeleted(true);
						
						this.retencionesporpagarporcuentassEliminados.add(this.retencionesporpagarporcuentas);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass().remove(this.retencionesporpagarporcuentas);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.retencionesporpagarporcuentass.remove(this.retencionesporpagarporcuentas);				
					}
					
					
					((RetencionesPorPagarPorCuentasModel) this.jTableDatosRetencionesPorPagarPorCuentas.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaRetencionesPorPagarPorCuentas(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarRetencionesPorPagarPorCuentas(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoRetencionesPorPagarPorCuentas) {
			
			if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosRetencionesPorPagarPorCuentas.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosRetencionesPorPagarPorCuentas.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentas =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass().toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.retencionesporpagarporcuentas =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentass.toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(RetencionesPorPagarPorCuentasJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentas);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesRetencionesPorPagarPorCuentas("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesRetencionesPorPagarPorCuentas(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualRetencionesPorPagarPorCuentas() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoRetencionesPorPagarPorCuentas(RetencionesPorPagarPorCuentas retencionesporpagarporcuentas) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoRetencionesPorPagarPorCuentas(retencionesporpagarporcuentas,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoRetencionesPorPagarPorCuentas(RetencionesPorPagarPorCuentas retencionesporpagarporcuentas,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioRetencionesPorPagarPorCuentas(retencionesporpagarporcuentas);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyRetencionesPorPagarPorCuentas(retencionesporpagarporcuentas,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyRetencionesPorPagarPorCuentas(retencionesporpagarporcuentas);
	}
	
	public void setVariablesObjetoActualToFormularioRetencionesPorPagarPorCuentas(RetencionesPorPagarPorCuentas retencionesporpagarporcuentas) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jLabelidRetencionesPorPagarPorCuentas.setText(retencionesporpagarporcuentas.getId().toString());
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jDateChooserfecha_emisionRetencionesPorPagarPorCuentas.setDate(retencionesporpagarporcuentas.getfecha_emision());
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextAreanombre_tipo_movimientoRetencionesPorPagarPorCuentas.setText(retencionesporpagarporcuentas.getnombre_tipo_movimiento());
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextAreanumero_mayorRetencionesPorPagarPorCuentas.setText(retencionesporpagarporcuentas.getnumero_mayor());
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextAreanombre_cuenta_contable_retencionRetencionesPorPagarPorCuentas.setText(retencionesporpagarporcuentas.getnombre_cuenta_contable_retencion());
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextFieldnumero_pre_impreso_facturaRetencionesPorPagarPorCuentas.setText(retencionesporpagarporcuentas.getnumero_pre_impreso_factura());
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextFieldporcentajeRetencionesPorPagarPorCuentas.setText(retencionesporpagarporcuentas.getporcentaje().toString());
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextFieldbase_imponibleRetencionesPorPagarPorCuentas.setText(retencionesporpagarporcuentas.getbase_imponible().toString());
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextFieldvalorRetencionesPorPagarPorCuentas.setText(retencionesporpagarporcuentas.getvalor().toString());
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextFieldnumeroRetencionesPorPagarPorCuentas.setText(retencionesporpagarporcuentas.getnumero());
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextAreanombre_benefRetencionesPorPagarPorCuentas.setText(retencionesporpagarporcuentas.getnombre_benef());
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextFieldruc_benefRetencionesPorPagarPorCuentas.setText(retencionesporpagarporcuentas.getruc_benef());
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextAreanombre_cuenta_contableRetencionesPorPagarPorCuentas.setText(retencionesporpagarporcuentas.getnombre_cuenta_contable());
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextAreanombre_cuenta_contable_creditoRetencionesPorPagarPorCuentas.setText(retencionesporpagarporcuentas.getnombre_cuenta_contable_credito());
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jCheckBoxes_debito_datoRetencionesPorPagarPorCuentas.setSelected(retencionesporpagarporcuentas.getes_debito_dato());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,RetencionesPorPagarPorCuentas retencionesporpagarporcuentasLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,retencionesporpagarporcuentasLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,RetencionesPorPagarPorCuentas retencionesporpagarporcuentasLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				retencionesporpagarporcuentasLocal=this.retencionesporpagarporcuentas;
			} else {
				retencionesporpagarporcuentasLocal=this.retencionesporpagarporcuentasAnterior;
			}
		}
		
		if(this.permiteMantenimiento(retencionesporpagarporcuentasLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoRetencionesPorPagarPorCuentas(retencionesporpagarporcuentasLocal,true);
					
					if(retencionesporpagarporcuentasSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(retencionesporpagarporcuentasLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(retencionesporpagarporcuentasLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoRetencionesPorPagarPorCuentas(RetencionesPorPagarPorCuentas retencionesporpagarporcuentas,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorCuentas(retencionesporpagarporcuentas,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorCuentas(retencionesporpagarporcuentas);
	}
	
	public void setVariablesFormularioToObjetoActualRetencionesPorPagarPorCuentas(RetencionesPorPagarPorCuentas retencionesporpagarporcuentas,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorCuentas(retencionesporpagarporcuentas,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualRetencionesPorPagarPorCuentas(RetencionesPorPagarPorCuentas retencionesporpagarporcuentas,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jLabelidRetencionesPorPagarPorCuentas.getText()==null || this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jLabelidRetencionesPorPagarPorCuentas.getText()=="" || this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jLabelidRetencionesPorPagarPorCuentas.getText()=="Id") {
				this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jLabelidRetencionesPorPagarPorCuentas.setText("0");
			}

			if(conColumnasBase) {retencionesporpagarporcuentas.setId(Long.parseLong(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jLabelidRetencionesPorPagarPorCuentas.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jLabelIdRetencionesPorPagarPorCuentas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			retencionesporpagarporcuentas.setfecha_emision(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jDateChooserfecha_emisionRetencionesPorPagarPorCuentas.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_FECHAEMISION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jLabelfecha_emisionRetencionesPorPagarPorCuentas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			retencionesporpagarporcuentas.setnombre_tipo_movimiento(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextAreanombre_tipo_movimientoRetencionesPorPagarPorCuentas.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBRETIPOMOVIMIENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jLabelnombre_tipo_movimientoRetencionesPorPagarPorCuentas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			retencionesporpagarporcuentas.setnumero_mayor(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextAreanumero_mayorRetencionesPorPagarPorCuentas.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NUMEROMAYOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jLabelnumero_mayorRetencionesPorPagarPorCuentas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			retencionesporpagarporcuentas.setnombre_cuenta_contable_retencion(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextAreanombre_cuenta_contable_retencionRetencionesPorPagarPorCuentas.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBRECUENTACONTABLERETENCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jLabelnombre_cuenta_contable_retencionRetencionesPorPagarPorCuentas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			retencionesporpagarporcuentas.setnumero_pre_impreso_factura(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextFieldnumero_pre_impreso_facturaRetencionesPorPagarPorCuentas.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jLabelnumero_pre_impreso_facturaRetencionesPorPagarPorCuentas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			retencionesporpagarporcuentas.setporcentaje(Double.parseDouble(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextFieldporcentajeRetencionesPorPagarPorCuentas.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_PORCENTAJE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jLabelporcentajeRetencionesPorPagarPorCuentas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			retencionesporpagarporcuentas.setbase_imponible(Double.parseDouble(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextFieldbase_imponibleRetencionesPorPagarPorCuentas.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_BASEIMPONIBLE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jLabelbase_imponibleRetencionesPorPagarPorCuentas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			retencionesporpagarporcuentas.setvalor(Double.parseDouble(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextFieldvalorRetencionesPorPagarPorCuentas.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_VALOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jLabelvalorRetencionesPorPagarPorCuentas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			retencionesporpagarporcuentas.setnumero(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextFieldnumeroRetencionesPorPagarPorCuentas.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NUMERO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jLabelnumeroRetencionesPorPagarPorCuentas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			retencionesporpagarporcuentas.setnombre_benef(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextAreanombre_benefRetencionesPorPagarPorCuentas.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBREBENEF+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jLabelnombre_benefRetencionesPorPagarPorCuentas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			retencionesporpagarporcuentas.setruc_benef(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextFieldruc_benefRetencionesPorPagarPorCuentas.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_RUCBENEF+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jLabelruc_benefRetencionesPorPagarPorCuentas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			retencionesporpagarporcuentas.setnombre_cuenta_contable(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextAreanombre_cuenta_contableRetencionesPorPagarPorCuentas.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBRECUENTACONTABLE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jLabelnombre_cuenta_contableRetencionesPorPagarPorCuentas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			retencionesporpagarporcuentas.setnombre_cuenta_contable_credito(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextAreanombre_cuenta_contable_creditoRetencionesPorPagarPorCuentas.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBRECUENTACONTABLECREDITO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jLabelnombre_cuenta_contable_creditoRetencionesPorPagarPorCuentas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			retencionesporpagarporcuentas.setes_debito_dato(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jCheckBoxes_debito_datoRetencionesPorPagarPorCuentas.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_ESDEBITODATO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jLabeles_debito_datoRetencionesPorPagarPorCuentas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualRetencionesPorPagarPorCuentas(RetencionesPorPagarPorCuentas retencionesporpagarporcuentasBean,RetencionesPorPagarPorCuentas retencionesporpagarporcuentas,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosRetencionesPorPagarPorCuentas(RetencionesPorPagarPorCuentas retencionesporpagarporcuentasOrigen,RetencionesPorPagarPorCuentas retencionesporpagarporcuentas,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && retencionesporpagarporcuentasOrigen.getId()!=null && !retencionesporpagarporcuentasOrigen.getId().equals(0L))) {retencionesporpagarporcuentas.setId(retencionesporpagarporcuentasOrigen.getId());}}
			if(conDefault || (!conDefault && retencionesporpagarporcuentasOrigen.getes_debito()!=null && !retencionesporpagarporcuentasOrigen.getes_debito().equals(false))) {retencionesporpagarporcuentas.setes_debito(retencionesporpagarporcuentasOrigen.getes_debito());}
			if(conDefault || (!conDefault && retencionesporpagarporcuentasOrigen.getfecha_emision()!=null && !retencionesporpagarporcuentasOrigen.getfecha_emision().equals(new Date()))) {retencionesporpagarporcuentas.setfecha_emision(retencionesporpagarporcuentasOrigen.getfecha_emision());}
			if(conDefault || (!conDefault && retencionesporpagarporcuentasOrigen.getnombre_tipo_movimiento()!=null && !retencionesporpagarporcuentasOrigen.getnombre_tipo_movimiento().equals(""))) {retencionesporpagarporcuentas.setnombre_tipo_movimiento(retencionesporpagarporcuentasOrigen.getnombre_tipo_movimiento());}
			if(conDefault || (!conDefault && retencionesporpagarporcuentasOrigen.getnumero_mayor()!=null && !retencionesporpagarporcuentasOrigen.getnumero_mayor().equals(""))) {retencionesporpagarporcuentas.setnumero_mayor(retencionesporpagarporcuentasOrigen.getnumero_mayor());}
			if(conDefault || (!conDefault && retencionesporpagarporcuentasOrigen.getnombre_cuenta_contable_retencion()!=null && !retencionesporpagarporcuentasOrigen.getnombre_cuenta_contable_retencion().equals(""))) {retencionesporpagarporcuentas.setnombre_cuenta_contable_retencion(retencionesporpagarporcuentasOrigen.getnombre_cuenta_contable_retencion());}
			if(conDefault || (!conDefault && retencionesporpagarporcuentasOrigen.getnumero_pre_impreso_factura()!=null && !retencionesporpagarporcuentasOrigen.getnumero_pre_impreso_factura().equals(""))) {retencionesporpagarporcuentas.setnumero_pre_impreso_factura(retencionesporpagarporcuentasOrigen.getnumero_pre_impreso_factura());}
			if(conDefault || (!conDefault && retencionesporpagarporcuentasOrigen.getporcentaje()!=null && !retencionesporpagarporcuentasOrigen.getporcentaje().equals(0.0))) {retencionesporpagarporcuentas.setporcentaje(retencionesporpagarporcuentasOrigen.getporcentaje());}
			if(conDefault || (!conDefault && retencionesporpagarporcuentasOrigen.getbase_imponible()!=null && !retencionesporpagarporcuentasOrigen.getbase_imponible().equals(0.0))) {retencionesporpagarporcuentas.setbase_imponible(retencionesporpagarporcuentasOrigen.getbase_imponible());}
			if(conDefault || (!conDefault && retencionesporpagarporcuentasOrigen.getvalor()!=null && !retencionesporpagarporcuentasOrigen.getvalor().equals(0.0))) {retencionesporpagarporcuentas.setvalor(retencionesporpagarporcuentasOrigen.getvalor());}
			if(conDefault || (!conDefault && retencionesporpagarporcuentasOrigen.getnumero()!=null && !retencionesporpagarporcuentasOrigen.getnumero().equals(""))) {retencionesporpagarporcuentas.setnumero(retencionesporpagarporcuentasOrigen.getnumero());}
			if(conDefault || (!conDefault && retencionesporpagarporcuentasOrigen.getnombre_benef()!=null && !retencionesporpagarporcuentasOrigen.getnombre_benef().equals(""))) {retencionesporpagarporcuentas.setnombre_benef(retencionesporpagarporcuentasOrigen.getnombre_benef());}
			if(conDefault || (!conDefault && retencionesporpagarporcuentasOrigen.getruc_benef()!=null && !retencionesporpagarporcuentasOrigen.getruc_benef().equals(""))) {retencionesporpagarporcuentas.setruc_benef(retencionesporpagarporcuentasOrigen.getruc_benef());}
			if(conDefault || (!conDefault && retencionesporpagarporcuentasOrigen.getnombre_cuenta_contable()!=null && !retencionesporpagarporcuentasOrigen.getnombre_cuenta_contable().equals(""))) {retencionesporpagarporcuentas.setnombre_cuenta_contable(retencionesporpagarporcuentasOrigen.getnombre_cuenta_contable());}
			if(conDefault || (!conDefault && retencionesporpagarporcuentasOrigen.getnombre_cuenta_contable_credito()!=null && !retencionesporpagarporcuentasOrigen.getnombre_cuenta_contable_credito().equals(""))) {retencionesporpagarporcuentas.setnombre_cuenta_contable_credito(retencionesporpagarporcuentasOrigen.getnombre_cuenta_contable_credito());}
			if(conDefault || (!conDefault && retencionesporpagarporcuentasOrigen.getes_debito_dato()!=null && !retencionesporpagarporcuentasOrigen.getes_debito_dato().equals(false))) {retencionesporpagarporcuentas.setes_debito_dato(retencionesporpagarporcuentasOrigen.getes_debito_dato());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioRetencionesPorPagarPorCuentas(RetencionesPorPagarPorCuentas retencionesporpagarporcuentas) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jLabelidRetencionesPorPagarPorCuentas.setText(retencionesporpagarporcuentas.getId().toString());
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jDateChooserfecha_emisionRetencionesPorPagarPorCuentas.setDate(retencionesporpagarporcuentas.getfecha_emision());
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextAreanombre_tipo_movimientoRetencionesPorPagarPorCuentas.setText(retencionesporpagarporcuentas.getnombre_tipo_movimiento());
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextAreanumero_mayorRetencionesPorPagarPorCuentas.setText(retencionesporpagarporcuentas.getnumero_mayor());
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextAreanombre_cuenta_contable_retencionRetencionesPorPagarPorCuentas.setText(retencionesporpagarporcuentas.getnombre_cuenta_contable_retencion());
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextFieldnumero_pre_impreso_facturaRetencionesPorPagarPorCuentas.setText(retencionesporpagarporcuentas.getnumero_pre_impreso_factura());
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextFieldporcentajeRetencionesPorPagarPorCuentas.setText(retencionesporpagarporcuentas.getporcentaje().toString());
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextFieldbase_imponibleRetencionesPorPagarPorCuentas.setText(retencionesporpagarporcuentas.getbase_imponible().toString());
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextFieldvalorRetencionesPorPagarPorCuentas.setText(retencionesporpagarporcuentas.getvalor().toString());
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextFieldnumeroRetencionesPorPagarPorCuentas.setText(retencionesporpagarporcuentas.getnumero());
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextAreanombre_benefRetencionesPorPagarPorCuentas.setText(retencionesporpagarporcuentas.getnombre_benef());
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextFieldruc_benefRetencionesPorPagarPorCuentas.setText(retencionesporpagarporcuentas.getruc_benef());
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextAreanombre_cuenta_contableRetencionesPorPagarPorCuentas.setText(retencionesporpagarporcuentas.getnombre_cuenta_contable());
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextAreanombre_cuenta_contable_creditoRetencionesPorPagarPorCuentas.setText(retencionesporpagarporcuentas.getnombre_cuenta_contable_credito());
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jCheckBoxes_debito_datoRetencionesPorPagarPorCuentas.setSelected(retencionesporpagarporcuentas.getes_debito_dato());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioRetencionesPorPagarPorCuentas(RetencionesPorPagarPorCuentasBean retencionesporpagarporcuentasBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jLabelidRetencionesPorPagarPorCuentas.setText(retencionesporpagarporcuentasBean.getId().toString());
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jDateChooserfecha_emisionRetencionesPorPagarPorCuentas.setDate(retencionesporpagarporcuentasBean.getfecha_emision());
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextAreanombre_tipo_movimientoRetencionesPorPagarPorCuentas.setText(retencionesporpagarporcuentasBean.getnombre_tipo_movimiento());
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextAreanumero_mayorRetencionesPorPagarPorCuentas.setText(retencionesporpagarporcuentasBean.getnumero_mayor());
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextAreanombre_cuenta_contable_retencionRetencionesPorPagarPorCuentas.setText(retencionesporpagarporcuentasBean.getnombre_cuenta_contable_retencion());
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextFieldnumero_pre_impreso_facturaRetencionesPorPagarPorCuentas.setText(retencionesporpagarporcuentasBean.getnumero_pre_impreso_factura());
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextFieldporcentajeRetencionesPorPagarPorCuentas.setText(retencionesporpagarporcuentasBean.getporcentaje().toString());
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextFieldbase_imponibleRetencionesPorPagarPorCuentas.setText(retencionesporpagarporcuentasBean.getbase_imponible().toString());
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextFieldvalorRetencionesPorPagarPorCuentas.setText(retencionesporpagarporcuentasBean.getvalor().toString());
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextFieldnumeroRetencionesPorPagarPorCuentas.setText(retencionesporpagarporcuentasBean.getnumero());
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextAreanombre_benefRetencionesPorPagarPorCuentas.setText(retencionesporpagarporcuentasBean.getnombre_benef());
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextFieldruc_benefRetencionesPorPagarPorCuentas.setText(retencionesporpagarporcuentasBean.getruc_benef());
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextAreanombre_cuenta_contableRetencionesPorPagarPorCuentas.setText(retencionesporpagarporcuentasBean.getnombre_cuenta_contable());
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextAreanombre_cuenta_contable_creditoRetencionesPorPagarPorCuentas.setText(retencionesporpagarporcuentasBean.getnombre_cuenta_contable_credito());
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jCheckBoxes_debito_datoRetencionesPorPagarPorCuentas.setSelected(retencionesporpagarporcuentasBean.getes_debito_dato());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanRetencionesPorPagarPorCuentas(RetencionesPorPagarPorCuentasParameterReturnGeneral retencionesporpagarporcuentasReturnGeneral,RetencionesPorPagarPorCuentasBean retencionesporpagarporcuentasBean,Boolean conDefault) throws Exception { 
		try {
			RetencionesPorPagarPorCuentas retencionesporpagarporcuentasLocal=new RetencionesPorPagarPorCuentas();
			
			retencionesporpagarporcuentasLocal=retencionesporpagarporcuentasReturnGeneral.getRetencionesPorPagarPorCuentas();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && retencionesporpagarporcuentasLocal.getId()!=null && !retencionesporpagarporcuentasLocal.getId().equals(0L))) {retencionesporpagarporcuentasBean.setId(retencionesporpagarporcuentasLocal.getId());}}
			if(conDefault || (!conDefault && retencionesporpagarporcuentasLocal.getfecha_emision()!=null && !retencionesporpagarporcuentasLocal.getfecha_emision().equals(new Date()))) {retencionesporpagarporcuentasBean.setfecha_emision(retencionesporpagarporcuentasLocal.getfecha_emision());}
			if(conDefault || (!conDefault && retencionesporpagarporcuentasLocal.getnombre_tipo_movimiento()!=null && !retencionesporpagarporcuentasLocal.getnombre_tipo_movimiento().equals(""))) {retencionesporpagarporcuentasBean.setnombre_tipo_movimiento(retencionesporpagarporcuentasLocal.getnombre_tipo_movimiento());}
			if(conDefault || (!conDefault && retencionesporpagarporcuentasLocal.getnumero_mayor()!=null && !retencionesporpagarporcuentasLocal.getnumero_mayor().equals(""))) {retencionesporpagarporcuentasBean.setnumero_mayor(retencionesporpagarporcuentasLocal.getnumero_mayor());}
			if(conDefault || (!conDefault && retencionesporpagarporcuentasLocal.getnombre_cuenta_contable_retencion()!=null && !retencionesporpagarporcuentasLocal.getnombre_cuenta_contable_retencion().equals(""))) {retencionesporpagarporcuentasBean.setnombre_cuenta_contable_retencion(retencionesporpagarporcuentasLocal.getnombre_cuenta_contable_retencion());}
			if(conDefault || (!conDefault && retencionesporpagarporcuentasLocal.getnumero_pre_impreso_factura()!=null && !retencionesporpagarporcuentasLocal.getnumero_pre_impreso_factura().equals(""))) {retencionesporpagarporcuentasBean.setnumero_pre_impreso_factura(retencionesporpagarporcuentasLocal.getnumero_pre_impreso_factura());}
			if(conDefault || (!conDefault && retencionesporpagarporcuentasLocal.getporcentaje()!=null && !retencionesporpagarporcuentasLocal.getporcentaje().equals(0.0))) {retencionesporpagarporcuentasBean.setporcentaje(retencionesporpagarporcuentasLocal.getporcentaje());}
			if(conDefault || (!conDefault && retencionesporpagarporcuentasLocal.getbase_imponible()!=null && !retencionesporpagarporcuentasLocal.getbase_imponible().equals(0.0))) {retencionesporpagarporcuentasBean.setbase_imponible(retencionesporpagarporcuentasLocal.getbase_imponible());}
			if(conDefault || (!conDefault && retencionesporpagarporcuentasLocal.getvalor()!=null && !retencionesporpagarporcuentasLocal.getvalor().equals(0.0))) {retencionesporpagarporcuentasBean.setvalor(retencionesporpagarporcuentasLocal.getvalor());}
			if(conDefault || (!conDefault && retencionesporpagarporcuentasLocal.getnumero()!=null && !retencionesporpagarporcuentasLocal.getnumero().equals(""))) {retencionesporpagarporcuentasBean.setnumero(retencionesporpagarporcuentasLocal.getnumero());}
			if(conDefault || (!conDefault && retencionesporpagarporcuentasLocal.getnombre_benef()!=null && !retencionesporpagarporcuentasLocal.getnombre_benef().equals(""))) {retencionesporpagarporcuentasBean.setnombre_benef(retencionesporpagarporcuentasLocal.getnombre_benef());}
			if(conDefault || (!conDefault && retencionesporpagarporcuentasLocal.getruc_benef()!=null && !retencionesporpagarporcuentasLocal.getruc_benef().equals(""))) {retencionesporpagarporcuentasBean.setruc_benef(retencionesporpagarporcuentasLocal.getruc_benef());}
			if(conDefault || (!conDefault && retencionesporpagarporcuentasLocal.getnombre_cuenta_contable()!=null && !retencionesporpagarporcuentasLocal.getnombre_cuenta_contable().equals(""))) {retencionesporpagarporcuentasBean.setnombre_cuenta_contable(retencionesporpagarporcuentasLocal.getnombre_cuenta_contable());}
			if(conDefault || (!conDefault && retencionesporpagarporcuentasLocal.getnombre_cuenta_contable_credito()!=null && !retencionesporpagarporcuentasLocal.getnombre_cuenta_contable_credito().equals(""))) {retencionesporpagarporcuentasBean.setnombre_cuenta_contable_credito(retencionesporpagarporcuentasLocal.getnombre_cuenta_contable_credito());}
			if(conDefault || (!conDefault && retencionesporpagarporcuentasLocal.getes_debito_dato()!=null && !retencionesporpagarporcuentasLocal.getes_debito_dato().equals(false))) {retencionesporpagarporcuentasBean.setes_debito_dato(retencionesporpagarporcuentasLocal.getes_debito_dato());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxRetencionesPorPagarPorCuentasGenerico(Long idRetencionesPorPagarPorCuentasSeleccionado,JComboBox jComboBoxRetencionesPorPagarPorCuentas,List<RetencionesPorPagarPorCuentas> retencionesporpagarporcuentassLocal)throws Exception {
		try {
			RetencionesPorPagarPorCuentas  retencionesporpagarporcuentasTemp=null;

			for(RetencionesPorPagarPorCuentas retencionesporpagarporcuentasAux:retencionesporpagarporcuentassLocal) {
				if(retencionesporpagarporcuentasAux.getId()!=null && retencionesporpagarporcuentasAux.getId().equals(idRetencionesPorPagarPorCuentasSeleccionado)) {
					retencionesporpagarporcuentasTemp=retencionesporpagarporcuentasAux;
					break;
				}
			}

			jComboBoxRetencionesPorPagarPorCuentas.setSelectedItem(retencionesporpagarporcuentasTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxRetencionesPorPagarPorCuentasGenerico(JComboBox jComboBoxRetencionesPorPagarPorCuentas,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxRetencionesPorPagarPorCuentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxRetencionesPorPagarPorCuentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxRetencionesPorPagarPorCuentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxRetencionesPorPagarPorCuentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxRetencionesPorPagarPorCuentas.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxRetencionesPorPagarPorCuentas.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxRetencionesPorPagarPorCuentas.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxRetencionesPorPagarPorCuentas.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxRetencionesPorPagarPorCuentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxRetencionesPorPagarPorCuentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			retencionesporpagarporcuentas=(RetencionesPorPagarPorCuentas) retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			retencionesporpagarporcuentas =(RetencionesPorPagarPorCuentas) retencionesporpagarporcuentass.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!retencionesporpagarporcuentas.getIsNew() && !retencionesporpagarporcuentas.getIsChanged() && !retencionesporpagarporcuentas.getIsDeleted()) {
				sDescripcion=retencionesporpagarporcuentas.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=retencionesporpagarporcuentas.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!retencionesporpagarporcuentas.getIsNew() && !retencionesporpagarporcuentas.getIsChanged() && !retencionesporpagarporcuentas.getIsDeleted()) {
				sDescripcion=retencionesporpagarporcuentas.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=retencionesporpagarporcuentas.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Ejercicio")) {
			//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
			if(!retencionesporpagarporcuentas.getIsNew() && !retencionesporpagarporcuentas.getIsChanged() && !retencionesporpagarporcuentas.getIsDeleted()) {
				sDescripcion=retencionesporpagarporcuentas.getejercicio_descripcion();
			} else {
				//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
				sDescripcion=retencionesporpagarporcuentas.getejercicio_descripcion();
			}
		}

		if(sTipo.equals("Periodo")) {
			//sDescripcion=this.getActualPeriodoForeignKeyDescripcion((Long)value);
			if(!retencionesporpagarporcuentas.getIsNew() && !retencionesporpagarporcuentas.getIsChanged() && !retencionesporpagarporcuentas.getIsDeleted()) {
				sDescripcion=retencionesporpagarporcuentas.getperiodo_descripcion();
			} else {
				//sDescripcion=this.getActualPeriodoForeignKeyDescripcion((Long)value);
				sDescripcion=retencionesporpagarporcuentas.getperiodo_descripcion();
			}
		}

		if(sTipo.equals("TipoRetencion")) {
			//sDescripcion=this.getActualTipoRetencionForeignKeyDescripcion((Long)value);
			if(!retencionesporpagarporcuentas.getIsNew() && !retencionesporpagarporcuentas.getIsChanged() && !retencionesporpagarporcuentas.getIsDeleted()) {
				sDescripcion=retencionesporpagarporcuentas.gettiporetencion_descripcion();
			} else {
				//sDescripcion=this.getActualTipoRetencionForeignKeyDescripcion((Long)value);
				sDescripcion=retencionesporpagarporcuentas.gettiporetencion_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		RetencionesPorPagarPorCuentas retencionesporpagarporcuentasRow=new RetencionesPorPagarPorCuentas();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			retencionesporpagarporcuentasRow=(RetencionesPorPagarPorCuentas) retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			retencionesporpagarporcuentasRow=(RetencionesPorPagarPorCuentas) retencionesporpagarporcuentass.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualRetencionesPorPagarPorCuentas(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoRetencionesPorPagarPorCuentas.setVisible((this.isVisibilidadCeldaNuevoRetencionesPorPagarPorCuentas && this.isPermisoNuevoRetencionesPorPagarPorCuentas));			
			this.jButtonDuplicarRetencionesPorPagarPorCuentas.setVisible((this.isVisibilidadCeldaDuplicarRetencionesPorPagarPorCuentas && this.isPermisoDuplicarRetencionesPorPagarPorCuentas));			
			this.jButtonCopiarRetencionesPorPagarPorCuentas.setVisible((this.isVisibilidadCeldaCopiarRetencionesPorPagarPorCuentas && this.isPermisoCopiarRetencionesPorPagarPorCuentas));
			this.jButtonVerFormRetencionesPorPagarPorCuentas.setVisible((this.isVisibilidadCeldaVerFormRetencionesPorPagarPorCuentas && this.isPermisoVerFormRetencionesPorPagarPorCuentas));
			
			this.jButtonAbrirOrderByRetencionesPorPagarPorCuentas.setVisible((this.isVisibilidadCeldaOrdenRetencionesPorPagarPorCuentas && this.isPermisoOrdenRetencionesPorPagarPorCuentas));			
			
			this.jButtonNuevoRelacionesRetencionesPorPagarPorCuentas.setVisible((this.isVisibilidadCeldaNuevoRelacionesRetencionesPorPagarPorCuentas && this.isPermisoNuevoRetencionesPorPagarPorCuentas));			
			this.jButtonNuevoGuardarCambiosRetencionesPorPagarPorCuentas.setVisible((this.isVisibilidadCeldaNuevoRetencionesPorPagarPorCuentas && this.isPermisoNuevoRetencionesPorPagarPorCuentas && this.isPermisoGuardarCambiosRetencionesPorPagarPorCuentas));
			
			if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) {
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonModificarRetencionesPorPagarPorCuentas.setVisible((this.isVisibilidadCeldaModificarRetencionesPorPagarPorCuentas && this.isPermisoActualizarRetencionesPorPagarPorCuentas));	
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonActualizarRetencionesPorPagarPorCuentas.setVisible((this.isVisibilidadCeldaActualizarRetencionesPorPagarPorCuentas && this.isPermisoActualizarRetencionesPorPagarPorCuentas));	
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonEliminarRetencionesPorPagarPorCuentas.setVisible((this.isVisibilidadCeldaEliminarRetencionesPorPagarPorCuentas && this.isPermisoEliminarRetencionesPorPagarPorCuentas));
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonCancelarRetencionesPorPagarPorCuentas.setVisible(this.isVisibilidadCeldaCancelarRetencionesPorPagarPorCuentas);							
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonGuardarCambiosRetencionesPorPagarPorCuentas.setVisible((this.isVisibilidadCeldaGuardarRetencionesPorPagarPorCuentas && this.isPermisoGuardarCambiosRetencionesPorPagarPorCuentas));			
			
			}
						
			this.jButtonGuardarCambiosTablaRetencionesPorPagarPorCuentas.setVisible((this.isVisibilidadCeldaGuardarCambiosRetencionesPorPagarPorCuentas && this.isPermisoGuardarCambiosRetencionesPorPagarPorCuentas));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarRetencionesPorPagarPorCuentas.setVisible((this.isVisibilidadCeldaNuevoRetencionesPorPagarPorCuentas && this.isPermisoNuevoRetencionesPorPagarPorCuentas));						
			this.jButtonDuplicarToolBarRetencionesPorPagarPorCuentas.setVisible((this.isVisibilidadCeldaDuplicarRetencionesPorPagarPorCuentas && this.isPermisoDuplicarRetencionesPorPagarPorCuentas));						
			this.jButtonCopiarToolBarRetencionesPorPagarPorCuentas.setVisible((this.isVisibilidadCeldaCopiarRetencionesPorPagarPorCuentas && this.isPermisoCopiarRetencionesPorPagarPorCuentas));			
			this.jButtonVerFormToolBarRetencionesPorPagarPorCuentas.setVisible((this.isVisibilidadCeldaVerFormRetencionesPorPagarPorCuentas && this.isPermisoVerFormRetencionesPorPagarPorCuentas));			
			this.jButtonAbrirOrderByToolBarRetencionesPorPagarPorCuentas.setVisible((this.isVisibilidadCeldaOrdenRetencionesPorPagarPorCuentas && this.isPermisoOrdenRetencionesPorPagarPorCuentas));
			this.jButtonNuevoRelacionesToolBarRetencionesPorPagarPorCuentas.setVisible((this.isVisibilidadCeldaNuevoRelacionesRetencionesPorPagarPorCuentas && this.isPermisoNuevoRetencionesPorPagarPorCuentas));			
			this.jButtonNuevoGuardarCambiosToolBarRetencionesPorPagarPorCuentas.setVisible((this.isVisibilidadCeldaNuevoRetencionesPorPagarPorCuentas && this.isPermisoNuevoRetencionesPorPagarPorCuentas && this.isPermisoGuardarCambiosRetencionesPorPagarPorCuentas));			
			
			if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) {
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonModificarToolBarRetencionesPorPagarPorCuentas.setVisible((this.isVisibilidadCeldaModificarRetencionesPorPagarPorCuentas && this.isPermisoActualizarRetencionesPorPagarPorCuentas));	
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonActualizarToolBarRetencionesPorPagarPorCuentas.setVisible((this.isVisibilidadCeldaActualizarRetencionesPorPagarPorCuentas  && this.isPermisoActualizarRetencionesPorPagarPorCuentas));	
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonEliminarToolBarRetencionesPorPagarPorCuentas.setVisible((this.isVisibilidadCeldaEliminarRetencionesPorPagarPorCuentas && this.isPermisoEliminarRetencionesPorPagarPorCuentas));
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonCancelarToolBarRetencionesPorPagarPorCuentas.setVisible(this.isVisibilidadCeldaCancelarRetencionesPorPagarPorCuentas);				
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonGuardarCambiosToolBarRetencionesPorPagarPorCuentas.setVisible((this.isVisibilidadCeldaGuardarRetencionesPorPagarPorCuentas && this.isPermisoGuardarCambiosRetencionesPorPagarPorCuentas));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarRetencionesPorPagarPorCuentas.setVisible((this.isVisibilidadCeldaGuardarCambiosRetencionesPorPagarPorCuentas && this.isPermisoGuardarCambiosRetencionesPorPagarPorCuentas));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoRetencionesPorPagarPorCuentas.setVisible((this.isVisibilidadCeldaNuevoRetencionesPorPagarPorCuentas && this.isPermisoNuevoRetencionesPorPagarPorCuentas));			
			this.jMenuItemDuplicarRetencionesPorPagarPorCuentas.setVisible((this.isVisibilidadCeldaDuplicarRetencionesPorPagarPorCuentas && this.isPermisoDuplicarRetencionesPorPagarPorCuentas));			
			this.jMenuItemCopiarRetencionesPorPagarPorCuentas.setVisible((this.isVisibilidadCeldaCopiarRetencionesPorPagarPorCuentas && this.isPermisoCopiarRetencionesPorPagarPorCuentas));			
			this.jMenuItemVerFormRetencionesPorPagarPorCuentas.setVisible((this.isVisibilidadCeldaVerFormRetencionesPorPagarPorCuentas && this.isPermisoVerFormRetencionesPorPagarPorCuentas));			
			this.jMenuItemAbrirOrderByRetencionesPorPagarPorCuentas.setVisible((this.isVisibilidadCeldaOrdenRetencionesPorPagarPorCuentas && this.isPermisoOrdenRetencionesPorPagarPorCuentas));			
			//this.jMenuItemMostrarOcultarRetencionesPorPagarPorCuentas.setVisible((this.isVisibilidadCeldaOrdenRetencionesPorPagarPorCuentas && this.isPermisoOrdenRetencionesPorPagarPorCuentas));
			this.jMenuItemDetalleAbrirOrderByRetencionesPorPagarPorCuentas.setVisible((this.isVisibilidadCeldaOrdenRetencionesPorPagarPorCuentas && this.isPermisoOrdenRetencionesPorPagarPorCuentas));			
			//this.jMenuItemDetalleMostrarOcultarRetencionesPorPagarPorCuentas.setVisible((this.isVisibilidadCeldaOrdenRetencionesPorPagarPorCuentas && this.isPermisoOrdenRetencionesPorPagarPorCuentas));			
			this.jMenuItemNuevoRelacionesRetencionesPorPagarPorCuentas.setVisible((this.isVisibilidadCeldaNuevoRelacionesRetencionesPorPagarPorCuentas && this.isPermisoNuevoRetencionesPorPagarPorCuentas));			
			this.jMenuItemNuevoGuardarCambiosRetencionesPorPagarPorCuentas.setVisible((this.isVisibilidadCeldaNuevoRetencionesPorPagarPorCuentas && this.isPermisoNuevoRetencionesPorPagarPorCuentas && this.isPermisoGuardarCambiosRetencionesPorPagarPorCuentas));									
			
			if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) {
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jMenuItemModificarRetencionesPorPagarPorCuentas.setVisible((this.isVisibilidadCeldaModificarRetencionesPorPagarPorCuentas && this.isPermisoActualizarRetencionesPorPagarPorCuentas));	
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jMenuItemActualizarRetencionesPorPagarPorCuentas.setVisible((this.isVisibilidadCeldaActualizarRetencionesPorPagarPorCuentas && this.isPermisoActualizarRetencionesPorPagarPorCuentas));	
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jMenuItemEliminarRetencionesPorPagarPorCuentas.setVisible((this.isVisibilidadCeldaEliminarRetencionesPorPagarPorCuentas && this.isPermisoEliminarRetencionesPorPagarPorCuentas));
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jMenuItemCancelarRetencionesPorPagarPorCuentas.setVisible(this.isVisibilidadCeldaCancelarRetencionesPorPagarPorCuentas);				
			}
			
			this.jMenuItemGuardarCambiosRetencionesPorPagarPorCuentas.setVisible((this.isVisibilidadCeldaGuardarRetencionesPorPagarPorCuentas && this.isPermisoGuardarCambiosRetencionesPorPagarPorCuentas));						
			this.jMenuItemGuardarCambiosTablaRetencionesPorPagarPorCuentas.setVisible((this.isVisibilidadCeldaGuardarCambiosRetencionesPorPagarPorCuentas && this.isPermisoGuardarCambiosRetencionesPorPagarPorCuentas));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoRetencionesPorPagarPorCuentas=this.jButtonNuevoRetencionesPorPagarPorCuentas.isVisible();
			this.isVisibilidadCeldaDuplicarRetencionesPorPagarPorCuentas=this.jButtonDuplicarRetencionesPorPagarPorCuentas.isVisible();
			this.isVisibilidadCeldaCopiarRetencionesPorPagarPorCuentas=this.jButtonCopiarRetencionesPorPagarPorCuentas.isVisible();
			this.isVisibilidadCeldaVerFormRetencionesPorPagarPorCuentas=this.jButtonVerFormRetencionesPorPagarPorCuentas.isVisible();
			
			this.isVisibilidadCeldaOrdenRetencionesPorPagarPorCuentas=this.jButtonAbrirOrderByRetencionesPorPagarPorCuentas.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesRetencionesPorPagarPorCuentas=this.jButtonNuevoRelacionesRetencionesPorPagarPorCuentas.isVisible();
			this.isVisibilidadCeldaModificarRetencionesPorPagarPorCuentas=this.jButtonModificarRetencionesPorPagarPorCuentas.isVisible();
			
			if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) {
			this.isVisibilidadCeldaActualizarRetencionesPorPagarPorCuentas=this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonActualizarRetencionesPorPagarPorCuentas.isVisible();
			this.isVisibilidadCeldaEliminarRetencionesPorPagarPorCuentas=this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonEliminarRetencionesPorPagarPorCuentas.isVisible();
			this.isVisibilidadCeldaCancelarRetencionesPorPagarPorCuentas=this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonCancelarRetencionesPorPagarPorCuentas.isVisible();
			this.isVisibilidadCeldaGuardarRetencionesPorPagarPorCuentas=this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonGuardarCambiosRetencionesPorPagarPorCuentas.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosRetencionesPorPagarPorCuentas=this.jButtonGuardarCambiosTablaRetencionesPorPagarPorCuentas.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoRetencionesPorPagarPorCuentas=this.jButtonNuevoToolBarRetencionesPorPagarPorCuentas.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesRetencionesPorPagarPorCuentas=this.jButtonNuevoRelacionesToolBarRetencionesPorPagarPorCuentas.isVisible();
			
			if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) {
			this.isVisibilidadCeldaModificarRetencionesPorPagarPorCuentas=this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonModificarToolBarRetencionesPorPagarPorCuentas.isVisible();
			this.isVisibilidadCeldaActualizarRetencionesPorPagarPorCuentas=this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonActualizarToolBarRetencionesPorPagarPorCuentas.isVisible();
			this.isVisibilidadCeldaEliminarRetencionesPorPagarPorCuentas=this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonEliminarToolBarRetencionesPorPagarPorCuentas.isVisible();
			this.isVisibilidadCeldaCancelarRetencionesPorPagarPorCuentas=this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonCancelarToolBarRetencionesPorPagarPorCuentas.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarRetencionesPorPagarPorCuentas=this.jButtonGuardarCambiosToolBarRetencionesPorPagarPorCuentas.isVisible();
			this.isVisibilidadCeldaGuardarCambiosRetencionesPorPagarPorCuentas=this.jButtonGuardarCambiosTablaToolBarRetencionesPorPagarPorCuentas.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoRetencionesPorPagarPorCuentas=this.jMenuItemNuevoRetencionesPorPagarPorCuentas.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesRetencionesPorPagarPorCuentas=this.jMenuItemNuevoRelacionesRetencionesPorPagarPorCuentas.isVisible();
			
			if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) {
			this.isVisibilidadCeldaModificarRetencionesPorPagarPorCuentas=this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jMenuItemModificarRetencionesPorPagarPorCuentas.isVisible();
			this.isVisibilidadCeldaActualizarRetencionesPorPagarPorCuentas=this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jMenuItemActualizarRetencionesPorPagarPorCuentas.isVisible();
			this.isVisibilidadCeldaEliminarRetencionesPorPagarPorCuentas=this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jMenuItemEliminarRetencionesPorPagarPorCuentas.isVisible();
			this.isVisibilidadCeldaCancelarRetencionesPorPagarPorCuentas=this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jMenuItemCancelarRetencionesPorPagarPorCuentas.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarRetencionesPorPagarPorCuentas=this.jMenuItemGuardarCambiosRetencionesPorPagarPorCuentas.isVisible();
			this.isVisibilidadCeldaGuardarCambiosRetencionesPorPagarPorCuentas=this.jMenuItemGuardarCambiosTablaRetencionesPorPagarPorCuentas.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesRetencionesPorPagarPorCuentas(Boolean esInicializar) {
		if(RetencionesPorPagarPorCuentasJInternalFrame.ISBINDING_MANUAL) {			
			if(this.retencionesporpagarporcuentasSessionBean.getConGuardarRelaciones()) {
				//if(this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesRetencionesPorPagarPorCuentas();
			}
			
			this.inicializarActualizarBindingBotonesManualRetencionesPorPagarPorCuentas(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualRetencionesPorPagarPorCuentas() {
		this.jButtonNuevoRetencionesPorPagarPorCuentas.setVisible(this.isPermisoNuevoRetencionesPorPagarPorCuentas);			
		this.jButtonDuplicarRetencionesPorPagarPorCuentas.setVisible(this.isPermisoDuplicarRetencionesPorPagarPorCuentas);			
		this.jButtonCopiarRetencionesPorPagarPorCuentas.setVisible(this.isPermisoCopiarRetencionesPorPagarPorCuentas);			
		this.jButtonVerFormRetencionesPorPagarPorCuentas.setVisible(this.isPermisoVerFormRetencionesPorPagarPorCuentas);			
		
		this.jButtonAbrirOrderByRetencionesPorPagarPorCuentas.setVisible(this.isPermisoOrdenRetencionesPorPagarPorCuentas);					
		
		this.jButtonNuevoRelacionesRetencionesPorPagarPorCuentas.setVisible(this.isPermisoNuevoRetencionesPorPagarPorCuentas);			
		
		if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonModificarRetencionesPorPagarPorCuentas.setVisible(this.isPermisoActualizarRetencionesPorPagarPorCuentas);	
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonActualizarRetencionesPorPagarPorCuentas.setVisible(this.isPermisoActualizarRetencionesPorPagarPorCuentas);	
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonEliminarRetencionesPorPagarPorCuentas.setVisible(this.isPermisoEliminarRetencionesPorPagarPorCuentas);
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonCancelarRetencionesPorPagarPorCuentas.setVisible(this.isVisibilidadCeldaCancelarRetencionesPorPagarPorCuentas);						
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonGuardarCambiosRetencionesPorPagarPorCuentas.setVisible(this.isPermisoGuardarCambiosRetencionesPorPagarPorCuentas);							
		}
		
		this.jButtonGuardarCambiosTablaRetencionesPorPagarPorCuentas.setVisible(this.isPermisoActualizarRetencionesPorPagarPorCuentas);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleRetencionesPorPagarPorCuentas() {
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonModificarRetencionesPorPagarPorCuentas.setVisible(this.isPermisoActualizarRetencionesPorPagarPorCuentas);	
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonActualizarRetencionesPorPagarPorCuentas.setVisible(this.isPermisoActualizarRetencionesPorPagarPorCuentas);	
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonEliminarRetencionesPorPagarPorCuentas.setVisible(this.isPermisoEliminarRetencionesPorPagarPorCuentas);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonCancelarRetencionesPorPagarPorCuentas.setVisible(this.isVisibilidadCeldaCancelarRetencionesPorPagarPorCuentas);							
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonGuardarCambiosRetencionesPorPagarPorCuentas.setVisible((this.isVisibilidadCeldaGuardarRetencionesPorPagarPorCuentas && this.isPermisoGuardarCambiosRetencionesPorPagarPorCuentas));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosRetencionesPorPagarPorCuentas() {
		if(RetencionesPorPagarPorCuentasJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualRetencionesPorPagarPorCuentas();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesRetencionesPorPagarPorCuentas() {
	}
	
	public void jTableDatosRetencionesPorPagarPorCuentasListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarRetencionesPorPagarPorCuentas(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidRetencionesPorPagarPorCuentasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRetencionesPorPagarPorCuentas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorCuentas(this.getretencionesporpagarporcuentas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.retencionesporpagarporcuentas =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass().toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.retencionesporpagarporcuentas =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentass.toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.retencionesporpagarporcuentas==null) {
						this.retencionesporpagarporcuentas = new RetencionesPorPagarPorCuentas();
					}

					this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentas);
				}

				if(this.retencionesporpagarporcuentas.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.retencionesporpagarporcuentas.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRetencionesPorPagarPorCuentas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaRetencionesPorPagarPorCuentasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporcuentasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebRetencionesPorPagarPorCuentas(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRetencionesPorPagarPorCuentas.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosRetencionesPorPagarPorCuentas.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosRetencionesPorPagarPorCuentas.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentas =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass().toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.retencionesporpagarporcuentas =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentass.toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorCuentas(this.getretencionesporpagarporcuentas(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentas);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.retencionesporpagarporcuentasLogic.getConnexion());

				if(this.retencionesporpagarporcuentas.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.retencionesporpagarporcuentas.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderRetencionesPorPagarPorCuentas=(TitledBorder)this.jScrollPanelDatosRetencionesPorPagarPorCuentas.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderRetencionesPorPagarPorCuentas.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporcuentasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporcuentasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporcuentasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaRetencionesPorPagarPorCuentasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRetencionesPorPagarPorCuentas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorCuentas(this.getretencionesporpagarporcuentas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.retencionesporpagarporcuentas =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass().toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.retencionesporpagarporcuentas =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentass.toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.retencionesporpagarporcuentas==null) {
						this.retencionesporpagarporcuentas = new RetencionesPorPagarPorCuentas();
					}

					this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentas);
				}

				if(this.retencionesporpagarporcuentas.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.retencionesporpagarporcuentas.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRetencionesPorPagarPorCuentas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalRetencionesPorPagarPorCuentasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporcuentasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebRetencionesPorPagarPorCuentas(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRetencionesPorPagarPorCuentas.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosRetencionesPorPagarPorCuentas.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosRetencionesPorPagarPorCuentas.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentas =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass().toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.retencionesporpagarporcuentas =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentass.toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorCuentas(this.getretencionesporpagarporcuentas(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentas);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.retencionesporpagarporcuentasLogic.getConnexion());

				if(this.retencionesporpagarporcuentas.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.retencionesporpagarporcuentas.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderRetencionesPorPagarPorCuentas=(TitledBorder)this.jScrollPanelDatosRetencionesPorPagarPorCuentas.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderRetencionesPorPagarPorCuentas.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporcuentasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporcuentasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporcuentasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalRetencionesPorPagarPorCuentasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRetencionesPorPagarPorCuentas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorCuentas(this.getretencionesporpagarporcuentas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.retencionesporpagarporcuentas =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass().toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.retencionesporpagarporcuentas =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentass.toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.retencionesporpagarporcuentas==null) {
						this.retencionesporpagarporcuentas = new RetencionesPorPagarPorCuentas();
					}

					this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentas);
				}

				if(this.retencionesporpagarporcuentas.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.retencionesporpagarporcuentas.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRetencionesPorPagarPorCuentas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ejercicioRetencionesPorPagarPorCuentasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporcuentasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoejercicio=true;

			idTienePermisoejercicio=this.tienePermisosUsuarioEnPaginaWebRetencionesPorPagarPorCuentas(EjercicioConstantesFunciones.CLASSNAME);

			if(idTienePermisoejercicio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRetencionesPorPagarPorCuentas.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosRetencionesPorPagarPorCuentas.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosRetencionesPorPagarPorCuentas.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentas =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass().toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.retencionesporpagarporcuentas =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentass.toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorCuentas(this.getretencionesporpagarporcuentas(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentas);

				this.ejercicioBeanSwingJInternalFrame=new EjercicioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ejercicioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ejercicioBeanSwingJInternalFrame.getEjercicioLogic().setConnexion(this.retencionesporpagarporcuentasLogic.getConnexion());

				if(this.retencionesporpagarporcuentas.getid_ejercicio()!=null) {
					this.ejercicioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ejercicioBeanSwingJInternalFrame.setIdActual(this.retencionesporpagarporcuentas.getid_ejercicio());
					this.ejercicioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.inicializarActualizarBindingTablaEjercicio();
				}

				JInternalFrameBase jinternalFrame =this.ejercicioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderRetencionesPorPagarPorCuentas=(TitledBorder)this.jScrollPanelDatosRetencionesPorPagarPorCuentas.getBorder();
				TitledBorder titledBorderejercicio=(TitledBorder)this.ejercicioBeanSwingJInternalFrame.jScrollPanelDatosEjercicio.getBorder();

				titledBorderejercicio.setTitle(titledBorderRetencionesPorPagarPorCuentas.getTitle() + " -> Ejercicio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporcuentasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporcuentasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporcuentasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ejercicioRetencionesPorPagarPorCuentasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRetencionesPorPagarPorCuentas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorCuentas(this.getretencionesporpagarporcuentas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.retencionesporpagarporcuentas =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass().toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.retencionesporpagarporcuentas =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentass.toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.retencionesporpagarporcuentas==null) {
						this.retencionesporpagarporcuentas = new RetencionesPorPagarPorCuentas();
					}

					this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentas);
				}

				if(this.retencionesporpagarporcuentas.getid_ejercicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ejercicio = "+this.retencionesporpagarporcuentas.getid_ejercicio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRetencionesPorPagarPorCuentas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_periodoRetencionesPorPagarPorCuentasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporcuentasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoperiodo=true;

			idTienePermisoperiodo=this.tienePermisosUsuarioEnPaginaWebRetencionesPorPagarPorCuentas(PeriodoConstantesFunciones.CLASSNAME);

			if(idTienePermisoperiodo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRetencionesPorPagarPorCuentas.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosRetencionesPorPagarPorCuentas.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosRetencionesPorPagarPorCuentas.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentas =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass().toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.retencionesporpagarporcuentas =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentass.toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorCuentas(this.getretencionesporpagarporcuentas(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentas);

				this.periodoBeanSwingJInternalFrame=new PeriodoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.periodoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.periodoBeanSwingJInternalFrame.getPeriodoLogic().setConnexion(this.retencionesporpagarporcuentasLogic.getConnexion());

				if(this.retencionesporpagarporcuentas.getid_periodo()!=null) {
					this.periodoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.periodoBeanSwingJInternalFrame.setIdActual(this.retencionesporpagarporcuentas.getid_periodo());
					this.periodoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.inicializarActualizarBindingTablaPeriodo();
				}

				JInternalFrameBase jinternalFrame =this.periodoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderRetencionesPorPagarPorCuentas=(TitledBorder)this.jScrollPanelDatosRetencionesPorPagarPorCuentas.getBorder();
				TitledBorder titledBorderperiodo=(TitledBorder)this.periodoBeanSwingJInternalFrame.jScrollPanelDatosPeriodo.getBorder();

				titledBorderperiodo.setTitle(titledBorderRetencionesPorPagarPorCuentas.getTitle() + " -> Periodo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporcuentasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporcuentasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporcuentasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_periodoRetencionesPorPagarPorCuentasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRetencionesPorPagarPorCuentas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorCuentas(this.getretencionesporpagarporcuentas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.retencionesporpagarporcuentas =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass().toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.retencionesporpagarporcuentas =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentass.toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.retencionesporpagarporcuentas==null) {
						this.retencionesporpagarporcuentas = new RetencionesPorPagarPorCuentas();
					}

					this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentas);
				}

				if(this.retencionesporpagarporcuentas.getid_periodo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_periodo = "+this.retencionesporpagarporcuentas.getid_periodo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRetencionesPorPagarPorCuentas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_retencionRetencionesPorPagarPorCuentasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporcuentasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotiporetencion=true;

			idTienePermisotiporetencion=this.tienePermisosUsuarioEnPaginaWebRetencionesPorPagarPorCuentas(TipoRetencionConstantesFunciones.CLASSNAME);

			if(idTienePermisotiporetencion) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRetencionesPorPagarPorCuentas.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosRetencionesPorPagarPorCuentas.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosRetencionesPorPagarPorCuentas.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentas =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass().toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.retencionesporpagarporcuentas =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentass.toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorCuentas(this.getretencionesporpagarporcuentas(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentas);

				this.tiporetencionBeanSwingJInternalFrame=new TipoRetencionBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tiporetencionBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tiporetencionBeanSwingJInternalFrame.getTipoRetencionLogic().setConnexion(this.retencionesporpagarporcuentasLogic.getConnexion());

				if(this.retencionesporpagarporcuentas.getid_tipo_retencion()!=null) {
					this.tiporetencionBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tiporetencionBeanSwingJInternalFrame.setIdActual(this.retencionesporpagarporcuentas.getid_tipo_retencion());
					this.tiporetencionBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tiporetencionBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tiporetencionBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoRetencion();
				}

				JInternalFrameBase jinternalFrame =this.tiporetencionBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderRetencionesPorPagarPorCuentas=(TitledBorder)this.jScrollPanelDatosRetencionesPorPagarPorCuentas.getBorder();
				TitledBorder titledBordertiporetencion=(TitledBorder)this.tiporetencionBeanSwingJInternalFrame.jScrollPanelDatosTipoRetencion.getBorder();

				titledBordertiporetencion.setTitle(titledBorderRetencionesPorPagarPorCuentas.getTitle() + " -> Tipo Retencion ");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporcuentasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporcuentasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporcuentasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_retencionRetencionesPorPagarPorCuentasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRetencionesPorPagarPorCuentas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorCuentas(this.getretencionesporpagarporcuentas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.retencionesporpagarporcuentas =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass().toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.retencionesporpagarporcuentas =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentass.toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.retencionesporpagarporcuentas==null) {
						this.retencionesporpagarporcuentas = new RetencionesPorPagarPorCuentas();
					}

					this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentas);
				}

				if(this.retencionesporpagarporcuentas.getid_tipo_retencion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_retencion = "+this.retencionesporpagarporcuentas.getid_tipo_retencion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRetencionesPorPagarPorCuentas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtones_debitoRetencionesPorPagarPorCuentasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRetencionesPorPagarPorCuentas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorCuentas(this.getretencionesporpagarporcuentas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.retencionesporpagarporcuentas =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass().toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.retencionesporpagarporcuentas =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentass.toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.retencionesporpagarporcuentas==null) {
						this.retencionesporpagarporcuentas = new RetencionesPorPagarPorCuentas();
					}

					this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentas);
				}

				if(this.retencionesporpagarporcuentas.getes_debito()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where es_debito = "+this.retencionesporpagarporcuentas.getes_debito().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRetencionesPorPagarPorCuentas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emisionRetencionesPorPagarPorCuentasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRetencionesPorPagarPorCuentas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorCuentas(this.getretencionesporpagarporcuentas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.retencionesporpagarporcuentas =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass().toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.retencionesporpagarporcuentas =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentass.toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.retencionesporpagarporcuentas==null) {
						this.retencionesporpagarporcuentas = new RetencionesPorPagarPorCuentas();
					}

					this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentas);
				}

				if(this.retencionesporpagarporcuentas.getfecha_emision()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision = '"+Funciones2.getStringPostgresDate(this.retencionesporpagarporcuentas.getfecha_emision())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRetencionesPorPagarPorCuentas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_tipo_movimientoRetencionesPorPagarPorCuentasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRetencionesPorPagarPorCuentas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorCuentas(this.getretencionesporpagarporcuentas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.retencionesporpagarporcuentas =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass().toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.retencionesporpagarporcuentas =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentass.toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.retencionesporpagarporcuentas==null) {
						this.retencionesporpagarporcuentas = new RetencionesPorPagarPorCuentas();
					}

					this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentas);
				}

				if(this.retencionesporpagarporcuentas.getnombre_tipo_movimiento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_tipo_movimiento like '%"+this.retencionesporpagarporcuentas.getnombre_tipo_movimiento()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRetencionesPorPagarPorCuentas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_mayorRetencionesPorPagarPorCuentasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRetencionesPorPagarPorCuentas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorCuentas(this.getretencionesporpagarporcuentas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.retencionesporpagarporcuentas =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass().toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.retencionesporpagarporcuentas =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentass.toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.retencionesporpagarporcuentas==null) {
						this.retencionesporpagarporcuentas = new RetencionesPorPagarPorCuentas();
					}

					this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentas);
				}

				if(this.retencionesporpagarporcuentas.getnumero_mayor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_mayor like '%"+this.retencionesporpagarporcuentas.getnumero_mayor()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRetencionesPorPagarPorCuentas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_cuenta_contable_retencionRetencionesPorPagarPorCuentasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRetencionesPorPagarPorCuentas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorCuentas(this.getretencionesporpagarporcuentas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.retencionesporpagarporcuentas =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass().toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.retencionesporpagarporcuentas =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentass.toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.retencionesporpagarporcuentas==null) {
						this.retencionesporpagarporcuentas = new RetencionesPorPagarPorCuentas();
					}

					this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentas);
				}

				if(this.retencionesporpagarporcuentas.getnombre_cuenta_contable_retencion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_cuenta_contable_retencion like '%"+this.retencionesporpagarporcuentas.getnombre_cuenta_contable_retencion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRetencionesPorPagarPorCuentas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_pre_impreso_facturaRetencionesPorPagarPorCuentasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRetencionesPorPagarPorCuentas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorCuentas(this.getretencionesporpagarporcuentas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.retencionesporpagarporcuentas =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass().toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.retencionesporpagarporcuentas =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentass.toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.retencionesporpagarporcuentas==null) {
						this.retencionesporpagarporcuentas = new RetencionesPorPagarPorCuentas();
					}

					this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentas);
				}

				if(this.retencionesporpagarporcuentas.getnumero_pre_impreso_factura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_pre_impreso_factura like '%"+this.retencionesporpagarporcuentas.getnumero_pre_impreso_factura()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRetencionesPorPagarPorCuentas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonporcentajeRetencionesPorPagarPorCuentasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRetencionesPorPagarPorCuentas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorCuentas(this.getretencionesporpagarporcuentas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.retencionesporpagarporcuentas =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass().toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.retencionesporpagarporcuentas =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentass.toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.retencionesporpagarporcuentas==null) {
						this.retencionesporpagarporcuentas = new RetencionesPorPagarPorCuentas();
					}

					this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentas);
				}

				if(this.retencionesporpagarporcuentas.getporcentaje()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where porcentaje = "+this.retencionesporpagarporcuentas.getporcentaje().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRetencionesPorPagarPorCuentas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonbase_imponibleRetencionesPorPagarPorCuentasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRetencionesPorPagarPorCuentas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorCuentas(this.getretencionesporpagarporcuentas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.retencionesporpagarporcuentas =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass().toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.retencionesporpagarporcuentas =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentass.toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.retencionesporpagarporcuentas==null) {
						this.retencionesporpagarporcuentas = new RetencionesPorPagarPorCuentas();
					}

					this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentas);
				}

				if(this.retencionesporpagarporcuentas.getbase_imponible()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where base_imponible = "+this.retencionesporpagarporcuentas.getbase_imponible().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRetencionesPorPagarPorCuentas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalorRetencionesPorPagarPorCuentasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRetencionesPorPagarPorCuentas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorCuentas(this.getretencionesporpagarporcuentas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.retencionesporpagarporcuentas =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass().toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.retencionesporpagarporcuentas =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentass.toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.retencionesporpagarporcuentas==null) {
						this.retencionesporpagarporcuentas = new RetencionesPorPagarPorCuentas();
					}

					this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentas);
				}

				if(this.retencionesporpagarporcuentas.getvalor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor = "+this.retencionesporpagarporcuentas.getvalor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRetencionesPorPagarPorCuentas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumeroRetencionesPorPagarPorCuentasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRetencionesPorPagarPorCuentas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorCuentas(this.getretencionesporpagarporcuentas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.retencionesporpagarporcuentas =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass().toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.retencionesporpagarporcuentas =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentass.toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.retencionesporpagarporcuentas==null) {
						this.retencionesporpagarporcuentas = new RetencionesPorPagarPorCuentas();
					}

					this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentas);
				}

				if(this.retencionesporpagarporcuentas.getnumero()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero like '%"+this.retencionesporpagarporcuentas.getnumero()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRetencionesPorPagarPorCuentas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_benefRetencionesPorPagarPorCuentasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRetencionesPorPagarPorCuentas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorCuentas(this.getretencionesporpagarporcuentas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.retencionesporpagarporcuentas =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass().toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.retencionesporpagarporcuentas =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentass.toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.retencionesporpagarporcuentas==null) {
						this.retencionesporpagarporcuentas = new RetencionesPorPagarPorCuentas();
					}

					this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentas);
				}

				if(this.retencionesporpagarporcuentas.getnombre_benef()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_benef like '%"+this.retencionesporpagarporcuentas.getnombre_benef()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRetencionesPorPagarPorCuentas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonruc_benefRetencionesPorPagarPorCuentasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRetencionesPorPagarPorCuentas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorCuentas(this.getretencionesporpagarporcuentas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.retencionesporpagarporcuentas =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass().toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.retencionesporpagarporcuentas =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentass.toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.retencionesporpagarporcuentas==null) {
						this.retencionesporpagarporcuentas = new RetencionesPorPagarPorCuentas();
					}

					this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentas);
				}

				if(this.retencionesporpagarporcuentas.getruc_benef()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where ruc_benef like '%"+this.retencionesporpagarporcuentas.getruc_benef()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRetencionesPorPagarPorCuentas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_cuenta_contableRetencionesPorPagarPorCuentasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRetencionesPorPagarPorCuentas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorCuentas(this.getretencionesporpagarporcuentas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.retencionesporpagarporcuentas =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass().toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.retencionesporpagarporcuentas =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentass.toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.retencionesporpagarporcuentas==null) {
						this.retencionesporpagarporcuentas = new RetencionesPorPagarPorCuentas();
					}

					this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentas);
				}

				if(this.retencionesporpagarporcuentas.getnombre_cuenta_contable()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_cuenta_contable like '%"+this.retencionesporpagarporcuentas.getnombre_cuenta_contable()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRetencionesPorPagarPorCuentas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_cuenta_contable_creditoRetencionesPorPagarPorCuentasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRetencionesPorPagarPorCuentas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorCuentas(this.getretencionesporpagarporcuentas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.retencionesporpagarporcuentas =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass().toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.retencionesporpagarporcuentas =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentass.toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.retencionesporpagarporcuentas==null) {
						this.retencionesporpagarporcuentas = new RetencionesPorPagarPorCuentas();
					}

					this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentas);
				}

				if(this.retencionesporpagarporcuentas.getnombre_cuenta_contable_credito()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_cuenta_contable_credito like '%"+this.retencionesporpagarporcuentas.getnombre_cuenta_contable_credito()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRetencionesPorPagarPorCuentas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtones_debito_datoRetencionesPorPagarPorCuentasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRetencionesPorPagarPorCuentas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorCuentas(this.getretencionesporpagarporcuentas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.retencionesporpagarporcuentas =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass().toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.retencionesporpagarporcuentas =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentass.toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.retencionesporpagarporcuentas==null) {
						this.retencionesporpagarporcuentas = new RetencionesPorPagarPorCuentas();
					}

					this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentas);
				}

				if(this.retencionesporpagarporcuentas.getes_debito_dato()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where es_debito_dato = "+this.retencionesporpagarporcuentas.getes_debito_dato().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRetencionesPorPagarPorCuentas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentasLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporcuentasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingRetencionesPorPagarPorCuentas(false,false);

			this.getRetencionesPorPagarPorCuentassBusquedaRetencionesPorPagarPorCuentas();

			this.inicializarActualizarBindingRetencionesPorPagarPorCuentas(false);

			//if(RetencionesPorPagarPorCuentasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingRetencionesPorPagarPorCuentas(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporcuentasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporcuentasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporcuentasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEjercicioRetencionesPorPagarPorCuentasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporcuentasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingRetencionesPorPagarPorCuentas(false,false);

			this.getRetencionesPorPagarPorCuentassFK_IdEjercicio();

			this.inicializarActualizarBindingRetencionesPorPagarPorCuentas(false);

			//if(RetencionesPorPagarPorCuentasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingRetencionesPorPagarPorCuentas(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporcuentasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporcuentasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporcuentasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaRetencionesPorPagarPorCuentasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporcuentasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingRetencionesPorPagarPorCuentas(false,false);

			this.getRetencionesPorPagarPorCuentassFK_IdEmpresa();

			this.inicializarActualizarBindingRetencionesPorPagarPorCuentas(false);

			//if(RetencionesPorPagarPorCuentasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingRetencionesPorPagarPorCuentas(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporcuentasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporcuentasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporcuentasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPeriodoRetencionesPorPagarPorCuentasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporcuentasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingRetencionesPorPagarPorCuentas(false,false);

			this.getRetencionesPorPagarPorCuentassFK_IdPeriodo();

			this.inicializarActualizarBindingRetencionesPorPagarPorCuentas(false);

			//if(RetencionesPorPagarPorCuentasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingRetencionesPorPagarPorCuentas(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporcuentasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporcuentasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporcuentasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalRetencionesPorPagarPorCuentasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporcuentasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingRetencionesPorPagarPorCuentas(false,false);

			this.getRetencionesPorPagarPorCuentassFK_IdSucursal();

			this.inicializarActualizarBindingRetencionesPorPagarPorCuentas(false);

			//if(RetencionesPorPagarPorCuentasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingRetencionesPorPagarPorCuentas(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporcuentasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporcuentasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporcuentasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoRetencionRetencionesPorPagarPorCuentasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporcuentasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingRetencionesPorPagarPorCuentas(false,false);

			this.getRetencionesPorPagarPorCuentassFK_IdTipoRetencion();

			this.inicializarActualizarBindingRetencionesPorPagarPorCuentas(false);

			//if(RetencionesPorPagarPorCuentasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingRetencionesPorPagarPorCuentas(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporcuentasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporcuentasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionesporpagarporcuentasLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameRetencionesPorPagarPorCuentas() {
		if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) {
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.setVisible(false);	    			
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.dispose();
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoRetencionesPorPagarPorCuentas!=null) {
			this.jInternalFrameReporteDinamicoRetencionesPorPagarPorCuentas.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoRetencionesPorPagarPorCuentas.dispose();
			this.jInternalFrameReporteDinamicoRetencionesPorPagarPorCuentas=null;
		}
		
		if(this.jInternalFrameImportacionRetencionesPorPagarPorCuentas!=null) {
			this.jInternalFrameImportacionRetencionesPorPagarPorCuentas.setVisible(false);	    			
			this.jInternalFrameImportacionRetencionesPorPagarPorCuentas.dispose();
			this.jInternalFrameImportacionRetencionesPorPagarPorCuentas=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessRetencionesPorPagarPorCuentas();
			
			RetencionesPorPagarPorCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.retencionesporpagarporcuentas,new Object(),this.retencionesporpagarporcuentasParameterGeneral,this.retencionesporpagarporcuentasReturnGeneral);
			
			
			if(sTipo.equals("NuevoRetencionesPorPagarPorCuentas")) {
				jButtonNuevoRetencionesPorPagarPorCuentasActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarRetencionesPorPagarPorCuentas")) {
				jButtonDuplicarRetencionesPorPagarPorCuentasActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarRetencionesPorPagarPorCuentas")) {
				jButtonCopiarRetencionesPorPagarPorCuentasActionPerformed(evt);
			} else if(sTipo.equals("VerFormRetencionesPorPagarPorCuentas")) {
				jButtonVerFormRetencionesPorPagarPorCuentasActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarRetencionesPorPagarPorCuentas")) {
				jButtonNuevoRetencionesPorPagarPorCuentasActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarRetencionesPorPagarPorCuentas")) {
				jButtonDuplicarRetencionesPorPagarPorCuentasActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoRetencionesPorPagarPorCuentas")) {
				jButtonNuevoRetencionesPorPagarPorCuentasActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarRetencionesPorPagarPorCuentas")) {
				jButtonDuplicarRetencionesPorPagarPorCuentasActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesRetencionesPorPagarPorCuentas")) {
				jButtonNuevoRetencionesPorPagarPorCuentasActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarRetencionesPorPagarPorCuentas")) {
				jButtonNuevoRetencionesPorPagarPorCuentasActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesRetencionesPorPagarPorCuentas")) {
				jButtonNuevoRetencionesPorPagarPorCuentasActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarRetencionesPorPagarPorCuentas")) {
				jButtonModificarRetencionesPorPagarPorCuentasActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarRetencionesPorPagarPorCuentas")) {
				jButtonModificarRetencionesPorPagarPorCuentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarRetencionesPorPagarPorCuentas")) {
				jButtonModificarRetencionesPorPagarPorCuentasActionPerformed(evt);
			} else if(sTipo.equals("ActualizarRetencionesPorPagarPorCuentas")) {
				jButtonActualizarRetencionesPorPagarPorCuentasActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarRetencionesPorPagarPorCuentas")) {
				jButtonActualizarRetencionesPorPagarPorCuentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarRetencionesPorPagarPorCuentas")) {
				jButtonActualizarRetencionesPorPagarPorCuentasActionPerformed(evt);
			} else if(sTipo.equals("EliminarRetencionesPorPagarPorCuentas")) {
				jButtonEliminarRetencionesPorPagarPorCuentasActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarRetencionesPorPagarPorCuentas")) {
				jButtonEliminarRetencionesPorPagarPorCuentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarRetencionesPorPagarPorCuentas")) {
				jButtonEliminarRetencionesPorPagarPorCuentasActionPerformed(evt);
			} else if(sTipo.equals("CancelarRetencionesPorPagarPorCuentas")) {
				jButtonCancelarRetencionesPorPagarPorCuentasActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarRetencionesPorPagarPorCuentas")) {
				jButtonCancelarRetencionesPorPagarPorCuentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarRetencionesPorPagarPorCuentas")) {
				jButtonCancelarRetencionesPorPagarPorCuentasActionPerformed(evt);
			} else if(sTipo.equals("CerrarRetencionesPorPagarPorCuentas")) {
				jButtonCerrarRetencionesPorPagarPorCuentasActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarRetencionesPorPagarPorCuentas")) {
				jButtonCerrarRetencionesPorPagarPorCuentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarRetencionesPorPagarPorCuentas")) {
				jButtonCerrarRetencionesPorPagarPorCuentasActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarRetencionesPorPagarPorCuentas")) {
				jButtonMostrarOcultarRetencionesPorPagarPorCuentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarRetencionesPorPagarPorCuentas")) {
				jButtonCancelarRetencionesPorPagarPorCuentasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosRetencionesPorPagarPorCuentas")) {
				jButtonGuardarCambiosRetencionesPorPagarPorCuentasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarRetencionesPorPagarPorCuentas")) {
				jButtonGuardarCambiosRetencionesPorPagarPorCuentasActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarRetencionesPorPagarPorCuentas")) {
				jButtonCopiarRetencionesPorPagarPorCuentasActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarRetencionesPorPagarPorCuentas")) {
				jButtonVerFormRetencionesPorPagarPorCuentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosRetencionesPorPagarPorCuentas")) {
				jButtonGuardarCambiosRetencionesPorPagarPorCuentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarRetencionesPorPagarPorCuentas")) {
				jButtonCopiarRetencionesPorPagarPorCuentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormRetencionesPorPagarPorCuentas")) {
				jButtonVerFormRetencionesPorPagarPorCuentasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaRetencionesPorPagarPorCuentas")) {
				jButtonGuardarCambiosRetencionesPorPagarPorCuentasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarRetencionesPorPagarPorCuentas")) {
				jButtonGuardarCambiosRetencionesPorPagarPorCuentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaRetencionesPorPagarPorCuentas")) {
				jButtonGuardarCambiosRetencionesPorPagarPorCuentasActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionRetencionesPorPagarPorCuentas")) {
				jButtonRecargarInformacionRetencionesPorPagarPorCuentasActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarRetencionesPorPagarPorCuentas")) {
				jButtonRecargarInformacionRetencionesPorPagarPorCuentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionRetencionesPorPagarPorCuentas")) {
				jButtonRecargarInformacionRetencionesPorPagarPorCuentasActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresRetencionesPorPagarPorCuentas")) {
				jButtonAnterioresRetencionesPorPagarPorCuentasActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarRetencionesPorPagarPorCuentas")) {
				jButtonAnterioresRetencionesPorPagarPorCuentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreRetencionesPorPagarPorCuentas")) {
				jButtonAnterioresRetencionesPorPagarPorCuentasActionPerformed(evt);
			} else if(sTipo.equals("SiguientesRetencionesPorPagarPorCuentas")) {
				jButtonSiguientesRetencionesPorPagarPorCuentasActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarRetencionesPorPagarPorCuentas")) {
				jButtonSiguientesRetencionesPorPagarPorCuentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesRetencionesPorPagarPorCuentas")) {
				jButtonSiguientesRetencionesPorPagarPorCuentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByRetencionesPorPagarPorCuentas") || sTipo.equals("MenuItemDetalleAbrirOrderByRetencionesPorPagarPorCuentas")) {
				jButtonAbrirOrderByRetencionesPorPagarPorCuentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarRetencionesPorPagarPorCuentas") || sTipo.equals("MenuItemDetalleMostrarOcultarRetencionesPorPagarPorCuentas")) {
				jButtonMostrarOcultarRetencionesPorPagarPorCuentasActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosRetencionesPorPagarPorCuentas")) {
				jButtonNuevoGuardarCambiosRetencionesPorPagarPorCuentasActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarRetencionesPorPagarPorCuentas")) {
				jButtonNuevoGuardarCambiosRetencionesPorPagarPorCuentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosRetencionesPorPagarPorCuentas")) {
				jButtonNuevoGuardarCambiosRetencionesPorPagarPorCuentasActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoRetencionesPorPagarPorCuentas")) {
				jButtonCerrarReporteDinamicoRetencionesPorPagarPorCuentasActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoRetencionesPorPagarPorCuentas")) {
				jButtonGenerarReporteDinamicoRetencionesPorPagarPorCuentasActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoRetencionesPorPagarPorCuentas")) {
				
				jButtonGenerarExcelReporteDinamicoRetencionesPorPagarPorCuentasActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionRetencionesPorPagarPorCuentas")) {
				jButtonCerrarImportacionRetencionesPorPagarPorCuentasActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionRetencionesPorPagarPorCuentas")) {
				
				jButtonGenerarImportacionRetencionesPorPagarPorCuentasActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionRetencionesPorPagarPorCuentas")) {
				
				jButtonAbrirImportacionRetencionesPorPagarPorCuentasActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesRetencionesPorPagarPorCuentas")) {
				jComboBoxTiposAccionesRetencionesPorPagarPorCuentasActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesRetencionesPorPagarPorCuentas")) {
				jComboBoxTiposRelacionesRetencionesPorPagarPorCuentasActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioRetencionesPorPagarPorCuentas")) {
				jComboBoxTiposAccionesRetencionesPorPagarPorCuentasActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarRetencionesPorPagarPorCuentas")) {
				
				jComboBoxTiposSeleccionarRetencionesPorPagarPorCuentasActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralRetencionesPorPagarPorCuentas")) {
				jTextFieldValorCampoGeneralRetencionesPorPagarPorCuentasActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByRetencionesPorPagarPorCuentas")) {
				jButtonAbrirOrderByRetencionesPorPagarPorCuentasActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarRetencionesPorPagarPorCuentas")) {
				jButtonAbrirOrderByRetencionesPorPagarPorCuentasActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByRetencionesPorPagarPorCuentas")) {
				jButtonCerrarOrderByRetencionesPorPagarPorCuentasActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idRetencionesPorPagarPorCuentasBusqueda")) {
				this.jButtonidRetencionesPorPagarPorCuentasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaRetencionesPorPagarPorCuentasUpdate")) {
				this.jButtonid_empresaRetencionesPorPagarPorCuentasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaRetencionesPorPagarPorCuentasBusqueda")) {
				this.jButtonid_empresaRetencionesPorPagarPorCuentasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalRetencionesPorPagarPorCuentasUpdate")) {
				this.jButtonid_sucursalRetencionesPorPagarPorCuentasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalRetencionesPorPagarPorCuentasBusqueda")) {
				this.jButtonid_sucursalRetencionesPorPagarPorCuentasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioRetencionesPorPagarPorCuentasUpdate")) {
				this.jButtonid_ejercicioRetencionesPorPagarPorCuentasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioRetencionesPorPagarPorCuentasBusqueda")) {
				this.jButtonid_ejercicioRetencionesPorPagarPorCuentasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoRetencionesPorPagarPorCuentasUpdate")) {
				this.jButtonid_periodoRetencionesPorPagarPorCuentasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoRetencionesPorPagarPorCuentasBusqueda")) {
				this.jButtonid_periodoRetencionesPorPagarPorCuentasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_retencionRetencionesPorPagarPorCuentasUpdate")) {
				this.jButtonid_tipo_retencionRetencionesPorPagarPorCuentasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_retencionRetencionesPorPagarPorCuentasBusqueda")) {
				this.jButtonid_tipo_retencionRetencionesPorPagarPorCuentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_debitoRetencionesPorPagarPorCuentasBusqueda")) {
				this.jButtones_debitoRetencionesPorPagarPorCuentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionRetencionesPorPagarPorCuentasBusqueda")) {
				this.jButtonfecha_emisionRetencionesPorPagarPorCuentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_tipo_movimientoRetencionesPorPagarPorCuentasBusqueda")) {
				this.jButtonnombre_tipo_movimientoRetencionesPorPagarPorCuentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_mayorRetencionesPorPagarPorCuentasBusqueda")) {
				this.jButtonnumero_mayorRetencionesPorPagarPorCuentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_cuenta_contable_retencionRetencionesPorPagarPorCuentasBusqueda")) {
				this.jButtonnombre_cuenta_contable_retencionRetencionesPorPagarPorCuentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_pre_impreso_facturaRetencionesPorPagarPorCuentasBusqueda")) {
				this.jButtonnumero_pre_impreso_facturaRetencionesPorPagarPorCuentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeRetencionesPorPagarPorCuentasBusqueda")) {
				this.jButtonporcentajeRetencionesPorPagarPorCuentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("base_imponibleRetencionesPorPagarPorCuentasBusqueda")) {
				this.jButtonbase_imponibleRetencionesPorPagarPorCuentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorRetencionesPorPagarPorCuentasBusqueda")) {
				this.jButtonvalorRetencionesPorPagarPorCuentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numeroRetencionesPorPagarPorCuentasBusqueda")) {
				this.jButtonnumeroRetencionesPorPagarPorCuentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_benefRetencionesPorPagarPorCuentasBusqueda")) {
				this.jButtonnombre_benefRetencionesPorPagarPorCuentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ruc_benefRetencionesPorPagarPorCuentasBusqueda")) {
				this.jButtonruc_benefRetencionesPorPagarPorCuentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_cuenta_contableRetencionesPorPagarPorCuentasBusqueda")) {
				this.jButtonnombre_cuenta_contableRetencionesPorPagarPorCuentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_cuenta_contable_creditoRetencionesPorPagarPorCuentasBusqueda")) {
				this.jButtonnombre_cuenta_contable_creditoRetencionesPorPagarPorCuentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_debito_datoRetencionesPorPagarPorCuentasBusqueda")) {
				this.jButtones_debito_datoRetencionesPorPagarPorCuentasBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas")) {
				this.jButtonBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentasActionPerformed(evt);
			}
			
			;
			
			
			RetencionesPorPagarPorCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.retencionesporpagarporcuentas,new Object(),this.retencionesporpagarporcuentasParameterGeneral,this.retencionesporpagarporcuentasReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessRetencionesPorPagarPorCuentas();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRetencionesPorPagarPorCuentasActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.retencionesporpagarporcuentas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.retencionesporpagarporcuentas);
				
				RetencionesPorPagarPorCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.retencionesporpagarporcuentas,new Object(),this.retencionesporpagarporcuentasParameterGeneral,this.retencionesporpagarporcuentasReturnGeneral);
				
				


				
				RetencionesPorPagarPorCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.retencionesporpagarporcuentas,new Object(),this.retencionesporpagarporcuentasParameterGeneral,this.retencionesporpagarporcuentasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RetencionesPorPagarPorCuentas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RetencionesPorPagarPorCuentas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			RetencionesPorPagarPorCuentas retencionesporpagarporcuentasLocal=null;
			
			if(!this.getEsControlTabla()) {
				retencionesporpagarporcuentasLocal=this.retencionesporpagarporcuentas;
			} else {
				retencionesporpagarporcuentasLocal=this.retencionesporpagarporcuentasAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.retencionesporpagarporcuentas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.retencionesporpagarporcuentas);
				
				RetencionesPorPagarPorCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.retencionesporpagarporcuentas,new Object(),this.retencionesporpagarporcuentasParameterGeneral,this.retencionesporpagarporcuentasReturnGeneral);
							
				
				


				
				RetencionesPorPagarPorCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.retencionesporpagarporcuentas,new Object(),this.retencionesporpagarporcuentasParameterGeneral,this.retencionesporpagarporcuentasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RetencionesPorPagarPorCuentas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RetencionesPorPagarPorCuentas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRetencionesPorPagarPorCuentasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRetencionesPorPagarPorCuentas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentasAnterior =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass().toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.retencionesporpagarporcuentasAnterior =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentass.toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
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
			
			RetencionesPorPagarPorCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.retencionesporpagarporcuentas,new Object(),this.retencionesporpagarporcuentasParameterGeneral,this.retencionesporpagarporcuentasReturnGeneral);
			
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
			
			


			
			RetencionesPorPagarPorCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.retencionesporpagarporcuentas,new Object(),this.retencionesporpagarporcuentasParameterGeneral,this.retencionesporpagarporcuentasReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRetencionesPorPagarPorCuentasActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.retencionesporpagarporcuentas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.retencionesporpagarporcuentas);
				
				RetencionesPorPagarPorCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.retencionesporpagarporcuentas,new Object(),this.retencionesporpagarporcuentasParameterGeneral,this.retencionesporpagarporcuentasReturnGeneral);
								
						
				


				
				RetencionesPorPagarPorCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.retencionesporpagarporcuentas,new Object(),this.retencionesporpagarporcuentasParameterGeneral,this.retencionesporpagarporcuentasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RetencionesPorPagarPorCuentas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RetencionesPorPagarPorCuentas.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.retencionesporpagarporcuentas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.retencionesporpagarporcuentas);
				
				RetencionesPorPagarPorCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.retencionesporpagarporcuentas,new Object(),this.retencionesporpagarporcuentasParameterGeneral,this.retencionesporpagarporcuentasReturnGeneral);
								
				
				


				
				RetencionesPorPagarPorCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.retencionesporpagarporcuentas,new Object(),this.retencionesporpagarporcuentasParameterGeneral,this.retencionesporpagarporcuentasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RetencionesPorPagarPorCuentas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RetencionesPorPagarPorCuentas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRetencionesPorPagarPorCuentasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRetencionesPorPagarPorCuentas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentasAnterior =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass().toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.retencionesporpagarporcuentasAnterior =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentass.toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.retencionesporpagarporcuentas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.retencionesporpagarporcuentas);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRetencionesPorPagarPorCuentasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRetencionesPorPagarPorCuentas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentasAnterior =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass().toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.retencionesporpagarporcuentasAnterior =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentass.toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRetencionesPorPagarPorCuentasActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.retencionesporpagarporcuentas);
			
			this.actualizarInformacion("INFO_PADRE",false,this.retencionesporpagarporcuentas);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.retencionesporpagarporcuentas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.retencionesporpagarporcuentas);
				
				RetencionesPorPagarPorCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.retencionesporpagarporcuentas,new Object(),this.retencionesporpagarporcuentasParameterGeneral,this.retencionesporpagarporcuentasReturnGeneral);
							
				
				


				
				RetencionesPorPagarPorCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.retencionesporpagarporcuentas,new Object(),this.retencionesporpagarporcuentasParameterGeneral,this.retencionesporpagarporcuentasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RetencionesPorPagarPorCuentas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RetencionesPorPagarPorCuentas.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRetencionesPorPagarPorCuentasActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosRetencionesPorPagarPorCuentas.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.retencionesporpagarporcuentasAnterior =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass().toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.retencionesporpagarporcuentasAnterior =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentass.toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
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
			
			RetencionesPorPagarPorCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.retencionesporpagarporcuentas,new Object(),this.retencionesporpagarporcuentasParameterGeneral,this.retencionesporpagarporcuentasReturnGeneral);
			
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
			
			


			
			RetencionesPorPagarPorCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.retencionesporpagarporcuentas,new Object(),this.retencionesporpagarporcuentasParameterGeneral,this.retencionesporpagarporcuentasReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRetencionesPorPagarPorCuentasActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.retencionesporpagarporcuentas);
			
			this.actualizarInformacion("INFO_PADRE",false,this.retencionesporpagarporcuentas);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.retencionesporpagarporcuentas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.retencionesporpagarporcuentas);
				
				RetencionesPorPagarPorCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.retencionesporpagarporcuentas,new Object(),this.retencionesporpagarporcuentasParameterGeneral,this.retencionesporpagarporcuentasReturnGeneral);
								
				
				


				
				RetencionesPorPagarPorCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.retencionesporpagarporcuentas,new Object(),this.retencionesporpagarporcuentasParameterGeneral,this.retencionesporpagarporcuentasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RetencionesPorPagarPorCuentas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RetencionesPorPagarPorCuentas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRetencionesPorPagarPorCuentasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRetencionesPorPagarPorCuentas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentasAnterior =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass().toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.retencionesporpagarporcuentasAnterior =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentass.toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRetencionesPorPagarPorCuentasActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.retencionesporpagarporcuentas);
			
			this.actualizarInformacion("INFO_PADRE",false,this.retencionesporpagarporcuentas);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRetencionesPorPagarPorCuentasActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.retencionesporpagarporcuentas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.retencionesporpagarporcuentas);
				
				RetencionesPorPagarPorCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.retencionesporpagarporcuentas,new Object(),this.retencionesporpagarporcuentasParameterGeneral,this.retencionesporpagarporcuentasReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosRetencionesPorPagarPorCuentas")) {
					jCheckBoxSeleccionarTodosRetencionesPorPagarPorCuentasItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosRetencionesPorPagarPorCuentas")) {
					jCheckBoxSeleccionadosRetencionesPorPagarPorCuentasItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarRetencionesPorPagarPorCuentas")) {
					
				}
				
				


				
				
				RetencionesPorPagarPorCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.retencionesporpagarporcuentas,new Object(),this.retencionesporpagarporcuentasParameterGeneral,this.retencionesporpagarporcuentasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RetencionesPorPagarPorCuentas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RetencionesPorPagarPorCuentas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.retencionesporpagarporcuentas);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.retencionesporpagarporcuentas);
				
				RetencionesPorPagarPorCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.retencionesporpagarporcuentas,new Object(),this.retencionesporpagarporcuentasParameterGeneral,this.retencionesporpagarporcuentasReturnGeneral);
												
				
				


				
				
				RetencionesPorPagarPorCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.retencionesporpagarporcuentas,new Object(),this.retencionesporpagarporcuentasParameterGeneral,this.retencionesporpagarporcuentasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RetencionesPorPagarPorCuentas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RetencionesPorPagarPorCuentas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRetencionesPorPagarPorCuentasActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosRetencionesPorPagarPorCuentas.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.retencionesporpagarporcuentasAnterior =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass().toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.retencionesporpagarporcuentasAnterior =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentass.toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRetencionesPorPagarPorCuentasActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.retencionesporpagarporcuentas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.retencionesporpagarporcuentas);
				
				RetencionesPorPagarPorCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.retencionesporpagarporcuentas,new Object(),this.retencionesporpagarporcuentasParameterGeneral,this.retencionesporpagarporcuentasReturnGeneral);
				
				
				RetencionesPorPagarPorCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.retencionesporpagarporcuentas,new Object(),this.retencionesporpagarporcuentasParameterGeneral,this.retencionesporpagarporcuentasReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
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
			
			RetencionesPorPagarPorCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.retencionesporpagarporcuentas,new Object(),this.retencionesporpagarporcuentasParameterGeneral,this.retencionesporpagarporcuentasReturnGeneral);
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
			
			


			
			RetencionesPorPagarPorCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.retencionesporpagarporcuentas,new Object(),this.retencionesporpagarporcuentasParameterGeneral,this.retencionesporpagarporcuentasReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRetencionesPorPagarPorCuentasActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.retencionesporpagarporcuentas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.retencionesporpagarporcuentas);
				
				RetencionesPorPagarPorCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.retencionesporpagarporcuentas,new Object(),this.retencionesporpagarporcuentasParameterGeneral,this.retencionesporpagarporcuentasReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				RetencionesPorPagarPorCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.retencionesporpagarporcuentas,new Object(),this.retencionesporpagarporcuentasParameterGeneral,this.retencionesporpagarporcuentasReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RetencionesPorPagarPorCuentas.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RetencionesPorPagarPorCuentas.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.retencionesporpagarporcuentas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.retencionesporpagarporcuentas);
				
				RetencionesPorPagarPorCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.retencionesporpagarporcuentas,new Object(),this.retencionesporpagarporcuentasParameterGeneral,this.retencionesporpagarporcuentasReturnGeneral);
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
				
				


				
				RetencionesPorPagarPorCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.retencionesporpagarporcuentas,new Object(),this.retencionesporpagarporcuentasParameterGeneral,this.retencionesporpagarporcuentasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RetencionesPorPagarPorCuentas.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RetencionesPorPagarPorCuentas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRetencionesPorPagarPorCuentasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRetencionesPorPagarPorCuentas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionesporpagarporcuentasAnterior =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass().toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.retencionesporpagarporcuentasAnterior =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentass.toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				RetencionesPorPagarPorCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.retencionesporpagarporcuentas,new Object(),this.retencionesporpagarporcuentasParameterGeneral,this.retencionesporpagarporcuentasReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarRetencionesPorPagarPorCuentas")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosRetencionesPorPagarPorCuentasListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosRetencionesPorPagarPorCuentas.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.retencionesporpagarporcuentas =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass().toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.retencionesporpagarporcuentas =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentass.toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.retencionesporpagarporcuentas);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarRetencionesPorPagarPorCuentas")) {
				
				}
				
				RetencionesPorPagarPorCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.retencionesporpagarporcuentas,new Object(),this.retencionesporpagarporcuentasParameterGeneral,this.retencionesporpagarporcuentasReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			RetencionesPorPagarPorCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.retencionesporpagarporcuentas,new Object(),this.retencionesporpagarporcuentasParameterGeneral,this.retencionesporpagarporcuentasReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarRetencionesPorPagarPorCuentas")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosRetencionesPorPagarPorCuentas.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarRetencionesPorPagarPorCuentas")) {
			
			}
			
			RetencionesPorPagarPorCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.retencionesporpagarporcuentas,new Object(),this.retencionesporpagarporcuentasParameterGeneral,this.retencionesporpagarporcuentasReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessRetencionesPorPagarPorCuentas();
			
			RetencionesPorPagarPorCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.retencionesporpagarporcuentas,new Object(),this.retencionesporpagarporcuentasParameterGeneral,this.retencionesporpagarporcuentasReturnGeneral);
			
			if(sTipo.equals("NuevoRetencionesPorPagarPorCuentas")) {
				jButtonNuevoRetencionesPorPagarPorCuentasActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarRetencionesPorPagarPorCuentas")) {
				jButtonDuplicarRetencionesPorPagarPorCuentasActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarRetencionesPorPagarPorCuentas")) {
				jButtonCopiarRetencionesPorPagarPorCuentasActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormRetencionesPorPagarPorCuentas")) {
				jButtonVerFormRetencionesPorPagarPorCuentasActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesRetencionesPorPagarPorCuentas")) {
				jButtonNuevoRetencionesPorPagarPorCuentasActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarRetencionesPorPagarPorCuentas")) {
				jButtonModificarRetencionesPorPagarPorCuentasActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarRetencionesPorPagarPorCuentas")) {
				jButtonActualizarRetencionesPorPagarPorCuentasActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarRetencionesPorPagarPorCuentas")) {
				jButtonEliminarRetencionesPorPagarPorCuentasActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaRetencionesPorPagarPorCuentas")) {
				jButtonGuardarCambiosRetencionesPorPagarPorCuentasActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarRetencionesPorPagarPorCuentas")) {
				jButtonCancelarRetencionesPorPagarPorCuentasActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarRetencionesPorPagarPorCuentas")) {
				jButtonCerrarRetencionesPorPagarPorCuentasActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosRetencionesPorPagarPorCuentas")) {
				jButtonGuardarCambiosRetencionesPorPagarPorCuentasActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosRetencionesPorPagarPorCuentas")) {
				jButtonNuevoGuardarCambiosRetencionesPorPagarPorCuentasActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByRetencionesPorPagarPorCuentas")) {
				jButtonAbrirOrderByRetencionesPorPagarPorCuentasActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionRetencionesPorPagarPorCuentas")) {
				jButtonRecargarInformacionRetencionesPorPagarPorCuentasActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresRetencionesPorPagarPorCuentas")) {
				jButtonAnterioresRetencionesPorPagarPorCuentasActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesRetencionesPorPagarPorCuentas")) {
				jButtonSiguientesRetencionesPorPagarPorCuentasActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idRetencionesPorPagarPorCuentasBusqueda")) {
				this.jButtonidRetencionesPorPagarPorCuentasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaRetencionesPorPagarPorCuentasUpdate")) {
				this.jButtonid_empresaRetencionesPorPagarPorCuentasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaRetencionesPorPagarPorCuentasBusqueda")) {
				this.jButtonid_empresaRetencionesPorPagarPorCuentasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalRetencionesPorPagarPorCuentasUpdate")) {
				this.jButtonid_sucursalRetencionesPorPagarPorCuentasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalRetencionesPorPagarPorCuentasBusqueda")) {
				this.jButtonid_sucursalRetencionesPorPagarPorCuentasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioRetencionesPorPagarPorCuentasUpdate")) {
				this.jButtonid_ejercicioRetencionesPorPagarPorCuentasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioRetencionesPorPagarPorCuentasBusqueda")) {
				this.jButtonid_ejercicioRetencionesPorPagarPorCuentasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoRetencionesPorPagarPorCuentasUpdate")) {
				this.jButtonid_periodoRetencionesPorPagarPorCuentasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoRetencionesPorPagarPorCuentasBusqueda")) {
				this.jButtonid_periodoRetencionesPorPagarPorCuentasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_retencionRetencionesPorPagarPorCuentasUpdate")) {
				this.jButtonid_tipo_retencionRetencionesPorPagarPorCuentasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_retencionRetencionesPorPagarPorCuentasBusqueda")) {
				this.jButtonid_tipo_retencionRetencionesPorPagarPorCuentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_debitoRetencionesPorPagarPorCuentasBusqueda")) {
				this.jButtones_debitoRetencionesPorPagarPorCuentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionRetencionesPorPagarPorCuentasBusqueda")) {
				this.jButtonfecha_emisionRetencionesPorPagarPorCuentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_tipo_movimientoRetencionesPorPagarPorCuentasBusqueda")) {
				this.jButtonnombre_tipo_movimientoRetencionesPorPagarPorCuentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_mayorRetencionesPorPagarPorCuentasBusqueda")) {
				this.jButtonnumero_mayorRetencionesPorPagarPorCuentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_cuenta_contable_retencionRetencionesPorPagarPorCuentasBusqueda")) {
				this.jButtonnombre_cuenta_contable_retencionRetencionesPorPagarPorCuentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_pre_impreso_facturaRetencionesPorPagarPorCuentasBusqueda")) {
				this.jButtonnumero_pre_impreso_facturaRetencionesPorPagarPorCuentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeRetencionesPorPagarPorCuentasBusqueda")) {
				this.jButtonporcentajeRetencionesPorPagarPorCuentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("base_imponibleRetencionesPorPagarPorCuentasBusqueda")) {
				this.jButtonbase_imponibleRetencionesPorPagarPorCuentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorRetencionesPorPagarPorCuentasBusqueda")) {
				this.jButtonvalorRetencionesPorPagarPorCuentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numeroRetencionesPorPagarPorCuentasBusqueda")) {
				this.jButtonnumeroRetencionesPorPagarPorCuentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_benefRetencionesPorPagarPorCuentasBusqueda")) {
				this.jButtonnombre_benefRetencionesPorPagarPorCuentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ruc_benefRetencionesPorPagarPorCuentasBusqueda")) {
				this.jButtonruc_benefRetencionesPorPagarPorCuentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_cuenta_contableRetencionesPorPagarPorCuentasBusqueda")) {
				this.jButtonnombre_cuenta_contableRetencionesPorPagarPorCuentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_cuenta_contable_creditoRetencionesPorPagarPorCuentasBusqueda")) {
				this.jButtonnombre_cuenta_contable_creditoRetencionesPorPagarPorCuentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_debito_datoRetencionesPorPagarPorCuentasBusqueda")) {
				this.jButtones_debito_datoRetencionesPorPagarPorCuentasBusquedaActionPerformed(evt);
			}
			
			RetencionesPorPagarPorCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.retencionesporpagarporcuentas,new Object(),this.retencionesporpagarporcuentasParameterGeneral,this.retencionesporpagarporcuentasReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessRetencionesPorPagarPorCuentas();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			RetencionesPorPagarPorCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.retencionesporpagarporcuentas,new Object(),this.retencionesporpagarporcuentasParameterGeneral,this.retencionesporpagarporcuentasReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameRetencionesPorPagarPorCuentas")) {
				closingInternalFrameRetencionesPorPagarPorCuentas();
				
			} else if(sTipo.equals("jButtonCancelarRetencionesPorPagarPorCuentas")) {
				JInternalFrameBase jInternalFrameDetalleFormRetencionesPorPagarPorCuentas = (JInternalFrameBase)evt.getSource();
	            	
	            RetencionesPorPagarPorCuentasBeanSwingJInternalFrame jInternalFrameParent=(RetencionesPorPagarPorCuentasBeanSwingJInternalFrame)jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarRetencionesPorPagarPorCuentasActionPerformed(null);
			}
			
			RetencionesPorPagarPorCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.retencionesporpagarporcuentas,new Object(),this.retencionesporpagarporcuentasParameterGeneral,this.retencionesporpagarporcuentasReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormRetencionesPorPagarPorCuentas(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormRetencionesPorPagarPorCuentas(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormRetencionesPorPagarPorCuentas(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.retencionesporpagarporcuentas)) {
			if(!esControlTabla) {
				if(RetencionesPorPagarPorCuentasJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentas,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentas);			
				}
				
				if(this.retencionesporpagarporcuentasSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentas,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentasReturnGeneral,this.retencionesporpagarporcuentasBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.retencionesporpagarporcuentasSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanRetencionesPorPagarPorCuentas(classes,this.retencionesporpagarporcuentasReturnGeneral,this.retencionesporpagarporcuentasBean,false);
					}
						
					if(this.retencionesporpagarporcuentasReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentasReturnGeneral.getRetencionesPorPagarPorCuentas());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentasReturnGeneral.getRetencionesPorPagarPorCuentas());	
					}
						
					if(this.retencionesporpagarporcuentasReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentasReturnGeneral.getRetencionesPorPagarPorCuentas(),classes);//this.retencionesporpagarporcuentasBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentas,classes);//this.retencionesporpagarporcuentasBean);									
				}
			
				if(RetencionesPorPagarPorCuentasJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentas,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionesPorPagarPorCuentas(this.retencionesporpagarporcuentas);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.retencionesporpagarporcuentasAnterior!=null) {
						this.retencionesporpagarporcuentas=this.retencionesporpagarporcuentasAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.retencionesporpagarporcuentasSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.retencionesporpagarporcuentasReturnGeneral.getRetencionesPorPagarPorCuentas(),retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.retencionesporpagarporcuentasReturnGeneral.getRetencionesPorPagarPorCuentas(),this.retencionesporpagarporcuentass);
				}
				//ARCHITECTURE
				
				//this.jTableDatosRetencionesPorPagarPorCuentas.repaint();
				
				//((AbstractTableModel) this.jTableDatosRetencionesPorPagarPorCuentas.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosRetencionesPorPagarPorCuentas();
			}
		}
	}
	
	public void actualizarVisualTableDatosRetencionesPorPagarPorCuentas() throws Exception {
		
		RetencionesPorPagarPorCuentasModel retencionesporpagarporcuentasModel=(RetencionesPorPagarPorCuentasModel)this.jTableDatosRetencionesPorPagarPorCuentas.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			retencionesporpagarporcuentasModel.retencionesporpagarporcuentass=this.retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			retencionesporpagarporcuentasModel.retencionesporpagarporcuentass=this.retencionesporpagarporcuentass;
		}
		
		
		((RetencionesPorPagarPorCuentasModel) this.jTableDatosRetencionesPorPagarPorCuentas.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaRetencionesPorPagarPorCuentas() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getretencionesporpagarporcuentasAnterior(),this.retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getretencionesporpagarporcuentasAnterior(),this.retencionesporpagarporcuentass);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosRetencionesPorPagarPorCuentas();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioRetencionesPorPagarPorCuentas(RetencionesPorPagarPorCuentas retencionesporpagarporcuentas,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
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
										
				RetencionesPorPagarPorCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.retencionesporpagarporcuentas,new Object(),generalEntityParameterGeneral,this.retencionesporpagarporcuentasReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.retencionesporpagarporcuentasSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=RetencionesPorPagarPorCuentasConstantesFunciones.getClassesRelationshipsOfRetencionesPorPagarPorCuentas(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=RetencionesPorPagarPorCuentasConstantesFunciones.getClassesRelationshipsFromStringsOfRetencionesPorPagarPorCuentas(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormRetencionesPorPagarPorCuentas(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				RetencionesPorPagarPorCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.retencionesporpagarporcuentas,new Object(),generalEntityParameterGeneral,this.retencionesporpagarporcuentasReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioRetencionesPorPagarPorCuentas(RetencionesPorPagarPorCuentasBean retencionesporpagarporcuentasBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanRetencionesPorPagarPorCuentas(ArrayList<Classe> classes,RetencionesPorPagarPorCuentasReturnGeneral retencionesporpagarporcuentasReturnGeneral,RetencionesPorPagarPorCuentasBean retencionesporpagarporcuentasBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualRetencionesPorPagarPorCuentas(RetencionesPorPagarPorCuentas retencionesporpagarporcuentas,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.retencionesporpagarporcuentas)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas = new RetencionesPorPagarPorCuentasDetalleFormJInternalFrame(jDesktopPane,this.retencionesporpagarporcuentasSessionBean.getConGuardarRelaciones(),this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.setVisible(false);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.setSelected(false);						
		
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.retencionesporpagarporcuentasLogic=this.retencionesporpagarporcuentasLogic;
		
		this.cargarCombosFrameForeignKeyRetencionesPorPagarPorCuentas("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleRetencionesPorPagarPorCuentas();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleRetencionesPorPagarPorCuentas();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyRetencionesPorPagarPorCuentas("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyRetencionesPorPagarPorCuentas();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarRetencionesPorPagarPorCuentas"));
		
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonModificarRetencionesPorPagarPorCuentas.addActionListener(new ButtonActionListener(this,"ModificarRetencionesPorPagarPorCuentas"));

		
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonModificarToolBarRetencionesPorPagarPorCuentas.addActionListener(new ButtonActionListener(this,"ModificarToolBarRetencionesPorPagarPorCuentas"));
					
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jMenuItemModificarRetencionesPorPagarPorCuentas.addActionListener(new ButtonActionListener(this,"MenuItemModificarRetencionesPorPagarPorCuentas"));		
		
		
		
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonActualizarRetencionesPorPagarPorCuentas.addActionListener (new ButtonActionListener(this,"ActualizarRetencionesPorPagarPorCuentas"));
		
		
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonActualizarToolBarRetencionesPorPagarPorCuentas.addActionListener(new ButtonActionListener(this,"ActualizarToolBarRetencionesPorPagarPorCuentas"));
						
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jMenuItemActualizarRetencionesPorPagarPorCuentas.addActionListener (new ButtonActionListener(this,"MenuItemActualizarRetencionesPorPagarPorCuentas"));		
		
		
		
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonEliminarRetencionesPorPagarPorCuentas.addActionListener (new ButtonActionListener(this,"EliminarRetencionesPorPagarPorCuentas"));
		
		
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonEliminarToolBarRetencionesPorPagarPorCuentas.addActionListener (new ButtonActionListener(this,"EliminarToolBarRetencionesPorPagarPorCuentas"));
								
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jMenuItemEliminarRetencionesPorPagarPorCuentas.addActionListener (new ButtonActionListener(this,"MenuItemEliminarRetencionesPorPagarPorCuentas"));		
		
		
		
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonCancelarRetencionesPorPagarPorCuentas.addActionListener (new ButtonActionListener(this,"CancelarRetencionesPorPagarPorCuentas"));
		
		
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonCancelarToolBarRetencionesPorPagarPorCuentas.addActionListener (new ButtonActionListener(this,"CancelarToolBarRetencionesPorPagarPorCuentas"));
					
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jMenuItemCancelarRetencionesPorPagarPorCuentas.addActionListener (new ButtonActionListener(this,"MenuItemCancelarRetencionesPorPagarPorCuentas"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jMenuItemDetalleCerrarRetencionesPorPagarPorCuentas.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarRetencionesPorPagarPorCuentas"));		
		
		
		
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonGuardarCambiosToolBarRetencionesPorPagarPorCuentas.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarRetencionesPorPagarPorCuentas"));
		
		
		
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonGuardarCambiosToolBarRetencionesPorPagarPorCuentas.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarRetencionesPorPagarPorCuentas"));
		
		
		
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxTiposAccionesFormularioRetencionesPorPagarPorCuentas.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioRetencionesPorPagarPorCuentas"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonidRetencionesPorPagarPorCuentasBusqueda.addActionListener(new ButtonActionListener(this,"idRetencionesPorPagarPorCuentasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonid_empresaRetencionesPorPagarPorCuentasUpdate.addActionListener(new ButtonActionListener(this,"id_empresaRetencionesPorPagarPorCuentasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonid_empresaRetencionesPorPagarPorCuentasBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaRetencionesPorPagarPorCuentasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonid_sucursalRetencionesPorPagarPorCuentasUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalRetencionesPorPagarPorCuentasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonid_sucursalRetencionesPorPagarPorCuentasBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalRetencionesPorPagarPorCuentasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonid_ejercicioRetencionesPorPagarPorCuentasUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioRetencionesPorPagarPorCuentasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonid_ejercicioRetencionesPorPagarPorCuentasBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioRetencionesPorPagarPorCuentasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonid_periodoRetencionesPorPagarPorCuentasUpdate.addActionListener(new ButtonActionListener(this,"id_periodoRetencionesPorPagarPorCuentasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonid_periodoRetencionesPorPagarPorCuentasBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoRetencionesPorPagarPorCuentasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonid_tipo_retencionRetencionesPorPagarPorCuentasUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_retencionRetencionesPorPagarPorCuentasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonid_tipo_retencionRetencionesPorPagarPorCuentasBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_retencionRetencionesPorPagarPorCuentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtones_debitoRetencionesPorPagarPorCuentasBusqueda.addActionListener(new ButtonActionListener(this,"es_debitoRetencionesPorPagarPorCuentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonfecha_emisionRetencionesPorPagarPorCuentasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionRetencionesPorPagarPorCuentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonnombre_tipo_movimientoRetencionesPorPagarPorCuentasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_tipo_movimientoRetencionesPorPagarPorCuentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonnumero_mayorRetencionesPorPagarPorCuentasBusqueda.addActionListener(new ButtonActionListener(this,"numero_mayorRetencionesPorPagarPorCuentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonnombre_cuenta_contable_retencionRetencionesPorPagarPorCuentasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_cuenta_contable_retencionRetencionesPorPagarPorCuentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonnumero_pre_impreso_facturaRetencionesPorPagarPorCuentasBusqueda.addActionListener(new ButtonActionListener(this,"numero_pre_impreso_facturaRetencionesPorPagarPorCuentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonporcentajeRetencionesPorPagarPorCuentasBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeRetencionesPorPagarPorCuentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonbase_imponibleRetencionesPorPagarPorCuentasBusqueda.addActionListener(new ButtonActionListener(this,"base_imponibleRetencionesPorPagarPorCuentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonvalorRetencionesPorPagarPorCuentasBusqueda.addActionListener(new ButtonActionListener(this,"valorRetencionesPorPagarPorCuentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonnumeroRetencionesPorPagarPorCuentasBusqueda.addActionListener(new ButtonActionListener(this,"numeroRetencionesPorPagarPorCuentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonnombre_benefRetencionesPorPagarPorCuentasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_benefRetencionesPorPagarPorCuentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonruc_benefRetencionesPorPagarPorCuentasBusqueda.addActionListener(new ButtonActionListener(this,"ruc_benefRetencionesPorPagarPorCuentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonnombre_cuenta_contableRetencionesPorPagarPorCuentasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_cuenta_contableRetencionesPorPagarPorCuentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonnombre_cuenta_contable_creditoRetencionesPorPagarPorCuentasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_cuenta_contable_creditoRetencionesPorPagarPorCuentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtones_debito_datoRetencionesPorPagarPorCuentasBusqueda.addActionListener(new ButtonActionListener(this,"es_debito_datoRetencionesPorPagarPorCuentasBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTabbedPaneRelacionesRetencionesPorPagarPorCuentas.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesRetencionesPorPagarPorCuentas"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameRetencionesPorPagarPorCuentas"));
		
		if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarRetencionesPorPagarPorCuentas"));
		}
		
		this.jTableDatosRetencionesPorPagarPorCuentas.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarRetencionesPorPagarPorCuentas"));
		
		this.jTableDatosRetencionesPorPagarPorCuentas.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarRetencionesPorPagarPorCuentas"));
		
		this.jButtonNuevoRetencionesPorPagarPorCuentas.addActionListener(new ButtonActionListener(this,"NuevoRetencionesPorPagarPorCuentas"));
		
		this.jButtonDuplicarRetencionesPorPagarPorCuentas.addActionListener(new ButtonActionListener(this,"DuplicarRetencionesPorPagarPorCuentas"));
		
		this.jButtonCopiarRetencionesPorPagarPorCuentas.addActionListener(new ButtonActionListener(this,"CopiarRetencionesPorPagarPorCuentas"));
		
		this.jButtonVerFormRetencionesPorPagarPorCuentas.addActionListener(new ButtonActionListener(this,"VerFormRetencionesPorPagarPorCuentas"));
		
		
		this.jButtonNuevoToolBarRetencionesPorPagarPorCuentas.addActionListener(new ButtonActionListener(this,"NuevoToolBarRetencionesPorPagarPorCuentas"));
			
		this.jButtonDuplicarToolBarRetencionesPorPagarPorCuentas.addActionListener(new ButtonActionListener(this,"DuplicarToolBarRetencionesPorPagarPorCuentas"));
			
		this.jMenuItemNuevoRetencionesPorPagarPorCuentas.addActionListener (new ButtonActionListener(this,"MenuItemNuevoRetencionesPorPagarPorCuentas"));
			
		this.jMenuItemDuplicarRetencionesPorPagarPorCuentas.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarRetencionesPorPagarPorCuentas"));		
		
		
		this.jButtonNuevoRelacionesRetencionesPorPagarPorCuentas.addActionListener (new ButtonActionListener(this,"NuevoRelacionesRetencionesPorPagarPorCuentas"));
		
		
		this.jButtonNuevoRelacionesToolBarRetencionesPorPagarPorCuentas.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarRetencionesPorPagarPorCuentas"));
			
		this.jMenuItemNuevoRelacionesRetencionesPorPagarPorCuentas.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesRetencionesPorPagarPorCuentas"));		
		
		
		if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonModificarRetencionesPorPagarPorCuentas.addActionListener(new ButtonActionListener(this,"ModificarRetencionesPorPagarPorCuentas"));
		}
		
		
		if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonModificarToolBarRetencionesPorPagarPorCuentas.addActionListener(new ButtonActionListener(this,"ModificarToolBarRetencionesPorPagarPorCuentas"));
			
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jMenuItemModificarRetencionesPorPagarPorCuentas.addActionListener(new ButtonActionListener(this,"MenuItemModificarRetencionesPorPagarPorCuentas"));		
		}
		
		
		if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonActualizarRetencionesPorPagarPorCuentas.addActionListener (new ButtonActionListener(this,"ActualizarRetencionesPorPagarPorCuentas"));
		}
		
		
		if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonActualizarToolBarRetencionesPorPagarPorCuentas.addActionListener(new ButtonActionListener(this,"ActualizarToolBarRetencionesPorPagarPorCuentas"));
				
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jMenuItemActualizarRetencionesPorPagarPorCuentas.addActionListener (new ButtonActionListener(this,"MenuItemActualizarRetencionesPorPagarPorCuentas"));		
		}
		
		
		if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonEliminarRetencionesPorPagarPorCuentas.addActionListener (new ButtonActionListener(this,"EliminarRetencionesPorPagarPorCuentas"));
		}
		
		
		if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonEliminarToolBarRetencionesPorPagarPorCuentas.addActionListener (new ButtonActionListener(this,"EliminarToolBarRetencionesPorPagarPorCuentas"));
						
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jMenuItemEliminarRetencionesPorPagarPorCuentas.addActionListener (new ButtonActionListener(this,"MenuItemEliminarRetencionesPorPagarPorCuentas"));		
		}
		
		
		if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonCancelarRetencionesPorPagarPorCuentas.addActionListener (new ButtonActionListener(this,"CancelarRetencionesPorPagarPorCuentas"));
		}
		
		
		if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonCancelarToolBarRetencionesPorPagarPorCuentas.addActionListener (new ButtonActionListener(this,"CancelarToolBarRetencionesPorPagarPorCuentas"));
			
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jMenuItemCancelarRetencionesPorPagarPorCuentas.addActionListener (new ButtonActionListener(this,"MenuItemCancelarRetencionesPorPagarPorCuentas"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarRetencionesPorPagarPorCuentas.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarRetencionesPorPagarPorCuentas"));		
		
		
		this.jButtonCerrarRetencionesPorPagarPorCuentas.addActionListener (new ButtonActionListener(this,"CerrarRetencionesPorPagarPorCuentas"));
		
		
		this.jButtonCerrarToolBarRetencionesPorPagarPorCuentas.addActionListener (new ButtonActionListener(this,"CerrarToolBarRetencionesPorPagarPorCuentas"));
			
		this.jMenuItemCerrarRetencionesPorPagarPorCuentas.addActionListener (new ButtonActionListener(this,"MenuItemCerrarRetencionesPorPagarPorCuentas"));
			
		if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jMenuItemDetalleCerrarRetencionesPorPagarPorCuentas.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarRetencionesPorPagarPorCuentas"));		
		}
		
		
		if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonGuardarCambiosRetencionesPorPagarPorCuentas.addActionListener (new ButtonActionListener(this,"GuardarCambiosRetencionesPorPagarPorCuentas"));
		}
		
		
		if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonGuardarCambiosToolBarRetencionesPorPagarPorCuentas.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarRetencionesPorPagarPorCuentas"));
		}
		
		this.jButtonCopiarToolBarRetencionesPorPagarPorCuentas.addActionListener (new ButtonActionListener(this,"CopiarToolBarRetencionesPorPagarPorCuentas"));
			
		this.jButtonVerFormToolBarRetencionesPorPagarPorCuentas.addActionListener (new ButtonActionListener(this,"VerFormToolBarRetencionesPorPagarPorCuentas"));
		
		this.jMenuItemGuardarCambiosRetencionesPorPagarPorCuentas.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosRetencionesPorPagarPorCuentas"));
			
		this.jMenuItemCopiarRetencionesPorPagarPorCuentas.addActionListener (new ButtonActionListener(this,"MenuItemCopiarRetencionesPorPagarPorCuentas"));		
		
		this.jMenuItemVerFormRetencionesPorPagarPorCuentas.addActionListener (new ButtonActionListener(this,"MenuItemVerFormRetencionesPorPagarPorCuentas"));		
		
		
		this.jButtonGuardarCambiosTablaRetencionesPorPagarPorCuentas.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaRetencionesPorPagarPorCuentas"));
		
		
		this.jButtonGuardarCambiosTablaToolBarRetencionesPorPagarPorCuentas.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarRetencionesPorPagarPorCuentas"));
			
		this.jMenuItemGuardarCambiosTablaRetencionesPorPagarPorCuentas.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaRetencionesPorPagarPorCuentas"));		
		
		
		
		this.jButtonRecargarInformacionRetencionesPorPagarPorCuentas.addActionListener (new ButtonActionListener(this,"RecargarInformacionRetencionesPorPagarPorCuentas"));
					
		this.jButtonRecargarInformacionToolBarRetencionesPorPagarPorCuentas.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarRetencionesPorPagarPorCuentas"));
		
		this.jMenuItemRecargarInformacionRetencionesPorPagarPorCuentas.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionRetencionesPorPagarPorCuentas"));		
		
		
		
		this.jButtonAnterioresRetencionesPorPagarPorCuentas.addActionListener (new ButtonActionListener(this,"AnterioresRetencionesPorPagarPorCuentas"));
		
		
		this.jButtonAnterioresToolBarRetencionesPorPagarPorCuentas.addActionListener (new ButtonActionListener(this,"AnterioresToolBarRetencionesPorPagarPorCuentas"));
		
		this.jMenuItemAnterioresRetencionesPorPagarPorCuentas.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresRetencionesPorPagarPorCuentas"));		
		
		
		this.jButtonSiguientesRetencionesPorPagarPorCuentas.addActionListener (new ButtonActionListener(this,"SiguientesRetencionesPorPagarPorCuentas"));
		
		
		this.jButtonSiguientesToolBarRetencionesPorPagarPorCuentas.addActionListener (new ButtonActionListener(this,"SiguientesToolBarRetencionesPorPagarPorCuentas"));
			
		this.jMenuItemSiguientesRetencionesPorPagarPorCuentas.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesRetencionesPorPagarPorCuentas"));
			
		this.jMenuItemAbrirOrderByRetencionesPorPagarPorCuentas.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByRetencionesPorPagarPorCuentas"));
			
		this.jMenuItemMostrarOcultarRetencionesPorPagarPorCuentas.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarRetencionesPorPagarPorCuentas"));
			
		this.jMenuItemDetalleAbrirOrderByRetencionesPorPagarPorCuentas.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByRetencionesPorPagarPorCuentas"));
			
		this.jMenuItemDetalleMostarOcultarRetencionesPorPagarPorCuentas.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarRetencionesPorPagarPorCuentas"));		
		
		
		this.jButtonNuevoGuardarCambiosRetencionesPorPagarPorCuentas.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosRetencionesPorPagarPorCuentas"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarRetencionesPorPagarPorCuentas.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarRetencionesPorPagarPorCuentas"));
			
		this.jMenuItemNuevoGuardarCambiosRetencionesPorPagarPorCuentas.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosRetencionesPorPagarPorCuentas"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosRetencionesPorPagarPorCuentas.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosRetencionesPorPagarPorCuentas"));

		this.jCheckBoxSeleccionadosRetencionesPorPagarPorCuentas.addItemListener(new CheckBoxItemListener(this,"SeleccionadosRetencionesPorPagarPorCuentas"));
		
		if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxTiposAccionesFormularioRetencionesPorPagarPorCuentas.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioRetencionesPorPagarPorCuentas"));
		}
		
		
		this.jComboBoxTiposRelacionesRetencionesPorPagarPorCuentas.addActionListener (new ButtonActionListener(this,"TiposRelacionesRetencionesPorPagarPorCuentas"));
			
		this.jComboBoxTiposAccionesRetencionesPorPagarPorCuentas.addActionListener (new ButtonActionListener(this,"TiposAccionesRetencionesPorPagarPorCuentas"));
					
		this.jComboBoxTiposSeleccionarRetencionesPorPagarPorCuentas.addActionListener (new ButtonActionListener(this,"TiposSeleccionarRetencionesPorPagarPorCuentas"));
			
		this.jTextFieldValorCampoGeneralRetencionesPorPagarPorCuentas.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralRetencionesPorPagarPorCuentas"));		
		
		
		if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonidRetencionesPorPagarPorCuentasBusqueda.addActionListener(new ButtonActionListener(this,"idRetencionesPorPagarPorCuentasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonid_empresaRetencionesPorPagarPorCuentasUpdate.addActionListener(new ButtonActionListener(this,"id_empresaRetencionesPorPagarPorCuentasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonid_empresaRetencionesPorPagarPorCuentasBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaRetencionesPorPagarPorCuentasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonid_sucursalRetencionesPorPagarPorCuentasUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalRetencionesPorPagarPorCuentasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonid_sucursalRetencionesPorPagarPorCuentasBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalRetencionesPorPagarPorCuentasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonid_ejercicioRetencionesPorPagarPorCuentasUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioRetencionesPorPagarPorCuentasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonid_ejercicioRetencionesPorPagarPorCuentasBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioRetencionesPorPagarPorCuentasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonid_periodoRetencionesPorPagarPorCuentasUpdate.addActionListener(new ButtonActionListener(this,"id_periodoRetencionesPorPagarPorCuentasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonid_periodoRetencionesPorPagarPorCuentasBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoRetencionesPorPagarPorCuentasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonid_tipo_retencionRetencionesPorPagarPorCuentasUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_retencionRetencionesPorPagarPorCuentasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonid_tipo_retencionRetencionesPorPagarPorCuentasBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_retencionRetencionesPorPagarPorCuentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtones_debitoRetencionesPorPagarPorCuentasBusqueda.addActionListener(new ButtonActionListener(this,"es_debitoRetencionesPorPagarPorCuentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonfecha_emisionRetencionesPorPagarPorCuentasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionRetencionesPorPagarPorCuentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonnombre_tipo_movimientoRetencionesPorPagarPorCuentasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_tipo_movimientoRetencionesPorPagarPorCuentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonnumero_mayorRetencionesPorPagarPorCuentasBusqueda.addActionListener(new ButtonActionListener(this,"numero_mayorRetencionesPorPagarPorCuentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonnombre_cuenta_contable_retencionRetencionesPorPagarPorCuentasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_cuenta_contable_retencionRetencionesPorPagarPorCuentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonnumero_pre_impreso_facturaRetencionesPorPagarPorCuentasBusqueda.addActionListener(new ButtonActionListener(this,"numero_pre_impreso_facturaRetencionesPorPagarPorCuentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonporcentajeRetencionesPorPagarPorCuentasBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeRetencionesPorPagarPorCuentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonbase_imponibleRetencionesPorPagarPorCuentasBusqueda.addActionListener(new ButtonActionListener(this,"base_imponibleRetencionesPorPagarPorCuentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonvalorRetencionesPorPagarPorCuentasBusqueda.addActionListener(new ButtonActionListener(this,"valorRetencionesPorPagarPorCuentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonnumeroRetencionesPorPagarPorCuentasBusqueda.addActionListener(new ButtonActionListener(this,"numeroRetencionesPorPagarPorCuentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonnombre_benefRetencionesPorPagarPorCuentasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_benefRetencionesPorPagarPorCuentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonruc_benefRetencionesPorPagarPorCuentasBusqueda.addActionListener(new ButtonActionListener(this,"ruc_benefRetencionesPorPagarPorCuentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonnombre_cuenta_contableRetencionesPorPagarPorCuentasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_cuenta_contableRetencionesPorPagarPorCuentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonnombre_cuenta_contable_creditoRetencionesPorPagarPorCuentasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_cuenta_contable_creditoRetencionesPorPagarPorCuentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtones_debito_datoRetencionesPorPagarPorCuentasBusqueda.addActionListener(new ButtonActionListener(this,"es_debito_datoRetencionesPorPagarPorCuentasBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas.addActionListener(new ButtonActionListener(this,"BusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoRetencionesPorPagarPorCuentas!=null) {
				this.jInternalFrameReporteDinamicoRetencionesPorPagarPorCuentas.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoRetencionesPorPagarPorCuentas"));
				this.jInternalFrameReporteDinamicoRetencionesPorPagarPorCuentas.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoRetencionesPorPagarPorCuentas"));
				this.jInternalFrameReporteDinamicoRetencionesPorPagarPorCuentas.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoRetencionesPorPagarPorCuentas"));
			}
			
			//this.jButtonCerrarReporteDinamicoRetencionesPorPagarPorCuentas.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoRetencionesPorPagarPorCuentas"));				
			//this.jButtonGenerarReporteDinamicoRetencionesPorPagarPorCuentas.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoRetencionesPorPagarPorCuentas"));
			//this.jButtonGenerarExcelReporteDinamicoRetencionesPorPagarPorCuentas.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoRetencionesPorPagarPorCuentas"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionRetencionesPorPagarPorCuentas!=null) {
				this.jInternalFrameImportacionRetencionesPorPagarPorCuentas.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionRetencionesPorPagarPorCuentas"));
				this.jInternalFrameImportacionRetencionesPorPagarPorCuentas.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionRetencionesPorPagarPorCuentas"));
				this.jInternalFrameImportacionRetencionesPorPagarPorCuentas.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionRetencionesPorPagarPorCuentas"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByRetencionesPorPagarPorCuentas.addActionListener (new ButtonActionListener(this,"AbrirOrderByRetencionesPorPagarPorCuentas"));
			
			this.jButtonAbrirOrderByToolBarRetencionesPorPagarPorCuentas.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarRetencionesPorPagarPorCuentas"));			
			
			if(this.jInternalFrameOrderByRetencionesPorPagarPorCuentas!=null) {
				this.jInternalFrameOrderByRetencionesPorPagarPorCuentas.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByRetencionesPorPagarPorCuentas"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTabbedPaneRelacionesRetencionesPorPagarPorCuentas.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesRetencionesPorPagarPorCuentas"));
		
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
            		closingInternalFrameRetencionesPorPagarPorCuentas();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormRetencionesPorPagarPorCuentas = (JInternalFrameBase)event.getSource();
	            	
	            RetencionesPorPagarPorCuentasBeanSwingJInternalFrame jInternalFrameParent=(RetencionesPorPagarPorCuentasBeanSwingJInternalFrame)jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarRetencionesPorPagarPorCuentasActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosRetencionesPorPagarPorCuentas.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosRetencionesPorPagarPorCuentasListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosRetencionesPorPagarPorCuentas.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosRetencionesPorPagarPorCuentas.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoRetencionesPorPagarPorCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRetencionesPorPagarPorCuentasActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarRetencionesPorPagarPorCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRetencionesPorPagarPorCuentasActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRetencionesPorPagarPorCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRetencionesPorPagarPorCuentasActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRetencionesPorPagarPorCuentas";
		inputMap = this.jButtonNuevoRetencionesPorPagarPorCuentas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRetencionesPorPagarPorCuentas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoRetencionesPorPagarPorCuentasActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesRetencionesPorPagarPorCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRetencionesPorPagarPorCuentasActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarRetencionesPorPagarPorCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRetencionesPorPagarPorCuentasActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesRetencionesPorPagarPorCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRetencionesPorPagarPorCuentasActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesRetencionesPorPagarPorCuentas";
		inputMap = this.jButtonNuevoRelacionesRetencionesPorPagarPorCuentas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesRetencionesPorPagarPorCuentas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoRetencionesPorPagarPorCuentasActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarRetencionesPorPagarPorCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarRetencionesPorPagarPorCuentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarRetencionesPorPagarPorCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarRetencionesPorPagarPorCuentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarRetencionesPorPagarPorCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarRetencionesPorPagarPorCuentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarRetencionesPorPagarPorCuentas";
		inputMap = this.jButtonModificarRetencionesPorPagarPorCuentas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarRetencionesPorPagarPorCuentas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarRetencionesPorPagarPorCuentasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarRetencionesPorPagarPorCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarRetencionesPorPagarPorCuentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarRetencionesPorPagarPorCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarRetencionesPorPagarPorCuentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarRetencionesPorPagarPorCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarRetencionesPorPagarPorCuentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarRetencionesPorPagarPorCuentas";
		inputMap = this.jButtonActualizarRetencionesPorPagarPorCuentas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarRetencionesPorPagarPorCuentas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarRetencionesPorPagarPorCuentasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarRetencionesPorPagarPorCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarRetencionesPorPagarPorCuentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarRetencionesPorPagarPorCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarRetencionesPorPagarPorCuentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarRetencionesPorPagarPorCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarRetencionesPorPagarPorCuentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarRetencionesPorPagarPorCuentas";
		inputMap = this.jButtonEliminarRetencionesPorPagarPorCuentas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarRetencionesPorPagarPorCuentas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarRetencionesPorPagarPorCuentasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarRetencionesPorPagarPorCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarRetencionesPorPagarPorCuentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarRetencionesPorPagarPorCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarRetencionesPorPagarPorCuentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarRetencionesPorPagarPorCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarRetencionesPorPagarPorCuentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarRetencionesPorPagarPorCuentas";
		inputMap = this.jButtonCancelarRetencionesPorPagarPorCuentas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarRetencionesPorPagarPorCuentas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarRetencionesPorPagarPorCuentasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarRetencionesPorPagarPorCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarRetencionesPorPagarPorCuentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarRetencionesPorPagarPorCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarRetencionesPorPagarPorCuentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarRetencionesPorPagarPorCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarRetencionesPorPagarPorCuentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarRetencionesPorPagarPorCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarRetencionesPorPagarPorCuentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarRetencionesPorPagarPorCuentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarRetencionesPorPagarPorCuentas";
		inputMap = this.jButtonCerrarRetencionesPorPagarPorCuentas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarRetencionesPorPagarPorCuentas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarRetencionesPorPagarPorCuentasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonGuardarCambiosRetencionesPorPagarPorCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRetencionesPorPagarPorCuentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarRetencionesPorPagarPorCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRetencionesPorPagarPorCuentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosRetencionesPorPagarPorCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRetencionesPorPagarPorCuentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaRetencionesPorPagarPorCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRetencionesPorPagarPorCuentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarRetencionesPorPagarPorCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRetencionesPorPagarPorCuentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaRetencionesPorPagarPorCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRetencionesPorPagarPorCuentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosRetencionesPorPagarPorCuentas";
		inputMap = this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonGuardarCambiosRetencionesPorPagarPorCuentas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonGuardarCambiosRetencionesPorPagarPorCuentas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosRetencionesPorPagarPorCuentasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionRetencionesPorPagarPorCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionRetencionesPorPagarPorCuentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarRetencionesPorPagarPorCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionRetencionesPorPagarPorCuentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionRetencionesPorPagarPorCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionRetencionesPorPagarPorCuentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresRetencionesPorPagarPorCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresRetencionesPorPagarPorCuentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarRetencionesPorPagarPorCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresRetencionesPorPagarPorCuentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresRetencionesPorPagarPorCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresRetencionesPorPagarPorCuentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesRetencionesPorPagarPorCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesRetencionesPorPagarPorCuentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarRetencionesPorPagarPorCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesRetencionesPorPagarPorCuentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesRetencionesPorPagarPorCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesRetencionesPorPagarPorCuentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosRetencionesPorPagarPorCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosRetencionesPorPagarPorCuentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarRetencionesPorPagarPorCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosRetencionesPorPagarPorCuentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosRetencionesPorPagarPorCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosRetencionesPorPagarPorCuentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosRetencionesPorPagarPorCuentas.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosRetencionesPorPagarPorCuentasItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesRetencionesPorPagarPorCuentas.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesRetencionesPorPagarPorCuentasActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarRetencionesPorPagarPorCuentas.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarRetencionesPorPagarPorCuentasActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralRetencionesPorPagarPorCuentas.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralRetencionesPorPagarPorCuentasActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonidRetencionesPorPagarPorCuentasBusqueda.addActionListener(new ButtonActionListener(this,"idRetencionesPorPagarPorCuentasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonid_empresaRetencionesPorPagarPorCuentasUpdate.addActionListener(new ButtonActionListener(this,"id_empresaRetencionesPorPagarPorCuentasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonid_empresaRetencionesPorPagarPorCuentasBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaRetencionesPorPagarPorCuentasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonid_sucursalRetencionesPorPagarPorCuentasUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalRetencionesPorPagarPorCuentasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonid_sucursalRetencionesPorPagarPorCuentasBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalRetencionesPorPagarPorCuentasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonid_ejercicioRetencionesPorPagarPorCuentasUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioRetencionesPorPagarPorCuentasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonid_ejercicioRetencionesPorPagarPorCuentasBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioRetencionesPorPagarPorCuentasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonid_periodoRetencionesPorPagarPorCuentasUpdate.addActionListener(new ButtonActionListener(this,"id_periodoRetencionesPorPagarPorCuentasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonid_periodoRetencionesPorPagarPorCuentasBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoRetencionesPorPagarPorCuentasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonid_tipo_retencionRetencionesPorPagarPorCuentasUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_retencionRetencionesPorPagarPorCuentasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonid_tipo_retencionRetencionesPorPagarPorCuentasBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_retencionRetencionesPorPagarPorCuentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtones_debitoRetencionesPorPagarPorCuentasBusqueda.addActionListener(new ButtonActionListener(this,"es_debitoRetencionesPorPagarPorCuentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonfecha_emisionRetencionesPorPagarPorCuentasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionRetencionesPorPagarPorCuentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonnombre_tipo_movimientoRetencionesPorPagarPorCuentasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_tipo_movimientoRetencionesPorPagarPorCuentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonnumero_mayorRetencionesPorPagarPorCuentasBusqueda.addActionListener(new ButtonActionListener(this,"numero_mayorRetencionesPorPagarPorCuentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonnombre_cuenta_contable_retencionRetencionesPorPagarPorCuentasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_cuenta_contable_retencionRetencionesPorPagarPorCuentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonnumero_pre_impreso_facturaRetencionesPorPagarPorCuentasBusqueda.addActionListener(new ButtonActionListener(this,"numero_pre_impreso_facturaRetencionesPorPagarPorCuentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonporcentajeRetencionesPorPagarPorCuentasBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeRetencionesPorPagarPorCuentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonbase_imponibleRetencionesPorPagarPorCuentasBusqueda.addActionListener(new ButtonActionListener(this,"base_imponibleRetencionesPorPagarPorCuentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonvalorRetencionesPorPagarPorCuentasBusqueda.addActionListener(new ButtonActionListener(this,"valorRetencionesPorPagarPorCuentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonnumeroRetencionesPorPagarPorCuentasBusqueda.addActionListener(new ButtonActionListener(this,"numeroRetencionesPorPagarPorCuentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonnombre_benefRetencionesPorPagarPorCuentasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_benefRetencionesPorPagarPorCuentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonruc_benefRetencionesPorPagarPorCuentasBusqueda.addActionListener(new ButtonActionListener(this,"ruc_benefRetencionesPorPagarPorCuentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonnombre_cuenta_contableRetencionesPorPagarPorCuentasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_cuenta_contableRetencionesPorPagarPorCuentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtonnombre_cuenta_contable_creditoRetencionesPorPagarPorCuentasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_cuenta_contable_creditoRetencionesPorPagarPorCuentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jButtones_debito_datoRetencionesPorPagarPorCuentasBusqueda.addActionListener(new ButtonActionListener(this,"es_debito_datoRetencionesPorPagarPorCuentasBusqueda"));
		
		
		this.jButtonBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas.addActionListener(new ButtonActionListener(this,"BusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoRetencionesPorPagarPorCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoRetencionesPorPagarPorCuentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoRetencionesPorPagarPorCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoRetencionesPorPagarPorCuentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoRetencionesPorPagarPorCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoRetencionesPorPagarPorCuentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionRetencionesPorPagarPorCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionRetencionesPorPagarPorCuentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionRetencionesPorPagarPorCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionRetencionesPorPagarPorCuentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionRetencionesPorPagarPorCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionRetencionesPorPagarPorCuentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarRetencionesPorPagarPorCuentasActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarRetencionesPorPagarPorCuentas.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosRetencionesPorPagarPorCuentas(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(RetencionesPorPagarPorCuentas retencionesporpagarporcuentasAux:this.retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass()) {
					retencionesporpagarporcuentasAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(RetencionesPorPagarPorCuentas retencionesporpagarporcuentasAux:retencionesporpagarporcuentass) {
					retencionesporpagarporcuentasAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosRetencionesPorPagarPorCuentasItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingRetencionesPorPagarPorCuentas(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(RetencionesPorPagarPorCuentas retencionesporpagarporcuentasAux:this.retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass()) {
						retencionesporpagarporcuentasAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(RetencionesPorPagarPorCuentas retencionesporpagarporcuentasAux:retencionesporpagarporcuentass) {
						retencionesporpagarporcuentasAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(RetencionesPorPagarPorCuentas retencionesporpagarporcuentasAux:this.retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass()) {
					
						if(sTipoSeleccionar.equals(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_ESDEBITO)) {
							existe=true;
							retencionesporpagarporcuentasAux.setes_debito(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_ESDEBITODATO)) {
							existe=true;
							retencionesporpagarporcuentasAux.setes_debito_dato(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(RetencionesPorPagarPorCuentas retencionesporpagarporcuentasAux:retencionesporpagarporcuentass) {
						
						if(sTipoSeleccionar.equals(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_ESDEBITO)) {
							existe=true;
							retencionesporpagarporcuentasAux.setes_debito(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_ESDEBITODATO)) {
							existe=true;
							retencionesporpagarporcuentasAux.setes_debito_dato(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaRetencionesPorPagarPorCuentas(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosRetencionesPorPagarPorCuentas.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosRetencionesPorPagarPorCuentas.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosRetencionesPorPagarPorCuentas,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosRetencionesPorPagarPorCuentasItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingRetencionesPorPagarPorCuentas(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosRetencionesPorPagarPorCuentas.getSelectedRows();
			
			RetencionesPorPagarPorCuentas retencionesporpagarporcuentasLocal=new RetencionesPorPagarPorCuentas();
			
			//this.seleccionarTodosRetencionesPorPagarPorCuentas(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					retencionesporpagarporcuentasLocal =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass().toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					retencionesporpagarporcuentasLocal =(RetencionesPorPagarPorCuentas) this.retencionesporpagarporcuentass.toArray()[this.jTableDatosRetencionesPorPagarPorCuentas.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				retencionesporpagarporcuentasLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(RetencionesPorPagarPorCuentas retencionesporpagarporcuentasAux:this.retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass()) {
						retencionesporpagarporcuentasAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(RetencionesPorPagarPorCuentas retencionesporpagarporcuentasAux:retencionesporpagarporcuentass) {
						retencionesporpagarporcuentasAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaRetencionesPorPagarPorCuentas(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosRetencionesPorPagarPorCuentas.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosRetencionesPorPagarPorCuentas.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosRetencionesPorPagarPorCuentas,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualRetencionesPorPagarPorCuentasItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarRetencionesPorPagarPorCuentasParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralRetencionesPorPagarPorCuentasActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingRetencionesPorPagarPorCuentas(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralRetencionesPorPagarPorCuentas.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(RetencionesPorPagarPorCuentas retencionesporpagarporcuentasAux:this.retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass()) {
				
						if(sTipoSeleccionar.equals(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							retencionesporpagarporcuentasAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBRETIPOMOVIMIENTO)) {
							existe=true;
							retencionesporpagarporcuentasAux.setnombre_tipo_movimiento(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NUMEROMAYOR)) {
							existe=true;
							retencionesporpagarporcuentasAux.setnumero_mayor(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBRECUENTACONTABLERETENCION)) {
							existe=true;
							retencionesporpagarporcuentasAux.setnombre_cuenta_contable_retencion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA)) {
							existe=true;
							retencionesporpagarporcuentasAux.setnumero_pre_impreso_factura(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							retencionesporpagarporcuentasAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_BASEIMPONIBLE)) {
							existe=true;
							retencionesporpagarporcuentasAux.setbase_imponible(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							retencionesporpagarporcuentasAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NUMERO)) {
							existe=true;
							retencionesporpagarporcuentasAux.setnumero(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBREBENEF)) {
							existe=true;
							retencionesporpagarporcuentasAux.setnombre_benef(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_RUCBENEF)) {
							existe=true;
							retencionesporpagarporcuentasAux.setruc_benef(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBRECUENTACONTABLE)) {
							existe=true;
							retencionesporpagarporcuentasAux.setnombre_cuenta_contable(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBRECUENTACONTABLECREDITO)) {
							existe=true;
							retencionesporpagarporcuentasAux.setnombre_cuenta_contable_credito(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(RetencionesPorPagarPorCuentas retencionesporpagarporcuentasAux:retencionesporpagarporcuentass) {
					
						if(sTipoSeleccionar.equals(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							retencionesporpagarporcuentasAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBRETIPOMOVIMIENTO)) {
							existe=true;
							retencionesporpagarporcuentasAux.setnombre_tipo_movimiento(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NUMEROMAYOR)) {
							existe=true;
							retencionesporpagarporcuentasAux.setnumero_mayor(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBRECUENTACONTABLERETENCION)) {
							existe=true;
							retencionesporpagarporcuentasAux.setnombre_cuenta_contable_retencion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA)) {
							existe=true;
							retencionesporpagarporcuentasAux.setnumero_pre_impreso_factura(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							retencionesporpagarporcuentasAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_BASEIMPONIBLE)) {
							existe=true;
							retencionesporpagarporcuentasAux.setbase_imponible(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							retencionesporpagarporcuentasAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NUMERO)) {
							existe=true;
							retencionesporpagarporcuentasAux.setnumero(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBREBENEF)) {
							existe=true;
							retencionesporpagarporcuentasAux.setnombre_benef(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_RUCBENEF)) {
							existe=true;
							retencionesporpagarporcuentasAux.setruc_benef(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBRECUENTACONTABLE)) {
							existe=true;
							retencionesporpagarporcuentasAux.setnombre_cuenta_contable(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBRECUENTACONTABLECREDITO)) {
							existe=true;
							retencionesporpagarporcuentasAux.setnombre_cuenta_contable_credito(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaRetencionesPorPagarPorCuentas(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesRetencionesPorPagarPorCuentasActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingRetencionesPorPagarPorCuentas(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioRetencionesPorPagarPorCuentas=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesRetencionesPorPagarPorCuentas.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxTiposAccionesFormularioRetencionesPorPagarPorCuentas.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteRetencionesPorPagarPorCuentas) {				
					conSplash=true;//false;										
					
					//this.startProcessRetencionesPorPagarPorCuentas(conSplash);
				
					this.generarReporteRetencionesPorPagarPorCuentassSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesRetencionesPorPagarPorCuentas.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxTiposAccionesFormularioRetencionesPorPagarPorCuentas.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoRetencionesPorPagarPorCuentassSeleccionados();
				//this.jComboBoxTiposAccionesRetencionesPorPagarPorCuentas.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoRetencionesPorPagarPorCuentassSeleccionados(false);
				//this.jComboBoxTiposAccionesRetencionesPorPagarPorCuentas.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoRetencionesPorPagarPorCuentassSeleccionados(true);
				//this.jComboBoxTiposAccionesRetencionesPorPagarPorCuentas.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessRetencionesPorPagarPorCuentas();
				
				this.exportarRetencionesPorPagarPorCuentassSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesRetencionesPorPagarPorCuentas.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxTiposAccionesFormularioRetencionesPorPagarPorCuentas.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionRetencionesPorPagarPorCuentass();
				//this.importarRetencionesPorPagarPorCuentass();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesRetencionesPorPagarPorCuentas.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxTiposAccionesFormularioRetencionesPorPagarPorCuentas.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessRetencionesPorPagarPorCuentas();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelRetencionesPorPagarPorCuentassSeleccionados();
				//this.jComboBoxTiposAccionesRetencionesPorPagarPorCuentas.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Retenciones Por Pagar Por Cuentas", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessRetencionesPorPagarPorCuentas();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoRetencionesPorPagarPorCuentas)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyRetencionesPorPagarPorCuentas(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Retenciones Por Pagar Por Cuentas",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesRetencionesPorPagarPorCuentas.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxTiposAccionesFormularioRetencionesPorPagarPorCuentas.setSelectedIndex(0);					
				}	
			} 			
			else if(RetencionesPorPagarPorCuentasBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteRetencionesPorPagarPorCuentas) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessRetencionesPorPagarPorCuentas(conSplash);
					
						//this.actualizarParametrosGeneralRetencionesPorPagarPorCuentas();
						
						this.generarReporteProcesoAccionRetencionesPorPagarPorCuentassSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesRetencionesPorPagarPorCuentas.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxTiposAccionesFormularioRetencionesPorPagarPorCuentas.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(RetencionesPorPagarPorCuentasBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Retenciones Por Pagar Por CuentasES SELECCIONADOS?", "MANTENIMIENTO DE Retenciones Por Pagar Por Cuentas", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessRetencionesPorPagarPorCuentas();
				
						this.actualizarParametrosGeneralRetencionesPorPagarPorCuentas();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.retencionesporpagarporcuentasReturnGeneral=retencionesporpagarporcuentasLogic.procesarAccionRetencionesPorPagarPorCuentassWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass(),this.retencionesporpagarporcuentasParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarRetencionesPorPagarPorCuentasReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesRetencionesPorPagarPorCuentas.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxTiposAccionesFormularioRetencionesPorPagarPorCuentas.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralRetencionesPorPagarPorCuentas();
					
					RetencionesPorPagarPorCuentasBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarRetencionesPorPagarPorCuentasReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesRetencionesPorPagarPorCuentas.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxTiposAccionesFormularioRetencionesPorPagarPorCuentas.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessRetencionesPorPagarPorCuentas(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesRetencionesPorPagarPorCuentasActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessRetencionesPorPagarPorCuentas();
			
			if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<RetencionesPorPagarPorCuentas> retencionesporpagarporcuentassSeleccionados=new ArrayList<RetencionesPorPagarPorCuentas>();		
			RetencionesPorPagarPorCuentas retencionesporpagarporcuentas=new RetencionesPorPagarPorCuentas();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingRetencionesPorPagarPorCuentas(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesRetencionesPorPagarPorCuentas.getSelectedItem();
			
			
			
			
			retencionesporpagarporcuentassSeleccionados=this.getRetencionesPorPagarPorCuentassSeleccionados(true);
			//this.sTipoAccion;
			
			if(retencionesporpagarporcuentassSeleccionados.size()==1) {
				for(RetencionesPorPagarPorCuentas retencionesporpagarporcuentasAux:retencionesporpagarporcuentassSeleccionados) {
					retencionesporpagarporcuentas=retencionesporpagarporcuentasAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessRetencionesPorPagarPorCuentas();
			
      		//this.finishProcessRetencionesPorPagarPorCuentas(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarRetencionesPorPagarPorCuentasReturnGeneral() throws Exception {
		if(this.retencionesporpagarporcuentasReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.retencionesporpagarporcuentasReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.retencionesporpagarporcuentasReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.retencionesporpagarporcuentasReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.retencionesporpagarporcuentasReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.retencionesporpagarporcuentasReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingRetencionesPorPagarPorCuentas(false);
		}
		
		if(this.retencionesporpagarporcuentasReturnGeneral.getConRetornoLista() || this.retencionesporpagarporcuentasReturnGeneral.getConRetornoObjeto()) {
			if(this.retencionesporpagarporcuentasReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.retencionesporpagarporcuentasLogic.setRetencionesPorPagarPorCuentass(this.retencionesporpagarporcuentasReturnGeneral.getRetencionesPorPagarPorCuentass());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingRetencionesPorPagarPorCuentas(false);
		}
	}
	
	public void actualizarParametrosGeneralRetencionesPorPagarPorCuentas() throws Exception {
		
		
	}
	
	public ArrayList<RetencionesPorPagarPorCuentas> getRetencionesPorPagarPorCuentassSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<RetencionesPorPagarPorCuentas> retencionesporpagarporcuentassSeleccionados=new ArrayList<RetencionesPorPagarPorCuentas>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioRetencionesPorPagarPorCuentas) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(RetencionesPorPagarPorCuentas retencionesporpagarporcuentasAux:retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass()) {
					if(retencionesporpagarporcuentasAux.getIsSelected()) {
						retencionesporpagarporcuentassSeleccionados.add(retencionesporpagarporcuentasAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(RetencionesPorPagarPorCuentas retencionesporpagarporcuentasAux:this.retencionesporpagarporcuentass) {
					if(retencionesporpagarporcuentasAux.getIsSelected()) {
						retencionesporpagarporcuentassSeleccionados.add(retencionesporpagarporcuentasAux);				
					}
				}
			}
			
			if(retencionesporpagarporcuentassSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						retencionesporpagarporcuentassSeleccionados.addAll(this.retencionesporpagarporcuentasLogic.getRetencionesPorPagarPorCuentass());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						retencionesporpagarporcuentassSeleccionados.addAll(this.retencionesporpagarporcuentass);				
					}
				}
			}
		} else {
			retencionesporpagarporcuentassSeleccionados.add(this.retencionesporpagarporcuentas);
		}
		
		return retencionesporpagarporcuentassSeleccionados;
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
	
	public void generarReporteRetencionesPorPagarPorCuentassSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalRetencionesPorPagarPorCuentassSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoRetencionesPorPagarPorCuentassSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoRetencionesPorPagarPorCuentassSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoRetencionesPorPagarPorCuentassSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Retenciones Por Pagar Por Cuentas",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesRetencionesPorPagarPorCuentassSeleccionados() throws Exception {
		ArrayList<RetencionesPorPagarPorCuentas> retencionesporpagarporcuentassSeleccionados=new ArrayList<RetencionesPorPagarPorCuentas>();		
		
		retencionesporpagarporcuentassSeleccionados=this.getRetencionesPorPagarPorCuentassSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteRetencionesPorPagarPorCuentass("Todos",retencionesporpagarporcuentassSeleccionados);
		
	}	
	
	public void generarReporteNormalRetencionesPorPagarPorCuentassSeleccionados() throws Exception {
		ArrayList<RetencionesPorPagarPorCuentas> retencionesporpagarporcuentassSeleccionados=new ArrayList<RetencionesPorPagarPorCuentas>();		
		
		retencionesporpagarporcuentassSeleccionados=this.getRetencionesPorPagarPorCuentassSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteRetencionesPorPagarPorCuentass("Todos",retencionesporpagarporcuentassSeleccionados);
	}		
	
	public void generarReporteProcesoAccionRetencionesPorPagarPorCuentassSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<RetencionesPorPagarPorCuentas> retencionesporpagarporcuentassSeleccionados=new ArrayList<RetencionesPorPagarPorCuentas>();
		
		retencionesporpagarporcuentassSeleccionados=this.getRetencionesPorPagarPorCuentassSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteRetencionesPorPagarPorCuentass("Todos",retencionesporpagarporcuentassSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoRetencionesPorPagarPorCuentassSeleccionados() throws Exception {
		ArrayList<RetencionesPorPagarPorCuentas> retencionesporpagarporcuentassSeleccionados=new ArrayList<RetencionesPorPagarPorCuentas>();		
		
		
		this.abrirInicializarFrameReporteDinamicoRetencionesPorPagarPorCuentas();
		
		
		retencionesporpagarporcuentassSeleccionados=this.getRetencionesPorPagarPorCuentassSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoRetencionesPorPagarPorCuentas();
		
		
		//this.generarReporteRetencionesPorPagarPorCuentass("Todos",retencionesporpagarporcuentassSeleccionados ,retencionesporpagarporcuentasImplementable,retencionesporpagarporcuentasImplementableHome);
	}
	
	public void mostrarImportacionRetencionesPorPagarPorCuentass() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionRetencionesPorPagarPorCuentas();
		
		this.abrirFrameImportacionRetencionesPorPagarPorCuentas();		
		
			
		//this.generarReporteRetencionesPorPagarPorCuentass("Todos",retencionesporpagarporcuentassSeleccionados ,retencionesporpagarporcuentasImplementable,retencionesporpagarporcuentasImplementableHome);
	}
	
	public void importarRetencionesPorPagarPorCuentass() throws Exception {		
	
	}
	
	public void exportarRetencionesPorPagarPorCuentassSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelRetencionesPorPagarPorCuentassSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoRetencionesPorPagarPorCuentassSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlRetencionesPorPagarPorCuentassSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Retenciones Por Pagar Por Cuentas",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoRetencionesPorPagarPorCuentassSeleccionados() throws Exception {
		ArrayList<RetencionesPorPagarPorCuentas> retencionesporpagarporcuentassSeleccionados=new ArrayList<RetencionesPorPagarPorCuentas>();		
		
		retencionesporpagarporcuentassSeleccionados=this.getRetencionesPorPagarPorCuentassSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"retencionesporpagarporcuentas."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarRetencionesPorPagarPorCuentas(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(RetencionesPorPagarPorCuentas retencionesporpagarporcuentasAux:retencionesporpagarporcuentassSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarRetencionesPorPagarPorCuentas(retencionesporpagarporcuentasAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//retencionesporpagarporcuentasAux.setsDetalleGeneralEntityReporte(retencionesporpagarporcuentasAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Retenciones Por Pagar Por Cuentas",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarRetencionesPorPagarPorCuentas(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_IDEJERCICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_IDPERIODO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_IDTIPORETENCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_ESDEBITO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_FECHAEMISION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBRETIPOMOVIMIENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NUMEROMAYOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBRECUENTACONTABLERETENCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_PORCENTAJE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_BASEIMPONIBLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_VALOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NUMERO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBREBENEF;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_RUCBENEF;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBRECUENTACONTABLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBRECUENTACONTABLECREDITO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_ESDEBITODATO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarRetencionesPorPagarPorCuentas(RetencionesPorPagarPorCuentas retencionesporpagarporcuentas,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=retencionesporpagarporcuentas.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=retencionesporpagarporcuentas.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=retencionesporpagarporcuentas.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=retencionesporpagarporcuentas.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=retencionesporpagarporcuentas.getejercicio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=retencionesporpagarporcuentas.getperiodo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=retencionesporpagarporcuentas.gettiporetencion_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=retencionesporpagarporcuentas.getes_debito().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=retencionesporpagarporcuentas.getfecha_emision().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=retencionesporpagarporcuentas.getnombre_tipo_movimiento();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=retencionesporpagarporcuentas.getnumero_mayor();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=retencionesporpagarporcuentas.getnombre_cuenta_contable_retencion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=retencionesporpagarporcuentas.getnumero_pre_impreso_factura();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=retencionesporpagarporcuentas.getporcentaje().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=retencionesporpagarporcuentas.getbase_imponible().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=retencionesporpagarporcuentas.getvalor().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=retencionesporpagarporcuentas.getnumero();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=retencionesporpagarporcuentas.getnombre_benef();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=retencionesporpagarporcuentas.getruc_benef();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=retencionesporpagarporcuentas.getnombre_cuenta_contable();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=retencionesporpagarporcuentas.getnombre_cuenta_contable_credito();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=retencionesporpagarporcuentas.getes_debito_dato().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelRetencionesPorPagarPorCuentassSeleccionados() throws Exception {
		ArrayList<RetencionesPorPagarPorCuentas> retencionesporpagarporcuentassSeleccionados=new ArrayList<RetencionesPorPagarPorCuentas>();		
		
		retencionesporpagarporcuentassSeleccionados=this.getRetencionesPorPagarPorCuentassSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"retencionesporpagarporcuentas.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("RetencionesPorPagarPorCuentass");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelRetencionesPorPagarPorCuentas(row);				
				iRow++;
			}				
			
			for(RetencionesPorPagarPorCuentas retencionesporpagarporcuentasAux:retencionesporpagarporcuentassSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelRetencionesPorPagarPorCuentas(retencionesporpagarporcuentasAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Retenciones Por Pagar Por Cuentas",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlRetencionesPorPagarPorCuentassSeleccionados() throws Exception {
		ArrayList<RetencionesPorPagarPorCuentas> retencionesporpagarporcuentassSeleccionados=new ArrayList<RetencionesPorPagarPorCuentas>();		
		
		retencionesporpagarporcuentassSeleccionados=this.getRetencionesPorPagarPorCuentassSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"retencionesporpagarporcuentas.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("retencionesporpagarporcuentass");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("retencionesporpagarporcuentas");
			//elementRoot.appendChild(element);
		
			for(RetencionesPorPagarPorCuentas retencionesporpagarporcuentasAux:retencionesporpagarporcuentassSeleccionados) {
				element = document.createElement("retencionesporpagarporcuentas");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlRetencionesPorPagarPorCuentas(retencionesporpagarporcuentasAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Retenciones Por Pagar Por Cuentas",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelRetencionesPorPagarPorCuentas(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_IDEJERCICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_IDPERIODO);
		cell = row.createCell(iColumn++);cell.setCellValue(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_IDTIPORETENCION);
		cell = row.createCell(iColumn++);cell.setCellValue(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_ESDEBITO);
		cell = row.createCell(iColumn++);cell.setCellValue(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_FECHAEMISION);
		cell = row.createCell(iColumn++);cell.setCellValue(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBRETIPOMOVIMIENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NUMEROMAYOR);
		cell = row.createCell(iColumn++);cell.setCellValue(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBRECUENTACONTABLERETENCION);
		cell = row.createCell(iColumn++);cell.setCellValue(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA);
		cell = row.createCell(iColumn++);cell.setCellValue(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_PORCENTAJE);
		cell = row.createCell(iColumn++);cell.setCellValue(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_BASEIMPONIBLE);
		cell = row.createCell(iColumn++);cell.setCellValue(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_VALOR);
		cell = row.createCell(iColumn++);cell.setCellValue(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NUMERO);
		cell = row.createCell(iColumn++);cell.setCellValue(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBREBENEF);
		cell = row.createCell(iColumn++);cell.setCellValue(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_RUCBENEF);
		cell = row.createCell(iColumn++);cell.setCellValue(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBRECUENTACONTABLE);
		cell = row.createCell(iColumn++);cell.setCellValue(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBRECUENTACONTABLECREDITO);
		cell = row.createCell(iColumn++);cell.setCellValue(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_ESDEBITODATO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelRetencionesPorPagarPorCuentas(RetencionesPorPagarPorCuentas retencionesporpagarporcuentas,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(retencionesporpagarporcuentas.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(retencionesporpagarporcuentas.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(retencionesporpagarporcuentas.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(retencionesporpagarporcuentas.getejercicio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(retencionesporpagarporcuentas.getperiodo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(retencionesporpagarporcuentas.gettiporetencion_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(retencionesporpagarporcuentas.getes_debito());
		cell = row.createCell(iColumn++);cell.setCellValue(retencionesporpagarporcuentas.getfecha_emision());
		cell = row.createCell(iColumn++);cell.setCellValue(retencionesporpagarporcuentas.getnombre_tipo_movimiento());
		cell = row.createCell(iColumn++);cell.setCellValue(retencionesporpagarporcuentas.getnumero_mayor());
		cell = row.createCell(iColumn++);cell.setCellValue(retencionesporpagarporcuentas.getnombre_cuenta_contable_retencion());
		cell = row.createCell(iColumn++);cell.setCellValue(retencionesporpagarporcuentas.getnumero_pre_impreso_factura());
		cell = row.createCell(iColumn++);cell.setCellValue(retencionesporpagarporcuentas.getporcentaje());
		cell = row.createCell(iColumn++);cell.setCellValue(retencionesporpagarporcuentas.getbase_imponible());
		cell = row.createCell(iColumn++);cell.setCellValue(retencionesporpagarporcuentas.getvalor());
		cell = row.createCell(iColumn++);cell.setCellValue(retencionesporpagarporcuentas.getnumero());
		cell = row.createCell(iColumn++);cell.setCellValue(retencionesporpagarporcuentas.getnombre_benef());
		cell = row.createCell(iColumn++);cell.setCellValue(retencionesporpagarporcuentas.getruc_benef());
		cell = row.createCell(iColumn++);cell.setCellValue(retencionesporpagarporcuentas.getnombre_cuenta_contable());
		cell = row.createCell(iColumn++);cell.setCellValue(retencionesporpagarporcuentas.getnombre_cuenta_contable_credito());
		cell = row.createCell(iColumn++);cell.setCellValue(retencionesporpagarporcuentas.getes_debito_dato());				
	}
	
	public void setFilaDatosExportarXmlRetencionesPorPagarPorCuentas(RetencionesPorPagarPorCuentas retencionesporpagarporcuentas,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(RetencionesPorPagarPorCuentasConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(retencionesporpagarporcuentas.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(RetencionesPorPagarPorCuentasConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(retencionesporpagarporcuentas.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(RetencionesPorPagarPorCuentasConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(retencionesporpagarporcuentas.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(RetencionesPorPagarPorCuentasConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(retencionesporpagarporcuentas.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementejercicio_descripcion = document.createElement(RetencionesPorPagarPorCuentasConstantesFunciones.IDEJERCICIO);
		elementejercicio_descripcion.appendChild(document.createTextNode(retencionesporpagarporcuentas.getejercicio_descripcion()));
		element.appendChild(elementejercicio_descripcion);

		Element elementperiodo_descripcion = document.createElement(RetencionesPorPagarPorCuentasConstantesFunciones.IDPERIODO);
		elementperiodo_descripcion.appendChild(document.createTextNode(retencionesporpagarporcuentas.getperiodo_descripcion()));
		element.appendChild(elementperiodo_descripcion);

		Element elementtiporetencion_descripcion = document.createElement(RetencionesPorPagarPorCuentasConstantesFunciones.IDTIPORETENCION);
		elementtiporetencion_descripcion.appendChild(document.createTextNode(retencionesporpagarporcuentas.gettiporetencion_descripcion()));
		element.appendChild(elementtiporetencion_descripcion);

		Element elementes_debito = document.createElement(RetencionesPorPagarPorCuentasConstantesFunciones.ESDEBITO);
		elementes_debito.appendChild(document.createTextNode(retencionesporpagarporcuentas.getes_debito().toString().trim()));
		element.appendChild(elementes_debito);

		Element elementfecha_emision = document.createElement(RetencionesPorPagarPorCuentasConstantesFunciones.FECHAEMISION);
		elementfecha_emision.appendChild(document.createTextNode(retencionesporpagarporcuentas.getfecha_emision().toString().trim()));
		element.appendChild(elementfecha_emision);

		Element elementnombre_tipo_movimiento = document.createElement(RetencionesPorPagarPorCuentasConstantesFunciones.NOMBRETIPOMOVIMIENTO);
		elementnombre_tipo_movimiento.appendChild(document.createTextNode(retencionesporpagarporcuentas.getnombre_tipo_movimiento().trim()));
		element.appendChild(elementnombre_tipo_movimiento);

		Element elementnumero_mayor = document.createElement(RetencionesPorPagarPorCuentasConstantesFunciones.NUMEROMAYOR);
		elementnumero_mayor.appendChild(document.createTextNode(retencionesporpagarporcuentas.getnumero_mayor().trim()));
		element.appendChild(elementnumero_mayor);

		Element elementnombre_cuenta_contable_retencion = document.createElement(RetencionesPorPagarPorCuentasConstantesFunciones.NOMBRECUENTACONTABLERETENCION);
		elementnombre_cuenta_contable_retencion.appendChild(document.createTextNode(retencionesporpagarporcuentas.getnombre_cuenta_contable_retencion().trim()));
		element.appendChild(elementnombre_cuenta_contable_retencion);

		Element elementnumero_pre_impreso_factura = document.createElement(RetencionesPorPagarPorCuentasConstantesFunciones.NUMEROPREIMPRESOFACTURA);
		elementnumero_pre_impreso_factura.appendChild(document.createTextNode(retencionesporpagarporcuentas.getnumero_pre_impreso_factura().trim()));
		element.appendChild(elementnumero_pre_impreso_factura);

		Element elementporcentaje = document.createElement(RetencionesPorPagarPorCuentasConstantesFunciones.PORCENTAJE);
		elementporcentaje.appendChild(document.createTextNode(retencionesporpagarporcuentas.getporcentaje().toString().trim()));
		element.appendChild(elementporcentaje);

		Element elementbase_imponible = document.createElement(RetencionesPorPagarPorCuentasConstantesFunciones.BASEIMPONIBLE);
		elementbase_imponible.appendChild(document.createTextNode(retencionesporpagarporcuentas.getbase_imponible().toString().trim()));
		element.appendChild(elementbase_imponible);

		Element elementvalor = document.createElement(RetencionesPorPagarPorCuentasConstantesFunciones.VALOR);
		elementvalor.appendChild(document.createTextNode(retencionesporpagarporcuentas.getvalor().toString().trim()));
		element.appendChild(elementvalor);

		Element elementnumero = document.createElement(RetencionesPorPagarPorCuentasConstantesFunciones.NUMERO);
		elementnumero.appendChild(document.createTextNode(retencionesporpagarporcuentas.getnumero().trim()));
		element.appendChild(elementnumero);

		Element elementnombre_benef = document.createElement(RetencionesPorPagarPorCuentasConstantesFunciones.NOMBREBENEF);
		elementnombre_benef.appendChild(document.createTextNode(retencionesporpagarporcuentas.getnombre_benef().trim()));
		element.appendChild(elementnombre_benef);

		Element elementruc_benef = document.createElement(RetencionesPorPagarPorCuentasConstantesFunciones.RUCBENEF);
		elementruc_benef.appendChild(document.createTextNode(retencionesporpagarporcuentas.getruc_benef().trim()));
		element.appendChild(elementruc_benef);

		Element elementnombre_cuenta_contable = document.createElement(RetencionesPorPagarPorCuentasConstantesFunciones.NOMBRECUENTACONTABLE);
		elementnombre_cuenta_contable.appendChild(document.createTextNode(retencionesporpagarporcuentas.getnombre_cuenta_contable().trim()));
		element.appendChild(elementnombre_cuenta_contable);

		Element elementnombre_cuenta_contable_credito = document.createElement(RetencionesPorPagarPorCuentasConstantesFunciones.NOMBRECUENTACONTABLECREDITO);
		elementnombre_cuenta_contable_credito.appendChild(document.createTextNode(retencionesporpagarporcuentas.getnombre_cuenta_contable_credito().trim()));
		element.appendChild(elementnombre_cuenta_contable_credito);

		Element elementes_debito_dato = document.createElement(RetencionesPorPagarPorCuentasConstantesFunciones.ESDEBITODATO);
		elementes_debito_dato.appendChild(document.createTextNode(retencionesporpagarporcuentas.getes_debito_dato().toString().trim()));
		element.appendChild(elementes_debito_dato);
	}
	
	public void generarReporteGroupGenericoRetencionesPorPagarPorCuentassSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<RetencionesPorPagarPorCuentas> retencionesporpagarporcuentassSeleccionados=new ArrayList<RetencionesPorPagarPorCuentas>();
		
		retencionesporpagarporcuentassSeleccionados=this.getRetencionesPorPagarPorCuentassSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoRetencionesPorPagarPorCuentas(retencionesporpagarporcuentassSeleccionados);
		
		this.generarReporteRetencionesPorPagarPorCuentass("Todos",retencionesporpagarporcuentassSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoRetencionesPorPagarPorCuentas(ArrayList<RetencionesPorPagarPorCuentas> retencionesporpagarporcuentassSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(RetencionesPorPagarPorCuentas retencionesporpagarporcuentasAux:retencionesporpagarporcuentassSeleccionados) {
				retencionesporpagarporcuentasAux.setsDetalleGeneralEntityReporte(retencionesporpagarporcuentasAux.toString());
			
				if(sTipoSeleccionar.equals(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					retencionesporpagarporcuentasAux.setsDescripcionGeneralEntityReporte1(retencionesporpagarporcuentasAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					retencionesporpagarporcuentasAux.setsDescripcionGeneralEntityReporte1(retencionesporpagarporcuentasAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_IDEJERCICIO)) {
					existe=true;
					retencionesporpagarporcuentasAux.setsDescripcionGeneralEntityReporte1(retencionesporpagarporcuentasAux.getejercicio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_IDPERIODO)) {
					existe=true;
					retencionesporpagarporcuentasAux.setsDescripcionGeneralEntityReporte1(retencionesporpagarporcuentasAux.getperiodo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_IDTIPORETENCION)) {
					existe=true;
					retencionesporpagarporcuentasAux.setsDescripcionGeneralEntityReporte1(retencionesporpagarporcuentasAux.gettiporetencion_descripcion());
				}
				 else if(sTipoSeleccionar.equals(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_ESDEBITO)) {
					existe=true;
					retencionesporpagarporcuentasAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(retencionesporpagarporcuentasAux.getes_debito()));
				}
				 else if(sTipoSeleccionar.equals(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_FECHAEMISION)) {
					existe=true;
					retencionesporpagarporcuentasAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(retencionesporpagarporcuentasAux.getfecha_emision()));
				}
				 else if(sTipoSeleccionar.equals(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBRETIPOMOVIMIENTO)) {
					existe=true;
					retencionesporpagarporcuentasAux.setsDescripcionGeneralEntityReporte1(retencionesporpagarporcuentasAux.getnombre_tipo_movimiento());
				}
				 else if(sTipoSeleccionar.equals(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NUMEROMAYOR)) {
					existe=true;
					retencionesporpagarporcuentasAux.setsDescripcionGeneralEntityReporte1(retencionesporpagarporcuentasAux.getnumero_mayor());
				}
				 else if(sTipoSeleccionar.equals(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBRECUENTACONTABLERETENCION)) {
					existe=true;
					retencionesporpagarporcuentasAux.setsDescripcionGeneralEntityReporte1(retencionesporpagarporcuentasAux.getnombre_cuenta_contable_retencion());
				}
				 else if(sTipoSeleccionar.equals(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA)) {
					existe=true;
					retencionesporpagarporcuentasAux.setsDescripcionGeneralEntityReporte1(retencionesporpagarporcuentasAux.getnumero_pre_impreso_factura());
				}
				 else if(sTipoSeleccionar.equals(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NUMERO)) {
					existe=true;
					retencionesporpagarporcuentasAux.setsDescripcionGeneralEntityReporte1(retencionesporpagarporcuentasAux.getnumero());
				}
				 else if(sTipoSeleccionar.equals(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBREBENEF)) {
					existe=true;
					retencionesporpagarporcuentasAux.setsDescripcionGeneralEntityReporte1(retencionesporpagarporcuentasAux.getnombre_benef());
				}
				 else if(sTipoSeleccionar.equals(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_RUCBENEF)) {
					existe=true;
					retencionesporpagarporcuentasAux.setsDescripcionGeneralEntityReporte1(retencionesporpagarporcuentasAux.getruc_benef());
				}
				 else if(sTipoSeleccionar.equals(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBRECUENTACONTABLE)) {
					existe=true;
					retencionesporpagarporcuentasAux.setsDescripcionGeneralEntityReporte1(retencionesporpagarporcuentasAux.getnombre_cuenta_contable());
				}
				 else if(sTipoSeleccionar.equals(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_NOMBRECUENTACONTABLECREDITO)) {
					existe=true;
					retencionesporpagarporcuentasAux.setsDescripcionGeneralEntityReporte1(retencionesporpagarporcuentasAux.getnombre_cuenta_contable_credito());
				}
				 else if(sTipoSeleccionar.equals(RetencionesPorPagarPorCuentasConstantesFunciones.LABEL_ESDEBITODATO)) {
					existe=true;
					retencionesporpagarporcuentasAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(retencionesporpagarporcuentasAux.getes_debito_dato()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionesPorPagarPorCuentasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesRetencionesPorPagarPorCuentas(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoRetencionesPorPagarPorCuentas=true;
				this.isVisibilidadCeldaNuevoRelacionesRetencionesPorPagarPorCuentas=true;
				this.isVisibilidadCeldaGuardarCambiosRetencionesPorPagarPorCuentas=true;
			}
			
			this.isVisibilidadCeldaModificarRetencionesPorPagarPorCuentas=false;
			this.isVisibilidadCeldaActualizarRetencionesPorPagarPorCuentas=false;
			this.isVisibilidadCeldaEliminarRetencionesPorPagarPorCuentas=false;
			this.isVisibilidadCeldaCancelarRetencionesPorPagarPorCuentas=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRetencionesPorPagarPorCuentas=true;
				} else {
					this.isVisibilidadCeldaGuardarRetencionesPorPagarPorCuentas=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoRetencionesPorPagarPorCuentas=false;
			this.isVisibilidadCeldaNuevoRelacionesRetencionesPorPagarPorCuentas=false;
			this.isVisibilidadCeldaGuardarCambiosRetencionesPorPagarPorCuentas=false;
			this.isVisibilidadCeldaModificarRetencionesPorPagarPorCuentas=false;
			this.isVisibilidadCeldaActualizarRetencionesPorPagarPorCuentas=true;
			this.isVisibilidadCeldaEliminarRetencionesPorPagarPorCuentas=false;
			this.isVisibilidadCeldaCancelarRetencionesPorPagarPorCuentas=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRetencionesPorPagarPorCuentas=true;
				} else {
					this.isVisibilidadCeldaGuardarRetencionesPorPagarPorCuentas=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoRetencionesPorPagarPorCuentas=false;
			this.isVisibilidadCeldaNuevoRelacionesRetencionesPorPagarPorCuentas=false;
			this.isVisibilidadCeldaGuardarCambiosRetencionesPorPagarPorCuentas=false;
			this.isVisibilidadCeldaModificarRetencionesPorPagarPorCuentas=false;
			this.isVisibilidadCeldaActualizarRetencionesPorPagarPorCuentas=true;
			this.isVisibilidadCeldaEliminarRetencionesPorPagarPorCuentas=true;
			this.isVisibilidadCeldaCancelarRetencionesPorPagarPorCuentas=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRetencionesPorPagarPorCuentas=true;
				} else {
					this.isVisibilidadCeldaGuardarRetencionesPorPagarPorCuentas=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoRetencionesPorPagarPorCuentas=false;
			this.isVisibilidadCeldaNuevoRelacionesRetencionesPorPagarPorCuentas=false;
			this.isVisibilidadCeldaGuardarCambiosRetencionesPorPagarPorCuentas=false;
			this.isVisibilidadCeldaModificarRetencionesPorPagarPorCuentas=false;
			this.isVisibilidadCeldaActualizarRetencionesPorPagarPorCuentas=true;
			this.isVisibilidadCeldaEliminarRetencionesPorPagarPorCuentas=false;
			this.isVisibilidadCeldaCancelarRetencionesPorPagarPorCuentas=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRetencionesPorPagarPorCuentas=false;
				} else {
					this.isVisibilidadCeldaGuardarRetencionesPorPagarPorCuentas=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoRetencionesPorPagarPorCuentas=true;
			this.isVisibilidadCeldaNuevoRelacionesRetencionesPorPagarPorCuentas=true;
			this.isVisibilidadCeldaGuardarCambiosRetencionesPorPagarPorCuentas=true;
			this.isVisibilidadCeldaModificarRetencionesPorPagarPorCuentas=false;
			this.isVisibilidadCeldaActualizarRetencionesPorPagarPorCuentas=false;
			this.isVisibilidadCeldaEliminarRetencionesPorPagarPorCuentas=false;
			this.isVisibilidadCeldaCancelarRetencionesPorPagarPorCuentas=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRetencionesPorPagarPorCuentas=true;
				} else {
					this.isVisibilidadCeldaGuardarRetencionesPorPagarPorCuentas=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoRetencionesPorPagarPorCuentas=false;
			this.isVisibilidadCeldaNuevoRelacionesRetencionesPorPagarPorCuentas=false;
			this.isVisibilidadCeldaGuardarCambiosRetencionesPorPagarPorCuentas=false;
			this.isVisibilidadCeldaActualizarRetencionesPorPagarPorCuentas=false;
			this.isVisibilidadCeldaEliminarRetencionesPorPagarPorCuentas=false;
			this.isVisibilidadCeldaCancelarRetencionesPorPagarPorCuentas=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRetencionesPorPagarPorCuentas=false;
				} else {
					this.isVisibilidadCeldaGuardarRetencionesPorPagarPorCuentas=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoRetencionesPorPagarPorCuentas=false;
			this.isVisibilidadCeldaNuevoRelacionesRetencionesPorPagarPorCuentas=false;
			this.isVisibilidadCeldaGuardarCambiosRetencionesPorPagarPorCuentas=false;
			this.isVisibilidadCeldaModificarRetencionesPorPagarPorCuentas=true;
			this.isVisibilidadCeldaActualizarRetencionesPorPagarPorCuentas=false;
			this.isVisibilidadCeldaEliminarRetencionesPorPagarPorCuentas=false;
			this.isVisibilidadCeldaCancelarRetencionesPorPagarPorCuentas=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRetencionesPorPagarPorCuentas=false;
				} else {
					this.isVisibilidadCeldaGuardarRetencionesPorPagarPorCuentas=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(RetencionesPorPagarPorCuentasJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoRetencionesPorPagarPorCuentas=true;
			this.isVisibilidadCeldaNuevoRelacionesRetencionesPorPagarPorCuentas=true;
			this.isVisibilidadCeldaGuardarCambiosRetencionesPorPagarPorCuentas=true;
		} else {
			this.actualizarEstadoPanelsRetencionesPorPagarPorCuentas(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarRetencionesPorPagarPorCuentas=false;
			//this.isVisibilidadCeldaVerFormRetencionesPorPagarPorCuentas=false;
			this.isVisibilidadCeldaDuplicarRetencionesPorPagarPorCuentas=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!retencionesporpagarporcuentasSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesRetencionesPorPagarPorCuentas=false;
		} else {
			this.isVisibilidadCeldaNuevoRetencionesPorPagarPorCuentas=false;
			this.isVisibilidadCeldaGuardarCambiosRetencionesPorPagarPorCuentas=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado()) {
			if(!retencionesporpagarporcuentasSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesRetencionesPorPagarPorCuentas=false;												
			}
			
			this.jButtonCerrarRetencionesPorPagarPorCuentas.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesRetencionesPorPagarPorCuentas=false;
		}
		
		if(!this.permiteMantenimiento(this.retencionesporpagarporcuentas)) {
			this.isVisibilidadCeldaActualizarRetencionesPorPagarPorCuentas=false;
			this.isVisibilidadCeldaEliminarRetencionesPorPagarPorCuentas=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoRetencionesPorPagarPorCuentas=false;
		this.isVisibilidadCeldaNuevoRelacionesRetencionesPorPagarPorCuentas=false;
		this.isVisibilidadCeldaGuardarCambiosRetencionesPorPagarPorCuentas=false;
		//this.isVisibilidadCeldaModificarRetencionesPorPagarPorCuentas=true;
		this.isVisibilidadCeldaActualizarRetencionesPorPagarPorCuentas=false;
		this.isVisibilidadCeldaEliminarRetencionesPorPagarPorCuentas=false;
		//this.isVisibilidadCeldaCancelarRetencionesPorPagarPorCuentas=true;			
		this.isVisibilidadCeldaGuardarRetencionesPorPagarPorCuentas=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesRetencionesPorPagarPorCuentas() {
	}
	
	public void actualizarEstadoPanelsRetencionesPorPagarPorCuentas(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionRetencionesPorPagarPorCuentas!=null) {
				this.jScrollPanelDatosEdicionRetencionesPorPagarPorCuentas.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRetencionesPorPagarPorCuentas!=null) {
				this.jTabbedPaneBusquedasRetencionesPorPagarPorCuentas.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosRetencionesPorPagarPorCuentas!=null) {
				this.jScrollPanelDatosRetencionesPorPagarPorCuentas.setVisible(true);
			}
			
			if(this.jPanelPaginacionRetencionesPorPagarPorCuentas!=null) {
				this.jPanelPaginacionRetencionesPorPagarPorCuentas.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesRetencionesPorPagarPorCuentas!=null) {
				this.jPanelParametrosReportesRetencionesPorPagarPorCuentas.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionRetencionesPorPagarPorCuentas!=null) {
				this.jScrollPanelDatosEdicionRetencionesPorPagarPorCuentas.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRetencionesPorPagarPorCuentas!=null) {
				this.jTabbedPaneBusquedasRetencionesPorPagarPorCuentas.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosRetencionesPorPagarPorCuentas!=null) {
				this.jScrollPanelDatosRetencionesPorPagarPorCuentas.setVisible(false);
			}
			
			if(this.jPanelPaginacionRetencionesPorPagarPorCuentas!=null) {
				this.jPanelPaginacionRetencionesPorPagarPorCuentas.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesRetencionesPorPagarPorCuentas!=null) {
				this.jPanelParametrosReportesRetencionesPorPagarPorCuentas.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionRetencionesPorPagarPorCuentas!=null) {
				this.jScrollPanelDatosEdicionRetencionesPorPagarPorCuentas.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRetencionesPorPagarPorCuentas!=null) {
				this.jTabbedPaneBusquedasRetencionesPorPagarPorCuentas.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosRetencionesPorPagarPorCuentas!=null) {
				this.jScrollPanelDatosRetencionesPorPagarPorCuentas.setVisible(false);
			}
			
			if(this.jPanelPaginacionRetencionesPorPagarPorCuentas!=null) {
				this.jPanelPaginacionRetencionesPorPagarPorCuentas.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesRetencionesPorPagarPorCuentas!=null) {
				this.jPanelParametrosReportesRetencionesPorPagarPorCuentas.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionRetencionesPorPagarPorCuentas!=null) {
				this.jScrollPanelDatosEdicionRetencionesPorPagarPorCuentas.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRetencionesPorPagarPorCuentas!=null) {
				this.jTabbedPaneBusquedasRetencionesPorPagarPorCuentas.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosRetencionesPorPagarPorCuentas!=null) {
				this.jScrollPanelDatosRetencionesPorPagarPorCuentas.setVisible(false);
			}
			
			if(this.jPanelPaginacionRetencionesPorPagarPorCuentas!=null) {
				this.jPanelPaginacionRetencionesPorPagarPorCuentas.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesRetencionesPorPagarPorCuentas!=null) {
				this.jPanelParametrosReportesRetencionesPorPagarPorCuentas.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionRetencionesPorPagarPorCuentas!=null) {
				this.jScrollPanelDatosEdicionRetencionesPorPagarPorCuentas.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRetencionesPorPagarPorCuentas!=null) {
				this.jTabbedPaneBusquedasRetencionesPorPagarPorCuentas.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosRetencionesPorPagarPorCuentas!=null) {
				this.jScrollPanelDatosRetencionesPorPagarPorCuentas.setVisible(true);
			}
			
			if(this.jPanelPaginacionRetencionesPorPagarPorCuentas!=null) {
				this.jPanelPaginacionRetencionesPorPagarPorCuentas.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesRetencionesPorPagarPorCuentas!=null) {
				this.jPanelParametrosReportesRetencionesPorPagarPorCuentas.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionRetencionesPorPagarPorCuentas!=null) {
				this.jScrollPanelDatosEdicionRetencionesPorPagarPorCuentas.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRetencionesPorPagarPorCuentas!=null) {
				this.jTabbedPaneBusquedasRetencionesPorPagarPorCuentas.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosRetencionesPorPagarPorCuentas!=null) {
				this.jScrollPanelDatosRetencionesPorPagarPorCuentas.setVisible(true);
			}
			
			if(this.jPanelPaginacionRetencionesPorPagarPorCuentas!=null) {
				this.jPanelPaginacionRetencionesPorPagarPorCuentas.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesRetencionesPorPagarPorCuentas!=null) {
				this.jPanelParametrosReportesRetencionesPorPagarPorCuentas.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionRetencionesPorPagarPorCuentas!=null) {
				this.jScrollPanelDatosEdicionRetencionesPorPagarPorCuentas.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRetencionesPorPagarPorCuentas!=null) {
				this.jTabbedPaneBusquedasRetencionesPorPagarPorCuentas.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosRetencionesPorPagarPorCuentas!=null) {
				this.jScrollPanelDatosRetencionesPorPagarPorCuentas.setVisible(true);
			}
			
			if(this.jPanelPaginacionRetencionesPorPagarPorCuentas!=null) {
				this.jPanelPaginacionRetencionesPorPagarPorCuentas.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesRetencionesPorPagarPorCuentas!=null) {
				this.jPanelParametrosReportesRetencionesPorPagarPorCuentas.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasRetencionesPorPagarPorCuentas!=null) {
					this.jTabbedPaneBusquedasRetencionesPorPagarPorCuentas.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesRetencionesPorPagarPorCuentas!=null) {
				this.jPanelParametrosReportesRetencionesPorPagarPorCuentas.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.retencionesporpagarporcuentasSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRetencionesPorPagarPorCuentas!=null) {
				this.jTabbedPaneBusquedasRetencionesPorPagarPorCuentas.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesRetencionesPorPagarPorCuentas!=null) {
				this.jPanelParametrosReportesRetencionesPorPagarPorCuentas.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaRetencionesPorPagarPorCuentas=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaRetencionesPorPagarPorCuentas) {this.jTabbedPaneBusquedasRetencionesPorPagarPorCuentas.remove(jPanelBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadBusquedaRetencionesPorPagarPorCuentas=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaRetencionesPorPagarPorCuentas) {this.jTabbedPaneBusquedasRetencionesPorPagarPorCuentas.remove(jPanelBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas);}
		}
		
	}

	public void setVisibilidadBusquedasParaEjercicio(Boolean isParaEjercicio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEjercicioNegation=!isParaEjercicio;

			this.isVisibilidadBusquedaRetencionesPorPagarPorCuentas=isParaEjercicio;
			if(!this.isVisibilidadBusquedaRetencionesPorPagarPorCuentas) {this.jTabbedPaneBusquedasRetencionesPorPagarPorCuentas.remove(jPanelBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas);}
		}
		
	}

	public void setVisibilidadBusquedasParaPeriodo(Boolean isParaPeriodo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPeriodoNegation=!isParaPeriodo;

			this.isVisibilidadBusquedaRetencionesPorPagarPorCuentas=isParaPeriodo;
			if(!this.isVisibilidadBusquedaRetencionesPorPagarPorCuentas) {this.jTabbedPaneBusquedasRetencionesPorPagarPorCuentas.remove(jPanelBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoRetencion(Boolean isParaTipoRetencion){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoRetencionNegation=!isParaTipoRetencion;

			this.isVisibilidadBusquedaRetencionesPorPagarPorCuentas=isParaTipoRetencion;
			if(!this.isVisibilidadBusquedaRetencionesPorPagarPorCuentas) {this.jTabbedPaneBusquedasRetencionesPorPagarPorCuentas.remove(jPanelBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas);}
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
			
			this.inicializarActualizarBindingTablaRetencionesPorPagarPorCuentas(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioRetencionesPorPagarPorCuentas() {
		this.updateBorderResaltarBusquedasFormularioRetencionesPorPagarPorCuentas();
		this.updateVisibilidadBusquedasFormularioRetencionesPorPagarPorCuentas();
		this.updateHabilitarBusquedasFormularioRetencionesPorPagarPorCuentas();
	}
	
	public void updateBorderResaltarBusquedasFormularioRetencionesPorPagarPorCuentas() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasRetencionesPorPagarPorCuentas.getComponents().length>0) {
	

		if(this.retencionesporpagarporcuentasConstantesFunciones.resaltarBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas!=null) {
			index= this.jTabbedPaneBusquedasRetencionesPorPagarPorCuentas.indexOfComponent(this.jPanelBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRetencionesPorPagarPorCuentas.getComponent(index);
				jPanel.setBorder(this.retencionesporpagarporcuentasConstantesFunciones.resaltarBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioRetencionesPorPagarPorCuentas() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasRetencionesPorPagarPorCuentas.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasRetencionesPorPagarPorCuentas.indexOfComponent(this.jPanelBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas);
			jPanel=(JPanel)this.jTabbedPaneBusquedasRetencionesPorPagarPorCuentas.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.retencionesporpagarporcuentasConstantesFunciones.mostrarBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas);
			if(!this.retencionesporpagarporcuentasConstantesFunciones.mostrarBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas && index>-1) {
				this.jTabbedPaneBusquedasRetencionesPorPagarPorCuentas.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioRetencionesPorPagarPorCuentas() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasRetencionesPorPagarPorCuentas.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasRetencionesPorPagarPorCuentas.indexOfComponent(this.jPanelBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasRetencionesPorPagarPorCuentas.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.retencionesporpagarporcuentasConstantesFunciones.activarBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas);
				this.jTabbedPaneBusquedasRetencionesPorPagarPorCuentas.setEnabledAt(index,this.retencionesporpagarporcuentasConstantesFunciones.activarBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaRetencionesPorPagarPorCuentas(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaRetencionesPorPagarPorCuentas")) {
			index= this.jTabbedPaneBusquedasRetencionesPorPagarPorCuentas.indexOfComponent(this.jPanelBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas);

			this.jTabbedPaneBusquedasRetencionesPorPagarPorCuentas.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRetencionesPorPagarPorCuentas.getComponent(index);

			this.retencionesporpagarporcuentasConstantesFunciones.setResaltarBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas(resaltar);

			jPanel.setBorder(this.retencionesporpagarporcuentasConstantesFunciones.resaltarBusquedaRetencionesPorPagarPorCuentasRetencionesPorPagarPorCuentas);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarRetencionesPorPagarPorCuentas.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioRetencionesPorPagarPorCuentas() throws Exception {

		if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioRetencionesPorPagarPorCuentas();
		this.updateVisibilidadResaltarControlesFormularioRetencionesPorPagarPorCuentas();
		this.updateHabilitarResaltarControlesFormularioRetencionesPorPagarPorCuentas();
		
	}
	
	public void updateBorderResaltarControlesFormularioRetencionesPorPagarPorCuentas() throws Exception {
		if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.retencionesporpagarporcuentasConstantesFunciones.resaltaridRetencionesPorPagarPorCuentas!=null && this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) {this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jLabelidRetencionesPorPagarPorCuentas.setBorder(this.retencionesporpagarporcuentasConstantesFunciones.resaltaridRetencionesPorPagarPorCuentas);}
		if(this.retencionesporpagarporcuentasConstantesFunciones.resaltarid_empresaRetencionesPorPagarPorCuentas!=null && this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) {this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxid_empresaRetencionesPorPagarPorCuentas.setBorder(this.retencionesporpagarporcuentasConstantesFunciones.resaltarid_empresaRetencionesPorPagarPorCuentas);}
		if(this.retencionesporpagarporcuentasConstantesFunciones.resaltarid_sucursalRetencionesPorPagarPorCuentas!=null && this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) {this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxid_sucursalRetencionesPorPagarPorCuentas.setBorder(this.retencionesporpagarporcuentasConstantesFunciones.resaltarid_sucursalRetencionesPorPagarPorCuentas);}
		if(this.retencionesporpagarporcuentasConstantesFunciones.resaltarid_ejercicioRetencionesPorPagarPorCuentas!=null && this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) {this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxid_ejercicioRetencionesPorPagarPorCuentas.setBorder(this.retencionesporpagarporcuentasConstantesFunciones.resaltarid_ejercicioRetencionesPorPagarPorCuentas);}
		if(this.retencionesporpagarporcuentasConstantesFunciones.resaltarid_periodoRetencionesPorPagarPorCuentas!=null && this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) {this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxid_periodoRetencionesPorPagarPorCuentas.setBorder(this.retencionesporpagarporcuentasConstantesFunciones.resaltarid_periodoRetencionesPorPagarPorCuentas);}
		if(this.retencionesporpagarporcuentasConstantesFunciones.resaltarid_tipo_retencionRetencionesPorPagarPorCuentas!=null && this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) {this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxid_tipo_retencionRetencionesPorPagarPorCuentas.setBorder(this.retencionesporpagarporcuentasConstantesFunciones.resaltarid_tipo_retencionRetencionesPorPagarPorCuentas);}
		if(this.retencionesporpagarporcuentasConstantesFunciones.resaltares_debitoRetencionesPorPagarPorCuentas!=null && this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) {this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jCheckBoxes_debitoRetencionesPorPagarPorCuentas.setBorderPainted(true);this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jCheckBoxes_debitoRetencionesPorPagarPorCuentas.setBorder(this.retencionesporpagarporcuentasConstantesFunciones.resaltares_debitoRetencionesPorPagarPorCuentas);}
		if(this.retencionesporpagarporcuentasConstantesFunciones.resaltarfecha_emisionRetencionesPorPagarPorCuentas!=null && this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) {this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jDateChooserfecha_emisionRetencionesPorPagarPorCuentas.setBorder(this.retencionesporpagarporcuentasConstantesFunciones.resaltarfecha_emisionRetencionesPorPagarPorCuentas);}
		if(this.retencionesporpagarporcuentasConstantesFunciones.resaltarnombre_tipo_movimientoRetencionesPorPagarPorCuentas!=null && this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) {this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextAreanombre_tipo_movimientoRetencionesPorPagarPorCuentas.setBorder(this.retencionesporpagarporcuentasConstantesFunciones.resaltarnombre_tipo_movimientoRetencionesPorPagarPorCuentas);}
		if(this.retencionesporpagarporcuentasConstantesFunciones.resaltarnumero_mayorRetencionesPorPagarPorCuentas!=null && this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) {this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextAreanumero_mayorRetencionesPorPagarPorCuentas.setBorder(this.retencionesporpagarporcuentasConstantesFunciones.resaltarnumero_mayorRetencionesPorPagarPorCuentas);}
		if(this.retencionesporpagarporcuentasConstantesFunciones.resaltarnombre_cuenta_contable_retencionRetencionesPorPagarPorCuentas!=null && this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) {this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextAreanombre_cuenta_contable_retencionRetencionesPorPagarPorCuentas.setBorder(this.retencionesporpagarporcuentasConstantesFunciones.resaltarnombre_cuenta_contable_retencionRetencionesPorPagarPorCuentas);}
		if(this.retencionesporpagarporcuentasConstantesFunciones.resaltarnumero_pre_impreso_facturaRetencionesPorPagarPorCuentas!=null && this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) {this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextFieldnumero_pre_impreso_facturaRetencionesPorPagarPorCuentas.setBorder(this.retencionesporpagarporcuentasConstantesFunciones.resaltarnumero_pre_impreso_facturaRetencionesPorPagarPorCuentas);}
		if(this.retencionesporpagarporcuentasConstantesFunciones.resaltarporcentajeRetencionesPorPagarPorCuentas!=null && this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) {this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextFieldporcentajeRetencionesPorPagarPorCuentas.setBorder(this.retencionesporpagarporcuentasConstantesFunciones.resaltarporcentajeRetencionesPorPagarPorCuentas);}
		if(this.retencionesporpagarporcuentasConstantesFunciones.resaltarbase_imponibleRetencionesPorPagarPorCuentas!=null && this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) {this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextFieldbase_imponibleRetencionesPorPagarPorCuentas.setBorder(this.retencionesporpagarporcuentasConstantesFunciones.resaltarbase_imponibleRetencionesPorPagarPorCuentas);}
		if(this.retencionesporpagarporcuentasConstantesFunciones.resaltarvalorRetencionesPorPagarPorCuentas!=null && this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) {this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextFieldvalorRetencionesPorPagarPorCuentas.setBorder(this.retencionesporpagarporcuentasConstantesFunciones.resaltarvalorRetencionesPorPagarPorCuentas);}
		if(this.retencionesporpagarporcuentasConstantesFunciones.resaltarnumeroRetencionesPorPagarPorCuentas!=null && this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) {this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextFieldnumeroRetencionesPorPagarPorCuentas.setBorder(this.retencionesporpagarporcuentasConstantesFunciones.resaltarnumeroRetencionesPorPagarPorCuentas);}
		if(this.retencionesporpagarporcuentasConstantesFunciones.resaltarnombre_benefRetencionesPorPagarPorCuentas!=null && this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) {this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextAreanombre_benefRetencionesPorPagarPorCuentas.setBorder(this.retencionesporpagarporcuentasConstantesFunciones.resaltarnombre_benefRetencionesPorPagarPorCuentas);}
		if(this.retencionesporpagarporcuentasConstantesFunciones.resaltarruc_benefRetencionesPorPagarPorCuentas!=null && this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) {this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextFieldruc_benefRetencionesPorPagarPorCuentas.setBorder(this.retencionesporpagarporcuentasConstantesFunciones.resaltarruc_benefRetencionesPorPagarPorCuentas);}
		if(this.retencionesporpagarporcuentasConstantesFunciones.resaltarnombre_cuenta_contableRetencionesPorPagarPorCuentas!=null && this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) {this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextAreanombre_cuenta_contableRetencionesPorPagarPorCuentas.setBorder(this.retencionesporpagarporcuentasConstantesFunciones.resaltarnombre_cuenta_contableRetencionesPorPagarPorCuentas);}
		if(this.retencionesporpagarporcuentasConstantesFunciones.resaltarnombre_cuenta_contable_creditoRetencionesPorPagarPorCuentas!=null && this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) {this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextAreanombre_cuenta_contable_creditoRetencionesPorPagarPorCuentas.setBorder(this.retencionesporpagarporcuentasConstantesFunciones.resaltarnombre_cuenta_contable_creditoRetencionesPorPagarPorCuentas);}
		if(this.retencionesporpagarporcuentasConstantesFunciones.resaltares_debito_datoRetencionesPorPagarPorCuentas!=null && this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) {this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jCheckBoxes_debito_datoRetencionesPorPagarPorCuentas.setBorderPainted(true);this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jCheckBoxes_debito_datoRetencionesPorPagarPorCuentas.setBorder(this.retencionesporpagarporcuentasConstantesFunciones.resaltares_debito_datoRetencionesPorPagarPorCuentas);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioRetencionesPorPagarPorCuentas() throws Exception {		
		if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) {
	
		//this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jLabelidRetencionesPorPagarPorCuentas.setVisible(this.retencionesporpagarporcuentasConstantesFunciones.mostraridRetencionesPorPagarPorCuentas);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jPanelidRetencionesPorPagarPorCuentas.setVisible(this.retencionesporpagarporcuentasConstantesFunciones.mostraridRetencionesPorPagarPorCuentas);
		//this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxid_empresaRetencionesPorPagarPorCuentas.setVisible(this.retencionesporpagarporcuentasConstantesFunciones.mostrarid_empresaRetencionesPorPagarPorCuentas);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jPanelid_empresaRetencionesPorPagarPorCuentas.setVisible(this.retencionesporpagarporcuentasConstantesFunciones.mostrarid_empresaRetencionesPorPagarPorCuentas);
		//this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxid_sucursalRetencionesPorPagarPorCuentas.setVisible(this.retencionesporpagarporcuentasConstantesFunciones.mostrarid_sucursalRetencionesPorPagarPorCuentas);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jPanelid_sucursalRetencionesPorPagarPorCuentas.setVisible(this.retencionesporpagarporcuentasConstantesFunciones.mostrarid_sucursalRetencionesPorPagarPorCuentas);
		//this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxid_ejercicioRetencionesPorPagarPorCuentas.setVisible(this.retencionesporpagarporcuentasConstantesFunciones.mostrarid_ejercicioRetencionesPorPagarPorCuentas);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jPanelid_ejercicioRetencionesPorPagarPorCuentas.setVisible(this.retencionesporpagarporcuentasConstantesFunciones.mostrarid_ejercicioRetencionesPorPagarPorCuentas);
		//this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxid_periodoRetencionesPorPagarPorCuentas.setVisible(this.retencionesporpagarporcuentasConstantesFunciones.mostrarid_periodoRetencionesPorPagarPorCuentas);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jPanelid_periodoRetencionesPorPagarPorCuentas.setVisible(this.retencionesporpagarporcuentasConstantesFunciones.mostrarid_periodoRetencionesPorPagarPorCuentas);
		//this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxid_tipo_retencionRetencionesPorPagarPorCuentas.setVisible(this.retencionesporpagarporcuentasConstantesFunciones.mostrarid_tipo_retencionRetencionesPorPagarPorCuentas);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jPanelid_tipo_retencionRetencionesPorPagarPorCuentas.setVisible(this.retencionesporpagarporcuentasConstantesFunciones.mostrarid_tipo_retencionRetencionesPorPagarPorCuentas);
		//this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jCheckBoxes_debitoRetencionesPorPagarPorCuentas.setVisible(this.retencionesporpagarporcuentasConstantesFunciones.mostrares_debitoRetencionesPorPagarPorCuentas);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jPaneles_debitoRetencionesPorPagarPorCuentas.setVisible(this.retencionesporpagarporcuentasConstantesFunciones.mostrares_debitoRetencionesPorPagarPorCuentas);
		//this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jDateChooserfecha_emisionRetencionesPorPagarPorCuentas.setVisible(this.retencionesporpagarporcuentasConstantesFunciones.mostrarfecha_emisionRetencionesPorPagarPorCuentas);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jPanelfecha_emisionRetencionesPorPagarPorCuentas.setVisible(this.retencionesporpagarporcuentasConstantesFunciones.mostrarfecha_emisionRetencionesPorPagarPorCuentas);
		//this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextAreanombre_tipo_movimientoRetencionesPorPagarPorCuentas.setVisible(this.retencionesporpagarporcuentasConstantesFunciones.mostrarnombre_tipo_movimientoRetencionesPorPagarPorCuentas);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jPanelnombre_tipo_movimientoRetencionesPorPagarPorCuentas.setVisible(this.retencionesporpagarporcuentasConstantesFunciones.mostrarnombre_tipo_movimientoRetencionesPorPagarPorCuentas);
		//this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextAreanumero_mayorRetencionesPorPagarPorCuentas.setVisible(this.retencionesporpagarporcuentasConstantesFunciones.mostrarnumero_mayorRetencionesPorPagarPorCuentas);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jPanelnumero_mayorRetencionesPorPagarPorCuentas.setVisible(this.retencionesporpagarporcuentasConstantesFunciones.mostrarnumero_mayorRetencionesPorPagarPorCuentas);
		//this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextAreanombre_cuenta_contable_retencionRetencionesPorPagarPorCuentas.setVisible(this.retencionesporpagarporcuentasConstantesFunciones.mostrarnombre_cuenta_contable_retencionRetencionesPorPagarPorCuentas);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jPanelnombre_cuenta_contable_retencionRetencionesPorPagarPorCuentas.setVisible(this.retencionesporpagarporcuentasConstantesFunciones.mostrarnombre_cuenta_contable_retencionRetencionesPorPagarPorCuentas);
		//this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextFieldnumero_pre_impreso_facturaRetencionesPorPagarPorCuentas.setVisible(this.retencionesporpagarporcuentasConstantesFunciones.mostrarnumero_pre_impreso_facturaRetencionesPorPagarPorCuentas);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jPanelnumero_pre_impreso_facturaRetencionesPorPagarPorCuentas.setVisible(this.retencionesporpagarporcuentasConstantesFunciones.mostrarnumero_pre_impreso_facturaRetencionesPorPagarPorCuentas);
		//this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextFieldporcentajeRetencionesPorPagarPorCuentas.setVisible(this.retencionesporpagarporcuentasConstantesFunciones.mostrarporcentajeRetencionesPorPagarPorCuentas);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jPanelporcentajeRetencionesPorPagarPorCuentas.setVisible(this.retencionesporpagarporcuentasConstantesFunciones.mostrarporcentajeRetencionesPorPagarPorCuentas);
		//this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextFieldbase_imponibleRetencionesPorPagarPorCuentas.setVisible(this.retencionesporpagarporcuentasConstantesFunciones.mostrarbase_imponibleRetencionesPorPagarPorCuentas);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jPanelbase_imponibleRetencionesPorPagarPorCuentas.setVisible(this.retencionesporpagarporcuentasConstantesFunciones.mostrarbase_imponibleRetencionesPorPagarPorCuentas);
		//this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextFieldvalorRetencionesPorPagarPorCuentas.setVisible(this.retencionesporpagarporcuentasConstantesFunciones.mostrarvalorRetencionesPorPagarPorCuentas);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jPanelvalorRetencionesPorPagarPorCuentas.setVisible(this.retencionesporpagarporcuentasConstantesFunciones.mostrarvalorRetencionesPorPagarPorCuentas);
		//this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextFieldnumeroRetencionesPorPagarPorCuentas.setVisible(this.retencionesporpagarporcuentasConstantesFunciones.mostrarnumeroRetencionesPorPagarPorCuentas);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jPanelnumeroRetencionesPorPagarPorCuentas.setVisible(this.retencionesporpagarporcuentasConstantesFunciones.mostrarnumeroRetencionesPorPagarPorCuentas);
		//this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextAreanombre_benefRetencionesPorPagarPorCuentas.setVisible(this.retencionesporpagarporcuentasConstantesFunciones.mostrarnombre_benefRetencionesPorPagarPorCuentas);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jPanelnombre_benefRetencionesPorPagarPorCuentas.setVisible(this.retencionesporpagarporcuentasConstantesFunciones.mostrarnombre_benefRetencionesPorPagarPorCuentas);
		//this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextFieldruc_benefRetencionesPorPagarPorCuentas.setVisible(this.retencionesporpagarporcuentasConstantesFunciones.mostrarruc_benefRetencionesPorPagarPorCuentas);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jPanelruc_benefRetencionesPorPagarPorCuentas.setVisible(this.retencionesporpagarporcuentasConstantesFunciones.mostrarruc_benefRetencionesPorPagarPorCuentas);
		//this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextAreanombre_cuenta_contableRetencionesPorPagarPorCuentas.setVisible(this.retencionesporpagarporcuentasConstantesFunciones.mostrarnombre_cuenta_contableRetencionesPorPagarPorCuentas);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jPanelnombre_cuenta_contableRetencionesPorPagarPorCuentas.setVisible(this.retencionesporpagarporcuentasConstantesFunciones.mostrarnombre_cuenta_contableRetencionesPorPagarPorCuentas);
		//this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextAreanombre_cuenta_contable_creditoRetencionesPorPagarPorCuentas.setVisible(this.retencionesporpagarporcuentasConstantesFunciones.mostrarnombre_cuenta_contable_creditoRetencionesPorPagarPorCuentas);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jPanelnombre_cuenta_contable_creditoRetencionesPorPagarPorCuentas.setVisible(this.retencionesporpagarporcuentasConstantesFunciones.mostrarnombre_cuenta_contable_creditoRetencionesPorPagarPorCuentas);
		//this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jCheckBoxes_debito_datoRetencionesPorPagarPorCuentas.setVisible(this.retencionesporpagarporcuentasConstantesFunciones.mostrares_debito_datoRetencionesPorPagarPorCuentas);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jPaneles_debito_datoRetencionesPorPagarPorCuentas.setVisible(this.retencionesporpagarporcuentasConstantesFunciones.mostrares_debito_datoRetencionesPorPagarPorCuentas);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioRetencionesPorPagarPorCuentas() throws Exception {
		if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas!=null) {
	
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jLabelidRetencionesPorPagarPorCuentas.setEnabled(this.retencionesporpagarporcuentasConstantesFunciones.activaridRetencionesPorPagarPorCuentas);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxid_empresaRetencionesPorPagarPorCuentas.setEnabled(this.retencionesporpagarporcuentasConstantesFunciones.activarid_empresaRetencionesPorPagarPorCuentas);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxid_sucursalRetencionesPorPagarPorCuentas.setEnabled(this.retencionesporpagarporcuentasConstantesFunciones.activarid_sucursalRetencionesPorPagarPorCuentas);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxid_ejercicioRetencionesPorPagarPorCuentas.setEnabled(this.retencionesporpagarporcuentasConstantesFunciones.activarid_ejercicioRetencionesPorPagarPorCuentas);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxid_periodoRetencionesPorPagarPorCuentas.setEnabled(this.retencionesporpagarporcuentasConstantesFunciones.activarid_periodoRetencionesPorPagarPorCuentas);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jComboBoxid_tipo_retencionRetencionesPorPagarPorCuentas.setEnabled(this.retencionesporpagarporcuentasConstantesFunciones.activarid_tipo_retencionRetencionesPorPagarPorCuentas);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jCheckBoxes_debitoRetencionesPorPagarPorCuentas.setEnabled(this.retencionesporpagarporcuentasConstantesFunciones.activares_debitoRetencionesPorPagarPorCuentas);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jDateChooserfecha_emisionRetencionesPorPagarPorCuentas.setEnabled(this.retencionesporpagarporcuentasConstantesFunciones.activarfecha_emisionRetencionesPorPagarPorCuentas);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextAreanombre_tipo_movimientoRetencionesPorPagarPorCuentas.setEnabled(this.retencionesporpagarporcuentasConstantesFunciones.activarnombre_tipo_movimientoRetencionesPorPagarPorCuentas);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextAreanumero_mayorRetencionesPorPagarPorCuentas.setEnabled(this.retencionesporpagarporcuentasConstantesFunciones.activarnumero_mayorRetencionesPorPagarPorCuentas);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextAreanombre_cuenta_contable_retencionRetencionesPorPagarPorCuentas.setEnabled(this.retencionesporpagarporcuentasConstantesFunciones.activarnombre_cuenta_contable_retencionRetencionesPorPagarPorCuentas);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextFieldnumero_pre_impreso_facturaRetencionesPorPagarPorCuentas.setEnabled(this.retencionesporpagarporcuentasConstantesFunciones.activarnumero_pre_impreso_facturaRetencionesPorPagarPorCuentas);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextFieldporcentajeRetencionesPorPagarPorCuentas.setEnabled(this.retencionesporpagarporcuentasConstantesFunciones.activarporcentajeRetencionesPorPagarPorCuentas);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextFieldbase_imponibleRetencionesPorPagarPorCuentas.setEnabled(this.retencionesporpagarporcuentasConstantesFunciones.activarbase_imponibleRetencionesPorPagarPorCuentas);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextFieldvalorRetencionesPorPagarPorCuentas.setEnabled(this.retencionesporpagarporcuentasConstantesFunciones.activarvalorRetencionesPorPagarPorCuentas);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextFieldnumeroRetencionesPorPagarPorCuentas.setEnabled(this.retencionesporpagarporcuentasConstantesFunciones.activarnumeroRetencionesPorPagarPorCuentas);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextAreanombre_benefRetencionesPorPagarPorCuentas.setEnabled(this.retencionesporpagarporcuentasConstantesFunciones.activarnombre_benefRetencionesPorPagarPorCuentas);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextFieldruc_benefRetencionesPorPagarPorCuentas.setEnabled(this.retencionesporpagarporcuentasConstantesFunciones.activarruc_benefRetencionesPorPagarPorCuentas);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextAreanombre_cuenta_contableRetencionesPorPagarPorCuentas.setEnabled(this.retencionesporpagarporcuentasConstantesFunciones.activarnombre_cuenta_contableRetencionesPorPagarPorCuentas);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jTextAreanombre_cuenta_contable_creditoRetencionesPorPagarPorCuentas.setEnabled(this.retencionesporpagarporcuentasConstantesFunciones.activarnombre_cuenta_contable_creditoRetencionesPorPagarPorCuentas);
		this.jInternalFrameDetalleFormRetencionesPorPagarPorCuentas.jCheckBoxes_debito_datoRetencionesPorPagarPorCuentas.setEnabled(this.retencionesporpagarporcuentasConstantesFunciones.activares_debito_datoRetencionesPorPagarPorCuentas);
		}
	}
	
		
}